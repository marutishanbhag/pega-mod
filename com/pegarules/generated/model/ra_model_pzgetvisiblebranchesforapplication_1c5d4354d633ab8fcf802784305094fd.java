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
public class ra_model_pzgetvisiblebranchesforapplication_1c5d4354d633ab8fcf802784305094fd extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzGetVisibleBranchesForApplication.Code_Pega_List.Model");
	public ra_model_pzgetvisiblebranchesforapplication_1c5d4354d633ab8fcf802784305094fd(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZGETVISIBLEBRANCHESFORAPPLICATION #20180713T135507.278 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set Primary.pyCount", source_1, target_1);
{
    pega.setViaPropRef(".pyCount", pRef_1, tools.getPrimaryPage(), 0, "sNN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set Primary.pyCount", source_1, target_1);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_2 = pega.findDataPage("D_ApplicationStack", true, "TopAppVersion", tools.getParamValue("TopAppVersion"), "TopAppName", tools.getParamValue("TopAppName")).getIfPresent("pxResults");
foreach_prop_1 = pz_2;
actionProlog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_2);
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
/* push '"D_ApplicationStack[TopAppName:Param.TopAppName,TopAppVersion:Param.TopAppVersion].pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "D_ApplicationStack[TopAppName:Param.TopAppName,TopAppVersion:Param.TopAppVersion].pxResults(<CURRENT>)", ctxt_page_target_1);
/* push '"D_ApplicationStack[TopAppName:Param.TopAppName,TopAppVersion:Param.TopAppVersion].pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "D_ApplicationStack[TopAppName:Param.TopAppName,TopAppVersion:Param.TopAppVersion].pxResults(<CURRENT>)", ctxt_page_source_1);
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
actionEpilog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_2);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_2);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_2);
}
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pxResultCount", source_2, target_3);
{
    pega.setViaPropRef(".pxResultCount", pRef_3, myStepPage, (pega.<Integer>resolveMethodCall("Size--(String,Activity)", "Size", null, null, new Object[] { ".pxResults", tools })).intValue(), "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pxResultCount", source_2, target_3);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set Param.local_sCurrentApp", source_3, target_4);
{
    String pzSourceVar4 = "";
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pzSourceVar4 = scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        tools.putParamValue("local_sCurrentApp", PropertyInfo.TYPE_TEXT, pzSourceVar4);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set Param.local_sCurrentApp", source_3, target_4);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set Param.local_sProductName", source_4, target_5);
{
    String pzSourceVar7 = "";
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pzSourceVar7 = scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        tools.putParamValue("local_sProductName", PropertyInfo.TYPE_TEXT, pzSourceVar7);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set Param.local_sProductName", source_4, target_5);
if (whenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.3", "When", null, target_6);
switch (when_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.3", "When", null, target_6);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_11 = null;
try {
ctxt_frame_11 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_11.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "! Param.local_bBoundApplication");
try {
boolean pz_10 = ((!tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "local_bBoundApplication")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "! Param.local_bBoundApplication",pz_10);
return pz_10;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("! Param.local_bBoundApplication " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
} // return to previous step page
}private int when_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.3.1", "When", null, target_7);
switch (when_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.3.1", "When", null, target_7);
}
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_11 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_12 = null;
try {
ctxt_frame_12 = pega.pushStackFrame(".pyBranchList", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_12.getStepPage();
pz_11 = myStepPage.getIfPresent("pyBranchList");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
} // return to previous step page

foreach_prop_2 = pz_11;
actionProlog(pz_CurrentTraceInfo,"2.3.2", "For Each Page In", null, pz_11);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
try {
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_3 = false;
boolean pop_ctxt_page_4 = false;
try {
/* push '".pyBranchList(<CURRENT>)"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_13 = null;
try {
ctxt_frame_13 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_13.getStepPage();
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_2;
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pyBranchList(<CURRENT>)", ctxt_page_target_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
} // return to previous step page
/* push '".pyBranchList(<CURRENT>)"' to scope SOURCE */
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_14 = null;
try {
ctxt_frame_14 = pega.pushStackFrame("\"switching to update SOURCE\"", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_14.getStepPage();
ClipboardPage ctxt_page_source_2 = null;
ctxt_page_source_2 = ctxt_page_2;
pop_ctxt_page_4 = pega.pushScopedStepContext("SOURCE", ".pyBranchList(<CURRENT>)", ctxt_page_source_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
} // return to previous step page
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
break forEachLoop_2;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_4) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
} finally {
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
}
}
actionEpilog(pz_CurrentTraceInfo,"2.3.2", "For Each Page In", null, pz_11);
return CODE_CONTINUE;
}private boolean whenCondition_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_15 = null;
try {
ctxt_frame_15 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_15.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyProductName==Param.TargetApplication");
try {
boolean pz_12 = (scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(tools.getParamValue("TargetApplication")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductName==Param.TargetApplication",pz_12);
return pz_12;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyProductName==Param.TargetApplication " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
} // return to previous step page
}private int when_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3.1.1", "Set Param.local_bBoundApplication", source_5, target_8);
{
    boolean pzSourceVar13 = false;
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pzSourceVar13 = true;
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        tools.putParamValue("local_bBoundApplication", PropertyInfo.TYPE_TRUEFALSE, pzSourceVar13);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3.1.1", "Set Param.local_bBoundApplication", source_5, target_8);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.3.2.1", "When", null, target_9);
switch (when_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.3.2.1", "When", null, target_9);
}
return CODE_CONTINUE;
}private boolean whenCondition_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_20 = null;
try {
ctxt_frame_20 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_20.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "! @contains(Param.local_sVisitedBranches , \"[\"+.pyBranchID+\"]\")");
try {
boolean pz_16 = ((!(pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, null, new Object[] { tools.getParamValue("local_sVisitedBranches"), (("[" + scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "]") })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "! @contains(Param.local_sVisitedBranches , \"[\"+.pyBranchID+\"]\")",pz_16);
return pz_16;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("! @contains(Param.local_sVisitedBranches , \"[\"+.pyBranchID+\"]\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
} // return to previous step page
}private int when_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3.2.1.1", "Set Param.local_sVisitedBranches", source_6, target_10);
{
    String pzSourceVar17 = "";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pzSourceVar17 = (((tools.getParamValue("local_sVisitedBranches") + "[") + scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "]");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        tools.putParamValue("local_sVisitedBranches", PropertyInfo.TYPE_TEXT, pzSourceVar17);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3.2.1.1", "Set Param.local_sVisitedBranches", source_6, target_10);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3.2.1.2", "Set Primary.pyCount", source_7, target_11);
{
    int pzSourceVar19 = 0;
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pzSourceVar19 = (scalarValueQuery_20.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyCount", pRef_1, tools.getPrimaryPage(), pzSourceVar19, "sNN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3.2.1.2", "Set Primary.pyCount", source_7, target_11);
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_22 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_29 = null;
try {
ctxt_frame_29 = pega.pushStackFrame("Primary.pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_29.getStepPage();
pz_22 = tools.getPrimaryPage().getProperty("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
} // return to previous step page

targetProperty_1 = pz_22;
ClipboardPage ctxt_page_source_3 = pega.getScopedStepContext("SOURCE");
actionProlog(pz_CurrentTraceInfo,"2.3.2.1.3", "Append to", ctxt_page_source_3, targetProperty_1);
targetProperty_1.add(ctxt_page_source_3);
actionEpilog(pz_CurrentTraceInfo,"2.3.2.1.3", "Append to", ctxt_page_source_3, targetProperty_1);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3.2.1.4", "Set Primary.pxResults(<last>).pyApplicationInsName", source_8, target_12);
{
    String pzSourceVar23 = "";
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pzSourceVar23 = tools.getParamValue("local_sCurrentApp");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pxResults(<last>).pyApplicationInsName", pRef_24, tools.getPrimaryPage(), pzSourceVar23, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3.2.1.4", "Set Primary.pxResults(<last>).pyApplicationInsName", source_8, target_12);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3.2.1.5", "Set Primary.pxResults(<last>).pyProductName", source_9, target_13);
{
    String pzSourceVar26 = "";
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pzSourceVar26 = tools.getParamValue("local_sProductName");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("Embed-RuleSetBranch", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        pega.setViaPropRef(".pxResults(<last>).pyProductName", pRef_27, tools.getPrimaryPage(), pzSourceVar26, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3.2.1.5", "Set Primary.pxResults(<last>).pyProductName", source_9, target_13);
return CODE_CONTINUE;
}private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!(param.SkipNoBranchOption)");
try {
boolean pz_29 = ((!tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "SkipNoBranchOption")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!(param.SkipNoBranchOption)",pz_29);
return pz_29;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!(param.SkipNoBranchOption) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_30 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_2 = pz_30;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_3.getString("pxObjClass"))) {
	ctxt_page_3.putString("pxObjClass", "@baseclass");
}
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyBranchID", source_10, target_14);
{
    String pzSourceVar31 = "";
    pzSourceVar31 = "---";
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pega.setViaPropRef(".pyBranchID", pRef_32, myStepPage, pzSourceVar31, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyBranchID", source_10, target_14);
ClipboardPage source_11 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.2", "Set .pxObjClass", source_11, target_15);
// Change obj class
String pz_36 = "Embed-RuleSetBranch";
ClipboardPage tempPage_1 = tools.createPage(pz_36, "");
ClipboardProperty pz_35 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_42 = null;
try {
ctxt_frame_42 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_42.getStepPage();
pz_35 = propertyQuery_34.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_42);
} // return to previous step page

ClipboardPage targetPage_1 = pz_35.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"3.1.2", "Set .pxObjClass", source_11, target_15);
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
	"Rule-Obj-Model:PZGETVISIBLEBRANCHESFORAPPLICATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETVISIBLEBRANCHESFORAPPLICATION","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZGETVISIBLEBRANCHESFORAPPLICATION #20180713T135507.278 GMT","!PZGETVISIBLEBRANCHESFORAPPLICATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-90079295)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZGETVISIBLEBRANCHESFORAPPLICATION #20180713T135507.278 GMT:20180713T135507.278 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "da3326133d7d3df7d143aadcdc316412";
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

public static final String[] pRef_32 = new String[] { "", "", "pyBranchID", "" };
public static final String[] pRef_24 = new String[] { "", "", "pxResults", "<last>", "pyApplicationInsName", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyCount", "" };
public static final String[] pRef_3 = new String[] { "", "", "pxResultCount", "" };
public static final String[] pRef_27 = new String[] { "", "", "pxResults", "<last>", "pyProductName", "" };
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyBranchID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyRAInsName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZGETVISIBLEBRANCHESFORAPPLICATION #20180713T135507.278 GMT", "Code-Pega-List pzGetVisibleBranchesForApplication", "Pega-Desktop", "08-01-01", "20180713T135507.278 GMT");
}
