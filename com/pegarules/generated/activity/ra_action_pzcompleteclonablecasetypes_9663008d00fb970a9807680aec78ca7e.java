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
public class ra_action_pzcompleteclonablecasetypes_9663008d00fb970a9807680aec78ca7e extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzCompleteClonableCaseTypes.Code_Pega_List.Action");
	public ra_action_pzcompleteclonablecasetypes_9663008d00fb970a9807680aec78ca7e(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CaseTypes"))) {
nextBlock = "";
ClipboardProperty pz_7 = pega.findDataPage("D_pxGetClonableCaseTypesOfApplication", true, "ApplicationName", tools.getParamValue("ApplicationName"), "ApplicationVersion", tools.getParamValue("ApplicationVersion"), "ApplicationPage", tools.getParamValue("ApplicationPage")).getIfPresent("pxResults");
pageRef = pz_7;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("CaseTypes"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT Step: 3 Circum: 0" );
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
	"Rule-Obj-Activity:PZCOMPLETECLONABLECASETYPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCOMPLETECLONABLECASETYPES","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT","!PZCOMPLETECLONABLECASETYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1958794322)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT:20180713T140959.151 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8f8ea70bac70dba0b1e16c2368680ed3";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Check if we have required  params.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_ApplicationPage = tools.findPage(tools.getParamValue("ApplicationPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ApplicationPage==\"\"");
try {
boolean pz_2 = (tools.getParamValue("ApplicationPage").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ApplicationPage==\"\"",pz_2);
if (!pz_2) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ApplicationPage==\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ApplicationName == \"\" || param.ApplicationVersion == \"\"");
try {
boolean pz_3 = ((tools.getParamValue("ApplicationName").equals("")) || (tools.getParamValue("ApplicationVersion").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ApplicationName == \"\" || param.ApplicationVersion == \"\"",pz_3);
if (pz_3) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzCompleteClonableCaseTypes - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ApplicationName == \"\" || param.ApplicationVersion == \"\" " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Check if we are building on Custom/PegaRULES, If so exit.
 * <p>
 * Step 2 <code>Java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_ApplicationPage = tools.findPage(tools.getParamValue("ApplicationPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ApplicationPage==\"\"");
try {
boolean pz_4 = (tools.getParamValue("ApplicationPage").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ApplicationPage==\"\"",pz_4);
if (pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ApplicationPage==\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "ApplicationPage.pyProductName==\"PegaRULES\"");
try {
boolean pz_6 = (scalarValueQuery_5.resolveToString(tools, pega.findPage(tools.getParamValue("ApplicationPage"), "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT).equals("PegaRULES"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "ApplicationPage.pyProductName==\"PegaRULES\"",pz_6);
if (pz_6) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzCompleteClonableCaseTypes - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("ApplicationPage.pyProductName==\"PegaRULES\" " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Get all case types including children and their children...
 * <p>
 * Step 3 [CaseTypes] <code>Java</code> [on page D_pxGetClonableCaseTypesOfApplication[ApplicationPage:param.ApplicationPage, ApplicationName:param.ApplicationName, ApplicationVersion: param.ApplicationVersion].pxResults] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_ApplicationPage = tools.findPage(tools.getParamValue("ApplicationPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ParameterPage currParams = tools.getParameterPage();
String appPageName = currParams.getString("ApplicationPage");

if("".equals(appPageName)) {
  StringMap keys = new HashStringMap();
  keys.putString("pyProductName", currParams.getString("ApplicationName"));
  keys.putString("pyProductVersion", currParams.getString("ApplicationVersion"));
  keys.putString("pxObjClass", "Rule-Application");
  try {
    ClipboardPage appPage = tools.getDatabase().open(keys, false);
    //If for some reason application doesn't exist, exit processing
    if(appPage==null) {
      return false;
    }
    //Otherwise, rename the page for use below
    appPage.rename("TempAppPage");
    appPageName = appPage.getName();
  } catch(DatabaseException e) {
    oLog.error(e);
  }
}

//All work metadata listed for D_pxGetClonableCaseTypesOfApplication (for lookup purposes)
final ClipboardProperty casesOfApp = tools.findPage(appPageName).getProperty("pyWorkMetaData"); 

class childCaseTypes {
  ClipboardPage primPage = tools.getPrimaryPage(); 
  ClipboardProperty resultsList = primPage.getProperty("pxResults"); // complete data page
  ClipboardProperty sourceResultsList = tools.getStepPage().getParentPage().getProperty("pxResults"); // Clonable case types data page D_pxGetClonableCaseTypesOfApplication
  
  /* Inner class for child case types */
  childCaseTypes(ClipboardPage currentPage) {
    String currCaseTypeClass = currentPage.getString("pyClassName");
    //Only add the case types that have been selected and
    //if the case type has not been added yet, then add it and it's children
    if(currentPage.getBoolean("pySelected") && !pega_rules_utilities.IsInPageList(currCaseTypeClass, "pyClassName", resultsList)) {
      resultsList.add(currentPage);
      addChildCaseTypes(currCaseTypeClass);
    }
  }
    
  /* Add child case types of the parent to the page */
  void addChildCaseTypes(String currCaseTypeClass){  
    ParameterPage pp = new ParameterPage();
    StringMap casetype = new HashStringMap();
    casetype.putString("pxObjClass", "Rule-Obj-CaseType");
    casetype.putString("pyPurpose", "pyDefault");
    casetype.putString("pyClassName", currCaseTypeClass);
    pp.putString("pyCaseTypePurpose","GETCOVERABLEWORKTYPEINFO");
    pp.putString("PageListName", "CoverableClassInfo");
    try {
      tools.doAction(casetype, null, pp);
    } catch (Exception e) {
      oLog.error("Error in pzCompleteClonableCaseTypes doAction: " + e);
    }   
    
    try {
      ClipboardPage coverableClassesPage = tools.findPage("CoverableClassInfo");
      if (coverableClassesPage != null) {
        ClipboardProperty coverableClassResults = coverableClassesPage.getProperty("pxResults");
		for(int j = 1; j <= coverableClassResults.size(); j++) {
          String coverableClass = coverableClassResults.getPageValue(j).getString("pyClass");
          // Check if the class exists. 
          if(tools.getDatabase().getClassDef(coverableClass) != null){
            // Check if its in the complete clonable data page list If not, go ahead add to the result list 
            if(!pega_rules_utilities.IsInPageList(coverableClass, "pyClassName", resultsList)) {
              ClipboardPage newPage = tools.createPage("Rule-Obj-CaseType", "");
              newPage.putString("pyClassName", coverableClass);
              // add label, description
              newPage.putString("pyLabel", tools.getDictionary().getClassInfo(coverableClass).fromDefinition("pyLabel"));
              newPage.putString("pyDescription", tools.getDictionary().getClassInfo(coverableClass).fromDefinition("pyDescription"));

              //Update entry with correct worktype name, icon and prefix            
              updateClassInfoInList(newPage, coverableClass);

              resultsList.add(newPage);
              // call for recursion         
              addChildCaseTypes(coverableClass);
            }
          }
        }
      }
    } catch (Exception e) {
      oLog.error("Error in pzCompleteClonableCaseTypes: " + e);
    }
  }
  
 /* Update entry in complete list to contain work prefix, work type and work icon information.
  * This is incase a child case was previously added
  */
  void updateClassInfoInList(ClipboardPage caseEntry, String classToCheck) {
    //Add work type name, prefix and icon if present on application workmetadata
    int indexInList = pega_rules_utilities.IndexInPageList(classToCheck, "pyWorkTypeImplementationClassName", casesOfApp);
    if(indexInList != -1) {
      String workPrefix = casesOfApp.getPageValue(indexInList).getString("pyWorkPrefix");
      String workTypeName = casesOfApp.getPageValue(indexInList).getString("pyWorkTypeName");
      String workIcon = casesOfApp.getPageValue(indexInList).getString("pyWorkIcon");
      caseEntry.putString("pyWorkPrefix", workPrefix);
      caseEntry.putString("pyWorkTypeName", workTypeName);
      caseEntry.putString("pyWorkIcon", workIcon);
      
      ArrayList<ClipboardPage> entryInList = pega_rules_utilities.findInPageList(classToCheck, "pyClassName", sourceResultsList);
      //Some child case types might not be displayed due to not being selected
      if(entryInList.size() > 0 ) {
        ClipboardPage existingEntry = entryInList.get(0);
        //Set pyShowInNewWorkMenu for new application's child case type based on whether it was selected
        caseEntry.putString("pyShowInNewWorkMenu", existingEntry.getString("pySelected"));
      }
    }
  }
}

/* Instantiate the list */
try {
  new childCaseTypes(myStepPage);
} catch(Throwable e) {
  oLog.error(e);
  throw new PRRuntimeException(e);
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

public ClipboardPage pageParam_ApplicationPage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_ApplicationPage = null;
}

private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCOMPLETECLONABLECASETYPES #20180713T140959.151 GMT", "Code-Pega-List pzCompleteClonableCaseTypes", "Pega-ProcessArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T140959.151 GMT" ,"Rule-Obj-Activity"); }
