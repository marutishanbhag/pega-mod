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
public class ra_model_pzroutetotype_3f1d280c0a11bdee23f7e82888ace68d extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzRouteToType.Code_Pega_List.Model");
	public ra_model_pzroutetotype_3f1d280c0a11bdee23f7e82888ace68d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZROUTETOTYPE #20230618T001816.172 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"1", "When", null, target_1);
}
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_1 = myStepPage.getProperty("pxResults");
targetProperty_1 = pz_1;
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_1.getString("pxObjClass"))) {
	ctxt_page_1.putString("pxObjClass", "Embed-PropertyPromtValues");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_1);
actionProlog(pz_CurrentTraceInfo,"2", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_2);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "When", null, target_3);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "When", null, target_3);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "When", null, target_4);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
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

private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(@(Pega-RULES:ExpressionEvaluators).pzevaluateWhenfalse(\"pzIsPegaExpress\") &amp;&amp; param.stepType  == \"assignment\") || (param.stepType  == \"question\") || (param.stepType  == \"survey\")");
try {
boolean pz_2 = ((((pega.<Boolean>resolveMethodCall("pzevaluateWhenfalse--(String)", "pzevaluateWhenfalse", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzIsPegaExpress" })).booleanValue() && (tools.getParamValue("stepType").equals("assignment"))) || (tools.getParamValue("stepType").equals("question"))) || (tools.getParamValue("stepType").equals("survey")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(@(Pega-RULES:ExpressionEvaluators).pzevaluateWhenfalse(\"pzIsPegaExpress\") &amp;&amp; param.stepType  == \"assignment\") || (param.stepType  == \"question\") || (param.stepType  == \"survey\")",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(@(Pega-RULES:ExpressionEvaluators).pzevaluateWhenfalse(\"pzIsPegaExpress\") &amp;&amp; param.stepType  == \"assignment\") || (param.stepType  == \"question\") || (param.stepType  == \"survey\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_3 = myStepPage.getProperty("pxResults");
targetProperty_2 = pz_3;
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_2.getString("pxObjClass"))) {
	ctxt_page_2.putString("pxObjClass", "Embed-PropertyPromtValues");
}
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_2);
actionProlog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Set .pyStandardValue", source_1, target_5);
{
    String pzSourceVar4 = "";
    pzSourceVar4 = "Current operator";
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_5, myStepPage, pzSourceVar4, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Set .pyStandardValue", source_1, target_5);
ClipboardPage source_2 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.2", "Set .pyPromptValue", source_2, target_6);
{
    String pzSourceVar7 = "";
    pzSourceVar7 = "Current user";
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_8, myStepPage, pzSourceVar7, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.2", "Set .pyPromptValue", source_2, target_6);
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyStandardValue", source_3, target_7);
{
    String pzSourceVar10 = "";
    pzSourceVar10 = "Operator";
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_5, myStepPage, pzSourceVar10, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyStandardValue", source_3, target_7);
ClipboardPage source_4 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyPromptValue", source_4, target_8);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = "Specific user";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_8, myStepPage, pzSourceVar12, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyPromptValue", source_4, target_8);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.stepType  != \"question\"");
try {
boolean pz_14 = (!(tools.getParamValue("stepType").equals("question")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.stepType  != \"question\"",pz_14);
return pz_14;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.stepType  != \"question\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_15 = myStepPage.getProperty("pxResults");
targetProperty_3 = pz_15;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_3.getString("pxObjClass"))) {
	ctxt_page_3.putString("pxObjClass", "Embed-PropertyPromtValues");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_3);
if (appendAndMapTo_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyStandardValue", source_5, target_9);
{
    String pzSourceVar16 = "";
    pzSourceVar16 = "Workbasket";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_5, myStepPage, pzSourceVar16, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyStandardValue", source_5, target_9);
ClipboardPage source_6 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.2", "Set .pyPromptValue", source_6, target_10);
{
    String pzSourceVar18 = "";
    pzSourceVar18 = "Work Queue";
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_8, myStepPage, pzSourceVar18, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.2", "Set .pyPromptValue", source_6, target_10);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:ExpressionEvaluators).pzevaluateWhenfalse(\"pzIsPegaExpress\") &amp;&amp; param.stepType  == \"assignment\"");
try {
boolean pz_20 = ((pega.<Boolean>resolveMethodCall("pzevaluateWhenfalse--(String)", "pzevaluateWhenfalse", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzIsPegaExpress" })).booleanValue() && (tools.getParamValue("stepType").equals("assignment")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:ExpressionEvaluators).pzevaluateWhenfalse(\"pzIsPegaExpress\") &amp;&amp; param.stepType  == \"assignment\"",pz_20);
return pz_20;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:ExpressionEvaluators).pzevaluateWhenfalse(\"pzIsPegaExpress\") &amp;&amp; param.stepType  == \"assignment\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_21 = myStepPage.getProperty("pxResults");
targetProperty_4 = pz_21;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_4.getString("pxObjClass"))) {
	ctxt_page_4.putString("pxObjClass", "Embed-PropertyPromtValues");
}
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Set .pyStandardValue", source_7, target_11);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = "Custom";
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_5, myStepPage, pzSourceVar22, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Set .pyStandardValue", source_7, target_11);
ClipboardPage source_8 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.2", "Set .pyPromptValue", source_8, target_12);
{
    String pzSourceVar24 = "";
    pzSourceVar24 = "Custom";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_8, myStepPage, pzSourceVar24, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.2", "Set .pyPromptValue", source_8, target_12);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.stepType==\"assignment\"||param.stepType==\"approval\"");
try {
boolean pz_26 = ((tools.getParamValue("stepType").equals("assignment")) || (tools.getParamValue("stepType").equals("approval")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.stepType==\"assignment\"||param.stepType==\"approval\"",pz_26);
return pz_26;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.stepType==\"assignment\"||param.stepType==\"approval\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_27 = myStepPage.getProperty("pxResults");
targetProperty_5 = pz_27;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ctxt_page_5 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_5.getString("pxObjClass"))) {
	ctxt_page_5.putString("pxObjClass", "Embed-PropertyPromtValues");
}
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_5);
actionProlog(pz_CurrentTraceInfo,"6.1", "Append and Map to", null, targetProperty_5);
if (appendAndMapTo_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.1", "Append and Map to", null, targetProperty_5);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.1", "Set .pyStandardValue", source_9, target_13);
{
    String pzSourceVar28 = "";
    pzSourceVar28 = "Use business logic";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_5, myStepPage, pzSourceVar28, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.1", "Set .pyStandardValue", source_9, target_13);
ClipboardPage source_10 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.2", "Set .pyPromptValue", source_10, target_14);
{
    String pzSourceVar30 = "";
    pzSourceVar30 = "Use business logic";
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_8, myStepPage, pzSourceVar30, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.2", "Set .pyPromptValue", source_10, target_14);
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
	"Rule-Obj-Model:PZROUTETOTYPE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZROUTETOTYPE","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZROUTETOTYPE #20230618T001816.172 GMT","!PZROUTETOTYPE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1392401423)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZROUTETOTYPE #20230618T001816.172 GMT:20230618T001816.172 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "17664f94f2300655e14d0d6bf64368fe";
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

public static final String[] pRef_5 = new String[] { "", "", "pyStandardValue", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyPromptValue", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZROUTETOTYPE #20230618T001816.172 GMT", "Code-Pega-List pzRouteToType", "Pega-ProcessArchitect", "08-23-01", "20230618T001816.172 GMT");
}
