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
                <html:link href="justiceuserlistback.do">Danh sách cán bộ Sở Tư pháp</html:link>
                <span> &gt; </span>
            </li>
            <li>
                <html:link href="#">Thêm mới cán bộ Sở Tư pháp</html:link>
            </li>
        </ul>
    </div>
    <%@ include file="/jsp/common/error_message.jsp" %>

    <html:form action="justiceaddnewuser" method="post" enctype="multipart/form-data" styleId="form" onsubmit="javascript: saveOnClick()">
        <span class="sub-title">◊ Thông tin người sử dụng</span>
        <table class="tbl-none-border" summary="Thông tin tìm kiếm">
        <tr>
            <th id="familyName_th">Họ đệm <span class="required">*</span> :</th>
            <td width="120px" id="familyName_td">
                <html:text property="familyName" name="justiceUserEntryViewHelper" maxlength="40" styleId="firstControl" styleClass="input-normal"/>
            </td>
            <th width="60px" id="firstName_th">Tên <span class="required">*</span> :</th>
            <td id="firstName_td">
                <html:text property="firstName" name="justiceUserEntryViewHelper" maxlength="10"></html:text>
            </td>
        </tr>
        <tr id="account_tr">
            <th>Tài khoản đăng nhập <span class="required">*</span> :</th>
            <td colspan="3">
                <html:text property="account" name="justiceUserEntryViewHelper" maxlength="16" styleClass="input-normal"></html:text>
                <em style="color: #9595BC;">(Tài khoản đăng nhập chỉ được dùng chữ cái, số, dấu gạch dưới và dấu gạch ngang.)</em>
            </td>
        </tr>
        <tr id="password_tr">
            <th>Mật khẩu <span class="required">*</span> :</th>
            <td colspan="3">
                <html:password property="password" name="justiceUserEntryViewHelper" maxlength="16" styleClass="input-normal"></html:password>
            </td>
        </tr>
        <tr id="rePassword">
            <th>Xác nhận mật khẩu <span class="required">*</span> :</th>
            <td colspan="3">
                <html:password property="rePassword" name="justiceUserEntryViewHelper" maxlength="16" styleClass="input-normal"></html:password>
            </td>
        </tr>
        <tr>
            <th id="birthday_th">Ngày sinh :</th>
            <td id="birthday_td">
                <html:text styleId="birthday" property="birthday" name="justiceUserEntryViewHelper" maxlength="10" style="vertical-align:middle;"/>
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
                <html:select property="sex" name="justiceUserEntryViewHelper">
                <html:option value="true">Nam</html:option>
                <html:option value="false">Nữ</html:option>
                </html:select>
            </td>
        </tr>
        <tr id="address_tr">
            <th>Địa chỉ  :</th>
            <td colspan="3">
                <html:text property="address" name="justiceUserEntryViewHelper" maxlength="200" styleClass="input-long"></html:text>
            </td>
        </tr>
        <tr id="email_tr">
            <th>Email :</th>
            <td colspan="3">
                <html:text property="email" name="justiceUserEntryViewHelper" maxlength="50" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="telephone_tr">
            <th>Điện thoại cố định :</th>
            <td colspan="3">
                <html:text property="telephone" name="justiceUserEntryViewHelper" maxlength="16" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="mobile_tr">
            <th>Điện thoại di động :</th>
            <td colspan="3">
                <html:text property="mobile" name="justiceUserEntryViewHelper" maxlength="16" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr id="role_tr">
            <th>Chức vụ :</th>
            <td colspan="3">
                <html:text property="role" name="justiceUserEntryViewHelper" maxlength="16" styleClass="input-normal"></html:text>
            </td>
        </tr>
        <tr>
            <th>Trạng thái hoạt động :</th>
            <td colspan="3">
                <html:radio property="activeFlg" name="justiceUserEntryViewHelper" value="true" styleId="activeFlgTrue"/>
                <label for="activeFlgTrue">Hoạt động</label>
                &nbsp;&nbsp;&nbsp;
                <html:radio property="activeFlg" name="justiceUserEntryViewHelper" value="false" styleId="activeFlgFalse"/>
                <label for="activeFlgFalse">Ngừng hoạt động</label>
            </td>
        </tr>
        <tr>
            <th style="vertical-align:text-top;">Phân quyền</th>
            <td colspan="3">
                <table class="tbl-list">
                    <tr>
                        <th>
                            <input id="authority_all" type="checkbox" value="true" onclick="checkAll('authority_all', 'chkId');" />
                        </th>
                        <th style="text-align: center;">
                            Quyền
                        </th>
                    </tr>
                    <tr>
                        <td style="text-align: center;">
                            <html:checkbox property="preventAuthority" name="justiceUserEntryViewHelper" alt="chkId" />
                        </td>
                        <td>
                            Tạo mới dữ liệu ngăn chặn
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: center;">
                            <html:checkbox property="announcementAuthority" name="justiceUserEntryViewHelper" alt="chkId" />
                        </td>
                        <td>
                            Quản trị thông báo
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: center;">
                            <html:checkbox property="adminAuthority" name="justiceUserEntryViewHelper" alt="chkId" styleClass="myOption"/>
                        </td>
                        <td>
                            Quản trị hệ thống
                        </td>
                    </tr>
                </table>
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
                <html:link href="justiceuserlistback.do">
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

  function checkAll(selector_fire, alt_name) {
      $('input[alt=' + alt_name + ']').attr('checked', $('#' + selector_fire).is(':checked'));
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
      document.justiceUserEntryForm.action="justicesavenewuser.do";
      return true;
  }
</script>