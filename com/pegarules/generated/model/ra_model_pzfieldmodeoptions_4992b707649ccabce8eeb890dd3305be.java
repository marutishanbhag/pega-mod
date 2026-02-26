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
public class ra_model_pzfieldmodeoptions_4992b707649ccabce8eeb890dd3305be extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzFieldModeOptions.Code_Pega_List.Model");
	public ra_model_pzfieldmodeoptions_4992b707649ccabce8eeb890dd3305be(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZFIELDMODEOPTIONS #20180713T141228.503 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_2);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_2);
} else if (otherwiseWhenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_3);
if (otherwiseWhen_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_3);
} else if (otherwiseWhenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_4);
if (otherwiseWhen_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_4);
} else {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "Otherwise", null, target_5);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "Otherwise", null, target_5);
}
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_1 = myStepPage.getIfPresent("pxResults");
foreach_prop_1 = pz_1;
actionProlog(pz_CurrentTraceInfo,"9", "For Each Page In", null, pz_1);
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
/* push '".pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults(<CURRENT>)", ctxt_page_target_1);
/* push '".pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", ".pxResults(<CURRENT>)", ctxt_page_source_1);
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
actionEpilog(pz_CurrentTraceInfo,"9", "For Each Page In", null, pz_1);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"OnlyReadOnly\"");
try {
boolean pz_2 = (tools.getParamValue("FieldModeRestriction").equals("OnlyReadOnly"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"OnlyReadOnly\"",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.FieldModeRestriction==\"OnlyReadOnly\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_3 = myStepPage.getProperty("pxResults");
targetProperty_1 = pz_3;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_2);
actionProlog(pz_CurrentTraceInfo,"2.1", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Set .pyLabel", source_1, target_6);
{
    String pzSourceVar4 = "";
    pzSourceVar4 = "Read Only";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar4, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Set .pyLabel", source_1, target_6);
ClipboardPage source_2 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.2", "Set .pyDescription", source_2, target_7);
{
    String pzSourceVar7 = "";
    pzSourceVar7 = "Read-only";
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar7, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.2", "Set .pyDescription", source_2, target_7);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"OnlyCalculated\"");
try {
boolean pz_10 = (tools.getParamValue("FieldModeRestriction").equals("OnlyCalculated"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"OnlyCalculated\"",pz_10);
return pz_10;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.FieldModeRestriction==\"OnlyCalculated\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_11 = myStepPage.getProperty("pxResults");
targetProperty_2 = pz_11;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyLabel", source_3, target_8);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = "Calculated";
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar12, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyLabel", source_3, target_8);
ClipboardPage source_4 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.2", "Set .pyDescription", source_4, target_9);
{
    String pzSourceVar14 = "";
    pzSourceVar14 = "Calculated (read-only)";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar14, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.2", "Set .pyDescription", source_4, target_9);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"OnlyRequired\"");
try {
boolean pz_16 = (tools.getParamValue("FieldModeRestriction").equals("OnlyRequired"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"OnlyRequired\"",pz_16);
return pz_16;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.FieldModeRestriction==\"OnlyRequired\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int otherwiseWhen_2(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_17 = myStepPage.getProperty("pxResults");
targetProperty_3 = pz_17;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_3);
if (appendAndMapTo_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_3);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Set .pyLabel", source_5, target_10);
{
    String pzSourceVar18 = "";
    pzSourceVar18 = "Required";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar18, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Set .pyLabel", source_5, target_10);
ClipboardPage source_6 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.2", "Set .pyDescription", source_6, target_11);
{
    String pzSourceVar20 = "";
    pzSourceVar20 = "Required";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar20, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.2", "Set .pyDescription", source_6, target_11);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"AutoReadOnly\"");
try {
boolean pz_22 = (tools.getParamValue("FieldModeRestriction").equals("AutoReadOnly"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.FieldModeRestriction==\"AutoReadOnly\"",pz_22);
return pz_22;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.FieldModeRestriction==\"AutoReadOnly\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int otherwiseWhen_3(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_23 = myStepPage.getProperty("pxResults");
targetProperty_4 = pz_23;
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ctxt_page_5 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_5);
actionProlog(pz_CurrentTraceInfo,"5.1", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.1", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_24 = myStepPage.getProperty("pxResults");
targetProperty_5 = pz_24;
/* entering new scope */
boolean pop_ctxt_page_7 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ctxt_page_6 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_6);
actionProlog(pz_CurrentTraceInfo,"5.2", "Append and Map to", null, targetProperty_5);
if (appendAndMapTo_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.2", "Append and Map to", null, targetProperty_5);
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1.1", "Set .pyLabel", source_7, target_12);
{
    String pzSourceVar25 = "";
    pzSourceVar25 = "Auto";
    PRStackFrame ctxt_frame_24 = null;
    try {
        ctxt_frame_24 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_24.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar25, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1.1", "Set .pyLabel", source_7, target_12);
ClipboardPage source_8 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1.2", "Set .pyDescription", source_8, target_13);
{
    String pzSourceVar27 = "";
    pzSourceVar27 = "Auto";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar27, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1.2", "Set .pyDescription", source_8, target_13);
return CODE_CONTINUE;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.1", "Set .pyLabel", source_9, target_14);
{
    String pzSourceVar29 = "";
    pzSourceVar29 = "Read Only";
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar29, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2.1", "Set .pyLabel", source_9, target_14);
ClipboardPage source_10 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.2", "Set .pyDescription", source_10, target_15);
{
    String pzSourceVar31 = "";
    pzSourceVar31 = "Read-only";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar31, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2.2", "Set .pyDescription", source_10, target_15);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_6 = null;
ClipboardProperty pz_33 = myStepPage.getProperty("pxResults");
targetProperty_6 = pz_33;
/* entering new scope */
boolean pop_ctxt_page_8 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_7 = null;
ctxt_page_7 = targetProperty_6.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_7);
actionProlog(pz_CurrentTraceInfo,"7.1", "Append and Map to", null, targetProperty_6);
if (appendAndMapTo_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.1", "Append and Map to", null, targetProperty_6);
} finally {
if (pop_ctxt_page_8) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_16 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7.3", "When", null, target_16);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.3", "When", null, target_16);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_17 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7.5", "When", null, target_17);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.5", "When", null, target_17);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_18 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7.6", "When", null, target_18);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.6", "When", null, target_18);
}
return CODE_CONTINUE;
}private int appendAndMapTo_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =null;
ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1.1", "Set .pyLabel", source_11, target_19);
{
    String pzSourceVar34 = "";
    pzSourceVar34 = "Optional";
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar34, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.1.1", "Set .pyLabel", source_11, target_19);
ClipboardPage source_12 =null;
ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1.2", "Set .pyDescription", source_12, target_20);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "Optional";
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar36, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.1.2", "Set .pyDescription", source_12, target_20);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.FieldModeRestriction != \"NotRequired\" &amp;&amp; param.isInCaseForm==true");
try {
boolean pz_38 = ((!(tools.getParamValue("FieldModeRestriction").equals("NotRequired"))) && (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "isInCaseForm") == true));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.FieldModeRestriction != \"NotRequired\" &amp;&amp; param.isInCaseForm==true",pz_38);
return pz_38;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.FieldModeRestriction != \"NotRequired\" &amp;&amp; param.isInCaseForm==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_7 = null;
ClipboardProperty pz_39 = myStepPage.getProperty("pxResults");
targetProperty_7 = pz_39;
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ctxt_page_8 = targetProperty_7.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_8);
actionProlog(pz_CurrentTraceInfo,"7.3.1", "Append and Map to", null, targetProperty_7);
if (appendAndMapTo_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.3.1", "Append and Map to", null, targetProperty_7);
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =null;
ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.3.1.1", "Set .pyLabel", source_13, target_21);
{
    String pzSourceVar40 = "";
    pzSourceVar40 = "Required";
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar40, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.3.1.1", "Set .pyLabel", source_13, target_21);
ClipboardPage source_14 =null;
ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.3.1.2", "Set .pyDescription", source_14, target_22);
{
    String pzSourceVar42 = "";
    pzSourceVar42 = "Required";
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar42, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.3.1.2", "Set .pyDescription", source_14, target_22);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.isInCaseForm==true");
try {
boolean pz_44 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "isInCaseForm") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.isInCaseForm==true",pz_44);
return pz_44;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.isInCaseForm==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_8 = null;
ClipboardProperty pz_45 = myStepPage.getProperty("pxResults");
targetProperty_8 = pz_45;
/* entering new scope */
boolean pop_ctxt_page_10 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_9 = null;
ctxt_page_9 = targetProperty_8.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_10 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_9);
actionProlog(pz_CurrentTraceInfo,"7.5.1", "Append and Map to", null, targetProperty_8);
if (appendAndMapTo_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.5.1", "Append and Map to", null, targetProperty_8);
} finally {
if (pop_ctxt_page_10) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =null;
ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.5.1.1", "Set .pyLabel", source_15, target_23);
{
    String pzSourceVar46 = "";
    pzSourceVar46 = "Read Only";
    PRStackFrame ctxt_frame_45 = null;
    try {
        ctxt_frame_45 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_45.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar46, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.5.1.1", "Set .pyLabel", source_15, target_23);
ClipboardPage source_16 =null;
ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.5.1.2", "Set .pyDescription", source_16, target_24);
{
    String pzSourceVar48 = "";
    pzSourceVar48 = "Read-only";
    PRStackFrame ctxt_frame_47 = null;
    try {
        ctxt_frame_47 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_47.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar48, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.5.1.2", "Set .pyDescription", source_16, target_24);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.FieldModeRestriction != \"NotCalculated\"");
try {
boolean pz_50 = (!(tools.getParamValue("FieldModeRestriction").equals("NotCalculated")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.FieldModeRestriction != \"NotCalculated\"",pz_50);
return pz_50;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.FieldModeRestriction != \"NotCalculated\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_9 = null;
ClipboardProperty pz_51 = myStepPage.getProperty("pxResults");
targetProperty_9 = pz_51;
/* entering new scope */
boolean pop_ctxt_page_11 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_10 = null;
ctxt_page_10 = targetProperty_9.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_11 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_10);
actionProlog(pz_CurrentTraceInfo,"7.6.1", "Append and Map to", null, targetProperty_9);
if (appendAndMapTo_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.6.1", "Append and Map to", null, targetProperty_9);
} finally {
if (pop_ctxt_page_11) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =null;
ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.6.1.1", "Set .pyLabel", source_17, target_25);
{
    String pzSourceVar52 = "";
    pzSourceVar52 = "Calculated";
    PRStackFrame ctxt_frame_51 = null;
    try {
        ctxt_frame_51 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_51.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar52, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_51);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.6.1.1", "Set .pyLabel", source_17, target_25);
ClipboardPage source_18 =null;
ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.6.1.2", "Set .pyDescription", source_18, target_26);
{
    String pzSourceVar54 = "";
    pzSourceVar54 = "Calculated (read-only)";
    PRStackFrame ctxt_frame_53 = null;
    try {
        ctxt_frame_53 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_53.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar54, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_53);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.6.1.2", "Set .pyDescription", source_18, target_26);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1", "Set .pyDescription", source_19, target_27);
{
    String pzSourceVar56 = "";
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pzSourceVar56 = pega.<String>resolveMethodCall("getLocalizedValue--(ClipboardProperty)", "getLocalizedValue", null, null, new Object[] { propertyQuery_57.resolve(tools, myStepPage) });
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
    PRStackFrame ctxt_frame_55 = null;
    try {
        ctxt_frame_55 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_55.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_8, myStepPage, pzSourceVar56, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_55);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1", "Set .pyDescription", source_19, target_27);
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
	"Rule-Obj-Model:PZFIELDMODEOPTIONS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZFIELDMODEOPTIONS","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZFIELDMODEOPTIONS #20180713T141228.503 GMT","!PZFIELDMODEOPTIONS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-564142407)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZFIELDMODEOPTIONS #20180713T141228.503 GMT:20180713T141228.503 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5d6285b58b4e4b3a165b74f823c30de5";
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

public static final String[] pRef_5 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyDescription", "" };
private static final PropertyQuery propertyQuery_57 = FUAUtil.createQueryBuilder().scalarProperty("pyDescription").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZFIELDMODEOPTIONS #20180713T141228.503 GMT", "Code-Pega-List pzFieldModeOptions", "Pega-ProcessArchitect", "08-01-01", "20180713T141228.503 GMT");
}
