<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
    <%@ include file="/jsp/common/header.jsp" %>
    <html:form action="systemconfigview" onsubmit="javascript: save();">
        <div id="navigator">
            <ul class="clearfix">
                <li>
                    <html:img alt="*" src="./image/bullet_square.gif"/>
                </li>
                <li>
                    <a href="userlistview.do">Quản trị hệ thống</a> &gt;
                    <a href="#">Cấu hình hệ thống</a>
                </li>
            </ul>
        </div>
        <%@ include file="/jsp/common/error_message.jsp" %>
        
        <div>
            <strong><span>◊ Tạo chỉ mục tìm kiếm</span></strong>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <html:link href="systemconfigcreateindex.do">
                <html:img alt="Tạo chỉ mục" src="./image/btn_create_index.png" style="vertical-align: middle;"/>
            </html:link>
        </div>
        
    </html:form>
    <%@ include file="/jsp/common/footer.jsp" %>
</html:html>
<script type="text/javascript">
  //Hightlight menu
  $('#system > em').removeClass("system-off");
  $('#system > em').addClass("system-on");
  $('#system > b').addClass("menu-on");

  document.getElementById("notaryOfficeName").focus();
  function save() {
    document.systemConfigForm.action = "systemconfigupdate.do";
    return true;
  }
</script>