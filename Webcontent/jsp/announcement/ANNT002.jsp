<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
    <%@ include file="/jsp/common/header.jsp" %>
    <div id="navigator">
	     <ul class="clearfix">
	         <li>
                 <html:img alt="*" src="./image/bullet_square.gif"/>
             </li>
	         <li>
	             <html:link href="announcementlistview.do">Thông báo</html:link>
	         </li>
	         <li>
	             <span> > </span>
	             <html:link href="announcementlistback.do">Danh sách thông báo</html:link>
	         </li>  
	         <li>
	             <span> > </span>
	             <html:link href="#">Thêm mới thông báo</html:link>
	         </li>                       
	     </ul>
    </div>
    <%@ include file="/jsp/common/error_message.jsp" %>
    <html:form action="announcementregistview" method="post" enctype="multipart/form-data" styleId="form" onsubmit="javascript: save()">
        <span class="sub-title">◊ Tạo mới thông báo </span>
        <table class="tbl-none-border" width="90%">
            <tr id="title_tr">
                <th nowrap="nowrap" width="130px">Tiêu đề thông báo <span class="required">*</span> :</th>
                <td>
                    <html:text styleId="title" name="announcementViewHelper" property="title" styleClass="input-x-long" maxlength="200"/>
                </td>
            </tr>
            <tr>
                <th><span style="color:Black;">Tệp đính kèm :</span></th>
                <td>
                    <html:file name="announcementViewHelper"  property="formFile" size="60"/>
                </td>
            </tr>          
            <tr>
                <th nowrap="nowrap" valign="top">Nội dung thông báo :</th>
                <td>
                    <FCK:editor instanceName="content" height="300px">
                    	<jsp:attribute name="value">
							<bean:write name="announcementViewHelper" property="content" filter="false"/>
						</jsp:attribute>
					</FCK:editor>
                </td>
            </tr>            
             <tr>
                <th nowrap="nowrap">Tùy chọn :</th>
                <td >
                    <html:checkbox styleId="importanceType" name="announcementViewHelper" property="importanceType" value="true">  </html:checkbox>
		            <label style="font-weight:normal" for="importanceType">Tin quan trọng</label>
                </td>
            </tr>
            <tr>                
                <td colspan="2" style="text-align: center; padding: 10px;">
                    <span id="update_on">
                        <html:image alt="Lưu" src="./image/btn_save.png" onclick="stylechange('update_off', 'update_on');"/>
                    </span>
                    <span id="update_off" style="display: none;">
                        <html:link href="#">
                            <html:img alt="Lưu" src="./image/btn_save.png"/>
                        </html:link>
                    </span>
                    <html:link href="announcementlistback.do">
                        <html:img alt="Hủy" src="./image/btn_cancel.png"/>
                    </html:link>
                </td>
            </tr>            
        </table>
    </html:form>
    <%@ include file="/jsp/common/footer.jsp" %> 
</html:html>

<script type="text/javascript">

	$('#announcementTab > em').removeClass("announcement-off");
	$('#announcementTab > em').addClass("announcement-on");
	$('#announcementTab > b').addClass("menu-on");
    
    document.getElementById("title").focus();
    
    function save() {
	    document.announcementForm.action="announcementregist.do";
	    return true;
	}
</script>