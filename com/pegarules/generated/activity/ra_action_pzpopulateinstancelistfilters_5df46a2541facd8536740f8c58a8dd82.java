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
public class ra_action_pzpopulateinstancelistfilters_5df46a2541facd8536740f8c58a8dd82 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzPopulateInstanceListFilters.Rule_.Action");
	public ra_action_pzpopulateinstancelistfilters_5df46a2541facd8536740f8c58a8dd82(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
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
	"Rule-Obj-Activity:PZPOPULATEINSTANCELISTFILTERS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATEINSTANCELISTFILTERS","Rule-Obj-Activity","RULE-",false,"","Pega-Desktop","08-01-01","RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT","!PZPOPULATEINSTANCELISTFILTERS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",315648089)
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
//	RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT:20180713T135421.674 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "04e7eb0a3b0f3ae24f776a8393b61f51";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
	}
public String getAspect() {
return "Action";
}
/**
 * Add filter.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.AppliesTo!=\"\" &amp;&amp; .pyStreamName!=\"pyInstanceList\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("Param.AppliesTo!=\"\" && .pyStreamName!=\"pyInstanceList\"", "FUAInstance-NullMyStepPage");
}
boolean pz_2 = ((!(tools.getParamValue("AppliesTo").equals(""))) && (!(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pyInstanceList"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.AppliesTo!=\"\" &amp;&amp; .pyStreamName!=\"pyInstanceList\"",pz_2);
if (!pz_2) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.AppliesTo!=\"\" &amp;&amp; .pyStreamName!=\"pyInstanceList\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClassDefinition objClassDef = tools.getDatabase().getClassDef(tools.getParamValue("ObjectClass"));
boolean classNameExposed = false;

try {
  if(objClassDef.isPropertyExposed(".pyClassName",tools)) {
    classNameExposed = true;
  }      	
} catch(DatabaseException e) {
  oLog.error("Error occured while chekcing if Property Exposed for property .pyClassName"+ e.getMessage(), e);
}

if(classNameExposed) {
  ClipboardProperty cbpFilters = myStepPage.getProperty(".pyUI.pyBody.pyUIFilters.pyFilter");
  ClipboardPage pgField = tools.createPage("Embed-ReportFilter","");   
  String className= tools.getParamValue("AppliesTo");
  String classFilter = "\""+ className +"\"";
  //Get ancestors if doing inheritance
  if(tools.getParamValue("IncludeInherit").equals("true")){   
    ClassDefinition cd = tools.getDatabase().getClassDef(className);
    if(cd!=null){
        List l = cd.getAllAncestorClassesListWithoutDuplicates();
        for(int i=0;i<l.size();i++){
          classFilter+=",\""+l.get(i)+"\"";
        }
    }
  }

  pgField.putString(".pyDataType","Text");
  pgField.putString(".pyACIsAssoc","false");
  pgField.putString(".pyFilterName",".pyClassName");
  pgField.putString(".pyFilterOperation","=");
  pgField.putString(".pyFilterValue",classFilter);
  pgField.putString(".pyLogicLabel","IntanceList_Filter");
  cbpFilters.add(1,pgField);
  pgField.removeFromClipboard();

  // Add null value filter to get those record types which does not have applies to class in the rule creation
  pgField = tools.createPage("Embed-ReportFilter",""); 
  pgField.putString(".pyDataType","Text");
  pgField.putString(".pyACIsAssoc","false");
  pgField.putString(".pyFilterName",".pyClassName");
  pgField.putString(".pyFilterOperation","IS NULL");
  pgField.putString(".pyLogicLabel","Class-Null-Value-Filter");
  cbpFilters.add(1,pgField);
  pgField.removeFromClipboard();
  
  String existingFilter = myStepPage.getString(".pyUI.pyBody.pyUIFilters.pyFilterLogic");
  if(existingFilter != null && !existingFilter.isEmpty()) {
    existingFilter = existingFilter + " AND ";
  }
  myStepPage.putString(".pyUI.pyBody.pyUIFilters.pyFilterLogic",existingFilter + "(IntanceList_Filter OR Class-Null-Value-Filter)");
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
 * Add filter to hide internal rules.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ruleResolved||@equals(param.ObjectClass,\"Rule-Utility-Library\")");
try {
boolean pz_3 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "ruleResolved") || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ObjectClass"), "Rule-Utility-Library" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ruleResolved||@equals(param.ObjectClass,\"Rule-Utility-Library\")",pz_3);
if (!pz_3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ruleResolved||@equals(param.ObjectClass,\"Rule-Utility-Library\") " + anyException.getMessage(), anyException);
}
boolean pz__1 = pega.invokeWhen("pzDiagnosticFilterEnabled", "Rule-", "Rule-");
if (pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.startsWith(@String.toUpperCase(param.ObjectClass),\"RULE-\")");
try {
boolean pz_4 = (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, "String", new Object[] { pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, "String", new Object[] { tools.getParamValue("ObjectClass") }), "RULE-" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.startsWith(@String.toUpperCase(param.ObjectClass),\"RULE-\")",pz_4);
if (!pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.startsWith(@String.toUpperCase(param.ObjectClass),\"RULE-\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardProperty cbpFilters = myStepPage.getProperty(".pyUI.pyBody.pyUIFilters.pyFilter");

ClipboardPage pgField = tools.createPage("Embed-ReportFilter",""); 
pgField.putString(".pyDataType","Text");
pgField.putString(".pyACIsAssoc","false");
pgField.putString(".pyFilterName",".pyMethodStatus");
pgField.putString(".pyFilterOperation","!=");
pgField.putString(".pyFilterValue","Internal");
pgField.putString(".pyLogicLabel","Hide-Internal-Rule-Filter");

cbpFilters.add(cbpFilters.size()+1,pgField);
pgField.removeFromClipboard();

pgField = tools.createPage("Embed-ReportFilter",""); 
pgField.putString(".pyDataType","Text");
pgField.putString(".pyACIsAssoc","false");
pgField.putString(".pyFilterName",".pyMethodStatus");
pgField.putString(".pyFilterOperation","IS NULL");
pgField.putString(".pyLogicLabel","Internal-Null-Value-Filter");

cbpFilters.add(cbpFilters.size()+1,pgField);
pgField.removeFromClipboard();

String existingFilter = myStepPage.getString(".pyUI.pyBody.pyUIFilters.pyFilterLogic");
if(existingFilter != null && !existingFilter.isEmpty()) {
  existingFilter = existingFilter + " AND ";
}
myStepPage.putString(".pyUI.pyBody.pyUIFilters.pyFilterLogic",existingFilter + "(Hide-Internal-Rule-Filter OR Internal-Null-Value-Filter)");
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
 * Add filter to hide deprecated rules.
 * <p>
 * Step 3 <code>Java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ruleResolved||@equals(param.ObjectClass,\"Rule-Utility-Library\")");
try {
boolean pz_5 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "ruleResolved") || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ObjectClass"), "Rule-Utility-Library" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ruleResolved||@equals(param.ObjectClass,\"Rule-Utility-Library\")",pz_5);
if (!pz_5) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ruleResolved||@equals(param.ObjectClass,\"Rule-Utility-Library\") " + anyException.getMessage(), anyException);
}
boolean pz__3 = pega.invokeWhen("pzDiagnosticFilterEnabled", "Rule-", "Rule-");
if (pz__3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
} else {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
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

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyStreamName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE- PZPOPULATEINSTANCELISTFILTERS #20180713T135421.674 GMT", "Rule- pzPopulateInstanceListFilters", "Pega-Desktop", "08-01-01", false, true, "", "ACTIVITY", "20180713T135421.674 GMT" ,"Rule-Obj-Activity"); }
