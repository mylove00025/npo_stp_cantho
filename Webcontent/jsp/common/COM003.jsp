<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
    <%@ include file="/jsp/common/header.jsp" %>        
        <html:form action="/home" >
            <%@ include file="/jsp/common/error_message.jsp" %>
            <table class="table_content">
            	<tr>
            		<td valign="top">
            			<table class="table_left_content" cellpadding="0" cellspacing="0">
				            <tr>
				                <td valign="top">
                                <div class="div_Message_blue">
                                        <div class="div_top_left_common_blue"></div>
                                        <div class="div_top_center_common_blue">
                                            <div class="div_top_img"><img src="image/home/ico_news.png" alt="Tin tức" /></div>                           
                                            <div class="div_top_title">BẢNG THÔNG BÁO</div> 
                                        </div>
                                        <div class="div_top_content_common">
                                        <div class="fieldset_content_info">
                                        <div class="div_field_top">                                         
                                            <div class="div_field_top_left"></div>
                                            <div class="div_field_top_center"></div>
                                        </div>  
                                        <div class="div_field_midde">
                                            <div class="div_field_midde_center">
                                                <div class="div_all_content_contract">
                                                    <logic:notEmpty name="homeViewHelper" property="announcementInfoNew">
	                                                    <bean:define id="item_announcement_new" name="homeViewHelper" property="announcementInfoNew" type="com.osp.npo.core.announcement.AnnouncementInfo">
	                                                    </bean:define>    
	                                                    <table class="table_common_100">
	                                                        <tr>
	                                                            <td class="td_message_title_detail">
	                                                                <b> 
	                                                                    <logic:equal value="true" name="item_announcement_new" property="today"> 
											                                <img src="image/mes_new.png" alt="Tin mới" title="Tin mới"/>
											                            </logic:equal>
	                                                                    <logic:equal value="2" name="item_announcement_new" property="importanceType">
											                                <img src="./image/icon_importance.png" alt="Tin quan trọng" title="Tin quan trọng"/>
											                            </logic:equal>
	                                                                    <a href='announcementview.do?id=<bean:write name="item_announcement_new" property="aid" />' title='<bean:write name="item_announcement_new" property="title" />' ><bean:write name="item_announcement_new" property="title" /></a>
	                                                                </b>
	                                                            </td>
	                                                        </tr>
	                                                        <tr>
	                                                            <td class="td_message_detail">                      
	                                                                <bean:write name="item_announcement_new" property="content" filter="false"/>
	                                                            </td>               
	                                                        </tr>
	                                                        <tr>
	                                                            <td class="td_message_detail_file">
	                                                                <logic:notEmpty name="item_announcement_new" property="attachFileName"> 
	                                                                    <bean:define id="fileName" name="item_announcement_new" property="attachFileName" type="java.lang.String"/>
	                                                                    <%@ include file="/jsp/common/common_function.jsp" %>
	                                                                    <img src="<%=getIcon(fileName)%>" />
	                                                                    <html:link href="javascript:downloadFile();">
	                                                                        <bean:write name="item_announcement_new" property="attachFileName"/>
	                                                                    </html:link>
	                                                                </logic:notEmpty>
	                                                            </td>               
	                                                        </tr>
	                                                    </table>
                                                    </logic:notEmpty>
                                                </div>  
                                            </div>
                                        </div>  
                                        <div class="div_field_bottom">                                          
                                            <div class="div_field_bottom_left"></div>
                                            <div class="div_field_bottom_center"></div>
                                        </div>
                                        </div>
                                        <logic:notEmpty name="homeViewHelper" property="lstAnnouncementInfo">
                                           <div style="border-top: 1px solid #CCCCCC;border-bottom: 1px solid #CCCCCC;padding: 10px;color: #367EC9;font-weight: bold;">TIN KHÁC</div>
                                            <logic:iterate id="item_message" name="homeViewHelper" property="lstAnnouncementInfo" indexId="i">                              
                                                <div class="div_message_item">                                                  
                                                    <a href='announcementview.do?id=<bean:write name="item_message" property="aid" />' title='<bean:write name="item_message" property="title" />' ><bean:write name="item_message" property="titleDisp" /></a>
                                                    <logic:equal value="true" property="today" name="item_message"> 
                                                        <img src="image/mes_new.png" alt="Tin mới" />
                                                    </logic:equal>
                                                    <logic:equal value="2" property="importanceType" name="item_message">
                                                        <img src="image/icon_importance.png" width="12px" height="12px" alt="Tin quan trọng" />
                                                    </logic:equal>                                                   
                                                </div>
                                            </logic:iterate>
                                        </logic:notEmpty>
                                        </div>
                                    </div>
				            	</td>
				            	<td valign="top">
				            	   <div class="div_Message_gray">
		                            <div class="div_top_left_common_gray">                          
		                            </div>
		                            <div class="div_top_center_common_gray">
		                                <div class="div_top_img"><img src="image/home/ico_temp.png" alt="Công cụ truy cập nhanh" /></div>                          
		                                <div class="div_top_title">CÔNG CỤ TRUY CẬP NHANH</div> 
			                            </div>
			                            <div class="div_top_content_common_template">
			                            <br/>
			                            <a href="preventlistview.do" style="margin: 10px 20px 20px 10px;text-decoration: none; color:#666666;">
			                            <img style="vertical-align: middle;" src="image/home/preventsearch.png" alt="Tra cứu" /> <b>TRA CỨU THÔNG TIN</b>
			                            </a>
			                            <br/>
			                            <br/>
			                            <div style="border-top: 0.5px dotted #CCCCCC;">
                                        </div>
                                        <% if(context.isPreventData()) { %>
                                        <br/>
			                            <a href="datapreventregistview.do" style="margin: 10px 20px 20px 10px;text-decoration: none; color:#666666;">
                                        <img style="vertical-align: middle;" src="image/home/preventregist.png" alt="Thêm mới" /> <b>NHẬP MỚI THÔNG TIN NGĂN CHẶN</b>
                                        </a>
                                        <% } %>
		                            </div> 
			                        </div>
				            	</td>
				            </tr>
			            </table>
            		</td>
            	</tr> 	
            </table>
           	<div id="backgroundPopup"></div>
        </html:form>
    <%@ include file="/jsp/common/footer.jsp"%>
</html:html>
<script type="text/javascript">
    // highlight home tab.
    $('#home > em').removeClass("home-off");
    $('#home > em').addClass("home-on");
    $('#home > b').addClass("menu-on");
    
    function toogle_view(div_child) {
        $("#" + div_child).toggle();
    }

    function downloadFile() {
		document.homeForm.action = "popupannouncfiledownload.do";
		document.homeForm.submit();
	}
    
</script>