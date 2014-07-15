package com.osp.npo.service;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.office.NotaryOfficeManager;
import com.osp.npo.core.office.NotaryOfficeInfo;
import com.osp.npo.core.office.NotaryOfficeList;


/**
 * Generate by script
 * Generate date: 02/17/2011 10:08:27 AM
 */
public class OfficeService extends AbstractService {


    /** NotaryOffice Manager Object */
    private NotaryOfficeManager notaryOfficeManager;




    /** <P> Service constructor </P>*/
    public OfficeService(Connection connection) {
        super(connection);
        this.notaryOfficeManager = new NotaryOfficeManager (connection);
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
    
    /**
     * Set AuthenticationId Filter
     * 
     * @param authenticationIdFilter
     * @param kind  Filter kind (FULL, LEFT, MIDDLE)
     */
    public void setAuthenticationIdFilter(String authenticationIdFilter, FilterKind kind) {
    
        this.notaryOfficeManager.setAuthenticationIdFilter(authenticationIdFilter, kind);
    }
    
    /**
     * Set ID Filter
     * 
     * @param nidFilter
     */
    public void setNoidFilter(Long nidFilter) {
    
        this.notaryOfficeManager.setNidFilter(nidFilter);
    }
    
    /**
     * Set office type Filter
     * 
     * @param nidFilter
     */
    public void setOfficeTypeFilter(Byte officeTypeFilter) {
    
        this.notaryOfficeManager.setOfficeTypeFilter(officeTypeFilter);
    }
    
    /**
     * Set actice flag Filter
     * 
     * @param nidFilter
     */
    public void setActFlagFilter(Boolean ActFlagFilter) {
    
        this.notaryOfficeManager.setActFlagFilter(ActFlagFilter);
    }
    

    /**
     * Set hidden flag Filter
     * 
     * @param nidFilter
     */
    public void setHidFlagFilter(Boolean HidFlagFilter) {
    
        this.notaryOfficeManager.setHidFlagFilter(HidFlagFilter);
    }
    
    /**
     * 
     * @param orderField
     */
    public void addOrderFieldNotary(OrderField orderField) {
        this.notaryOfficeManager.addOrderField(orderField);
    }
    
    /**
     * 
     * @param titleFilter
     * @param kind
     */
    public void setNotaryNameFilter(String titleFilter, FilterKind kind) {
        this.notaryOfficeManager.setNotaryNameFilter(titleFilter, kind);
    }
    
    
    
    
}
