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
public class ra_model_pzsetmodalanims_e2767c0eef6466b92fb296da6b3a6494 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzSetModalAnims.Embed_.Model");
	public ra_model_pzsetmodalanims_e2767c0eef6466b92fb296da6b3a6494(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED- PZSETMODALANIMS #20190412T120834.206 GMT	Pega-UIDesign:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PropertyExists(\".pyLATargetAnimation\")");
try {
boolean pz_1 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { ".pyLATargetAnimation" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PropertyExists(\".pyLATargetAnimation\")",pz_1);
return pz_1;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PropertyExists(\".pyLATargetAnimation\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "When", null, target_2);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@PropertyExists(\".pyIsAnimateTarget\")");
try {
boolean pz_2 = ((!(pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { ".pyIsAnimateTarget" })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@PropertyExists(\".pyIsAnimateTarget\")",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@PropertyExists(\".pyIsAnimateTarget\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"Primary"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = tools.getPrimaryPage();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary", ctxt_page_1);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_3 = null;
try {
ctxt_frame_3 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_3.getStepPage();

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"1.1.1.1", "Apply Data Transform Embed-DesktopAPI-OpenModalWindow.pzSetAnimDefaults", null, null);
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pzSetAnimDefaults");
pz_modelKey_1.putString("pyClassName", "Embed-DesktopAPI-OpenModalWindow");
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"1.1.1.1", "Apply Data Transform Embed-DesktopAPI-OpenModalWindow.pzSetAnimDefaults", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
} // return to previous step page
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pyUseOtherInMobile", source_1, target_3);
{
    boolean pzSourceVar3 = false;
    pzSourceVar3 = true;
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pega.setViaPropRef(".pyUseOtherInMobile", pRef_4, myStepPage, pzSourceVar3, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pyUseOtherInMobile", source_1, target_3);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyIsAnimateTarget", source_2, target_4);
{
    boolean pzSourceVar6 = false;
    pzSourceVar6 = true;
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pega.setViaPropRef(".pyIsAnimateTarget", pRef_7, myStepPage, pzSourceVar6, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyIsAnimateTarget", source_2, target_4);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pyAnimations(DesktopReveal).pyAnimEffect", source_3, target_5);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = "none";
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pega.setViaPropRef(".pyAnimations(DesktopReveal).pyAnimEffect", pRef_10, myStepPage, pzSourceVar9, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pyAnimations(DesktopReveal).pyAnimEffect", source_3, target_5);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.5", "Set .pyAnimations(MobileReveal).pyAnimSpeed", source_4, target_6);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = "default";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimSpeed", pRef_13, myStepPage, pzSourceVar12, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.5", "Set .pyAnimations(MobileReveal).pyAnimSpeed", source_4, target_6);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.6", "Set .pyAnimations(MobileReveal).pyEaseOptions", source_5, target_7);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = "standard";
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyEaseOptions", pRef_16, myStepPage, pzSourceVar15, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.6", "Set .pyAnimations(MobileReveal).pyEaseOptions", source_5, target_7);
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.7", "When", null, target_8);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.7", "When", null, target_8);
} else {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.8", "Otherwise", null, target_9);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.8", "Otherwise", null, target_9);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_10 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.9", "When", null, target_10);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.9", "When", null, target_10);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.10", "Otherwise When", null, target_11);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.10", "Otherwise When", null, target_11);
} else if (otherwiseWhenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.11", "Otherwise When", null, target_12);
if (otherwiseWhen_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.11", "Otherwise When", null, target_12);
} else if (otherwiseWhenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.12", "Otherwise When", null, target_13);
if (otherwiseWhen_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.12", "Otherwise When", null, target_13);
} else if (otherwiseWhenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_14 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.13", "Otherwise When", null, target_14);
if (otherwiseWhen_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.13", "Otherwise When", null, target_14);
} else if (otherwiseWhenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_15 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.14", "Otherwise When", null, target_15);
if (otherwiseWhen_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.14", "Otherwise When", null, target_15);
} else if (otherwiseWhenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_16 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.15", "Otherwise When", null, target_16);
if (otherwiseWhen_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.15", "Otherwise When", null, target_16);
} else if (otherwiseWhenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_17 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.16", "Otherwise When", null, target_17);
if (otherwiseWhen_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.16", "Otherwise When", null, target_17);
}
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_18 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.17", "When", null, target_18);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.17", "When", null, target_18);
} else if (otherwiseWhenCondition_8(pz_CurrentTraceInfo)) {
ClipboardPage target_19 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.18", "Otherwise When", null, target_19);
if (otherwiseWhen_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.18", "Otherwise When", null, target_19);
} else if (otherwiseWhenCondition_9(pz_CurrentTraceInfo)) {
ClipboardPage target_20 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.19", "Otherwise When", null, target_20);
if (otherwiseWhen_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.19", "Otherwise When", null, target_20);
} else if (otherwiseWhenCondition_10(pz_CurrentTraceInfo)) {
ClipboardPage target_21 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.20", "Otherwise When", null, target_21);
if (otherwiseWhen_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.20", "Otherwise When", null, target_21);
} else if (otherwiseWhenCondition_11(pz_CurrentTraceInfo)) {
ClipboardPage target_22 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.21", "Otherwise When", null, target_22);
if (otherwiseWhen_11(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.21", "Otherwise When", null, target_22);
} else if (otherwiseWhenCondition_12(pz_CurrentTraceInfo)) {
ClipboardPage target_23 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.22", "Otherwise When", null, target_23);
if (otherwiseWhen_12(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.22", "Otherwise When", null, target_23);
} else if (otherwiseWhenCondition_13(pz_CurrentTraceInfo)) {
ClipboardPage target_24 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.23", "Otherwise When", null, target_24);
if (otherwiseWhen_13(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.23", "Otherwise When", null, target_24);
} else if (otherwiseWhenCondition_14(pz_CurrentTraceInfo)) {
ClipboardPage target_25 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.24", "Otherwise When", null, target_25);
if (otherwiseWhen_14(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.24", "Otherwise When", null, target_25);
}
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_26 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1.1.25", "When", null, target_26);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1.1.25", "When", null, target_26);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_14 = null;
try {
ctxt_frame_14 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_14.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-in-animation\"");
try {
boolean pz_20 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-in-animation"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-in-animation\"",pz_20);
return pz_20;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-in-animation\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
} // return to previous step page
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.7.1", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_6, target_27);
{
    boolean pzSourceVar21 = false;
    pzSourceVar21 = false;
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar21, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.7.1", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_6, target_27);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.8.1", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_7, target_28);
{
    boolean pzSourceVar24 = false;
    pzSourceVar24 = true;
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar24, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.8.1", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_7, target_28);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_19 = null;
try {
ctxt_frame_19 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_19.getStepPage();
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-fade\"");
try {
boolean pz_28 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-fade"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-fade\"",pz_28);
return pz_28;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-fade\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
} // return to previous step page
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.9.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_8, target_29);
{
    String pzSourceVar29 = "";
    pzSourceVar29 = "anim-fade-open";
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar29, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.9.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_8, target_29);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_22 = null;
try {
ctxt_frame_22 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_22.getStepPage();
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-grow\"");
try {
boolean pz_32 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-grow"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-grow\"",pz_32);
return pz_32;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-grow\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
} // return to previous step page
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.10.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_9, target_30);
{
    String pzSourceVar33 = "";
    pzSourceVar33 = "anim-grow-open";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar33, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.10.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_9, target_30);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_25 = null;
try {
ctxt_frame_25 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_25.getStepPage();
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-shrink\"");
try {
boolean pz_35 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-shrink"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-shrink\"",pz_35);
return pz_35;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-shrink\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
} // return to previous step page
}private int otherwiseWhen_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.11.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_10, target_31);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "anim-shrink-open";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar36, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.11.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_10, target_31);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_28 = null;
try {
ctxt_frame_28 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_28.getStepPage();
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-vert-flip\"");
try {
boolean pz_38 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-vert-flip"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-vert-flip\"",pz_38);
return pz_38;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-vert-flip\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
} // return to previous step page
}private int otherwiseWhen_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.12.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_11, target_32);
{
    String pzSourceVar39 = "";
    pzSourceVar39 = "anim-vert-flip-open";
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar39, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.12.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_11, target_32);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.12.2", "Set .pyAnimations(MobileReveal).pyDisplayText", source_12, target_33);
{
    String pzSourceVar41 = "";
    pzSourceVar41 = "true";
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyDisplayText", pRef_42, myStepPage, pzSourceVar41, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.12.2", "Set .pyAnimations(MobileReveal).pyDisplayText", source_12, target_33);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_33 = null;
try {
ctxt_frame_33 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_33.getStepPage();
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-bottom\"");
try {
boolean pz_44 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-bottom"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-bottom\"",pz_44);
return pz_44;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-bottom\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
} // return to previous step page
}private int otherwiseWhen_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.13.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_13, target_34);
{
    String pzSourceVar45 = "";
    pzSourceVar45 = "anim-from";
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar45, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.13.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_13, target_34);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.13.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_14, target_35);
{
    String pzSourceVar47 = "";
    pzSourceVar47 = "offbottom";
    PRStackFrame ctxt_frame_36 = null;
    try {
        ctxt_frame_36 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_36.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffectsDirection", pRef_48, myStepPage, pzSourceVar47, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_36);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.13.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_14, target_35);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_38 = null;
try {
ctxt_frame_38 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_38.getStepPage();
boolean pz_CheckMessage_9 = true;
PRStackFrame pz_modelTargetConditionFrame_9 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-right\"");
try {
boolean pz_50 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-right"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-right\"",pz_50);
return pz_50;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-right\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_9, pz_modelTargetConditionFrame_9);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_38);
} // return to previous step page
}private int otherwiseWhen_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.14.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_15, target_36);
{
    String pzSourceVar51 = "";
    pzSourceVar51 = "anim-from";
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar51, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.14.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_15, target_36);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.14.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_16, target_37);
{
    String pzSourceVar53 = "";
    pzSourceVar53 = "offright";
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffectsDirection", pRef_48, myStepPage, pzSourceVar53, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.14.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_16, target_37);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_43 = null;
try {
ctxt_frame_43 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_43.getStepPage();
boolean pz_CheckMessage_10 = true;
PRStackFrame pz_modelTargetConditionFrame_10 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-left\"");
try {
boolean pz_55 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-left"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-left\"",pz_55);
return pz_55;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-left\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_10, pz_modelTargetConditionFrame_10);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_43);
} // return to previous step page
}private int otherwiseWhen_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.15.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_17, target_38);
{
    String pzSourceVar56 = "";
    pzSourceVar56 = "anim-from";
    PRStackFrame ctxt_frame_44 = null;
    try {
        ctxt_frame_44 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_44.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar56, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_44);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.15.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_17, target_38);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.15.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_18, target_39);
{
    String pzSourceVar58 = "";
    pzSourceVar58 = "offleft";
    PRStackFrame ctxt_frame_46 = null;
    try {
        ctxt_frame_46 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_46.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffectsDirection", pRef_48, myStepPage, pzSourceVar58, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_46);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.15.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_18, target_39);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_48 = null;
try {
ctxt_frame_48 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_48.getStepPage();
boolean pz_CheckMessage_11 = true;
PRStackFrame pz_modelTargetConditionFrame_11 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-top\"");
try {
boolean pz_60 = (scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-top"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyLaunch==\"anim-top\"",pz_60);
return pz_60;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyLaunch==\"anim-top\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_11, pz_modelTargetConditionFrame_11);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_48);
} // return to previous step page
}private int otherwiseWhen_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.16.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_19, target_40);
{
    String pzSourceVar61 = "";
    pzSourceVar61 = "anim-from";
    PRStackFrame ctxt_frame_49 = null;
    try {
        ctxt_frame_49 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_49.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffect", pRef_30, myStepPage, pzSourceVar61, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_49);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.16.1", "Set .pyAnimations(MobileReveal).pyAnimEffect", source_19, target_40);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.16.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_20, target_41);
{
    String pzSourceVar63 = "";
    pzSourceVar63 = "offtop";
    PRStackFrame ctxt_frame_51 = null;
    try {
        ctxt_frame_51 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_51.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyAnimEffectsDirection", pRef_48, myStepPage, pzSourceVar63, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_51);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.16.2", "Set .pyAnimations(MobileReveal).pyAnimEffectsDirection", source_20, target_41);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_53 = null;
try {
ctxt_frame_53 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_53.getStepPage();
boolean pz_CheckMessage_12 = true;
PRStackFrame pz_modelTargetConditionFrame_12 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-top\"");
try {
boolean pz_65 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-top"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-top\"",pz_65);
return pz_65;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-top\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_12, pz_modelTargetConditionFrame_12);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_53);
} // return to previous step page
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.17.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_21, target_42);
{
    String pzSourceVar66 = "";
    pzSourceVar66 = "anim-to";
    PRStackFrame ctxt_frame_54 = null;
    try {
        ctxt_frame_54 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_54.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar66, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_54);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.17.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_21, target_42);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_43 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.17.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_22, target_43);
{
    String pzSourceVar69 = "";
    pzSourceVar69 = "offtop";
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffectsDirection", pRef_70, myStepPage, pzSourceVar69, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.17.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_22, target_43);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_44 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.17.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_23, target_44);
{
    boolean pzSourceVar72 = false;
    pzSourceVar72 = true;
    PRStackFrame ctxt_frame_58 = null;
    try {
        ctxt_frame_58 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_58.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar72, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_58);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.17.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_23, target_44);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_8(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_60 = null;
try {
ctxt_frame_60 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_60.getStepPage();
boolean pz_CheckMessage_13 = true;
PRStackFrame pz_modelTargetConditionFrame_13 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-left\"");
try {
boolean pz_74 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-left"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-left\"",pz_74);
return pz_74;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-left\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_13, pz_modelTargetConditionFrame_13);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
} // return to previous step page
}private int otherwiseWhen_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_45 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.18.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_24, target_45);
{
    String pzSourceVar75 = "";
    pzSourceVar75 = "anim-to";
    PRStackFrame ctxt_frame_61 = null;
    try {
        ctxt_frame_61 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_61.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar75, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_61);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.18.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_24, target_45);
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_46 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.18.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_25, target_46);
{
    String pzSourceVar77 = "";
    pzSourceVar77 = "offleft";
    PRStackFrame ctxt_frame_63 = null;
    try {
        ctxt_frame_63 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_63.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffectsDirection", pRef_70, myStepPage, pzSourceVar77, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.18.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_25, target_46);
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_47 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.18.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_26, target_47);
{
    boolean pzSourceVar79 = false;
    pzSourceVar79 = true;
    PRStackFrame ctxt_frame_65 = null;
    try {
        ctxt_frame_65 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_65.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar79, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.18.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_26, target_47);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_9(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_67 = null;
try {
ctxt_frame_67 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_67.getStepPage();
boolean pz_CheckMessage_14 = true;
PRStackFrame pz_modelTargetConditionFrame_14 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-right\"");
try {
boolean pz_81 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-right"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-right\"",pz_81);
return pz_81;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-right\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_14, pz_modelTargetConditionFrame_14);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_67);
} // return to previous step page
}private int otherwiseWhen_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_48 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.19.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_27, target_48);
{
    String pzSourceVar82 = "";
    pzSourceVar82 = "anim-to";
    PRStackFrame ctxt_frame_68 = null;
    try {
        ctxt_frame_68 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_68.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar82, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_68);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.19.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_27, target_48);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_49 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.19.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_28, target_49);
{
    String pzSourceVar84 = "";
    pzSourceVar84 = "offright";
    PRStackFrame ctxt_frame_70 = null;
    try {
        ctxt_frame_70 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_70.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffectsDirection", pRef_70, myStepPage, pzSourceVar84, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_70);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.19.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_28, target_49);
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_50 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.19.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_29, target_50);
{
    boolean pzSourceVar86 = false;
    pzSourceVar86 = true;
    PRStackFrame ctxt_frame_72 = null;
    try {
        ctxt_frame_72 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_72.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar86, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_72);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.19.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_29, target_50);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_10(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_74 = null;
try {
ctxt_frame_74 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_74.getStepPage();
boolean pz_CheckMessage_15 = true;
PRStackFrame pz_modelTargetConditionFrame_15 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-bottom\"");
try {
boolean pz_88 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-bottom"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-bottom\"",pz_88);
return pz_88;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-bottom\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_15, pz_modelTargetConditionFrame_15);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_74);
} // return to previous step page
}private int otherwiseWhen_10(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_51 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.20.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_30, target_51);
{
    String pzSourceVar89 = "";
    pzSourceVar89 = "anim-to";
    PRStackFrame ctxt_frame_75 = null;
    try {
        ctxt_frame_75 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_75.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar89, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_75);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.20.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_30, target_51);
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_52 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.20.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_31, target_52);
{
    String pzSourceVar91 = "";
    pzSourceVar91 = "offbottom";
    PRStackFrame ctxt_frame_77 = null;
    try {
        ctxt_frame_77 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_77.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffectsDirection", pRef_70, myStepPage, pzSourceVar91, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_77);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.20.2", "Set .pyAnimations(MobileDismiss).pyAnimEffectsDirection", source_31, target_52);
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_53 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.20.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_32, target_53);
{
    boolean pzSourceVar93 = false;
    pzSourceVar93 = true;
    PRStackFrame ctxt_frame_79 = null;
    try {
        ctxt_frame_79 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_79.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar93, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_79);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.20.3", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_32, target_53);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_11(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_81 = null;
try {
ctxt_frame_81 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_81.getStepPage();
boolean pz_CheckMessage_16 = true;
PRStackFrame pz_modelTargetConditionFrame_16 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-grow\"");
try {
boolean pz_95 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-grow"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-grow\"",pz_95);
return pz_95;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-grow\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_16, pz_modelTargetConditionFrame_16);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_81);
} // return to previous step page
}private int otherwiseWhen_11(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_54 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.21.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_33, target_54);
{
    String pzSourceVar96 = "";
    pzSourceVar96 = "anim-shrink-close";
    PRStackFrame ctxt_frame_82 = null;
    try {
        ctxt_frame_82 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_82.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar96, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_82);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.21.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_33, target_54);
ClipboardPage source_34 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_55 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.21.2", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_34, target_55);
{
    boolean pzSourceVar98 = false;
    pzSourceVar98 = true;
    PRStackFrame ctxt_frame_84 = null;
    try {
        ctxt_frame_84 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_84.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar98, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_84);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.21.2", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_34, target_55);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_12(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_86 = null;
try {
ctxt_frame_86 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_86.getStepPage();
boolean pz_CheckMessage_17 = true;
PRStackFrame pz_modelTargetConditionFrame_17 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-shrink\"");
try {
boolean pz_100 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-shrink"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-shrink\"",pz_100);
return pz_100;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-shrink\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_17, pz_modelTargetConditionFrame_17);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_86);
} // return to previous step page
}private int otherwiseWhen_12(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_35 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_56 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.22.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_35, target_56);
{
    String pzSourceVar101 = "";
    pzSourceVar101 = "anim-grow-close";
    PRStackFrame ctxt_frame_87 = null;
    try {
        ctxt_frame_87 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_87.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar101, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_87);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.22.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_35, target_56);
ClipboardPage source_36 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_57 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.22.2", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_36, target_57);
{
    boolean pzSourceVar103 = false;
    pzSourceVar103 = true;
    PRStackFrame ctxt_frame_89 = null;
    try {
        ctxt_frame_89 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_89.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar103, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_89);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.22.2", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_36, target_57);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_13(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_91 = null;
try {
ctxt_frame_91 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_91.getStepPage();
boolean pz_CheckMessage_18 = true;
PRStackFrame pz_modelTargetConditionFrame_18 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-vert-flip\"");
try {
boolean pz_105 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-vert-flip"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-vert-flip\"",pz_105);
return pz_105;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-vert-flip\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_18, pz_modelTargetConditionFrame_18);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_91);
} // return to previous step page
}private int otherwiseWhen_13(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_37 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_58 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.23.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_37, target_58);
{
    String pzSourceVar106 = "";
    pzSourceVar106 = "anim-vert-flip-close";
    PRStackFrame ctxt_frame_92 = null;
    try {
        ctxt_frame_92 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_92.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar106, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_92);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.23.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_37, target_58);
ClipboardPage source_38 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_59 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.23.2", "Set .pyAnimations(MobileDismiss).pyDisplayText", source_38, target_59);
{
    String pzSourceVar108 = "";
    pzSourceVar108 = "true";
    PRStackFrame ctxt_frame_94 = null;
    try {
        ctxt_frame_94 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_94.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyDisplayText", pRef_109, myStepPage, pzSourceVar108, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_94);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.23.2", "Set .pyAnimations(MobileDismiss).pyDisplayText", source_38, target_59);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_14(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_96 = null;
try {
ctxt_frame_96 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_96.getStepPage();
boolean pz_CheckMessage_19 = true;
PRStackFrame pz_modelTargetConditionFrame_19 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-fade\"");
try {
boolean pz_111 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-fade"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-fade\"",pz_111);
return pz_111;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-fade\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_19, pz_modelTargetConditionFrame_19);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_96);
} // return to previous step page
}private int otherwiseWhen_14(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_39 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_60 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.24.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_39, target_60);
{
    String pzSourceVar112 = "";
    pzSourceVar112 = "anim-fade-close";
    PRStackFrame ctxt_frame_97 = null;
    try {
        ctxt_frame_97 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_97.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileDismiss).pyAnimEffect", pRef_67, myStepPage, pzSourceVar112, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_97);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.24.1", "Set .pyAnimations(MobileDismiss).pyAnimEffect", source_39, target_60);
ClipboardPage source_40 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_61 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.24.2", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_40, target_61);
{
    boolean pzSourceVar114 = false;
    pzSourceVar114 = true;
    PRStackFrame ctxt_frame_99 = null;
    try {
        ctxt_frame_99 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_99.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar114, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_99);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.24.2", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_40, target_61);
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_101 = null;
try {
ctxt_frame_101 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_101.getStepPage();
boolean pz_CheckMessage_20 = true;
PRStackFrame pz_modelTargetConditionFrame_20 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-in-animation\"");
try {
boolean pz_116 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("anim-in-animation"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLATargetAnimation.pyDismiss==\"anim-in-animation\"",pz_116);
return pz_116;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLATargetAnimation.pyDismiss==\"anim-in-animation\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_20, pz_modelTargetConditionFrame_20);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_101);
} // return to previous step page
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_41 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_62 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.25.1", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_41, target_62);
{
    boolean pzSourceVar117 = false;
    pzSourceVar117 = false;
    PRStackFrame ctxt_frame_102 = null;
    try {
        ctxt_frame_102 = pega.pushStackFrame("Embed-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_102.getStepPage();
        pega.setViaPropRef(".pyAnimations(MobileReveal).pyIsCustomDismiss", pRef_22, myStepPage, pzSourceVar117, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_102);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.25.1", "Set .pyAnimations(MobileReveal).pyIsCustomDismiss", source_41, target_62);
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
	"Rule-Obj-Model:PZSETMODALANIMS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETMODALANIMS","Rule-Obj-Model","EMBED-",false,"","Pega-UIDesign","08-03-01","RULE-OBJ-MODEL EMBED- PZSETMODALANIMS #20190412T120834.206 GMT","!PZSETMODALANIMS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1214357698)
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
//	RULE-OBJ-MODEL EMBED- PZSETMODALANIMS #20190412T120834.206 GMT:20190429T170043.772 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "61140aa923409e077a79b3ceb31e3763";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-";
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

public static final String[] pRef_16 = new String[] { "", "", "pyAnimations", "MobileReveal", "pyEaseOptions", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyIsAnimateTarget", "" };
public static final String[] pRef_42 = new String[] { "", "", "pyAnimations", "MobileReveal", "pyDisplayText", "" };
public static final String[] pRef_109 = new String[] { "", "", "pyAnimations", "MobileDismiss", "pyDisplayText", "" };
public static final String[] pRef_67 = new String[] { "", "", "pyAnimations", "MobileDismiss", "pyAnimEffect", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyLATargetAnimation", "", "pyDismiss", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyAnimations", "MobileReveal", "pyAnimSpeed", "" };
public static final String[] pRef_48 = new String[] { "", "", "pyAnimations", "MobileReveal", "pyAnimEffectsDirection", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyAnimations", "DesktopReveal", "pyAnimEffect", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyUseOtherInMobile", "" };
public static final String[] pRef_22 = new String[] { "", "", "pyAnimations", "MobileReveal", "pyIsCustomDismiss", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyAnimations", "MobileReveal", "pyAnimEffect", "" };
public static final String[] pRef_27 = new String[] { "", "", "pyLATargetAnimation", "", "pyLaunch", "" };
public static final String[] pRef_70 = new String[] { "", "", "pyAnimations", "MobileDismiss", "pyAnimEffectsDirection", "" };
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().page("pyLATargetAnimation").scalarProperty("pyLaunch").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().page("pyLATargetAnimation").scalarProperty("pyDismiss").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED- PZSETMODALANIMS #20190412T120834.206 GMT", "Embed- pzSetModalAnims", "Pega-UIDesign", "08-03-01", "20190429T170043.772 GMT");
}
