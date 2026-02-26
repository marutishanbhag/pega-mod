package com.pegarules.generated.html;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
/**
 * Builds JSP stream @BASECLASS!PZUNKNOWNSESSIONALERT.
 */
public class ra_stream_pzunknownsessionalert_1e7e8032b8b51f76d3a59933e112e117 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_HTML.pzUnknownSessionAlert._baseclass.Stream");
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
	public ra_stream_pzunknownsessionalert_1e7e8032b8b51f76d3a59933e112e117(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "6c7025e09d8aed2a2a60dfee56a8678fa28e38e4";
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
/* Instance RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT	Pega-EndUserUI:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
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
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT */
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
	"Rule-Obj-HTML:PZUNKNOWNSESSIONALERT", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZUNKNOWNSESSIONALERT","Rule-Obj-HTML","@BASECLASS",false,"","Pega-EndUserUI","08-23-01","RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT","!PZUNKNOWNSESSIONALERT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-791482998), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1)
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
//	RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT:20230703T062434.036 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "306066226b2ba52f886463f7f84386d4";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {

String s = tools.getParamValue("pzAjax");
String pxReqContextPath = null;
String pxReqServletNameReal = null;
ClipboardPage pxRequestor = tools.findPage("pxRequestor", true);
if (pxRequestor != null) {
    pxReqContextPath = pxRequestor.getStringIfPresent("pxReqContextPath");
    pxReqServletNameReal = pxRequestor.getStringIfPresent("pxReqServletNameReal");
}
if ("Non-AJAX".equals(s)) {

tools.appendString("\n<!DOCTYPE html>\n<HTML>\n<HEAD></HEAD>\n<BODY>\n     <!-- Render in top frame -->\n     <script type=\"text/javascript\">\n       (function(){\n          var oWnd = top;\n\t  var childWindow = null;\n         var unknownSessionURL =  window.localStorage.getItem(\"pzUnknownSessionURL\");\n         window.localStorage.removeItem(\"pzUnknownSessionURL\");\n          if (oWnd.opener) {\n              childWindow = oWnd;\n              oWnd = oWnd.opener;\n          }\n\t  try{\n\t\t\t        if (oWnd.pega) pega = oWnd.pega;\n\t\t      }catch (error) {\n\t\t\t        console.error(error);\n\t\t\t        location.href = \"");
out.print(pxReqContextPath);
tools.appendString("\" + \"/\" + \"");
out.print(pxReqServletNameReal);
tools.appendString("\";\n\t\t\t        return;\n\t\t      }\n          if (typeof pega != 'undefined' && pega != null && pega.desktop && pega.desktop.support && pega.desktop.support.getDesktopWindow) {\n              oWnd = pega.desktop.support.getDesktopWindow();\n              if (!oWnd) {\n\t\t  if (childWindow != null) {\n                  \toWnd = childWindow.opener;\n                  } else {\n                  \toWnd = top;\n                  }\n              }\n          }\n          if (typeof pega != 'undefined' && pega != null && pega.ui && pega.ui.Doc) {\n              pega.u.d.redirectingToLoginScreen = true;\n              if (oWnd.pega) {\n                  oWnd.pega.u.d.redirectingToLoginScreen = true;\n              }\n          }\n          if (childWindow != null) {\n              if (typeof childWindow.pega != 'undefined' && childWindow.pega.u && childWindow.pega.u.d) {\n                  childWindow.pega.u.d.redirectingToLoginScreen = true;\n              }\n\t  }\n\t  /* isPortal check is to handle IAC cases */\n\t  var isPortal = true;\n\t  if (typeof pega != 'undefined' && pega != null && pega.u && pega.u.d && !pega.u.d.isPortal()) {\n\t  \tisPortal = false;\n\t  }\n\t  if (typeof oWnd.pega != 'undefined' && oWnd.pega != null &&\n\t\toWnd.pega.u && oWnd.pega.u.d && !oWnd.pega.u.d.isPortal()) {\n\t  \tisPortal = false;\n\t  } else {\n\t  \tisPortal = true;\n\t  }\n\t  if (!isPortal) {\n\t  \toWnd.location.reload();\n\t  } else if(oWnd != self) {\n\t  \tif (unknownSessionURL != null){\n        oWnd.location.href = unknownSessionURL;\n      }\n      else {\n\t  \t  oWnd.location.href = \"");
out.print(pxReqContextPath);
tools.appendString("\" + \"/\" + \"");
out.print(pxReqServletNameReal);
tools.appendString("\";\n      }\n\t  }\n      if(oWnd == self && typeof pega == 'undefined'){\n        if (unknownSessionURL != null){\n          oWnd.location.href = unknownSessionURL;\n        }\n        else {\n          oWnd.location.href = \"");
out.print(pxReqContextPath);
tools.appendString("\" + \"/\" + \"");
out.print(pxReqServletNameReal);
tools.appendString("\";\n        }\n    }\n          if (childWindow != null) { childWindow.close(); }\n })()\n     </script>\n</BODY>\n</HTML>\n");
 } else {
tools.appendString("{\"invalidSessionAction\":true,\"pxReqContextPath\":\"");
out.print(pxReqContextPath);
tools.appendString("\",\"pxReqServletNameReal\":\"");
out.print(pxReqServletNameReal);
tools.appendString("\"}");
} 
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-EndUserUI");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzUnknownSessionAlert");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-01");
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-Obj-HTML");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZUNKNOWNSESSIONALERT #20230703T062434.036 GMT", "@baseclass pzUnknownSessionAlert", "Pega-EndUserUI", "08-23-01", "20230703T062434.036 GMT");
}
