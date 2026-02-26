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
public class ra_action_pzloadmodel_6a437fbb508462106da3cbde29cf3b07 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzLoadModel.Pega_Landing_Process_FieldLevelAuditing.Action");
	public ra_action_pzloadmodel_6a437fbb508462106da3cbde29cf3b07(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT	Pega-LP-ProcessAndRules:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DIS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("OPEN"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_2 = "openModelInstance";
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
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
	"Rule-Obj-Activity:PZLOADMODEL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADMODEL","Rule-Obj-Activity","PEGA-LANDING-PROCESS-FIELDLEVELAUDITING",false,"","Pega-LP-ProcessAndRules","08-01-01","RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT","!PZLOADMODEL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-293497583)
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
//	RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT:20180713T143059.030 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "589696486b45a67a13ebecbbab38ee2c";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Landing-Process-FieldLevelAuditing";
	}
public String getAspect() {
return "Action";
}
/**
 * Check if Primary Page has Messages.
 * <p>
 * Step 1 <code>Call DoNothing</code> [on page Primary] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call DoNothing");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@hasMessages(Primary)");
try {
boolean pz_1 = (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", null, null, new Object[] { tools.getPrimaryPage() })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@hasMessages(Primary)",pz_1);
if (pz_1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadModel - Precondition", null);
pz_CheckMessage = false;
return false;
} else {
// branch to block DIS
nextBlock = "DIS";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@hasMessages(Primary) " + anyException.getMessage(), anyException);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call DoNothing",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step1_circum0 definition

/**
 * Create display Code-Pega-List Page.
 * <p>
 * Step 2 [DIS] <code>java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
ClipboardPage allModelWorkTypesPage = tools.getPrimaryPage();
	
	
	// remove pxResults and build again for the new selection
	
	ClipboardProperty mainList = allModelWorkTypesPage.getProperty(".pxResults");
	mainList.removeFromClipboard();		
			
	

	ClipboardPage workTypesListPage = tools.findPage("WorkTypesListPage");
	ClipboardPage workTypesListPage_dump = tools.createPage("Code-Pega-List","workTypesListPage_dump");
		

	String workTypeSelected = tools.findPage("selectedRow").getString("pySelectedWorkType");
			
	if(!workTypeSelected.equals("All Work Types (Read Only)")){ // add only the selected WorkType. 

	ClipboardProperty orgWorkTypePageList = workTypesListPage.getProperty(".pxResults");
	java.util.Iterator iter1 = orgWorkTypePageList.iterator();

	while(iter1.hasNext()){

			ClipboardProperty orgPageProperty = (ClipboardProperty)iter1.next();
			ClipboardPage workTypeEmbedPage = orgPageProperty.getPageValue();
						
			String orgWorkTypeClassName = workTypeEmbedPage.getString("pyClassName");
			
			if(orgWorkTypeClassName.equals(workTypeSelected)){
				
				workTypesListPage_dump.getProperty(".pxResults").add(workTypeEmbedPage);
				break;

				
			} // if equals selectedWorkType
		
	}// while iter1 loop
			
	} // selected WorkType is not "All WorkTypes"

	else {

		workTypesListPage_dump = workTypesListPage.copy();

	} // else 

	// Now iterate thru workTypesListPage_dump and for each class in it, open the model and extract properties.

	ClipboardProperty workTypesPageList = workTypesListPage_dump.getProperty(".pxResults");

	java.util.Iterator iter2 = workTypesPageList.iterator();

	while(iter2.hasNext()){

		ClipboardProperty workTypePageProperty = (ClipboardProperty)iter2.next();
		ClipboardPage workTypePage = workTypePageProperty.getPageValue();
		String workTypeName = workTypePage.getString("pyClassName");
				
		if(!workTypeName.equals("All Work Types (Read Only)")){
			
			
				// For every workType create a page and open the model of the workType 
				ClipboardPage modelPage = null;
				
				StringMap modelProp = new HashStringMap();
				modelProp.putString("pxObjClass", "Rule-Obj-Model");
				modelProp.putString("pyClassName", workTypeName);
				modelProp.putString("pyModelName", "pyTrackSecurityChanges");
						
			
				try {
				          modelPage = tools.getDatabase().open(modelProp, true);
					}
					
					catch (Exception e) {
					                       
				       } // catch
			
					
			
		   	    String modelClassCompareTo = "";
							
				if(workTypeSelected.equals("All Work Types (Read Only)"))
					modelClassCompareTo = workTypeName;
				else 
					modelClassCompareTo = workTypeSelected;
												
				if((modelPage != null) && (modelPage.getString("pyClassName").equals(modelClassCompareTo))){
				
		 			ClipboardProperty propertyList = modelPage.getProperty(".pyProperties");

					// Now iterate thru the pageList and open the property object (className and propertyName)
					// to get the right class Name, check if the property exists in the current class first, 
					// If not traverse up the class hierarchy to find the class 
					
					
					java.util.Iterator iter3 = propertyList.iterator();
					
					while(iter3.hasNext()){
						
					   ClipboardProperty propertyPageProperty = (ClipboardProperty)iter3.next();
					   ClipboardPage embedPage = propertyPageProperty.getPageValue();
					   
					   String propName = embedPage.getString("pyPropertiesName");
					   String appliesToClassName = modelPage.getString("pyClassName");
					   String modelClass = appliesToClassName;
					   				   
					   int dotPresence = propName.indexOf(".");
					   
					   ClipboardPage pg_temp2 = null;
					   String AppliesTo = "";
						   
					   if(dotPresence >= 0){
					   
						// Srip out the "." from the propertyName 
							String[] splitBefore = null;
							String pattern = "\\.";
							splitBefore = propName.trim().split(pattern);
							
							
							for (int j=0;j<splitBefore.length;j++){
													
								propName = splitBefore[j];
								int paranthesisPresence = splitBefore[j].indexOf("(");
								
								if(paranthesisPresence >= 0){
									
									String afterParen = splitBefore[j].substring(0,paranthesisPresence);
							        propName = afterParen;
										
							
							     } // paranthesis if 
																		
								StringMap streamPage = new HashStringMap();
								streamPage.putString("pxObjClass", "Rule-Obj-Property");
								streamPage.putString("pyClassName", appliesToClassName);
								streamPage.putString("pyPropertyName", propName);
								
								try {
					               pg_temp2 = tools.getDatabase().open(streamPage, true);
					
								   
								}
								
								catch (Exception e) {
																			                       
								} // catch
								
								if(pg_temp2 != null) {
									 AppliesTo = pg_temp2.getString(".pyClassName");
									 appliesToClassName = AppliesTo;
									 
									 String pageClass = pg_temp2.getString(".pyPageClass");
									 if(!pageClass.equals(""))// property is a pageList, then grab the pageClass
										 appliesToClassName = pageClass;	 
								
								}
								
						 
							} // for splitBefore Loop 
						 
					   
					   } // if loop for dot presence
					  						   
					   String realAppliesTo = AppliesTo;
										   
					    if(pg_temp2 != null){
							   
							   
							 // fill out the embedPage properties
							 embedPage.putString("pyClassName",realAppliesTo);
							 String propertyType = pg_temp2.getString(".pyPropertyMode");
							 embedPage.putString("pyPropertyType",propertyType);
							 
							 String propertyLabel = pg_temp2.getString(".pyLabel");
							 embedPage.putString("pyPropertyLabel",propertyLabel);
							 
							 embedPage.putString("pyModelClass",modelClass);
							 embedPage.putString("pyWorkTypeSelected",workTypeSelected);
							 String insKey = pg_temp2.getString(".pzInsKey");
							 embedPage.putString("pzInsKey",insKey);
							
							 // ADD EVERY EMBEDPAGETO THE PAGELIST OF MAIN CLIPBOARD PAGE 
							 
							 allModelWorkTypesPage.getProperty(".pxResults").add(embedPage);
											
						}// if loop
			 
					}// while propertyList loop 
					
					
				} // if modelPage is not null
				
			} // if loop All work Types
				
		}// while loop workTypesize


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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Open Model if it exists, this is for UI conditions.
 * <p>
 * Step 3 [OPEN] <code>obj-open</code> [on page openModelInstance] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "obj-open");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("pzFirstTimeLoad", "Pega-Landing-Process-FieldLevelAuditing", "Rule-Obj-Model");
if (pz__1) {
// branch to block 
nextBlock = "";
pega.activityStepSkipped("Jump To Step");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("obj-open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  obj-open
String pz_3 = "openModelInstance";
myStepPage = tools.findPage(pz_3, true);
// Expression: 
// Expression: Rule-Obj-Model
myStepPage = tools.getThread().createPage("Rule-Obj-Model", pz_3);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_4, myStepPage, scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("selectedRow", "Pega-Landing-Process-FieldLevelAuditing"), ImmutablePropertyInfo.TYPE_TEXT), "siN", false, false);
}
{
    pega.setViaPropRef(".pyModelName", pRef_6, myStepPage, "pyTrackSecurityChanges", "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "openModelInstance", "", false, false);
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
boolean pz__3 = pega.invokeWhen("stepStatusGood", "Pega-Landing-Process-FieldLevelAuditing", "Rule-Obj-Model");
if (pz__3) {
// branch to block 
nextBlock = "";
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadModel - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "obj-open",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step3_circum0 definition

/**
 * Copy the updateTime to selectedRow.
 * <p>
 * Step 4 <code>property-set</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__5 = pega.invokeWhen("pzWhenModel", "Pega-Landing-Process-FieldLevelAuditing", "Pega-Landing-Process-FieldLevelAuditing");
if (!pz__5) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadModel - Precondition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("property-set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  property-set
{
    pega.setViaPropRef(".pxFLAUpdateDateTime", pRef_7, pega.findPageWithException("selectedRow", "Pega-Landing-Process-FieldLevelAuditing"), scalarValueQuery_8.resolveToString(tools, pega.findPageWithException("openModelInstance", "Rule-Obj-Model"), ImmutablePropertyInfo.TYPE_DATETIME), "sMY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "property-set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

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

public static final String[] pRef_4 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyModelName", "" };
public static final String[] pRef_7 = new String[] { "", "", "pxFLAUpdateDateTime", "" };
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pySelectedWorkType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pxUpdateDateTime").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGA-LANDING-PROCESS-FIELDLEVELAUDITING PZLOADMODEL #20180713T143059.030 GMT", "Pega-Landing-Process-FieldLevelAuditing pzLoadModel", "Pega-LP-ProcessAndRules", "08-01-01", false, true, "", "ACTIVITY", "20180713T143059.030 GMT" ,"Rule-Obj-Activity"); }
