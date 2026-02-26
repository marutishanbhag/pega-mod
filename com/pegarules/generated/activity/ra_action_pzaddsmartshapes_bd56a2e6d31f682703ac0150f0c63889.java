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
public class ra_action_pzaddsmartshapes_bd56a2e6d31f682703ac0150f0c63889 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzAddSmartShapes.Rule_Obj_Activity.Action");
	public ra_action_pzaddsmartshapes_bd56a2e6d31f682703ac0150f0c63889(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT";
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
thisStepPage = tools.findPage(tools.getParamValue("ElementsPage"), true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_2 = pega.findPage(tools.getParamValue("ElementsPage"), "Embed-Rule-Navigation-Element").getIfPresent("pyElements");
pageRef = pz_2;
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
if ( "Embed-Rule-Navigation-Element".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-Rule-Navigation-Element").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_0_circum0");
}
PRStackFrame pz_StackFrame2_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_0 Circum: 0" );
try {
pz_Status = step2_0_circum0_Embed_Rule_Navigation_Element();
} finally {
pega.popStackFrame(pz_StackFrame2_0_circum0, false);
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
	"Rule-Obj-Activity:PZADDSMARTSHAPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZADDSMARTSHAPES","Rule-Obj-Activity","RULE-OBJ-ACTIVITY",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT","!PZADDSMARTSHAPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1567095619)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT:20230618T001756.493 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "751c485483866611b7543df083387922";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Activity";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Java</code> [on page ElementsPage] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_ElementsPage = tools.findPage(tools.getParamValue("ElementsPage"));
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Iterate each element and run appropriate conditions to check if the element is a smart shape.
 * <p>
 * Step 2.0 <code>Java</code> [on page ElementsPage.pyElements] <br>
 */
public boolean step2_0_circum0_Embed_Rule_Navigation_Element() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_ElementsPage = tools.findPage(tools.getParamValue("ElementsPage"));
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

// Code to call nested step 2_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_1_circum0");
}
PRStackFrame pz_StackFrame2_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Wait"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_2_circum0");
}
PRStackFrame pz_StackFrame2_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_3_circum0");
}
PRStackFrame pz_StackFrame2_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Duplicate"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_4_circum0");
}
PRStackFrame pz_StackFrame2_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SmartShape"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_circum0");
}
PRStackFrame pz_StackFrame2_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_6_circum0");
}
PRStackFrame pz_StackFrame2_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_7_circum0");
}
PRStackFrame pz_StackFrame2_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_8_circum0");
}
PRStackFrame pz_StackFrame2_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_9_circum0");
}
PRStackFrame pz_StackFrame2_9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_10_circum0");
}
PRStackFrame pz_StackFrame2_10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_11_circum0");
}
String pz_3 = "CategoryItems";
nestedStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame2_11_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Iterate"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_12_circum0");
}
PRStackFrame pz_StackFrame2_12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_13_circum0");
}
PRStackFrame pz_StackFrame2_13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT Step: 2_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_13_circum0, false);
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
pz_CurrentStepNum = "2.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_0_circum0_Embed_Rule_Navigation_Element definition

/**
 * pyExecute.pyCustom.pyParameters(1) should exist for a Wait Shape.
 * <p>
 * Step 2.1 <code>Property-Set</code><br>
 */
public boolean step2_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute\")");
try {
boolean pz_4 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, "Default", new Object[] { ".pyExecute" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute\")",pz_4);
if (!pz_4) {
// branch to block Iterate
nextBlock = "Iterate";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Default.PropertyExists(\".pyExecute\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute.pyCustom\")");
try {
boolean pz_5 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, "Default", new Object[] { ".pyExecute.pyCustom" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute.pyCustom\")",pz_5);
if (!pz_5) {
// branch to block Iterate
nextBlock = "Iterate";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Default.PropertyExists(\".pyExecute.pyCustom\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute.pyCustom.pyParameters(1)\")");
try {
boolean pz_6 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, "Default", new Object[] { ".pyExecute.pyCustom.pyParameters(1)" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute.pyCustom.pyParameters(1)\")",pz_6);
if (!pz_6) {
// branch to block Iterate
nextBlock = "Iterate";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Default.PropertyExists(\".pyExecute.pyCustom.pyParameters(1)\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue == \"Wait\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyExecute.pyCustom.pyParameters(1).pyValue == \"Wait\"", "FUAInstance-NullMyStepPage");
}
boolean pz_9 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Wait"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue == \"Wait\"",pz_9);
if (pz_9) {
// branch to block Wait
nextBlock = "Wait";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyCustom.pyParameters(1).pyValue == \"Wait\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(2).pyValue == \"pyDuplicateSearchCases\"");
try {
boolean pz_12 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyDuplicateSearchCases"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(2).pyValue == \"pyDuplicateSearchCases\"",pz_12);
if (pz_12) {
// branch to block Duplicate
nextBlock = "Duplicate";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyCustom.pyParameters(2).pyValue == \"pyDuplicateSearchCases\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute.pyCustom.pyParameters(2)\")");
try {
boolean pz_13 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, "Default", new Object[] { ".pyExecute.pyCustom.pyParameters(2)" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyExecute.pyCustom.pyParameters(2)\")",pz_13);
if (pz_13) {
// branch to block SmartShape
nextBlock = "SmartShape";
pega.activityStepSkipped("Jump To Step");
return false;
} else {
// branch to block Iterate
nextBlock = "Iterate";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Default.PropertyExists(\".pyExecute.pyCustom.pyParameters(2)\") " + anyException.getMessage(), anyException);
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
}	// end try block for step body
} finally {
pz_CurrentStepNum = "2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step2_1_circum0 definition

/**
 * Checking for the Search Condition and Setting Values.
 * <p>
 * Step 2.2 [Wait] <code>Property-Set</code><br>
 */
public boolean step2_2_circum0() {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    shapeUpperCase = pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, "String", new Object[] { scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) });
}
{
    searchStringUpperCase = pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, "String", new Object[] { tools.getParamValue("searchString") });
}
{
    matchFound = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, "String", new Object[] { shapeUpperCase, searchStringUpperCase })).booleanValue();
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.matchFound");
try {
boolean pz_15 = matchFound;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.matchFound",pz_15);
if (!pz_15) {
// branch to block Iterate
nextBlock = "Iterate";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.matchFound " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_2_circum0 definition

/**
 * 'Advanced shapes -> Wait shape specific property sets go in this step.
 * <p>
 * Step 2.3 <code>Property-Set</code><br>
 */
public boolean step2_3_circum0() {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_16, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_17, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_19, pega.findPageWithException("CategoryItems", (String) null), "Data-MO-Activity-Assignment-Wait", "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_20, pega.findPageWithException("CategoryItems", (String) null), tools.getParamValue("appliesTo"), "s?N", false, true);
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
// branch to block Iterate
nextBlock = "Iterate";
return false;
} else {
// branch to block Iterate
nextBlock = "Iterate";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step2_3_circum0 definition

/**
 * 'Smart shapes -> Sub process' specific property sets go in this step.
 * <p>
 * Step 2.4 [Duplicate] <code>Property-Set</code><br>
 */
public boolean step2_4_circum0() {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_16, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_17, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_20, pega.findPageWithException("CategoryItems", (String) null), tools.getParamValue("appliesTo"), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_19, pega.findPageWithException("CategoryItems", (String) null), "Rule-Obj-Flow", "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyFlowType", pRef_21, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
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
boolean pz__2 = true;
if (pz__2) {
// branch to block Iterate
nextBlock = "Iterate";
return false;
} else {
// branch to block Iterate
nextBlock = "Iterate";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step2_4_circum0 definition

/**
 * pyExecute.pyCustom.pyParameters(1) and pyExecute.pyCustom.pyParameters(2) should exist for a smart shape.
 * <p>
 * Step 2.5 [SmartShape] <code>Property-Set</code><br>
 */
public boolean step2_5_circum0() {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    shapeUpperCase = pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, "String", new Object[] { scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) });
}
{
    searchStringUpperCase = pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, "String", new Object[] { tools.getParamValue("searchString") });
}
{
    matchFound = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, "String", new Object[] { shapeUpperCase, searchStringUpperCase })).booleanValue();
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.matchFound");
try {
boolean pz_22 = matchFound;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.matchFound",pz_22);
if (!pz_22) {
// branch to block Iterate
nextBlock = "Iterate";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.matchFound " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_circum0 definition

/**
 * Evaluate the decision table that decides the utilities to be displayed in express.
 * <p>
 * Step 2.6 <code>Property-Map-DecisionTable</code><br>
 */
public boolean step2_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Map-DecisionTable");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Map-DecisionTable", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Map-DecisionTable
ClipboardPage map_1 = tools.getStepPage();
if ((map_1 == null) || (map_1.getClassName().length() == 0)) {
map_1 = tools.getThread().createPage("Embed-Rule-Navigation-Element", "");
}

// Expression: pzEnableShapeInPE
enableShape = com.pegarules.generated.pega_rules_decisiontable.ObtainValue(tools, map_1, "pzEnableShapeInPE", false);
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Map-DecisionTable",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_6_circum0 definition

/**
 * Enable Create Case and send email Smart Shapes in Pega Express.
 * <p>
 * Step 2.7 <code>Java</code><br>
 */
public boolean step2_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_ElementsPage = tools.findPage(tools.getParamValue("ElementsPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.sessionContext==\"express\"");
try {
boolean pz_23 = (tools.getParamValue("sessionContext").equals("express"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.sessionContext==\"express\"",pz_23);
if (!pz_23) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.sessionContext==\"express\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue==\"Utility\"||.pyExecute.pyCustom.pyParameters(1).pyValue==\"GenerativeAI\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyExecute.pyCustom.pyParameters(1).pyValue==\"Utility\"||.pyExecute.pyCustom.pyParameters(1).pyValue==\"GenerativeAI\"", "FUAInstance-NullMyStepPage");
}
boolean pz_24 = ((scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Utility")) || (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("GenerativeAI")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue==\"Utility\"||.pyExecute.pyCustom.pyParameters(1).pyValue==\"GenerativeAI\"",pz_24);
if (!pz_24) {
// branch to block Iterate
nextBlock = "Iterate";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyCustom.pyParameters(1).pyValue==\"Utility\"||.pyExecute.pyCustom.pyParameters(1).pyValue==\"GenerativeAI\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.enableShape==\"true\"");
try {
boolean pz_25 = (enableShape.equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.enableShape==\"true\"",pz_25);
if (!pz_25) {
// branch to block Iterate
nextBlock = "Iterate";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.enableShape==\"true\" " + anyException.getMessage(), anyException);
}
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
pz_CurrentStepNum = "2.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_7_circum0 definition

/**
 * 'Smart shapes -> Sub process' specific property sets go in this step.
 * <p>
 * Step 2.8 <code>Property-Set</code><br>
 */
public boolean step2_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue==\"SubProcess\"&amp;&amp;.pyExecute.pyCustom.pyParameters(2).pyValue!=\"pxApproval\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyExecute.pyCustom.pyParameters(1).pyValue==\"SubProcess\"&&.pyExecute.pyCustom.pyParameters(2).pyValue!=\"pxApproval\"", "FUAInstance-NullMyStepPage");
}
boolean pz_26 = ((scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("SubProcess")) && (!(scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxApproval"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue==\"SubProcess\"&amp;&amp;.pyExecute.pyCustom.pyParameters(2).pyValue!=\"pxApproval\"",pz_26);
if (!pz_26) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyCustom.pyParameters(1).pyValue==\"SubProcess\"&amp;&amp;.pyExecute.pyCustom.pyParameters(2).pyValue!=\"pxApproval\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_16, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_17, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_20, pega.findPageWithException("CategoryItems", (String) null), tools.getParamValue("appliesTo"), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_19, pega.findPageWithException("CategoryItems", (String) null), "Rule-Obj-Flow", "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyFlowType", pRef_21, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
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
pz_CurrentStepNum = "2.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_8_circum0 definition

/**
 * 'Smart shapes -> Utilitiy' specific property sets go in this step.
 * <p>
 * Step 2.9 <code>Property-Set</code><br>
 */
public boolean step2_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue == \"Utility\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyExecute.pyCustom.pyParameters(1).pyValue == \"Utility\"", "FUAInstance-NullMyStepPage");
}
boolean pz_27 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Utility"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue == \"Utility\"",pz_27);
if (!pz_27) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyCustom.pyParameters(1).pyValue == \"Utility\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_16, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_17, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_20, pega.findPageWithException("CategoryItems", (String) null), tools.getParamValue("appliesTo"), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_19, pega.findPageWithException("CategoryItems", (String) null), "Rule-Obj-Activity", "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyActivityName", pRef_28, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
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
pz_CurrentStepNum = "2.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_9_circum0 definition

/**
 * 'Smart shapes -> GenerativeAI' specific property sets go in this step.
 * <p>
 * Step 2.10 <code>Property-Set</code><br>
 */
public boolean step2_10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue == \"GenerativeAI\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyExecute.pyCustom.pyParameters(1).pyValue == \"GenerativeAI\"", "FUAInstance-NullMyStepPage");
}
boolean pz_29 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("GenerativeAI"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyCustom.pyParameters(1).pyValue == \"GenerativeAI\"",pz_29);
if (!pz_29) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyCustom.pyParameters(1).pyValue == \"GenerativeAI\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_16, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxIcon", pRef_17, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_20, pega.findPageWithException("CategoryItems", (String) null), tools.getParamValue("appliesTo"), "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_19, pega.findPageWithException("CategoryItems", (String) null), "Rule-Obj-Activity", "s?N", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyActivityName", pRef_28, pega.findPageWithException("CategoryItems", (String) null), scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
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
pz_CurrentStepNum = "2.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_10_circum0 definition

/**
 * --Debug statement to see the added entry in CategoryItems page.
 * <p>
 * Step 2.11 <code>Java</code> [on page CategoryItems] <br>
 */
public boolean step2_11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_ElementsPage = tools.findPage(tools.getParamValue("ElementsPage"));
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
pz_CurrentStepNum = "2.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_11_circum0 definition

/**
 * Check if sub menus exists, get ElementsPage parameter.
 * <p>
 * Step 2.12 [Iterate] <code>Property-Set</code><br>
 */
public boolean step2_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyElements\")");
try {
boolean pz_30 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, "Default", new Object[] { ".pyElements" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Default.PropertyExists(\".pyElements\")",pz_30);
if (!pz_30) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Default.PropertyExists(\".pyElements\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("ElementsPage", PropertyInfo.TYPE_INCLUDED_PAGE, pega.<String>resolveMethodCall("pxGetStepPageReference--()", "pxGetStepPageReference", null, "Utilities", new Object[] {}));
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
pz_CurrentStepNum = "2.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_12_circum0 definition

/**
 * Recursive call to this activity on new ElementsPage.
 * <p>
 * Step 2.13 <code>Call Rule-Obj-Activity.pzAddSmartShapes</code><br>
 */
public boolean step2_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Activity.pzAddSmartShapes");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-Obj-Activity.pzAddSmartShapes", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-Obj-Activity.pzAddSmartShapes
if (myStepPage == null) {
}
// Calling Activity : Rule-Obj-Activity.pzAddSmartShapes
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzAddSmartShapes", "Rule-Obj-Activity", "Rule-Obj-Activity");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Activity.pzAddSmartShapes",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_13_circum0 definition

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

public String searchStringUpperCase = "";
public boolean matchFound = false;
public String shapeUpperCase = "";
public String enableShape = "";

public void initializeUserLocalVariables() {
	searchStringUpperCase = "";
	matchFound = false;
	shapeUpperCase = "";
	enableShape = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("searchStringUpperCase", (searchStringUpperCase == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : searchStringUpperCase.toString());
	smRetVal.putString("matchFound", Boolean.toString(matchFound));
	smRetVal.putString("shapeUpperCase", (shapeUpperCase == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : shapeUpperCase.toString());
	smRetVal.putString("enableShape", (enableShape == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : enableShape.toString());
	return smRetVal;
}

public ClipboardPage pageParam_ElementsPage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_ElementsPage = null;
}

public static final String[] pRef_8 = new String[] { "", "", "pyExecute", "", "pyCustom", "", "pyParameters", "1", "pyValue", "" };
public static final String[] pRef_21 = new String[] { "", "", "pxResults", "<last>", "pyFlowType", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxResults", "<last>", "pxIcon", "" };
public static final String[] pRef_20 = new String[] { "", "", "pxResults", "<last>", "pyClassName", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyExecute", "", "pyCustom", "", "pyParameters", "2", "pyValue", "" };
public static final String[] pRef_28 = new String[] { "", "", "pxResults", "<last>", "pyActivityName", "" };
public static final String[] pRef_16 = new String[] { "", "", "pxResults", "<append>", "pyLabel", "" };
public static final String[] pRef_19 = new String[] { "", "", "pxResults", "<last>", "pxObjClass", "" };
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyImage").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().page("pyExecute").page("pyCustom").pageList("pyParameters", 1).scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyCaption").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().page("pyExecute").page("pyCustom").pageList("pyParameters", 2).scalarProperty("pyValue").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-ACTIVITY PZADDSMARTSHAPES #20230618T001756.493 GMT", "Rule-Obj-Activity pzAddSmartShapes", "Pega-ProcessArchitect", "08-23-01", false, true, "", "ACTIVITY", "20230618T001756.493 GMT" ,"Rule-Obj-Activity"); }
