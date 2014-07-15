package org.apache.jsp.jsp.prevent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PRV003_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/jsp/common/header.jsp");
    _jspx_dependants.add("/jsp/common/hight_light.jsp");
    _jspx_dependants.add("/jsp/common/error_message.jsp");
    _jspx_dependants.add("/jsp/common/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyle_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftitle_005fstyle_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fstyleClass_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleClass_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005fonclick_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyle_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftitle_005fstyle_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fstyleClass_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleClass_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005fonclick_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyle_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftitle_005fstyle_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fstyleClass_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleClass_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005fonclick_005falt_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .tbl-balance-layout th{\r\n");
      out.write("        width: 155px;\r\n");
      out.write("    }\r\n");
      out.write("    .red-yellow {\r\n");
      out.write("        background-color: red;\r\n");
      out.write("        padding:5px;\r\n");
      out.write("    }\r\n");
      out.write("    .red-yellow label {\r\n");
      out.write("        color: yellow;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .yellow-red {\r\n");
      out.write("        background-color: yellow;\r\n");
      out.write("        padding:5px;\r\n");
      out.write("    }\r\n");
      out.write("    .yellow-red label {\r\n");
      out.write("        color: red;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fdefine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /jsp/common/header.jsp(6,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setId("context");
          // /jsp/common/header.jsp(6,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setName("CommonContext");
          // /jsp/common/header.jsp(6,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_bean_005fdefine_005f0.setType("com.osp.npo.app.context.CommonContext");
          int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
          if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
          com.osp.npo.app.context.CommonContext context = null;
          context = (com.osp.npo.app.context.CommonContext) _jspx_page_context.findAttribute("context");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<head>\r\n");
          out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
          out.write("    <meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
          out.write("    <meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
          out.write("    <title>");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</title>\r\n");
          out.write("    <link rel=\"SHORTCUT ICON\" href=\"./image/osp.ico\"/>\r\n");
          out.write("    <link href=\"./style/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen,print\" />\r\n");
          out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./style/calendar.css\" />\r\n");
          out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./style/border-radius.css\" />\r\n");
          out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./style/steel.css\" />\r\n");
          out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"./style/home-style.css\" />\r\n");
          out.write("    <!--[if IE 7]>\r\n");
          out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./style/style_ie.css\" />\r\n");
          out.write("    <![endif]-->\r\n");
          out.write("    <script type=\"text/javascript\" src=\"./javascript/jquery.min.js\"></script>\r\n");
          out.write("    <script type=\"text/javascript\" src=\"./javascript/gmenu.js\"></script>\r\n");
          out.write("    <script type=\"text/javascript\" src=\"./javascript/stickytooltip.js\"></script>\r\n");
          out.write("    <script language=\"JavaScript\" src=\"javascript/calendar.js\"></script>\r\n");
          out.write("    <script language=\"JavaScript\" src=\"javascript/vn.js\"></script>\r\n");
          out.write("    <script language=\"JavaScript\" src=\"javascript/common.js\"></script>\r\n");
          out.write("\r\n");
          out.write("</head>\r\n");
          out.write("\r\n");
          out.write("<body>\r\n");
          out.write("    ");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fpresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /jsp/common/hight_light.jsp(4,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fpresent_005f0.setName("org.apache.struts.action.ERROR");
          int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
          if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("    ");
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fdefine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
              // /jsp/common/hight_light.jsp(5,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_bean_005fdefine_005f1.setId("errors");
              // /jsp/common/hight_light.jsp(5,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_bean_005fdefine_005f1.setName("org.apache.struts.action.ERROR");
              // /jsp/common/hight_light.jsp(5,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_bean_005fdefine_005f1.setType("org.apache.struts.action.ActionMessages");
              int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
              if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
              org.apache.struts.action.ActionMessages errors = null;
              errors = (org.apache.struts.action.ActionMessages) _jspx_page_context.findAttribute("errors");
              out.write("\r\n");
              out.write("    ");
request.setAttribute("ERROR_FIELD", errors.properties());
              out.write("\r\n");
              out.write("\r\n");
              out.write("<script language=\"javascript\">\r\n");
              out.write("    var itemArr = [];\r\n");
              out.write("    var element = null;\r\n");
              out.write("    if (window.addEventListener){\r\n");
              out.write("        window.addEventListener('load', highlight, false);\r\n");
              out.write("    } else if (window.attachEvent){\r\n");
              out.write("        window.attachEvent('onload', highlight);\r\n");
              out.write("    }\r\n");
              out.write("    function highlight() {\r\n");
              out.write("    ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
              // /jsp/common/hight_light.jsp(17,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f0.setId("errField");
              // /jsp/common/hight_light.jsp(17,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fiterate_005f0.setName("ERROR_FIELD");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object errField = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                errField = (java.lang.Object) _jspx_page_context.findAttribute("errField");
                do {
                  out.write("\r\n");
                  out.write("        //Get control id\r\n");
                  out.write("        var varState = \"");
                  if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\";\r\n");
                  out.write("        //check if control contain special character\r\n");
                  out.write("        var lastIndex = varState.lastIndexOf('-');\r\n");
                  out.write("        //if control has special character, remove them\r\n");
                  out.write("        if (lastIndex >= 0){\r\n");
                  out.write("            varState = varState.substring(0, lastIndex);\r\n");
                  out.write("        }\r\n");
                  out.write("       //Set class style name for row/column/header\r\n");
                  out.write("        element = document.getElementById(varState +'_tr');\r\n");
                  out.write("        if (element) {\r\n");
                  out.write("            element.className += ' error-cell';\r\n");
                  out.write("        }\r\n");
                  out.write("        element = document.getElementById(varState +'_th');\r\n");
                  out.write("        if (element) {\r\n");
                  out.write("            element.className += ' error-cell';\r\n");
                  out.write("        }\r\n");
                  out.write("        element = document.getElementById(varState +'_td');\r\n");
                  out.write("        if (element) {\r\n");
                  out.write("            element.className += ' error-cell';\r\n");
                  out.write("        }\r\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  errField = (java.lang.Object) _jspx_page_context.findAttribute("errField");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write("\r\n");
              out.write("    }\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
          out.write("\r\n");
          out.write("    <table id=\"wrapper\">\r\n");
          out.write("    <tr>\r\n");
          out.write("    <td valign=\"top\">\r\n");
          out.write("    ");

              if (!context.getLoginFromClient()) {
   
          out.write("\r\n");
          out.write("    <div id=\"header\">\r\n");
          out.write("        <div id=\"banner\">\r\n");
          out.write("            ");
          if (_jspx_meth_html_005fimg_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            <div id=\"admin-area\">\r\n");
          out.write("                ");
          if (_jspx_meth_html_005fimg_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_html_005flink_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                <span>[");
          if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("]</span>\r\n");
          out.write("                <span style=\"color:white;\">&nbsp;|&nbsp;</span>\r\n");
          out.write("                ");
          if (_jspx_meth_html_005fimg_005f2(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_html_005flink_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("\r\n");
          out.write("        <div id=\"gmenu\">\r\n");
          out.write("          <ul id=\"jsddm\">\r\n");
          out.write("              <li>\r\n");
          out.write("                ");
          if (_jspx_meth_html_005flink_005f2(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("              </li>\r\n");
          out.write("              <li>\r\n");
          out.write("                  ");
          if (_jspx_meth_html_005flink_005f3(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("              </li>\r\n");
          out.write("              ");

              if (context.isAnnouncementManagement()) {
              
          out.write("\r\n");
          out.write("              <li>\r\n");
          out.write("                ");
          if (_jspx_meth_html_005flink_005f4(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("              </li>\r\n");
          out.write("              ");
}
          out.write("\r\n");
          out.write("              ");

              if (context.isAdmin()) {
              
          out.write("\r\n");
          out.write("              <li>\r\n");
          out.write("                ");
          if (_jspx_meth_html_005flink_005f5(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                <ul>\r\n");
          out.write("                    <li>");
          if (_jspx_meth_html_005flink_005f6(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</li>\r\n");
          out.write("                    <li>");
          if (_jspx_meth_html_005flink_005f7(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</li>   \r\n");
          out.write("                    <li>");
          if (_jspx_meth_html_005flink_005f8(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</li>  \r\n");
          out.write("                    <li>");
          if (_jspx_meth_html_005flink_005f9(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</li>               \r\n");
          out.write("                </ul>\r\n");
          out.write("              </li>\r\n");
          out.write("              ");
}
          out.write("\r\n");
          out.write("              <!-- \r\n");
          out.write("               <li>\r\n");
          out.write("                <a  target=\"_blank\" href=\"http://192.168.1.209:8080/forum/login.do?u=");
          out.print(context.getUserInfo().getFullName());
          out.write(" &o=000 &ur=administrator &acc=");
          out.print(context.getUserInfo().getAccount());
          out.write(" &p=");
          out.print(context.getUserInfo().getPassword());
          out.write("\">\r\n");
          out.write("                    <em class=\"forum-off\">&nbsp;</em>\r\n");
          out.write("                    <b>Diễn đàn</b>\r\n");
          out.write("                    ");
          if (_jspx_meth_html_005fimg_005f7(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                </a>\r\n");
          out.write("              </li>\r\n");
          out.write("               -->\r\n");
          out.write("          </ul>\r\n");
          out.write("          ");
          if (_jspx_meth_html_005flink_005f10(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write(" \r\n");
          out.write("          ");
          if (_jspx_meth_html_005flink_005f11(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("\r\n");
          out.write("    </div>\r\n");
          out.write("    <div id=\"content\" class=\"clearfix\">\r\n");
}
          out.write("\r\n");
          out.write("        <div id=\"navigator\">\r\n");
          out.write("            <ul class=\"clearfix\">\r\n");
          out.write("                <li>\r\n");
          out.write("                    ");
          if (_jspx_meth_html_005fimg_005f8(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                </li>\r\n");
          out.write("                <li>\r\n");
          out.write("                    ");
          if (_jspx_meth_html_005flink_005f12(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    <span> &gt; </span>\r\n");
          out.write("                </li>\r\n");
          out.write("                <li>\r\n");
          out.write("                    ");
          if (_jspx_meth_html_005flink_005f13(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                </li>\r\n");
          out.write("            </ul>\r\n");
          out.write("        </div>\r\n");
          out.write("        ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /jsp/prevent/PRV003.jsp(49,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setAction("/datapreventeditview");
          // /jsp/prevent/PRV003.jsp(49,8) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setMethod("post");
          // /jsp/prevent/PRV003.jsp(49,8) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setEnctype("multipart/form-data");
          // /jsp/prevent/PRV003.jsp(49,8) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setOnsubmit("javascript: update();");
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("            ");
              if (_jspx_meth_html_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("            ");
              if (_jspx_meth_html_005fhidden_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("            ");
              if (_jspx_meth_html_005fhidden_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("            ");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              if (_jspx_meth_logic_005fpresent_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              //  logic:present
              org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f2 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
              _jspx_th_logic_005fpresent_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fpresent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              // /jsp/common/error_message.jsp(11,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fpresent_005f2.setName("org.apache.struts.action.ACTION_MESSAGE");
              int _jspx_eval_logic_005fpresent_005f2 = _jspx_th_logic_005fpresent_005f2.doStartTag();
              if (_jspx_eval_logic_005fpresent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("    <div class=\"message_box\" id=\"message_box\">\r\n");
                  out.write("        ");
                  //  html:messages
                  org.apache.struts.taglib.html.MessagesTag _jspx_th_html_005fmessages_005f0 = (org.apache.struts.taglib.html.MessagesTag) _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid.get(org.apache.struts.taglib.html.MessagesTag.class);
                  _jspx_th_html_005fmessages_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fmessages_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f2);
                  // /jsp/common/error_message.jsp(13,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_html_005fmessages_005f0.setId("message");
                  // /jsp/common/error_message.jsp(13,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_html_005fmessages_005f0.setMessage("true");
                  int _jspx_eval_html_005fmessages_005f0 = _jspx_th_html_005fmessages_005f0.doStartTag();
                  if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.String message = null;
                    if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fmessages_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fmessages_005f0.doInitBody();
                    }
                    message = (java.lang.String) _jspx_page_context.findAttribute("message");
                    do {
                      out.write("\r\n");
                      out.write("            ");
                      if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_html_005fmessages_005f0, _jspx_page_context))
                        return;
                      out.write("<br>\r\n");
                      out.write("        ");
                      int evalDoAfterBody = _jspx_th_html_005fmessages_005f0.doAfterBody();
                      message = (java.lang.String) _jspx_page_context.findAttribute("message");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fmessages_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid.reuse(_jspx_th_html_005fmessages_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid.reuse(_jspx_th_html_005fmessages_005f0);
                  out.write("\r\n");
                  out.write("    </div>\r\n");
                  int evalDoAfterBody = _jspx_th_logic_005fpresent_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fpresent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
              out.write("\r\n");
              out.write("\r\n");
              out.write("            <div >\r\n");
              out.write("                <span><strong>◊ Cơ quan đăng ký thông tin ngăn chặn:</strong></span>\r\n");
              out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("                ");
              if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("            </div>\r\n");
              out.write("\r\n");
              out.write("            <table class=\"tbl-none-border table-inherit\">\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td colspan=\"2\" style=\"padding-left: 15px;\">\r\n");
              out.write("                        <span class=\"tree_open\" style=\"cursor: pointer;\" id=\"tgProperty\"> &nbsp;<strong>Thông tin tài sản</strong></span>\r\n");
              out.write("\r\n");
              out.write("                        <!-- <span id=\"changetoSimple\" class=\"onmouseover\" onclick=\"changeToSimpleInsert();\">[Nhập đơn giản]</span> -->\r\n");
              out.write("                        <span id=\"changetoDetail\" class=\"onmouseover\" onclick=\"changeToDetailInsert();\">[Nhập chi tiết]</span>\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td id=\"propertyInfoAll_td\">\r\n");
              out.write("                        <table id=\"property_panel\" class=\"tbl-balance-layout\">\r\n");
              out.write("                            <tr id=\"propertyType_tr\">\r\n");
              out.write("                                <th>Loại tài sản:</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write(" \t\t\t\t\t\t\t\r\n");
              out.write("                            <!-- vehicles property -->\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");

                            if ("1".equals(context.getPropertyPreventCarIssuePlace()) || "1".equals(context.getPropertyPreventCarIssueDate())) {
                            
              out.write("\r\n");
              out.write("                            <tr class=\"vehicles\" >\r\n");
              out.write("                                ");
              if (_jspx_meth_logic_005fequal_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                ");
              if (_jspx_meth_logic_005fnotEqual_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_logic_005fequal_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    <span id=\"carIssueDate_td\">\r\n");
              out.write("                                        ");
              if (_jspx_meth_logic_005fequal_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                        ");
              if (_jspx_meth_logic_005fequal_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    </span>\r\n");
              out.write("                                    <script type=\"text/javascript\">\r\n");
              out.write("                                          new Calendar({\r\n");
              out.write("                                              inputField: \"carIssueDate\",\r\n");
              out.write("                                              dateFormat: \"%d/%m/%Y\",\r\n");
              out.write("                                              trigger: \"popupCal-1\",\r\n");
              out.write("                                              bottomBar: false,\r\n");
              out.write("                                              onSelect: function() {\r\n");
              out.write("                                                      var date = Calendar.intToDate(this.selection.get());\r\n");
              out.write("                                                      LEFT_CAL.args.min = date;\r\n");
              out.write("                                                      LEFT_CAL.redraw();\r\n");
              out.write("                                                      this.hide();\r\n");
              out.write("                                              }\r\n");
              out.write("                                          });\r\n");
              out.write("                                    </script>\r\n");
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("                            ");
 } 
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");

                            if ("1".equals(context.getPropertyPreventCarFrameNumber()) || "1".equals(context.getPropertyPreventCarMachineNumber())) {
                            
              out.write("\r\n");
              out.write("                            <tr class=\"vehicles\"  id=\"carFrameNumber_tr\">\r\n");
              out.write("                                ");
              if (_jspx_meth_logic_005fequal_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                ");
              if (_jspx_meth_logic_005fnotEqual_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_logic_005fequal_005f7(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                                    ");
              if (_jspx_meth_logic_005fequal_005f8(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("                            ");
} 
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            <!-- land property -->\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f10(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f11(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");

                            if ("1".equals(context.getPropertyPreventLandIssuePlace()) || "1".equals(context.getPropertyPreventLandIssueDate())) {
                            
              out.write("\r\n");
              out.write("                            <tr class=\"land\" >\r\n");
              out.write("                                ");
              if (_jspx_meth_logic_005fequal_005f12(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                ");
              if (_jspx_meth_logic_005fnotEqual_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_logic_005fequal_005f13(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    ");
              if (_jspx_meth_logic_005fequal_005f14(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("                            ");
 } 
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");

                            if ("1".equals(context.getPropertyPreventLandNumber()) || "1".equals(context.getPropertyPreventLandMapNumber())) {
                            
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f16(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                            \r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f17(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                            \r\n");
              out.write("                            ");
} 
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f18 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f18.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              // /jsp/prevent/PRV003.jsp(270,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f18.setName("context");
              // /jsp/prevent/PRV003.jsp(270,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f18.setProperty("propertyPreventLandArea");
              // /jsp/prevent/PRV003.jsp(270,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f18.setValue("1");
              int _jspx_eval_logic_005fequal_005f18 = _jspx_th_logic_005fequal_005f18.doStartTag();
              if (_jspx_eval_logic_005fequal_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("                                <tr class=\"land\">\r\n");
                  out.write("                                    <th id=\"landArea_th\">Diện tích :</th>\r\n");
                  out.write("                                    <td>\r\n");
                  out.write("                                        ");
                  if (_jspx_meth_html_005ftext_005f12(_jspx_th_logic_005fequal_005f18, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("                                        ");

                                        if ("1".equals(context.getPropertyPreventLandPrivateArea()) || "1".equals(context.getPropertyPreventLandPublicArea())) {
                                        
                  out.write("\r\n");
                  out.write("                                        &nbsp;&nbsp;\r\n");
                  out.write("                                        Hình thức sử dụng\r\n");
                  out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
                  out.write("                                        ");
                  if (_jspx_meth_logic_005fequal_005f19(_jspx_th_logic_005fequal_005f18, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("                                        ");
                  if (_jspx_meth_logic_005fequal_005f20(_jspx_th_logic_005fequal_005f18, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("                                        ");
 } 
                  out.write("\r\n");
                  out.write("                                    </td>\r\n");
                  out.write("                                </tr>\r\n");
                  out.write("                            ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f18.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f18);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f18);
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f21(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f22(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f23(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f24(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                            <!-- other property -->\r\n");
              out.write("                            <tr id=\"propertyInfo_tr\" class=\"other-simple\">\r\n");
              out.write("                                <th style=\"vertical-align: top\">Thông tin tài sản</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftextarea_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("                            <tr id=\"ownerInfo_tr\" class=\"common\">\r\n");
              out.write("                                <th>Thông tin chủ sở hữu</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftext_005f19(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"otherInfo_tr\" class=\"common\">\r\n");
              out.write("                                <th>Thông tin khác</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftextarea_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("                        </table>\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td colspan=\"2\">\r\n");
              out.write("                        <table class=\"tbl-balance-layout\" style=\"margin-left:-5px\">\r\n");
              out.write("                            <tr>\r\n");
              out.write("                                <td width=\"210px\">\r\n");
              out.write("                                    <span><strong>◊ Phân loại</strong></span>\r\n");
              out.write("                                </td>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    <span id=\"originKindPrevent-span\">\r\n");
              out.write("                                        ");
              if (_jspx_meth_html_005fradio_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    </span>\r\n");
              out.write("                                    &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("                                    <span id=\"originKindReference-span\">\r\n");
              out.write("                                        ");
              if (_jspx_meth_html_005fradio_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    </span>\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("                        </table>\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td colspan=\"2\" style=\"padding-left: 15px;\">\r\n");
              out.write("                        <span class=\"tree_open\" id=\"tgData\" style=\"cursor: pointer;\"> &nbsp;<strong>Công văn ngăn chặn</strong></span>\r\n");
              out.write("\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td>\r\n");
              out.write("                        <table id=\"data_panel\" class=\"tbl-balance-layout\">\r\n");
              out.write("                            <tr id=\"preventInBookNumber_tr\">\r\n");
              out.write("                                <th>Số vào sổ công văn :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftext_005f20(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"preventPersonInfo_tr\">\r\n");
              out.write("                                <th>Người (đơn vị) gửi yêu cầu :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftext_005f21(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"preventDocNumber_tr\">\r\n");
              out.write("                                <th>Số công văn</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftext_005f22(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"preventDocDate_tr\">\r\n");
              out.write("                                <th>Ngày công văn :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftext_005f23(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005fimg_005f11(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    <script type=\"text/javascript\">\r\n");
              out.write("                                          new Calendar({\r\n");
              out.write("                                              inputField: \"preventDocDate\",\r\n");
              out.write("                                              dateFormat: \"%d/%m/%Y\",\r\n");
              out.write("                                              trigger: \"popupCal-3\",\r\n");
              out.write("                                              bottomBar: false,\r\n");
              out.write("                                              onSelect: function() {\r\n");
              out.write("                                                      var date = Calendar.intToDate(this.selection.get());\r\n");
              out.write("                                                      LEFT_CAL.args.min = date;\r\n");
              out.write("                                                      LEFT_CAL.redraw();\r\n");
              out.write("                                                      this.hide();\r\n");
              out.write("                                              }\r\n");
              out.write("                                          });\r\n");
              out.write("                                    </script>\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"preventDocReceiveDate_tr\">\r\n");
              out.write("                                <th>Ngày nhận :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftext_005f24(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005fimg_005f12(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    <script type=\"text/javascript\">\r\n");
              out.write("                                          new Calendar({\r\n");
              out.write("                                              inputField: \"preventDocReceiveDate\",\r\n");
              out.write("                                              dateFormat: \"%d/%m/%Y\",\r\n");
              out.write("                                              trigger: \"popupCal-4\",\r\n");
              out.write("                                              bottomBar: false,\r\n");
              out.write("                                              onSelect: function() {\r\n");
              out.write("                                                      var date = Calendar.intToDate(this.selection.get());\r\n");
              out.write("                                                      LEFT_CAL.args.min = date;\r\n");
              out.write("                                                      LEFT_CAL.redraw();\r\n");
              out.write("                                                      this.hide();\r\n");
              out.write("                                              }\r\n");
              out.write("                                          });\r\n");
              out.write("                                    </script>\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"preventInputDate_tr\">\r\n");
              out.write("                                <th>Ngày nhập :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftext_005f25(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005fimg_005f13(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                    <script type=\"text/javascript\">\r\n");
              out.write("                                          new Calendar({\r\n");
              out.write("                                              inputField: \"preventInputDate\",\r\n");
              out.write("                                              dateFormat: \"%d/%m/%Y\",\r\n");
              out.write("                                              trigger: \"popupCal-5\",\r\n");
              out.write("                                              bottomBar: false,\r\n");
              out.write("                                              onSelect: function() {\r\n");
              out.write("                                                      var date = Calendar.intToDate(this.selection.get());\r\n");
              out.write("                                                      LEFT_CAL.args.min = date;\r\n");
              out.write("                                                      LEFT_CAL.redraw();\r\n");
              out.write("                                                      this.hide();\r\n");
              out.write("                                              }\r\n");
              out.write("                                          });\r\n");
              out.write("                                    </script>\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"preventDocSummary_tr\">\r\n");
              out.write("                                <th>Trích yếu :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftextarea_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            <tr id=\"preventNote_tr\">\r\n");
              out.write("                                <th>Ghi chú :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ftextarea_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\r\n");
              out.write("                            ");
              if (_jspx_meth_logic_005fequal_005f25(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                            <tr id=\"formFilePrevent_tr\">\r\n");
              out.write("                                <th>File đính kèm :</th>\r\n");
              out.write("                                <td>\r\n");
              out.write("                                    ");
              if (_jspx_meth_html_005ffile_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("                        </table>\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                ");
              if (_jspx_meth_logic_005fequal_005f26(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td>\r\n");
              out.write("                        ");
              if (_jspx_meth_logic_005fequal_005f27(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("               <tr>\r\n");
              out.write("                    <td colspan=\"2\" style=\"text-align: center; padding: 10px;\">\r\n");
              out.write("                        <span id=\"update_on\">\r\n");
              out.write("                            ");
              if (_jspx_meth_html_005fimage_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                        </span>\r\n");
              out.write("                        <span id=\"update_off\" style=\"display: none;\">\r\n");
              out.write("                            <img alt=\"Lưu\" src=\"./image/btn_save.png\"/>\r\n");
              out.write("                        </span>\r\n");
              out.write("                        <span id=\"delete_on\">\r\n");
              out.write("                            ");
              if (_jspx_meth_html_005flink_005f16(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                        </span>\r\n");
              out.write("                        <span id=\"delete_off\" style=\"display: none;\">\r\n");
              out.write("                            ");
              if (_jspx_meth_html_005flink_005f17(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                        </span>\r\n");
              out.write("                        ");
              if (_jspx_meth_logic_005fnotEqual_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                        ");
              if (_jspx_meth_html_005flink_005f19(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("            </table>\r\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
          out.write("\r\n");
          out.write("    ");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("   ");
          if (_jspx_meth_logic_005fpresent_005f3(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t</table>\r\n");
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("\r\n");
          out.write("\t");
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("document.getElementById(\"propertyType\").focus();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$('#changetoSimple').hide();\r\n");
      out.write("$('#isSimpleInsert').val('true');\r\n");
      out.write("changeToDetailInsert();\r\n");
      out.write("function changeProperty() {\r\n");
      out.write("    if ($('#isSimpleInsert').val() == 'false') {\r\n");
      out.write("        $('.vehicles').hide();\r\n");
      out.write("        $('.land').hide();\r\n");
      out.write("        $('.other').hide();\r\n");
      out.write("        $('.other-simple').hide();\r\n");
      out.write("        $('.common').show();\r\n");
      out.write("        $('.unselect').hide();\r\n");
      out.write("        var value = $('#propertyType option:selected').val();\r\n");
      out.write("        if(value == 02) {\r\n");
      out.write("            $('.vehicles').show();\r\n");
      out.write("            $('#district').hide();\r\n");
      out.write("        } else if(value == 01) {\r\n");
      out.write("            $('.land').show();\r\n");
      out.write("            $('#district').show();\r\n");
      out.write("        } else if(value == 99) {\r\n");
      out.write("            $('.other-simple').show();\r\n");
      out.write("            $('#district').hide();\r\n");
      out.write("        } else {\r\n");
      out.write("            $('.unselect').show();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var LEFT_CAL = Calendar.setup({\r\n");
      out.write("    cont: \"cont\",\r\n");
      out.write("    weekNumbers: true,\r\n");
      out.write("    selectionType: Calendar.SEL_MULTIPLE,\r\n");
      out.write("    showTime: 12\r\n");
      out.write("    // titleFormat: \"%B %Y\"\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function add() {\r\n");
      out.write("    document.dataPreventEditForm.action='datapreventregistregist.do';\r\n");
      out.write("    document.dataPreventEditForm.submit();\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function release() {\r\n");
      out.write("    var id = \"");
      if (_jspx_meth_bean_005fwrite_005f10(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("    document.dataPreventEditForm.action='datapreventreleaseview.do?id=' + id;\r\n");
      out.write("    document.dataPreventEditForm.submit();\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeToDetailInsert() {\r\n");
      out.write("    $('#isSimpleInsert').val('false');\r\n");
      out.write("    $('#changetoDetail').hide();\r\n");
      out.write("    $('#changetoSimple').show();\r\n");
      out.write("    changeProperty();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeToSimpleInsert() {\r\n");
      out.write("    $('#isSimpleInsert').val('true');\r\n");
      out.write("    $('#changetoDetail').show();\r\n");
      out.write("    $('#changetoSimple').hide();\r\n");
      out.write("    $('.other-simple').show();\r\n");
      out.write("    $('.land').hide();\r\n");
      out.write("    $('.vehicles').hide();\r\n");
      out.write("    $('.common').hide();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$('#tgProperty').click(function() {\r\n");
      out.write("    $(this).toggleClass('tree_close');\r\n");
      out.write("    $(this).toggleClass('tree_open');\r\n");
      out.write("    $('#property_panel').toggle();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$('#tgData').click(function() {\r\n");
      out.write("    $(this).toggleClass('tree_close');\r\n");
      out.write("    $(this).toggleClass('tree_open');\r\n");
      out.write("    $('#data_panel').toggle();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$('#tgRelease').click(function() {\r\n");
      out.write("    $(this).toggleClass('tree_close');\r\n");
      out.write("    $(this).toggleClass('tree_open');\r\n");
      out.write("    $('#release_panel').toggle();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function toogleElement(id) {\r\n");
      out.write("    $(this).toggleClass('tree_close');\r\n");
      out.write("    $(this).toggleClass('tree_open');\r\n");
      out.write("    $('#' + id).toggle();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("toggleClassYRRY();\r\n");
      out.write("function toggleClassYRRY() {\r\n");
      out.write("  var val = $('input[name=\"originKind\"]:checked').val();\r\n");
      out.write("  if (val == '01') {\r\n");
      out.write("    toggleClassRY();\r\n");
      out.write("  } else {\r\n");
      out.write("    toggleClassYR();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toggleClassRY() {\r\n");
      out.write("  $('#originKindReference-span').removeClass('yellow-red');\r\n");
      out.write("  $('#originKindPrevent-span').addClass('red-yellow');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toggleClassYR() {\r\n");
      out.write("  $('#originKindReference-span').addClass('yellow-red');\r\n");
      out.write("  $('#originKindPrevent-span').removeClass('red-yellow');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function update() {\r\n");
      out.write("    document.dataPreventEditForm.action='datapreventeditdone.do';\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function remove() {\r\n");
      out.write("    var answer = confirm (\"Bạn có muốn xóa dữ liệu không?\");\r\n");
      out.write("    if (answer) {\r\n");
      out.write("        document.dataPreventEditForm.action='datapreventremove.do';\r\n");
      out.write("        document.dataPreventEditForm.submit();\r\n");
      out.write("        return true;\r\n");
      out.write("    } else {\r\n");
      out.write("        $('#delete_off').hide();\r\n");
      out.write("        $('#delete_on').show();\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var filePreventExistedValue = $(\"#filePreventExisted\").val();\r\n");
      out.write("if (filePreventExistedValue == 'true') {\r\n");
      out.write("    $(\"#formFilePrevent_tr\").hide();\r\n");
      out.write("} else {\r\n");
      out.write("    $(\"#formFilePrevent_tr\").show();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function remove_file_prevent() {\r\n");
      out.write("    var answer = confirm (\"Bạn có thực sự muốn gỡ bỏ không?\");\r\n");
      out.write("    if (answer) {\r\n");
      out.write("        $(\"#filePreventExisted\").val('false');\r\n");
      out.write("        $(\"#formFilePreventExist_tr\").hide();\r\n");
      out.write("        $(\"#formFilePrevent_tr\").show();\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var fileReleaseExistedValue = $(\"#fileReleaseExisted\").val();\r\n");
      out.write("if (fileReleaseExistedValue == 'true') {\r\n");
      out.write("    $(\"#formFileRelease_tr\").hide();\r\n");
      out.write("} else {\r\n");
      out.write("    $(\"#formFileRelease_tr\").show();\r\n");
      out.write("}\r\n");
      out.write("function remove_file_release() {\r\n");
      out.write("    var answer = confirm (\"Bạn có thực sự muốn gỡ bỏ không?\");\r\n");
      out.write("    if (answer) {\r\n");
      out.write("        $(\"#fileReleaseExisted\").val('false');\r\n");
      out.write("        $(\"#formFileReleaseExist_tr\").hide();\r\n");
      out.write("        $(\"#formFileRelease_tr\").show();\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("function download_prevent() {\r\n");
      out.write("    document.dataPreventEditForm.action='downloadfile.do?file=prevent';\r\n");
      out.write("    document.dataPreventEditForm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function download_release() {\r\n");
      out.write("    document.dataPreventEditForm.action='downloadfile.do?file=release';\r\n");
      out.write("    document.dataPreventEditForm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(12,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setName("context");
    // /jsp/common/header.jsp(12,11) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f0.setProperty("screenTitle");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /jsp/common/hight_light.jsp(19,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f1.setName("errField");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f0 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyle_005fsrc_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(41,12) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f0.setSrc("./image/header_banner_npo.gif");
    // /jsp/common/header.jsp(41,12) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f0.setStyle("float:left");
    int _jspx_eval_html_005fimg_005f0 = _jspx_th_html_005fimg_005f0.doStartTag();
    if (_jspx_th_html_005fimg_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyle_005fsrc_005fnobody.reuse(_jspx_th_html_005fimg_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyle_005fsrc_005fnobody.reuse(_jspx_th_html_005fimg_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f1 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(43,16) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f1.setSrc("./image/icon-user.png");
    int _jspx_eval_html_005fimg_005f1 = _jspx_th_html_005fimg_005f1.doStartTag();
    if (_jspx_th_html_005fimg_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody.reuse(_jspx_th_html_005fimg_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody.reuse(_jspx_th_html_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftitle_005fstyle_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(44,16) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setStyle("color:white;");
    // /jsp/common/header.jsp(44,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setHref("userprofile.do");
    // /jsp/common/header.jsp(44,16) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f0.setTitle("Thông tin tài khoản");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                    Chào ");
        if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_html_005flink_005f0, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_html_005flink_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftitle_005fstyle_005fhref.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftitle_005fstyle_005fhref.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f0);
    // /jsp/common/header.jsp(45,25) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setName("context");
    // /jsp/common/header.jsp(45,25) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f2.setProperty("userInfo.familyName");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f0);
    // /jsp/common/header.jsp(45,85) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setName("context");
    // /jsp/common/header.jsp(45,85) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f3.setProperty("userInfo.firstName");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(47,23) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setName("context");
    // /jsp/common/header.jsp(47,23) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f4.setProperty("userInfo.account");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f2 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(49,16) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f2.setSrc("./image/icon-logout.png");
    int _jspx_eval_html_005fimg_005f2 = _jspx_th_html_005fimg_005f2.doStartTag();
    if (_jspx_th_html_005fimg_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody.reuse(_jspx_th_html_005fimg_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005fnobody.reuse(_jspx_th_html_005fimg_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f1 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(50,16) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f1.setStyle("color:white;");
    // /jsp/common/header.jsp(50,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f1.setHref("logout.do");
    int _jspx_eval_html_005flink_005f1 = _jspx_th_html_005flink_005f1.doStartTag();
    if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f1.doInitBody();
      }
      do {
        out.write("Đăng xuất");
        int evalDoAfterBody = _jspx_th_html_005flink_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fhref.reuse(_jspx_th_html_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyle_005fhref.reuse(_jspx_th_html_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f2 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(57,16) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f2.setStyleId("home");
    // /jsp/common/header.jsp(57,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f2.setHref("home.do");
    // /jsp/common/header.jsp(57,16) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f2.setStyleClass("jla");
    int _jspx_eval_html_005flink_005f2 = _jspx_th_html_005flink_005f2.doStartTag();
    if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                    <em class=\"home-off\">&nbsp;</em>\r\n");
        out.write("                    <b>Trang chủ</b>\r\n");
        out.write("                    ");
        if (_jspx_meth_html_005fimg_005f3(_jspx_th_html_005flink_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f3 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f2);
    // /jsp/common/header.jsp(60,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f3.setAlt("|");
    // /jsp/common/header.jsp(60,20) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f3.setSrc("./image/menu_sperator.png");
    int _jspx_eval_html_005fimg_005f3 = _jspx_th_html_005fimg_005f3.doStartTag();
    if (_jspx_th_html_005fimg_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f3 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(64,18) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f3.setStyleId("preventTab");
    // /jsp/common/header.jsp(64,18) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f3.setHref("preventlistview.do");
    // /jsp/common/header.jsp(64,18) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f3.setStyleClass("jla");
    int _jspx_eval_html_005flink_005f3 = _jspx_th_html_005flink_005f3.doStartTag();
    if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                      <em style=\"width:17px;\" class=\"menu-block-contract-off\">&nbsp;</em>\r\n");
        out.write("                      <b>Tra cứu thông tin</b>\r\n");
        out.write("                      ");
        if (_jspx_meth_html_005fimg_005f4(_jspx_th_html_005flink_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f4 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f3);
    // /jsp/common/header.jsp(67,22) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f4.setAlt("|");
    // /jsp/common/header.jsp(67,22) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f4.setSrc("./image/menu_sperator.png");
    int _jspx_eval_html_005fimg_005f4 = _jspx_th_html_005fimg_005f4.doStartTag();
    if (_jspx_th_html_005fimg_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f4 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(74,16) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f4.setStyleId("announcementTab");
    // /jsp/common/header.jsp(74,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f4.setHref("announcementlistview.do");
    // /jsp/common/header.jsp(74,16) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f4.setStyleClass("jla");
    int _jspx_eval_html_005flink_005f4 = _jspx_th_html_005flink_005f4.doStartTag();
    if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                      <em style=\"width:17px;\" class=\"announcement-off\">&nbsp;</em>\r\n");
        out.write("                      <b>Thông báo</b>\r\n");
        out.write("                      ");
        if (_jspx_meth_html_005fimg_005f5(_jspx_th_html_005flink_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f5 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f4);
    // /jsp/common/header.jsp(77,22) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f5.setAlt("|");
    // /jsp/common/header.jsp(77,22) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f5.setSrc("./image/menu_sperator.png");
    int _jspx_eval_html_005fimg_005f5 = _jspx_th_html_005fimg_005f5.doStartTag();
    if (_jspx_th_html_005fimg_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f5 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(85,16) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f5.setStyleId("system");
    // /jsp/common/header.jsp(85,16) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f5.setHref("notarylistview.do");
    // /jsp/common/header.jsp(85,16) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f5.setStyleClass("jla");
    int _jspx_eval_html_005flink_005f5 = _jspx_th_html_005flink_005f5.doStartTag();
    if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                  <em class=\"system-off\">&nbsp;</em>\r\n");
        out.write("                  <b>Quản trị hệ thống</b>\r\n");
        out.write("                  ");
        if (_jspx_meth_html_005fimg_005f6(_jspx_th_html_005flink_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleId_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f6 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f5);
    // /jsp/common/header.jsp(88,18) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f6.setAlt("|");
    // /jsp/common/header.jsp(88,18) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f6.setSrc("./image/menu_sperator.png");
    int _jspx_eval_html_005fimg_005f6 = _jspx_th_html_005fimg_005f6.doStartTag();
    if (_jspx_th_html_005fimg_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f6 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(91,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f6.setHref("notarylistview.do");
    int _jspx_eval_html_005flink_005f6 = _jspx_th_html_005flink_005f6.doStartTag();
    if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f6.doInitBody();
      }
      do {
        out.write("Danh sách tổ chức công chứng");
        int evalDoAfterBody = _jspx_th_html_005flink_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f7 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(92,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f7.setHref("justiceuserlistview.do");
    int _jspx_eval_html_005flink_005f7 = _jspx_th_html_005flink_005f7.doStartTag();
    if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f7.doInitBody();
      }
      do {
        out.write("Danh sách cán bộ Sở Tư pháp");
        int evalDoAfterBody = _jspx_th_html_005flink_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f8 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(93,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f8.setHref("contractHistorylistview.do");
    int _jspx_eval_html_005flink_005f8 = _jspx_th_html_005flink_005f8.doStartTag();
    if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f8.doInitBody();
      }
      do {
        out.write("Lịch sử thay đổi hợp đồng");
        int evalDoAfterBody = _jspx_th_html_005flink_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f9 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(94,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f9.setHref("accesshistorylist.do");
    int _jspx_eval_html_005flink_005f9 = _jspx_th_html_005flink_005f9.doStartTag();
    if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f9.doInitBody();
      }
      do {
        out.write("Lịch sử truy cập hệ thống");
        int evalDoAfterBody = _jspx_th_html_005flink_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f7 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(103,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f7.setAlt("|");
    // /jsp/common/header.jsp(103,20) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f7.setSrc("./image/menu_sperator.png");
    int _jspx_eval_html_005fimg_005f7 = _jspx_th_html_005fimg_005f7.doStartTag();
    if (_jspx_th_html_005fimg_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f10 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(108,10) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f10.setStyleClass("acc_link");
    // /jsp/common/header.jsp(108,10) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f10.setHref("/uchi_help/");
    // /jsp/common/header.jsp(108,10) name = target type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f10.setTarget("_blank");
    int _jspx_eval_html_005flink_005f10 = _jspx_th_html_005flink_005f10.doStartTag();
    if (_jspx_eval_html_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f10.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <img style=\"margin-bottom: -4px;\" src=\"./image/help.png\"> Trợ giúp\r\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005ftarget_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f11 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleClass_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/header.jsp(111,10) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f11.setStyleClass("acc_link");
    // /jsp/common/header.jsp(111,10) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f11.setHref("userprofile.do");
    int _jspx_eval_html_005flink_005f11 = _jspx_th_html_005flink_005f11.doStartTag();
    if (_jspx_eval_html_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f11.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <img width=\"13px\" src=\"./image/profile.png\" style=\"margin-bottom: -2px;\"> Tài khoản\r\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fstyleClass_005fhref.reuse(_jspx_th_html_005flink_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f8 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/prevent/PRV003.jsp(36,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f8.setAlt("*");
    // /jsp/prevent/PRV003.jsp(36,20) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f8.setSrc("./image/bullet_square.gif");
    int _jspx_eval_html_005fimg_005f8 = _jspx_th_html_005fimg_005f8.doStartTag();
    if (_jspx_th_html_005fimg_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f12 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/prevent/PRV003.jsp(39,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f12.setHref("preventlistview.do");
    int _jspx_eval_html_005flink_005f12 = _jspx_th_html_005flink_005f12.doStartTag();
    if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f12.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                        Tra cứu thông tin ngăn chặn\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f13 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/prevent/PRV003.jsp(45,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f13.setHref("#");
    int _jspx_eval_html_005flink_005f13 = _jspx_th_html_005flink_005f13.doStartTag();
    if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f13.doInitBody();
      }
      do {
        out.write("Sửa đổi thông tin ngăn chặn");
        int evalDoAfterBody = _jspx_th_html_005flink_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f13);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(50,12) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setStyleId("isSimpleInsert");
    // /jsp/prevent/PRV003.jsp(50,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setProperty("isSimpleInsert");
    // /jsp/prevent/PRV003.jsp(50,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setName("dataPreventViewHelper");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(51,12) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setStyleId("filePreventExisted");
    // /jsp/prevent/PRV003.jsp(51,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setProperty("filePreventExisted");
    // /jsp/prevent/PRV003.jsp(51,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setName("dataPreventViewHelper");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(52,12) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setStyleId("fileReleaseExisted");
    // /jsp/prevent/PRV003.jsp(52,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setProperty("fileReleaseExisted");
    // /jsp/prevent/PRV003.jsp(52,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setName("dataPreventViewHelper");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/common/error_message.jsp(5,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fpresent_005f1.setName("org.apache.struts.action.ERROR");
    int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <div class=\"err_box\" id=\"err_box\">\r\n");
        out.write("        ");
        if (_jspx_meth_html_005ferrors_005f0(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </div>\r\n");
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
    if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fmessages_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fmessages_005f0);
    // /jsp/common/error_message.jsp(14,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setName("message");
    // /jsp/common/error_message.jsp(14,12) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f5.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(59,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(59,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setProperty("preventRegistAgency");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(77,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(77,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setProperty("propertyType");
    // /jsp/prevent/PRV003.jsp(77,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setStyleId("propertyType");
    // /jsp/prevent/PRV003.jsp(77,36) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setOnchange("javascript:changeProperty();");
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005foptionsCollection_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname.reuse(_jspx_th_html_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptionsCollection_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_005foptionsCollection_005f0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_005foptionsCollection_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptionsCollection_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /jsp/prevent/PRV003.jsp(79,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(79,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setProperty("lstProperty");
    // /jsp/prevent/PRV003.jsp(79,40) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setLabel("name");
    // /jsp/prevent/PRV003.jsp(79,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setValue("code");
    int _jspx_eval_html_005foptionsCollection_005f0 = _jspx_th_html_005foptionsCollection_005f0.doStartTag();
    if (_jspx_th_html_005foptionsCollection_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(85,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setName("context");
    // /jsp/prevent/PRV003.jsp(85,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setProperty("propertyPreventCarLicenseNumber");
    // /jsp/prevent/PRV003.jsp(85,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setValue("1");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"vehicles\" id=\"carLicenseNumber_tr\">\r\n");
        out.write("                                    <th>Biển kiểm soát :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /jsp/prevent/PRV003.jsp(89,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(89,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setProperty("carLicenseNumber");
    // /jsp/prevent/PRV003.jsp(89,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(89,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(94,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setName("context");
    // /jsp/prevent/PRV003.jsp(94,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setProperty("propertyPreventCarRegistNumber");
    // /jsp/prevent/PRV003.jsp(94,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setValue("1");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"vehicles\" id=\"carRegistNumber_tr\">\r\n");
        out.write("                                    <th>Số giấy đăng ký :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f1(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /jsp/prevent/PRV003.jsp(98,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(98,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setProperty("carRegistNumber");
    // /jsp/prevent/PRV003.jsp(98,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(98,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
    if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(107,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setName("context");
    // /jsp/prevent/PRV003.jsp(107,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setProperty("propertyPreventCarIssuePlace");
    // /jsp/prevent/PRV003.jsp(107,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setValue("1");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <th id=\"carIssuePlace_th\">Nơi cấp :</th>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEqual_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(110,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f0.setName("context");
    // /jsp/prevent/PRV003.jsp(110,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f0.setProperty("propertyPreventCarIssuePlace");
    // /jsp/prevent/PRV003.jsp(110,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f0.setValue("1");
    int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <th id=\"carIssueDate_tr\">Ngày cấp :</th>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(114,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setName("context");
    // /jsp/prevent/PRV003.jsp(114,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setProperty("propertyPreventCarIssuePlace");
    // /jsp/prevent/PRV003.jsp(114,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setValue("1");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span id=\"carIssuePlace_tr\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_html_005ftext_005f2(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </span>\r\n");
        out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    // /jsp/prevent/PRV003.jsp(116,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(116,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setProperty("carIssuePlace");
    // /jsp/prevent/PRV003.jsp(116,44) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setStyleClass("input-medium");
    // /jsp/prevent/PRV003.jsp(116,44) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setMaxlength("100");
    int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
    if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(121,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setName("context");
    // /jsp/prevent/PRV003.jsp(121,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setProperty("propertyPreventCarIssuePlace");
    // /jsp/prevent/PRV003.jsp(121,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setValue("1");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            Ngày cấp :\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(124,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f5.setName("context");
    // /jsp/prevent/PRV003.jsp(124,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f5.setProperty("propertyPreventCarIssueDate");
    // /jsp/prevent/PRV003.jsp(124,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f5.setValue("1");
    int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
    if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_html_005ftext_005f3(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_html_005fimg_005f9(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /jsp/prevent/PRV003.jsp(125,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(125,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setProperty("carIssueDate");
    // /jsp/prevent/PRV003.jsp(125,44) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setStyleId("carIssueDate");
    // /jsp/prevent/PRV003.jsp(125,44) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setStyle("vertical-align: middle;");
    // /jsp/prevent/PRV003.jsp(125,44) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
    if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f9 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /jsp/prevent/PRV003.jsp(127,44) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f9.setStyleId("popupCal-1");
    // /jsp/prevent/PRV003.jsp(127,44) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f9.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(127,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f9.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(127,44) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f9.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(127,44) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f9.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f9 = _jspx_th_html_005fimg_005f9.doStartTag();
    if (_jspx_th_html_005fimg_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f9);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(154,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setName("context");
    // /jsp/prevent/PRV003.jsp(154,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setProperty("propertyPreventCarFrameNumber");
    // /jsp/prevent/PRV003.jsp(154,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setValue("1");
    int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
    if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <th>Số khung :</th>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEqual_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f1 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(157,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f1.setName("context");
    // /jsp/prevent/PRV003.jsp(157,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f1.setProperty("propertyPreventCarFrameNumber");
    // /jsp/prevent/PRV003.jsp(157,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f1.setValue("1");
    int _jspx_eval_logic_005fnotEqual_005f1 = _jspx_th_logic_005fnotEqual_005f1.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <th id=\"carMachineNumber_td\">Số máy :</th>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(161,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setName("context");
    // /jsp/prevent/PRV003.jsp(161,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setProperty("propertyPreventCarFrameNumber");
    // /jsp/prevent/PRV003.jsp(161,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setValue("1");
    int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
    if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f4(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /jsp/prevent/PRV003.jsp(162,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(162,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setProperty("carFrameNumber");
    // /jsp/prevent/PRV003.jsp(162,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(162,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setMaxlength("50");
    int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
    if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(167,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setName("context");
    // /jsp/prevent/PRV003.jsp(167,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setProperty("propertyPreventCarMachineNumber");
    // /jsp/prevent/PRV003.jsp(167,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setValue("1");
    int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
    if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span id=\"carMachineNumber_tr\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_logic_005fequal_005f9(_jspx_th_logic_005fequal_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_html_005ftext_005f5(_jspx_th_logic_005fequal_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </span>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
    // /jsp/prevent/PRV003.jsp(169,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f9.setName("context");
    // /jsp/prevent/PRV003.jsp(169,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f9.setProperty("propertyPreventCarFrameNumber");
    // /jsp/prevent/PRV003.jsp(169,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f9.setValue("1");
    int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
    if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                Số máy :\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
    // /jsp/prevent/PRV003.jsp(172,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f5.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(172,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f5.setProperty("carMachineNumber");
    // /jsp/prevent/PRV003.jsp(172,44) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f5.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(172,44) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f5.setMaxlength("50");
    int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
    if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(180,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f10.setName("context");
    // /jsp/prevent/PRV003.jsp(180,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f10.setProperty("propertyPreventLandAddress");
    // /jsp/prevent/PRV003.jsp(180,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f10.setValue("1");
    int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
    if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"land\"  id=\"landAddress_td\">\r\n");
        out.write("                                    <th>Địa chỉ :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f6(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    // /jsp/prevent/PRV003.jsp(184,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f6.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(184,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f6.setProperty("landAddress");
    // /jsp/prevent/PRV003.jsp(184,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f6.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(184,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f6.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
    if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(189,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f11.setName("context");
    // /jsp/prevent/PRV003.jsp(189,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f11.setProperty("propertyPreventLandCertificate");
    // /jsp/prevent/PRV003.jsp(189,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f11.setValue("1");
    int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
    if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"land\"  id=\"landCertificate_td\">\r\n");
        out.write("                                    <th>Số giấy chứng nhận :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f7(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /jsp/prevent/PRV003.jsp(193,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f7.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(193,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f7.setProperty("landCertificate");
    // /jsp/prevent/PRV003.jsp(193,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f7.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(193,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f7.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
    if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(202,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f12.setName("context");
    // /jsp/prevent/PRV003.jsp(202,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f12.setProperty("propertyPreventLandIssuePlace");
    // /jsp/prevent/PRV003.jsp(202,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f12.setValue("1");
    int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
    if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <th id=\"landIssuePlace_th\">Nơi cấp :</th>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEqual_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f2 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(205,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f2.setName("context");
    // /jsp/prevent/PRV003.jsp(205,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f2.setProperty("propertyPreventLandIssuePlace");
    // /jsp/prevent/PRV003.jsp(205,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f2.setValue("1");
    int _jspx_eval_logic_005fnotEqual_005f2 = _jspx_th_logic_005fnotEqual_005f2.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <th id=\"landIssueDate_tr\">Ngày cấp :</th>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(209,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f13.setName("context");
    // /jsp/prevent/PRV003.jsp(209,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f13.setProperty("propertyPreventLandIssuePlace");
    // /jsp/prevent/PRV003.jsp(209,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f13.setValue("1");
    int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
    if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span id=\"landIssuePlace_td\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_html_005ftext_005f8(_jspx_th_logic_005fequal_005f13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </span>\r\n");
        out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f8 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
    // /jsp/prevent/PRV003.jsp(211,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(211,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setProperty("landIssuePlace");
    // /jsp/prevent/PRV003.jsp(211,44) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setStyleClass("input-medium");
    // /jsp/prevent/PRV003.jsp(211,44) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f8.setMaxlength("100");
    int _jspx_eval_html_005ftext_005f8 = _jspx_th_html_005ftext_005f8.doStartTag();
    if (_jspx_th_html_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(215,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f14.setName("context");
    // /jsp/prevent/PRV003.jsp(215,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f14.setProperty("propertyPreventLandIssueDate");
    // /jsp/prevent/PRV003.jsp(215,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f14.setValue("1");
    int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
    if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span id=\"landIssueDate_td\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_logic_005fequal_005f15(_jspx_th_logic_005fequal_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_html_005ftext_005f9(_jspx_th_logic_005fequal_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </span>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005fimg_005f10(_jspx_th_logic_005fequal_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <script type=\"text/javascript\">\r\n");
        out.write("                                              new Calendar({\r\n");
        out.write("                                                  inputField: \"landIssueDate\",\r\n");
        out.write("                                                  dateFormat: \"%d/%m/%Y\",\r\n");
        out.write("                                                  trigger: \"popupCal-2\",\r\n");
        out.write("                                                  bottomBar: false,\r\n");
        out.write("                                                  onSelect: function() {\r\n");
        out.write("                                                          var date = Calendar.intToDate(this.selection.get());\r\n");
        out.write("                                                          LEFT_CAL.args.min = date;\r\n");
        out.write("                                                          LEFT_CAL.redraw();\r\n");
        out.write("                                                          this.hide();\r\n");
        out.write("                                                  }\r\n");
        out.write("                                              });\r\n");
        out.write("                                        </script>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f15 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f15.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
    // /jsp/prevent/PRV003.jsp(217,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f15.setName("context");
    // /jsp/prevent/PRV003.jsp(217,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f15.setProperty("propertyPreventLandIssuePlace");
    // /jsp/prevent/PRV003.jsp(217,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f15.setValue("1");
    int _jspx_eval_logic_005fequal_005f15 = _jspx_th_logic_005fequal_005f15.doStartTag();
    if (_jspx_eval_logic_005fequal_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                Ngày cấp :\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f15);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f9 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
    // /jsp/prevent/PRV003.jsp(220,44) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f9.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(220,44) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f9.setProperty("landIssueDate");
    // /jsp/prevent/PRV003.jsp(220,44) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f9.setStyle("vertical-align: middle;");
    // /jsp/prevent/PRV003.jsp(220,44) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f9.setStyleId("landIssueDate");
    // /jsp/prevent/PRV003.jsp(220,44) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f9.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f9 = _jspx_th_html_005ftext_005f9.doStartTag();
    if (_jspx_eval_html_005ftext_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005ftext_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005ftext_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005ftext_005f9.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_html_005ftext_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005ftext_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005ftext_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength.reuse(_jspx_th_html_005ftext_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fmaxlength.reuse(_jspx_th_html_005ftext_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f10 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
    // /jsp/prevent/PRV003.jsp(224,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f10.setStyleId("popupCal-2");
    // /jsp/prevent/PRV003.jsp(224,40) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f10.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(224,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f10.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(224,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f10.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(224,40) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f10.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f10 = _jspx_th_html_005fimg_005f10.doStartTag();
    if (_jspx_th_html_005fimg_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f10);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f16 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f16.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(248,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f16.setName("context");
    // /jsp/prevent/PRV003.jsp(248,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f16.setProperty("propertyPreventLandNumber");
    // /jsp/prevent/PRV003.jsp(248,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f16.setValue("1");
    int _jspx_eval_logic_005fequal_005f16 = _jspx_th_logic_005fequal_005f16.doStartTag();
    if (_jspx_eval_logic_005fequal_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <tr class=\"land\">\r\n");
        out.write("                                <th id=\"landNumber_th\">Thửa đất số :</th>\r\n");
        out.write("                                <td>\r\n");
        out.write("                                    ");
        if (_jspx_meth_html_005ftext_005f10(_jspx_th_logic_005fequal_005f16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </td>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f10 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f16);
    // /jsp/prevent/PRV003.jsp(252,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f10.setStyleId("landNumber_td");
    // /jsp/prevent/PRV003.jsp(252,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f10.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(252,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f10.setProperty("landNumber");
    // /jsp/prevent/PRV003.jsp(252,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f10.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(252,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f10.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f10 = _jspx_th_html_005ftext_005f10.doStartTag();
    if (_jspx_th_html_005ftext_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f10);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f17 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f17.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(257,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f17.setName("context");
    // /jsp/prevent/PRV003.jsp(257,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f17.setProperty("propertyPreventLandMapNumber");
    // /jsp/prevent/PRV003.jsp(257,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f17.setValue("1");
    int _jspx_eval_logic_005fequal_005f17 = _jspx_th_logic_005fequal_005f17.doStartTag();
    if (_jspx_eval_logic_005fequal_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <tr class=\"land\">\r\n");
        out.write("                                <th id=\"landMapNumber_tr\">Tờ bản đồ số :</th>\r\n");
        out.write("                                <td>\r\n");
        out.write("                                    <span id=\"landMapNumber_td\">\r\n");
        out.write("                                       ");
        if (_jspx_meth_html_005ftext_005f11(_jspx_th_logic_005fequal_005f17, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </td>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f17);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f11 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
    // /jsp/prevent/PRV003.jsp(262,39) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f11.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(262,39) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f11.setStyleId("landMapNumber");
    // /jsp/prevent/PRV003.jsp(262,39) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f11.setProperty("landMapNumber");
    // /jsp/prevent/PRV003.jsp(262,39) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f11.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(262,39) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f11.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f11 = _jspx_th_html_005ftext_005f11.doStartTag();
    if (_jspx_th_html_005ftext_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f12 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
    // /jsp/prevent/PRV003.jsp(274,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f12.setStyleId("landArea_td");
    // /jsp/prevent/PRV003.jsp(274,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f12.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(274,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f12.setProperty("landArea");
    // /jsp/prevent/PRV003.jsp(274,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f12.setMaxlength("20");
    // /jsp/prevent/PRV003.jsp(274,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f12.setStyleClass("input-short");
    int _jspx_eval_html_005ftext_005f12 = _jspx_th_html_005ftext_005f12.doStartTag();
    if (_jspx_th_html_005ftext_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f12);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f19 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f19.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
    // /jsp/prevent/PRV003.jsp(281,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f19.setName("context");
    // /jsp/prevent/PRV003.jsp(281,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f19.setProperty("propertyPreventLandPrivateArea");
    // /jsp/prevent/PRV003.jsp(281,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f19.setValue("1");
    int _jspx_eval_logic_005fequal_005f19 = _jspx_th_logic_005fequal_005f19.doStartTag();
    if (_jspx_eval_logic_005fequal_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <span id=\"landPrivateArea_td\">\r\n");
        out.write("                                                Riêng :\r\n");
        out.write("                                                ");
        if (_jspx_meth_html_005ftext_005f13(_jspx_th_logic_005fequal_005f19, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </span>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f19);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f13 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
    // /jsp/prevent/PRV003.jsp(284,48) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f13.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(284,48) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f13.setStyleId("landPrivateArea");
    // /jsp/prevent/PRV003.jsp(284,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f13.setProperty("landPrivateArea");
    // /jsp/prevent/PRV003.jsp(284,48) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f13.setMaxlength("20");
    // /jsp/prevent/PRV003.jsp(284,48) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f13.setStyleClass("input-short");
    int _jspx_eval_html_005ftext_005f13 = _jspx_th_html_005ftext_005f13.doStartTag();
    if (_jspx_th_html_005ftext_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f13);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f20 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f20.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
    // /jsp/prevent/PRV003.jsp(287,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f20.setName("context");
    // /jsp/prevent/PRV003.jsp(287,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f20.setProperty("propertyPreventLandPublicArea");
    // /jsp/prevent/PRV003.jsp(287,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f20.setValue("1");
    int _jspx_eval_logic_005fequal_005f20 = _jspx_th_logic_005fequal_005f20.doStartTag();
    if (_jspx_eval_logic_005fequal_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <span id=\"landPublicArea_td\">\r\n");
        out.write("                                                Chung :\r\n");
        out.write("                                                ");
        if (_jspx_meth_html_005ftext_005f14(_jspx_th_logic_005fequal_005f20, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </span>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f20);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f14 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f20);
    // /jsp/prevent/PRV003.jsp(290,48) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f14.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(290,48) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f14.setStyleId("landPublicArea");
    // /jsp/prevent/PRV003.jsp(290,48) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f14.setProperty("landPublicArea");
    // /jsp/prevent/PRV003.jsp(290,48) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f14.setMaxlength("20");
    // /jsp/prevent/PRV003.jsp(290,48) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f14.setStyleClass("input-short");
    int _jspx_eval_html_005ftext_005f14 = _jspx_th_html_005ftext_005f14.doStartTag();
    if (_jspx_th_html_005ftext_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f14);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f21 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f21.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(298,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f21.setName("context");
    // /jsp/prevent/PRV003.jsp(298,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f21.setProperty("propertyPreventLandUsePurpose");
    // /jsp/prevent/PRV003.jsp(298,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f21.setValue("1");
    int _jspx_eval_logic_005fequal_005f21 = _jspx_th_logic_005fequal_005f21.doStartTag();
    if (_jspx_eval_logic_005fequal_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"land\"  id=\"landUsePurpose_td\">\r\n");
        out.write("                                    <th>Mục đích sử dụng :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f15(_jspx_th_logic_005fequal_005f21, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f21);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f15 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f21);
    // /jsp/prevent/PRV003.jsp(302,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f15.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(302,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f15.setProperty("landUsePurpose");
    // /jsp/prevent/PRV003.jsp(302,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f15.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(302,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f15.setMaxlength("100");
    int _jspx_eval_html_005ftext_005f15 = _jspx_th_html_005ftext_005f15.doStartTag();
    if (_jspx_th_html_005ftext_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f15);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f22 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f22.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(307,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f22.setName("context");
    // /jsp/prevent/PRV003.jsp(307,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f22.setProperty("propertyPreventLandUsePeriod");
    // /jsp/prevent/PRV003.jsp(307,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f22.setValue("1");
    int _jspx_eval_logic_005fequal_005f22 = _jspx_th_logic_005fequal_005f22.doStartTag();
    if (_jspx_eval_logic_005fequal_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"land\"  id=\"landUsePeriod_td\">\r\n");
        out.write("                                    <th>Thời hạn sử dụng :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f16(_jspx_th_logic_005fequal_005f22, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f22);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f16 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f22);
    // /jsp/prevent/PRV003.jsp(311,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f16.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(311,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f16.setProperty("landUsePeriod");
    // /jsp/prevent/PRV003.jsp(311,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f16.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(311,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f16.setMaxlength("100");
    int _jspx_eval_html_005ftext_005f16 = _jspx_th_html_005ftext_005f16.doStartTag();
    if (_jspx_th_html_005ftext_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f16);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f23 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f23.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(316,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f23.setName("context");
    // /jsp/prevent/PRV003.jsp(316,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f23.setProperty("propertyPreventLandUseOrigin");
    // /jsp/prevent/PRV003.jsp(316,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f23.setValue("1");
    int _jspx_eval_logic_005fequal_005f23 = _jspx_th_logic_005fequal_005f23.doStartTag();
    if (_jspx_eval_logic_005fequal_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"land\"  id=\"landUseOrigin_td\">\r\n");
        out.write("                                    <th>Nguồn gốc sử dụng :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f17(_jspx_th_logic_005fequal_005f23, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f23);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f17 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f17.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f23);
    // /jsp/prevent/PRV003.jsp(320,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f17.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(320,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f17.setProperty("landUseOrigin");
    // /jsp/prevent/PRV003.jsp(320,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f17.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(320,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f17.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f17 = _jspx_th_html_005ftext_005f17.doStartTag();
    if (_jspx_th_html_005ftext_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f17);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f24 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f24.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(325,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f24.setName("context");
    // /jsp/prevent/PRV003.jsp(325,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f24.setProperty("propertyPreventLandAssociateProperty");
    // /jsp/prevent/PRV003.jsp(325,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f24.setValue("1");
    int _jspx_eval_logic_005fequal_005f24 = _jspx_th_logic_005fequal_005f24.doStartTag();
    if (_jspx_eval_logic_005fequal_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr class=\"land\"  id=\"landAssociateProperty_td\">\r\n");
        out.write("                                    <th>Tài sản gắn liền với đất :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f18(_jspx_th_logic_005fequal_005f24, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f24);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f18 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f18.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f24);
    // /jsp/prevent/PRV003.jsp(329,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f18.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(329,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f18.setProperty("landAssociateProperty");
    // /jsp/prevent/PRV003.jsp(329,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f18.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(329,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f18.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f18 = _jspx_th_html_005ftext_005f18.doStartTag();
    if (_jspx_th_html_005ftext_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f18);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f0 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(338,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(338,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setProperty("propertyInfo");
    // /jsp/prevent/PRV003.jsp(338,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f0.setStyleClass("input-x-long");
    int _jspx_eval_html_005ftextarea_005f0 = _jspx_th_html_005ftextarea_005f0.doStartTag();
    if (_jspx_th_html_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f19 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f19.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(344,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f19.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(344,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f19.setProperty("ownerInfo");
    // /jsp/prevent/PRV003.jsp(344,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f19.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(344,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f19.setMaxlength("500");
    int _jspx_eval_html_005ftext_005f19 = _jspx_th_html_005ftext_005f19.doStartTag();
    if (_jspx_th_html_005ftext_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f19);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f1 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(351,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f1.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(351,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f1.setProperty("otherInfo");
    // /jsp/prevent/PRV003.jsp(351,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f1.setStyleClass("input-x-long");
    int _jspx_eval_html_005ftextarea_005f1 = _jspx_th_html_005ftextarea_005f1.doStartTag();
    if (_jspx_th_html_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fradio_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(366,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f0.setStyleId("originKindPrevent");
    // /jsp/prevent/PRV003.jsp(366,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f0.setProperty("originKind");
    // /jsp/prevent/PRV003.jsp(366,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f0.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(366,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f0.setValue("01");
    // /jsp/prevent/PRV003.jsp(366,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f0.setOnclick("toggleClassRY();");
    int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
    if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fradio_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            <label for=\"originKindPrevent\">Thông tin ngăn chặn</label>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname.reuse(_jspx_th_html_005fradio_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname.reuse(_jspx_th_html_005fradio_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fradio_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(373,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f1.setStyleId("originKindReference");
    // /jsp/prevent/PRV003.jsp(373,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f1.setProperty("originKind");
    // /jsp/prevent/PRV003.jsp(373,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f1.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(373,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f1.setValue("02");
    // /jsp/prevent/PRV003.jsp(373,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fradio_005f1.setOnclick("toggleClassYR();");
    int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
    if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fradio_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            <label for=\"originKindReference\">Thông tin tham khảo</label>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_html_005fradio_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname.reuse(_jspx_th_html_005fradio_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fstyleId_005fproperty_005fonclick_005fname.reuse(_jspx_th_html_005fradio_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f20 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f20.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(397,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f20.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(397,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f20.setProperty("preventInBookNumber");
    // /jsp/prevent/PRV003.jsp(397,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f20.setStyleClass("input-medium");
    // /jsp/prevent/PRV003.jsp(397,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f20.setMaxlength("40");
    int _jspx_eval_html_005ftext_005f20 = _jspx_th_html_005ftext_005f20.doStartTag();
    if (_jspx_th_html_005ftext_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f20);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f21 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f21.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(404,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f21.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(404,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f21.setProperty("preventPersonInfo");
    // /jsp/prevent/PRV003.jsp(404,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f21.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(404,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f21.setMaxlength("500");
    int _jspx_eval_html_005ftext_005f21 = _jspx_th_html_005ftext_005f21.doStartTag();
    if (_jspx_th_html_005ftext_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f21);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f22 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f22.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(411,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f22.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(411,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f22.setProperty("preventDocNumber");
    // /jsp/prevent/PRV003.jsp(411,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f22.setStyleClass("input-medium");
    // /jsp/prevent/PRV003.jsp(411,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f22.setMaxlength("40");
    int _jspx_eval_html_005ftext_005f22 = _jspx_th_html_005ftext_005f22.doStartTag();
    if (_jspx_th_html_005ftext_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f22);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f23 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f23.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(418,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f23.setStyleId("preventDocDate");
    // /jsp/prevent/PRV003.jsp(418,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f23.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(418,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f23.setProperty("preventDocDate");
    // /jsp/prevent/PRV003.jsp(418,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f23.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(418,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f23.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f23 = _jspx_th_html_005ftext_005f23.doStartTag();
    if (_jspx_th_html_005ftext_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f23);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f11 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(419,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f11.setStyleId("popupCal-3");
    // /jsp/prevent/PRV003.jsp(419,36) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f11.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(419,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f11.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(419,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f11.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(419,36) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f11.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f11 = _jspx_th_html_005fimg_005f11.doStartTag();
    if (_jspx_th_html_005fimg_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f24 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f24.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(441,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f24.setStyleId("preventDocReceiveDate");
    // /jsp/prevent/PRV003.jsp(441,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f24.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(441,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f24.setProperty("preventDocReceiveDate");
    // /jsp/prevent/PRV003.jsp(441,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f24.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(441,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f24.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f24 = _jspx_th_html_005ftext_005f24.doStartTag();
    if (_jspx_th_html_005ftext_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f24);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f12 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(442,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f12.setStyleId("popupCal-4");
    // /jsp/prevent/PRV003.jsp(442,36) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f12.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(442,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f12.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(442,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f12.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(442,36) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f12.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f12 = _jspx_th_html_005fimg_005f12.doStartTag();
    if (_jspx_th_html_005fimg_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f12);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f25 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f25.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(464,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f25.setStyleId("preventInputDate");
    // /jsp/prevent/PRV003.jsp(464,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f25.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(464,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f25.setProperty("preventInputDate");
    // /jsp/prevent/PRV003.jsp(464,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f25.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(464,36) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f25.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f25 = _jspx_th_html_005ftext_005f25.doStartTag();
    if (_jspx_th_html_005ftext_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f25);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f13 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(465,36) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setStyleId("popupCal-5");
    // /jsp/prevent/PRV003.jsp(465,36) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(465,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(465,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(465,36) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f13 = _jspx_th_html_005fimg_005f13.doStartTag();
    if (_jspx_th_html_005fimg_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f13);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f2 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(487,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f2.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(487,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f2.setProperty("preventDocSummary");
    // /jsp/prevent/PRV003.jsp(487,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f2.setStyleClass("input-x-long");
    int _jspx_eval_html_005ftextarea_005f2 = _jspx_th_html_005ftextarea_005f2.doStartTag();
    if (_jspx_th_html_005ftextarea_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f3 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(494,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f3.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(494,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f3.setProperty("preventNote");
    // /jsp/prevent/PRV003.jsp(494,36) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f3.setStyleClass("input-x-long");
    int _jspx_eval_html_005ftextarea_005f3 = _jspx_th_html_005ftextarea_005f3.doStartTag();
    if (_jspx_th_html_005ftextarea_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f25 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f25.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(498,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f25.setValue("true");
    // /jsp/prevent/PRV003.jsp(498,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f25.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(498,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f25.setProperty("filePreventExisted");
    int _jspx_eval_logic_005fequal_005f25 = _jspx_th_logic_005fequal_005f25.doStartTag();
    if (_jspx_eval_logic_005fequal_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <tr id=\"formFilePreventExist_tr\" >\r\n");
        out.write("                                <th>File đính kèm :</th>\r\n");
        out.write("                                <td>\r\n");
        out.write("                                    ");
        if (_jspx_meth_html_005flink_005f14(_jspx_th_logic_005fequal_005f25, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                    <a href=\"#nowhere\"><span style=\"text-decoration: underline;\" onclick=\"javascript:remove_file_prevent();\">Gỡ bỏ</span></a>\r\n");
        out.write("                                </td>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f25);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f14 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f25);
    // /jsp/prevent/PRV003.jsp(502,36) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f14.setHref("#nowhere");
    // /jsp/prevent/PRV003.jsp(502,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f14.setOnclick("javascript:download_prevent();");
    int _jspx_eval_html_005flink_005f14 = _jspx_th_html_005flink_005f14.doStartTag();
    if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f14.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_html_005flink_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.reuse(_jspx_th_html_005flink_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.reuse(_jspx_th_html_005flink_005f14);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f14);
    // /jsp/prevent/PRV003.jsp(503,40) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(503,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setProperty("preventFileName");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005ffile_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(513,36) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f0.setSize("60");
    // /jsp/prevent/PRV003.jsp(513,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f0.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(513,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f0.setProperty("formFilePrevent");
    int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
    if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f26 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f26.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(519,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f26.setValue("true");
    // /jsp/prevent/PRV003.jsp(519,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f26.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(519,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f26.setProperty("releaseFlg");
    int _jspx_eval_logic_005fequal_005f26 = _jspx_th_logic_005fequal_005f26.doStartTag();
    if (_jspx_eval_logic_005fequal_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("                        <td>\r\n");
        out.write("                            <strong>◊ Trạng thái giải tỏa</strong>\r\n");
        out.write("                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                            <label style=\"background-color: #FFC000; font-weight: bold; color: #FF0000; padding:5px;\">Đã giải tỏa</label>\r\n");
        out.write("                        </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("                    <tr>\r\n");
        out.write("                        <td colspan=\"2\">\r\n");
        out.write("                            <strong>◊ Cơ quan đăng ký thông tin giải tỏa: </strong>&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                            ");
        if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fequal_005f26, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f26);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f26);
    // /jsp/prevent/PRV003.jsp(530,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(530,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setProperty("releaseRegistAgency");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f27 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f27.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(536,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f27.setValue("true");
    // /jsp/prevent/PRV003.jsp(536,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f27.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(536,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f27.setProperty("releaseFlg");
    int _jspx_eval_logic_005fequal_005f27 = _jspx_th_logic_005fequal_005f27.doStartTag();
    if (_jspx_eval_logic_005fequal_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <span class=\"tree_open\" id=\"tgRelease\" style=\"cursor: pointer;\"> &nbsp;<strong>Công văn giải tỏa</strong></span>\r\n");
        out.write("                            <table id=\"release_panel\" class=\"tbl-balance-layout\">\r\n");
        out.write("                                <tr id=\"releaseInBookNumber_tr\">\r\n");
        out.write("                                    <th>Số vào sổ công văn :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f26(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                <tr id=\"releasePersonInfo_tr\">\r\n");
        out.write("                                    <th>Người (đơn vị) gửi yêu cầu :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f27(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                <tr id=\"releaseDocNumber_tr\">\r\n");
        out.write("                                    <th>Số công văn</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f28(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                <tr id=\"releaseDocDate_tr\">\r\n");
        out.write("                                    <th>Ngày công văn :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f29(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005fimg_005f14(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <script type=\"text/javascript\">\r\n");
        out.write("                                              new Calendar({\r\n");
        out.write("                                                  inputField: \"releaseDocDate\",\r\n");
        out.write("                                                  dateFormat: \"%d/%m/%Y\",\r\n");
        out.write("                                                  trigger: \"popupCal-6\",\r\n");
        out.write("                                                  bottomBar: false,\r\n");
        out.write("                                                  onSelect: function() {\r\n");
        out.write("                                                          var date = Calendar.intToDate(this.selection.get());\r\n");
        out.write("                                                          LEFT_CAL.args.min = date;\r\n");
        out.write("                                                          LEFT_CAL.redraw();\r\n");
        out.write("                                                          this.hide();\r\n");
        out.write("                                                  }\r\n");
        out.write("                                              });\r\n");
        out.write("                                        </script>\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                <tr id=\"releaseDocReceiveDate_tr\">\r\n");
        out.write("                                    <th>Ngày nhận :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f30(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005fimg_005f15(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <script type=\"text/javascript\">\r\n");
        out.write("                                              new Calendar({\r\n");
        out.write("                                                  inputField: \"releaseDocReceiveDate\",\r\n");
        out.write("                                                  dateFormat: \"%d/%m/%Y\",\r\n");
        out.write("                                                  trigger: \"popupCal-7\",\r\n");
        out.write("                                                  bottomBar: false,\r\n");
        out.write("                                                  onSelect: function() {\r\n");
        out.write("                                                          var date = Calendar.intToDate(this.selection.get());\r\n");
        out.write("                                                          LEFT_CAL.args.min = date;\r\n");
        out.write("                                                          LEFT_CAL.redraw();\r\n");
        out.write("                                                          this.hide();\r\n");
        out.write("                                                  }\r\n");
        out.write("                                              });\r\n");
        out.write("                                        </script>\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                <tr id=\"releaseInputDate_tr\">\r\n");
        out.write("                                    <th>Ngày nhập :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftext_005f31(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005fimg_005f16(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <script type=\"text/javascript\">\r\n");
        out.write("                                              new Calendar({\r\n");
        out.write("                                                  inputField: \"releaseInputDate\",\r\n");
        out.write("                                                  dateFormat: \"%d/%m/%Y\",\r\n");
        out.write("                                                  trigger: \"popupCal-8\",\r\n");
        out.write("                                                  bottomBar: false,\r\n");
        out.write("                                                  onSelect: function() {\r\n");
        out.write("                                                          var date = Calendar.intToDate(this.selection.get());\r\n");
        out.write("                                                          LEFT_CAL.args.min = date;\r\n");
        out.write("                                                          LEFT_CAL.redraw();\r\n");
        out.write("                                                          this.hide();\r\n");
        out.write("                                                  }\r\n");
        out.write("                                              });\r\n");
        out.write("                                        </script>\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                <tr id=\"releaseDocSummary_tr\">\r\n");
        out.write("                                    <th>Trích yếu :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftextarea_005f4(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                <tr id=\"releaseNote_tr\">\r\n");
        out.write("                                    <th>Ghi chú :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ftextarea_005f5(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_logic_005fequal_005f28(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                <tr id=\"formFileRelease_tr\">\r\n");
        out.write("                                    <th>File đính kèm :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005ffile_005f1(_jspx_th_logic_005fequal_005f27, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            </table>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f27);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f26 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f26.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(542,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f26.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(542,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f26.setProperty("releaseInBookNumber");
    // /jsp/prevent/PRV003.jsp(542,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f26.setStyleClass("input-medium");
    // /jsp/prevent/PRV003.jsp(542,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f26.setMaxlength("40");
    int _jspx_eval_html_005ftext_005f26 = _jspx_th_html_005ftext_005f26.doStartTag();
    if (_jspx_th_html_005ftext_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f26);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f27 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f27.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(549,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f27.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(549,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f27.setProperty("releasePersonInfo");
    // /jsp/prevent/PRV003.jsp(549,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f27.setStyleClass("input-x-long");
    // /jsp/prevent/PRV003.jsp(549,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f27.setMaxlength("500");
    int _jspx_eval_html_005ftext_005f27 = _jspx_th_html_005ftext_005f27.doStartTag();
    if (_jspx_th_html_005ftext_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f27);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f28 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f28.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(556,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f28.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(556,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f28.setProperty("releaseDocNumber");
    // /jsp/prevent/PRV003.jsp(556,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f28.setStyleClass("input-medium");
    // /jsp/prevent/PRV003.jsp(556,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f28.setMaxlength("40");
    int _jspx_eval_html_005ftext_005f28 = _jspx_th_html_005ftext_005f28.doStartTag();
    if (_jspx_th_html_005ftext_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f28);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f29 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f29.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(563,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f29.setStyleId("releaseDocDate");
    // /jsp/prevent/PRV003.jsp(563,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f29.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(563,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f29.setProperty("releaseDocDate");
    // /jsp/prevent/PRV003.jsp(563,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f29.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(563,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f29.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f29 = _jspx_th_html_005ftext_005f29.doStartTag();
    if (_jspx_th_html_005ftext_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f29);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f14 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(564,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setStyleId("popupCal-6");
    // /jsp/prevent/PRV003.jsp(564,40) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(564,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(564,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(564,40) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f14 = _jspx_th_html_005fimg_005f14.doStartTag();
    if (_jspx_th_html_005fimg_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f14);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f30 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f30.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(586,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f30.setStyleId("releaseDocReceiveDate");
    // /jsp/prevent/PRV003.jsp(586,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f30.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(586,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f30.setProperty("releaseDocReceiveDate");
    // /jsp/prevent/PRV003.jsp(586,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f30.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(586,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f30.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f30 = _jspx_th_html_005ftext_005f30.doStartTag();
    if (_jspx_th_html_005ftext_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f30);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f15 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(587,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setStyleId("popupCal-7");
    // /jsp/prevent/PRV003.jsp(587,40) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(587,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(587,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(587,40) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f15 = _jspx_th_html_005fimg_005f15.doStartTag();
    if (_jspx_th_html_005fimg_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f15);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f31 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f31.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(609,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f31.setStyleId("releaseInputDate");
    // /jsp/prevent/PRV003.jsp(609,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f31.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(609,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f31.setProperty("releaseInputDate");
    // /jsp/prevent/PRV003.jsp(609,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f31.setStyleClass("input-normal");
    // /jsp/prevent/PRV003.jsp(609,40) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f31.setMaxlength("10");
    int _jspx_eval_html_005ftext_005f31 = _jspx_th_html_005ftext_005f31.doStartTag();
    if (_jspx_th_html_005ftext_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f31);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f16 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(610,40) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f16.setStyleId("popupCal-8");
    // /jsp/prevent/PRV003.jsp(610,40) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f16.setSrc("./image/calendar.png");
    // /jsp/prevent/PRV003.jsp(610,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f16.setAlt("calendar");
    // /jsp/prevent/PRV003.jsp(610,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f16.setStyleClass("onmouseover");
    // /jsp/prevent/PRV003.jsp(610,40) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f16.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005fimg_005f16 = _jspx_th_html_005fimg_005f16.doStartTag();
    if (_jspx_th_html_005fimg_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fstyleId_005fstyleClass_005fstyle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f4 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(632,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f4.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(632,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f4.setProperty("releaseDocSummary");
    // /jsp/prevent/PRV003.jsp(632,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f4.setStyleClass("input-x-long");
    int _jspx_eval_html_005ftextarea_005f4 = _jspx_th_html_005ftextarea_005f4.doStartTag();
    if (_jspx_th_html_005ftextarea_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f5 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(639,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f5.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(639,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f5.setProperty("releaseNote");
    // /jsp/prevent/PRV003.jsp(639,40) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftextarea_005f5.setStyleClass("input-x-long");
    int _jspx_eval_html_005ftextarea_005f5 = _jspx_th_html_005ftextarea_005f5.doStartTag();
    if (_jspx_th_html_005ftextarea_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fstyleClass_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f5);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f28 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f28.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(643,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f28.setValue("true");
    // /jsp/prevent/PRV003.jsp(643,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f28.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(643,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f28.setProperty("fileReleaseExisted");
    int _jspx_eval_logic_005fequal_005f28 = _jspx_th_logic_005fequal_005f28.doStartTag();
    if (_jspx_eval_logic_005fequal_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <tr id=\"formFileReleaseExist_tr\" >\r\n");
        out.write("                                    <th>File đính kèm :</th>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_005flink_005f15(_jspx_th_logic_005fequal_005f28, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("                                        <a href=\"#nowhere\"><span style=\"text-decoration: underline;\" onclick=\"javascript:remove_file_release();\">Gỡ bỏ</span></a>\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f28);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f15 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f28);
    // /jsp/prevent/PRV003.jsp(647,40) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f15.setHref("#nowhere");
    // /jsp/prevent/PRV003.jsp(647,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f15.setOnclick("javascript:download_release();");
    int _jspx_eval_html_005flink_005f15 = _jspx_th_html_005flink_005f15.doStartTag();
    if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f15.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_html_005flink_005f15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.reuse(_jspx_th_html_005flink_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.reuse(_jspx_th_html_005flink_005f15);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f15);
    // /jsp/prevent/PRV003.jsp(648,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(648,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setProperty("releaseFileName");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005ffile_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f1 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_005ffile_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ffile_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f27);
    // /jsp/prevent/PRV003.jsp(658,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f1.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(658,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f1.setProperty("formFileRelease");
    int _jspx_eval_html_005ffile_005f1 = _jspx_th_html_005ffile_005f1.doStartTag();
    if (_jspx_th_html_005ffile_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:image
    org.apache.struts.taglib.html.ImageTag _jspx_th_html_005fimage_005f0 = (org.apache.struts.taglib.html.ImageTag) _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005fonclick_005falt_005fnobody.get(org.apache.struts.taglib.html.ImageTag.class);
    _jspx_th_html_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(668,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f0.setAlt("Lưu");
    // /jsp/prevent/PRV003.jsp(668,28) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f0.setSrc("./image/btn_save.png");
    // /jsp/prevent/PRV003.jsp(668,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f0.setOnclick("stylechange('update_off','update_on');");
    int _jspx_eval_html_005fimage_005f0 = _jspx_th_html_005fimage_005f0.doStartTag();
    if (_jspx_th_html_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005fonclick_005falt_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005fonclick_005falt_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f16 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(674,28) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f16.setHref("javascript: remove();");
    // /jsp/prevent/PRV003.jsp(674,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f16.setOnclick("stylechange('delete_off','delete_on');");
    int _jspx_eval_html_005flink_005f16 = _jspx_th_html_005flink_005f16.doStartTag();
    if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f16.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                <img alt=\"Xóa\" src=\"./image/btn_delete.png\"/>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.reuse(_jspx_th_html_005flink_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fonclick_005fhref.reuse(_jspx_th_html_005flink_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f17 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f17.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(679,28) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f17.setHref("#nowhere");
    int _jspx_eval_html_005flink_005f17 = _jspx_th_html_005flink_005f17.doStartTag();
    if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f17.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                <img alt=\"Xóa\" src=\"./image/btn_delete.png\"/>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f17);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEqual_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f3 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(683,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f3.setValue("true");
    // /jsp/prevent/PRV003.jsp(683,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f3.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(683,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEqual_005f3.setProperty("releaseFlg");
    int _jspx_eval_logic_005fnotEqual_005f3 = _jspx_th_logic_005fnotEqual_005f3.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_html_005flink_005f18(_jspx_th_logic_005fnotEqual_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f18 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f18.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f3);
    // /jsp/prevent/PRV003.jsp(684,28) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f18.setHref("javascript: release();");
    int _jspx_eval_html_005flink_005f18 = _jspx_th_html_005flink_005f18.doStartTag();
    if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f18.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                <img alt=\"Giải tỏa\" src=\"./image/btn_release.png\" />\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f18);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f19 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f19.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV003.jsp(688,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f19.setHref("preventlistback.do");
    int _jspx_eval_html_005flink_005f19 = _jspx_th_html_005flink_005f19.doStartTag();
    if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f19.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                            <img alt=\"Hủy bỏ\" src=\"./image/btn_cancel.png\"/>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f19);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f3 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /jsp/common/footer.jsp(5,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fpresent_005f3.setName("CommonContext");
    int _jspx_eval_logic_005fpresent_005f3 = _jspx_th_logic_005fpresent_005f3.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   ");
        if (_jspx_meth_logic_005fequal_005f29(_jspx_th_logic_005fpresent_005f3, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f29 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f29.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f3);
    // /jsp/common/footer.jsp(6,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f29.setValue("false");
    // /jsp/common/footer.jsp(6,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f29.setName("CommonContext");
    // /jsp/common/footer.jsp(6,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f29.setProperty("loginFromClient");
    int _jspx_eval_logic_005fequal_005f29 = _jspx_th_logic_005fequal_005f29.doStartTag();
    if (_jspx_eval_logic_005fequal_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\t</div>\r\n");
        out.write("\t</td>\r\n");
        out.write("    </tr>\r\n");
        out.write("    \r\n");
        out.write("    <tr height=\"30px\">\r\n");
        out.write("    <td>   \r\n");
        out.write("\t<div id=\"footer\">\r\n");
        out.write("\t    <div class=\"clearfix-left\">\r\n");
        out.write("\t        Sở Tư Pháp Hà Nội -\r\n");
        out.write("\t        <span style=\"font-weight: normal;\"><b>Địa chỉ:</b> Số 1B Trần Phú - Quận Hà Đông - Thành Phố Hà Nội;\r\n");
        out.write("\t        <b>Điện thoại:</b> 04-3312 0872; <b>Email:</b> botrotuphaphanoi@gmail.com  </span>\r\n");
        out.write("\t    </div>\r\n");
        out.write("\t</div>\r\n");
        out.write("\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f29);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent(null);
    // /jsp/prevent/PRV003.jsp(743,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setName("dataPreventViewHelper");
    // /jsp/prevent/PRV003.jsp(743,14) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }
}
