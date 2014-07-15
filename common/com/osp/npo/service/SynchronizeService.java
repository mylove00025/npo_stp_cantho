package com.osp.npo.service;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;


import com.osp.npo.core.synchronize.SynchronizeManager;
import com.osp.npo.core.synchronize.SynchronizeInfo;
import com.osp.npo.core.synchronize.SynchronizeList;


/**
 * Generate by script
 * Generate date: 02/17/2011 10:08:27 AM
 */
public class SynchronizeService extends AbstractService {


    /** Synchronize Manager Object */
    private SynchronizeManager synchronizeManager;




    /** <P> Service constructor </P>*/
    public SynchronizeService(Connection connection) {
        super(connection);
        this.synchronizeManager = new SynchronizeManager (connection);
    }


    /**
     * <P> entry SynchronizeInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entrySynchronize(SynchronizeInfo info) throws SQLException{
        return this.synchronizeManager.insert(info);
    }

    /**
     * <P> entry one SynchronizeInfo for one notary office to database automatically</P>
     * @param type
     * @param dataId
     * @param action
     * @param entryDateTime
     *
     * @return number of record insert.
     * @throws SQLException
     */
    public int entrySyncDataServer(Byte type, String dataId, Byte action, Long historyId, Timestamp entryDateTime) throws SQLException {
        return this.synchronizeManager.insertSyncDataServer(type, dataId, action, historyId, entryDateTime);
    }


    /**
     * <P> modify SynchronizeInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifySynchronize(SynchronizeInfo info) throws SQLException, IOException{
        return this.synchronizeManager.update(info);
    }


    /**
     * <P> remove Synchronize by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeSynchronize(Long id) throws SQLException{
        return this.synchronizeManager.delete(id);
    }


    /**
     * <P> query Synchronize list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public SynchronizeList querySynchronize(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException{
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.synchronizeManager.select(forUpdate, offset, maxLine);
    }


    /**
     * <P> query all of Synchronize list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public SynchronizeList queryAllSynchronize(boolean forUpdate)
            throws SQLException, IOException{
        /* if limit < 0 or offset < 0 then select all */
        return this.synchronizeManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total Synchronize </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalSynchronize()
            throws SQLException, IOException{
        return this.synchronizeManager.countTotal();
    }
}
