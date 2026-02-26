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
public class ra_action_pzprocessmodelbuild_6e908a18a16d786ad32822007d43033d extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzProcessModelBuild.PegaAccel_Management_Decision_NLP_CreateModel.Action");
	public ra_action_pzprocessmodelbuild_6e908a18a16d786ad32822007d43033d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT	Pega-NLP:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_5 = pega.findPageWithException("InProgressModels", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_5;
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
pz_CurrentStepNum = "4.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_0_circum0");
}
PRStackFrame pz_StackFrame4_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_0 Circum: 0" );
try {
pz_Status = step4_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_0_circum0, false);
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
	"Rule-Obj-Activity:PZPROCESSMODELBUILD"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPROCESSMODELBUILD","Rule-Obj-Activity","PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL",false,"","Pega-NLP","08-06-01","RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT","!PZPROCESSMODELBUILD",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1663880528)
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
//	RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT:20210308T162919.997 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7647d53f8e2932cdfb8f306f28f03b68";
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
    Node = scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_TEXT);
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
 * Step 2 <code>Log-Message</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "pzProcessModelBuild started on Node :" + Local.Node
if( oLog.isDebugEnabled() ){
oLog.debug(("pzProcessModelBuild started on Node :" + Node));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Step 3 <code>Obj-Browse</code><br>
 */
public boolean step3_circum0() {
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
String pz_4 = Integer.toString(1000);
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
browsePage.putString("pyMaxRecords", pz_4);

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
// Expression: Local.Node

//Code for Label : 
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pxUpdateSystemID");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", Node);
paramPage.putString("pyConditionValue1String", Node);
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pyStatus");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(4).pyPropertyName", ".pyStatus");
browsePage.putString(".pyMapping(4).pyClassName", "Data-NLP-Model-BuildStatus");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyStatus");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", "\"ModelBuildInitiated\"");
paramPage.putString("pyConditionValue1String", "\"ModelBuildInitiated\"");
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pyBuildID");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(5).pyPropertyName", ".pyBuildID");
browsePage.putString(".pyMapping(5).pyClassName", "Data-NLP-Model-BuildStatus");
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Step 4.0 <code>Property-Set</code> [on page InProgressModels.pxResults] <br>
 */
public boolean step4_0_circum0() {
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
    ModelBuildStatusID = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    tools.putParamValue("StatusMsg", PropertyInfo.TYPE_TEXT, "");
}
{
    tools.putParamValue("Status", PropertyInfo.TYPE_TEXT, "");
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

// Code to call nested step 4_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_1_circum0");
}
PRStackFrame pz_StackFrame4_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_2_circum0");
}
String pz_7 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame4_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_3_circum0");
}
String pz_8 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame4_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_4_circum0");
}
String pz_9 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_9, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_9, false);
nestedStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
PRStackFrame pz_StackFrame4_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_5_circum0");
}
String pz_10 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame4_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_6_circum0");
}
String pz_11 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_11, true);
PRStackFrame pz_StackFrame4_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_7_circum0");
}
String pz_12 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_12, true);
PRStackFrame pz_StackFrame4_7_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_8_circum0");
}
String pz_13 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_13, true);
PRStackFrame pz_StackFrame4_8_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_9_circum0");
}
String pz_14 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_14, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_14, false);
nestedStepPage.putString("pxObjClass", "Data-NLP-Model-BuildStatus");
}
PRStackFrame pz_StackFrame4_9_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_10_circum0");
}
String pz_15 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_15, true);
PRStackFrame pz_StackFrame4_10_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Complete"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_11_circum0");
}
String pz_16 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_16, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_16, false);
nestedStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
PRStackFrame pz_StackFrame4_11_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_12_circum0");
}
String pz_17 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_17, true);
PRStackFrame pz_StackFrame4_12_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_13_circum0");
}
String pz_18 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_18, true);
PRStackFrame pz_StackFrame4_13_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_14_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_19 = pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel").getIfPresent("pxFlow");
nestedPageRef = pz_19;
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
pz_CurrentStepNum = "4.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_14_circum0");
}
PRStackFrame pz_StackFrame4_14_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_14 Circum: 0" );
try {
pz_Status = step4_14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 4_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_15_circum0");
}
String pz_20 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_20, true);
PRStackFrame pz_StackFrame4_15_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_16_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NextLang"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_16_circum0");
}
String pz_21 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_21, true);
PRStackFrame pz_StackFrame4_16_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_16 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_16_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_17_circum0");
}
String pz_22 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_22, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_22, false);
nestedStepPage.putString("pxObjClass", "Data-NLP-Model-BuildStatus");
}
PRStackFrame pz_StackFrame4_17_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_17 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_17_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_18_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_18_circum0");
}
String pz_23 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_23, true);
PRStackFrame pz_StackFrame4_18_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_18 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_18_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_19_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_19_circum0");
}
PRStackFrame pz_StackFrame4_19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_19 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_19_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_20_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_20_circum0");
}
String pz_24 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_24, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_24, false);
nestedStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
PRStackFrame pz_StackFrame4_20_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_20 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_20_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_20_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_21_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_21_circum0");
}
String pz_25 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_25, true);
PRStackFrame pz_StackFrame4_21_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_21 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_21_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_21_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_22_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ERR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.22";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_22_circum0");
}
String pz_26 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_26, true);
PRStackFrame pz_StackFrame4_22_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_22 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_22_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_22_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_23_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.23";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_23_circum0");
}
String pz_27 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_27, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_27, false);
nestedStepPage.putString("pxObjClass", "Data-NLP-Model-BuildStatus");
}
PRStackFrame pz_StackFrame4_23_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_23 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_23_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_23_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_24_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.24";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_24_circum0");
}
String pz_28 = "ModelBuildStatus";
nestedStepPage = tools.findPage(pz_28, true);
PRStackFrame pz_StackFrame4_24_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_24 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_24_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_24_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_25_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.25";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_25_circum0");
}
PRStackFrame pz_StackFrame4_25_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_25 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_25_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_25_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_26_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.26";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_26_circum0");
}
PRStackFrame pz_StackFrame4_26_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_26 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_26_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_26_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_27_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.27";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_27_circum0");
}
String pz_29 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_29, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_29, false);
nestedStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
PRStackFrame pz_StackFrame4_27_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_27 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_27_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_27_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_28_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.28";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_28_circum0");
}
String pz_30 = "pyWorkPage";
nestedStepPage = tools.findPage(pz_30, true);
PRStackFrame pz_StackFrame4_28_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_28 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_28_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_28_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_29_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ExitIter"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.29";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_29_circum0");
}
PRStackFrame pz_StackFrame4_29_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT Step: 4_29 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_29_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_29_circum0, false);
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
pz_CurrentStepNum = "4.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_0_circum0 definition

/**
 * Step 4.1 <code>Property-Set</code><br>
 */
public boolean step4_1_circum0() {
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
    ModelName = scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    WOKey = scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    tools.putParamValue("BuildID", PropertyInfo.TYPE_TEXT, scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pz_CurrentStepNum = "4.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_1_circum0 definition

/**
 * Step 4.2 <code>Obj-Open-By-Handle</code> [on page pyWorkPage] <br>
 */
public boolean step4_2_circum0() {
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
String pz_34 = "pyWorkPage";
myStepPage = tools.findPage(pz_34, true);
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
nextBlock = "ERR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ERR";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "PegaAccel-Management-Decision-NLP-CreateModel");
if (pz__1) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_2_circum0 definition

/**
 * Get assignment flow action and flow names.
 * <p>
 * Step 4.3 <code>Call pxGetAssignmentFlowActionProp</code> [on page pyWorkPage] <br>
 */
public boolean step4_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxGetAssignmentFlowActionProp");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxGetAssignmentFlowActionProp", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxGetAssignmentFlowActionProp
if (myStepPage == null) {
String pz_35 = "pyWorkPage";
myStepPage = tools.findPage(pz_35, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_35, false);
myStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
}
// Calling Activity : pxGetAssignmentFlowActionProp
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxGetAssignmentFlowActionProp", "PegaAccel-Management-Decision-NLP-CreateModel", "");
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
nextBlock = "ERR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ERR";
return true;
} finally {
pz_CurrentStepNum = "4.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxGetAssignmentFlowActionProp",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_3_circum0 definition

/**
 * Set Params.
 * <p>
 * Step 4.4 <code>Property-Set</code> [on page pyWorkPage] <br>
 */
public boolean step4_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxIsBlank(Param.AssignmentFlowAction)");
try {
boolean pz_36 = (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { tools.getParamValue("AssignmentFlowAction") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsBlank(Param.AssignmentFlowAction)",pz_36);
if (pz_36) {
// branch to block ERR
nextBlock = "ERR";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxIsBlank(Param.AssignmentFlowAction) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    activityName = tools.getParamValue("PreActivityName");
}
{
    tools.putParamValue("CallingFrom", PropertyInfo.TYPE_TEXT, "UpdateAPI");
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
pz_CurrentStepNum = "4.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_4_circum0 definition

/**
 * execute activity.
 * <p>
 * Step 4.5 <code>Java</code> [on page pyWorkPage] <br>
 */
public boolean step4_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.activityName==\"\"");
try {
boolean pz_37 = (activityName.equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.activityName==\"\"",pz_37);
if (pz_37) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.activityName==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage primaryPage=tools.getPrimaryPage();
HashStringMap keys = new HashStringMap();
keys.putString("pxObjClass", "Rule-Obj-Activity");
keys.putString("pyClassName", primaryPage.getClassName());
keys.putString("pyActivityName", activityName);

ParameterPage params = tools.getParameterPage();
tools.doActivity(keys, primaryPage, params);
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
nextBlock = "ERR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ERR";
return true;
} finally {
pz_CurrentStepNum = "4.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_5_circum0 definition

/**
 * Remove properties.
 * <p>
 * Step 4.6 <code>Property-Remove</code> [on page pyWorkPage] <br>
 */
public boolean step4_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pyIsModelProcessCompleted
if (myStepPage == null) {
throw new InvalidReferenceException(".pyIsModelProcessCompleted", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_39 = propertyQuery_38.resolve(tools, myStepPage);
try {if (pz_39!= null) {
pz_39.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 10.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
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
pz_CurrentStepNum = "4.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_6_circum0 definition

/**
 * Call progress bar activity to get status.
 * <p>
 * Step 4.7 <code>Java</code> [on page pyWorkPage] <br>
 */
public boolean step4_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
StringMap keys = new HashStringMap();
keys.put("pyActivityName","pzGetModelProcessStatus");
keys.put("pyClassName","PegaAccel-Management-Decision-NLP-CreateModel");

try{
 // while(!myStepPage.getBoolean("pyIsModelProcessCompleted")){
    myStepPage.getProperty("pyIsModelProcessCompleted").removeFromClipboard();
    ParameterPage param = new ParameterPage();
    param.put("CallingFrom","UpdateAPI");
    tools.doActivity(keys,myStepPage,param);
    //Thread.sleep(1000);
 // }
}catch (Exception e){
  throw new PRRuntimeException("Exception while getting model update progress",e);
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
nextBlock = "ERR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ERR";
return true;
} finally {
pz_CurrentStepNum = "4.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_7_circum0 definition

/**
 * Step 4.8 <code>Obj-Open-By-Handle</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pyWorkPage.pyIsModelProcessCompleted");
try {
boolean pz_41 = scalarValueQuery_40.resolveToBoolean(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TRUEFALSE);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pyWorkPage.pyIsModelProcessCompleted",pz_41);
if (pz_41) {
// branch to block Complete
nextBlock = "Complete";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pyWorkPage.pyIsModelProcessCompleted " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open-By-Handle", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open-By-Handle
String pz_42 = "ModelBuildStatus";
myStepPage = tools.findPage(pz_42, true);
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
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "4.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_8_circum0 definition

/**
 * In progress status.
 * <p>
 * Step 4.9 <code>Property-Set</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyStatus,\"Cancelled\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equals(.pyStatus,\"Cancelled\")", "FUAInstance-NullMyStepPage");
}
boolean pz_44 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Cancelled" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyStatus,\"Cancelled\")",pz_44);
if (pz_44) {
// branch to block ExitIter
nextBlock = "ExitIter";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyStatus,\"Cancelled\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_45, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pyPercentage", pRef_46, myStepPage, scalarValueQuery_47.resolveToString(tools, pega.findPageWithException("D_pzProgressUpdate", "Log-Progress"), ImmutablePropertyInfo.TYPE_DECIMAL), "sTN", false, true);
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
pz_CurrentStepNum = "4.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_9_circum0 definition

/**
 * Step 4.10 <code>Obj-Save</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_10_circum0() {
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
boolean pz__3 = true;
if (pz__3) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_10_circum0 definition

/**
 * If  pyIsModelProcessCompleted continue , else exit.
 * <p>
 * Step 4.11 [Complete] <code>Property-Set</code> [on page pyWorkPage] <br>
 */
public boolean step4_11_circum0() {
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
    tools.putParamValue("flowAction", PropertyInfo.TYPE_TEXT, tools.getParamValue("AssignmentFlowAction"));
}
{
    tools.putParamValue("flowName", PropertyInfo.TYPE_TEXT, tools.getParamValue("AssignmentFlow"));
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
pz_CurrentStepNum = "4.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_11_circum0 definition

/**
 * Resume the Flow.
 * <p>
 * Step 4.12 <code>call ResumeFlow</code> [on page pyWorkPage] <br>
 */
public boolean step4_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call ResumeFlow");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(Param.AssignmentFlowAction!=\"\")&amp;&amp;(Param.AssignmentFlow!=\"\")");
try {
boolean pz_48 = ((!(tools.getParamValue("AssignmentFlowAction").equals(""))) && (!(tools.getParamValue("AssignmentFlow").equals(""))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(Param.AssignmentFlowAction!=\"\")&amp;&amp;(Param.AssignmentFlow!=\"\")",pz_48);
if (!pz_48) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(Param.AssignmentFlowAction!=\"\")&amp;&amp;(Param.AssignmentFlow!=\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call ResumeFlow", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call ResumeFlow
if (myStepPage == null) {
String pz_49 = "pyWorkPage";
myStepPage = tools.findPage(pz_49, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_49, false);
myStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
}
// Calling Activity : ResumeFlow
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "ResumeFlow", "PegaAccel-Management-Decision-NLP-CreateModel", "");
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
nextBlock = "ERR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ERR";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__4 = pega.invokeWhen("hasMessages", "PegaAccel-Management-Decision-NLP-CreateModel", "PegaAccel-Management-Decision-NLP-CreateModel");
if (pz__4) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
boolean pz__6 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "PegaAccel-Management-Decision-NLP-CreateModel");
if (pz__6) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call ResumeFlow",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_12_circum0 definition

/**
 * Log message.
 * <p>
 * Step 4.13 <code>Log-Message</code> [on page pyWorkPage] <br>
 */
public boolean step4_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "NLP MODEL UPDATE API : Task " + Param.AssignmentFlowAction + "Completed for "+ .pzInsKey
if (myStepPage == null) {
throw new InvalidReferenceException("\"NLP MODEL UPDATE API : Task \" + Param.AssignmentFlowAction + \"Completed for \"+ .pzInsKey", "FUAInstance-NullMyStepPage");
}
if( oLog.isDebugEnabled() ){
oLog.debug(((("NLP MODEL UPDATE API : Task " + tools.getParamValue("AssignmentFlowAction")) + "Completed for ") + scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
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
pz_CurrentStepNum = "4.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_13_circum0 definition

/**
 * Set assignment key.
 * <p>
 * Step 4.14 <code>Property-Set</code> [on page pyWorkPage.pxFlow] <br>
 */
public boolean step4_14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(.pxSubscript!=\"pzInternalCaseFlow\")&amp;&amp;.pxAssignmentKey!=\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("(.pxSubscript!=\"pzInternalCaseFlow\")&&.pxAssignmentKey!=\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_52 = ((!(scalarValueQuery_50.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pzInternalCaseFlow"))) && (!(scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(.pxSubscript!=\"pzInternalCaseFlow\")&amp;&amp;.pxAssignmentKey!=\"\"",pz_52);
if (!pz_52) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(.pxSubscript!=\"pzInternalCaseFlow\")&amp;&amp;.pxAssignmentKey!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    AssignmentKey = scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pz_CurrentStepNum = "4.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_14_circum0 definition

/**
 * calling the same activity recursively.
 * <p>
 * Step 4.15 <code>Call pxExecuteModelTask</code> [on page pyWorkPage] <br>
 */
public boolean step4_15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxExecuteModelTask");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.AssignmentKey==\"\"");
try {
boolean pz_53 = (AssignmentKey.equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.AssignmentKey==\"\"",pz_53);
if (pz_53) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzProcessModelBuild - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.AssignmentKey==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxExecuteModelTask", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxExecuteModelTask
if (myStepPage == null) {
String pz_54 = "pyWorkPage";
myStepPage = tools.findPage(pz_54, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_54, false);
myStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
}
// Calling Activity : pxExecuteModelTask
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxExecuteModelTask", "PegaAccel-Management-Decision-NLP-CreateModel", "");
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
nextBlock = "ERR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ERR";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.Status==\"FAIL\"");
try {
boolean pz_55 = (tools.getParamValue("Status").equals("FAIL"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.Status==\"FAIL\"",pz_55);
if (pz_55) {
// branch to block ERR
nextBlock = "ERR";
return false;
} else {
// branch to block NextLang
nextBlock = "NextLang";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.Status==\"FAIL\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxExecuteModelTask",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step4_15_circum0 definition

/**
 * Step 4.16 [NextLang] <code>Obj-Open-By-Handle</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_16_circum0() {
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
String pz_56 = "ModelBuildStatus";
myStepPage = tools.findPage(pz_56, true);
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
boolean pz__8 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__8) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_16_circum0 definition

/**
 * In progress status.
 * <p>
 * Step 4.17 <code>Property-Set</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyStatus,\"Cancelled\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equals(.pyStatus,\"Cancelled\")", "FUAInstance-NullMyStepPage");
}
boolean pz_57 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Cancelled" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyStatus,\"Cancelled\")",pz_57);
if (pz_57) {
// branch to block ExitIter
nextBlock = "ExitIter";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyStatus,\"Cancelled\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyStatus", pRef_58, myStepPage, "Completed", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPercentage", pRef_46, myStepPage, "100", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyAccuracy", pRef_59, myStepPage, scalarValueQuery_60.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pyMessage", pRef_62, myStepPage, (((((("Update model completed for (" + scalarValueQuery_63.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TEXT)) + ",") + scalarValueQuery_64.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TEXT)) + ",") + scalarValueQuery_65.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TEXT)) + ")"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyBuildEndTime", pRef_67, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_45, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "4.17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_17_circum0 definition

/**
 * Step 4.18 <code>Obj-Save</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_18_circum0() {
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
boolean pz__10 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__10) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_18_circum0 definition

/**
 * Step 4.19 <code>Call pyPublishPredictionChange</code><br>
 */
public boolean step4_19_circum0() {
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
pz_CurrentStepNum = "4.19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPublishPredictionChange",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_19_circum0 definition

/**
 * Step 4.20 <code>Property-Set</code> [on page pyWorkPage] <br>
 */
public boolean step4_20_circum0() {
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
    tools.putParamValue("Purpose", PropertyInfo.TYPE_TEXT, scalarValueQuery_63.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("AppliesTo", PropertyInfo.TYPE_TEXT, scalarValueQuery_64.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("Language", PropertyInfo.TYPE_TEXT, scalarValueQuery_65.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pz_CurrentStepNum = "4.20";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_20_circum0 definition

/**
 * Step 4.21 <code>Call pzBuildNextLanguage</code> [on page pyWorkPage] <br>
 */
public boolean step4_21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzBuildNextLanguage");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzBuildNextLanguage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzBuildNextLanguage
if (myStepPage == null) {
String pz_68 = "pyWorkPage";
myStepPage = tools.findPage(pz_68, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_68, false);
myStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
}
// Calling Activity : pzBuildNextLanguage
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzBuildNextLanguage", "PegaAccel-Management-Decision-NLP-CreateModel", "");
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
boolean pz__12 = true;
if (pz__12) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.21";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzBuildNextLanguage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_21_circum0 definition

/**
 * Step 4.22 [ERR] <code>Obj-Open-By-Handle</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_22_circum0() {
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
String pz_69 = "ModelBuildStatus";
myStepPage = tools.findPage(pz_69, true);
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
boolean pz__13 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__13) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.22";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_22_circum0 definition

/**
 * In progress status.
 * <p>
 * Step 4.23 <code>Property-Set</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_23_circum0() {
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
    pega.setViaPropRef(".pyStatus", pRef_58, myStepPage, "Failed", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyMessage", pRef_62, myStepPage, tools.getParamValue("StatusMsg"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyBuildEndTime", pRef_67, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_45, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "4.23";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_23_circum0 definition

/**
 * Step 4.24 <code>Obj-Save</code> [on page ModelBuildStatus] <br>
 */
public boolean step4_24_circum0() {
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
boolean pz__15 = pega.invokeWhen("StepStatusFail", "PegaAccel-Management-Decision-NLP-CreateModel", "Data-NLP-Model-BuildStatus");
if (pz__15) {
// branch to block ExitIter
nextBlock = "ExitIter";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.24";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_24_circum0 definition

/**
 * Step 4.25 <code>Call Work-Prediction-TextAnalytics.pxDeletePredictionWOs</code><br>
 */
public boolean step4_25_circum0() {
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
boolean pz_71 = (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { scalarValueQuery_70.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsBlank(pyWorkPage.pxCoverInsKey)",pz_71);
if (pz_71) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
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
// Expression: true
String pz_72 = String.valueOf(true);
newParamsPage.putParamValue("CanCommit", PropertyInfo.TYPE_TRUEFALSE, pz_72);
// Expression: pyWorkPage.pxCoverInsKey
newParamsPage.putParamValue("PredictionInsKey", PropertyInfo.TYPE_TEXT, scalarValueQuery_70.resolveToString(tools, pega.findPageWithException("pyWorkPage", "PegaAccel-Management-Decision-NLP-CreateModel"), ImmutablePropertyInfo.TYPE_TEXT));
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

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
nextBlock = "Next";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "Next";
return true;
} finally {
pz_CurrentStepNum = "4.25";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Work-Prediction-TextAnalytics.pxDeletePredictionWOs",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_25_circum0 definition

/**
 * Step 4.26 [Next] <code>Call pyPublishPredictionChange</code><br>
 */
public boolean step4_26_circum0() {
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
pz_CurrentStepNum = "4.26";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPublishPredictionChange",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_26_circum0 definition

/**
 * Step 4.27 <code>Property-Set</code> [on page pyWorkPage] <br>
 */
public boolean step4_27_circum0() {
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
    tools.putParamValue("Purpose", PropertyInfo.TYPE_TEXT, scalarValueQuery_63.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("AppliesTo", PropertyInfo.TYPE_TEXT, scalarValueQuery_64.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("Language", PropertyInfo.TYPE_TEXT, scalarValueQuery_65.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pz_CurrentStepNum = "4.27";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_27_circum0 definition

/**
 * Step 4.28 <code>Call pzBuildNextLanguage</code> [on page pyWorkPage] <br>
 */
public boolean step4_28_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzBuildNextLanguage");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxIsBlank(Param.BuildID) || @pxIsBlank(Param.Purpose) || @pxIsBlank(Param.AppliesTo) || @pxIsBlank(Param.Language)");
try {
boolean pz_73 = ((((pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { tools.getParamValue("BuildID") })).booleanValue() || (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { tools.getParamValue("Purpose") })).booleanValue()) || (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { tools.getParamValue("AppliesTo") })).booleanValue()) || (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { tools.getParamValue("Language") })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsBlank(Param.BuildID) || @pxIsBlank(Param.Purpose) || @pxIsBlank(Param.AppliesTo) || @pxIsBlank(Param.Language)",pz_73);
if (pz_73) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxIsBlank(Param.BuildID) || @pxIsBlank(Param.Purpose) || @pxIsBlank(Param.AppliesTo) || @pxIsBlank(Param.Language) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzBuildNextLanguage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzBuildNextLanguage
if (myStepPage == null) {
String pz_74 = "pyWorkPage";
myStepPage = tools.findPage(pz_74, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_74, false);
myStepPage.putString("pxObjClass", "PegaAccel-Management-Decision-NLP-CreateModel");
}
}
// Calling Activity : pzBuildNextLanguage
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzBuildNextLanguage", "PegaAccel-Management-Decision-NLP-CreateModel", "");
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
nextBlock = "ExitIter";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ExitIter";
return true;
} finally {
pz_CurrentStepNum = "4.28";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzBuildNextLanguage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_28_circum0 definition

/**
 * Step 4.29 [ExitIter] <code>Page-Remove</code><br>
 */
public boolean step4_29_circum0() {
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
pz_CurrentStepNum = "4.29";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_29_circum0 definition

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
public String Node = "";
public String activityName = "";
public String WOKey = "";
public String AssignmentKey = "";

public void initializeUserLocalVariables() {
	ModelName = "";
	ModelBuildStatusID = "";
	Node = "";
	activityName = "";
	WOKey = "";
	AssignmentKey = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("ModelName", (ModelName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : ModelName.toString());
	smRetVal.putString("ModelBuildStatusID", (ModelBuildStatusID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : ModelBuildStatusID.toString());
	smRetVal.putString("Node", (Node == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : Node.toString());
	smRetVal.putString("activityName", (activityName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : activityName.toString());
	smRetVal.putString("WOKey", (WOKey == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : WOKey.toString());
	smRetVal.putString("AssignmentKey", (AssignmentKey == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : AssignmentKey.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_45 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_62 = new String[] { "", "", "pyMessage", "" };
public static final String[] pRef_66 = new String[] { "", "", "pyModelDetails", "", "pyLanguageName", "" };
public static final String[] pRef_61 = new String[] { "", "", "pyModelDetails", "", "pyAlgorithmList", "1", "pyAccuracy", "" };
public static final String[] pRef_59 = new String[] { "", "", "pyAccuracy", "" };
public static final String[] pRef_67 = new String[] { "", "", "pyBuildEndTime", "" };
public static final String[] pRef_58 = new String[] { "", "", "pyStatus", "" };
public static final String[] pRef_46 = new String[] { "", "", "pyPercentage", "" };
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarProperty("pxSubscript").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_60 = FUAUtil.createQueryBuilder().page("pyModelDetails").pageList("pyAlgorithmList", 1).scalarProperty("pyAccuracy").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarProperty("pyIsModelProcessCompleted").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_70 = FUAUtil.createQueryBuilder().scalarProperty("pxCoverInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_47 = FUAUtil.createQueryBuilder().scalarProperty("pyPercentComplete").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_65 = FUAUtil.createQueryBuilder().page("pyModelDetails").scalarProperty("pyLanguageName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().scalarProperty("pxAssignmentKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_63 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkKey").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_38 = FUAUtil.createQueryBuilder().scalarProperty("pyIsModelProcessCompleted").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyStatus").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pyBuildID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_64 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pyModel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pxSystemNodeID").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-DECISION-NLP-CREATEMODEL PZPROCESSMODELBUILD #20201030T084244.055 GMT", "PegaAccel-Management-Decision-NLP-CreateModel pzProcessModelBuild", "Pega-NLP", "08-06-01", false, true, "", "ACTIVITY", "20210308T162919.997 GMT" ,"Rule-Obj-Activity"); }
