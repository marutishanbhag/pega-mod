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
public class ra_model_pzgetcasesfromapplication_ce6a12ba56018fac22c2742638d9d39d extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzGetCasesFromApplication.Code_Pega_List.Model");
	public ra_model_pzgetcasesfromapplication_ce6a12ba56018fac22c2742638d9d39d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESFROMAPPLICATION #20180713T134931.080 GMT	Pega-EndUserUI:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set D_CasesFromApplication.pxResultCount", source_1, target_1);
{
    pega.setViaPropRef(".pxResultCount", pRef_1, pega.findPageWithException("D_CasesFromApplication", "Code-Pega-List"), 0, "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set D_CasesFromApplication.pxResultCount", source_1, target_1);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_2 = pega.findPageWithException("Application", "Rule-Application").getIfPresent("pyWorkMetaData");
foreach_prop_1 = pz_2;
actionProlog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_2);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"Application.pyWorkMetaData(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Application.pyWorkMetaData(<CURRENT>)", ctxt_page_target_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_2);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.1", "When", null, target_2);
switch (when_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "When", null, target_2);
}
return CODE_CONTINUE;
}private boolean whenCondition_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_2 = null;
try {
ctxt_frame_2 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_2.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyShowInNewWorkMenu==\"true\" || Param.GetAll");
try {
boolean pz_4 = ((scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("true")) || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "GetAll"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyShowInNewWorkMenu==\"true\" || Param.GetAll",pz_4);
return pz_4;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyShowInNewWorkMenu==\"true\" || Param.GetAll " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_2);
} // return to previous step page
}private int when_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Set D_CasesFromApplication.pxResults(<APPEND>).pyClassName", source_2, target_3);
{
    String pzSourceVar5 = "";
    pzSourceVar5 = scalarValueQuery_6.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("Embed-Application-WorkMetaData", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.setViaPropRef(".pxResults(<append>).pyClassName", pRef_7, pega.findPageWithException("D_CasesFromApplication", "Code-Pega-List"), pzSourceVar5, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Set D_CasesFromApplication.pxResults(<APPEND>).pyClassName", source_2, target_3);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.2", "Set D_CasesFromApplication.pxResults(<LAST>).pyLabel", source_3, target_4);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = pega.<String>resolveMethodCall("pzGetClassInfoFromDefinition--(String,String)", "pzGetClassInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_6.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), "pyLabel" });
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("Embed-Application-WorkMetaData", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pxResults(<last>).pyLabel", pRef_10, pega.findPageWithException("D_CasesFromApplication", "Code-Pega-List"), pzSourceVar9, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.2", "Set D_CasesFromApplication.pxResults(<LAST>).pyLabel", source_3, target_4);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.3", "Set D_CasesFromApplication.pxResults(<LAST>).pxObjClass", source_4, target_5);
// Change obj class
String pz_14 = "Rule-Obj-Class";
ClipboardPage tempPage_1 = tools.createPage(pz_14, "");
ClipboardProperty pz_13 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_7 = null;
try {
ctxt_frame_7 = pega.pushStackFrame("D_CasesFromApplication.pxResults(<LAST>).pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_7.getStepPage();
pz_13 = pega.getViaPropRef(".pxResults(<last>).pxObjClass", pRef_12, pega.findPageWithException("D_CasesFromApplication", "Code-Pega-List"), false, false);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
} // return to previous step page

ClipboardPage targetPage_1 = pz_13.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"2.1.3", "Set D_CasesFromApplication.pxResults(<LAST>).pxObjClass", source_4, target_5);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.4", "Set D_CasesFromApplication.pxResultCount", source_5, target_6);
{
    int pzSourceVar15 = 0;
    pzSourceVar15 = (scalarValueQuery_16.resolveToInt(tools, pega.findPageWithException("D_CasesFromApplication", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) + 1);
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("Embed-Application-WorkMetaData", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pega.setViaPropRef(".pxResultCount", pRef_1, pega.findPageWithException("D_CasesFromApplication", "Code-Pega-List"), pzSourceVar15, "sNY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1.4", "Set D_CasesFromApplication.pxResultCount", source_5, target_6);
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
	"Rule-Obj-Model:PZGETCASESFROMAPPLICATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETCASESFROMAPPLICATION","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-EndUserUI","08-01-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESFROMAPPLICATION #20180713T134931.080 GMT","!PZGETCASESFROMAPPLICATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1212792764)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESFROMAPPLICATION #20180713T134931.080 GMT:20180713T134931.080 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8f61ba594607d664da918e1d0741cb27";
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

public static final String[] pRef_7 = new String[] { "", "", "pxResults", "<append>", "pyClassName", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxResults", "<last>", "pyLabel", "" };
public static final String[] pRef_12 = new String[] { "", "", "pxResults", "<last>", "pxObjClass", "" };
public static final String[] pRef_1 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().pageList("pyWorkMetaData").scalarProperty("pyWorkTypeImplementationClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyShowInNewWorkMenu").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESFROMAPPLICATION #20180713T134931.080 GMT", "Code-Pega-List pzGetCasesFromApplication", "Pega-EndUserUI", "08-01-01", "20180713T134931.080 GMT");
}
