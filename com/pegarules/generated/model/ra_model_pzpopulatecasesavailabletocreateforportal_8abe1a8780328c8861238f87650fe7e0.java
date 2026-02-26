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
public class ra_model_pzpopulatecasesavailabletocreateforportal_8abe1a8780328c8861238f87650fe7e0 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzPopulateCasesAvailableToCreateForPortal.Rule_Obj_Flow.Model");
	public ra_model_pzpopulatecasesavailabletocreateforportal_8abe1a8780328c8861238f87650fe7e0(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL RULE-OBJ-FLOW PZPOPULATECASESAVAILABLETOCREATEFORPORTAL #20200724T182235.635 GMT	Pega-EndUserUI:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "When", null, target_1);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_2);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_2);
} else {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "Otherwise", null, target_3);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Otherwise", null, target_3);
}
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PropertyExists(\"pyPortal.pyCaseTypesAvailableToCreate\") == false");
try {
boolean pz_1 = ((pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { "pyPortal.pyCaseTypesAvailableToCreate" })).booleanValue() == false);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PropertyExists(\"pyPortal.pyCaseTypesAvailableToCreate\") == false",pz_1);
return pz_1;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PropertyExists(\"pyPortal.pyCaseTypesAvailableToCreate\") == false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
boolean pop_ctxt_page_2 = false;
try {
/* push '"Primary"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = tools.getPrimaryPage();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary", ctxt_page_1);
/* push '"D_StartingFlows"' to scope SOURCE */
ClipboardPage ctxt_page_2 = null;
String pz_2 = "D_StartingFlows";
ctxt_page_2 = tools.findPage(pz_2, true);
if (ctxt_page_2 == null) {
ctxt_page_2 = tools.findPage(pz_2, false);
ctxt_page_2.putString("pxObjClass", "Rule-Obj-Flow");
}
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "D_StartingFlows", ctxt_page_2);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");ClipboardPage source_context_1 = pega.getScopedStepContext("SOURCE");actionProlog(pz_CurrentTraceInfo,"2.1", "Update Page", source_context_1, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "Update Page", source_context_1, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Set .pxResults", source_1, target_4);
{
    ClipboardProperty pzSourceVar3 = (ClipboardProperty) null;
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pzSourceVar3 = myStepPage.getProperty("pxResults");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.getViaPropRef(".pxResults", pRef_4, myStepPage, false, false).setValue(pzSourceVar3);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Set .pxResults", source_1, target_4);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@SizeOfPropertyList(pyPortal.pyCaseTypesAvailableToCreate) == 0");
try {
boolean pz_7 = ((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { pega.findPageWithException("pyPortal", "Data-Portal").getProperty("pyCaseTypesAvailableToCreate") })).intValue() == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@SizeOfPropertyList(pyPortal.pyCaseTypesAvailableToCreate) == 0",pz_7);
return pz_7;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@SizeOfPropertyList(pyPortal.pyCaseTypesAvailableToCreate) == 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_8 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_1 = pz_8;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Set .pyLabel", source_2, target_5);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { ("NoWorkTypes\t" + scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)), "pyCaption", tools });
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_11, myStepPage, pzSourceVar9, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Set .pyLabel", source_2, target_5);
ClipboardPage source_3 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.2", "Set .pxObjClass", source_3, target_6);
// Change obj class
String pz_15 = "Rule-Obj-Flow";
ClipboardPage tempPage_1 = tools.createPage(pz_15, "");
ClipboardProperty pz_14 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_11 = null;
try {
ctxt_frame_11 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_11.getStepPage();
pz_14 = propertyQuery_13.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
} // return to previous step page

ClipboardPage targetPage_1 = pz_14.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"4.1.2", "Set .pxObjClass", source_3, target_6);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_16 = pega.findPageWithException("pyPortal", "Data-Portal").getIfPresent("pyCaseTypesAvailableToCreate");
foreach_prop_1 = pz_16;
actionProlog(pz_CurrentTraceInfo,"6.1", "For Each Page In", null, pz_16);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_4 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_4 = false;
boolean pop_ctxt_page_5 = false;
try {
/* push '"pyPortal.pyCaseTypesAvailableToCreate(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_4;
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "pyPortal.pyCaseTypesAvailableToCreate(<CURRENT>)", ctxt_page_target_1);
/* push '"pyPortal.pyCaseTypesAvailableToCreate(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_4;
pop_ctxt_page_5 = pega.pushScopedStepContext("SOURCE", "pyPortal.pyCaseTypesAvailableToCreate(<CURRENT>)", ctxt_page_source_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_5) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"6.1", "For Each Page In", null, pz_16);
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6.3", "When", null, target_7);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.3", "When", null, target_7);
}
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.1", "Set Param.currentIndex", source_4, target_8);
{
    int pzSourceVar17 = 0;
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pzSourceVar17 = (pega.<Integer>resolveMethodCall("pxGetActiveIndex--(ClipboardPage)", "pxGetActiveIndex", null, null, new Object[] { myStepPage })).intValue();
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        tools.putParamValue("currentIndex", PropertyInfo.TYPE_INTEGER, pzSourceVar17);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.1", "Set Param.currentIndex", source_4, target_8);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.3", "Set Param.insName", source_5, target_9);
{
    String pzSourceVar19 = "";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pzSourceVar19 = scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT, tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "currentIndex"));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        tools.putParamValue("insName", PropertyInfo.TYPE_TEXT, pzSourceVar19);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.3", "Set Param.insName", source_5, target_9);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.4", "Set Param.className", source_6, target_10);
{
    String pzSourceVar22 = "";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pzSourceVar22 = scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT, tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "currentIndex"));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        tools.putParamValue("className", PropertyInfo.TYPE_TEXT, pzSourceVar22);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.4", "Set Param.className", source_6, target_10);
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_25 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_26 = null;
try {
ctxt_frame_26 = pega.pushStackFrame("D_StartingFlows.pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_26.getStepPage();
pz_25 = pega.findPageWithException("D_StartingFlows", "Rule-Obj-Flow").getIfPresent("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
} // return to previous step page

foreach_prop_2 = pz_25;
actionProlog(pz_CurrentTraceInfo,"6.1.5", "For Each Page In", null, pz_25);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
try {
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_5 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_6 = false;
boolean pop_ctxt_page_7 = false;
try {
/* push '"D_StartingFlows.pxResults(<CURRENT>)"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_27 = null;
try {
ctxt_frame_27 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_27.getStepPage();
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_5;
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", "D_StartingFlows.pxResults(<CURRENT>)", ctxt_page_target_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
} // return to previous step page
/* push '"D_StartingFlows.pxResults(<CURRENT>)"' to scope SOURCE */
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_28 = null;
try {
ctxt_frame_28 = pega.pushStackFrame("\"switching to update SOURCE\"", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_28.getStepPage();
ClipboardPage ctxt_page_source_2 = null;
ctxt_page_source_2 = ctxt_page_5;
pop_ctxt_page_7 = pega.pushScopedStepContext("SOURCE", "D_StartingFlows.pxResults(<CURRENT>)", ctxt_page_source_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
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
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_7) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
} finally {
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
}
}
actionEpilog(pz_CurrentTraceInfo,"6.1.5", "For Each Page In", null, pz_25);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6.1.5.1", "When", null, target_11);
switch (when_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.1.5.1", "When", null, target_11);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_29 = null;
try {
ctxt_frame_29 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_29.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__1 = pega.invokeWhen("pzHasMatchingCaseTypeInCreateMenu", "Rule-Obj-Flow", "Rule-Obj-Flow");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
} // return to previous step page
}private int when_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.5.1.1", "Set Primary.pxResults(<APPEND>)", source_7, target_12);
{
    ClipboardPage pzSourceVar26 = (ClipboardPage) null;
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pzSourceVar26 = pageQuery_27.resolve(tools, pega.findPageWithException("D_StartingFlows", "Rule-Obj-Flow"), forEachCounter);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pxResults(<append>)", pRef_28, tools.getPrimaryPage(), pzSourceVar26, "S!Y-", false, false);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.5.1.1", "Set Primary.pxResults(<APPEND>)", source_7, target_12);
actionProlog(pz_CurrentTraceInfo,"6.1.5.1.2", "Exit For Each", null, null);
actionEpilog(pz_CurrentTraceInfo,"6.1.5.1.2", "Exit For Each", null, null);
// Exit For Each
return CODE_EXIT_ITERATION;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@SizeOfPropertyList(Primary.pxResults)==0");
try {
boolean pz_30 = ((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { tools.getPrimaryPage().getProperty("pxResults") })).intValue() == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@SizeOfPropertyList(Primary.pxResults)==0",pz_30);
return pz_30;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@SizeOfPropertyList(Primary.pxResults)==0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_8 = false;
boolean pop_ctxt_page_9 = false;
try {
/* push '"Primary"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ctxt_page_6 = tools.getPrimaryPage();
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", "Primary", ctxt_page_6);
/* push '"D_StartingFlows"' to scope SOURCE */
ClipboardPage ctxt_page_7 = null;
String pz_31 = "D_StartingFlows";
ctxt_page_7 = tools.findPage(pz_31, true);
if (ctxt_page_7 == null) {
ctxt_page_7 = tools.findPage(pz_31, false);
ctxt_page_7.putString("pxObjClass", "Rule-Obj-Flow");
}
pop_ctxt_page_9 = pega.pushScopedStepContext("SOURCE", "D_StartingFlows", ctxt_page_7);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");ClipboardPage source_context_2 = pega.getScopedStepContext("SOURCE");actionProlog(pz_CurrentTraceInfo,"6.3.1", "Update Page", source_context_2, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.3.1", "Update Page", source_context_2, target_context_2);
} finally {
if (pop_ctxt_page_8) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_9) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.3.1.1", "Set .pxResults", source_8, target_13);
{
    ClipboardProperty pzSourceVar32 = (ClipboardProperty) null;
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pzSourceVar32 = myStepPage.getProperty("pxResults");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
    PRStackFrame ctxt_frame_36 = null;
    try {
        ctxt_frame_36 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_36.getStepPage();
        pega.getViaPropRef(".pxResults", pRef_4, myStepPage, false, false).setValue(pzSourceVar32);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_36);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.3.1.1", "Set .pxResults", source_8, target_13);
return CODE_CONTINUE;
}/** Metadata for the rule */
private static final Map oMetaData;

// initialize metadata for the rule
static {
oMetaData = new HashMap(1);
oMetaData.put(".pyCallSuperClassModel", "true");
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
	"Rule-Obj-Model:PZPOPULATECASESAVAILABLETOCREATEFORPORTAL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATECASESAVAILABLETOCREATEFORPORTAL","Rule-Obj-Model","RULE-OBJ-FLOW",false,"","Pega-EndUserUI","08-06-01","RULE-OBJ-MODEL RULE-OBJ-FLOW PZPOPULATECASESAVAILABLETOCREATEFORPORTAL #20200724T182235.635 GMT","!PZPOPULATECASESAVAILABLETOCREATEFORPORTAL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1677676007)
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
//	RULE-OBJ-MODEL RULE-OBJ-FLOW PZPOPULATECASESAVAILABLETOCREATEFORPORTAL #20200724T182235.635 GMT:20200724T182235.635 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e68cfcab2ee0eead234e5071c640fcee";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
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

public static final String[] pRef_4 = new String[] { "", "", "pxResults", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_28 = new String[] { "", "", "pxResults", "<append>" };
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().pageList("pyCaseTypesAvailableToCreate").scalarProperty("pyClassName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final PageQuery pageQuery_27 = FUAUtil.createQueryBuilder().pageList("pxResults").buildPageQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().pageList("pyCaseTypesAvailableToCreate").scalarProperty("pxInsName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-FLOW PZPOPULATECASESAVAILABLETOCREATEFORPORTAL #20200724T182235.635 GMT", "Rule-Obj-Flow pzPopulateCasesAvailableToCreateForPortal", "Pega-EndUserUI", "08-06-01", "20200724T182235.635 GMT");
}
