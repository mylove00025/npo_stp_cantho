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
                <span> &gt; </span>
            </li>
            <li>
                <html:link href="userlistback.do">Thông tin tổ chức công chứng</html:link>
                <span> &gt; </span>
            </li>
            <li>
                <html:link href="#">Chỉnh sửa thông tin người dùng</html:link>
            </li>
        </ul>
    </div>
    <%@ include file="/jsp/common/error_message.jsp" %>
    
     <html:form action="edituserview" onsubmit="javascript: saveOnClick()">
    
    
     <table>
    <tr>
    <td>
    <span><strong>◊ Tổ chức công chứng</strong></span>
    </td>
    <td colspan="3">
          <!-- Thieu: write name="notaryOfficeEditContext" property="officeName" -->
          <strong><bean:write name="notaryOfficeEditContext" property="officeName" /></strong>
        </td>
       </tr>
       <tr>
       <td>
        <span><strong>◊ Thông tin người sử dụng</strong></span>
        </td>
        </tr>
     </table>   
     
    <table class="tbl-none-border" summary="Thông tin tìm kiếm">
        <tr>
            <th id="familyName_th">Họ đệm<span class="required">*</span> :</th>
            <td id="familyName_td">
                <html:text property="familyName" styleId="firstControl" name="userEditViewHelper" maxlength="26" styleClass="input-normal"></html:text>
            </td>
            <th id="firstName_th">Tên<span class="required">*</span> :</th>
            <td id="firstName_td">
                <html:text property="firstName" name="userEditViewHelper" maxlength="10"></html:text>
            </td>
        </tr>
        <tr id="account_tr">
            <th>Tài khoản đăng nhập<span class="required">*</span> :</th>
            <td colspan="3">
                <strong><bean:write  property="account" name="userEditViewHelper"/></strong>
            </td>
        </tr>
         <tr id="password_tr">
            <th>Mật khẩu :</th>
            <td colspan="3">
                <html:password property="password" name="userEditViewHelper" maxlength="16" styleClass="input-normal"></html:password>
            </td>
        </tr>
        <tr id="rePassword">
            <th>Xác nhận mật khẩu :</th>
            <td colspan="3">
                <html:password property="rePassword" name="userEditViewHelper" maxlength="16" styleClass="input-normal"></html:password>
            </td>
        </tr>
        <tr>
            <th id="birthday_th">Ngày sinh :</th>
            <td id="birthday_td">
                <html:text styleId="birthday" property="birthday" name="userEditViewHelper" maxlength="10" style="vertical-align:middle;"></html:text>
                <a href="#"><img id="popupCal-1" src="./image/calendar.png" alt="calendar" style="vertical-align: middle;"/></a>
                <script type="text/javascript">
                    new Calendar({
                        inputField: "birthday",
                        dateFormat: "%d/%m/%Y",
                        trigger: "popupCal-1",
                        bottomBar: false,
                        onSelect: function() {
                                var date = Calendar.intToDate(this.selection.get());
                                LEFT_CAL.args.min = date;
                                LEFT_CAL.redraw();
                                this.hide();
                        }
                    });
                </script>
            </td>
            <th id="sex_th">Giới tính :</th>
            <td id="sex_td">
                <html:select property="sex" name="userEditViewHelper">
                    <html:option value="true">Nam</html:option>
                    <html:option value="false">Nữ</html:option>
                </html:select>
            </td>
        </tr>
        <tr id="address_tr">
            <th>Địa chỉ  :</th>
            <td colspan="3">
                <html:text property="address" name="userEditViewHelper" maxlength="200" styleClass="input-long"></html:text>
            </td>
        </tr>
        <tr id="email_tr">
            <th>Email :</th>
            <td colspan="3">
                <html:text property="email" name="userEditViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="telephone_tr">
            <th>Điện thoại cố định :</th>
            <td colspan="3">
                <html:text property="telephone" name="userEditViewHelper" maxlength="16" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="mobile_tr">
            <th>Điện thoại di động :</th>
            <td colspan="3">
                <html:text property="mobile" name="userEditViewHelper" maxlength="16" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="role_tr">
            <th>Chức vụ :</th>
            <td colspan="3">
                <html:text property="role" name="userEditViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
        </tr>
         <tr>
            <th style="vertical-align:text-top;">Quyền đăng ký dữ liệu ngăn chặn</th>
            <td colspan="3">
              <html:checkbox property="preventAuthority" name="userEditViewHelper" alt="chkId" />
            </td>
        </tr>
        <tr>
            <td style="text-align: center; padding-top: 10px;" colspan="4">
                <span id="save_on">
                    <input type="image" alt="Lưu" onclick="stylechange('save_on', 'save_off');" src="./image/btn_save.png" name="">
                </span>
                <span style="display: none;" id="save_off">
                    <a href="#"><img src="./image/btn_save.png" alt="Lưu"></a>
                </span>
                
                <span id="delete_on">
                        <a onclick="javascript: delOnClick(); stylechange('delete_on','delete_off');" href="#nowhere"><img src="./image/btn_delete.png" alt="Xóa"></a>
                </span>
                <span style="display: none;" id="delete_off">
                        <a href="#"><img src="./image/btn_delete.png" alt="Xóa"></a>
                </span>
                
                <a href="userlistback.do"><img src="./image/btn_cancel.png" alt="Hủy bỏ"></a>
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

  <logic:equal value="true" property="hasContract" name="userEditViewHelper">
      $('#edit_role').attr('disabled', 'disabled');
  </logic:equal>

  function checkAll(objAll,chkId) {
      var inputs = document.forms[0];
      for(var k = 0; k < inputs.length; k++)
      {
          var input = inputs[k];
          var name = input.id;
          if (input.alt == chkId ) {
              input.checked=objAll.checked;
          }
      }
  }

  var LEFT_CAL = Calendar.setup({
      cont: "cont",
      weekNumbers: true,
      selectionType: Calendar.SEL_MULTIPLE,
      showTime: 12
      // titleFormat: "%B %Y"
  });

  function saveOnClick()
  {
      document.userEditForm.action="editusersave.do";
      //document.userEditForm.submit();
      return true;
  }

 function delOnClick()
  {
      var answer = confirm("<bean:message key='msg_delete_confirm'/>");
      if (answer){
          document.userEditForm.action="edituserdel.do";
          document.userEditForm.submit();
          return true;
      } else {
          return false;
      }
  }
</script>