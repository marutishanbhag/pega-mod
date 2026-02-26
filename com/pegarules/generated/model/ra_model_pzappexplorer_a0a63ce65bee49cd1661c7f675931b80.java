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
public class ra_model_pzappexplorer_a0a63ce65bee49cd1661c7f675931b80 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzAppExplorer.Embed_ExplorerNode_.Model");
	public ra_model_pzappexplorer_a0a63ce65bee49cd1661c7f675931b80(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-EXPLORERNODE- PZAPPEXPLORER #20220505T212907.926 GMT	Pega-Desktop:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_2 = pega.findPageWithException("pyAppRulePage", "Code-Pega-List").getIfPresent("pxResults");
foreach_prop_1 = pz_2;
actionProlog(pz_CurrentTraceInfo,"1", "Append to", pz_2, targetProperty_1);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"pyAppRulePage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("SOURCE", "pyAppRulePage.pxResults(<CURRENT>)", ctxt_page_target_1);
ClipboardPage sourcePage = null;
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_2 = null;
try {
ctxt_frame_2 = pega.pushStackFrame("Switch to SOURCE for AppendTo", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_2.getStepPage();
sourcePage = myStepPage;
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_2);
} // return to previous step page
targetProperty_1.add(sourcePage);
currentLoopOffset++;
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"1", "Append to", pz_2, targetProperty_1);
actionProlog(pz_CurrentTraceInfo,"2", "Apply Data Transform pzAppExplorerRule", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "Embed-ExplorerNode-";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pzAppExplorerRule");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, null);
actionEpilog(pz_CurrentTraceInfo,"2", "Apply Data Transform pzAppExplorerRule", null, null);
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

private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pyAppRulePage.pxTotalResultCount&gt;pyAppRulePage.pxResultCount");
try {
boolean pz_5 = (scalarValueQuery_3.resolveToInt(tools, pega.findPageWithException("pyAppRulePage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) > scalarValueQuery_4.resolveToInt(tools, pega.findPageWithException("pyAppRulePage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pyAppRulePage.pxTotalResultCount&gt;pyAppRulePage.pxResultCount",pz_5);
return pz_5;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pyAppRulePage.pxTotalResultCount&gt;pyAppRulePage.pxResultCount " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"3.1", "Apply Data Transform pzAppExplorerAppendEmptyNode", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_2 = null;
if (myStepPage != null) {
	pz_modelClass_2 = myStepPage.getClassName();
}
if ((pz_modelClass_2 == null) || (pz_modelClass_2.length() == 0)) { 
	pz_modelClass_2 = "Embed-ExplorerNode-";
}
StringMap pz_modelKey_2 = new HashStringMap(3);
pz_modelKey_2.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_2.putString("pyModelName", "pzAppExplorerAppendEmptyNode");
pz_modelKey_2.putString("pyClassName", pz_modelClass_2);
tools.applyModel(myStepPage, pz_modelKey_2, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"3.1", "Apply Data Transform pzAppExplorerAppendEmptyNode", null, null);
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set Primary.pxResults(<LAST>).pyShowAllResults", source_1, target_2);
{
    pega.setViaPropRef(".pxResults(<last>).pyShowAllResults", pRef_6, tools.getPrimaryPage(), true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set Primary.pxResults(<LAST>).pyShowAllResults", source_1, target_2);

// processScalarParameters
ParameterPage pz_param_2 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"3.3", "Apply Data Transform pzAppExplorerAppendEmptyNode", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_3 = null;
if (myStepPage != null) {
	pz_modelClass_3 = myStepPage.getClassName();
}
if ((pz_modelClass_3 == null) || (pz_modelClass_3.length() == 0)) { 
	pz_modelClass_3 = "Embed-ExplorerNode-";
}
StringMap pz_modelKey_3 = new HashStringMap(3);
pz_modelKey_3.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_3.putString("pyModelName", "pzAppExplorerAppendEmptyNode");
pz_modelKey_3.putString("pyClassName", pz_modelClass_3);
tools.applyModel(myStepPage, pz_modelKey_3, pz_param_2);
actionEpilog(pz_CurrentTraceInfo,"3.3", "Apply Data Transform pzAppExplorerAppendEmptyNode", null, null);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4", "Set Primary.pxResults(<LAST>).pyLoadRemainingResults", source_2, target_3);
{
    pega.setViaPropRef(".pxResults(<last>).pyLoadRemainingResults", pRef_7, tools.getPrimaryPage(), true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.4", "Set Primary.pxResults(<LAST>).pyLoadRemainingResults", source_2, target_3);
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
	"Rule-Obj-Model:PZAPPEXPLORER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZAPPEXPLORER","Rule-Obj-Model","EMBED-EXPLORERNODE-",false,"","Pega-Desktop","08-08-01","RULE-OBJ-MODEL EMBED-EXPLORERNODE- PZAPPEXPLORER #20220505T212907.926 GMT","!PZAPPEXPLORER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1906675871)
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
//	RULE-OBJ-MODEL EMBED-EXPLORERNODE- PZAPPEXPLORER #20220505T212907.926 GMT:20220505T212907.926 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ac8ad9a0f479fe6f413970d972a2dea9";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ExplorerNode-";
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

public static final String[] pRef_7 = new String[] { "", "", "pxResults", "<last>", "pyLoadRemainingResults", "" };
public static final String[] pRef_6 = new String[] { "", "", "pxResults", "<last>", "pyShowAllResults", "" };
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pxTotalResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-EXPLORERNODE- PZAPPEXPLORER #20220505T212907.926 GMT", "Embed-ExplorerNode- pzAppExplorer", "Pega-Desktop", "08-08-01", "20220505T212907.926 GMT");
}
