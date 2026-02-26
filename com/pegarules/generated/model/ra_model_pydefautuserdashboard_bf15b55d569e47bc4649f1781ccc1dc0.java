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
public class ra_model_pydefautuserdashboard_bf15b55d569e47bc4649f1781ccc1dc0 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyDefautUserDashboard.System_User_Dashboard.Model");
	public ra_model_pydefautuserdashboard_bf15b55d569e47bc4649f1781ccc1dc0(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20210506T204032.614 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
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
    pega.setViaPropRef(".pyTemplateLabel", pRef_2, myStepPage, "Two column", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set .pyTemplateLabel", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pyTemplateIcon", source_3, target_3);
{
    pega.setViaPropRef(".pyTemplateIcon", pRef_3, myStepPage, "webwb/pyUserDashboardTemplateTwoColumn.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pyTemplateIcon", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pySectionName", source_4, target_4);
{
    pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, "pyUserDashboardTemplateTwoColumn", "sTN", false, true);
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
/* entering new scope */
boolean pop_ctxt_page_11 = false;
try {
/* push '".pySlots(1).pyWidgets(1)"' to scope TARGET */
ClipboardPage ctxt_page_11 = null;
ClipboardProperty pz_20 = propertyQuery_18.resolve(tools, myStepPage);
ctxt_page_11 = pz_20 == null ? null : pz_20.getPageValue();
pop_ctxt_page_11 = pega.pushScopedStepContext("TARGET", ".pySlots(1).pyWidgets(1)", ctxt_page_11);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"18", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"18", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_11) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_12 = false;
try {
/* push '".pySlots(1).pyWidgets(2)"' to scope TARGET */
ClipboardPage ctxt_page_12 = null;
ClipboardProperty pz_24 = propertyQuery_22.resolve(tools, myStepPage);
ctxt_page_12 = pz_24 == null ? null : pz_24.getPageValue();
pop_ctxt_page_12 = pega.pushScopedStepContext("TARGET", ".pySlots(1).pyWidgets(2)", ctxt_page_12);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"19", "Update Page", null, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"19", "Update Page", null, target_context_2);
} finally {
if (pop_ctxt_page_12) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_13 = false;
try {
/* push '".pySlots(2).pyWidgets(1)"' to scope TARGET */
ClipboardPage ctxt_page_13 = null;
ClipboardProperty pz_28 = propertyQuery_26.resolve(tools, myStepPage);
ctxt_page_13 = pz_28 == null ? null : pz_28.getPageValue();
pop_ctxt_page_13 = pega.pushScopedStepContext("TARGET", ".pySlots(2).pyWidgets(1)", ctxt_page_13);
ClipboardPage target_context_3 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"20", "Update Page", null, target_context_3);
if (updatePage_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"20", "Update Page", null, target_context_3);
} finally {
if (pop_ctxt_page_13) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_14 = false;
try {
/* push '".pySlots(2).pyWidgets(2)"' to scope TARGET */
ClipboardPage ctxt_page_14 = null;
ClipboardProperty pz_32 = propertyQuery_30.resolve(tools, myStepPage);
ctxt_page_14 = pz_32 == null ? null : pz_32.getPageValue();
pop_ctxt_page_14 = pega.pushScopedStepContext("TARGET", ".pySlots(2).pyWidgets(2)", ctxt_page_14);
ClipboardPage target_context_4 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"21", "Update Page", null, target_context_4);
if (updatePage_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"21", "Update Page", null, target_context_4);
} finally {
if (pop_ctxt_page_14) {
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
    String pzSourceVar34 = "";
    pzSourceVar34 = "Slot 1";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar34, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1", "Set .pyLabel", source_8, target_8);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1", "Set .pyLabel", source_9, target_9);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "Slot 2";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar36, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1", "Set .pyLabel", source_9, target_9);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1", "Set .pyLabel", source_10, target_10);
{
    String pzSourceVar38 = "";
    pzSourceVar38 = "Slot 3";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar38, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1", "Set .pyLabel", source_10, target_10);
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1", "Set .pyLabel", source_11, target_11);
{
    String pzSourceVar40 = "";
    pzSourceVar40 = "Slot 4";
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar40, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1", "Set .pyLabel", source_11, target_11);
return CODE_CONTINUE;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.1", "Set .pyLabel", source_12, target_12);
{
    String pzSourceVar42 = "";
    pzSourceVar42 = "Slot 5";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar42, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"12.1", "Set .pyLabel", source_12, target_12);
return CODE_CONTINUE;
}private int appendAndMapTo_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1", "Set .pyLabel", source_13, target_13);
{
    String pzSourceVar44 = "";
    pzSourceVar44 = "Slot 6";
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar44, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.1", "Set .pyLabel", source_13, target_13);
return CODE_CONTINUE;
}private int appendAndMapTo_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14.1", "Set .pyLabel", source_14, target_14);
{
    String pzSourceVar46 = "";
    pzSourceVar46 = "Slot 7";
    PRStackFrame ctxt_frame_27 = null;
    try {
        ctxt_frame_27 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_27.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar46, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
    }
}

actionEpilog(pz_CurrentTraceInfo,"14.1", "Set .pyLabel", source_14, target_14);
return CODE_CONTINUE;
}private int appendAndMapTo_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15.1", "Set .pyLabel", source_15, target_15);
{
    String pzSourceVar48 = "";
    pzSourceVar48 = "Slot 8";
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar48, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"15.1", "Set .pyLabel", source_15, target_15);
return CODE_CONTINUE;
}private int appendAndMapTo_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_16 =null;
ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16.1", "Set .pyLabel", source_16, target_16);
{
    String pzSourceVar50 = "";
    pzSourceVar50 = "Slot 9";
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar50, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
}

actionEpilog(pz_CurrentTraceInfo,"16.1", "Set .pyLabel", source_16, target_16);
return CODE_CONTINUE;
}private int appendAndMapTo_10(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =null;
ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17.1", "Set .pyLabel", source_17, target_17);
{
    String pzSourceVar52 = "";
    pzSourceVar52 = "Slot 10";
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar52, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"17.1", "Set .pyLabel", source_17, target_17);
return CODE_CONTINUE;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.1", "Set .pySectionName", source_18, target_18);
{
    String pzSourceVar54 = "";
    pzSourceVar54 = "pyCasesEnteredByMe";
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, pzSourceVar54, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.1", "Set .pySectionName", source_18, target_18);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.2", "Set .pyClassName", source_19, target_19);
{
    String pzSourceVar56 = "";
    pzSourceVar56 = "Work-";
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_57, myStepPage, pzSourceVar56, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.2", "Set .pyClassName", source_19, target_19);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.3", "Set .pyWidgetOptionsSectionName", source_20, target_20);
{
    String pzSourceVar59 = "";
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyWidgetOptionsSectionName", pRef_60, myStepPage, pzSourceVar59, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.3", "Set .pyWidgetOptionsSectionName", source_20, target_20);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.4", "Set .pyLabel", source_21, target_21);
{
    String pzSourceVar61 = "";
    pzSourceVar61 = "Cases entered by me";
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar61, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.4", "Set .pyLabel", source_21, target_21);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.5", "Set .pyDescription", source_22, target_22);
{
    String pzSourceVar63 = "";
    pzSourceVar63 = "Cases entered by me";
    PRStackFrame ctxt_frame_43 = null;
    try {
        ctxt_frame_43 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_43.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_64, myStepPage, pzSourceVar63, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_43);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.5", "Set .pyDescription", source_22, target_22);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.6", "Set .pySelected", source_23, target_23);
{
    boolean pzSourceVar66 = false;
    pzSourceVar66 = false;
    PRStackFrame ctxt_frame_45 = null;
    try {
        ctxt_frame_45 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_45.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_67, myStepPage, pzSourceVar66, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.6", "Set .pySelected", source_23, target_23);
/* entering new scope */
boolean pop_ctxt_page_15 = false;
try {
/* push '".pyWidget"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_48 = null;
try {
ctxt_frame_48 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_48.getStepPage();
ClipboardPage ctxt_page_15 = null;
ClipboardProperty pz_70 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_47 = null;
try {
ctxt_frame_47 = pega.pushStackFrame(".pyWidget", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_47.getStepPage();
pz_70 = propertyQuery_69.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
} // return to previous step page

ctxt_page_15 = pz_70 == null ? null : pz_70.getPageValue();
pop_ctxt_page_15 = pega.pushScopedStepContext("TARGET", ".pyWidget", ctxt_page_15);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_48);
} // return to previous step page
ClipboardPage target_context_5 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"18.7", "Update Page", null, target_context_5);
if (updatePage_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"18.7", "Update Page", null, target_context_5);
} finally {
if (pop_ctxt_page_15) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.7.1", "Set .pxObjClass", source_24, target_24);
// Change obj class
String pz_74 = "Work-";
ClipboardPage tempPage_1 = tools.createPage(pz_74, "");
ClipboardProperty pz_73 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_49 = null;
try {
ctxt_frame_49 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_49.getStepPage();
pz_73 = propertyQuery_72.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_49);
} // return to previous step page

ClipboardPage targetPage_1 = pz_73.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"18.7.1", "Set .pxObjClass", source_24, target_24);
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.1", "Set .pySectionName", source_25, target_25);
{
    String pzSourceVar75 = "";
    pzSourceVar75 = "pyCaseStatusWidget";
    PRStackFrame ctxt_frame_50 = null;
    try {
        ctxt_frame_50 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_50.getStepPage();
        pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, pzSourceVar75, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_50);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.1", "Set .pySectionName", source_25, target_25);
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.2", "Set .pyClassName", source_26, target_26);
{
    String pzSourceVar77 = "";
    pzSourceVar77 = "Data-Portal";
    PRStackFrame ctxt_frame_52 = null;
    try {
        ctxt_frame_52 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_52.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_57, myStepPage, pzSourceVar77, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_52);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.2", "Set .pyClassName", source_26, target_26);
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.3", "Set .pyWidgetOptionsSectionName", source_27, target_27);
{
    String pzSourceVar79 = "";
    PRStackFrame ctxt_frame_54 = null;
    try {
        ctxt_frame_54 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_54.getStepPage();
        pega.setViaPropRef(".pyWidgetOptionsSectionName", pRef_60, myStepPage, pzSourceVar79, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_54);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.3", "Set .pyWidgetOptionsSectionName", source_27, target_27);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.4", "Set .pyLabel", source_28, target_28);
{
    String pzSourceVar80 = "";
    pzSourceVar80 = "Case status";
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar80, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.4", "Set .pyLabel", source_28, target_28);
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.5", "Set .pyDescription", source_29, target_29);
{
    String pzSourceVar82 = "";
    pzSourceVar82 = "Case status";
    PRStackFrame ctxt_frame_58 = null;
    try {
        ctxt_frame_58 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_58.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_64, myStepPage, pzSourceVar82, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_58);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.5", "Set .pyDescription", source_29, target_29);
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.6", "Set .pySelected", source_30, target_30);
{
    boolean pzSourceVar84 = false;
    pzSourceVar84 = false;
    PRStackFrame ctxt_frame_60 = null;
    try {
        ctxt_frame_60 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_60.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_67, myStepPage, pzSourceVar84, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.6", "Set .pySelected", source_30, target_30);
/* entering new scope */
boolean pop_ctxt_page_16 = false;
try {
/* push '".pyWidget"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_63 = null;
try {
ctxt_frame_63 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_63.getStepPage();
ClipboardPage ctxt_page_16 = null;
ClipboardProperty pz_86 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_62 = null;
try {
ctxt_frame_62 = pega.pushStackFrame(".pyWidget", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_62.getStepPage();
pz_86 = propertyQuery_69.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_62);
} // return to previous step page

ctxt_page_16 = pz_86 == null ? null : pz_86.getPageValue();
pop_ctxt_page_16 = pega.pushScopedStepContext("TARGET", ".pyWidget", ctxt_page_16);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
} // return to previous step page
ClipboardPage target_context_6 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"19.7", "Update Page", null, target_context_6);
if (updatePage_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"19.7", "Update Page", null, target_context_6);
} finally {
if (pop_ctxt_page_16) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.7.1", "Set .pxObjClass", source_31, target_31);
// Change obj class
String pz_89 = "Data-Portal";
ClipboardPage tempPage_2 = tools.createPage(pz_89, "");
ClipboardProperty pz_88 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_64 = null;
try {
ctxt_frame_64 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_64.getStepPage();
pz_88 = propertyQuery_72.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_64);
} // return to previous step page

ClipboardPage targetPage_2 = pz_88.getParentPage();
targetPage_2.putAll(tempPage_2, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_2, false);
actionEpilog(pz_CurrentTraceInfo,"19.7.1", "Set .pxObjClass", source_31, target_31);
return CODE_CONTINUE;
}private int updatePage_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.1", "Set .pySectionName", source_32, target_32);
{
    String pzSourceVar90 = "";
    pzSourceVar90 = "pyTeamsWidget";
    PRStackFrame ctxt_frame_65 = null;
    try {
        ctxt_frame_65 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_65.getStepPage();
        pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, pzSourceVar90, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.1", "Set .pySectionName", source_32, target_32);
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.2", "Set .pyClassName", source_33, target_33);
{
    String pzSourceVar92 = "";
    pzSourceVar92 = "Data-Admin-WorkGroup";
    PRStackFrame ctxt_frame_67 = null;
    try {
        ctxt_frame_67 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_67.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_57, myStepPage, pzSourceVar92, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_67);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.2", "Set .pyClassName", source_33, target_33);
ClipboardPage source_34 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.3", "Set .pyWidgetOptionsSectionName", source_34, target_34);
{
    String pzSourceVar94 = "";
    PRStackFrame ctxt_frame_69 = null;
    try {
        ctxt_frame_69 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_69.getStepPage();
        pega.setViaPropRef(".pyWidgetOptionsSectionName", pRef_60, myStepPage, pzSourceVar94, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_69);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.3", "Set .pyWidgetOptionsSectionName", source_34, target_34);
ClipboardPage source_35 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.4", "Set .pyLabel", source_35, target_35);
{
    String pzSourceVar95 = "";
    pzSourceVar95 = "Teams";
    PRStackFrame ctxt_frame_71 = null;
    try {
        ctxt_frame_71 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_71.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar95, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_71);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.4", "Set .pyLabel", source_35, target_35);
ClipboardPage source_36 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.5", "Set .pyDescription", source_36, target_36);
{
    String pzSourceVar97 = "";
    pzSourceVar97 = "Teams";
    PRStackFrame ctxt_frame_73 = null;
    try {
        ctxt_frame_73 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_73.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_64, myStepPage, pzSourceVar97, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_73);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.5", "Set .pyDescription", source_36, target_36);
ClipboardPage source_37 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.6", "Set .pySelected", source_37, target_37);
{
    boolean pzSourceVar99 = false;
    pzSourceVar99 = false;
    PRStackFrame ctxt_frame_75 = null;
    try {
        ctxt_frame_75 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_75.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_67, myStepPage, pzSourceVar99, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_75);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.6", "Set .pySelected", source_37, target_37);
/* entering new scope */
boolean pop_ctxt_page_17 = false;
try {
/* push '".pyWidget"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_78 = null;
try {
ctxt_frame_78 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_78.getStepPage();
ClipboardPage ctxt_page_17 = null;
ClipboardProperty pz_101 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_77 = null;
try {
ctxt_frame_77 = pega.pushStackFrame(".pyWidget", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_77.getStepPage();
pz_101 = propertyQuery_69.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_77);
} // return to previous step page

ctxt_page_17 = pz_101 == null ? null : pz_101.getPageValue();
pop_ctxt_page_17 = pega.pushScopedStepContext("TARGET", ".pyWidget", ctxt_page_17);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_78);
} // return to previous step page
ClipboardPage target_context_7 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"20.7", "Update Page", null, target_context_7);
if (updatePage_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"20.7", "Update Page", null, target_context_7);
} finally {
if (pop_ctxt_page_17) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_38 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.7.1", "Set .pxObjClass", source_38, target_38);
// Change obj class
String pz_104 = "Data-Admin-WorkGroup";
ClipboardPage tempPage_3 = tools.createPage(pz_104, "");
ClipboardProperty pz_103 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_79 = null;
try {
ctxt_frame_79 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_79.getStepPage();
pz_103 = propertyQuery_72.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_79);
} // return to previous step page

ClipboardPage targetPage_3 = pz_103.getParentPage();
targetPage_3.putAll(tempPage_3, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_3, false);
actionEpilog(pz_CurrentTraceInfo,"20.7.1", "Set .pxObjClass", source_38, target_38);
return CODE_CONTINUE;
}private int updatePage_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_39 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.1", "Set .pySectionName", source_39, target_39);
{
    String pzSourceVar105 = "";
    pzSourceVar105 = "pxReportWidget";
    PRStackFrame ctxt_frame_80 = null;
    try {
        ctxt_frame_80 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_80.getStepPage();
        pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, pzSourceVar105, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_80);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.1", "Set .pySectionName", source_39, target_39);
ClipboardPage source_40 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.2", "Set .pyClassName", source_40, target_40);
{
    String pzSourceVar107 = "";
    pzSourceVar107 = "@baseclass";
    PRStackFrame ctxt_frame_82 = null;
    try {
        ctxt_frame_82 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_82.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_57, myStepPage, pzSourceVar107, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_82);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.2", "Set .pyClassName", source_40, target_40);
ClipboardPage source_41 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.3", "Set .pyWidgetOptionsSectionName", source_41, target_41);
{
    String pzSourceVar109 = "";
    PRStackFrame ctxt_frame_84 = null;
    try {
        ctxt_frame_84 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_84.getStepPage();
        pega.setViaPropRef(".pyWidgetOptionsSectionName", pRef_60, myStepPage, pzSourceVar109, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_84);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.3", "Set .pyWidgetOptionsSectionName", source_41, target_41);
ClipboardPage source_42 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.4", "Set .pyLabel", source_42, target_42);
{
    String pzSourceVar110 = "";
    pzSourceVar110 = "Report widget";
    PRStackFrame ctxt_frame_86 = null;
    try {
        ctxt_frame_86 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_86.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar110, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_86);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.4", "Set .pyLabel", source_42, target_42);
ClipboardPage source_43 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_43 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.5", "Set .pyDescription", source_43, target_43);
{
    String pzSourceVar112 = "";
    pzSourceVar112 = "Report widget";
    PRStackFrame ctxt_frame_88 = null;
    try {
        ctxt_frame_88 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_88.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_64, myStepPage, pzSourceVar112, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_88);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.5", "Set .pyDescription", source_43, target_43);
ClipboardPage source_44 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_44 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.6", "Set .pySelected", source_44, target_44);
{
    boolean pzSourceVar114 = false;
    pzSourceVar114 = false;
    PRStackFrame ctxt_frame_90 = null;
    try {
        ctxt_frame_90 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_90.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_67, myStepPage, pzSourceVar114, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_90);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.6", "Set .pySelected", source_44, target_44);
/* entering new scope */
boolean pop_ctxt_page_18 = false;
try {
/* push '".pyWidget"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_93 = null;
try {
ctxt_frame_93 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_93.getStepPage();
ClipboardPage ctxt_page_18 = null;
ClipboardProperty pz_116 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_92 = null;
try {
ctxt_frame_92 = pega.pushStackFrame(".pyWidget", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_92.getStepPage();
pz_116 = propertyQuery_69.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_92);
} // return to previous step page

ctxt_page_18 = pz_116 == null ? null : pz_116.getPageValue();
pop_ctxt_page_18 = pega.pushScopedStepContext("TARGET", ".pyWidget", ctxt_page_18);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_93);
} // return to previous step page
ClipboardPage target_context_8 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"21.7", "Update Page", null, target_context_8);
if (updatePage_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"21.7", "Update Page", null, target_context_8);
} finally {
if (pop_ctxt_page_18) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_45 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_45 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.1", "Set .pxObjClass", source_45, target_45);
// Change obj class
String pz_119 = "@baseclass";
ClipboardPage tempPage_4 = tools.createPage(pz_119, "");
ClipboardProperty pz_118 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_94 = null;
try {
ctxt_frame_94 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_94.getStepPage();
pz_118 = propertyQuery_72.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_94);
} // return to previous step page

ClipboardPage targetPage_4 = pz_118.getParentPage();
targetPage_4.putAll(tempPage_4, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_4, false);
actionEpilog(pz_CurrentTraceInfo,"21.7.1", "Set .pxObjClass", source_45, target_45);
ClipboardPage source_46 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_46 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.2", "Set .pxUserDashboardWidgetOptions.pyOwnerType", source_46, target_46);
{
    String pzSourceVar120 = "";
    pzSourceVar120 = "S";
    PRStackFrame ctxt_frame_95 = null;
    try {
        ctxt_frame_95 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_95.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyOwnerType", pRef_121, myStepPage, pzSourceVar120, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_95);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.2", "Set .pxUserDashboardWidgetOptions.pyOwnerType", source_46, target_46);
ClipboardPage source_47 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_47 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.3", "Set .pxUserDashboardWidgetOptions.pySelectedShortcutInsName", source_47, target_47);
{
    String pzSourceVar123 = "";
    pzSourceVar123 = "PYCASEMETRICS!S!ALL!PYCASEVOLUME";
    PRStackFrame ctxt_frame_97 = null;
    try {
        ctxt_frame_97 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_97.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pySelectedShortcutInsName", pRef_124, myStepPage, pzSourceVar123, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_97);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.3", "Set .pxUserDashboardWidgetOptions.pySelectedShortcutInsName", source_47, target_47);
ClipboardPage source_48 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_48 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.4", "Set .pxUserDashboardWidgetOptions.pyTitle", source_48, target_48);
{
    String pzSourceVar126 = "";
    pzSourceVar126 = "Case Volume";
    PRStackFrame ctxt_frame_99 = null;
    try {
        ctxt_frame_99 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_99.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyTitle", pRef_127, myStepPage, pzSourceVar126, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_99);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.4", "Set .pxUserDashboardWidgetOptions.pyTitle", source_48, target_48);
ClipboardPage source_49 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_49 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.5", "Set .pxUserDashboardWidgetOptions. pyOwner", source_49, target_49);
{
    String pzSourceVar129 = "";
    pzSourceVar129 = "ALL";
    PRStackFrame ctxt_frame_101 = null;
    try {
        ctxt_frame_101 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_101.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyOwner", pRef_130, myStepPage, pzSourceVar129, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_101);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.5", "Set .pxUserDashboardWidgetOptions. pyOwner", source_49, target_49);
ClipboardPage source_50 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_50 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.6", "Set .pxUserDashboardWidgetOptions. pySelectedCategoryInsName", source_50, target_50);
{
    String pzSourceVar132 = "";
    pzSourceVar132 = "PYCASEMETRICS!S!ALL";
    PRStackFrame ctxt_frame_103 = null;
    try {
        ctxt_frame_103 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_103.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pySelectedCategoryInsName", pRef_133, myStepPage, pzSourceVar132, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_103);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.6", "Set .pxUserDashboardWidgetOptions. pySelectedCategoryInsName", source_50, target_50);
ClipboardPage source_51 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_51 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.7", "Set .pxUserDashboardWidgetOptions.pyCategoryName", source_51, target_51);
{
    String pzSourceVar135 = "";
    pzSourceVar135 = "pyCaseMetrics";
    PRStackFrame ctxt_frame_105 = null;
    try {
        ctxt_frame_105 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_105.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyCategoryName", pRef_136, myStepPage, pzSourceVar135, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_105);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.7", "Set .pxUserDashboardWidgetOptions.pyCategoryName", source_51, target_51);
ClipboardPage source_52 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_52 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.8", "Set .pxUserDashboardWidgetOptions.pyCategory", source_52, target_52);
{
    String pzSourceVar138 = "";
    pzSourceVar138 = "c";
    PRStackFrame ctxt_frame_107 = null;
    try {
        ctxt_frame_107 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_107.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyCategory", pRef_139, myStepPage, pzSourceVar138, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_107);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.8", "Set .pxUserDashboardWidgetOptions.pyCategory", source_52, target_52);
ClipboardPage source_53 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_53 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.9", "Set .pxUserDashboardWidgetOptions.pzIncludeCharts", source_53, target_53);
{
    String pzSourceVar141 = "";
    pzSourceVar141 = "c";
    PRStackFrame ctxt_frame_109 = null;
    try {
        ctxt_frame_109 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_109.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pzIncludeCharts", pRef_142, myStepPage, pzSourceVar141, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_109);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.9", "Set .pxUserDashboardWidgetOptions.pzIncludeCharts", source_53, target_53);
ClipboardPage source_54 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_54 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.10", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyWidth", source_54, target_54);
{
    String pzSourceVar144 = "";
    pzSourceVar144 = "100";
    PRStackFrame ctxt_frame_111 = null;
    try {
        ctxt_frame_111 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_111.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyChartConfiguration.pyWidth", pRef_145, myStepPage, pzSourceVar144, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_111);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.10", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyWidth", source_54, target_54);
ClipboardPage source_55 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_55 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.11", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyWidthUnits", source_55, target_55);
{
    String pzSourceVar147 = "";
    pzSourceVar147 = "%";
    PRStackFrame ctxt_frame_113 = null;
    try {
        ctxt_frame_113 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_113.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyChartConfiguration.pyWidthUnits", pRef_148, myStepPage, pzSourceVar147, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_113);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.11", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyWidthUnits", source_55, target_55);
ClipboardPage source_56 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_56 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.12", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyHeight", source_56, target_56);
{
    String pzSourceVar150 = "";
    pzSourceVar150 = "400";
    PRStackFrame ctxt_frame_115 = null;
    try {
        ctxt_frame_115 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_115.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyChartConfiguration.pyHeight", pRef_151, myStepPage, pzSourceVar150, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_115);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.12", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyHeight", source_56, target_56);
ClipboardPage source_57 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_57 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.13", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyHeightUnits", source_57, target_57);
{
    String pzSourceVar153 = "";
    pzSourceVar153 = "px";
    PRStackFrame ctxt_frame_117 = null;
    try {
        ctxt_frame_117 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_117.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyChartConfiguration.pyHeightUnits", pRef_154, myStepPage, pzSourceVar153, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_117);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.13", "Set .pxUserDashboardWidgetOptions.pyChartConfiguration.pyHeightUnits", source_57, target_57);
ClipboardPage source_58 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_58 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.14", "Set .pxUserDashboardWidgetOptions.pyTextValue(1)", source_58, target_58);
{
    String pzSourceVar156 = "";
    pzSourceVar156 = "pyCaseMetrics";
    PRStackFrame ctxt_frame_119 = null;
    try {
        ctxt_frame_119 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_119.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyTextValue(1)", pRef_157, myStepPage, pzSourceVar156, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_119);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.14", "Set .pxUserDashboardWidgetOptions.pyTextValue(1)", source_58, target_58);
ClipboardPage source_59 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_59 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.15", "Set .pxUserDashboardWidgetOptions.pyTextValue(2)", source_59, target_59);
{
    String pzSourceVar159 = "";
    pzSourceVar159 = "ALL";
    PRStackFrame ctxt_frame_121 = null;
    try {
        ctxt_frame_121 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_121.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyTextValue(2)", pRef_160, myStepPage, pzSourceVar159, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_121);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.15", "Set .pxUserDashboardWidgetOptions.pyTextValue(2)", source_59, target_59);
ClipboardPage source_60 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_60 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.16", "Set .pxUserDashboardWidgetOptions.pyTextValue(3)", source_60, target_60);
{
    String pzSourceVar162 = "";
    pzSourceVar162 = "S";
    PRStackFrame ctxt_frame_123 = null;
    try {
        ctxt_frame_123 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_123.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyTextValue(3)", pRef_163, myStepPage, pzSourceVar162, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_123);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.16", "Set .pxUserDashboardWidgetOptions.pyTextValue(3)", source_60, target_60);
ClipboardPage source_61 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_61 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.7.17", "Set .pxUserDashboardWidgetOptions.pyTextValue(4)", source_61, target_61);
{
    String pzSourceVar165 = "";
    pzSourceVar165 = "pyCaseVolume";
    PRStackFrame ctxt_frame_125 = null;
    try {
        ctxt_frame_125 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_125.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pyTextValue(4)", pRef_166, myStepPage, pzSourceVar165, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_125);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.7.17", "Set .pxUserDashboardWidgetOptions.pyTextValue(4)", source_61, target_61);
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
		new DependentRuleInfo("PYDEFAUTUSERDASHBOARD","Rule-Obj-Model","SYSTEM-USER-DASHBOARD",false,"","Theme-Cosmos","04-01-01","RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20210506T204032.614 GMT","!PYDEFAUTUSERDASHBOARD",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2037721658)
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
//	RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20210506T204032.614 GMT:20210506T204032.614 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "99b1241ea2540ca282a5f5714005371b";
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

public static final String[] pRef_27 = new String[] { "", "", "pySlots", "2", "pyWidgets", "1" };
public static final String[] pRef_7 = new String[] { "", "", "pyCategory", "" };
public static final String[] pRef_67 = new String[] { "", "", "pySelected", "" };
public static final String[] pRef_121 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyOwnerType", "" };
public static final String[] pRef_154 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyChartConfiguration", "", "pyHeightUnits", "" };
public static final String[] pRef_145 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyChartConfiguration", "", "pyWidth", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyOwnerType", "" };
public static final String[] pRef_133 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pySelectedCategoryInsName", "" };
public static final String[] pRef_148 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyChartConfiguration", "", "pyWidthUnits", "" };
public static final String[] pRef_64 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_157 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyTextValue", "1" };
public static final String[] pRef_124 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pySelectedShortcutInsName", "" };
public static final String[] pRef_163 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyTextValue", "3" };
public static final String[] pRef_23 = new String[] { "", "", "pySlots", "1", "pyWidgets", "2" };
public static final String[] pRef_31 = new String[] { "", "", "pySlots", "2", "pyWidgets", "2" };
public static final String[] pRef_136 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyCategoryName", "" };
public static final String[] pRef_57 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_4 = new String[] { "", "", "pySectionName", "" };
public static final String[] pRef_130 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyOwner", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_139 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyCategory", "" };
public static final String[] pRef_151 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyChartConfiguration", "", "pyHeight", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_60 = new String[] { "", "", "pyWidgetOptionsSectionName", "" };
public static final String[] pRef_142 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pzIncludeCharts", "" };
public static final String[] pRef_127 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyTitle", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyTemplateLabel", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyTemplateIcon", "" };
public static final String[] pRef_160 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyTextValue", "2" };
public static final String[] pRef_166 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pyTextValue", "4" };
public static final String[] pRef_19 = new String[] { "", "", "pySlots", "1", "pyWidgets", "1" };
private static final PropertyQuery propertyQuery_22 = FUAUtil.createQueryBuilder().pageList("pySlots", 1).pageList("pyWidgets", 2).buildPropertyQuery();
private static final PropertyQuery propertyQuery_69 = FUAUtil.createQueryBuilder().page("pyWidget").buildPropertyQuery();
private static final PropertyQuery propertyQuery_18 = FUAUtil.createQueryBuilder().pageList("pySlots", 1).pageList("pyWidgets", 1).buildPropertyQuery();
private static final PropertyQuery propertyQuery_72 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_30 = FUAUtil.createQueryBuilder().pageList("pySlots", 2).pageList("pyWidgets", 2).buildPropertyQuery();
private static final PropertyQuery propertyQuery_26 = FUAUtil.createQueryBuilder().pageList("pySlots", 2).pageList("pyWidgets", 1).buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20210506T204032.614 GMT", "System-User-Dashboard pyDefautUserDashboard", "Theme-Cosmos", "04-01-01", "20210506T204032.614 GMT");
}
