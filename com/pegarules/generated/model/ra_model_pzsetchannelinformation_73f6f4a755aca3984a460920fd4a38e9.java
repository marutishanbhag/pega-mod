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
public class ra_model_pzsetchannelinformation_73f6f4a755aca3984a460920fd4a38e9 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzSetChannelInformation.Embed_Stage.Model");
	public ra_model_pzsetchannelinformation_73f6f4a755aca3984a460920fd4a38e9(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-STAGE PZSETCHANNELINFORMATION #20210917T081202.537 GMT	Pega-ProcessArchitect:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_1 = pega.findPageWithException("D_pzChannels", "Data-Channel-Configuration").getIfPresent("pxResults");
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
/* push '"D_pzChannels.pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "D_pzChannels.pxResults(<CURRENT>)", ctxt_page_target_1);
/* push '"D_pzChannels.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "D_pzChannels.pxResults(<CURRENT>)", ctxt_page_source_1);
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
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_2 = tools.getPrimaryPage().getIfPresent("pyChannels");
foreach_prop_2 = pz_2;
actionProlog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_2);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"Primary.pyChannels(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_2;
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pyChannels(<CURRENT>)", ctxt_page_target_2);
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_2;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_2);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_1);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_2);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_2);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "When", null, target_3);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "When", null, target_3);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "When", null, target_4);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "When", null, target_4);
}
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1", "When", null, target_5);
switch (when_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "When", null, target_5);
}
return CODE_CONTINUE;
}private boolean whenCondition_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_4 = null;
try {
ctxt_frame_4 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_4.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@when(pzShouldIncludeChannel)==true&amp;&amp;@IsInPageList(.pxObjClass,\".pyClassName\",Primary.pyChannels)==false");
try {
boolean pz_4 = (((pega.<Boolean>resolveMethodCall("when--(String)", "when", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzShouldIncludeChannel" })).booleanValue() == true) && ((pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyClassName", tools.getPrimaryPage().getProperty("pyChannels") })).booleanValue() == false));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@when(pzShouldIncludeChannel)==true&amp;&amp;@IsInPageList(.pxObjClass,\".pyClassName\",Primary.pyChannels)==false",pz_4);
return pz_4;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@when(pzShouldIncludeChannel)==true&amp;&amp;@IsInPageList(.pxObjClass,\".pyClassName\",Primary.pyChannels)==false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
} // return to previous step page
}private int when_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_5 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_5 = null;
try {
ctxt_frame_5 = pega.pushStackFrame("Primary.pyChannels", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_5.getStepPage();
pz_5 = tools.getPrimaryPage().getProperty("pyChannels");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
} // return to previous step page

targetProperty_1 = pz_5;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '"Primary.pyChannels"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_6 = null;
try {
ctxt_frame_6 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_6.getStepPage();
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "Primary.pyChannels", ctxt_page_3);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
} // return to previous step page
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Append and Map to", null, targetProperty_1);
switch (appendAndMapTo_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.1", "Set .pxObjClass", source_1, target_6);
// Change obj class
String pz_8 = "";
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_8 = null;
try {
ctxt_frame_8 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_8.getStepPage();
pz_8 = scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
} // return to previous step page

ClipboardPage tempPage_1 = tools.createPage(pz_8, "");
ClipboardProperty pz_7 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_7 = null;
try {
ctxt_frame_7 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_7.getStepPage();
pz_7 = propertyQuery_6.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
} // return to previous step page

ClipboardPage targetPage_1 = pz_7.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"1.1.1.1", "Set .pxObjClass", source_1, target_6);
ClipboardPage source_2 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pyChannelDescription", source_2, target_7);
{
    String pzSourceVar9 = "";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pzSourceVar9 = scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyChannelDescription", pRef_11, myStepPage, pzSourceVar9, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pyChannelDescription", source_2, target_7);
ClipboardPage source_3 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyShowChannel", source_3, target_8);
{
    String pzSourceVar13 = "";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pzSourceVar13 = scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyShowChannel", pRef_15, myStepPage, pzSourceVar13, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyShowChannel", source_3, target_8);
ClipboardPage source_4 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pzChannelIcon", source_4, target_9);
{
    String pzSourceVar17 = "";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pzSourceVar17 = scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pzChannelIcon", pRef_19, myStepPage, pzSourceVar17, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pzChannelIcon", source_4, target_9);
ClipboardPage source_5 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.5", "Set .pzChannelName", source_5, target_10);
{
    String pzSourceVar21 = "";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pzSourceVar21 = scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pzChannelName", pRef_23, myStepPage, pzSourceVar21, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.5", "Set .pzChannelName", source_5, target_10);
ClipboardPage source_6 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.6", "Set .pyClassName", source_6, target_11);
{
    String pzSourceVar25 = "";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pzSourceVar25 = scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_26, myStepPage, pzSourceVar25, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.6", "Set .pyClassName", source_6, target_11);
ClipboardPage source_7 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.7", "Set .pyLabel", source_7, target_12);
{
    String pzSourceVar28 = "";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pzSourceVar28 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyLabel", tools });
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("Data-Channel-Configuration", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_30, myStepPage, pzSourceVar28, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.7", "Set .pyLabel", source_7, target_12);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_5(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.1", "When", null, target_13);
switch (when_5(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "When", null, target_13);
}
return CODE_CONTINUE;
}private boolean whenCondition_5(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_33 = null;
try {
ctxt_frame_33 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_33.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@IsInPageList(.pyClassName,\".pxObjClass\",D_pzChannels.pxResults)&amp;&amp;@when(pzShouldIncludeChannel)==false");
try {
boolean pz_33 = ((pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pxObjClass", pega.findPageWithException("D_pzChannels", "Data-Channel-Configuration").getProperty("pxResults") })).booleanValue() && ((pega.<Boolean>resolveMethodCall("when--(String)", "when", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzShouldIncludeChannel" })).booleanValue() == false));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@IsInPageList(.pyClassName,\".pxObjClass\",D_pzChannels.pxResults)&amp;&amp;@when(pzShouldIncludeChannel)==false",pz_33);
return pz_33;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@IsInPageList(.pyClassName,\".pxObjClass\",D_pzChannels.pxResults)&amp;&amp;@when(pzShouldIncludeChannel)==false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
} // return to previous step page
}private int when_5(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_34 = null;
try {
ctxt_frame_34 = pega.pushStackFrame("context switch for remove", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_34.getStepPage();
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Remove Primary.pyChannels(Param.pyForEachCount)", null, null);
// Start Property-Remove from Remove action
{
// Expression: Primary.pyChannels(Param.pyForEachCount)
ClipboardProperty pz_35 = propertyQuery_34.resolve(tools, tools.getPrimaryPage(), tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount"));
try {if (pz_35!= null) {
pz_35.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +".";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
}// End Property-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Remove Primary.pyChannels(Param.pyForEachCount)", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
} // return to previous step page
return CODE_CONTINUE;
}private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyIsInitializationStage&amp;&amp;@IsInPageList(\"Default\",\".pzChannelName\",Primary.pyChannels)=false");
try {
boolean pz_37 = (scalarValueQuery_36.resolveToBoolean(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TRUEFALSE) && ((pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { "Default", ".pzChannelName", tools.getPrimaryPage().getProperty("pyChannels") })).booleanValue() == false));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyIsInitializationStage&amp;&amp;@IsInPageList(\"Default\",\".pzChannelName\",Primary.pyChannels)=false",pz_37);
return pz_37;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyIsInitializationStage&amp;&amp;@IsInPageList(\"Default\",\".pzChannelName\",Primary.pyChannels)=false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set Primary.pyChannels(<PREPEND>).pyLabel", source_8, target_14);
{
    pega.setViaPropRef(".pyChannels(<prepend>).pyLabel", pRef_38, tools.getPrimaryPage(), "Default", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set Primary.pyChannels(<PREPEND>).pyLabel", source_8, target_14);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set Primary.pyChannels(1).pyShowChannel", source_9, target_15);
{
    pega.setViaPropRef(".pyChannels(1).pyShowChannel", pRef_39, tools.getPrimaryPage(), ((pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { "Default", ".pyChannelName", tools.getPrimaryPage().getProperty("pyProcesses") })).booleanValue() ? true : false), "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set Primary.pyChannels(1).pyShowChannel", source_9, target_15);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set Primary.pyChannels(1).pzChannelName", source_10, target_16);
{
    pega.setViaPropRef(".pyChannels(1).pzChannelName", pRef_40, tools.getPrimaryPage(), "Default", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set Primary.pyChannels(1).pzChannelName", source_10, target_16);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4", "Set Primary.pyChannelMenuLabel", source_11, target_17);
{
    pega.setViaPropRef(".pyChannelMenuLabel", pRef_41, tools.getPrimaryPage(), "Add create process", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.4", "Set Primary.pyChannelMenuLabel", source_11, target_17);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyIsInitializationStage!=true");
try {
boolean pz_42 = (scalarValueQuery_36.resolveToBoolean(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TRUEFALSE) != true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyIsInitializationStage!=true",pz_42);
return pz_42;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyIsInitializationStage!=true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set Primary.pyChannelMenuLabel", source_12, target_18);
{
    pega.setViaPropRef(".pyChannelMenuLabel", pRef_41, tools.getPrimaryPage(), "Add channel process", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set Primary.pyChannelMenuLabel", source_12, target_18);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyChannelMenuLabel==\"Add create process\"");
try {
boolean pz_44 = (scalarValueQuery_43.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("Add create process"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyChannelMenuLabel==\"Add create process\"",pz_44);
return pz_44;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyChannelMenuLabel==\"Add create process\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set Primary.pyChannelMenuLabel", source_13, target_19);
{
    pega.setViaPropRef(".pyChannelMenuLabel", pRef_41, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "pyAddCreateProcess", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set Primary.pyChannelMenuLabel", source_13, target_19);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyChannelMenuLabel==\"Add channel process\"");
try {
boolean pz_45 = (scalarValueQuery_43.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("Add channel process"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyChannelMenuLabel==\"Add channel process\"",pz_45);
return pz_45;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyChannelMenuLabel==\"Add channel process\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1", "Set Primary.pyChannelMenuLabel", source_14, target_20);
{
    pega.setViaPropRef(".pyChannelMenuLabel", pRef_41, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "pyAddChannelProcess", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1", "Set Primary.pyChannelMenuLabel", source_14, target_20);
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
	"Rule-Obj-Model:PZSETCHANNELINFORMATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETCHANNELINFORMATION","Rule-Obj-Model","EMBED-STAGE",false,"","Pega-ProcessArchitect","08-07-01","RULE-OBJ-MODEL EMBED-STAGE PZSETCHANNELINFORMATION #20210917T081202.537 GMT","!PZSETCHANNELINFORMATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1562882840)
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
//	RULE-OBJ-MODEL EMBED-STAGE PZSETCHANNELINFORMATION #20210917T081202.537 GMT:20210917T081202.537 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "2a56cbf098560969516ce502b6eb8e6e";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-Stage";
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

public static final String[] pRef_23 = new String[] { "", "", "pzChannelName", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_40 = new String[] { "", "", "pyChannels", "1", "pzChannelName", "" };
public static final String[] pRef_15 = new String[] { "", "", "pyShowChannel", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyChannelDescription", "" };
public static final String[] pRef_19 = new String[] { "", "", "pzChannelIcon", "" };
public static final String[] pRef_39 = new String[] { "", "", "pyChannels", "1", "pyShowChannel", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyChannelMenuLabel", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyChannels", "<prepend>", "pyLabel", "" };
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyChannelMenuLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyChannelDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pzChannelName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyShowChannel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_34 = FUAUtil.createQueryBuilder().pageList("pyChannels").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pzChannelIcon").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarProperty("pyIsInitializationStage").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-STAGE PZSETCHANNELINFORMATION #20210917T081202.537 GMT", "Embed-Stage pzSetChannelInformation", "Pega-ProcessArchitect", "08-07-01", "20210917T081202.537 GMT");
}
