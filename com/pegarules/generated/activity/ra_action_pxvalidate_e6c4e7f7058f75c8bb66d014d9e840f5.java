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
public class ra_action_pxvalidate_e6c4e7f7058f75c8bb66d014d9e840f5 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pxValidate.Rule_Obj_Activity.Action");
	public ra_action_pxvalidate_e6c4e7f7058f75c8bb66d014d9e840f5(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT	Pega-RulesEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pySteps", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_11 = pzPrimPage.getIfPresent("pySteps");
pageRef = pz_11;
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
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 8 Circum: 0" );
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
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 10_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyActivityPrivilegeList", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_13 = pzPrimPage.getIfPresent("pyActivityPrivilegeList");
pageRef = pz_13;
} 
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
if ( "Embed-Rule-PrivilegeSecurity".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-Rule-PrivilegeSecurity").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0_Embed_Rule_PrivilegeSecurity();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
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

// Code to call step 11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 11 Circum: 0" );
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
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyParameters", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_14 = pzPrimPage.getIfPresent("pyParameters");
pageRef = pz_14;
} 
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
if ( "Embed-MethodParams".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-MethodParams").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0_Embed_MethodParams();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
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

// Code to call step 13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 13 Circum: 0" );
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
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 14 Circum: 0" );
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
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyPagesAndClasses", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_21 = pzPrimPage.getIfPresent("pyPagesAndClasses");
pageRef = pz_21;
} 
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
if ( "Embed-PagesAndClasses".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-PagesAndClasses").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0_Embed_PagesAndClasses();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
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

// Code to call step 16_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_25 = pzPrimPage.getIfPresent("pySteps");
pageRef = pz_25;
} 
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
if ( "Embed-ActivitySteps".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-ActivitySteps").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0_Embed_ActivitySteps();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
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

// Code to call step 17_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pySteps", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_26 = pzPrimPage.getIfPresent("pySteps");
pageRef = pz_26;
} 
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
if ( "Embed-ActivitySteps".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-ActivitySteps").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_0_circum0");
}
PRStackFrame pz_StackFrame17_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 17_0 Circum: 0" );
try {
pz_Status = step17_0_circum0_Embed_ActivitySteps();
} finally {
pega.popStackFrame(pz_StackFrame17_0_circum0, false);
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

// Code to call step 18_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_33 = pzPrimPage.getIfPresent("pySteps");
pageRef = pz_33;
} 
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
if ( "Embed-ActivitySteps".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-ActivitySteps").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_0_circum0");
}
PRStackFrame pz_StackFrame18_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 18_0 Circum: 0" );
try {
pz_Status = step18_0_circum0_Embed_ActivitySteps();
} finally {
pega.popStackFrame(pz_StackFrame18_0_circum0, false);
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
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 19 Circum: 0" );
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
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 20 Circum: 0" );
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
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 21 Circum: 0" );
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
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 22 Circum: 0" );
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
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 23 Circum: 0" );
try {
pz_Status = step23_circum0();
} finally {
pega.popStackFrame(pz_StackFrame23_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 24_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_43 = pzPrimPage.getIfPresent("pySteps");
pageRef = pz_43;
} 
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
if ( "Embed-ActivitySteps".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-ActivitySteps").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "24";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 24_circum0");
}
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 24 Circum: 0" );
try {
pz_Status = step24_circum0_Embed_ActivitySteps();
} finally {
pega.popStackFrame(pz_StackFrame24_circum0, false);
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

// Code to call step 25_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_circum0");
}
PRStackFrame pz_StackFrame25_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 25 Circum: 0" );
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
PRStackFrame pz_StackFrame26_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 26 Circum: 0" );
try {
pz_Status = step26_circum0();
} finally {
pega.popStackFrame(pz_StackFrame26_circum0, false);
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
	"Rule-Obj-Activity:PXVALIDATE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXVALIDATE","Rule-Obj-Activity","RULE-OBJ-ACTIVITY",false,"","Pega-RulesEngine","08-06-01","RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT","!PXVALIDATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1723211429)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT:20200804T160632.313 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ae2aca6e95972c10be9e350b3530055e";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Activity";
	}
public String getAspect() {
return "Action";
}
/**
 * Clear any messages.
 * <p>
 * Step 1 <code>Page-Clear-Messages</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Clear-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Clear-Messages
if(myStepPage != null) {
myStepPage.clearMessages();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Start Validation.
 * <p>
 * Step 2 <code>Start-Validate</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Start-Validate");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Start-Validate", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Start-Validate
try {
	ClipboardPage primaryPage = tools.getPrimaryPage();
	if (primaryPage == null) {
		throw new PRRuntimeException("Cannot call Start-Validate when there is no primary page");
	}
	tools.getDatabase().getRulesetContext(primaryPage).startTrackingReferences();
} catch (DatabaseException ex) {
	oLog.error("Error setting up RuleSet context in Start-Validate", ex);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Start-Validate",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * BUG-277952 Only a single Remove Action operating on a PageList using the <CURRENT> keyword is allowed per For Each loop.
 * <p>
 * Step 3 <code>Call pzValidateSingleRemoveAction</code> [on page .pySteps] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateSingleRemoveAction");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzValidateSingleRemoveAction", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzValidateSingleRemoveAction
// Calling Activity : pzValidateSingleRemoveAction

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", ".pySteps");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzValidateSingleRemoveAction", "Rule-Obj-Activity", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateSingleRemoveAction",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Step 4 <code>Call DictionaryValidation</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call DictionaryValidation");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call DictionaryValidation", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call DictionaryValidation
if (myStepPage == null) {
}
// Calling Activity : DictionaryValidation

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: true
String pz_12 = String.valueOf(true);
newParamsPage.putParamValue("skipDupCheck", PropertyInfo.TYPE_TRUEFALSE, pz_12);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "DictionaryValidation", "Rule-Obj-Activity", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call DictionaryValidation",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Validates the circumstance template and definition.
 * <p>
 * Step 5 <code>Call ValidateCircumstance</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call ValidateCircumstance");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call ValidateCircumstance", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call ValidateCircumstance
if (myStepPage == null) {
}
// Calling Activity : ValidateCircumstance

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();

pega.invokeActivity(myStepPage, newParamsPage, "ValidateCircumstance", "Rule-Obj-Activity", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call ValidateCircumstance",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * v2 API Check.
 * <p>
 * Step 6 <code>Java</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// Starting in PegaRULES 4.2 SP2, you can no longer create a new v2 API-based activity
ClipboardPage cpInstance = tools.getPrimaryPage();
ClipboardProperty propAPIVersion = cpInstance.getProperty("pyJavaGenerateAPIVersion");

if ((!propAPIVersion.getStringValue().equals("03-02")) &&
	(cpInstance.getIfPresent("pzInsKey") == null) &&
	(cpInstance.getIfPresent("pzOriginalInstanceKey") == null)) {
	propAPIVersion.addMessage("Validate-LegacyAPI");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Parse- methods only in R-P-S.
 * <p>
 * Step 7 <code>Java</code><br>
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
if (!tools.getPrimaryPage().getString("pxObjClass").equals("Rule-Parse-Structured")) {
	// Make sure no Parse- methods used.
	ClipboardProperty propSteps = tools.getPrimaryPage().getProperty("pySteps");
	for (int i = 0; i < propSteps.size(); i++) {
		ClipboardProperty propMethodUC = propSteps.getPageValue(i + 1).getProperty("pyStepsActivityNameUC");
		if (propMethodUC.getStringValue().startsWith("PARSE-")){
          ClipboardProperty propMethod = propSteps.getPageValue(i + 1).getProperty("pyStepsActivityName");
			propMethod.addMessage("pyParseMethodsOnly");
        }
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
 * Validate step methods used are allowed for activity type.
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
com.pegarules.generated.pega_rulesengine_activity.pzValidateStepMethodsUsedInActivity(tools.getPrimaryPage());
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
 * Validate Allow direct invocation from the client or a service.
 * <p>
 * Step 9 <code>Call pzActivitySecurityErrors</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzActivitySecurityErrors");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzActivitySecurityErrors", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzActivitySecurityErrors
if (myStepPage == null) {
}
// Calling Activity : pzActivitySecurityErrors
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzActivitySecurityErrors", "Rule-Obj-Activity", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzActivitySecurityErrors",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Validate each Privilege field entry in the Security tab.
 * <p>
 * Step 10 <code>Java</code> [on page .pyActivityPrivilegeList] <br>
 */
public boolean step10_circum0_Embed_Rule_PrivilegeSecurity() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// check if this is a valid class for the privilege 
ClipboardProperty cp_className = myStepPage.getProperty("pyPrivilegeClass");
String strClassName = cp_className.getStringValue();
boolean isValidClass=true;
if (strClassName.length() == 0)
	// Just use the Activity's class then
	strClassName = tools.getPrimaryPage().getString("pyClassName");
else
{
	ClassInfo classInfo = tools.getDictionary().getClassInfo(strClassName);	
	if (classInfo.isUndefined())
	{
		isValidClass=false;
		cp_className.addMessage("Validate-InvalidForPreReq\t" + strClassName);
	}
}

if(isValidClass){
// check if this is a valid Privilege 
	ClipboardProperty cp_privilegeName = myStepPage.getProperty("pyPrivilegeName");
	String strPrivilegeName = cp_privilegeName.getStringValue();
if (strPrivilegeName.length() > 0)
	{	
	StringMap privPage = new HashStringMap();
	privPage.putString("pxObjClass", "Rule-Access-Privilege");					   
	privPage.putString("pyClassName", strClassName);
	privPage.putString("pyPrivilegeName", strPrivilegeName);	
	try {					
		RulesetContext rulesetContext = tools.getDatabase().getRulesetContext(tools.getPrimaryPage()); 
		if (rulesetContext.open(privPage) == null)
			cp_privilegeName.addMessage("Validate-InvalidForPreReq\t" + strPrivilegeName);
		} catch (DatabaseException dbex) {
			 throw new PRRuntimeException(dbex);
		}
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
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0_Embed_Rule_PrivilegeSecurity definition

/**
 * Validate .pyParameters and .pyLocalParameters.
 * <p>
 * Step 11 <code>Call Rule-.pzValidateParameters</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-.pzValidateParameters");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-.pzValidateParameters", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-.pzValidateParameters
if (myStepPage == null) {
}
// Calling Activity : Rule-.pzValidateParameters

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();

pega.invokeActivity(myStepPage, newParamsPage, "pzValidateParameters", "Rule-Obj-Activity", "Rule-");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-.pzValidateParameters",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Step 12 <code>Property-Set-Messages</code> [on page .pyParameters] <br>
 */
public boolean step12_circum0_Embed_MethodParams() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyParametersParamName, \"pyStepsParamUI\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equalsIgnoreCase(.pyParametersParamName, \"pyStepsParamUI\")", "FUAInstance-NullMyStepPage");
}
boolean pz_16 = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", null, null, new Object[] { scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyStepsParamUI" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyParametersParamName, \"pyStepsParamUI\")",pz_16);
if (!pz_16) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equalsIgnoreCase(.pyParametersParamName, \"pyStepsParamUI\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzValidatepyStepsParamUI
// Expression: .pyParametersParamName
ClipboardProperty pz_18 = propertyQuery_17.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzValidatepyStepsParamUI";
pz_18.addMessageWithKey("(Embed-MethodParams)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0_Embed_MethodParams definition

/**
 * Validate custom Param FlowAction.
 * <p>
 * Step 13 <code>java</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).PropertyHasValue(tools, \"pyRuleParamsStreamName\")");
try {
boolean pz_19 = (pega.<Boolean>resolveMethodCall("PropertyHasValue--(PublicAPI,String)", "PropertyHasValue", "Pega-RULES", "Utilities", new Object[] { tools, "pyRuleParamsStreamName" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).PropertyHasValue(tools, \"pyRuleParamsStreamName\")",pz_19);
if (!pz_19) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Utilities).PropertyHasValue(tools, \"pyRuleParamsStreamName\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
ClipboardProperty streamProp = myStepPage.getProperty(".pyRuleParamsStreamName");
String streamName = streamProp.getStringValue();
HashStringMap instanceKeys = new HashStringMap();
instanceKeys.putString("pxObjClass", "Rule-Obj-FlowAction");
instanceKeys.putString("pyClassName",tools.getPrimaryPage().getString("pyClassName"));
instanceKeys.putString("pyActionName", streamName);
ClipboardPage flowActionPage = pega_rules_utilities.validateRuleExistence2(instanceKeys,streamProp,streamName,null);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Removing extenstions.
 * <p>
 * Step 14 <code>java</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.Operation==\"SaveAs\"");
try {
boolean pz_20 = (tools.getParamValue("Operation").equals("SaveAs"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.Operation==\"SaveAs\"",pz_20);
if (!pz_20) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.Operation==\"SaveAs\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
try{
	String srcRuleset = myStepPage.getString(".pxMoveOriginalRuleSet");
         	String destRuleset = myStepPage.getString(".pyRuleSet");
	/*Finding the type of ruleset whether its standard/pega/anything.*/
	if(srcRuleset.equals("") || destRuleset.equals("")){
		return true;
	}
	String srcRulesetType = ((PegaAPI)tools).getRuleSetSpec(srcRuleset).getRuleSetType();
	String destRulesetType =((PegaAPI)tools).getRuleSetSpec(destRuleset).getRuleSetType();
	String methodStatus = myStepPage.getString(".pyMethodStatus");
	String strInterface = myStepPage.getString(".pyInterface");
	if(srcRulesetType.equals("PEGA") && !destRulesetType.equals("PEGA")){
		if(methodStatus.equals("Extension"))
		{
			myStepPage.putString(".pyMethodStatus","");			
		}
		else if(strInterface.equals("Process Extension Point"))
		{
			myStepPage.putString(".pyMethodStatus","");			
			myStepPage.putString(".pyInterface","");							   

		}
	}
}
catch(Exception e){
	oLog.error("***Exception:" +e);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Check if Prompt and "prompt". Add Warning.
 * <p>
 * Step 15 <code>Java</code> [on page .pyPagesAndClasses] <br>
 */
public boolean step15_circum0_Embed_PagesAndClasses() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "= (Lib(Pega-RULES:String).inString(.pyPagesAndClassesMode,\"()\") &lt; 0)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("= (Lib(Pega-RULES:String).inString(.pyPagesAndClassesMode,\"()\") < 0)", "FUAInstance-NullMyStepPage");
}
boolean pz_23 = ((pega.<Integer>resolveMethodCall("inString--(String,String)", "inString", "Pega-RULES", "String", new Object[] { scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "()" })).intValue() < 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "= (Lib(Pega-RULES:String).inString(.pyPagesAndClassesMode,\"()\") &lt; 0)",pz_23);
if (!pz_23) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("= (Lib(Pega-RULES:String).inString(.pyPagesAndClassesMode,\"()\") &lt; 0) " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "=Lib(Pega-RULES:String).equals(.pyPagesAndClassesMode,\"Prompt\")");
try {
boolean pz_24 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Prompt" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "=Lib(Pega-RULES:String).equals(.pyPagesAndClassesMode,\"Prompt\")",pz_24);
if (!pz_24) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("=Lib(Pega-RULES:String).equals(.pyPagesAndClassesMode,\"Prompt\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage cpPACEntry = tools.getStepPage();
ClipboardProperty propPACPage = tools.getStepPage().getProperty("pyPagesAndClassesPage");

//Lib(Pega-RULES:String).inString(.pyPagesAndClassesPage, "prompt") ==0
if(!propPACPage.getStringValue().startsWith("prompt")){
	String sPageName = propPACPage.getStringValue();
    propPACPage.addMessage("pyInvalidPageNamePrefix\tprompt\tPrompt\t"+sPageName);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0_Embed_PagesAndClasses definition

/**
 * Check page names for reserved words.
 * <p>
 * Step 16 <code>java</code> [on page .pySteps] <br>
 */
public boolean step16_circum0_Embed_ActivitySteps() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
com.pegarules.generated.pega_rulesengine_activity.pzCheckObjectName(tools.getStepPage());
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0_Embed_ActivitySteps definition

/**
 * For Call-Automation, check page list params and validate them.
 * <p>
 * Step 17.0 <code>Java</code> [on page .pySteps] <br>
 */
public boolean step17_0_circum0_Embed_ActivitySteps() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyStepsActivityName==\"Call-Automation\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyStepsActivityName==\"Call-Automation\"", "FUAInstance-NullMyStepPage");
}
boolean pz_28 = (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Call-Automation"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyStepsActivityName==\"Call-Automation\"",pz_28);
if (!pz_28) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyStepsActivityName==\"Call-Automation\" " + anyException.getMessage(), anyException);
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

// Code to call nested step 17_1_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_29 = pega.getViaPropRef(".pyAutomationPage.pyParameters", pRef_7, myStepPage, false, true);
nestedPageRef = pz_29;
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
if ( "Embed-MethodParams".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-MethodParams").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_1_circum0");
}
PRStackFrame pz_StackFrame17_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 17_1 Circum: 0" );
try {
pz_Status = step17_1_circum0_Embed_MethodParams();
} finally {
pega.popStackFrame(pz_StackFrame17_1_circum0, false);
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
} // end of step17_0_circum0_Embed_ActivitySteps definition

/**
 * Step 17.1 <code>Java</code> [on page .pyAutomationPage.pyParameters] <br>
 */
public boolean step17_1_circum0_Embed_MethodParams() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyParametersParamValue!=\"\" &amp;&amp; .pyParametersParamType==\"Page List\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyParametersParamValue!=\"\" && .pyParametersParamType==\"Page List\"", "FUAInstance-NullMyStepPage");
}
boolean pz_32 = ((!(scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) && (scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Page List")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyParametersParamValue!=\"\" &amp;&amp; .pyParametersParamType==\"Page List\"",pz_32);
if (!pz_32) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyParametersParamValue!=\"\" &amp;&amp; .pyParametersParamType==\"Page List\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String strParamValue = myStepPage.getString("pyParametersParamValue");
String strParamName = myStepPage.getString("pyParametersParamName ");
boolean bValidProp = false;
boolean bValidPLProp = false;
Dictionary dictionary = tools.getDictionary();
String strStepsClassName = myStepPage.getParentPage().getParentPage().getString("pyStepsClassName");
if(strParamValue.startsWith(".")) {
  int dotIndex = strParamValue.lastIndexOf(".");
  if (dotIndex == 0){ /*Property starting with dot. Example: .myPageListProp*/
    bValidProp = dictionary.validateReferenceWithCaseSensitivity(strStepsClassName, strParamValue);
    oLog.error("bValidProp "+bValidProp +", property mode "+dictionary.getImmutablePropertyInfo(strStepsClassName, strParamValue).getMode());
    if(bValidProp && (dictionary.getImmutablePropertyInfo(strStepsClassName, strParamValue).getMode() == ImmutablePropertyInfo.MODE_PAGE_LIST)) {
      bValidPLProp = true;  
    }
  }else { /*Property inside an embedded page. Example: .myPage.myPageListProp/.myPage1.myPage2.myPageListProp */
    String strPrevProperty = strParamValue.substring(0,strParamValue.lastIndexOf("."));
    String strClassName = pega_rules_utilities.findClassOfPageReference(strPrevProperty,null,strStepsClassName,tools);
    strParamValue = strParamValue.substring(strParamValue.lastIndexOf(".") + 1, strParamValue.length());
    bValidProp = dictionary.validateReferenceWithCaseSensitivity(strClassName, strParamValue);
    if(bValidProp && (dictionary.getImmutablePropertyInfo(strClassName, strParamValue).getMode() == ImmutablePropertyInfo.MODE_PAGE_LIST)) {
      bValidPLProp = true;  
    }
  }
}else if(strParamValue.indexOf(".") != -1) {/*Property inside a top level page. Example: MyPage.myPageListProp/MyPage1.myPage2.myPageListProp */
  String strPrevProperty = strParamValue.substring(0,strParamValue.lastIndexOf("."));
  ClipboardProperty cp_pagesAndClasses = tools.getPrimaryPage().getProperty("pyPagesAndClasses");
  Iterator it_pc = cp_pagesAndClasses.iterator();
  String strClassName = null;
  while(it_pc.hasNext()) {
    ClipboardProperty cp_entry = (ClipboardProperty)it_pc.next();
    ClipboardPage pg_entry = cp_entry.getPageValue();
    if(pg_entry.getString("pyPagesAndClassesPage").equals(strPrevProperty)) {
      strClassName = pg_entry.getString("pyPagesAndClassesClass");
      break;
    }
  }
  if(strClassName!=null) {
    strParamValue = strParamValue.substring(strParamValue.lastIndexOf(".") + 1, strParamValue.length());
    bValidProp = dictionary.validateReferenceWithCaseSensitivity(strClassName, strParamValue);
  }
  if(bValidProp && (dictionary.getImmutablePropertyInfo(strClassName, strParamValue).getMode() == ImmutablePropertyInfo.MODE_PAGE_LIST)) {
      bValidPLProp = true;  
    }
}
if(!bValidPLProp) {
  myStepPage.getProperty(".pyParametersParamValue").addMessage("Invalid parameter value for:"+ strParamName);
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
pz_CurrentStepNum = "17.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_1_circum0_Embed_MethodParams definition

/**
 * Check Property-Set-Messages for reserved.
 * <p>
 * Step 18.0 <code>Java</code> [on page .pySteps] <br>
 */
public boolean step18_0_circum0_Embed_ActivitySteps() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
if (myStepPage.getString("pyStepsActivityName").equals("Page-Set-Messages")) {
  ClipboardProperty pageNameProp = myStepPage.getIfPresent(".pyStepsCallParams.Page");
  if (pageNameProp != null) {
    String pageName = pageNameProp.getStringValue();
    if (com.pegarules.generated.pega_rulesengine_activity.pzIsPageNameReserved(pageName)) {
      pageNameProp.addMessage("ReservedWord\tpage name\t" + pageName);
    }
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

// Code to call nested step 18_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_1_circum0");
}
PRStackFrame pz_StackFrame18_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT Step: 18_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step18_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame18_1_circum0, false);
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
pz_CurrentStepNum = "18.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_0_circum0_Embed_ActivitySteps definition

/**
 * Check for Connect-HTTP and Connect-SOAP invokations and set the right execution mode based on RunInParallel parameter.This is required for a system upgraded from 5.4 or earlier.
 * <p>
 * Step 18.1 <code>Property-Map-DecisionTable</code><br>
 */
public boolean step18_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Map-DecisionTable");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyStepsActivityName==\"Connect-SOAP\" || .pyStepsActivityName==\"Connect-HTTP\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyStepsActivityName==\"Connect-SOAP\" || .pyStepsActivityName==\"Connect-HTTP\"", "FUAInstance-NullMyStepPage");
}
boolean pz_34 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Connect-SOAP")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Connect-HTTP")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyStepsActivityName==\"Connect-SOAP\" || .pyStepsActivityName==\"Connect-HTTP\"",pz_34);
if (!pz_34) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyStepsActivityName==\"Connect-SOAP\" || .pyStepsActivityName==\"Connect-HTTP\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyStepsCallParams.ExecutionMode==\"\"");
try {
boolean pz_37 = (scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyStepsCallParams.ExecutionMode==\"\"",pz_37);
if (!pz_37) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyStepsCallParams.ExecutionMode==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Map-DecisionTable", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Map-DecisionTable
ClipboardPage map_1 = tools.getStepPage();
if ((map_1 == null) || (map_1.getClassName().length() == 0)) {
map_1 = tools.getThread().createPage("Embed-ActivitySteps", "");
}

// Expression: pxGetConnectorExecMode
pega.setViaPropRef(".pyStepsCallParams.ExecutionMode", pRef_36, myStepPage, com.pegarules.generated.pega_rules_decisiontable.ObtainValue(tools, map_1, "pxGetConnectorExecMode", true), "s?N", false, false);
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
pz_CurrentStepNum = "18.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Map-DecisionTable",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_1_circum0 definition

/**
 * Clear referenced rules.
 * <p>
 * Step 19 <code>Java</code><br>
 */
public boolean step19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
myStepPage.remove("pxRuleReferences");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * Compile the generated Java if no errors.
 * <p>
 * Step 20 <code>Java</code><br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:Default).hasMessages(myStepPage)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("= Lib(Pega-RULES:Default).hasMessages(myStepPage)", "FUAInstance-NullMyStepPage");
}
boolean pz_40 = (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", "Pega-RULES", "Default", new Object[] { myStepPage })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:Default).hasMessages(myStepPage)",pz_40);
if (pz_40) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pxValidate - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("= Lib(Pega-RULES:Default).hasMessages(myStepPage) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
try {
	pega.checkJavaGeneration();
} catch (Throwable t) {
	tools.getPrimaryPage().addMessage("pyJavaGenerationFailed\t" + t.getMessage());
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

/**
 * Generate XML signature for parameters.
 * <p>
 * Step 21 <code>call XMLSignature_Generate</code><br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call XMLSignature_Generate");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call XMLSignature_Generate", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call XMLSignature_Generate
if (myStepPage == null) {
}
// Calling Activity : XMLSignature_Generate

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "XMLSignature_Generate", "Rule-Obj-Activity", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call XMLSignature_Generate",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * New Field Containing an XML Representation of the TaskStatuses set by this Activity.
 * <p>
 * Step 22 <code>call GenerateTaskStatusXML</code><br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call GenerateTaskStatusXML");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call GenerateTaskStatusXML", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call GenerateTaskStatusXML
if (myStepPage == null) {
}
// Calling Activity : GenerateTaskStatusXML

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "GenerateTaskStatusXML", "Rule-Obj-Activity", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call GenerateTaskStatusXML",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

/**
 * additional validation for Utility ones.
 * <p>
 * Step 23 <code>call ValidateUtility</code><br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call ValidateUtility");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pyActivityType, \"UTILITY\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("= Lib(Pega-RULES:String).equals(.pyActivityType, \"UTILITY\")", "FUAInstance-NullMyStepPage");
}
boolean pz_42 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_41.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "UTILITY" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pyActivityType, \"UTILITY\")",pz_42);
if (!pz_42) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("= Lib(Pega-RULES:String).equals(.pyActivityType, \"UTILITY\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call ValidateUtility", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call ValidateUtility
if (myStepPage == null) {
}
// Calling Activity : ValidateUtility

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "ValidateUtility", "Rule-Obj-Activity", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call ValidateUtility",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * Restrict methods for OnChanges and Triggers.
 * <p>
 * Step 24 <code>Java</code> [on page .pySteps] <br>
 */
public boolean step24_circum0_Embed_ActivitySteps() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "primary.pyActivityType==\"ONCHANGE\" || primary.pyActivityType==\"TRIGGER\"");
try {
boolean pz_44 = ((scalarValueQuery_41.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("ONCHANGE")) || (scalarValueQuery_41.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("TRIGGER")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "primary.pyActivityType==\"ONCHANGE\" || primary.pyActivityType==\"TRIGGER\"",pz_44);
if (!pz_44) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("primary.pyActivityType==\"ONCHANGE\" || primary.pyActivityType==\"TRIGGER\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage cpStepPage = tools.getStepPage();

String pyStepsBlockName = cpStepPage.getString(".pyStepsBlockName");
if (!pyStepsBlockName.startsWith("//")) {
	boolean isTrigger = tools.getPrimaryPage().getString("pyActivityType").equals("TRIGGER");
	
	boolean allowedWithOnChange = true;
	boolean allowedWithTrigger = true;
	ClipboardProperty methodNameProp = cpStepPage.getProperty("pyStepsActivityName");
	String methodNameKeepCase = methodNameProp.getStringValue();
	String methodName = methodNameKeepCase.toLowerCase();
	
	if (methodName.startsWith("call ") || methodName.startsWith("branch ")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("activity-end")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("activity-list-add")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("apply-parse-structured")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("assign-delete")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("assign-establishcontext")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("commit")) {
	} else if (methodName.equals("do-embedded-activity")) {
	} else if (methodName.equals("exit-activity")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("flow-end")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("flow-new")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("history-add")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("history-list")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("java")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("link-list")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("link-objects")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("obj-delete")) {
		if (isTrigger) {
			ClipboardProperty immediateProp = cpStepPage.getProperty(".pyStepsCallParams.Immediate");
			String immediate = immediateProp.getStringValue();
			if (immediate.equals("0") || immediate.equals("") || immediate.equals("false")) {
				allowedWithTrigger = true;
			} else {
				immediateProp.addMessage("pyMethodMayNotBeUsedInActivity\tTrigger\tImmediate\tunchecked");
			}
		}
	} else if (methodName.equals("obj-list")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("obj-open")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("obj-open-by-handle")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("obj-save")) {
		if (isTrigger) {
			ClipboardProperty writeNowProp = cpStepPage.getProperty(".pyStepsCallParams.WriteNow");
			String writeNow = writeNowProp.getStringValue();
			if (writeNow.equals("0") || writeNow.equals("") || writeNow.equals("false")) {
				allowedWithTrigger = true;
			} else {
				writeNowProp.addMessage("pyMethodMayNotBeUsedInActivity\tTrigger\tWriteNow\tunchecked");
			}
		}
	} else if (methodName.equals("obj-save-cancel")) { 
	} else if (methodName.equals("obj-set-tickets")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("obj-sort")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("obj-validate")) { 
		allowedWithTrigger = true;
	} else if (methodName.equals("page-change-class")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("page-clear-messages")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("page-copy")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("page-merge-into")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("page-new")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("page-remove")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("page-rename")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("page-set-messages")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("page-validate")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("parse-byte-pos")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("parse-char-pos")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("parse-fixed-binary")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("parse-packed-decimal")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("performance-data-clear")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("performance-data-get")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("privilege-check")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("property-map-decisiontree")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-map-value")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-map-valuepair")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-remove")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-set")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-set-corr")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-set-html")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-set-messages")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("property-set-special")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("property-set-xml")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("property-validate")) {
		if (!isTrigger) {
			String required = cpStepPage.getString(".pyStepsCallParams.Required");
			if (required.equals("0") || required.equals("") || required.equals("false")) {
				ClipboardProperty defaultValueProp = cpStepPage.getProperty(".pyStepsCallParams.Default");
				String defaultValue = defaultValueProp.getStringValue();
				if (defaultValue.length() == 0) {
					allowedWithOnChange = true;
				} else {
					defaultValueProp.addMessage("pyMethodMayNotBeUsedInActivity\tOnChange\tDefault\tleft blank");
				}
			}
		}
		allowedWithTrigger = true;
	} else if (methodName.equals("rdb-delete")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("rdb-list")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("rdb-open")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("rdb-save")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("requestor-stop")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("security-set")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("set-rulesets-update")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("show-applet")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("show-applet-data")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("show-html")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("stringbuffer-append")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("stringbuffer-insert")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("stringbuffer-reset")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	} else if (methodName.equals("taskstatus-set")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("thread-clear")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("thread-stop")) {
		allowedWithTrigger = true;
	} else if (methodName.equals("wait")) {
		allowedWithOnChange = true;
		allowedWithTrigger = true;
	}
	
	if (methodNameProp.getMessages().length() == 0) {
	    if (isTrigger) {
			if (!allowedWithTrigger) {
              methodNameProp.addMessage("pyActivityTypeCannotUseMethod\tTrigger\t"+methodNameProp.getStringValue());
			}
	    } else { // OnChange
			if (!allowedWithOnChange) {
              methodNameProp.addMessage("pyActivityTypeCannotUseMethod\tOnChange\t"+methodNameProp.getStringValue());
			}
	    } 
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0_Embed_ActivitySteps definition

/**
 * Throw error for duplicate labels in the activities created in 7.2 version.
 * <p>
 * Step 25 <code>Java</code><br>
 */
public boolean step25_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Sort).compareStrings(.pxCreatedInPRPCVersion, \"07-01-01\")&gt;=0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:Sort).compareStrings(.pxCreatedInPRPCVersion, \"07-01-01\")>=0", "FUAInstance-NullMyStepPage");
}
boolean pz_46 = ((pega.<Integer>resolveMethodCall("compareStrings--(String,String)", "compareStrings", "Pega-RULES", "Sort", new Object[] { scalarValueQuery_45.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "07-01-01" })).intValue() >= 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Sort).compareStrings(.pxCreatedInPRPCVersion, \"07-01-01\")&gt;=0",pz_46);
if (!pz_46) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Sort).compareStrings(.pxCreatedInPRPCVersion, \"07-01-01\")&gt;=0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
java.util.Iterator myPageList = null;
ClipboardProperty pySteps = myStepPage.getProperty(".pySteps");
myPageList = pySteps.iterator();
ParameterPage paramPage = tools.getParameterPage();
//setting array list that holds duplicate labels in param page
List dupLabelsList = new ArrayList();
Set dupLabelsSet = new HashSet();
paramPage.putObject("dupLabelsList",dupLabelsList);
paramPage.putObject("dupLabelsSet",dupLabelsSet);
//for every step in the activity
while (myPageList.hasNext()) {
	ClipboardProperty nextPage = (ClipboardProperty)myPageList.next();
	ClipboardPage pyStepsPage = nextPage.getPageValue();
	String strsteps = pyStepsPage.getString(".pyStepsBlockName");
	dupLabelsList = (java.util.ArrayList)tools.getParameterPage().getObject("dupLabelsList");
    dupLabelsSet = (java.util.HashSet)tools.getParameterPage().getObject("dupLabelsSet");	
	if(!strsteps.startsWith("//")){
		if(strsteps.trim().length() > 0 && !dupLabelsSet.add(strsteps))
			dupLabelsList.add(strsteps);
		com.pegarules.generated.pega_rulesengine_activity.pzCheckDuplicateLabelsinActivity(pyStepsPage,myStepPage);
	}
		            
}
//procure duplicate labels from the parameter page
dupLabelsList = (java.util.ArrayList)paramPage.getObject("dupLabelsList");
if(!(dupLabelsList.isEmpty()))
{
	myStepPage.addMessage("DuplicateSteplabel\t" + String.join(", ", dupLabelsList));
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
pz_CurrentStepNum = "25";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_circum0 definition

/**
 * End Validation.
 * <p>
 * Step 26 <code>End-Validate</code><br>
 */
public boolean step26_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "End-Validate");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("End-Validate", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  End-Validate
try {
	ClipboardPage primaryPage = tools.getPrimaryPage();
	if (primaryPage == null) {
		throw new PRRuntimeException("Cannot call End-Validate when there is no primary page");
	}
	tools.getDatabase().getRulesetContext(primaryPage).stopTrackingReferences();
	ClipboardPage propertiesToReturn = tools.findPage("pyReturnToClient", true);	if (propertiesToReturn != null) {		ClipboardProperty ruleReferences = primaryPage.getIfPresent("pxRuleReferences");		if (ruleReferences != null) {			propertiesToReturn.put(ruleReferences);		}		ClipboardProperty namedPageReferences = primaryPage.getIfPresent("pxNamedPageReferences");		if (namedPageReferences != null) {			propertiesToReturn.put(namedPageReferences);		}		ClipboardProperty apiMethodReferences = primaryPage.getIfPresent("pxAPIMethodReferences");		if (apiMethodReferences != null) {			propertiesToReturn.put(apiMethodReferences);		}		propertiesToReturn.putString("pzIndexCount", primaryPage.getString("pzIndexCount"));	}} catch (DatabaseException ex) {
	oLog.error("Error getting RuleSet context in End-Validate", ex);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "End-Validate",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_circum0 definition

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

public Object LocalTempPlaceHolder = null;
public Object ParamTempPlaceHolder = null;

public void initializeUserLocalVariables() {
	LocalTempPlaceHolder = null;
	ParamTempPlaceHolder = null;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("LocalTempPlaceHolder", (LocalTempPlaceHolder == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : LocalTempPlaceHolder.toString());
	smRetVal.putString("ParamTempPlaceHolder", (ParamTempPlaceHolder == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : ParamTempPlaceHolder.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_7 = new String[] { "", "", "pyAutomationPage", "", "pyParameters", "" };
public static final String[] pRef_36 = new String[] { "", "", "pyStepsCallParams", "", "ExecutionMode", "" };
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamValue").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_38 = FUAUtil.createQueryBuilder().page("pyStepsCallParams").scalarProperty("ExecutionMode").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_45 = FUAUtil.createQueryBuilder().scalarProperty("pxCreatedInPRPCVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyStepsActivityName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pyPagesAndClassesMode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().page("pyStepsCallParams").scalarProperty("ExecutionMode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_41 = FUAUtil.createQueryBuilder().scalarProperty("pyActivityType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PXVALIDATE #20200804T160632.313 GMT", "Rule-Obj-Activity pxValidate", "Pega-RulesEngine", "08-06-01", false, true, "", "ACTIVITY", "20200804T160632.313 GMT" ,"Rule-Obj-Activity"); }
