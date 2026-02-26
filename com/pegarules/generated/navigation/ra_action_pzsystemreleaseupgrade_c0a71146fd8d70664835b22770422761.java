package com.pegarules.generated.navigation;
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
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
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
import java.util.*;
public class ra_action_pzsystemreleaseupgrade_c0a71146fd8d70664835b22770422761  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzSystemReleaseUpgrade.Pega_Landing.Action");
	public ra_action_pzsystemreleaseupgrade_c0a71146fd8d70664835b22770422761(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}

ClipboardPage stepPage = null;
String finalOutPutPageName = null;
boolean forceFullLoad = false;
boolean isDynamicFieldNameForMenu = true;
boolean functionalTestingWhen = false;
boolean testIDWhen = false;
public void perform() {
functionalTestingWhen = pega_uiengine_pznavigation.evaluateWhen("pyEnableFunctionalTesting", tools.getStepPage().getClassName(), tools);
testIDWhen = pega_uiengine_pznavigation.evaluateWhen("pzEnableTestId",tools.getStepPage().getClassName(),tools);
com.pega.pegarules.priv.tracer.RuleTraceInfo mTraceInfo = oTraceInfo_0 ;
if(mTraceInfo!=null && pega.isTraceEnabled("Rule Coverage", mTraceInfo)){pega.logTraceEvent("Rule Coverage", "Navigation Start", "GOOD", mTraceInfo,mTraceInfo.getInsKey(), "BEGIN NAVIGATION",false, tools.getPrimaryPage(), tools.getStackFrame().getParameterPage(), null);}/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-NAVIGATION PEGA-LANDING PZSYSTEMRELEASEUPGRADE #20190307T115721.642 GMT	Pega-LP:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(false){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzSystemReleaseUpgrade"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzSystemReleaseUpgrade");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
}
	} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODBODY", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE", 
	"Rule-Navigation:PZSYSTEMRELEASEUPGRADE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZSYSTEMRELEASEUPGRADE","Rule-Navigation","PEGA-LANDING",false,"","Pega-LP","08-03-01","RULE-NAVIGATION PEGA-LANDING PZSYSTEMRELEASEUPGRADE #20190307T115721.642 GMT","!PZSYSTEMRELEASEUPGRADE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1805458323)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}

public static final DependentRuleInfo[] oTrackedDependencies = new DependentRuleInfo[]{oDependentRuleInfos[0]};

//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT:crc:865379769
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT:20180713T133341.480 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT:20180713T133341.484 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT:20180713T133341.496 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-NAVIGATION PEGA-LANDING PZSYSTEMRELEASEUPGRADE #20190307T115721.642 GMT:20190307T115721.642 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENLANDINGPAGE #20180918T064825.561 GMT:20181015T130125.636 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZNAVIGATION PZISREFERENCE #20180713T133347.956 GMT:20180713T133347.956 GMT
//	RULE-UTILITY-FUNCTION STRING ISDOUBLE #20180713T131441.648 GMT:20180713T131441.648 GMT
//	RULE-UTILITY-FUNCTION STRING ISINTEGER #20180713T131441.652 GMT:20180713T131441.652 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "a43cf0a43a5024a12520cfd77c8ceb5e";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Landing";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzSystemReleaseUpgrade" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "Upgrade".equals(nodePathArr[0])  && !isNodePathEmpty)){
String uniqueSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String commonPrefix = "Nav_";
boolean showWhenCondition = true;
boolean isActiveNavItem = false;
boolean showHavePrivilege = true;
boolean enableWhenCondition = true;
boolean enableHavePrivilege = true;
boolean enableWhenConditionParent = true;
boolean enableHavePrivilegeParent = true;
boolean hideElement = false;
boolean disableElement = false;
boolean isChecked = false;
boolean isGroup = false;
String pyCaption = null;
String pyName = null;
String pySummary = null;
String propertyValue = null;
StringMap custActParamMap = null;
ParameterPage custParamsPage = null;
StringMap preActParamMap = null;
StringMap postActParamMap = null;
Iterator actionListIter = null;
ClipboardProperty iterListResult = null;
ClipboardProperty nodePageList = null;
ClipboardPage childListPage = null;
ParameterPage newParamsPage = null;
String strName = "";
String strValue = "";
String strPageList = "";
String nodePathName=null;
ClipboardPage executePage = null;
int startIndex=0;
boolean dontExitNow=true;
String actionPageParent="actionPage1";
boolean nodePathValidated=false;
String pyNameSuffix = "";
String parentPageRef = "";
String strPageName = "";
boolean deferLoad = false;
boolean skipNode = false;
String deferLoadPath = tools.getParamValue("deferLoadPath");
String deferPathArr[] = StringUtils.isBlank(deferLoadPath)?new String[0]:deferLoadPath.split("/");
String currentDeferPath = "";
int deferIndex = 0;
int nodeDepth=0;
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("Upgrade")){
return;}
if(processShortcut &&"Upgrade".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage1= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage1 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage1 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyHasAccessToMTRestrictedRules";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","Upgrade");actionPage1.putString( "pyImageSource","styleclass");actionPage1.putString( "pyIconStyle","lpiBase lpiSystemUpgrade");actionPage1.putString( "pyCaption","Upgrade");actionPage1.putString( "pySummary","");actionPage1.putString( "pyBadgeProperty","");actionPage1.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201803050817390595163");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","lpiBase lpiSystemUpgrade");if (!hideElement) { 
actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","openLanding");ClipboardPage commandPage1 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage1.putString( "pyAction","Display");commandPage1.putString( "pyName","System: Upgrade");commandPage1.putString( "pyClassName","Pega-Landing-System");commandPage1.putString( "pyLevelA","");commandPage1.putString( "pyLevelB","");commandPage1.putString( "pyLevelC","UpgradeExistingApplications");commandPage1.putString( "pyElementName","");commandPage1.putString( "pyTargetElement","");commandPage1.putString( "pyIsTargetMicroDC","");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPSystemUpgrade");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage1);
behaviorPage1.putPage("pyActionAPI",commandPage1);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage1.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage1);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("Upgrade")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("postUpgrade".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - postUpgrade*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage2= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage2 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage2 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","postUpgrade");actionPage2.putString( "pyCaption","Update Existing Applications");actionPage2.putString( "pySummary","");actionPage2.putString( "pyBadgeProperty","");actionPage2.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage2.putString( "pyAutomationID","201803050817390474592");}actionPage2.putString( "pyBadgeFormat","");actionPage2.putString( "pyDeferLoad","");actionPage2.putString( "pyImage","");actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage2 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","openLanding");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage2.putString( "pyAction","Display");commandPage2.putString( "pyName","System: Upgrade");commandPage2.putString( "pyClassName","Pega-Landing-System");commandPage2.putString( "pyLevelA","");commandPage2.putString( "pyLevelB","");commandPage2.putString( "pyLevelC","UpgradeExistingApplications");commandPage2.putString( "pyElementName","");commandPage2.putString( "pyTargetElement","");commandPage2.putString( "pyIsTargetMicroDC","");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPSystemUpgrade");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("SystemFinalConflicts".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - SystemFinalConflicts*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage4= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage4 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage4 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage4.putString("pyHidden",String.valueOf(hideElement));actionPage4.putString("pyDisabled",String.valueOf(disableElement));actionPage4.putString( "pyName","SystemFinalConflicts");actionPage4.putString( "pyCaption","Final Conflicts");actionPage4.putString( "pySummary","");actionPage4.putString( "pyBadgeProperty","");actionPage4.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage4.putString( "pyAutomationID","201803050817390499256");}actionPage4.putString( "pyBadgeFormat","");actionPage4.putString( "pyDeferLoad","");actionPage4.putString( "pyImage","");actionPage4.putString("pyType","Action");
executePage=actionPage4.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage4 = actionPage4.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","openLanding");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage4.putString( "pyAction","Display");commandPage4.putString( "pyName","System: Upgrade");commandPage4.putString( "pyClassName","Pega-Landing-System");commandPage4.putString( "pyLevelA","");commandPage4.putString( "pyLevelB","");commandPage4.putString( "pyLevelC","FinalConflicts");commandPage4.putString( "pyElementName","");commandPage4.putString( "pyTargetElement","");commandPage4.putString( "pyIsTargetMicroDC","");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPSystemUpgrade");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage4);
behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage4.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1321595228736000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1321595228736000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage6= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage6 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage6 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsSystemCached";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage6.putString("pyHidden",String.valueOf(hideElement));actionPage6.putString("pyDisabled",String.valueOf(disableElement));actionPage6.putString( "pyName","ID1321595228736000");actionPage6.putString( "pyCaption","Upgrade Applications Schema");actionPage6.putString( "pySummary","");actionPage6.putString( "pyBadgeProperty","");actionPage6.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage6.putString( "pyAutomationID","201803050817390524633");}actionPage6.putString( "pyBadgeFormat","Standard (label)");actionPage6.putString( "pyDeferLoad","false");actionPage6.putString( "pyImage","");if (!hideElement) { 
actionPage6.putString("pyType","Action");
executePage=actionPage6.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage6 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","openLanding");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage6.putString( "pyAction","Display");commandPage6.putString( "pyName","System: Upgrade");commandPage6.putString( "pyClassName","Pega-Landing-System");commandPage6.putString( "pyLevelA","");commandPage6.putString( "pyLevelB","");commandPage6.putString( "pyLevelC","SchemaReport");commandPage6.putString( "pyElementName","");commandPage6.putString( "pyTargetElement","");commandPage6.putString( "pyIsTargetMicroDC","");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPSystemUpgrade");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage6);
behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1321595039344000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1321595039344000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage8= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage8 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage8 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage8.putString("pyHidden",String.valueOf(hideElement));actionPage8.putString("pyDisabled",String.valueOf(disableElement));actionPage8.putString( "pyName","ID1321595039344000");actionPage8.putString( "pyCaption","Upgrade Tools");actionPage8.putString( "pySummary","");actionPage8.putString( "pyBadgeProperty","");actionPage8.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage8.putString( "pyAutomationID","201803050817390554496");}actionPage8.putString( "pyBadgeFormat","Standard (label)");actionPage8.putString( "pyDeferLoad","");actionPage8.putString( "pyImage","");actionPage8.putString("pyType","Action");
executePage=actionPage8.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage8 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","openLanding");ClipboardPage commandPage8 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage8.putString( "pyAction","Display");commandPage8.putString( "pyName","System: Upgrade");commandPage8.putString( "pyClassName","Pega-Landing-System");commandPage8.putString( "pyLevelA","");commandPage8.putString( "pyLevelB","");commandPage8.putString( "pyLevelC","UpgradeTools");commandPage8.putString( "pyElementName","");commandPage8.putString( "pyTargetElement","");commandPage8.putString( "pyIsTargetMicroDC","");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPSystemUpgrade");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage8);
behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("validate".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - validate*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage10= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage10 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage10 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsNotMTOrIsShared";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage10.putString("pyHidden",String.valueOf(hideElement));actionPage10.putString("pyDisabled",String.valueOf(disableElement));actionPage10.putString( "pyName","validate");actionPage10.putString( "pyCaption","Validate");actionPage10.putString( "pySummary","");actionPage10.putString( "pyBadgeProperty","");actionPage10.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage10.putString( "pyAutomationID","201803050817390580911");}actionPage10.putString( "pyBadgeFormat","Standard (label)");actionPage10.putString( "pyDeferLoad","");actionPage10.putString( "pyImage","");if (!hideElement) { 
actionPage10.putString("pyType","Action");
executePage=actionPage10.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage10 = actionPage10.getPage("pyBehaviors(<append>)");
behaviorPage10.putString("pyAction","openLanding");ClipboardPage commandPage10 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage10.putString( "pyAction","Display");commandPage10.putString( "pyName","System: Upgrade");commandPage10.putString( "pyClassName","Pega-Landing-System");commandPage10.putString( "pyLevelA","");commandPage10.putString( "pyLevelB","");commandPage10.putString( "pyLevelC","Validate");commandPage10.putString( "pyElementName","");commandPage10.putString( "pyTargetElement","");commandPage10.putString( "pyIsTargetMicroDC","");commandPage10.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPSystemUpgrade");commandPage10.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage10.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage10.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage10);
behaviorPage10.putPage("pyActionAPI",commandPage10);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage10.getPage("pyBehaviors(<LAST>)")).register();
commandPage10.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1551786276496000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1551786276496000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage12= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage12 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage12 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","ID1551786276496000");actionPage12.putString( "pyCaption","Attachment Migration");actionPage12.putString( "pySummary","");actionPage12.putString( "pyBadgeProperty","");actionPage12.putString( "pyToolTip","Migrating the attachments from one storage type to another");if(testIDWhen || functionalTestingWhen){actionPage12.putString( "pyAutomationID","201903050644360492823");}actionPage12.putString( "pyBadgeFormat","Standard (label)");actionPage12.putString( "pyDeferLoad","false");actionPage12.putString( "pyImage","");actionPage12.putString("pyType","Action");
executePage=actionPage12.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage12 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","openLanding");ClipboardPage commandPage12 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage12.putString( "pyAction","Display");commandPage12.putString( "pyName","Attachment Migration");commandPage12.putString( "pyClassName","PegaAccel-AttachmentMigration");commandPage12.putString( "pyLevelA","");commandPage12.putString( "pyLevelB","");commandPage12.putString( "pyLevelC","");commandPage12.putString( "pyElementName","");commandPage12.putString( "pyTargetElement","");commandPage12.putString( "pyIsTargetMicroDC","");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzAttachmentsMigrationLP");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyModel","pzPopulateAttachmentsMigrationStats");executePage.putPage("pyOpenLanding",commandPage12);
behaviorPage12.putPage("pyActionAPI",commandPage12);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION PEGA-LANDING PZSYSTEMRELEASEUPGRADE #20190307T115721.642 GMT", "Pega-Landing pzSystemReleaseUpgrade", "Pega-LP", "08-03-01", "20190307T115721.642 GMT");
}
