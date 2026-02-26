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
public class ra_model_pzbuildactiveapplicationfilters_27f2fdd5aaeeb2e2cd48defa2ecd20fd extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzBuildActiveApplicationFilters.PegaGadget_Filter.Model");
	public ra_model_pzbuildactiveapplicationfilters_27f2fdd5aaeeb2e2cd48defa2ecd20fd(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGAGADGET-FILTER PZBUILDACTIVEAPPLICATIONFILTERS #20180713T133523.390 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pyActiveApplicationFiltersString", source_1, target_2);
{
    pega.setViaPropRef(".pyActiveApplicationFiltersString", pRef_1, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pyActiveApplicationFiltersString", source_1, target_2);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6", "Set .pyApplicationFilterChoicesCopy", source_2, target_3);
{
    ClipboardProperty pzSourceVar2 = myStepPage.getProperty("pyApplicationFilterChoices");
    ClipboardProperty pzTargetVar3 = pega.getViaPropRef(".pyApplicationFilterChoicesCopy", pRef_4, myStepPage, false, false);
    pzTargetVar3.setValue(pzSourceVar2);
}

actionEpilog(pz_CurrentTraceInfo,"6", "Set .pyApplicationFilterChoicesCopy", source_2, target_3);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set Primary.pyAppVersionConcatQuoted", source_3, target_4);
{
    pega.setViaPropRef(".pyAppVersionConcatQuoted", pRef_7, tools.getPrimaryPage(), "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set Primary.pyAppVersionConcatQuoted", source_3, target_4);
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9", "When", null, target_5);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"9", "When", null, target_5);
}
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_8 = myStepPage.getIfPresent("pyApplicationFilterChoices");
foreach_prop_1 = pz_8;
actionProlog(pz_CurrentTraceInfo,"10", "For Each Page In", null, pz_8);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pyApplicationFilterChoices(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pyApplicationFilterChoices(<CURRENT>)", ctxt_page_target_1);
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
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"10", "For Each Page In", null, pz_8);
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11", "When", null, target_6);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"11", "When", null, target_6);
}
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12", "Set .pyAppContextInfo.pyApplicationList", source_4, target_7);
{
    pega.setViaPropRef(".pyAppContextInfo.pyApplicationList", pRef_9, myStepPage, scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"12", "Set .pyAppContextInfo.pyApplicationList", source_4, target_7);
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"13", "When", null, target_8);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"13", "When", null, target_8);
} else {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"14", "Otherwise", null, target_9);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"14", "Otherwise", null, target_9);
}
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_10 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"15", "When", null, target_10);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"15", "When", null, target_10);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyCallPreDataTransform==true");
try {
boolean pz_12 = (scalarValueQuery_11.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyCallPreDataTransform==true",pz_12);
return pz_12;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyCallPreDataTransform==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"Parent"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
String pz_13 = "Parent";
ctxt_page_2 = tools.findPage(pz_13, false);
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "Parent", ctxt_page_2);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.1", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_4 = null;
try {
ctxt_frame_4 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_4.getStepPage();

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"2.1.1", "Apply Data Transform pxFilterGadgetPreTransform", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "PegaGadget-Filter";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pxFilterGadgetPreTransform");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Apply Data Transform pxFilterGadgetPreTransform", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
} // return to previous step page
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).LengthOfPageList(.pyApplicationFilterChoices) &gt; 0");
try {
boolean pz_14 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", "Pega-RULES", "Utilities", new Object[] { myStepPage.getProperty("pyApplicationFilterChoices") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).LengthOfPageList(.pyApplicationFilterChoices) &gt; 0",pz_14);
return pz_14;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Utilities).LengthOfPageList(.pyApplicationFilterChoices) &gt; 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_15 = myStepPage.getIfPresent("pyApplicationFilterChoices");
foreach_prop_2 = pz_15;
actionProlog(pz_CurrentTraceInfo,"9.1", "For Each Page In", null, pz_15);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_3 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_3 = false;
boolean pop_ctxt_page_4 = false;
try {
/* push '".pyApplicationFilterChoices(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_3;
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pyApplicationFilterChoices(<CURRENT>)", ctxt_page_target_2);
/* push '".pyApplicationFilterChoices(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_3;
pop_ctxt_page_4 = pega.pushScopedStepContext("SOURCE", ".pyApplicationFilterChoices(<CURRENT>)", ctxt_page_source_1);
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
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
}
actionEpilog(pz_CurrentTraceInfo,"9.1", "For Each Page In", null, pz_15);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_6(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9.1.1", "When", null, target_11);
switch (when_6(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"9.1.1", "When", null, target_11);
}
return CODE_CONTINUE;
}private boolean whenCondition_6(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_8 = null;
try {
ctxt_frame_8 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_8.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFilterActive==\"true\"");
try {
boolean pz_17 = (scalarValueQuery_16.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFilterActive==\"true\"",pz_17);
return pz_17;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFilterActive==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
} // return to previous step page
}private int when_6(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1.1.1", "Set Primary.pyAppVersionConcatQuoted", source_5, target_12);
{
    String pzSourceVar18 = "";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pzSourceVar18 = ((((((scalarValueQuery_19.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) + "\"") + scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ":") + scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "\"") + ",");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyAppVersionConcatQuoted", pRef_7, tools.getPrimaryPage(), pzSourceVar18, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1.1.1", "Set Primary.pyAppVersionConcatQuoted", source_5, target_12);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_7(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.1", "When", null, target_13);
switch (when_7(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.1", "When", null, target_13);
}
return CODE_CONTINUE;
}private boolean whenCondition_7(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_13 = null;
try {
ctxt_frame_13 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_13.getStepPage();
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFilterActive==\"true\"");
try {
boolean pz_23 = (scalarValueQuery_16.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFilterActive==\"true\"",pz_23);
return pz_23;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFilterActive==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
} // return to previous step page
}private int when_7(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_8(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_14 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.1.1", "When", null, target_14);
switch (when_8(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.1.1", "When", null, target_14);
} else {
ClipboardPage target_15 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.1.2", "Otherwise", null, target_15);
switch (otherwise_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.1.2", "Otherwise", null, target_15);
}
return CODE_CONTINUE;
}private boolean whenCondition_8(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_14 = null;
try {
ctxt_frame_14 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_14.getStepPage();
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyActiveApplicationFiltersString != \"\"");
try {
boolean pz_24 = (!(scalarValueQuery_10.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyActiveApplicationFiltersString != \"\"",pz_24);
return pz_24;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyActiveApplicationFiltersString != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
} // return to previous step page
}private int when_8(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1.1.1", "Set Primary.pyActiveApplicationFiltersString", source_6, target_16);
{
    String pzSourceVar25 = "";
    pzSourceVar25 = ((scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + ",") + scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT, forEachCounter));
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyActiveApplicationFiltersString", pRef_1, tools.getPrimaryPage(), pzSourceVar25, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1.1.1", "Set Primary.pyActiveApplicationFiltersString", source_6, target_16);
return CODE_CONTINUE;
}private int otherwise_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1.2.1", "Set Primary.pyActiveApplicationFiltersString", source_7, target_17);
{
    String pzSourceVar28 = "";
    pzSourceVar28 = scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyActiveApplicationFiltersString", pRef_1, tools.getPrimaryPage(), pzSourceVar28, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1.2.1", "Set Primary.pyActiveApplicationFiltersString", source_7, target_17);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).length(Primary.pyAppVersionConcatQuoted) &gt; 1");
try {
boolean pz_30 = ((pega.<Integer>resolveMethodCall("length--(String)", "length", "Pega-RULES", "String", new Object[] { scalarValueQuery_19.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) })).intValue() > 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).length(Primary.pyAppVersionConcatQuoted) &gt; 1",pz_30);
return pz_30;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).length(Primary.pyAppVersionConcatQuoted) &gt; 1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1", "Set Primary.pyAppVersionConcatQuoted", source_8, target_18);
{
    pega.setViaPropRef(".pyAppVersionConcatQuoted", pRef_7, tools.getPrimaryPage(), pega.<String>resolveMethodCall("stripCharsOffEnd--(String,String)", "stripCharsOffEnd", "Pega-RULES", "String", new Object[] { scalarValueQuery_19.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), Integer.toString(1) }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"11.1", "Set Primary.pyAppVersionConcatQuoted", source_8, target_18);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyAppContextInfo.pyApplicationList != \"\"");
try {
boolean pz_32 = (!(scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyAppContextInfo.pyApplicationList != \"\"",pz_32);
return pz_32;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyAppContextInfo.pyApplicationList != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1", "Set .pyAppContextInfo.pyFilterOnApplicationContext", source_9, target_19);
{
    pega.setViaPropRef(".pyAppContextInfo.pyFilterOnApplicationContext", pRef_33, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13.1", "Set .pyAppContextInfo.pyFilterOnApplicationContext", source_9, target_19);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.2", "Set .pyAppContextInfo.pyApplicationContextMode", source_10, target_20);
{
    pega.setViaPropRef(".pyAppContextInfo.pyApplicationContextMode", pRef_34, myStepPage, "AppAll", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13.2", "Set .pyAppContextInfo.pyApplicationContextMode", source_10, target_20);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.3", "Set .pyAppContextInfoReference", source_11, target_21);
{
    pega.setViaPropRef(".pyAppContextInfoReference", pRef_35, myStepPage, (tools.getPrimaryPage().getProperty("pyAppContextInfo").getReference()), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13.3", "Set .pyAppContextInfoReference", source_11, target_21);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"14.1", "Remove .pyAppContextInfo.pyFilterOnApplicationContext", null, null);
// Start Property-Remove from Remove action
{
// Expression: .pyAppContextInfo.pyFilterOnApplicationContext
ClipboardProperty pz_36 = pega.getViaPropRef(".pyAppContextInfo.pyFilterOnApplicationContext", pRef_33, myStepPage, false, true);
try {if (pz_36!= null) {
pz_36.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +".";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
}// End Property-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"14.1", "Remove .pyAppContextInfo.pyFilterOnApplicationContext", null, null);
actionProlog(pz_CurrentTraceInfo,"14.2", "Remove .pyAppContextInfo.pyApplicationContextMode", null, null);
// Start Property-Remove from Remove action
{
// Expression: .pyAppContextInfo.pyApplicationContextMode
ClipboardProperty pz_37 = pega.getViaPropRef(".pyAppContextInfo.pyApplicationContextMode", pRef_34, myStepPage, false, true);
try {if (pz_37!= null) {
pz_37.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +".";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
}// End Property-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"14.2", "Remove .pyAppContextInfo.pyApplicationContextMode", null, null);
actionProlog(pz_CurrentTraceInfo,"14.3", "Remove .pyAppContextInfoReference", null, null);
// Start Property-Remove from Remove action
{
// Expression: .pyAppContextInfoReference
ClipboardProperty pz_39 = propertyQuery_38.resolve(tools, myStepPage);
try {if (pz_39!= null) {
pz_39.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +".";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
}// End Property-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"14.3", "Remove .pyAppContextInfoReference", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyCallPostDataTransform==true");
try {
boolean pz_41 = (scalarValueQuery_40.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyCallPostDataTransform==true",pz_41);
return pz_41;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyCallPostDataTransform==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '"Parent"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
String pz_42 = "Parent";
ctxt_page_4 = tools.findPage(pz_42, false);
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", "Parent", ctxt_page_4);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"15.1", "Update Page", null, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"15.1", "Update Page", null, target_context_2);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_26 = null;
try {
ctxt_frame_26 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_26.getStepPage();

// processScalarParameters
ParameterPage pz_param_2 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"15.1.1", "Apply Data Transform pxFilterGadgetPostTransform", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_2 = null;
if (myStepPage != null) {
	pz_modelClass_2 = myStepPage.getClassName();
}
if ((pz_modelClass_2 == null) || (pz_modelClass_2.length() == 0)) { 
	pz_modelClass_2 = "PegaGadget-Filter";
}
StringMap pz_modelKey_2 = new HashStringMap(3);
pz_modelKey_2.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_2.putString("pyModelName", "pxFilterGadgetPostTransform");
pz_modelKey_2.putString("pyClassName", pz_modelClass_2);
tools.applyModel(myStepPage, pz_modelKey_2, pz_param_2);
actionEpilog(pz_CurrentTraceInfo,"15.1.1", "Apply Data Transform pxFilterGadgetPostTransform", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
} // return to previous step page
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
	"Rule-Obj-Model:PZBUILDACTIVEAPPLICATIONFILTERS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZBUILDACTIVEAPPLICATIONFILTERS","Rule-Obj-Model","PEGAGADGET-FILTER",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-MODEL PEGAGADGET-FILTER PZBUILDACTIVEAPPLICATIONFILTERS #20180713T133523.390 GMT","!PZBUILDACTIVEAPPLICATIONFILTERS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1955746202)
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
//	RULE-OBJ-MODEL PEGAGADGET-FILTER PZBUILDACTIVEAPPLICATIONFILTERS #20180713T133523.390 GMT:20180713T133523.390 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f036e8577fce8b5359879c2a640d601b";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaGadget-Filter";
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

public static final String[] pRef_33 = new String[] { "", "", "pyAppContextInfo", "", "pyFilterOnApplicationContext", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyAppVersionConcatQuoted", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyApplicationFilterChoicesCopy", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyAppContextInfo", "", "pyApplicationContextMode", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyActiveApplicationFiltersString", "" };
public static final String[] pRef_35 = new String[] { "", "", "pyAppContextInfoReference", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyAppContextInfo", "", "pyApplicationList", "" };
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyCallPreDataTransform").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pyAppVersionConcatQuoted").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyFilterActive").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().pageList("pyApplicationFilterChoices").scalarProperty("pyFilterProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pyFilterVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyActiveApplicationFiltersString").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyFilterProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().page("pyAppContextInfo").scalarProperty("pyApplicationList").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarProperty("pyCallPostDataTransform").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_38 = FUAUtil.createQueryBuilder().scalarProperty("pyAppContextInfoReference").ifPresent().buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGAGADGET-FILTER PZBUILDACTIVEAPPLICATIONFILTERS #20180713T133523.390 GMT", "PegaGadget-Filter pzBuildActiveApplicationFilters", "Pega-Gadgets", "08-01-01", "20180713T133523.390 GMT");
}
