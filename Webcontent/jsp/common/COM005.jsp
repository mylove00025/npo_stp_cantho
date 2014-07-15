<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
    <%@ include file="/jsp/common/header.jsp" %>

    <%@ include file="/jsp/common/error_message.jsp" %>             
  	<html:form action="announcementview">
        	<div style="margin: 0 auto; text-align: center;width: 100%">
        		<div class="fieldset_content_info_message">
		           		<div class="div_field_top_message">				            				
		           			<div class="div_field_top_left_message"></div>
		           			<div class="div_field_top_center_message"></div>
		           		</div>	
		           		<div class="div_field_midde_message">		
		           			<div class="div_field_midde_center_message">
		           				<div class="div_all_content_contract_message" style="min-height: 250px;">
		           					<table class="table_common_100">
						                <tr>
							                <td class="td_message_title_detail" colspan="2">	
							                	<strong class="strong_a"> <img src="image/mes_new.png" alt="" />                 	
									            	<bean:write name="announcementViewHelper" property="title"/>
									            </strong>
							                </td>
						                </tr>
						                <tr>
							                <td class="td_message_detail" colspan="2">	                	
									            <bean:write name="announcementViewHelper" property="content" filter="false"/>
							                </td>               
						                </tr> 
						                <tr>							                							                    
							                <td class="td_message_detail_file">
								                <logic:notEmpty name="announcementViewHelper" property="attachFileName"> 
								                	<bean:define id="fileName" name="announcementViewHelper" property="attachFileName" type="java.lang.String"/>
						                            <%@ include file="/jsp/common/common_function.jsp" %>
						                            <img src="<%=getIcon(fileName)%>" />
                       								<html:link href="javascript:downloadFile();">
								                        <bean:write name="announcementViewHelper" property="attachFileName"/>
								                    </html:link>
                        						</logic:notEmpty>                        						
							                </td>				                          
						                </tr>
						                <tr >							                							                    
							                <td class="td_message_detail_file" style="border-top: 1px solid #D6D6D6;">
							                	<b>Tin khác </b>							                	
								                <div class="div_top_content_common_noboder">	
						                			<logic:iterate id="item_message" name="announcementViewHelper" property="lstAnnouncementInfo" indexId="i">		                		
							                			<div class="div_message_item_noboder">			
							                					<a href='announcementview.do?id=<bean:write name="item_message" property="aid" />' title='<bean:write name="item_message" property="title" />' ><bean:write name="item_message" property="titleDispNews" /></a>							                				
							                				<logic:equal value="2" property="importanceType" name="item_message">
							                					<img src="image/icon_importance.png" width="12px" height="12px" alt="Tin quan trọng" />
							                				</logic:equal>
							                				<logic:equal value="true" property="today" name="item_message">	
							                					<img src="image/mes_new.png" alt="Tin mới" />
							                				</logic:equal>							                				
							                			</div>					                			
						                			</logic:iterate>				                			
						                		</div> 
							                </td>               
						                </tr>
						            </table>
		           				</div>           					 
		           				<div class="div_contract_content_message">
		           				</div>
		           			</div>
		           		</div>	
		           		<div class="div_field_bottom_message">				            				
		           			<div class="div_field_bottom_left_message"></div>
		           			<div class="div_field_bottom_center_message"></div>
		           		</div>	
		           	</div>        			
			</div>	
		 </html:form>
    <%@ include file="/jsp/common/footer.jsp" %> 
</html:html>

<script type="text/javascript">

	$('#home > em').removeClass("home-off");
	$('#home > em').addClass("home-on");
	$('#home > b').addClass("menu-on");        
    
	
	function downloadFile() {
		document.announcementForm.action = "announcementfiledownload.do";
		document.announcementForm.submit();

	}
</script>