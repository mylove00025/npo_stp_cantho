package com.osp.npo.service;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.basicData.ProvinceManager;
import com.osp.npo.core.basicData.ProvinceInfo;
import com.osp.npo.core.basicData.ProvinceList;
import com.osp.npo.core.basicData.DistrictManager;
import com.osp.npo.core.basicData.DistrictInfo;
import com.osp.npo.core.basicData.DistrictList;


/**
 * Generate by script
 * Generate date: 10/13/2010 3:47:47 PM
 * @version $Revision: 19512 $
 */
public class BasicDataService extends AbstractService {


    /** Province Manager Object */
    private ProvinceManager provinceManager;


    /** District Manager Object */
    private DistrictManager districtManager;


    /** <P> Service constructor </P>*/
    public BasicDataService(Connection connection) {
        super(connection);
        this.provinceManager = new ProvinceManager (connection);
        this.districtManager = new DistrictManager (connection);
    }


    /**
     * <P> entry ProvinceInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entryProvince(ProvinceInfo info) throws SQLException{
        return this.provinceManager.insert(info);
    }


    /**
     * <P> modify ProvinceInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifyProvince(ProvinceInfo info) throws SQLException, IOException{
        return this.provinceManager.update(info);
    }


    /**
     * <P> remove Province by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeProvince(Long id) throws SQLException{
        return this.provinceManager.delete(id);
    }


    /**
     * <P> query Province list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public ProvinceList queryProvince(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException{
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.provinceManager.select(forUpdate, offset, maxLine);
    }


    /**
     * <P> query all of Province list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public ProvinceList queryAllProvince(boolean forUpdate)
            throws SQLException, IOException{
        /* if limit < 0 or offset < 0 then select all */
        return this.provinceManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total Province </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalProvince()
            throws SQLException, IOException{
        return this.provinceManager.countTotal();
    }


    /**
     * <P> entry DistrictInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entryDistrict(DistrictInfo info) throws SQLException{
        return this.districtManager.insert(info);
    }


    /**
     * <P> modify DistrictInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifyDistrict(DistrictInfo info) throws SQLException, IOException{
        return this.districtManager.update(info);
    }


    /**
     * <P> remove District by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeDistrict(Long id) throws SQLException{
        return this.districtManager.delete(id);
    }


    /**
     * <P> query District list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public DistrictList queryDistrict(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException{
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.districtManager.select(forUpdate, offset, maxLine);
    }


    /**
     * <P> query all of District list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public DistrictList queryAllDistrict(boolean forUpdate)
            throws SQLException, IOException{
        /* if limit < 0 or offset < 0 then select all */
        return this.districtManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total District </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalDistrict()
            throws SQLException, IOException{
        return this.districtManager.countTotal();
    }


    

    /**
     * Set province id filter
     *
     * @param accountIdFilter
     * @param kind  Filter kind (FULL, LEFT, MIDDLE)
     */
    public void setProvinceIdFilter(Long provinceIdFilter) {

        this.districtManager.setProvinceIdFilter(provinceIdFilter);
    }
    
    /**
     * Set province name filter
     *
     * @param accountIdFilter
     * @param kind  Filter kind (FULL, LEFT, MIDDLE)
     */
    public void setProvinceNameFilter(String provinceNameFilter, FilterKind kind) {

        this.provinceManager.setProvinceNameFilter(provinceNameFilter, kind);
    }
    
    /**
     * Set district name filter
     *
     * @param accountIdFilter
     * @param kind  Filter kind (FULL, LEFT, MIDDLE)
     */
    public void setDistrictNameFilter(String districtNameFilter, FilterKind kind) {

        this.districtManager.setDistrictNameFilter(districtNameFilter, kind);
    }

    /**
     * Add order field for table npo_province
     * @param orderField
     */
    public void addOrderFieldProvince(OrderField orderField) {
        this.provinceManager.addOrderField(orderField);
    }

    /**
     * Add order field for table npo_district
     * @param orderField
     */
    public void addOrderFieldDistrict(OrderField orderField) {
        this.districtManager.addOrderField(orderField);
    }
}
