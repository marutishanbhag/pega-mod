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
public class ra_action_pygetautoupdatepredictions_78bb591e58f44d50611770fd3b271296 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyGetAutoUpdatePredictions.Code_Pega_List.Action");
	public ra_action_pygetautoupdatepredictions_78bb591e58f44d50611770fd3b271296(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT	Pega-NLP:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT";
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_2 = "PredictionsList";
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 3 Circum: 0" );
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
ClipboardProperty pz_6 = pega.findPageWithException("PredictionsList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_6;
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
PRStackFrame pz_StackFrame4_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 4_0 Circum: 0" );
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

// Code to call step 5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_14 = "PredictionsList";
thisStepPage = tools.findPage(pz_14, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
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
	"Rule-Obj-Activity:PYGETAUTOUPDATEPREDICTIONS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYGETAUTOUPDATEPREDICTIONS","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-NLP","08-06-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT","!PYGETAUTOUPDATEPREDICTIONS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",907412453)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT:20200826T090126.826 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "900cc0c57378cb9a7717d6eb351596a0";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Create Prediction List page.
 * <p>
 * Step 1 <code>Page-New</code> [on page PredictionsList] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_3 = "PredictionsList";
myStepPage = tools.findPage(pz_3, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","PredictionsList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("PredictionsList", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Calling report to get list of predictions.
 * <p>
 * Step 2 <code>Call Rule-Obj-Report-Definition.pxRetrieveReportData</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-Obj-Report-Definition.pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-Obj-Report-Definition.pxRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : Rule-Obj-Report-Definition.pxRetrieveReportData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: pyGetPredictionsList
newParamsPage.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pyGetPredictionsList");
// Expression: false
String pz_4 = String.valueOf(false);
newParamsPage.putParamValue("pyUseAlternateDB", PropertyInfo.TYPE_TRUEFALSE, pz_4);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: false
String pz_5 = String.valueOf(false);
newParamsPage.putParamValue("pySkipSummaryProcessing", PropertyInfo.TYPE_TRUEFALSE, pz_5);
// Expression: Work-Prediction-TextAnalytics
newParamsPage.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Work-Prediction-TextAnalytics");
// Expression: PredictionsList
newParamsPage.putParamValue("pyPageName", PropertyInfo.TYPE_INCLUDED_PAGE, "PredictionsList");

pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "Code-Pega-List", "Rule-Obj-Report-Definition");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * filter based on enabled.
 * <p>
 * Step 3 <code>Obj-Filter</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Filter", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Filter
// Expression: PredictionsList
// Expression: Work-Prediction

//Filtering of result set starts here.
ClipboardPage contentPage = tools.findPage("PredictionsList");
if (contentPage == null) {
throw new PRRuntimeException("PredictionsList","this page does not exist and cannot be shown");
}
ParameterPage paramPage = tools.getParameterPage();
ClipboardProperty cp_Results = contentPage.getProperty("pxResults");
for (int i = cp_Results.size(); i >= 1; i--) {
ClipboardPage cp_ResultPage = cp_Results.getPageValue(i);
PRStackFrame resultPage_Frame = pega.pushStackFrame("Obj-Filter", paramPage , cp_ResultPage, false, false);
myStepPage = tools.getStepPage();
try {
boolean resultWhen_0 = pega.invokeWhen("pyEnableAutoUpdateForWorkType", "Code-Pega-List", "Work-Prediction");
if (!(resultWhen_0)) {
cp_Results.remove(i);
}
} finally {
pega.popStackFrame(resultPage_Frame, false);
}
}
contentPage.putString(".pxResultCount", Integer.toString(cp_Results.size()));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Loop through list.
 * <p>
 * Step 4.0 <code>Property-Set</code> [on page PredictionsList.pxResults] <br>
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
    InsKey = scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
String pz_8 = "WorkPrediction";
nestedStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame4_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 4_1 Circum: 0" );
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
String pz_9 = "WorkPrediction";
nestedStepPage = tools.findPage(pz_9, true);
PRStackFrame pz_StackFrame4_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 4_2 Circum: 0" );
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
String pz_10 = "WorkPrediction";
nestedStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame4_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT Step: 4_3 Circum: 0" );
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
 * Open prediction object.
 * <p>
 * Step 4.1 <code>Obj-Open-By-Handle</code> [on page WorkPrediction] <br>
 */
public boolean step4_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open-By-Handle", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open-By-Handle
String pz_11 = "WorkPrediction";
myStepPage = tools.findPage(pz_11, true);
// Expression: Local.InsKey
// Expression: 
// Obj-Open-By-Handle
try {
	ClipboardPage temp = objOpenByHandle(InsKey, "WorkPrediction", "", false, false, false);
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
pz_CurrentStepNum = "4.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_1_circum0 definition

/**
 * Copy prediction into data page.
 * <p>
 * Step 4.2 <code>Page-Copy</code> [on page WorkPrediction] <br>
 */
public boolean step4_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PropertyExists(\"pyupdateConfigurations\")");
try {
boolean pz_12 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { "pyupdateConfigurations" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PropertyExists(\"pyupdateConfigurations\")",pz_12);
if (!pz_12) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PropertyExists(\"pyupdateConfigurations\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_13 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_13;
if (!(targetPage != null && sourcePage != null && targetPage == sourcePage)) {
if (targetPage != null) {
String pageClass = sourcePage != null ? sourcePage.getClassName() : targetPage.getClassName();
targetPage.clear();
targetPage.putString("pxObjClass", pageClass);
}

if ((targetPage != null) && (sourcePage != null)) {
targetPage.putAll(sourcePage, ClipboardPage.PUTALL_KEEPNEW);
targetPage.addMessages(sourcePage);
}
} // end self-ref check;
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
pz_CurrentStepNum = "4.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_2_circum0 definition

/**
 * remove prediction page.
 * <p>
 * Step 4.3 <code>Page-Remove</code> [on page WorkPrediction] <br>
 */
public boolean step4_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
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
pz_CurrentStepNum = "4.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_3_circum0 definition

/**
 * Remove list page.
 * <p>
 * Step 5 <code>Page-Remove</code> [on page PredictionsList] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

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

public String InsKey = "";

public void initializeUserLocalVariables() {
	InsKey = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("InsKey", (InsKey == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : InsKey.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PYGETAUTOUPDATEPREDICTIONS #20200826T090126.826 GMT", "Code-Pega-List pyGetAutoUpdatePredictions", "Pega-NLP", "08-06-01", false, true, "", "ACTIVITY", "20200826T090126.826 GMT" ,"Rule-Obj-Activity"); }
