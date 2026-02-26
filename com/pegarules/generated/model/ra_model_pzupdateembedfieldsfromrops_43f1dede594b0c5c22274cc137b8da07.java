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
public class ra_model_pzupdateembedfieldsfromrops_43f1dede594b0c5c22274cc137b8da07 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzUpdateEmbedFieldsFromROPs.Code_Pega_List.Model");
	public ra_model_pzupdateembedfieldsfromrops_43f1dede594b0c5c22274cc137b8da07(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZUPDATEEMBEDFIELDSFROMROPS #20190305T194743.097 GMT	Pega-SystemArchitect:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
ClipboardProperty pz_2 = pega.findPage(tools.getParamValue("FieldsSourcePage"), "Code-Pega-List").getIfPresent("pxResults");
foreach_prop_1 = pz_2;
actionProlog(pz_CurrentTraceInfo,"1", "Append and Map to", pz_2, targetProperty_1);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"FieldsSourcePage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_2;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "FieldsSourcePage.pxResults(<CURRENT>)", ctxt_page_target_1);
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_1.getString("pxObjClass"))) {
	ctxt_page_1.putString("pxObjClass", "Embed-Fields");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_1);
if (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
currentLoopOffset++;
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"1", "Append and Map to", pz_2, targetProperty_1);
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2", "Set .pxTotalResultCount", source_1, target_1);
{
    pega.setViaPropRef(".pxTotalResultCount", pRef_3, myStepPage, scalarValueQuery_4.resolveToString(tools, pega.findPage(tools.getParamValue("FieldsSourcePage"), "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set .pxTotalResultCount", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pxResultCount", source_2, target_2);
{
    pega.setViaPropRef(".pxResultCount", pRef_5, myStepPage, scalarValueQuery_4.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pxResultCount", source_2, target_2);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "When", null, target_3);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "When", null, target_3);
}
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set param.local_propname", source_3, target_4);
{
    String pzSourceVar6 = "";
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Rule-Obj-Property", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pzSourceVar6 = scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("Embed-Fields", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        tools.putParamValue("local_propname", PropertyInfo.TYPE_TEXT, pzSourceVar6);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set param.local_propname", source_3, target_4);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set param.local_classname", source_4, target_5);
{
    String pzSourceVar9 = "";
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("Rule-Obj-Property", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pzSourceVar9 = ((tools.getParamValue("ClassName").equals("")) ? scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : tools.getParamValue("ClassName"));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Embed-Fields", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        tools.putParamValue("local_classname", PropertyInfo.TYPE_TEXT, pzSourceVar9);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set param.local_classname", source_4, target_5);
// switch step page to scope TARGET
PRStackFrame ctxt_frame_11 = null;
try {
ctxt_frame_11 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_11.getStepPage();

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();
pz_param_1.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
pz_param_1.putParamValue("pyIterationType", "embedded");
pz_param_1.putParamValue("pyHowInvoked", "ForEach");
pz_param_1.putParamValue("pyIterationTarget", py_IterationTarget);
// Expression: param.local_classname
pz_param_1.putParamValue("AppliesTo", PropertyInfo.TYPE_TEXT, tools.getParamValue("local_classname"));
// Expression: param.local_propname
pz_param_1.putParamValue("PropertyName", PropertyInfo.TYPE_TEXT, tools.getParamValue("local_propname"));

actionProlog(pz_CurrentTraceInfo,"1.3", "Apply Data Transform pzCreateFieldFromProp", null, null);
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
pz_modelKey_1.putString("pyModelName", "pzCreateFieldFromProp");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"1.3", "Apply Data Transform pzCreateFieldFromProp", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
} // return to previous step page
return CODE_CONTINUE;
}private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxTotalResultCount&gt;0");
try {
boolean pz_12 = (scalarValueQuery_4.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxTotalResultCount&gt;0",pz_12);
return pz_12;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxTotalResultCount&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set D_pzManageExpress.pyCount", source_5, target_6);
{
    pega.setViaPropRef(".pyCount", pRef_13, pega.findPageWithException("D_pzManageExpress", "@baseclass"), scalarValueQuery_4.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sNN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set D_pzManageExpress.pyCount", source_5, target_6);
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
	"Rule-Obj-Model:PZUPDATEEMBEDFIELDSFROMROPS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZUPDATEEMBEDFIELDSFROMROPS","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-SystemArchitect","08-03-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZUPDATEEMBEDFIELDSFROMROPS #20190305T194743.097 GMT","!PZUPDATEEMBEDFIELDSFROMROPS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1531304119)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZUPDATEEMBEDFIELDSFROMROPS #20190305T194743.097 GMT:20190318T194352.911 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "c4a933272cd5e046d15ab4362e1ab6c6";
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

public static final String[] pRef_13 = new String[] { "", "", "pyCount", "" };
public static final String[] pRef_3 = new String[] { "", "", "pxTotalResultCount", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pxTotalResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyPropertyName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZUPDATEEMBEDFIELDSFROMROPS #20190305T194743.097 GMT", "Code-Pega-List pzUpdateEmbedFieldsFromROPs", "Pega-SystemArchitect", "08-03-01", "20190318T194352.911 GMT");
}
