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
public class ra_action_pushdailyappdata_23301018d3f60b00a14fec665c899b92 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PushDailyAppData.PegaAESRemote_Interface_UsageData_Application.Action");
	public ra_action_pushdailyappdata_23301018d3f60b00a14fec665c899b92(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT	PegaAESRemote:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT";
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
String pz_4 = "AlertPage";
thisStepPage = tools.findPage(pz_4, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 1 Circum: 0" );
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
String pz_6 = "AlertData";
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 2 Circum: 0" );
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
String pz_8 = "AlertPage";
thisStepPage = tools.findPage(pz_8, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_8, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 8 Circum: 0" );
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
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 9 Circum: 0" );
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 12 Circum: 0" );
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
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 13 Circum: 0" );
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
ClipboardProperty pz_16 = pega.findPageWithException("ApplicationListPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_16;
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
if ( "Rule-Application".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Rule-Application").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_0_circum0");
}
PRStackFrame pz_StackFrame14_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_0 Circum: 0" );
try {
pz_Status = step14_0_circum0_Rule_Application();
} finally {
pega.popStackFrame(pz_StackFrame14_0_circum0, false);
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

// Code to call step 15_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SetDSS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RESTFAIL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_76 = "AlertPage";
thisStepPage = tools.findPage(pz_76, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_76, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 17_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RDFAIL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_80 = "AlertPage";
thisStepPage = tools.findPage(pz_80, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_80, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 17 Circum: 0" );
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
String pz_81 = "AlertData";
thisStepPage = tools.findPage(pz_81, true);
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 18 Circum: 0" );
try {
pz_Status = step18_circum0();
} finally {
pega.popStackFrame(pz_StackFrame18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 19_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CLEANUP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_circum0");
}
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 19 Circum: 0" );
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
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 20 Circum: 0" );
try {
pz_Status = step20_circum0();
} finally {
pega.popStackFrame(pz_StackFrame20_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 21_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 21_circum0");
}
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 21 Circum: 0" );
try {
pz_Status = step21_circum0();
} finally {
pega.popStackFrame(pz_StackFrame21_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 22_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_circum0");
}
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 22 Circum: 0" );
try {
pz_Status = step22_circum0();
} finally {
pega.popStackFrame(pz_StackFrame22_circum0, false);
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
	"Rule-Obj-Activity:PUSHDAILYAPPDATA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PUSHDAILYAPPDATA","Rule-Obj-Activity","PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION",false,"","PegaAESRemote","08-08-01","RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT","!PUSHDAILYAPPDATA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1738449837)
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
//	RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT:20220802T054942.509 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ffc8d46f9a6b0cc085a2ac2f929c1eae";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAESRemote-Interface-UsageData-Application";
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
String pz_5 = "AlertPage";
myStepPage = tools.findPage(pz_5, true);
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
 * Creating a new page AlertDataPage.
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
String pz_7 = "AlertData";
myStepPage = tools.findPage(pz_7, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-UsageData","AlertData",false); 
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
 * Log Message.
 * <p>
 * Step 4 <code>Log-Message</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("IsLicenseUsageDataCapturingEnabled", "PegaAESRemote-Interface-UsageData-Application", "PegaAESRemote-Interface-UsageData-Application");
if (!pz__1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PushDailyAppData - Precondition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "PegaAESRemote : Push Daily App Data  Invoked - "+"Capture Application Information Start Time ===> "+@CurrentDateTime()
if( oLog.isInfoEnabled() ){
oLog.info((("PegaAESRemote : Push Daily App Data  Invoked - " + "Capture Application Information Start Time ===> ") + PRDateFormat.formatIDT(System.currentTimeMillis())));
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Wait randomTime.
 * <p>
 * Step 5 <code>Call WaitRandomTime</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call WaitRandomTime");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call WaitRandomTime", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call WaitRandomTime
if (myStepPage == null) {
}
// Calling Activity : WaitRandomTime

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: PushDailyAppData
newParamsPage.putParamValue("MainActivity", PropertyInfo.TYPE_TEXT, "PushDailyAppData");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "WaitRandomTime", "PegaAESRemote-Interface-UsageData-Application", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call WaitRandomTime",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Set pdcServiceURL.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("pdcServiceURL", PropertyInfo.TYPE_TEXT, "PegaAES/v1/LogApplicationData");
}
{
    tools.putParamValue("servicename", PropertyInfo.TYPE_TEXT, "PushApplicationData");
}
{
    tools.putParamValue("message", PropertyInfo.TYPE_TEXT, "PegaAESRemote : Push Daily App Data message is");
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
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Get the End point URL and exit if it is blank.
 * <p>
 * Step 7 <code>Property-Set</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"");
try {
boolean pz_10 = (pega.<String>resolveMethodCall("trim--(String)", "trim", null, null, new Object[] { scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT) }).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"",pz_10);
if (pz_10) {
// branch to block CLEANUP
nextBlock = "CLEANUP";
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
    tools.putParamValue("endpointurl", PropertyInfo.TYPE_TEXT, scalarValueQuery_11.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT));
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
nextBlock = "CLEANUP";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "CLEANUP";
return true;
} finally {
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Check AESConnection.
 * <p>
 * Step 8 <code>Call CheckAESConnection</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call CheckAESConnection", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call CheckAESConnection
if (myStepPage == null) {
}
// Calling Activity : CheckAESConnection

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "CheckAESConnection", "PegaAESRemote-Interface-UsageData-Application", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Set the DSS and ruleset in local variables for reuse.
 * <p>
 * Step 9 <code>Property-Set</code><br>
 */
public boolean step9_circum0() {
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
    chunklimitdss = "pega/analytics/chunklimit";
}
{
    aesruleset = "PegaAESRemote";
}
{
    lastrundatedss = "pega/analytics/applicationagentlastrundate";
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Create a DSS for the Value Chunk.
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.chunklimitdss,\"\")");
try {
boolean pz_12 = (pega.<Boolean>resolveMethodCall("pxRecordExists--(String,String,String,String)", "pxRecordExists", null, null, new Object[] { "Data-Admin-System-Settings", aesruleset, chunklimitdss, "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.chunklimitdss,\"\")",pz_12);
if (pz_12) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.chunklimitdss,\"\") " + anyException.getMessage(), anyException);
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
// Expression: 500
String pz_13 = Integer.toString(500);
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, pz_13);
// Expression: local.chunklimitdss
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, chunklimitdss);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: local.aesruleset
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, aesruleset);

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-Interface-UsageData-Application", "");
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
 * Create application agent last run date DSS if it doesn't exist.
 * <p>
 * Step 11 <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.lastrundatedss,\"\")");
try {
boolean pz_14 = (pega.<Boolean>resolveMethodCall("pxRecordExists--(String,String,String,String)", "pxRecordExists", null, null, new Object[] { "Data-Admin-System-Settings", aesruleset, lastrundatedss, "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.lastrundatedss,\"\")",pz_14);
if (pz_14) {
// branch to block Next
nextBlock = "Next";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.lastrundatedss,\"\") " + anyException.getMessage(), anyException);
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
// Expression: local.lastrundatedss
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, lastrundatedss);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: local.aesruleset
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, aesruleset);
// Expression: 19700101
String pz_15 = Integer.toString(19700101);
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, pz_15);

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-Interface-UsageData-Application", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Set Properties to call RD for all the applications in the System and set Chunk Limit.
 * <p>
 * Step 12 [Next] <code>Property-Set</code><br>
 */
public boolean step12_circum0() {
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
    chunklimit = com.pega.pegarules.priv.FUAUtil.parseInt(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { "PegaAESRemote", "pega/analytics/chunklimit" }));
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
 * Step 13 <code>Call GetApplicationInstanceListForAppData</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call GetApplicationInstanceListForAppData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call GetApplicationInstanceListForAppData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call GetApplicationInstanceListForAppData
if (myStepPage == null) {
}
// Calling Activity : GetApplicationInstanceListForAppData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "GetApplicationInstanceListForAppData", "PegaAESRemote-Interface-UsageData-Application", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call GetApplicationInstanceListForAppData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Step 14.0 <code>Java</code> [on page ApplicationListPage.pxResults] <br>
 */
public boolean step14_0_circum0_Rule_Application() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.islastpublishsuccess");
try {
boolean pz_17 = islastpublishsuccess;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.islastpublishsuccess",pz_17);
if (!pz_17) {
// branch to block CLEANUP
nextBlock = "CLEANUP";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.islastpublishsuccess " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
PRStackFrame pz_StackFrame14_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_1 Circum: 0" );
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
PRStackFrame pz_StackFrame14_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_2 Circum: 0" );
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
String pz_18 = "ClientAppData";
nestedStepPage = tools.findPage(pz_18, true);
PRStackFrame pz_StackFrame14_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_3 Circum: 0" );
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
PRStackFrame pz_StackFrame14_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_4 Circum: 0" );
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
PRStackFrame pz_StackFrame14_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_5 Circum: 0" );
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

// Code to call nested step 14_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_circum0");
}
PRStackFrame pz_StackFrame14_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_7_circum0");
}
String pz_19 = "RDTempPage";
nestedStepPage = tools.findPage(pz_19, true);
PRStackFrame pz_StackFrame14_7_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_7 Circum: 0" );
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
String pz_20 = "RDTempPage";
nestedStepPage = tools.findPage(pz_20, true);
PRStackFrame pz_StackFrame14_8_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_8 Circum: 0" );
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

// Code to call nested step 14_9_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_21 = pega.findPageWithException("TempCaseTypeList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_21;
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
pz_CurrentStepNum = "14.9.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_9_0_circum0");
}
PRStackFrame pz_StackFrame14_9_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_9_0 Circum: 0" );
try {
pz_Status = step14_9_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_9_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 14_10_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDependsOnList", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_22 = myStepPage.getIfPresent("pyDependsOnList");
nestedPageRef = pz_22;
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
pz_CurrentStepNum = "14.10.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_10_0_circum0");
}
PRStackFrame pz_StackFrame14_10_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_10_0 Circum: 0" );
try {
pz_Status = step14_10_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_10_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 14_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_11_circum0");
}
PRStackFrame pz_StackFrame14_11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CONT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_12_circum0");
}
String pz_23 = "ClientAppData";
nestedStepPage = tools.findPage(pz_23, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_23, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame14_12_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_13_circum0");
}
String pz_24 = "ClientAppData";
nestedStepPage = tools.findPage(pz_24, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_24, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame14_13_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_14_circum0");
}
String pz_25 = "ClientAppData";
nestedStepPage = tools.findPage(pz_25, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_25, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame14_14_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_14 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_14_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_15_circum0");
}
String pz_26 = "AppData";
nestedStepPage = tools.findPage(pz_26, true);
PRStackFrame pz_StackFrame14_15_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_16_circum0");
}
String pz_27 = "AppData";
nestedStepPage = tools.findPage(pz_27, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_27, false);
nestedStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData-Application");
}
PRStackFrame pz_StackFrame14_16_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_16 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_16_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_17_0_circum0
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
pz_CurrentStepNum = "14.17.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_17_0_circum0");
}
PRStackFrame pz_StackFrame14_17_0_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_17_0 Circum: 0" );
try {
pz_Status = step14_17_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_17_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
}//close the for loop
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...
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
} // end of step14_0_circum0_Rule_Application definition

/**
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
    loopcount = (loopcount + 1);
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
 * Step 14.2 <code>Property-Set</code><br>
 */
public boolean step14_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__3 = pega.invokeWhen("IsCustomerApplication", "PegaAESRemote-Interface-UsageData-Application", "Rule-Application");
if (!pz__3) {
// branch to block CONT
nextBlock = "CONT";
pega.activityStepSkipped("Jump To Step");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("ApplicationName", PropertyInfo.TYPE_TEXT, scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("ApplicationVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pz_CurrentStepNum = "14.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_2_circum0 definition

/**
 * Create a new page for a every new chunk.
 * <p>
 * Step 14.3 <code>Page-New</code> [on page ClientAppData] <br>
 */
public boolean step14_3_circum0() {
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
boolean pz_30 = (chunkcount == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.chunkcount==0",pz_30);
if (!pz_30) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
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
String pz_31 = "ClientAppData";
myStepPage = tools.findPage(pz_31, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","ClientAppData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("ClientAppData", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_3_circum0 definition

/**
 * get application data.
 * <p>
 * Step 14.4 <code>Call GetApplicationData</code><br>
 */
public boolean step14_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call GetApplicationData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call GetApplicationData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call GetApplicationData
if (myStepPage == null) {
}
// Calling Activity : GetApplicationData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "GetApplicationData", "PegaAESRemote-Interface-UsageData-Application", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call GetApplicationData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_4_circum0 definition

/**
 * copy application primary details.
 * <p>
 * Step 14.5 <code>Property-Set</code><br>
 */
public boolean step14_5_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pxObjClass", pRef_32, pega.findPageWithException("ClientAppData", "Code-Pega-List"), "Rule-Application", "sIY", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(<last>).pyProductVersion", pRef_33, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyLayerClassification", pRef_34, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).ApplicationBuiltOns", pRef_36, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_37.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyProductName", pRef_38, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyLabel", pRef_39, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).HasProductionruleset", pRef_41, pega.findPageWithException("ClientAppData", "Code-Pega-List"), tools.getParamValue("HasProdRuleset"), "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyDescription", pRef_42, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
pz_CurrentStepNum = "14.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_5_circum0 definition

/**
 * set params for report definition.
 * <p>
 * Step 14.6 <code>Property-Set</code><br>
 */
public boolean step14_6_circum0() {
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
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Rule-Obj-CaseType");
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "GetCaseTypeList");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "TempCaseTypeList");
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
pz_CurrentStepNum = "14.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_circum0 definition

/**
 * Step 14.7 <code>Page-New</code> [on page RDTempPage] <br>
 */
public boolean step14_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_44 = "RDTempPage";
myStepPage = tools.findPage(pz_44, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-Obj-Report-Definition","RDTempPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("RDTempPage", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_7_circum0 definition

/**
 * Step 14.8 <code>Call pxRetrieveReportData</code> [on page RDTempPage] <br>
 */
public boolean step14_8_circum0() {
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
String pz_45 = "RDTempPage";
myStepPage = tools.findPage(pz_45, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_45, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Report-Definition");
}
}
// Calling Activity : pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "PegaAESRemote-Interface-UsageData-Application", "");
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
boolean pz__5 = pega.invokeWhen("StepStatusFail", "PegaAESRemote-Interface-UsageData-Application", "Rule-Obj-Report-Definition");
if (pz__5) {
// branch to block RDFAIL
nextBlock = "RDFAIL";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_8_circum0 definition

/**
 * Add CaseTypeList.
 * <p>
 * Step 14.9.0 <code>Java</code> [on page TempCaseTypeList.pxResults] <br>
 */
public boolean step14_9_0_circum0() {
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

// Code to call nested step 14_9_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.9.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_9_1_circum0");
}
PRStackFrame pz_StackFrame14_9_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_9_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_9_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_9_1_circum0, false);
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
pz_CurrentStepNum = "14.9.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_9_0_circum0 definition

/**
 * Step 14.9.1 <code>Property-Set</code><br>
 */
public boolean step14_9_1_circum0() {
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
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<append>).pyClassName", pRef_46, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_47.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "siN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<last>).ParentClass", pRef_48, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<last>).pyLabel", pRef_51, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<last>).ClassInheritance", pRef_52, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_53.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<last>).ClassGroup", pRef_55, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_56.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<last>).ClassGroupIndicator", pRef_58, pega.findPageWithException("ClientAppData", "Code-Pega-List"), scalarValueQuery_59.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    historyclass = ("History-" + scalarValueQuery_56.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<last>).TableName", pRef_61, pega.findPageWithException("ClientAppData", "Code-Pega-List"), pega.<String>resolveMethodCall("FetchTableName--(String)", "FetchTableName", null, null, new Object[] { scalarValueQuery_47.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).CaseTypeList(<last>).HistoryTableName", pRef_62, pega.findPageWithException("ClientAppData", "Code-Pega-List"), pega.<String>resolveMethodCall("FetchTableName--(String)", "FetchTableName", null, null, new Object[] { historyclass }), "sTN", false, true);
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
pz_CurrentStepNum = "14.9.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_9_1_circum0 definition

/**
 * Copy components list.
 * <p>
 * Step 14.10.0 <code>Java</code> [on page .pyDependsOnList] <br>
 */
public boolean step14_10_0_circum0() {
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

// Code to call nested step 14_10_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.10.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_10_1_circum0");
}
PRStackFrame pz_StackFrame14_10_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_10_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_10_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_10_1_circum0, false);
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
pz_CurrentStepNum = "14.10.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_10_0_circum0 definition

/**
 * Step 14.10.1 <code>Page-Copy</code><br>
 */
public boolean step14_10_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: ClientAppData.pxResults(<LAST>).pyDependsOnList(<APPEND>)
ClipboardPage pz_64 = pega.getViaPropRef(".pxResults(<last>).pyDependsOnList(<append>)", pRef_63, pega.findPageWithException("ClientAppData", "Code-Pega-List"), false, false).getPageValue();
targetPage = pz_64;
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
pz_CurrentStepNum = "14.10.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_10_1_circum0 definition

/**
 * increment chunk count.
 * <p>
 * Step 14.11 <code>Property-Set</code><br>
 */
public boolean step14_11_circum0() {
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
pz_CurrentStepNum = "14.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_11_circum0 definition

/**
 * If the list size reaches the chunk limit then reset the chunk count and push the data.
 * <p>
 * Step 14.12 [CONT] <code>Property-Set</code> [on page ClientAppData] <br>
 */
public boolean step14_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(local.chunkcount==local.chunklimit)||(local.loopcount==@SizeOfPropertyList(ApplicationListPage.pxResults))");
try {
boolean pz_65 = ((chunkcount == chunklimit) || (loopcount == (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { pega.findPageWithException("ApplicationListPage", "Code-Pega-List").getProperty("pxResults") })).intValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(local.chunkcount==local.chunklimit)||(local.loopcount==@SizeOfPropertyList(ApplicationListPage.pxResults))",pz_65);
if (!pz_65) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(local.chunkcount==local.chunklimit)||(local.loopcount==@SizeOfPropertyList(ApplicationListPage.pxResults)) " + anyException.getMessage(), anyException);
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyTempDate", pRef_66, myStepPage, com.pega.pegarules.priv.FUAUtil.parseStringAsDate(pega, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { rundate, Integer.toString(((-1))), Integer.toString(0), Integer.toString(0), Integer.toString(0) })), "sDN", false, true);
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
pz_CurrentStepNum = "14.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_12_circum0 definition

/**
 * Set the environment details.
 * <p>
 * Step 14.13 <code>Apply-DataTransform</code> [on page ClientAppData] <br>
 */
public boolean step14_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: PopulateEnvironmentDetails
ParameterPage stepParams__1 = new ParameterPage();/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "PegaAESRemote-Interface-UsageData-Application";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "PopulateEnvironmentDetails");
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
pz_CurrentStepNum = "14.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_13_circum0 definition

/**
 * Form request json for connect-rest.
 * <p>
 * Step 14.14 <code>Apply-DataTransform</code> [on page ClientAppData] <br>
 */
public boolean step14_14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: ParseApplicationData
ParameterPage stepParams__2= null;/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "PegaAESRemote-Interface-UsageData-Application";
}
StringMap params__2 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__2.putString("pxObjClass", "Rule-Obj-Model");
params__2.putString("pyClassName", modelClass);
params__2.putString("pyModelName", "ParseApplicationData");
tools.applyModel(myStepPage, params__2, stepParams__2);
ThreadLocalStringMapFactoryImpl.getFactory().release(params__2);
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
pz_CurrentStepNum = "14.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_14_circum0 definition

/**
 * Step 14.15 <code>Page-New</code> [on page AppData] <br>
 */
public boolean step14_15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_67 = "AppData";
myStepPage = tools.findPage(pz_67, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-UsageData-Application","AppData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("AppData", myStepPage);
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
pz_CurrentStepNum = "14.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_15_circum0 definition

/**
 * Copy json data to pyNote.
 * <p>
 * Step 14.16 <code>Property-Set</code> [on page AppData] <br>
 */
public boolean step14_16_circum0() {
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
    pega.setViaPropRef(".pyNote", pRef_68, myStepPage, tools.getParamValue("jsonData"), "sTN", false, true);
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
pz_CurrentStepNum = "14.16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_16_circum0 definition

/**
 * Push daily application data; retry 3 times if the REST call fails.
 * <p>
 * Step 14.17.0 <code>Java</code><br>
 */
public boolean step14_17_0_circum0() {
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

// Code to call nested step 14_17_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.17.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_17_1_circum0");
}
String pz_69 = "AppData";
nestedStepPage = tools.findPage(pz_69, true);
PRStackFrame pz_StackFrame14_17_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_17_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_17_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_17_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_17_2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ERR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.17.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_17_2_circum0");
}
PRStackFrame pz_StackFrame14_17_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT Step: 14_17_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_17_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_17_2_circum0, false);
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
pz_CurrentStepNum = "14.17.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_17_0_circum0 definition

/**
 * Push to AES/PDC.
 * <p>
 * Step 14.17.1 <code>Call PegaAESRemote-Interface-.PDCRestPush</code> [on page AppData] <br>
 */
public boolean step14_17_1_circum0() {
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
String pz_70 = "AppData";
myStepPage = tools.findPage(pz_70, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_70, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData-Application");
}
}
// Calling Activity : PegaAESRemote-Interface-.PDCRestPush
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "PDCRestPush", "PegaAESRemote-Interface-UsageData-Application", "PegaAESRemote-Interface-");
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
boolean pz_72 = (scalarValueQuery_71.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) == 200);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyHTTPResponseCode==200",pz_72);
if (pz_72) {
// branch to block SetDSS
nextBlock = "SetDSS";
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
pz_CurrentStepNum = "14.17.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PegaAESRemote-Interface-.PDCRestPush",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_17_1_circum0 definition

/**
 * If rest call fails 3 times then exit iteration.
 * <p>
 * Step 14.17.2 [ERR] <code>Property-Set</code><br>
 */
public boolean step14_17_2_circum0() {
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
boolean pz_73 = (tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount") == 3);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.pyForEachCount==3",pz_73);
if (!pz_73) {
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
boolean pz_74 = islastpublishsuccess;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.islastpublishsuccess",pz_74);
if (!pz_74) {
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
pz_CurrentStepNum = "14.17.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_17_2_circum0 definition

/**
 * Set SuccessfulRunDate Value.
 * <p>
 * Step 15 [SetDSS] <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.islastpublishsuccess");
try {
boolean pz_75 = islastpublishsuccess;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.islastpublishsuccess",pz_75);
if (!pz_75) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.islastpublishsuccess " + anyException.getMessage(), anyException);
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
// Expression: local.rundate
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, rundate);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: PegaAESRemote
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, "PegaAESRemote");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: pega/analytics/applicationagentlastrundate
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, "pega/analytics/applicationagentlastrundate");

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-Interface-UsageData-Application", "");
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
boolean pz__7 = pega.invokeWhen("Always", "PegaAESRemote-Interface-UsageData-Application", "PegaAESRemote-Interface-UsageData-Application");
if (pz__7) {
// branch to block PUSHALERT
nextBlock = "PUSHALERT";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Adding an alert if connect-rest fails.
 * <p>
 * Step 16 [RESTFAIL] <code>Property-Set</code> [on page AlertPage] <br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "AppData.pyHTTPResponseCode==200");
try {
boolean pz_77 = (scalarValueQuery_71.resolveToInt(tools, pega.findPageWithException("AppData", "PegaAESRemote-Interface-UsageData-Application"), ImmutablePropertyInfo.TYPE_INTEGER) == 200);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "AppData.pyHTTPResponseCode==200",pz_77);
if (pz_77) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("AppData.pyHTTPResponseCode==200 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).AlertMessage", pRef_78, pega.findPageWithException("AlertPage", "Code-Pega-List"), (((("DateTime: " + PRDateFormat.formatIDT(System.currentTimeMillis())) + ", ResponseCode: ") + scalarValueQuery_71.resolveToString(tools, pega.findPageWithException("AppData", "PegaAESRemote-Interface-UsageData-Application"), ImmutablePropertyInfo.TYPE_INTEGER)) + " for push application data."), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).TypeOfFeed", pRef_79, pega.findPageWithException("AlertPage", "Code-Pega-List"), "Application feed", "sTN", false, true);
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
boolean pz__9 = pega.invokeWhen("Always", "PegaAESRemote-Interface-UsageData-Application", "Code-Pega-List");
if (pz__9) {
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
 * Adding an alert if RD fails.
 * <p>
 * Step 17 [RDFAIL] <code>Property-Set</code> [on page AlertPage] <br>
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
    pega.setViaPropRef(".pxResults(<append>).AlertMessage", pRef_78, pega.findPageWithException("AlertPage", "Code-Pega-List"), ((("DateTime: " + PRDateFormat.formatIDT(System.currentTimeMillis())) + ", Reason: ") + pega.<String>resolveMethodCall("getWorstMessage--(PublicAPI)", "getWorstMessage", null, null, new Object[] { tools })), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).TypeOfFeed", pRef_79, pega.findPageWithException("AlertPage", "Code-Pega-List"), "Application feed", "sTN", false, true);
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
boolean pz_82 = (!(tools.getParamValue("alertJson").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.alertJson!=\"\"",pz_82);
if (!pz_82) {
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
String pz_83 = "AlertData";
myStepPage = tools.findPage(pz_83, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_83, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData");
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

pega.invokeActivity(myStepPage, newParamsPage, "SendLicenceData", "PegaAESRemote-Interface-UsageData-Application", "");
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
 * Removing temp pages.
 * <p>
 * Step 19 [CLEANUP] <code>Page-Remove</code><br>
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
// Expression: ApplicationListPage
pageRemove(tools.findPage("ApplicationListPage"));
// Expression: AppData
pageRemove(tools.findPage("AppData"));
// Expression: ClientAppData
pageRemove(tools.findPage("ClientAppData"));
// Expression: RDTempPage
pageRemove(tools.findPage("RDTempPage"));
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
 * Clear the status of the activity as it is just used to capture the license data.
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

/**
 * Step 21 <code>Log-Message</code><br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.islastpublishsuccess");
try {
boolean pz_84 = islastpublishsuccess;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.islastpublishsuccess",pz_84);
if (pz_84) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.islastpublishsuccess " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "Last Run Was Unsuccessful --- Terminating the Activity Execution"
if( oLog.isDebugEnabled() ){
oLog.debug("Last Run Was Unsuccessful --- Terminating the Activity Execution");
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
pz_CurrentStepNum = "21";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * Step 22 <code>Log-Message</code><br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.islastpublishsuccess");
try {
boolean pz_85 = islastpublishsuccess;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.islastpublishsuccess",pz_85);
if (!pz_85) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.islastpublishsuccess " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "Capture application Informatin End Time ======="+@CurrentDateTime()
if( oLog.isDebugEnabled() ){
oLog.debug(("Capture application Informatin End Time =======" + PRDateFormat.formatIDT(System.currentTimeMillis())));
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
pz_CurrentStepNum = "22";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

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

public int loopcount = 0;
public String rundate = "";
public String historyclass = "";
public String chunklimitdss = "";
public String appHash = "";
public String lastrundatedss = "";
public int chunkcount = 0;
public int chunklimit = 0;
public boolean islastpublishsuccess = false;
public String aesruleset = "";

public void initializeUserLocalVariables() {
	loopcount = 0;
	rundate = "";
	historyclass = "";
	chunklimitdss = "";
	appHash = "";
	lastrundatedss = "";
	chunkcount = 0;
	chunklimit = 0;
	islastpublishsuccess = false;
	aesruleset = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("loopcount", Integer.toString(loopcount));
	smRetVal.putString("rundate", (rundate == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : rundate.toString());
	smRetVal.putString("historyclass", (historyclass == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : historyclass.toString());
	smRetVal.putString("chunklimitdss", (chunklimitdss == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : chunklimitdss.toString());
	smRetVal.putString("appHash", (appHash == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : appHash.toString());
	smRetVal.putString("lastrundatedss", (lastrundatedss == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : lastrundatedss.toString());
	smRetVal.putString("chunkcount", Integer.toString(chunkcount));
	smRetVal.putString("chunklimit", Integer.toString(chunklimit));
	smRetVal.putString("islastpublishsuccess", Boolean.toString(islastpublishsuccess));
	smRetVal.putString("aesruleset", (aesruleset == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : aesruleset.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_63 = new String[] { "", "", "pxResults", "<last>", "pyDependsOnList", "<append>" };
public static final String[] pRef_32 = new String[] { "", "", "pxResults", "<append>", "pxObjClass", "" };
public static final String[] pRef_68 = new String[] { "", "", "pyNote", "" };
public static final String[] pRef_60 = new String[] { "", "", "pxPages", "B", "pyClassGroupIndicator", "" };
public static final String[] pRef_78 = new String[] { "", "", "pxResults", "<append>", "AlertMessage", "" };
public static final String[] pRef_57 = new String[] { "", "", "pxPages", "B", "pyClassGroup", "" };
public static final String[] pRef_39 = new String[] { "", "", "pxResults", "<last>", "pyLabel", "" };
public static final String[] pRef_58 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<last>", "ClassGroupIndicator", "" };
public static final String[] pRef_33 = new String[] { "", "", "pxResults", "<last>", "pyProductVersion", "" };
public static final String[] pRef_51 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<last>", "pyLabel", "" };
public static final String[] pRef_66 = new String[] { "", "", "pyTempDate", "" };
public static final String[] pRef_42 = new String[] { "", "", "pxResults", "<last>", "pyDescription", "" };
public static final String[] pRef_36 = new String[] { "", "", "pxResults", "<last>", "ApplicationBuiltOns", "" };
public static final String[] pRef_48 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<last>", "ParentClass", "" };
public static final String[] pRef_50 = new String[] { "", "", "pxPages", "B", "pyDerivesFrom", "" };
public static final String[] pRef_46 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<append>", "pyClassName", "" };
public static final String[] pRef_34 = new String[] { "", "", "pxResults", "<last>", "pyLayerClassification", "" };
public static final String[] pRef_52 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<last>", "ClassInheritance", "" };
public static final String[] pRef_41 = new String[] { "", "", "pxResults", "<last>", "HasProductionruleset", "" };
public static final String[] pRef_55 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<last>", "ClassGroup", "" };
public static final String[] pRef_62 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<last>", "HistoryTableName", "" };
public static final String[] pRef_61 = new String[] { "", "", "pxResults", "<last>", "CaseTypeList", "<last>", "TableName", "" };
public static final String[] pRef_79 = new String[] { "", "", "pxResults", "<last>", "TypeOfFeed", "" };
public static final String[] pRef_38 = new String[] { "", "", "pxResults", "<last>", "pyProductName", "" };
public static final String[] pRef_54 = new String[] { "", "", "pxPages", "B", "pyClassInheritance", "" };
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_56 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "B").scalarProperty("pyClassGroup").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_59 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "B").scalarProperty("pyClassGroupIndicator").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_71 = FUAUtil.createQueryBuilder().scalarProperty("pyHTTPResponseCode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_53 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "B").scalarProperty("pyClassInheritance").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pyLayerClassification").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().scalarProperty("ApplicationBuiltOns").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "B").scalarProperty("pyDerivesFrom").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("RESTEndPointURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_47 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("FinalRESTEndPointURL").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-USAGEDATA-APPLICATION PUSHDAILYAPPDATA #20220509T130803.058 GMT", "PegaAESRemote-Interface-UsageData-Application PushDailyAppData", "PegaAESRemote", "08-08-01", false, true, "", "ACTIVITY", "20220802T054942.509 GMT" ,"Rule-Obj-Activity"); }
