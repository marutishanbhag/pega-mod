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
 * Builds JSP stream RF_REPORTINGSTRUCTURE.
 */
public class ra_stream_rf_reportingstructure_700f79444873c6572a3cf5597a1e6b76 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.RF_ReportingStructure.Stream");
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
	public ra_stream_rf_reportingstructure_700f79444873c6572a3cf5597a1e6b76(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "2d9338ac6bf32bc732cbcecc4e77c19fec464ed5";
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
/* Instance RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT */
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
	"Rule-Obj-Property:PYUSERIDENTIFIER", 
	"Rule-Obj-Property:PYUSERNAME", 
	"Rule-HTML-Property:RF_REPORTINGSTRUCTURE", 
	"Rule-HTML-Property:JSENCODEDVALUE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYUSERIDENTIFIER","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-06-01","RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT","!PYUSERIDENTIFIER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYUSERNAME","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYUSERNAME #20180713T131156.594 GMT","!PYUSERNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("RF_REPORTINGSTRUCTURE","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT","RF_REPORTINGSTRUCTURE",true,false,"ABSOLUTE_CLASSLESS",-1961051126), 
		new DependentRuleInfo("JSENCODEDVALUE","Rule-HTML-Property","",false,"","Pega-WB","08-01-01","RULE-HTML-PROPERTY JSENCODEDVALUE #20180713T131551.358 GMT","JSENCODEDVALUE",true,false,"ABSOLUTE_CLASSLESS",-972193213)
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
//	RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT:20180713T132013.050 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT:20201105T130217.202 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERIDENTIFIER #20201105T130217.202 GMT:20201105T130217.202 GMT
//	RULE-HTML-PROPERTY JSENCODEDVALUE #20180713T131551.358 GMT:20180713T131551.358 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERNAME #20180713T131156.594 GMT:20180713T131156.594 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYUSERNAME #20180713T131156.594 GMT:20180713T131156.594 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7392ff4decbddc63dbcaf5b476109cfe";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__2(PageContext aPageContext, java.lang.String aN) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN, java.lang.String aF) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
_jspx_th_p_r_.setF(aF);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private void performStream_1() throws Throwable {
tools.appendString("<script> var userID = \"");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pyUserIdentifier");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Data-Admin-Operator-ID")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
				pega.checkIfActivePropertyMissing();
StringMap  keys_1 = new HashStringMap();
keys_1.putString("pxObjClass", "Rule-HTML-Property");
keys_1.putString("pyStreamName", "JSEncodedValue");
tools.appendStream(keys_1);
keys_1 = null;
		} finally {
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_p_r__1(pageContext, ".pyUserIdentifier", "JSEncodedValue")) {
	return;
}
	}tools.appendString("\"; var userName = \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__2(pageContext, ".pyUserName")) {
	return;
}
tools.appendString("\"; function jsShowTree() { var strWindowName = \"EmployeeTree\"; var objSafeUrl = new SafeURL(\"Data-Admin-Operator-ID.showEmpTree\"); objSafeUrl.put(\"selectedNode\",userID); objSafeUrl.put(\"userName\",userName); pega.openUrlInModal.showModalDialog(objSafeUrl, strWindowName, 500, 600, function( contentWin ) { if(contentWin){ openRule(contentWin); } }); } </script> <table class=\"buttonMainTable\" id=\"table2\" cellSpacing=\"0\" cellPadding=\"0\" border=\"0\"> <tr> <td class=\"buttonTdLeft\">&nbsp;</td> <td class=\"buttonTdMiddle\"> <button class=\"buttonTdButton\" title onclick=\"jsShowTree()\" alt=\"\" BUTTONTYPE=\"SUBMIT\" type=\"button\"> Reporting structure</button></td> <td class=\"buttonTdRight\">&nbsp;</td> </tr> </table>");
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Data-Admin-Operator-ID.pyUserName", new LiteweightPropertyDefinition("Data-Admin-Operator-ID", "pyUserName", "sTN", false, true, "Default", false));
	oPropDefinitions_1.put("Data-Admin-Operator-ID.pyUserIdentifier", new LiteweightPropertyDefinition("Data-Admin-Operator-ID", "pyUserIdentifier", "sTN", false, true, "pzUserIdentifier_Control", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "RF_ReportingStructure");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY RF_REPORTINGSTRUCTURE #20180713T132013.050 GMT", "RF_ReportingStructure", "Pega-ProCom", "08-01-01", "20180713T132013.050 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY JSENCODEDVALUE #20180713T131551.358 GMT", "JSEncodedValue", "Pega-WB", "08-01-01", "20180713T131551.358 GMT");
}
