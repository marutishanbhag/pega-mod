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
public class ra_action_pxgetblobsizefortablesinschema_5e8a95c823c41cb6c460d1341ebc1b2a extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pxGetBlobSizeForTablesInSchema.Code_Pega_DB_Schema.Action");
	public ra_action_pxgetblobsizefortablesinschema_5e8a95c823c41cb6c460d1341ebc1b2a(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-DB-SCHEMA PXGETBLOBSIZEFORTABLESINSCHEMA #20180713T132638.650 GMT	Pega-RulesEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-DB-SCHEMA PXGETBLOBSIZEFORTABLESINSCHEMA #20180713T132638.650 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-DB-SCHEMA PXGETBLOBSIZEFORTABLESINSCHEMA #20180713T132638.650 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
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
	"Rule-Obj-Activity:PXGETBLOBSIZEFORTABLESINSCHEMA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXGETBLOBSIZEFORTABLESINSCHEMA","Rule-Obj-Activity","CODE-PEGA-DB-SCHEMA",false,"","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY CODE-PEGA-DB-SCHEMA PXGETBLOBSIZEFORTABLESINSCHEMA #20180713T132638.650 GMT","!PXGETBLOBSIZEFORTABLESINSCHEMA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2090447668)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-DB-SCHEMA PXGETBLOBSIZEFORTABLESINSCHEMA #20180713T132638.650 GMT:20180713T132638.650 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e8f422d551c014aecad45b005f684f68";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-DB-Schema";
	}
public String getAspect() {
return "Action";
}
/**
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
String lockKey= "AllTableBlobs";
String databaseName = tools.getParamValue("databaseName");
String intervalHours = tools.getSystemSettings().getDynamic("Pega-RulesEngine", "database/databases/" + databaseName + "/BlobSizeAgentInterval");
int acqLock = 0;
com.pega.pegarules.priv.database.schema.PegaSchemaDesigner schemaDesigner = null;
try {
      oLog.debug("running pxGetBlobSizeForTablesInSchema every " + intervalHours + " hours");
      Integer interval = (intervalHours == null ? -1 : Integer.valueOf(intervalHours));

      ClipboardPage testAgentLastRun = tools.createPage("System-DatabaseInformation-Table", null);
  	  Date agentRunDate = null;
  
      if (databaseName != null) {
        if (interval > 0) {
          
      		schemaDesigner = ((PegaDatabase)tools.getDatabase()).getPegaSchemaDesigner(databaseName);

      		if ("PegaRULES".compareToIgnoreCase(databaseName) == 0)  {
      			testAgentLastRun.putString("pyTableName", "pr4_rule");
      		} else {
      			testAgentLastRun.putString("pyTableName", "pr_data");
      		}
	  		testAgentLastRun.putString("pyDatabaseName", databaseName);
      		testAgentLastRun = tools.getDatabase().open(testAgentLastRun, false);
        	if (testAgentLastRun != null) {
      			agentRunDate = testAgentLastRun.getDate("pxCommitDateTime");
        	}
        } else {
          oLog.debug("interval disabled, skipping agentRunDate calculation");
        }
      } else {
   		 oLog.debug("database name must be passed in from the agent as a parameter but is null, skipping execution");
      }
    
      Date currentTimeDate = new Date();

      if (interval <= 0) {
		 	// skip running the agent if interval is disabled
   		 	oLog.debug("interval disabled. Specify number of hours in system setting: database/databases/" + 
                            databaseName + "/BlobSizeAgentInterval. Skipping execution");
      } else if (agentRunDate != null && agentRunDate.getTime() + (interval * 3600000) >= currentTimeDate.getTime()) {
			// skip running the agent based upon agentRunDate and intervalHours
        	oLog.debug("Agent has been run in the last " + intervalHours + " hours. Skipping execution");
      } else if (databaseName != null) {
        	if (agentRunDate == null) {
   		 		oLog.debug("Agent needs to be run for initial execution");
            } else {
   		 		oLog.debug("Agent needs to be run");
            }
        
            acqLock = tools.getDatabase().getLockManager().acquireLock(lockKey, true, null);
      		if(acqLock==LockManager.LOCK_ACQUIRED) {
        
        	/* to test the lock is held or not only*/
        	/*try {
        	  Thread.sleep(120000);
        	} catch(Exception e) {} 
        	*/
        
        	Iterator<ClipboardPage> tableIter = schemaDesigner.getBlobSizeForTablesInSchema().iterator();
  			while (tableIter.hasNext()) {
          		ClipboardPage tableData = tableIter.next();
          		if (!tableData.getString(".pxAverageBlobSize").isEmpty()) {
            		ClipboardPage saveToDB = tools.createPage("System-DatabaseInformation-Table","");
					saveToDB.putString("pyDatabaseName", tableData.getString("pyDatabaseName"));
					saveToDB.putString("pySchemaName", tableData.getString("pySchemaName"));
					saveToDB.putString("pyTableName", tableData.getString("pyTableName"));
					saveToDB.putString("pxAverageBlobSize", tableData.getString("pxAverageBlobSize"));
					saveToDB.putString("pxMaximumBlobSize", tableData.getString("pxMaximumBlobSize"));
					tools.getDatabase().save(saveToDB, false, false);
 		   		}
  			}
        }
      }     
    } catch(DatabaseException ex) {
      oLog.error("Updation of " + databaseName + " tables' blob sizes failed- ",ex);
    } finally {
		try{
      	  if(acqLock==LockManager.LOCK_ACQUIRED) {
          	boolean unlockStatus = tools.getDatabase().getLockManager().unlock(lockKey, true);  
          }
		}catch(DatabaseException ex){
		  oLog.error("Failed to release the lock - ",ex);
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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-DB-SCHEMA PXGETBLOBSIZEFORTABLESINSCHEMA #20180713T132638.650 GMT", "Code-Pega-DB-Schema pxGetBlobSizeForTablesInSchema", "Pega-RulesEngine", "08-01-01", false, true, "", "ACTIVITY", "20180713T132638.650 GMT" ,"Rule-Obj-Activity"); }
