<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<bean:define id="context" name="CommonContext" type="com.osp.npo.app.context.CommonContext"/>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
    <title><bean:write name="context" property="screenTitle"/></title>
    <link rel="SHORTCUT ICON" href="./image/osp.ico"/>
    <link href="./style/style.css" rel="stylesheet" type="text/css" media="screen,print" />
    <link rel="stylesheet" type="text/css" href="./style/calendar.css" />
    <link rel="stylesheet" type="text/css" href="./style/border-radius.css" />
    <link rel="stylesheet" type="text/css" href="./style/steel.css" />
     <link rel="stylesheet" type="text/css" href="./style/home-style.css" />
    <!--[if IE 7]>
    <link rel="stylesheet" type="text/css" href="./style/style_ie.css" />
    <![endif]-->
    <script type="text/javascript" src="./javascript/jquery.min.js"></script>
    <script type="text/javascript" src="./javascript/gmenu.js"></script>
    <script type="text/javascript" src="./javascript/stickytooltip.js"></script>
    <script language="JavaScript" src="javascript/calendar.js"></script>
    <script language="JavaScript" src="javascript/vn.js"></script>
    <script language="JavaScript" src="javascript/common.js"></script>

</head>

<body>
    <%@include file="hight_light.jsp" %>
    <table id="wrapper">
    <tr>
    <td valign="top">
    <%
              if (!context.getLoginFromClient()) {
   %>
    <div id="header">
        <div id="banner">
            <html:img src="./image/header_banner_npo.gif" style="float:left"/>
            <div id="admin-area">
                <html:img src="./image/icon-user.png" />
                <html:link style="color:white;" href="userprofile.do" title="Thông tin tài khoản">
                    Chào <bean:write name="context" property="userInfo.familyName"/> <bean:write name="context" property="userInfo.firstName"/>
                </html:link>
                <span>[<bean:write name="context" property="userInfo.account"/>]</span>
                <span style="color:white;">&nbsp;|&nbsp;</span>
                <html:img src="./image/icon-logout.png" />
                <html:link style="color:white;" href="logout.do">Đăng xuất</html:link>
            </div>
        </div>

        <div id="gmenu">
          <ul id="jsddm">
              <li>
                <html:link styleId="home" href="home.do" styleClass="jla">
                    <em class="home-off">&nbsp;</em>
                    <b>Trang chủ</b>
                    <html:img alt="|" src="./image/menu_sperator.png"/>
                </html:link>
              </li>
              <li>
                  <html:link styleId="preventTab" href="preventlistview.do" styleClass="jla">
                      <em style="width:17px;" class="menu-block-contract-off">&nbsp;</em>
                      <b>Tra cứu thông tin</b>
                      <html:img alt="|" src="./image/menu_sperator.png"/>
                  </html:link>
              </li>
              <%
              if (context.isAnnouncementManagement()) {
              %>
              <li>
                <html:link styleId="announcementTab" href="announcementlistview.do" styleClass="jla">
                      <em style="width:17px;" class="announcement-off">&nbsp;</em>
                      <b>Thông báo</b>
                      <html:img alt="|" src="./image/menu_sperator.png"/>
                </html:link>
              </li>
              <%}%>
              <%
              if (context.isAdmin()) {
              %>
              <li>
                <html:link styleId="system" href="notarylistview.do" styleClass="jla">
                  <em class="system-off">&nbsp;</em>
                  <b>Quản trị hệ thống</b>
                  <html:img alt="|" src="./image/menu_sperator.png"/>
                </html:link>
                <ul>
                    <li><html:link href="notarylistview.do">Danh sách tổ chức công chứng</html:link></li>
                    <li><html:link href="justiceuserlistview.do">Danh sách cán bộ Sở Tư pháp</html:link></li>   
                    <li><html:link href="contractHistorylistview.do">Lịch sử thay đổi hợp đồng</html:link></li>  
                    <li><html:link href="accesshistorylist.do">Lịch sử truy cập hệ thống</html:link></li>               
                </ul>
              </li>
              <%}%>
              <!-- 
               <li>
                <a  target="_blank" href="http://192.168.1.209:8080/forum/login.do?u=<%=context.getUserInfo().getFullName()%> &o=000 &ur=administrator &acc=<%=context.getUserInfo().getAccount()%> &p=<%=context.getUserInfo().getPassword()%>">
                    <em class="forum-off">&nbsp;</em>
                    <b>Diễn đàn</b>
                    <html:img alt="|" src="./image/menu_sperator.png"/>
                </a>
              </li>
               -->
          </ul>
          <html:link styleClass="acc_link" href="/uchi_help/" target="_blank">
            <img style="margin-bottom: -4px;" src="./image/help.png"> Trợ giúp
          </html:link> 
          <html:link styleClass="acc_link" href="userprofile.do">
            <img width="13px" src="./image/profile.png" style="margin-bottom: -2px;"> Tài khoản
          </html:link>
        </div>

    </div>
    <div id="content" class="clearfix">
<%}%>