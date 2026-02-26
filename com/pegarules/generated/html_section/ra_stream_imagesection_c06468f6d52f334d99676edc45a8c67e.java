package com.pegarules.generated.html_section;
/*
 * Copyright (c) 2026 Pegasystems Inc.
 * All rights reserved.
 *
 * This software is governed by a License Agreement that restricts its
 * use.  The software contains valuable trade secrets and proprietary
 * information of Pegasystems Inc and is protected by federal copyright
 * law.  It may not be copied, modified, translated or distributed in any
 * form or medium, disclosed to third parties or used in any manner not
 * expressly provided for in said License Agreement except with written
 * authorization from Pegasystems Inc.
*/
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.jsptags.TagTools;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.ComplexParameterPage;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderSection;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.generator.*;
import com.pega.pegarules.pub.infengine.*;
import com.pega.pegarules.pub.presence.*;
import com.pega.pegarules.pub.runtime.*;
import com.pega.pegarules.pub.services.*;
import com.pega.pegarules.pub.util.*;
import com.pega.platform.clipboard.query.PageListQuery;
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.PropertyQuery;
import com.pega.platform.clipboard.query.ScalarListQuery;
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.executionengine.runtime.Loadtime;
import com.pegarules.generated.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream DATA-ADMIN-OPERATOR-ID!IMAGESECTION.
 */
public class ra_stream_imagesection_c06468f6d52f334d99676edc45a8c67e extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.ImageSection.Data_Admin_Operator_ID.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 309888784;
private static boolean pz_isValidAssembly= true;
/** The current stream builder. */
	/** Properties of the stream definition for the stream that included the current stream (or null if none). */
	private Map mParentStreamProperties = null;

	/** The handle of the current stream. */
	protected String pz_CurrentRuleKey;
private IControlRuntimeUtilities controlRuntimeUtilities = null;

/**
 * Creates a stream builder.
 *
 * @param aContext the current executable
 */
	public ra_stream_imagesection_c06468f6d52f334d99676edc45a8c67e(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
		initAssemblyParameters(tools);
	}
public static Map<String, AssemblyParameters> getAssemblyParametersMap(StreamBuilderToolKit tools) {		
 initAssemblyParameters(tools);	
 Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();	
 clone.putAll(oAssemblyParamsMap);	
 return clone;
}
public static void initAssemblyParameters(StreamBuilderToolKit tools) { 
	try {
		if(oAssemblyParamsMap == null || oAssemblyParamsMap.isEmpty()){
			oAssemblyParamsMap = tools.getControlUtilities().getAssemblyParamsMap(oControlPathsMap, tools, oCellRuntimeParamsMap, pxUniqueStreamHash);
		if(oAssemblyParamsMap != null && !oAssemblyParamsMap.isEmpty()){
			oControlPathsMap = null;
			oCellRuntimeParamsMap = null;
		}
		}
	} catch(IllegalStateException e) {
	pz_isValidAssembly = false;
	}
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "1a427ca24489756728ce746a92630454f4f7e126";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	if(!pz_isValidAssembly){
	throw new PRRuntimeException("Invalid Section Assembly ");
	}
previousTemplatingStatus = '\0';
	pzAuto.beginStream(pega);
	initRequiredPages();
pageContext = pega.getJSPFactory().getPageContext(mHttpServlet, request, mStreamResponse, null, true, 0, true);
application = pageContext.getServletContext();
out = pageContext.getOut();
session = pageContext.getSession();
mStreamResponse.setContentType("text/html;charset=UTF-8");
try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "1a427ca24489756728ce746a92630454f4f7e126";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("ImageSection",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, true, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
pxIsNonTemplateStream = true;
pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_1");
/*
 * Begin RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT */
}
	} catch (Throwable ex) {
		handleError(ex);
	} finally {
		pzAuto.finishStream();
		if (pega.getJSPFactory() != null) {
			pega.getJSPFactory().releasePageContext(pageContext);
		}
		pega.returnHTTPServletRequest(request);
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:IMAGESECTION", 
	"Rule-Obj-Property:PYIMAGEFILENAME"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("IMAGESECTION","Rule-HTML-Section","DATA-ADMIN-OPERATOR-ID",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT","!IMAGESECTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",309888784), 
		new DependentRuleInfo("PYIMAGEFILENAME","Rule-Obj-Property","DATA-ADMIN-OPERATOR-ID",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY DATA-ADMIN-OPERATOR-ID PYIMAGEFILENAME #20180713T131219.327 GMT","!PYIMAGEFILENAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}


//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT:20180713T135150.729 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-OBJ-PROPERTY DATA-ADMIN-OPERATOR-ID PYIMAGEFILENAME #20180713T131219.327 GMT:20180713T131219.327 GMT
//	RULE-OBJ-PROPERTY DATA-ADMIN-OPERATOR-ID PYIMAGEFILENAME #20180713T131219.327 GMT:20180713T131219.327 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "2eef0eb35328e193d3a41148e221a968";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-ID";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:contentURL tag.
 */private boolean _jspx_meth_pega_contentURL__1(PageContext aPageContext, java.lang.String aName, java.lang.String aPath, java.lang.String aClassType, java.lang.String aEnforceAbsoluteURL) throws Throwable {
/* pega:contentURL */
com.pega.pegarules.jsptags.ContentURLTag _jspx_th_pega_contentURL_ = (com.pega.pegarules.jsptags.ContentURLTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ContentURLTag.class);
_jspx_th_pega_contentURL_.setPageContext(pageContext);
_jspx_th_pega_contentURL_.setParent(mParentTag);
_jspx_th_pega_contentURL_.setName(aName);
_jspx_th_pega_contentURL_.setPath(aPath);
_jspx_th_pega_contentURL_.setClassType(aClassType);
_jspx_th_pega_contentURL_.setEnforceAbsoluteURL(aEnforceAbsoluteURL);
int _jspx_eval_pega_contentURL_ = _jspx_th_pega_contentURL_.doStartTag();
if (_jspx_th_pega_contentURL_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_contentURL_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private void performStream_1() throws Throwable {

	long maxFileSize = 0;
	String strMaxFileSizeDSS = "prconfig/Initialization/MaximumFileUploadSizeMB/default";
	String strMaxFileSizeMB = tools.getSystemSettings().getDynamic("Pega-Engine", strMaxFileSizeDSS);
	strMaxFileSizeMB = strMaxFileSizeMB == null || strMaxFileSizeMB.equals("") ? "0" : strMaxFileSizeMB;
	try 
	{
		maxFileSize = Integer.parseInt(strMaxFileSizeMB);
		maxFileSize = maxFileSize * 1048576; // Mega bytes to bytes
	}
	catch(NumberFormatException NFE) {}

tools.appendString("\n  \n <script>\nfunction CheckRequiredFields()\n{ \n\tdocument.getElementById(\"badFileTypeError\").style.display=\"none\";\n    document.getElementById(\"FileSizeExceeded\").style.display=\"none\";\n\tvar formObj=document.forms[0];\n\tformObj.encoding=\"multipart/form-data\";\n    var fileobject = document.getElementById(\"fileimage\");\n\tvar filepath = new String( document.getElementById(\"fileimage\").value);\n\tif(filepath.length>0)\n\t{\n\t\tvar temp = filepath.split(\"\\\\\");\n\t\tvar file = new String(temp[temp.length-1]);\n\t\tvar fileExt = file.substring(file.lastIndexOf(\".\")+1).toLowerCase();\n\t\tif ( fileExt == \"jpg\"|| fileExt==\"png\" || fileExt==\"gif\" || fileExt == \"jpeg\")\n\t\t{\n          \tif (window.File && window.FileReader && window.FileList && window.Blob)\n\t\t\t{\n\t\t\t\tvar files=fileobject.files;\n\t\t\t\tfor(i=0;i<files.length;i++)\n\t\t\t\t{\n\t\t\t\t\tvar fileName = files[i].name;\n\t\t\t\t\tif(!fileName || fileName==\"\") \n\t\t\t\t\tfileName= files[i].value;\n\t\t\t\t\tvar size=files[i].size;\n\t\t\t\t\tif(");
out.print(maxFileSize);
tools.appendString(" > 0 && size >= ");
out.print(maxFileSize);
tools.appendString(")\n\t\t\t\t\t{\n                      \tdocument.getElementById(\"FileSizeExceeded\").style.display=\"block\";\n\t\t\t\t\t\treturn false;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\t");
 tools.putSaveValue("RH_PgName" ,tools.getPrimaryPage().getName());
tools.appendString(" \n\t\t\tvar rh_page=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RH_PgName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(RH_PgName)")) {
	return;
}
tools.appendString("\";\n\t\t\tvar oSafeUrl = new SafeURL();\n\t\t\toSafeUrl.put(\"pyActivity\" ,\"Data-Admin-Operator-ID.UploadImage\");\n\t\t\toSafeUrl.put(\"RHPage\",rh_page ); \n\t\t\tvar callback={ \n\t\t\t\tfailure: function (oResponse) \n\t\t\t\t{\n\t\t\t\t\talert(\"Failed To Upload File\"  + oResponse.status);\n\t\t\t\t},\n\t\t\t\tupload: function (oResponse) \n\t\t\t\t{\n\t\t\t\t\talert(\"Image uploaded… Please save the operator record\");\n\t\t\t\t}\n\t\t\t};\n\t\t\tpega.util.Connect.setForm(formObj, true);\n\t\t\tvar request = pega.util.Connect.asyncRequest('POST', oSafeUrl.toURL(),callback, null);\n\t\t\tpega.util.Connect.handleReadyState(request,callback);\t\n\t\t\treturn true;\n\t\t}\n\t\telse\n\t\t{\n\t\t\tdocument.getElementById(\"badFileTypeError\").style.display=\"block\";\n\t\t\treturn false;\n\t\t}\n\t}\n\telse{\n\t\talert(\"Please select any Image to Upload\");\n\t}\n\treturn false;\n} \nfunction deleteImage()\n{\n\n\t");
tools.putSaveValue("RH_PgName" ,tools.getPrimaryPage().getName());
tools.appendString(" \n\tvar rh_page=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RH_PgName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(RH_PgName)")) {
	return;
}
tools.appendString("\";\n\tvar oSafeUrl = new SafeURL();\n\toSafeUrl.put(\"pyActivity\" ,\"Data-Admin-Operator-ID.DeleteOprImage\");\n\toSafeUrl.put(\"RHPage\",rh_page );\n\tvar callback={ \n\t\t\tfailure: function (oResponse) \n\t\t\t{\n\t\t\t\talert(\"Failed To Process DeleteOprImage Activity\"  + oResponse.status);\n\t\t\t},\n\t\t\tsuccess: function (oResponse) \n\t\t\t{  \n\t\t\t\tvar responsevalue= oResponse.responseText;\n                                     if(responsevalue==\"true\")\n\t\t\t\t{\n\t\t\t\t\tvar imgdiv=document.getElementById(\"operatorImage\"); \n\t\t\t\t\timgdiv.innerHTML=\"\";\n\t\t\t\t\timgdiv.className=\"operatorImg\";\n\t\t\t\t\tdocument.getElementById(\"deleteButton\").style.display=\"none\";\n\t\t\t\t\timgdiv=null;\n\t\t\t\t}                                    \n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\talert(\"Unable to delete Image\");\n\t\t\t\t} \n\t\t\t}\n\t\t};\n\tvar request = pega.util.Connect.asyncRequest('POST', oSafeUrl.toURL(),callback, null);\n\tpega.util.Connect.handleReadyState(request,callback);\t\n\treturn true;\n}\n\nfunction image_onload(){\n\tvar imgdiv=document.getElementById(\"operatorImage\"); \n\tvar filename=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyImageFileName")) {
	return;
}
tools.appendString("\".replace(/^\\s+|\\s+$/g, '') ;\n        var currentTime=new Date().getTime();\n\t");
 tools.putParamValue("imgname" ,tools.getPrimaryPage().getProperty(".pyImageFileName").getStringValue()); 
tools.appendString("  \n\n\t\n\tif(filename.length>0) {\n\t\tvar checkImageExists=\"");
if (_jspx_meth_pega_contentURL__1(pageContext, "param.imgname", "/operatorimages/", "Image", "false")) {
	return;
}
tools.appendString("\";\n\t\tif(checkImageExists.match(\"ERROR:\")==null){\n\t\t\t\n\t\t\timgdiv.innerHTML='<img src=\"");
if (_jspx_meth_pega_contentURL__1(pageContext, "param.imgname", "/operatorimages/", "Image", "false")) {
	return;
}
tools.appendString("?'+currentTime+'\" onerror=\"this.parentNode.className=\\'operatorImg\\'; this.parentNode.innerHTML=\\'\\'; document.getElementById(\\'deleteButton\\').style.display=\\'none\\';\" width=\"60px\" height=\"60px\" border=\"1px\" ></img>';\n           \n\t\t}\n\t\telse {\n\t\t\tcheckImageExists=\"");
if (_jspx_meth_pega_contentURL__1(pageContext, "param.imgname", "/webwb/", "Image", "false")) {
	return;
}
tools.appendString("\";\n\t\t\tif(checkImageExists.match(\"ERROR:\")==null){\n\t\t\t\t\n\t\t\t\timgdiv.innerHTML='<img src=\"");
if (_jspx_meth_pega_contentURL__1(pageContext, "param.imgname", "/webwb/", "Image", "false")) {
	return;
}
tools.appendString("?'+currentTime+'\" onerror=\"this.parentNode.className=\\'operatorImg\\'; this.parentNode.innerHTML=\\'\\'; document.getElementById(\\'deleteButton\\').style.display=\\'none\\';\" width=\"60px\" height=\"60px\" border=\"1px\" ></img>'; \n              \n\t\t\t}\n\t\t\telse{\n\t\t\t\tdocument.getElementById(\"deleteButton\").style.display=\"none\";    \n\t\t\t\timgdiv.className=\"operatorImg\";   \n\t\t\t}\n\n\t\t}\n\t}else{\n\t\tvar delButton = document.getElementById(\"deleteButton\");\n\t\tif(delButton!=null){\n\t\t\tdelButton.style.display=\"none\";\n\t\t}\n\t\timgdiv.className=\"operatorImg\";\n\t}\n}\nif(typeof(pega)!=\"undefined\")\npega.util.Event.onDOMReady(image_onload);\n</script>\n<style>\n.operatorImg{\n\twidth:60px;\n\theight:60px;\n\tbackground-Image:url(\"desktopimages/dialogprofileimage.gif\");\n\tbackground-repeat:no-repeat;\n}\n</style>\n<!-- form table -->\n<table>\n<tr>\n\t<td rowspan=2>\n\t\t<div id=\"operatorImage\" ></div>\n\t</td>\n\t<td>\n\t\t<input id=\"fileimage\" contentEditable=\"false\" name=\"testImage\" type=\"file\" size=\"15\"  value=\"\" />\n\t</td> \n</tr>\n<tr>\n\t<td  nowrap align=\"left\">\n\t\t<input type=\"button\" id=\"uploadButton\" title =\"Upload Image File\" onclick=\"CheckRequiredFields()\"  value='");
out.print(tools.getLocalizedTextForString(".pyCaption","Upload Image",StreamBuilder.FMT_NORMAL));
tools.appendString("' />\n\t\t<input type=\"button\" id=\"deleteButton\" title =\"Delete the Image\" onclick=\"deleteImage()\"  value='");
out.print(tools.getLocalizedTextForString(".pyCaption","Delete Image",StreamBuilder.FMT_NORMAL));
tools.appendString("' />\n\t</td>\n</tr>\n</table>\n\n<div id=\"badFileTypeError\" style=\"display:none;color:red;\">Please select png or jpg or gif files only </div>\n<div id=\"FileSizeExceeded\" style=\"display:none;color:red;\">Image size should not exceed ");
out.print(strMaxFileSizeMB);
tools.appendString("  MB </div>");
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Data-Admin-Operator-ID.pyImageFileName", new LiteweightPropertyDefinition("Data-Admin-Operator-ID", "pyImageFileName", "sTN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Data-Admin-Operator-ID");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "ImageSection");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID IMAGESECTION #20180713T135150.729 GMT", "Data-Admin-Operator-ID ImageSection", "Pega-Desktop", "08-01-01", "20180713T135150.729 GMT");
}
