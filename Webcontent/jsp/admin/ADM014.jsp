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
                <html:link href="#">Thêm mới tổ chức công chứng</html:link>
            </li>
        </ul>
    </div>
    <%@ include file="/jsp/common/error_message.jsp" %>

    <html:form action="notaryofficeentryview" method="post" enctype="multipart/form-data" styleId="form" onsubmit="javascript: saveOnClick()">
        <span class="sub-title">◊ Thông tin tổ chức công chứng</span>
        <table class="tbl-none-border" summary="Thông tin tìm kiếm">
        <tr id="name_tr">
            <th>Tên tổ chức <span class="required">*</span> :</th>
            <td colspan="3">
                <html:text property="name" name="notaryOfficeEntryViewHelper" maxlength="100" styleId="firstControl" styleClass="input-x-long"/>
            </td>            
        </tr>
        <tr id="authenticationId_tr">
            <th valign="top">Mã tổ chức <span class="required">*</span> :</th>
            <td colspan="3">
                <html:text property="authenticationId" name="notaryOfficeEntryViewHelper" maxlength="10" styleClass="input-normal"></html:text>
                <em style="color: #9595BC;">(Mã tổ chức sẽ được sử dụng làm tiền tố của tài khoản người dùng thuộc tổ chức</em>                
            </td>
        </tr>
        <tr id="address_tr">
            <th>Địa chỉ :</th>
            <td colspan="3">
                <html:text property="address" name="notaryOfficeEntryViewHelper" maxlength="200" styleClass="input-x-long"></html:text>
            </td>
        </tr>
        <tr>
            <th>Điện thoại  :</th>
            <td id="phone_td" width="265px">
                <html:text property="phone" name="notaryOfficeEntryViewHelper" maxlength="100" styleClass="input-normal"></html:text>
            </td>
            <th width="60px">Fax  :</th>
            <td id="fax_td">
                <html:text property="fax" name="notaryOfficeEntryViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr>
            <th>Email :</th>
            <td id="email_td">
                <html:text property="email" name="notaryOfficeEntryViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
            <th>Website :</th>
            <td id="website_td">
                <html:text property="website" name="notaryOfficeEntryViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="otherInfo_tr">
            <th>Thông tin khác :</th>
            <td colspan="3">
                <html:textarea property="otherInfo" name="notaryOfficeEntryViewHelper" styleClass="input-x-long"></html:textarea>
            </td>
        </tr>        
        <tr id="activeFlg_tr">
            <th>Trạng thái hoạt động :</th>
            <td colspan="3">
                <html:radio property="activeFlg" name="notaryOfficeEntryViewHelper" value="true" styleId="activeFlgTrue"/>
                <label for="activeFlgTrue">Hoạt động</label>
                &nbsp;&nbsp;&nbsp;
                <html:radio property="activeFlg" name="notaryOfficeEntryViewHelper" value="false" styleId="activeFlgFalse"/>
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
                <html:link href="notarylistback.do">
                    <img alt="Hủy bỏ" src="./image/btn_cancel.png"/>
                </html:link>
            </td>
        </tr>
        </table>
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
      document.notaryOfficeEntryForm.action="notaryofficeentrysave.do";
      return true;
  }
</script>