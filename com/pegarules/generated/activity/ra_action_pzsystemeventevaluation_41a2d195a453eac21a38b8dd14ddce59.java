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
public class ra_action_pzsystemeventevaluation_41a2d195a453eac21a38b8dd14ddce59 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzSystemEventEvaluation.System_Queue_Events.Action");
	public ra_action_pzsystemeventevaluation_41a2d195a453eac21a38b8dd14ddce59(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY SYSTEM-QUEUE-EVENTS PZSYSTEMEVENTEVALUATION #20180713T134345.441 GMT	Pega-EventProcessing:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY SYSTEM-QUEUE-EVENTS PZSYSTEMEVENTEVALUATION #20180713T134345.441 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY SYSTEM-QUEUE-EVENTS PZSYSTEMEVENTEVALUATION #20180713T134345.441 GMT Step: 1 Circum: 0" );
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
	"Rule-Obj-Activity:PZSYSTEMEVENTEVALUATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSYSTEMEVENTEVALUATION","Rule-Obj-Activity","SYSTEM-QUEUE-EVENTS",false,"","Pega-EventProcessing","08-01-01","RULE-OBJ-ACTIVITY SYSTEM-QUEUE-EVENTS PZSYSTEMEVENTEVALUATION #20180713T134345.441 GMT","!PZSYSTEMEVENTEVALUATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-219939)
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
//	RULE-OBJ-ACTIVITY SYSTEM-QUEUE-EVENTS PZSYSTEMEVENTEVALUATION #20180713T134345.441 GMT:20180713T134345.441 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "1bc2283cbdaead9b8f08a88c641a9d64";
	}

	public String getDefinitionAppliesToClass() {
		return "System-Queue-Events";
	}
public String getAspect() {
return "Action";
}
/**
 * Iterate the queue of events and executes the event evaluation activity.
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
try {
	if (oLog.isDebugEnabled())
		oLog.debug("EventProcessing(Debugging): Executing Event processing agent's pzSystemEventEvaluation Activity.");
	// Don't fire declaratives.
	infEngine.disableAutomaticBackwardChaining();
	ClipboardPage pProcess = tools.findPage("pxProcess");
	// We only want to run if we haven't hit an error while the system was initialzed...
	if (!pProcess.getProperty("pxSystemNodeStatus").getStringValue().equalsIgnoreCase("Unknown")) {
		PRSystemSettings systemSettings = pega.getSystemSettings();
		// Are we running in v4.2 compatibility mode?
		boolean isRunningCompatibilityMode = pProcess.getBoolean(".pxIndexCompatibilityMode");
		boolean isSystemSettingsUnavailable = false; // is Data-Admin-System-Settings defined?
		if (!isRunningCompatibilityMode) {
			ClassInfo settingsInfo = tools.getDictionary().getClassInfo("Data-Admin-System-Settings");
			isSystemSettingsUnavailable = settingsInfo.isUndefined();
			if (isSystemSettingsUnavailable) {
				// Data-Admin-System-Settings definition is missing.
				// Fall back to v4.2 compatibility mode
				if (oLog.isDebugEnabled()) {
				   oLog.debug("Data-Admin-System-Settings class definition missing - aborting Event evaluation agent queue.");
				}
			} else {
				String currentHostId = pProcess.getString("pxSystemNodeID");
				String hostId = systemSettings.getDynamic("Pega-RULES", "indexing/hostid");
				if (oLog.isDebugEnabled()) {
				   oLog.debug("Indexing HostId: " + hostId);
				   oLog.debug("This HostId: " + currentHostId);
				}
				if (hostId != null && hostId.length()>0 && !currentHostId.equalsIgnoreCase(hostId)) {
				   //agentUtils.terminateQueue("Pega-RULES", 2);
					if (oLog.isDebugEnabled()) {
						oLog.debug("[ Event Evaluation Agent ] Event evaluation agent exiting because this is not the indexing node.");
					}
				   return true;
				}
			}
		}

		StringMap options = new HashStringMap ();
		options.put (PRQueueManager.OPTION_REMOVE, "true");
		PRQueueIterator queueIter = tools.getThread().getQueueManager().iterator("System-Queue-Events", options);
		int dequeuedCount = 0;
		if (queueIter != null) {
			ClipboardPage cbpRow = (ClipboardPage) queueIter.first();					
			while (cbpRow != null) {
				dequeuedCount ++;
				if (oLog.isDebugEnabled())
					oLog.debug("EventProcessing(Debugging): Consuming a queued event - " + cbpRow.getStringIfPresent("pzInsKey"));
				ClipboardPage pzEvent = cbpRow.getPage(".pzEvent");
				String isWhenExecuted = cbpRow.getString("pyIsWhenAlreadyEvaluated");
				if (!isWhenExecuted.equalsIgnoreCase("true")) {
				    String[] eventTypes = pzEvent.getString(".pxEventType").split(",");
					String primaryClass = pzEvent.getString(".pxPrimaryClass");
					String subscript = null;
					if ("Link-Attachment".equalsIgnoreCase(primaryClass)) {
						subscript = "ATTACHMENT";
					} else if ("Assign-Worklist".equalsIgnoreCase(primaryClass)) {
						subscript = "ASSIGNMENT";
					} else {
						subscript = "CURRENT";
					}
					ClipboardPage workPage = null;
					ClipboardPage currentPage = null;
					ClipboardPage dbPage = null;
					try {
						ClipboardPage subscriptPage = pzEvent.getPage(".pyEventData(" + subscript + ")");
						String subscriptKey = subscriptPage.getString(".pzInsKey");
						dbPage = tools.getDatabase().open(subscriptKey, false);
						if (dbPage != null) {
							if ("ATTACHMENT".equals(subscript)) {
								String sInsKey = dbPage.getString(".pxLinkedRefFrom");
								workPage = tools.getDatabase().open(sInsKey, false);
							} else if ("ASSIGNMENT".equals(subscript)) {
								String sInsKey = dbPage.getString(".pxRefObjectKey");
								workPage = tools.getDatabase().open(sInsKey, false);
							} else {
								currentPage = subscriptPage;
								workPage = dbPage;
							}
						}
						if (workPage != null) {
							if (oLog.isDebugEnabled())
								oLog.debug("EventProcessing(Debugging): The work object id that creater this event is " + workPage.getString(".pyID"));
							workPage.rename("pyWorkPage");
							if (currentPage == null) {
								currentPage = tools.createPage(workPage.getClassName(), "");
							}
							if ("ATTACHMENT".equals(subscript)) {
								currentPage.putString(".pxEventCreateOperator", dbPage.getStringIfPresent(".pxCreateOperator"));
							} else if ("ASSIGNMENT".equals(subscript)) {
								currentPage.putString(".pxEventCreateOperator", dbPage.getStringIfPresent(".pxAssignedOperatorID"));
							} else{
								currentPage.putString(".pxEventCreateOperator", dbPage.getStringIfPresent(".pxUpdateOperator"));
							}
							currentPage.putString(".pyID", workPage.getString(".pyID"));
							currentPage.putString(".pyUpdatedWorkObjectKey", workPage.getString(".pzInsKey"));
							currentPage.putString(".pyLabel", workPage.getString(".pyLabel"));
							currentPage.putString(".pyStatusWork", workPage.getString(".pyStatusWork"));
							currentPage.getProperty(".pxCreateDateTime").setValue(workPage.getDate(".pxCreateDateTime"));
							currentPage.getProperty(".pxUpdateDateTime").setValue(workPage.getDate(".pxUpdateDateTime"));
							currentPage.putString(".pxCreateOperator", workPage.getString(".pxCreateOperator"));
							currentPage.putString(".pxUpdateOperator", workPage.getString(".pxUpdateOperator"));
							currentPage.putString(".pxCoverInsKey", workPage.getString(".pxCoverInsKey"));
							currentPage.put(workPage.getProperty(".pyWorkParty"));
							for (int i = 0; i < eventTypes.length; i++) {
								String eventType = eventTypes[i].trim();
								if (!"".equals(eventType)) {
									if ("pxCorrespondenceGenerated".equalsIgnoreCase(eventType)) {
										String attachClass = dbPage.getString(".pxLinkedClassTo");
										if ("Data-WorkAttach-File".equalsIgnoreCase(attachClass)) {
											try {
												ClipboardPage attachPage = tools.getDatabase().open(dbPage.getString(".pxLinkedRefTo"), false);
												if (attachPage != null) {
													String attachName = attachPage.getProperty(".pxAttachName").getStringValue();
													attachPage.removeFromClipboard();
													String actualName = attachName.substring(attachName.lastIndexOf('/') + 1);
													if (actualName.lastIndexOf('.') < 0 || !actualName.substring(actualName.lastIndexOf('.')).equalsIgnoreCase(".eml")) {
														continue;
													}
												}
											} catch (DatabaseException e) {
												continue;
											}
										} else {
											ClassDefinition attachDef = tools.getDatabase().getClassDef("Data-Corr-");
											if (attachDef == null || !attachDef.isAncestorOf(attachClass)) {
												continue;
											}
										}
									}
									com.pega.pegarules.priv.dictionary.CEPEventInfoConclusion cepConclusion = pega.getCEPEventInfo(primaryClass);
									Set newValueProps = cepConclusion.getActiveEventTypeNewValueProperties(eventType, pzEvent.getDate(".pxEventStartDateTime"));
									if (newValueProps != null && !newValueProps.isEmpty()) {
										for (Iterator propIter = newValueProps.iterator(); propIter.hasNext();) {
											String propName = (String) propIter.next();
											ClipboardProperty prop = dbPage.getIfPresent(propName);
											if (prop != null) {
												subscriptPage.put(prop);
											}
										}
									}
									if (!"CURRENT".equals(subscript)) {
										Map secondaryValueProps = cepConclusion.getActiveEventTypeSecondaryWorkTypeNewProperties(eventType, pzEvent.getDate(".pxEventStartDateTime"));
										if (secondaryValueProps.containsKey(workPage.getClassName())) {
											Set secondaryProps = (Set) secondaryValueProps.get(workPage.getClassName());
											if (secondaryProps != null && !secondaryProps.isEmpty()) {
												for (Iterator propIter = secondaryProps.iterator(); propIter.hasNext();) {
													String propName = (String) propIter.next();
													ClipboardProperty prop = workPage.getIfPresent(propName);
													if (prop != null) {
														currentPage.put(prop);
													}
												}
											}
										}
										pzEvent.getProperty(".pyEventData").add("CURRENT", currentPage);
									}
									Map secondaryROAAppliesToClass = cepConclusion.getActiveEventTypeSecondaryWorkTypeAssociationApplieToClasses(eventType, pzEvent.getDate(".pxEventStartDateTime"));
									/*Set keySetValues = secondaryROAPages.keySet();
									if(keySetValues != null && !keySetValues.isEmpty()) {
										for(Iterator eventTypeROA = keySetValues.iterator(); eventTypeROA.hasNext();) {
											String eventTypeROAName = (String) eventTypeROA.next();
											String ROAName = eventTypeROAName.substring(eventTypeROAName.indexOf('_')+1)).substring(eventTypeROAName.substring(eventTypeROAName.indexOf('_')+1)).indexOf('_')+1);
											String ROAClass = secondaryROAPages.get(eventTypeROAName);
											String ROAAppliesToClass = secondaryROAAppliesToClass.get(ROAName);
											ClipboarPage resultsPage = tools.createPage("Code-Pega-List", "pyROAInstances");
											ClipboardProperty pyPreparedValuesROA = resultsPage.getProperty("pyPerparedValues");
											resultsPage.putString("pyMaxRecords", "2");
											resultsPage.putString("pyObjClass", "Rule-Obj-Association");
											pyPreparedValuesROA.add(ROAAppliesToClass);
											pyPreparedValuesROA.add(ROAName);
											
											String perparedSQL = "Select * from {Class: Rule-Obj-Association} where pyClassName = {pyROAInstances.pyPreparedValues(1)} AND pyRuleName = {pyROAInstances.pyPreparedValues(2)}
	*/
									Set keyAppliesToClassMap = secondaryROAAppliesToClass.keySet();
									if(keyAppliesToClassMap != null && !keyAppliesToClassMap.isEmpty()){
										for(Iterator keysROA = keyAppliesToClassMap.iterator(); keysROA.hasNext();) {
											String ROANameStr = (String) keysROA.next();
											if(ROANameStr != null && !ROANameStr.equals("")) {
											         oLog.debug("ROA String:" + ROANameStr); 
												String ROAName = ROANameStr.substring(ROANameStr.indexOf('_')+1).substring((ROANameStr.substring(ROANameStr.indexOf('_')+1)).indexOf('_')+1);
												String ROAAppliesToClass = "";
												String ROAAccessGroup="";
												String mixedString = (String) secondaryROAAppliesToClass.get(ROANameStr);
												if(mixedString.indexOf("$")>0){ //Ton check if access group is appened with class name
												 ROAAppliesToClass = mixedString.substring(0,mixedString.indexOf("$"));
												 ROAAccessGroup = mixedString.substring(mixedString.indexOf("$")+1); // derived from some twisted means
												} 
												else
                                                                                                              ROAAppliesToClass = mixedString; 
                                                                                                              oLog.debug("Mixed String:" + mixedString);           
											         oLog.debug("ROAClass :" + ROAAppliesToClass); 
												oLog.debug("ROA Access Group :" + ROAAccessGroup); 
                                                                                                              boolean switchAG = true;
												if(ROAAccessGroup==null || "".equals(ROAAccessGroup.trim()) || "null".equals(ROAAccessGroup)){
														    switchAG = false;
												}
												if(ROAName != null && ROAAppliesToClass != null && !ROAName.equals("") && !ROAAppliesToClass.equals("")) {
													StringMap keys = new HashStringMap();
													ClipboardPage ROAPage = null;
													keys.put("pxObjClass", "Rule-Obj-Association");
													keys.put("pyClassName", ROAAppliesToClass);
													keys.put("pyPurpose", ROAName);
													keys.put("pyRuleName", ROAName);
													if(oLog.isDebugEnabled())
													   oLog.debug(" Opening ROA with pyClassName:" + ROAAppliesToClass + " pyPurpose:" + ROAName);
													com.pega.pegarules.priv.authorization.PegaAuthorization auth = null;
                                                  	String accessGroupBeforeSwitch = "";
													try{
													    // Will have to change the access group to open the ROA and then again reset the access group:  
												    // Switching of access group logic begins
 
													  if(switchAG){
													        oLog.debug("EventProcessing(Debug): Switching agent's access group to " + ROAAccessGroup);
                                                        	PRThread currentThread = tools.getThread();
													  	    auth = (com.pega.pegarules.priv.authorization.PegaAuthorization)currentThread.getAuthorization();
                                                        	ClipboardPage currentThreadPage = currentThread.getPage("pxThread");
                                                        	if(currentThreadPage != null){
                                                        		accessGroupBeforeSwitch = currentThreadPage.getStringIfPresent("pxCurrentAccessGroup");
                                                            }
														    auth.replaceAccessGroup(currentThread,ROAAccessGroup);
															PegaAPI newTools = (PegaAPI) ThreadContainer.get().getPublicAPI();  
															ROAPage = newTools.getDatabase().open(keys, false);
													   }
													   else
														 ROAPage = tools.getDatabase().open(keys, false);
													} catch(Exception e) {
														oLog.error("EventProcessing(Error): Exception while opening ROA instance, " + ROAName + " -" + e.getLocalizedMessage());
													} finally{
													    if(switchAG)
													       auth.resetForAgent("",accessGroupBeforeSwitch); // reset to the original agent's access group 
													}
													if(ROAPage !=  null) {
													    if(oLog.isDebugEnabled())
													   	  oLog.debug(" EventProcessing(Debugging):DATA classes related ROA: " + ROAPage.getXML());
														String joinClassName = ROAPage.getStringIfPresent("pyAccessToClass");
														if(joinClassName != null && !joinClassName.equals("")){
															ClipboardProperty joinPage = ROAPage.getProperty("pyJoinInfo");
															if(joinPage !=  null) {
																ClipboardProperty filterPageList = joinPage.getPageValue().getProperty("pyFilters");
																if(filterPageList != null) {
																	ClipboardProperty filters = filterPageList.getPageValue().getProperty(".pyFilter(1)");
																	if(filters != null) {
																		ClipboardPage filterPage = filters.getPageValue();
																		String primaryPageProp = filterPage.getStringIfPresent("pyFilterName");
																		if(primaryPageProp != null) {
																			String primaryPagePropValue = workPage.getStringIfPresent(primaryPageProp);
																			if(primaryPagePropValue != null && !primaryPagePropValue.equals("")) {
																				String joinedClassPropIden = filterPage.getStringIfPresent("pyFilterValue");
																				if(joinedClassPropIden != null && !joinedClassPropIden.equals("")) {
																					String joinedClassProp = joinedClassPropIden.substring(joinedClassPropIden.indexOf('.')+1);
																					ClipboardPage resultsPage = tools.createPage("Code-Pega-List", "pyJoinedClassInstances");
																					ClipboardProperty pyPreparedValuesROA = resultsPage.getProperty("pyPreparedValues");
																					resultsPage.putString("pyMaxRecords", "1");
																					resultsPage.putString("pyObjClass", joinClassName);
																					pyPreparedValuesROA.add(primaryPagePropValue);
																					String joinSQL = "Select pzPVStream as \"pzPVStream\" from {Class:" +joinClassName +"} where " + joinedClassProp +" = {pyJoinedClassInstances.pyPreparedValues(1)} ";
																					try {
																						int count = tools.getDatabase().executeRDB(joinSQL, resultsPage);
																					if(oLog.isDebugEnabled())
																					 	oLog.debug("EventProcessing(Debugging): DATA classes query results page: " + resultsPage.getXML());
																					
																					     if(count >0) {
																							ClipboardProperty resultsProp = resultsPage.getProperty("pxResults");
																							Iterator joinIter = resultsProp.iterator();
																							if(joinIter.hasNext()) {
																								ClipboardPage joinClassPage = ((ClipboardProperty) joinIter.next()).getPageValue();
																								Map secondaryClassPropsMap = cepConclusion.getActiveEventTypeSecondaryWorkTypeNewProperties(eventType, pzEvent.getDate(".pxEventStartDateTime"));												
																								if (secondaryClassPropsMap.containsKey(joinClassName)) {
																									Set secondaryJoinProps = (Set) secondaryClassPropsMap.get(joinClassName);
																									if (secondaryJoinProps != null && !secondaryJoinProps.isEmpty()) {
																										ClipboardPage ROAPageForEvent = tools.createPage(joinClassName, "");
																										for (Iterator propIter = secondaryJoinProps.iterator(); propIter.hasNext();) {
																											String propName = (String) propIter.next();
																											ClipboardProperty prop = joinClassPage.getIfPresent(propName);
																											if (prop != null) {
																												ROAPageForEvent.put(prop);
																											}
																										}
																										pzEvent.getProperty(".pyEventData").add(ROANameStr, ROAPageForEvent);
																									}
																								}
																							}
																						}
																					} catch (Exception e) {
																						oLog.infoForced("EventProcessing(Error): Error while creating the ROA Page for Event - " + e.getLocalizedMessage());
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													else{
													 if(oLog.isDebugEnabled())
													   oLog.debug("EventProcessing(Debugging):  No ROA found as :" + ROAName);
													}  
												}
											}
										}
									}
									List activities = cepConclusion.getActiveEventTypeActivities(eventType, pzEvent.getDate(".pxEventStartDateTime"));
									if (activities != null) {
										for (Iterator activitiesIter = activities.iterator(); activitiesIter.hasNext();) {
											String activityName = (String) activitiesIter.next();
											String eventRuleID = activityName.substring(activityName.indexOf('_')+1);
											boolean debugCouldBeEnabled = cepConclusion.isDebugOn(eventType, activityName);
											boolean debugEnabled = false;
											if (debugCouldBeEnabled) {
												ClipboardPage results = tools.createPage("Code-Pega-List", "pySubscriptionInstances");
												ClipboardProperty pyPreparedValues = results.getProperty("pyPreparedValues");
												results.putString("pyMaxRecords", "1");
												results.putString("pyObjClass", "Pega-CEP-Subscription");
												pyPreparedValues.add(eventRuleID);
												pyPreparedValues.add(pzEvent.getPage(".pyEventData(CURRENT)").getString(".pyID").toUpperCase());
												pyPreparedValues.add("true");
												String linkSQL = "select pzInsKey from {Class:Pega-CEP-Subscription} where pxEventRuleID = {pySubscriptionInstances.pyPreparedValues(1)} AND UPPER(pyEventWatchWorkId) = {pySubscriptionInstances.pyPreparedValues(2)} AND pyEventWatchOn = {pySubscriptionInstances.pyPreparedValues(3)}";
												try{
													if((tools.getDatabase().executeRDB(linkSQL, results))>0) {
														debugEnabled = true;
													}
												} catch (Exception e) {
													oLog.infoForced("EventProcessing(Error): Error in getting event subscriptions - " + e.getLocalizedMessage());
												}
											}
											if (debugEnabled) {
												if (oLog.isDebugEnabled())
													oLog.debug("EventProcessing(Debugging): Debug is enabled for this event");
												String eventName = cepConclusion.getEventRuleName(eventType, activityName);
												String workTypeDesc = cepConclusion.getWorkTypeLabel(eventType, activityName);
												ClipboardPage eventPageToPersist = tools.createPage("Pega-Event-System", "EventPageToPersist");
												eventPageToPersist.putString(".pxEventRuleID", eventRuleID);
												eventPageToPersist.putString(".pxID", pzEvent.getString(".pxID"));
												eventPageToPersist.putString(".pxPrimaryClass", pzEvent.getString(".pxPrimaryClass"));
												eventPageToPersist.putString(".pxEventSouce", pzEvent.getString(".pxEventSouce"));
												eventPageToPersist.getProperty(".pxEventStartDateTime").setValue(pzEvent.getDate(".pxEventStartDateTime"));
												eventPageToPersist.getProperty(".pxEventEndDateTime").setValue(pzEvent.getDate(".pxEventEndDateTime"));
												eventPageToPersist.getProperty(".pxUpdateDateTime").setValue(new java.util.Date());
												eventPageToPersist.getProperty(".pxCreateDateTime").setValue(new java.util.Date());
												eventPageToPersist.put("pyEventData", pzEvent.get("pyEventData"));
												eventPageToPersist.putString(".pxActionID", "Event " + System.nanoTime());
												eventPageToPersist.putString(".pxUpdatedWorkID", pzEvent.getPage(".pyEventData(CURRENT)").getString(".pyID"));
												eventPageToPersist.putString(".pxUpdatedWorkUpdateDateTime", pzEvent.getPage(".pyEventData(CURRENT)").getString(".pxUpdateDateTime"));
												eventPageToPersist.putString(".pxEventRuleDesc", cepConclusion.getEventRuleDescription(eventType, activityName));
												eventPageToPersist.putString(".pxEventRuleName", eventName);
												eventPageToPersist.putString(".pxUpdatedWorkLabel", workTypeDesc);
												eventPageToPersist.putString(".pxEventType", eventName + " (" + workTypeDesc + ")" );
												eventPageToPersist.putString(".pxEventWatchEnabled", "true");
											}
											StringMap map = new HashStringMap();
											map.put("pxObjClass", "Rule-Obj-Activity");
											map.put("pyClassName", pzEvent.getClassName());
											map.put("pyActivityName", activityName);
											if (oLog.isDebugEnabled()){
                 									  oLog.debug("EventProcessing(Debugging): The event object page passed as a primary page:" + pzEvent.getXML());
													  oLog.debug("EventProcessing(Debugging): Calling generated activity, " +  map.get("pyActivityName"));
											}		  
											try {
												ParameterPage pPage = new ParameterPage();
												pPage.putString("IsWhenAlreadyExecuted", isWhenExecuted);
												pzEvent.putString("pxEventRuleID", eventRuleID);
												pzEvent.putString("pxEventType",eventType);
												tools.doActivity(map, pzEvent, pPage);
											} catch (Throwable e) {
												oLog.infoForced("EventProcessing(Error): Execution of the activity " + activityName + " failed for " + pzEvent.getString(".pxID") + " -" + e.getLocalizedMessage(), e);
											} finally{
												ClipboardPage eventPage = tools.findPage("EventPageToPersist");
												if(eventPage != null){
													try {
														tools.getDatabase().save(eventPage, true, false);
													} catch (DatabaseException e) {
														oLog.infoForced("EventProcessing(Error): Unable to save event for event instance in event repository - " + eventRuleID, e);
													} finally {
														eventPage.removeFromClipboard();
													}
												}
											}
										}
									}
									else {
									     if (oLog.isDebugEnabled())
										   oLog.debug("EventProcessing(Debugging): Conclusion did not return any generated activity for the events");
								    }
								}
							}
						}
					} catch (Exception e) {
						oLog.infoForced ("EventProcessing(Error): Some error while consuming event: " + pzEvent.getString(".pxID") + e.getLocalizedMessage());
						e.printStackTrace();
					} finally {
						if (workPage != null && dbPage != workPage) {
							workPage.removeFromClipboard();
						}
						if (dbPage != null) {
							dbPage.removeFromClipboard();
						}
						if (currentPage != null) {
							currentPage.removeFromClipboard();
						}
					}
				} else {
				    if (oLog.isDebugEnabled())
		               oLog.debug("EventProcessing(Debugging): Processing a requeued event (Conditions already evaluated to true)");
					StringMap map = new HashStringMap();
					map.put("pxObjClass", "Rule-Obj-Activity");
					map.put("pyClassName", pzEvent.getClassName());
					map.put("pyActivityName", "px_" + pzEvent.getString("pxEventRuleID"));
					try {
						ParameterPage pPage = new ParameterPage();
						pPage.putString("IsWhenAlreadyExecuted", isWhenExecuted);
						if (oLog.isDebugEnabled())
		                    oLog.debug("EventProcessing(Debugging): Calling generated activity, " +  map.get("pyActivityName"));
						tools.doActivity(map, pzEvent, pPage);
					} catch (Throwable e) {
						oLog.infoForced("EventProcessing(Error): Execution of the activity " + map.get("pyActivityName") + " failed for " + pzEvent.getString(".pxID") + " -" + e.getLocalizedMessage(), e);
					} finally {
						ClipboardPage eventPage = tools.findPage("EventPageToPersist");
						if (eventPage != null) {
							try {
								tools.getDatabase().save(eventPage, true, false);
								if (oLog.isDebugEnabled())
									oLog.debug("EventProcessing(Debugging): Event persisted in database");
							} catch (DatabaseException e) {
								oLog.infoForced("EventProcessing(Error): Unable to save event for event instance in event repository " + pzEvent.getString("pxEventRuleID") + " -" + e.getLocalizedMessage(), e);
							} finally {
								eventPage.removeFromClipboard();
							}
						}
					}
				}
				try {
					cbpRow = (ClipboardPage) queueIter.next();
				} catch (Exception exc) {
					cbpRow = null;
				}
			}
			tools.getParameterPage().putParamValue("DequeudCount", PropertyInfo.TYPE_INTEGER, dequeuedCount);
			if (oLog.isDebugEnabled())
				oLog.debug("EventProcessing(Debugging): Event evaluation agent processed " + dequeuedCount + " events in this iteration.");
		}
	}		
} catch (Throwable t) {
	oLog.infoForced("EventProcessing(Error): Error during event evaluation", t);
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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY SYSTEM-QUEUE-EVENTS PZSYSTEMEVENTEVALUATION #20180713T134345.441 GMT", "System-Queue-Events pzSystemEventEvaluation", "Pega-EventProcessing", "08-01-01", false, true, "", "ACTIVITY", "20180713T134345.441 GMT" ,"Rule-Obj-Activity"); }
