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
public class ra_model_pzgetinputmethodtype_4c5c19d9fd81f794e3c977ec425d8fc9 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzGetInputMethodType.Code_Pega_List.Model");
	public ra_model_pzgetinputmethodtype_4c5c19d9fd81f794e3c977ec425d8fc9(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZGETINPUTMETHODTYPE #20230618T001815.430 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_1);
}
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =null;
ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pyStandardValue", source_1, target_2);
{
    String pzSourceVar3 = "";
    pzSourceVar3 = "MANUAL";
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_4, myStepPage, pzSourceVar3, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pyStandardValue", source_1, target_2);
ClipboardPage source_2 =null;
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set .pyPromptValue", source_2, target_3);
{
    String pzSourceVar6 = "";
    pzSourceVar6 = "Manual entry (editable)";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_7, myStepPage, pzSourceVar6, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set .pyPromptValue", source_2, target_3);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyStandardValue", source_3, target_4);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = "CALCULATED";
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_4, myStepPage, pzSourceVar9, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyStandardValue", source_3, target_4);
ClipboardPage source_4 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyPromptValue", source_4, target_5);
{
    String pzSourceVar11 = "";
    pzSourceVar11 = "Calculated (read-only)";
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_7, myStepPage, pzSourceVar11, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyPromptValue", source_4, target_5);
return CODE_CONTINUE;
}private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.InsKey!=\"\" &amp;&amp; param.Type == \"Pega-Fields-Scalar-Text\"");
try {
boolean pz_13 = ((!(tools.getParamValue("InsKey").equals(""))) && (tools.getParamValue("Type").equals("Pega-Fields-Scalar-Text")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.InsKey!=\"\" &amp;&amp; param.Type == \"Pega-Fields-Scalar-Text\"",pz_13);
return pz_13;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.InsKey!=\"\" &amp;&amp; param.Type == \"Pega-Fields-Scalar-Text\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_14 = myStepPage.getProperty("pxResults");
targetProperty_3 = pz_14;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
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
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyStandardValue", source_5, target_6);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = "PREDICTED";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyStandardValue", pRef_4, myStepPage, pzSourceVar15, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyStandardValue", source_5, target_6);
ClipboardPage source_6 =null;
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.2", "Set .pyPromptValue", source_6, target_7);
{
    String pzSourceVar17 = "";
    pzSourceVar17 = "Predicted with AI (editable)";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyPromptValue", pRef_7, myStepPage, pzSourceVar17, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.2", "Set .pyPromptValue", source_6, target_7);
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
	"Rule-Obj-Model:PZGETINPUTMETHODTYPE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETINPUTMETHODTYPE","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZGETINPUTMETHODTYPE #20230618T001815.430 GMT","!PZGETINPUTMETHODTYPE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",260026289)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZGETINPUTMETHODTYPE #20230618T001815.430 GMT:20230618T001815.430 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "bdb6b78ec1d4fc6920e28928efacf7cf";
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

public static final String[] pRef_4 = new String[] { "", "", "pyStandardValue", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyPromptValue", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZGETINPUTMETHODTYPE #20230618T001815.430 GMT", "Code-Pega-List pzGetInputMethodType", "Pega-ProcessArchitect", "08-23-01", "20230618T001815.430 GMT");
}
