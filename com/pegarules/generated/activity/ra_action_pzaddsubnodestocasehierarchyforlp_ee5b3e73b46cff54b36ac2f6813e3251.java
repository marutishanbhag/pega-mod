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
public class ra_action_pzaddsubnodestocasehierarchyforlp_ee5b3e73b46cff54b36ac2f6813e3251 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzAddSubNodesToCaseHierarchyForLP.Rule_Obj_Class.Action");
	public ra_action_pzaddsubnodestocasehierarchyforlp_ee5b3e73b46cff54b36ac2f6813e3251(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_3 = pega.findPageWithException("CircumstancedRulesPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_3;
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
if ( "Rule-Obj-CaseType".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Rule-Obj-CaseType").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0_Rule_Obj_CaseType();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DONE"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT Step: 6 Circum: 0" );
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
	"Rule-Obj-Activity:PZADDSUBNODESTOCASEHIERARCHYFORLP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZADDSUBNODESTOCASEHIERARCHYFORLP","Rule-Obj-Activity","RULE-OBJ-CLASS",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT","!PZADDSUBNODESTOCASEHIERARCHYFORLP",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-643899722)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT:20180713T141120.325 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5ce25001d751add1d924bedff137cc79";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Class";
	}
public String getAspect() {
return "Action";
}
/**
 * Populating class properties.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// The CaseHierarchy pages contains all the metadata needed to populate
// the entire case hierarchy tree
ClipboardPage CaseHierarchy = tools.findPage("CaseHierarchy");

// Get the class & classgroup of the node we are attempting to populate the subnodes for.
ClipboardProperty ChildNodes = myStepPage.getProperty(".pxResults");
String classname = myStepPage.getString(".pyClassName");
String classGroup = myStepPage.getString(".pyClassGroup");
String classGroupSan = classGroup.replace('-','_');
//ClipboardPage classesInClassGroup = CaseHierarchy.getProperty(".pxClassesInClassGroups(" + classGroupSan + ")").getPageValue();
//ClipboardProperty cpClassesInClassGroup = classesInClassGroup.getProperty(".pxResults");

//BUG-53549:
if (classname.equals(classGroup)) {
// This class is the class group, and has a case type rule
// we want to show it as its own top level node so it can be manipulated
   myStepPage.putString(".pyClassGroupIndicator", "HASCLASSGROUP");
}

// See if this class has a casetype
String classSan = classname.replace('-', '_');
ClipboardProperty caseTypeForClass = CaseHierarchy.getIfPresent(".pxCaseTypes(" + classSan + ")");
if (caseTypeForClass != null)
{		
ClipboardPage caseTypePage = caseTypeForClass.getPageValue();



         ClipboardProperty activators = caseTypePage.getProperty(".pyActivators");
      myStepPage.putString("pyCategory",caseTypePage.getString("pyCategory"));

         myStepPage.getProperty("pzLPDependencies").setValue(activators.size());
  myStepPage.putString("pyDescription",caseTypePage.getString("pyDescription"));
  myStepPage.putString("pyOfflineEnabled",caseTypePage.getString("pyOfflineEnabled"));





ClipboardProperty coveredClasses = caseTypePage.getProperty(".pyCoverableClasses");
if(coveredClasses.size() > 0 && !"".equals(coveredClasses.getPageValue(1).getString(".pyClass")) )
{
                myStepPage.getProperty("pzLPCoverableCount").setValue(coveredClasses.size());
}

java.util.Iterator itCoveredClasses = coveredClasses.iterator();
while (itCoveredClasses.hasNext())
{
ClipboardProperty CoveredClassRef = (ClipboardProperty)itCoveredClasses.next();
ClipboardPage CoveredClassPage = CoveredClassRef.getPageValue();

	String maxCount = CoveredClassPage.getString(".pyMaxCount");
String required = CoveredClassPage.getString(".pyRequired");
boolean isManual = CoveredClassPage.getBoolean("pyManualStart");
boolean isAutomatic = CoveredClassPage.getBoolean("pyAutomaticStart");
ClipboardProperty cpInstantiationType = CoveredClassPage.getIfPresent(".pyInstantiationType");

// Get class group entry from pxClassesInClassGroups
String coveredclassname = CoveredClassPage.getString(".pyClass");

// BUG-41072: If covered class does not exist (deleted after case type rule was saved), ignore it
ClassDefinition coveredClassdef = tools.getDatabase().getClassDef(coveredclassname);
if (coveredClassdef == null) {
continue;
}

String coveredclassgroup = classGroup;
// Get the correct class group
if (!coveredclassname.equals("")) {
coveredclassgroup = pega_rules_default.getClassGroupName(coveredclassname);
}
String coveredclassgroupsan = coveredclassgroup.replace('-','_');
	
ClipboardPage refClassesInClassGroup = CaseHierarchy.getProperty(".pxClassesInClassGroups(" + coveredclassgroupsan + ")").getPageValue();
ClipboardProperty cpRefClassesInClassGroup = refClassesInClassGroup.getProperty(".pxResults");
java.util.Iterator classesInClassGroupIt = cpRefClassesInClassGroup.iterator();
// Find this covered class node in the pxClassesInClassGroups(glassgroup) and add it
while (classesInClassGroupIt.hasNext())
{
ClipboardProperty classRef = (ClipboardProperty)classesInClassGroupIt.next();
ClipboardPage classPage = classRef.getPageValue();
String candidateclass = classPage.getString(".pyClassName");
                                String candidateclasslabel = classPage.getString(".pyLabel");				


if (candidateclass.equals(coveredclassname))
{				
	// Checking if the circumstance or base is covered
	String circumstanceValue = CoveredClassPage.getString(".pyCircumstanceCaseTypeVal");
	boolean isBase = true;
	boolean alreadyCircumAdded = false;// if already circumstance added and now base details are populated
	if( circumstanceValue != null ){
		isBase = circumstanceValue.equals("")?true:false;
	}

	// checking if class is already added and if it is base or not. If base found populate the details

	java.util.ArrayList classesAdded = pega_rules_utilities.findInPageList(coveredclassname,".pyClassName",ChildNodes);
	if( classesAdded.size() > 0 ){
		classPage = (ClipboardPage)classesAdded.get(0);
		if( classPage.getString(".isBase").equals("true") || !isBase ){
 				continue;
		}
		else{
			alreadyCircumAdded = true;
		}
	}
	else{
		// Add this page to the list	
		ChildNodes.add(classPage);

		// Get the class node we just added
		classPage = ChildNodes.getPageValue(ChildNodes.size());
	}
	// set pyExpanded to true
		classPage.putString(".pyExpanded", "true");
	// set pyIsChildNode to true for showing / hiding remove option in the menu	
		classPage.putString(".pyIsChildNode", "true");

	if( isBase )
	{
			                
		
		if(cpInstantiationType != null)
		{
			String instantiationType = cpInstantiationType.getStringValue();
			
			if(instantiationType.equals("auto"))
			{
				isAutomatic = true;
				isManual = true;
			}
			else
			{
				isManual = true;
			}
		}
		
							 
		if(isManual && isAutomatic)
		{
			classPage.putString(".pzLPInstantiationType", tools.getLocalizedTextForString(".pyCaption","AutoAndManual"));	
		}
		else if(isManual)
		{
			classPage.putString(".pzLPInstantiationType", tools.getLocalizedTextForString(".pyCaption","ManualCreation"));
		}
		else if(isAutomatic)
		{
			classPage.putString(".pzLPInstantiationType", tools.getLocalizedTextForString(".pyCaption","AutoCreation"));
		}
		else
		{
			classPage.putString(".pzLPInstantiationType", "");
		}
		classPage.putString(".pzLPRequired",required);
	
		classPage.putString(".isBase",""+isBase);
		if(alreadyCircumAdded)continue;
	}
	// Before we check for children of this node, let's make sure we're not in a loop.
	boolean inLoop = false;
	ClipboardPage myParentPage = myStepPage;
	while (myParentPage.isEmbedded())
	{
		String parentClass = myParentPage.getString(".pyClassName");
		if (parentClass.equals(coveredclassname))
		{
			inLoop = true;
			break;
		}
		myParentPage = myParentPage.getParentPage();
	}

	if (inLoop)
	{
		classPage.putString("pyUsage", "repeat");
		classPage.putString("pyTreeGridIcon", "images/pyDisabledCase.gif");
	}
	else {
		// Now populate the child node's children
		pega_rules_utilities.callActivity(classPage, "pzAddSubNodesToCaseHierarchyForLP", null);
			}
	break;
}
}
}
}
else
{       String iconPath = "images/pyCaseTreeTask.gif";

try{
 StringMap keys = new HashStringMap();
 keys.putString("pxObjClass", "Rule-Obj-CaseType");
 keys.putString("pyClassName", classname);
 keys.putString("pyPurpose", "pyDefault");		
  	 ClipboardPage caseTypePage = tools.getDatabase().open(keys, true);	
 if(caseTypePage != null){ 
           String caseTypeClassName = caseTypePage.getString("pyClassName");

   //  Checking if the case type is from the same class 
   if(classname.equals(caseTypeClassName)){
            iconPath = caseTypePage.getString("pyIcon"); 			 
   }
 }
}catch(DatabaseException ex){
 oLog.error("### problem: " + ex.getMessage());
} finally{	
 myStepPage.putString("pyTreeGridIcon", iconPath);			
 myStepPage.putString("pyUsage", "NoCaseType");
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Check if in application.
 * <p>
 * Step 2 <code>java</code><br>
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
String className = myStepPage.getString("pyClassName");
String cleanName = pega_processarchitect_pzprocessarchitect.pzPageNameClean(className);
if (className.equals(tools.findPage("CaseHierarchy").getString(".pxClassesInApplicationWorkTypes(" + cleanName + ")"))) {
  // If in cache of application work type class names, flag it
  myStepPage.putString("pzLPInApplicationWorkTypes", "true");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Get all the case type circumstances.
 * <p>
 * Step 3 <code>Call pzGetAllCircumstancedCaseTypes</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetAllCircumstancedCaseTypes");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetAllCircumstancedCaseTypes", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetAllCircumstancedCaseTypes
if (myStepPage == null) {
}
// Calling Activity : pzGetAllCircumstancedCaseTypes

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: Primary.pyClassName
newParamsPage.putParamValue("AppliesTo", PropertyInfo.TYPE_TEXT, scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));

pega.invokeActivity(myStepPage, newParamsPage, "pzGetAllCircumstancedCaseTypes", "Rule-Obj-Class", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetAllCircumstancedCaseTypes",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Populate circumstance data.
 * <p>
 * Step 4 <code>Java</code> [on page CircumstancedRulesPage.pxResults] <br>
 */
public boolean step4_circum0_Rule_Obj_CaseType() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
class Temp{

	public String getFormattedDate(String dateValue){
		String propVal = "";
		java.util.Date strDate = tools.getDateTimeUtils().parseDateTimeStamp(dateValue);
		if (strDate != null) {
			propVal = PRDateFormat.format(null, "GMT",PRDateFormat.DEFAULT_DATETIME_SHORT_YYYY, strDate);
		}
		return propVal;
	}	
}

if (myStepPage != null )
{
	Temp te = new Temp();
	tools.getPrimaryPage().putString(".pxResults(<prepend>).pyClassName",myStepPage.getString(".pyClassName"));
	tools.getPrimaryPage().putString(".pxResults(1).pxObjClass", "Rule-Obj-Class");
         tools.getPrimaryPage().putString(".pxResults(1).pyDerivesFrom", tools.getPrimaryPage().getString(".pyDerivesFrom"));
	String genCir = "";
	String dateCir = "";
	String dateRange = "";
	String propLabel = "";
	String propVal = "";
	String prop = "";
	tools.getPrimaryPage().putString(".pxResults(1).pyTreeGridIcon", "images/lvcircumstance.gif");
	tools.getPrimaryPage().putString(".pxResults(1).pyCircumstanceProp", myStepPage.getString("pyCircumstanceProp"));
	tools.getPrimaryPage().putString(".pxResults(1).pyCircumstanceVal", myStepPage.getString("pyCircumstanceVal"));
	tools.getPrimaryPage().putString(".pxResults(1).pyCircumstanceDateProp", myStepPage.getString("pyCircumstanceDateProp"));
	tools.getPrimaryPage().putString(".pxResults(1).pyCircumstanceDate", myStepPage.getString("pyCircumstanceDate"));
	tools.getPrimaryPage().putString(".pxResults(1).pzInsKey", myStepPage.getString(".pzInsKey"));
	tools.getPrimaryPage().putString(".pxResults(1).pyUsage", "Circumstance");
	tools.getPrimaryPage().putString(".pxResults(1).pyRuleStarts", myStepPage.getString("pyRuleStarts"));
	tools.getPrimaryPage().putString(".pxResults(1).pyRuleEnds", myStepPage.getString("pyRuleEnds"));
    tools.getPrimaryPage().putString(".pxResults(1).pyRuleSet", tools.getPrimaryPage().getString("pyRuleSet"));
    tools.getPrimaryPage().putString(".pxResults(1).pyDescription", tools.getLocalizedTextForString(".pyCaption","Specialized"));

	//Prepare Label for Case Designer tree page
	if(!myStepPage.getString("pyCircumstanceDateProp").equals(""))
	{
		prop = myStepPage.getString("pyCircumstanceDateProp");
 	         if( !prop.startsWith(".") )
		       prop = "."+prop;
		propLabel = pega_rules_utilities.getLabel(prop,myStepPage.getString(".pyClassName"),tools);
		dateCir = propLabel + " is " + te.getFormattedDate(myStepPage.getString("pyCircumstanceDate"));
	}
	if(!myStepPage.getString("pyCircumstanceProp").equals(""))
	{
		prop = myStepPage.getString("pyCircumstanceProp");
 	         if( !prop.startsWith(".") )
		        prop = "."+prop;
		propLabel = pega_rules_utilities.getLabel(prop,myStepPage.getString(".pyClassName"),tools);
		genCir = propLabel + " is " + myStepPage.getString("pyCircumstanceVal");
	}
	if (!myStepPage.getString("pyRuleStarts").equals(""))
	{
		if (!myStepPage.getString("pyRuleEnds").equals(""))
		{
			dateRange = "Starting " + te.getFormattedDate(myStepPage.getString("pyRuleStarts")) + " Ending " + te.getFormattedDate(myStepPage.getString("pyRuleEnds"));
		}
		else
		{
			dateRange = "Starting " + te.getFormattedDate(myStepPage.getString("pyRuleStarts"));
		}
	}
	else
		if (!myStepPage.getString("pyRuleEnds").equals(""))
		{
			dateRange = "Ending " + te.getFormattedDate(myStepPage.getString("pyRuleEnds"));
		}

	String circumstanceLabel = (genCir + " " + dateCir + " " + dateRange).trim();
	tools.getPrimaryPage().putString(".pxResults(1).pyLabel", circumstanceLabel);
         circumCount++;  
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
} // end of step4_circum0_Rule_Obj_CaseType definition

/**
 * Set is legacy and specialization count.
 * <p>
 * Step 5 <code>Property-Set</code><br>
 */
public boolean step5_circum0() {
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
    pega.setViaPropRef(".pzLPIsLegacy", pRef_4, myStepPage, (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("NoCaseType")), "sSN", false, true);
}
{
    pega.setViaPropRef(".pzLPSpecializationCount", pRef_6, myStepPage, ((circumCount == 0) ? "None" : (Integer.toString(circumCount) + ((circumCount == 1) ? " specialization" : " specializations"))), "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Remove SLA Page.
 * <p>
 * Step 6 [DONE] <code>Page-Remove</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: CircumstancedCaseType
pageRemove(tools.findPage("CircumstancedCaseType"));
// Expression: CaseTypePage
pageRemove(tools.findPage("CaseTypePage"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
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

public int circumCount = 0;

public void initializeUserLocalVariables() {
	circumCount = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("circumCount", Integer.toString(circumCount));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_6 = new String[] { "", "", "pzLPSpecializationCount", "" };
public static final String[] pRef_4 = new String[] { "", "", "pzLPIsLegacy", "" };
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyUsage").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PZADDSUBNODESTOCASEHIERARCHYFORLP #20180713T141120.325 GMT", "Rule-Obj-Class pzAddSubNodesToCaseHierarchyForLP", "Pega-ProcessArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T141120.325 GMT" ,"Rule-Obj-Activity"); }
