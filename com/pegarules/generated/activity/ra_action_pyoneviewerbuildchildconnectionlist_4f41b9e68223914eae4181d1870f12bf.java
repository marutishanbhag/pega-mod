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
public class ra_action_pyoneviewerbuildchildconnectionlist_4f41b9e68223914eae4181d1870f12bf extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyOneViewerBuildChildConnectionList.Rule_Obj_Flow.Action");
	public ra_action_pyoneviewerbuildchildconnectionlist_4f41b9e68223914eae4181d1870f12bf(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PYONEVIEWERBUILDCHILDCONNECTIONLIST #20180713T141131.268 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PYONEVIEWERBUILDCHILDCONNECTIONLIST #20180713T141131.268 GMT";
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PYONEVIEWERBUILDCHILDCONNECTIONLIST #20180713T141131.268 GMT Step: 2 Circum: 0" );
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
	"Rule-Obj-Activity:PYONEVIEWERBUILDCHILDCONNECTIONLIST"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYONEVIEWERBUILDCHILDCONNECTIONLIST","Rule-Obj-Activity","RULE-OBJ-FLOW",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PYONEVIEWERBUILDCHILDCONNECTIONLIST #20180713T141131.268 GMT","!PYONEVIEWERBUILDCHILDCONNECTIONLIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",536453293)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PYONEVIEWERBUILDCHILDCONNECTIONLIST #20180713T141131.268 GMT:20180713T141131.268 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "c42bb9665e8b3cf08e6df394e604b161";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
	}
public String getAspect() {
return "Action";
}
/**
 * build edges.
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
class BuildConnection {

	// check if connector is s-j meta connector
	boolean isSJMetaConnector (ClipboardProperty shapes, String shapeId, String connectorId) {
		//oLog.error ("isSJMetaConnector ("+shapeId+", "+connectorId+")");
		boolean result = false;

		if (shapeId != null && shapeId.length() > 0 && connectorId != null && connectorId.length() > 0) {
			ClipboardPage shapePage = shapes.getPageValue(shapeId);
			if (shapePage != null && "Data-MO-Container-SplitJoin".equals(shapePage.getClassName())) {
				ClipboardProperty cRefs = shapePage.getIfPresent("pyConnectorRefs");
				if (cRefs != null) {
					String propVal = cRefs.getStringValue(connectorId) ;
					if (propVal != null) {
						if (propVal.length() == 0)
							cRefs.remove(connectorId); // unfortunately getStringValue() creates empty entries
						else
							result = true;
					}
				}
			}
		}
		return result;
	}

	// routine to look for 'to' connection and build connection string
	void processToModelProcess (ClipboardProperty shapes, String fromTask, ClipboardPage connection, java.util.ArrayList childIds, String prependFromId, String prependToId, java.util.HashMap referencedIds, StringBuilder edgesSB) {
		//oLog.error ("processToModelProcess (fromTask="+fromTask+", prepFrom='"+prependFromId+"', prepTo='"+prependToId+"')");

		String toTask = connection.getStringIfPresent ("pyTo");
		String connId = connection.getStringIfPresent("pyMOId");

		// check for s-j meta connector - not passed to client
		if (isSJMetaConnector (shapes, fromTask, connId) || isSJMetaConnector (shapes, toTask, connId)) {
			//oLog.error (connId+" is a s-j meta connector");
			return;
		}

		// ids must be unique across reference and target; -> replace from or to
		// prepend is required to make unique

		// if name is in references it is a subflow, do not prepend

		String from = "";
		if (fromTask != null && fromTask.length() > 0) {
			if (referencedIds.containsKey (fromTask)) {
				//oLog.error ("referencedIds.containsKey (fromTask)");
				from = (String)referencedIds.get(fromTask);
			}
			else {
				//oLog.error ("! referencedIds.containsKey (fromTask)");
				if (prependFromId != null && prependFromId.length()>0)
					from = prependFromId+"."+fromTask ;
				else
					from = fromTask;
			}
		}

		String to = "";
		if (toTask != null && toTask.length() > 0) {
			if (referencedIds.containsKey (toTask)) {
				//oLog.error ("referencedIds.containsKey (toTask)");
				to = (String)referencedIds.get(toTask);
			}
			else {
				//oLog.error ("! referencedIds.containsKey (toTask)");
				if (prependToId != null && prependToId.length()>0)
					to = prependToId+"."+toTask ;
				else
					to = toTask;
			}
		}

		HashStringMap keys = new HashStringMap();
		keys.put("pyClassName",tools.getPrimaryPage().getClassName());
		keys.put("pyActivityName","pyOneViewerBuildViewForEdges");

		java.util.ArrayList list = new java.util.ArrayList();

		tools.getParameterPage().putObject("resultsList", list);
		tools.getParameterPage().putParamValue("IsFullModel","true");

		tools.doActivity(keys, connection, tools.getParameterPage());

		for (int i=0 ; i<list.size() ; i++) 
			edgesSB.append(list.get(i));
	}

	void buildAgainstModelProcess (ClipboardPage flowRoot, String edgeProp, java.util.ArrayList childIds, StringBuilder edgesSB, String prependId, java.util.HashMap referencedIDs, String parentID) {
		//oLog.error ("buildAgainstModelProcess() edgeProp="+edgeProp);

		ClipboardProperty shapes = flowRoot.getProperty(".pyModelProcess.pyShapes");
		ClipboardProperty prop = tools.getIfPresent( edgeProp );
		if (prop != null && (prop.isList() || prop.isGroup())) {
			Iterator fromIt = prop.iterator();
			while (fromIt.hasNext()) {
				ClipboardPage fromConnection = ((ClipboardProperty)fromIt.next()).getPageValue();
				String fromTask = fromConnection.getStringIfPresent ("pyFrom");
				processToModelProcess (shapes, fromTask, fromConnection, childIds, prependId, prependId, referencedIDs, edgesSB);
			}
		}
	}		
}

boolean debugLog = false;

if (debugLog) oLog.error ("pyOneViewerBuildChildConnectionList(); page="+myStepPage.getReference());

ParameterPage paramPage = tools.getParameterPage() ;
StringBuilder edgesSB = (StringBuilder)paramPage.getObject ("edgesSB");

//edgesSB.append("{from: 'RULE-OBJ-FLOW WORK- SENDCORRESPONDENCE #20100430T153820.985 GMT', to:'CreateCorrespondence', visible:'true'},");
//edgesSB.append("{from: 'CreateCorrespondence', to:'ProcessCorr', visible:'true'}");


// get list of children id's
java.util.ArrayList childIds = (java.util.ArrayList)paramPage.getObject ("childIDs");
if (childIds==null || childIds.size() < 2)
return true;



String prependId = (String)paramPage.getObject ("prependId");
java.util.HashMap referencedIDs = (java.util.HashMap)paramPage.getObject ("referencedIDs");


//oLog.error ("prependId ="+prependId);
//or (int j=0 ; j<childIds.size() ; j++) oLog.error("childIds[]="+(String)childIds.get(j)) ;
//Iterator it = referencedIDs.keySet().iterator(); while (it.hasNext()) oLog.error ("refID[key]="+(String)(it.next()));


BuildConnection buildConnection = new BuildConnection();

//int startLength = edgesSB.length();
//String parentID = tools.getParamValue("parentID");
String parentID = myStepPage.getStringIfPresent("pyFlowType");

// loop over 'from connections' looking for a match to children in collection
String edgeProp = tools.getParamValue("nodeAndEdgeModel");

if (edgeProp != null) {
	//if (edgeProp.contains("pyFromTasks"))
	//	buildConnection.buildAgainstFromTasks (myStepPage, edgeProp, taskInfo, childIds, edgesSB, prependId, referencedIDs, parentID);
	//else 
	if (edgeProp.contains("pyModelProcess"))
		buildConnection.buildAgainstModelProcess (myStepPage, edgeProp, childIds, edgesSB, prependId, referencedIDs, parentID);
	else
		oLog.error ("pyOneViewerBuildChildConnectionList() : unrecognised connector property '"+edgeProp+"'");
}
else
	oLog.error ("pyOneViewerBuildChildConnectionList() : parameter nodeAndEdgeModel is empty");

if (debugLog) {
	oLog.error ("pyOneViewerBuildChildConnectionList() ... done");
	oLog.error ("edgesSB="+edgesSB.toString());
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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PYONEVIEWERBUILDCHILDCONNECTIONLIST #20180713T141131.268 GMT", "Rule-Obj-Flow pyOneViewerBuildChildConnectionList", "Pega-ProcessArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T141131.268 GMT" ,"Rule-Obj-Activity"); }
