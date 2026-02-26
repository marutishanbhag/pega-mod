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
public class ra_model_pzloaddsconnectortypes_31f109596289a7f5a5588dd854adfee2 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzLoadDSConnectorTypes.Code_Pega_List.Model");
	public ra_model_pzloaddsconnectortypes_31f109596289a7f5a5588dd854adfee2(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDSCONNECTORTYPES #20180713T135727.815 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
ClipboardProperty pz_1 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_1 = pz_1;
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_1.getString("pxObjClass"))) {
	ctxt_page_1.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_1);
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
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_2 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_2 = pz_2;
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_2.getString("pxObjClass"))) {
	ctxt_page_2.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_2);
actionProlog(pz_CurrentTraceInfo,"3", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_3 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_3 = pz_3;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_3.getString("pxObjClass"))) {
	ctxt_page_3.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"4", "Append and Map to", null, targetProperty_3);
if (appendAndMapTo_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Append and Map to", null, targetProperty_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_4 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_4 = pz_4;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_4.getString("pxObjClass"))) {
	ctxt_page_4.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"5", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_5 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_5 = pz_5;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ctxt_page_5 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_5.getString("pxObjClass"))) {
	ctxt_page_5.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_5);
actionProlog(pz_CurrentTraceInfo,"6", "Append and Map to", null, targetProperty_5);
if (appendAndMapTo_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Append and Map to", null, targetProperty_5);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_6 = null;
ClipboardProperty pz_6 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_6 = pz_6;
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ctxt_page_6 = targetProperty_6.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_6.getString("pxObjClass"))) {
	ctxt_page_6.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_6);
actionProlog(pz_CurrentTraceInfo,"7", "Append and Map to", null, targetProperty_6);
if (appendAndMapTo_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "Append and Map to", null, targetProperty_6);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"8", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"8", "When", null, target_2);
}
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_7 = null;
ClipboardProperty pz_7 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_7 = pz_7;
/* entering new scope */
boolean pop_ctxt_page_7 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_7 = null;
ctxt_page_7 = targetProperty_7.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_7.getString("pxObjClass"))) {
	ctxt_page_7.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_7);
actionProlog(pz_CurrentTraceInfo,"9", "Append and Map to", null, targetProperty_7);
if (appendAndMapTo_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"9", "Append and Map to", null, targetProperty_7);
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.connectorType == \"Rule-Connect-EJB\" || param.returnAll == \"\"");
try {
boolean pz_8 = ((tools.getParamValue("connectorType").equals("Rule-Connect-EJB")) || (tools.getParamValue("returnAll").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.connectorType == \"Rule-Connect-EJB\" || param.returnAll == \"\"",pz_8);
return pz_8;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.connectorType == \"Rule-Connect-EJB\" || param.returnAll == \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_8 = null;
ClipboardProperty pz_9 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_8 = pz_9;
/* entering new scope */
boolean pop_ctxt_page_8 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ctxt_page_8 = targetProperty_8.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_8.getString("pxObjClass"))) {
	ctxt_page_8.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_8);
actionProlog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_8);
if (appendAndMapTo_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_8);
} finally {
if (pop_ctxt_page_8) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =null;
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Set .pyClassName", source_1, target_3);
{
    String pzSourceVar10 = "";
    pzSourceVar10 = "Rule-Connect-EJB";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar10, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Set .pyClassName", source_1, target_3);
ClipboardPage source_2 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.2", "Set .pyLabel", source_2, target_4);
{
    String pzSourceVar13 = "";
    pzSourceVar13 = "EJB";
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar13, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.2", "Set .pyLabel", source_2, target_4);
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyClassName", source_3, target_5);
{
    String pzSourceVar16 = "";
    pzSourceVar16 = "Rule-Connect-HTTP";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar16, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyClassName", source_3, target_5);
ClipboardPage source_4 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_4, target_6);
{
    String pzSourceVar18 = "";
    pzSourceVar18 = "HTTP";
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar18, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_4, target_6);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyClassName", source_5, target_7);
{
    String pzSourceVar20 = "";
    pzSourceVar20 = "Rule-Connect-JCA";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar20, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyClassName", source_5, target_7);
ClipboardPage source_6 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_6, target_8);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = "JCA";
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar22, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_6, target_8);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyClassName", source_7, target_9);
{
    String pzSourceVar24 = "";
    pzSourceVar24 = "Rule-Connect-Java";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar24, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyClassName", source_7, target_9);
ClipboardPage source_8 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2", "Set .pyLabel", source_8, target_10);
{
    String pzSourceVar26 = "";
    pzSourceVar26 = "Java";
    PRStackFrame ctxt_frame_24 = null;
    try {
        ctxt_frame_24 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_24.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar26, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.2", "Set .pyLabel", source_8, target_10);
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pyClassName", source_9, target_11);
{
    String pzSourceVar28 = "";
    pzSourceVar28 = "Rule-Connect-REST";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar28, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pyClassName", source_9, target_11);
ClipboardPage source_10 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2", "Set .pyLabel", source_10, target_12);
{
    String pzSourceVar30 = "";
    pzSourceVar30 = "REST";
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar30, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2", "Set .pyLabel", source_10, target_12);
return CODE_CONTINUE;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1", "Set .pyClassName", source_11, target_13);
{
    String pzSourceVar32 = "";
    pzSourceVar32 = "Rule-Connect-SOAP";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar32, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1", "Set .pyClassName", source_11, target_13);
ClipboardPage source_12 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.2", "Set .pyLabel", source_12, target_14);
{
    String pzSourceVar34 = "";
    pzSourceVar34 = "SOAP";
    PRStackFrame ctxt_frame_32 = null;
    try {
        ctxt_frame_32 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_32.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar34, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.2", "Set .pyLabel", source_12, target_14);
return CODE_CONTINUE;
}private int appendAndMapTo_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1", "Set .pyClassName", source_13, target_15);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "Rule-Connect-dotNet";
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar36, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.1", "Set .pyClassName", source_13, target_15);
ClipboardPage source_14 =null;
ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.2", "Set .pyLabel", source_14, target_16);
{
    String pzSourceVar38 = "";
    pzSourceVar38 = "dotNet";
    PRStackFrame ctxt_frame_36 = null;
    try {
        ctxt_frame_36 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_36.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar38, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_36);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.2", "Set .pyLabel", source_14, target_16);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.connectorType == \"Rule-Connect-SQL\" || param.returnAll == \"\"");
try {
boolean pz_40 = ((tools.getParamValue("connectorType").equals("Rule-Connect-SQL")) || (tools.getParamValue("returnAll").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.connectorType == \"Rule-Connect-SQL\" || param.returnAll == \"\"",pz_40);
return pz_40;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.connectorType == \"Rule-Connect-SQL\" || param.returnAll == \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_9 = null;
ClipboardProperty pz_41 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_9 = pz_41;
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_9 = null;
ctxt_page_9 = targetProperty_9.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_9.getString("pxObjClass"))) {
	ctxt_page_9.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_9);
actionProlog(pz_CurrentTraceInfo,"8.1", "Append and Map to", null, targetProperty_9);
if (appendAndMapTo_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"8.1", "Append and Map to", null, targetProperty_9);
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =null;
ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1.1", "Set .pyClassName", source_15, target_17);
{
    String pzSourceVar42 = "";
    pzSourceVar42 = "Rule-Connect-SQL";
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar42, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1.1", "Set .pyClassName", source_15, target_17);
ClipboardPage source_16 =null;
ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1.2", "Set .pyLabel", source_16, target_18);
{
    String pzSourceVar44 = "";
    pzSourceVar44 = "SQL";
    PRStackFrame ctxt_frame_42 = null;
    try {
        ctxt_frame_42 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_42.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar44, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_42);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1.2", "Set .pyLabel", source_16, target_18);
return CODE_CONTINUE;
}private int appendAndMapTo_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =null;
ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1", "Set .pyClassName", source_17, target_19);
{
    String pzSourceVar46 = "";
    pzSourceVar46 = "Rule-Connect-SAP";
    PRStackFrame ctxt_frame_44 = null;
    try {
        ctxt_frame_44 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_44.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_11, myStepPage, pzSourceVar46, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_44);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1", "Set .pyClassName", source_17, target_19);
ClipboardPage source_18 =null;
ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.2", "Set .pyLabel", source_18, target_20);
{
    String pzSourceVar48 = "";
    pzSourceVar48 = "SAP";
    PRStackFrame ctxt_frame_46 = null;
    try {
        ctxt_frame_46 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_46.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_14, myStepPage, pzSourceVar48, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_46);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.2", "Set .pyLabel", source_18, target_20);
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
	"Rule-Obj-Model:PZLOADDSCONNECTORTYPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADDSCONNECTORTYPES","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-SystemArchitect","08-01-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDSCONNECTORTYPES #20180713T135727.815 GMT","!PZLOADDSCONNECTORTYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1281315187)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDSCONNECTORTYPES #20180713T135727.815 GMT:20180713T135727.815 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "16e2d9d04be9cabb600aa3baf1b0a9ba";
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

public static final String[] pRef_14 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyClassName", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDSCONNECTORTYPES #20180713T135727.815 GMT", "Code-Pega-List pzLoadDSConnectorTypes", "Pega-SystemArchitect", "08-01-01", "20180713T135727.815 GMT");
}
