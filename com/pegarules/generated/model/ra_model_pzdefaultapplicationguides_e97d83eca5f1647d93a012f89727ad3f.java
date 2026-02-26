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
public class ra_model_pzdefaultapplicationguides_e97d83eca5f1647d93a012f89727ad3f extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzDefaultApplicationGuides.Rule_Application.Model");
	public ra_model_pzdefaultapplicationguides_e97d83eca5f1647d93a012f89727ad3f(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL RULE-APPLICATION PZDEFAULTAPPLICATIONGUIDES #20180713T141242.462 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set Param.PegaRulesAppName", source_1, target_2);
{
    tools.putParamValue("PegaRulesAppName", PropertyInfo.TYPE_TEXT, "PegaRULES");
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set Param.PegaRulesAppName", source_1, target_2);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set Param.PegaRulesAppVersion", source_2, target_3);
{
    tools.putParamValue("PegaRulesAppVersion", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("pxGetHighestVersionOfAnApplication--(String)", "pxGetHighestVersionOfAnApplication", null, "Utilities", new Object[] { tools.getParamValue("PegaRulesAppName") }));
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set Param.PegaRulesAppVersion", source_2, target_3);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_1 = pega.findDataPage("D_Application", true, "AppVersion", tools.getParamValue("PegaRulesAppVersion"), "AppName", tools.getParamValue("PegaRulesAppName")).getIfPresent("pyGuides");
foreach_prop_1 = pz_1;
actionProlog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_1);
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
/* push '"D_Application[AppName:Param.PegaRulesAppName,AppVersion:Param.PegaRulesAppVersion].pyGuides(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "D_Application[AppName:Param.PegaRulesAppName,AppVersion:Param.PegaRulesAppVersion].pyGuides(<CURRENT>)", ctxt_page_target_1);
/* push '"D_Application[AppName:Param.PegaRulesAppName,AppVersion:Param.PegaRulesAppVersion].pyGuides(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "D_Application[AppName:Param.PegaRulesAppName,AppVersion:Param.PegaRulesAppVersion].pyGuides(<CURRENT>)", ctxt_page_source_1);
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
actionEpilog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_1);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(.pyGuides)==1&amp;&amp;.pyGuides(1).pyLabel==\"\"");
try {
boolean pz_4 = (((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { myStepPage.getProperty("pyGuides") })).intValue() == 1) && (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(.pyGuides)==1&amp;&amp;.pyGuides(1).pyLabel==\"\"",pz_4);
return pz_4;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(.pyGuides)==1&amp;&amp;.pyGuides(1).pyLabel==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"1.2", "Remove .pyGuides(1)", null, null);
// Start Property-Remove from Remove action
{
// Expression: .pyGuides(1)
ClipboardProperty pz_6 = propertyQuery_5.resolve(tools, myStepPage);
try {if (pz_6!= null) {
pz_6.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +".";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
}// End Property-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"1.2", "Remove .pyGuides(1)", null, null);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.1", "When", null, target_4);
switch (when_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.1", "When", null, target_4);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_5 = null;
try {
ctxt_frame_5 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_5.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@IndexInPageList(.pyLabel,\"pyLabel\",Primary.pyGuides) == -1");
try {
boolean pz_8 = ((pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyLabel", tools.getPrimaryPage().getProperty("pyGuides") })).intValue() == ((-1)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@IndexInPageList(.pyLabel,\"pyLabel\",Primary.pyGuides) == -1",pz_8);
return pz_8;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@IndexInPageList(.pyLabel,\"pyLabel\",Primary.pyGuides) == -1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
} // return to previous step page
}private int when_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1.1", "Set Primary.pyGuides(<APPEND>)", source_3, target_5);
{
    ClipboardPage pzSourceVar9 = (ClipboardPage) null;
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Embed-Guide", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pzSourceVar9 = pageQuery_10.resolve(tools, pega.findDataPage("D_Application", false, "AppVersion", tools.getParamValue("PegaRulesAppVersion"), "AppName", tools.getParamValue("PegaRulesAppName")), forEachCounter);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("Embed-Guide", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pega.setViaPropRef(".pyGuides(<append>)", pRef_11, tools.getPrimaryPage(), pzSourceVar9, "S*NEmbed-Guide", false, false);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1.1", "Set Primary.pyGuides(<APPEND>)", source_3, target_5);
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
	"Rule-Obj-Model:PZDEFAULTAPPLICATIONGUIDES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZDEFAULTAPPLICATIONGUIDES","Rule-Obj-Model","RULE-APPLICATION",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-MODEL RULE-APPLICATION PZDEFAULTAPPLICATIONGUIDES #20180713T141242.462 GMT","!PZDEFAULTAPPLICATIONGUIDES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1179472448)
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
//	RULE-OBJ-MODEL RULE-APPLICATION PZDEFAULTAPPLICATIONGUIDES #20180713T141242.462 GMT:20180713T141242.462 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "2bb117021fcfd0915ad2c28e77b85433";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Application";
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

public static final String[] pRef_3 = new String[] { "", "", "pyGuides", "1", "pyLabel", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyGuides", "<append>" };
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_5 = FUAUtil.createQueryBuilder().pageList("pyGuides", 1).ifPresent().buildPropertyQuery();
private static final PageQuery pageQuery_10 = FUAUtil.createQueryBuilder().pageList("pyGuides").buildPageQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().pageList("pyGuides", 1).scalarProperty("pyLabel").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL RULE-APPLICATION PZDEFAULTAPPLICATIONGUIDES #20180713T141242.462 GMT", "Rule-Application pzDefaultApplicationGuides", "Pega-ProcessArchitect", "08-01-01", "20180713T141242.462 GMT");
}
