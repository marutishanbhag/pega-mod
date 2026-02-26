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
public class ra_model_pzsetflowmessagesprocessinner_20219ab651055f438c936909a759e89c extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzSetFlowMessagesProcessInner.Embed_StageProcess.Model");
	public ra_model_pzsetflowmessagesprocessinner_20219ab651055f438c936909a759e89c(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-STAGEPROCESS PZSETFLOWMESSAGESPROCESSINNER #20200520T133429.590 GMT	Pega-ProcessArchitect:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set Param.ProcessName", source_1, target_1);
{
    tools.putParamValue("ProcessName", PropertyInfo.TYPE_TEXT, scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set Param.ProcessName", source_1, target_1);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "When", null, target_2);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "When", null, target_2);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFlowPage.pyDraftModeON");
try {
boolean pz_4 = scalarValueQuery_2.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFlowPage.pyDraftModeON",pz_4);
return pz_4;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFlowPage.pyDraftModeON " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_6 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyConnectors", pRef_5, myStepPage, false, true);
foreach_prop_1 = pz_6;
actionProlog(pz_CurrentTraceInfo,"2.1", "For Each Page In", null, pz_6);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
boolean pop_ctxt_page_2 = false;
try {
/* push '".pyFlowPage.pyModelProcess.pyConnectors(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pyFlowPage.pyModelProcess.pyConnectors(<CURRENT>)", ctxt_page_target_1);
/* push '".pyFlowPage.pyModelProcess.pyConnectors(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", ".pyFlowPage.pyModelProcess.pyConnectors(<CURRENT>)", ctxt_page_source_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "For Each Page In", null, pz_6);
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_8 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyContexts", pRef_7, myStepPage, false, true);
foreach_prop_2 = pz_8;
actionProlog(pz_CurrentTraceInfo,"2.2", "For Each Page In", null, pz_8);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_3 = false;
boolean pop_ctxt_page_4 = false;
try {
/* push '".pyFlowPage.pyModelProcess.pyContexts(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_2;
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pyFlowPage.pyModelProcess.pyContexts(<CURRENT>)", ctxt_page_target_2);
/* push '".pyFlowPage.pyModelProcess.pyContexts(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_2 = null;
ctxt_page_source_2 = ctxt_page_2;
pop_ctxt_page_4 = pega.pushScopedStepContext("SOURCE", ".pyFlowPage.pyModelProcess.pyContexts(<CURRENT>)", ctxt_page_source_2);
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_2;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_4) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2.2", "For Each Page In", null, pz_8);
ClipboardProperty foreach_prop_3 = null;
ClipboardProperty pz_10 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyModifiers", pRef_9, myStepPage, false, true);
foreach_prop_3 = pz_10;
actionProlog(pz_CurrentTraceInfo,"2.3", "For Each Page In", null, pz_10);
if (foreach_prop_3 != null) {
Iterator collectionIt = foreach_prop_3.iterator();
int currentLoopOffset = 1;
forEachLoop_3: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_3 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_5 = false;
boolean pop_ctxt_page_6 = false;
try {
/* push '".pyFlowPage.pyModelProcess.pyModifiers(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_3 = null;
ctxt_page_target_3 = ctxt_page_3;
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", ".pyFlowPage.pyModelProcess.pyModifiers(<CURRENT>)", ctxt_page_target_3);
/* push '".pyFlowPage.pyModelProcess.pyModifiers(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_3 = null;
ctxt_page_source_3 = ctxt_page_3;
pop_ctxt_page_6 = pega.pushScopedStepContext("SOURCE", ".pyFlowPage.pyModelProcess.pyModifiers(<CURRENT>)", ctxt_page_source_3);
switch (forEach_3(currentLoopOffset, foreach_prop_3.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_3;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_6) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2.3", "For Each Page In", null, pz_10);
ClipboardProperty foreach_prop_4 = null;
ClipboardProperty pz_12 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyShapes", pRef_11, myStepPage, false, true);
foreach_prop_4 = pz_12;
actionProlog(pz_CurrentTraceInfo,"2.4", "For Each Page In", null, pz_12);
if (foreach_prop_4 != null) {
Iterator collectionIt = foreach_prop_4.iterator();
int currentLoopOffset = 1;
forEachLoop_4: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_4 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_7 = false;
boolean pop_ctxt_page_8 = false;
try {
/* push '".pyFlowPage.pyModelProcess.pyShapes(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_4 = null;
ctxt_page_target_4 = ctxt_page_4;
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", ".pyFlowPage.pyModelProcess.pyShapes(<CURRENT>)", ctxt_page_target_4);
/* push '".pyFlowPage.pyModelProcess.pyShapes(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_4 = null;
ctxt_page_source_4 = ctxt_page_4;
pop_ctxt_page_8 = pega.pushScopedStepContext("SOURCE", ".pyFlowPage.pyModelProcess.pyShapes(<CURRENT>)", ctxt_page_source_4);
switch (forEach_4(currentLoopOffset, foreach_prop_4.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_4;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_8) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2.4", "For Each Page In", null, pz_12);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_10 = null;
try {
ctxt_frame_10 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_10.getStepPage();
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "Embed-StageProcess";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pzSetFlowMessagesWarningsInner");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, null);
actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
} // return to previous step page
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_11 = null;
try {
ctxt_frame_11 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_11.getStepPage();
actionProlog(pz_CurrentTraceInfo,"2.2.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_2 = null;
if (myStepPage != null) {
	pz_modelClass_2 = myStepPage.getClassName();
}
if ((pz_modelClass_2 == null) || (pz_modelClass_2.length() == 0)) { 
	pz_modelClass_2 = "Embed-StageProcess";
}
StringMap pz_modelKey_2 = new HashStringMap(3);
pz_modelKey_2.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_2.putString("pyModelName", "pzSetFlowMessagesWarningsInner");
pz_modelKey_2.putString("pyClassName", pz_modelClass_2);
tools.applyModel(myStepPage, pz_modelKey_2, null);
actionEpilog(pz_CurrentTraceInfo,"2.2.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
} // return to previous step page
return CODE_CONTINUE;
}private int forEach_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_12 = null;
try {
ctxt_frame_12 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_12.getStepPage();
actionProlog(pz_CurrentTraceInfo,"2.3.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_3 = null;
if (myStepPage != null) {
	pz_modelClass_3 = myStepPage.getClassName();
}
if ((pz_modelClass_3 == null) || (pz_modelClass_3.length() == 0)) { 
	pz_modelClass_3 = "Embed-StageProcess";
}
StringMap pz_modelKey_3 = new HashStringMap(3);
pz_modelKey_3.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_3.putString("pyModelName", "pzSetFlowMessagesWarningsInner");
pz_modelKey_3.putString("pyClassName", pz_modelClass_3);
tools.applyModel(myStepPage, pz_modelKey_3, null);
actionEpilog(pz_CurrentTraceInfo,"2.3.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
} // return to previous step page
return CODE_CONTINUE;
}private int forEach_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_13 = null;
try {
ctxt_frame_13 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_13.getStepPage();
actionProlog(pz_CurrentTraceInfo,"2.4.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_4 = null;
if (myStepPage != null) {
	pz_modelClass_4 = myStepPage.getClassName();
}
if ((pz_modelClass_4 == null) || (pz_modelClass_4.length() == 0)) { 
	pz_modelClass_4 = "Embed-StageProcess";
}
StringMap pz_modelKey_4 = new HashStringMap(3);
pz_modelKey_4.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_4.putString("pyModelName", "pzSetFlowMessagesWarningsInner");
pz_modelKey_4.putString("pyClassName", pz_modelClass_4);
tools.applyModel(myStepPage, pz_modelKey_4, null);
actionEpilog(pz_CurrentTraceInfo,"2.4.1", "Apply Data Transform pzSetFlowMessagesWarningsInner", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
} // return to previous step page
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
	"Rule-Obj-Model:PZSETFLOWMESSAGESPROCESSINNER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETFLOWMESSAGESPROCESSINNER","Rule-Obj-Model","EMBED-STAGEPROCESS",false,"","Pega-ProcessArchitect","08-05-01","RULE-OBJ-MODEL EMBED-STAGEPROCESS PZSETFLOWMESSAGESPROCESSINNER #20200520T133429.590 GMT","!PZSETFLOWMESSAGESPROCESSINNER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1155834548)
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
//	RULE-OBJ-MODEL EMBED-STAGEPROCESS PZSETFLOWMESSAGESPROCESSINNER #20200520T133429.590 GMT:20200520T133429.590 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5ac2c1b4dc8ea9ce47bce9def9c5c06b";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-StageProcess";
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

public static final String[] pRef_5 = new String[] { "", "", "pyFlowPage", "", "pyModelProcess", "", "pyConnectors", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyFlowPage", "", "pyModelProcess", "", "pyModifiers", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyFlowPage", "", "pyModelProcess", "", "pyShapes", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyFlowPage", "", "pyModelProcess", "", "pyContexts", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyFlowPage", "", "pyDraftModeON", "" };
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().page("pyFlowPage").scalarProperty("pyDraftModeON").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-STAGEPROCESS PZSETFLOWMESSAGESPROCESSINNER #20200520T133429.590 GMT", "Embed-StageProcess pzSetFlowMessagesProcessInner", "Pega-ProcessArchitect", "08-05-01", "20200520T133429.590 GMT");
}
