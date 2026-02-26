package com.pegarules.generated.activity;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
public class ra_action_pzprocesspendingmodels_ff2b1386186bd0363d3c1a07cce4d102 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzProcessPendingModels.PegaAccel_Management_Decision_NLP_CreateModel.Action");
	public ra_action_pzprocesspendingmodels_ff2b1386186bd0363d3c1a07cce4d102(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT	Pega-NLP:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_circum0");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_4 = pega.findPageWithException("InProgressModels", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_4;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_0_circum0");
}
PRStackFrame pz_StackFrame3_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_0 Circum: 0" );
try {
pz_Status = step3_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...
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
	"Rule-Obj-Activity:PZPROCESSPENDINGMODELS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPROCESSPENDINGMODELS","Rule-Obj-Activity","PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL",false,"","Pega-NLP","08-06-01","RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT","!PZPROCESSPENDINGMODELS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",311870772)
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
//	RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT:20201030T085319.446 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e54179cf281d296eaed044de4da06e90";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAccel-Management-Decision-NLP-CreateModel";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Property-Set</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("CurrentTime", PropertyInfo.TYPE_TEXT, PRDateFormat.formatIDT(System.currentTimeMillis()));
}
{
    WaitThreshold = com.pega.pegarules.priv.FUAUtil.parseDouble(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-NLP", "decision/textanalytics/modelbuild/threshold" }));
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Step 2 <code>Obj-Browse</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Data-NLP-Model-BuildStatus
// Expression: 1000
String pz_3 = Integer.toString(1000);
ClipboardPage browsePage = null;
// Expression: InProgressModels
browsePage = tools.findPage("InProgressModels", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "InProgressModels");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Data-NLP-Model-BuildStatus");
browsePage.putString("pyMaxRecords", pz_3);

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "(A OR B) AND C");
contentPage.putString("pyDataSource", "Data-NLP-Model-BuildStatus");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;

//Code for Label : 
selectPage.putString("pyField", ".pyWorkKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pyWorkKey");
browsePage.putString(".pyMapping(1).pyClassName", "Data-NLP-Model-BuildStatus");

//Code for Label : 
selectPage.putString("pyField", ".pyModel");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(2).pyPropertyName", ".pyModel");
browsePage.putString(".pyMapping(2).pyClassName", "Data-NLP-Model-BuildStatus");

//Code for Label : 
selectPage.putString("pyField", ".pzInsKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(3).pyPropertyName", ".pzInsKey");
browsePage.putString(".pyMapping(3).pyClassName", "Data-NLP-Model-BuildStatus");

//Code for Label : 
selectPage.putString("pyField", ".pxUpdateSystemID");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(4).pyPropertyName", ".pxUpdateSystemID");
browsePage.putString(".pyMapping(4).pyClassName", "Data-NLP-Model-BuildStatus");

//Code for Label : A
selectPage.putString("pyField", ".pyStatus");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(5).pyPropertyName", ".pyStatus");
browsePage.putString(".pyMapping(5).pyClassName", "Data-NLP-Model-BuildStatus");
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "A");
paramPage.putString("pyConditionFieldName", ".pyStatus");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", "\"ModelBuildInitiated\"");
paramPage.putString("pyConditionValue1String", "\"ModelBuildInitiated\"");
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : B
paramPage.putString("pyConditionLabel", "B");
paramPage.putString("pyConditionFieldName", ".pyStatus");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", "\"Wait\"");
paramPage.putString("pyConditionValue1String", "\"Wait\"");
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pyBuildID");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(6).pyPropertyName", ".pyBuildID");
browsePage.putString(".pyMapping(6).pyClassName", "Data-NLP-Model-BuildStatus");

//Code for Label : C
selectPage.putString("pyField", ".pxUpdateDateTime");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(7).pyPropertyName", ".pxUpdateDateTime");
browsePage.putString(".pyMapping(7).pyClassName", "Data-NLP-Model-BuildStatus");
paramPage.putString("pyConditionLabel", "C");
paramPage.putString("pyConditionFieldName", ".pxUpdateDateTime");
paramPage.putString("pyConditionOperation", "IsNotNull");
paramPage.putString("pyCondValueCategory", "singlevalue");
contentPage.getProperty("pyParameters").add(paramPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Data-NLP-Model-BuildStatus", "} ", whereClause, sortClause);
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
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Step 3.0 <code>Property-Set</code> [on page InProgressModels.pxResults] <br>
 */
public boolean step3_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    ModelBuildStatusID = scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 3_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_1_circum0");
}
PRStackFrame pz_StackFrame3_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NextLang"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_2_circum0");
}
String pz_6 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame3_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_3_circum0");
}
String pz_7 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_7, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_7, false);
nestedStepPage.putString("pxObjClass", "Data-NLP-Model-BuildStatus");
}
PRStackFrame pz_StackFrame3_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_4_circum0");
}
String pz_8 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame3_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_5_circum0");
}
PRStackFrame pz_StackFrame3_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_6_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_9 = pega.findPageWithException("WaitingModelsForBuildId", (String) null).getIfPresent("pxResults");
nestedPageRef = pz_9;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while (myNestedPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextNestedPage = (ClipboardProperty) myNestedPageList.next();
nestedStepPage = nextNestedPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.6.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_6_0_circum0");
}
PRStackFrame pz_StackFrame3_6_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_6_0 Circum: 0" );
try {
pz_Status = step3_6_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_6_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 3_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_7_circum0");
}
String pz_10 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame3_7_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_8_circum0");
}
PRStackFrame pz_StackFrame3_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Pub"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_9_circum0");
}
PRStackFrame pz_StackFrame3_9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ExitIter"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_10_circum0");
}
PRStackFrame pz_StackFrame3_10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "3.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_0_circum0 definition

/**
 * Step 3.1 <code>Property-Set</code><br>
 */
public boolean step3_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    ModelName = scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    WOKey = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    tools.putParamValue("BuildID", PropertyInfo.TYPE_TEXT, scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("Status", PropertyInfo.TYPE_TEXT, scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("LastUpdatedTime", PropertyInfo.TYPE_TEXT, scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME));
}
{
    MinutesDiff = (pega.<Double>resolveMethodCall("DateTimeDifference--(String,String,String)", "DateTimeDifference", null, null, new Object[] { tools.getParamValue("LastUpdatedTime"), tools.getParamValue("CurrentTime"), "m" })).doubleValue();
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
pz_CurrentStepNum = "3.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_1_circum0 definition

/**
 * Step 3.2 [NextLang] <code>Obj-Open-By-Handle</code> [on page ModelBuildStatus] <br>
 */
public boolean step3_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.MinutesDiff&gt;Local.WaitThreshold");
try {
boolean pz_16 = (BigDecimal.valueOf(MinutesDiff).compareTo(BigDecimal.valueOf(WaitThreshold)) > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.MinutesDiff&gt;Local.WaitThreshold",pz_16);
if (!pz_16) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.MinutesDiff&gt;Local.WaitThreshold " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open-By-Handle", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open-By-Handle
String pz_17 = "ModelBuildStatus";
myStepPage = tools.findPage(pz_17, true);
// Expression: Local.ModelBuildStatusID
// Expression: 
// Obj-Open-By-Handle
try {
	ClipboardPage temp = objOpenByHandle(ModelBuildStatusID, "ModelBuildStatus", "", false, false, false);
	if(temp != null)
		myStepPage = temp;
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open-By-Handle", dbEx);
}} finally {
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
nextBlock = "ExitIter";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ExitIter";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__1) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_2_circum0 definition

/**
 * In progress status.
 * <p>
 * Step 3.3 <code>Property-Set</code> [on page ModelBuildStatus] <br>
 */
public boolean step3_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyStatus", pRef_18, myStepPage, "Failed", "sTN", false, true);
}
{
    tools.putParamValue("FailMessage", PropertyInfo.TYPE_TEXT, "Update model marked as failed as pending for long time");
}
{
    pega.setViaPropRef(".pyMessage", pRef_19, myStepPage, tools.getParamValue("FailMessage"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_20, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "3.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_3_circum0 definition

/**
 * Step 3.4 <code>Obj-Save</code> [on page ModelBuildStatus] <br>
 */
public boolean step3_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Save", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Save
String myPageName = myStepPage.getName();
boolean autoPopulateDisabledStatus = tools.getThread().getDisableAutoPopulate();
try {
tools.getThread().setDisableAutoPopulate(true);tools.getDatabase().save(myStepPage, false, true, false);
} catch (BadInputException bie) {
if (oLog.isDebugEnabled()) oLog.debug("obj-save failed due to an invalid page.", bie);
} catch (PRException pre) {
oLog.error("obj-save failed.", pre);
} finally {
tools.getThread().setDisableAutoPopulate(autoPopulateDisabledStatus);}} finally {
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
nextBlock = "ExitIter";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ExitIter";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__3 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__3) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_4_circum0 definition

/**
 * Exit iteration for wait status.
 * <p>
 * Step 3.5 <code>Obj-Browse</code><br>
 */
public boolean step3_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(Param.Status,\"Wait\")");
try {
boolean pz_21 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("Status"), "Wait" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(Param.Status,\"Wait\")",pz_21);
if (pz_21) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(Param.Status,\"Wait\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Data-NLP-Model-BuildStatus
// Expression: 1000
String pz_22 = Integer.toString(1000);
ClipboardPage browsePage = null;
// Expression: WaitingModelsForBuildId
browsePage = tools.findPage("WaitingModelsForBuildId", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "WaitingModelsForBuildId");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Data-NLP-Model-BuildStatus");
browsePage.putString("pyMaxRecords", pz_22);

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "");
contentPage.putString("pyDataSource", "Data-NLP-Model-BuildStatus");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;

//Code for Label : 
selectPage.putString("pyField", ".pyWorkKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pyWorkKey");
browsePage.putString(".pyMapping(1).pyClassName", "Data-NLP-Model-BuildStatus");
// Expression: Local.ModelName

//Code for Label : 
selectPage.putString("pyField", ".pyModel");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(2).pyPropertyName", ".pyModel");
browsePage.putString(".pyMapping(2).pyClassName", "Data-NLP-Model-BuildStatus");
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyModel");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", ModelName);
paramPage.putString("pyConditionValue1String", ModelName);
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pzInsKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(3).pyPropertyName", ".pzInsKey");
browsePage.putString(".pyMapping(3).pyClassName", "Data-NLP-Model-BuildStatus");

//Code for Label : 
selectPage.putString("pyField", ".pxUpdateSystemID");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(4).pyPropertyName", ".pxUpdateSystemID");
browsePage.putString(".pyMapping(4).pyClassName", "Data-NLP-Model-BuildStatus");

//Code for Label : 
selectPage.putString("pyField", ".pyStatus");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(5).pyPropertyName", ".pyStatus");
browsePage.putString(".pyMapping(5).pyClassName", "Data-NLP-Model-BuildStatus");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyStatus");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", "\"Wait\"");
paramPage.putString("pyConditionValue1String", "\"Wait\"");
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: Param.BuildID

//Code for Label : 
selectPage.putString("pyField", ".pyBuildID");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(6).pyPropertyName", ".pyBuildID");
browsePage.putString(".pyMapping(6).pyClassName", "Data-NLP-Model-BuildStatus");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyBuildID");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", tools.getParamValue("BuildID"));
paramPage.putString("pyConditionValue1String", tools.getParamValue("BuildID"));
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pxUpdateDateTime");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(7).pyPropertyName", ".pxUpdateDateTime");
browsePage.putString(".pyMapping(7).pyClassName", "Data-NLP-Model-BuildStatus");
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Data-NLP-Model-BuildStatus", "} ", whereClause, sortClause);
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
pz_CurrentStepNum = "3.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_5_circum0 definition

/**
 * Step 3.6.0 <code>Property-Set</code> [on page WaitingModelsForBuildId.pxResults] <br>
 */
public boolean step3_6_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    ModelBuildStatusID = scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 3_6_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.6.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_6_1_circum0");
}
String pz_23 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_23, true);
PRStackFrame pz_StackFrame3_6_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_6_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_6_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_6_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_6_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.6.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_6_2_circum0");
}
String pz_24 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_24, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_24, false);
nestedStepPage.putString("pxObjClass", "Data-NLP-Model-BuildStatus");
}
PRStackFrame pz_StackFrame3_6_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_6_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_6_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_6_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_6_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.6.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_6_3_circum0");
}
String pz_25 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_25, true);
PRStackFrame pz_StackFrame3_6_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_6_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_6_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_6_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 3_6_4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3.6.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_6_4_circum0");
}
PRStackFrame pz_StackFrame3_6_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT Step: 3_6_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step3_6_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame3_6_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "3.6.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_6_0_circum0 definition

/**
 * Step 3.6.1 <code>Obj-Open-By-Handle</code> [on page ModelBuildStatus] <br>
 */
public boolean step3_6_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open-By-Handle", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open-By-Handle
String pz_26 = "ModelBuildStatus";
myStepPage = tools.findPage(pz_26, true);
// Expression: Local.ModelBuildStatusID
// Expression: 
// Obj-Open-By-Handle
try {
	ClipboardPage temp = objOpenByHandle(ModelBuildStatusID, "ModelBuildStatus", "", false, false, false);
	if(temp != null)
		myStepPage = temp;
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open-By-Handle", dbEx);
}} finally {
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
nextBlock = "Next";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "Next";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__5 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__5) {
// branch to block Next
nextBlock = "Next";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3.6.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_6_1_circum0 definition

/**
 * In progress status.
 * <p>
 * Step 3.6.2 <code>Property-Set</code> [on page ModelBuildStatus] <br>
 */
public boolean step3_6_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyStatus", pRef_18, myStepPage, "Failed", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyMessage", pRef_19, myStepPage, tools.getParamValue("FailMessage"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_20, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "3.6.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_6_2_circum0 definition

/**
 * Step 3.6.3 <code>Obj-Save</code> [on page ModelBuildStatus] <br>
 */
public boolean step3_6_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Save", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Save
String myPageName = myStepPage.getName();
boolean autoPopulateDisabledStatus = tools.getThread().getDisableAutoPopulate();
try {
tools.getThread().setDisableAutoPopulate(true);tools.getDatabase().save(myStepPage, false, true, false);
} catch (BadInputException bie) {
if (oLog.isDebugEnabled()) oLog.debug("obj-save failed due to an invalid page.", bie);
} catch (PRException pre) {
oLog.error("obj-save failed.", pre);
} finally {
tools.getThread().setDisableAutoPopulate(autoPopulateDisabledStatus);}} finally {
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
nextBlock = "Next";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "Next";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__7 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__7) {
// branch to block Next
nextBlock = "Next";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3.6.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_6_3_circum0 definition

/**
 * Step 3.6.4 [Next] <code>Java</code><br>
 */
public boolean step3_6_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java

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
pz_CurrentStepNum = "3.6.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_6_4_circum0 definition

/**
 * Step 3.7 <code>Obj-Open-By-Handle</code> [on page pyWorkPage] <br>
 */
public boolean step3_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxIsBlank(Local.WOKey)");
try {
boolean pz_27 = (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { WOKey })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsBlank(Local.WOKey)",pz_27);
if (pz_27) {
// branch to block ExitIter
nextBlock = "ExitIter";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxIsBlank(Local.WOKey) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open-By-Handle", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open-By-Handle
String pz_28 = "pyWorkPage";
myStepPage = tools.findPage(pz_28, true);
// Expression: Local.WOKey
// Expression: 
// Obj-Open-By-Handle
try {
	ClipboardPage temp = objOpenByHandle(WOKey, "pyWorkPage", "", false, false, false);
	if(temp != null)
		myStepPage = temp;
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open-By-Handle", dbEx);
}} finally {
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
nextBlock = "ExitIter";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ExitIter";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__9 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "PegaAccel-Management-Decision-NLP-CreateModel");
if (pz__9) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_7_circum0 definition

/**
 * Step 3.8 <code>Call Work-Prediction-TextAnalytics.pxDeletePredictionWOs</code><br>
 */
public boolean step3_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Work-Prediction-TextAnalytics.pxDeletePredictionWOs");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxIsBlank(pyWorkPage.pxCoverInsKey)");
try {
boolean pz_30 = (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsBlank(pyWorkPage.pxCoverInsKey)",pz_30);
if (pz_30) {
// branch to block ExitIter
nextBlock = "ExitIter";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxIsBlank(pyWorkPage.pxCoverInsKey) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Work-Prediction-TextAnalytics.pxDeletePredictionWOs", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Work-Prediction-TextAnalytics.pxDeletePredictionWOs
if (myStepPage == null) {
}
// Calling Activity : Work-Prediction-TextAnalytics.pxDeletePredictionWOs

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: pyWorkPage.pxCoverInsKey
newParamsPage.putParamValue("PredictionInsKey", PropertyInfo.TYPE_TEXT, scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TEXT));
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: true
String pz_31 = String.valueOf(true);
newParamsPage.putParamValue("CanCommit", PropertyInfo.TYPE_TRUEFALSE, pz_31);

pega.invokeActivity(myStepPage, newParamsPage, "pxDeletePredictionWOs", "PegaAccel-Management-Decision-NLP-CreateModel", "Work-Prediction-TextAnalytics");
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
nextBlock = "Pub";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "Pub";
return true;
} finally {
pz_CurrentStepNum = "3.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Work-Prediction-TextAnalytics.pxDeletePredictionWOs",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_8_circum0 definition

/**
 * Step 3.9 [Pub] <code>Call pyPublishPredictionChange</code><br>
 */
public boolean step3_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPublishPredictionChange");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyPublishPredictionChange", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyPublishPredictionChange
if (myStepPage == null) {
}
// Calling Activity : pyPublishPredictionChange

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pyPublishPredictionChange", "PegaAccel-Management-Decision-NLP-CreateModel", "");
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
pz_CurrentStepNum = "3.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPublishPredictionChange",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_9_circum0 definition

/**
 * Step 3.10 [ExitIter] <code>Page-Remove</code><br>
 */
public boolean step3_10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: ModelBuildStatus
pageRemove(tools.findPage("ModelBuildStatus"));
// Expression: InProgressModels
pageRemove(tools.findPage("InProgressModels"));
// Expression: ModelRule
pageRemove(tools.findPage("ModelRule"));
// Expression: pyWorkPage
pageRemove(tools.findPage("pyWorkPage"));
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
pz_CurrentStepNum = "3.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_10_circum0 definition

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

public String ModelName = "";
public String ModelBuildStatusID = "";
public String WOKey = "";
public double WaitThreshold = 0.0;
public double MinutesDiff = 0.0;

public void initializeUserLocalVariables() {
	ModelName = "";
	ModelBuildStatusID = "";
	WOKey = "";
	WaitThreshold = 0.0;
	MinutesDiff = 0.0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("ModelName", (ModelName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : ModelName.toString());
	smRetVal.putString("ModelBuildStatusID", (ModelBuildStatusID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : ModelBuildStatusID.toString());
	smRetVal.putString("WOKey", (WOKey == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : WOKey.toString());
	smRetVal.putString("WaitThreshold", Double.toString(WaitThreshold));
	smRetVal.putString("MinutesDiff", Double.toString(MinutesDiff));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_20 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyMessage", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyStatus", "" };
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pxUpdateDateTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pxCoverInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyStatus").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyBuildID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyModel").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSPENDINGMODELS #20201030T084244.065 GMT", "PegaAccel-Management-Decision-NLP-CreateModel pzProcessPendingModels", "Pega-NLP", "08-06-01", false, true, "", "ACTIVITY", "20201030T085319.446 GMT" ,"Rule-Obj-Activity"); }
