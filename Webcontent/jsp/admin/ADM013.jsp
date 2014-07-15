<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://www.servletsuite.com/servlets/tooltip" prefix="t" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
    <%@ include file="/jsp/common/header.jsp" %>

    <div id="navigator">
        <ul class="clearfix">
        	<li>
                    <html:img alt="*" src="./image/bullet_square.gif"/>
            </li>
            <li>
                <html:link href="justiceuserlistview.do">Quản trị hệ thống</html:link>
                <span> &gt; </span>
            </li>
            <li>
                <html:link href="notarylistview.do">Danh sách tổ chức công chứng</html:link>
            </li>
        </ul>
    </div>
    <%@ include file="/jsp/common/error_message.jsp" %>
    <html:form action="notarylistview" onsubmit="javascript: searchOnClick()">
        <span class="sub-title">◊ Điều kiện tìm kiếm</span>
        <table class="tbl-search" summary="Thông tin tìm kiếm">
            <tr>
                <th id="notaryName_th">Tên văn phòng</th>
                <td id="notaryName_td">
                    <html:text styleId="notaryNameFilter" property="notaryNameFilter" name="notaryListViewHelper" styleClass="input-normal" maxlength="40"/>
                </td>
                
         
                <td colspan="4" style="text-align: center; padding: 10px;">
                   <html:image alt="Tìm kiếm" src="./image/btn_search.png"/>
                </td>
            </tr>
        </table>
		<div>
        <div class="clearfix-left">
            <span>◊ Danh sách tổ chức công chứng</span>
        </div>
        <div class="clearfix-right">
          <html:link href="notaryofficeentryview.do">
                    <html:img alt="Thêm mới" src="./image/btn_add.png"/>
                </html:link>
                <logic:notEmpty name="notaryListViewHelper" property="notaryList">
	                <html:link href="javascript: remove()">
	                    <html:img alt="Xóa" src="./image/btn_delete.png"/>
	                </html:link>
	         </logic:notEmpty>
       		 </div>
        </div>
         
        <logic:notEmpty name="notaryListViewHelper" property="notaryList">
            <table class="tbl-list">
                <tr>
                 	<th>
                        <html:checkbox name="notaryListViewHelper" styleId="chkAllID" property="chkAllID" disabled="false"/>
                    </th>
                    <th>Tên văn phòng</th>
                    <th>Trạng thái hoạt động</th>
                </tr>

                <logic:iterate id="notary" name="notaryListViewHelper" property="notaryList" indexId="i">
                    <%int style = i % 2; %>
                    <tr class="tbl-row<%=style%>">
                    <td style="text-align: center; width: 25px;">
                            <html:multibox name="notaryListViewHelper" styleId="chkID" property="chkID" disabled="false">
                                <bean:write name='notary' property='noid'/>
                            </html:multibox>
                        </td>
                        <td style="text-align: left; width: 800px;">
                            <html:link action="/notaryofficeeditview.do" paramId='noid' paramName='notary' paramProperty='noid'>
                                <bean:write name="notary" property="name"/>
                            </html:link>
                        </td>
                      
                        <td style="text-align: center;">
                            <logic:equal value="true" property="activeFlg" name="notary">
                            </logic:equal>
                            <logic:equal value="false" property="activeFlg" name="notary">
                                <img src="./image/icon_inactive.png"/>
                            </logic:equal>
                        </td>
                    </tr>
                </logic:iterate>

            </table>

            <div class="pager">
                <div class="pager-total">
                     Tổng số
                     <strong><bean:write name="notaryListViewHelper" property="totalCount"/></strong>
                     văn phòng công chứng
                </div>
                <div>
                    <logic:greaterThan name="notaryListViewHelper" value="1" property="totalPage">
                             <html:link href="javascript:direction('first')">
                                    <img id="imgfirst" class="pager-first" src="./image/first.png" alt= "first"/>
                            </html:link>
                            <html:link href="javascript:direction('ahead')">
                                    <img id="imgprev" class="pager-first" src="./image/prev.png" alt= "prev"/>
                            </html:link>
                    </logic:greaterThan>
                    <span>
                        Trang
                        <bean:write name="notaryListViewHelper" property="page" format="##########"/>
                        /
                        <bean:write name="notaryListViewHelper" property="totalPage" format="##########"/>&nbsp;&nbsp;
                    </span>

                    <logic:greaterThan name="notaryListViewHelper" value="1" property="totalPage">
                        <html:link href="javascript:direction('next')">
                                <img id="imgnext" class="pager-first" src="./image/next.png" alt= "next"/>
                        </html:link>
                        <html:link href="javascript:direction('end')">
                                <img id="imglast" class="pager-first" src="./image/last.png" alt= "last"/>
                        </html:link>
                    </logic:greaterThan>
                </div>
                <html:hidden property="direction"/>
                
            </div>

              <div class="clearfix-right">
          <html:link href="notaryofficeentryview.do">
                    <html:img alt="Thêm mới" src="./image/btn_add.png"/>
                </html:link>
                <logic:notEmpty name="notaryListViewHelper" property="notaryList">
	                <html:link href="javascript: remove()">
	                    <html:img alt="Xóa" src="./image/btn_delete.png"/>
	                </html:link>
	         </logic:notEmpty>
       		 </div>
        </logic:notEmpty>
    </html:form>

    <%@ include file="/jsp/common/footer.jsp" %>
</html:html>
<script type="text/javascript">
  $('#system > em').removeClass("system-off");
  $('#system > em').addClass("system-on");
  $('#system > b').addClass("menu-on");

  document.getElementById("notaryNameFilter").focus();

  function searchOnClick()
  {
     document.notaryListForm.action="notarylistsearch.do";
     return true;
  }

  function remove(){
  	
	var answer = confirm ("Bạn có thực sự muốn xóa tổ chức công chứng không?");
  	if (answer) {
	        document.notaryListForm.action="notarylistremove.do";
	        document.notaryListForm.submit();
	        return true;
  	}
  }
  	
  function direction(data){
      document.notaryListForm.direction.value=data;
      document.notaryListForm.action="notarylistpage.do";
      document.notaryListForm.submit();
  }
  //Check all multibox function
  $("#chkAllID").click(function()             
  {
      var checked_status = this.checked;
      $("input[@name=chkID]").each(function()
      {
          this.checked = checked_status;
      });
  });
 
</script>