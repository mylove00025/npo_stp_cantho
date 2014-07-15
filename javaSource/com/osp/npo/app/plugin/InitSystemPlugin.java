package com.osp.npo.app.plugin;

import java.sql.Date;
import java.util.Calendar;
import java.util.Map;
import java.util.Timer;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import org.apache.struts.config.PlugInConfig;

import com.osp.npo.app.task.LuceneIndexTask;
import com.osp.npo.app.task.LuceneOptimizeTask;
import com.osp.npo.common.exception.CopyrightException;
import com.osp.npo.common.util.FileUtil;
import com.osp.npo.logger.NpoLogMessage;
import com.osp.npo.logger.NpoLogger;


/**
 * InitSystemPlugin class
 * 
 * @version $Revision: 20388 $
 */
public class InitSystemPlugin implements PlugIn {

	private static final String LUCENE_INDEXING_PERIOD = "lucene.index.period";

    private Timer timer;
    private Timer timer2;


    public static NpoLogger logger = (NpoLogger) NpoLogger
            .getLogger(InitSystemPlugin.class.getName());



    public void destroy() {

        if (timer != null) {
            timer.cancel();
        }
        
        if (timer2 != null) {
            timer2.cancel();
        }
    }



    public void init(ActionServlet servlet, ModuleConfig config)
            throws ServletException {

        try {

        	initNpoSystem(config);

        } catch (CopyrightException ex) {
        	throw new ServletException(ex);
        } catch (Exception ex) {
            NpoLogMessage logMessage = new NpoLogMessage();
            logWrite(ex, logMessage);
        } finally {
        	//Delete log files
        	FileUtil.deleteLogFile();
        }
    }


    /**
     * 
     * @param config
     * @throws Exception
     */
    private void initNpoSystem(ModuleConfig config) throws CopyrightException, Exception {
        
        /* Lucene indexing period: 5 seconds */
        long indexPeriod = 5 * 1000;
        
        /* Get parameter from config file */
        PlugInConfig[] plugInConfigs = config.findPlugInConfigs();
        for (int i = 0; i < plugInConfigs.length; i++) {
            if (plugInConfigs[i].getClassName().equals(
                    this.getClass().getName())) {
				@SuppressWarnings("unchecked")
				Map<String, String> props = plugInConfigs[i].getProperties();
                try {
                    
                    if (props.containsKey(LUCENE_INDEXING_PERIOD)) {
                    	try {
                    		indexPeriod = Long.parseLong(props.get(LUCENE_INDEXING_PERIOD)) * 1000;
                    	} finally {};
                    }
                    
                } catch (Exception ex) {
                	throw new CopyrightException("Cannot read copyright key.");
                }
            }
        }
        

        timer = new Timer();
        
        Calendar cal = Calendar.getInstance();
        Date firstTime = new Date(cal.getTimeInMillis());
        
        LuceneIndexTask luceneIndexTask = new LuceneIndexTask();
        timer.schedule(luceneIndexTask, firstTime, indexPeriod);

        synchronized (luceneIndexTask) {
        	luceneIndexTask.wait(1000);
        }
        
        timer2 = new Timer();
        cal.set(Calendar.HOUR_OF_DAY, 24);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        Date firstTimeOptimize = new Date(cal.getTimeInMillis());
        
        LuceneOptimizeTask luceneOptimizeTask = new LuceneOptimizeTask();
        timer2.schedule(luceneOptimizeTask, firstTimeOptimize, 86400000);

        synchronized (luceneOptimizeTask) {
        	luceneOptimizeTask.wait(1000);
        }
    }


    /**
     * 
     * @param Exception Exception
     */
    private void logWrite(Exception ex, NpoLogMessage logMessage) {

        Object[] values = {ex.getClass().getName(), ex.getMessage(),
                ex.getStackTrace()[0]};

        logMessage.select("WEB9001", values);
        logger.logging(logMessage, ex);
    }
}
