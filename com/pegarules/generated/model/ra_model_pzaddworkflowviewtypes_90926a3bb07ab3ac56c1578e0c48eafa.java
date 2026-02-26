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
public class ra_model_pzaddworkflowviewtypes_90926a3bb07ab3ac56c1578e0c48eafa extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzAddWorkflowViewTypes.Code_Pega_List.Model");
	public ra_model_pzaddworkflowviewtypes_90926a3bb07ab3ac56c1578e0c48eafa(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZADDWORKFLOWVIEWTYPES #20200309T144616.608 GMT	Pega-AppDefinition:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
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
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_1);
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
ClipboardProperty pz_2 = myStepPage.getProperty("pxResults");
targetProperty_2 = pz_2;
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_2);
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
ClipboardProperty pz_3 = myStepPage.getProperty("pxResults");
targetProperty_3 = pz_3;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_3);
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
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pyShowReleases", source_1, target_1);
{
    pega.setViaPropRef(".pyShowReleases", pRef_4, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pyShowReleases", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5", "Set .pyReleaseID", source_2, target_2);
{
    pega.setViaPropRef(".pyReleaseID", pRef_5, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5", "Set .pyReleaseID", source_2, target_2);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pyLabel", source_3, target_3);
{
    String pzSourceVar6 = "";
    pzSourceVar6 = "Steps";
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar6, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pyLabel", source_3, target_3);
ClipboardPage source_4 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set .pyNote", source_4, target_4);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = "Stages & Steps";
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pega.setViaPropRef(".pyNote", pRef_10, myStepPage, pzSourceVar9, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set .pyNote", source_4, target_4);
ClipboardPage source_5 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3", "Set .pyID", source_5, target_5);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = "STEPS";
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pega.setViaPropRef(".pyID", pRef_13, myStepPage, pzSourceVar12, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3", "Set .pyID", source_5, target_5);
ClipboardPage source_6 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.4", "Set .pySelected", source_6, target_6);
{
    boolean pzSourceVar15 = false;
    pzSourceVar15 = true;
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_16, myStepPage, pzSourceVar15, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.4", "Set .pySelected", source_6, target_6);
ClipboardPage source_7 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.5", "Set .pzIsHighestSelectedIndex", source_7, target_7);
{
    boolean pzSourceVar18 = false;
    pzSourceVar18 = false;
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pzIsHighestSelectedIndex", pRef_19, myStepPage, pzSourceVar18, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.5", "Set .pzIsHighestSelectedIndex", source_7, target_7);
ClipboardPage source_8 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6", "Set .pxObjClass", source_8, target_8);
// Change obj class
String pz_23 = "@baseclass";
ClipboardPage tempPage_1 = tools.createPage(pz_23, "");
ClipboardProperty pz_22 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_14 = null;
try {
ctxt_frame_14 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_14.getStepPage();
pz_22 = propertyQuery_21.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
} // return to previous step page

ClipboardPage targetPage_1 = pz_22.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"1.6", "Set .pxObjClass", source_8, target_8);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =null;
ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyNote", source_9, target_9);
{
    String pzSourceVar24 = "";
    pzSourceVar24 = "Personas";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyNote", pRef_10, myStepPage, pzSourceVar24, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyNote", source_9, target_9);
ClipboardPage source_10 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_10, target_10);
{
    String pzSourceVar26 = "";
    pzSourceVar26 = "Personas";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar26, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_10, target_10);
ClipboardPage source_11 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pyID", source_11, target_11);
{
    String pzSourceVar28 = "";
    pzSourceVar28 = "PERSONAS";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyID", pRef_13, myStepPage, pzSourceVar28, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pyID", source_11, target_11);
ClipboardPage source_12 =null;
ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.4", "Set .pySelected", source_12, target_12);
{
    boolean pzSourceVar30 = false;
    pzSourceVar30 = true;
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_16, myStepPage, pzSourceVar30, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.4", "Set .pySelected", source_12, target_12);
ClipboardPage source_13 =null;
ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.5", "Set .pzIsHighestSelectedIndex", source_13, target_13);
{
    boolean pzSourceVar32 = false;
    pzSourceVar32 = false;
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pzIsHighestSelectedIndex", pRef_19, myStepPage, pzSourceVar32, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.5", "Set .pzIsHighestSelectedIndex", source_13, target_13);
ClipboardPage source_14 =null;
ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.6", "Set .pxObjClass", source_14, target_14);
// Change obj class
String pz_35 = "@baseclass";
ClipboardPage tempPage_2 = tools.createPage(pz_35, "");
ClipboardProperty pz_34 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_25 = null;
try {
ctxt_frame_25 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_25.getStepPage();
pz_34 = propertyQuery_21.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
} // return to previous step page

ClipboardPage targetPage_2 = pz_34.getParentPage();
targetPage_2.putAll(tempPage_2, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_2, false);
actionEpilog(pz_CurrentTraceInfo,"2.6", "Set .pxObjClass", source_14, target_14);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =null;
ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyNote", source_15, target_15);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "Data";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyNote", pRef_10, myStepPage, pzSourceVar36, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyNote", source_15, target_15);
ClipboardPage source_16 =null;
ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_16, target_16);
{
    String pzSourceVar38 = "";
    pzSourceVar38 = "Data";
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, pzSourceVar38, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_16, target_16);
ClipboardPage source_17 =null;
ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set .pyID", source_17, target_17);
{
    String pzSourceVar40 = "";
    pzSourceVar40 = "DATA";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pyID", pRef_13, myStepPage, pzSourceVar40, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set .pyID", source_17, target_17);
ClipboardPage source_18 =null;
ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4", "Set .pySelected", source_18, target_18);
{
    boolean pzSourceVar42 = false;
    pzSourceVar42 = true;
    PRStackFrame ctxt_frame_32 = null;
    try {
        ctxt_frame_32 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_32.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_16, myStepPage, pzSourceVar42, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.4", "Set .pySelected", source_18, target_18);
ClipboardPage source_19 =null;
ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.5", "Set .pzIsHighestSelectedIndex", source_19, target_19);
{
    boolean pzSourceVar44 = false;
    pzSourceVar44 = true;
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        pega.setViaPropRef(".pzIsHighestSelectedIndex", pRef_19, myStepPage, pzSourceVar44, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.5", "Set .pzIsHighestSelectedIndex", source_19, target_19);
ClipboardPage source_20 =null;
ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.6", "Set .pxObjClass", source_20, target_20);
// Change obj class
String pz_47 = "@baseclass";
ClipboardPage tempPage_3 = tools.createPage(pz_47, "");
ClipboardProperty pz_46 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_36 = null;
try {
ctxt_frame_36 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_36.getStepPage();
pz_46 = propertyQuery_21.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_36);
} // return to previous step page

ClipboardPage targetPage_3 = pz_46.getParentPage();
targetPage_3.putAll(tempPage_3, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_3, false);
actionEpilog(pz_CurrentTraceInfo,"3.6", "Set .pxObjClass", source_20, target_20);
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
	"Rule-Obj-Model:PZADDWORKFLOWVIEWTYPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZADDWORKFLOWVIEWTYPES","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-AppDefinition","08-05-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZADDWORKFLOWVIEWTYPES #20200309T144616.608 GMT","!PZADDWORKFLOWVIEWTYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1733126438)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZADDWORKFLOWVIEWTYPES #20200309T144616.608 GMT:20200309T144616.608 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "0e523ae48c673211d9115d6616608c1b";
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

public static final String[] pRef_7 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_16 = new String[] { "", "", "pySelected", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyID", "" };
public static final String[] pRef_19 = new String[] { "", "", "pzIsHighestSelectedIndex", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyReleaseID", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyNote", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyShowReleases", "" };
private static final PropertyQuery propertyQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZADDWORKFLOWVIEWTYPES #20200309T144616.608 GMT", "Code-Pega-List pzAddWorkflowViewTypes", "Pega-AppDefinition", "08-05-01", "20200309T144616.608 GMT");
}
