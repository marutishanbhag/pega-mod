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
public class ra_action_pypurgetextpredictionsnapshots_4b096d3320927d6996afb5f8cb40e604 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyPurgeTextPredictionSnapshots.Data_NLP_Snapshot.Action");
	public ra_action_pypurgetextpredictionsnapshots_4b096d3320927d6996afb5f8cb40e604(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT	Pega-NLP:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
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
	"Rule-Obj-Activity:PYPURGETEXTPREDICTIONSNAPSHOTS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYPURGETEXTPREDICTIONSNAPSHOTS","Rule-Obj-Activity","DATA-NLP-SNAPSHOT",false,"","Pega-NLP","08-06-01","RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT","!PYPURGETEXTPREDICTIONSNAPSHOTS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1827676495)
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
//	RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT:20210106T124315.031 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "15ab833d337776d763ad3c2c5542edca";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-NLP-Snapshot";
	}
public String getAspect() {
return "Action";
}
/**
 * get the purge days for each frequency Daily,Weekly and Monthly from DASS.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//initialise with default values. If DSS settings available then take from DSS.
PurgeAgeinDaysForDailyTextPredictionData = 61;
PurgeAgeinDaysForWeeklyTextPredictionData = 92;
PurgeAgeinDaysForMonthlyTextPredictionData = 366;

try{
  String stringValue_Daily = tools.getSystemSettings().getDynamic("Pega-NLP", "decision/textanalytics/reporting/PurgeAgeinDaysForDailyTextPredictionData");
  String stringValue_Weekly = tools.getSystemSettings().getDynamic("Pega-NLP", "decision/textanalytics/reporting/PurgeAgeinDaysForWeeklyTextPredictionData");
  String stringValue_Monthly = tools.getSystemSettings().getDynamic("Pega-NLP", "decision/textanalytics/reporting/PurgeAgeinDaysForMonthlyTextPredictionData");

  if (stringValue_Daily != null){
    int dassSettingValue_Daily=Integer.parseInt(stringValue_Daily);
    if(dassSettingValue_Daily<0) {
      oLog.error("DASS setting value for PurgeAgeinDaysForDailyTextPredictionData has negative value ");    
    }
    else {
      PurgeAgeinDaysForDailyTextPredictionData= dassSettingValue_Daily;
    }  
  }
  
  if (stringValue_Weekly != null){
    int dassSettingValue_Weekly=Integer.parseInt(stringValue_Weekly);
    if(dassSettingValue_Weekly<0) {
      oLog.error("DASS setting value for PurgeAgeinDaysForWeeklyTextPredictionData has negative value ");    
    }
    else {
      PurgeAgeinDaysForWeeklyTextPredictionData= dassSettingValue_Weekly;
    }  
  }
  
  if (stringValue_Monthly != null){
    int dassSettingValue_Monthly=Integer.parseInt(stringValue_Monthly);
    if(dassSettingValue_Monthly<0) {
      oLog.error("DASS setting value for PurgeAgeinDaysForMonthlyTextPredictionData has negative value ");    
    }
    else {
      PurgeAgeinDaysForMonthlyTextPredictionData= dassSettingValue_Monthly;
    }  
  }
  
}catch(Exception e){
  
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Purge Daily snapshots.
 * <p>
 * Step 2 <code>Call pyPurgeTextPredictionSnapshotData</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPurgeTextPredictionSnapshotData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyPurgeTextPredictionSnapshotData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyPurgeTextPredictionSnapshotData
if (myStepPage == null) {
}
// Calling Activity : pyPurgeTextPredictionSnapshotData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: Daily
newParamsPage.putParamValue("frequency", PropertyInfo.TYPE_TEXT, "Daily");
// Expression: Local.PurgeAgeinDaysForDailyTextPredictionData
String pz_1 = Integer.toString(PurgeAgeinDaysForDailyTextPredictionData);
newParamsPage.putParamValue("retentionDays", PropertyInfo.TYPE_INTEGER, pz_1);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pyPurgeTextPredictionSnapshotData", "Data-NLP-Snapshot", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPurgeTextPredictionSnapshotData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Purge Weekly snapshots.
 * <p>
 * Step 3 <code>Call pyPurgeTextPredictionSnapshotData</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPurgeTextPredictionSnapshotData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyPurgeTextPredictionSnapshotData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyPurgeTextPredictionSnapshotData
if (myStepPage == null) {
}
// Calling Activity : pyPurgeTextPredictionSnapshotData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: Weekly
newParamsPage.putParamValue("frequency", PropertyInfo.TYPE_TEXT, "Weekly");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: Local.PurgeAgeinDaysForWeeklyTextPredictionData
String pz_2 = Integer.toString(PurgeAgeinDaysForWeeklyTextPredictionData);
newParamsPage.putParamValue("retentionDays", PropertyInfo.TYPE_INTEGER, pz_2);

pega.invokeActivity(myStepPage, newParamsPage, "pyPurgeTextPredictionSnapshotData", "Data-NLP-Snapshot", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPurgeTextPredictionSnapshotData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Purge Monthly snapshots.
 * <p>
 * Step 4 <code>Call pyPurgeTextPredictionSnapshotData</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPurgeTextPredictionSnapshotData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyPurgeTextPredictionSnapshotData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyPurgeTextPredictionSnapshotData
if (myStepPage == null) {
}
// Calling Activity : pyPurgeTextPredictionSnapshotData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: Local.PurgeAgeinDaysForMonthlyTextPredictionData
String pz_3 = Integer.toString(PurgeAgeinDaysForMonthlyTextPredictionData);
newParamsPage.putParamValue("retentionDays", PropertyInfo.TYPE_INTEGER, pz_3);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: Monthly
newParamsPage.putParamValue("frequency", PropertyInfo.TYPE_TEXT, "Monthly");

pega.invokeActivity(myStepPage, newParamsPage, "pyPurgeTextPredictionSnapshotData", "Data-NLP-Snapshot", "");
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPurgeTextPredictionSnapshotData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

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

public int PurgeAgeinDaysForWeeklyTextPredictionData = 0;
public int PurgeAgeinDaysForDailyTextPredictionData = 0;
public int PurgeAgeinDaysForYearlyTextPredictionData = 0;
public int PurgeAgeinDaysForMonthlyTextPredictionData = 0;

public void initializeUserLocalVariables() {
	PurgeAgeinDaysForWeeklyTextPredictionData = 0;
	PurgeAgeinDaysForDailyTextPredictionData = 0;
	PurgeAgeinDaysForYearlyTextPredictionData = 0;
	PurgeAgeinDaysForMonthlyTextPredictionData = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("PurgeAgeinDaysForWeeklyTextPredictionData", Integer.toString(PurgeAgeinDaysForWeeklyTextPredictionData));
	smRetVal.putString("PurgeAgeinDaysForDailyTextPredictionData", Integer.toString(PurgeAgeinDaysForDailyTextPredictionData));
	smRetVal.putString("PurgeAgeinDaysForYearlyTextPredictionData", Integer.toString(PurgeAgeinDaysForYearlyTextPredictionData));
	smRetVal.putString("PurgeAgeinDaysForMonthlyTextPredictionData", Integer.toString(PurgeAgeinDaysForMonthlyTextPredictionData));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-NLP-SNAPSHOT PYPURGETEXTPREDICTIONSNAPSHOTS #20210106T124315.031 GMT", "Data-NLP-Snapshot pyPurgeTextPredictionSnapshots", "Pega-NLP", "08-06-01", false, true, "", "ACTIVITY", "20210106T124315.031 GMT" ,"Rule-Obj-Activity"); }
