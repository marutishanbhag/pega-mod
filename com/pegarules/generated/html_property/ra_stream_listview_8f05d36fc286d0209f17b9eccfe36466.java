package com.pegarules.generated.html_property;
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
import com.pega.pegarules.priv.util.JSPResponse;
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
 * Builds JSP stream LISTVIEW.
 */
public class ra_stream_listview_8f05d36fc286d0209f17b9eccfe36466 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.ListView.Stream");
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
	public ra_stream_listview_8f05d36fc286d0209f17b9eccfe36466(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "1308c1efbb41d112e9167fc5f2b70d9d4d818951";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
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
/* Instance RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT */
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
	"Rule-HTML-Property:LISTVIEW"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("LISTVIEW","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT","LISTVIEW",true,false,"ABSOLUTE_CLASSLESS",1937005688)
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
//	RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT:20180713T133433.117 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "48f3742df3b15f5de8fd99f3532a3b22";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName, java.lang.String aMode) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
/**
 * Implements a p:param tag.
 */private boolean _jspx_meth_p_param__1(PageContext aPageContext, java.lang.String aName, java.lang.String aRef) throws Throwable {
/* p:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_p_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_p_param_.setPageContext(pageContext);
_jspx_th_p_param_.setParent(mParentTag);
_jspx_th_p_param_.setName(aName);
_jspx_th_p_param_.setRef(aRef);
int _jspx_eval_p_param_ = _jspx_th_p_param_.doStartTag();
if (_jspx_th_p_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_param_);
return false;
}
private void performStream_1() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (!areValsEqual(tools.getProperty("pxRequestor.pyPegaDesignMode").getStringValue(), "true")))) {
tools.appendString(" ");
 try { 
tools.appendString(" ");
/* pega:listView */
com.pega.pegarules.jsptags.ListViewTag _jspx_th_pega_listView__1 = (com.pega.pegarules.jsptags.ListViewTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ListViewTag.class);
_jspx_th_pega_listView__1.setPageContext(pageContext);
_jspx_th_pega_listView__1.setParent(mParentTag);
_jspx_th_pega_listView__1.setName("param.name");
_jspx_th_pega_listView__1.setClassName("param.appliesTo");
_jspx_th_pega_listView__1.setHeader("param.header");
_jspx_th_pega_listView__1.setAction("param.action");
_jspx_th_pega_listView__1.setMaxRecords("param.maxRecords");
_jspx_th_pega_listView__1.setRemovePages("param.removePages");
_jspx_th_pega_listView__1.setIncludeStyles("param.includeStyles");
int _jspx_eval_pega_listView__1 = _jspx_th_pega_listView__1.doStartTag();
if (_jspx_eval_pega_listView__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_listView__1;
tools.appendString(" ");
if (_jspx_meth_p_param__1(pageContext, "DoNotIncludeWorkFormStandard", "param.DoNotIncludeWorkFormStandard")) {
	return;
}
tools.appendString(" ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("reportParameters"), ""))) {
tools.appendString(" ");

				String addParams = tools.getParamValue("reportParameters");
				String[] paramsArray = addParams.split("&");
				for (int i=0; i < paramsArray.length; i++)
				{
					String strParam = paramsArray[i];
					if (!strParam.equals(""))
					{
						String[] strParamArray = strParam.split("=");
						String strParamName = strParamArray[0];
						String strParamValue = strParamArray[1];
						if (!strParamName.equals(""))
						{
							boolean isRef = false;
							if (strParamValue.toLowerCase().startsWith("param."))
								isRef = true;
							else if (strParamValue.startsWith("\"") && strParamValue.endsWith("\""))
							{
								strParamValue = strParamValue.substring(1, strParamValue.length()-1 );
								isRef = false;
							}
							else if (strParamValue.indexOf(".") > -1 && strParamValue.indexOf("@") == -1)
							{
								isRef = true;
							}
							if (isRef )
							{				
			
tools.appendString(" ");
/* p:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_p_param__1 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_p_param__1.setPageContext(pageContext);
_jspx_th_p_param__1.setParent(mParentTag);
_jspx_th_p_param__1.setName(strParamName);
_jspx_th_p_param__1.setRef(strParamValue);
int _jspx_eval_p_param__1 = _jspx_th_p_param__1.doStartTag();
if (_jspx_th_p_param__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_param__1);
tools.appendString(" ");

							}
							else
							{
			
tools.appendString(" ");
/* p:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_p_param__2 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_p_param__2.setPageContext(pageContext);
_jspx_th_p_param__2.setParent(mParentTag);
_jspx_th_p_param__2.setName(strParamName);
_jspx_th_p_param__2.setValue(strParamValue);
int _jspx_eval_p_param__2 = _jspx_th_p_param__2.doStartTag();
if (_jspx_th_p_param__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_param__2);
tools.appendString(" ");

							}
						}
					}
				}
			
			
tools.appendString(" ");
	}
tools.appendString(" ");
mParentTag = prevParentTag_1;
		int evalDoAfterBody = _jspx_th_pega_listView__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_listView__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_listView__1);
tools.appendString(" ");


} catch (Exception e) {
	if (e.getMessage().indexOf("not authorized") > -1) {
		out.println("You are not authorized to view this list.");
	}
}

tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" <center> <span style=\"padding-left:20px; padding-right:20px;position:relative; top:36%\"><span style=\"border:1px solid black; padding: 3px;\" >");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.name", "display")) {
	return;
}
tools.appendString("</span></span> </center> <table cellspacing=\"0\" cellpadding=\"0\" style=\"border:1px solid black\" height=\"90%\" width=\"100%\"> <tr> <td align=\"center\" style=\"color:white; font-weight:bold; background-color:DarkGray\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"> <tr> <td style=\"border: 1px solid Gray;\">&nbsp;</td> <td style=\"border: 1px solid Gray;\">&nbsp;</td> <td style=\"border: 1px solid Gray;\">&nbsp;</td> <td style=\"border: 1px solid Gray;\">&nbsp;</td> <td style=\"border: 1px solid Gray;\">&nbsp;</td> </tr> </table> </td> </tr> <tr> <td style=\"background-color:WhiteSmoke\">&nbsp;</td> </tr> <tr> <td style=\"background-color:LightGrey\">&nbsp;</td> </tr> <tr> <td style=\"background-color:WhiteSmoke\">&nbsp;</td> </tr> <tr> <td style=\"background-color:LightGrey\">&nbsp;</td> </tr> <tr> <td style=\"background-color:WhiteSmoke\">&nbsp;</td> </tr> <tr> <td style=\"background-color:LightGrey\">&nbsp;</td> </tr> <tr> <td style=\"background-color:WhiteSmoke\">&nbsp;</td> </tr> <tr> <td style=\"background-color:LightGrey\">&nbsp;</td> </tr> <tr> <td style=\"background-color:WhiteSmoke\">&nbsp;</td> </tr> <tr> <td style=\"background-color:LightGrey\">&nbsp;</td> </tr> <tr> <td style=\"background-color:WhiteSmoke\">&nbsp;</td> </tr> </table> ");
}
tools.appendString(" ");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "ListView");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentTag = null;
	mStreamResponse = (JSPResponse) tools;
	mHttpServlet = aContext == null ? null : (HttpServlet) aContext.getHttpServlet();
	request = aContext == null ? null : (HttpServletRequest)aContext.getHttpServletRequest();
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Property");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY LISTVIEW #20180713T133433.117 GMT", "ListView", "Pega-Gadgets", "08-01-01", "20180713T133433.117 GMT");
}
