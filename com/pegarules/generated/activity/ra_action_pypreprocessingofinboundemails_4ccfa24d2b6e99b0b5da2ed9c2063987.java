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
public class ra_action_pypreprocessingofinboundemails_4ccfa24d2b6e99b0b5da2ed9c2063987 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyPreProcessingOfInboundEmails.Rule_Obj_CaseType.Action");
	public ra_action_pypreprocessingofinboundemails_4ccfa24d2b6e99b0b5da2ed9c2063987(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT	Pega-ProcessArchitect:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 2 Circum: 0" );
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
String pz_10 = "CurrentCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 3 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_12 = "MasterCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_12, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 4 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_14 = "TempConfigPage";
thisStepPage = tools.findPage(pz_14, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 5 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
ClipboardProperty pz_16 = propertyQuery_1.resolve(tools, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"));
thisStepPage = pz_16 == null ? null : pz_16.getPageValue();
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SRV"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_18 = "TempConfigPage";
thisStepPage = tools.findPage(pz_18, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_18, false);
thisStepPage.putString("pxObjClass", "Data-Admin-Connect-EmailListener");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 8 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_23 = "pyViewLookUpList";
thisStepPage = tools.findPage(pz_23, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 9 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_25 = "pyCurrentCaseTypeListenersList";
thisStepPage = tools.findPage(pz_25, true);
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_27 = pega.findPageWithException("pyViewLookUpList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_27;
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
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_32 = "pyCurrentCaseTypeListenersList";
thisStepPage = tools.findPage(pz_32, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_32, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 13 Circum: 0" );
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
ClipboardProperty pz_33 = pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_33;
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
pz_CurrentStepNum = "14.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_0_circum0");
}
PRStackFrame pz_StackFrame14_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_0 Circum: 0" );
try {
pz_Status = step14_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 15_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("EL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_70 = "MasterCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_70, true);
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_71 = "CurrentCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_71, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_71, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_76 = "CurrentCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_76, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_76, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 18_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_78 = "CurrentCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_78, true);
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 18 Circum: 0" );
try {
pz_Status = step18_circum0();
} finally {
pega.popStackFrame(pz_StackFrame18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 19_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_84 = "SelectedCaseType";
thisStepPage = tools.findPage(pz_84, true);
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 20_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_circum0");
}
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 20 Circum: 0" );
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
	"Rule-Obj-Activity:PYPREPROCESSINGOFINBOUNDEMAILS", 
	"Rule-Obj-ListView:LOOKUPLIST!ALL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYPREPROCESSINGOFINBOUNDEMAILS","Rule-Obj-Activity","RULE-OBJ-CASETYPE",false,"","Pega-ProcessArchitect","08-05-01","RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT","!PYPREPROCESSINGOFINBOUNDEMAILS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1828353578), 
		new DependentRuleInfo("LOOKUPLIST!ALL","Rule-Obj-ListView","DATA-ADMIN-CONNECT-EMAILLISTENER",true,"Data-Admin-Connect-EmailListener","Pega-LP-Integration","08-01-01","RULE-OBJ-LISTVIEW DATA-ADMIN-CONNECT-EMAILLISTENER LOOKUPLIST!ALL #20180713T143043.340 GMT","!LOOKUPLIST!ALL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1690993246)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT:20200413T100713.681 GMT
//	RULE-OBJ-LISTVIEW DATA-ADMIN-CONNECT-EMAILLISTENER LOOKUPLIST!ALL #20180713T143043.340 GMT:20180713T143043.340 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "62242b53daaba4a89ad36663af25edf1";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-CaseType";
	}
public String getAspect() {
return "Action";
}
/**
 * Exit activity if Email is already visited and CurrentCaseEmailConfigurations Page already exists.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurations\", tools)");
try {
boolean pz_9 = (pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CurrentCaseEmailConfigurations", tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurations\", tools)",pz_9);
if (pz_9) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pyPreProcessingOfInboundEmails - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurations\", tools) " + anyException.getMessage(), anyException);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Clearing unnecessary pages.
 * <p>
 * Step 2 <code>Page-Remove</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: EmailAccount
pageRemove(tools.findPage("EmailAccount"));
// Expression: EmailService
pageRemove(tools.findPage("EmailService"));
// Expression: pyCurrentCaseTypeListenersList
pageRemove(tools.findPage("pyCurrentCaseTypeListenersList"));
// Expression: pyViewLookUpList
pageRemove(tools.findPage("pyViewLookUpList"));
// Expression: RuleSetVersionPage
pageRemove(tools.findPage("RuleSetVersionPage"));
// Expression: TempConfigPage
pageRemove(tools.findPage("TempConfigPage"));
// Expression: MasterCaseEmailConfigurations
pageRemove(tools.findPage("MasterCaseEmailConfigurations"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Create page for current case type list.
 * <p>
 * Step 3 <code>Page-New</code> [on page CurrentCaseEmailConfigurations] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_11 = "CurrentCaseEmailConfigurations";
myStepPage = tools.findPage(pz_11, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","CurrentCaseEmailConfigurations",false); 
// primary page will not be added to PageList
	 pega.setStepPage("CurrentCaseEmailConfigurations", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Create page for master case type list.
 * <p>
 * Step 4 <code>Page-New</code> [on page MasterCaseEmailConfigurations] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_13 = "MasterCaseEmailConfigurations";
myStepPage = tools.findPage(pz_13, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","MasterCaseEmailConfigurations",false); 
// primary page will not be added to PageList
	 pega.setStepPage("MasterCaseEmailConfigurations", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Create temp configuration page.
 * <p>
 * Step 5 <code>Page-New</code> [on page TempConfigPage] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_15 = "TempConfigPage";
myStepPage = tools.findPage(pz_15, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-Admin-Connect-EmailListener","TempConfigPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("TempConfigPage", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Adding the default inbound email confeguration.
 * <p>
 * Step 6 <code>Property-Set</code> [on page MasterCaseEmailConfigurations.pxResults(1)] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxObjClass", pRef_17, myStepPage, "Data-Admin-Connect-EmailListener", "sIY", false, true);
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
 * set rule set and version on pyworkpage.
 * <p>
 * Step 8 [SRV] <code>Property-Set</code> [on page TempConfigPage] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyCorrRuleSet", pRef_19, myStepPage, scalarValueQuery_20.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCorrRuleSetVersion", pRef_21, myStepPage, scalarValueQuery_22.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
 * New page for all listeners.
 * <p>
 * Step 9 <code>Page-New</code> [on page pyViewLookUpList] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_24 = "pyViewLookUpList";
myStepPage = tools.findPage(pz_24, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","pyViewLookUpList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("pyViewLookUpList", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * New page for listeners of current case type.
 * <p>
 * Step 10 <code>Page-New</code> [on page pyCurrentCaseTypeListenersList] <br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_26 = "pyCurrentCaseTypeListenersList";
myStepPage = tools.findPage(pz_26, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","pyCurrentCaseTypeListenersList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("pyCurrentCaseTypeListenersList", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Getting list of listeners.
 * <p>
 * Step 11 <code>Obj-List-View</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-List-View");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-List-View", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-List-View
ParameterPage newParamsPage = tools.getParameterPage();
newParamsPage.putParamValue("pyAction", PropertyInfo.TYPE_TEXT, "Prepare");
newParamsPage.putParamValue("ViewClass", PropertyInfo.TYPE_TEXT, "Data-Admin-Connect-EmailListener");
newParamsPage.putParamValue("ViewPurpose", PropertyInfo.TYPE_TEXT, "LookUpList");
newParamsPage.putParamValue("ViewOwner", PropertyInfo.TYPE_TEXT, "ALL");
StringMap params = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params.putString("pxObjClass", "Rule-Obj-Activity");
params.putString("pyClassName", "Rule-Obj-ListView");
params.putString("pyActivityName", "ShowView");
tools.doActivity(params, myStepPage, newParamsPage);
ThreadLocalStringMapFactoryImpl.getFactory().release(params);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-List-View",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Copying based on classtypeclass  name.
 * <p>
 * Step 12 <code>Page-Copy</code> [on page pyViewLookUpList.pxResults] <br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equalsIgnoreCase(.pyServiceClass, Primary.pyClassName)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:String).equalsIgnoreCase(.pyServiceClass, Primary.pyClassName)", "FUAInstance-NullMyStepPage");
}
boolean pz_30 = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_29.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equalsIgnoreCase(.pyServiceClass, Primary.pyClassName)",pz_30);
if (!pz_30) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equalsIgnoreCase(.pyServiceClass, Primary.pyClassName) " + anyException.getMessage(), anyException);
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
// Expression: pyCurrentCaseTypeListenersList.pxResults(<APPEND>)
ClipboardPage pz_31 = pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List").getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_31;
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Setting index value to 1 and list length to its default value.
 * <p>
 * Step 13 <code>Property-Set</code> [on page pyCurrentCaseTypeListenersList] <br>
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
    index = 1;
}
{
    listLength = (pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", "Pega-RULES", "Utilities", new Object[] { pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List").getProperty("pxResults") })).intValue();
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
 * Creating an entry in master configuration for each listener.
 * <p>
 * Step 14.0 <code>Property-Set</code> [on page pyCurrentCaseTypeListenersList.pxResults] <br>
 */
public boolean step14_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:ExpressionEvaluators).compareTwoNumbers(Local.index, \"&lt;=\", Local.listLength)");
try {
boolean pz_34 = (pega.<Boolean>resolveMethodCall("compareTwoNumbers--(double,String,double)", "compareTwoNumbers", "Pega-RULES", "ExpressionEvaluators", new Object[] { (double) index, "<=", (double) listLength })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:ExpressionEvaluators).compareTwoNumbers(Local.index, \"&lt;=\", Local.listLength)",pz_34);
if (!pz_34) {
// branch to block EL
nextBlock = "EL";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:ExpressionEvaluators).compareTwoNumbers(Local.index, \"&lt;=\", Local.listLength) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(" + index + ").pyEmailAccountName", new String[] { "", "", "pxResults", String.valueOf(index), "pyEmailAccountName", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_35.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "stN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pyEmailAccountNameForUIValidation", new String[] { "", "", "pxResults", String.valueOf(index), "pyEmailAccountNameForUIValidation", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_35.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pyEmailServicePackage", new String[] { "", "", "pxResults", String.valueOf(index), "pyEmailServicePackage", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_36.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "stN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pxObjClass", new String[] { "", "", "pxResults", String.valueOf(index), "pxObjClass", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), "Data-Admin-Connect-EmailListener", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pyListenerStatus", new String[] { "", "", "pxResults", String.valueOf(index), "pyListenerStatus", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), false, "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pzInsKey", new String[] { "", "", "pxResults", String.valueOf(index), "pzInsKey", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), (("DATA-EMAILACCOUNT " + scalarValueQuery_35.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index)) + "!NOTIFY "), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pxUpdateDateTime", new String[] { "", "", "pxResults", String.valueOf(index), "pxUpdateDateTime", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_37.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_DATETIME, index), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pyListenerName", new String[] { "", "", "pxResults", String.valueOf(index), "pyListenerName", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_38.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "sIN", false, true);
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

// Code to call nested step 14_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_1_circum0");
}
PRStackFrame pz_StackFrame14_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_1 Circum: 0" );
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
PRStackFrame pz_StackFrame14_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_2 Circum: 0" );
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
PRStackFrame pz_StackFrame14_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_3 Circum: 0" );
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
String pz_39 = "EmailService";
nestedStepPage = tools.findPage(pz_39, true);
PRStackFrame pz_StackFrame14_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_4 Circum: 0" );
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
String pz_40 = "EmailService";
nestedStepPage = tools.findPage(pz_40, true);
PRStackFrame pz_StackFrame14_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_5 Circum: 0" );
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
PRStackFrame pz_StackFrame14_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_6 Circum: 0" );
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
String pz_41 = "EmailAccount";
nestedStepPage = tools.findPage(pz_41, true);
PRStackFrame pz_StackFrame14_7_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_7 Circum: 0" );
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
String pz_42 = "EmailAccount";
nestedStepPage = tools.findPage(pz_42, true);
PRStackFrame pz_StackFrame14_8_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_8 Circum: 0" );
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

// Code to call nested step 14_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_9_circum0");
}
PRStackFrame pz_StackFrame14_9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NEA"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_10_circum0");
}
ClipboardProperty pz_43 = propertyQuery_5.resolve(tools, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), index);
nestedStepPage = pz_43 == null ? null : pz_43.getPageValue();
PRStackFrame pz_StackFrame14_10_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("EA"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_11_circum0");
}
PRStackFrame pz_StackFrame14_11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_11 Circum: 0" );
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
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_12_circum0");
}
ClipboardProperty pz_45 = propertyQuery_44.resolve(tools, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), index);
nestedStepPage = pz_45 == null ? null : pz_45.getPageValue();
PRStackFrame pz_StackFrame14_12_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_12 Circum: 0" );
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
if ((nextBlock.equals("") || nextBlock.equals("NSF"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_13_circum0");
}
ClipboardProperty pz_46 = propertyQuery_44.resolve(tools, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), index);
nestedStepPage = pz_46 == null ? null : pz_46.getPageValue();
PRStackFrame pz_StackFrame14_13_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_13 Circum: 0" );
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
PRStackFrame pz_StackFrame14_14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT Step: 14_14 Circum: 0" );
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_0_circum0 definition

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
    tools.putParamValue("ListenerTypeClass", PropertyInfo.TYPE_TEXT, "Data-Admin-Connect-EmailListener");
}
{
    tools.putParamValue("ListenerName", PropertyInfo.TYPE_TEXT, scalarValueQuery_38.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index));
}
{
    tools.putParamValue("ListenerStatus", PropertyInfo.TYPE_TEXT, "");
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
 * Step 14.2 <code>Call pzGetListenerStatus</code><br>
 */
public boolean step14_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetListenerStatus");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetListenerStatus", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetListenerStatus
if (myStepPage == null) {
}
// Calling Activity : pzGetListenerStatus
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzGetListenerStatus", "Rule-Obj-CaseType", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetListenerStatus",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_2_circum0 definition

/**
 * Step 14.3 <code>Property-Set</code><br>
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
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!(param.ListenerStatus==\"\" || param.ListenerStatus==\"No active listener found\")");
try {
boolean pz_47 = ((!((tools.getParamValue("ListenerStatus").equals("")) || (tools.getParamValue("ListenerStatus").equals("No active listener found")))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!(param.ListenerStatus==\"\" || param.ListenerStatus==\"No active listener found\")",pz_47);
if (!pz_47) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!(param.ListenerStatus==\"\" || param.ListenerStatus==\"No active listener found\") " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"RUNNING\")");
try {
boolean pz_48 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { tools.getParamValue("ListenerStatus"), "RUNNING" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"RUNNING\")",pz_48);
if (pz_48) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).contains(param.ListenerStatus, \"RUNNING\") " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"SLEEPING\")");
try {
boolean pz_49 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { tools.getParamValue("ListenerStatus"), "SLEEPING" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"SLEEPING\")",pz_49);
if (pz_49) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).contains(param.ListenerStatus, \"SLEEPING\") " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"INITIALIZED\")");
try {
boolean pz_50 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { tools.getParamValue("ListenerStatus"), "INITIALIZED" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"INITIALIZED\")",pz_50);
if (pz_50) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).contains(param.ListenerStatus, \"INITIALIZED\") " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"RESTARTING\")");
try {
boolean pz_51 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { tools.getParamValue("ListenerStatus"), "RESTARTING" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).contains(param.ListenerStatus, \"RESTARTING\")",pz_51);
if (!pz_51) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).contains(param.ListenerStatus, \"RESTARTING\") " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(" + index + ").pyListenerStatus", new String[] { "", "", "pxResults", String.valueOf(index), "pyListenerStatus", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), true, "sTN", false, true);
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
 * Create email service page.
 * <p>
 * Step 14.4 <code>Page-New</code> [on page EmailService] <br>
 */
public boolean step14_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_52 = "EmailService";
myStepPage = tools.findPage(pz_52, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-Service-Email","EmailService",false); 
// primary page will not be added to PageList
	 pega.setStepPage("EmailService", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_4_circum0 definition

/**
 * Getting flow type.
 * <p>
 * Step 14.5 <code>Obj-Open</code> [on page EmailService] <br>
 */
public boolean step14_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_53 = "EmailService";
myStepPage = tools.findPage(pz_53, true);
// Expression: 
// Expression: 
myStepPage = tools.getThread().createPage("Rule-Service-Email", pz_53);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyCusPackage", pRef_54, myStepPage, scalarValueQuery_36.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "siN", false, false);
}
{
    pega.setViaPropRef(".pyCusClass", pRef_55, myStepPage, scalarValueQuery_29.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, false);
}
{
    pega.setViaPropRef(".pyCusMethod", pRef_56, myStepPage, scalarValueQuery_57.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "sIN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "EmailService", "", false, false);
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open", dbEx);
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
pz_CurrentStepNum = "14.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_5_circum0 definition

/**
 * Setting flow type and its label(which is set to pyOutboundPWStatus).
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("pzCTWithInitializationStageInfoDisplay", "Rule-Obj-CaseType", "Data-Admin-Connect-EmailListener");
if (pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzPageListContains(tools, \"CaseTypeStages.pyCasetypeStartingFlows\", \"pyStartingFlowType\", EmailService.pyServiceActivityParams.flowType, false, true)");
try {
boolean pz_60 = (pega.<Boolean>resolveMethodCall("pzPageListContains--(PublicAPI,S8978b61cd99647b0ef85978807c864dc", "pzPageListContains", null, null, new Object[] { tools, "CaseTypeStages.pyCasetypeStartingFlows", "pyStartingFlowType", scalarValueQuery_58.resolveToString(tools, pega.findPageWithException("EmailService", "Rule-Service-Email"), ImmutablePropertyInfo.TYPE_TEXT), false, true })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzPageListContains(tools, \"CaseTypeStages.pyCasetypeStartingFlows\", \"pyStartingFlowType\", EmailService.pyServiceActivityParams.flowType, false, true)",pz_60);
if (!pz_60) {
// branch to block NSF
nextBlock = "NSF";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzPageListContains(tools, \"CaseTypeStages.pyCasetypeStartingFlows\", \"pyStartingFlowType\", EmailService.pyServiceActivityParams.flowType, false, true) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(" + index + ").pyEmailStartingFlow", new String[] { "", "", "pxResults", String.valueOf(index), "pyEmailStartingFlow", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_58.resolveToString(tools, pega.findPageWithException("EmailService", "Rule-Service-Email"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + index + ").pyCaseStartingProcess", new String[] { "", "", "pxResults", String.valueOf(index), "pyCaseStartingProcess", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_61.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT, (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", "Pega-RULES", "Utilities", new Object[] { scalarValueQuery_62.resolveToString(tools, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "pyStartingFlowType", pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType").getProperty("pyCasetypeStartingFlows") })).intValue()), "sTN", false, true);
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
 * Create email account page.
 * <p>
 * Step 14.7 <code>Page-New</code> [on page EmailAccount] <br>
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
String pz_63 = "EmailAccount";
myStepPage = tools.findPage(pz_63, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-EmailAccount","EmailAccount",false); 
// primary page will not be added to PageList
	 pega.setStepPage("EmailAccount", myStepPage);
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
 * Getting email id; If it is not present , moving to later step.
 * <p>
 * Step 14.8 <code>Obj-Open</code> [on page EmailAccount] <br>
 */
public boolean step14_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_64 = "EmailAccount";
myStepPage = tools.findPage(pz_64, true);
// Expression: 
// Expression: 
myStepPage = tools.getThread().createPage("Data-EmailAccount", pz_64);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyAccountName", pRef_65, myStepPage, scalarValueQuery_35.resolveToString(tools, pega.findPageWithException("pyCurrentCaseTypeListenersList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, index), "sTN", false, false);
}
{
    pega.setViaPropRef(".pyAccountType", pRef_66, myStepPage, "Notify", "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "EmailAccount", "", false, false);
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open", dbEx);
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__3 = pega.invokeWhen("StepStatusFail", "Rule-Obj-CaseType", "Data-EmailAccount");
if (pz__3) {
// branch to block NEA
nextBlock = "NEA";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_8_circum0 definition

/**
 * Setting email id.
 * <p>
 * Step 14.9 <code>Property-Set</code><br>
 */
public boolean step14_9_circum0() {
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
    pega.setViaPropRef(".pxResults(" + index + ").pyEmailAddress", new String[] { "", "", "pxResults", String.valueOf(index), "pyEmailAddress", "" }, pega.findPageWithException("MasterCaseEmailConfigurations", "Code-Pega-List"), scalarValueQuery_67.resolveToString(tools, pega.findPageWithException("EmailAccount", "Data-EmailAccount"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
boolean pz__5 = true;
if (pz__5) {
// branch to block EA
nextBlock = "EA";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_9_circum0 definition

/**
 * Make email account name empty if email account is not present.
 * <p>
 * Step 14.10 [NEA] <code>Property-Set</code> [on page MasterCaseEmailConfigurations.pxResults(Local.index)] <br>
 */
public boolean step14_10_circum0() {
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
    pega.setViaPropRef(".pyEmailAccountName", pRef_68, myStepPage, "", "stN", false, true);
}
{
    pega.setViaPropRef(".pyEmailAddress", pRef_69, myStepPage, "", "sTN", false, true);
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
pz_CurrentStepNum = "14.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_10_circum0 definition

/**
 * Incrementing index by 1.
 * <p>
 * Step 14.11 [EA] <code>Property-Set</code><br>
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
    index = (index + 1);
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
 * If control comes here, exit this iteration.
 * <p>
 * Step 14.12 <code>Java</code> [on page MasterCaseEmailConfigurations.pxResults(Local.index)] <br>
 */
public boolean step14_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__6 = true;
if (pz__6) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_12_circum0 definition

/**
 * Removing the config in case if flow is not present.
 * <p>
 * Step 14.13 [NSF] <code>Page-Remove</code> [on page MasterCaseEmailConfigurations.pxResults(Local.index)] <br>
 */
public boolean step14_13_circum0() {
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
pz_CurrentStepNum = "14.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_13_circum0 definition

/**
 * Resetting list length value.
 * <p>
 * Step 14.14 <code>Property-Set</code><br>
 */
public boolean step14_14_circum0() {
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
    listLength = (listLength - 1);
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
pz_CurrentStepNum = "14.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_14_circum0 definition

/**
 * Copying to currnet page(used for UI).
 * <p>
 * Step 15 [EL] <code>Page-Copy</code> [on page MasterCaseEmailConfigurations] <br>
 */
public boolean step15_circum0() {
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
// Expression: CurrentCaseEmailConfigurations
targetPage = tools.findPage("CurrentCaseEmailConfigurations", false);
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Set the Result Count on  CurrentCaseEmailConfigurations Page.
 * <p>
 * Step 16 <code>Property-Set</code> [on page CurrentCaseEmailConfigurations] <br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"\" , CurrentCaseEmailConfigurations.pxResults(1).pyEmailAddress)");
try {
boolean pz_74 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "", scalarValueQuery_72.resolveToString(tools, pega.findPageWithException("CurrentCaseEmailConfigurations", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"\" , CurrentCaseEmailConfigurations.pxResults(1).pyEmailAddress)",pz_74);
if (pz_74) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"\" , CurrentCaseEmailConfigurations.pxResults(1).pyEmailAddress) " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxResultCount", pRef_75, myStepPage, (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", "Pega-RULES", "Utilities", new Object[] { pega.findPageWithException("CurrentCaseEmailConfigurations", "Code-Pega-List").getProperty("pxResults") })).intValue(), "sNY", false, true);
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
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Set the Result Count on  CurrentCaseEmailConfigurations Page.
 * <p>
 * Step 17 <code>Property-Set</code> [on page CurrentCaseEmailConfigurations] <br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"\" , CurrentCaseEmailConfigurations.pxResults(1).pyEmailAddress)");
try {
boolean pz_77 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "", scalarValueQuery_72.resolveToString(tools, pega.findPageWithException("CurrentCaseEmailConfigurations", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"\" , CurrentCaseEmailConfigurations.pxResults(1).pyEmailAddress)",pz_77);
if (!pz_77) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"\" , CurrentCaseEmailConfigurations.pxResults(1).pyEmailAddress) " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxResultCount", pRef_75, myStepPage, 0, "sNY", false, true);
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
 * Remove default page for no unlocked RS case.
 * <p>
 * Step 18 <code>Page-Remove</code> [on page CurrentCaseEmailConfigurations] <br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "TempConfigPage.pyNoUnlockedRuleSetVer==\"true\"");
try {
boolean pz_80 = (scalarValueQuery_79.resolveToBoolean(tools, pega.findPageWithException("TempConfigPage", "Data-Admin-Connect-EmailListener"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "TempConfigPage.pyNoUnlockedRuleSetVer==\"true\"",pz_80);
if (!pz_80) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("TempConfigPage.pyNoUnlockedRuleSetVer==\"true\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CurrentCaseEmailConfigurations.pxResults(1).pyEmailAccountName == \"\"");
try {
boolean pz_83 = (scalarValueQuery_81.resolveToString(tools, pega.findPageWithException("CurrentCaseEmailConfigurations", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CurrentCaseEmailConfigurations.pxResults(1).pyEmailAccountName == \"\"",pz_83);
if (!pz_83) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CurrentCaseEmailConfigurations.pxResults(1).pyEmailAccountName == \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * Pouplate message on LP.
 * <p>
 * Step 19 <code>call pzPopulateEmailStatusMessageOnLP</code> [on page SelectedCaseType] <br>
 */
public boolean step19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzPopulateEmailStatusMessageOnLP");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzPopulateEmailStatusMessageOnLP", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzPopulateEmailStatusMessageOnLP
if (myStepPage == null) {
String pz_85 = "SelectedCaseType";
myStepPage = tools.findPage(pz_85, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_85, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Class");
}
}
// Calling Activity : pzPopulateEmailStatusMessageOnLP

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzPopulateEmailStatusMessageOnLP", "Rule-Obj-CaseType", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzPopulateEmailStatusMessageOnLP",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * Clear unnecessary pages.
 * <p>
 * Step 20 [PR] <code>Page-Remove</code><br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: EmailAccount
pageRemove(tools.findPage("EmailAccount"));
// Expression: EmailService
pageRemove(tools.findPage("EmailService"));
// Expression: RuleSetVersionPage
pageRemove(tools.findPage("RuleSetVersionPage"));
// Expression: pyViewLookUpList
pageRemove(tools.findPage("pyViewLookUpList"));
// Expression: pyCurrentCaseTypeListenersList
pageRemove(tools.findPage("pyCurrentCaseTypeListenersList"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
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

public String NoStartingFlowsPresent = "";
public int index = 0;
public int listLength = 0;

public void initializeUserLocalVariables() {
	NoStartingFlowsPresent = "";
	index = 0;
	listLength = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("NoStartingFlowsPresent", (NoStartingFlowsPresent == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : NoStartingFlowsPresent.toString());
	smRetVal.putString("index", Integer.toString(index));
	smRetVal.putString("listLength", Integer.toString(listLength));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_56 = new String[] { "", "", "pyCusMethod", "" };
public static final String[] pRef_55 = new String[] { "", "", "pyCusClass", "" };
public static final String[] pRef_73 = new String[] { "", "", "pxResults", "1", "pyEmailAddress", "" };
public static final String[] pRef_68 = new String[] { "", "", "pyEmailAccountName", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyCorrRuleSet", "" };
public static final String[] pRef_69 = new String[] { "", "", "pyEmailAddress", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyCorrRuleSetVersion", "" };
public static final String[] pRef_65 = new String[] { "", "", "pyAccountName", "" };
public static final String[] pRef_66 = new String[] { "", "", "pyAccountType", "" };
public static final String[] pRef_82 = new String[] { "", "", "pxResults", "1", "pyEmailAccountName", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxObjClass", "" };
public static final String[] pRef_59 = new String[] { "", "", "pyServiceActivityParams", "", "flowType", "" };
public static final String[] pRef_54 = new String[] { "", "", "pyCusPackage", "" };
public static final String[] pRef_75 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pyServiceClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_67 = FUAUtil.createQueryBuilder().scalarProperty("pyEmailAddress").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_79 = FUAUtil.createQueryBuilder().scalarProperty("pyNoUnlockedRuleSetVer").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_61 = FUAUtil.createQueryBuilder().pageList("pyCasetypeStartingFlows").scalarProperty("pyStartingFlowType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_58 = FUAUtil.createQueryBuilder().page("pyServiceActivityParams").scalarProperty("flowType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetVersion").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_44 = FUAUtil.createQueryBuilder().pageList("pxResults").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_62 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyEmailStartingFlow").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pxUpdateDateTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_81 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pyEmailAccountName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyAccountName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_5 = FUAUtil.createQueryBuilder().pageList("pxResults").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyServicePackage").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_72 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pyEmailAddress").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_57 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyMethod").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_38 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyListenerName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYPREPROCESSINGOFINBOUNDEMAILS #20200413T100713.681 GMT", "Rule-Obj-CaseType pyPreProcessingOfInboundEmails", "Pega-ProcessArchitect", "08-05-01", false, true, "", "ACTIVITY", "20200413T100713.681 GMT" ,"Rule-Obj-Activity"); }
