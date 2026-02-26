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
public class ra_model_pzcaserelatedcontent_c8f7d553a1b9228eda0bcf3e285725a4 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzCaseRelatedContent.Code_Pega_List.Model");
	public ra_model_pzcaserelatedcontent_c8f7d553a1b9228eda0bcf3e285725a4(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZCASERELATEDCONTENT #20190503T130518.368 GMT	Pega-EndUserUI:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set .pxResults", source_1, target_1);
{
    ClipboardProperty pzSourceVar1 = pega.findDataPage("D_pxDocumentsList", false, "CaseKey", tools.getParamValue("CaseKey")).getProperty("pxResults");
    ClipboardProperty pzTargetVar2 = pega.getViaPropRef(".pxResults", pRef_3, myStepPage, false, false);
    pzTargetVar2.setValue(pzSourceVar1);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set .pxResults", source_1, target_1);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_6 = myStepPage.getIfPresent("pxResults");
foreach_prop_1 = pz_6;
actionProlog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_6);
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
/* push '".pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults(<CURRENT>)", ctxt_page_target_1);
/* push '".pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", ".pxResults(<CURRENT>)", ctxt_page_source_1);
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
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_6);
// Start Page-Remove from Remove action
actionProlog(pz_CurrentTraceInfo,"3", "Remove D_AttachmentList[LinkRefFrom: Param.CaseKey,IncludeDocAttachments: false]", null, null);
{
pega.removeDataPage("D_AttachmentList", true, "LinkRefFrom", tools.getParamValue("CaseKey"), "IncludeDocAttachments", String.valueOf(false));
}
myStepPage = tools.getStepPage();
// End Page-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"3", "Remove D_AttachmentList[LinkRefFrom: Param.CaseKey,IncludeDocAttachments: false]", null, null);
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_8 = myStepPage.getProperty("pxResults");
targetProperty_1 = pz_8;
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_9 = pega.findDataPage("D_AttachmentList", true, "LinkRefFrom", tools.getParamValue("CaseKey"), "IncludeDocAttachments", String.valueOf(false)).getIfPresent("pxResults");
foreach_prop_2 = pz_9;
actionProlog(pz_CurrentTraceInfo,"4", "Append to", pz_9, targetProperty_1);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"D_AttachmentList[LinkRefFrom: Param.CaseKey,IncludeDocAttachments: false].pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_2;
pop_ctxt_page_3 = pega.pushScopedStepContext("SOURCE", "D_AttachmentList[LinkRefFrom: Param.CaseKey,IncludeDocAttachments: false].pxResults(<CURRENT>)", ctxt_page_target_2);
ClipboardPage sourcePage = null;
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_5 = null;
try {
ctxt_frame_5 = pega.pushStackFrame("Switch to SOURCE for AppendTo", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_5.getStepPage();
sourcePage = myStepPage;
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
} // return to previous step page
targetProperty_1.add(sourcePage);
currentLoopOffset++;
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"4", "Append to", pz_9, targetProperty_1);
ClipboardProperty foreach_prop_3 = null;
ClipboardProperty pz_10 = myStepPage.getIfPresent("pxResults");
foreach_prop_3 = pz_10;
actionProlog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_10);
if (foreach_prop_3 != null) {
Iterator collectionIt = foreach_prop_3.iterator();
int currentLoopOffset = 1;
forEachLoop_3: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_3 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_4 = false;
boolean pop_ctxt_page_5 = false;
try {
/* push '".pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_3 = null;
ctxt_page_target_3 = ctxt_page_3;
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pxResults(<CURRENT>)", ctxt_page_target_3);
/* push '".pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_2 = null;
ctxt_page_source_2 = ctxt_page_3;
pop_ctxt_page_5 = pega.pushScopedStepContext("SOURCE", ".pxResults(<CURRENT>)", ctxt_page_source_2);
switch (forEach_2(currentLoopOffset, foreach_prop_3.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_3;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_5) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_10);
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_11 = myStepPage.getProperty("pxResults");
targetProperty_2 = pz_11;
if(!pega.isTraceEnabled(AbstractModel.EVENT_ACTION_BEGIN, pz_CurrentTraceInfo)) {
actionProlog(pz_CurrentTraceInfo,"6", "Sort", null, targetProperty_2);
} else {
actionProlog(pz_CurrentTraceInfo,"6", "Sort", null, targetProperty_2, new LinkedHashMap() {
{
put(".pzLinkCreateDateTime", "DESCENDING");
}
}
);
}
if ((targetProperty_2 != null) && (targetProperty_2.size() > 1)) {
String[] sortKeys_1 = new String[] {  ".pzLinkCreateDateTime" };
boolean[] sortOrder_1 = new boolean[] {  false };
String[] sortComparator_1 = new String[] {  ((com.pega.pegarules.priv.PegaAPI)tools).getSortComparisonFunction(targetProperty_2.getPageValue(1).getProperty(".pzLinkCreateDateTime")) };
boolean sorted_1 = pega.sortPageList(targetProperty_2, sortKeys_1, sortOrder_1, sortComparator_1);
if (!sorted_1) {
oLog.error("An error occured while sorting the PageList '.pxResults' in the DataTransform 'Code-Pega-List.pzCaseRelatedContent'.");
}
}

if(!pega.isTraceEnabled(AbstractModel.EVENT_ACTION_END, pz_CurrentTraceInfo)) {
actionEpilog(pz_CurrentTraceInfo,"6", "Sort", null, targetProperty_2);
} else {
actionEpilog(pz_CurrentTraceInfo,"6", "Sort", null, targetProperty_2, new LinkedHashMap() {
{
put(".pzLinkCreateDateTime", "DESCENDING");
}
}
);
}
// Start Page-Remove from Remove action
actionProlog(pz_CurrentTraceInfo,"7", "Remove D_pxDocumentsList[CaseKey: Param.CaseKey]", null, null);
{
pega.removeDataPage("D_pxDocumentsList", true, "CaseKey", tools.getParamValue("CaseKey"));
}
myStepPage = tools.getStepPage();
// End Page-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"7", "Remove D_pxDocumentsList[CaseKey: Param.CaseKey]", null, null);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pzLinkCreateDateTime", source_2, target_2);
{
    java.util.Date pzSourceVar18 = (java.util.Date) null;
    PRStackFrame ctxt_frame_10 = null;
    try {
        ctxt_frame_10 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_10.getStepPage();
        pzSourceVar18 = scalarValueQuery_19.resolveToDate(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_10);
    }
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pzLinkCreateDateTime", pRef_20, myStepPage, pzSourceVar18, "sMN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pzLinkCreateDateTime", source_2, target_2);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pzLinkCreateDateTime", source_3, target_3);
{
    String pzSourceVar23 = "";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pzSourceVar23 = scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pzLinkCreateDateTime", pRef_20, myStepPage, pzSourceVar23, "sMN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pzLinkCreateDateTime", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2", "Set .pyUser", source_4, target_4);
{
    String pzSourceVar26 = "";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pzSourceVar26 = scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyUser", pRef_28, myStepPage, pzSourceVar26, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2", "Set .pyUser", source_4, target_4);
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
	"Rule-Obj-Model:PZCASERELATEDCONTENT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCASERELATEDCONTENT","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-EndUserUI","08-03-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZCASERELATEDCONTENT #20190503T130518.368 GMT","!PZCASERELATEDCONTENT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1977362116)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZCASERELATEDCONTENT #20190503T130518.368 GMT:20190515T115657.871 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "0dc310ebb7eaba8d84ccee5abb1d98f4";
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

public static final String[] pRef_3 = new String[] { "", "", "pxResults", "" };
public static final String[] pRef_22 = new String[] { "", "", "pxPages", "Link", "pxCreateDateTime", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyUser", "" };
public static final String[] pRef_20 = new String[] { "", "", "pzLinkCreateDateTime", "" };
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateDateTime").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_12 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "Link").scalarProperty("pxCreateDateTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateOperator").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_14 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZCASERELATEDCONTENT #20190503T130518.368 GMT", "Code-Pega-List pzCaseRelatedContent", "Pega-EndUserUI", "08-03-01", "20190515T115657.871 GMT");
}
