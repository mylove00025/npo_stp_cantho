package com.osp.npo.core.synchronize;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;


import com.osp.npo.core.AbstractManager;


/**
 * Generate by script
 * Generate date: 02/17/2011 11:55:52 AM
 * @version $Revision$
 */
public class SynchronizeManager extends AbstractManager {


    /**
     * <P>Generate instance</P>
     *
     * @param  connection  Connection
     */
    public SynchronizeManager(Connection connection) {
        super(connection);
    }


    /**
     * <P>Add new infomation</P>
     *
     * @param  info  Infomation that need add
     * @return  PreparedStatement#executeUpdate Return's Value
     * @throws SQLException
     */
    public int insert(SynchronizeInfo info) throws SQLException {

        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" INSERT INTO ");
        sqlBuffer.append("npo_synchronize");
        sqlBuffer.append(" ( ");
        sqlBuffer.append("type,");
        sqlBuffer.append("data_id,");
        sqlBuffer.append("authentication_id,");
        sqlBuffer.append("action,");
        sqlBuffer.append("history_id,");
        sqlBuffer.append("status,");
        sqlBuffer.append("entry_date_time");
        sqlBuffer.append(" ) ");
        sqlBuffer.append(" VALUES ");
        sqlBuffer.append(" ( ");
        sqlBuffer.append("?,");
        sqlBuffer.append("?,");
        sqlBuffer.append("?,");
        sqlBuffer.append("?,");
        sqlBuffer.append("?,");
        sqlBuffer.append("?,");
        sqlBuffer.append("?");
        sqlBuffer.append(" ) ");
        setSql(sqlBuffer.toString());

        PreparedStatement ps = null;
        int result = -1;
        try {
            Connection c = this.getConnection();
            ps = c.prepareStatement(getSql());

            int i = 1;
            psSetByte(ps, i++, info.getType());
            psSetString(ps, i++, info.getDataId());
            psSetString(ps, i++, info.getAuthenticationId());
            psSetByte(ps, i++, info.getAction());
            psSetLong(ps, i++, info.getHistoryId());
            psSetByte(ps, i++, info.getStatus());
            psSetTimestamp(ps, i++, info.getEntryDateTime());

            result = ps.executeUpdate();
        } finally {
            close(ps);
        }

        return result;
    }

    /**
     * <P>Add new infomation</P>
     *
     * @param  info  Infomation that need add
     * @return  PreparedStatement#executeUpdate Return's Value
     * @throws SQLException
     */
    public int insertSyncDataServer(Byte type, String dataId, Byte action, Long historyId, Timestamp entryDateTime) throws SQLException {

        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" INSERT INTO ");
        sqlBuffer.append("npo_synchronize");
        sqlBuffer.append(" ( ");
        sqlBuffer.append("type,");
        sqlBuffer.append("data_id,");
        sqlBuffer.append("authentication_id,");
        sqlBuffer.append("action,");
        sqlBuffer.append("history_id,");
        sqlBuffer.append("entry_date_time");
        sqlBuffer.append(" ) ");
        sqlBuffer.append(" SELECT ");
        sqlBuffer.append("?, ");
        sqlBuffer.append("?, ");
        sqlBuffer.append("nno.authentication_id, ");
        sqlBuffer.append("?, ");
        sqlBuffer.append("?, ");
        sqlBuffer.append("?");
        sqlBuffer.append(" FROM npo_notary_office nno WHERE nno.active_flg AND NOT nno.hidden_flg AND nno.office_type=2 ");
        
        if (type.intValue() == 1 || type.intValue() == 2) {
        	sqlBuffer.append(" AND nno.synchronize_type = 2 ");
        }
        
        setSql(sqlBuffer.toString());

        PreparedStatement ps = null;
        int result = -1;
        try {
            Connection c = this.getConnection();
            ps = c.prepareStatement(getSql());

            int i = 1;
            psSetByte(ps, i++, type);
            psSetString(ps, i++, dataId);
            psSetByte(ps, i++, action);
            psSetLong(ps, i++, historyId);
            psSetTimestamp(ps, i++, entryDateTime);

            result = ps.executeUpdate();
        } finally {
            close(ps);
        }

        return result;
    }


    /**
     * <P>Delete a record</P>
     *
     * @param  id
     * @return  PreparedStatement#executeUpdate Return's Value
     * @throws SQLException
     */
    public int delete(Long id) throws SQLException {

        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" DELETE FROM ");
        sqlBuffer.append(" npo_synchronize ");
        sqlBuffer.append(" WHERE ");
        sqlBuffer.append(" id = ? ");

        this.setSql(sqlBuffer.toString());

        PreparedStatement ps = null;
        int result;

        try{
            Connection c = this.getConnection();
            ps = c.prepareStatement(this.getSql());

            psSetLong(ps, 1, id);

            result = ps.executeUpdate();

        } finally{
            close(ps);
        }

        return result;
    }


    /**
     * <P>Update infomation</P>
     *
     * @param  info  Infomation that need update
     * @return  PreparedStatement#executeUpdate return's value
     * @throws SQLException
     * @throws IOException
     */
    public int update(SynchronizeInfo info) throws SQLException, IOException {

        ArrayList<String> sqlList = new ArrayList<String>();
        ArrayList<Object> prmList = new ArrayList<Object>();

        //Evaluate Null value, create parameter list for SQL Statement.
        makeUpdateList(info, sqlList, prmList);

        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" UPDATE ");
        sqlBuffer.append("npo_synchronize");
        sqlBuffer.append(" SET ");


        //Result of SQL Statement
        for (int i = 0; i < sqlList.size(); i++) {
            sqlBuffer.append(sqlList.get(i));
        }

        sqlBuffer.append(" WHERE ");
        sqlBuffer.append(" type=? ");
        sqlBuffer.append(" AND data_id=? ");
        sqlBuffer.append(" AND authentication_id=? ");
        sqlBuffer.append(" AND action=? ");

        this.setSql(sqlBuffer.toString());

        PreparedStatement ps = null;
        int result;

        try {
            Connection c = this.getConnection();
            ps = c.prepareStatement(this.getSql());

            int i = 1;

            for (int j = 0; j < prmList.size(); j++) {
                psSetObject(ps, i++, prmList.get(j));
            }

            psSetByte(ps, i++, info.getType());
            psSetString(ps, i++, info.getDataId());
            psSetString(ps, i++, info.getAuthenticationId());
            psSetByte(ps, i++, info.getAction());

            result = ps.executeUpdate();
        } finally {
            close(ps);
        }

        return result;
    }


    /**
     * <P>Get all infomation</P>
     *
     * @param  forUpdate  Use FOR UPDATE (Yes or No)
     * @return  List of info that geted
     * @throws SQLException
     * @throws IOException
     */
    public SynchronizeList select(boolean forUpdate, int offset, int limit) throws SQLException, IOException {

        ArrayList<Object> prmList = new ArrayList<Object>();
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" SELECT ");
        sqlBuffer.append(" * ");
        sqlBuffer.append(" FROM ");
        sqlBuffer.append( "npo_synchronize" );
        sqlBuffer.append(getBaseSQL(prmList));
        appendOrderField(sqlBuffer);
        if ((offset >= 0) && (limit >= 0)){
            sqlBuffer.append("LIMIT ? ");
            sqlBuffer.append("OFFSET ? ");
        }
        if(forUpdate) {
            sqlBuffer.append(" FOR UPDATE ");
        }
        this.setSql(sqlBuffer.toString());

        PreparedStatement ps = null;
        ResultSet rs = null;
        SynchronizeList list = null;
        try {
            Connection c = this.getConnection();
            ps = c.prepareStatement(this.getSql());

            int i = 1;
            for (int j = 0; j < prmList.size(); j++) {
                psSetObject(ps, i ++, prmList.get(j));
            }
            if ((offset >= 0) && (limit >= 0)){
                psSetObject(ps, i ++, limit);
                psSetObject(ps, i ++, offset);
            }
            rs = ps.executeQuery();

            SynchronizeInfo info = null;
            list = new SynchronizeList();
            while(rs.next()) {
                info = new SynchronizeInfo();
                rsSetInfo(rs, info);
                list.add(info);
            }
        } finally {
            close(ps, rs);
        }

        return list;
    }


    /**
     * <P>Get count record result. </P>
     *
     * @return  Count of record that geted
     * @throws SQLException
     */
    public int countTotal() throws SQLException {

        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append(" SELECT ");
        sqlBuffer.append(" COUNT(*) ");
        sqlBuffer.append(" FROM ");
        sqlBuffer.append("npo_synchronize");

        this.setSql(sqlBuffer.toString());

        PreparedStatement ps = null;
        ResultSet rs = null;
        int result;
        try {
            Connection c = this.getConnection();
            ps = c.prepareStatement(this.getSql());

            rs = ps.executeQuery();
            rs.next();
            result = rs.getInt(1);

        } finally {
            close(ps, rs);
        }

        return result;
    }


    /**
     * <P>Set ResultSet to Info instance </P>
     *
     * @param  rs    ResultSet
     * @param  info  Info instance
     * @throws SQLException
     */
    private void rsSetInfo(ResultSet rs,SynchronizeInfo info) throws SQLException {

        info.setType(rsGetByte(rs, "type"));
        info.setDataId(rsGetString(rs, "data_id"));
        info.setAuthenticationId(rsGetString(rs, "authentication_id"));
        info.setAction(rsGetByte(rs, "action"));
        info.setHistoryId(rsGetLong(rs, "history_id"));
        info.setStatus(rsGetByte(rs, "status"));
        info.setEntryDateTime(rsGetTimestamp(rs, "entry_date_time"));
    }


    /**
     * <P>Create parameter</P>
     *
     * @param  info  Update Info
     * @param sqlList  SQL List
     * @param prmList  Parameter List
     */
    private void makeUpdateList(SynchronizeInfo info, ArrayList<String> sqlList,ArrayList<Object> prmList){

        addUpdateList(info.getType(), ",type=?", sqlList, prmList);
        addUpdateList(info.getDataId(), ",data_id=?", sqlList, prmList);
        addUpdateList(info.getAuthenticationId(), ",authentication_id=?", sqlList, prmList);
        addUpdateList(info.getAction(), ",action=?", sqlList, prmList);
        addUpdateList(info.getHistoryId(), ",history_id=?", sqlList, prmList);
        addUpdateList(info.getStatus(), ",status=?", sqlList, prmList);
        addUpdateList(info.getEntryDateTime(), ",entry_date_time=?", sqlList, prmList);
    }


    /**
     * <P>Base SQL</P>
     *
     * @param  prmList  ArrayList
     * @throws SQLException
     */
    private StringBuffer getBaseSQL(ArrayList<Object> prmList) throws SQLException {
        StringBuffer sqlBuffer = new StringBuffer();
        String whereString = getWhereFilter(prmList);
        if(whereString.length() > 0) {
            sqlBuffer.append(" WHERE true ");
            sqlBuffer.append(whereString);
        }
        return sqlBuffer;
    }


    /**
     * <P>>Get where sql statement part.</P>
     *
     * @param  prmList  ArrayList
     * @return where sql statement
     * @throws SQLException
     */
    private String getWhereFilter(ArrayList<Object> prmList) {
        StringBuffer filterBuffer = new StringBuffer();
        //if (this.cidFilter != null) {
        //    appendAnd(filterBuffer);
        //    filterBuffer.append("vog.cid = ?");
        //    prmList.add(this.cidFilter);
        //}
        return filterBuffer.toString();
    }
}
