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
public class ra_action_pxvalidate_e444dc9f443f8bd4bf3d87bd60def3ae extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pxValidate.Embed_ShapeNode.Action");
	public ra_action_pxvalidate_e444dc9f443f8bd4bf3d87bd60def3ae(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT	Pega-ProcessArchitect:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 5 Circum: 0" );
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
thisStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 6 Circum: 0" );
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
thisStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 7 Circum: 0" );
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
thisStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), false);
if (thisStepPage != null && !thisStepPage.isReadOnly()) {
thisStepPage.putString("pxObjClass", "Data-MO");
}
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
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
		new DependentRuleInfo("PXVALIDATE","Rule-Obj-Activity","EMBED-SHAPENODE",false,"","Pega-ProcessArchitect","08-05-01","RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT","!PXVALIDATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-813424356)
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
//	RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT:20200422T101312.387 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "820ab1797e1b5e752c08e9c2fa063251";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ShapeNode";
	}
public String getAspect() {
return "Action";
}
/**
 * Setting the selected shape and process context.
 * <p>
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
    tools.putParamValue("SelectedShape", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("pxGetStepPageReference--()", "pxGetStepPageReference", null, "Utilities", new Object[] {}));
}
{
    tools.putParamValue("SelectedProcess", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("whatComesBeforeLast--(String,char)", "whatComesBeforeLast", null, "String", new Object[] { tools.getParamValue("SelectedShape"), '.' }));
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
 * Setting the properties over Flow Page from Shape Node.
 * <p>
 * Step 2 <code>Java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SelectedShapeReference = tools.findPage(tools.getParamValue("SelectedShapeReference"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage ProcessRef = myStepPage.getParentPage();
ClipboardProperty flowPageProp = ProcessRef.getIfPresent(".pyFlowPage");
if(flowPageProp != null){
  ClipboardPage flowPage = flowPageProp.getPageValue();
  // now get the shape from the flow page 
  Iterator shapeIt = flowPage.getProperty(".pyModelProcess.pyShapes").iterator();
  while(shapeIt.hasNext()){
    ClipboardProperty nextShapeProp = (ClipboardProperty)shapeIt.next();
    ClipboardPage nextShape = nextShapeProp.getPageValue();
    if(myStepPage.getString(".pyShapeID").equals(nextShape.getString(".pyMOId"))){
      tools.putParamValue("SelectedShapeReference",nextShape.getReference());
      if(nextShape.getString(".pyImplementation").equals("pxApproval")){
          ClipboardPage pzRuleParamsHolderPage = nextShape.getProperty(".pzRuleParamsHolder").getPageValue();
           approvalShapeGotSLA = pzRuleParamsHolderPage.getProperty(".pyConsiderSLA").toBoolean();
           approvalSlaType = pzRuleParamsHolderPage.getString("pySLAType");
        	if(!approvalShapeGotSLA && pzRuleParamsHolderPage.getIfPresent(".pySLAPage") != null){
              pzRuleParamsHolderPage.getPage(".pySLAPage").clearMessages();
            }
      }
      if( !nextShape.getProperty(".pyConsiderSLA").toBoolean() && nextShape.getIfPresent(".pySLAPage") != null){
        	nextShape.getPage(".pySLAPage").clearMessages();        
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
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * call  pzValidateSLA -- Validate SLA only when sla configuration is of custom type.
 * <p>
 * Step 3 <code>Java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SelectedShapeReference = tools.findPage(tools.getParamValue("SelectedShapeReference"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "SelectedShapeReference.pyConsiderSLA &amp;&amp; SelectedShapeReference.pySLAType==\"Custom\"");
try {
boolean pz_3 = (scalarValueQuery_1.resolveToBoolean(tools, pega.findPage(tools.getParamValue("SelectedShapeReference"), "Data-MO"), ImmutablePropertyInfo.TYPE_TRUEFALSE) && (scalarValueQuery_2.resolveToString(tools, pega.findPage(tools.getParamValue("SelectedShapeReference"), "Data-MO"), ImmutablePropertyInfo.TYPE_TEXT).equals("Custom")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "SelectedShapeReference.pyConsiderSLA &amp;&amp; SelectedShapeReference.pySLAType==\"Custom\"",pz_3);
if (pz_3) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("SelectedShapeReference.pyConsiderSLA &amp;&amp; SelectedShapeReference.pySLAType==\"Custom\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.approvalShapeGotSLA &amp;&amp; local.approvalSlaType==\"Custom\"");
try {
boolean pz_4 = (approvalShapeGotSLA && (approvalSlaType.equals("Custom")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.approvalShapeGotSLA &amp;&amp; local.approvalSlaType==\"Custom\"",pz_4);
if (!pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.approvalShapeGotSLA &amp;&amp; local.approvalSlaType==\"Custom\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage CaseTypeStages = tools.findPage("CaseTypeStages");
//if discard sla is true dont validate
String pageName = myStepPage.getReference();

if(!"".equals(pageName)){
	shapepageName = tools.findPage(pageName).getString("pyShapeImpl");
	ClipboardPage currentPage= null;
	if(!"".equals(shapepageName)){
		//validate sla
		currentPage = tools.findPage(shapepageName);
        // If its approval shape, then we might have to get the pzRuleParamsHolder page to get the SLA page on it.
		isApproval = currentPage.getString("pyImplementation").equals("pxApproval") || currentPage.getString("pyImplementation").equals("pzApprovalFlowWrapper");
		if(isApproval)
		{
			currentPage = tools.findPage(shapepageName+".pzRuleParamsHolder");
		}
		if(currentPage.getIfPresent("pySLAPage") != null){
			ClipboardPage slaPage=currentPage.getPage("pySLAPage");
			if(!"true".equalsIgnoreCase(currentPage.getString("pyDiscardSLA"))){
				StringMap keys = new HashStringMap();
				keys.putString("pxObjClass", "Rule-Obj-Activity");
				keys.putString("pyActivityName", "pzValidateSLA");
				keys.putString("pyClassName", "Rule-Obj-ServiceLevel");
				tools.doActivity(keys,slaPage,tools.getParameterPage());
			}
		}
		if(isApproval){
			StringMap keys = new HashStringMap();
			keys.putString("pxObjClass", "Rule-Obj-Activity");
			keys.putString("pyActivityName", "pzValidateApprovalStepStatus");
			keys.putString("pyClassName", "Work-");
			tools.doActivity(keys,currentPage,tools.getParameterPage());
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * call  pzValidateRecipients to validate recipients on notification page.
 * <p>
 * Step 4 <code>Java</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SelectedShapeReference = tools.findPage(tools.getParamValue("SelectedShapeReference"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "SelectedShapeReference.pyImplementation==\"pzNotifyWrapper\"");
try {
boolean pz_6 = (scalarValueQuery_5.resolveToString(tools, pega.findPage(tools.getParamValue("SelectedShapeReference"), "Data-MO"), ImmutablePropertyInfo.TYPE_TEXT).equals("pzNotifyWrapper"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "SelectedShapeReference.pyImplementation==\"pzNotifyWrapper\"",pz_6);
if (!pz_6) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("SelectedShapeReference.pyImplementation==\"pzNotifyWrapper\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String pageName = myStepPage.getReference();

if(!"".equals(pageName)){
	shapepageName = tools.findPage(pageName).getString("pyShapeImpl");
	ClipboardPage currentPage= null;
	if(!"".equals(shapepageName)){		
		currentPage = tools.findPage(shapepageName);      
		if(currentPage.getIfPresent("pyNotificationPage") != null){
			ClipboardPage notificationPage=currentPage.getPage("pyNotificationPage");	
     
				StringMap keys = new HashStringMap();
				keys.putString("pxObjClass", "Rule-Obj-Activity");
				keys.putString("pyActivityName", "pzValidateNotification");
				keys.putString("pyClassName", "Rule-Notification");
				tools.doActivity(keys,notificationPage,tools.getParameterPage());
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * call pzValidateApproval to validate approval shape subject.
 * <p>
 * Step 5 <code>Java</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_SelectedShapeReference = tools.findPage(tools.getParamValue("SelectedShapeReference"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "SelectedShapeReference.pyImplementation==\"pxApproval\"||SelectedShapeReference.pyImplementation==\"pzApprovalFlowWrapper\"");
try {
boolean pz_7 = ((scalarValueQuery_5.resolveToString(tools, pega.findPage(tools.getParamValue("SelectedShapeReference"), "Data-MO"), ImmutablePropertyInfo.TYPE_TEXT).equals("pxApproval")) || (scalarValueQuery_5.resolveToString(tools, pega.findPage(tools.getParamValue("SelectedShapeReference"), "Data-MO"), ImmutablePropertyInfo.TYPE_TEXT).equals("pzApprovalFlowWrapper")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "SelectedShapeReference.pyImplementation==\"pxApproval\"||SelectedShapeReference.pyImplementation==\"pzApprovalFlowWrapper\"",pz_7);
if (!pz_7) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("SelectedShapeReference.pyImplementation==\"pxApproval\"||SelectedShapeReference.pyImplementation==\"pzApprovalFlowWrapper\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage CaseTypeStages = tools.findPage("CaseTypeStages");
String pageName = myStepPage.getReference();

if(!"".equals(pageName)){
	shapepageName = tools.findPage(pageName).getString("pyShapeImpl");
	ClipboardPage currentPage= null;
	if(!"".equals(shapepageName)){
		currentPage = tools.findPage(shapepageName);    
    StringMap keys = new HashStringMap();
    keys.putString("pxObjClass", "Rule-Obj-Activity");
    keys.putString("pyActivityName", "pzValidateApprovalShape");
    keys.putString("pyClassName", "Data-MO-Activity-SubProcess");
    tools.doActivity(keys,currentPage,tools.getParameterPage());   	
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Validating the property Panel.
 * <p>
 * Step 6 <code>Call pzPropertyPanelPostWrapper</code> [on page SelectedShapeReference] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPropertyPanelPostWrapper");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzPropertyPanelPostWrapper", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzPropertyPanelPostWrapper
if (myStepPage == null) {
myStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), true);
if (myStepPage == null) {
myStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), false);
if (myStepPage != null && !myStepPage.isReadOnly()) {
myStepPage.putString("pxObjClass", "Data-MO");
}
}
}
// Calling Activity : pzPropertyPanelPostWrapper

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: true
String pz_8 = String.valueOf(true);
newParamsPage.putParamValue("skipSpecSave", PropertyInfo.TYPE_TRUEFALSE, pz_8);

pega.invokeActivity(myStepPage, newParamsPage, "pzPropertyPanelPostWrapper", "Embed-ShapeNode", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPropertyPanelPostWrapper",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Step 7 <code>Call pzUpdateShape</code> [on page SelectedShapeReference] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzUpdateShape");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzUpdateShape", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzUpdateShape
if (myStepPage == null) {
myStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), true);
if (myStepPage == null) {
myStepPage = tools.findPage(tools.getParamValue("SelectedShapeReference"), false);
if (myStepPage != null && !myStepPage.isReadOnly()) {
myStepPage.putString("pxObjClass", "Data-MO");
}
}
}
// Calling Activity : pzUpdateShape

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzUpdateShape", "Embed-ShapeNode", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzUpdateShape",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * DT after Property Panel Validation.
 * <p>
 * Step 8 <code>Apply-DataTransform</code> [on page SelectedShapeReference] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: pzPropertyPanelPostWrapperDT
ParameterPage stepParams__1 = new ParameterPage();/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "Embed-ShapeNode";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "pzPropertyPanelPostWrapperDT");
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
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

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

public boolean isApproval = false;
public boolean approvalShapeGotSLA = false;
public String approvalSlaType = "";
public String shapepageName = "";

public void initializeUserLocalVariables() {
	isApproval = false;
	approvalShapeGotSLA = false;
	approvalSlaType = "";
	shapepageName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("isApproval", Boolean.toString(isApproval));
	smRetVal.putString("approvalShapeGotSLA", Boolean.toString(approvalShapeGotSLA));
	smRetVal.putString("approvalSlaType", (approvalSlaType == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : approvalSlaType.toString());
	smRetVal.putString("shapepageName", (shapepageName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : shapepageName.toString());
	return smRetVal;
}

public ClipboardPage pageParam_SelectedShapeReference;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_SelectedShapeReference = null;
}

private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyConsiderSLA").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pySLAType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyImplementation").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY EMBED-SHAPENODE PXVALIDATE #20200422T101312.387 GMT", "Embed-ShapeNode pxValidate", "Pega-ProcessArchitect", "08-05-01", false, true, "", "ACTIVITY", "20200422T101312.387 GMT" ,"Rule-Obj-Activity"); }
