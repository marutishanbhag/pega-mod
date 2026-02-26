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
import com.pega.pegarules.priv.factory.ThreadLocalStringMapFactoryImpl;
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
 * Builds JSP stream @BASECLASS!PYSTATUSRESPONSE.
 */
public class ra_stream_pystatusresponse_e97a00e6b523a61cec64f03ba8a8b81f extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_HTML.pyStatusResponse._baseclass.Stream");
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
	public ra_stream_pystatusresponse_e97a00e6b523a61cec64f03ba8a8b81f(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "ac3a94bc02509f13a90f8bd615969a6508cb6a87";
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
/* Instance RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT	Pega-Desktop:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_2();

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
/* end RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT */
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
	"Rule-Obj-HTML:PYSTATUSRESPONSE", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PYPORTALICON", 
	"Rule-Utility-Function:PZCONTROL!PZGENERATEFORMAT", 
	"Rule-Obj-Property:PYHTTPRESPONSESTATUS", 
	"Rule-Obj-Property:PYHTTPRESPONSEMESSAGE", 
	"Rule-HTML-Property:PXTEXTINPUT", 
	"Rule-File-Binary:WEBWB!PZPEGAICON16!PNG", 
	"Rule-File-Binary:WEBWB!PZPEGAICON32!PNG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYSTATUSRESPONSE","Rule-Obj-HTML","@BASECLASS",false,"","Pega-Desktop","08-07-01","RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT","!PYSTATUSRESPONSE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1940673300), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYPORTALICON","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-23-01","RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT","PYPORTALICON",true,false,"ABSOLUTE_CLASSLESS",-530892176), 
		new DependentRuleInfo("PZCONTROL!PZGENERATEFORMAT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT #20180713T133344.942 GMT","PZCONTROL!PZGENERATEFORMAT",true,false,"ABSOLUTE_CLASSLESS",1075897911), 
		new DependentRuleInfo("PYHTTPRESPONSESTATUS","Rule-Obj-Property","@BASECLASS",false,"","Pega-Desktop","08-07-01","RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSESTATUS #20210331T070253.914 GMT","!PYHTTPRESPONSESTATUS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYHTTPRESPONSEMESSAGE","Rule-Obj-Property","@BASECLASS",false,"","Pega-Desktop","08-07-01","RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSEMESSAGE #20210331T070253.899 GMT","!PYHTTPRESPONSEMESSAGE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXTEXTINPUT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT","PXTEXTINPUT",true,false,"ABSOLUTE_CLASSLESS",228709330), 
		new DependentRuleInfo("WEBWB!PZPEGAICON16!PNG","Rule-File-Binary","",false,"","Pega-UIEngine","","RULE-FILE-BINARY WEBWB PZPEGAICON16!PNG #20230618T001607.154 GMT","WEBWB!PZPEGAICON16!PNG",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGAICON32!PNG","Rule-File-Binary","",false,"","Pega-UIEngine","","RULE-FILE-BINARY WEBWB PZPEGAICON32!PNG #20230618T001607.166 GMT","WEBWB!PZPEGAICON32!PNG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT:20211029T151430.274 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT:20230618T001613.924 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-BINARY WEBWB PZPEGAICON32!PNG #20230618T001607.166 GMT:20230618T001607.166 GMT
//	RULE-FILE-BINARY WEBWB PZPEGAICON16!PNG #20230618T001607.154 GMT:20230618T001607.154 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSESTATUS #20210331T070253.914 GMT:20210331T070253.914 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSESTATUS #20210331T070253.914 GMT:20210331T070253.914 GMT
//	RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT:20190131T183501.688 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT #20180713T133344.942 GMT:20180713T133344.942 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSEMESSAGE #20210331T070253.899 GMT:20210331T070253.899 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSEMESSAGE #20210331T070253.899 GMT:20210331T070253.899 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSEMESSAGE #20210331T070253.899 GMT:20210331T070253.899 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYHTTPRESPONSEMESSAGE #20210331T070253.899 GMT:20210331T070253.899 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "6e03b9b696b42c31d00990d162fc6b4f";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__2(PageContext aPageContext, java.lang.String aN, java.lang.String aM) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
_jspx_th_p_r_.setM(aM);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Yes", "", "Pega-UIEngine", "08-23-01", "", "pyPortalIcon", "", "RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT" };
private boolean when_2() throws Throwable {
boolean whenResult_1 = pega.invokeWhen("pyIsMobile", "", "");
return whenResult_1;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_2()) {
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"");

// BinaryFileReference
tools.appendString("webwb/pzpegaicon32_13852824416.png!!.png");
tools.appendString("\"> <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"");

// BinaryFileReference
tools.appendString("webwb/pzpegaicon16_12739199918.png!!.png");
tools.appendString("\"> <link rel=\"shortcut icon\" href=\"images/pzPegaIcon.ico\"> ");
}
}
private void performStream_1() throws Throwable {
choose_1();
tools.appendString(" ");
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Yes");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pyPortalIcon");
	oStreamProperties_2.put("pyRuleSetVersion", "08-23-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT	Pega-UIEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN) throws Throwable {
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
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-Gadgets", "08-03-01", "", "pxTextInput", "", "RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT" };
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "pxTextInput");
	oStreamProperties_3.put("pyRuleSetVersion", "08-03-01");
}
/**
 * Generates stream property__baseclass_pxTextInput
 */
private void property__baseclass_pxTextInput() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT	Pega-Gadgets:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
if (!pzDispatchToInvokedMethod()) {
if (!tools.useModeInput() || !tools.getActive().isModifiable() || tools.getActive().isSpecial()) {
tools.appendString(pega_uiengine_formatter.pxFormatText(tools.getActiveValue(),false,"","",true) );
} else {// non auto-generated streams cannot use auto-generated properties for input; defer to Default
final StringMap keys = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
keys.putString("pxObjClass", "Rule-HTML-Property");
keys.putString("pyStreamName", "Default");
tools.appendStream(keys);ThreadLocalStringMapFactoryImpl.getFactory().release(keys);
}}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT */
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n ");
if (!foundChoice && when_1("pyShowErrorStream", "false")) {
tools.appendString("\n<!doctype html> \n<html class='status-page'>\n<head>\n<meta name=\"viewport\" content=\"initial-scale=1, width=device-width\">\n<meta name=\"description\" content=\"Status Page\"> \n<title>Status Page</title>\n");
/* Include stream RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT */
include_1();

tools.appendString("\n<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap\" rel=\"stylesheet\">\n<style>\n.status-page > body {\n    font: 1rem/1.2rem OpenSans,sans-serif;\n    font-weight: 400;\n    font-style: normal;\n    color: #000;\n    height: 100vh;\n    display: flex;\n    overflow: hidden;\n    margin: 0;\n    text-align: center;\n}\n.status-page .status-msg {\n    margin: auto;\n    max-width: 600px;\n    padding: 2rem;\n}\n.status-page .status-msg p {\n    word-break: break-word;\n}\n.status-page h1 {\n  font: bold 1.5rem/1.7rem OpenSans,sans-serif;\n}\n</style>\n</head>\n<body>\n  <div class='status-msg'>\n    <h1>");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pyHttpResponseStatus");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("@baseclass")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
				pega.checkIfActivePropertyMissing();
property__baseclass_pxTextInput();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_PROPERTY, showMeParams_2);
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_DECLARATIVE, showMeParams_2);
		} finally {
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_p_r__1(pageContext, ".pyHttpResponseStatus")) {
	return;
}
	}tools.appendString("</h1>\n    <p>");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__2(pageContext, ".pyHttpResponseMessage", "literal")) {
	return;
}
tools.appendString("</p>\n  </div>\n</body>\n</html>\n");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice) {
tools.appendString("\n<!doctype html>\n<html class='error-page'>\n<head>\n<meta name=\"viewport\" content=\"initial-scale=1, width=device-width\">\n<meta name=\"description\" content=\"Error Page\">\n<title>Error Page</title>\n");
/* Include stream RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT */
include_1();

tools.appendString("\n<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap\" rel=\"stylesheet\">\n<style>\n.error-page > body {\n    font: 1rem/1.2rem OpenSans,sans-serif;\n    font-weight: 400;\n    font-style: normal;\n    color: #000;\n    height: 100vh;\n    display: flex;\n    overflow: hidden;\n    margin: 0;\n    text-align: center;\n}\n.error-page .error-msg {\n    margin: auto;\n    max-width: 600px;\n    padding: 2rem;\n}\n.error-page .error-msg p {\n    word-break: break-word;\n}\n.error-page h1 {\n  font: bold 1.5rem/1.7rem OpenSans,sans-serif;\n}\n</style>\n</head>\n<body>\n  <div class='error-msg'>\n    <h1>An error has occurred processing this request</h1>\n    <p>");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__2(pageContext, ".pyHttpResponseMessage", "literal")) {
	return;
}
tools.appendString("</p>\n  </div>\n</body>\n</html>\n");
}
}
private void performStream_2() throws Throwable {
choose_2();
tools.appendString("\n");
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("@baseclass.pyHttpResponseStatus", new LiteweightPropertyDefinition("@baseclass", "pyHttpResponseStatus", "sTN", false, true, "pxTextInput", false));
	oPropDefinitions_1.put("@baseclass.pyHttpResponseMessage", new LiteweightPropertyDefinition("@baseclass", "pyHttpResponseMessage", "sTN", false, true, "pxTextInput", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyStatusResponse");
	oStreamProperties_1.put("pyRuleSetVersion", "08-07-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PYSTATUSRESPONSE #20210407T091942.035 GMT", "@baseclass pyStatusResponse", "Pega-Desktop", "08-07-01", "20211029T151430.274 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT", "pxTextInput", "Pega-Gadgets", "08-03-01", "20190131T183501.688 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PYPORTALICON #20230618T001613.924 GMT", "pyPortalIcon", "Pega-UIEngine", "08-23-01", "20230618T001613.924 GMT");
}
