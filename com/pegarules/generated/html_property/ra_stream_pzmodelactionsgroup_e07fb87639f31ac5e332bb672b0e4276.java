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
 * Builds JSP stream PZMODELACTIONSGROUP.
 */
public class ra_stream_pzmodelactionsgroup_e07fb87639f31ac5e332bb672b0e4276 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzModelActionsgroup.Stream");
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
	public ra_stream_pzmodelactionsgroup_e07fb87639f31ac5e332bb672b0e4276(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "273356e0853b89b8b77172a018c319cd4a047885";
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
/* Instance RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT */
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
	"Rule-Obj-FieldValue:PYACTIONNAME!APPLY_MODEL", 
	"Rule-Obj-FieldValue:PYACTIONNAME!OTHERWISE", 
	"Rule-Obj-FieldValue:PYACTIONNAME!APPEND_AND_MAP_TO", 
	"Rule-Obj-FieldValue:PYACTIONNAME!COMMENT", 
	"Rule-Obj-FieldValue:PYACTIONNAME!FOR_EACH_PAGE_IN", 
	"Rule-Obj-FieldValue:PYACTIONNAME!-", 
	"Rule-Obj-FieldValue:PYACTIONNAME!WHEN", 
	"Rule-Obj-FieldValue:PYACTIONNAME!OTHERWISE_WHEN", 
	"Rule-Obj-FieldValue:PYACTIONNAME!UPDATE_PAGE", 
	"Rule-Obj-FieldValue:PYACTIONNAME!SORT", 
	"Rule-Obj-FieldValue:PYACTIONNAME!EXIT_FOR_EACH", 
	"Rule-Obj-FieldValue:PYACTIONNAME!EXIT_MODEL", 
	"Rule-Obj-FieldValue:PYACTIONNAME!SET", 
	"Rule-Obj-FieldValue:PYACTIONNAME!APPEND_TO", 
	"Rule-Obj-FieldValue:PYACTIONNAME!REMOVE", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Property:PYACTIONNAME", 
	"Rule-HTML-Property:PZMODELACTIONSGROUP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYACTIONNAME!APPLY_MODEL","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPLY_MODEL #20180713T135439.133 GMT","!PYACTIONNAME!APPLY_MODEL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!OTHERWISE","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!OTHERWISE #20180713T135439.163 GMT","!PYACTIONNAME!OTHERWISE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!APPEND_AND_MAP_TO","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPEND_AND_MAP_TO #20180713T135439.111 GMT","!PYACTIONNAME!APPEND_AND_MAP_TO",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!COMMENT","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!COMMENT #20180713T135439.142 GMT","!PYACTIONNAME!COMMENT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!FOR_EACH_PAGE_IN","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!FOR_EACH_PAGE_IN #20180713T135439.158 GMT","!PYACTIONNAME!FOR_EACH_PAGE_IN",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!-","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!- #20180713T135439.108 GMT","!PYACTIONNAME!-",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!WHEN","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!WHEN #20180713T135439.203 GMT","!PYACTIONNAME!WHEN",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!OTHERWISE_WHEN","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!OTHERWISE_WHEN #20180713T135439.171 GMT","!PYACTIONNAME!OTHERWISE_WHEN",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!UPDATE_PAGE","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!UPDATE_PAGE #20180713T135439.195 GMT","!PYACTIONNAME!UPDATE_PAGE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!SORT","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!SORT #20180713T135439.186 GMT","!PYACTIONNAME!SORT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!EXIT_FOR_EACH","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!EXIT_FOR_EACH #20180713T135439.150 GMT","!PYACTIONNAME!EXIT_FOR_EACH",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!EXIT_MODEL","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!EXIT_MODEL #20180713T135439.153 GMT","!PYACTIONNAME!EXIT_MODEL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!SET","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!SET #20180713T135439.178 GMT","!PYACTIONNAME!SET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!APPEND_TO","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPEND_TO #20180713T135439.125 GMT","!PYACTIONNAME!APPEND_TO",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYACTIONNAME!REMOVE","Rule-Obj-FieldValue","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!REMOVE #20180713T135439.174 GMT","!PYACTIONNAME!REMOVE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYACTIONNAME","Rule-Obj-Property","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT","!PYACTIONNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PZMODELACTIONSGROUP","Rule-HTML-Property","",false,"","Pega-Desktop","08-01-01","RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT","PZMODELACTIONSGROUP",true,false,"ABSOLUTE_CLASSLESS",-1131106511)
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
//	RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT:20180713T135129.669 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!SET #20180713T135439.178 GMT:20180713T135439.178 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!REMOVE #20180713T135439.174 GMT:20180713T135439.174 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!UPDATE_PAGE #20180713T135439.195 GMT:20180713T135439.195 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPLY_MODEL #20180713T135439.133 GMT:20180713T135439.133 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!SORT #20180713T135439.186 GMT:20180713T135439.186 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!COMMENT #20180713T135439.142 GMT:20180713T135439.142 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!- #20180713T135439.108 GMT:20180713T135439.108 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!WHEN #20180713T135439.203 GMT:20180713T135439.203 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!OTHERWISE_WHEN #20180713T135439.171 GMT:20180713T135439.171 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!OTHERWISE #20180713T135439.163 GMT:20180713T135439.163 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!- #20180713T135439.108 GMT:20180713T135439.108 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPEND_TO #20180713T135439.125 GMT:20180713T135439.125 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPEND_AND_MAP_TO #20180713T135439.111 GMT:20180713T135439.111 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!- #20180713T135439.108 GMT:20180713T135439.108 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!FOR_EACH_PAGE_IN #20180713T135439.158 GMT:20180713T135439.158 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!EXIT_FOR_EACH #20180713T135439.150 GMT:20180713T135439.150 GMT
//	RULE-OBJ-PROPERTY EMBED-MODELPARAMS PYACTIONNAME #20180713T135025.050 GMT:20180713T135025.050 GMT
//	RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!EXIT_MODEL #20180713T135439.153 GMT:20180713T135439.153 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "faa8b6b988f4d5a1f0d00532dc321c54";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(getPropertyVal(tools, aParam1), aParam2)));
}
private static final String[] showMeParams_1 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!SET #20180713T135439.178 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "SET" };
/**
 * Implements a pega:lookup tag.
 */private boolean _jspx_meth_pega_lookup__1(PageContext aPageContext, java.lang.String aProperty, java.lang.String aValue) throws Throwable {
/* pega:lookup */
com.pega.pegarules.jsptags.LookupTag _jspx_th_pega_lookup_ = (com.pega.pegarules.jsptags.LookupTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.LookupTag.class);
_jspx_th_pega_lookup_.setPageContext(pageContext);
_jspx_th_pega_lookup_.setParent(mParentTag);
_jspx_th_pega_lookup_.setProperty(aProperty);
_jspx_th_pega_lookup_.setValue(aValue);
int _jspx_eval_pega_lookup_ = _jspx_th_pega_lookup_.doStartTag();
if (_jspx_th_pega_lookup_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_lookup_);
return false;
}
private static final String[] showMeParams_2 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!REMOVE #20180713T135439.174 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "REMOVE" };
private static final String[] showMeParams_3 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!UPDATE_PAGE #20180713T135439.195 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "UPDATE_PAGE" };
private static final String[] showMeParams_4 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPLY_MODEL #20180713T135439.133 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "APPLY_MODEL" };
private static final String[] showMeParams_5 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!SORT #20180713T135439.186 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "SORT" };
private static final String[] showMeParams_6 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!COMMENT #20180713T135439.142 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "COMMENT" };
private static final String[] showMeParams_7 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!- #20180713T135439.108 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "-" };
private static final String[] showMeParams_8 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!WHEN #20180713T135439.203 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "WHEN" };
private static final String[] showMeParams_9 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!OTHERWISE_WHEN #20180713T135439.171 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "OTHERWISE_WHEN" };
private static final String[] showMeParams_10 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!OTHERWISE #20180713T135439.163 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "OTHERWISE" };
private static final String[] showMeParams_11 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPEND_TO #20180713T135439.125 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "APPEND_TO" };
private static final String[] showMeParams_12 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!APPEND_AND_MAP_TO #20180713T135439.111 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "APPEND_AND_MAP_TO" };
private static final String[] showMeParams_13 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!FOR_EACH_PAGE_IN #20180713T135439.158 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "FOR_EACH_PAGE_IN" };
private static final String[] showMeParams_14 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!EXIT_FOR_EACH #20180713T135439.150 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "EXIT_FOR_EACH" };
private static final String[] showMeParams_15 = {
"RULE-OBJ-FIELDVALUE EMBED-MODELPARAMS PYACTIONNAME!EXIT_MODEL #20180713T135439.153 GMT", "Rule-Obj-FieldValue", "Pega-Desktop", "pyActionName", "Embed-ModelParams", "EXIT_MODEL" };
/**
 * OnlyOnce condition: RefreshModelRow
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("RefreshModelRow")) {
tools.appendString(" <script> function selectAction(event, element){ if (element.options[element.selectedIndex].disabled) { element.selectedIndex = element.originalIndex; } else{ refreshSectionForModelForm(event, element); } } </script> ");
}
}
private void performStream_1() throws Throwable {
	if (pega.isPreviewMode() || !tools.getParamValue("minWidth").equals("")) {
tools.appendString(" <div style=\"border-right:");
out.print( tools.getParamValue("minWidth") );
tools.appendString(" solid transparent; width:100%;\"> <div style=\"float:left; position:relative; margin-right: -");
out.print( tools.getParamValue("minWidth") );
tools.appendString(";\"> ");
	}
tools.appendString(" ");

String strInputName = tools.getActiveName();
String strInputValue = tools.getActive().getStringValue();

tools.appendString(" <select id = ");
out.print(strInputName);
tools.appendString(" name = ");
out.print(strInputName);
tools.appendString(" onmousedown=\"if(event.stopPropagation){event.stopPropagation()};\" onchange=\"selectAction(event, this);\" onfocus=\"this.originalIndex = this.selectedIndex;\" style='width:100%; ' ");
	if (when_1(".pyDisabled", "true")) {
tools.appendString(" disabled ");
	}
tools.appendString(" > <option value=\"SET\" ");
 if(strInputValue.equals("SET")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName SET */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Set");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "SET")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_1);
tools.appendString("</option> <option value=\"REMOVE\" ");
 if(strInputValue.equals("REMOVE")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName REMOVE */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Remove");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "REMOVE")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_2);
tools.appendString("</option> <option value=\"UPDATE_PAGE\" ");
 if(strInputValue.equals("UPDATE_PAGE")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName UPDATE_PAGE */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Update Page");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "UPDATE_PAGE")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_3);
tools.appendString("</option> <option value=\"APPLY_MODEL\" ");
 if(strInputValue.equals("APPLY_MODEL")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName APPLY_MODEL */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Apply Data Transform");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "APPLY_MODEL")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_4);
tools.appendString("</option> <option value=\"SORT\" ");
 if(strInputValue.equals("SORT")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName SORT */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Sort");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "SORT")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_5);
tools.appendString("</option> <option value=\"COMMENT\" ");
 if(strInputValue.equals("COMMENT")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName COMMENT */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Comment");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "COMMENT")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_6);
tools.appendString("</option> <option value=\"\" disabled=\"disabled\">");

/* Field value Embed-ModelParams .pyActionName - */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("--------------------------");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "-")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_7);
tools.appendString("</option> <option value=\"WHEN\" ");
 if(strInputValue.equals("WHEN")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName WHEN */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("When");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "WHEN")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_8);
tools.appendString("</option> <option value=\"OTHERWISE_WHEN\" ");
 if(strInputValue.equals("OTHERWISE_WHEN")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName OTHERWISE_WHEN */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Otherwise When");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "OTHERWISE_WHEN")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_9);
tools.appendString("</option> <option value=\"OTHERWISE\" ");
 if(strInputValue.equals("OTHERWISE")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName OTHERWISE */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Otherwise");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "OTHERWISE")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_10);
tools.appendString("</option> <option value=\"\" disabled=\"disabled\">");

/* Field value Embed-ModelParams .pyActionName - */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("--------------------------");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "-")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_7);
tools.appendString("</option> <option value=\"APPEND_TO\" ");
 if(tools.getActive().getStringValue().equals("APPEND_TO")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName APPEND_TO */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Append to");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "APPEND_TO")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_11);
tools.appendString("</option> <option value=\"APPEND_AND_MAP_TO\" ");
 if(strInputValue.equals("APPEND_AND_MAP_TO")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName APPEND_AND_MAP_TO */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Append and Map to");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "APPEND_AND_MAP_TO")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_12);
tools.appendString("</option> <option value=\"\" disabled=\"disabled\">");

/* Field value Embed-ModelParams .pyActionName - */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("--------------------------");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "-")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_7);
tools.appendString("</option> <option value=\"FOR_EACH_PAGE_IN\" ");
 if(strInputValue.equals("FOR_EACH_PAGE_IN")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName FOR_EACH_PAGE_IN */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("For Each Page In");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "FOR_EACH_PAGE_IN")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_13);
tools.appendString("</option> <option value=\"EXIT_FOR_EACH\" ");
 if(strInputValue.equals("EXIT_FOR_EACH")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName EXIT_FOR_EACH */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Exit For Each");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "EXIT_FOR_EACH")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_14);
tools.appendString("</option> <option value=\"EXIT_MODEL\" ");
 if(tools.getActive().getStringValue().equals("EXIT_MODEL")){ 
tools.appendString(" selected=\"selected\" ");
 } 
tools.appendString(" >");

/* Field value Embed-ModelParams .pyActionName EXIT_MODEL */
if(tools.getStepPage() != null && "Embed-ModelParams".equals(tools.getStepPage().getClassName())){
out.write("Exit Data Transform");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyActionName", "EXIT_MODEL")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_15);
tools.appendString("</option> </select> ");
	if (pega.isPreviewMode() || !tools.getParamValue("minWidth").equals("")) {
tools.appendString(" </div> </div> ");
	}
tools.appendString(" ");
onlyOnce_1();
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Embed-ModelParams.pyActionName", new LiteweightPropertyDefinition("Embed-ModelParams", "pyActionName", "sTN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzModelActionsgroup");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZMODELACTIONSGROUP #20180713T135129.669 GMT", "pzModelActionsgroup", "Pega-Desktop", "08-01-01", "20180713T135129.669 GMT");
}
