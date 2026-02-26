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
public class ra_action_pztrimlog_c61a0aa83dbf68ea6e7bdf92c82cf7f5 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzTrimLog.Log_JobScheduler.Action");
	public ra_action_pztrimlog_c61a0aa83dbf68ea6e7bdf92c82cf7f5(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT	Pega-SystemOperations:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT Step: 3 Circum: 0" );
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
	"Rule-Obj-Activity:PZTRIMLOG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZTRIMLOG","Rule-Obj-Activity","LOG-JOBSCHEDULER",false,"","Pega-SystemOperations","08-08-01","RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT","!PZTRIMLOG",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-526617812)
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
//	RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT:20220519T112318.173 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "dfe63e048bf49470c97eeba277ebdd29";
	}

	public String getDefinitionAppliesToClass() {
		return "Log-JobScheduler";
	}
public String getAspect() {
return "Action";
}
/**
 * Read the DSS to get purge policy for Log-JobScheduler.
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
//Default value for purge policy 
purgeAgeInDaysForJobSchedulerHistory = 7;
purgeMaxCountForJobSchedulerHistory = 0; //by default disabled for backward compatibility

//Read age policy
try{
  
  final String ageStr = tools.getSystemSettings().getDynamic("Pega-RulesEngine", "purgeAgeInDaysForJobSchedulerHistory");
  if(ageStr != null) {
    final int ageInt = Integer.parseInt(ageStr);
    if(ageInt < 0) {
      oLog.error("DASS setting value for purgeAgeInDaysForJobSchedulerHistory has negative value: %d.", ageInt);    
    } else {
      purgeAgeInDaysForJobSchedulerHistory = ageInt;
    }
  }
  
}catch(Exception e){
  oLog.error("Unexpected failure reading purgeAgeInDaysForJobSchedulerHistory.", e);
}

//Read count policy
try{
  
  final String countStr = tools.getSystemSettings().getDynamic("Pega-RulesEngine", "purgeMaxCountForJobSchedulerHistory");
  if(countStr != null) {
    final int countInt = Integer.parseInt(countStr);
    if(countInt < 0) {
      oLog.error("DASS setting value for purgeMaxCountForJobSchedulerHistoryy has negative value: %d.", countInt);    
    } else {
      purgeMaxCountForJobSchedulerHistory = countInt;
    }
  }
  
}catch(Exception e){
  oLog.error("Unexpected failure reading purgeMaxCountForJobSchedulerHistory.", e);
}
oLog.info(
  "Purge policy {purgeAgeInDaysForJobSchedulerHistory: %d; purgeMaxCountForJobSchedulerHistory: %d}",
  purgeAgeInDaysForJobSchedulerHistory,
  purgeMaxCountForJobSchedulerHistory
);
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
 * By default we trim Log-JobScheduler by time.
 * <p>
 * Step 2 <code>Call Log-.TrimLog</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Log-.TrimLog");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.purgeMaxCountForJobSchedulerHistory==0");
try {
boolean pz_1 = (purgeMaxCountForJobSchedulerHistory == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.purgeMaxCountForJobSchedulerHistory==0",pz_1);
if (!pz_1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.purgeMaxCountForJobSchedulerHistory==0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Log-.TrimLog", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Log-.TrimLog
if (myStepPage == null) {
}
// Calling Activity : Log-.TrimLog

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: Log-JobScheduler
newParamsPage.putParamValue("logClass", PropertyInfo.TYPE_TEXT, "Log-JobScheduler");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: Local.purgeAgeInDaysForJobSchedulerHistory
String pz_2 = Integer.toString(purgeAgeInDaysForJobSchedulerHistory);
newParamsPage.putParamValue("daysAgo", PropertyInfo.TYPE_INTEGER, pz_2);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "TrimLog", "Log-JobScheduler", "Log-");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Log-.TrimLog",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Otherwise we trim Log-JobScheduler by max count.
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.purgeMaxCountForJobSchedulerHistory != 0");
try {
boolean pz_3 = (purgeMaxCountForJobSchedulerHistory != 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.purgeMaxCountForJobSchedulerHistory != 0",pz_3);
if (!pz_3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.purgeMaxCountForJobSchedulerHistory != 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
final com.google.common.base.Stopwatch profiler = com.google.common.base.Stopwatch.createStarted();
final com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase)tools.getDatabase();
long removedLogs = 0;
//Collect jobs with big log volume
final Map<String, Long> bigLogsVolumeByJob = new java.util.HashMap<>();
try{
  final ResultSetIterator rs = db.executeNativeSQLReturnResultSet(
    db.getNativeSQLBuilder()
    .select(
      com.pega.pegarules.priv.database.sqlgen.NativeSQL.field(
        "jl", 
        "pxJobName", 
        "JobName"
      ),
      com.pega.pegarules.priv.database.sqlgen.NativeSQL.aggregateField(
        com.pega.pegarules.priv.database.sqlgen.constants.AggregateType.COUNT, 
        "jl", 
        "pxJobName", 
        "JobCount"
      )
    )
    .from("Log-JobScheduler", "jl")
    .having(
      com.pega.pegarules.priv.database.sqlgen.NativeSQL.havingFilter(
        "A",
        "pxJobName",
        com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.GT,
        String.valueOf(1),
        com.pega.pegarules.priv.database.sqlgen.constants.AggregateType.COUNT
      )
    )
    .havingFilterLogic("A")
    .setMaxRecords(0L), 
    tools.getThread()
  ).getResults();
  
  while(rs.hasNext()) {
    final StringMap stats = rs.next();
    bigLogsVolumeByJob.put(
      stats.getString("JobName"),
      Long.parseLong(stats.getString("JobCount"))
    );
  }
  rs.close();

} catch(Exception e) {
  oLog.error("Unexpected failure.", e);
}

//Trim logs in batches
final int batchSize = 1000;
for(Map.Entry<String, Long> bigLogsVolume : bigLogsVolumeByJob.entrySet()) {
  final String jobName = bigLogsVolume.getKey();
  long logsToRemove = bigLogsVolume.getValue() - purgeMaxCountForJobSchedulerHistory;
  
  while(logsToRemove > 0) {
    final long b = batchSize > logsToRemove ? logsToRemove : batchSize;
    logsToRemove -= b;
    
    //Select logs in batch ordered by create date
    final List<String> ids = new java.util.LinkedList<>();
    try {
      final ResultSetIterator rs = db.executeNativeSQLReturnResultSet(
        db.getNativeSQLBuilder()
        .select(
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field(
            "jl", 
            "pzInsKey", 
            "id"
          )
        )
        .from("Log-JobScheduler", "jl")
        .where(
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter(
            "A",
            "pxJobName",
            com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ,
            jobName,
            true
          )
        )
        .filterLogic("A")
        .orderBy(
          new com.pega.pegarules.priv.database.sqlgen.constants.SortType[]{com.pega.pegarules.priv.database.sqlgen.constants.SortType.ASC},
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field(
            "jl", 
            "pxCreateDateTime", 
            "created"
          )
        )
        .setMaxRecords(b), 
        tools.getThread()
      ).getResults();
      
      while(rs.hasNext()) {
        ids.add(rs.next().getString("id"));
      }
      rs.close();
      
    } catch(Exception e) {
      oLog.error("Unexpected failure.", e);
    }
    
    if(ids.isEmpty()) {
      break;
    }
   
    //Delete logs in batch
    try {
      db.executeNativeSQL(
        "deleteStatement",
        db.getNativeSQLBuilder()
        .deleteFromClass("Log-JobScheduler")
        .where(
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter(
            "A",
            "pzInsKey",
            com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.IN,
            ids.toArray(new String[ids.size()])
          )
        )
        .filterLogic("A"), 
        tools.getThread()
      );
      final ClipboardPage cp = tools.findPage("deleteStatement");
      if(cp != null) {
        removedLogs += cp.getInteger("pxResultCount");
        cp.removeFromClipboard();
      }
      
    } catch(Exception e) {
      oLog.error("Unexpected failure.", e);
    }
  }
}
oLog.info("Deleted %d Log-JobScheduler in %s.", removedLogs, profiler);
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

public int purgeAgeInDaysForJobSchedulerHistory = 0;
public int purgeMaxCountForJobSchedulerHistory = 0;

public void initializeUserLocalVariables() {
	purgeAgeInDaysForJobSchedulerHistory = 0;
	purgeMaxCountForJobSchedulerHistory = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("purgeAgeInDaysForJobSchedulerHistory", Integer.toString(purgeAgeInDaysForJobSchedulerHistory));
	smRetVal.putString("purgeMaxCountForJobSchedulerHistory", Integer.toString(purgeMaxCountForJobSchedulerHistory));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY LOG-JOBSCHEDULER PZTRIMLOG #20220513T090348.794 GMT", "Log-JobScheduler pzTrimLog", "Pega-SystemOperations", "08-08-01", false, true, "", "ACTIVITY", "20220519T112318.173 GMT" ,"Rule-Obj-Activity"); }
