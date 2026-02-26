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
public class ra_model_pzgetavailablecontrolsforfield_59d6ae08ac99bab6936442ce9144aeec extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzGetAvailableControlsForField.Code_Pega_List.Model");
	public ra_model_pzgetavailablecontrolsforfield_59d6ae08ac99bab6936442ce9144aeec(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZGETAVAILABLECONTROLSFORFIELD #20211001T190857.610 GMT	Pega-ProcessArchitect:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "Otherwise When", null, target_2);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Otherwise When", null, target_2);
} else if (otherwiseWhenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_3);
if (otherwiseWhen_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_3);
} else if (otherwiseWhenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_4);
if (otherwiseWhen_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_4);
} else if (otherwiseWhenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_5);
if (otherwiseWhen_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_5);
} else if (otherwiseWhenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "Otherwise When", null, target_6);
if (otherwiseWhen_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Otherwise When", null, target_6);
} else if (otherwiseWhenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "Otherwise When", null, target_7);
if (otherwiseWhen_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "Otherwise When", null, target_7);
} else if (otherwiseWhenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"8", "Otherwise When", null, target_8);
if (otherwiseWhen_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"8", "Otherwise When", null, target_8);
} else if (otherwiseWhenCondition_8(pz_CurrentTraceInfo)) {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9", "Otherwise When", null, target_9);
if (otherwiseWhen_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"9", "Otherwise When", null, target_9);
} else if (otherwiseWhenCondition_9(pz_CurrentTraceInfo)) {
ClipboardPage target_10 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10", "Otherwise When", null, target_10);
if (otherwiseWhen_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"10", "Otherwise When", null, target_10);
} else if (otherwiseWhenCondition_10(pz_CurrentTraceInfo)) {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11", "Otherwise When", null, target_11);
if (otherwiseWhen_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"11", "Otherwise When", null, target_11);
} else if (otherwiseWhenCondition_11(pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"12", "Otherwise When", null, target_12);
if (otherwiseWhen_11(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"12", "Otherwise When", null, target_12);
} else if (otherwiseWhenCondition_12(pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"13", "Otherwise When", null, target_13);
if (otherwiseWhen_12(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"13", "Otherwise When", null, target_13);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text\" || param.ContextClass==\"Pega-Fields-Scalar-Identifier\"");
try {
boolean pz_1 = ((tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Text")) || (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Identifier")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text\" || param.ContextClass==\"Pega-Fields-Scalar-Identifier\"",pz_1);
return pz_1;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Text\" || param.ContextClass==\"Pega-Fields-Scalar-Identifier\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_2 = myStepPage.getProperty("pxResults");
targetProperty_1 = pz_2;
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_1.getString("pxObjClass"))) {
	ctxt_page_1.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_1);
actionProlog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
actionProlog(pz_CurrentTraceInfo,"1.2", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"1.2", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Set .pyStreamName", source_1, target_14);
{
    String pzSourceVar3 = "";
    pzSourceVar3 = "pxTextInput";
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar3, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Set .pyStreamName", source_1, target_14);
ClipboardPage source_2 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.2", "Set .pyLabel", source_2, target_15);
{
    String pzSourceVar6 = "";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar6, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.2", "Set .pyLabel", source_2, target_15);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-Paragraph\"");
try {
boolean pz_8 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Text-Paragraph"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-Paragraph\"",pz_8);
return pz_8;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Text-Paragraph\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_9 = myStepPage.getProperty("pxResults");
targetProperty_2 = pz_9;
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_2.getString("pxObjClass"))) {
	ctxt_page_2.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_2);
actionProlog(pz_CurrentTraceInfo,"2.1", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_10 = myStepPage.getProperty("pxResults");
targetProperty_3 = pz_10;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_3.getString("pxObjClass"))) {
	ctxt_page_3.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"2.2", "Append and Map to", null, targetProperty_3);
if (appendAndMapTo_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.2", "Append and Map to", null, targetProperty_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
actionProlog(pz_CurrentTraceInfo,"2.3", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"2.3", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Set .pyStreamName", source_3, target_16);
{
    String pzSourceVar11 = "";
    pzSourceVar11 = "pxTextArea";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar11, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Set .pyStreamName", source_3, target_16);
ClipboardPage source_4 =null;
ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.2", "Set .pyLabel", source_4, target_17);
{
    String pzSourceVar13 = "";
    pzSourceVar13 = "Plain text";
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar13, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.2", "Set .pyLabel", source_4, target_17);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =null;
ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2.1", "Set .pyStreamName", source_5, target_18);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = "pxRichTextEditor";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar15, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2.1", "Set .pyStreamName", source_5, target_18);
ClipboardPage source_6 =null;
ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2.2", "Set .pyLabel", source_6, target_19);
{
    String pzSourceVar17 = "";
    pzSourceVar17 = "Rich text";
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar17, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2.2", "Set .pyLabel", source_6, target_19);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-Email\"");
try {
boolean pz_19 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Text-Email"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-Email\"",pz_19);
return pz_19;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Text-Email\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int otherwiseWhen_2(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_20 = myStepPage.getProperty("pxResults");
targetProperty_4 = pz_20;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_4.getString("pxObjClass"))) {
	ctxt_page_4.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.1", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
actionProlog(pz_CurrentTraceInfo,"3.2", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"3.2", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =null;
ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyStreamName", source_7, target_20);
{
    String pzSourceVar21 = "";
    pzSourceVar21 = "pxEmail";
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar21, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyStreamName", source_7, target_20);
ClipboardPage source_8 =null;
ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.2", "Set .pyLabel", source_8, target_21);
{
    String pzSourceVar23 = "";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar23, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.2", "Set .pyLabel", source_8, target_21);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-Phone\"");
try {
boolean pz_24 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Text-Phone"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-Phone\"",pz_24);
return pz_24;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Text-Phone\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int otherwiseWhen_3(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_25 = myStepPage.getProperty("pxResults");
targetProperty_5 = pz_25;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ctxt_page_5 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_5.getString("pxObjClass"))) {
	ctxt_page_5.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_5);
actionProlog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_5);
if (appendAndMapTo_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "Append and Map to", null, targetProperty_5);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
actionProlog(pz_CurrentTraceInfo,"4.2", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"4.2", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =null;
ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Set .pyStreamName", source_9, target_22);
{
    String pzSourceVar26 = "";
    pzSourceVar26 = "pxPhone";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar26, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Set .pyStreamName", source_9, target_22);
ClipboardPage source_10 =null;
ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.2", "Set .pyLabel", source_10, target_23);
{
    String pzSourceVar28 = "";
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar28, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.2", "Set .pyLabel", source_10, target_23);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-URL\"");
try {
boolean pz_29 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Text-URL"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-URL\"",pz_29);
return pz_29;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Text-URL\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int otherwiseWhen_4(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_6 = null;
ClipboardProperty pz_30 = myStepPage.getProperty("pxResults");
targetProperty_6 = pz_30;
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ctxt_page_6 = targetProperty_6.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_6.getString("pxObjClass"))) {
	ctxt_page_6.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_6);
actionProlog(pz_CurrentTraceInfo,"5.1", "Append and Map to", null, targetProperty_6);
if (appendAndMapTo_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.1", "Append and Map to", null, targetProperty_6);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =null;
ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1.1", "Set .pyStreamName", source_11, target_24);
{
    String pzSourceVar31 = "";
    pzSourceVar31 = "pxURL";
    PRStackFrame ctxt_frame_32 = null;
    try {
        ctxt_frame_32 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_32.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar31, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1.1", "Set .pyStreamName", source_11, target_24);
ClipboardPage source_12 =null;
ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1.2", "Set .pyLabel", source_12, target_25);
{
    String pzSourceVar33 = "";
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar33, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1.2", "Set .pyLabel", source_12, target_25);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-UserReference\"");
try {
boolean pz_34 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Text-UserReference"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Text-UserReference\"",pz_34);
return pz_34;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Text-UserReference\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int otherwiseWhen_5(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_7 = null;
ClipboardProperty pz_35 = myStepPage.getProperty("pxResults");
targetProperty_7 = pz_35;
/* entering new scope */
boolean pop_ctxt_page_7 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_7 = null;
ctxt_page_7 = targetProperty_7.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_7.getString("pxObjClass"))) {
	ctxt_page_7.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_7);
actionProlog(pz_CurrentTraceInfo,"6.1", "Append and Map to", null, targetProperty_7);
if (appendAndMapTo_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.1", "Append and Map to", null, targetProperty_7);
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_8 = null;
ClipboardProperty pz_36 = myStepPage.getProperty("pxResults");
targetProperty_8 = pz_36;
/* entering new scope */
boolean pop_ctxt_page_8 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ctxt_page_8 = targetProperty_8.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_8.getString("pxObjClass"))) {
	ctxt_page_8.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_8);
actionProlog(pz_CurrentTraceInfo,"6.2", "Append and Map to", null, targetProperty_8);
if (appendAndMapTo_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.2", "Append and Map to", null, targetProperty_8);
} finally {
if (pop_ctxt_page_8) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =null;
ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.1", "Set .pyStreamName", source_13, target_26);
{
    String pzSourceVar37 = "";
    pzSourceVar37 = "pxAutoComplete";
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar37, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.1", "Set .pyStreamName", source_13, target_26);
ClipboardPage source_14 =null;
ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.2", "Set .pyLabel", source_14, target_27);
{
    String pzSourceVar39 = "";
    pzSourceVar39 = "Search box";
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar39, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1.2", "Set .pyLabel", source_14, target_27);
return CODE_CONTINUE;
}private int appendAndMapTo_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =null;
ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.2.1", "Set .pyStreamName", source_15, target_28);
{
    String pzSourceVar41 = "";
    pzSourceVar41 = "pxDropdown";
    PRStackFrame ctxt_frame_43 = null;
    try {
        ctxt_frame_43 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_43.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar41, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_43);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.2.1", "Set .pyStreamName", source_15, target_28);
ClipboardPage source_16 =null;
ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.2.2", "Set .pyLabel", source_16, target_29);
{
    String pzSourceVar43 = "";
    pzSourceVar43 = "Drop-down list";
    PRStackFrame ctxt_frame_45 = null;
    try {
        ctxt_frame_45 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_45.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar43, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.2.2", "Set .pyLabel", source_16, target_29);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Boolean\"");
try {
boolean pz_45 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Boolean"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Boolean\"",pz_45);
return pz_45;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Boolean\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int otherwiseWhen_6(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_9 = null;
ClipboardProperty pz_46 = myStepPage.getProperty("pxResults");
targetProperty_9 = pz_46;
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_9 = null;
ctxt_page_9 = targetProperty_9.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_9.getString("pxObjClass"))) {
	ctxt_page_9.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_9);
actionProlog(pz_CurrentTraceInfo,"7.1", "Append and Map to", null, targetProperty_9);
if (appendAndMapTo_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.1", "Append and Map to", null, targetProperty_9);
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =null;
ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1.1", "Set .pyStreamName", source_17, target_30);
{
    String pzSourceVar47 = "";
    pzSourceVar47 = "pxCheckbox";
    PRStackFrame ctxt_frame_49 = null;
    try {
        ctxt_frame_49 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_49.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar47, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_49);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.1.1", "Set .pyStreamName", source_17, target_30);
ClipboardPage source_18 =null;
ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1.2", "Set .pyLabel", source_18, target_31);
{
    String pzSourceVar49 = "";
    PRStackFrame ctxt_frame_51 = null;
    try {
        ctxt_frame_51 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_51.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar49, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_51);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.1.2", "Set .pyLabel", source_18, target_31);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Decimal-Currency\"");
try {
boolean pz_50 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Decimal-Currency"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Decimal-Currency\"",pz_50);
return pz_50;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Decimal-Currency\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
}private int otherwiseWhen_7(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_10 = null;
ClipboardProperty pz_51 = myStepPage.getProperty("pxResults");
targetProperty_10 = pz_51;
/* entering new scope */
boolean pop_ctxt_page_10 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_10 = null;
ctxt_page_10 = targetProperty_10.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_10.getString("pxObjClass"))) {
	ctxt_page_10.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_10 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_10);
actionProlog(pz_CurrentTraceInfo,"8.1", "Append and Map to", null, targetProperty_10);
if (appendAndMapTo_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"8.1", "Append and Map to", null, targetProperty_10);
} finally {
if (pop_ctxt_page_10) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_10(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =null;
ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1.1", "Set .pyStreamName", source_19, target_32);
{
    String pzSourceVar52 = "";
    pzSourceVar52 = "pxCurrency";
    PRStackFrame ctxt_frame_55 = null;
    try {
        ctxt_frame_55 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_55.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar52, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_55);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1.1", "Set .pyStreamName", source_19, target_32);
ClipboardPage source_20 =null;
ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1.2", "Set .pyLabel", source_20, target_33);
{
    String pzSourceVar54 = "";
    PRStackFrame ctxt_frame_57 = null;
    try {
        ctxt_frame_57 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_57.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar54, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_57);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1.2", "Set .pyLabel", source_20, target_33);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_8(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_9 = true;
PRStackFrame pz_modelTargetConditionFrame_9 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Decimal\" || param.ContextClass==\"Pega-Fields-Scalar-Double\"");
try {
boolean pz_55 = ((tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Decimal")) || (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Double")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Decimal\" || param.ContextClass==\"Pega-Fields-Scalar-Double\"",pz_55);
return pz_55;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Decimal\" || param.ContextClass==\"Pega-Fields-Scalar-Double\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_9, pz_modelTargetConditionFrame_9);
}
}private int otherwiseWhen_8(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_11 = null;
ClipboardProperty pz_56 = myStepPage.getProperty("pxResults");
targetProperty_11 = pz_56;
/* entering new scope */
boolean pop_ctxt_page_11 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_11 = null;
ctxt_page_11 = targetProperty_11.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_11.getString("pxObjClass"))) {
	ctxt_page_11.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_11 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_11);
actionProlog(pz_CurrentTraceInfo,"9.1", "Append and Map to", null, targetProperty_11);
if (appendAndMapTo_11(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"9.1", "Append and Map to", null, targetProperty_11);
} finally {
if (pop_ctxt_page_11) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_11(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_21 =null;
ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1.1", "Set .pyStreamName", source_21, target_34);
{
    String pzSourceVar57 = "";
    pzSourceVar57 = "pxNumber";
    PRStackFrame ctxt_frame_61 = null;
    try {
        ctxt_frame_61 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_61.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar57, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_61);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1.1", "Set .pyStreamName", source_21, target_34);
ClipboardPage source_22 =null;
ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1.2", "Set .pyLabel", source_22, target_35);
{
    String pzSourceVar59 = "";
    PRStackFrame ctxt_frame_63 = null;
    try {
        ctxt_frame_63 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_63.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar59, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1.2", "Set .pyLabel", source_22, target_35);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_9(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_10 = true;
PRStackFrame pz_modelTargetConditionFrame_10 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Decimal-Percentage\"");
try {
boolean pz_60 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Decimal-Percentage"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Decimal-Percentage\"",pz_60);
return pz_60;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Decimal-Percentage\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_10, pz_modelTargetConditionFrame_10);
}
}private int otherwiseWhen_9(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_12 = null;
ClipboardProperty pz_61 = myStepPage.getProperty("pxResults");
targetProperty_12 = pz_61;
/* entering new scope */
boolean pop_ctxt_page_12 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_12 = null;
ctxt_page_12 = targetProperty_12.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_12.getString("pxObjClass"))) {
	ctxt_page_12.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_12 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_12);
actionProlog(pz_CurrentTraceInfo,"10.1", "Append and Map to", null, targetProperty_12);
if (appendAndMapTo_12(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.1", "Append and Map to", null, targetProperty_12);
} finally {
if (pop_ctxt_page_12) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_12(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_23 =null;
ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1.1", "Set .pyStreamName", source_23, target_36);
{
    String pzSourceVar62 = "";
    pzSourceVar62 = "pxPercentage";
    PRStackFrame ctxt_frame_67 = null;
    try {
        ctxt_frame_67 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_67.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar62, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_67);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1.1", "Set .pyStreamName", source_23, target_36);
ClipboardPage source_24 =null;
ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1.2", "Set .pyLabel", source_24, target_37);
{
    String pzSourceVar64 = "";
    PRStackFrame ctxt_frame_69 = null;
    try {
        ctxt_frame_69 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_69.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar64, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_69);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1.2", "Set .pyLabel", source_24, target_37);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_10(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_11 = true;
PRStackFrame pz_modelTargetConditionFrame_11 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Integer\"");
try {
boolean pz_65 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Integer"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Integer\"",pz_65);
return pz_65;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Integer\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_11, pz_modelTargetConditionFrame_11);
}
}private int otherwiseWhen_10(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_13 = null;
ClipboardProperty pz_66 = myStepPage.getProperty("pxResults");
targetProperty_13 = pz_66;
/* entering new scope */
boolean pop_ctxt_page_13 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_13 = null;
ctxt_page_13 = targetProperty_13.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_13.getString("pxObjClass"))) {
	ctxt_page_13.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_13 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_13);
actionProlog(pz_CurrentTraceInfo,"11.1", "Append and Map to", null, targetProperty_13);
if (appendAndMapTo_13(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"11.1", "Append and Map to", null, targetProperty_13);
} finally {
if (pop_ctxt_page_13) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_13(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_25 =null;
ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1", "Set .pyStreamName", source_25, target_38);
{
    String pzSourceVar67 = "";
    pzSourceVar67 = "pxInteger";
    PRStackFrame ctxt_frame_73 = null;
    try {
        ctxt_frame_73 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_73.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar67, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_73);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1", "Set .pyStreamName", source_25, target_38);
ClipboardPage source_26 =null;
ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.2", "Set .pyLabel", source_26, target_39);
{
    String pzSourceVar69 = "";
    PRStackFrame ctxt_frame_75 = null;
    try {
        ctxt_frame_75 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_75.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar69, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_75);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.2", "Set .pyLabel", source_26, target_39);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_11(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_12 = true;
PRStackFrame pz_modelTargetConditionFrame_12 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-DateTime\" || param.ContextClass==\"Pega-Fields-Scalar-Date\" || param.ContextClass==\"Pega-Fields-Scalar-TimeOfDay\"");
try {
boolean pz_70 = (((tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-DateTime")) || (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Date"))) || (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-TimeOfDay")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-DateTime\" || param.ContextClass==\"Pega-Fields-Scalar-Date\" || param.ContextClass==\"Pega-Fields-Scalar-TimeOfDay\"",pz_70);
return pz_70;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-DateTime\" || param.ContextClass==\"Pega-Fields-Scalar-Date\" || param.ContextClass==\"Pega-Fields-Scalar-TimeOfDay\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_12, pz_modelTargetConditionFrame_12);
}
}private int otherwiseWhen_11(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_14 = null;
ClipboardProperty pz_71 = myStepPage.getProperty("pxResults");
targetProperty_14 = pz_71;
/* entering new scope */
boolean pop_ctxt_page_14 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_14 = null;
ctxt_page_14 = targetProperty_14.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_14.getString("pxObjClass"))) {
	ctxt_page_14.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_14 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_14);
actionProlog(pz_CurrentTraceInfo,"12.1", "Append and Map to", null, targetProperty_14);
if (appendAndMapTo_14(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"12.1", "Append and Map to", null, targetProperty_14);
} finally {
if (pop_ctxt_page_14) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_14(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_27 =null;
ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.1.1", "Set .pyStreamName", source_27, target_40);
{
    String pzSourceVar72 = "";
    pzSourceVar72 = "pxDateTime";
    PRStackFrame ctxt_frame_79 = null;
    try {
        ctxt_frame_79 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_79.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar72, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_79);
    }
}

actionEpilog(pz_CurrentTraceInfo,"12.1.1", "Set .pyStreamName", source_27, target_40);
ClipboardPage source_28 =null;
ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.1.2", "Set .pyLabel", source_28, target_41);
{
    String pzSourceVar74 = "";
    PRStackFrame ctxt_frame_81 = null;
    try {
        ctxt_frame_81 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_81.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar74, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_81);
    }
}

actionEpilog(pz_CurrentTraceInfo,"12.1.2", "Set .pyLabel", source_28, target_41);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_12(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_13 = true;
PRStackFrame pz_modelTargetConditionFrame_13 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Picklist\"");
try {
boolean pz_75 = (tools.getParamValue("ContextClass").equals("Pega-Fields-Scalar-Picklist"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ContextClass==\"Pega-Fields-Scalar-Picklist\"",pz_75);
return pz_75;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ContextClass==\"Pega-Fields-Scalar-Picklist\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_13, pz_modelTargetConditionFrame_13);
}
}private int otherwiseWhen_12(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_15 = null;
ClipboardProperty pz_76 = myStepPage.getProperty("pxResults");
targetProperty_15 = pz_76;
/* entering new scope */
boolean pop_ctxt_page_15 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_15 = null;
ctxt_page_15 = targetProperty_15.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_15.getString("pxObjClass"))) {
	ctxt_page_15.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_15 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_15);
actionProlog(pz_CurrentTraceInfo,"13.1", "Append and Map to", null, targetProperty_15);
if (appendAndMapTo_15(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"13.1", "Append and Map to", null, targetProperty_15);
} finally {
if (pop_ctxt_page_15) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_16 = null;
ClipboardProperty pz_77 = myStepPage.getProperty("pxResults");
targetProperty_16 = pz_77;
/* entering new scope */
boolean pop_ctxt_page_16 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_16 = null;
ctxt_page_16 = targetProperty_16.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_16.getString("pxObjClass"))) {
	ctxt_page_16.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_16 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_16);
actionProlog(pz_CurrentTraceInfo,"13.2", "Append and Map to", null, targetProperty_16);
if (appendAndMapTo_16(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"13.2", "Append and Map to", null, targetProperty_16);
} finally {
if (pop_ctxt_page_16) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_17 = null;
ClipboardProperty pz_78 = myStepPage.getProperty("pxResults");
targetProperty_17 = pz_78;
/* entering new scope */
boolean pop_ctxt_page_17 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_17 = null;
ctxt_page_17 = targetProperty_17.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_17.getString("pxObjClass"))) {
	ctxt_page_17.putString("pxObjClass", "Pega-Fields");
}
pop_ctxt_page_17 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_17);
actionProlog(pz_CurrentTraceInfo,"13.3", "Append and Map to", null, targetProperty_17);
if (appendAndMapTo_17(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"13.3", "Append and Map to", null, targetProperty_17);
} finally {
if (pop_ctxt_page_17) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_15(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_29 =null;
ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1.1", "Set .pyStreamName", source_29, target_42);
{
    String pzSourceVar79 = "";
    pzSourceVar79 = "pxDropdown";
    PRStackFrame ctxt_frame_87 = null;
    try {
        ctxt_frame_87 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_87.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar79, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_87);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.1.1", "Set .pyStreamName", source_29, target_42);
ClipboardPage source_30 =null;
ClipboardPage target_43 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1.2", "Set .pyLabel", source_30, target_43);
{
    String pzSourceVar81 = "";
    pzSourceVar81 = "Drop-down list";
    PRStackFrame ctxt_frame_89 = null;
    try {
        ctxt_frame_89 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_89.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar81, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_89);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.1.2", "Set .pyLabel", source_30, target_43);
return CODE_CONTINUE;
}private int appendAndMapTo_16(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_31 =null;
ClipboardPage target_44 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.2.1", "Set .pyStreamName", source_31, target_44);
{
    String pzSourceVar83 = "";
    pzSourceVar83 = "pxAutoComplete";
    PRStackFrame ctxt_frame_91 = null;
    try {
        ctxt_frame_91 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_91.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar83, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_91);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.2.1", "Set .pyStreamName", source_31, target_44);
ClipboardPage source_32 =null;
ClipboardPage target_45 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.2.2", "Set .pyLabel", source_32, target_45);
{
    String pzSourceVar85 = "";
    pzSourceVar85 = "Search box";
    PRStackFrame ctxt_frame_93 = null;
    try {
        ctxt_frame_93 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_93.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar85, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_93);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.2.2", "Set .pyLabel", source_32, target_45);
return CODE_CONTINUE;
}private int appendAndMapTo_17(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_33 =null;
ClipboardPage target_46 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.3.1", "Set .pyStreamName", source_33, target_46);
{
    String pzSourceVar87 = "";
    pzSourceVar87 = "pxRadioButtons";
    PRStackFrame ctxt_frame_95 = null;
    try {
        ctxt_frame_95 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_95.getStepPage();
        pega.setViaPropRef(".pyStreamName", pRef_4, myStepPage, pzSourceVar87, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_95);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.3.1", "Set .pyStreamName", source_33, target_46);
ClipboardPage source_34 =null;
ClipboardPage target_47 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.3.2", "Set .pyLabel", source_34, target_47);
{
    String pzSourceVar89 = "";
    pzSourceVar89 = "Radio-buttons";
    PRStackFrame ctxt_frame_97 = null;
    try {
        ctxt_frame_97 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_97.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar89, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_97);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.3.2", "Set .pyLabel", source_34, target_47);
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
	"Rule-Obj-Model:PZGETAVAILABLECONTROLSFORFIELD"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETAVAILABLECONTROLSFORFIELD","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-07-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZGETAVAILABLECONTROLSFORFIELD #20211001T190857.610 GMT","!PZGETAVAILABLECONTROLSFORFIELD",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1738738906)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZGETAVAILABLECONTROLSFORFIELD #20211001T190857.610 GMT:20211001T190857.610 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "0c79677c999b9c3e77e54786f594d9a1";
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

public static final String[] pRef_4 = new String[] { "", "", "pyStreamName", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyLabel", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZGETAVAILABLECONTROLSFORFIELD #20211001T190857.610 GMT", "Code-Pega-List pzGetAvailableControlsForField", "Pega-ProcessArchitect", "08-07-01", "20211001T190857.610 GMT");
}
