package com.pegarules.generated.model;
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
public class ra_model_pzpreparepreviewforassetscreated_c0eecbd80615300dd8b580dd4b7df030 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzPreparePreviewForAssetsCreated.PegaAccel_Task_BuildApplication.Model");
	public ra_model_pzpreparepreviewforassetscreated_c0eecbd80615300dd8b580dd4b7df030(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZPREPAREPREVIEWFORASSETSCREATED #20180713T141239.219 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set .pyShowConfirmScreen", source_1, target_1);
{
    pega.setViaPropRef(".pyShowConfirmScreen", pRef_1, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set .pyShowConfirmScreen", source_1, target_1);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_3 = pega.getViaPropRef(".pyApplicationGenerator.pyUsersToCreate", pRef_2, pega.findPageWithException("pyNewAppAPIWorkPage", "Data-Application-Configuration"), false, true);
foreach_prop_1 = pz_3;
actionProlog(pz_CurrentTraceInfo,"3", "For Each Page In", null, pz_3);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
boolean pop_ctxt_page_2 = false;
try {
/* push '"pyNewAppAPIWorkPage.pyApplicationGenerator.pyUsersToCreate(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "pyNewAppAPIWorkPage.pyApplicationGenerator.pyUsersToCreate(<CURRENT>)", ctxt_page_target_1);
/* push '"pyNewAppAPIWorkPage.pyApplicationGenerator.pyUsersToCreate(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "pyNewAppAPIWorkPage.pyApplicationGenerator.pyUsersToCreate(<CURRENT>)", ctxt_page_source_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"3", "For Each Page In", null, pz_3);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_4 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_3 = null;
try {
ctxt_frame_3 = pega.pushStackFrame("Primary.pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_3.getStepPage();
pz_4 = tools.getPrimaryPage().getProperty("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
} // return to previous step page

targetProperty_1 = pz_4;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_4 = null;
try {
ctxt_frame_4 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_4.getStepPage();
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_2.getString("pxObjClass"))) {
	ctxt_page_2.putString("pxObjClass", "PegaAccel-Task-BuildApplication");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
} // return to previous step page
actionProlog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_1);
switch (appendAndMapTo_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =null;
ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyLabel", source_2, target_2);
{
    String pzSourceVar5 = "";
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("Data-Admin-Operator-ID", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pzSourceVar5 = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("PegaAccel-Task-BuildApplication", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar5, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyLabel", source_2, target_2);
ClipboardPage source_3 =null;
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.2", "Set .pzInsKey", source_3, target_3);
{
    String pzSourceVar9 = "";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Data-Admin-Operator-ID", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pzSourceVar9 = scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("PegaAccel-Task-BuildApplication", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pzInsKey", pRef_11, myStepPage, pzSourceVar9, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.2", "Set .pzInsKey", source_3, target_3);
ClipboardPage source_4 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.3", "Set .pyAccessGroup", source_4, target_4);
{
    String pzSourceVar13 = "";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Data-Admin-Operator-ID", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pzSourceVar13 = pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", null, null, new Object[] { "pyAccessGroup", "Data-Admin-Operator-ID", "pyUserIdentifier", scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" });
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("PegaAccel-Task-BuildApplication", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyAccessGroup", pRef_14, myStepPage, pzSourceVar13, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.3", "Set .pyAccessGroup", source_4, target_4);
ClipboardPage source_5 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.4", "Set .pxInsHandle", source_5, target_5);
{
    String pzSourceVar16 = "";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Data-Admin-Operator-ID", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pzSourceVar16 = pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", null, null, new Object[] { "pzInsKey", "Data-Admin-Operator-AccessGroup", "pyAccessGroup", scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" });
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("PegaAccel-Task-BuildApplication", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pxInsHandle", pRef_18, myStepPage, pzSourceVar16, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.4", "Set .pxInsHandle", source_5, target_5);
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
	"Rule-Obj-Model:PZPREPAREPREVIEWFORASSETSCREATED"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPREPAREPREVIEWFORASSETSCREATED","Rule-Obj-Model","PEGAACCEL-TASK-BUILDAPPLICATION",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZPREPAREPREVIEWFORASSETSCREATED #20180713T141239.219 GMT","!PZPREPAREPREVIEWFORASSETSCREATED",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1082606474)
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
//	RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZPREPAREPREVIEWFORASSETSCREATED #20180713T141239.219 GMT:20180713T141239.219 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "021b57e8cb14697a08f345e9d068e713";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAccel-Task-BuildApplication";
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

public static final String[] pRef_7 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyApplicationGenerator", "", "pyUsersToCreate", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyShowConfirmScreen", "" };
public static final String[] pRef_18 = new String[] { "", "", "pxInsHandle", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyAccessGroup", "" };
public static final String[] pRef_11 = new String[] { "", "", "pzInsKey", "" };
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyAccessGroup").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyUserIdentifier").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZPREPAREPREVIEWFORASSETSCREATED #20180713T141239.219 GMT", "PegaAccel-Task-BuildApplication pzPreparePreviewForAssetsCreated", "Pega-ProcessArchitect", "08-01-01", "20180713T141239.219 GMT");
}
