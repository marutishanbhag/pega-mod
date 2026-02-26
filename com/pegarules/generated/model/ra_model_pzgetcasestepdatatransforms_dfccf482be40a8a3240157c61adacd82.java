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
public class ra_model_pzgetcasestepdatatransforms_dfccf482be40a8a3240157c61adacd82 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzGetCaseStepDataTransforms.Code_Pega_List.Model");
	public ra_model_pzgetcasestepdatatransforms_dfccf482be40a8a3240157c61adacd82(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESTEPDATATRANSFORMS #20230618T001815.207 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_2 = pega.findDataPage("D_pxRuleResolvedRelevantRecords", true, "RecordType", "Rule-Obj-Model", "ContextClass", tools.getParamValue("ContextClass")).getIfPresent("pxResults");
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
/* push '"D_pxRuleResolvedRelevantRecords[ContextClass: param.ContextClass, RecordType: \"Rule-Obj-Model\"].pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("SOURCE", "D_pxRuleResolvedRelevantRecords[ContextClass: param.ContextClass, RecordType: \"Rule-Obj-Model\"].pxResults(<CURRENT>)", ctxt_page_target_1);
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
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_3 = myStepPage.getProperty("pxResults");
targetProperty_2 = pz_3;
if(!pega.isTraceEnabled(AbstractModel.EVENT_ACTION_BEGIN, pz_CurrentTraceInfo)) {
actionProlog(pz_CurrentTraceInfo,"2", "Sort", null, targetProperty_2);
} else {
actionProlog(pz_CurrentTraceInfo,"2", "Sort", null, targetProperty_2, new LinkedHashMap() {
{
put(".pyLabel", "ASCENDING");
}
}
);
}
if ((targetProperty_2 != null) && (targetProperty_2.size() > 1)) {
String[] sortKeys_1 = new String[] {  ".pyLabel" };
boolean[] sortOrder_1 = new boolean[] {  true };
String[] sortComparator_1 = new String[] {  ((com.pega.pegarules.priv.PegaAPI)tools).getSortComparisonFunction(targetProperty_2.getPageValue(1).getProperty(".pyLabel")) };
boolean sorted_1 = pega.sortPageList(targetProperty_2, sortKeys_1, sortOrder_1, sortComparator_1);
if (!sorted_1) {
oLog.error("An error occured while sorting the PageList '.pxResults' in the DataTransform 'Code-Pega-List.pzGetCaseStepDataTransforms'.");
}
}

if(!pega.isTraceEnabled(AbstractModel.EVENT_ACTION_END, pz_CurrentTraceInfo)) {
actionEpilog(pz_CurrentTraceInfo,"2", "Sort", null, targetProperty_2);
} else {
actionEpilog(pz_CurrentTraceInfo,"2", "Sort", null, targetProperty_2, new LinkedHashMap() {
{
put(".pyLabel", "ASCENDING");
}
}
);
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pxResults(<PREPEND>).pyLabel", source_1, target_1);
{
    pega.setViaPropRef(".pxResults(<prepend>).pyLabel", pRef_9, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "Define new Data Transform", "pyCaption", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pxResults(<PREPEND>).pyLabel", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pxResults(1).pyRuleName", source_2, target_2);
{
    pega.setViaPropRef(".pxResults(1).pyRuleName", pRef_10, myStepPage, "CREATE_NEW", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pxResults(1).pyRuleName", source_2, target_2);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

/** Metadata for the rule */
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
	"Rule-Obj-Model:PZGETCASESTEPDATATRANSFORMS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETCASESTEPDATATRANSFORMS","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESTEPDATATRANSFORMS #20230618T001815.207 GMT","!PZGETCASESTEPDATATRANSFORMS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1888671570)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESTEPDATATRANSFORMS #20230618T001815.207 GMT:20230618T001815.207 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ecfa39392197a894becebc6074e6020a";
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

public static final String[] pRef_10 = new String[] { "", "", "pxResults", "1", "pyRuleName", "" };
public static final String[] pRef_9 = new String[] { "", "", "pxResults", "<prepend>", "pyLabel", "" };
private static final PropertyQuery propertyQuery_4 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_6 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZGETCASESTEPDATATRANSFORMS #20230618T001815.207 GMT", "Code-Pega-List pzGetCaseStepDataTransforms", "Pega-ProcessArchitect", "08-23-01", "20230618T001815.207 GMT");
}
