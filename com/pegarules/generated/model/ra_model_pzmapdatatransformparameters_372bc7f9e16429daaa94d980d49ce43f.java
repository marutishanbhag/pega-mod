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
public class ra_model_pzmapdatatransformparameters_372bc7f9e16429daaa94d980d49ce43f extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzMapDataTransformParameters._baseclass.Model");
	public ra_model_pzmapdatatransformparameters_372bc7f9e16429daaa94d980d49ce43f(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL @BASECLASS PZMAPDATATRANSFORMPARAMETERS #20230618T001815.679 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_1 = myStepPage.getIfPresent("pyDOParamList");
foreach_prop_1 = pz_1;
actionProlog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_1);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pyDOParamList(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pyDOParamList(<CURRENT>)", ctxt_page_target_1);
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
actionEpilog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_1);
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set Param.noop", source_1, target_1);
{
    tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, pega.<Void>resolveMethodCall("RemoveDeletedObjects--(ClipboardProperty)", "RemoveDeletedObjects", null, null, new Object[] { myStepPage.getProperty("pyDOParamList") }));
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set Param.noop", source_1, target_1);
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_2 = pega.findDataPage("D_pzGetDataTransformInfo", true, "pyModelName", tools.getParamValue("ModelName"), "pyClassName", tools.getParamValue("ClassName")).getIfPresent("pyParameters");
foreach_prop_2 = pz_2;
actionProlog(pz_CurrentTraceInfo,"4", "For Each Page In", null, pz_2);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_2 = false;
boolean pop_ctxt_page_3 = false;
try {
/* push '"D_pzGetDataTransformInfo[pyClassName:param.ClassName, pyModelName: param.ModelName].pyParameters(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_2;
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "D_pzGetDataTransformInfo[pyClassName:param.ClassName, pyModelName: param.ModelName].pyParameters(<CURRENT>)", ctxt_page_target_2);
/* push '"D_pzGetDataTransformInfo[pyClassName:param.ClassName, pyModelName: param.ModelName].pyParameters(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_2;
pop_ctxt_page_3 = pega.pushScopedStepContext("SOURCE", "D_pzGetDataTransformInfo[pyClassName:param.ClassName, pyModelName: param.ModelName].pyParameters(<CURRENT>)", ctxt_page_source_1);
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_2;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_3) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"4", "For Each Page In", null, pz_2);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.1", "When", null, target_2);
switch (when_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "When", null, target_2);
} else {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.2", "Otherwise", null, target_3);
switch (otherwise_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.2", "Otherwise", null, target_3);
}
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pyClassNameTemp", source_2, target_4);
{
    String pzSourceVar3 = "";
    pzSourceVar3 = tools.getParamValue("ClassName");
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pega.setViaPropRef(".pyClassNameTemp", pRef_4, myStepPage, pzSourceVar3, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pyClassNameTemp", source_2, target_4);
return CODE_CONTINUE;
}private boolean whenCondition_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_6 = null;
try {
ctxt_frame_6 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_6.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "! @IsInPageList(.pyName,\".pyParametersParamName\",D_pzGetDataTransformInfo[pyClassName: param.ClassName, pyModelName: param.ModelName].pyParameters)");
try {
boolean pz_7 = ((!(pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyParametersParamName", pega.findDataPage("D_pzGetDataTransformInfo", false, "pyModelName", tools.getParamValue("ModelName"), "pyClassName", tools.getParamValue("ClassName")).getProperty("pyParameters") })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "! @IsInPageList(.pyName,\".pyParametersParamName\",D_pzGetDataTransformInfo[pyClassName: param.ClassName, pyModelName: param.ModelName].pyParameters)",pz_7);
return pz_7;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("! @IsInPageList(.pyName,\".pyParametersParamName\",D_pzGetDataTransformInfo[pyClassName: param.ClassName, pyModelName: param.ModelName].pyParameters) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
} // return to previous step page
}private int when_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Set .pyDeletedObject", source_3, target_5);
{
    boolean pzSourceVar8 = false;
    pzSourceVar8 = true;
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyDeletedObject", pRef_9, myStepPage, pzSourceVar8, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Set .pyDeletedObject", source_3, target_5);
return CODE_CONTINUE;
}private int otherwise_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.2.1", "When", null, target_6);
switch (when_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.2.1", "When", null, target_6);
} else {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.2.2", "Otherwise", null, target_7);
switch (otherwise_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.2.2", "Otherwise", null, target_7);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_9 = null;
try {
ctxt_frame_9 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_9.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@startsWith(.pyValue,\".\")");
try {
boolean pz_12 = (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, null, new Object[] { scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "." })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@startsWith(.pyValue,\".\")",pz_12);
return pz_12;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@startsWith(.pyValue,\".\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
} // return to previous step page
}private int when_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2.1.1", "Set .pyDataViewParameterType", source_4, target_8);
{
    String pzSourceVar13 = "";
    pzSourceVar13 = "ANOTHER";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyDataViewParameterType", pRef_14, myStepPage, pzSourceVar13, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2.1.1", "Set .pyDataViewParameterType", source_4, target_8);
return CODE_CONTINUE;
}private int otherwise_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2.2.1", "Set .pyDataViewParameterType", source_5, target_9);
{
    String pzSourceVar16 = "";
    pzSourceVar16 = "CONSTANT";
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyDataViewParameterType", pRef_14, myStepPage, pzSourceVar16, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2.2.1", "Set .pyDataViewParameterType", source_5, target_9);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_10 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.1", "When", null, target_10);
switch (when_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "When", null, target_10);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_14 = null;
try {
ctxt_frame_14 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_14.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyParametersParamName!=\"\"&amp;&amp;!@IsInPageList(.pyParametersParamName,\".pyName\",Primary.pyDOParamList)");
try {
boolean pz_19 = ((!(scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) && ((!(pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyName", tools.getPrimaryPage().getProperty("pyDOParamList") })).booleanValue())));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyParametersParamName!=\"\"&amp;&amp;!@IsInPageList(.pyParametersParamName,\".pyName\",Primary.pyDOParamList)",pz_19);
return pz_19;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyParametersParamName!=\"\"&amp;&amp;!@IsInPageList(.pyParametersParamName,\".pyName\",Primary.pyDOParamList) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
} // return to previous step page
}private int when_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_20 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_15 = null;
try {
ctxt_frame_15 = pega.pushStackFrame("Primary.pyDOParamList", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_15.getStepPage();
pz_20 = tools.getPrimaryPage().getProperty("pyDOParamList");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
} // return to previous step page

targetProperty_1 = pz_20;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '"Primary.pyDOParamList"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_16 = null;
try {
ctxt_frame_16 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_16.getStepPage();
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "Primary.pyDOParamList", ctxt_page_3);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
} // return to previous step page
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Append and Map to", null, targetProperty_1);
switch (appendAndMapTo_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.1", "Set .pyName", source_6, target_11);
{
    String pzSourceVar21 = "";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pzSourceVar21 = scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyName", pRef_22, myStepPage, pzSourceVar21, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.1", "Set .pyName", source_6, target_11);
ClipboardPage source_7 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.2", "Set .pyParameterInOut", source_7, target_12);
{
    String pzSourceVar24 = "";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pzSourceVar24 = scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyParameterInOut", pRef_26, myStepPage, pzSourceVar24, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.2", "Set .pyParameterInOut", source_7, target_12);
ClipboardPage source_8 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.3", "Set .pyParameterRequired", source_8, target_13);
{
    String pzSourceVar28 = "";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pzSourceVar28 = scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyParameterRequired", pRef_30, myStepPage, pzSourceVar28, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.3", "Set .pyParameterRequired", source_8, target_13);
ClipboardPage source_9 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.4", "Set .pyDescription", source_9, target_14);
{
    String pzSourceVar32 = "";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pzSourceVar32 = scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_34, myStepPage, pzSourceVar32, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.4", "Set .pyDescription", source_9, target_14);
ClipboardPage source_10 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.5", "Set .pyParameterType", source_10, target_15);
{
    String pzSourceVar36 = "";
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        pzSourceVar36 = scalarValueQuery_37.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pyParameterType", pRef_38, myStepPage, pzSourceVar36, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.5", "Set .pyParameterType", source_10, target_15);
ClipboardPage source_11 =null;
ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.6", "Set .pyEditable", source_11, target_16);
{
    boolean pzSourceVar40 = false;
    PRStackFrame ctxt_frame_38 = null;
    try {
        ctxt_frame_38 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_38.getStepPage();
        pzSourceVar40 = true;
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_38);
    }
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pega.setViaPropRef(".pyEditable", pRef_41, myStepPage, pzSourceVar40, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.6", "Set .pyEditable", source_11, target_16);
ClipboardPage source_12 =null;
ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.7", "Set .pyDataViewParameterType", source_12, target_17);
{
    String pzSourceVar43 = "";
    PRStackFrame ctxt_frame_42 = null;
    try {
        ctxt_frame_42 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_42.getStepPage();
        pzSourceVar43 = ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "OUT" })).booleanValue() ? "ANOTHER" : "CONSTANT");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_42);
    }
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pyDataViewParameterType", pRef_14, myStepPage, pzSourceVar43, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.7", "Set .pyDataViewParameterType", source_12, target_17);
ClipboardPage source_13 =null;
ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.8", "Set .pyValue", source_13, target_18);
{
    String pzSourceVar45 = "";
    PRStackFrame ctxt_frame_46 = null;
    try {
        ctxt_frame_46 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_46.getStepPage();
        pzSourceVar45 = scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_46);
    }
    PRStackFrame ctxt_frame_45 = null;
    try {
        ctxt_frame_45 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_45.getStepPage();
        pega.setViaPropRef(".pyValue", pRef_47, myStepPage, pzSourceVar45, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.8", "Set .pyValue", source_13, target_18);
ClipboardPage source_14 =null;
ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.9", "Set .pyClassNameTemp", source_14, target_19);
{
    String pzSourceVar49 = "";
    PRStackFrame ctxt_frame_50 = null;
    try {
        ctxt_frame_50 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_50.getStepPage();
        pzSourceVar49 = tools.getParamValue("ClassName");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_50);
    }
    PRStackFrame ctxt_frame_49 = null;
    try {
        ctxt_frame_49 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_49.getStepPage();
        pega.setViaPropRef(".pyClassNameTemp", pRef_4, myStepPage, pzSourceVar49, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_49);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.9", "Set .pyClassNameTemp", source_14, target_19);
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
	"Rule-Obj-Model:PZMAPDATATRANSFORMPARAMETERS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZMAPDATATRANSFORMPARAMETERS","Rule-Obj-Model","@BASECLASS",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-MODEL @BASECLASS PZMAPDATATRANSFORMPARAMETERS #20230618T001815.679 GMT","!PZMAPDATATRANSFORMPARAMETERS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",606504378)
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
//	RULE-OBJ-MODEL @BASECLASS PZMAPDATATRANSFORMPARAMETERS #20230618T001815.679 GMT:20230618T001815.679 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "55a0ba1db6bb36634a9b1383d4dc435e";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
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

public static final String[] pRef_22 = new String[] { "", "", "pyName", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyClassNameTemp", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyDataViewParameterType", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyParameterRequired", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyParameterInOut", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyEditable", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyParameterType", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyValue", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyDeletedObject", "" };
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamInOut").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamReq").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamDefaultValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamDesc").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PZMAPDATATRANSFORMPARAMETERS #20230618T001815.679 GMT", "@baseclass pzMapDataTransformParameters", "Pega-ProcessArchitect", "08-23-01", "20230618T001815.679 GMT");
}
