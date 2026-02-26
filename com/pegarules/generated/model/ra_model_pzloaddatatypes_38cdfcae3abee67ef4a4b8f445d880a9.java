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
public class ra_model_pzloaddatatypes_38cdfcae3abee67ef4a4b8f445d880a9 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzLoadDataTypes.Code_Pega_List.Model");
	public ra_model_pzloaddatatypes_38cdfcae3abee67ef4a4b8f445d880a9(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDATATYPES #20180713T135507.316 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"DataTypes"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
String pz_1 = "DataTypes";
ctxt_page_1 = tools.findPage(pz_1, true);
if (ctxt_page_1 == null) {
ctxt_page_1 = tools.findPage(pz_1, false);
ctxt_page_1.putString("pxObjClass", "Rule-");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "DataTypes", ctxt_page_1);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"1", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Start Page-Remove from Remove action
actionProlog(pz_CurrentTraceInfo,"2", "Remove DataTypes", null, null);
{
// Expression: DataTypes
myStepPage = tools.findPage("DataTypes");
if (myStepPage != null) {
ClipboardProperty parentProp = myStepPage.getParentProperty();
if (parentProp != null) {
parentProp.removeFromClipboard();
} else {
myStepPage.removeFromClipboard();
}
}
}
myStepPage = tools.getStepPage();
// End Page-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"2", "Remove DataTypes", null, null);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pxObjClass", source_1, target_1);
// Change obj class
String pz_4 = tools.getParamValue("ObjClass");
ClipboardPage tempPage_1 = tools.createPage(pz_4, "");
ClipboardProperty pz_3 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_3 = null;
try {
ctxt_frame_3 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_3.getStepPage();
pz_3 = propertyQuery_2.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
} // return to previous step page

ClipboardPage targetPage_1 = pz_3.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pxObjClass", source_1, target_1);
// switch step page to scope TARGET
PRStackFrame ctxt_frame_4 = null;
try {
ctxt_frame_4 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_4.getStepPage();
actionProlog(pz_CurrentTraceInfo,"1.2", "Apply Data Transform pyLoadDataTypes", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "Code-Pega-List";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pyLoadDataTypes");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, null);
actionEpilog(pz_CurrentTraceInfo,"1.2", "Apply Data Transform pyLoadDataTypes", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
} // return to previous step page
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_5 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_5 = null;
try {
ctxt_frame_5 = pega.pushStackFrame("D_DataType[ObjClass:param.ObjClass].pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_5.getStepPage();
pz_5 = pega.findDataPage("D_DataType", false, "ObjClass", tools.getParamValue("ObjClass")).getProperty("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
} // return to previous step page

targetProperty_1 = pz_5;
if(!pega.isTraceEnabled(AbstractModel.EVENT_ACTION_BEGIN, pz_CurrentTraceInfo)) {
actionProlog(pz_CurrentTraceInfo,"1.3", "Sort", null, targetProperty_1);
} else {
actionProlog(pz_CurrentTraceInfo,"1.3", "Sort", null, targetProperty_1, new LinkedHashMap() {
{
put(".pyLabel", "ASCENDING");
}
}
);
}
if ((targetProperty_1 != null) && (targetProperty_1.size() > 1)) {
String[] sortKeys_1 = new String[] {  ".pyLabel" };
boolean[] sortOrder_1 = new boolean[] {  true };
String[] sortComparator_1 = new String[] {  ((com.pega.pegarules.priv.PegaAPI)tools).getSortComparisonFunction(targetProperty_1.getPageValue(1).getProperty(".pyLabel")) };
boolean sorted_1 = pega.sortPageList(targetProperty_1, sortKeys_1, sortOrder_1, sortComparator_1);
if (!sorted_1) {
oLog.error("An error occured while sorting the PageList 'D_DataType[ObjClass:param.ObjClass].pxResults' in the DataTransform 'Code-Pega-List.pzLoadDataTypes'.");
}
}

if(!pega.isTraceEnabled(AbstractModel.EVENT_ACTION_END, pz_CurrentTraceInfo)) {
actionEpilog(pz_CurrentTraceInfo,"1.3", "Sort", null, targetProperty_1);
} else {
actionEpilog(pz_CurrentTraceInfo,"1.3", "Sort", null, targetProperty_1, new LinkedHashMap() {
{
put(".pyLabel", "ASCENDING");
}
}
);
}
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
	"Rule-Obj-Model:PZLOADDATATYPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADDATATYPES","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDATATYPES #20180713T135507.316 GMT","!PZLOADDATATYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1737101250)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDATATYPES #20180713T135507.316 GMT:20180713T135507.316 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "576f75f9b1577867f3729bea81d0a125";
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

private static final PropertyQuery propertyQuery_6 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_8 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZLOADDATATYPES #20180713T135507.316 GMT", "Code-Pega-List pzLoadDataTypes", "Pega-Desktop", "08-01-01", "20180713T135507.316 GMT");
}
