package com.pegarules.generated.html;
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
/**
 * Builds JSP stream DATA-MO!PZMODALHEADER.
 */
public class ra_stream_pzmodalheader_c85060850f426de1faf172392e835d1c extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_HTML.pzModalHeader.Data_MO_Connector_Transition.Stream");
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
	public ra_stream_pzmodalheader_c85060850f426de1faf172392e835d1c(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "69d86acca6ec65dff961128427c52f23edd6e2cb";
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
/* Instance RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT	Pega-ProcessArchitect:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_3();

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
/* end RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT */
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
	"Rule-Obj-HTML:PZMODALHEADER", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Property:PZMODALHELP", 
	"Rule-HTML-Property:PZMODALCLOSE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZMODALHEADER","Rule-Obj-HTML","DATA-MO",false,"","Pega-ProcessArchitect","08-02-01","RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT","!PZMODALHEADER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-462509697), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZMODALHELP","Rule-HTML-Property","",false,"","Pega-UIEngine","08-06-01","RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT","PZMODALHELP",true,false,"ABSOLUTE_CLASSLESS",-309694859), 
		new DependentRuleInfo("PZMODALCLOSE","Rule-HTML-Property","",false,"","Pega-UIEngine","08-23-01","RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT","PZMODALCLOSE",true,false,"ABSOLUTE_CLASSLESS",-445578973)
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
//	RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT:20181206T092218.448 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT:20210222T063300.876 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT:20231006T063417.224 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "720c533638ac76227ae3ec9afa214e7b";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-MO";
	}
public String getAspect() {
return "Stream";
}
private void performStream_2() throws Throwable {
tools.appendString("<button type=\"button\" class='container-close' id=\"container_close\" aria-label=\"");
out.print( tools.getLocalizedTextForString(".pyCaption", "close modal") );
tools.appendString("\" title=\"");
out.print( tools.getLocalizedTextForString(".pyCaption", "close modal") );
tools.appendString("\"></button>");
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "pzModalClose");
	oStreamProperties_3.put("pyRuleSetVersion", "08-23-01");
}
/**
 * Generates stream property_Data_MO_Connector_Transition_pzModalClose
 */
private void property_Data_MO_Connector_Transition_pzModalClose() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT	Pega-UIEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
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

	performStream_2();

}
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
/* end RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_MO_Connector_Transition_pzModalClose();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_1() throws Throwable {
tools.appendString("<button title='' type='button' onclick=\"displayHelp(event)\" id=\"ModalHelpButton\" name=\"ModalHelpButton\" class=\"pi pi-help contextual-help\" style=\"color:#207DC8;display:none;margin-left:2px;\"></button>");
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzModalHelp");
	oStreamProperties_2.put("pyRuleSetVersion", "08-06-01");
}
/**
 * Generates stream property_Data_MO_Connector_Transition_pzModalHelp
 */
private void property_Data_MO_Connector_Transition_pzModalHelp() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT	Pega-UIEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
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
/* end RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Data_MO_Connector_Transition_pzModalHelp();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_3() throws Throwable {

String title = null;
String clazz = tools.getStepPage().getClassName();

boolean isSpecificationModal = tools.getParamValue("NewTaskStatus").equals("pzPropertyPanelModalDM");
boolean isFieldsModal = tools.getParamValue("NewTaskStatus").equals("pzConfigureFields") || tools.getParamValue("actionName").equals("pzConfigureFields");
boolean isRouterBusinessLogicModal = tools.getParamValue("NewTaskStatus").equals("pzConfigureRouting");

/* TODO: Review this cases, we should just refer to the field value */
if (isSpecificationModal) {
  title = "Add Specification";
} else if (isFieldsModal) {
  title = StringUtils.crossScriptingFilter(tools.getParamValue("pyActionLabel"));
} else if (isRouterBusinessLogicModal) {
  title = StringUtils.crossScriptingFilter(tools.getParamValue("pyActionLabel"));
} else if (clazz.equalsIgnoreCase("Data-MO-Activity-SubProcess") || clazz.equalsIgnoreCase("Data-MO-Activity-Utility")) {
  String isAPI = tools.getStepPage().getString("pzIsAPI");
  
  if ("true".equalsIgnoreCase(isAPI)) {
    title = StringUtils.crossScriptingFilter(tools.getStepPage().getString("pyMOName"));	
  }
} 

if (StringUtils.isBlank(title)) {
  title =  StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyCaption", "pyComponentDialogHeader"));
}

tools.appendString("\n\n<div class=\"hd\" id=\"modaldialog_hd\" style=\"width:100%\">\n  <span id=\"modaldialog_hd_title\">");
out.print(title);
tools.appendString("</span>\n  ");
/* Include stream RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT */
include_1();

tools.appendString("\n  ");
/* Include stream RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT */
include_2();

tools.appendString("\n</div>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Data-MO");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzModalHeader");
	oStreamProperties_1.put("pyRuleSetVersion", "08-02-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML DATA-MO PZMODALHEADER #20181205T144740.141 GMT", "Data-MO pzModalHeader", "Pega-ProcessArchitect", "08-02-01", "20181206T092218.448 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZMODALCLOSE #20231006T063417.224 GMT", "pzModalClose", "Pega-UIEngine", "08-23-01", "20231006T063417.224 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZMODALHELP #20210222T063300.876 GMT", "pzModalHelp", "Pega-UIEngine", "08-06-01", "20210222T063300.876 GMT");
}
