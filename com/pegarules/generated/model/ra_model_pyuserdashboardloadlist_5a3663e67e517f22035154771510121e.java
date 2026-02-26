package com.pegarules.generated.model;
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
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.tracer.RuleTraceInfo;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class ra_model_pyuserdashboardloadlist_5a3663e67e517f22035154771510121e extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyUserDashboardLoadList.Code_Pega_List.Model");
	public ra_model_pyuserdashboardloadlist_5a3663e67e517f22035154771510121e(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PYUSERDASHBOARDLOADLIST #20180713T134931.060 GMT	Pega-EndUserUI:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ClipboardProperty pz_1 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_1 = pz_1 == null ? null : pz_1.getPageValue();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_1);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ClipboardProperty pz_3 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_2 = pz_3 == null ? null : pz_3.getPageValue();
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_2);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "Update Page", null, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Update Page", null, target_context_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ClipboardProperty pz_5 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_3 = pz_5 == null ? null : pz_5.getPageValue();
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_3);
ClipboardPage target_context_3 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "Update Page", null, target_context_3);
if (updatePage_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "Update Page", null, target_context_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9", "Set .pxResultCount", source_1, target_1);
{
    pega.setViaPropRef(".pxResultCount", pRef_7, myStepPage, (pega.<Integer>resolveMethodCall("Size--(String,Activity)", "Size", null, null, new Object[] { ".pxResults", tools })).intValue(), "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"9", "Set .pxResultCount", source_1, target_1);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyOwnerType", source_2, target_2);
{
    String pzSourceVar8 = "";
    pzSourceVar8 = "operator";
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pega.setViaPropRef(".pyOwnerType", pRef_9, myStepPage, pzSourceVar8, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyOwnerType", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyOwner", source_3, target_3);
{
    String pzSourceVar11 = "";
    pzSourceVar11 = scalarValueQuery_12.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pega.setViaPropRef(".pyOwner", pRef_13, myStepPage, pzSourceVar11, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyOwner", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set .pyLabel", source_4, target_4);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "Publish to operator", "pyCaption", tools });
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_16, myStepPage, pzSourceVar15, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set .pyLabel", source_4, target_4);
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pyOwnerType", source_5, target_5);
{
    String pzSourceVar18 = "";
    pzSourceVar18 = "workgroup";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyOwnerType", pRef_9, myStepPage, pzSourceVar18, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pyOwnerType", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2", "Set .pyOwner", source_6, target_6);
{
    String pzSourceVar20 = "";
    pzSourceVar20 = scalarValueQuery_21.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyOwner", pRef_13, myStepPage, pzSourceVar20, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2", "Set .pyOwner", source_6, target_6);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.3", "Set .pyLabel", source_7, target_7);
{
    String pzSourceVar23 = "";
    pzSourceVar23 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "Publish to team", "pyCaption", tools });
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_16, myStepPage, pzSourceVar23, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.3", "Set .pyLabel", source_7, target_7);
return CODE_CONTINUE;
}private int updatePage_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1", "Set .pyOwnerType", source_8, target_8);
{
    String pzSourceVar25 = "";
    pzSourceVar25 = "default";
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        pega.setViaPropRef(".pyOwnerType", pRef_9, myStepPage, pzSourceVar25, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.1", "Set .pyOwnerType", source_8, target_8);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.2", "Set .pyOwner", source_9, target_9);
{
    String pzSourceVar27 = "";
    pzSourceVar27 = "default";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pega.setViaPropRef(".pyOwner", pRef_13, myStepPage, pzSourceVar27, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.2", "Set .pyOwner", source_9, target_9);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.3", "Set .pyLabel", source_10, target_10);
{
    String pzSourceVar29 = "";
    pzSourceVar29 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "Publish to default", "pyCaption", tools });
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("System-User-Dashboard", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_16, myStepPage, pzSourceVar29, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.3", "Set .pyLabel", source_10, target_10);
return CODE_CONTINUE;
}/** Metadata for the rule */
private static final Map oMetaData;

// initialize metadata for the rule
static {
oMetaData = new HashMap(1);
oMetaData.put(".pyCallSuperClassModel", "false");
}

/** Returns metadata for this rule instance */
public Map getMetadata() {
return oMetaData;
}

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Model:PYUSERDASHBOARDLOADLIST"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYUSERDASHBOARDLOADLIST","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-EndUserUI","08-01-01","RULE-OBJ-MODEL CODE-PEGA-LIST PYUSERDASHBOARDLOADLIST #20180713T134931.060 GMT","!PYUSERDASHBOARDLOADLIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",722023183)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PYUSERDASHBOARDLOADLIST #20180713T134931.060 GMT:20180713T134931.060 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "509d7c7c6e99c3b2ee7b5406039a97ee";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Model";
}
private static final int CODE_CONTINUE = 0;
private static final int CODE_EXIT_ITERATION = 1;
private static final int CODE_EXIT_MODEL = 2;
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
		myStepPage = null;
		pz_CurrentRuleKey = "";
}
private ClipboardPage myStepPage;
String pz_CurrentRuleKey = "";

public static final String[] pRef_16 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyOwnerType", "" };
public static final String[] pRef_7 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pxWorkGroup").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyUserIdentifier").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PYUSERDASHBOARDLOADLIST #20180713T134931.060 GMT", "Code-Pega-List pyUserDashboardLoadList", "Pega-EndUserUI", "08-01-01", "20180713T134931.060 GMT");
}
