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
public class ra_model_pzpostrmaction_8a5aadfe0b195145f204ca5bbb514b1d extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzPostRMAction._baseclass.Model");
	public ra_model_pzpostrmaction_8a5aadfe0b195145f204ca5bbb514b1d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL @BASECLASS PZPOSTRMACTION #20190909T211702.981 GMT	Pega-Desktop:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
} else {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "Otherwise", null, target_2);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Otherwise", null, target_2);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pyWorkPage.pxObjClass==\"Work-ProjectManagement-Delete\"");
try {
boolean pz_2 = (scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("pyWorkPage", "Work-ProjectManagement"), ImmutablePropertyInfo.TYPE_TEXT).equals("Work-ProjectManagement-Delete"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pyWorkPage.pxObjClass==\"Work-ProjectManagement-Delete\"",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pyWorkPage.pxObjClass==\"Work-ProjectManagement-Delete\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1", "When", null, target_3);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "When", null, target_3);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pyWorkPage.pyReturnStatus==\"Good\"");
try {
boolean pz_4 = (scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("pyWorkPage", "Work-ProjectManagement"), ImmutablePropertyInfo.TYPE_TEXT).equals("Good"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pyWorkPage.pyReturnStatus==\"Good\"",pz_4);
return pz_4;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pyWorkPage.pyReturnStatus==\"Good\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pyToolBarSettings"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ClipboardProperty pz_6 = propertyQuery_5.resolve(tools, myStepPage);
ctxt_page_1 = pz_6 == null ? null : pz_6.getPageValue();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pyToolBarSettings", ctxt_page_1);
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
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.2", "Set .pyDeletedObject", source_1, target_4);
{
    pega.setViaPropRef(".pyDeletedObject", pRef_8, myStepPage, "true", "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.1.2", "Set .pyDeletedObject", source_1, target_4);
return CODE_CONTINUE;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.1", "Set .pySave", source_2, target_5);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = "false";
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pega.setViaPropRef(".pySave", pRef_10, myStepPage, pzSourceVar9, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.1", "Set .pySave", source_2, target_5);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pyAvailability", source_3, target_6);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = "false";
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pega.setViaPropRef(".pyAvailability", pRef_13, myStepPage, pzSourceVar12, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.2", "Set .pyAvailability", source_3, target_6);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyDelete", source_4, target_7);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = "false";
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pega.setViaPropRef(".pyDelete", pRef_16, myStepPage, pzSourceVar15, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.3", "Set .pyDelete", source_4, target_7);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pyCheckOut", source_5, target_8);
{
    String pzSourceVar18 = "";
    pzSourceVar18 = "false";
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pega.setViaPropRef(".pyCheckOut", pRef_19, myStepPage, pzSourceVar18, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.4", "Set .pyCheckOut", source_5, target_8);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.5", "Set .pyCheckIn", source_6, target_9);
{
    String pzSourceVar21 = "";
    pzSourceVar21 = "false";
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyCheckIn", pRef_22, myStepPage, pzSourceVar21, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.5", "Set .pyCheckIn", source_6, target_9);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.6", "Set .pyRun", source_7, target_10);
{
    String pzSourceVar24 = "";
    pzSourceVar24 = "false";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pega.setViaPropRef(".pyRun", pRef_25, myStepPage, pzSourceVar24, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.6", "Set .pyRun", source_7, target_10);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.7", "Set .pyLaunch", source_8, target_11);
{
    String pzSourceVar27 = "";
    pzSourceVar27 = "false";
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        pega.setViaPropRef(".pyLaunch", pRef_28, myStepPage, pzSourceVar27, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.7", "Set .pyLaunch", source_8, target_11);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.8", "Set .pyFavorites", source_9, target_12);
{
    String pzSourceVar30 = "";
    pzSourceVar30 = "false";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pega.setViaPropRef(".pyFavorites", pRef_31, myStepPage, pzSourceVar30, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.8", "Set .pyFavorites", source_9, target_12);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.9", "Set .pySiblings", source_10, target_13);
{
    String pzSourceVar33 = "";
    pzSourceVar33 = "false";
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pySiblings", pRef_34, myStepPage, pzSourceVar33, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.9", "Set .pySiblings", source_10, target_13);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.10", "Set .pyShowJava", source_11, target_14);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "false";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pega.setViaPropRef(".pyShowJava", pRef_37, myStepPage, pzSourceVar36, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.10", "Set .pyShowJava", source_11, target_14);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.11", "Set .pyRecover", source_12, target_15);
{
    String pzSourceVar39 = "";
    pzSourceVar39 = "true";
    PRStackFrame ctxt_frame_24 = null;
    try {
        ctxt_frame_24 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_24.getStepPage();
        pega.setViaPropRef(".pyRecover", pRef_40, myStepPage, pzSourceVar39, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.11", "Set .pyRecover", source_12, target_15);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1.12", "Set .pyDelegates", source_13, target_16);
{
    String pzSourceVar42 = "";
    pzSourceVar42 = "false";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Embed-WBSettings-ToolBar", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyDelegates", pRef_43, myStepPage, pzSourceVar42, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1.12", "Set .pyDelegates", source_13, target_16);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Start Page-Copy from Set action
{
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.1", "Set Primary", source_14, target_17);
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: pyWorkPage.pyRulePage
ClipboardPage pz_46 = pageQuery_45.resolve(tools, pega.findPageWithException("pyWorkPage", "Work-ProjectManagement"));
sourcePage = pz_46;
targetPage = tools.getPrimaryPage();
if (!(targetPage != null && sourcePage != null && targetPage == sourcePage)) {
if (targetPage != null) {
String pageClass = sourcePage != null ? sourcePage.getClassName() : targetPage.getClassName();
targetPage.clear();
targetPage.putString("pxObjClass", pageClass);
}

if ((targetPage != null) && (sourcePage != null)) {
targetPage.putAll(sourcePage, ClipboardPage.PUTALL_KEEPNEW);
targetPage.addMessages(sourcePage);
}
} // end self-ref check;
actionEpilog(pz_CurrentTraceInfo,"2.1", "Set Primary", source_14, target_17);
}// End Page-Copy from Set action
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyToolbarSaveLabel", source_15, target_18);
{
    pega.setViaPropRef(".pyToolbarSaveLabel", pRef_47, myStepPage, "Save", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyToolbarSaveLabel", source_15, target_18);
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
	"Rule-Obj-Model:PZPOSTRMACTION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOSTRMACTION","Rule-Obj-Model","@BASECLASS",false,"","Pega-Desktop","08-04-01","RULE-OBJ-MODEL @BASECLASS PZPOSTRMACTION #20190909T211702.981 GMT","!PZPOSTRMACTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",118737944)
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
//	RULE-OBJ-MODEL @BASECLASS PZPOSTRMACTION #20190909T211702.981 GMT:20190909T211702.981 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "de7a25766dd667a6ffc9c6bc02e9e355";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
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

public static final String[] pRef_43 = new String[] { "", "", "pyDelegates", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyDelete", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyRun", "" };
public static final String[] pRef_34 = new String[] { "", "", "pySiblings", "" };
public static final String[] pRef_37 = new String[] { "", "", "pyShowJava", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyToolbarSaveLabel", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyCheckOut", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyDeletedObject", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyFavorites", "" };
public static final String[] pRef_10 = new String[] { "", "", "pySave", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyLaunch", "" };
public static final String[] pRef_40 = new String[] { "", "", "pyRecover", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyAvailability", "" };
public static final String[] pRef_22 = new String[] { "", "", "pyCheckIn", "" };
private static final PageQuery pageQuery_45 = FUAUtil.createQueryBuilder().page("pyRulePage").buildPageQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyReturnStatus").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_5 = FUAUtil.createQueryBuilder().page("pyToolBarSettings").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PZPOSTRMACTION #20190909T211702.981 GMT", "@baseclass pzPostRMAction", "Pega-Desktop", "08-04-01", "20190909T211702.981 GMT");
}
