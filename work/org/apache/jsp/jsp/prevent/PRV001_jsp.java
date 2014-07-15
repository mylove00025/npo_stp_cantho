package org.apache.jsp.jsp.prevent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PRV001_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fonsubmit_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fstyle_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fstyle_005fsrc_005fonclick_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody;

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
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fonsubmit_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fstyle_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fstyle_005fsrc_005fonclick_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fmessages_0026_005fmessage_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fonsubmit_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fstyle_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fstyle_005fsrc_005fonclick_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fstyleId_005fproperty_005fonchange_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
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
          out.write("<div id=\"navigator\" style=\"padding:0px; margin-top: 2px;\">\r\n");
          out.write("<ul class=\"clearfix\">\r\n");
          out.write("\t<li>");
          if (_jspx_meth_html_005fimg_005f8(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</li>\r\n");
          out.write("\t<li>");
          if (_jspx_meth_html_005flink_005f12(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t<a class=\"acc_link\" style=\"float:none! important; font-size: 9.75px;\" target=\"_blank\" href=\"help.do\">\r\n");
          out.write("\t   <img src=\"./image/help.png\" style=\"padding: 0px; margin-bottom: -3px;\"/> Hướng dẫn tra cứu</a>\r\n");
          out.write("\t</li>\r\n");
          out.write("</ul>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          if (_jspx_meth_logic_005fpresent_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f2 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_005fpresent_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fpresent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
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
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fonsubmit_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /jsp/prevent/PRV001.jsp(22,0) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setStyleId("form");
          // /jsp/prevent/PRV001.jsp(22,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setAction("preventlistsearch");
          // /jsp/prevent/PRV001.jsp(22,0) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setOnsubmit("javascript: search();");
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              if (_jspx_meth_html_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              out.write('	');
              if (_jspx_meth_html_005fhidden_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              out.write('	');
              if (_jspx_meth_html_005fhidden_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              out.write('	');
              if (_jspx_meth_html_005fhidden_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t<div id=\"mystickytooltip\" class=\"stickytooltip\">\r\n");
              out.write("\t<div class=\"tooltipClassic\">\r\n");
              out.write("\t<div class=\"toolbar\">\r\n");
              out.write("\t<div class=\"title\"><a id=\"closeTooltip\" class=\"close\"></a> Thông\r\n");
              out.write("\ttin chi tiết</div>\r\n");
              out.write("\t</div>\r\n");
              out.write("\t<div id=\"tooltipContent\" class=\"content\"\r\n");
              out.write("\t\tstyle=\"overflow: auto; max-height: 400px;\"></div>\r\n");
              out.write("\t</div>\r\n");
              out.write("\t</div>\r\n");
              out.write("\r\n");
              out.write("\t<div id=\"searchShow\" class=\"sub-title\"><strong>◊ Điều\r\n");
              out.write("\tkiện tìm kiếm</strong> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a \r\n");
              out.write("\t\tclass=\"advanceSearch\" style=\"color: blue; font-weight: normal;\"\r\n");
              out.write("\t\tonclick=\"changeSearch('false')\"> [Tìm kiếm theo từ khóa] </a> <a\r\n");
              out.write("\t\t class=\"keySearch\"\r\n");
              out.write("\t\tstyle=\"color: blue; font-weight: normal;\"\r\n");
              out.write("\t\tonclick=\"changeSearch('true')\"> [Tìm kiếm nâng cao] </a>\r\n");
              out.write("\t\r\n");
              out.write("\t");
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("    </div>\r\n");
              out.write("\r\n");
              out.write("\t<div id=\"keySearchPanel\" class=\"keySearch\" style=\"padding-left: 25px;\">\r\n");
              out.write("\t<span style=\"vertical-align: middle;\">Từ khóa</span> &nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t");
              if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" &nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\r\n");
              out.write("\t<span id=\"add_on\">\r\n");
              out.write("\t   ");
              if (_jspx_meth_html_005fimage_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t</span>\r\n");
              out.write("\t<span id=\"add_off\" style=\"display: none;\">\r\n");
              out.write("        <img alt=\"Tìm kiếm\" src=\"./image/btn_search.png\" style=\"vertical-align: middle;\" />\r\n");
              out.write("    </span>\r\n");
              out.write("\t</div>\r\n");
              out.write("\r\n");
              out.write("\t<table id=\"tblSearch\" class=\"advanceSearch tbl-search\">\r\n");
              out.write("\t\t<tr >\r\n");
              out.write("\t\t\t<td style=\"padding-left: 25px; line-height: 1.5;\">Loại tài sản \r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n");
              out.write("\t\t\t\r\n");
              out.write("\t\t\t<td colspan=\"3\" style=\" padding-left: 25px; line-height: 1.5;\">Thông tin tài sản\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\t\tBên liên quan / Chủ sở hữu\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t</td>\r\n");
              out.write("\t\t\t\r\n");
              out.write("\t\t\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("\t\t<tr>\r\n");
              out.write("\t\t<td colspan=\"4\" style=\"text-align: center\">\r\n");
              out.write("\t\t  <div style=\"padding-top: 10px;\">\r\n");
              out.write("\t\t      ");
              if (_jspx_meth_html_005fimage_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t      ");
              if (_jspx_meth_html_005flink_005f13(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t       </div>\r\n");
              out.write("\t\t</td>\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("\t</table>\r\n");
              out.write("\t \r\n");
              out.write("\t\r\n");
              out.write("    \r\n");
              out.write("    \r\n");
              out.write("\t<br />\r\n");
              out.write("\t<div id=\"menutabs\" style=\"float: left;\">\r\n");
              out.write("\t<ul>\r\n");
              out.write("\t\t<li><a id=\"datapreventTab\"\r\n");
              out.write("\t\t\tonclick=\"displayDataPreventList(this);\"> <span> Thông tin\r\n");
              out.write("\t\tngăn chặn (<label>");
              if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("</label>) </span> </a></li>\r\n");
              out.write("\t\t<li><a id=\"propertycontractTab\"\r\n");
              out.write("\t\t\tonclick=\"displayPropertyList(this);\" style=\"padding: 0px 20px;\">\r\n");
              out.write("\t\t<span> Hợp đồng, giao dịch đã công chứng, chứng thực (<label>");
              if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("</label>) </span> </a></li>\r\n");
              out.write("\t\t<li><span id=\"preventResult\"> <!--\r\n");
              out.write("                    ");
              if (_jspx_meth_logic_005fgreaterThan_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                    --> </span> <span id=\"historyResult\"> <!--\r\n");
              out.write("                    ");
              if (_jspx_meth_logic_005fgreaterThan_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("    \r\n");
              out.write("                    --> </span></li>\r\n");
              out.write("\t</ul>\r\n");
              out.write("\r\n");
              out.write("\t</div>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t<!-- prevent list-->\r\n");
              out.write("\r\n");
              out.write("\t<div id=\"preventListTitle\">\r\n");
              out.write("\t");

            if (context.isPreventData()) {
            
              out.write("\r\n");
              out.write("\t<div style=\"float: right\">\r\n");
              out.write("\t     ");
              if (_jspx_meth_html_005flink_005f14(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t ");
              if (_jspx_meth_html_005flink_005f15(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t</div>\r\n");
              out.write("\t");
}
              out.write("\r\n");
              out.write("\t</div>\r\n");
              out.write("\t\r\n");
              out.write("\t\r\n");
              out.write("\t<div id=\"preventListPrint\">\r\n");
              out.write("\t<div style=\"float: right\">\r\n");
              out.write("\t\t<div class=\"keyPrint\">\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_html_005flink_005f16(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t</div>\r\n");
              out.write("\t</div>\r\n");
              out.write("\t</div>\r\n");
              out.write("\t\r\n");
              out.write("\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              // /jsp/prevent/PRV001.jsp(161,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f0.setName("preventListViewHelper");
              // /jsp/prevent/PRV001.jsp(161,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f0.setProperty("dataPreventList");
              int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t<table id=\"preventList\" class=\"tbl-list\">\r\n");
                  out.write("\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t<th nowrap=\"nowrap\">Phân loại</th>\r\n");
                  out.write("\t\t\t\t<th>Loại tài sản</th>\r\n");
                  out.write("\t\t\t\t<th>Thông tin tài sản</th>\r\n");
                  out.write("\t\t\t\t<th>Đơn vị gửi yêu cầu ngăn chặn</th>\r\n");
                  out.write("\t\t\t\t<th>Ngày nhận công văn</th>\r\n");
                  out.write("\t\t\t\t<th nowrap=\"nowrap\">Giải tỏa</th>\r\n");
                  out.write("\t\t\t\t<th></th>\r\n");
                  out.write("\t\t\t</tr>\r\n");
                  out.write("\t\t\t<tbody id=\"preventListContent\">\r\n");
                  out.write("\t\t\t\t");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
                  // /jsp/prevent/PRV001.jsp(173,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f1.setId("item");
                  // /jsp/prevent/PRV001.jsp(173,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f1.setName("preventListViewHelper");
                  // /jsp/prevent/PRV001.jsp(173,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f1.setProperty("dataPreventList");
                  // /jsp/prevent/PRV001.jsp(173,4) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f1.setIndexId("i");
                  // /jsp/prevent/PRV001.jsp(173,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f1.setType("com.osp.npo.core.prevent.DataPreventInfo");
                  int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    com.osp.npo.core.prevent.DataPreventInfo item = null;
                    java.lang.Integer i = null;
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f1.doInitBody();
                    }
                    item = (com.osp.npo.core.prevent.DataPreventInfo) _jspx_page_context.findAttribute("item");
                    i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
                    do {
                      out.write("\r\n");
                      out.write("\t\t\t\t\t<tr class=\"tbl-row");
                      out.print(i % 2);
                      out.write("\">\r\n");
                      out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
                      if (_jspx_meth_logic_005fequal_005f0(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write(' ');
                      if (_jspx_meth_logic_005fequal_005f1(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td nowrap=\"nowrap\">");
                      if (_jspx_meth_logic_005fequal_005f2(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write(' ');
                      if (_jspx_meth_logic_005fequal_005f3(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write(' ');
                      if (_jspx_meth_logic_005fequal_005f4(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t</td>\r\n");
                      out.write("\t\t\t\t\t\t<td>\r\n");
                      out.write("\t\t\t\t\t\t\r\n");
                      out.write("\t\t\t\t\t\t");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /jsp/prevent/PRV001.jsp(191,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f5.setValue("false");
                      // /jsp/prevent/PRV001.jsp(191,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f5.setProperty("luceneSearch");
                      // /jsp/prevent/PRV001.jsp(191,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f5.setName("preventListViewHelper");
                      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                          // /jsp/prevent/PRV001.jsp(193,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f2.setId("infoDisp");
                          // /jsp/prevent/PRV001.jsp(193,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f2.setName("item");
                          // /jsp/prevent/PRV001.jsp(193,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f2.setProperty("infoDisp");
                          // /jsp/prevent/PRV001.jsp(193,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f2.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
                          java.lang.String infoDisp = null;
                          infoDisp = (java.lang.String) _jspx_page_context.findAttribute("infoDisp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                          // /jsp/prevent/PRV001.jsp(195,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f3.setId("info");
                          // /jsp/prevent/PRV001.jsp(195,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f3.setName("item");
                          // /jsp/prevent/PRV001.jsp(195,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f3.setProperty("info");
                          // /jsp/prevent/PRV001.jsp(195,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f3.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
                          java.lang.String info = null;
                          info = (java.lang.String) _jspx_page_context.findAttribute("info");
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!infoDisp.equals(info)) {
                                
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t<span data-tooltip=\"preventsticky");
                          out.print(i);
                          out.write("\" class=\"datatooltip\">\r\n");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
}  
                          out.write(' ');
                          if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!infoDisp.equals(info)) {
                                
                          out.write(" <img class=\"onmouseover\"\r\n");
                          out.write("\t\t\t\t\t\t\t\tsrc=\"./image/icon_search.png\"></img> ");
}  
                          out.write(" </span>\r\n");
                          out.write("\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                      // /jsp/prevent/PRV001.jsp(209,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f6.setValue("true");
                      // /jsp/prevent/PRV001.jsp(209,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f6.setProperty("luceneSearch");
                      // /jsp/prevent/PRV001.jsp(209,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f6.setName("preventListViewHelper");
                      int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                          // /jsp/prevent/PRV001.jsp(211,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f4.setId("infoDisp");
                          // /jsp/prevent/PRV001.jsp(211,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f4.setName("item");
                          // /jsp/prevent/PRV001.jsp(211,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f4.setProperty("lucenePropertyInfoDisp");
                          // /jsp/prevent/PRV001.jsp(211,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f4.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
                          java.lang.String infoDisp = null;
                          infoDisp = (java.lang.String) _jspx_page_context.findAttribute("infoDisp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                          // /jsp/prevent/PRV001.jsp(213,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f5.setId("info");
                          // /jsp/prevent/PRV001.jsp(213,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f5.setName("item");
                          // /jsp/prevent/PRV001.jsp(213,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f5.setProperty("lucenePropertyInfo");
                          // /jsp/prevent/PRV001.jsp(213,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f5.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
                          java.lang.String info = null;
                          info = (java.lang.String) _jspx_page_context.findAttribute("info");
                          out.write("\r\n");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!infoDisp.equals(info)) {
                                
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t<span data-tooltip=\"preventsticky");
                          out.print(i);
                          out.write("\" class=\"datatooltip\">\r\n");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
}  
                          out.write(' ');
                          if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fequal_005f6, _jspx_page_context))
                            return;
                          out.write(' ');

                                if (!infoDisp.equals(info)) {
                                
                          out.write(" <img class=\"onmouseover\"\r\n");
                          out.write("\t\t\t\t\t\t\t\tsrc=\"./image/icon_search.png\"></img> ");
}  
                          out.write(" </span>\r\n");
                          out.write("\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td>");
                      if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
                      if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
                      if (_jspx_meth_logic_005fequal_005f7(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">\r\n");
                      out.write("\t\t\t\t\t\t<!-- HungPT 21/05: Van phong nao tao du lieu ngan chan thi moi duoc quyen xem chi tiet va xoa -->\r\n");
                      out.write("\t\t\t\t\t\t\t");
 if (context.isAdmin()
								|| item.getEntryUserId().equals(context.getUserInfo().getId())) { 
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t\t\t");
                      if (_jspx_meth_html_005flink_005f17(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("                            ");
 } else { 
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t\t\t");
                      if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t\t");
 } 
                      out.write("\r\n");
                      out.write("                        </td>\r\n");
                      out.write("\t\t\t\t\t</tr>\r\n");
                      out.write("\t\t\t\t");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                      item = (com.osp.npo.core.prevent.DataPreventInfo) _jspx_page_context.findAttribute("item");
                      i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_0026_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                  out.write("\r\n");
                  out.write("\t\t\t</tbody>\r\n");
                  out.write("\t\t</table>\r\n");
                  out.write("\r\n");
                  out.write("\t\t");
                  if (_jspx_meth_logic_005fgreaterThan_005f2(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t<div id=\"preventAdd\">\r\n");
                  out.write("\t\t");

            if (context.isPreventData()) {
            
                  out.write("\r\n");
                  out.write("\t\t<div class=\"clearfix-right\">");
                  if (_jspx_meth_html_005flink_005f22(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t</div>\r\n");
                  out.write("\t\t");
}
                  out.write("\r\n");
                  out.write("\t\t</div>\r\n");
                  out.write("\t");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t<!-- property list-->\r\n");
              out.write("\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f1 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_005fnotEmpty_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEmpty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              // /jsp/prevent/PRV001.jsp(293,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f1.setName("preventListViewHelper");
              // /jsp/prevent/PRV001.jsp(293,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f1.setProperty("transactionPropertyList");
              int _jspx_eval_logic_005fnotEmpty_005f1 = _jspx_th_logic_005fnotEmpty_005f1.doStartTag();
              if (_jspx_eval_logic_005fnotEmpty_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t<table id=\"propertyList\" class=\"tbl-list\">\r\n");
                  out.write("\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t<th>Ngày CC,CT</th>\r\n");
                  out.write("\t\t\t\t<th>Ngày đưa lên</th>\r\n");
                  out.write("\t\t\t\t<th>Số hợp đồng</th>\r\n");
                  out.write("\t\t\t\t<th>Tên hợp đồng</th>\r\n");
                  out.write("\t\t\t\t<th>Bên liên quan</th>\r\n");
                  out.write("\t\t\t\t<th>Nội dung</th>\r\n");
                  out.write("\t\t\t\t<th>Người CC,CT</th>\r\n");
                  out.write("\t\t\t\t<th>Tổ chức CC,CT</th>\r\n");
                  out.write("\t\t\t</tr>\r\n");
                  out.write("\r\n");
                  out.write("\t\t\t<tbody id=\"propertyListContent\">\r\n");
                  out.write("\t\t\t\t");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f1);
                  // /jsp/prevent/PRV001.jsp(308,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f2.setId("item");
                  // /jsp/prevent/PRV001.jsp(308,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f2.setName("preventListViewHelper");
                  // /jsp/prevent/PRV001.jsp(308,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f2.setProperty("transactionPropertyList");
                  // /jsp/prevent/PRV001.jsp(308,4) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fiterate_005f2.setIndexId("i");
                  int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
                  if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object item = null;
                    java.lang.Integer i = null;
                    if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_logic_005fiterate_005f2.doInitBody();
                    }
                    item = (java.lang.Object) _jspx_page_context.findAttribute("item");
                    i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
                    do {
                      out.write("\r\n");
                      out.write("\t\t\t\t\t<tr id=\"highlight\" class=\"tbl-row");
                      out.print(i % 2);
                      out.write("\">\r\n");
                      out.write("\t\t\t\t\t\t<td nowrap=\"nowrap\" style=\"text-align: center;\">");
                      if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td nowrap=\"nowrap\" style=\"text-align: center;\">\r\n");
                      out.write("\t\t\t\t\t\t\t");
                      if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t</td>\r\n");
                      out.write("\t\t\t\t\t\t<td>");
                      if (_jspx_meth_bean_005fwrite_005f19(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td>");
                      if (_jspx_meth_bean_005fwrite_005f20(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td> \r\n");
                      out.write("\t\t\t\t\t\t");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                      // /jsp/prevent/PRV001.jsp(319,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f8.setValue("false");
                      // /jsp/prevent/PRV001.jsp(319,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f8.setProperty("luceneSearch");
                      // /jsp/prevent/PRV001.jsp(319,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f8.setName("preventListViewHelper");
                      int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                          // /jsp/prevent/PRV001.jsp(321,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f6.setId("summaryDisp");
                          // /jsp/prevent/PRV001.jsp(321,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f6.setName("item");
                          // /jsp/prevent/PRV001.jsp(321,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f6.setProperty("relationObjectSummaryDisp");
                          // /jsp/prevent/PRV001.jsp(321,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f6.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
                          java.lang.String summaryDisp = null;
                          summaryDisp = (java.lang.String) _jspx_page_context.findAttribute("summaryDisp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f7 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f7.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                          // /jsp/prevent/PRV001.jsp(323,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f7.setId("disp");
                          // /jsp/prevent/PRV001.jsp(323,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f7.setName("item");
                          // /jsp/prevent/PRV001.jsp(323,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f7.setProperty("relationObjectDisp");
                          // /jsp/prevent/PRV001.jsp(323,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f7.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f7 = _jspx_th_bean_005fdefine_005f7.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f7);
                          java.lang.String disp = null;
                          disp = (java.lang.String) _jspx_page_context.findAttribute("disp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                                <span data-tooltip=\"relationObject");
                          out.print(i);
                          out.write("\"\r\n");
                          out.write("\t\t\t\t\t\t\tclass=\"datatooltip\">\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          if (_jspx_meth_bean_005fwrite_005f21(_jspx_th_logic_005fequal_005f8, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                             \r\n");
                          out.write("\t\t\t\t\t\t\t<img class=\"onmouseover\" src=\"./image/icon_search.png\"></img>\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t</span>\r\n");
                          out.write("\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                      // /jsp/prevent/PRV001.jsp(345,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f9.setValue("true");
                      // /jsp/prevent/PRV001.jsp(345,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f9.setProperty("luceneSearch");
                      // /jsp/prevent/PRV001.jsp(345,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f9.setName("preventListViewHelper");
                      int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f8 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                          // /jsp/prevent/PRV001.jsp(346,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f8.setId("summaryDisp");
                          // /jsp/prevent/PRV001.jsp(346,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f8.setName("item");
                          // /jsp/prevent/PRV001.jsp(346,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f8.setProperty("luceneRelationObjectDisp");
                          // /jsp/prevent/PRV001.jsp(346,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f8.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f8 = _jspx_th_bean_005fdefine_005f8.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f8);
                          java.lang.String summaryDisp = null;
                          summaryDisp = (java.lang.String) _jspx_page_context.findAttribute("summaryDisp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f9 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                          // /jsp/prevent/PRV001.jsp(348,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f9.setId("disp");
                          // /jsp/prevent/PRV001.jsp(348,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f9.setName("item");
                          // /jsp/prevent/PRV001.jsp(348,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f9.setProperty("luceneRelationObject");
                          // /jsp/prevent/PRV001.jsp(348,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f9.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f9 = _jspx_th_bean_005fdefine_005f9.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f9);
                          java.lang.String disp = null;
                          disp = (java.lang.String) _jspx_page_context.findAttribute("disp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                                <span data-tooltip=\"relationObject");
                          out.print(i);
                          out.write("\"\r\n");
                          out.write("\t\t\t\t\t\t\tclass=\"datatooltip\">\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          if (_jspx_meth_bean_005fwrite_005f22(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                             \r\n");
                          out.write("\t\t\t\t\t\t\t<img class=\"onmouseover\" src=\"./image/icon_search.png\"></img>\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t</span>\r\n");
                          out.write("\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t</td>\r\n");
                      out.write("\t\t\t\t\t\t<td> \r\n");
                      out.write("\t\t\t\t\t\t");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                      // /jsp/prevent/PRV001.jsp(372,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f10.setValue("false");
                      // /jsp/prevent/PRV001.jsp(372,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f10.setProperty("luceneSearch");
                      // /jsp/prevent/PRV001.jsp(372,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f10.setName("preventListViewHelper");
                      int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f10 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f10.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                          // /jsp/prevent/PRV001.jsp(374,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f10.setId("summaryDisp");
                          // /jsp/prevent/PRV001.jsp(374,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f10.setName("item");
                          // /jsp/prevent/PRV001.jsp(374,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f10.setProperty("transactionContentSummaryDisp");
                          // /jsp/prevent/PRV001.jsp(374,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f10.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f10 = _jspx_th_bean_005fdefine_005f10.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f10);
                          java.lang.String summaryDisp = null;
                          summaryDisp = (java.lang.String) _jspx_page_context.findAttribute("summaryDisp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f11 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f11.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                          // /jsp/prevent/PRV001.jsp(376,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f11.setId("disp");
                          // /jsp/prevent/PRV001.jsp(376,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f11.setName("item");
                          // /jsp/prevent/PRV001.jsp(376,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f11.setProperty("transactionContentDisp");
                          // /jsp/prevent/PRV001.jsp(376,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f11.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f11 = _jspx_th_bean_005fdefine_005f11.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f11);
                          java.lang.String disp = null;
                          disp = (java.lang.String) _jspx_page_context.findAttribute("disp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                                <span data-tooltip=\"contractsticky");
                          out.print(i);
                          out.write("\"\r\n");
                          out.write("\t\t\t\t\t\t\tclass=\"datatooltip\">\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          if (_jspx_meth_bean_005fwrite_005f23(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                             \r\n");
                          out.write("\t\t\t\t\t\t\t<img class=\"onmouseover\" src=\"./image/icon_search.png\"></img>\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t</span>\r\n");
                          out.write("\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                      // /jsp/prevent/PRV001.jsp(401,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f11.setValue("true");
                      // /jsp/prevent/PRV001.jsp(401,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f11.setProperty("luceneSearch");
                      // /jsp/prevent/PRV001.jsp(401,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_logic_005fequal_005f11.setName("preventListViewHelper");
                      int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f12 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f12.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                          // /jsp/prevent/PRV001.jsp(403,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f12.setId("summaryDisp");
                          // /jsp/prevent/PRV001.jsp(403,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f12.setName("item");
                          // /jsp/prevent/PRV001.jsp(403,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f12.setProperty("luceneTransactionContentDisp");
                          // /jsp/prevent/PRV001.jsp(403,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f12.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f12 = _jspx_th_bean_005fdefine_005f12.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f12);
                          java.lang.String summaryDisp = null;
                          summaryDisp = (java.lang.String) _jspx_page_context.findAttribute("summaryDisp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f13 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f13.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                          // /jsp/prevent/PRV001.jsp(405,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f13.setId("disp");
                          // /jsp/prevent/PRV001.jsp(405,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f13.setName("item");
                          // /jsp/prevent/PRV001.jsp(405,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f13.setProperty("luceneTransactionContent");
                          // /jsp/prevent/PRV001.jsp(405,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_bean_005fdefine_005f13.setType("java.lang.String");
                          int _jspx_eval_bean_005fdefine_005f13 = _jspx_th_bean_005fdefine_005f13.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f13);
                          java.lang.String disp = null;
                          disp = (java.lang.String) _jspx_page_context.findAttribute("disp");
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                                <span data-tooltip=\"contractsticky");
                          out.print(i);
                          out.write("\"\r\n");
                          out.write("\t\t\t\t\t\t\tclass=\"datatooltip\">\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t");
                          if (_jspx_meth_bean_005fwrite_005f24(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
                            return;
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t");

                                if (!summaryDisp.equals(disp)) {
                                
                          out.write("\r\n");
                          out.write("                             \r\n");
                          out.write("\t\t\t\t\t\t\t<img class=\"onmouseover\" src=\"./image/icon_search.png\"></img><br/>\r\n");
                          out.write("\t\t\t\t\t\t\t");
} 
                          out.write("\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t</span>\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t<br/>\r\n");
                      out.write("\t\t\t\t\t\t");
                      if (_jspx_meth_logic_005fnotEmpty_005f2(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write("\t\t\r\n");
                      out.write("\t\t\t\t\t\t");
                      if (_jspx_meth_logic_005fnotEmpty_005f3(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t");
                      if (_jspx_meth_logic_005fempty_005f0(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t\t\r\n");
                      out.write("\t\t\t\t\t\t\t");
                      //  bean:define
                      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f14 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                      _jspx_th_bean_005fdefine_005f14.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fdefine_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                      // /jsp/prevent/PRV001.jsp(446,7) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_bean_005fdefine_005f14.setId("officeName");
                      // /jsp/prevent/PRV001.jsp(446,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_bean_005fdefine_005f14.setName("item");
                      // /jsp/prevent/PRV001.jsp(446,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_bean_005fdefine_005f14.setProperty("notaryOfficeName");
                      // /jsp/prevent/PRV001.jsp(446,7) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_bean_005fdefine_005f14.setType("java.lang.String");
                      int _jspx_eval_bean_005fdefine_005f14 = _jspx_th_bean_005fdefine_005f14.doStartTag();
                      if (_jspx_th_bean_005fdefine_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fdefine_0026_005ftype_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f14);
                      java.lang.String officeName = null;
                      officeName = (java.lang.String) _jspx_page_context.findAttribute("officeName");
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t\t");
if ("Phòng công chứng số 1".equalsIgnoreCase(officeName)) {
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t\t   ");
                      if (_jspx_meth_logic_005fequal_005f13(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t\t");
 } else { 
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t\t<b style=\"color: #C00000\"> \r\n");
                      out.write("\t\t\t\t\t\t\t");
                      if (_jspx_meth_logic_005fequal_005f14(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t\t");
                      if (_jspx_meth_bean_005fwrite_005f30(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write(" \r\n");
                      out.write("\t\t\t\t\t\t\t</b>\r\n");
                      out.write("\t\t\t\t\t\t    ");
 } 
                      out.write("\r\n");
                      out.write("\t\t\t\t\t\t</td>\r\n");
                      out.write("\t\t\t\t\t\t<td>");
                      if (_jspx_meth_bean_005fwrite_005f31(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
                      if (_jspx_meth_logic_005fempty_005f1(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write(' ');
                      if (_jspx_meth_logic_005fnotEmpty_005f4(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                        return;
                      out.write("</td>\r\n");
                      out.write("\t\t\t\t\t</tr>\r\n");
                      out.write("\t\t\t\t");
                      int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
                      item = (java.lang.Object) _jspx_page_context.findAttribute("item");
                      i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                  out.write("\r\n");
                  out.write("\t\t\t</tbody>\r\n");
                  out.write("\t\t</table>\r\n");
                  out.write("\r\n");
                  out.write("\t\t");
                  if (_jspx_meth_logic_005fgreaterThan_005f5(_jspx_th_logic_005fnotEmpty_005f1, _jspx_page_context))
                    return;
                  out.write('\r');
                  out.write('\n');
                  out.write('	');
                  int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEmpty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f1);
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t");
              if (_jspx_meth_html_005fhidden_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              out.write('	');
              if (_jspx_meth_html_005fhidden_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fonsubmit_005faction.reuse(_jspx_th_html_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005fonsubmit_005faction.reuse(_jspx_th_html_005fform_005f0);
          out.write("\r\n");
          out.write("<br />\r\n");
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t$('#preventTab > em').removeClass(\"menu-block-contract-off\");\r\n");
      out.write("\t$('#preventTab > em').addClass(\"menu-block-contract-on\");\r\n");
      out.write("\t$('#preventTab > b').addClass(\"menu-on\");\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.getElementById(\"keySearch\").focus();\r\n");
      out.write("\t\r\n");
      out.write("//\tonchangeSelect(\"districtFilter\",\"\");\r\n");
      out.write("\tonchangeSelect(\"propertyType\",\"\");\r\n");
      out.write("\t\r\n");
      out.write("\t        \r\n");
      out.write("\tvar display;\r\n");
      out.write("\tdisplay = $('#displayPreventList').val();\r\n");
      out.write("\tif (display == \"true\") {\r\n");
      out.write("\t  $('#datapreventTab').addClass(\"selectedtab\");\r\n");
      out.write("\t    document.getElementById(\"preventListTitle\").style.display = \"\";\r\n");
      out.write("\t    document.getElementById(\"preventListPrint\").style.display = \"none\";\r\n");
      out.write("\t    var preventList = document.getElementById(\"preventList\");\r\n");
      out.write("\t    if (preventList != null) {\r\n");
      out.write("\t      preventList.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventListPager = document.getElementById(\"preventListPager\");\r\n");
      out.write("\t    if (preventListPager != null) {\r\n");
      out.write("\t      preventListPager.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventAdd = document.getElementById(\"preventAdd\");\r\n");
      out.write("\t    if (preventAdd != null) {\r\n");
      out.write("\t      preventAdd.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyList = document.getElementById(\"propertyList\");\r\n");
      out.write("\t    if (propertyList != null) {\r\n");
      out.write("\t      propertyList.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyListPager = document.getElementById(\"propertyListPager\");\r\n");
      out.write("\t    if (propertyListPager != null) {\r\n");
      out.write("\t      propertyListPager.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t    document.getElementById(\"preventResult\").style.display = \"\";\r\n");
      out.write("\t    document.getElementById(\"historyResult\").style.display = \"none\";\r\n");
      out.write("\t} else {\r\n");
      out.write("\t  $('#propertycontractTab').addClass(\"selectedtab\");\r\n");
      out.write("\t    document.getElementById(\"preventListTitle\").style.display = \"none\";\r\n");
      out.write("\t    document.getElementById(\"preventListPrint\").style.display = \"\";\r\n");
      out.write("\t    var preventList = document.getElementById(\"preventList\");\r\n");
      out.write("\t    if (preventList != null) {\r\n");
      out.write("\t        preventList.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventListPager = document.getElementById(\"preventListPager\");\r\n");
      out.write("\t    if (preventListPager != null) {\r\n");
      out.write("\t        preventListPager.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventAdd = document.getElementById(\"preventAdd\");\r\n");
      out.write("\t    if (preventAdd != null) {\r\n");
      out.write("\t        preventAdd.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyList = document.getElementById(\"propertyList\");\r\n");
      out.write("\t    if (propertyList != null) {\r\n");
      out.write("\t        propertyList.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyListPager = document.getElementById(\"propertyListPager\");\r\n");
      out.write("\t    if (propertyListPager != null) {\r\n");
      out.write("\t        propertyListPager.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t    document.getElementById(\"preventResult\").style.display = \"none\";\r\n");
      out.write("\t    document.getElementById(\"historyResult\").style.display = \"\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction displayDataPreventList(element) {\r\n");
      out.write("\t  $('#menutabs > ul > li > a').removeClass(\"selectedtab\");\r\n");
      out.write("\t    element.className = \"selectedtab\"\r\n");
      out.write("\t  document.getElementById(\"preventListTitle\").style.display = \"\";\r\n");
      out.write("\t    document.getElementById(\"preventListPrint\").style.display = \"none\";\r\n");
      out.write("\t    var preventList = document.getElementById(\"preventList\");\r\n");
      out.write("\t    if (preventList != null) {\r\n");
      out.write("\t        preventList.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventListPager = document.getElementById(\"preventListPager\");\r\n");
      out.write("\t    if (preventListPager != null) {\r\n");
      out.write("\t        preventListPager.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventAdd = document.getElementById(\"preventAdd\");\r\n");
      out.write("\t    if (preventAdd != null) {\r\n");
      out.write("\t        preventAdd.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyList = document.getElementById(\"propertyList\");\r\n");
      out.write("\t    if (propertyList != null) {\r\n");
      out.write("\t        propertyList.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyListPager = document.getElementById(\"propertyListPager\");\r\n");
      out.write("\t    if (propertyListPager != null) {\r\n");
      out.write("\t        propertyListPager.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    $('#displayPreventList').val(true);\r\n");
      out.write("\t    \r\n");
      out.write("\t    document.getElementById(\"preventResult\").style.display = \"\";\r\n");
      out.write("\t    document.getElementById(\"historyResult\").style.display = \"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction displayPropertyList(element) {\r\n");
      out.write("\t  $('#menutabs > ul > li > a').removeClass(\"selectedtab\");\r\n");
      out.write("\t  element.className = \"selectedtab\"\r\n");
      out.write("\t  document.getElementById(\"preventListTitle\").style.display = \"none\";\r\n");
      out.write("\t  document.getElementById(\"preventListPrint\").style.display = \"\";\r\n");
      out.write("\t    var preventList = document.getElementById(\"preventList\");\r\n");
      out.write("\t    if (preventList != null) {\r\n");
      out.write("\t        preventList.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventListPager = document.getElementById(\"preventListPager\");\r\n");
      out.write("\t    if (preventListPager != null) {\r\n");
      out.write("\t        preventListPager.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var preventAdd = document.getElementById(\"preventAdd\");\r\n");
      out.write("\t    if (preventAdd != null) {\r\n");
      out.write("\t        preventAdd.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyList = document.getElementById(\"propertyList\");\r\n");
      out.write("\t    if (propertyList != null) {\r\n");
      out.write("\t        propertyList.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    var propertyListPager = document.getElementById(\"propertyListPager\");\r\n");
      out.write("\t    if (propertyListPager != null) {\r\n");
      out.write("\t        propertyListPager.style.display = \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t    $('#displayPreventList').val(false);\r\n");
      out.write("\t    \r\n");
      out.write("\t    document.getElementById(\"preventResult\").style.display = \"none\";\r\n");
      out.write("\t    document.getElementById(\"historyResult\").style.display = \"\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction search() {\r\n");
      out.write("\t\tif (checkPaging == 1){\r\n");
      out.write("\t\t\tpageNumber = $('#pageNum').val();\r\n");
      out.write("\t\t\tdocument.preventListForm.direction.value = null;\r\n");
      out.write("\t\t\t document.preventListForm.action=\"preventlistpaging.do?page=\"+pageNumber;\r\n");
      out.write("\t\t} else if (checkPaging == 2) {\r\n");
      out.write("\t\t\tpageNumber = $('#pagePropertyNum').val();\r\n");
      out.write("\t\t\tdocument.preventListForm.direction.value = null;\r\n");
      out.write("\t\t\t document.preventListForm.action=\"propertylistpaging.do?pageProperty=\"+pageNumber2;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t    document.preventListForm.action=\"preventlistsearch.do\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    return true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction forward() {\r\n");
      out.write("\t\tdocument.preventListForm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction direction(data){\r\n");
      out.write("\t    document.preventListForm.direction.value=data;\r\n");
      out.write("\t    document.preventListForm.action=\"preventlistpaging.do\";\r\n");
      out.write("\t    document.preventListForm.submit();\r\n");
      out.write("\t    return true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("//\tvar sortType = $('#sortType').val();\r\n");
      out.write("//\tif (sortType==\"true\") {\r\n");
      out.write("//\t\t$('#relateSort').show();\r\n");
      out.write("//\t\t$('#dateSort').hide(); \t\r\n");
      out.write("//\t} else {\r\n");
      out.write("//\t\t$('#relateSort').hide();\r\n");
      out.write("//\t\t$('#dateSort').show(); \r\n");
      out.write("//\t}\r\n");
      out.write("\tpropertyInfoFilter = document.getElementById(\"propertyInfoFilter\").value;\r\n");
      out.write("\trelationFilter = document.getElementById(\"relationFilter\").value;\r\n");
      out.write("//\tstreetFilter = document.getElementById(\"streetFilter\").value;\r\n");
      out.write("//\tdistrictFilter = document.getElementById(\"districtFilter\").value;        \r\n");
      out.write("\tpropertyType = document.getElementById(\"propertyType\").value;\r\n");
      out.write("\tkeySearchFilter = document.getElementById(\"keySearch\").value;\r\n");
      out.write("\tfunction sort(typeSort){\r\n");
      out.write("\t\t$('#relateSort').toggle();\r\n");
      out.write("\t\t$('#dateSort').toggle(); \r\n");
      out.write("\t\tdocument.getElementById(\"propertyInfoFilter\").value = propertyInfoFilter;\r\n");
      out.write("\t    document.getElementById(\"relationFilter\").value = relationFilter;\r\n");
      out.write("\t    document.getElementById(\"streetFilter\").value = streetFilter;\r\n");
      out.write("\t    document.getElementById(\"districtFilter\").value = districtFilter;        \r\n");
      out.write("\t    document.getElementById(\"propertyType\").value = propertyType;\r\n");
      out.write("\t    document.getElementById(\"keySearch\").value = keySearchFilter;\r\n");
      out.write("\t    changeProperty();\r\n");
      out.write("\t    onchangeSelect(\"districtFilter\",\"\");\r\n");
      out.write("\t    onchangeSelect(\"propertyType\",\"\");\r\n");
      out.write("\t    \r\n");
      out.write("\t    document.preventListForm.sortType.value=typeSort;\r\n");
      out.write("\t    document.preventListForm.action=\"preventlistsearch.do\";\r\n");
      out.write("\t    document.preventListForm.submit();\r\n");
      out.write("\t    return true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction directionProperty(data){\r\n");
      out.write("\t    document.preventListForm.direction.value=data;\r\n");
      out.write("\t    document.preventListForm.action=\"propertylistpaging.do\";\r\n");
      out.write("\t    document.preventListForm.submit();\r\n");
      out.write("\t    return true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clear() {\r\n");
      out.write("\t    document.getElementById(\"type\").value = \"00\";\r\n");
      out.write("\t    document.getElementById(\"propertyInfo\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"landAddress\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"landCertificate\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"landNumber\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"landMapNumber\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"carLicenseNumber\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"carRegistNumber\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"carFrameNumber\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"carMachineNumber\").value = \"\";\r\n");
      out.write("\t    document.getElementById(\"originKind\").value = \"00\";\r\n");
      out.write("\t    document.getElementById(\"releaseFlg\").value = \"00\";\r\n");
      out.write("\t    \r\n");
      out.write("\t    onchangeSelect(\"type\",\"00\");\r\n");
      out.write("\t    onchangeSelect(\"originKind\",\"00\");\r\n");
      out.write("\t    onchangeSelect(\"releaseFlg\",\"00\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tchangeDisplayProperty($('#type option:selected').val());\r\n");
      out.write("\tfunction changeDisplayProperty(value) {\r\n");
      out.write("\t    $('.land').hide();\r\n");
      out.write("\t    $('.vehicle').hide();\r\n");
      out.write("\t    $('.other').hide();\r\n");
      out.write("\t    if(value == \"01\") {\r\n");
      out.write("\t        $('.land').show();\r\n");
      out.write("\t        $('.vehicle').hide();\r\n");
      out.write("\t        $('.other').hide();\r\n");
      out.write("\t    } else if(value == \"02\") {\r\n");
      out.write("\t    \t$('.land').hide();\r\n");
      out.write("\t        $('.vehicle').show();\r\n");
      out.write("\t        $('.other').hide();\r\n");
      out.write("\t    } else {\r\n");
      out.write("\t        $('.other').show();\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar LEFT_CAL = Calendar.setup({\r\n");
      out.write("\t    cont: \"cont\",\r\n");
      out.write("\t    weekNumbers: true,\r\n");
      out.write("\t    selectionType: Calendar.SEL_MULTIPLE,\r\n");
      out.write("\t    showTime: 12\r\n");
      out.write("\t    // titleFormat: \"%B %Y\"\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tchangeSearch($('#isAdvanceSearch').val());\r\n");
      out.write("\tfunction changeSearch(value) {\r\n");
      out.write("\t    $('#isAdvanceSearch').val(value);\r\n");
      out.write("\t    if (value == 'true') {\r\n");
      out.write("\t        $('.advanceSearch').show();\r\n");
      out.write("\t        $('.keySearch').hide();\r\n");
      out.write("\t    } else {\r\n");
      out.write("\t        $('.advanceSearch').hide();\r\n");
      out.write("\t        $('.keySearch').show();\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\tvar checkPaging = 0;\r\n");
      out.write("\tvar pageNumber;\r\n");
      out.write("\tvar pageNumber2;\r\n");
      out.write("\tfunction paging(data){\r\n");
      out.write("\t\tcheckPaging = 1;\r\n");
      out.write("\t\tpageNumber = data;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction pagingProperty(data){\r\n");
      out.write("\t\tcheckPaging = 2;\r\n");
      out.write("\t\tpageNumber2 = data;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction createSillyWindow()\r\n");
      out.write("    {\r\n");
      out.write("    \twindow.open(\"about:blank\", \"mySillyWindow\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function printts()\r\n");
      out.write("    {\r\n");
      out.write("\t    \tdocument.preventListForm.setAttribute(\"target\", \"mySillyWindow\");\r\n");
      out.write("\t        createSillyWindow();\r\n");
      out.write("\t    \tdocument.preventListForm.action = \"preventPrint.do\";\r\n");
      out.write("\t    \tdocument.preventListForm.submit();\r\n");
      out.write("\t    \tdocument.preventListForm.removeAttribute(\"target\");\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\t//add content for tooltip\r\n");
      out.write("\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f5 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_005fnotEmpty_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEmpty_005f5.setParent(null);
      // /jsp/prevent/PRV001.jsp(803,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f5.setName("preventListViewHelper");
      // /jsp/prevent/PRV001.jsp(803,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f5.setProperty("dataPreventList");
      int _jspx_eval_logic_005fnotEmpty_005f5 = _jspx_th_logic_005fnotEmpty_005f5.doStartTag();
      if (_jspx_eval_logic_005fnotEmpty_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f5);
          // /jsp/prevent/PRV001.jsp(805,1) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f3.setId("item");
          // /jsp/prevent/PRV001.jsp(805,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f3.setName("preventListViewHelper");
          // /jsp/prevent/PRV001.jsp(805,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f3.setProperty("dataPreventList");
          // /jsp/prevent/PRV001.jsp(805,1) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f3.setIndexId("i");
          int _jspx_eval_logic_005fiterate_005f3 = _jspx_th_logic_005fiterate_005f3.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object item = null;
            java.lang.Integer i = null;
            if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f3.doInitBody();
            }
            item = (java.lang.Object) _jspx_page_context.findAttribute("item");
            i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f16 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f16.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /jsp/prevent/PRV001.jsp(806,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f16.setValue("false");
              // /jsp/prevent/PRV001.jsp(806,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f16.setName("preventListViewHelper");
              // /jsp/prevent/PRV001.jsp(806,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f16.setProperty("luceneSearch");
              int _jspx_eval_logic_005fequal_005f16 = _jspx_th_logic_005fequal_005f16.doStartTag();
              if (_jspx_eval_logic_005fequal_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t   $('<div id=\"preventsticky");
                  out.print(i);
                  out.write("\" class=\"atip\">");
                  if (_jspx_meth_bean_005fwrite_005f35(_jspx_th_logic_005fequal_005f16, _jspx_page_context))
                    return;
                  out.write("</div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f16.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f16);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f16);
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f17 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f17.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /jsp/prevent/PRV001.jsp(809,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f17.setValue("true");
              // /jsp/prevent/PRV001.jsp(809,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f17.setName("preventListViewHelper");
              // /jsp/prevent/PRV001.jsp(809,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f17.setProperty("luceneSearch");
              int _jspx_eval_logic_005fequal_005f17 = _jspx_th_logic_005fequal_005f17.doStartTag();
              if (_jspx_eval_logic_005fequal_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t   $('<div id=\"preventsticky");
                  out.print(i);
                  out.write("\" class=\"atip\">");
                  if (_jspx_meth_bean_005fwrite_005f36(_jspx_th_logic_005fequal_005f17, _jspx_page_context))
                    return;
                  out.write("</div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f17.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f17);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f17);
              out.write('\r');
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f3.doAfterBody();
              item = (java.lang.Object) _jspx_page_context.findAttribute("item");
              i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
          out.write("   \r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEmpty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f5);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f5);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f6 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_005fnotEmpty_005f6.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEmpty_005f6.setParent(null);
      // /jsp/prevent/PRV001.jsp(815,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f6.setName("preventListViewHelper");
      // /jsp/prevent/PRV001.jsp(815,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f6.setProperty("transactionPropertyList");
      int _jspx_eval_logic_005fnotEmpty_005f6 = _jspx_th_logic_005fnotEmpty_005f6.doStartTag();
      if (_jspx_eval_logic_005fnotEmpty_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f4 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f4.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f6);
          // /jsp/prevent/PRV001.jsp(817,1) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f4.setId("item");
          // /jsp/prevent/PRV001.jsp(817,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f4.setName("preventListViewHelper");
          // /jsp/prevent/PRV001.jsp(817,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f4.setProperty("transactionPropertyList");
          // /jsp/prevent/PRV001.jsp(817,1) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f4.setIndexId("i");
          int _jspx_eval_logic_005fiterate_005f4 = _jspx_th_logic_005fiterate_005f4.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object item = null;
            java.lang.Integer i = null;
            if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f4.doInitBody();
            }
            item = (java.lang.Object) _jspx_page_context.findAttribute("item");
            i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f18 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f18.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
              // /jsp/prevent/PRV001.jsp(818,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f18.setValue("false");
              // /jsp/prevent/PRV001.jsp(818,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f18.setName("preventListViewHelper");
              // /jsp/prevent/PRV001.jsp(818,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f18.setProperty("luceneSearch");
              int _jspx_eval_logic_005fequal_005f18 = _jspx_th_logic_005fequal_005f18.doStartTag();
              if (_jspx_eval_logic_005fequal_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t   $('<div id=\"relationObject");
                  out.print(i);
                  out.write("\" class=\"atip\">");
                  if (_jspx_meth_bean_005fwrite_005f37(_jspx_th_logic_005fequal_005f18, _jspx_page_context))
                    return;
                  out.write("</div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t   $('<div id=\"contractsticky");
                  out.print(i);
                  out.write("\" class=\"atip\">");
                  if (_jspx_meth_bean_005fwrite_005f38(_jspx_th_logic_005fequal_005f18, _jspx_page_context))
                    return;
                  out.write("</div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t");
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
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f19 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f19.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
              // /jsp/prevent/PRV001.jsp(822,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f19.setValue("true");
              // /jsp/prevent/PRV001.jsp(822,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f19.setName("preventListViewHelper");
              // /jsp/prevent/PRV001.jsp(822,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f19.setProperty("luceneSearch");
              int _jspx_eval_logic_005fequal_005f19 = _jspx_th_logic_005fequal_005f19.doStartTag();
              if (_jspx_eval_logic_005fequal_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t   $('<div id=\"relationObject");
                  out.print(i);
                  out.write("\" class=\"atip\">");
                  if (_jspx_meth_bean_005fwrite_005f39(_jspx_th_logic_005fequal_005f19, _jspx_page_context))
                    return;
                  out.write("</div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t\r\n");
                  out.write("\t   $('<div id=\"contractsticky");
                  out.print(i);
                  out.write("\" class=\"atip\">");
                  if (_jspx_meth_bean_005fwrite_005f40(_jspx_th_logic_005fequal_005f19, _jspx_page_context))
                    return;
                  out.write("</div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t\r\n");
                  out.write("\t   \r\n");
                  out.write("\t");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f19.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f19);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f19);
              out.write("\r\n");
              out.write("\t   ");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f7 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_005fnotEmpty_005f7.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEmpty_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
              // /jsp/prevent/PRV001.jsp(829,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f7.setName("item");
              // /jsp/prevent/PRV001.jsp(829,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f7.setProperty("contractPeriod");
              int _jspx_eval_logic_005fnotEmpty_005f7 = _jspx_th_logic_005fnotEmpty_005f7.doStartTag();
              if (_jspx_eval_logic_005fnotEmpty_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t $('<div id=\"contractsticky");
                  out.print(i);
                  out.write("\" class=\"atip\"><b>Thời hạn:</b> <b style=\"color: #C00000\">");
                  if (_jspx_meth_bean_005fwrite_005f41(_jspx_th_logic_005fnotEmpty_005f7, _jspx_page_context))
                    return;
                  out.write("</b></div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t   ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f7.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEmpty_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f7);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f7);
              out.write("\r\n");
              out.write("\t   \r\n");
              out.write("\t   ");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f8 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_005fnotEmpty_005f8.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEmpty_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
              // /jsp/prevent/PRV001.jsp(833,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f8.setName("item");
              // /jsp/prevent/PRV001.jsp(833,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f8.setProperty("cancelDescription");
              int _jspx_eval_logic_005fnotEmpty_005f8 = _jspx_th_logic_005fnotEmpty_005f8.doStartTag();
              if (_jspx_eval_logic_005fnotEmpty_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write(" \r\n");
                  out.write("\t   \t\t$('<div id=\"contractsticky");
                  out.print(i);
                  out.write("\" class=\"atip\"><b>Tình trạng:</b></div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t   ");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEmpty_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f8);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f8);
              out.write("\r\n");
              out.write("\t   ");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f2 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_005fempty_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fempty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
              // /jsp/prevent/PRV001.jsp(836,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fempty_005f2.setName("item");
              // /jsp/prevent/PRV001.jsp(836,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fempty_005f2.setProperty("cancelDescription");
              int _jspx_eval_logic_005fempty_005f2 = _jspx_th_logic_005fempty_005f2.doStartTag();
              if (_jspx_eval_logic_005fempty_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t \t\t  ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f20 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f20.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fempty_005f2);
                  // /jsp/prevent/PRV001.jsp(837,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fequal_005f20.setValue("true");
                  // /jsp/prevent/PRV001.jsp(837,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fequal_005f20.setName("item");
                  // /jsp/prevent/PRV001.jsp(837,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_logic_005fequal_005f20.setProperty("mortageCancelFlag");
                  int _jspx_eval_logic_005fequal_005f20 = _jspx_th_logic_005fequal_005f20.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n");
                      out.write("\t\t   \t\t$('<div id=\"contractsticky");
                      out.print(i);
                      out.write("\" class=\"atip\"><b>Tình trạng:</b></div>').appendTo('#tooltipContent');\r\n");
                      out.write("\t\t   \t\t");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f20.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f20);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f20);
                  out.write("\r\n");
                  out.write("\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fempty_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fempty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f2);
              out.write(" \r\n");
              out.write("\t\t ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f21 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f21.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
              // /jsp/prevent/PRV001.jsp(841,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f21.setValue("true");
              // /jsp/prevent/PRV001.jsp(841,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f21.setName("item");
              // /jsp/prevent/PRV001.jsp(841,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f21.setProperty("mortageCancelFlag");
              int _jspx_eval_logic_005fequal_005f21 = _jspx_th_logic_005fequal_005f21.doStartTag();
              if (_jspx_eval_logic_005fequal_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t $('<div id=\"contractsticky");
                  out.print(i);
                  out.write("\" class=\"atip\"><b style=\"color: #C00000\"> ");
                  if (_jspx_meth_bean_005fwrite_005f42(_jspx_th_logic_005fequal_005f21, _jspx_page_context))
                    return;
                  out.write("</b><br/></div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t\t\t $('<div id=\"contractsticky");
                  out.print(i);
                  out.write("\" class=\"atip\"><b style=\"color: #C00000\"> ");
                  if (_jspx_meth_bean_005fwrite_005f43(_jspx_th_logic_005fequal_005f21, _jspx_page_context))
                    return;
                  out.write("</b><br/></div>').appendTo('#tooltipContent');\r\n");
                  out.write("\t\r\n");
                  out.write("\t\t ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f21.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f21);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f21);
              out.write("\r\n");
              out.write("\t\t $('<div id=\"contractsticky");
              out.print(i);
              out.write("\" class=\"atip\"><b style=\"color: #C00000\"> ");
              if (_jspx_meth_bean_005fwrite_005f44(_jspx_th_logic_005fiterate_005f4, _jspx_page_context))
                return;
              out.write("</b></div>').appendTo('#tooltipContent');\r\n");
              out.write("\t\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f4.doAfterBody();
              item = (java.lang.Object) _jspx_page_context.findAttribute("item");
              i = (java.lang.Integer) _jspx_page_context.findAttribute("i");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEmpty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f6);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f6);
      out.write("\r\n");
      out.write("\tchangeProperty();\r\n");
      out.write("\tfunction changeProperty() {\r\n");
      out.write("\t\tvar value = $('#propertyType option:selected').val();\r\n");
      out.write("\t\tif (value == 02) {\r\n");
      out.write("\t\r\n");
      out.write("//\t\t\t$('#district').hide();\r\n");
      out.write("//\t\t\t$('#street').hide();\r\n");
      out.write("\t\t} else if (value == 01) {\r\n");
      out.write("//\t\t\t$('#district').show();\r\n");
      out.write("//\t\t\t$('#street').show();\r\n");
      out.write("\t\t} else if (value == 99) {\r\n");
      out.write("//\t\t\t$('#district').hide();\r\n");
      out.write("//\t\t\t$('#street').hide();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("//\t\t\t$('#district').show();\r\n");
      out.write("//\t\t\t$('#street').show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction clear() {\r\n");
      out.write("\t\tdocument.getElementById(\"propertyInfoFilter\").value = \"\";\r\n");
      out.write("\t\tdocument.getElementById(\"relationFilter\").value = \"\";\r\n");
      out.write("//\t\tdocument.getElementById(\"streetFilter\").value = \"\";\r\n");
      out.write("//\t\tdocument.getElementById(\"districtFilter\").value = \"\";\r\n");
      out.write("\t\tdocument.getElementById(\"propertyType\").value = \"\";\r\n");
      out.write("\t\tchangeProperty();\r\n");
      out.write("//\t\tonchangeSelect(\"districtFilter\", \"\");\r\n");
      out.write("\t\tonchangeSelect(\"propertyType\", \"\");\r\n");
      out.write("\t\r\n");
      out.write("\t} \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
    // /jsp/prevent/PRV001.jsp(13,5) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f8.setAlt("*");
    // /jsp/prevent/PRV001.jsp(13,5) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /jsp/prevent/PRV001.jsp(14,5) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f12.setHref("preventlistview.do");
    int _jspx_eval_html_005flink_005f12 = _jspx_th_html_005flink_005f12.doStartTag();
    if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f12.doInitBody();
      }
      do {
        out.write("Tra cứu thông tin");
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

  private boolean _jspx_meth_logic_005fpresent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
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

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(24,1) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setStyleId("isHidePanelSearch");
    // /jsp/prevent/PRV001.jsp(24,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setProperty("isHidePanelSearch");
    // /jsp/prevent/PRV001.jsp(24,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setName("preventListViewHelper");
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
    // /jsp/prevent/PRV001.jsp(26,1) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setStyleId("isAdvanceSearch");
    // /jsp/prevent/PRV001.jsp(26,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setProperty("isAdvanceSearch");
    // /jsp/prevent/PRV001.jsp(26,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setName("preventListViewHelper");
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
    // /jsp/prevent/PRV001.jsp(28,1) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setStyleId("displayPreventList");
    // /jsp/prevent/PRV001.jsp(28,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setProperty("displayPreventList");
    // /jsp/prevent/PRV001.jsp(28,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setName("preventListViewHelper");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(30,1) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f3.setStyleId("keyHighLight");
    // /jsp/prevent/PRV001.jsp(30,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f3.setProperty("keyHighLight");
    // /jsp/prevent/PRV001.jsp(30,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f3.setName("preventListViewHelper");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fstyle_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(60,1) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setStyleId("keySearch");
    // /jsp/prevent/PRV001.jsp(60,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(60,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setProperty("keySearch");
    // /jsp/prevent/PRV001.jsp(60,1) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setStyleClass("input-long");
    // /jsp/prevent/PRV001.jsp(60,1) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setStyle("vertical-align: middle;");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fstyle_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fstyle_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:image
    org.apache.struts.taglib.html.ImageTag _jspx_th_html_005fimage_005f0 = (org.apache.struts.taglib.html.ImageTag) _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fstyle_005fsrc_005fonclick_005falt_005fnobody.get(org.apache.struts.taglib.html.ImageTag.class);
    _jspx_th_html_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(65,4) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f0.setAlt("Tìm kiếm");
    // /jsp/prevent/PRV001.jsp(65,4) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f0.setSrc("./image/btn_search.png");
    // /jsp/prevent/PRV001.jsp(65,4) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f0.setStyle("vertical-align: middle;");
    // /jsp/prevent/PRV001.jsp(65,4) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f0.setOnclick("stylechange('add_off','add_on');");
    int _jspx_eval_html_005fimage_005f0 = _jspx_th_html_005fimage_005f0.doStartTag();
    if (_jspx_th_html_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fstyle_005fsrc_005fonclick_005falt_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fstyle_005fsrc_005fonclick_005falt_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
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
    // /jsp/prevent/PRV001.jsp(75,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(75,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setProperty("type");
    // /jsp/prevent/PRV001.jsp(75,3) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setStyleId("propertyType");
    // /jsp/prevent/PRV001.jsp(75,3) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fselect_005f0.setOnchange("onchangeSelect(this.id,'0');javascript:changeProperty();");
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005foption_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005foptionsCollection_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_html_005foption_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /jsp/prevent/PRV001.jsp(77,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foption_005f0.setValue("");
    int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f0.doInitBody();
      }
      do {
        out.write("[Tất cả]");
        int evalDoAfterBody = _jspx_th_html_005foption_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f0);
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
    // /jsp/prevent/PRV001.jsp(78,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(78,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setProperty("propertyList");
    // /jsp/prevent/PRV001.jsp(78,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setLabel("name");
    // /jsp/prevent/PRV001.jsp(78,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005foptionsCollection_005f0.setValue("code");
    int _jspx_eval_html_005foptionsCollection_005f0 = _jspx_th_html_005foptionsCollection_005f0.doStartTag();
    if (_jspx_th_html_005foptionsCollection_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fproperty_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(83,3) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setStyleId("propertyInfoFilter");
    // /jsp/prevent/PRV001.jsp(83,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setStyle("width: 200px;");
    // /jsp/prevent/PRV001.jsp(83,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setProperty("propertyInfo");
    // /jsp/prevent/PRV001.jsp(83,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f1.setName("preventListViewHelper");
    int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
    if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(85,3) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setStyleId("relationFilter");
    // /jsp/prevent/PRV001.jsp(85,3) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setStyle("width: 200px;");
    // /jsp/prevent/PRV001.jsp(85,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setProperty("ownerInfo");
    // /jsp/prevent/PRV001.jsp(85,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f2.setName("preventListViewHelper");
    int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
    if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:image
    org.apache.struts.taglib.html.ImageTag _jspx_th_html_005fimage_005f1 = (org.apache.struts.taglib.html.ImageTag) _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImageTag.class);
    _jspx_th_html_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(93,8) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f1.setAlt("Tìm kiếm");
    // /jsp/prevent/PRV001.jsp(93,8) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimage_005f1.setSrc("./image/btn_search.png");
    int _jspx_eval_html_005fimage_005f1 = _jspx_th_html_005fimage_005f1.doStartTag();
    if (_jspx_th_html_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimage_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimage_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f13 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(94,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f13.setHref("javascript: clear()");
    int _jspx_eval_html_005flink_005f13 = _jspx_th_html_005flink_005f13.doStartTag();
    if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f13.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t          ");
        if (_jspx_meth_html_005fimg_005f9(_jspx_th_html_005flink_005f13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t          ");
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

  private boolean _jspx_meth_html_005fimg_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f9 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f13);
    // /jsp/prevent/PRV001.jsp(95,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f9.setAlt("Xóa điều kiện");
    // /jsp/prevent/PRV001.jsp(95,12) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f9.setSrc("./image/btn_clear.png");
    int _jspx_eval_html_005fimg_005f9 = _jspx_th_html_005fimg_005f9.doStartTag();
    if (_jspx_th_html_005fimg_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f9);
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
    // /jsp/prevent/PRV001.jsp(110,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(110,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f6.setProperty("totalCount");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(114,63) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(114,63) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f7.setProperty("totalCountProperty");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f0 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(117,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f0.setValue("0");
    // /jsp/prevent/PRV001.jsp(117,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f0.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(117,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f0.setProperty("totalCount");
    int _jspx_eval_logic_005fgreaterThan_005f0 = _jspx_th_logic_005fgreaterThan_005f0.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        Có ");
        if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fgreaterThan_005f0, _jspx_page_context))
          return true;
        out.write(" thông tin ngăn chặn thỏa mãn điều kiện tìm kiếm.\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f0);
    // /jsp/prevent/PRV001.jsp(118,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(118,27) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f8.setProperty("totalCount");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f1 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(121,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f1.setValue("0");
    // /jsp/prevent/PRV001.jsp(121,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f1.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(121,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f1.setProperty("totalCountProperty");
    int _jspx_eval_logic_005fgreaterThan_005f1 = _jspx_th_logic_005fgreaterThan_005f1.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        Có ");
        if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fgreaterThan_005f1, _jspx_page_context))
          return true;
        out.write(" lịch sử giao dịch thỏa mãn điều kiện tìm kiếm.\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f1);
    // /jsp/prevent/PRV001.jsp(122,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(122,27) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f9.setProperty("totalCountProperty");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f14 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(137,6) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f14.setHref("javascript:printts()");
    int _jspx_eval_html_005flink_005f14 = _jspx_th_html_005flink_005f14.doStartTag();
    if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f14.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_html_005fimg_005f10(_jspx_th_html_005flink_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f14);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f10 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f14);
    // /jsp/prevent/PRV001.jsp(139,3) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f10.setAlt("Them moi");
    // /jsp/prevent/PRV001.jsp(139,3) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f10.setSrc("./image/banin.png");
    int _jspx_eval_html_005fimg_005f10 = _jspx_th_html_005fimg_005f10.doStartTag();
    if (_jspx_th_html_005fimg_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f10);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f15 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(141,3) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f15.setHref("datapreventregistview.do");
    int _jspx_eval_html_005flink_005f15 = _jspx_th_html_005flink_005f15.doStartTag();
    if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f15.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_html_005fimg_005f11(_jspx_th_html_005flink_005f15, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f15);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f11 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f11.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f15);
    // /jsp/prevent/PRV001.jsp(143,3) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f11.setAlt("Them moi");
    // /jsp/prevent/PRV001.jsp(143,3) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f11.setSrc("./image/btn_add.png");
    int _jspx_eval_html_005fimg_005f11 = _jspx_th_html_005fimg_005f11.doStartTag();
    if (_jspx_th_html_005fimg_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f11);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f16 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(153,3) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f16.setHref("javascript:printts()");
    int _jspx_eval_html_005flink_005f16 = _jspx_th_html_005flink_005f16.doStartTag();
    if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f16.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005fimg_005f12(_jspx_th_html_005flink_005f16, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f12 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f12.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f16);
    // /jsp/prevent/PRV001.jsp(155,4) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f12.setAlt("Them moi");
    // /jsp/prevent/PRV001.jsp(155,4) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f12.setSrc("./image/banin.png");
    int _jspx_eval_html_005fimg_005f12 = _jspx_th_html_005fimg_005f12.doStartTag();
    if (_jspx_th_html_005fimg_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f12);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(176,38) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setName("item");
    // /jsp/prevent/PRV001.jsp(176,38) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setProperty("originKind");
    // /jsp/prevent/PRV001.jsp(176,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setValue("01");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_html_005fimg_005f13(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_html_005fimg_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f13 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f13.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /jsp/prevent/PRV001.jsp(178,7) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setTitle("Thông tin ngăn chặn");
    // /jsp/prevent/PRV001.jsp(178,7) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setSrc("./image/icon_prevent.png");
    // /jsp/prevent/PRV001.jsp(178,7) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f13.setAlt("Dữ liệu ngăn chặn");
    int _jspx_eval_html_005fimg_005f13 = _jspx_th_html_005fimg_005f13.doStartTag();
    if (_jspx_th_html_005fimg_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f13);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(180,21) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setName("item");
    // /jsp/prevent/PRV001.jsp(180,21) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setProperty("originKind");
    // /jsp/prevent/PRV001.jsp(180,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setValue("02");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_html_005fimg_005f14(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_html_005fimg_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f14 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f14.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /jsp/prevent/PRV001.jsp(181,7) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setTitle("Thông tin tham khảo");
    // /jsp/prevent/PRV001.jsp(181,7) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setSrc("./image/icon_warning.png");
    // /jsp/prevent/PRV001.jsp(181,7) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f14.setAlt("Dữ liệu tham khảo");
    int _jspx_eval_html_005fimg_005f14 = _jspx_th_html_005fimg_005f14.doStartTag();
    if (_jspx_th_html_005fimg_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f14);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(184,26) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setName("item");
    // /jsp/prevent/PRV001.jsp(184,26) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setProperty("type");
    // /jsp/prevent/PRV001.jsp(184,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setValue("01");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Nhà đất");
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

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(185,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setName("item");
    // /jsp/prevent/PRV001.jsp(185,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setProperty("type");
    // /jsp/prevent/PRV001.jsp(185,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setValue("02");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Ô tô, Xe máy");
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

  private boolean _jspx_meth_logic_005fequal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(186,61) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setName("item");
    // /jsp/prevent/PRV001.jsp(186,61) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setProperty("type");
    // /jsp/prevent/PRV001.jsp(186,61) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setValue("99");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Tài sản khác");
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

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /jsp/prevent/PRV001.jsp(203,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setName("item");
    // /jsp/prevent/PRV001.jsp(203,15) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setProperty("infoDisp");
    // /jsp/prevent/PRV001.jsp(203,15) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f10.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
    // /jsp/prevent/PRV001.jsp(221,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setName("item");
    // /jsp/prevent/PRV001.jsp(221,15) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setProperty("lucenePropertyInfoDisp");
    // /jsp/prevent/PRV001.jsp(221,15) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f11.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(227,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setName("item");
    // /jsp/prevent/PRV001.jsp(227,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setProperty("preventPersonInfoDisp");
    // /jsp/prevent/PRV001.jsp(227,10) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f12.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(229,38) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setName("item");
    // /jsp/prevent/PRV001.jsp(229,38) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setProperty("preventDocReceiveDate");
    // /jsp/prevent/PRV001.jsp(229,38) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f13.setFormat("dd/MM/yyyy");
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(231,38) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setName("item");
    // /jsp/prevent/PRV001.jsp(231,38) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setProperty("releaseFlg");
    // /jsp/prevent/PRV001.jsp(231,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setValue("true");
    int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
    if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_html_005fimg_005f15(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_html_005fimg_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f15 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f15.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /jsp/prevent/PRV001.jsp(233,7) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setSrc("./image/icon_release.png");
    // /jsp/prevent/PRV001.jsp(233,7) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setAlt("Đã giải tỏa");
    // /jsp/prevent/PRV001.jsp(233,7) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f15.setTitle("Đã giải tỏa");
    int _jspx_eval_html_005fimg_005f15 = _jspx_th_html_005fimg_005f15.doStartTag();
    if (_jspx_th_html_005fimg_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005ftitle_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f15);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f17 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f17.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(240,8) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f17.setAction("/datapreventdetail.do");
    // /jsp/prevent/PRV001.jsp(240,8) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f17.setParamId("id");
    // /jsp/prevent/PRV001.jsp(240,8) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f17.setParamName("item");
    // /jsp/prevent/PRV001.jsp(240,8) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f17.setParamProperty("id");
    int _jspx_eval_html_005flink_005f17 = _jspx_th_html_005flink_005f17.doStartTag();
    if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f17.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                \tXem chi tiết\r\n");
        out.write("                            \t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction.reuse(_jspx_th_html_005flink_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction.reuse(_jspx_th_html_005flink_005f17);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    // /jsp/prevent/PRV001.jsp(244,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setName("item");
    // /jsp/prevent/PRV001.jsp(244,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f14.setProperty("entryUserName");
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f2 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /jsp/prevent/PRV001.jsp(252,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f2.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(252,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f2.setProperty("totalCount");
    // /jsp/prevent/PRV001.jsp(252,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f2.setValue("0");
    int _jspx_eval_logic_005fgreaterThan_005f2 = _jspx_th_logic_005fgreaterThan_005f2.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div id=\"preventListPager\" class=\"pager\">\r\n");
        out.write("\t\t\t<div class=\"pager-total\">Tổng số <strong>");
        if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fgreaterThan_005f2, _jspx_page_context))
          return true;
        out.write("</strong> dữ liệu</div>\r\n");
        out.write("\t\t\t<div>");
        if (_jspx_meth_logic_005fgreaterThan_005f3(_jspx_th_logic_005fgreaterThan_005f2, _jspx_page_context))
          return true;
        out.write(" <span> Trang&nbsp; ");
        if (_jspx_meth_html_005ftext_005f3(_jspx_th_logic_005fgreaterThan_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        out.write(' ');
        out.write('/');
        if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fgreaterThan_005f2, _jspx_page_context))
          return true;
        out.write(" </span> ");
        if (_jspx_meth_logic_005fgreaterThan_005f4(_jspx_th_logic_005fgreaterThan_005f2, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f2);
    // /jsp/prevent/PRV001.jsp(255,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(255,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f15.setProperty("totalCount");
    int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
    if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f3 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f2);
    // /jsp/prevent/PRV001.jsp(257,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f3.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(257,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f3.setProperty("totalPage");
    // /jsp/prevent/PRV001.jsp(257,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f3.setValue("1");
    int _jspx_eval_logic_005fgreaterThan_005f3 = _jspx_th_logic_005fgreaterThan_005f3.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f18(_jspx_th_logic_005fgreaterThan_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f19(_jspx_th_logic_005fgreaterThan_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f18 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f18.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f3);
    // /jsp/prevent/PRV001.jsp(259,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f18.setHref("javascript:direction('first')");
    int _jspx_eval_html_005flink_005f18 = _jspx_th_html_005flink_005f18.doStartTag();
    if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f18.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-first\" src=\"./image/first.png\" alt=\"first\" />\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_html_005flink_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f19 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f19.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f3);
    // /jsp/prevent/PRV001.jsp(262,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f19.setHref("javascript:direction('ahead')");
    int _jspx_eval_html_005flink_005f19 = _jspx_th_html_005flink_005f19.doStartTag();
    if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f19.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-prev\" src=\"./image/prev.png\" alt=\"prev\" />\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_html_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f2);
    // /jsp/prevent/PRV001.jsp(265,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(265,43) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setProperty("page");
    // /jsp/prevent/PRV001.jsp(265,43) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setMaxlength("9");
    // /jsp/prevent/PRV001.jsp(265,43) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setStyleId("pageNum");
    // /jsp/prevent/PRV001.jsp(265,43) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setStyle("width:60px");
    // /jsp/prevent/PRV001.jsp(265,43) name = onblur type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setOnblur("checkPaging=0;");
    // /jsp/prevent/PRV001.jsp(265,43) name = onfocus type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setOnfocus("checkPaging=1;");
    // /jsp/prevent/PRV001.jsp(265,43) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f3.setOnchange("javascript: paging(this.value)");
    int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
    if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f2);
    // /jsp/prevent/PRV001.jsp(266,167) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(266,167) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setProperty("totalPage");
    // /jsp/prevent/PRV001.jsp(266,167) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f16.setFormat("##########");
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f4 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f2);
    // /jsp/prevent/PRV001.jsp(268,35) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f4.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(268,35) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f4.setProperty("totalPage");
    // /jsp/prevent/PRV001.jsp(268,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f4.setValue("1");
    int _jspx_eval_logic_005fgreaterThan_005f4 = _jspx_th_logic_005fgreaterThan_005f4.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f20(_jspx_th_logic_005fgreaterThan_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f21(_jspx_th_logic_005fgreaterThan_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f20 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f20.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f4);
    // /jsp/prevent/PRV001.jsp(270,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f20.setHref("javascript:direction('next')");
    int _jspx_eval_html_005flink_005f20 = _jspx_th_html_005flink_005f20.doStartTag();
    if (_jspx_eval_html_005flink_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f20.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-next\" src=\"./image/next.png\" alt=\"next\" />\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f20);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f21 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f21.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f4);
    // /jsp/prevent/PRV001.jsp(273,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f21.setHref("javascript:direction('end')");
    int _jspx_eval_html_005flink_005f21 = _jspx_th_html_005flink_005f21.doStartTag();
    if (_jspx_eval_html_005flink_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f21.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-last\" src=\"./image/last.png\" alt=\"last\" />\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f21);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f22 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f22.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    // /jsp/prevent/PRV001.jsp(283,30) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f22.setHref("datapreventregistview.do");
    int _jspx_eval_html_005flink_005f22 = _jspx_th_html_005flink_005f22.doStartTag();
    if (_jspx_eval_html_005flink_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f22.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_html_005fimg_005f16(_jspx_th_html_005flink_005f22, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f22);
    return false;
  }

  private boolean _jspx_meth_html_005fimg_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_005fimg_005f16 = (org.apache.struts.taglib.html.ImgTag) _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_005fimg_005f16.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimg_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f22);
    // /jsp/prevent/PRV001.jsp(285,3) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f16.setAlt("Them moi");
    // /jsp/prevent/PRV001.jsp(285,3) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fimg_005f16.setSrc("./image/btn_add.png");
    int _jspx_eval_html_005fimg_005f16 = _jspx_th_html_005fimg_005f16.doStartTag();
    if (_jspx_th_html_005fimg_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimg_0026_005fsrc_005falt_005fnobody.reuse(_jspx_th_html_005fimg_005f16);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(311,54) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setName("item");
    // /jsp/prevent/PRV001.jsp(311,54) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setProperty("notaryDate");
    // /jsp/prevent/PRV001.jsp(311,54) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f17.setFormat("dd/MM/yyyy");
    int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
    if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(314,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setName("item");
    // /jsp/prevent/PRV001.jsp(314,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setProperty("entryDateTime");
    // /jsp/prevent/PRV001.jsp(314,7) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f18.setFormat("dd/MM/yyyy");
    int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
    if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(316,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setName("item");
    // /jsp/prevent/PRV001.jsp(316,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f19.setProperty("contractNumber");
    int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
    if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f20 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f20.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(317,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setName("item");
    // /jsp/prevent/PRV001.jsp(317,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f20.setProperty("contractName");
    int _jspx_eval_bean_005fwrite_005f20 = _jspx_th_bean_005fwrite_005f20.doStartTag();
    if (_jspx_th_bean_005fwrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f21 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f21.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
    // /jsp/prevent/PRV001.jsp(333,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setName("item");
    // /jsp/prevent/PRV001.jsp(333,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setProperty("relationObjectSummaryDisp");
    // /jsp/prevent/PRV001.jsp(333,7) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f21.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f21 = _jspx_th_bean_005fwrite_005f21.doStartTag();
    if (_jspx_th_bean_005fwrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f22 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f22.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    // /jsp/prevent/PRV001.jsp(358,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f22.setName("item");
    // /jsp/prevent/PRV001.jsp(358,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f22.setProperty("luceneRelationObjectDisp");
    // /jsp/prevent/PRV001.jsp(358,7) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f22.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f22 = _jspx_th_bean_005fwrite_005f22.doStartTag();
    if (_jspx_th_bean_005fwrite_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f23 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f23.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    // /jsp/prevent/PRV001.jsp(387,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f23.setName("item");
    // /jsp/prevent/PRV001.jsp(387,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f23.setProperty("transactionContentSummaryDisp");
    // /jsp/prevent/PRV001.jsp(387,7) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f23.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f23 = _jspx_th_bean_005fwrite_005f23.doStartTag();
    if (_jspx_th_bean_005fwrite_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f24 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f24.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /jsp/prevent/PRV001.jsp(417,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f24.setName("item");
    // /jsp/prevent/PRV001.jsp(417,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f24.setProperty("luceneTransactionContentDisp");
    // /jsp/prevent/PRV001.jsp(417,7) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f24.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f24 = _jspx_th_bean_005fwrite_005f24.doStartTag();
    if (_jspx_th_bean_005fwrite_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f2 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(431,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEmpty_005f2.setName("item");
    // /jsp/prevent/PRV001.jsp(431,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEmpty_005f2.setProperty("contractPeriod");
    int _jspx_eval_logic_005fnotEmpty_005f2 = _jspx_th_logic_005fnotEmpty_005f2.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<b>Thời hạn</b>: \r\n");
        out.write("\t\t\t\t\t\t<b style=\"color: #C00000\">\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f25(_jspx_th_logic_005fnotEmpty_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t</b><br/>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f25 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f25.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f2);
    // /jsp/prevent/PRV001.jsp(434,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f25.setName("item");
    // /jsp/prevent/PRV001.jsp(434,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f25.setProperty("contractPeriod");
    int _jspx_eval_bean_005fwrite_005f25 = _jspx_th_bean_005fwrite_005f25.doStartTag();
    if (_jspx_th_bean_005fwrite_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f3 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(437,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEmpty_005f3.setName("item");
    // /jsp/prevent/PRV001.jsp(437,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEmpty_005f3.setProperty("cancelDescription");
    int _jspx_eval_logic_005fnotEmpty_005f3 = _jspx_th_logic_005fnotEmpty_005f3.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<b>Tình trạng</b>: \r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fempty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f0 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_005fempty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fempty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(440,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fempty_005f0.setName("item");
    // /jsp/prevent/PRV001.jsp(440,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fempty_005f0.setProperty("cancelDescription");
    int _jspx_eval_logic_005fempty_005f0 = _jspx_th_logic_005fempty_005f0.doStartTag();
    if (_jspx_eval_logic_005fempty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f12(_jspx_th_logic_005fempty_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fempty_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fempty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fempty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fempty_005f0);
    // /jsp/prevent/PRV001.jsp(441,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f12.setValue("true");
    // /jsp/prevent/PRV001.jsp(441,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f12.setName("item");
    // /jsp/prevent/PRV001.jsp(441,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f12.setProperty("mortageCancelFlag");
    int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
    if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<b>Tình trạng</b>: \r\n");
        out.write("\t\t\t\t\t\t        ");
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

  private boolean _jspx_meth_logic_005fequal_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(448,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f13.setValue("true");
    // /jsp/prevent/PRV001.jsp(448,10) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f13.setName("item");
    // /jsp/prevent/PRV001.jsp(448,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f13.setProperty("mortageCancelFlag");
    int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
    if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     <b style=\"color: #0000ff\"> \r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_bean_005fwrite_005f26(_jspx_th_logic_005fequal_005f13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t         ");
        if (_jspx_meth_bean_005fwrite_005f27(_jspx_th_logic_005fequal_005f13, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t     </b>\r\n");
        out.write("\t\t\t\t\t\t\t   ");
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

  private boolean _jspx_meth_bean_005fwrite_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f26 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f26.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
    // /jsp/prevent/PRV001.jsp(450,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f26.setName("item");
    // /jsp/prevent/PRV001.jsp(450,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f26.setProperty("mortageCancelNoteDisp");
    int _jspx_eval_bean_005fwrite_005f26 = _jspx_th_bean_005fwrite_005f26.doStartTag();
    if (_jspx_th_bean_005fwrite_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f27 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f27.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
    // /jsp/prevent/PRV001.jsp(451,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f27.setName("item");
    // /jsp/prevent/PRV001.jsp(451,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f27.setProperty("mortageCancelDate");
    int _jspx_eval_bean_005fwrite_005f27 = _jspx_th_bean_005fwrite_005f27.doStartTag();
    if (_jspx_th_bean_005fwrite_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(456,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f14.setValue("true");
    // /jsp/prevent/PRV001.jsp(456,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f14.setName("item");
    // /jsp/prevent/PRV001.jsp(456,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f14.setProperty("mortageCancelFlag");
    int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
    if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f28(_jspx_th_logic_005fequal_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<br />\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f29(_jspx_th_logic_005fequal_005f14, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<br />\r\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_bean_005fwrite_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f28 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f28.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
    // /jsp/prevent/PRV001.jsp(457,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f28.setName("item");
    // /jsp/prevent/PRV001.jsp(457,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f28.setProperty("mortageCancelDateDisp");
    int _jspx_eval_bean_005fwrite_005f28 = _jspx_th_bean_005fwrite_005f28.doStartTag();
    if (_jspx_th_bean_005fwrite_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f29 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f29.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
    // /jsp/prevent/PRV001.jsp(459,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f29.setName("item");
    // /jsp/prevent/PRV001.jsp(459,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f29.setProperty("mortageCancelNoteDisp");
    // /jsp/prevent/PRV001.jsp(459,8) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f29.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f29 = _jspx_th_bean_005fwrite_005f29.doStartTag();
    if (_jspx_th_bean_005fwrite_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f30 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f30.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(463,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f30.setName("item");
    // /jsp/prevent/PRV001.jsp(463,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f30.setProperty("cancelDescription");
    int _jspx_eval_bean_005fwrite_005f30 = _jspx_th_bean_005fwrite_005f30.doStartTag();
    if (_jspx_th_bean_005fwrite_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f31 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f31.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(467,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f31.setName("item");
    // /jsp/prevent/PRV001.jsp(467,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f31.setProperty("notaryPerson");
    int _jspx_eval_bean_005fwrite_005f31 = _jspx_th_bean_005fwrite_005f31.doStartTag();
    if (_jspx_th_bean_005fwrite_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
    return false;
  }

  private boolean _jspx_meth_logic_005fempty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f1 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_005fempty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fempty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(468,38) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fempty_005f1.setName("item");
    // /jsp/prevent/PRV001.jsp(468,38) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fempty_005f1.setProperty("contractId");
    int _jspx_eval_logic_005fempty_005f1 = _jspx_th_logic_005fempty_005f1.doStartTag();
    if (_jspx_eval_logic_005fempty_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f32(_jspx_th_logic_005fempty_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fempty_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fempty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fempty_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f32 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f32.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fempty_005f1);
    // /jsp/prevent/PRV001.jsp(470,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f32.setName("item");
    // /jsp/prevent/PRV001.jsp(470,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f32.setProperty("notaryOfficeName");
    int _jspx_eval_bean_005fwrite_005f32 = _jspx_th_bean_005fwrite_005f32.doStartTag();
    if (_jspx_th_bean_005fwrite_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f4 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    // /jsp/prevent/PRV001.jsp(471,21) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEmpty_005f4.setName("item");
    // /jsp/prevent/PRV001.jsp(471,21) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotEmpty_005f4.setProperty("contractId");
    int _jspx_eval_logic_005fnotEmpty_005f4 = _jspx_th_logic_005fnotEmpty_005f4.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_html_005flink_005f23(_jspx_th_logic_005fnotEmpty_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f23 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f23.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f4);
    // /jsp/prevent/PRV001.jsp(472,7) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f23.setAction("/contractdetailview.do");
    // /jsp/prevent/PRV001.jsp(472,7) name = paramId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f23.setParamId("cid");
    // /jsp/prevent/PRV001.jsp(472,7) name = paramName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f23.setParamName("item");
    // /jsp/prevent/PRV001.jsp(472,7) name = paramProperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f23.setParamProperty("contractId");
    int _jspx_eval_html_005flink_005f23 = _jspx_th_html_005flink_005f23.doStartTag();
    if (_jspx_eval_html_005flink_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f23.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    Xem chi tiết\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_html_005flink_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction.reuse(_jspx_th_html_005flink_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fparamProperty_005fparamName_005fparamId_005faction.reuse(_jspx_th_html_005flink_005f23);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f5 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f5.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f1);
    // /jsp/prevent/PRV001.jsp(482,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f5.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(482,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f5.setProperty("totalCountProperty");
    // /jsp/prevent/PRV001.jsp(482,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f5.setValue("0");
    int _jspx_eval_logic_005fgreaterThan_005f5 = _jspx_th_logic_005fgreaterThan_005f5.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div id=\"propertyListPager\" class=\"pager\">\r\n");
        out.write("\t\t\t<div class=\"pager-total\">Tổng số <strong>");
        if (_jspx_meth_bean_005fwrite_005f33(_jspx_th_logic_005fgreaterThan_005f5, _jspx_page_context))
          return true;
        out.write("</strong> dữ\r\n");
        out.write("\t\t\tliệu</div>\r\n");
        out.write("\t\t\t<div>");
        if (_jspx_meth_logic_005fgreaterThan_005f6(_jspx_th_logic_005fgreaterThan_005f5, _jspx_page_context))
          return true;
        out.write(" <span> Trang&nbsp; ");
        if (_jspx_meth_html_005ftext_005f4(_jspx_th_logic_005fgreaterThan_005f5, _jspx_page_context))
          return true;
        out.write(' ');
        out.write('/');
        if (_jspx_meth_bean_005fwrite_005f34(_jspx_th_logic_005fgreaterThan_005f5, _jspx_page_context))
          return true;
        out.write(" </span> ");
        if (_jspx_meth_logic_005fgreaterThan_005f7(_jspx_th_logic_005fgreaterThan_005f5, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f33 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f33.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f5);
    // /jsp/prevent/PRV001.jsp(485,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f33.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(485,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f33.setProperty("totalCountProperty");
    int _jspx_eval_bean_005fwrite_005f33 = _jspx_th_bean_005fwrite_005f33.doStartTag();
    if (_jspx_th_bean_005fwrite_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f6 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f6.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f5);
    // /jsp/prevent/PRV001.jsp(488,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f6.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(488,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f6.setProperty("totalPageProperty");
    // /jsp/prevent/PRV001.jsp(488,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f6.setValue("1");
    int _jspx_eval_logic_005fgreaterThan_005f6 = _jspx_th_logic_005fgreaterThan_005f6.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f24(_jspx_th_logic_005fgreaterThan_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f25(_jspx_th_logic_005fgreaterThan_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f24 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f24.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f6);
    // /jsp/prevent/PRV001.jsp(490,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f24.setHref("javascript:directionProperty('first')");
    int _jspx_eval_html_005flink_005f24 = _jspx_th_html_005flink_005f24.doStartTag();
    if (_jspx_eval_html_005flink_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f24.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-first\" src=\"./image/first.png\" alt=\"first\" />\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f24);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f25 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f25.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f6);
    // /jsp/prevent/PRV001.jsp(493,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f25.setHref("javascript:directionProperty('ahead')");
    int _jspx_eval_html_005flink_005f25 = _jspx_th_html_005flink_005f25.doStartTag();
    if (_jspx_eval_html_005flink_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f25.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-prev\" src=\"./image/prev.png\" alt=\"prev\" />\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f25);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f5);
    // /jsp/prevent/PRV001.jsp(496,43) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(496,43) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setStyleId("pagePropertyNum");
    // /jsp/prevent/PRV001.jsp(496,43) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setProperty("pageProperty");
    // /jsp/prevent/PRV001.jsp(496,43) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setMaxlength("9");
    // /jsp/prevent/PRV001.jsp(496,43) name = style type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setStyle("width:60px");
    // /jsp/prevent/PRV001.jsp(496,43) name = onblur type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setOnblur("checkPaging=0;");
    // /jsp/prevent/PRV001.jsp(496,43) name = onfocus type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setOnfocus("checkPaging=2;");
    // /jsp/prevent/PRV001.jsp(496,43) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f4.setOnchange("javascript: pagingProperty(this.value)");
    int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
    if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyle_005fproperty_005fonfocus_005fonchange_005fonblur_005fname_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f34 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f34.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f5);
    // /jsp/prevent/PRV001.jsp(497,164) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f34.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(497,164) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f34.setProperty("totalPageProperty");
    // /jsp/prevent/PRV001.jsp(497,164) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f34.setFormat("##########");
    int _jspx_eval_bean_005fwrite_005f34 = _jspx_th_bean_005fwrite_005f34.doStartTag();
    if (_jspx_th_bean_005fwrite_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
    return false;
  }

  private boolean _jspx_meth_logic_005fgreaterThan_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:greaterThan
    org.apache.struts.taglib.logic.GreaterThanTag _jspx_th_logic_005fgreaterThan_005f7 = (org.apache.struts.taglib.logic.GreaterThanTag) _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.GreaterThanTag.class);
    _jspx_th_logic_005fgreaterThan_005f7.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fgreaterThan_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f5);
    // /jsp/prevent/PRV001.jsp(499,35) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f7.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(499,35) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f7.setProperty("totalPageProperty");
    // /jsp/prevent/PRV001.jsp(499,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fgreaterThan_005f7.setValue("1");
    int _jspx_eval_logic_005fgreaterThan_005f7 = _jspx_th_logic_005fgreaterThan_005f7.doStartTag();
    if (_jspx_eval_logic_005fgreaterThan_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f26(_jspx_th_logic_005fgreaterThan_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f27(_jspx_th_logic_005fgreaterThan_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fgreaterThan_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fgreaterThan_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fgreaterThan_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fgreaterThan_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f26 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f26.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f7);
    // /jsp/prevent/PRV001.jsp(501,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f26.setHref("javascript:directionProperty('next')");
    int _jspx_eval_html_005flink_005f26 = _jspx_th_html_005flink_005f26.doStartTag();
    if (_jspx_eval_html_005flink_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f26.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f26.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-next\" src=\"./image/next.png\" alt=\"next\" />\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f26 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f26);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fgreaterThan_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f27 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f27.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fgreaterThan_005f7);
    // /jsp/prevent/PRV001.jsp(504,4) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005flink_005f27.setHref("javascript:directionProperty('end')");
    int _jspx_eval_html_005flink_005f27 = _jspx_th_html_005flink_005f27.doStartTag();
    if (_jspx_eval_html_005flink_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f27.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<img class=\"pager-last\" src=\"./image/last.png\" alt=\"last\" />\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005fhref.reuse(_jspx_th_html_005flink_005f27);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(512,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f4.setProperty("direction");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /jsp/prevent/PRV001.jsp(513,1) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f5.setProperty("sortType");
    // /jsp/prevent/PRV001.jsp(513,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f5.setName("preventListViewHelper");
    // /jsp/prevent/PRV001.jsp(513,1) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f5.setStyleId("sortType");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
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
        if (_jspx_meth_logic_005fequal_005f15(_jspx_th_logic_005fpresent_005f3, _jspx_page_context))
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

  private boolean _jspx_meth_logic_005fequal_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f15 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f15.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f3);
    // /jsp/common/footer.jsp(6,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f15.setValue("false");
    // /jsp/common/footer.jsp(6,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f15.setName("CommonContext");
    // /jsp/common/footer.jsp(6,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f15.setProperty("loginFromClient");
    int _jspx_eval_logic_005fequal_005f15 = _jspx_th_logic_005fequal_005f15.doStartTag();
    if (_jspx_eval_logic_005fequal_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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

  private boolean _jspx_meth_bean_005fwrite_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f35 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f35.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f16);
    // /jsp/prevent/PRV001.jsp(807,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f35.setName("item");
    // /jsp/prevent/PRV001.jsp(807,50) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f35.setProperty("info");
    // /jsp/prevent/PRV001.jsp(807,50) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f35.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f35 = _jspx_th_bean_005fwrite_005f35.doStartTag();
    if (_jspx_th_bean_005fwrite_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f36 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f36.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f17);
    // /jsp/prevent/PRV001.jsp(810,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f36.setName("item");
    // /jsp/prevent/PRV001.jsp(810,50) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f36.setProperty("lucenePropertyInfo");
    // /jsp/prevent/PRV001.jsp(810,50) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f36.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f36 = _jspx_th_bean_005fwrite_005f36.doStartTag();
    if (_jspx_th_bean_005fwrite_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f37 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f37.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
    // /jsp/prevent/PRV001.jsp(819,51) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f37.setName("item");
    // /jsp/prevent/PRV001.jsp(819,51) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f37.setProperty("relationObjectDisp");
    // /jsp/prevent/PRV001.jsp(819,51) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f37.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f37 = _jspx_th_bean_005fwrite_005f37.doStartTag();
    if (_jspx_th_bean_005fwrite_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f38 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f38.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f18);
    // /jsp/prevent/PRV001.jsp(820,51) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f38.setName("item");
    // /jsp/prevent/PRV001.jsp(820,51) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f38.setProperty("transactionContentDisp");
    // /jsp/prevent/PRV001.jsp(820,51) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f38.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f38 = _jspx_th_bean_005fwrite_005f38.doStartTag();
    if (_jspx_th_bean_005fwrite_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f39 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f39.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
    // /jsp/prevent/PRV001.jsp(823,51) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f39.setName("item");
    // /jsp/prevent/PRV001.jsp(823,51) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f39.setProperty("luceneRelationObject");
    // /jsp/prevent/PRV001.jsp(823,51) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f39.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f39 = _jspx_th_bean_005fwrite_005f39.doStartTag();
    if (_jspx_th_bean_005fwrite_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f40 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f40.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f19);
    // /jsp/prevent/PRV001.jsp(825,51) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f40.setName("item");
    // /jsp/prevent/PRV001.jsp(825,51) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f40.setProperty("luceneTransactionContent");
    // /jsp/prevent/PRV001.jsp(825,51) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f40.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f40 = _jspx_th_bean_005fwrite_005f40.doStartTag();
    if (_jspx_th_bean_005fwrite_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f41 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f41.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f7);
    // /jsp/prevent/PRV001.jsp(830,94) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f41.setName("item");
    // /jsp/prevent/PRV001.jsp(830,94) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f41.setProperty("contractPeriod");
    // /jsp/prevent/PRV001.jsp(830,94) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f41.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f41 = _jspx_th_bean_005fwrite_005f41.doStartTag();
    if (_jspx_th_bean_005fwrite_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f42 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f42.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f21);
    // /jsp/prevent/PRV001.jsp(842,78) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f42.setName("item");
    // /jsp/prevent/PRV001.jsp(842,78) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f42.setProperty("mortageCancelDateDisp");
    // /jsp/prevent/PRV001.jsp(842,78) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f42.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f42 = _jspx_th_bean_005fwrite_005f42.doStartTag();
    if (_jspx_th_bean_005fwrite_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f43 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f43.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f21);
    // /jsp/prevent/PRV001.jsp(843,78) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f43.setName("item");
    // /jsp/prevent/PRV001.jsp(843,78) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f43.setProperty("mortageCancelNoteDisp");
    // /jsp/prevent/PRV001.jsp(843,78) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f43.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f43 = _jspx_th_bean_005fwrite_005f43.doStartTag();
    if (_jspx_th_bean_005fwrite_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f44 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f44.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f4);
    // /jsp/prevent/PRV001.jsp(846,77) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f44.setName("item");
    // /jsp/prevent/PRV001.jsp(846,77) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fwrite_005f44.setProperty("cancelDescription");
    int _jspx_eval_bean_005fwrite_005f44 = _jspx_th_bean_005fwrite_005f44.doStartTag();
    if (_jspx_th_bean_005fwrite_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
    return false;
  }
}
