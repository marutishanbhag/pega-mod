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
public class ra_model_pydefautuserdashboard_4951b6ce68206c5fc88dd305e1ee7910 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyDefautUserDashboard.System_User_Dashboard.Model");
	public ra_model_pydefautuserdashboard_4951b6ce68206c5fc88dd305e1ee7910(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20180713T134934.349 GMT	Pega-EndUserUI:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set .pyLabel", source_1, target_1);
{
    pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, "Default dashboard", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set .pyLabel", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2", "Set .pyTemplateLabel", source_2, target_2);
{
    pega.setViaPropRef(".pyTemplateLabel", pRef_2, myStepPage, "Right column", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set .pyTemplateLabel", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pyTemplateIcon", source_3, target_3);
{
    pega.setViaPropRef(".pyTemplateIcon", pRef_3, myStepPage, "webwb/pyUserDashboardTemplateRightColumn.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pyTemplateIcon", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pySectionName", source_4, target_4);
{
    pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, "pyUserDashboardTemplateRightColumn", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pySectionName", source_4, target_4);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5", "Set .pyOwnerType", source_5, target_5);
{
    pega.setViaPropRef(".pyOwnerType", pRef_5, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5", "Set .pyOwnerType", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6", "Set .pyOwner", source_6, target_6);
{
    pega.setViaPropRef(".pyOwner", pRef_6, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6", "Set .pyOwner", source_6, target_6);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7", "Set .pyCategory", source_7, target_7);
{
    pega.setViaPropRef(".pyCategory", pRef_7, myStepPage, tools.getParamValue("UserDashboardCategory"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"7", "Set .pyCategory", source_7, target_7);
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_8 = myStepPage.getProperty("pySlots");
targetProperty_1 = pz_8;
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_1);
actionProlog(pz_CurrentTraceInfo,"8", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"8", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_9 = myStepPage.getProperty("pySlots");
targetProperty_2 = pz_9;
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_2);
actionProlog(pz_CurrentTraceInfo,"9", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"9", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_10 = myStepPage.getProperty("pySlots");
targetProperty_3 = pz_10;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"10", "Append and Map to", null, targetProperty_3);
if (appendAndMapTo_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"10", "Append and Map to", null, targetProperty_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_11 = myStepPage.getProperty("pySlots");
targetProperty_4 = pz_11;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"11", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"11", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_12 = myStepPage.getProperty("pySlots");
targetProperty_5 = pz_12;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ctxt_page_5 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_5);
actionProlog(pz_CurrentTraceInfo,"12", "Append and Map to", null, targetProperty_5);
if (appendAndMapTo_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"12", "Append and Map to", null, targetProperty_5);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_6 = null;
ClipboardProperty pz_13 = myStepPage.getProperty("pySlots");
targetProperty_6 = pz_13;
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ctxt_page_6 = targetProperty_6.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_6);
actionProlog(pz_CurrentTraceInfo,"13", "Append and Map to", null, targetProperty_6);
if (appendAndMapTo_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"13", "Append and Map to", null, targetProperty_6);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_7 = null;
ClipboardProperty pz_14 = myStepPage.getProperty("pySlots");
targetProperty_7 = pz_14;
/* entering new scope */
boolean pop_ctxt_page_7 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_7 = null;
ctxt_page_7 = targetProperty_7.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_7);
actionProlog(pz_CurrentTraceInfo,"14", "Append and Map to", null, targetProperty_7);
if (appendAndMapTo_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"14", "Append and Map to", null, targetProperty_7);
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_8 = null;
ClipboardProperty pz_15 = myStepPage.getProperty("pySlots");
targetProperty_8 = pz_15;
/* entering new scope */
boolean pop_ctxt_page_8 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ctxt_page_8 = targetProperty_8.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_8);
actionProlog(pz_CurrentTraceInfo,"15", "Append and Map to", null, targetProperty_8);
if (appendAndMapTo_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"15", "Append and Map to", null, targetProperty_8);
} finally {
if (pop_ctxt_page_8) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_9 = null;
ClipboardProperty pz_16 = myStepPage.getProperty("pySlots");
targetProperty_9 = pz_16;
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_9 = null;
ctxt_page_9 = targetProperty_9.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_9);
actionProlog(pz_CurrentTraceInfo,"16", "Append and Map to", null, targetProperty_9);
if (appendAndMapTo_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"16", "Append and Map to", null, targetProperty_9);
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_10 = null;
ClipboardProperty pz_17 = myStepPage.getProperty("pySlots");
targetProperty_10 = pz_17;
/* entering new scope */
boolean pop_ctxt_page_10 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_10 = null;
ctxt_page_10 = targetProperty_10.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_10 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_10);
actionProlog(pz_CurrentTraceInfo,"17", "Append and Map to", null, targetProperty_10);
if (appendAndMapTo_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"17", "Append and Map to", null, targetProperty_10);
} finally {
if (pop_ctxt_page_10) {
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

private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1", "Set .pyLabel", source_8, target_8);
{
    String pzSourceVar18 = "";
    pzSourceVar18 = "Slot 1";
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar18, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1", "Set .pyLabel", source_8, target_8);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1", "Set .pyLabel", source_9, target_9);
{
    String pzSourceVar20 = "";
    pzSourceVar20 = "Slot 2";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar20, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1", "Set .pyLabel", source_9, target_9);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1", "Set .pyLabel", source_10, target_10);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = "Slot 3";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar22, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1", "Set .pyLabel", source_10, target_10);
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1", "Set .pyLabel", source_11, target_11);
{
    String pzSourceVar24 = "";
    pzSourceVar24 = "Slot 4";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar24, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1", "Set .pyLabel", source_11, target_11);
return CODE_CONTINUE;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.1", "Set .pyLabel", source_12, target_12);
{
    String pzSourceVar26 = "";
    pzSourceVar26 = "Slot 5";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar26, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"12.1", "Set .pyLabel", source_12, target_12);
return CODE_CONTINUE;
}private int appendAndMapTo_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1", "Set .pyLabel", source_13, target_13);
{
    String pzSourceVar28 = "";
    pzSourceVar28 = "Slot 6";
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar28, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.1", "Set .pyLabel", source_13, target_13);
return CODE_CONTINUE;
}private int appendAndMapTo_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14.1", "Set .pyLabel", source_14, target_14);
{
    String pzSourceVar30 = "";
    pzSourceVar30 = "Slot 7";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar30, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"14.1", "Set .pyLabel", source_14, target_14);
return CODE_CONTINUE;
}private int appendAndMapTo_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15.1", "Set .pyLabel", source_15, target_15);
{
    String pzSourceVar32 = "";
    pzSourceVar32 = "Slot 8";
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar32, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"15.1", "Set .pyLabel", source_15, target_15);
return CODE_CONTINUE;
}private int appendAndMapTo_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_16 =null;
ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16.1", "Set .pyLabel", source_16, target_16);
{
    String pzSourceVar34 = "";
    pzSourceVar34 = "Slot 9";
    PRStackFrame ctxt_frame_27 = null;
    try {
        ctxt_frame_27 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_27.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar34, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
    }
}

actionEpilog(pz_CurrentTraceInfo,"16.1", "Set .pyLabel", source_16, target_16);
return CODE_CONTINUE;
}private int appendAndMapTo_10(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =null;
ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17.1", "Set .pyLabel", source_17, target_17);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "Slot 10";
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar36, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"17.1", "Set .pyLabel", source_17, target_17);
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
	"Rule-Obj-Model:PYDEFAUTUSERDASHBOARD"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYDEFAUTUSERDASHBOARD","Rule-Obj-Model","SYSTEM-USER-DASHBOARD",false,"","Pega-EndUserUI","08-01-01","RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20180713T134934.349 GMT","!PYDEFAUTUSERDASHBOARD",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1667568763)
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
//	RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20180713T134934.349 GMT:20180713T134934.349 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5ef4a80a77a9e4860d906a20a7c707c8";
	}

	public String getDefinitionAppliesToClass() {
		return "System-User-Dashboard";
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

public static final String[] pRef_7 = new String[] { "", "", "pyCategory", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_4 = new String[] { "", "", "pySectionName", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyTemplateLabel", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyTemplateIcon", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyOwnerType", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20180713T134934.349 GMT", "System-User-Dashboard pyDefautUserDashboard", "Pega-EndUserUI", "08-01-01", "20180713T134934.349 GMT");
}
