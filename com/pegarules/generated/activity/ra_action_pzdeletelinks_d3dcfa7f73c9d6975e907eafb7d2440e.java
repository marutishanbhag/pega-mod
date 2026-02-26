package com.pegarules.generated.activity;
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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.*;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
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
import com.pegarules.generated.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ra_action_pzdeletelinks_d3dcfa7f73c9d6975e907eafb7d2440e extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzDeleteLinks.Rule_Obj_Activity.Action");
	public ra_action_pzdeletelinks_d3dcfa7f73c9d6975e907eafb7d2440e(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Del"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 10_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_15 = pega.findPageWithException("TempLinkPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_15;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
// we need to check to see if the class of this page is in the list
// of valid pages for this ForEach call.
pz_thisPageClass = thisStepPage.getClassName();
if ( "Link-UseCase".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Link-UseCase").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0_Link_UseCase();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
else{
pz_forEachSkipClass++;
tools.putParamValue("pyForEachSkipClass", Integer.toString(pz_forEachSkipClass));
}
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} 
} catch (ActivityTerminateException ate) {
throw ate; // Terminate all activity processing
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (PRRuntimeException prre) {
if (!pz_methodStatusUpdated) {pega.setThreadPropertyValue(".pxMethodStatus", prre.toString());}
pega.activityStepExceptionHandler(prre, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw prre;
} catch (RuntimeException re) {
pega.setThreadPropertyValue(".pxMethodStatus", re.toString());
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pega.activityEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo);}
}
} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

	public boolean isAllowedInWeb() {
	 return isAllowedInWeb;
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZDELETELINKS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZDELETELINKS","Rule-Obj-Activity","RULE-OBJ-ACTIVITY",false,"","Pega-Desktop","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT","!PZDELETELINKS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1950686686)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT:20180713T135412.124 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ef66e07c87f75d5017494761b89b6a66";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Activity";
	}
public String getAspect() {
return "Action";
}
/**
 * Call update feature link when deleting a rule.
 * <p>
 * Step 7 <code>Call Link-Feature.pxUpdateFeatureRuleLink</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Link-Feature.pxUpdateFeatureRuleLink");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("pyFeaturesToggle", "Rule-Obj-Activity", "Rule-Obj-Activity");
if (!pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Link-Feature.pxUpdateFeatureRuleLink", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Link-Feature.pxUpdateFeatureRuleLink
if (myStepPage == null) {
}
// Calling Activity : Link-Feature.pxUpdateFeatureRuleLink

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: true
String pz_2 = String.valueOf(true);
newParamsPage.putParamValue("SkipCommit", PropertyInfo.TYPE_TRUEFALSE, pz_2);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: param.RuleObjKey
newParamsPage.putParamValue("RuleKey", PropertyInfo.TYPE_TEXT, tools.getParamValue("RuleObjKey"));
// Expression: true
String pz_3 = String.valueOf(true);
newParamsPage.putParamValue("DeleteSourceRules", PropertyInfo.TYPE_TRUEFALSE, pz_3);
// Expression: true
String pz_4 = String.valueOf(true);
newParamsPage.putParamValue("OnlyDelete", PropertyInfo.TYPE_TRUEFALSE, pz_4);

pega.invokeActivity(myStepPage, newParamsPage, "pxUpdateFeatureRuleLink", "Rule-Obj-Activity", "Link-Feature");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Link-Feature.pxUpdateFeatureRuleLink",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Check this is last activity with this name/applies to.
 * <p>
 * Step 8 <code>Obj-Browse</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Rule-Obj-Activity
// Expression: 1
String pz_5 = Integer.toString(1);
ClipboardPage browsePage = null;
// Expression: TempActivityPage
browsePage = tools.findPage("TempActivityPage", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "TempActivityPage");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Rule-Obj-Activity");
browsePage.putString("pyMaxRecords", pz_5);

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "A AND B AND C");
contentPage.putString("pyDataSource", "Rule-Obj-Activity");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: Primary.pyRuleName

//Code for Label : A
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "A");
paramPage.putString("pyConditionFieldName", ".pyRuleName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
paramPage.putString("pyConditionValue1String", scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: Primary.pyClassName

//Code for Label : B
paramPage.putString("pyConditionLabel", "B");
paramPage.putString("pyConditionFieldName", ".pyClassName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", scalarValueQuery_11.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
paramPage.putString("pyConditionValue1String", scalarValueQuery_11.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: param.RuleObjKey

//Code for Label : C
paramPage.putString("pyConditionLabel", "C");
paramPage.putString("pyConditionFieldName", ".pzInsKey");
paramPage.putString("pyConditionOperation", "<>");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", tools.getParamValue("RuleObjKey"));
paramPage.putString("pyConditionValue1String", tools.getParamValue("RuleObjKey"));
contentPage.getProperty("pyParameters").add(paramPage);
selectPage.putString("pyField", "pzPVStream");
contentPage.getProperty("pySelectFields").add(selectPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Rule-Obj-Activity", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
	}
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.generator.RuleNotFoundException rnf) {
// Handle RuleNotFoundException via pyOnException block defined for this step
FUAUtil.activityStepStatusUpdateForException(pega, rnf);
nextBlock = "PR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "PR";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(TempActivityPage.pxResults) &gt; 0");
try {
boolean pz_12 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("TempActivityPage", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(TempActivityPage.pxResults) &gt; 0",pz_12);
if (pz_12) {
// branch to block PR
nextBlock = "PR";
return false;
} else {
// branch to block Del
nextBlock = "Del";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(TempActivityPage.pxResults) &gt; 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step8_circum0 definition

/**
 * Get list of links for deletion.
 * <p>
 * Step 9 [Del] <code>Obj-Browse</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Link-UseCase
ClipboardPage browsePage = null;
// Expression: TempLinkPage
browsePage = tools.findPage("TempLinkPage", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "TempLinkPage");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Link-UseCase");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "A AND B AND C");
contentPage.putString("pyDataSource", "Link-UseCase");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: Primary.pyRuleName

//Code for Label : A
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "A");
paramPage.putString("pyConditionFieldName", ".pxLinkedRefTo");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
paramPage.putString("pyConditionValue1String", scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: Primary.pyClassName

//Code for Label : B
paramPage.putString("pyConditionLabel", "B");
paramPage.putString("pyConditionFieldName", ".pyLinkedClassName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", scalarValueQuery_11.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
paramPage.putString("pyConditionValue1String", scalarValueQuery_11.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: 'Rule-Obj-Activity'

//Code for Label : C
paramPage.putString("pyConditionLabel", "C");
paramPage.putString("pyConditionFieldName", ".pxLinkedClassTo");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", "'Rule-Obj-Activity'");
paramPage.putString("pyConditionValue1String", "'Rule-Obj-Activity'");
contentPage.getProperty("pyParameters").add(paramPage);
selectPage.putString("pyField", "pzPVStream");
contentPage.getProperty("pySelectFields").add(selectPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Link-UseCase", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
	}
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Delete each link.
 * <p>
 * Step 10 <code>Call Delete</code> [on page TempLinkPage.pxResults] <br>
 */
public boolean step10_circum0_Link_UseCase() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Delete");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Delete", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Delete
// Calling Activity : Delete

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", "TempLinkPage.pxResults");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "Delete", "Rule-Obj-Activity", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Delete",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0_Link_UseCase definition

/**
 * Remove Page(s) as cleanup.
 * <p>
 * Step 11 [PR] <code>Page-Remove</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: TempActivityPage
pageRemove(tools.findPage("TempActivityPage"));
// Expression: TempLinkPage
pageRemove(tools.findPage("TempLinkPage"));
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public String nextBlock="";
boolean pz_Status = true;
boolean pz_methodStatusUpdated = false;
private boolean debugIsOn=false;
private int forEachCounter = 0;
private int pz_forEachSkipClass = 0;
private InfEngUtils infEngine = null;
ClipboardProperty nextProperty = null;
String pz_CurrentRuleKey = "";
String pz_CurrentCircumstance = "";
String pz_CurrentStepNum = "";
com.pega.pegarules.priv.tracer.ActivityTraceInfo pz_CurrentTraceInfo = null;
String pz_thisPageClass = "";
Dictionary pz_Dictionary = null;
private static final boolean isAllowedInWeb = true;
String statusReturnedFromNestedLoop = "";

public void initializeStandardLocalVariables() {
	nextBlock="";
	pz_Status = true;
	pz_methodStatusUpdated = false;
	debugIsOn=false;
	forEachCounter = 0;
	pz_forEachSkipClass = 0;
	infEngine = null;
	nextProperty = null;
	pz_CurrentRuleKey = "";
	pz_CurrentCircumstance = "";
	pz_CurrentStepNum = "";
	pz_CurrentTraceInfo = null;
	pz_thisPageClass = "";
	pz_Dictionary = null;
	statusReturnedFromNestedLoop = "";
}


public void initializeUserLocalVariables() {
}


public StringMap snapshotLocalVariables() {
	return null;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZDELETELINKS #20180713T135412.124 GMT", "Rule-Obj-Activity pzDeleteLinks", "Pega-Desktop", "08-01-01", false, true, "", "ACTIVITY", "20180713T135412.124 GMT" ,"Rule-Obj-Activity"); }
