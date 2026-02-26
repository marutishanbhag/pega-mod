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
import com.pega.pegarules.priv.factory.ThreadLocalStringMapFactoryImpl;
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
public class ra_action_pushdailyusersdata_c73eefd1ee518531390d00ae08b3c25b extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PushDailyUsersData.PegaAESRemote_Interface_UsageData_DailyUsers.Action");
	public ra_action_pushdailyusersdata_c73eefd1ee518531390d00ae08b3c25b(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT	PegaAESRemote:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT";
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
String pz_2 = "AlertPage";
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 1 Circum: 0" );
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
String pz_4 = "AlertData";
thisStepPage = tools.findPage(pz_4, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 2 Circum: 0" );
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
String pz_6 = "AlertPage";
thisStepPage = tools.findPage(pz_6, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_6, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
// all the steps that are defined to be in block :  will be defined with this repeat loop
ClipboardPage myStepPage = tools.getStepPage();
// Expression: 1
// Expression: local.daystoIncFromStartDate
// Expression: 1
if (1 <= 0) {
throw new PRRuntimeException("Invalid increment value - must be a positive integer");}
for (forEachCounter = 1;(forEachCounter <= daystoIncFromStartDate) && (pz_Status == true) && ((nextBlock.equals("")) || (nextBlock.equals("")))
; forEachCounter = forEachCounter + 1)
{
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_0_circum0");
}
PRStackFrame pz_StackFrame14_0_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_0 Circum: 0" );
try {
pz_Status = step14_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
}//close the for loop
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RDFAIL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_62 = "AlertPage";
thisStepPage = tools.findPage(pz_62, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_62, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 17_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RESTFAIL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_63 = "AlertPage";
thisStepPage = tools.findPage(pz_63, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_63, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 18_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PUSHALERT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_64 = "AlertData";
thisStepPage = tools.findPage(pz_64, true);
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 18 Circum: 0" );
try {
pz_Status = step18_circum0();
} finally {
pega.popStackFrame(pz_StackFrame18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 19_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_67 = "DailyAggregatedData";
thisStepPage = tools.findPage(pz_67, true);
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 20_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_circum0");
}
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 20 Circum: 0" );
try {
pz_Status = step20_circum0();
} finally {
pega.popStackFrame(pz_StackFrame20_circum0, false);
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
	"Rule-Obj-Activity:PUSHDAILYUSERSDATA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PUSHDAILYUSERSDATA","Rule-Obj-Activity","PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS",false,"","PegaAESRemote","08-08-01","RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT","!PUSHDAILYUSERSDATA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-465472600)
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
//	RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT:20220729T114254.057 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "9656e7071106aea019aef74e317b1e18";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAESRemote-Interface-UsageData-DailyUsers";
	}
public String getAspect() {
return "Action";
}
/**
 * Creating a new page AlertPage.
 * <p>
 * Step 1 <code>Page-New</code> [on page AlertPage] <br>
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
String pz_3 = "AlertPage";
myStepPage = tools.findPage(pz_3, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","AlertPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("AlertPage", myStepPage);
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
 * Creating a new page AlertPage.
 * <p>
 * Step 2 <code>Page-New</code> [on page AlertData] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_5 = "AlertData";
myStepPage = tools.findPage(pz_5, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-UsageData-DailyUsers","AlertData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("AlertData", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Creating a parameter for Alerts.
 * <p>
 * Step 3 <code>Property-Set</code> [on page AlertPage] <br>
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
{
    tools.putParamValue("alertJson", PropertyInfo.TYPE_TEXT, "");
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

/**
 * Continue with processing only if production level is 5.
 * <p>
 * Step 4 <code>Call WaitRandomTime</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call WaitRandomTime");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("IsLicenseUsageDataCapturingEnabled", "PegaAESRemote-Interface-UsageData-DailyUsers", "PegaAESRemote-Interface-UsageData-DailyUsers");
if (!pz__1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PushDailyUsersData - Precondition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call WaitRandomTime", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call WaitRandomTime
if (myStepPage == null) {
}
// Calling Activity : WaitRandomTime

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: PushDailyUsersData
newParamsPage.putParamValue("MainActivity", PropertyInfo.TYPE_TEXT, "PushDailyUsersData");

pega.invokeActivity(myStepPage, newParamsPage, "WaitRandomTime", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call WaitRandomTime",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Set pdcServiceURL.
 * <p>
 * Step 5 <code>Property-Set</code><br>
 */
public boolean step5_circum0() {
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
    tools.putParamValue("pdcServiceURL", PropertyInfo.TYPE_TEXT, "PegaAES/v1/LogDailyActiveUsersData");
}
{
    tools.putParamValue("servicename", PropertyInfo.TYPE_TEXT, "PushDailyUsersData");
}
{
    tools.putParamValue("message", PropertyInfo.TYPE_TEXT, "PegaAESRemote : Push Daily Users Data Info message is");
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Get the End point URL; exit if it is blank.
 * <p>
 * Step 6 <code>Property-Set</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"");
try {
boolean pz_8 = (pega.<String>resolveMethodCall("trim--(String)", "trim", null, null, new Object[] { scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT) }).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"",pz_8);
if (pz_8) {
// branch to block PR
nextBlock = "PR";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("endpointurl", PropertyInfo.TYPE_TEXT, scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT));
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
boolean pz__3 = true;
// preceding conditional evaluated for side-effects only
// specified "when true" and "when false" options have no effect on flow of control
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Find the appenders. If the node connected to AES or not.
 * <p>
 * Step 7 <code>Call CheckAESConnection</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call CheckAESConnection", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call CheckAESConnection
if (myStepPage == null) {
}
// Calling Activity : CheckAESConnection
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "CheckAESConnection", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.SkipThisRun==\"true\"");
try {
boolean pz_10 = (tools.getParamValue("SkipThisRun").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.SkipThisRun==\"true\"",pz_10);
if (pz_10) {
// branch to block PR
nextBlock = "PR";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.SkipThisRun==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Set the DSS and ruleset in local variables for reuse.
 * <p>
 * Step 8 <code>Property-Set</code><br>
 */
public boolean step8_circum0() {
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
    aesruleset = "PegaAESRemote";
}
{
    chunklimitdss = "pega/analytics/chunklimit";
}
{
    lastrundatedss = "pega/analytics/usersagentlastrundate";
}
{
    userDataThreshold = "pega/analytics/userdatathreshold";
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
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Save DSS if it doesn't exist.
 * <p>
 * Step 9 <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.userDataThreshold,\"\")");
try {
boolean pz_11 = (pega.<Boolean>resolveMethodCall("pxRecordExists--(String,String,String,String)", "pxRecordExists", null, null, new Object[] { "Data-Admin-System-Settings", aesruleset, userDataThreshold, "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.userDataThreshold,\"\")",pz_11);
if (pz_11) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.userDataThreshold,\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: local.userDataThreshold
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, userDataThreshold);
// Expression: local.aesruleset
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, aesruleset);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: 25000
String pz_12 = Integer.toString(25000);
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, pz_12);

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Save DSS if it doesn't exist.
 * <p>
 * Step 10 <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.userDataThreshold,\"\")");
try {
boolean pz_13 = (pega.<Boolean>resolveMethodCall("pxRecordExists--(String,String,String,String)", "pxRecordExists", null, null, new Object[] { "Data-Admin-System-Settings", aesruleset, userDataThreshold, "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.userDataThreshold,\"\")",pz_13);
if (pz_13) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.userDataThreshold,\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: 500
String pz_14 = Integer.toString(500);
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, pz_14);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: local.chunklimitdss
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, chunklimitdss);
// Expression: local.aesruleset
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, aesruleset);

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Initialize chunk limt, chunk count, latest run date, customerid and deploymentname.
 * <p>
 * Step 11 <code>Property-Set</code><br>
 */
public boolean step11_circum0() {
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
    chunklimit = com.pega.pegarules.priv.FUAUtil.parseInt(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { aesruleset, chunklimitdss }));
}
{
    chunklimit = ((chunklimit == 0) ? 500 : chunklimit);
}
{
    chunkcount = 0;
}
{
    rundate = PRDateFormat.formatInternalDate(new java.util.Date());
}
{
    islastpublishsuccess = true;
}
{
    customerid = scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    deploymentname = scalarValueQuery_16.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    deploymentTopology = scalarValueQuery_17.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    platformVersion = scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    productionLevel = scalarValueQuery_19.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_INTEGER);
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
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Step 12 <code>Property-Set</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__4 = pega.invokeWhen("pzIsPegaCloud", "PegaAESRemote-Interface-UsageData-DailyUsers", "PegaAESRemote-Interface-UsageData-DailyUsers");
if (!pz__4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    deploymentTopology = "PegaCloud";
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Set params for RD.
 * <p>
 * Step 13 <code>Property-Set</code><br>
 */
public boolean step13_circum0() {
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
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Log-License-Usage-Hourly");
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "AggregateDailyUsageCountFromHourlyData");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "DailyAggregatedData");
}
{
    tools.putParamValue("lastSuccessfulRunDate", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { aesruleset, lastrundatedss }));
}
{
    loopinc = 1;
}
{
    tools.putParamValue("lastSuccessfulRunDate", PropertyInfo.TYPE_TEXT, (((((pega.<Integer>resolveMethodCall("length--(String)", "length", null, null, new Object[] { tools.getParamValue("lastSuccessfulRunDate") })).intValue()) != 0) ? true : false) ? tools.getParamValue("lastSuccessfulRunDate") : pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { PRDateFormat.formatInternalDate(new java.util.Date()), Integer.toString(((-14))), Integer.toString(0), Integer.toString(0), Integer.toString(0) })));
}
{
    threshold = com.pega.pegarules.priv.FUAUtil.parseInt(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { aesruleset, userDataThreshold }));
}
{
    threshold = ((threshold > 0) ? threshold : 25000);
}
{
    daystoIncFromStartDate = FUAUtil.intValue((pega.<Double>resolveMethodCall("DateTimeDifference--(String,String,String)", "DateTimeDifference", null, null, new Object[] { pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { tools.getParamValue("lastSuccessfulRunDate"), Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0) }), PRDateFormat.formatIDT(System.currentTimeMillis()), "D" })).doubleValue());
}
{
    tools.putParamValue("EndDate", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getTimeStampAsDateStamp--(String)", "getTimeStampAsDateStamp", null, null, new Object[] { pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { tools.getParamValue("lastSuccessfulRunDate"), Integer.toString(1), Integer.toString(0), Integer.toString(0), Integer.toString(0) }) }));
}
{
    tools.putParamValue("lastSuccessfulRunDate", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getTimeStampAsDateStamp--(String)", "getTimeStampAsDateStamp", null, null, new Object[] { tools.getParamValue("lastSuccessfulRunDate") }));
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Step 14.0 <code>Java</code><br>
 */
public boolean step14_0_circum0() {
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
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 14_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_1_circum0");
}
PRStackFrame pz_StackFrame14_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_2_circum0");
}
String pz_20 = "RDPage";
nestedStepPage = tools.findPage(pz_20, true);
PRStackFrame pz_StackFrame14_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_3_circum0");
}
String pz_21 = "AlertPage";
nestedStepPage = tools.findPage(pz_21, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_21, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame14_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_4_circum0");
}
PRStackFrame pz_StackFrame14_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_5_circum0");
}
String pz_22 = "RDPage";
nestedStepPage = tools.findPage(pz_22, true);
PRStackFrame pz_StackFrame14_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_0_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("LOOP"))) {
nextBlock = "";
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_23 = pega.findPageWithException("DailyAggregatedData", "PegaAESRemote-Interface-UsageData-DailyUsers").getIfPresent("pxResults");
nestedPageRef = pz_23;
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
// we need to check to see if the class of this page is in the list
// of valid pages for this ForEach call.
pz_thisPageClass = nestedStepPage.getClassName();
if ( "Log-License-Usage-Hourly".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Log-License-Usage-Hourly").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("LOOP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_0_circum0");
}
PRStackFrame pz_StackFrame14_6_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_0 Circum: 0" );
try {
pz_Status = step14_6_0_circum0_Log_License_Usage_Hourly();
} finally {
pega.popStackFrame(pz_StackFrame14_6_0_circum0, false);
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
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 14_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_7_circum0");
}
PRStackFrame pz_StackFrame14_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_8_circum0");
}
PRStackFrame pz_StackFrame14_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_8_circum0, false);
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
pz_CurrentStepNum = "14.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_0_circum0 definition

/**
 * Set params for RD.
 * <p>
 * Step 14.1 <code>Property-Set</code><br>
 */
public boolean step14_1_circum0() {
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
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Log-License-Usage-Hourly");
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "AggregateDailyUsageCountFromHourlyData");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "DailyAggregatedData");
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
pz_CurrentStepNum = "14.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_1_circum0 definition

/**
 * Step 14.2 <code>Call pxRetrieveReportData</code> [on page RDPage] <br>
 */
public boolean step14_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxRetrieveReportData");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxRetrieveReportData
if (myStepPage == null) {
String pz_24 = "RDPage";
myStepPage = tools.findPage(pz_24, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_24, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Report-Definition");
}
}
// Calling Activity : pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
nextBlock = "RDFAIL";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "RDFAIL";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__6 = pega.invokeWhen("StepStatusFail", "PegaAESRemote-Interface-UsageData-DailyUsers", "Rule-Obj-Report-Definition");
if (pz__6) {
// branch to block RDFAIL
nextBlock = "RDFAIL";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_2_circum0 definition

/**
 * Alert message for exceeding threshold.
 * <p>
 * Step 14.3 <code>Property-Set</code> [on page AlertPage] <br>
 */
public boolean step14_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "DailyAggregatedData.pxResults(1).pySummaryCount(1)&gt;local.threshold");
try {
boolean pz_27 = (scalarValueQuery_25.resolveToInt(tools, pega.findPageWithException("DailyAggregatedData", "PegaAESRemote-Interface-UsageData-DailyUsers"), ImmutablePropertyInfo.TYPE_INTEGER) > threshold);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "DailyAggregatedData.pxResults(1).pySummaryCount(1)&gt;local.threshold",pz_27);
if (!pz_27) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("DailyAggregatedData.pxResults(1).pySummaryCount(1)&gt;local.threshold " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).AlertMessage", pRef_28, pega.findPageWithException("AlertPage", "Code-Pega-List"), (((((((("The user data has " + scalarValueQuery_25.resolveToString(tools, pega.findPageWithException("DailyAggregatedData", "PegaAESRemote-Interface-UsageData-DailyUsers"), ImmutablePropertyInfo.TYPE_INTEGER)) + " records for ") + pega.<String>resolveMethodCall("FormatDateTime--(String,String,String,String)", "FormatDateTime", null, null, new Object[] { (tools.getParamValue("lastSuccessfulRunDate") + "T000000.000"), "MMMM dd,yyyy", null, null })) + " which is exceeding the threshold limit of ") + Integer.toString(threshold)) + ". Only ") + Integer.toString(threshold)) + " records will be pushed to PDC"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).TypeOfFeed", pRef_29, pega.findPageWithException("AlertPage", "Code-Pega-List"), "User feed", "sTN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("alertJson", PropertyInfo.TYPE_TEXT, ((!(tools.getParamValue("alertJson").equals(""))) ? ((tools.getParamValue("alertJson") + ",") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" })) : (tools.getParamValue("alertJson") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" }))));
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
pz_CurrentStepNum = "14.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_3_circum0 definition

/**
 * Set params for RD.
 * <p>
 * Step 14.4 <code>Property-Set</code><br>
 */
public boolean step14_4_circum0() {
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
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Log-License-Usage-Hourly");
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "AggregateDailyUsageFromHourlyData");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "DailyAggregatedData");
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
pz_CurrentStepNum = "14.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_4_circum0 definition

/**
 * Step 14.5 <code>Call pxRetrieveReportData</code> [on page RDPage] <br>
 */
public boolean step14_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxRetrieveReportData");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxRetrieveReportData
if (myStepPage == null) {
String pz_30 = "RDPage";
myStepPage = tools.findPage(pz_30, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_30, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Report-Definition");
}
}
// Calling Activity : pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
nextBlock = "RDFAIL";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "RDFAIL";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__8 = pega.invokeWhen("StepStatusFail", "PegaAESRemote-Interface-UsageData-DailyUsers", "Rule-Obj-Report-Definition");
if (pz__8) {
// branch to block RDFAIL
nextBlock = "RDFAIL";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_5_circum0 definition

/**
 * Step 14.6.0 [LOOP] <code>Java</code> [on page DailyAggregatedData.pxResults] <br>
 */
public boolean step14_6_0_circum0_Log_License_Usage_Hourly() {
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
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 14_6_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_1_circum0");
}
String pz_31 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_31, true);
PRStackFrame pz_StackFrame14_6_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_2_circum0");
}
PRStackFrame pz_StackFrame14_6_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SET"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_3_circum0");
}
PRStackFrame pz_StackFrame14_6_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_4_circum0");
}
PRStackFrame pz_StackFrame14_6_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_5_circum0");
}
String pz_32 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_32, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_32, false);
nestedStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData-DailyUsers");
}
PRStackFrame pz_StackFrame14_6_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_6_circum0");
}
String pz_33 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_33, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_33, false);
nestedStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData-DailyUsers");
}
PRStackFrame pz_StackFrame14_6_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_7_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
// all the steps that are defined to be in block :  will be defined with this repeat loop
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
for (forEachCounter = 1;(forEachCounter <= 3) && (pz_Status == true) && ((nextBlock.equals("")) || (nextBlock.equals("")))
; forEachCounter = forEachCounter + 1)
{
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.7.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_7_0_circum0");
}
PRStackFrame pz_StackFrame14_6_7_0_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_7_0 Circum: 0" );
try {
pz_Status = step14_6_7_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_6_7_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
}//close the for loop
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 14_6_8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR1"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_8_circum0");
}
String pz_34 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_34, true);
PRStackFrame pz_StackFrame14_6_8_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_8_circum0, false);
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
pz_CurrentStepNum = "14.6.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_0_circum0_Log_License_Usage_Hourly definition

/**
 * Create a new page for each chunk.
 * <p>
 * Step 14.6.1 <code>Page-New</code> [on page DailyUsageData] <br>
 */
public boolean step14_6_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.chunkcount==0");
try {
boolean pz_35 = (chunkcount == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.chunkcount==0",pz_35);
if (!pz_35) {
// branch to block SET
nextBlock = "SET";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.chunkcount==0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_36 = "DailyUsageData";
myStepPage = tools.findPage(pz_36, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-UsageData-DailyUsers","DailyUsageData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DailyUsageData", myStepPage);
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
pz_CurrentStepNum = "14.6.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_1_circum0 definition

/**
 * Set the customer ID, deployment name and deployment topology for every new chunk.
 * <p>
 * Step 14.6.2 <code>Property-Set</code><br>
 */
public boolean step14_6_2_circum0() {
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
    pega.setViaPropRef(".pxCustomerID", pRef_37, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), customerid, "sTY", false, true);
}
{
    pega.setViaPropRef(".pxDeploymentName", pRef_38, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), deploymentname, "sTY", false, true);
}
{
    pega.setViaPropRef(".pxDeploymentTopology", pRef_39, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), deploymentTopology, "sTY", false, true);
}
{
    pega.setViaPropRef(".pxPlatformVersion", pRef_40, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), platformVersion, "sTY", false, true);
}
{
    pega.setViaPropRef(".pyCategory", pRef_41, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), productionLevel, "sTN", false, true);
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
pz_CurrentStepNum = "14.6.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_2_circum0 definition

/**
 * Increase the chunk count by 1; Set application name, usage day, active users count, interactions count and invocations count.
 * <p>
 * Step 14.6.3 [SET] <code>Property-Set</code><br>
 */
public boolean step14_6_3_circum0() {
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
    chunkcount = (chunkcount + 1);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pxApplication", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pxApplication", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_42.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pyAccessGroup", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pyAccessGroup", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pyUser", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pyUser", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), pega.<String>resolveMethodCall("pyGetMD5Hash--(String)", "pyGetMD5Hash", null, "Utilities", new Object[] { scalarValueQuery_44.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pzUserType", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pzUserType", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_45.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pyTempDate", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pyTempDate", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATE), "sDN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pzInteractionCount", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pzInteractionCount", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_47.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pzInvocationCount", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pzInvocationCount", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_48.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pzMayCheckOutRules", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pzMayCheckOutRules", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_49.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pzModifiedRulesCount", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pzModifiedRulesCount", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_50.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pzNoInvocationFlowCount", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pzNoInvocationFlowCount", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_51.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pyTempInteger", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pyTempInteger", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_52.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + chunkcount + ").pzUsageHoursCount", new String[] { "", "", "pxResults", String.valueOf(chunkcount), "pzUsageHoursCount", "" }, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), scalarValueQuery_53.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
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
pz_CurrentStepNum = "14.6.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_3_circum0 definition

/**
 * If the list size reaches the chunk limit then reset the chunk count and push the data.
 * <p>
 * Step 14.6.4 <code>Property-Set</code><br>
 */
public boolean step14_6_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(local.chunkcount==local.chunklimit)||(Param.pyForEachCount==@SizeOfPropertyList(DailyAggregatedData.pxResults))");
try {
boolean pz_54 = ((chunkcount == chunklimit) || (tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount") == (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { pega.findPageWithException("DailyAggregatedData", "PegaAESRemote-Interface-UsageData-DailyUsers").getProperty("pxResults") })).intValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(local.chunkcount==local.chunklimit)||(Param.pyForEachCount==@SizeOfPropertyList(DailyAggregatedData.pxResults))",pz_54);
if (!pz_54) {
// branch to block LOOP
nextBlock = "LOOP";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(local.chunkcount==local.chunklimit)||(Param.pyForEachCount==@SizeOfPropertyList(DailyAggregatedData.pxResults)) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    chunkcount = 0;
}
{
    tools.putParamValue("executionMode", PropertyInfo.TYPE_TEXT, "SERIALIZE");
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
pz_CurrentStepNum = "14.6.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_4_circum0 definition

/**
 * Get daily users data JSON.
 * <p>
 * Step 14.6.5 <code>Apply-DataTransform</code> [on page DailyUsageData] <br>
 */
public boolean step14_6_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: DailyAggregatedUserData
ParameterPage stepParams__1= null;/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "PegaAESRemote-Interface-UsageData-DailyUsers";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "DailyAggregatedUserData");
tools.applyModel(myStepPage, params__1, stepParams__1);
ThreadLocalStringMapFactoryImpl.getFactory().release(params__1);
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
pz_CurrentStepNum = "14.6.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_5_circum0 definition

/**
 * Set to pyNote.
 * <p>
 * Step 14.6.6 <code>Property-Set</code> [on page DailyUsageData] <br>
 */
public boolean step14_6_6_circum0() {
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
    pega.setViaPropRef(".pyNote", pRef_55, myStepPage, tools.getParamValue("jsonData"), "sTN", false, true);
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
pz_CurrentStepNum = "14.6.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_6_circum0 definition

/**
 * Push daily users data; retry 3 times if the REST call fails.
 * <p>
 * Step 14.6.7.0 <code>Java</code><br>
 */
public boolean step14_6_7_0_circum0() {
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
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 14_6_7_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.7.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_7_1_circum0");
}
String pz_56 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_56, true);
PRStackFrame pz_StackFrame14_6_7_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_7_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_7_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_7_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_7_2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ERR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6.7.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_7_2_circum0");
}
PRStackFrame pz_StackFrame14_6_7_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT Step: 14_6_7_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_7_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_7_2_circum0, false);
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
pz_CurrentStepNum = "14.6.7.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_7_0_circum0 definition

/**
 * Push users data JSON.
 * <p>
 * Step 14.6.7.1 <code>Call PegaAESRemote-Interface-.PDCRestPush</code> [on page DailyUsageData] <br>
 */
public boolean step14_6_7_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PegaAESRemote-Interface-.PDCRestPush");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call PegaAESRemote-Interface-.PDCRestPush", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call PegaAESRemote-Interface-.PDCRestPush
if (myStepPage == null) {
String pz_57 = "DailyUsageData";
myStepPage = tools.findPage(pz_57, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_57, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData-DailyUsers");
}
}
// Calling Activity : PegaAESRemote-Interface-.PDCRestPush
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "PDCRestPush", "PegaAESRemote-Interface-UsageData-DailyUsers", "PegaAESRemote-Interface-");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyHTTPResponseCode==200");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyHTTPResponseCode==200", "FUAInstance-NullMyStepPage");
}
boolean pz_59 = (scalarValueQuery_58.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) == 200);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyHTTPResponseCode==200",pz_59);
if (pz_59) {
// branch to block PR1
nextBlock = "PR1";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyHTTPResponseCode==200 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14.6.7.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PegaAESRemote-Interface-.PDCRestPush",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_7_1_circum0 definition

/**
 * If rest call fails 3 times then exit iteration.
 * <p>
 * Step 14.6.7.2 [ERR] <code>Property-Set</code><br>
 */
public boolean step14_6_7_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.pyForEachCount==3");
try {
boolean pz_60 = (tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount") == 3);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.pyForEachCount==3",pz_60);
if (!pz_60) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.pyForEachCount==3 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    islastpublishsuccess = false;
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.islastpublishsuccess");
try {
boolean pz_61 = islastpublishsuccess;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.islastpublishsuccess",pz_61);
if (!pz_61) {
// branch to block RESTFAIL
nextBlock = "RESTFAIL";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.islastpublishsuccess " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14.6.7.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_7_2_circum0 definition

/**
 * Step 14.6.8 [PR1] <code>Page-Remove</code> [on page DailyUsageData] <br>
 */
public boolean step14_6_8_circum0() {
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
pz_CurrentStepNum = "14.6.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_8_circum0 definition

/**
 * Step 14.7 <code>Property-Set</code><br>
 */
public boolean step14_7_circum0() {
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
    tools.putParamValue("lastSuccessfulRunDate", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getTimeStampAsDateStamp--(String)", "getTimeStampAsDateStamp", null, null, new Object[] { tools.getParamValue("EndDate") }));
}
{
    tools.putParamValue("EndDate", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getTimeStampAsDateStamp--(String)", "getTimeStampAsDateStamp", null, null, new Object[] { pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { tools.getParamValue("lastSuccessfulRunDate"), Integer.toString(1), Integer.toString(0), Integer.toString(0), Integer.toString(0) }) }));
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
pz_CurrentStepNum = "14.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_7_circum0 definition

/**
 * Update the last run date time.
 * <p>
 * Step 14.8 <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step14_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: local.aesruleset
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, aesruleset);
// Expression: Param.lastSuccessfulRunDate
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, tools.getParamValue("lastSuccessfulRunDate"));
// Expression: local.lastrundatedss
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, lastrundatedss);

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
pz_CurrentStepNum = "14.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_8_circum0 definition

/**
 * Step 15 <code>Java</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__10 = pega.invokeWhen("Always", "PegaAESRemote-Interface-UsageData-DailyUsers", "PegaAESRemote-Interface-UsageData-DailyUsers");
if (pz__10) {
// branch to block PUSHALERT
nextBlock = "PUSHALERT";
return false;
} else {
// branch to block PUSHALERT
nextBlock = "PUSHALERT";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step15_circum0 definition

/**
 * Adding an alert if RD fails.
 * <p>
 * Step 16 [RDFAIL] <code>Property-Set</code> [on page AlertPage] <br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("stepInfo", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getWorstMessage--(PublicAPI)", "getWorstMessage", null, null, new Object[] { tools }));
}
{
    tools.putParamValue("stepInfo", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, null, new Object[] { tools.getParamValue("stepInfo"), "\"", "" }));
}
{
    pega.setViaPropRef(".pxResults(<append>).AlertMessage", pRef_28, pega.findPageWithException("AlertPage", "Code-Pega-List"), ((("DateTime: " + PRDateFormat.formatIDT(System.currentTimeMillis())) + ", Reason: ") + tools.getParamValue("stepInfo")), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).TypeOfFeed", pRef_29, pega.findPageWithException("AlertPage", "Code-Pega-List"), "User feed", "sTN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("alertJson", PropertyInfo.TYPE_TEXT, ((!(tools.getParamValue("alertJson").equals(""))) ? ((tools.getParamValue("alertJson") + ",") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" })) : (tools.getParamValue("alertJson") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" }))));
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__12 = pega.invokeWhen("Always", "PegaAESRemote-Interface-UsageData-DailyUsers", "Code-Pega-List");
if (pz__12) {
// branch to block PUSHALERT
nextBlock = "PUSHALERT";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Adding an alert if connect-rest fails.
 * <p>
 * Step 17 [RESTFAIL] <code>Property-Set</code> [on page AlertPage] <br>
 */
public boolean step17_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).AlertMessage", pRef_28, pega.findPageWithException("AlertPage", "Code-Pega-List"), (((("DateTime: " + PRDateFormat.formatIDT(System.currentTimeMillis())) + ", ResponseCode: ") + scalarValueQuery_58.resolveToString(tools, pega.findPageWithException("DailyUsageData", "PegaAESRemote-Interface-UsageData-DailyUsers"), ImmutablePropertyInfo.TYPE_INTEGER)) + " for push the data."), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).TypeOfFeed", pRef_29, pega.findPageWithException("AlertPage", "Code-Pega-List"), "User feed", "sTN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("alertJson", PropertyInfo.TYPE_TEXT, ((!(tools.getParamValue("alertJson").equals(""))) ? ((tools.getParamValue("alertJson") + ",") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" })) : (tools.getParamValue("alertJson") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" }))));
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
pz_CurrentStepNum = "17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * Pushing the alerts to PDC using generic API.
 * <p>
 * Step 18 [PUSHALERT] <code>Call SendLicenceData</code> [on page AlertData] <br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call SendLicenceData");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.alertJson!=\"\"");
try {
boolean pz_65 = (!(tools.getParamValue("alertJson").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.alertJson!=\"\"",pz_65);
if (!pz_65) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.alertJson!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call SendLicenceData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call SendLicenceData
if (myStepPage == null) {
String pz_66 = "AlertData";
myStepPage = tools.findPage(pz_66, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_66, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData-DailyUsers");
}
}
// Calling Activity : SendLicenceData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: ALERT-MESSAGE
newParamsPage.putParamValue("eventType", PropertyInfo.TYPE_TEXT, "ALERT-MESSAGE");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: AlertPage
newParamsPage.putParamValue("InputPageList", PropertyInfo.TYPE_INCLUDED_PAGE, "AlertPage");

pega.invokeActivity(myStepPage, newParamsPage, "SendLicenceData", "PegaAESRemote-Interface-UsageData-DailyUsers", "");
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
pz_CurrentStepNum = "18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call SendLicenceData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * Remove pages.
 * <p>
 * Step 19 [PR] <code>Page-Remove</code> [on page DailyAggregatedData] <br>
 */
public boolean step19_circum0() {
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
// Expression: RDPage
pageRemove(tools.findPage("RDPage"));
// Expression: DailyUsageData
pageRemove(tools.findPage("DailyUsageData"));
// Expression: AlertPage
pageRemove(tools.findPage("AlertPage"));
// Expression: AlertData
pageRemove(tools.findPage("AlertData"));
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
pz_CurrentStepNum = "19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * Clear activity status.
 * <p>
 * Step 20 <code>Activity-Clear-Status</code><br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Activity-Clear-Status", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Activity-Clear-Status
tools.getActivityStatus().clear();
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
pz_CurrentStepNum = "20";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

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

public int loopinc = 0;
public String productionLevel = "";
public int daystoIncFromStartDate = 0;
public String chunklimitdss = "";
public int LoopForPush = 0;
public String deploymentname = "";
public String lastrundatedss = "";
public int chunkcount = 0;
public int chunklimit = 0;
public int threshold = 0;
public boolean islastpublishsuccess = false;
public String userDataThreshold = "";
public String rundate = "";
public String endpointurl = "";
public String platformVersion = "";
public String customerid = "";
public String deploymentTopology = "";
public String aesruleset = "";
public int DiffBwdates = 0;

public void initializeUserLocalVariables() {
	loopinc = 0;
	productionLevel = "";
	daystoIncFromStartDate = 0;
	chunklimitdss = "";
	LoopForPush = 0;
	deploymentname = "";
	lastrundatedss = "";
	chunkcount = 0;
	chunklimit = 0;
	threshold = 0;
	islastpublishsuccess = false;
	userDataThreshold = "";
	rundate = "";
	endpointurl = "";
	platformVersion = "";
	customerid = "";
	deploymentTopology = "";
	aesruleset = "";
	DiffBwdates = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("loopinc", Integer.toString(loopinc));
	smRetVal.putString("productionLevel", (productionLevel == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : productionLevel.toString());
	smRetVal.putString("daystoIncFromStartDate", Integer.toString(daystoIncFromStartDate));
	smRetVal.putString("chunklimitdss", (chunklimitdss == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : chunklimitdss.toString());
	smRetVal.putString("LoopForPush", Integer.toString(LoopForPush));
	smRetVal.putString("deploymentname", (deploymentname == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : deploymentname.toString());
	smRetVal.putString("lastrundatedss", (lastrundatedss == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : lastrundatedss.toString());
	smRetVal.putString("chunkcount", Integer.toString(chunkcount));
	smRetVal.putString("chunklimit", Integer.toString(chunklimit));
	smRetVal.putString("threshold", Integer.toString(threshold));
	smRetVal.putString("islastpublishsuccess", Boolean.toString(islastpublishsuccess));
	smRetVal.putString("userDataThreshold", (userDataThreshold == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : userDataThreshold.toString());
	smRetVal.putString("rundate", (rundate == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : rundate.toString());
	smRetVal.putString("endpointurl", (endpointurl == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : endpointurl.toString());
	smRetVal.putString("platformVersion", (platformVersion == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : platformVersion.toString());
	smRetVal.putString("customerid", (customerid == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : customerid.toString());
	smRetVal.putString("deploymentTopology", (deploymentTopology == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : deploymentTopology.toString());
	smRetVal.putString("aesruleset", (aesruleset == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : aesruleset.toString());
	smRetVal.putString("DiffBwdates", Integer.toString(DiffBwdates));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_41 = new String[] { "", "", "pyCategory", "" };
public static final String[] pRef_38 = new String[] { "", "", "pxDeploymentName", "" };
public static final String[] pRef_26 = new String[] { "", "", "pxResults", "1", "pySummaryCount", "1" };
public static final String[] pRef_37 = new String[] { "", "", "pxCustomerID", "" };
public static final String[] pRef_40 = new String[] { "", "", "pxPlatformVersion", "" };
public static final String[] pRef_55 = new String[] { "", "", "pyNote", "" };
public static final String[] pRef_29 = new String[] { "", "", "pxResults", "<last>", "TypeOfFeed", "" };
public static final String[] pRef_28 = new String[] { "", "", "pxResults", "<append>", "AlertMessage", "" };
public static final String[] pRef_39 = new String[] { "", "", "pxDeploymentTopology", "" };
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pxPlatformVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_42 = FUAUtil.createQueryBuilder().scalarProperty("pxApplication").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_48 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 2).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_53 = FUAUtil.createQueryBuilder().scalarList("pySummaryCount", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_45 = FUAUtil.createQueryBuilder().scalarProperty("pzUserType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_52 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 6).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_58 = FUAUtil.createQueryBuilder().scalarProperty("pyHTTPResponseCode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_47 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pxDeploymentName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pzProductionLevel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_44 = FUAUtil.createQueryBuilder().scalarProperty("pzUserId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pxCustomerID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyAccessGroup").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 5).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 4).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("RESTEndPointURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarList("pySummaryCount", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pxDeploymentTopology").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarList("pyDateValue", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 3).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("FinalRESTEndPointURL").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-DAILYUSERS PUSHDAILYUSERSDATA #20220422T142812.890 GMT", "PegaAESRemote-Interface-UsageData-DailyUsers PushDailyUsersData", "PegaAESRemote", "08-08-01", false, true, "", "ACTIVITY", "20220729T114254.057 GMT" ,"Rule-Obj-Activity"); }
