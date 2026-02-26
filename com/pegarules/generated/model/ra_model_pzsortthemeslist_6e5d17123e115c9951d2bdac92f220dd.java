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
public class ra_model_pzsortthemeslist_6e5d17123e115c9951d2bdac92f220dd extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzSortThemesList.Code_Pega_List.Model");
	public ra_model_pzsortthemeslist_6e5d17123e115c9951d2bdac92f220dd(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZSORTTHEMESLIST #20230618T001618.605 GMT	Pega-UIEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_1 = tools.getPrimaryPage().getIfPresent("pxResults");
foreach_prop_1 = pz_1;
actionProlog(pz_CurrentTraceInfo,"1", "For Each Page In", null, pz_1);
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
/* push '"Primary.pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary.pxResults(<CURRENT>)", ctxt_page_target_1);
/* push '"Primary.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "Primary.pxResults(<CURRENT>)", ctxt_page_source_1);
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
actionEpilog(pz_CurrentTraceInfo,"1", "For Each Page In", null, pz_1);
/* entering new scope */
boolean pop_ctxt_page_3 = false;
boolean pop_ctxt_page_4 = false;
try {
/* push '"Primary.pxResults(<INSERT>1)"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
if (tools.getPrimaryPage() == null) {
ctxt_page_2 = null;
} else { 
ctxt_page_2 = tools.getPrimaryPage().getPage(".pxResults(<insert>1)");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pxResults(<INSERT>1)", ctxt_page_2);
/* push '"Primary.pxResults(Param.DefaultThemeIndex +1)"' to scope SOURCE */
ClipboardPage ctxt_page_3 = null;
if (tools.getPrimaryPage() == null) {
ctxt_page_3 = null;
} else { 
ctxt_page_3 = tools.getPrimaryPage().getPage(".pxResults(" + (tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "DefaultThemeIndex") + 1) + ")");
}
pop_ctxt_page_4 = pega.pushScopedStepContext("SOURCE", "Primary.pxResults(Param.DefaultThemeIndex +1)", ctxt_page_3);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");ClipboardPage source_context_1 = pega.getScopedStepContext("SOURCE");actionProlog(pz_CurrentTraceInfo,"2", "Update Page", source_context_1, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Update Page", source_context_1, target_context_1);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_4) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_5 = false;
boolean pop_ctxt_page_6 = false;
try {
/* push '"Primary.pxResults(<INSERT>2)"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
if (tools.getPrimaryPage() == null) {
ctxt_page_4 = null;
} else { 
ctxt_page_4 = tools.getPrimaryPage().getPage(".pxResults(<insert>2)");
}
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", "Primary.pxResults(<INSERT>2)", ctxt_page_4);
/* push '"Primary.pxResults(Param.DarkThemeIndex +2)"' to scope SOURCE */
ClipboardPage ctxt_page_5 = null;
if (tools.getPrimaryPage() == null) {
ctxt_page_5 = null;
} else { 
ctxt_page_5 = tools.getPrimaryPage().getPage(".pxResults(" + (tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "DarkThemeIndex") + 2) + ")");
}
pop_ctxt_page_6 = pega.pushScopedStepContext("SOURCE", "Primary.pxResults(Param.DarkThemeIndex +2)", ctxt_page_5);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");ClipboardPage source_context_2 = pega.getScopedStepContext("SOURCE");actionProlog(pz_CurrentTraceInfo,"3", "Update Page", source_context_2, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Update Page", source_context_2, target_context_2);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_6) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set Param.test", source_1, target_1);
{
    tools.putParamValue("test", PropertyInfo.TYPE_TEXT, pega.<Void>resolveMethodCall("RemoveDeletedObjects--(ClipboardProperty)", "RemoveDeletedObjects", null, null, new Object[] { tools.getPrimaryPage().getProperty("pxResults") }));
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set Param.test", source_1, target_1);
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_11 = pega.findPageWithException("TempThemesList", "Code-Pega-List").getIfPresent("pxResults");
foreach_prop_2 = pz_11;
actionProlog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_11);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_6 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_7 = false;
boolean pop_ctxt_page_8 = false;
try {
/* push '"TempThemesList.pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_6;
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", "TempThemesList.pxResults(<CURRENT>)", ctxt_page_target_2);
/* push '"TempThemesList.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_2 = null;
ctxt_page_source_2 = ctxt_page_6;
pop_ctxt_page_8 = pega.pushScopedStepContext("SOURCE", "TempThemesList.pxResults(<CURRENT>)", ctxt_page_source_2);
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_2;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_8) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_11);
// Start Page-Remove from Remove action
actionProlog(pz_CurrentTraceInfo,"6", "Remove TempThemesList", null, null);
{
// Expression: TempThemesList
myStepPage = tools.findPage("TempThemesList");
if (myStepPage != null) {
ClipboardProperty parentProp = myStepPage.getParentProperty();
if (parentProp != null) {
parentProp.removeFromClipboard();
} else {
myStepPage.removeFromClipboard();
}
}
}
myStepPage = tools.getStepPage();
// End Page-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"6", "Remove TempThemesList", null, null);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1", "When", null, target_2);
switch (when_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "When", null, target_2);
} else if (otherwiseWhenCondition_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2", "Otherwise When", null, target_3);
switch (otherwiseWhen_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2", "Otherwise When", null, target_3);
} else if (otherwiseWhenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.3", "Otherwise When", null, target_4);
switch (otherwiseWhen_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.3", "Otherwise When", null, target_4);
}
return CODE_CONTINUE;
}private boolean whenCondition_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_10 = null;
try {
ctxt_frame_10 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_10.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@String.startsWith(.pyRuleSet,\"Pega-\")");
try {
boolean pz_13 = ((!(pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, "String", new Object[] { scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Pega-" })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@String.startsWith(.pyRuleSet,\"Pega-\")",pz_13);
return pz_13;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@String.startsWith(.pyRuleSet,\"Pega-\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
} // return to previous step page
}private int when_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_14 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_11 = null;
try {
ctxt_frame_11 = pega.pushStackFrame("TempThemesList.pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_11.getStepPage();
pz_14 = pega.findPageWithException("TempThemesList", "Code-Pega-List").getProperty("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
} // return to previous step page

targetProperty_1 = pz_14;
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '"TempThemesList.pxResults"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_12 = null;
try {
ctxt_frame_12 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_12.getStepPage();
ClipboardPage ctxt_page_7 = null;
ctxt_page_7 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_7.getString("pxObjClass"))) {
	ctxt_page_7.putString("pxObjClass", "Rule-UI-Theme");
}
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", "TempThemesList.pxResults", ctxt_page_7);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
} // return to previous step page
ClipboardPage sourcepage_1 =pega.getScopedStepContext("SOURCE");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Append and Map to", sourcepage_1, targetProperty_1);
switch (appendAndMapTo_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Append and Map to", sourcepage_1, targetProperty_1);
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.2", "Set .pyDeletedObject", source_2, target_5);
{
    String pzSourceVar15 = "";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pzSourceVar15 = "true";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyDeletedObject", pRef_16, myStepPage, pzSourceVar15, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.2", "Set .pyDeletedObject", source_2, target_5);
return CODE_CONTINUE;
}private int appendAndMapTo_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContext("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.1", "Set .pyRuleName", source_3, target_6);
{
    String pzSourceVar18 = "";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pzSourceVar18 = scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyRuleName", pRef_20, myStepPage, pzSourceVar18, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.1", "Set .pyRuleName", source_3, target_6);
ClipboardPage source_4 =pega.getScopedStepContext("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pzInsKey", source_4, target_7);
{
    String pzSourceVar22 = "";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pzSourceVar22 = scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pzInsKey", pRef_24, myStepPage, pzSourceVar22, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pzInsKey", source_4, target_7);
ClipboardPage source_5 =pega.getScopedStepContext("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyLabel", source_5, target_8);
{
    String pzSourceVar26 = "";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pzSourceVar26 = scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_28, myStepPage, pzSourceVar26, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyLabel", source_5, target_8);
ClipboardPage source_6 =pega.getScopedStepContext("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pyRuleSet", source_6, target_9);
{
    String pzSourceVar30 = "";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pzSourceVar30 = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyRuleSet", pRef_31, myStepPage, pzSourceVar30, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pyRuleSet", source_6, target_9);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_33 = null;
try {
ctxt_frame_33 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_33.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyRuleName,\"pzCosmosDefault\")");
try {
boolean pz_33 = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", null, null, new Object[] { scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pzCosmosDefault" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyRuleName,\"pzCosmosDefault\")",pz_33);
return pz_33;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equalsIgnoreCase(.pyRuleName,\"pzCosmosDefault\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
} // return to previous step page
}private int otherwiseWhen_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.1", "Set Param.DefaultThemeIndex", source_7, target_10);
{
    int pzSourceVar34 = 0;
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pzSourceVar34 = tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        tools.putParamValue("DefaultThemeIndex", PropertyInfo.TYPE_INTEGER, pzSourceVar34);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.1", "Set Param.DefaultThemeIndex", source_7, target_10);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_38 = null;
try {
ctxt_frame_38 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_38.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyRuleName,\"pzDark\")");
try {
boolean pz_36 = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", null, null, new Object[] { scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pzDark" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyRuleName,\"pzDark\")",pz_36);
return pz_36;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equalsIgnoreCase(.pyRuleName,\"pzDark\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_38);
} // return to previous step page
}private int otherwiseWhen_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.1", "Set Param.DarkThemeIndex", source_8, target_11);
{
    int pzSourceVar37 = 0;
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pzSourceVar37 = tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        tools.putParamValue("DarkThemeIndex", PropertyInfo.TYPE_INTEGER, pzSourceVar37);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.1", "Set Param.DarkThemeIndex", source_8, target_11);
return CODE_CONTINUE;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyLabel", source_9, target_12);
{
    String pzSourceVar39 = "";
    PRStackFrame ctxt_frame_44 = null;
    try {
        ctxt_frame_44 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_44.getStepPage();
        pzSourceVar39 = scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_44);
    }
    PRStackFrame ctxt_frame_43 = null;
    try {
        ctxt_frame_43 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_43.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_28, myStepPage, pzSourceVar39, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_43);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyLabel", source_9, target_12);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyRuleName", source_10, target_13);
{
    String pzSourceVar41 = "";
    PRStackFrame ctxt_frame_48 = null;
    try {
        ctxt_frame_48 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_48.getStepPage();
        pzSourceVar41 = scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_48);
    }
    PRStackFrame ctxt_frame_47 = null;
    try {
        ctxt_frame_47 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_47.getStepPage();
        pega.setViaPropRef(".pyRuleName", pRef_20, myStepPage, pzSourceVar41, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyRuleName", source_10, target_13);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pyRuleSet", source_11, target_14);
{
    String pzSourceVar43 = "";
    PRStackFrame ctxt_frame_52 = null;
    try {
        ctxt_frame_52 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_52.getStepPage();
        pzSourceVar43 = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_52);
    }
    PRStackFrame ctxt_frame_51 = null;
    try {
        ctxt_frame_51 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_51.getStepPage();
        pega.setViaPropRef(".pyRuleSet", pRef_31, myStepPage, pzSourceVar43, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_51);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pyRuleSet", source_11, target_14);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.4", "Set .pzInsKey", source_12, target_15);
{
    String pzSourceVar45 = "";
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pzSourceVar45 = scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
    PRStackFrame ctxt_frame_55 = null;
    try {
        ctxt_frame_55 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_55.getStepPage();
        pega.setViaPropRef(".pzInsKey", pRef_24, myStepPage, pzSourceVar45, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_55);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.4", "Set .pzInsKey", source_12, target_15);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.5", "Set Primary.pxResults(Param.DefaultThemeIndex +1).pyDeletedObject", source_13, target_16);
{
    String pzSourceVar47 = "";
    PRStackFrame ctxt_frame_60 = null;
    try {
        ctxt_frame_60 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_60.getStepPage();
        pzSourceVar47 = "true";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
    }
    PRStackFrame ctxt_frame_59 = null;
    try {
        ctxt_frame_59 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_59.getStepPage();
        pega.setViaPropRef(".pxResults(" + (tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "DefaultThemeIndex") + 1) + ").pyDeletedObject", new String[] { "", "", "pxResults", String.valueOf((tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "DefaultThemeIndex") + 1)), "pyDeletedObject", "" }, tools.getPrimaryPage(), pzSourceVar47, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_59);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.5", "Set Primary.pxResults(Param.DefaultThemeIndex +1).pyDeletedObject", source_13, target_16);
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyLabel", source_14, target_17);
{
    String pzSourceVar49 = "";
    PRStackFrame ctxt_frame_64 = null;
    try {
        ctxt_frame_64 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_64.getStepPage();
        pzSourceVar49 = scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_64);
    }
    PRStackFrame ctxt_frame_63 = null;
    try {
        ctxt_frame_63 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_63.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_28, myStepPage, pzSourceVar49, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyLabel", source_14, target_17);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyRuleName", source_15, target_18);
{
    String pzSourceVar51 = "";
    PRStackFrame ctxt_frame_68 = null;
    try {
        ctxt_frame_68 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_68.getStepPage();
        pzSourceVar51 = scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_68);
    }
    PRStackFrame ctxt_frame_67 = null;
    try {
        ctxt_frame_67 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_67.getStepPage();
        pega.setViaPropRef(".pyRuleName", pRef_20, myStepPage, pzSourceVar51, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_67);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyRuleName", source_15, target_18);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set .pyRuleSet", source_16, target_19);
{
    String pzSourceVar53 = "";
    PRStackFrame ctxt_frame_72 = null;
    try {
        ctxt_frame_72 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_72.getStepPage();
        pzSourceVar53 = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_72);
    }
    PRStackFrame ctxt_frame_71 = null;
    try {
        ctxt_frame_71 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_71.getStepPage();
        pega.setViaPropRef(".pyRuleSet", pRef_31, myStepPage, pzSourceVar53, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_71);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set .pyRuleSet", source_16, target_19);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4", "Set .pzInsKey", source_17, target_20);
{
    String pzSourceVar55 = "";
    PRStackFrame ctxt_frame_76 = null;
    try {
        ctxt_frame_76 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_76.getStepPage();
        pzSourceVar55 = scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_76);
    }
    PRStackFrame ctxt_frame_75 = null;
    try {
        ctxt_frame_75 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_75.getStepPage();
        pega.setViaPropRef(".pzInsKey", pRef_24, myStepPage, pzSourceVar55, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_75);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.4", "Set .pzInsKey", source_17, target_20);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.5", "Set Primary.pxResults(Param.DarkThemeIndex +2).pyDeletedObject", source_18, target_21);
{
    String pzSourceVar57 = "";
    PRStackFrame ctxt_frame_80 = null;
    try {
        ctxt_frame_80 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_80.getStepPage();
        pzSourceVar57 = "true";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_80);
    }
    PRStackFrame ctxt_frame_79 = null;
    try {
        ctxt_frame_79 = pega.pushStackFrame("@baseclass", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_79.getStepPage();
        pega.setViaPropRef(".pxResults(" + (tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "DarkThemeIndex") + 2) + ").pyDeletedObject", new String[] { "", "", "pxResults", String.valueOf((tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "DarkThemeIndex") + 2)), "pyDeletedObject", "" }, tools.getPrimaryPage(), pzSourceVar57, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_79);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.5", "Set Primary.pxResults(Param.DarkThemeIndex +2).pyDeletedObject", source_18, target_21);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set Primary.pxResults(<APPEND>).pyLabel", source_19, target_22);
{
    String pzSourceVar59 = "";
    PRStackFrame ctxt_frame_84 = null;
    try {
        ctxt_frame_84 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_84.getStepPage();
        pzSourceVar59 = scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_84);
    }
    PRStackFrame ctxt_frame_83 = null;
    try {
        ctxt_frame_83 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_83.getStepPage();
        pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_60, tools.getPrimaryPage(), pzSourceVar59, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_83);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set Primary.pxResults(<APPEND>).pyLabel", source_19, target_22);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2", "Set Primary.pxResults(<LAST>).pyRuleName", source_20, target_23);
{
    String pzSourceVar62 = "";
    PRStackFrame ctxt_frame_88 = null;
    try {
        ctxt_frame_88 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_88.getStepPage();
        pzSourceVar62 = scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_88);
    }
    PRStackFrame ctxt_frame_87 = null;
    try {
        ctxt_frame_87 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_87.getStepPage();
        pega.setViaPropRef(".pxResults(<last>).pyRuleName", pRef_63, tools.getPrimaryPage(), pzSourceVar62, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_87);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2", "Set Primary.pxResults(<LAST>).pyRuleName", source_20, target_23);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.3", "Set Primary.pxResults(<LAST>).pzInsKey", source_21, target_24);
{
    String pzSourceVar65 = "";
    PRStackFrame ctxt_frame_92 = null;
    try {
        ctxt_frame_92 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_92.getStepPage();
        pzSourceVar65 = scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_92);
    }
    PRStackFrame ctxt_frame_91 = null;
    try {
        ctxt_frame_91 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_91.getStepPage();
        pega.setViaPropRef(".pxResults(<last>).pzInsKey", pRef_66, tools.getPrimaryPage(), pzSourceVar65, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_91);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.3", "Set Primary.pxResults(<LAST>).pzInsKey", source_21, target_24);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.4", "Set Primary.pxResults(<LAST>).pyRuleSet", source_22, target_25);
{
    String pzSourceVar68 = "";
    PRStackFrame ctxt_frame_96 = null;
    try {
        ctxt_frame_96 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_96.getStepPage();
        pzSourceVar68 = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_96);
    }
    PRStackFrame ctxt_frame_95 = null;
    try {
        ctxt_frame_95 = pega.pushStackFrame("Rule-UI-Theme", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_95.getStepPage();
        pega.setViaPropRef(".pxResults(<last>).pyRuleSet", pRef_69, tools.getPrimaryPage(), pzSourceVar68, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_95);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.4", "Set Primary.pxResults(<LAST>).pyRuleSet", source_22, target_25);
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
	"Rule-Obj-Model:PZSORTTHEMESLIST"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSORTTHEMESLIST","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-UIEngine","08-23-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZSORTTHEMESLIST #20230618T001618.605 GMT","!PZSORTTHEMESLIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-231539320)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZSORTTHEMESLIST #20230618T001618.605 GMT:20230618T001618.605 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7438e1fce16d91587de2be4ad1d82489";
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

public static final String[] pRef_28 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_69 = new String[] { "", "", "pxResults", "<last>", "pyRuleSet", "" };
public static final String[] pRef_63 = new String[] { "", "", "pxResults", "<last>", "pyRuleName", "" };
public static final String[] pRef_66 = new String[] { "", "", "pxResults", "<last>", "pzInsKey", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyRuleSet", "" };
public static final String[] pRef_60 = new String[] { "", "", "pxResults", "<append>", "pyLabel", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyRuleName", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyDeletedObject", "" };
public static final String[] pRef_24 = new String[] { "", "", "pzInsKey", "" };
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_4 = FUAUtil.createQueryBuilder().pageList("pxResults").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZSORTTHEMESLIST #20230618T001618.605 GMT", "Code-Pega-List pzSortThemesList", "Pega-UIEngine", "08-23-01", "20230618T001618.605 GMT");
}
