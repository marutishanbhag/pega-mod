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
public class ra_action_pzbrowseproperties_dd75ac0396f908bebe1f24c021e0d43b extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzBrowseProperties._baseclass.Action");
	public ra_action_pzbrowseproperties_dd75ac0396f908bebe1f24c021e0d43b(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 1 Circum: 0" );
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
String pz_11 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_11, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_11, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 2 Circum: 0" );
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
String pz_14 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_14, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_14, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 3 Circum: 0" );
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
String pz_25 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_25, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_25, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 4 Circum: 0" );
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
String pz_26 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_26, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 5 Circum: 0" );
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
String pz_28 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_28, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_28, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_33 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_33, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_33, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 7 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_35 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_35, true);
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 8 Circum: 0" );
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
String pz_39 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_39, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_39, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FIELDS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_45 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_45, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_45, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 10 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
thisStepPage = pega.findDataPage("D_pxRelevantRecords", false, "InitializeWhenMissing", String.valueOf(false), "RecordType", tools.getParamValue("RecordType"), "ContextClass", tools.getParamValue("BrowseClassName"));
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 11 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_49 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_49, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_49, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 12 Circum: 0" );
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
String pz_51 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_51, true);
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 13 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_54 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_54, true);
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_56 = pega.findPageWithException("TempFieldsPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_56;
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
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 17_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_64 = pega.findPageWithException("TempFieldsPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_64;
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
pz_CurrentStepNum = "17.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_0_circum0");
}
PRStackFrame pz_StackFrame17_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_0 Circum: 0" );
try {
pz_Status = step17_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_0_circum0, false);
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
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 18 Circum: 0" );
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
String pz_84 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_84, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_84, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 19 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_86 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_86, true);
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 20 Circum: 0" );
try {
pz_Status = step20_circum0();
} finally {
pega.popStackFrame(pz_StackFrame20_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 21_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_88 = pega.findPageWithException("TempFieldsPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_88;
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
pz_CurrentStepNum = "21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 21_circum0");
}
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 21 Circum: 0" );
try {
pz_Status = step21_circum0();
} finally {
pega.popStackFrame(pz_StackFrame21_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 22_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FORMS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_90 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_90, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_90, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 22 Circum: 0" );
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
thisStepPage = pega.findDataPage("D_pxRelevantRecords", false, "InitializeWhenMissing", String.valueOf(false), "RecordType", tools.getParamValue("RecordType"), "ContextClass", tools.getParamValue("BrowseClassName"));
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 23 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_93 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_93, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_93, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 24 Circum: 0" );
try {
pz_Status = step24_circum0();
} finally {
pega.popStackFrame(pz_StackFrame24_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 25_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_94 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_94, true);
PRStackFrame pz_StackFrame25_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 25 Circum: 0" );
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
PRStackFrame pz_StackFrame26_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 26 Circum: 0" );
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
String pz_96 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_96, true);
PRStackFrame pz_StackFrame27_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 27 Circum: 0" );
try {
pz_Status = step27_circum0();
} finally {
pega.popStackFrame(pz_StackFrame27_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 28_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_98 = pega.findPageWithException("TempFormsPage", (String) null).getIfPresent("pxResults");
pageRef = pz_98;
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
pz_CurrentStepNum = "28.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 28_0_circum0");
}
PRStackFrame pz_StackFrame28_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 28_0 Circum: 0" );
try {
pz_Status = step28_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame28_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 29_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "29";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 29_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_103 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_103, true);
PRStackFrame pz_StackFrame29_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 29 Circum: 0" );
try {
pz_Status = step29_circum0();
} finally {
pega.popStackFrame(pz_StackFrame29_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 30_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "30";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 30_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_105 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_105, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_105, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame30_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 30 Circum: 0" );
try {
pz_Status = step30_circum0();
} finally {
pega.popStackFrame(pz_StackFrame30_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 31_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DATATYPES"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "31";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 31_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_106 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_106, true);
PRStackFrame pz_StackFrame31_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 31 Circum: 0" );
try {
pz_Status = step31_circum0();
} finally {
pega.popStackFrame(pz_StackFrame31_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 32_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_109 = pega.findDataPage("D_pzDataTypesOfApp", true, "AppVersion", scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "FilterIfNoAutogenerateKey", String.valueOf(true), "FilterIfNotInParentsDependencyPath", String.valueOf(true), "ParentRuleSet", scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "FilterIfNoDataTable", String.valueOf(true), "AppName", scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)).getIfPresent("pxResults");
pageRef = pz_109;
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
pz_CurrentStepNum = "32";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 32_circum0");
}
PRStackFrame pz_StackFrame32_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 32 Circum: 0" );
try {
pz_Status = step32_circum0();
} finally {
pega.popStackFrame(pz_StackFrame32_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 33_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "33";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 33_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_111 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_111, true);
PRStackFrame pz_StackFrame33_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 33 Circum: 0" );
try {
pz_Status = step33_circum0();
} finally {
pega.popStackFrame(pz_StackFrame33_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 34_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "34";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 34_circum0");
}
PRStackFrame pz_StackFrame34_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 34 Circum: 0" );
try {
pz_Status = step34_circum0();
} finally {
pega.popStackFrame(pz_StackFrame34_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 35_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("UPDATE"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "35";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 35_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_113 = "D_BrowseProperties";
thisStepPage = tools.findPage(pz_113, true);
PRStackFrame pz_StackFrame35_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 35 Circum: 0" );
try {
pz_Status = step35_circum0();
} finally {
pega.popStackFrame(pz_StackFrame35_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 36_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "36";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 36_circum0");
}
PRStackFrame pz_StackFrame36_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 36 Circum: 0" );
try {
pz_Status = step36_circum0();
} finally {
pega.popStackFrame(pz_StackFrame36_circum0, false);
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
	"Rule-Obj-Activity:PZBROWSEPROPERTIES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZBROWSEPROPERTIES","Rule-Obj-Activity","@BASECLASS",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT","!PZBROWSEPROPERTIES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1776797471)
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
//	RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT:20230618T001756.905 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "1437ede8be5cec90097bbdda1833a781";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
/**
 * find the class name parameter based on Source Page.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SourcePage = tools.findPage(tools.getParamValue("SourcePage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String sourcePg = tools.getParamValue("SourcePage");
topPg = tools.getParamValue("TopPage");
ClipboardPage cp = tools.findPage(sourcePg);
if(cp != null){
  sourcePageExists = true;
}
if(topPg .equals("Top") && cp!=null ) {

topPg = cp.getTopLevelPage().getReference();
clsname = tools.findPage(topPg).getString("pyClassName");
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
 * set the current stream name in the data page.
 * <p>
 * Step 2 <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step2_circum0() {
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
    pega.setViaPropRef(".pyStreamName", pRef_12, myStepPage, ((scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? scalarValueQuery_13.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) : scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sIN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * set properties if browse class is empty, added jump statement to skip to DS incase browse class is not prediction.
 * <p>
 * Step 3 <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBrowseClass==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBrowseClass==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_16 = (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBrowseClass==\"\"",pz_16);
if (!pz_16) {
// branch to block DS
nextBlock = "DS";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBrowseClass==\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.sourcePageExists");
try {
boolean pz_17 = sourcePageExists;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.sourcePageExists",pz_17);
if (!pz_17) {
// branch to block DS
nextBlock = "DS";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.sourcePageExists " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyBrowseClass", pRef_18, myStepPage, ((pega.<Boolean>resolveMethodCall("isAncestorOf--(Activity,String,String)", "isAncestorOf", "Pega-RULES", "Default", new Object[] { tools, scalarValueQuery_19.resolveToString(tools, pega.findPage(tools.getParamValue("SourcePage"), "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT), "Work-" })).booleanValue() ? scalarValueQuery_19.resolveToString(tools, pega.findPage(tools.getParamValue("SourcePage"), "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT) : scalarValueQuery_20.resolveToString(tools, pega.findPage(tools.getParamValue("SourcePage"), "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRootContext", pRef_21, myStepPage, scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyName", pRef_22, myStepPage, tools.getParamValue("SourcePage"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyActionName", pRef_23, myStepPage, tools.getParamValue("AddActivity"), "sTN", false, true);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"");
try {
boolean pz_24 = (scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("Embed-Prediction-Results"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"",pz_24);
if (!pz_24) {
// branch to block DS
nextBlock = "DS";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Setting Param parent properties to pass as a parameter to pzFilterEmbeddedFields activity.
 * <p>
 * Step 4 <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step4_circum0() {
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
    tools.putParamValue("Purpose", PropertyInfo.TYPE_TEXT, "View");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Invokes pzFilterEmbeddedFields activity, returns outcome type and model in form of parameters.
 * <p>
 * Step 5 <code>Call Embed-Prediction-Results.pzFilterEmbeddedFields</code> [on page D_BrowseProperties] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Embed-Prediction-Results.pzFilterEmbeddedFields");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Embed-Prediction-Results.pzFilterEmbeddedFields", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Embed-Prediction-Results.pzFilterEmbeddedFields
if (myStepPage == null) {
String pz_27 = "D_BrowseProperties";
myStepPage = tools.findPage(pz_27, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_27, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : Embed-Prediction-Results.pzFilterEmbeddedFields
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzFilterEmbeddedFields", "@baseclass", "Embed-Prediction-Results");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Embed-Prediction-Results.pzFilterEmbeddedFields",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Populate outcome display on the main page and set the properties pyPropertyName and pyClassName on D_BrowseProperties so it can be used to set the output label.
 * <p>
 * Step 6 <code>Property-Set</code> [on page D_BrowseProperties] <br>
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
    pega.setViaPropRef(".pxPredictionOutcome", pRef_29, myStepPage, tools.getParamValue("OutComeType"), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxPredictionModel", pRef_30, myStepPage, tools.getParamValue("Model"), "sTY", false, true);
}
{
    pega.setViaPropRef(".pyPropertyName", pRef_31, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), tools.getParamValue("ParentPropertyName"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyClassName", pRef_32, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), tools.getParamValue("ParentClassName"), "siN", false, true);
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
 * set properties if class name param is present.
 * <p>
 * Step 7 [DS] <code>Property-Set</code> [on page D_BrowseProperties] <br>
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.clsname != \"\"");
try {
boolean pz_34 = (!(clsname.equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.clsname != \"\"",pz_34);
if (!pz_34) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.clsname != \"\" " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyBrowseClass", pRef_18, myStepPage, clsname, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRootContext", pRef_21, myStepPage, scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyName", pRef_22, myStepPage, tools.getParamValue("SourcePage"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyActionName", pRef_23, myStepPage, tools.getParamValue("AddActivity"), "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * remove existing pxResults.
 * <p>
 * Step 8 <code>Property-Remove</code> [on page D_BrowseProperties] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBrowseContext==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBrowseContext==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_37 = (scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBrowseContext==\"\"",pz_37);
if (!pz_37) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBrowseContext==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxResults
ClipboardProperty pz_38 = myStepPage.getIfPresent("pxResults");
try {if (pz_38!= null) {
pz_38.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 8.";
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
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * add the default values if browse context is empty.
 * <p>
 * Step 9 <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBrowseContext==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBrowseContext==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_40 = (scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBrowseContext==\"\"",pz_40);
if (!pz_40) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBrowseContext==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_41, myStepPage, "Fields", "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyContextIcon", pRef_42, myStepPage, "fields", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_43, myStepPage, "Rule-Obj-Property", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_41, myStepPage, "Views", "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyContextIcon", pRef_42, myStepPage, "forms", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_43, myStepPage, "Rule-Obj-Property", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResultCount", pRef_44, myStepPage, 2, "sNY", false, true);
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
boolean pz__1 = true;
if (pz__1) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzBrowseProperties - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Params to call Relevant records API for properties.
 * <p>
 * Step 10 [FIELDS] <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBrowseContext==\"fields\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBrowseContext==\"fields\"", "FUAInstance-NullMyStepPage");
}
boolean pz_46 = (scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("fields"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBrowseContext==\"fields\"",pz_46);
if (!pz_46) {
// branch to block FORMS
nextBlock = "FORMS";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBrowseContext==\"fields\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("RecordType", PropertyInfo.TYPE_TEXT, "Rule-Obj-Property");
}
{
    tools.putParamValue("BrowseClassName", PropertyInfo.TYPE_TEXT, scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
 * Calling Relevant Records API.
 * <p>
 * Step 11 <code>Property-Set</code> [on page D_pxRelevantRecords[ContextClass:Param.BrowseClassName,RecordType:Param.RecordType,InitializeWhenMissing:false]] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("RelevantRecords", PropertyInfo.TYPE_TEXT, scalarValueQuery_48.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
 * set parameters for RD.
 * <p>
 * Step 12 <code>Property-Set</code> [on page D_BrowseProperties] <br>
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
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pzBrowsePropertiesForSearch");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Rule-Obj-Property");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "TempFieldsPage");
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("SearchString", PropertyInfo.TYPE_TEXT, scalarValueQuery_50.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("ClassName", PropertyInfo.TYPE_TEXT, "");
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
 * call report definition to fetch list of properties for the browse class.
 * <p>
 * Step 13 <code>Call Rule-Obj-Report-Definition.pxRetrieveReportData</code> [on page D_BrowseProperties] <br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.length(Param.RelevantRecords) &gt; 0");
try {
boolean pz_52 = ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { tools.getParamValue("RelevantRecords") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.length(Param.RelevantRecords) &gt; 0",pz_52);
if (!pz_52) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.length(Param.RelevantRecords) &gt; 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-Obj-Report-Definition.pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-Obj-Report-Definition.pxRetrieveReportData
if (myStepPage == null) {
String pz_53 = "D_BrowseProperties";
myStepPage = tools.findPage(pz_53, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_53, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : Rule-Obj-Report-Definition.pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "@baseclass", "Rule-Obj-Report-Definition");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * remove existing pxResults.
 * <p>
 * Step 14 <code>Property-Remove</code> [on page D_BrowseProperties] <br>
 */
public boolean step14_circum0() {
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
ClipboardProperty pz_55 = myStepPage.getIfPresent("pxResults");
try {if (pz_55!= null) {
pz_55.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 14.";
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * remove any properties of type attachment.
 * <p>
 * Step 15 <code>Page-Remove</code> [on page TempFieldsPage.pxResults] <br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(.pyPageClass, \"Link-Attachment\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:String).equals(.pyPageClass, \"Link-Attachment\")", "FUAInstance-NullMyStepPage");
}
boolean pz_58 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_57.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Link-Attachment" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(.pyPageClass, \"Link-Attachment\")",pz_58);
if (!pz_58) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(.pyPageClass, \"Link-Attachment\") " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * If prediction is added as data relationship in UI view when embed section is opened when back accordion is clicked copy the pxPredictionModel, pxPredictionOutcome property on to D_BrowseProperties page.
 * <p>
 * Step 16 <code>Property-Set</code><br>
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"");
try {
boolean pz_59 = (scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("Embed-Prediction-Results"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"",pz_59);
if (!pz_59) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pxPredictionOutcome==\"\"");
try {
boolean pz_61 = (scalarValueQuery_60.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pxPredictionOutcome==\"\"",pz_61);
if (!pz_61) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pxPredictionOutcome==\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pxPredictionModel==\"\"");
try {
boolean pz_63 = (scalarValueQuery_62.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pxPredictionModel==\"\"",pz_63);
if (!pz_63) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pxPredictionModel==\"\" " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxPredictionOutcome", pRef_29, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_60.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxPredictionModel", pRef_30, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_62.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
 * copy the properties to the results page.
 * <p>
 * Step 17.0 <code>Java</code> [on page TempFieldsPage.pxResults] <br>
 */
public boolean step17_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SourcePage = tools.findPage(tools.getParamValue("SourcePage"));
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

// Code to call nested step 17_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_1_circum0");
}
PRStackFrame pz_StackFrame17_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step17_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame17_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 17_2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_2_circum0");
}
PRStackFrame pz_StackFrame17_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step17_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame17_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 17_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_3_circum0");
}
PRStackFrame pz_StackFrame17_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step17_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame17_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 17_4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_4_circum0");
}
PRStackFrame pz_StackFrame17_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step17_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame17_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 17_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_5_circum0");
}
PRStackFrame pz_StackFrame17_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step17_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame17_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 17_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_6_circum0");
}
PRStackFrame pz_StackFrame17_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step17_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame17_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 17_7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("EI"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_7_circum0");
}
PRStackFrame pz_StackFrame17_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 17_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step17_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame17_7_circum0, false);
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
pz_CurrentStepNum = "17.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_0_circum0 definition

/**
 * Skip iteration for prediction embedded properties which are not required to be added.
 * <p>
 * Step 17.1 <code>Java</code><br>
 */
public boolean step17_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SourcePage = tools.findPage(tools.getParamValue("SourcePage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"");
try {
boolean pz_65 = (scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("Embed-Prediction-Results"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"",pz_65);
if (!pz_65) {
// branch to block DP
nextBlock = "DP";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(D_BrowseProperties.pxPredictionOutcome==\"continuous\")&amp;&amp;(.pyPropertyName==\"pySegment\"||.pyPropertyName==\"pyPropensity\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("(D_BrowseProperties.pxPredictionOutcome==\"continuous\")&&(.pyPropertyName==\"pySegment\"||.pyPropertyName==\"pyPropensity\")", "FUAInstance-NullMyStepPage");
}
boolean pz_67 = ((scalarValueQuery_60.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("continuous")) && ((scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pySegment")) || (scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyPropensity"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(D_BrowseProperties.pxPredictionOutcome==\"continuous\")&amp;&amp;(.pyPropertyName==\"pySegment\"||.pyPropertyName==\"pyPropensity\")",pz_67);
if (pz_67) {
// branch to block EI
nextBlock = "EI";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(D_BrowseProperties.pxPredictionOutcome==\"continuous\")&amp;&amp;(.pyPropertyName==\"pySegment\"||.pyPropertyName==\"pyPropensity\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(D_BrowseProperties.pxPredictionOutcome==\"binary\")&amp;&amp;(D_BrowseProperties.pxPredictionModel==\"ScoreCard\"||D_BrowseProperties.pxPredictionModel==\"Adaptive\")&amp;&amp;(.pyPropertyName==\"pyPredictedValue\"||.pyPropertyName==\"pySegment\")");
try {
boolean pz_68 = (((scalarValueQuery_60.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("binary")) && ((scalarValueQuery_62.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("ScoreCard")) || (scalarValueQuery_62.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("Adaptive")))) && ((scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyPredictedValue")) || (scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pySegment"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(D_BrowseProperties.pxPredictionOutcome==\"binary\")&amp;&amp;(D_BrowseProperties.pxPredictionModel==\"ScoreCard\"||D_BrowseProperties.pxPredictionModel==\"Adaptive\")&amp;&amp;(.pyPropertyName==\"pyPredictedValue\"||.pyPropertyName==\"pySegment\")",pz_68);
if (pz_68) {
// branch to block EI
nextBlock = "EI";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(D_BrowseProperties.pxPredictionOutcome==\"binary\")&amp;&amp;(D_BrowseProperties.pxPredictionModel==\"ScoreCard\"||D_BrowseProperties.pxPredictionModel==\"Adaptive\")&amp;&amp;(.pyPropertyName==\"pyPredictedValue\"||.pyPropertyName==\"pySegment\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(D_BrowseProperties.pxPredictionOutcome==\"binary\")&amp;&amp;(D_BrowseProperties.pxPredictionModel==\"Predictive\")&amp;&amp;(.pyPropertyName==\"pyPredictedValue\")");
try {
boolean pz_69 = (((scalarValueQuery_60.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("binary")) && (scalarValueQuery_62.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("Predictive"))) && (scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyPredictedValue")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(D_BrowseProperties.pxPredictionOutcome==\"binary\")&amp;&amp;(D_BrowseProperties.pxPredictionModel==\"Predictive\")&amp;&amp;(.pyPropertyName==\"pyPredictedValue\")",pz_69);
if (pz_69) {
// branch to block EI
nextBlock = "EI";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(D_BrowseProperties.pxPredictionOutcome==\"binary\")&amp;&amp;(D_BrowseProperties.pxPredictionModel==\"Predictive\")&amp;&amp;(.pyPropertyName==\"pyPredictedValue\") " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "17.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_1_circum0 definition

/**
 * Default population for properties, skip the output label setting step if browse class is not Embed-Prediction-Results.
 * <p>
 * Step 17.2 [DP] <code>Property-Set</code><br>
 */
public boolean step17_2_circum0() {
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
// LHS: D_BrowseProperties.pxResults(<append>)
// RHS: TempFieldsPage.pxResults(<current>)
pega.setViaPropRef(".pxResults(<append>)", pRef_70, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), pega.findPageWithException("TempFieldsPage", "Code-Pega-List").getProperty(".pxResults(" + forEachCounter + ")").getPageValue(), "S?NRule-Obj-Property", false, false);

{
    pega.setViaPropRef(".pxResults(<last>).pyBrowseContext", pRef_71, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), "fields", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyBrowseClass", pRef_72, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTransientText", pRef_73, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { pega.getStringValueViaPropRef(".pxResults(<last>).pyLabel", pRef_74, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), false, false, false), "pyCaption", tools }), "sTN", false, true);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"");
try {
boolean pz_75 = (scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("Embed-Prediction-Results"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"",pz_75);
if (!pz_75) {
// branch to block PS
nextBlock = "PS";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "17.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_2_circum0 definition

/**
 * Set output label if present any.
 * <p>
 * Step 17.3 <code>Property-Set</code><br>
 */
public boolean step17_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pyPropertyName != \"\"");
try {
boolean pz_76 = (!(scalarValueQuery_66.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pyPropertyName != \"\"",pz_76);
if (!pz_76) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pyPropertyName != \"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pyClassName != \"\"");
try {
boolean pz_77 = (!(scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pyClassName != \"\"",pz_77);
if (!pz_77) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pyClassName != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("ParentPropertyName", PropertyInfo.TYPE_TEXT, scalarValueQuery_66.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("ParentClassName", PropertyInfo.TYPE_TEXT, scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("OutputLabel", PropertyInfo.TYPE_TEXT, "");
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("OutputLabel", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyPropensity")) ? pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { tools.getParamValue("ParentClassName"), tools.getParamValue("ParentPropertyName"), ".pyProbabilityOutputLabel" }) : ((scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pySegment")) ? pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { tools.getParamValue("ParentClassName"), tools.getParamValue("ParentPropertyName"), ".pySegmentOutputLabel" }) : ((scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyPredictedValue")) ? pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { tools.getParamValue("ParentClassName"), tools.getParamValue("ParentPropertyName"), ".pyValueOutputLabel" }) : scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)))));
}
{
    pega.setViaPropRef(".pxResults(<last>).pyLabel", pRef_74, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ((tools.getParamValue("OutputLabel").equals("")) ? scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : tools.getParamValue("OutputLabel")), "sTN64", false, true);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(.pyPageClass, \"Embed-Prediction-Results\")");
try {
boolean pz_79 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_57.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Embed-Prediction-Results" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(.pyPageClass, \"Embed-Prediction-Results\")",pz_79);
if (!pz_79) {
// branch to block EI
nextBlock = "EI";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(.pyPageClass, \"Embed-Prediction-Results\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "17.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_3_circum0 definition

/**
 * Setting Param parent properties to pass as a parameter to pzFilterEmbeddedFields activity.
 * <p>
 * Step 17.4 [PS] <code>Property-Set</code><br>
 */
public boolean step17_4_circum0() {
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
    tools.putParamValue("Purpose", PropertyInfo.TYPE_TEXT, "View");
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("ParentPropertyName", PropertyInfo.TYPE_TEXT, scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("ParentClassName", PropertyInfo.TYPE_TEXT, scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pz_CurrentStepNum = "17.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_4_circum0 definition

/**
 * Invokes pzFilterEmbeddedFields activity, returns outcome type and model in form of parameters.
 * <p>
 * Step 17.5 <code>Call Embed-Prediction-Results.pzFilterEmbeddedFields</code><br>
 */
public boolean step17_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Embed-Prediction-Results.pzFilterEmbeddedFields");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Embed-Prediction-Results.pzFilterEmbeddedFields", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Embed-Prediction-Results.pzFilterEmbeddedFields
if (myStepPage == null) {
}
// Calling Activity : Embed-Prediction-Results.pzFilterEmbeddedFields
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzFilterEmbeddedFields", "@baseclass", "Embed-Prediction-Results");
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
pz_CurrentStepNum = "17.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Embed-Prediction-Results.pzFilterEmbeddedFields",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_5_circum0 definition

/**
 * Populate outcome display on the main page.
 * <p>
 * Step 17.6 <code>Property-Set</code><br>
 */
public boolean step17_6_circum0() {
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
    pega.setViaPropRef(".pxResults(<last>).pxPredictionOutcome", pRef_80, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), tools.getParamValue("OutComeType"), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxPredictionModel", pRef_81, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), tools.getParamValue("Model"), "sTY", false, true);
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
pz_CurrentStepNum = "17.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_6_circum0 definition

/**
 * Exit iteration.
 * <p>
 * Step 17.7 [EI] <code>Java</code><br>
 */
public boolean step17_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SourcePage = tools.findPage(tools.getParamValue("SourcePage"));
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
pz_CurrentStepNum = "17.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_7_circum0 definition

/**
 * If prediction is added as data relationship in UI view and when embed section is opened set the pxPredictionModel, pxPredictionOutcome on the Primary Page.
 * <p>
 * Step 18 <code>Property-Set</code><br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"");
try {
boolean pz_82 = (scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT).equals("Embed-Prediction-Results"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\"",pz_82);
if (!pz_82) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_BrowseProperties.pyBrowseClass==\"Embed-Prediction-Results\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyClassName==\"Embed-Prediction-Results\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyClassName==\"Embed-Prediction-Results\"", "FUAInstance-NullMyStepPage");
}
boolean pz_83 = (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Embed-Prediction-Results"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyClassName==\"Embed-Prediction-Results\"",pz_83);
if (!pz_83) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyClassName==\"Embed-Prediction-Results\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxPredictionOutcome", pRef_29, myStepPage, scalarValueQuery_60.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxPredictionModel", pRef_30, myStepPage, scalarValueQuery_62.resolveToString(tools, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * set the result count on the results page.
 * <p>
 * Step 19 <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step19_circum0() {
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
    pega.setViaPropRef(".pxResultCount", pRef_44, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_85.resolveToString(tools, pega.findPageWithException("TempFieldsPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER), "sNY", false, true);
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
pz_CurrentStepNum = "19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * sort by localized label.
 * <p>
 * Step 20 <code>Obj-Sort</code> [on page D_BrowseProperties] <br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Sort", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Sort
// Expression: pxResults
// Expression: pyTransientText
String[] mySortKey = new String[1];
boolean[] mySortOrder = new boolean[1];
String[] myComparator = new String[1];
mySortKey[0] = "pyTransientText";
mySortOrder[0] = true;
myComparator[0] = "";
if (myStepPage == null) {
String pz_87 = "D_BrowseProperties";
myStepPage = tools.findPage(pz_87, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_87, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
if (myStepPage == null) {
throw new InvalidReferenceException("D_BrowseProperties", "this step page does not exist and cannot be shown");
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
pz_CurrentStepNum = "20";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

/**
 * remove results if count is greater than 20.
 * <p>
 * Step 21 <code>Page-Remove</code> [on page TempFieldsPage.pxResults] <br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.pyForEachCount&gt;20");
try {
boolean pz_89 = (tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount") > 20);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.pyForEachCount&gt;20",pz_89);
// preceding conditional evaluated for side-effects only
// specified "when true" and "when false" options have no effect on flow of control
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.pyForEachCount&gt;20 " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "21";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * Params to call Relevant records API for properties.
 * <p>
 * Step 22 [FORMS] <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBrowseContext==\"forms\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBrowseContext==\"forms\"", "FUAInstance-NullMyStepPage");
}
boolean pz_91 = (scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("forms"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBrowseContext==\"forms\"",pz_91);
if (!pz_91) {
// branch to block DATATYPES
nextBlock = "DATATYPES";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBrowseContext==\"forms\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("RecordType", PropertyInfo.TYPE_TEXT, "Rule-HTML-Section");
}
{
    tools.putParamValue("BrowseClassName", PropertyInfo.TYPE_TEXT, scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

/**
 * Calling Relevant Records API.
 * <p>
 * Step 23 <code>Property-Set</code> [on page D_pxRelevantRecords[ContextClass:Param.BrowseClassName,RecordType:Param.RecordType,InitializeWhenMissing:false]] <br>
 */
public boolean step23_circum0() {
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
    tools.putParamValue("RelevantRecords", PropertyInfo.TYPE_TEXT, scalarValueQuery_48.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * set parameters for RD.
 * <p>
 * Step 24 <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step24_circum0() {
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
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pzBrowseFormsForClass");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Rule-HTML-Section");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "TempFormsPage");
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("SearchString", PropertyInfo.TYPE_TEXT, scalarValueQuery_50.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0 definition

/**
 * call report definition to fetch list of forms for the browse class.
 * <p>
 * Step 25 <code>Call Rule-Obj-Report-Definition.pxRetrieveReportData</code> [on page D_BrowseProperties] <br>
 */
public boolean step25_circum0() {
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
String pz_95 = "D_BrowseProperties";
myStepPage = tools.findPage(pz_95, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_95, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : Rule-Obj-Report-Definition.pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "@baseclass", "Rule-Obj-Report-Definition");
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
pz_CurrentStepNum = "25";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_circum0 definition

/**
 * get the current form name.
 * <p>
 * Step 26 <code>Property-Set</code><br>
 */
public boolean step26_circum0() {
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
    CurrentFormName = scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pz_CurrentStepNum = "26";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_circum0 definition

/**
 * remove existing pxResults.
 * <p>
 * Step 27 <code>Property-Remove</code> [on page D_BrowseProperties] <br>
 */
public boolean step27_circum0() {
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
ClipboardProperty pz_97 = myStepPage.getIfPresent("pxResults");
try {if (pz_97!= null) {
pz_97.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 34.";
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
pz_CurrentStepNum = "27";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_circum0 definition

/**
 * For each of the forms, check whether they would cause a circular reference.
 * <p>
 * Step 28.0 <code>Java</code> [on page TempFormsPage.pxResults] <br>
 */
public boolean step28_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SourcePage = tools.findPage(tools.getParamValue("SourcePage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyStreamName==\"pyAutomaticallyGeneratedCaseDetails\" || .pyStreamName==local.CurrentFormName");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyStreamName==\"pyAutomaticallyGeneratedCaseDetails\" || .pyStreamName==local.CurrentFormName", "FUAInstance-NullMyStepPage");
}
boolean pz_99 = ((scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyAutomaticallyGeneratedCaseDetails")) || (scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(CurrentFormName)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyStreamName==\"pyAutomaticallyGeneratedCaseDetails\" || .pyStreamName==local.CurrentFormName",pz_99);
if (pz_99) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyStreamName==\"pyAutomaticallyGeneratedCaseDetails\" || .pyStreamName==local.CurrentFormName " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//if checkForCircularReference returns true then there is 
//a circular section include so we should set an error message 

//initalization 
bCircularRefExists = false;

//If the current section doesn't exist then don't need to check for circular reference
if(!"".equals(tools.getPrimaryPage().getString("pzInsKey"))) {
  try {
    StringMap sectionToIncludeMap = new HashStringMap(); 
    sectionToIncludeMap.put("pxObjClass", "Rule-HTML-Section"); 
    sectionToIncludeMap.put("pyClassName", myStepPage.getString("pyClassName"));
    sectionToIncludeMap.put("pyStreamName", myStepPage.getString("pyStreamName"));
    if(pega.getUIEngine().getSectionUtils().checkForCircularReference(tools.getPrimaryPage(), sectionToIncludeMap)){
      bCircularRefExists = true; 
    }
  }
  catch(PRException p){
    oLog.error("Exception while checking for Circular section include"+ p); 
    p.printStackTrace(); 
  }
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

// Code to call nested step 28_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "28.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 28_1_circum0");
}
PRStackFrame pz_StackFrame28_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT Step: 28_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step28_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame28_1_circum0, false);
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
pz_CurrentStepNum = "28.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_0_circum0 definition

/**
 * Only add the view to list if it wouldn't cause a circular reference.
 * <p>
 * Step 28.1 <code>Property-Set</code><br>
 */
public boolean step28_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.bCircularRefExists");
try {
boolean pz_100 = bCircularRefExists;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.bCircularRefExists",pz_100);
if (pz_100) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.bCircularRefExists " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_41, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTransientText", pRef_73, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyCaption", tools }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_43, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), "Rule-Obj-Property", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyBrowseContext", pRef_71, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), "forms", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyStreamName", pRef_101, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_102, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "siN", false, true);
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
pz_CurrentStepNum = "28.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_1_circum0 definition

/**
 * sort by label.
 * <p>
 * Step 29 <code>Obj-Sort</code> [on page D_BrowseProperties] <br>
 */
public boolean step29_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Sort", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Sort
// Expression: pxResults
// Expression: pyTransientText
String[] mySortKey = new String[1];
boolean[] mySortOrder = new boolean[1];
String[] myComparator = new String[1];
mySortKey[0] = "pyTransientText";
mySortOrder[0] = true;
myComparator[0] = "";
if (myStepPage == null) {
String pz_104 = "D_BrowseProperties";
myStepPage = tools.findPage(pz_104, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_104, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
if (myStepPage == null) {
throw new InvalidReferenceException("D_BrowseProperties", "this step page does not exist and cannot be shown");
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
pz_CurrentStepNum = "29";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step29_circum0 definition

/**
 * set the result count on the results page.
 * <p>
 * Step 30 <code>Property-Set</code> [on page D_BrowseProperties] <br>
 */
public boolean step30_circum0() {
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
    pega.setViaPropRef(".pxResultCount", pRef_44, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, "Utilities", new Object[] { myStepPage.getProperty("pxResults") })).intValue(), "sNY", false, true);
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
pz_CurrentStepNum = "30";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step30_circum0 definition

/**
 * remove existing pxResults.
 * <p>
 * Step 31 [DATATYPES] <code>Property-Remove</code> [on page D_BrowseProperties] <br>
 */
public boolean step31_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBrowseContext==\"datatypes\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBrowseContext==\"datatypes\"", "FUAInstance-NullMyStepPage");
}
boolean pz_107 = (scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("datatypes"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBrowseContext==\"datatypes\"",pz_107);
if (!pz_107) {
// branch to block UPDATE
nextBlock = "UPDATE";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBrowseContext==\"datatypes\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxResults
ClipboardProperty pz_108 = myStepPage.getIfPresent("pxResults");
try {if (pz_108!= null) {
pz_108.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 39.";
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
pz_CurrentStepNum = "31";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step31_circum0 definition

/**
 * copy the properties to the results page.
 * <p>
 * Step 32 <code>Property-Set</code> [on page D_pzDataTypesOfApp[AppName:Application.pyProductName, AppVersion: Application.pyProductVersion, FilterIfNoDataTable: true, FilterIfNoAutogenerateKey: true, FilterIfNotInParentsDependencyPath: true, ParentRuleSet: Primary.pyRuleSet].pxResults] <br>
 */
public boolean step32_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_41, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_43, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), "Rule-Obj-Property", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyBrowseContext", pRef_71, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), "datatypes", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_102, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_110.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "siN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTransientText", pRef_73, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyCaption", tools }), "sTN", false, true);
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
pz_CurrentStepNum = "32";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step32_circum0 definition

/**
 * sort by label.
 * <p>
 * Step 33 <code>Obj-Sort</code> [on page D_BrowseProperties] <br>
 */
public boolean step33_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Sort", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Sort
// Expression: pxResults
// Expression: pyTransientText
String[] mySortKey = new String[1];
boolean[] mySortOrder = new boolean[1];
String[] myComparator = new String[1];
mySortKey[0] = "pyTransientText";
mySortOrder[0] = true;
myComparator[0] = "";
if (myStepPage == null) {
String pz_112 = "D_BrowseProperties";
myStepPage = tools.findPage(pz_112, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_112, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
if (myStepPage == null) {
throw new InvalidReferenceException("D_BrowseProperties", "this step page does not exist and cannot be shown");
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
pz_CurrentStepNum = "33";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step33_circum0 definition

/**
 * set the result count on the results page.
 * <p>
 * Step 34 <code>Property-Set</code><br>
 */
public boolean step34_circum0() {
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
    pega.setViaPropRef(".pxResultCount", pRef_44, pega.findPageWithException("D_BrowseProperties", "Code-Pega-List"), scalarValueQuery_85.resolveToString(tools, pega.findPageWithException("D_pzDataTypesOfApp", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER), "sNY", false, true);
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
pz_CurrentStepNum = "34";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step34_circum0 definition

/**
 * call activity to update fields which are selected.
 * <p>
 * Step 35 [UPDATE] <code>Call pzUpdateSelectedFields</code> [on page D_BrowseProperties] <br>
 */
public boolean step35_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzUpdateSelectedFields");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzUpdateSelectedFields", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzUpdateSelectedFields
if (myStepPage == null) {
String pz_114 = "D_BrowseProperties";
myStepPage = tools.findPage(pz_114, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_114, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : pzUpdateSelectedFields

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzUpdateSelectedFields", "@baseclass", "");
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
pz_CurrentStepNum = "35";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzUpdateSelectedFields",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step35_circum0 definition

/**
 * remove the temp pages.
 * <p>
 * Step 36 <code>Page-Remove</code><br>
 */
public boolean step36_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: TempFieldsPage
pageRemove(tools.findPage("TempFieldsPage"));
// Expression: TempFormPage
pageRemove(tools.findPage("TempFormPage"));
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
pz_CurrentStepNum = "36";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step36_circum0 definition

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

public String searchclass = "";
public boolean sourcePageExists = false;
public String CurrentFormName = "";
public String clsname = "";
public String topPg = "";
public boolean bCircularRefExists = false;

public void initializeUserLocalVariables() {
	searchclass = "";
	sourcePageExists = false;
	CurrentFormName = "";
	clsname = "";
	topPg = "";
	bCircularRefExists = false;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("searchclass", (searchclass == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : searchclass.toString());
	smRetVal.putString("sourcePageExists", Boolean.toString(sourcePageExists));
	smRetVal.putString("CurrentFormName", (CurrentFormName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : CurrentFormName.toString());
	smRetVal.putString("clsname", (clsname == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : clsname.toString());
	smRetVal.putString("topPg", (topPg == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : topPg.toString());
	smRetVal.putString("bCircularRefExists", Boolean.toString(bCircularRefExists));
	return smRetVal;
}

public ClipboardPage pageParam_SourcePage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_SourcePage = null;
}

public static final String[] pRef_22 = new String[] { "", "", "pyName", "" };
public static final String[] pRef_101 = new String[] { "", "", "pxResults", "<last>", "pyStreamName", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyBrowseClass", "" };
public static final String[] pRef_80 = new String[] { "", "", "pxResults", "<last>", "pxPredictionOutcome", "" };
public static final String[] pRef_32 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_70 = new String[] { "", "", "pxResults", "<append>" };
public static final String[] pRef_102 = new String[] { "", "", "pxResults", "<last>", "pyClassName", "" };
public static final String[] pRef_81 = new String[] { "", "", "pxResults", "<last>", "pxPredictionModel", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyActionName", "" };
public static final String[] pRef_43 = new String[] { "", "", "pxResults", "<last>", "pxObjClass", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyRootContext", "" };
public static final String[] pRef_29 = new String[] { "", "", "pxPredictionOutcome", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyPropertyName", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyStreamName", "" };
public static final String[] pRef_71 = new String[] { "", "", "pxResults", "<last>", "pyBrowseContext", "" };
public static final String[] pRef_73 = new String[] { "", "", "pxResults", "<last>", "pyTransientText", "" };
public static final String[] pRef_74 = new String[] { "", "", "pxResults", "<last>", "pyLabel", "" };
public static final String[] pRef_41 = new String[] { "", "", "pxResults", "<append>", "pyLabel", "" };
public static final String[] pRef_72 = new String[] { "", "", "pxResults", "<last>", "pyBrowseClass", "" };
public static final String[] pRef_42 = new String[] { "", "", "pxResults", "<last>", "pyContextIcon", "" };
public static final String[] pRef_30 = new String[] { "", "", "pxPredictionModel", "" };
public static final String[] pRef_44 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_48 = FUAUtil.createQueryBuilder().scalarProperty("pyRelevantRecordsFlatList").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_78 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_66 = FUAUtil.createQueryBuilder().scalarProperty("pyPropertyName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_62 = FUAUtil.createQueryBuilder().scalarProperty("pxPredictionModel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_85 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyStreamName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarProperty("pyBrowseContext").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_60 = FUAUtil.createQueryBuilder().scalarProperty("pxPredictionOutcome").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarProperty("pySearchText").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_57 = FUAUtil.createQueryBuilder().scalarProperty("pyPageClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_110 = FUAUtil.createQueryBuilder().scalarProperty("pyMetadataKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyBrowseClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY @BASECLASS PZBROWSEPROPERTIES #20230618T001756.905 GMT", "@baseclass pzBrowseProperties", "Pega-ProcessArchitect", "08-23-01", false, true, "", "ACTIVITY", "20230618T001756.905 GMT" ,"Rule-Obj-Activity"); }
