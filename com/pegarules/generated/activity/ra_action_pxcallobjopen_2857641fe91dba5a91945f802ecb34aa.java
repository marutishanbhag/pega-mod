package com.pegarules.generated.activity;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
public class ra_action_pxcallobjopen_2857641fe91dba5a91945f802ecb34aa extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pxCallObjOpen._baseclass.Action");
	public ra_action_pxcallobjopen_2857641fe91dba5a91945f802ecb34aa(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY @BASECLASS PXCALLOBJOPEN #20191003T091152.715 GMT	Pega-SystemArchitect:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY @BASECLASS PXCALLOBJOPEN #20191003T091152.715 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PXCALLOBJOPEN #20191003T091152.715 GMT Step: 1 Circum: 0" );
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
String pz_1 = resultPageName;
thisStepPage = tools.findPage(pz_1, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PXCALLOBJOPEN #20191003T091152.715 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
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
	"Rule-Obj-Activity:PXCALLOBJOPEN"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXCALLOBJOPEN","Rule-Obj-Activity","@BASECLASS",false,"","Pega-SystemArchitect","08-04-01","RULE-OBJ-ACTIVITY @BASECLASS PXCALLOBJOPEN #20191003T091152.715 GMT","!PXCALLOBJOPEN",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1324007991)
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
//	RULE-OBJ-ACTIVITY @BASECLASS PXCALLOBJOPEN #20191003T091152.715 GMT:20191003T091152.715 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "6b05c02ec4cfd2facaf25ffff26d1f8f";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
/**
 * Check the Declare page class and data source class to populate result.
 * <p>
 * Step 1 <code>java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
ParameterPage paramPage = tools.getParameterPage();
ClipboardPage results = null;
ClipboardPage primPage = tools.getPrimaryPage();
String primaryPageClass = paramPage.getString("pxObjClass");
String lookupClassName = paramPage.getString("pyLookupClassName");
boolean isListStructure = ("list".equals(paramPage.getString("pyPageStructure")))?true:false;
String runDTOnError = paramPage.getString("pyRunDataTransformOnError");
/* while opening the rule, the data page gets updated to new data page ui and xml but appropriate parameter page is not populated
   and previously it was classname, hence keeping class name if lookupClassName is empty */
// BUG-119615  line for backward compatibility
if(lookupClassName == null || lookupClassName.equals("")){
lookupClassName = primaryPageClass;
}//end of code
//lines for polymorhism changes
String responseDTName = paramPage.getString("pyResDataTransform");
ClassDefinition parentClassDef = tools.getDatabase().getClassDef(primaryPageClass); 

boolean isDescendant =false;

if(parentClassDef !=null) {
 isDescendant = parentClassDef.isAncestorOf(lookupClassName);    
} 

isExecuteOnDataPage =paramPage.getAsBoolean("pyExecuteOnDataPage");
//end 
boolean isOfSameClass= true;

if(!lookupClassName.equalsIgnoreCase(primaryPageClass))
	isOfSameClass = false;
 if(isExecuteOnDataPage) { 
           isOfSameClass = true;
 }
resultPageName = "D" + Thread.currentThread().getId() + System.nanoTime() ; //ThreadContainer.get().getSystemRandom().nextInt(10000);
resultPageName = resultPageName.replaceAll("-","_");


if(!isOfSameClass || isDescendant)
  paramPage.putString("pxObjClass",lookupClassName );//set pxObjClass to source class

//populate the result on the basis of class name either on primary or datasource.
boolean objOpenFailed = false;
try{
results = tools.getThread().getDatabase().open(paramPage, false);
paramPage.remove("pxObjClass");
}catch(DatabaseException dbEx){
throw new PRRuntimeException("Error loading Data Page: " , dbEx);
}
if(results == null)
	objOpenFailed = true;
String resultClass = null;
if(objOpenFailed){
	resultClass =  primPage.getString("pxObjClass");// If ObjOpen fails.
	results = tools.createPage(resultClass,resultPageName);

}else{
	resultClass = results.getString("pxObjClass");
}
//result class can be descendant of lookupClass
	ClassDefinition lookupClassDef = tools.getDatabase().getClassDef(lookupClassName); 
	boolean resultClassIsDescendantOfLookupClass =  lookupClassDef.isAncestorOf(resultClass);
	if(parentClassDef != null) {
        isDescendant = parentClassDef.isAncestorOf(resultClass);
    }  
	
	if(isDescendant && !isListStructure){
		if(resultClass.equals(lookupClassName)||resultClassIsDescendantOfLookupClass){//if class is the child we are looking for OR //child of lookupClassName
			ClipboardPage dummyPage = tools.createPage(resultClass,"");
			primPage.putAll(dummyPage);
		}
		else if(!primaryPageClass.equals(resultClass) && parentClassDef.isAncestorOf(resultClass)){//if a class is sibling			
          	primPage.addMessage("pzRecordExistsInSiblingClass\t" + resultClass + "\t" + lookupClassName);
		}
	}
	
	else if(!isOfSameClass){//if class is not in Hierarchy 
		//paramPage.putString("pxObjClass",primaryPageClass );//set pxObjClass to source class
	}
	else{// if parent class and child class are same , do nothing
	}
	if(objOpenFailed)//BUG-110195
	{
      // Below code is to show the keys entered by the user in the error message.
      String keyValues = new String();
      if(lookupClassName!=null && tools.getDatabase().getClassDef(lookupClassName)!=null)
      	{
      		java.util.List keysList = tools.getDatabase().getClassDef(lookupClassName).getKeyPropertyList();
        if(keysList!=null){
      		java.util.Iterator keysIterator = keysList.iterator();
      		while(keysIterator.hasNext()){
      			String keyProp = (String)keysIterator.next();
      			keyValues = keyValues +"  "+ keyProp + "=" +paramPage.getParameterValue(keyProp);
            }
      		}
      	}

	
      primPage.addMessage("pzNoRecordsForLookup \t" + keyValues);
	  primPage.getPage("pyErrorPage").putString("pyStatus","Fail");
	  primPage.getPage("pyErrorPage").putString("pyStatusMessage",primPage.getMessagesAll());
      
      results.addMessage("pzNoRecordsForLookup \t" + keyValues);
	  results.getPage("pyErrorPage").putString("pyStatus","Fail");
	  results.getPage("pyErrorPage").putString("pyStatusMessage",primPage.getMessagesAll());
 	}
if(responseDTName != null && !responseDTName.equals(""))
	{
	    ParameterPage dtParamPage = new ParameterPage();
	    java.util.Set keySet = paramPage.keySet();
	    java.util.Iterator paramItr = keySet.iterator();
	    //Copy params
		if(paramPage.getString("pyPassCurrentParamPageForRespDT") != null && !paramPage.getString("pyPassCurrentParamPageForRespDT").equals("true"))
		{	          
	       while(paramItr.hasNext()) 
	       {
	             String paramName = (String)paramItr.next();
	            if(paramName.toUpperCase().startsWith("PZ_RESDT"))
	             {
	                String name = paramName.substring(9);
	                String value = paramPage.getString(paramName);
	                if(!"".equals(name))
	                 dtParamPage.putString(name,value);
	            }
	       }
		}
		else 
		{
	   		dtParamPage = paramPage;
		}
	 	if(isExecuteOnDataPage) {
	 		//replace(sourcePageToCopyFrom)
			primPage.replace(results);			 
		 }	else {
	 		results.rename(resultPageName); // pyDataSourcePage
			dtParamPage.putParamValue("DataSource",resultPageName);
		}// Dont call DT when there are errors unless runDTOnError is checked
  	        if(!objOpenFailed || (objOpenFailed && "true".equals(runDTOnError) ) )
		       tools.applyModel(primPage,dtParamPage ,responseDTName);
	}
	else
	{
	primPage.replace(results);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Remove the interminent page.
 * <p>
 * Step 2 <code>Page-Remove</code> [on page local.resultPageName] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
// Expression: dummyPage
pageRemove(tools.findPage("dummyPage"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

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

public boolean isExecuteOnDataPage = false;
public String resultPageName = "";

public void initializeUserLocalVariables() {
	isExecuteOnDataPage = false;
	resultPageName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("isExecuteOnDataPage", Boolean.toString(isExecuteOnDataPage));
	smRetVal.putString("resultPageName", (resultPageName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : resultPageName.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY @BASECLASS PXCALLOBJOPEN #20191003T091152.715 GMT", "@baseclass pxCallObjOpen", "Pega-SystemArchitect", "08-04-01", false, false, "", "LOADDECLARATIVEPAGE", "20191003T091152.715 GMT" ,"Rule-Obj-Activity"); }
