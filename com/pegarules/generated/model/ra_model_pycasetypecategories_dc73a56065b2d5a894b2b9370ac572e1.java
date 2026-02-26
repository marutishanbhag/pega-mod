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
public class ra_model_pycasetypecategories_dc73a56065b2d5a894b2b9370ac572e1 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyCaseTypeCategories.Code_Pega_List.Model");
	public ra_model_pycasetypecategories_dc73a56065b2d5a894b2b9370ac572e1(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PYCASETYPECATEGORIES #20230618T001814.218 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
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
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_1);
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
ClipboardProperty pz_2 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_2 = pz_2;
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_2);
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
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "When", null, target_2);
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
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pyCategory", source_1, target_3);
{
    String pzSourceVar3 = "";
    pzSourceVar3 = "Custom";
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.setViaPropRef(".pyCategory", pRef_4, myStepPage, pzSourceVar3, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pyCategory", source_1, target_3);
ClipboardPage source_2 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set .pyCategoryName", source_2, target_4);
{
    String pzSourceVar6 = "";
    pzSourceVar6 = "Standard";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyCategoryName", pRef_7, myStepPage, pzSourceVar6, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set .pyCategoryName", source_2, target_4);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyCategory", source_3, target_5);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = "Survey";
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyCategory", pRef_4, myStepPage, pzSourceVar9, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyCategory", source_3, target_5);
ClipboardPage source_4 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyCategoryName", source_4, target_6);
{
    String pzSourceVar11 = "";
    pzSourceVar11 = "Questionnaire";
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyCategoryName", pRef_7, myStepPage, pzSourceVar11, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyCategoryName", source_4, target_6);
return CODE_CONTINUE;
}private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__1 = pega.invokeWhen("pyIsConstellationUI", "Code-Pega-List", "Code-Pega-List");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_13 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_3 = pz_13;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_3);
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
ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyCategory", source_5, target_7);
{
    String pzSourceVar14 = "";
    pzSourceVar14 = "Remote";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyCategory", pRef_4, myStepPage, pzSourceVar14, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyCategory", source_5, target_7);
ClipboardPage source_6 =null;
ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.2", "Set .pyCategoryName", source_6, target_8);
{
    String pzSourceVar16 = "";
    pzSourceVar16 = "Remote";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyCategoryName", pRef_7, myStepPage, pzSourceVar16, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1.2", "Set .pyCategoryName", source_6, target_8);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@when(pyIsConstellationUI)");
try {
boolean pz_18 = ((!(pega.<Boolean>resolveMethodCall("when--(String)", "when", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyIsConstellationUI" })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@when(pyIsConstellationUI)",pz_18);
return pz_18;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@when(pyIsConstellationUI) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.1", "When", null, target_9);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "When", null, target_9);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__3 = pega.invokeWhen("pyEnableCoexistence", "Code-Pega-List", "Code-Pega-List");
return pz__3;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_19 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_4 = pz_19;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =null;
ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.1", "Set .pyCategory", source_7, target_10);
{
    String pzSourceVar20 = "";
    pzSourceVar20 = "Custom_Coexistence";
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyCategory", pRef_4, myStepPage, pzSourceVar20, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.1", "Set .pyCategory", source_7, target_10);
ClipboardPage source_8 =null;
ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.2", "Set .pyCategoryName", source_8, target_11);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = "Standard (Using Constellation technology)";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pega.setViaPropRef(".pyCategoryName", pRef_7, myStepPage, pzSourceVar22, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.2", "Set .pyCategoryName", source_8, target_11);
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
	"Rule-Obj-Model:PYCASETYPECATEGORIES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYCASETYPECATEGORIES","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-MODEL CODE-PEGA-LIST PYCASETYPECATEGORIES #20230618T001814.218 GMT","!PYCASETYPECATEGORIES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1440757263)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PYCASETYPECATEGORIES #20230618T001814.218 GMT:20230618T001814.218 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "c879187b4f1af8bf5b27f4edb27ce7a1";
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

public static final String[] pRef_4 = new String[] { "", "", "pyCategory", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyCategoryName", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PYCASETYPECATEGORIES #20230618T001814.218 GMT", "Code-Pega-List pyCaseTypeCategories", "Pega-ProcessArchitect", "08-23-01", "20230618T001814.218 GMT");
}
