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
public class ra_action_pzloadcasewideoptionalprocesses_6813f9e3e1913f44f8ef102e51024a92 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzLoadCaseWideOptionalProcesses.Rule_Obj_CaseType.Action");
	public ra_action_pzloadcasewideoptionalprocesses_6813f9e3e1913f44f8ef102e51024a92(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT	Pega-ProcessEngine:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT Step: 1 Circum: 0" );
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
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_4 = pzPrimPage.getIfPresent("pyFlowsToStart");
pageRef = pz_4;
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
pz_CurrentStepNum = "2.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_0_circum0");
}
PRStackFrame pz_StackFrame2_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT Step: 2_0 Circum: 0" );
try {
pz_Status = step2_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
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
	"Rule-Obj-Activity:PZLOADCASEWIDEOPTIONALPROCESSES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADCASEWIDEOPTIONALPROCESSES","Rule-Obj-Activity","RULE-OBJ-CASETYPE",false,"","Pega-ProcessEngine","08-08-01","RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT","!PZLOADCASEWIDEOPTIONALPROCESSES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-820672424)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT:20220509T093043.730 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "40d3ed8ca946c0042a5d76895bc7f697";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-CaseType";
	}
public String getAspect() {
return "Action";
}
/**
 * Remove pyCaseOptionalProcesses.
 * <p>
 * Step 1 <code>Property-Remove</code><br>
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
// Expression: .pyCaseOptionalProcesses
if (myStepPage == null) {
throw new InvalidReferenceException(".pyCaseOptionalProcesses", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_3 = myStepPage.getIfPresent("pyCaseOptionalProcesses");
try {if (pz_3!= null) {
pz_3.removeFromClipboard();
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
 * Set flow Name and params and also set case optional process when rules whether exp or when.
 * <p>
 * Step 2.0 <code>Property-Set</code> [on page .pyFlowsToStart] <br>
 */
public boolean step2_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFlowType==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyFlowType==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_6 = (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFlowType==\"\"",pz_6);
if (pz_6) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFlowType==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(<append>).pyFlowName", pRef_7, tools.getPrimaryPage(), scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    tools.putParamValue("flowClass", PropertyInfo.TYPE_TEXT, scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("flowName", PropertyInfo.TYPE_TEXT, scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyAutomaticStart", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyAutomaticStart", "" }, tools.getPrimaryPage(), scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyManualStart", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyManualStart", "" }, tools.getPrimaryPage(), scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyWhen", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyWhen", "" }, tools.getPrimaryPage(), scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyStartWhenForCase", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyStartWhenForCase", "" }, tools.getPrimaryPage(), scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pySkipOrAllowType", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pySkipOrAllowType", "" }, tools.getPrimaryPage(), (((scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) && (!(scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")))) ? "when" : scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyAutoStartWhenType", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyAutoStartWhenType", "" }, tools.getPrimaryPage(), (((scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) && (!(scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")))) ? "when" : scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyExpressionToSkipOrAllow", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyExpressionToSkipOrAllow", "" }, tools.getPrimaryPage(), scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyExpressionToAutoStart", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyExpressionToAutoStart", "" }, tools.getPrimaryPage(), scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyShowBackButton", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyShowBackButton", "" }, tools.getPrimaryPage(), scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pyCaseOptionalProcesses(" + forEachCounter + ").pyCallParams", new String[] { "", "", "pyCaseOptionalProcesses", String.valueOf(forEachCounter), "pyCallParams", "" }, tools.getPrimaryPage(), pageQuery_18.resolve(tools, myStepPage), "S!N", false, false);
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

// Code to call nested step 2_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_1_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pyCaseOptionalProcesses(<last>)");
nestedStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
PRStackFrame pz_StackFrame2_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT Step: 2_1 Circum: 0" );
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
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_2_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pyCaseOptionalProcesses(" + forEachCounter + ")");
nestedStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
PRStackFrame pz_StackFrame2_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT Step: 2_2 Circum: 0" );
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_0_circum0 definition

/**
 * Set stepType and pyLabel.
 * <p>
 * Step 2.1 <code>Java</code> [on page Primary.pyCaseOptionalProcesses(<LAST>)] <br>
 */
public boolean step2_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
Database dbInf = tools.getDatabase();
String className = tools.getParamValue("flowClass");
String flowName = tools.getParamValue("flowName");

HashStringMap oKeys = new HashStringMap();
oKeys.putString("pxObjClass", "Rule-Obj-Flow");
oKeys.putString("pyClassName",className);
oKeys.putString("pyFlowType",flowName );
String[] aColumns = {"pyLabel","pyStructureType","pyVisioJpegName","pxUpdateDateTime"};
try{
	ClipboardPage tempPage = ((PegaDatabase)dbInf).openSelectedColumns(oKeys,aColumns);
	if(tempPage != null)
	{
           	String flowLabel =tempPage.getString("pyLabel");
	        flowLabel  = "".equals(flowLabel)?flowName:flowLabel;
           	myStepPage.putString("pyLabel",flowLabel);
            myStepPage.putString("pyStepType",tempPage.getString("pyStructureType"));
      		if(!"".equals(tempPage.getString("pyVisioJpegName"))){
              myStepPage.putString("pyTransientText",tempPage.getString("pyVisioJpegName")+"?"+tempPage.getString("pxUpdateDateTime"));
            }
      		
	}else{
      //BUG-266809 --Replaced hardcoded error message with Rule-Message rule to fix localization issue.
      myStepPage.addMessage("pyUnableToOpenInstance\t"+ myStepPage.getString("pyLabel")+"\t"+ tools.getParamValue("ClassName")+ "\t" +flowName);
      //myStepPage.addMessage("Unable to open an instance using the given inputs: "+ myStepPage.getString("pyLabel")+" ("+tools.getParamValue("ClassName")+"."+flowName+")");
    }
	tempPage.removeFromClipboard();
}
catch(Exception e){
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
pz_CurrentStepNum = "2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_1_circum0 definition

/**
 * Call pzPopulateShapeNodes.
 * <p>
 * Step 2.2 <code>Call pzPopulateShapeNodes</code> [on page Primary.pyCaseOptionalProcesses(<CURRENT>)] <br>
 */
public boolean step2_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPopulateShapeNodes");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzPopulateShapeNodes", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzPopulateShapeNodes
if (myStepPage == null) {
if (tools.getPrimaryPage() == null) {
myStepPage = null;
} else { 
myStepPage = tools.getPrimaryPage().getPage(".pyCaseOptionalProcesses(" + forEachCounter + ")");
}
}
// Calling Activity : pzPopulateShapeNodes
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzPopulateShapeNodes", "Rule-Obj-CaseType", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPopulateShapeNodes",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_2_circum0 definition

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


public void initializeUserLocalVariables() {
}


public StringMap snapshotLocalVariables() {
	return null;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_7 = new String[] { "", "", "pyCaseOptionalProcesses", "<append>", "pyFlowName", "" };
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pySkipOrAllowType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyAutoStartWhenType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyShowBackButton").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyStartWhen").buildScalarValueQuery();
private static final PageQuery pageQuery_18 = FUAUtil.createQueryBuilder().page("pyCallParams").buildPageQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyManualStart").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_22 = FUAUtil.createQueryBuilder().pageList("pyCaseOptionalProcesses").buildPropertyQuery();
private static final PropertyQuery propertyQuery_20 = FUAUtil.createQueryBuilder().pageList("pyCaseOptionalProcesses").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyWhen").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyExpressionToAutoStart").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyAutomaticStart").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyExpressionToSkipOrAllow").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyFlowType").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZLOADCASEWIDEOPTIONALPROCESSES #20220509T093043.730 GMT", "Rule-Obj-CaseType pzLoadCaseWideOptionalProcesses", "Pega-ProcessEngine", "08-08-01", false, true, "", "ACTIVITY", "20220509T093043.730 GMT" ,"Rule-Obj-Activity"); }
