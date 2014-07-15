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
                <html:link href="notarylistback.do">Danh sách tổ chức công chứng</html:link>
                <span> &gt; </span>
            </li>
            <li>
                <html:link href="#">Thông tin tổ chức công chứng</html:link>
            </li>
        </ul>
    </div>
    <%@ include file="/jsp/common/error_message.jsp" %>

    <html:form action="notaryofficeeditview" method="post" enctype="multipart/form-data" styleId="form" onsubmit="javascript: saveOnClick()">
        <span class="sub-title">◊ Thông tin tổ chức công chứng</span>
        <div>
        <table class="tbl-none-border" summary="Thông tin tìm kiếm">
        <tr id="name_tr">
            <th>Tên tổ chức <span class="required">*</span> :</th>
            <td colspan="3">
                <html:text property="name" name="notaryOfficeEditViewHelper" maxlength="100" styleId="firstControl" styleClass="input-x-long"/>
            </td>            
        </tr>
        <tr id="authenticationId_tr">
            <th>Mã tổ chức <span class="required">*</span> :</th>
            <td colspan="3">
                <strong><bean:write property="authenticationId" name="notaryOfficeEditViewHelper" /></strong>
            </td>
        </tr>        
        <tr id="address_tr">
            <th>Địa chỉ :</th>
            <td colspan="3">
                <html:text property="address" name="notaryOfficeEditViewHelper" maxlength="200" styleClass="input-x-long"></html:text>
            </td>
        </tr>
        <tr>
            <th>Điện thoại  :</th>
            <td id="phone_td" width="265px">
                <html:text property="phone" name="notaryOfficeEditViewHelper" maxlength="100" styleClass="input-normal"></html:text>
            </td>
            <th width="60px">Fax  :</th>
            <td id="fax_td">
                <html:text property="fax" name="notaryOfficeEditViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr>
            <th>Email :</th>
            <td id="email_td">
                <html:text property="email" name="notaryOfficeEditViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
            <th>Website :</th>
            <td id="website_td">
                <html:text property="website" name="notaryOfficeEditViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="otherInfo_tr">
            <th>Thông tin khác :</th>
            <td colspan="3">
                <html:textarea property="otherInfo" name="notaryOfficeEditViewHelper" styleClass="input-x-long"></html:textarea>
            </td>
        </tr>        
        <tr id="activeFlg_tr">
            <th>Trạng thái hoạt động :</th>
            <td colspan="3">
                <html:radio property="activeFlg" name="notaryOfficeEditViewHelper" value="true" styleId="activeFlgTrue"/>
                <label for="activeFlgTrue">Hoạt động</label>
                &nbsp;&nbsp;&nbsp;
                <html:radio property="activeFlg" name="notaryOfficeEditViewHelper" value="false" styleId="activeFlgFalse"/>
                <label for="activeFlgFalse">Ngừng hoạt động</label>
            </td>
        </tr>
        <tr>
            <td colspan="4" style="text-align:center; padding-right:20px; padding-top: 10px;">
                <span id="save_on">
                    <html:image alt="Lưu" src="./image/btn_save.png" onclick="stylechange('save_on', 'save_off');"/>
                </span>
                <span id="save_off" style="display: none;">
                    <html:link href="#">
                        <img alt="Lưu" src="./image/btn_save.png"/>
                    </html:link>
                </span>
                <html:link href="#nowhere" onclick="javascript: delOnClick();">
                    <img alt="Xóa" src="./image/btn_delete.png"/>
                </html:link>
                <html:link href="notarylistback.do">
                    <img alt="Hủy bỏ" src="./image/btn_cancel.png"/>
                </html:link>
            </td>
        </tr>
        </table>
        </div>
        <br/>
        <div>
        <span class="sub-title">◊ Danh sách người sử dụng 
            &nbsp;&nbsp;&nbsp;<a href="addnewuserview.do" class="button"><img style="vertical-align: middle;" src="./image/btn_add.png" alt="Thêm mới" /></a></span>
        <br/>&nbsp;
        <logic:notEmpty name="notaryOfficeEditViewHelper" property="list">
            <table class="tbl-list">
                <tr>
                    <th>Họ tên</th>
                    <th>Tài khoản đăng nhập</th>                    
                    <th>Ngày sinh</th>
                    <th>Chức vụ</th>
                </tr>
                <logic:iterate id="user" name="notaryOfficeEditViewHelper" property="list" indexId="i">
                    <%int style = i % 2; %>
                    <tr class="tbl-row<%=style%>">
                        <td>
                            <html:link action="/edituserview.do" paramId='id' paramName='user' paramProperty='id'>
                                <bean:write name="user" property="familyName"/> <bean:write name="user" property="firstName"/>
                            </html:link>
                        </td>
                        <td>
                            <bean:write name="user" property="account"/>                            
                        </td>                        
                        <td><bean:write name="user" property="birthday"/></td>
                        <td><bean:write name="user" property="role"/></td>                        
                    </tr>
                </logic:iterate>
            </table>
            <div class="pager">
                <div class="pager-total">
                     Tổng số <strong><bean:write name="notaryOfficeEditViewHelper" property="totalCount"/></strong> người sử dụng
                </div>
                <div>
                    <logic:greaterThan name="notaryOfficeEditViewHelper" value="1" property="totalPage">
                             <html:link href="javascript:direction('first')">
                                    <img id="imgfirst" class="pager-first" src="./image/first.png" alt= "first"/>
                            </html:link>
                            <html:link href="javascript:direction('ahead')">
                                    <img id="imgprev" class="pager-first" src="./image/prev.png" alt= "prev"/>
                            </html:link>
                    </logic:greaterThan>
                    <span>
                        Trang
                        <bean:write name="notaryOfficeEditViewHelper" property="page"/>
                        /
                        <bean:write name="notaryOfficeEditViewHelper" property="totalPage"/>&nbsp;&nbsp;
                    </span>
                    <logic:greaterThan name="notaryOfficeEditViewHelper" value="1" property="totalPage">
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
        </logic:notEmpty>
        </div>
    </html:form>

    <%@ include file="/jsp/common/footer.jsp" %>
</html:html>
<script type="text/javascript">
  $('#system > em').removeClass("system-off");
  $('#system > em').addClass("system-on");
  $('#system > b').addClass("menu-on");

  document.getElementById("firstControl").focus();

  function saveOnClick()
  {
      document.notaryOfficeEditForm.action="notaryofficeeditsave.do";
      return true;
  }
  
  function direction(data){
      document.notaryOfficeEditForm.direction.value=data;
      document.notaryOfficeEditForm.action="notaryuserlistpage.do";
      document.notaryOfficeEditForm.submit();
  }
  
  function delOnClick()
  {
      var answer = confirm("<bean:message key='msg_delete_confirm'/>");
      if (answer){
          document.notaryOfficeEditForm.action="notaryofficeeditremove.do";
          document.notaryOfficeEditForm.submit();
          return true;
      } else {
          return false;
      }
  }
</script>