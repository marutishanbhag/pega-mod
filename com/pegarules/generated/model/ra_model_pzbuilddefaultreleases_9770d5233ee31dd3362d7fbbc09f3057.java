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
public class ra_model_pzbuilddefaultreleases_9770d5233ee31dd3362d7fbbc09f3057 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzBuildDefaultReleases.Code_Pega_List.Model");
	public ra_model_pzbuilddefaultreleases_9770d5233ee31dd3362d7fbbc09f3057(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZBUILDDEFAULTRELEASES #20191118T130809.889 GMT	Pega-AppDefinition:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
if("".equals(ctxt_page_1.getString("pxObjClass"))) {
	ctxt_page_1.putString("pxObjClass", "Embed-Application-MetaData");
}
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
if("".equals(ctxt_page_2.getString("pxObjClass"))) {
	ctxt_page_2.putString("pxObjClass", "Embed-Application-MetaData");
}
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
if("".equals(ctxt_page_3.getString("pxObjClass"))) {
	ctxt_page_3.putString("pxObjClass", "Embed-Application-MetaData");
}
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
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_4 = myStepPage.getProperty("pxResults");
targetProperty_4 = pz_4;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_4.getString("pxObjClass"))) {
	ctxt_page_4.putString("pxObjClass", "Embed-Application-MetaData");
}
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pxResults", ctxt_page_4);
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
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pyName", source_1, target_1);
{
    String pzSourceVar5 = "";
    pzSourceVar5 = "MLP 1";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyName", pRef_6, myStepPage, pzSourceVar5, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pyName", source_1, target_1);
ClipboardPage source_2 =null;
ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set .pyColor", source_2, target_2);
{
    String pzSourceVar8 = "";
    pzSourceVar8 = "#275FD9";
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyColor", pRef_9, myStepPage, pzSourceVar8, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set .pyColor", source_2, target_2);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyName", source_3, target_3);
{
    String pzSourceVar11 = "";
    pzSourceVar11 = "MLP 2";
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyName", pRef_6, myStepPage, pzSourceVar11, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyName", source_3, target_3);
ClipboardPage source_4 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyColor", source_4, target_4);
{
    String pzSourceVar13 = "";
    pzSourceVar13 = "#FF03EF";
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pyColor", pRef_9, myStepPage, pzSourceVar13, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyColor", source_4, target_4);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyName", source_5, target_5);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = "MLP n";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyName", pRef_6, myStepPage, pzSourceVar15, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyName", source_5, target_5);
ClipboardPage source_6 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyColor", source_6, target_6);
{
    String pzSourceVar17 = "";
    pzSourceVar17 = "#CCDA2A";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyColor", pRef_9, myStepPage, pzSourceVar17, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyColor", source_6, target_6);
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyName", source_7, target_7);
{
    String pzSourceVar19 = "";
    pzSourceVar19 = "Future";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyName", pRef_6, myStepPage, pzSourceVar19, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyName", source_7, target_7);
ClipboardPage source_8 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2", "Set .pyColor", source_8, target_8);
{
    String pzSourceVar21 = "";
    pzSourceVar21 = "#4E5C75";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyColor", pRef_9, myStepPage, pzSourceVar21, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.2", "Set .pyColor", source_8, target_8);
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
	"Rule-Obj-Model:PZBUILDDEFAULTRELEASES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZBUILDDEFAULTRELEASES","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-AppDefinition","08-04-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZBUILDDEFAULTRELEASES #20191118T130809.889 GMT","!PZBUILDDEFAULTRELEASES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",821260381)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZBUILDDEFAULTRELEASES #20191118T130809.889 GMT:20191118T130809.889 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "2c10ef32abd5d2c1fd98e669c15c61cd";
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

public static final String[] pRef_6 = new String[] { "", "", "pyName", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyColor", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZBUILDDEFAULTRELEASES #20191118T130809.889 GMT", "Code-Pega-List pzBuildDefaultReleases", "Pega-AppDefinition", "08-04-01", "20191118T130809.889 GMT");
}
