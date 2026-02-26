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
public class ra_action_pzcreateprototypedatatransform_3852d8b747c6babc65f781f9dba9a6d7 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzCreatePrototypeDataTransform.Rule_HTML_Section.Action");
	public ra_action_pzcreateprototypedatatransform_3852d8b747c6babc65f781f9dba9a6d7(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT";
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
String pz_5 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_5, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CheckDTChain"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 2 Circum: 0" );
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
ClipboardProperty pz_11 = pega.findPageWithException("pyDefaultPage", "Rule-Obj-Model").getIfPresent("pyProperties");
pageRef = pz_11;
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
if ( "Embed-ModelParams".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-ModelParams").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0_Embed_ModelParams();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
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

// Code to call step 4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_16 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_16, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_16, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Recreate"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 6 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_20 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_20, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 7 Circum: 0" );
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
String pz_22 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_22, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_22, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 8 Circum: 0" );
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
String pz_24 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_24, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 9 Circum: 0" );
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
String pz_49 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_49, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_49, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 10 Circum: 0" );
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
ClipboardProperty pz_55 = propertyQuery_2.resolve(tools, pega.findPageWithException("pyDefaultPage", "Rule-Obj-Model"));
thisStepPage = pz_55 == null ? null : pz_55.getPageValue();
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("MakeSetDefaults"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_58 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_58, true);
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Clear"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CreateNew"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_61 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_61, true);
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 14 Circum: 0" );
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
String pz_63 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_63, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_63, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 15 Circum: 0" );
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
String pz_64 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_64, true);
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 16 Circum: 0" );
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
String pz_77 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_77, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_77, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 18_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("AddTo"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_78 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_78, true);
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 18 Circum: 0" );
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
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyEmbeddedFields", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_80 = pzPrimPage.getIfPresent("pyEmbeddedFields");
pageRef = pz_80;
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
pz_CurrentStepNum = "19.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_0_circum0");
}
PRStackFrame pz_StackFrame19_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 19_0 Circum: 0" );
try {
pz_Status = step19_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
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
String pz_87 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_87, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_87, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 20 Circum: 0" );
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
String pz_94 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_94, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_94, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 21 Circum: 0" );
try {
pz_Status = step21_circum0();
} finally {
pega.popStackFrame(pz_StackFrame21_circum0, false);
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
String pz_99 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_99, true);
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 23 Circum: 0" );
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
String pz_108 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_108, true);
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 24 Circum: 0" );
try {
pz_Status = step24_circum0();
} finally {
pega.popStackFrame(pz_StackFrame24_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 25_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SErr"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_115 = "pySetFieldDefaultsPage";
thisStepPage = tools.findPage(pz_115, true);
PRStackFrame pz_StackFrame25_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 25 Circum: 0" );
try {
pz_Status = step25_circum0();
} finally {
pega.popStackFrame(pz_StackFrame25_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 26_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DErr"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "26";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 26_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_116 = "pyDefaultPage";
thisStepPage = tools.findPage(pz_116, true);
PRStackFrame pz_StackFrame26_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 26 Circum: 0" );
try {
pz_Status = step26_circum0();
} finally {
pega.popStackFrame(pz_StackFrame26_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 27_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("END"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "27";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 27_circum0");
}
PRStackFrame pz_StackFrame27_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 27 Circum: 0" );
try {
pz_Status = step27_circum0();
} finally {
pega.popStackFrame(pz_StackFrame27_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 28_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "28";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 28_circum0");
}
PRStackFrame pz_StackFrame28_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 28 Circum: 0" );
try {
pz_Status = step28_circum0();
} finally {
pega.popStackFrame(pz_StackFrame28_circum0, false);
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
	"Rule-Obj-Activity:PZCREATEPROTOTYPEDATATRANSFORM"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCREATEPROTOTYPEDATATRANSFORM","Rule-Obj-Activity","RULE-HTML-SECTION",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT","!PZCREATEPROTOTYPEDATATRANSFORM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1733230025)
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
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT:20180724T191835.293 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "0bce3a7878b007b4fadc24122e0acead";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-HTML-Section";
	}
public String getAspect() {
return "Action";
}
/**
 * Check that pyDefault was already created.
 * <p>
 * Step 1 <code>Obj-Open</code> [on page pyDefaultPage] <br>
 */
public boolean step1_circum0() {
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
String pz_6 = "pyDefaultPage";
myStepPage = tools.findPage(pz_6, true);
// Expression: 
// Expression: Rule-Obj-Model
myStepPage = tools.getThread().createPage("Rule-Obj-Model", pz_6);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, tools.getParamValue("ClassName"), "siN", false, false);
}
{
    pega.setViaPropRef(".pyModelName", pRef_8, myStepPage, "pyDefault", "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "pyDefaultPage", "", false, false);
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
boolean pz__1 = pega.invokeWhen("StepStatusGood", "Rule-HTML-Section", "Rule-Obj-Model");
if (!pz__1) {
// branch to block Recreate
nextBlock = "Recreate";
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyClassName==param.ClassName");
try {
boolean pz_10 = (scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(tools.getParamValue("ClassName")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyClassName==param.ClassName",pz_10);
if (pz_10) {
// branch to block CheckDTChain
nextBlock = "CheckDTChain";
return false;
} else {
// branch to block Recreate
nextBlock = "Recreate";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyClassName==param.ClassName " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step1_circum0 definition

/**
 * default our flag to false.
 * <p>
 * Step 2 [CheckDTChain] <code>Property-Set</code><br>
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
{
    applyDTFound = false;
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
 * make sure it still calls pySetFieldDefaults.
 * <p>
 * Step 3 <code>Property-Set</code> [on page pyDefaultPage.pyProperties] <br>
 */
public boolean step3_circum0_Embed_ModelParams() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyActionName==\"APPLY_MODEL\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyActionName==\"APPLY_MODEL\"", "FUAInstance-NullMyStepPage");
}
boolean pz_13 = (scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("APPLY_MODEL"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyActionName==\"APPLY_MODEL\"",pz_13);
if (!pz_13) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyActionName==\"APPLY_MODEL\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyPropertiesName==\"pySetFieldDefaults\"");
try {
boolean pz_15 = (scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pySetFieldDefaults"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyPropertiesName==\"pySetFieldDefaults\"",pz_15);
if (!pz_15) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyPropertiesName==\"pySetFieldDefaults\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    applyDTFound = true;
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
} // end of step3_circum0_Embed_ModelParams definition

/**
 * add it the call to pySetFieldDefaults if it was removed.
 * <p>
 * Step 4 <code>Property-Set</code> [on page pyDefaultPage] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.applyDTFound==false");
try {
boolean pz_17 = (applyDTFound == false);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.applyDTFound==false",pz_17);
if (!pz_17) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.applyDTFound==false " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyProperties(<append>).pyActionName", pRef_18, myStepPage, "APPLY_MODEL", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProperties(<last>).pyPropertiesName", pRef_19, myStepPage, "pySetFieldDefaults", "sTN", false, true);
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
 * Jump to recreation of pySetFieldDefaults.
 * <p>
 * Step 5 <code>Java</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__3 = pega.invokeWhen("Always", "Rule-HTML-Section", "Rule-HTML-Section");
if (pz__3) {
// branch to block MakeSetDefaults
nextBlock = "MakeSetDefaults";
pega.activityStepSkipped("Jump To Step");
return false;
} else {
// branch to block MakeSetDefaults
nextBlock = "MakeSetDefaults";
pega.activityStepSkipped("Jump To Step");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
// all preconditions return, the method body is unreachable
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step5_circum0 definition

/**
 * clear activity error on failed obj-open.
 * <p>
 * Step 6 [Recreate] <code>Activity-Clear-Status</code><br>
 */
public boolean step6_circum0() {
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
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * copy our sample to remake pyDefault.
 * <p>
 * Step 7 <code>Obj-Open</code> [on page pyDefaultPage] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_21 = "pyDefaultPage";
myStepPage = tools.findPage(pz_21, true);
// Expression: 
// Expression: Rule-Obj-Model
myStepPage = tools.getThread().createPage("Rule-Obj-Model", pz_21);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, "Work-", "siN", false, false);
}
{
    pega.setViaPropRef(".pyModelName", pRef_8, myStepPage, "pzSampleDataTransform", "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "pyDefaultPage", "", false, false);
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
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Clear memo.
 * <p>
 * Step 8 <code>Property-Set</code> [on page pyDefaultPage] <br>
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
    pega.setViaPropRef(".pyMemo", pRef_23, myStepPage, "Automatically generated by DCO", "sTN", false, true);
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
 * Remove the properties not required from sample.
 * <p>
 * Step 9 <code>Property-Remove</code> [on page pyDefaultPage] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxCreateDateTime
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCreateDateTime", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_26 = propertyQuery_25.resolve(tools, myStepPage);
try {if (pz_26!= null) {
pz_26.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxCreateOpName
ClipboardProperty pz_28 = propertyQuery_27.resolve(tools, myStepPage);
try {if (pz_28!= null) {
pz_28.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxCreateOperator
ClipboardProperty pz_30 = propertyQuery_29.resolve(tools, myStepPage);
try {if (pz_30!= null) {
pz_30.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInsName
ClipboardProperty pz_32 = propertyQuery_31.resolve(tools, myStepPage);
try {if (pz_32!= null) {
pz_32.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pzInsKey
ClipboardProperty pz_34 = propertyQuery_33.resolve(tools, myStepPage);
try {if (pz_34!= null) {
pz_34.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pyRuleSet
ClipboardProperty pz_36 = propertyQuery_35.resolve(tools, myStepPage);
try {if (pz_36!= null) {
pz_36.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInsId
ClipboardProperty pz_38 = propertyQuery_37.resolve(tools, myStepPage);
try {if (pz_38!= null) {
pz_38.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedRuleSet
ClipboardProperty pz_40 = propertyQuery_39.resolve(tools, myStepPage);
try {if (pz_40!= null) {
pz_40.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedRuleSetVersion
ClipboardProperty pz_42 = propertyQuery_41.resolve(tools, myStepPage);
try {if (pz_42!= null) {
pz_42.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedCreateDateTime
ClipboardProperty pz_44 = propertyQuery_43.resolve(tools, myStepPage);
try {if (pz_44!= null) {
pz_44.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedKey
ClipboardProperty pz_46 = propertyQuery_45.resolve(tools, myStepPage);
try {if (pz_46!= null) {
pz_46.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pyRuleName
ClipboardProperty pz_48 = propertyQuery_47.resolve(tools, myStepPage);
try {if (pz_48!= null) {
pz_48.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 9.";
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
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Set the properties required for keys.
 * <p>
 * Step 10 <code>Property-Set</code> [on page pyDefaultPage] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyModelName", pRef_8, myStepPage, "pyDefault", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, tools.getParamValue("ClassName"), "siN", false, true);
}
{
    pega.setViaPropRef(".pyRuleSetName", pRef_50, myStepPage, tools.getParamValue("RuleSet"), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyRuleSetVersion", pRef_51, myStepPage, tools.getParamValue("RuleSetVersion"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyLabel", pRef_52, myStepPage, "pyDefault", "sTN64", false, true);
}
{
    pega.setViaPropRef(".pyRuleSet", pRef_53, myStepPage, tools.getParamValue("RuleSet"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRuleAvailable", pRef_54, myStepPage, "Yes", "siN", false, true);
}
{
    CreatingNewDT = true;
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
 * push in the apply-dt call.
 * <p>
 * Step 11 <code>Property-Set</code> [on page pyDefaultPage.pyProperties(1)] <br>
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
    pega.setViaPropRef(".pyActionName", pRef_56, myStepPage, "APPLY_MODEL", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPropertiesName", pRef_57, myStepPage, "pySetFieldDefaults", "sTN", false, true);
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
 * see if there is one already to clean up.
 * <p>
 * Step 12 [MakeSetDefaults] <code>Obj-Open</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step12_circum0() {
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
String pz_59 = "pySetFieldDefaultsPage";
myStepPage = tools.findPage(pz_59, true);
// Expression: 
// Expression: Rule-Obj-Model
myStepPage = tools.getThread().createPage("Rule-Obj-Model", pz_59);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, tools.getParamValue("ClassName"), "siN", false, false);
}
{
    pega.setViaPropRef(".pyModelName", pRef_8, myStepPage, "pySetFieldDefaults", "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "pySetFieldDefaultsPage", "", false, false);
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
boolean pz__5 = pega.invokeWhen("StepStatusGood", "Rule-HTML-Section", "Rule-Obj-Model");
if (!pz__5) {
// branch to block Clear
nextBlock = "Clear";
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyClassName==param.ClassName");
try {
boolean pz_60 = (scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(tools.getParamValue("ClassName")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyClassName==param.ClassName",pz_60);
if (pz_60) {
// branch to block AddTo
nextBlock = "AddTo";
return false;
} else {
// branch to block CreateNew
nextBlock = "CreateNew";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyClassName==param.ClassName " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step12_circum0 definition

/**
 * clear fail status if needed.
 * <p>
 * Step 13 [Clear] <code>Activity-Clear-Status</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__7 = pega.invokeWhen("StepStatusGood", "Rule-HTML-Section", "Rule-HTML-Section");
if (pz__7) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * create the new DT.
 * <p>
 * Step 14 [CreateNew] <code>Obj-Open</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_62 = "pySetFieldDefaultsPage";
myStepPage = tools.findPage(pz_62, true);
// Expression: 
// Expression: Rule-Obj-Model
myStepPage = tools.getThread().createPage("Rule-Obj-Model", pz_62);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, "Work-", "siN", false, false);
}
{
    pega.setViaPropRef(".pyModelName", pRef_8, myStepPage, "pySetFieldDefaultsSample", "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "pySetFieldDefaultsPage", "", false, false);
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Clear memo.
 * <p>
 * Step 15 <code>Property-Set</code> [on page pySetFieldDefaultsPage] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyMemo", pRef_23, myStepPage, "Automatically generated by DCO", "sTN", false, true);
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
 * Remove the properties not required from sample.
 * <p>
 * Step 16 <code>Property-Remove</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxCreateDateTime
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCreateDateTime", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_65 = propertyQuery_25.resolve(tools, myStepPage);
try {if (pz_65!= null) {
pz_65.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxCreateOpName
ClipboardProperty pz_66 = propertyQuery_27.resolve(tools, myStepPage);
try {if (pz_66!= null) {
pz_66.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxCreateOperator
ClipboardProperty pz_67 = propertyQuery_29.resolve(tools, myStepPage);
try {if (pz_67!= null) {
pz_67.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInsName
ClipboardProperty pz_68 = propertyQuery_31.resolve(tools, myStepPage);
try {if (pz_68!= null) {
pz_68.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pzInsKey
ClipboardProperty pz_69 = propertyQuery_33.resolve(tools, myStepPage);
try {if (pz_69!= null) {
pz_69.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pyRuleSet
ClipboardProperty pz_70 = propertyQuery_35.resolve(tools, myStepPage);
try {if (pz_70!= null) {
pz_70.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInsId
ClipboardProperty pz_71 = propertyQuery_37.resolve(tools, myStepPage);
try {if (pz_71!= null) {
pz_71.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedRuleSet
ClipboardProperty pz_72 = propertyQuery_39.resolve(tools, myStepPage);
try {if (pz_72!= null) {
pz_72.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedRuleSetVersion
ClipboardProperty pz_73 = propertyQuery_41.resolve(tools, myStepPage);
try {if (pz_73!= null) {
pz_73.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedCreateDateTime
ClipboardProperty pz_74 = propertyQuery_43.resolve(tools, myStepPage);
try {if (pz_74!= null) {
pz_74.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pxInstanceLockedKey
ClipboardProperty pz_75 = propertyQuery_45.resolve(tools, myStepPage);
try {if (pz_75!= null) {
pz_75.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: .pyRuleName
ClipboardProperty pz_76 = propertyQuery_47.resolve(tools, myStepPage);
try {if (pz_76!= null) {
pz_76.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 16.";
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
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Set the properties required for keys.
 * <p>
 * Step 17 <code>Property-Set</code> [on page pySetFieldDefaultsPage] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, tools.getParamValue("ClassName"), "siN", false, true);
}
{
    pega.setViaPropRef(".pyRuleSetName", pRef_50, myStepPage, tools.getParamValue("RuleSet"), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyRuleSetVersion", pRef_51, myStepPage, tools.getParamValue("RuleSetVersion"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRuleSet", pRef_53, myStepPage, tools.getParamValue("RuleSet"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRuleAvailable", pRef_54, myStepPage, "Yes", "siN", false, true);
}
{
    CreatingNewDT = true;
}
{
    pega.setViaPropRef(".pyModelName", pRef_8, myStepPage, "pySetFieldDefaults", "sTN", false, true);
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
 * Remove any page/list property from the data transform that fails validate.
 * <p>
 * Step 18 [AddTo] <code>Call pzRemoveInvalidStepsFromDT</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzRemoveInvalidStepsFromDT");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzRemoveInvalidStepsFromDT", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzRemoveInvalidStepsFromDT
if (myStepPage == null) {
String pz_79 = "pySetFieldDefaultsPage";
myStepPage = tools.findPage(pz_79, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_79, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
}
// Calling Activity : pzRemoveInvalidStepsFromDT
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzRemoveInvalidStepsFromDT", "Rule-HTML-Section", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzRemoveInvalidStepsFromDT",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * For each page / list,.
 * <p>
 * Step 19.0 <code>Property-Set</code> [on page .pyEmbeddedFields] <br>
 */
public boolean step19_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__9 = pega.invokeWhen("pzIsPageOrPageList", "Rule-HTML-Section", "Embed-Fields");
if (!pz__9) {
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
    tools.putParamValue("pySetFieldDefaultsPage", PropertyInfo.TYPE_TEXT, "pySetFieldDefaultsPage");
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("pyPropertyName", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_81.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) ? (scalarValueQuery_82.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + ".") : "") + scalarValueQuery_83.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
}
{
    tools.putParamValue("pyPropertyMode", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_84.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Page List")) ? "PageList" : "Page"));
}
{
    tools.putParamValue("pyAutoPopulate", PropertyInfo.TYPE_TEXT, scalarValueQuery_85.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE));
}
{
    tools.putParamValue("pyDataClass", PropertyInfo.TYPE_TEXT, scalarValueQuery_86.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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

// Code to call nested step 19_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_1_circum0");
}
PRStackFrame pz_StackFrame19_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT Step: 19_1 Circum: 0" );
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_0_circum0 definition

/**
 * Append entry for current embedded field.
 * <p>
 * Step 19.1 <code>Call pzAppendNewStepsToDT</code><br>
 */
public boolean step19_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAppendNewStepsToDT");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAppendNewStepsToDT", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAppendNewStepsToDT
if (myStepPage == null) {
}
// Calling Activity : pzAppendNewStepsToDT
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzAppendNewStepsToDT", "Rule-HTML-Section", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAppendNewStepsToDT",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_1_circum0 definition

/**
 * For new DTS, change the first empty row to a comment with a label.
 * <p>
 * Step 20 <code>Property-Set</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.CreatingNewDT");
try {
boolean pz_88 = CreatingNewDT;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.CreatingNewDT",pz_88);
if (!pz_88) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.CreatingNewDT " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyProperties(1).pyExpanded", pRef_89, myStepPage, "true", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pyActionName", pRef_90, myStepPage, "COMMENT", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pyPropertiesName", pRef_91, myStepPage, (("Automatically generated by the system for populating data during " + pega.<String>resolveMethodCall("whatComesAfterLast--(String,char)", "whatComesAfterLast", null, null, new Object[] { scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), '-' })) + " processing."), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pxObjClass", pRef_92, myStepPage, "Embed-ModelParams", "sIY", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pyPropertiesValue", pRef_93, myStepPage, "", "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

/**
 * If for some reason the data transform doesn't have a comment as it's first step, then add one in.
 * <p>
 * Step 21 <code>Property-Set</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).LengthOfPageList(.pyProperties) &gt; 0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:Utilities).LengthOfPageList(.pyProperties) > 0", "FUAInstance-NullMyStepPage");
}
boolean pz_95 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", "Pega-RULES", "Utilities", new Object[] { myStepPage.getProperty("pyProperties") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).LengthOfPageList(.pyProperties) &gt; 0",pz_95);
if (!pz_95) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Utilities).LengthOfPageList(.pyProperties) &gt; 0 " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyProperties(1).pyActionName!=\"COMMENT\"");
try {
boolean pz_97 = (!(scalarValueQuery_96.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("COMMENT")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProperties(1).pyActionName!=\"COMMENT\"",pz_97);
if (!pz_97) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyProperties(1).pyActionName!=\"COMMENT\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyProperties(<insert>1).pyExpanded", pRef_98, myStepPage, true, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pyActionName", pRef_90, myStepPage, "COMMENT", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pyPropertiesName", pRef_91, myStepPage, (("Automatically generated by the system for populating data during " + pega.<String>resolveMethodCall("whatComesAfterLast--(String,char)", "whatComesAfterLast", null, null, new Object[] { scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), '-' })) + " processing."), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pxObjClass", pRef_92, myStepPage, "Embed-ModelParams", "sIY", false, true);
}
{
    pega.setViaPropRef(".pyProperties(1).pyPropertiesValue", pRef_93, myStepPage, "", "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * == pySetFieldDefaults.
 * <p>
 * Step 23 <code>Call pxUpdateRecord</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxUpdateRecord");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxUpdateRecord", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxUpdateRecord
if (myStepPage == null) {
String pz_100 = "pySetFieldDefaultsPage";
myStepPage = tools.findPage(pz_100, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_100, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
}
// Calling Activity : pxUpdateRecord

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: false
String pz_101 = String.valueOf(false);
newParamsPage.putParamValue("MarkAsRelevantRecord", PropertyInfo.TYPE_TRUEFALSE, pz_101);
// Expression: .pyRuleSet
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleSet", "FUAInstance-NullMyStepPage");
}
newParamsPage.putParamValue("RuleSetName", PropertyInfo.TYPE_TEXT, scalarValueQuery_102.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
// Expression: false
String pz_103 = String.valueOf(false);
newParamsPage.putParamValue("LeaveCheckedOut", PropertyInfo.TYPE_TRUEFALSE, pz_103);
// Expression: false
String pz_104 = String.valueOf(false);
newParamsPage.putParamValue("BypassBestRuleset", PropertyInfo.TYPE_TRUEFALSE, pz_104);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: false
String pz_105 = String.valueOf(false);
newParamsPage.putParamValue("Commit", PropertyInfo.TYPE_TRUEFALSE, pz_105);
// Expression: false
String pz_106 = String.valueOf(false);
newParamsPage.putParamValue("UpdateOnly", PropertyInfo.TYPE_TRUEFALSE, pz_106);
// Expression: .pyRuleSetVersion
newParamsPage.putParamValue("RuleSetVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_107.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pxUpdateRecord", "Rule-HTML-Section", "");
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
nextBlock = "SErr";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "SErr";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__11 = pega.invokeWhen("StepStatusFail", "Rule-HTML-Section", "Rule-Obj-Model");
if (pz__11) {
// branch to block SErr
nextBlock = "SErr";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "23";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxUpdateRecord",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * == pyDefault.
 * <p>
 * Step 24 <code>Call pxUpdateRecord</code> [on page pyDefaultPage] <br>
 */
public boolean step24_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxUpdateRecord");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxUpdateRecord", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxUpdateRecord
if (myStepPage == null) {
String pz_109 = "pyDefaultPage";
myStepPage = tools.findPage(pz_109, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_109, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
}
// Calling Activity : pxUpdateRecord

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: .pyRuleSet
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleSet", "FUAInstance-NullMyStepPage");
}
newParamsPage.putParamValue("RuleSetName", PropertyInfo.TYPE_TEXT, scalarValueQuery_102.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
// Expression: true
String pz_110 = String.valueOf(true);
newParamsPage.putParamValue("Commit", PropertyInfo.TYPE_TRUEFALSE, pz_110);
// Expression: .pyRuleSetVersion
newParamsPage.putParamValue("RuleSetVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_107.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
// Expression: false
String pz_111 = String.valueOf(false);
newParamsPage.putParamValue("LeaveCheckedOut", PropertyInfo.TYPE_TRUEFALSE, pz_111);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: false
String pz_112 = String.valueOf(false);
newParamsPage.putParamValue("BypassBestRuleset", PropertyInfo.TYPE_TRUEFALSE, pz_112);
// Expression: false
String pz_113 = String.valueOf(false);
newParamsPage.putParamValue("MarkAsRelevantRecord", PropertyInfo.TYPE_TRUEFALSE, pz_113);
// Expression: false
String pz_114 = String.valueOf(false);
newParamsPage.putParamValue("UpdateOnly", PropertyInfo.TYPE_TRUEFALSE, pz_114);

pega.invokeActivity(myStepPage, newParamsPage, "pxUpdateRecord", "Rule-HTML-Section", "");
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
nextBlock = "DErr";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "DErr";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__13 = pega.invokeWhen("StepStatusFail", "Rule-HTML-Section", "Rule-Obj-Model");
if (pz__13) {
// branch to block DErr
nextBlock = "DErr";
return false;
} else {
// branch to block END
nextBlock = "END";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "24";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxUpdateRecord",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step24_circum0 definition

/**
 * Copy messages to primary (section) page.
 * <p>
 * Step 25 [SErr] <code>Java</code> [on page pySetFieldDefaultsPage] <br>
 */
public boolean step25_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
tools.getPrimaryPage().addMessage(myStepPage.getMessagesAll());
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
boolean pz__15 = true;
if (pz__15) {
// branch to block END
nextBlock = "END";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "25";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_circum0 definition

/**
 * Copy messages to primary (section) page.
 * <p>
 * Step 26 [DErr] <code>Java</code> [on page pyDefaultPage] <br>
 */
public boolean step26_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
tools.getPrimaryPage().addMessage(myStepPage.getMessagesAll());
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_circum0 definition

/**
 * Remove pages.
 * <p>
 * Step 27 [END] <code>Page-Remove</code><br>
 */
public boolean step27_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: pySetFieldDefaultsPage
pageRemove(tools.findPage("pySetFieldDefaultsPage"));
// Expression: pyDefaultPage
pageRemove(tools.findPage("pyDefaultPage"));
// Expression: pyEmbedPropertiesForClassPage
pageRemove(tools.findPage("pyEmbedPropertiesForClassPage"));
// Expression: pyPropertiesForClassPage
pageRemove(tools.findPage("pyPropertiesForClassPage"));
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_circum0 definition

/**
 * Step 28 <code>Exit-Activity</code><br>
 */
public boolean step28_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Exit-Activity");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Exit-Activity", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Exit-Activity
nextBlock = "***";
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pz_CurrentStepNum = "28";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Exit-Activity",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_circum0 definition

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

public boolean CreatingNewDT = false;
public boolean applyDTFound = false;

public void initializeUserLocalVariables() {
	CreatingNewDT = false;
	applyDTFound = false;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("CreatingNewDT", Boolean.toString(CreatingNewDT));
	smRetVal.putString("applyDTFound", Boolean.toString(applyDTFound));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_7 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_57 = new String[] { "", "", "pyPropertiesName", "" };
public static final String[] pRef_98 = new String[] { "", "", "pyProperties", "<insert>1", "pyExpanded", "" };
public static final String[] pRef_91 = new String[] { "", "", "pyProperties", "1", "pyPropertiesName", "" };
public static final String[] pRef_92 = new String[] { "", "", "pyProperties", "1", "pxObjClass", "" };
public static final String[] pRef_53 = new String[] { "", "", "pyRuleSet", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyModelName", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyMemo", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyRuleSetName", "" };
public static final String[] pRef_54 = new String[] { "", "", "pyRuleAvailable", "" };
public static final String[] pRef_56 = new String[] { "", "", "pyActionName", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyProperties", "<last>", "pyPropertiesName", "" };
public static final String[] pRef_90 = new String[] { "", "", "pyProperties", "1", "pyActionName", "" };
public static final String[] pRef_51 = new String[] { "", "", "pyRuleSetVersion", "" };
public static final String[] pRef_52 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyProperties", "<append>", "pyActionName", "" };
public static final String[] pRef_93 = new String[] { "", "", "pyProperties", "1", "pyPropertiesValue", "" };
public static final String[] pRef_89 = new String[] { "", "", "pyProperties", "1", "pyExpanded", "" };
private static final PropertyQuery propertyQuery_47 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_96 = FUAUtil.createQueryBuilder().pageList("pyProperties", 1).scalarProperty("pyActionName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceLockedCreateDateTime").ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateOperator").ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_39 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceLockedRuleSet").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_82 = FUAUtil.createQueryBuilder().scalarProperty("pyEmbeddedPropertyReference").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_45 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceLockedKey").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_102 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_2 = FUAUtil.createQueryBuilder().pageList("pyProperties", 1).buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_83 = FUAUtil.createQueryBuilder().scalarProperty("pyPropertyName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_25 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateDateTime").ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_37 = FUAUtil.createQueryBuilder().scalarProperty("pxInsId").ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pxInsName").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_81 = FUAUtil.createQueryBuilder().scalarProperty("pyIsEmbeddedProperty").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateOpName").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_84 = FUAUtil.createQueryBuilder().scalarProperty("pyStringType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_107 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_85 = FUAUtil.createQueryBuilder().scalarProperty("pyAutoPopulate").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_41 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceLockedRuleSetVersion").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_86 = FUAUtil.createQueryBuilder().scalarProperty("pyDataClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyActionName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyPropertiesName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZCREATEPROTOTYPEDATATRANSFORM #20180713T141106.060 GMT", "Rule-HTML-Section pzCreatePrototypeDataTransform", "Pega-ProcessArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180724T191835.293 GMT" ,"Rule-Obj-Activity"); }
