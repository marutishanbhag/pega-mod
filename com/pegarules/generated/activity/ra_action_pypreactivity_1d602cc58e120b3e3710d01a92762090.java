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
public class ra_action_pypreactivity_1d602cc58e120b3e3710d01a92762090 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyPreActivity.Pega_ScheduledTask_Search.Action");
	public ra_action_pypreactivity_1d602cc58e120b3e3710d01a92762090(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT	Pega-SearchEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT";
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
if (tools.getPrimaryPage() == null) {
thisStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pyTaskScheduling");
thisStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT Step: 1 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
if (tools.getPrimaryPage() == null) {
thisStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pyTaskScheduling.pyRecurrenceDetails");
thisStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT Step: 2 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_9 = "pyWorkPage";
thisStepPage = tools.findPage(pz_9, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_9, false);
thisStepPage.putString("pxObjClass", "Pega-ScheduledTask-Search");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
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
	"Rule-Obj-Activity:PYPREACTIVITY"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYPREACTIVITY","Rule-Obj-Activity","PEGA-SCHEDULEDTASK-SEARCH",false,"","Pega-SearchEngine","08-01-01","RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT","!PYPREACTIVITY",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-149005377)
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
//	RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT:20180713T132850.751 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "6472a01b0e92f97774827376e23a45ad";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-ScheduledTask-Search";
	}
public String getAspect() {
return "Action";
}
/**
 * set the selected day of week.
 * <p>
 * Step 1 <code>Java</code> [on page .pyTaskScheduling] <br>
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
String dayString = myStepPage.getString(".pySelectedDayOfWeek");
int dayNo=0;
if(!dayString.equals("")){
	dayNo = Integer.parseInt(dayString);
}
for(int i=1;i<=7;i++){
	
	if(i==dayNo){
		myStepPage.getProperty(".pyDay"+i).setValue(true);
	} else{
		myStepPage.getProperty(".pyDay"+i).setValue(false);
	}	
}
java.util.Calendar cal =  java.util.Calendar.getInstance();
ClipboardPage opPage = tools.findPage("OperatorID");
if(opPage != null) {
                   cal = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(opPage.getString("pyDefaultTimeZone")));
} 
long time = cal.getTimeInMillis();
time += (5L* 60L * 1000L);
cal.setTimeInMillis(time);
int minute = cal.get(java.util.Calendar.MINUTE);
int second = cal.get(java.util.Calendar.SECOND);
int hourOfDay = cal.get(java.util.Calendar.HOUR_OF_DAY);
hourOfDay = hourOfDay == 0 ? hourOfDay = 24 : hourOfDay;
myStepPage.putString("pyTimeOfDay", String.valueOf(hourOfDay));
myStepPage.putString("pyMinuteOfHour", String.valueOf(minute));
myStepPage.putString("pySecondOfMinute", String.valueOf(second));
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
 * Set the startdate correctly to the next execution datetime.
 * <p>
 * Step 2 <code>Java</code> [on page .pyTaskScheduling.pyRecurrenceDetails] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
DateTimeUtils dtu = ThreadContainer.get().getDateTimeUtils();
java.util.Calendar cal = java.util.Calendar.getInstance();
ClipboardPage opPage = tools.findPage("OperatorID");
if(opPage != null) {
                   cal = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(opPage.getString("pyDefaultTimeZone")));
} 

String strDateTimeStamp = dtu.getCurrentTimeStamp();
Date currentDate = dtu.getDate(strDateTimeStamp);
cal.setTime(currentDate);

ClipboardPage primary = tools.getPrimaryPage();
int hour = cal.get(java.util.Calendar.HOUR_OF_DAY);
int minute = cal.get(java.util.Calendar.MINUTE);
int selectedHourOfDay = Integer.parseInt(primary.getString(".pyTaskScheduling.pyTimeOfDay"));
int selectedMinute= Integer.parseInt(primary.getString(".pyTaskScheduling.pyMinuteOfHour"));

String recFrequency = primary.getString(".pyTaskScheduling.pyRecFrequency");

if(recFrequency.equals("Daily")){
	if(selectedHourOfDay<=hour){
		cal.add(java.util.Calendar.DATE,1);
	}
}

if(recFrequency.equals("Weekly")){
	int selectedDayOfWeek = Integer.parseInt(primary.getString(".pyTaskScheduling.pySelectedDayOfWeek"));
	int currentDayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
	if(selectedDayOfWeek==currentDayOfWeek){
		if(selectedHourOfDay<=hour){
			cal.add(java.util.Calendar.DATE,7);
		}
	}else{
		cal.set(java.util.Calendar.DAY_OF_WEEK, selectedDayOfWeek);
	}
}
if(recFrequency.equals("Hourly")){
     if(selectedMinute<=minute){
		cal.add(java.util.Calendar.HOUR_OF_DAY,1);
	}
}

Date scheduleStartDate = cal.getTime();
myStepPage.getProperty("pyStartDate").setValue(scheduleStartDate);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Step 3 <code>Property-Set</code> [on page pyWorkPage] <br>
 */
public boolean step3_circum0() {
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
    pega.setViaPropRef(".pxUpdateOperator", pRef_10, myStepPage, scalarValueQuery_11.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_12, myStepPage, com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, PRDateFormat.formatInternalDate(new java.util.Date())), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateSystemID", pRef_13, myStepPage, scalarValueQuery_14.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

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

public String operatorUpdateTime = "";
public String updateSystemID = "";
public String operatorName = "";

public void initializeUserLocalVariables() {
	operatorUpdateTime = "";
	updateSystemID = "";
	operatorName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("operatorUpdateTime", (operatorUpdateTime == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : operatorUpdateTime.toString());
	smRetVal.putString("updateSystemID", (updateSystemID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : updateSystemID.toString());
	smRetVal.putString("operatorName", (operatorName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : operatorName.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_12 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyTaskScheduling", "", "pyRecurrenceDetails", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxUpdateOperator", "" };
public static final String[] pRef_13 = new String[] { "", "", "pxUpdateSystemID", "" };
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pxInsName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().page("pyTaskScheduling").buildPropertyQuery();
private static final PropertyQuery propertyQuery_6 = FUAUtil.createQueryBuilder().page("pyTaskScheduling").ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().page("pyTaskScheduling").page("pyRecurrenceDetails").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pxUpdateSystemID").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGA-SCHEDULEDTASK-SEARCH PYPREACTIVITY #20180713T132850.751 GMT", "Pega-ScheduledTask-Search pyPreActivity", "Pega-SearchEngine", "08-01-01", false, true, "", "ACTIVITY", "20180713T132850.751 GMT" ,"Rule-Obj-Activity"); }
