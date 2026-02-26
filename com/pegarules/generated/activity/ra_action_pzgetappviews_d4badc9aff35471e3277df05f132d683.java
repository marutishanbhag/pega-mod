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
public class ra_action_pzgetappviews_d4badc9aff35471e3277df05f132d683 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGetAppViews.Code_Pega_List.Action");
	public ra_action_pzgetappviews_d4badc9aff35471e3277df05f132d683(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT	Pega-EndUserUI:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 1 Circum: 0" );
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
String pz_16 = "WebInstances";
thisStepPage = tools.findPage(pz_16, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 2 Circum: 0" );
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
String pz_18 = "D_pzAppViewSettings";
thisStepPage = tools.findPage(pz_18, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_18, false);
thisStepPage.putString("pxObjClass", "Pega-Designer-AppViewSettings");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 3 Circum: 0" );
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
ClipboardProperty pz_20 = pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup").getIfPresent("pyUserPortals");
pageRef = pz_20;
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
if ( "Embed-PortalLayout".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-PortalLayout").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_0_circum0");
}
PRStackFrame pz_StackFrame4_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_0 Circum: 0" );
try {
pz_Status = step4_0_circum0_Embed_PortalLayout();
} finally {
pega.popStackFrame(pz_StackFrame4_0_circum0, false);
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

// Code to call step 5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_59 = "MobileInstances";
thisStepPage = tools.findPage(pz_59, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_61 = pega.findDataPage("D_pzGetMobileApplications", true, "applicationHandle", scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)).getIfPresent("pxResults");
pageRef = pz_61;
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
pz_CurrentStepNum = "7.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_0_circum0");
}
PRStackFrame pz_StackFrame7_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 7_0 Circum: 0" );
try {
pz_Status = step7_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_77 = "MobileDataViews";
thisStepPage = tools.findPage(pz_77, true);
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_79 = pega.findPageWithException("MobileDataViews", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_79;
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
pz_CurrentStepNum = "12.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_0_circum0");
}
PRStackFrame pz_StackFrame12_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 12_0 Circum: 0" );
try {
pz_Status = step12_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_0_circum0, false);
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
String pz_84 = "MCPInstances";
thisStepPage = tools.findPage(pz_84, true);
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 13 Circum: 0" );
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
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 14 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_86 = "MCPChannels";
thisStepPage = tools.findPage(pz_86, true);
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_89 = pega.findPageWithException("MCPChannels", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_89;
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
if ( "Data-Channel-Configuration".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Data-Channel-Configuration").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_0_circum0");
}
PRStackFrame pz_StackFrame16_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 16_0 Circum: 0" );
try {
pz_Status = step16_0_circum0_Data_Channel_Configuration();
} finally {
pega.popStackFrame(pz_StackFrame16_0_circum0, false);
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

// Code to call step 17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_111 = "EmailInstances";
thisStepPage = tools.findPage(pz_111, true);
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 17 Circum: 0" );
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
String pz_113 = "EmailChannels";
thisStepPage = tools.findPage(pz_113, true);
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 18 Circum: 0" );
try {
pz_Status = step18_circum0();
} finally {
pega.popStackFrame(pz_StackFrame18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 19_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_116 = pega.findPageWithException("EmailChannels", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_116;
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
if ( "Data-Channel-Email".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Data-Channel-Email").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_0_circum0");
}
PRStackFrame pz_StackFrame19_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 19_0 Circum: 0" );
try {
pz_Status = step19_0_circum0_Data_Channel_Email();
} finally {
pega.popStackFrame(pz_StackFrame19_0_circum0, false);
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

// Code to call step 20_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_134 = "MashupInstances";
thisStepPage = tools.findPage(pz_134, true);
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 20 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_136 = "MashupChannels";
thisStepPage = tools.findPage(pz_136, true);
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 21 Circum: 0" );
try {
pz_Status = step21_circum0();
} finally {
pega.popStackFrame(pz_StackFrame21_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 22_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_139 = pega.findPageWithException("MashupChannels", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_139;
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
if ( "Data-Channel-Mashup".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Data-Channel-Mashup").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_0_circum0");
}
PRStackFrame pz_StackFrame22_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 22_0 Circum: 0" );
try {
pz_Status = step22_0_circum0_Data_Channel_Mashup();
} finally {
pega.popStackFrame(pz_StackFrame22_0_circum0, false);
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

// Code to call step 23_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "23";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 23_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_154 = "CustomAppViews";
thisStepPage = tools.findPage(pz_154, true);
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 23 Circum: 0" );
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
String pz_156 = "CustomConfigs";
thisStepPage = tools.findPage(pz_156, true);
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 24 Circum: 0" );
try {
pz_Status = step24_circum0();
} finally {
pega.popStackFrame(pz_StackFrame24_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 25_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_158 = pega.findPageWithException("CustomConfigs", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_158;
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
if ( "Data-Custom-Configuration".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Data-Custom-Configuration").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_0_circum0");
}
PRStackFrame pz_StackFrame25_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 25_0 Circum: 0" );
try {
pz_Status = step25_0_circum0_Data_Custom_Configuration();
} finally {
pega.popStackFrame(pz_StackFrame25_0_circum0, false);
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

// Code to call step 26_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_162 = pega.findPageWithException("WebInstances", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_162;
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
pz_CurrentStepNum = "26.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 26_0_circum0");
}
PRStackFrame pz_StackFrame26_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 26_0 Circum: 0" );
try {
pz_Status = step26_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame26_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 27_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_164 = pega.findPageWithException("MashupInstances", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_164;
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
pz_CurrentStepNum = "27.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 27_0_circum0");
}
PRStackFrame pz_StackFrame27_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 27_0 Circum: 0" );
try {
pz_Status = step27_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame27_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 28_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_166 = pega.findPageWithException("MobileInstances", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_166;
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
PRStackFrame pz_StackFrame28_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 28_0 Circum: 0" );
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

// Code to call step 29_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_168 = pega.findPageWithException("MCPInstances", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_168;
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
pz_CurrentStepNum = "29.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 29_0_circum0");
}
PRStackFrame pz_StackFrame29_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 29_0 Circum: 0" );
try {
pz_Status = step29_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame29_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 30_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_170 = pega.findPageWithException("EmailInstances", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_170;
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
pz_CurrentStepNum = "30.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 30_0_circum0");
}
PRStackFrame pz_StackFrame30_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 30_0 Circum: 0" );
try {
pz_Status = step30_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame30_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 31_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_172 = pega.findPageWithException("CustomAppViews", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_172;
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
pz_CurrentStepNum = "31.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 31_0_circum0");
}
PRStackFrame pz_StackFrame31_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 31_0 Circum: 0" );
try {
pz_Status = step31_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame31_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 32_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "32";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 32_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_174 = "PegaAPIChannel";
thisStepPage = tools.findPage(pz_174, true);
PRStackFrame pz_StackFrame32_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 32 Circum: 0" );
try {
pz_Status = step32_circum0();
} finally {
pega.popStackFrame(pz_StackFrame32_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 33_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "33";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 33_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_176 = "PegaAPIChannel";
thisStepPage = tools.findPage(pz_176, true);
PRStackFrame pz_StackFrame33_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 33 Circum: 0" );
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
PRStackFrame pz_StackFrame34_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 34 Circum: 0" );
try {
pz_Status = step34_circum0();
} finally {
pega.popStackFrame(pz_StackFrame34_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 35_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "35";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 35_circum0");
}
PRStackFrame pz_StackFrame35_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 35 Circum: 0" );
try {
pz_Status = step35_circum0();
} finally {
pega.popStackFrame(pz_StackFrame35_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 36_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_179 = pzPrimPage.getIfPresent("pxResults");
pageRef = pz_179;
} 
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
pz_CurrentStepNum = "36";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 36_circum0");
}
PRStackFrame pz_StackFrame36_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 36 Circum: 0" );
try {
pz_Status = step36_circum0();
} finally {
pega.popStackFrame(pz_StackFrame36_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 37_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "37";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 37_circum0");
}
PRStackFrame pz_StackFrame37_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 37 Circum: 0" );
try {
pz_Status = step37_circum0();
} finally {
pega.popStackFrame(pz_StackFrame37_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 38_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "38";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 38_circum0");
}
PRStackFrame pz_StackFrame38_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 38 Circum: 0" );
try {
pz_Status = step38_circum0();
} finally {
pega.popStackFrame(pz_StackFrame38_circum0, false);
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
	"Rule-Obj-Activity:PZGETAPPVIEWS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETAPPVIEWS","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-EndUserUI","08-23-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT","!PZGETAPPVIEWS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1404528850)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT:20230618T002052.052 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "cd8908c5ce9669d7f615045ad6b2474a";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
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
    size = 0;
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
 * Create temp web instances page.
 * <p>
 * Step 2 <code>Page-new</code> [on page WebInstances] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-new");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-new", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-new
String pz_17 = "WebInstances";
myStepPage = tools.findPage(pz_17, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","WebInstances",false); 
// primary page will not be added to PageList
	 pega.setStepPage("WebInstances", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-new",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Step 3 <code>Property-Set</code> [on page D_pzAppViewSettings] <br>
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
    pega.setViaPropRef(".pyMode", pRef_19, myStepPage, "manage", "stN", false, true);
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
 * Wrap Portal (web view) by AppView.
 * <p>
 * Step 4.0 <code>Java</code> [on page AccessGroup.pyUserPortals] <br>
 */
public boolean step4_0_circum0_Embed_PortalLayout() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyCategory != \"workspace\" &amp;&amp; .pyCategory != \"pmc\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyCategory != \"workspace\" && .pyCategory != \"pmc\"", "FUAInstance-NullMyStepPage");
}
boolean pz_22 = ((!(scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("workspace"))) && (!(scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pmc"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyCategory != \"workspace\" &amp;&amp; .pyCategory != \"pmc\"",pz_22);
if (!pz_22) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyCategory != \"workspace\" &amp;&amp; .pyCategory != \"pmc\" " + anyException.getMessage(), anyException);
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

// Code to call nested step 4_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_1_circum0");
}
String pz_23 = "TempPortal";
nestedStepPage = tools.findPage(pz_23, true);
PRStackFrame pz_StackFrame4_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_1 Circum: 0" );
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
PRStackFrame pz_StackFrame4_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_2 Circum: 0" );
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
String pz_24 = "TempPortal";
nestedStepPage = tools.findPage(pz_24, true);
PRStackFrame pz_StackFrame4_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_4 Circum: 0" );
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
PRStackFrame pz_StackFrame4_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_5 Circum: 0" );
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
PRStackFrame pz_StackFrame4_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_6 Circum: 0" );
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
if ((nextBlock.equals("") || nextBlock.equals("FAIL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_7_circum0");
}
PRStackFrame pz_StackFrame4_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 4_7 Circum: 0" );
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_0_circum0_Embed_PortalLayout definition

/**
 * Step 4.1 <code>Page-New</code> [on page TempPortal] <br>
 */
public boolean step4_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_25 = "TempPortal";
myStepPage = tools.findPage(pz_25, true);
// Expression: Rule-Portal
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-Portal","TempPortal",false); 
// primary page will not be added to PageList
	 pega.setStepPage("TempPortal", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_1_circum0 definition

/**
 * Set up TempPortal and check if portal exists if portal is one that can be previewed.
 * <p>
 * Step 4.2 <code>Property-Set</code><br>
 */
public boolean step4_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("pyCanPortalBePreviewed", "Code-Pega-List", "Embed-PortalLayout");
if (!pz__1) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyClassName", pRef_26, pega.findPageWithException("TempPortal", "Rule-Portal"), scalarValueQuery_27.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), "siN", false, true);
}
{
    pega.setViaPropRef(".pyOwner", pRef_28, pega.findPageWithException("TempPortal", "Rule-Portal"), scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), "sTN", false, true);
}
{
    doesPortalExist = (pega.<Boolean>resolveMethodCall("pxDoesObjectExist--(ClipboardPage)", "pxDoesObjectExist", null, "Utilities", new Object[] { pega.findPage("TempPortal", "Rule-Portal") })).booleanValue();
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
pz_CurrentStepNum = "4.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_2_circum0 definition

/**
 * If portal exists need to open portal to get most up to date properties for display.
 * <p>
 * Step 4.3 <code>Obj-Open</code> [on page TempPortal] <br>
 */
public boolean step4_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.doesPortalExist");
try {
boolean pz_30 = doesPortalExist;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.doesPortalExist",pz_30);
if (!pz_30) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.doesPortalExist " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_31 = "TempPortal";
myStepPage = tools.findPage(pz_31, true);
// Expression: 
// Expression: Rule-Portal
myStepPage = tools.getThread().createPage("Rule-Portal", pz_31);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyOwner", pRef_28, myStepPage, scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "TempPortal", "", false, false);
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
boolean pz__3 = pega.invokeWhen("stepStatusFail", "Code-Pega-List", "Rule-Portal");
if (pz__3) {
// branch to block FAIL
nextBlock = "FAIL";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_3_circum0 definition

/**
 * Step 4.4 <code>Property-Set</code><br>
 */
public boolean step4_4_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pyPortal.pyAppViewName", pRef_32, pega.findPageWithException("WebInstances", "Code-Pega-List"), ((!(scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) ? scalarValueQuery_33.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT) : scalarValueQuery_34.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("WebInstances", "Code-Pega-List"), ((!(scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) ? scalarValueQuery_33.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT) : scalarValueQuery_34.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT)), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_36, pega.findPageWithException("WebInstances", "Code-Pega-List"), "Pega-Landing-AppView-Web", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPortal.pxObjClass", pRef_37, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_38.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPortal.pyPortalLayout", pRef_39, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewID", pRef_41, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxChannelID", pRef_42, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPortal.pyDescription", pRef_43, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_44.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPortal.pyCategory", pRef_45, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyCategory", pRef_46, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyHasAlternateDesignSystem", pRef_47, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_48.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyAlternateDesignSystemURL", pRef_49, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_50.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIsNextGenUI", pRef_51, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_52.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPortal.pyPortalTemplate", pRef_53, pega.findPageWithException("WebInstances", "Code-Pega-List"), "work", "stN", false, true);
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
 * If TempPortal.pyPortalTemplate is not empty - set the value.
 * <p>
 * Step 4.5 <code>Property-Set</code><br>
 */
public boolean step4_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "TempPortal.pyPortalTemplate != \"\"");
try {
boolean pz_55 = (!(scalarValueQuery_54.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "TempPortal.pyPortalTemplate != \"\"",pz_55);
if (!pz_55) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("TempPortal.pyPortalTemplate != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<last>).pyPortal.pyPortalTemplate", pRef_53, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_54.resolveToString(tools, pega.findPageWithException("TempPortal", "Rule-Portal"), ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
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
pz_CurrentStepNum = "4.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_5_circum0 definition

/**
 * double check the pxAppViewName when a manually create web channel was added to access group.
 * <p>
 * Step 4.6 <code>Property-Set</code><br>
 */
public boolean step4_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "WebInstances.pxResults(&lt;LAST&gt;).pxAppViewName ==\"\"");
try {
boolean pz_56 = (pega.getStringValueViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("WebInstances", "Code-Pega-List"), false, false, false).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "WebInstances.pxResults(&lt;LAST&gt;).pxAppViewName ==\"\"",pz_56);
if (!pz_56) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("WebInstances.pxResults(&lt;LAST&gt;).pxAppViewName ==\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyAppViewName != \"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyAppViewName != \"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_57 = (!(scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyAppViewName != \"\"",pz_57);
if (!pz_57) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyAppViewName != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPortal.pyAppViewName", pRef_58, pega.findPageWithException("WebInstances", "Code-Pega-List"), scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_6_circum0 definition

/**
 * Obj open failed so go to next iteration and do not append to list of results.
 * <p>
 * Step 4.7 [FAIL] <code>Java</code><br>
 */
public boolean step4_7_circum0() {
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
pz_CurrentStepNum = "4.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_7_circum0 definition

/**
 * Create temp mobile instances page.
 * <p>
 * Step 5 <code>Page-New</code> [on page MobileInstances] <br>
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
String pz_60 = "MobileInstances";
myStepPage = tools.findPage(pz_60, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","MobileInstances",false); 
// primary page will not be added to PageList
	 pega.setStepPage("MobileInstances", myStepPage);
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
 * *Set default mobile channel pyGUID to a parameter.
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
    tools.putParamValue("pyGUID", PropertyInfo.TYPE_TEXT, "099c2f99-53df-4a57-81ab-fba3fff26835");
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
 * Wrap Mobile app by AppView.
 * <p>
 * Step 7.0 <code>Java</code> [on page D_pzGetMobileApplications[applicationHandle:Application.pzInsKey].pxResults] <br>
 */
public boolean step7_0_circum0() {
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

// Code to call nested step 7_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_1_circum0");
}
PRStackFrame pz_StackFrame7_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 7_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_2_circum0");
}
String pz_62 = "MobileChannelPage";
nestedStepPage = tools.findPage(pz_62, true);
PRStackFrame pz_StackFrame7_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 7_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_3_circum0");
}
String pz_63 = "MobileChannelPage";
nestedStepPage = tools.findPage(pz_63, true);
PRStackFrame pz_StackFrame7_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 7_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_circum0");
}
PRStackFrame pz_StackFrame7_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 7_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DEFAULT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_5_circum0");
}
PRStackFrame pz_StackFrame7_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 7_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_5_circum0, false);
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
pz_CurrentStepNum = "7.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_0_circum0 definition

/**
 * Step 7.1 <code>Property-Set</code><br>
 */
public boolean step7_1_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pyMobileApp.pyMobileAppName", pRef_64, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pyType", pRef_65, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pxObjClass", pRef_67, pega.findPageWithException("MobileInstances", "Code-Pega-List"), "RULE-CHANNEL-MOBILE", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pzInsKey", pRef_68, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxChannelID", pRef_42, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_69.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_36, pega.findPageWithException("MobileInstances", "Code-Pega-List"), "Pega-Landing-AppView-Mobile", "sIY", false, true);
}
{
    channelKey = scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pz_CurrentStepNum = "7.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_1_circum0 definition

/**
 * Step 7.2 <code>Page-New</code> [on page MobileChannelPage] <br>
 */
public boolean step7_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_70 = "MobileChannelPage";
myStepPage = tools.findPage(pz_70, true);
// Expression: Rule-Channel-Mobile
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-Channel-Mobile","MobileChannelPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("MobileChannelPage", myStepPage);
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
pz_CurrentStepNum = "7.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_2_circum0 definition

/**
 * Step 7.3 <code>Obj-Open-By-Handle</code> [on page MobileChannelPage] <br>
 */
public boolean step7_3_circum0() {
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
String pz_71 = "MobileChannelPage";
myStepPage = tools.findPage(pz_71, true);
// Expression: Local.channelKey
// Expression: 
// Obj-Open-By-Handle
try {
	ClipboardPage temp = objOpenByHandle(channelKey, "MobileChannelPage", "", false, false, false);
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__5 = pega.invokeWhen("StepStatusFail", "Code-Pega-List", "Rule-Channel-Mobile");
if (pz__5) {
// branch to block DEFAULT
nextBlock = "DEFAULT";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_3_circum0 definition

/**
 * Step 7.4 <code>Property-Set</code><br>
 */
public boolean step7_4_circum0() {
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
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pyMobileAppDescription", pRef_72, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_73.resolveToString(tools, pega.findPageWithException("MobileChannelPage", "Rule-Channel-Mobile"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
pz_CurrentStepNum = "7.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_circum0 definition

/**
 * Rename default mobile channel.
 * <p>
 * Step 7.5 [DEFAULT] <code>Property-Set</code><br>
 */
public boolean step7_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@contains(.pzInsKey,@toUpperCase(Param.pyGUID))");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@contains(.pzInsKey,@toUpperCase(Param.pyGUID))", "FUAInstance-NullMyStepPage");
}
boolean pz_75 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, null, new Object[] { tools.getParamValue("pyGUID") }) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@contains(.pzInsKey,@toUpperCase(Param.pyGUID))",pz_75);
if (!pz_75) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@contains(.pzInsKey,@toUpperCase(Param.pyGUID)) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pyMobileAppName", pRef_76, pega.findPageWithException("MobileInstances", "Code-Pega-List"), "User Mobile App", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("MobileInstances", "Code-Pega-List"), "User Mobile App", "sTY", false, true);
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
pz_CurrentStepNum = "7.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_5_circum0 definition

/**
 * Get All data- instances.
 * <p>
 * Step 11 <code>Call pzGetMobileApplications</code> [on page MobileDataViews] <br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetMobileApplications");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetMobileApplications", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetMobileApplications
if (myStepPage == null) {
String pz_78 = "MobileDataViews";
myStepPage = tools.findPage(pz_78, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_78, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : pzGetMobileApplications

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: Application.pzInsKey
newParamsPage.putParamValue("applicationHandle", PropertyInfo.TYPE_TEXT, scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT));
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzGetMobileApplications", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetMobileApplications",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Step 12.0 <code>Java</code> [on page MobileDataViews.pxResults] <br>
 */
public boolean step12_0_circum0() {
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

// Code to call nested step 12_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_1_circum0");
}
PRStackFrame pz_StackFrame12_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 12_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step12_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame12_1_circum0, false);
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
pz_CurrentStepNum = "12.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_0_circum0 definition

/**
 * Step 12.1 <code>Property-Set</code><br>
 */
public boolean step12_1_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pyMobileApp.pyMobileAppName", pRef_64, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_80.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pyMobileAppDescription", pRef_72, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_81.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_82.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pyType", pRef_65, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_83.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMobileApp.pzInsKey", pRef_68, pega.findPageWithException("MobileInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_36, pega.findPageWithException("MobileInstances", "Code-Pega-List"), "Pega-Landing-AppView-Mobile", "sIY", false, true);
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
pz_CurrentStepNum = "12.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_1_circum0 definition

/**
 * Create temp MCP instances page.
 * <p>
 * Step 13 <code>Page-New</code> [on page MCPInstances] <br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_85 = "MCPInstances";
myStepPage = tools.findPage(pz_85, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","MCPInstances",false); 
// primary page will not be added to PageList
	 pega.setStepPage("MCPInstances", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Cleanup the thread before channel launch(US-235383).
 * <p>
 * Step 14 <code>Page-Remove</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: pyInteractionCase
pageRemove(tools.findPage("pyInteractionCase"));
// Expression: pyBotcConfig
pageRemove(tools.findPage("pyBotcConfig"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Fetch MCP channels.
 * <p>
 * Step 15 <code>Call pzGetChannelsConfigurations</code> [on page MCPChannels] <br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetChannelsConfigurations");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetChannelsConfigurations", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetChannelsConfigurations
if (myStepPage == null) {
String pz_87 = "MCPChannels";
myStepPage = tools.findPage(pz_87, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_87, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : pzGetChannelsConfigurations

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: true
String pz_88 = String.valueOf(true);
newParamsPage.putParamValue("forCurrentApplication", PropertyInfo.TYPE_TRUEFALSE, pz_88);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzGetChannelsConfigurations", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetChannelsConfigurations",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Wrap MCP channel by AppView.
 * <p>
 * Step 16.0 <code>Java</code> [on page MCPChannels.pxResults] <br>
 */
public boolean step16_0_circum0_Data_Channel_Configuration() {
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

// Code to call nested step 16_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_1_circum0");
}
PRStackFrame pz_StackFrame16_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 16_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step16_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame16_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 16_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_2_circum0");
}
PRStackFrame pz_StackFrame16_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 16_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step16_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame16_2_circum0, false);
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
pz_CurrentStepNum = "16.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_0_circum0_Data_Channel_Configuration definition

/**
 * Step 16.1 <code>Property-Set</code><br>
 */
public boolean step16_1_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pyMCPChannel.pxObjClass", pRef_90, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_38.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pyBotLabel", pRef_91, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_92.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_92.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewID", pRef_41, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_93.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pzChannelPortalName", pRef_94, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_93.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pyChannelDescription", pRef_95, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_96.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pzInsKey", pRef_97, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxChannelID", pRef_42, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pzChannelIcon", pRef_98, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_100, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pzChannelName", pRef_101, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_102.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pzResponseTypesString", pRef_103, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_104.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pzCaseTypesString", pRef_105, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_106.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pyBotId", pRef_107, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_108.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMCPChannel.pyChannelId", pRef_109, pega.findPageWithException("MCPInstances", "Code-Pega-List"), scalarValueQuery_110.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
pz_CurrentStepNum = "16.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_1_circum0 definition

/**
 * Step 16.2 <code>Property-Set</code><br>
 */
public boolean step16_2_circum0() {
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
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_36, pega.findPageWithException("MCPInstances", "Code-Pega-List"), "Pega-Landing-AppView-MCP", "sIY", false, true);
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
pz_CurrentStepNum = "16.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_2_circum0 definition

/**
 * Create temp Email instances page.
 * <p>
 * Step 17 <code>Page-New</code> [on page EmailInstances] <br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_112 = "EmailInstances";
myStepPage = tools.findPage(pz_112, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","EmailInstances",false); 
// primary page will not be added to PageList
	 pega.setStepPage("EmailInstances", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * Fetch Email channels.
 * <p>
 * Step 18 <code>Call pzGetChannelsConfigurationsByClass</code> [on page EmailChannels] <br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetChannelsConfigurationsByClass");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetChannelsConfigurationsByClass", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetChannelsConfigurationsByClass
if (myStepPage == null) {
String pz_114 = "EmailChannels";
myStepPage = tools.findPage(pz_114, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_114, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : pzGetChannelsConfigurationsByClass

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: true
String pz_115 = String.valueOf(true);
newParamsPage.putParamValue("forCurrentApplication", PropertyInfo.TYPE_TRUEFALSE, pz_115);
// Expression: Data-Channel-Email
newParamsPage.putParamValue("className", PropertyInfo.TYPE_TEXT, "Data-Channel-Email");

pega.invokeActivity(myStepPage, newParamsPage, "pzGetChannelsConfigurationsByClass", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetChannelsConfigurationsByClass",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * Wrap Email channel by AppView.
 * <p>
 * Step 19.0 <code>Java</code> [on page EmailChannels.pxResults] <br>
 */
public boolean step19_0_circum0_Data_Channel_Email() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyEmailHandlingMode!=\"static\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyEmailHandlingMode!=\"static\"", "FUAInstance-NullMyStepPage");
}
boolean pz_118 = (!(scalarValueQuery_117.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("static")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyEmailHandlingMode!=\"static\"",pz_118);
if (!pz_118) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyEmailHandlingMode!=\"static\" " + anyException.getMessage(), anyException);
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

// Code to call nested step 19_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_1_circum0");
}
PRStackFrame pz_StackFrame19_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 19_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step19_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame19_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 19_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_2_circum0");
}
PRStackFrame pz_StackFrame19_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 19_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step19_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame19_2_circum0, false);
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
pz_CurrentStepNum = "19.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_0_circum0_Data_Channel_Email definition

/**
 * Step 19.1 <code>Property-Set</code><br>
 */
public boolean step19_1_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pyEmailChannel.pxObjClass", pRef_119, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_38.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyEmailChannel.pyChannelLabel", pRef_120, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_121.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_121.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyEmailChannel.pyChannelDescription", pRef_122, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_96.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyEmailChannel.pzInsKey", pRef_123, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxChannelID", pRef_42, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyEmailChannel.pzChannelIcon", pRef_124, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_100, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyEmailChannel.pzChannelName", pRef_125, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_102.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyEmailChannel.pyChannelID", pRef_126, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_127.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
pz_CurrentStepNum = "19.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_1_circum0 definition

/**
 * Changing class to Pega-Landing-AppView-Email, setup list of email accounts and suggested cases.
 * <p>
 * Step 19.2 <code>Property-Set</code><br>
 */
public boolean step19_2_circum0() {
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
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_36, pega.findPageWithException("EmailInstances", "Code-Pega-List"), "Pega-Landing-AppView-Email", "sIY", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(<last>).pyEmailAddress", pRef_128, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_129.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pySuggestedCases", pRef_130, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_131.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pySuggestedReplies", pRef_132, pega.findPageWithException("EmailInstances", "Code-Pega-List"), scalarValueQuery_133.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
pz_CurrentStepNum = "19.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_2_circum0 definition

/**
 * Step 20 <code>Page-New</code> [on page MashupInstances] <br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_135 = "MashupInstances";
myStepPage = tools.findPage(pz_135, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","MashupInstances",false); 
// primary page will not be added to PageList
	 pega.setStepPage("MashupInstances", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

/**
 * Fetch Mashup channels.
 * <p>
 * Step 21 <code>Call pzGetChannelsConfigurationsByClass</code> [on page MashupChannels] <br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetChannelsConfigurationsByClass");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetChannelsConfigurationsByClass", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetChannelsConfigurationsByClass
if (myStepPage == null) {
String pz_137 = "MashupChannels";
myStepPage = tools.findPage(pz_137, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_137, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : pzGetChannelsConfigurationsByClass

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: Data-Channel-Mashup
newParamsPage.putParamValue("className", PropertyInfo.TYPE_TEXT, "Data-Channel-Mashup");
// Expression: true
String pz_138 = String.valueOf(true);
newParamsPage.putParamValue("forCurrentApplication", PropertyInfo.TYPE_TRUEFALSE, pz_138);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzGetChannelsConfigurationsByClass", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetChannelsConfigurationsByClass",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * Wrap Mashup channel by AppView.
 * <p>
 * Step 22.0 <code>Java</code> [on page MashupChannels.pxResults] <br>
 */
public boolean step22_0_circum0_Data_Channel_Mashup() {
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

// Code to call nested step 22_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_1_circum0");
}
PRStackFrame pz_StackFrame22_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 22_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step22_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame22_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 22_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_2_circum0");
}
PRStackFrame pz_StackFrame22_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 22_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step22_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame22_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 22_3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("constell"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_3_circum0");
}
PRStackFrame pz_StackFrame22_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 22_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step22_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame22_3_circum0, false);
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
pz_CurrentStepNum = "22.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_0_circum0_Data_Channel_Mashup definition

/**
 * Make sure that the preview is available only for matching system.
 * <p>
 * Step 22.1 <code>Java</code><br>
 */
public boolean step22_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PropertyHasValue(.pzWebEmbedRegistrationName)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@PropertyHasValue(.pzWebEmbedRegistrationName)", "FUAInstance-NullMyStepPage");
}
boolean pz_141 = (pega.<Boolean>resolveMethodCall("PropertyHasValue--(ClipboardProperty)", "PropertyHasValue", null, null, new Object[] { propertyQuery_140.resolve(tools, myStepPage) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PropertyHasValue(.pzWebEmbedRegistrationName)",pz_141);
if (pz_141) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PropertyHasValue(.pzWebEmbedRegistrationName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage pg_requestor = tools.findPage("pxRequestor");
contextURI = pg_requestor.getString("pxReqContextURI");

/* Parse and find the system info from mashup url */
String[] pegaURL = myStepPage.getString("pyMashupCodeSnippet").split("data-pega-url"); 
if(!pegaURL[1].isEmpty()) {
  String[] arr = pegaURL[1].split("//"); 
  for (String aa : arr) {
    String[] arr1 = aa.split("/"); 
    fromTheMashup = arr1[0];
  }
}

String fromTheURI = null;
String[] arr = contextURI.split("//"); 
for (String aa : arr) {
  String[] arr1 = aa.split("/"); 
  fromTheURI = arr1[0];
}

/* Set flag as needed */
if (!fromTheMashup.isEmpty() && !fromTheURI.isEmpty() && fromTheURI.trim().equalsIgnoreCase(fromTheMashup.trim())) {
  myStepPage.putString("pyIsSelected","true");
} else {
  myStepPage.putString("pyIsSelected","false");
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
pz_CurrentStepNum = "22.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_1_circum0 definition

/**
 * Set properties if not constellation and pzWebEmbedRegistrationName not set.
 * <p>
 * Step 22.2 <code>Property-Set</code><br>
 */
public boolean step22_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__7 = pega.invokeWhen("pyIsConstellationUI", "Code-Pega-List", "Data-Channel-Mashup");
if (pz__7) {
// branch to block constell
nextBlock = "constell";
pega.activityStepSkipped("Jump To Step");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PropertyHasValue(.pzWebEmbedRegistrationName)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@PropertyHasValue(.pzWebEmbedRegistrationName)", "FUAInstance-NullMyStepPage");
}
boolean pz_142 = (pega.<Boolean>resolveMethodCall("PropertyHasValue--(ClipboardProperty)", "PropertyHasValue", null, null, new Object[] { propertyQuery_140.resolve(tools, myStepPage) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PropertyHasValue(.pzWebEmbedRegistrationName)",pz_142);
if (pz_142) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PropertyHasValue(.pzWebEmbedRegistrationName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyMashupChannel.pxObjClass", pRef_143, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_38.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyChannelLabel", pRef_144, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_121.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_121.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pzInsKey", pRef_145, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxChannelID", pRef_42, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_36, pega.findPageWithException("MashupInstances", "Code-Pega-List"), "Pega-Landing-AppView-Mashup", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyChannelDescription", pRef_146, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_96.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pzChannelIcon", pRef_147, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_100, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pzChannelName", pRef_148, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_102.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyChannelID", pRef_149, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_127.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyIsSelected", pRef_150, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_151.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyStaticServerURL", pRef_152, pega.findPageWithException("MashupInstances", "Code-Pega-List"), pega.<String>resolveMethodCall("pxGetC11nURL--(String,String,String)", "pxGetC11nURL", null, null, new Object[] { "Pega-UIEngine", "ConstellationSvcURL", "pxConstellationSvcURL" }), "sTN", false, true);
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
pz_CurrentStepNum = "22.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_2_circum0 definition

/**
 * Set properties if constellation and pzWebEmbedRegistrationNameis set.
 * <p>
 * Step 22.3 [constell] <code>Property-Set</code><br>
 */
public boolean step22_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__9 = pega.invokeWhen("pyIsConstellationUI", "Code-Pega-List", "Data-Channel-Mashup");
if (!pz__9) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PropertyHasValue(.pzWebEmbedRegistrationName)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@PropertyHasValue(.pzWebEmbedRegistrationName)", "FUAInstance-NullMyStepPage");
}
boolean pz_153 = (pega.<Boolean>resolveMethodCall("PropertyHasValue--(ClipboardProperty)", "PropertyHasValue", null, null, new Object[] { propertyQuery_140.resolve(tools, myStepPage) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PropertyHasValue(.pzWebEmbedRegistrationName)",pz_153);
if (!pz_153) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PropertyHasValue(.pzWebEmbedRegistrationName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyMashupChannel.pxObjClass", pRef_143, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_38.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyChannelLabel", pRef_144, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_121.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxAppViewName", pRef_35, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_121.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pzInsKey", pRef_145, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxChannelID", pRef_42, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_36, pega.findPageWithException("MashupInstances", "Code-Pega-List"), "Pega-Landing-AppView-Mashup", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyChannelDescription", pRef_146, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_96.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pzChannelIcon", pRef_147, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_100, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_99.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pzChannelName", pRef_148, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_102.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyChannelID", pRef_149, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_127.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyIsSelected", pRef_150, pega.findPageWithException("MashupInstances", "Code-Pega-List"), scalarValueQuery_151.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyMashupChannel.pyStaticServerURL", pRef_152, pega.findPageWithException("MashupInstances", "Code-Pega-List"), pega.<String>resolveMethodCall("pxGetC11nURL--(String,String,String)", "pxGetC11nURL", null, null, new Object[] { "Pega-UIEngine", "ConstellationSvcURL", "pxConstellationSvcURL" }), "sTN", false, true);
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
pz_CurrentStepNum = "22.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_3_circum0 definition

/**
 * Create temp custom configurations instances page.
 * <p>
 * Step 23 <code>Page-New</code> [on page CustomAppViews] <br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_155 = "CustomAppViews";
myStepPage = tools.findPage(pz_155, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","CustomAppViews",false); 
// primary page will not be added to PageList
	 pega.setStepPage("CustomAppViews", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * Fetch custom configurations.
 * <p>
 * Step 24 <code>Call pzGetCustomConfigurations</code> [on page CustomConfigs] <br>
 */
public boolean step24_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetCustomConfigurations");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetCustomConfigurations", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetCustomConfigurations
if (myStepPage == null) {
String pz_157 = "CustomConfigs";
myStepPage = tools.findPage(pz_157, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_157, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
// Calling Activity : pzGetCustomConfigurations

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzGetCustomConfigurations", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetCustomConfigurations",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0 definition

/**
 * Wrap custom configurations by AppView.
 * <p>
 * Step 25.0 <code>Java</code> [on page CustomConfigs.pxResults] <br>
 */
public boolean step25_0_circum0_Data_Custom_Configuration() {
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

// Code to call nested step 25_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_1_circum0");
}
PRStackFrame pz_StackFrame25_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 25_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step25_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame25_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 25_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_2_circum0");
}
PRStackFrame pz_StackFrame25_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 25_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step25_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame25_2_circum0, false);
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
pz_CurrentStepNum = "25.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_0_circum0_Data_Custom_Configuration definition

/**
 * Step 25.1 <code>Property-Set</code><br>
 */
public boolean step25_1_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pxObjClass", pRef_159, pega.findPageWithException("CustomAppViews", "Code-Pega-List"), "Pega-Landing-AppView-Custom", "sIY", false, true);
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
pz_CurrentStepNum = "25.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_1_circum0 definition

/**
 * Step 25.2 <code>Page-Copy</code><br>
 */
public boolean step25_2_circum0() {
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
// Expression: CustomAppViews.pxResults(<LAST>).pyConfig
ClipboardPage pz_161 = pega.getViaPropRef(".pxResults(<last>).pyConfig", pRef_160, pega.findPageWithException("CustomAppViews", "Code-Pega-List"), false, false).getPageValue();
targetPage = pz_161;
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
pz_CurrentStepNum = "25.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_2_circum0 definition

/**
 * Copy web application views to primary page.
 * <p>
 * Step 26.0 <code>Java</code> [on page WebInstances.pxResults] <br>
 */
public boolean step26_0_circum0() {
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

// Code to call nested step 26_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "26.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 26_1_circum0");
}
PRStackFrame pz_StackFrame26_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 26_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step26_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame26_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 26_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "26.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 26_2_circum0");
}
PRStackFrame pz_StackFrame26_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 26_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step26_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame26_2_circum0, false);
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
pz_CurrentStepNum = "26.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_0_circum0 definition

/**
 * Step 26.1 <code>Page-Copy</code><br>
 */
public boolean step26_1_circum0() {
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_163 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_163;
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
pz_CurrentStepNum = "26.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_1_circum0 definition

/**
 * Step 26.2 <code>Property-Set</code><br>
 */
public boolean step26_2_circum0() {
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
    size = (size + 1);
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
pz_CurrentStepNum = "26.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_2_circum0 definition

/**
 * Step 27.0 <code>Java</code> [on page MashupInstances.pxResults] <br>
 */
public boolean step27_0_circum0() {
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

// Code to call nested step 27_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "27.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 27_1_circum0");
}
PRStackFrame pz_StackFrame27_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 27_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step27_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame27_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 27_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "27.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 27_2_circum0");
}
PRStackFrame pz_StackFrame27_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 27_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step27_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame27_2_circum0, false);
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
pz_CurrentStepNum = "27.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_0_circum0 definition

/**
 * Step 27.1 <code>Page-Copy</code><br>
 */
public boolean step27_1_circum0() {
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_165 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_165;
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
pz_CurrentStepNum = "27.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_1_circum0 definition

/**
 * Step 27.2 <code>Property-Set</code><br>
 */
public boolean step27_2_circum0() {
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
    size = (size + 1);
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
pz_CurrentStepNum = "27.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_2_circum0 definition

/**
 * Copy mobile application views to primary page.
 * <p>
 * Step 28.0 <code>Java</code> [on page MobileInstances.pxResults] <br>
 */
public boolean step28_0_circum0() {
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

// Code to call nested step 28_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "28.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 28_1_circum0");
}
PRStackFrame pz_StackFrame28_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 28_1 Circum: 0" );
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

// Code to call nested step 28_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "28.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 28_2_circum0");
}
PRStackFrame pz_StackFrame28_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 28_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step28_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame28_2_circum0, false);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_0_circum0 definition

/**
 * Step 28.1 <code>Page-Copy</code><br>
 */
public boolean step28_1_circum0() {
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_167 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_167;
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
pz_CurrentStepNum = "28.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_1_circum0 definition

/**
 * Step 28.2 <code>Property-Set</code><br>
 */
public boolean step28_2_circum0() {
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
    size = (size + 1);
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
pz_CurrentStepNum = "28.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_2_circum0 definition

/**
 * Copy other MCP app views to primary page.
 * <p>
 * Step 29.0 <code>Java</code> [on page MCPInstances.pxResults] <br>
 */
public boolean step29_0_circum0() {
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

// Code to call nested step 29_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "29.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 29_1_circum0");
}
PRStackFrame pz_StackFrame29_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 29_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step29_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame29_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 29_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "29.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 29_2_circum0");
}
PRStackFrame pz_StackFrame29_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 29_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step29_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame29_2_circum0, false);
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
pz_CurrentStepNum = "29.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step29_0_circum0 definition

/**
 * Step 29.1 <code>Page-Copy</code><br>
 */
public boolean step29_1_circum0() {
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_169 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_169;
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
pz_CurrentStepNum = "29.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step29_1_circum0 definition

/**
 * Step 29.2 <code>Property-Set</code><br>
 */
public boolean step29_2_circum0() {
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
    size = (size + 1);
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
pz_CurrentStepNum = "29.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step29_2_circum0 definition

/**
 * Copy email app views to primary page.
 * <p>
 * Step 30.0 <code>Java</code> [on page EmailInstances.pxResults] <br>
 */
public boolean step30_0_circum0() {
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

// Code to call nested step 30_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "30.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 30_1_circum0");
}
PRStackFrame pz_StackFrame30_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 30_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step30_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame30_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 30_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "30.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 30_2_circum0");
}
PRStackFrame pz_StackFrame30_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 30_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step30_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame30_2_circum0, false);
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
pz_CurrentStepNum = "30.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step30_0_circum0 definition

/**
 * Step 30.1 <code>Page-Copy</code><br>
 */
public boolean step30_1_circum0() {
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_171 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_171;
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
pz_CurrentStepNum = "30.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step30_1_circum0 definition

/**
 * Step 30.2 <code>Property-Set</code><br>
 */
public boolean step30_2_circum0() {
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
    size = (size + 1);
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
pz_CurrentStepNum = "30.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step30_2_circum0 definition

/**
 * Copy custom configuration app views to primary page.
 * <p>
 * Step 31.0 <code>Java</code> [on page CustomAppViews.pxResults] <br>
 */
public boolean step31_0_circum0() {
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

// Code to call nested step 31_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "31.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 31_1_circum0");
}
PRStackFrame pz_StackFrame31_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 31_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step31_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame31_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 31_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "31.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 31_2_circum0");
}
PRStackFrame pz_StackFrame31_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT Step: 31_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step31_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame31_2_circum0, false);
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
pz_CurrentStepNum = "31.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step31_0_circum0 definition

/**
 * Step 31.1 <code>Page-Copy</code><br>
 */
public boolean step31_1_circum0() {
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_173 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_173;
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
pz_CurrentStepNum = "31.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step31_1_circum0 definition

/**
 * Step 31.2 <code>Property-Set</code><br>
 */
public boolean step31_2_circum0() {
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
    size = (size + 1);
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
pz_CurrentStepNum = "31.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step31_2_circum0 definition

/**
 * Creating a single instance of PegaAPIChannel.
 * <p>
 * Step 32 <code>Page-New</code> [on page PegaAPIChannel] <br>
 */
public boolean step32_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_175 = "PegaAPIChannel";
myStepPage = tools.findPage(pz_175, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Pega-Landing-AppView-PegaAPI","PegaAPIChannel",false); 
// primary page will not be added to PageList
	 pega.setStepPage("PegaAPIChannel", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step32_circum0 definition

/**
 * Copy this page into Primary Page.
 * <p>
 * Step 33 <code>Page-Copy</code> [on page PegaAPIChannel] <br>
 */
public boolean step33_circum0() {
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_177 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_177;
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
pz_CurrentStepNum = "33";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step33_circum0 definition

/**
 * Increase Result Count.
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
    size = (size + 1);
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
 * Set ResultCount on primary page.
 * <p>
 * Step 35 <code>Property-Set</code> [on page Primary] <br>
 */
public boolean step35_circum0() {
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
    pega.setViaPropRef(".pxResultCount", pRef_178, myStepPage, size, "sNY", false, true);
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
pz_CurrentStepNum = "35";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step35_circum0 definition

/**
 * Step 36 <code>Apply-DataTransform</code> [on page .pxResults] <br>
 */
public boolean step36_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: pyDefault
ParameterPage stepParams__1 = new ParameterPage();/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "Code-Pega-List";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "pyDefault");
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
pz_CurrentStepNum = "36";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step36_circum0 definition

/**
 * Remove temp channel pages.
 * <p>
 * Step 37 <code>Page-Remove</code><br>
 */
public boolean step37_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: WebInstances
pageRemove(tools.findPage("WebInstances"));
// Expression: MobileInstances
pageRemove(tools.findPage("MobileInstances"));
// Expression: MCPInstances
pageRemove(tools.findPage("MCPInstances"));
// Expression: EmailInstances
pageRemove(tools.findPage("EmailInstances"));
// Expression: TempPortal
pageRemove(tools.findPage("TempPortal"));
// Expression: Mobileviews
pageRemove(tools.findPage("Mobileviews"));
// Expression: MCPChannels
pageRemove(tools.findPage("MCPChannels"));
// Expression: EmailChannels
pageRemove(tools.findPage("EmailChannels"));
// Expression: MashupChannels
pageRemove(tools.findPage("MashupChannels"));
// Expression: MashupInstances
pageRemove(tools.findPage("MashupInstances"));
// Expression: PegaAPIChannel
pageRemove(tools.findPage("PegaAPIChannel"));
// Expression: CustomAppViews
pageRemove(tools.findPage("CustomAppViews"));
// Expression: CustomConfigs
pageRemove(tools.findPage("CustomConfigs"));
// Expression: MobileDataViews
pageRemove(tools.findPage("MobileDataViews"));
// Expression: DefaultMobile
pageRemove(tools.findPage("DefaultMobile"));
// Expression: MobileChannelPage
pageRemove(tools.findPage("MobileChannelPage"));
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
pz_CurrentStepNum = "37";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step37_circum0 definition

/**
 * Step 38 <code>Obj-Filter</code><br>
 */
public boolean step38_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Filter", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Filter
// Expression: Primary
// Expression: Pega-Landing-AppView

//Filtering of result set starts here.
ClipboardPage contentPage = tools.findPage("Primary");
if (contentPage == null) {
throw new PRRuntimeException("Primary","this page does not exist and cannot be shown");
}
ParameterPage paramPage = tools.getParameterPage();
ClipboardProperty cp_Results = contentPage.getProperty("pxResults");
for (int i = cp_Results.size(); i >= 1; i--) {
ClipboardPage cp_ResultPage = cp_Results.getPageValue(i);
PRStackFrame resultPage_Frame = pega.pushStackFrame("Obj-Filter", paramPage , cp_ResultPage, false, false);
myStepPage = tools.getStepPage();
try {
boolean resultWhen_0 = pega.invokeWhen("pyIsAvailable", "Code-Pega-List", "Pega-Landing-AppView");
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
pz_CurrentStepNum = "38";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step38_circum0 definition

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

public int size = 0;
public String mashupChannel = "";
public String channelKey = "";
public String contextURI = "";
public int actualportals = 0;
public boolean doesPortalExist = false;
public String fromTheMashup = "";

public void initializeUserLocalVariables() {
	size = 0;
	mashupChannel = "";
	channelKey = "";
	contextURI = "";
	actualportals = 0;
	doesPortalExist = false;
	fromTheMashup = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("size", Integer.toString(size));
	smRetVal.putString("mashupChannel", (mashupChannel == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : mashupChannel.toString());
	smRetVal.putString("channelKey", (channelKey == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : channelKey.toString());
	smRetVal.putString("contextURI", (contextURI == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : contextURI.toString());
	smRetVal.putString("actualportals", Integer.toString(actualportals));
	smRetVal.putString("doesPortalExist", Boolean.toString(doesPortalExist));
	smRetVal.putString("fromTheMashup", (fromTheMashup == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : fromTheMashup.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_37 = new String[] { "", "", "pxResults", "<last>", "pyPortal", "", "pxObjClass", "" };
public static final String[] pRef_76 = new String[] { "", "", "pxResults", "<last>", "pyMobileApp", "", "pyMobileAppName", "" };
public static final String[] pRef_107 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pyBotId", "" };
public static final String[] pRef_47 = new String[] { "", "", "pxResults", "<last>", "pyHasAlternateDesignSystem", "" };
public static final String[] pRef_97 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pzInsKey", "" };
public static final String[] pRef_36 = new String[] { "", "", "pxResults", "<last>", "pxObjClass", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyMode", "" };
public static final String[] pRef_103 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pzResponseTypesString", "" };
public static final String[] pRef_95 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pyChannelDescription", "" };
public static final String[] pRef_109 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pyChannelId", "" };
public static final String[] pRef_41 = new String[] { "", "", "pxResults", "<last>", "pxAppViewID", "" };
public static final String[] pRef_145 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pzInsKey", "" };
public static final String[] pRef_119 = new String[] { "", "", "pxResults", "<append>", "pyEmailChannel", "", "pxObjClass", "" };
public static final String[] pRef_72 = new String[] { "", "", "pxResults", "<last>", "pyMobileApp", "", "pyMobileAppDescription", "" };
public static final String[] pRef_53 = new String[] { "", "", "pxResults", "<last>", "pyPortal", "", "pyPortalTemplate", "" };
public static final String[] pRef_178 = new String[] { "", "", "pxResultCount", "" };
public static final String[] pRef_147 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pzChannelIcon", "" };
public static final String[] pRef_128 = new String[] { "", "", "pxResults", "<last>", "pyEmailAddress", "" };
public static final String[] pRef_49 = new String[] { "", "", "pxResults", "<last>", "pyAlternateDesignSystemURL", "" };
public static final String[] pRef_148 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pzChannelName", "" };
public static final String[] pRef_67 = new String[] { "", "", "pxResults", "<last>", "pyMobileApp", "", "pxObjClass", "" };
public static final String[] pRef_122 = new String[] { "", "", "pxResults", "<last>", "pyEmailChannel", "", "pyChannelDescription", "" };
public static final String[] pRef_39 = new String[] { "", "", "pxResults", "<last>", "pyPortal", "", "pyPortalLayout", "" };
public static final String[] pRef_124 = new String[] { "", "", "pxResults", "<last>", "pyEmailChannel", "", "pzChannelIcon", "" };
public static final String[] pRef_43 = new String[] { "", "", "pxResults", "<last>", "pyPortal", "", "pyDescription", "" };
public static final String[] pRef_123 = new String[] { "", "", "pxResults", "<last>", "pyEmailChannel", "", "pzInsKey", "" };
public static final String[] pRef_144 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pyChannelLabel", "" };
public static final String[] pRef_35 = new String[] { "", "", "pxResults", "<last>", "pxAppViewName", "" };
public static final String[] pRef_32 = new String[] { "", "", "pxResults", "<append>", "pyPortal", "", "pyAppViewName", "" };
public static final String[] pRef_159 = new String[] { "", "", "pxResults", "<append>", "pxObjClass", "" };
public static final String[] pRef_94 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pzChannelPortalName", "" };
public static final String[] pRef_51 = new String[] { "", "", "pxResults", "<last>", "pxIsNextGenUI", "" };
public static final String[] pRef_152 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pyStaticServerURL", "" };
public static final String[] pRef_45 = new String[] { "", "", "pxResults", "<last>", "pyPortal", "", "pyCategory", "" };
public static final String[] pRef_100 = new String[] { "", "", "pxResults", "<last>", "pxIcon", "" };
public static final String[] pRef_125 = new String[] { "", "", "pxResults", "<last>", "pyEmailChannel", "", "pzChannelName", "" };
public static final String[] pRef_91 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pyBotLabel", "" };
public static final String[] pRef_105 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pzCaseTypesString", "" };
public static final String[] pRef_149 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pyChannelID", "" };
public static final String[] pRef_98 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pzChannelIcon", "" };
public static final String[] pRef_58 = new String[] { "", "", "pxResults", "<last>", "pyPortal", "", "pyAppViewName", "" };
public static final String[] pRef_150 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pyIsSelected", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_160 = new String[] { "", "", "pxResults", "<last>", "pyConfig", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_126 = new String[] { "", "", "pxResults", "<last>", "pyEmailChannel", "", "pyChannelID", "" };
public static final String[] pRef_132 = new String[] { "", "", "pxResults", "<last>", "pySuggestedReplies", "" };
public static final String[] pRef_146 = new String[] { "", "", "pxResults", "<last>", "pyMashupChannel", "", "pyChannelDescription", "" };
public static final String[] pRef_42 = new String[] { "", "", "pxResults", "<last>", "pxChannelID", "" };
public static final String[] pRef_120 = new String[] { "", "", "pxResults", "<last>", "pyEmailChannel", "", "pyChannelLabel", "" };
public static final String[] pRef_64 = new String[] { "", "", "pxResults", "<append>", "pyMobileApp", "", "pyMobileAppName", "" };
public static final String[] pRef_90 = new String[] { "", "", "pxResults", "<append>", "pyMCPChannel", "", "pxObjClass", "" };
public static final String[] pRef_65 = new String[] { "", "", "pxResults", "<last>", "pyMobileApp", "", "pyType", "" };
public static final String[] pRef_143 = new String[] { "", "", "pxResults", "<append>", "pyMashupChannel", "", "pxObjClass", "" };
public static final String[] pRef_74 = new String[] { "", "", "pzMobileApp", "", "pyMobileAppDescription", "" };
public static final String[] pRef_101 = new String[] { "", "", "pxResults", "<last>", "pyMCPChannel", "", "pzChannelName", "" };
public static final String[] pRef_130 = new String[] { "", "", "pxResults", "<last>", "pySuggestedCases", "" };
public static final String[] pRef_46 = new String[] { "", "", "pxResults", "<last>", "pyCategory", "" };
public static final String[] pRef_68 = new String[] { "", "", "pxResults", "<last>", "pyMobileApp", "", "pzInsKey", "" };
private static final ScalarValueQuery scalarValueQuery_117 = FUAUtil.createQueryBuilder().scalarProperty("pyEmailHandlingMode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pyAppViewName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_38 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().pageList("pyUserPortals").scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_99 = FUAUtil.createQueryBuilder().scalarProperty("pzChannelIcon").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_82 = FUAUtil.createQueryBuilder().scalarProperty("pyAppView").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_104 = FUAUtil.createQueryBuilder().scalarProperty("pzResponseTypesString").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_81 = FUAUtil.createQueryBuilder().scalarProperty("pyMobileAppDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_121 = FUAUtil.createQueryBuilder().scalarProperty("pyChannelLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_92 = FUAUtil.createQueryBuilder().scalarProperty("pyBotLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_80 = FUAUtil.createQueryBuilder().scalarProperty("pyMobileAppName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarProperty("pyPortalLayout").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarProperty("pyAlternateDesignSystemURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_140 = FUAUtil.createQueryBuilder().scalarProperty("pzWebEmbedRegistrationName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_48 = FUAUtil.createQueryBuilder().scalarProperty("pyHasAlternateDesignSystem").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_52 = FUAUtil.createQueryBuilder().scalarProperty("pyIsNextGenUI").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_151 = FUAUtil.createQueryBuilder().scalarProperty("pyIsSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_73 = FUAUtil.createQueryBuilder().page("pzMobileApp").scalarProperty("pyMobileAppDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_102 = FUAUtil.createQueryBuilder().scalarProperty("pzChannelName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_54 = FUAUtil.createQueryBuilder().scalarProperty("pyPortalTemplate").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_131 = FUAUtil.createQueryBuilder().scalarProperty("pyTileSuggestedCases").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_66 = FUAUtil.createQueryBuilder().scalarProperty("pyMode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pyCategory").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_108 = FUAUtil.createQueryBuilder().scalarProperty("pyBotId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_133 = FUAUtil.createQueryBuilder().scalarProperty("pyTileSuggestedReplies").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_44 = FUAUtil.createQueryBuilder().scalarProperty("pyDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_69 = FUAUtil.createQueryBuilder().scalarProperty("pxInsName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_83 = FUAUtil.createQueryBuilder().scalarProperty("pyType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_96 = FUAUtil.createQueryBuilder().scalarProperty("pyChannelDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().pageList("pyUserPortals").scalarProperty("pyPortalLayout").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_93 = FUAUtil.createQueryBuilder().scalarProperty("pzChannelPortalName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_129 = FUAUtil.createQueryBuilder().scalarProperty("pyTileEmailAccounts").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_106 = FUAUtil.createQueryBuilder().scalarProperty("pzCaseTypesString").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_127 = FUAUtil.createQueryBuilder().scalarProperty("pyChannelID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_110 = FUAUtil.createQueryBuilder().scalarProperty("pyChannelId").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPVIEWS #20230618T002052.052 GMT", "Code-Pega-List pzGetAppViews", "Pega-EndUserUI", "08-23-01", false, true, "", "ACTIVITY", "20230618T002052.052 GMT" ,"Rule-Obj-Activity"); }
