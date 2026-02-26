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
public class ra_action_pzsaveallvalidaterules_f198b1d026a3ee7c331e41df48a6408a extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzSaveAllValidateRules.Rule_Obj_Validate.Action");
	public ra_action_pzsaveallvalidaterules_f198b1d026a3ee7c331e41df48a6408a(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT	Pega-ProcessArchitect:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT Step: 5 Circum: 0" );
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
String pz_5 = "CaseTypeStages";
thisStepPage = tools.findPage(pz_5, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
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
	"Rule-Obj-Activity:PZSAVEALLVALIDATERULES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSAVEALLVALIDATERULES","Rule-Obj-Activity","RULE-OBJ-VALIDATE",false,"","Pega-ProcessArchitect","08-06-01","RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT","!PZSAVEALLVALIDATERULES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1822869948)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT:20200819T142722.688 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "861bf35f03968d1533c43a83f5abdb23";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Validate";
	}
public String getAspect() {
return "Action";
}
/**
 * Using class name on CaseTypeStages page, verify if Bread crumb page already exists or not. If not skip executing further steps.
 * <p>
 * Step 2 <code>Java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//Get current thread reference
com.pega.pegarules.priv.context.PegaThread currentThread = (com.pega.pegarules.priv.context.PegaThread)tools.getThread();

//Using class name on CaseTypeStages page, verify if Bread crumb page already exists or not. 
ClipboardPage caseTypeStages = tools.findPage("CaseTypeStages");
ParameterPage params = tools.getParameterPage();
if (caseTypeStages!=null){
params.putString("ContextClass", caseTypeStages.getString("pyClassName"));
ClipboardPage breadcrumbPg= currentThread.findDataPageWithoutLoading("D_pzBreadCrumbData", params);
breadCrumbPageExists = false;

if(breadcrumbPg!=null) {
  breadCrumbPageExists = true;

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
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Set variables required for saving validate rules.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.breadCrumbPageExists");
try {
boolean pz_1 = breadCrumbPageExists;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.breadCrumbPageExists",pz_1);
if (!pz_1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzSaveAllValidateRules - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.breadCrumbPageExists " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    bcLength = (pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findDataPage("D_pzBreadCrumbData", false, "ContextClass", scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT)).getProperty("pxResults") })).intValue();
}
{
    limitToPage = tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "LimitToPage");
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
 * Loop through the bread crumb data page backward until LimitToPage and save the validate rules and remove the corresponding data pages.
 * <p>
 * Step 4 <code>Java</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//Get current thread reference
com.pega.pegarules.priv.context.PegaThread currentThread = (com.pega.pegarules.priv.context.PegaThread)tools.getThread();
//Get parameter page reference
ParameterPage params = tools.getParameterPage();
//Get caseTypeClass variable
String caseTypeClass = "";
ClipboardPage caseTypeStages = tools.findPage("CaseTypeStages");
if(caseTypeStages!=null){
  caseTypeClass = caseTypeStages.getString("pyClassName");
}

//Set the default ContextClass param value
params.putString("ContextClass", caseTypeClass);

//Get breadcrumb data page reference
ClipboardPage breadcrumbPg= currentThread.findDataPageWithoutLoading("D_pzBreadCrumbData", params); 

//Set keys for pzSaveValidation activity call
StringMap aKeys = new HashStringMap();
aKeys.putString("pyActivityName", "pzSaveValidation");
aKeys.putString("pyClassName", "Rule-Obj-Validate");

String lookForProperty =null;
String callValidateRule =null;
String callValidateClass= null;
int i = bcLength;

while(i>=limitToPage && i!=1){ 
  ClipboardPage cp1 = breadcrumbPg.getPage("pxResults(" + i + ")");
  
  //Set parameters to fetch grid data page reference     
  params.putString("ParentPropertyName", cp1.getString("pyPropertyName"));    
  params.putString("ContextClass", cp1.getString("pyClassName"));    
  params.putString("ValidateRule", cp1.getString("pyRuleName"));
  
  //Get embed level validation grid's primary page reference
  ClipboardPage embededValGridPg= currentThread.findDataPageWithoutLoading("D_pzCaseTypeValidationsForEmbedFields", params);
  
  if(embededValGridPg!=null){
    //Set validate rule label from embed lavel validate grid's primary page
    params.putString("Label", embededValGridPg.getString("pyLabel"));
    
    //Skip saving the last validate rule (last member in the breadcrumb), 
    //It would have already been saved if atlest one validation condition was configured on any of the scalar property,
    //If not then corresponding CallValidate configuration would be removed from its parent in pzSaveValidations activity
    if(i<bcLength){
      //Set params for pzSaveValidations activity call
      params.putString("LookForProperty", lookForProperty);
      params.putString("CallValidateRule", callValidateRule);
      params.putString("CallValidateClass", callValidateClass);
    
      //Call pzSaveValidation activity to save validate rule
      tools.doActivity(aKeys, embededValGridPg, params);
    }
    //Remove this data page from clipboard to reload it freshly when this embed level validate rule gets accessed again
    tools.removeDataPage("D_pzCaseTypeValidationsForEmbedFields", params);
  }
   //Set variables required to trigger the save validation of parent validate rule in the next backward iteration
   lookForProperty = cp1.getString("pyPropertyName");
   callValidateRule = cp1.getString("pyRuleName");
   callValidateClass =cp1.getString("pyClassName");  
  
   i--;
}

//If user is navigating directly to the CaseType validation grid or also called Top level validate rule, LimitToPage variable value would be 1
//
if (limitToPage==1){
  //Set parameters to fetch grid data page reference
  ClipboardPage cp1= breadcrumbPg.getPage("pxResults(1)");      
  params.putString("caseTypeClass", cp1.getString("pyClassName"));
  params.putString("ContextClass", cp1.getString("pyClassName"));    
  params.putString("ValidateRule", "pyOnStageEntry");
  params.putString("Label", "Stage entry validation");
  
  //Get case type validation grid's primary page reference 
  ClipboardPage caseTypeValGridPg= currentThread.findDataPageWithoutLoading("D_pzCaseTypeValidations", params);   
  
  if (caseTypeValGridPg!=null){   
    //Set params for pzSaveValidations activity call 
    params.putString("LookForProperty", lookForProperty);
    params.putString("CallValidateRule", callValidateRule);
    params.putString("CallValidateClass", callValidateClass);
    
    //Call pzSaveValidation activity to save validate rule
    tools.doActivity(aKeys, caseTypeValGridPg, params); 
    //Remove this data page from clipboard to reload it freshly when case type validate rule gets accessed again
    tools.removeDataPage("D_pzCaseTypeValidations", params);
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * -- Associate pyOnStageEntry validate rule on every stage if case type is being saved.
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.LimitToPage==1");
try {
boolean pz_3 = (tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "LimitToPage") == 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.LimitToPage==1",pz_3);
if (!pz_3) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzSaveAllValidateRules - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.LimitToPage==1 " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(\"CaseTypeStages\")");
try {
boolean pz_4 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "CaseTypeStages" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(\"CaseTypeStages\")",pz_4);
if (!pz_4) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzSaveAllValidateRules - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(\"CaseTypeStages\") " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Update the stage entry validate reference either directly or on a referenced stage rule.
 * <p>
 * Step 6 <code>call pzUpdateStageValidationReference</code> [on page CaseTypeStages] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzUpdateStageValidationReference");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzUpdateStageValidationReference", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzUpdateStageValidationReference
if (myStepPage == null) {
String pz_6 = "CaseTypeStages";
myStepPage = tools.findPage(pz_6, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_6, false);
myStepPage.putString("pxObjClass", "Rule-Obj-CaseType");
}
}
// Calling Activity : pzUpdateStageValidationReference

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "pyOnStageEntry"
newParamsPage.putParamValue("newValidationReference", PropertyInfo.TYPE_TEXT, "pyOnStageEntry");
// Expression: .pyClassName
if (myStepPage == null) {
throw new InvalidReferenceException(".pyClassName", "FUAInstance-NullMyStepPage");
}
newParamsPage.putParamValue("className", PropertyInfo.TYPE_TEXT, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
// Expression: false
String pz_7 = String.valueOf(false);
newParamsPage.putParamValue("commit", PropertyInfo.TYPE_TRUEFALSE, pz_7);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzUpdateStageValidationReference", "Rule-Obj-Validate", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzUpdateStageValidationReference",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

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

public int limitToPage = 0;
public int bcLength = 0;
public boolean breadCrumbPageExists = false;
public String className = "";

public void initializeUserLocalVariables() {
	limitToPage = 0;
	bcLength = 0;
	breadCrumbPageExists = false;
	className = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("limitToPage", Integer.toString(limitToPage));
	smRetVal.putString("bcLength", Integer.toString(bcLength));
	smRetVal.putString("breadCrumbPageExists", Boolean.toString(breadCrumbPageExists));
	smRetVal.putString("className", (className == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : className.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-VALIDATE PZSAVEALLVALIDATERULES #20200819T142722.688 GMT", "Rule-Obj-Validate pzSaveAllValidateRules", "Pega-ProcessArchitect", "08-06-01", false, true, "", "ACTIVITY", "20200819T142722.688 GMT" ,"Rule-Obj-Activity"); }
