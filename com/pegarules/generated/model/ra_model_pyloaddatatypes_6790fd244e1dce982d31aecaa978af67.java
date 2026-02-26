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
public class ra_model_pyloaddatatypes_6790fd244e1dce982d31aecaa978af67 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyLoadDataTypes.Rule_Obj_Activity.Model");
	public ra_model_pyloaddatatypes_6790fd244e1dce982d31aecaa978af67(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL RULE-OBJ-ACTIVITY PYLOADDATATYPES #20180713T135522.420 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_1 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_1 = pz_1;
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_1.getString("pxObjClass"))) {
	ctxt_page_1.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_1);
actionProlog(pz_CurrentTraceInfo,"1", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_2 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_2 = pz_2;
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_2.getString("pxObjClass"))) {
	ctxt_page_2.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_2);
actionProlog(pz_CurrentTraceInfo,"2", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_3 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_3 = pz_3;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_3.getString("pxObjClass"))) {
	ctxt_page_3.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_3);
actionProlog(pz_CurrentTraceInfo,"3", "Append and Map to", null, targetProperty_3);
if (appendAndMapTo_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Append and Map to", null, targetProperty_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_4 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_4 = pz_4;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_4.getString("pxObjClass"))) {
	ctxt_page_4.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"4", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_5 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_5 = pz_5;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ctxt_page_5 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_5.getString("pxObjClass"))) {
	ctxt_page_5.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_5);
actionProlog(pz_CurrentTraceInfo,"5", "Append and Map to", null, targetProperty_5);
if (appendAndMapTo_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Append and Map to", null, targetProperty_5);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_6 = null;
ClipboardProperty pz_6 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_6 = pz_6;
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ctxt_page_6 = targetProperty_6.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_6.getString("pxObjClass"))) {
	ctxt_page_6.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_6);
actionProlog(pz_CurrentTraceInfo,"6", "Append and Map to", null, targetProperty_6);
if (appendAndMapTo_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Append and Map to", null, targetProperty_6);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_7 = null;
ClipboardProperty pz_7 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_7 = pz_7;
/* entering new scope */
boolean pop_ctxt_page_7 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_7 = null;
ctxt_page_7 = targetProperty_7.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_7.getString("pxObjClass"))) {
	ctxt_page_7.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_7);
actionProlog(pz_CurrentTraceInfo,"7", "Append and Map to", null, targetProperty_7);
if (appendAndMapTo_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "Append and Map to", null, targetProperty_7);
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_8 = null;
ClipboardProperty pz_8 = pega.findPageWithException("D_DataType", "Embed-MethodParams").getProperty("pxResults");
targetProperty_8 = pz_8;
/* entering new scope */
boolean pop_ctxt_page_8 = false;
try {
/* push '"D_DataType.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ctxt_page_8 = targetProperty_8.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_8.getString("pxObjClass"))) {
	ctxt_page_8.putString("pxObjClass", "Embed-MethodParams");
}
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", "D_DataType.pxResults", ctxt_page_8);
actionProlog(pz_CurrentTraceInfo,"8", "Append and Map to", null, targetProperty_8);
if (appendAndMapTo_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"8", "Append and Map to", null, targetProperty_8);
} finally {
if (pop_ctxt_page_8) {
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
ClipboardPage source_1 =null;
ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pxObjClass", source_1, target_1);
// Change obj class
String pz_11 = "Embed-MethodParams";
ClipboardPage tempPage_1 = tools.createPage(pz_11, "");
ClipboardProperty pz_10 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_9 = null;
try {
ctxt_frame_9 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_9.getStepPage();
pz_10 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
} // return to previous step page

ClipboardPage targetPage_1 = pz_10.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pxObjClass", source_1, target_1);
ClipboardPage source_2 =null;
ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set .pyLabel", source_2, target_2);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = "PAGE";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar12, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set .pyLabel", source_2, target_2);
ClipboardPage source_3 =null;
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3", "Set .pyParametersParamType", source_3, target_3);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = "Page Name";
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar15, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3", "Set .pyParametersParamType", source_3, target_3);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pxObjClass", source_4, target_4);
// Change obj class
String pz_19 = "Embed-MethodParams";
ClipboardPage tempPage_2 = tools.createPage(pz_19, "");
ClipboardProperty pz_18 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_14 = null;
try {
ctxt_frame_14 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_14.getStepPage();
pz_18 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
} // return to previous step page

ClipboardPage targetPage_2 = pz_18.getParentPage();
targetPage_2.putAll(tempPage_2, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_2, false);
actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pxObjClass", source_4, target_4);
ClipboardPage source_5 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_5, target_5);
{
    String pzSourceVar20 = "";
    pzSourceVar20 = "Double";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar20, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_5, target_5);
ClipboardPage source_6 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pyParametersParamType", source_6, target_6);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = "Double";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar22, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pyParametersParamType", source_6, target_6);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pxObjClass", source_7, target_7);
// Change obj class
String pz_25 = "Embed-MethodParams";
ClipboardPage tempPage_3 = tools.createPage(pz_25, "");
ClipboardProperty pz_24 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_19 = null;
try {
ctxt_frame_19 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_19.getStepPage();
pz_24 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
} // return to previous step page

ClipboardPage targetPage_3 = pz_24.getParentPage();
targetPage_3.putAll(tempPage_3, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_3, false);
actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pxObjClass", source_7, target_7);
ClipboardPage source_8 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_8, target_8);
{
    String pzSourceVar26 = "";
    pzSourceVar26 = "JAVAOBJECT";
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar26, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_8, target_8);
ClipboardPage source_9 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set .pyParametersParamType", source_9, target_9);
{
    String pzSourceVar28 = "";
    pzSourceVar28 = "Java Object";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar28, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set .pyParametersParamType", source_9, target_9);
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pxObjClass", source_10, target_10);
// Change obj class
String pz_31 = "Embed-MethodParams";
ClipboardPage tempPage_4 = tools.createPage(pz_31, "");
ClipboardProperty pz_30 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_24 = null;
try {
ctxt_frame_24 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_24.getStepPage();
pz_30 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
} // return to previous step page

ClipboardPage targetPage_4 = pz_30.getParentPage();
targetPage_4.putAll(tempPage_4, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_4, false);
actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pxObjClass", source_10, target_10);
ClipboardPage source_11 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2", "Set .pyLabel", source_11, target_11);
{
    String pzSourceVar32 = "";
    pzSourceVar32 = "Date";
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar32, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.2", "Set .pyLabel", source_11, target_11);
ClipboardPage source_12 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.3", "Set .pyParametersParamType", source_12, target_12);
{
    String pzSourceVar34 = "";
    pzSourceVar34 = "Date";
    PRStackFrame ctxt_frame_27 = null;
    try {
        ctxt_frame_27 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_27.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar34, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.3", "Set .pyParametersParamType", source_12, target_12);
return CODE_CONTINUE;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pxObjClass", source_13, target_13);
// Change obj class
String pz_37 = "Embed-MethodParams";
ClipboardPage tempPage_5 = tools.createPage(pz_37, "");
ClipboardProperty pz_36 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_29 = null;
try {
ctxt_frame_29 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_29.getStepPage();
pz_36 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
} // return to previous step page

ClipboardPage targetPage_5 = pz_36.getParentPage();
targetPage_5.putAll(tempPage_5, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_5, false);
actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pxObjClass", source_13, target_13);
ClipboardPage source_14 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2", "Set .pyLabel", source_14, target_14);
{
    String pzSourceVar38 = "";
    pzSourceVar38 = "DateTime";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar38, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2", "Set .pyLabel", source_14, target_14);
ClipboardPage source_15 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.3", "Set .pyParametersParamType", source_15, target_15);
{
    String pzSourceVar40 = "";
    pzSourceVar40 = "Date Time";
    PRStackFrame ctxt_frame_32 = null;
    try {
        ctxt_frame_32 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_32.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar40, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.3", "Set .pyParametersParamType", source_15, target_15);
return CODE_CONTINUE;
}private int appendAndMapTo_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_16 =null;
ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1", "Set .pxObjClass", source_16, target_16);
// Change obj class
String pz_43 = "Embed-MethodParams";
ClipboardPage tempPage_6 = tools.createPage(pz_43, "");
ClipboardProperty pz_42 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_34 = null;
try {
ctxt_frame_34 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_34.getStepPage();
pz_42 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
} // return to previous step page

ClipboardPage targetPage_6 = pz_42.getParentPage();
targetPage_6.putAll(tempPage_6, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_6, false);
actionEpilog(pz_CurrentTraceInfo,"6.1", "Set .pxObjClass", source_16, target_16);
ClipboardPage source_17 =null;
ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.2", "Set .pyLabel", source_17, target_17);
{
    String pzSourceVar44 = "";
    pzSourceVar44 = "TimeOfDay";
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar44, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.2", "Set .pyLabel", source_17, target_17);
ClipboardPage source_18 =null;
ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.3", "Set .pyParametersParamType", source_18, target_18);
{
    String pzSourceVar46 = "";
    pzSourceVar46 = "Time of Day";
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar46, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.3", "Set .pyParametersParamType", source_18, target_18);
return CODE_CONTINUE;
}private int appendAndMapTo_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =null;
ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1", "Set .pxObjClass", source_19, target_19);
// Change obj class
String pz_49 = "Embed-MethodParams";
ClipboardPage tempPage_7 = tools.createPage(pz_49, "");
ClipboardProperty pz_48 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_39 = null;
try {
ctxt_frame_39 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_39.getStepPage();
pz_48 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
} // return to previous step page

ClipboardPage targetPage_7 = pz_48.getParentPage();
targetPage_7.putAll(tempPage_7, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_7, false);
actionEpilog(pz_CurrentTraceInfo,"7.1", "Set .pxObjClass", source_19, target_19);
ClipboardPage source_20 =null;
ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.2", "Set .pyLabel", source_20, target_20);
{
    String pzSourceVar50 = "";
    pzSourceVar50 = "Decimal";
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar50, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.2", "Set .pyLabel", source_20, target_20);
ClipboardPage source_21 =null;
ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.3", "Set .pyParametersParamType", source_21, target_21);
{
    String pzSourceVar52 = "";
    pzSourceVar52 = "Decimal";
    PRStackFrame ctxt_frame_42 = null;
    try {
        ctxt_frame_42 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_42.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar52, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_42);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.3", "Set .pyParametersParamType", source_21, target_21);
return CODE_CONTINUE;
}private int appendAndMapTo_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_22 =null;
ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1", "Set .pxObjClass", source_22, target_22);
// Change obj class
String pz_55 = "Embed-MethodParams";
ClipboardPage tempPage_8 = tools.createPage(pz_55, "");
ClipboardProperty pz_54 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_44 = null;
try {
ctxt_frame_44 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_44.getStepPage();
pz_54 = propertyQuery_9.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_44);
} // return to previous step page

ClipboardPage targetPage_8 = pz_54.getParentPage();
targetPage_8.putAll(tempPage_8, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_8, false);
actionEpilog(pz_CurrentTraceInfo,"8.1", "Set .pxObjClass", source_22, target_22);
ClipboardPage source_23 =null;
ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.2", "Set .pyLabel", source_23, target_23);
{
    String pzSourceVar56 = "";
    pzSourceVar56 = "TrueFalse";
    PRStackFrame ctxt_frame_45 = null;
    try {
        ctxt_frame_45 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_45.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, pzSourceVar56, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.2", "Set .pyLabel", source_23, target_23);
ClipboardPage source_24 =null;
ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.3", "Set .pyParametersParamType", source_24, target_24);
{
    String pzSourceVar58 = "";
    pzSourceVar58 = "True or False";
    PRStackFrame ctxt_frame_47 = null;
    try {
        ctxt_frame_47 = pega.pushStackFrame("Embed-MethodParams", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_47.getStepPage();
        pega.setViaPropRef(".pyParametersParamType", pRef_16, myStepPage, pzSourceVar58, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.3", "Set .pyParametersParamType", source_24, target_24);
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
	"Rule-Obj-Model:PYLOADDATATYPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYLOADDATATYPES","Rule-Obj-Model","RULE-OBJ-ACTIVITY",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL RULE-OBJ-ACTIVITY PYLOADDATATYPES #20180713T135522.420 GMT","!PYLOADDATATYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1378439305)
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
//	RULE-OBJ-MODEL RULE-OBJ-ACTIVITY PYLOADDATATYPES #20180713T135522.420 GMT:20180713T135522.420 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "fefcb5312d62f9310058418b77131849";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Activity";
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

public static final String[] pRef_13 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyParametersParamType", "" };
private static final PropertyQuery propertyQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-ACTIVITY PYLOADDATATYPES #20180713T135522.420 GMT", "Rule-Obj-Activity pyLoadDataTypes", "Pega-Desktop", "08-01-01", "20180713T135522.420 GMT");
}
