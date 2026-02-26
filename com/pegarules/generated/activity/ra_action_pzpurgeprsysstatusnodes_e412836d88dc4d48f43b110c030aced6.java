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
public class ra_action_pzpurgeprsysstatusnodes_e412836d88dc4d48f43b110c030aced6 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzPurgePRSysStatusNodes.System_Status_Nodes.Action");
	public ra_action_pzpurgeprsysstatusnodes_e412836d88dc4d48f43b110c030aced6(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY SYSTEM-STATUS-NODES PZPURGEPRSYSSTATUSNODES #20200924T101634.232 GMT	Pega-Engine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY SYSTEM-STATUS-NODES PZPURGEPRSYSSTATUSNODES #20200924T101634.232 GMT";
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_1 = "nodesList";
thisStepPage = tools.findPage(pz_1, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY SYSTEM-STATUS-NODES PZPURGEPRSYSSTATUSNODES #20200924T101634.232 GMT Step: 1 Circum: 0" );
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
String pz_2 = "nodesList";
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY SYSTEM-STATUS-NODES PZPURGEPRSYSSTATUSNODES #20200924T101634.232 GMT Step: 2 Circum: 0" );
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
	"Rule-Obj-Activity:PZPURGEPRSYSSTATUSNODES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPURGEPRSYSSTATUSNODES","Rule-Obj-Activity","SYSTEM-STATUS-NODES",false,"","Pega-Engine","08-06-01","RULE-OBJ-ACTIVITY SYSTEM-STATUS-NODES PZPURGEPRSYSSTATUSNODES #20200924T101634.232 GMT","!PZPURGEPRSYSSTATUSNODES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",471260087)
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
//	RULE-OBJ-ACTIVITY SYSTEM-STATUS-NODES PZPURGEPRSYSSTATUSNODES #20200924T101634.232 GMT:20201207T132212.817 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "976a9eb045ab920c12de717404f0016a";
	}

	public String getDefinitionAppliesToClass() {
		return "System-Status-Nodes";
	}
public String getAspect() {
return "Action";
}
/**
 * Fill the nodesList with all the nodes.
 * <p>
 * Step 1 <code>Obj-List</code> [on page nodesList] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-List");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-List", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-List
// Expression: nodesList
// Expression: System-Status-Nodes
// Expression: 
// Expression: 
ClipboardPage browsePage = tools.findPage("nodesList");if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "nodesList");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "System-Status-Nodes");
browsePage.putString("pyListName", "");
browsePage.putString("pyMaxRecords", "");
browsePage.putString("pyReturnLightweightResults", "false");

// Expression: 
// Expression: 
// Expression: 

		browsePage.putString("pyStartKey", "");
		browsePage.putString("pyEndKey", "");
try {
tools.getDatabase().convertListCriteria(browsePage);
tools.getDatabase().list(browsePage, true);
} catch (PRException pre) {
	oLog.error("Encountered error in list", pre);
	throw new PRRuntimeException(pre);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-List",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Remove the old old nodes.
 * <p>
 * Step 2 <code>Java</code> [on page nodesList] <br>
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
java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

// The number of days since last pulse:
int hoursAgo = Integer.parseInt(tools.getParamValue("hoursAgo"));

if(hoursAgo<1){
  oLog.warn("Parameter hoursAgo cannot be less than 1.");
  return true;
}

// Calculate the date that many days ago (use long or suffer wraparound!):
java.util.Date cutoffDate = new java.util.Date(new java.util.Date().getTime() - (long)hoursAgo * 60 * 60 * 1000);

// Iterator over the list of all System-Status-Nodes:
java.util.Iterator iter = myStepPage.getProperty(".pxResults").iterator();
while (iter.hasNext()) {
  
    // For each node:
    ClipboardPage nodePage = ((ClipboardProperty)iter.next()).getPageValue();
  
    // Get the node's last pulse time:
    java.util.Date lastPulseTime = nodePage.getProperty(".pyLastPulseDateTime").toDate();
    
    // Chuck the node if it's too old:
    if (lastPulseTime.before(cutoffDate)) {
        try {
		        String msg = String.format("Removing outdated node '%s' (id: %s, addr: %s) that started at %s and last pulsed at %s " + 
                                       "from System-Status-Nodes. Cutoff date was %s based on a max age of %s hour(s) from now.",
                                       nodePage.getString(".pyNodeName"),
                                       nodePage.getString(".pySysNodeId"),
                                       nodePage.getString(".pyClusterAddress"),
                                       nodePage.getString(".pyStartedDateTime"),
                                       nodePage.getString(".pyLastPulseDateTime"),
                                       df.format(cutoffDate),
                                       hoursAgo);

            oLog.infoForced(msg);

	          ClipboardPage log = tools.createPage("Log-Agent", "");
	          log.putString(".pySystemName", tools.findPage("pxProcess").getString(".pxSystemNodeID"));
	          log.putString(".pyNodeName", tools.findPage("pxProcess").getString(".pxSystemNode"));
	          log.putString(".pyActivity", "RemoveOldNodes");
	          log.putString(".pyAgentRuleSet", "Pega-RULES");
	          log.putString(".pyNote", msg);
	          log.putString(".pyQueueClass", "System-Status-Nodes");
	          log.putString(".pxCreateDateTime", pega_rules_datetime.getCurrentTimeStampUnique());

	          tools.getDatabase().save(log, false, false);

            tools.getDatabase().delete(nodePage, true);
        } catch (DatabaseException ex) {
            oLog.error("Error removing old node", ex);
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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY SYSTEM-STATUS-NODES PZPURGEPRSYSSTATUSNODES #20200924T101634.232 GMT", "System-Status-Nodes pzPurgePRSysStatusNodes", "Pega-Engine", "08-06-01", false, true, "", "ACTIVITY", "20201207T132212.817 GMT" ,"Rule-Obj-Activity"); }
