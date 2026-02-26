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
public class ra_action_pzdeclarativeloadcasehierarchy_404a40ed27f50a5c48648eae229e7472 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzDeclarativeLoadCaseHierarchy.Rule_Obj_Class.Action");
	public ra_action_pzdeclarativeloadcasehierarchy_404a40ed27f50a5c48648eae229e7472(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT	Pega-ProcessArchitect:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT";
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
String pz_6 = "Declare_CaseTree";
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 1 Circum: 0" );
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
String pz_8 = "CaseHierarchy";
thisStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 3 Circum: 0" );
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
String pz_14 = "AppRuleSets";
thisStepPage = tools.findPage(pz_14, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
thisStepPage = tools.getStepPage();
// Expression: Application
thisStepPage = tools.findPage("Application", true);
if (thisStepPage == null) {
throw new InvalidReferenceException("Application", "this step has no step page and attempts to use a relative reference for the Repeat string list property");
}
if (thisStepPage == null) {
throw new InvalidReferenceException(".pyRuleSetList", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_18 = propertyQuery_17.resolve(tools, thisStepPage);
pageRef = pz_18;
if (pageRef != null) {
myPageList = pageRef.iterator();
while(myPageList.hasNext() && (pz_Status == true)) {
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextProperty = (ClipboardProperty) myPageList.next();
//nextProperty will be used as the value of parameter values that refer to the repeating parameter with (<current>) to indicate its index value
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_0_circum0");
}
PRStackFrame pz_StackFrame5_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 5_0 Circum: 0" );
try {
pz_Status = step5_0_circum0(nextProperty);
} finally {
pega.popStackFrame(pz_StackFrame5_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the for loop for For Each PropertyList/Group
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_21 = pega.findPageWithException("Application", "Rule-Application").getIfPresent("pyWorkMetaData");
pageRef = pz_21;
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
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 8 Circum: 0" );
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
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 9 Circum: 0" );
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
String pz_22 = "pxThread";
thisStepPage = tools.findPage(pz_22, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_22, false);
thisStepPage.putString("pxObjClass", "Code-Pega-Thread");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CONT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 12 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_25 = "WorkTypesListPage";
thisStepPage = tools.findPage(pz_25, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_25, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_27 = pega.findPageWithException("WorkTypesListPage", "Code-Pega-List").getIfPresent("pxResults");
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
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 17_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_28 = pega.findPageWithException("CaseHierarchy", "Code-CaseHierarchy").getIfPresent("pxClassesInClassGroups");
pageRef = pz_28;
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
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 18_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_29 = pega.findPageWithException("Declare_CaseTree", "Rule-Obj-Class").getIfPresent("pxResults");
pageRef = pz_29;
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
if ( "Rule-Obj-Class".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Rule-Obj-Class").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 18 Circum: 0" );
try {
pz_Status = step18_circum0_Rule_Obj_Class();
} finally {
pega.popStackFrame(pz_StackFrame18_circum0, false);
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

// Code to call step 19_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_circum0");
}
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 20_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_34 = pega.findPageWithException("RemoteWorkTypesListPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_34;
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
if ( "Rule-Obj-Class".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Rule-Obj-Class").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_0_circum0");
}
PRStackFrame pz_StackFrame20_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 20_0 Circum: 0" );
try {
pz_Status = step20_0_circum0_Rule_Obj_Class();
} finally {
pega.popStackFrame(pz_StackFrame20_0_circum0, false);
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

// Code to call step 21_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 21_circum0");
}
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 21 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_47 = "Declare_CaseTree";
thisStepPage = tools.findPage(pz_47, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_47, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Class");
}
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 22 Circum: 0" );
try {
pz_Status = step22_circum0();
} finally {
pega.popStackFrame(pz_StackFrame22_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 23_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "23";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 23_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_52 = "Declare_CaseTree";
thisStepPage = tools.findPage(pz_52, true);
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 23 Circum: 0" );
try {
pz_Status = step23_circum0();
} finally {
pega.popStackFrame(pz_StackFrame23_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 24_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "24";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 24_circum0");
}
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 24 Circum: 0" );
try {
pz_Status = step24_circum0();
} finally {
pega.popStackFrame(pz_StackFrame24_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 25_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_circum0");
}
PRStackFrame pz_StackFrame25_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 25 Circum: 0" );
try {
pz_Status = step25_circum0();
} finally {
pega.popStackFrame(pz_StackFrame25_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 26_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "26";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 26_circum0");
}
PRStackFrame pz_StackFrame26_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 26 Circum: 0" );
try {
pz_Status = step26_circum0();
} finally {
pega.popStackFrame(pz_StackFrame26_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 27_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "27";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 27_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_57 = "Declare_CaseTree";
thisStepPage = tools.findPage(pz_57, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_57, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Class");
}
PRStackFrame pz_StackFrame27_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 27 Circum: 0" );
try {
pz_Status = step27_circum0();
} finally {
pega.popStackFrame(pz_StackFrame27_circum0, false);
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
	"Rule-Obj-Activity:PZDECLARATIVELOADCASEHIERARCHY"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZDECLARATIVELOADCASEHIERARCHY","Rule-Obj-Activity","RULE-OBJ-CLASS",false,"","Pega-ProcessArchitect","08-06-01","RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT","!PZDECLARATIVELOADCASEHIERARCHY",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",837476634)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT:20201222T071543.236 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "86b60647970a88cd7b6167c84c6c6139";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Class";
	}
public String getAspect() {
return "Action";
}
/**
 * Remove existing case types.
 * <p>
 * Step 1 <code>Property-Remove</code> [on page Declare_CaseTree] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxResults
if (myStepPage == null) {
throw new InvalidReferenceException(".pxResults", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_7 = myStepPage.getIfPresent("pxResults");
try {if (pz_7!= null) {
pz_7.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 1.";
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Step 2 <code>Page-New</code> [on page CaseHierarchy] <br>
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
String pz_9 = "CaseHierarchy";
myStepPage = tools.findPage(pz_9, true);
// Expression: Code-CaseHierarchy
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-CaseHierarchy","CaseHierarchy",false); 
// primary page will not be added to PageList
	 pega.setStepPage("CaseHierarchy", myStepPage);
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
 * Set param and application name.
 * <p>
 * Step 3 <code>Property-Set</code><br>
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
    pega.setViaPropRef(".pyAdminProduct", pRef_10, pega.findPageWithException("Declare_CaseTree", "Rule-Obj-Class"), scalarValueQuery_11.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    tools.putParamValue("OnlyCurrentWorkPool", PropertyInfo.TYPE_TRUEFALSE, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyCurrentWorkPool", pRef_12, myStepPage, "", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyClassGroup", pRef_13, myStepPage, "", "sIN", false, true);
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
 * To hold all the rulesets of current app.
 * <p>
 * Step 4 <code>Page-New</code> [on page AppRuleSets] <br>
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
String pz_15 = "AppRuleSets";
myStepPage = tools.findPage(pz_15, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-Application","AppRuleSets",false); 
// primary page will not be added to PageList
	 pega.setStepPage("AppRuleSets", myStepPage);
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
 * Set all rulesets to AppRuleSets.
 * <p>
 * Step 5.0 <code>Java</code> [on page Application] <br>
 */
public boolean step5_0_circum0(ClipboardProperty currentProperty) {
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

// Code to call nested step 5_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_1_circum0");
}
PRStackFrame pz_StackFrame5_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 5_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step5_1_circum0(currentProperty);
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame5_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 5_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_2_circum0");
}
PRStackFrame pz_StackFrame5_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 5_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step5_2_circum0(currentProperty);
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame5_2_circum0, false);
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
pz_CurrentStepNum = "5.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_0_circum0 definition

/**
 * Step 5.1 <code>Property-Set</code><br>
 */
public boolean step5_1_circum0(ClipboardProperty currentProperty) {
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
    rulesetIndex = (rulesetIndex + 1);
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
pz_CurrentStepNum = "5.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_1_circum0 definition

/**
 * Step 5.2 <code>Property-Set</code><br>
 */
public boolean step5_2_circum0(ClipboardProperty currentProperty) {
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
    pega.setViaPropRef(".pyRuleSetList(" + "<insert>" + rulesetIndex + ")", new String[] { "", "", "pyRuleSetList", "<insert>" + rulesetIndex }, pega.findPageWithException("AppRuleSets", "Rule-Application"), pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", "Pega-RULES", "String", new Object[] { scalarValueQuery_19.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), 0, (pega.<Integer>resolveMethodCall("inString--(String,String)", "inString", "Pega-RULES", "String", new Object[] { scalarValueQuery_19.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), ":" })).intValue() }), "sTN", false, true);
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
pz_CurrentStepNum = "5.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_2_circum0 definition

/**
 * Set current work pool class.
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
    appCaseTypes = (("\"" + scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("pxThread", "Code-Pega-Thread"), ImmutablePropertyInfo.TYPE_TEXT)) + "\"");
}
{
    pega.setViaPropRef(".pyClassGroup", pRef_13, pega.findPageWithException("Declare_CaseTree", "Rule-Obj-Class"), scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("pxThread", "Code-Pega-Thread"), ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyCurrentWorkPool", pRef_12, pega.findPageWithException("Declare_CaseTree", "Rule-Obj-Class"), scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("pxThread", "Code-Pega-Thread"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
 * Catch work type classes from app.
 * <p>
 * Step 7 <code>Java</code> [on page Application.pyWorkMetaData] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String className = myStepPage.getString("pyWorkTypeImplementationClassName");
String cleanName = pega_processarchitect_pzprocessarchitect.pzPageNameClean(className);
String showInNewWork = myStepPage.getString("pyShowInNewWorkMenu");

// filtering out case type wjere pyCategory=conversation as they should be visible only in channels
boolean isConsersation = pega_processarchitect_pzprocessarchitect.pzIsConversationFlow(className);
if(!isConsersation) {
  if( !"false".equals(showInNewWork) && !"".equals(cleanName) ) {
    tools.findPage("CaseHierarchy").putString(".pxClassesInApplicationWorkTypes(" + cleanName + ")", className);
  }
  if( appCaseTypes.length() == 0 ) {
    appCaseTypes += "\"" + className + "\"";
  } else {
    appCaseTypes += ("," + "\"" + className + "\"");
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
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * BUG-121333: When no case types are mentioned in application rule form setting this to a junk value.
 * <p>
 * Step 8 <code>Java</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//BUG-121333: When no case types are mentioned in application rule form setting this to a junk value
//Ideally we want to skip execution of list view. Should take this up later while reviewing entire cases explorer logic
if ( appCaseTypes.length() == 0 || "\"\"".equals(appCaseTypes))
   appCaseTypes = "'X'";
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
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
    tools.putParamValue("appCaseTypes", PropertyInfo.TYPE_TEXT, appCaseTypes);
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
 * No App rulesets- set param for displaying warnign on 'Case Definition Tree'.
 * <p>
 * Step 10 <code>Property-Set</code> [on page pxThread] <br>
 */
public boolean step10_circum0() {
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
    tools.putParamValue("noWorkTypes", PropertyInfo.TYPE_TRUEFALSE, (((pega.<Integer>resolveMethodCall("Size--(String,Activity)", "Size", null, null, new Object[] { "pxThread.pxApplicationRuleSets", tools })).intValue() > 0) ? false : true));
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
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * BUG-101632: Setting flag for case types can't be added message.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("pzCanNotCreateWorkTypesForLP", "Rule-Obj-Class", "Rule-Obj-Class");
if (!pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.noWorkTypes==true");
try {
boolean pz_23 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "noWorkTypes") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.noWorkTypes==true",pz_23);
if (!pz_23) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.noWorkTypes==true " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyCurrentWorkPool", pRef_12, myStepPage, "Pega", "sTN", false, true);
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
 * Get all work types in application though not in details tab.
 * <p>
 * Step 12 [CONT] <code>call pxGetAllWorkTypesInAppForCaseExplorer</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pxGetAllWorkTypesInAppForCaseExplorer");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.noWorkTypes==true");
try {
boolean pz_24 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "noWorkTypes") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.noWorkTypes==true",pz_24);
if (pz_24) {
// branch to block PR
nextBlock = "PR";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.noWorkTypes==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call pxGetAllWorkTypesInAppForCaseExplorer", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pxGetAllWorkTypesInAppForCaseExplorer
if (myStepPage == null) {
}
// Calling Activity : pxGetAllWorkTypesInAppForCaseExplorer
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxGetAllWorkTypesInAppForCaseExplorer", "Rule-Obj-Class", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pxGetAllWorkTypesInAppForCaseExplorer",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * No work types found set param for displaying warnign on 'Case Definition Tree'.
 * <p>
 * Step 13 <code>Property-Set</code> [on page WorkTypesListPage] <br>
 */
public boolean step13_circum0() {
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
    tools.putParamValue("noWorkTypes", PropertyInfo.TYPE_TRUEFALSE, (((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { pega.findPageWithException("WorkTypesListPage", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0) ? false : true));
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.noWorkTypes==true");
try {
boolean pz_26 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "noWorkTypes") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.noWorkTypes==true",pz_26);
if (pz_26) {
// branch to block PR
nextBlock = "PR";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.noWorkTypes==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Get default workbasket.
 * <p>
 * Step 14 <code>Call Work-.ToDefaultWorkbasket</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Work-.ToDefaultWorkbasket");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Work-.ToDefaultWorkbasket", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Work-.ToDefaultWorkbasket
if (myStepPage == null) {
}
// Calling Activity : Work-.ToDefaultWorkbasket
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "ToDefaultWorkbasket", "Rule-Obj-Class", "Work-");
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Work-.ToDefaultWorkbasket",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * get default workbasket name, store local variable.
 * <p>
 * Step 15 <code>Property-Set</code><br>
 */
public boolean step15_circum0() {
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
    defaultWorkbasket = tools.getParamValue("AssignTo");
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * for each, get classgroup and case type.
 * <p>
 * Step 16 <code>Java</code> [on page WorkTypesListPage.pxResults] <br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// for current classgroup populate directed parent on Declare_CaseTree
// to get 'Derives From' on Add modal from '+Add' on Case Designer LP
currWorkPool = tools.findPage("pxThread").getString("pxCurrentWorkPool");
if(tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "OnlyCurrentWorkPool") && pega_rules_string.equalsIgnoreCase(myStepPage.getString("pyClassGroupIndicator"), "ISCLASSGROUP")  && currWorkPool.equals(myStepPage.getString("pyClassGroup"))){
	//populate class group information on Declare_CaseTree
         //to populate Derives From on 'Add' modal
	tools.findPage("Declare_CaseTree").putString("pyDerivesFrom", myStepPage.getString("pyDerivesFrom"));
}
// Useful for creating links in the tree nodes
myStepPage.putString("pxInsName", myStepPage.getString("pyClassName") + "!pyDefault");
try {
	// First, get the classgroup class
	String className = myStepPage.getString(".pyClassName");
	String classGroupName = myStepPage.getString(".pyClassGroup");
	if (classGroupName.equals(""))
		return true;

	// sanitize class group name
	String classGroupSan = classGroupName.replace('-', '_');

	// Add the page for this class to the class group's pagegroup
	ClipboardPage CaseHierarchy = tools.findPage("CaseHierarchy");
	ClipboardPage classesInClassGroup = CaseHierarchy.getProperty(".pxClassesInClassGroups(" + classGroupSan + ")").getPageValue();
	classesInClassGroup.putString(".pyUsage", classGroupName);

	classesInClassGroup.getProperty(".pxResults").add(myStepPage);

	// Now open the casetype, if this class derives from Work-Cover-, and store it in pxCaseTypes
	ClassDefinition wc = tools.getDatabase().getClassDef("Work-Cover-");
	if (wc.isAncestorOf(className))
	{
		StringMap keys = new HashStringMap();
		keys.putString("pxObjClass", "Rule-Obj-CaseType");
		keys.putString("pyClassName", className);
		keys.putString("pyPurpose", "pyDefault");

		ClipboardPage caseTypePage = tools.getDatabase().open(keys, true);
				if (caseTypePage != null && caseTypePage.getString("pyClassName").equals(className))
		{		
			// We only need to store the class name and the coverable classes
			ClipboardPage caseTypeToAdd = tools.createPage("Rule-Obj-CaseType", "");
			ClipboardProperty coverableClasses = caseTypePage.getProperty(".pyCoverableClasses");
			 
                            //Get the locking values
			ClipboardProperty lockingMode = caseTypePage.getProperty(".pyLockingMode");
                        caseTypeToAdd.getProperty(".pyLockingMode").setValue(lockingMode);
                       			
			caseTypeToAdd.getProperty(".pyCoverableClasses").setValue(coverableClasses);
			caseTypeToAdd.putString(".pyClassName", className);

                  //Get the offline status
			ClipboardProperty offlineEnabled = caseTypePage.getProperty(".pyOfflineEnabled");
                        caseTypeToAdd.getProperty(".pyOfflineEnabled").setValue(offlineEnabled);

                  //Get the offline workbasket 
			ClipboardProperty offlineSyncIssuesWorkbasket = caseTypePage.getProperty(".pyOfflineSyncIssuesWorkbasket");
            // get offline sync issues workbasket, if blank, set to default work basket
            if (offlineSyncIssuesWorkbasket.getStringValue().equals("")) {
              	offlineSyncIssuesWorkbasket.setValue(defaultWorkbasket);
            }
                        caseTypeToAdd.getProperty(".pyOfflineSyncIssuesWorkbasket").setValue(offlineSyncIssuesWorkbasket);
                  
                  
			
            		//Set dependants
                
             		ClipboardProperty pyDependents = caseTypePage.getProperty("pyDependents");
             		caseTypeToAdd.getProperty("pyDependents").setValue(pyDependents);

             		// set description
             		caseTypeToAdd.putString(".pyDescription", caseTypePage.getString("pyDescription"));
                  caseTypeToAdd.putString(".pyCategory", caseTypePage.getString("pyCategory"));

			// sanitize classname
			String classSan = className.replace('-','_');

			ClipboardProperty pxCaseTypes = CaseHierarchy.getProperty(".pxCaseTypes");
			pxCaseTypes.add(classSan, caseTypeToAdd);
			
			// now loop through the coverable classes and add each to pxCoveredClasses, unless it covers itself
			ClipboardProperty pxCoveredClasses = CaseHierarchy.getProperty(".pxCoveredClasses");

			java.util.Iterator coveredIt = coverableClasses.iterator();
			while (coveredIt.hasNext())
			{
				ClipboardProperty coveredClassRef = (ClipboardProperty)coveredIt.next();
				ClipboardPage coveredClassPage = coveredClassRef.getPageValue();
				String coveredClassName = coveredClassPage.getString(".pyClass");
				if (coveredClassName.equals(className)) continue;
				String coveredClassSan = coveredClassName.replace('-', '_');

                		if (!coveredClassSan.equals("") && !coveredClassName.equals("")) {
					// Get current value
					String value = pxCoveredClasses.getStringValue(coveredClassSan);
					if (value.length() > 0) {
						value += "\t" + className;
					} else {
						value = className;
					}
				   pxCoveredClasses.add(coveredClassSan, value);
                                }
			}			
		}
		// mark classes that does not have case type to be removed 
		// from 'WorkTypesListPage' page later
		else{
			myStepPage.putString("NoCaseType","true");
		}
	}
} catch (DatabaseException ex) {

	oLog.error("### problem: " + ex.getMessage());
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * for each classgroup class, build out the tree.
 * <p>
 * Step 17 <code>Java</code> [on page CaseHierarchy.pxClassesInClassGroups] <br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage CaseHierarchy = myStepPage.getTopLevelPage();
ClipboardPage Declare_CaseTree = tools.findPage("Declare_CaseTree");
ClipboardProperty pxResults = Declare_CaseTree.getProperty(".pxResults");
String classGroupName = myStepPage.getString(".pyUsage");


// add current work pool information on Declare_CaseTree
if(currWorkPool.equals(classGroupName)){ 
	// Add this classgroup node to the Declare_CaseTree
	Declare_CaseTree.putString("pyClassName", classGroupName);
	Declare_CaseTree.putString("pyClassGroup", classGroupName);
	Declare_CaseTree.putString("pyClassGroupIndicator", "ISCLASSGROUP");	
	Declare_CaseTree.putString("pyExpanded", "true");
	Declare_CaseTree.putString("pyUsage", "NoCaseType");

	// need the class group's label from the class definition, in case it's not part of the app
	String label = tools.getDictionary().fromDefinition(classGroupName, "pyLabel");
	if (label != null && label.length() > 0) {
		Declare_CaseTree.putString(".pyLabel", label);
	}
}

ClipboardPage otherNode = tools.createPage("Rule-Obj-Class", "");
otherNode.putString("pyClassName", "Work-Cover-");
otherNode.putString("pyClassGroup", classGroupName);
otherNode.putString("pyClassGroupIndicator", "HASCLASSGROUP");
otherNode.putString("pyLabel", "Other");
otherNode.putString("pyTreeGridIcon", "images/pyClassGroupPlaceholder.gif");
otherNode.putString("pyExpanded", "true");
otherNode.putString("pyUsage", "NoCaseType");
otherNode.putString("pyIsInOtherNode", "true");

pxResults.add(otherNode);

// Get the pxResults of the node we just added for Other
ClipboardProperty otherNodeResults = pxResults.getPageValue(pxResults.size()).getProperty(".pxResults");

// Now loop through the classes for this classgroup and add them in the
// appropriate order.
ClipboardProperty classes = myStepPage.getProperty(".pxResults");
java.util.Iterator classIt = classes.iterator();
while (classIt.hasNext())
{
	ClipboardProperty classRef = (ClipboardProperty)classIt.next();
	ClipboardPage classPage = classRef.getPageValue();
	String classname = classPage.getString(".pyClassName");
                String classLabel = classPage.getString(".pyLabel");	
                        String flowLabel = "";
	String classSan = classname.replace('-', '_');

	// Check if this class is covered or not
	boolean covered = false;
	ClipboardProperty coveredClass = CaseHierarchy.getIfPresent(".pxCoveredClasses(" + classSan + ")");
	if (coveredClass != null) {
		covered = true;
		// Bug-31150: Need to be clever here: As long as there is a single class covering this one,
		// walk up the chain (single cases only allowed): if we get back to this class,
		// then this is just an example of a class that covers itself downstream, with no
		// other peer or parent classes covering it, so it's not really covered
		String coveringClassSan = coveredClass.toString().replace('-', '_');
		String chain = "";
		while (coveringClassSan.length() > 0) {
			if (coveringClassSan.equals(classSan)) {
				// self-containment: treat as top level
				covered = false;
				break;
			}
			if (coveringClassSan.indexOf("\t") >= 0) {
				// multiple covering classes: never top-level
				covered=true;
				break;
			}
			if (chain.indexOf(coveringClassSan + "\t") >= 0) {
				covered=true;
				break;
			} else {
				chain += coveringClassSan + "\t";
			}

			coveredClass = CaseHierarchy.getIfPresent(".pxCoveredClasses(" + coveringClassSan + ")");
			if (coveredClass == null) break;
			coveringClassSan = coveredClass.toString().replace('-', '_');
		}

	}

	if (!covered)
	{
		// This class is not covered by any of the casetypes, so add it to the first level under
		// the classgroup node
		classPage.putString("pyExpanded", "true");		
		classPage.putString("pyTopCase", "true");
		ClipboardProperty cpCaseType = CaseHierarchy.getIfPresent(".pxCaseTypes(" + classSan + ")");
		if (cpCaseType != null)
		{
			//Get the locking mode for top level cases and populate them in the tree
			String lockingMode = cpCaseType.getStringValue("pyLockingMode");
			String lockMode = "".equalsIgnoreCase(lockingMode)?"Default":lockingMode;
          	classPage.putString("pyCategory", cpCaseType.getStringValue("pyCategory"));
			classPage.putString("pyLockingMode",lockMode);
          	classPage.putString("pyOfflineEnabled",cpCaseType.getStringValue("pyOfflineEnabled"));
            
            // get offline sync issues workbasket, if blank, set to default work basket
			if (cpCaseType.getStringValue("pyOfflineSyncIssuesWorkbasket").equals("")) {
              	cpCaseType.getProperty("pyOfflineSyncIssuesWorkbasket").setValue(defaultWorkbasket);
            }
            classPage.putString("pyOfflineSyncIssuesWorkbasket",cpCaseType.getStringValue("pyOfflineSyncIssuesWorkbasket")); 
			
ClipboardProperty dependents = cpCaseType.getProperty(".pyDependents");
java.util.Iterator depIt = dependents.iterator();

while(depIt.hasNext()){

ClipboardProperty depRef = (ClipboardProperty)depIt.next();
ClipboardPage depPage = depRef.getPageValue();

String strCurrentDependent = depPage.getString("pxSubscript");
ClipboardProperty propCaseTypeWithDependencies = CaseHierarchy.getIfPresent(".pxCaseTypes(" + strCurrentDependent + ")");
if (propCaseTypeWithDependencies != null) {
propCaseTypeWithDependencies.getPageValue().put(depRef.getProperty("pyActivators"));
}
}
			if (classname.equals(classGroupName)) {
				// This class is the class group, and has a case type rule
				// we want to show it as its own top level node so it can be manipulated
				classPage.putString(".pyClassGroupIndicator", "HASCLASSGROUP");
				classPage.putString(".pyUsage", "");
				foundWorkPoolAlsoTopCaseType = true; // all class groups will need a prefix in their label
			}
   
			// We know the "Other" node is there, so the size is at least one
			pxResults.add(pxResults.size(), classPage);

;
			// Get the class node we just added
			classPage = pxResults.getPageValue(pxResults.size() -1);
          // calling pyUsage get property to set it if it is empty
          classPage.getProperty("pyUsage");

			// Now build out the tree under this node
			pega_rules_utilities.callActivity(classPage, "pzAddSubNodesToCaseHierarchyForLP", null);
		} else if (classname.equals(classGroupName)) {
                    continue;
                } 
	}
}
if(otherNodeResults.size() == 0){
	otherNodeResults.getParentProperty().removeFromClipboard();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * optionally prefix the label of the classgroups.
 * <p>
 * Step 18 <code>property-set</code> [on page Declare_CaseTree.pxResults] <br>
 */
public boolean step18_circum0_Rule_Obj_Class() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.OnlyCurrentWorkPool");
try {
boolean pz_30 = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "OnlyCurrentWorkPool");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.OnlyCurrentWorkPool",pz_30);
if (pz_30) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.OnlyCurrentWorkPool " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.foundWorkPoolAlsoTopCaseType");
try {
boolean pz_31 = foundWorkPoolAlsoTopCaseType;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.foundWorkPoolAlsoTopCaseType",pz_31);
if (!pz_31) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.foundWorkPoolAlsoTopCaseType " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("property-set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  property-set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyLabel", pRef_32, myStepPage, ("Work Pool: " + scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN64", false, true);
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
pz_CurrentStepNum = "18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0_Rule_Obj_Class definition

/**
 * Get remote classes.
 * <p>
 * Step 19 <code>call pxGetRemoteWorkTypesInApplication</code><br>
 */
public boolean step19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pxGetRemoteWorkTypesInApplication");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pxGetRemoteWorkTypesInApplication", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pxGetRemoteWorkTypesInApplication
if (myStepPage == null) {
}
// Calling Activity : pxGetRemoteWorkTypesInApplication
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxGetRemoteWorkTypesInApplication", "Rule-Obj-Class", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pxGetRemoteWorkTypesInApplication",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * Add remote cases types to the class tree page.
 * <p>
 * Step 20.0 <code>Java</code> [on page RemoteWorkTypesListPage.pxResults] <br>
 */
public boolean step20_0_circum0_Rule_Obj_Class() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String className = myStepPage.getString(".pyClassName");
StringMap keys = new HashStringMap();
keys.putString("pxObjClass", "Rule-Obj-CaseType");
keys.putString("pyClassName", className);
keys.putString("pyPurpose", "pyDefault");

try
{
	ClipboardPage caseTypePage = tools.getDatabase().open(keys, true);
	if (caseTypePage != null && caseTypePage.getString("pyClassName").equals(className))
	{
		caseExists = true;
	}else
	{
		caseExists = false;
	}
}catch (DatabaseException ex) {

	oLog.error("### problem: could not open case type for the class. " + ex.getMessage());
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

// Code to call nested step 20_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_1_circum0");
}
PRStackFrame pz_StackFrame20_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 20_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step20_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame20_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 20_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_2_circum0");
}
PRStackFrame pz_StackFrame20_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 20_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step20_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame20_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 20_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_3_circum0");
}
PRStackFrame pz_StackFrame20_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT Step: 20_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step20_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame20_3_circum0, false);
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
pz_CurrentStepNum = "20.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_0_circum0_Rule_Obj_Class definition

/**
 * Add remote cases types to the class tree page.
 * <p>
 * Step 20.1 <code>property-set</code><br>
 */
public boolean step20_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyIsRemote==true &amp;&amp; local.caseExists==true");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyIsRemote==true && local.caseExists==true", "FUAInstance-NullMyStepPage");
}
boolean pz_36 = ((scalarValueQuery_35.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) && (caseExists == true));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyIsRemote==true &amp;&amp; local.caseExists==true",pz_36);
if (!pz_36) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyIsRemote==true &amp;&amp; local.caseExists==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("property-set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  property-set
{
    pega.setViaPropRef(".pyClassGroupIndicator", pRef_37, myStepPage, "HASCLASSGROUP", "stN", false, true);
}
{
    pega.setViaPropRef(".pyTreeGridIcon", pRef_38, myStepPage, "images/pxCasesTab.png", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyExpanded", pRef_39, myStepPage, "true", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyTopCase", pRef_40, myStepPage, "true", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyUsage", pRef_41, myStepPage, "FederatedCase", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxInsName", pRef_42, myStepPage, (scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "!pyDefault"), "sIY", false, true);
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
pz_CurrentStepNum = "20.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_1_circum0 definition

/**
 * Get the description from the case type as we are doing for other case types.
 * <p>
 * Step 20.2 <code>Java</code><br>
 */
public boolean step20_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
try
{
StringMap keys = new HashStringMap();
		keys.putString("pxObjClass", "Rule-Obj-CaseType");
		keys.putString("pyClassName", myStepPage.getString("pyClassName"));
		keys.putString("pyPurpose", "pyDefault");
ClipboardPage caseTypePage = tools.getDatabase().open(keys, true);

if (caseTypePage != null){
   myStepPage.putString(".pyDescription", caseTypePage.getString("pyDescription"));
   myStepPage.putString(".pyCategory", caseTypePage.getString("pyCategory"));
}
   

} catch (DatabaseException ex) {

	oLog.error("### problem: " + ex.getMessage());
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
pz_CurrentStepNum = "20.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_2_circum0 definition

/**
 * add the page to Class Tree Page.
 * <p>
 * Step 20.3 <code>Page-Copy</code><br>
 */
public boolean step20_3_circum0() {
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
// Expression: RemoteWorkTypesListPage.pxResults(<CURRENT>)
ClipboardPage pz_45 = pageQuery_44.resolve(tools, pega.findPageWithException("RemoteWorkTypesListPage", "Code-Pega-List"), forEachCounter);
sourcePage = pz_45;
// Expression: Declare_CaseTree.pxResults(<APPEND>)
ClipboardPage pz_46 = pega.findPageWithException("Declare_CaseTree", "Rule-Obj-Class").getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_46;
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
pz_CurrentStepNum = "20.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_3_circum0 definition

/**
 * Remove the Remote Work Types Page.
 * <p>
 * Step 21 <code>Page-Remove</code><br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: RemoteWorkTypesListPage
pageRemove(tools.findPage("RemoteWorkTypesListPage"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * set noWorkTypes to display mssage on Case Designer LP & set pxRequestor.pxCurrentCaseType to "" when no case types found.
 * <p>
 * Step 22 <code>property-set</code> [on page Declare_CaseTree] <br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("property-set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  property-set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("noWorkTypes", PropertyInfo.TYPE_TRUEFALSE, (((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { myStepPage.getProperty("pxResults") })).intValue() > 0) ? false : true));
}
{
    pega.setViaPropRef(".pxCurrentCaseType", pRef_48, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "noWorkTypes") ? "" : scalarValueQuery_49.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT)), "sTY", false, true);
}
{
    pega.setViaPropRef(".pzStandardTimeout", pRef_50, myStepPage, scalarValueQuery_51.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_INTEGER), "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

/**
 * Step 23 <code>obj-sort</code> [on page Declare_CaseTree] <br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "obj-sort");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("obj-sort", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  obj-sort
// Expression: pxResults
// Expression: pyLabel
String[] mySortKey = new String[1];
boolean[] mySortOrder = new boolean[1];
String[] myComparator = new String[1];
mySortKey[0] = "pyLabel";
mySortOrder[0] = true;
myComparator[0] = "";
if (myStepPage == null) {
String pz_53 = "Declare_CaseTree";
myStepPage = tools.findPage(pz_53, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_53, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Class");
}
}
if (myStepPage == null) {
throw new InvalidReferenceException("Declare_CaseTree", "this step page does not exist and cannot be shown");
}
ClipboardProperty pageList = myStepPage.getProperty("pxResults");
if (! pega.sortPageList(pageList, mySortKey, mySortOrder, myComparator)) {
// status reports why sort failed
return false;
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
pz_CurrentStepNum = "23";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "obj-sort",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * Filtering page for parent case type in add modal.
 * <p>
 * Step 24 <code>java</code><br>
 */
public boolean step24_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
Iterator iter = tools.getProperty("WorkTypesListPage.pxResults").iterator();

while(iter.hasNext()){

	ClipboardProperty cp = (ClipboardProperty)iter.next();
	ClipboardPage cPage = cp.getPageValue();

	String pyClassName = cPage.getStringIfPresent(".pyClassName");

	if ( !tools.getDictionary().getClassInfo("Work-Cover-").isAncestorOf(pyClassName) ) {
		cp.removeFromClipboard(); 
         }
	// remove classes that does not have case type
	if(cPage.getString("NoCaseType").equals("true")){
		cp.removeFromClipboard(); 
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
pz_CurrentStepNum = "24";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0 definition

/**
 * remove temp pages & exit if no work types found.
 * <p>
 * Step 25 [PR] <code>Page-Remove</code><br>
 */
public boolean step25_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pxRequestor.pyUserDebugSwitch==false");
try {
boolean pz_55 = (scalarValueQuery_54.resolveToBoolean(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == false);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pxRequestor.pyUserDebugSwitch==false",pz_55);
if (!pz_55) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pxRequestor.pyUserDebugSwitch==false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: CurrentApplication
pageRemove(tools.findPage("CurrentApplication"));
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.noWorkTypes==true");
try {
boolean pz_56 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "noWorkTypes") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.noWorkTypes==true",pz_56);
if (pz_56) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzDeclarativeLoadCaseHierarchy - Transition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.noWorkTypes==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "25";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_circum0 definition

/**
 * Extend the current activity by updating pyExtendedLoadCaseHierarchy.
 * <p>
 * Step 26 <code>call pyExtendedLoadCaseHierarchy</code><br>
 */
public boolean step26_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pyExtendedLoadCaseHierarchy");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pyExtendedLoadCaseHierarchy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pyExtendedLoadCaseHierarchy
if (myStepPage == null) {
}
// Calling Activity : pyExtendedLoadCaseHierarchy

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pyExtendedLoadCaseHierarchy", "Rule-Obj-Class", "");
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
pz_CurrentStepNum = "26";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pyExtendedLoadCaseHierarchy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_circum0 definition

/**
 * update the time and dirty flag only it is not explicit refresh in the Cases Explorer.
 * <p>
 * Step 27 <code>Property-Set</code> [on page Declare_CaseTree] <br>
 */
public boolean step27_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.isExplicitRefresh==true");
try {
boolean pz_58 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "isExplicitRefresh") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.isExplicitRefresh==true",pz_58);
if (pz_58) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.isExplicitRefresh==true " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxUpdateDateTime", pRef_59, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pyIsDirty", pRef_60, myStepPage, true, "sSN", false, true);
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
pz_CurrentStepNum = "27";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_circum0 definition

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

public boolean caseExists = false;
public String appCaseTypes = "";
public String defaultWorkbasket = "";
public boolean foundWorkPoolAlsoTopCaseType = false;
public String currWorkPool = "";
public int rulesetIndex = 0;

public void initializeUserLocalVariables() {
	caseExists = false;
	appCaseTypes = "";
	defaultWorkbasket = "";
	foundWorkPoolAlsoTopCaseType = false;
	currWorkPool = "";
	rulesetIndex = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("caseExists", Boolean.toString(caseExists));
	smRetVal.putString("appCaseTypes", (appCaseTypes == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : appCaseTypes.toString());
	smRetVal.putString("defaultWorkbasket", (defaultWorkbasket == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : defaultWorkbasket.toString());
	smRetVal.putString("foundWorkPoolAlsoTopCaseType", Boolean.toString(foundWorkPoolAlsoTopCaseType));
	smRetVal.putString("currWorkPool", (currWorkPool == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : currWorkPool.toString());
	smRetVal.putString("rulesetIndex", Integer.toString(rulesetIndex));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_10 = new String[] { "", "", "pyAdminProduct", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyClassGroup", "" };
public static final String[] pRef_40 = new String[] { "", "", "pyTopCase", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyUsage", "" };
public static final String[] pRef_50 = new String[] { "", "", "pzStandardTimeout", "" };
public static final String[] pRef_59 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_32 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyCurrentWorkPool", "" };
public static final String[] pRef_39 = new String[] { "", "", "pyExpanded", "" };
public static final String[] pRef_42 = new String[] { "", "", "pxInsName", "" };
public static final String[] pRef_48 = new String[] { "", "", "pxCurrentCaseType", "" };
public static final String[] pRef_37 = new String[] { "", "", "pyClassGroupIndicator", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyTreeGridIcon", "" };
public static final String[] pRef_60 = new String[] { "", "", "pyIsDirty", "" };
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarProperty("pxCurrentCaseType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pxCurrentWorkPool").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pyIsRemote").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_54 = FUAUtil.createQueryBuilder().scalarProperty("pyUserDebugSwitch").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().scalarList("pyRuleSetList").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final PageQuery pageQuery_44 = FUAUtil.createQueryBuilder().pageList("pxResults").buildPageQuery();
private static final PropertyQuery propertyQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetList").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().scalarProperty("pxSystemLockExpirationInterval").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZDECLARATIVELOADCASEHIERARCHY #20201020T134749.786 GMT", "Rule-Obj-Class pzDeclarativeLoadCaseHierarchy", "Pega-ProcessArchitect", "08-06-01", false, true, "", "LOADDECLARATIVEPAGE", "20201222T071543.236 GMT" ,"Rule-Obj-Activity"); }
