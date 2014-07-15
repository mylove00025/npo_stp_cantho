package com.osp.npo.service;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;




import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.user.UserManager;
import com.osp.npo.core.user.UserInfo;
import com.osp.npo.core.user.UserList;
import com.osp.npo.core.user.AuthorityManager;
import com.osp.npo.core.user.AuthorityInfo;
import com.osp.npo.core.user.AuthorityList;
import com.osp.npo.core.user.UserAuthorityManager;
import com.osp.npo.core.user.UserAuthorityInfo;
import com.osp.npo.core.user.UserAuthorityList;


/**
 * Generate by script
 * Generate date: 10/13/2010 3:37:10 PM
 * @version $Revision: 17265 $
 */
public class UserService extends AbstractService {


    /** User Manager Object */
    private UserManager userManager;


    /** Authority Manager Object */
    private AuthorityManager authorityManager;


    /** UserAuthority Manager Object */
    private UserAuthorityManager userAuthorityManager;




    /** <P> Service constructor </P>*/
    public UserService(Connection connection) {
        super(connection);
        this.userManager = new UserManager(connection);
        this.authorityManager = new AuthorityManager(connection);
        this.userAuthorityManager = new UserAuthorityManager(connection);
    }

    /**
     * <P> entry UserInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entryUser(UserInfo info) throws SQLException {
        return this.userManager.insert(info);
    }


    /**
     * <P> modify UserInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifyUser(UserInfo info) throws SQLException, IOException {
        return this.userManager.update(info);
    }


    /**
     * <P> remove User by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeUser(Long id) throws SQLException {
        return this.userManager.delete(id);
    }


    /**
     * <P> query User list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public UserList queryUser(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException {
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.userManager.select(forUpdate, offset, maxLine);
    }
    
    /**
     * Get user by ID
     * @param uId
     * @return
     * @throws SQLException
     * @throws IOException
     */
    public UserInfo queryUserByUid(boolean forUpdate, Long uId)
    	throws SQLException, IOException {  
    	this.userManager.setUsidFilter(uId);
    	UserList userList = this.userManager.select(forUpdate, -1, -1);
    	if ( userList != null && userList.size() > 0) {
    		return userList.get(0);
    	}
    	return null;
	}


    /**
     * <P> query all of User list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public UserList queryAllUser(boolean forUpdate)
            throws SQLException, IOException {
        /* if limit < 0 or offset < 0 then select all */
        return this.userManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total User </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalUser()
            throws SQLException, IOException {
        return this.userManager.countTotal();
    }
    
    public int countTotalUserByFilter() 
        throws SQLException, IOException {
        return this.userManager.countTotalByFilter();
    }


    /**
     * <P> entry AuthorityInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entryAuthority(AuthorityInfo info) throws SQLException {
        return this.authorityManager.insert(info);
    }


    /**
     * <P> modify AuthorityInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifyAuthority(AuthorityInfo info) throws SQLException, IOException {
        return this.authorityManager.update(info);
    }


    /**
     * <P> remove Authority by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeAuthority(Long id) throws SQLException {
        return this.authorityManager.delete(id);
    }


    /**
     * <P> query Authority list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public AuthorityList queryAuthority(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException {
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.authorityManager.select(forUpdate, offset, maxLine);
    }


    /**
     * <P> query all of Authority list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public AuthorityList queryAllAuthority(boolean forUpdate)
            throws SQLException, IOException {
        /* if limit < 0 or offset < 0 then select all */
        return this.authorityManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total Authority </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalAuthority()
            throws SQLException, IOException {
        return this.authorityManager.countTotal();
    }


    /**
     * <P> entry UserAuthorityInfo object to database </P>
     *
     * @param info
     * @return number of record insert.
     * @throws SQLException
     */
    public int entryUserAuthority(UserAuthorityInfo info) throws SQLException {
        return this.userAuthorityManager.insert(info);
    }


    /**
     * <P> modify UserAuthorityInfo object to database </P>
     *
     * @param info
     * @return number of record update.
     * @throws SQLException
     * @throws IOException
     */
    public int modifyUserAuthority(UserAuthorityInfo info) throws SQLException, IOException {
        return this.userAuthorityManager.update(info);
    }


    /**
     * <P> remove UserAuthority by id</P>
     *
     * @param id
     * @return number of record update.
     * @throws SQLException
     */
    public int removeUserAuthority(Long id) throws SQLException {
        return this.userAuthorityManager.delete(id);
    }


    /**
     * <P> query UserAuthority list from database </P>
     *
     * @param forUpdate
     * @param  page current page
     * @param  maxLine maximum line of a page
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public UserAuthorityList queryUserAuthority(boolean forUpdate, int page, int maxLine)
            throws SQLException, IOException {
        /* Calculate start position of page */
        int offset = (page - 1) * maxLine;
        return this.userAuthorityManager.select(forUpdate, offset, maxLine);
    }


    /**
     * <P> query all of UserAuthority list from database </P>
     *
     * @param forUpdate
     * @return number of record query
     * @throws SQLException
     * @throws IOException
    */
    public UserAuthorityList queryAllUserAuthority(boolean forUpdate)
            throws SQLException, IOException {
        /* if limit < 0 or offset < 0 then select all */
        return this.userAuthorityManager.select(forUpdate, -1, -1);
    }


    /**
     * <P> count total UserAuthority </P>
     *
     * @param forUpdate
     * @return number of count record
     * @throws SQLException
     * @throws IOException
    */
    public int countTotalUserAuthority()
            throws SQLException, IOException {
        return this.userAuthorityManager.countTotal();
    }
    
    /**
     * <P>
     * query UserAuthority by usid list from database
     * </P>
     * 
     * @param forUpdate
     * @param usid user id
     * @return number of record query
     * @throws SQLException
     * @throws IOException
     */
    public UserAuthorityList queryUserAuthorityByUsid(boolean forUpdate, Long usid) throws SQLException, IOException {
        
        this.userAuthorityManager.setUsidFilter(usid);
        return this.userAuthorityManager.select(forUpdate, -1, -1);
    }
    
    /**
     * Set user id Filter
     * 
     * @param usidFilter     
     */
    public void setUsidFilter(Long usidFilter) {
    
        this.userManager.setUsidFilter(usidFilter);
    }
    
    /**
     * Set account id filter
     * 
     * @param accountIdFilter
     * @param kind  Filter kind (FULL, LEFT, MIDDLE)
     */
    public void setAccountIdFilter(String accountIdFilter, FilterKind kind) {
    
        this.userManager.setAccountIdFilter(accountIdFilter, kind);
    }
    
    /**
     * Set first Name Filter
     * 
     * @param firstNameFilter
     * @param kind  Filter kind (FULL, LEFT, MIDDLE)
     */
    public void setFirstNameFilter(String firstNameFilter, FilterKind kind) {
    
        this.userManager.setFirstNameFilter(firstNameFilter, kind);
    }    
       
    /**
     * Set family Name Filter
     * 
     * @param familyNameFilter
     * @param kind  Filter kind (FULL, LEFT, MIDDLE)
     */
    public void setFamilyNameFilter(String familyNameFilter, FilterKind kind) {
    
        this.userManager.setFamilyNameFilter(familyNameFilter, kind);
    }
    
    
    /**
     * Set active Flag Filter
     * 
     * @param activeFlgFilter     
     */
    public void setActiveFlgFilter(Boolean activeFlgFilter) {
    
        this.userManager.setActiveFlgFilter(activeFlgFilter);
    }
    
    /**
     * Set hidden Flag Filter
     * 
     * @param hiddenFlgFilter     
     */
    public void setHiddenFlgFilter(Boolean hiddenFlgFilter) {
    
        this.userManager.setHiddenFlgFilter(hiddenFlgFilter);
    }
    
    public void setOfficeIdFilter(Long officeId) {
        
        this.userManager.setOfficeIdFilter(officeId);
    }
    
    /**
     * Add order field for table npo_user
     * @param orderField
     */
    public void addOrderFieldUser(OrderField orderField) {
        this.userManager.addOrderField(orderField);
    }
    
    /**
     * Determine record is existed in database based on attributes
     *
     * @param entity
     * @param nameKeyAndValueKey
     * @return TRUE if its was existed
     */
    public Boolean isExistInDB(String entity, Object[][] nameKeyAndValueKey) throws SQLException, IOException {
        return userManager.isExistInDB(entity, nameKeyAndValueKey);
    }
}
