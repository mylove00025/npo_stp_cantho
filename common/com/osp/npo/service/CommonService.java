package com.osp.npo.service;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.osp.npo.common.util.SystemProperties;
import com.osp.npo.core.basicData.PropertyInfo;
import com.osp.npo.core.basicData.PropertyList;
import com.osp.npo.core.common.ExecuteHistoryInfo;
import com.osp.npo.core.common.ExecuteHistoryList;
import com.osp.npo.core.common.ExecuteHistoryManager;
import com.osp.npo.core.common.SystemConfigInfo;
import com.osp.npo.core.common.SystemConfigList;
import com.osp.npo.core.common.SystemConfigManager;
import com.osp.npo.core.office.NotaryOfficeInfo;
import com.osp.npo.core.office.NotaryOfficeList;
import com.osp.npo.core.office.NotaryOfficeManager;


/**
 * Generate by script
 * Generate date: 10/13/2010 3:37:10 PM
 * @version $Revision: 17050 $
 */
public class CommonService extends AbstractService {

	private static final String PROPERTY_SEPERATE_CHAR     = "#";
	private static final String PROPERTY_SEPERATE_CHAR_SUB = ",";

    /** SystemConfig Manager Object */
    private SystemConfigManager systemConfigManager;

    /** ExecuteHistory Manager Object */
    private ExecuteHistoryManager executeHistoryManager;
    

    /** NotaryOffice Manager Object */
    private NotaryOfficeManager notaryOfficeManager;


    /** <P> Service constructor </P>*/
    public CommonService(Connection connection) {
        super(connection);
        this.systemConfigManager = new SystemConfigManager (connection);
        this.executeHistoryManager = new ExecuteHistoryManager (connection);
        this.notaryOfficeManager = new NotaryOfficeManager (connection);
    }


    /**
     * <P> entry SystemConfigInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entrySystemConfig(SystemConfigInfo info) throws SQLException{
        return this.systemConfigManager.insert(info);
    }


    /**
     * <P> modify SystemConfigInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifySystemConfig(SystemConfigInfo info) throws SQLException, IOException{
        return this.systemConfigManager.update(info);
    }


    /**
     * <P> remove SystemConfig by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeSystemConfig(Long id) throws SQLException{
        return this.systemConfigManager.delete(id);
    }


    /**
     * <P> query SystemConfig list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public SystemConfigList querySystemConfig(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException{
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.systemConfigManager.select(forUpdate, offset, maxLine);
    }


    /**
     * <P> query all of SystemConfig list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public SystemConfigList queryAllSystemConfig(boolean forUpdate)
            throws SQLException, IOException{
        /* if limit < 0 or offset < 0 then select all */
        return this.systemConfigManager.select(forUpdate, -1, -1);
    }

    /**
     * <P> Query SystemConfigInfo from database by config key </P>
     *
     * @param key Configkey
     * @param forUpdate
     * @return SystemConfigInfo
     * @throws SQLException
     * @throws IOException
    */
    public SystemConfigInfo querySystemConfigByKey(String key, boolean forUpdate)
            throws SQLException, IOException{
        return this.systemConfigManager.selectByKey(key, forUpdate);
    }

    /**
     * <P> count total SystemConfig </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalSystemConfig()
            throws SQLException, IOException{
        return this.systemConfigManager.countTotal();
    }
    
    
    /**
     * Query property list
     * 
     * @return property list
     */
    public PropertyList queryAllProperty() {
    	String[] arrProperties = SystemProperties.getProperty("system_property_list").split(PROPERTY_SEPERATE_CHAR);
    	
    	PropertyList propertyList = new PropertyList();
    	
    	for (String property : arrProperties) {
			String[] arrProperty = property.split(PROPERTY_SEPERATE_CHAR_SUB);
			PropertyInfo info = new PropertyInfo();
			info.setCode(arrProperty[0]);
			info.setName(arrProperty[1]);
			propertyList.add(info);
		}
    	
    	return propertyList;
    }
    
    /**
     * <P> entry ExecuteHistoryInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entryExecuteHistory(ExecuteHistoryInfo info) throws SQLException{
        return this.executeHistoryManager.insert(info);
    }


    /**
     * <P> modify ExecuteHistoryInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifyExecuteHistory(ExecuteHistoryInfo info) throws SQLException, IOException{
        return this.executeHistoryManager.update(info);
    }


    /**
     * <P> remove ExecuteHistory by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeExecuteHistory(Long id) throws SQLException{
        return this.executeHistoryManager.delete(id);
    }


    /**
     * <P> query ExecuteHistory list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public ExecuteHistoryList queryExecuteHistory(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException{
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.executeHistoryManager.select(forUpdate, offset, maxLine);
    }


    /**
     * <P> query all of ExecuteHistory list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public ExecuteHistoryList queryAllExecuteHistory(boolean forUpdate)
            throws SQLException, IOException{
        /* if limit < 0 or offset < 0 then select all */
        return this.executeHistoryManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total ExecuteHistory </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalExecuteHistory()
            throws SQLException, IOException{
        return this.executeHistoryManager.countTotal();
    }
    

    /**
     * <P> entry NotaryOfficeInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entryNotaryOffice(NotaryOfficeInfo info) throws SQLException{
        return this.notaryOfficeManager.insert(info);
    }


    /**
     * <P> modify NotaryOfficeInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifyNotaryOffice(NotaryOfficeInfo info) throws SQLException, IOException{
        return this.notaryOfficeManager.update(info);
    }


    /**
     * <P> remove NotaryOffice by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeNotaryOffice(Long id) throws SQLException{
        return this.notaryOfficeManager.delete(id);
    }


    /**
     * <P> query NotaryOffice list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public NotaryOfficeList queryNotaryOffice(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException{
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.notaryOfficeManager.select(forUpdate, offset, maxLine);
    }
    
    public NotaryOfficeInfo queryNotaryOfficeByNoid(boolean forUpdate, Long noid) throws SQLException, IOException {
        
        this.notaryOfficeManager.setNidFilter(noid);
        return this.notaryOfficeManager.select(forUpdate, -1, -1).get(0);
    }


    /**
     * <P> query all of NotaryOffice list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public NotaryOfficeList queryAllNotaryOffice(boolean forUpdate)
            throws SQLException, IOException{
        /* if limit < 0 or offset < 0 then select all */
        return this.notaryOfficeManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total NotaryOffice </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalNotaryOffice()
            throws SQLException, IOException{
        return this.notaryOfficeManager.countTotal();
    }
}
