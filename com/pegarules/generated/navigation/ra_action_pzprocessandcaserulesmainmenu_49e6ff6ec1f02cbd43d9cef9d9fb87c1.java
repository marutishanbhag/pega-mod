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
public class ra_action_pzprocessandcaserulesmainmenu_49e6ff6ec1f02cbd43d9cef9d9fb87c1  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzProcessAndCaseRulesMainMenu.Pega_Landing.Action");
	public ra_action_pzprocessandcaserulesmainmenu_49e6ff6ec1f02cbd43d9cef9d9fb87c1(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION PEGA-LANDING PZPROCESSANDCASERULESMAINMENU #20210128T124230.032 GMT	Pega-LP-ProcessAndRules:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(false){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzProcessRulesMainMenu"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzProcessRulesMainMenu");
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENWIZARD", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSREPORTDEFINITION", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZPROCESSANDCASERULESMAINMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENWIZARD","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENWIZARD",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSREPORTDEFINITION","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSREPORTDEFINITION",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPROCESSANDCASERULESMAINMENU","Rule-Navigation","PEGA-LANDING",false,"","Pega-LP-ProcessAndRules","08-06-01","RULE-NAVIGATION PEGA-LANDING PZPROCESSANDCASERULESMAINMENU #20210128T124230.032 GMT","!PZPROCESSANDCASERULESMAINMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-10363573)
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
//	RULE-NAVIGATION PEGA-LANDING PZPROCESSANDCASERULESMAINMENU #20210128T124230.032 GMT:20210128T124230.032 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEFORCUSTOM #20180713T133341.521 GMT:20180713T133341.521 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZISREFERENCEFORCUSTOM #20180713T133341.542 GMT:20180713T133341.542 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCUSTOM #20180713T133341.621 GMT:20180713T133341.621 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENLANDINGPAGE #20180918T064825.561 GMT:20181015T130125.636 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243 #20181120T072650.970 GMT:20181120T072650.970 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENWIZARD #20180713T133342.768 GMT:20180713T133342.768 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSREPORTDEFINITION #20180713T133342.793 GMT:20180713T133342.793 GMT
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
		return "27ee869ef0c8c2178ab2bd3846f5a6da";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Landing";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProcessRulesMainMenu" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "processRules".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("processRules")){
return;}
if(processShortcut &&"processRules".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","processRules");actionPage1.putString( "pyImageSource","styleclass");actionPage1.putString( "pyIconStyle","lpiBase lpiProcessRules");actionPage1.putString( "pyCaption","Case Management");actionPage1.putString( "pySummary","");actionPage1.putString( "pyBadgeProperty","");actionPage1.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201803290308540765760");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","lpiBase lpiProcessRules");actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","openLanding");ClipboardPage commandPage1 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage1.putString( "pyAction","Display");commandPage1.putString( "pyName","Case Management: Processes");commandPage1.putString( "pyClassName","Pega-Landing-Process");commandPage1.putString( "pyLevelA","Summary");commandPage1.putString( "pyLevelB","");commandPage1.putString( "pyLevelC","");commandPage1.putString( "pyElementName","");commandPage1.putString( "pyTargetElement","");commandPage1.putString( "pyIsTargetMicroDC","");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesProcesses");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage1.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage1);
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
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("processRules")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("proceses".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - proceses*/

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
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","proceses");actionPage2.putString( "pyImageSource","styleclass");actionPage2.putString( "pyIconStyle","lpiBase lpiProcessAndRulesProcesses");actionPage2.putString( "pyCaption","Processes");actionPage2.putString( "pySummary","");actionPage2.putString( "pyBadgeProperty","");actionPage2.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage2.putString( "pyAutomationID","201803290308530297328");}actionPage2.putString( "pyBadgeFormat","Standard (label)");actionPage2.putString( "pyDeferLoad","false");actionPage2.putString( "pyImage","lpiBase lpiProcessAndRulesProcesses");actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage2 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","openLanding");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage2.putString( "pyAction","Display");commandPage2.putString( "pyName","Case Management: Processes");commandPage2.putString( "pyClassName","Pega-Landing-Process");commandPage2.putString( "pyLevelA","");commandPage2.putString( "pyLevelB","");commandPage2.putString( "pyLevelC","");commandPage2.putString( "pyElementName","");commandPage2.putString( "pyTargetElement","");commandPage2.putString( "pyIsTargetMicroDC","");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesProcesses");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage2.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("proceses")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("flowErrors".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - flowErrors*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage3= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage2 != null ? actionPage2.getReference() : "" 
;actionPage3 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage3 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage3.putString("pyHidden",String.valueOf(hideElement));actionPage3.putString("pyDisabled",String.valueOf(disableElement));actionPage3.putString( "pyName","flowErrors");actionPage3.putString( "pyCaption","Flow Errors");actionPage3.putString( "pySummary","");actionPage3.putString( "pyBadgeProperty","");actionPage3.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage3.putString( "pyAutomationID","201803290308520803692");}actionPage3.putString( "pyBadgeFormat","Standard (label)");actionPage3.putString( "pyDeferLoad","false");actionPage3.putString( "pyImage","");actionPage3.putString("pyType","Action");
executePage=actionPage3.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage3 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","openLanding");ClipboardPage commandPage3 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage3.putString( "pyAction","Display");commandPage3.putString( "pyName","Case Management: Processes");commandPage3.putString( "pyClassName","Pega-Landing-Process");commandPage3.putString( "pyLevelA","");commandPage3.putString( "pyLevelB","");commandPage3.putString( "pyLevelC","FlowErrors");commandPage3.putString( "pyElementName","");commandPage3.putString( "pyTargetElement","");commandPage3.putString( "pyIsTargetMicroDC","");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesProcesses");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage3);
behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
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
if(processAction||("slas".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - slas*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage5= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage2 != null ? actionPage2.getReference() : "" 
;actionPage5 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage5 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage5.putString("pyHidden",String.valueOf(hideElement));actionPage5.putString("pyDisabled",String.valueOf(disableElement));actionPage5.putString( "pyName","slas");actionPage5.putString( "pyCaption","SLAs");actionPage5.putString( "pySummary","");actionPage5.putString( "pyBadgeProperty","");actionPage5.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage5.putString( "pyAutomationID","201803290308530213516");}actionPage5.putString( "pyBadgeFormat","Standard (label)");actionPage5.putString( "pyDeferLoad","false");actionPage5.putString( "pyImage","");actionPage5.putString("pyType","Action");
executePage=actionPage5.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage5 = actionPage5.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","openLanding");ClipboardPage commandPage5 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage5.putString( "pyAction","Display");commandPage5.putString( "pyName","Case Management: Processes");commandPage5.putString( "pyClassName","Pega-Landing-Process");commandPage5.putString( "pyLevelA","");commandPage5.putString( "pyLevelB","");commandPage5.putString( "pyLevelC","SLAs");commandPage5.putString( "pyElementName","");commandPage5.putString( "pyTargetElement","");commandPage5.putString( "pyIsTargetMicroDC","");commandPage5.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesProcesses");commandPage5.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage5.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage5.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage5);
behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage5.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
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
if(processAction||("ID1304910625026000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1304910625026000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage7= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage2 != null ? actionPage2.getReference() : "" 
;actionPage7 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage7 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage7.putString("pyHidden",String.valueOf(hideElement));actionPage7.putString("pyDisabled",String.valueOf(disableElement));actionPage7.putString( "pyName","ID1304910625026000");actionPage7.putString( "pyCaption","Status Values");actionPage7.putString( "pySummary","");actionPage7.putString( "pyBadgeProperty","");actionPage7.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage7.putString( "pyAutomationID","201803290308530236209");}actionPage7.putString( "pyBadgeFormat","Standard (label)");actionPage7.putString( "pyDeferLoad","false");actionPage7.putString( "pyImage","");actionPage7.putString("pyType","Action");
executePage=actionPage7.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage7 = actionPage7.getPage("pyBehaviors(<append>)");
behaviorPage7.putString("pyAction","openLanding");ClipboardPage commandPage7 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage7.putString( "pyAction","Display");commandPage7.putString( "pyName","Case Management: Processes");commandPage7.putString( "pyClassName","Pega-Landing-Process");commandPage7.putString( "pyLevelA","");commandPage7.putString( "pyLevelB","");commandPage7.putString( "pyLevelC","Status Values");commandPage7.putString( "pyElementName","");commandPage7.putString( "pyTargetElement","");commandPage7.putString( "pyIsTargetMicroDC","");commandPage7.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesProcesses");commandPage7.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage7.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage7.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage7);
behaviorPage7.putPage("pyActionAPI",commandPage7);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage7.getPage("pyBehaviors(<LAST>)")).register();
commandPage7.removeFromClipboard();
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
if(processAction||("ID1302687481061000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1302687481061000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage9= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage2 != null ? actionPage2.getReference() : "" 
;actionPage9 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage9 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage9.putString("pyHidden",String.valueOf(hideElement));actionPage9.putString("pyDisabled",String.valueOf(disableElement));actionPage9.putString( "pyName","ID1302687481061000");actionPage9.putString( "pyCaption","APIs");actionPage9.putString( "pySummary","");actionPage9.putString( "pyBadgeProperty","");actionPage9.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage9.putString( "pyAutomationID","20180329030853026114");}actionPage9.putString( "pyBadgeFormat","Standard (label)");actionPage9.putString( "pyDeferLoad","false");actionPage9.putString( "pyImage","");actionPage9.putString("pyType","Action");
executePage=actionPage9.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage9 = actionPage9.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","openLanding");ClipboardPage commandPage9 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage9.putString( "pyAction","Display");commandPage9.putString( "pyName","Case Management: Processes");commandPage9.putString( "pyClassName","Pega-Landing-Process");commandPage9.putString( "pyLevelA","");commandPage9.putString( "pyLevelB","");commandPage9.putString( "pyLevelC","APIs");commandPage9.putString( "pyElementName","");commandPage9.putString( "pyTargetElement","");commandPage9.putString( "pyIsTargetMicroDC","");commandPage9.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesProcesses");commandPage9.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage9.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage9.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage9);
behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage9.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("events".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - events*/

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
showWhenCondition = true;
String whenResolved ="pzIsEventsAccessible";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","events");actionPage12.putString( "pyImageSource","styleclass");actionPage12.putString( "pyIconStyle","lpiBase lpiProcessAndRulesEvents");actionPage12.putString( "pyCaption","Events");actionPage12.putString( "pySummary","");actionPage12.putString( "pyBadgeProperty","");actionPage12.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage12.putString( "pyAutomationID","201803290308530367212");}actionPage12.putString( "pyBadgeFormat","Standard (label)");actionPage12.putString( "pyDeferLoad","false");actionPage12.putString( "pyImage","lpiBase lpiProcessAndRulesEvents");if (!hideElement) { 
actionPage12.putString("pyType","Action");
executePage=actionPage12.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage12 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","openLanding");ClipboardPage commandPage12 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage12.putString( "pyAction","Display");commandPage12.putString( "pyName","Process and Rules: Events");commandPage12.putString( "pyClassName","Pega-Landing-Process");commandPage12.putString( "pyLevelA","");commandPage12.putString( "pyLevelB","");commandPage12.putString( "pyLevelC","");commandPage12.putString( "pyElementName","");commandPage12.putString( "pyTargetElement","");commandPage12.putString( "pyIsTargetMicroDC","");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesEvents");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage12.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage12);
behaviorPage12.putPage("pyActionAPI",commandPage12);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("events")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1291797920124000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1291797920124000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage13= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage12 != null ? actionPage12.getReference() : "" 
;actionPage13 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage13 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage13.putString("pyHidden",String.valueOf(hideElement));actionPage13.putString("pyDisabled",String.valueOf(disableElement));actionPage13.putString( "pyName","ID1291797920124000");actionPage13.putString( "pyCaption","Event Definitions");actionPage13.putString( "pySummary","");actionPage13.putString( "pyBadgeProperty","");actionPage13.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage13.putString( "pyAutomationID","201803290308530333162");}actionPage13.putString( "pyBadgeFormat","");actionPage13.putString( "pyDeferLoad","");actionPage13.putString( "pyImage","");actionPage13.putString("pyType","Action");
executePage=actionPage13.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage13 = actionPage13.getPage("pyBehaviors(<append>)");
behaviorPage13.putString("pyAction","openLanding");ClipboardPage commandPage13 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage13.putString( "pyAction","Display");commandPage13.putString( "pyName","Process and Rules: Events");commandPage13.putString( "pyClassName","Pega-Landing-Process");commandPage13.putString( "pyLevelA","");commandPage13.putString( "pyLevelB","");commandPage13.putString( "pyLevelC","DefinitionSummary");commandPage13.putString( "pyElementName","");commandPage13.putString( "pyTargetElement","");commandPage13.putString( "pyIsTargetMicroDC","");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesEvents");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage13);
behaviorPage13.putPage("pyActionAPI",commandPage13);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage13.getPage("pyBehaviors(<LAST>)")).register();
commandPage13.removeFromClipboard();
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
if(processAction||("ID1291797920124002".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1291797920124002*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage15= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage12 != null ? actionPage12.getReference() : "" 
;actionPage15 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage15 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage15.putString("pyHidden",String.valueOf(hideElement));actionPage15.putString("pyDisabled",String.valueOf(disableElement));actionPage15.putString( "pyName","ID1291797920124002");actionPage15.putString( "pyCaption","Event Logs");actionPage15.putString( "pySummary","");actionPage15.putString( "pyBadgeProperty","");actionPage15.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage15.putString( "pyAutomationID","201803290308530355328");}actionPage15.putString( "pyBadgeFormat","");actionPage15.putString( "pyDeferLoad","");actionPage15.putString( "pyImage","");actionPage15.putString("pyType","Action");
executePage=actionPage15.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage15 = actionPage15.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","openLanding");ClipboardPage commandPage15 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage15.putString( "pyAction","Display");commandPage15.putString( "pyName","Process and Rules: Events");commandPage15.putString( "pyClassName","Pega-Landing-Process");commandPage15.putString( "pyLevelA","");commandPage15.putString( "pyLevelB","");commandPage15.putString( "pyLevelC","ActionandErrorLogs");commandPage15.putString( "pyElementName","");commandPage15.putString( "pyTargetElement","");commandPage15.putString( "pyIsTargetMicroDC","");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesEvents");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage15);
behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage15.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("businessRules".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - businessRules*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage18= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage18 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage18 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage18.putString("pyHidden",String.valueOf(hideElement));actionPage18.putString("pyDisabled",String.valueOf(disableElement));actionPage18.putString( "pyName","businessRules");actionPage18.putString( "pyImageSource","styleclass");actionPage18.putString( "pyIconStyle","lpiBase lpiProcessAndRulesBusinessRules");actionPage18.putString( "pyCaption","Business Rules");actionPage18.putString( "pySummary","");actionPage18.putString( "pyBadgeProperty","");actionPage18.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage18.putString( "pyAutomationID","201803290308530421549");}actionPage18.putString( "pyBadgeFormat","Standard (label)");actionPage18.putString( "pyDeferLoad","false");actionPage18.putString( "pyImage","lpiBase lpiProcessAndRulesBusinessRules");actionPage18.putString("pyType","Action");
executePage=actionPage18.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage18 = actionPage18.getPage("pyBehaviors(<append>)");
behaviorPage18.putString("pyAction","openLanding");ClipboardPage commandPage18 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage18.putString( "pyAction","Display");commandPage18.putString( "pyName","Case Management: Business Rules");commandPage18.putString( "pyClassName","Pega-Landing-Process");commandPage18.putString( "pyLevelA","");commandPage18.putString( "pyLevelB","");commandPage18.putString( "pyLevelC","");commandPage18.putString( "pyElementName","");commandPage18.putString( "pyTargetElement","");commandPage18.putString( "pyIsTargetMicroDC","");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesBusinessRules");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage18);
behaviorPage18.putPage("pyActionAPI",commandPage18);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage18.getPage("pyBehaviors(<LAST>)")).register();
commandPage18.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("businessRules")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("declarativeNetworkAnalysis".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - declarativeNetworkAnalysis*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage19= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage18 != null ? actionPage18.getReference() : "" 
;actionPage19 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage19 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage19.putString("pyHidden",String.valueOf(hideElement));actionPage19.putString("pyDisabled",String.valueOf(disableElement));actionPage19.putString( "pyName","declarativeNetworkAnalysis");actionPage19.putString( "pyCaption","Declarative Network");actionPage19.putString( "pySummary","");actionPage19.putString( "pyBadgeProperty","");actionPage19.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage19.putString( "pyAutomationID","201803290308530409441");}actionPage19.putString( "pyBadgeFormat","Standard (label)");actionPage19.putString( "pyDeferLoad","false");actionPage19.putString( "pyImage","");actionPage19.putString("pyType","Action");
executePage=actionPage19.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage19 = actionPage19.getPage("pyBehaviors(<append>)");
behaviorPage19.putString("pyAction","openLanding");ClipboardPage commandPage19 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage19.putString( "pyAction","Display");commandPage19.putString( "pyName","Case Management: Business Rules");commandPage19.putString( "pyClassName","Pega-Landing-Process");commandPage19.putString( "pyLevelA","");commandPage19.putString( "pyLevelB","");commandPage19.putString( "pyLevelC","DeclarativeNetworkAnalysis");commandPage19.putString( "pyElementName","");commandPage19.putString( "pyTargetElement","");commandPage19.putString( "pyIsTargetMicroDC","");commandPage19.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesBusinessRules");commandPage19.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage19.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage19.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage19);
behaviorPage19.putPage("pyActionAPI",commandPage19);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage19.getPage("pyBehaviors(<LAST>)")).register();
commandPage19.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workManagement".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workManagement*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage22= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage22 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage22 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage22.putString("pyHidden",String.valueOf(hideElement));actionPage22.putString("pyDisabled",String.valueOf(disableElement));actionPage22.putString( "pyName","workManagement");actionPage22.putString( "pyImageSource","styleclass");actionPage22.putString( "pyIconStyle","lpiBase lpiProcessAndRulesWorkManagement");actionPage22.putString( "pyCaption","Work Management");actionPage22.putString( "pySummary","");actionPage22.putString( "pyBadgeProperty","");actionPage22.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage22.putString( "pyAutomationID","201803290308530529264");}actionPage22.putString( "pyBadgeFormat","Standard (label)");actionPage22.putString( "pyDeferLoad","false");actionPage22.putString( "pyImage","lpiBase lpiProcessAndRulesWorkManagement");actionPage22.putString("pyType","Action");
executePage=actionPage22.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage22 = actionPage22.getPage("pyBehaviors(<append>)");
behaviorPage22.putString("pyAction","openLanding");ClipboardPage commandPage22 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage22.putString( "pyAction","Display");commandPage22.putString( "pyName","Case Management: Work Management");commandPage22.putString( "pyClassName","Pega-Landing-Process");commandPage22.putString( "pyLevelA","");commandPage22.putString( "pyLevelB","");commandPage22.putString( "pyLevelC","");commandPage22.putString( "pyElementName","");commandPage22.putString( "pyTargetElement","");commandPage22.putString( "pyIsTargetMicroDC","");commandPage22.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesWorkManagement");commandPage22.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage22.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage22.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage22);
behaviorPage22.putPage("pyActionAPI",commandPage22);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage22.getPage("pyBehaviors(<LAST>)")).register();
commandPage22.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("workManagement")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workbaskets".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workbaskets*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage23= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage22 != null ? actionPage22.getReference() : "" 
;actionPage23 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage23 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage23.putString("pyHidden",String.valueOf(hideElement));actionPage23.putString("pyDisabled",String.valueOf(disableElement));actionPage23.putString( "pyName","workbaskets");actionPage23.putString( "pyCaption","Work queues");actionPage23.putString( "pySummary","");actionPage23.putString( "pyBadgeProperty","");actionPage23.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage23.putString( "pyAutomationID","201803290308530451662");}actionPage23.putString( "pyBadgeFormat","Standard (label)");actionPage23.putString( "pyDeferLoad","false");actionPage23.putString( "pyImage","");actionPage23.putString("pyType","Action");
executePage=actionPage23.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage23 = actionPage23.getPage("pyBehaviors(<append>)");
behaviorPage23.putString("pyAction","openLanding");ClipboardPage commandPage23 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage23.putString( "pyAction","Display");commandPage23.putString( "pyName","Case Management: Work Management");commandPage23.putString( "pyClassName","Pega-Landing-Process");commandPage23.putString( "pyLevelA","");commandPage23.putString( "pyLevelB","");commandPage23.putString( "pyLevelC","Workbaskets");commandPage23.putString( "pyElementName","");commandPage23.putString( "pyTargetElement","");commandPage23.putString( "pyIsTargetMicroDC","");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesWorkManagement");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage23);
behaviorPage23.putPage("pyActionAPI",commandPage23);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage23.getPage("pyBehaviors(<LAST>)")).register();
commandPage23.removeFromClipboard();
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
if(processAction||("skills".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - skills*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage25= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage22 != null ? actionPage22.getReference() : "" 
;actionPage25 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage25 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage25.putString("pyHidden",String.valueOf(hideElement));actionPage25.putString("pyDisabled",String.valueOf(disableElement));actionPage25.putString( "pyName","skills");actionPage25.putString( "pyCaption","Skills");actionPage25.putString( "pySummary","");actionPage25.putString( "pyBadgeProperty","");actionPage25.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage25.putString( "pyAutomationID","201803290308530475461");}actionPage25.putString( "pyBadgeFormat","Standard (label)");actionPage25.putString( "pyDeferLoad","false");actionPage25.putString( "pyImage","");actionPage25.putString("pyType","Action");
executePage=actionPage25.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage25 = actionPage25.getPage("pyBehaviors(<append>)");
behaviorPage25.putString("pyAction","openLanding");ClipboardPage commandPage25 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage25.putString( "pyAction","Display");commandPage25.putString( "pyName","Case Management: Work Management");commandPage25.putString( "pyClassName","Pega-Landing-Process");commandPage25.putString( "pyLevelA","");commandPage25.putString( "pyLevelB","");commandPage25.putString( "pyLevelC","Skills");commandPage25.putString( "pyElementName","");commandPage25.putString( "pyTargetElement","");commandPage25.putString( "pyIsTargetMicroDC","");commandPage25.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesWorkManagement");commandPage25.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage25.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage25.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage25);
behaviorPage25.putPage("pyActionAPI",commandPage25);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage25.getPage("pyBehaviors(<LAST>)")).register();
commandPage25.removeFromClipboard();
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
if(processAction||("tickets".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - tickets*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage27= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage22 != null ? actionPage22.getReference() : "" 
;actionPage27 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage27 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage27.putString("pyHidden",String.valueOf(hideElement));actionPage27.putString("pyDisabled",String.valueOf(disableElement));actionPage27.putString( "pyName","tickets");actionPage27.putString( "pyCaption","Tickets");actionPage27.putString( "pySummary","");actionPage27.putString( "pyBadgeProperty","");actionPage27.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage27.putString( "pyAutomationID","201803290308530497160");}actionPage27.putString( "pyBadgeFormat","Standard (label)");actionPage27.putString( "pyDeferLoad","false");actionPage27.putString( "pyImage","");actionPage27.putString("pyType","Action");
executePage=actionPage27.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage27 = actionPage27.getPage("pyBehaviors(<append>)");
behaviorPage27.putString("pyAction","openLanding");ClipboardPage commandPage27 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage27.putString( "pyAction","Display");commandPage27.putString( "pyName","Case Management: Work Management");commandPage27.putString( "pyClassName","Pega-Landing-Process");commandPage27.putString( "pyLevelA","");commandPage27.putString( "pyLevelB","");commandPage27.putString( "pyLevelC","Tickets");commandPage27.putString( "pyElementName","");commandPage27.putString( "pyTargetElement","");commandPage27.putString( "pyIsTargetMicroDC","");commandPage27.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesWorkManagement");commandPage27.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage27.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage27.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage27);
behaviorPage27.putPage("pyActionAPI",commandPage27);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage27.getPage("pyBehaviors(<LAST>)")).register();
commandPage27.removeFromClipboard();
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
if(processAction||("fieldLevelAuditing".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - fieldLevelAuditing*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage29= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage22 != null ? actionPage22.getReference() : "" 
;actionPage29 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage29 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage29.putString("pyHidden",String.valueOf(hideElement));actionPage29.putString("pyDisabled",String.valueOf(disableElement));actionPage29.putString( "pyName","fieldLevelAuditing");actionPage29.putString( "pyCaption","Field Level Auditing");actionPage29.putString( "pySummary","");actionPage29.putString( "pyBadgeProperty","");actionPage29.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage29.putString( "pyAutomationID","201803290308530518970");}actionPage29.putString( "pyBadgeFormat","Standard (label)");actionPage29.putString( "pyDeferLoad","false");actionPage29.putString( "pyImage","");actionPage29.putString("pyType","Action");
executePage=actionPage29.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage29 = actionPage29.getPage("pyBehaviors(<append>)");
behaviorPage29.putString("pyAction","openLanding");ClipboardPage commandPage29 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage29.putString( "pyAction","Display");commandPage29.putString( "pyName","Case Management: Work Management");commandPage29.putString( "pyClassName","Pega-Landing-Process");commandPage29.putString( "pyLevelA","");commandPage29.putString( "pyLevelB","");commandPage29.putString( "pyLevelC","FieldLevelAuditing");commandPage29.putString( "pyElementName","");commandPage29.putString( "pyTargetElement","");commandPage29.putString( "pyIsTargetMicroDC","");commandPage29.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesWorkManagement");commandPage29.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage29.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage29.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage29);
behaviorPage29.putPage("pyActionAPI",commandPage29);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage29.getPage("pyBehaviors(<LAST>)")).register();
commandPage29.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("social".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - social*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage32= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage32 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage32 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage32.putString("pyHidden",String.valueOf(hideElement));actionPage32.putString("pyDisabled",String.valueOf(disableElement));actionPage32.putString( "pyName","social");actionPage32.putString( "pyImageSource","styleclass");actionPage32.putString( "pyIconStyle","lpiBase lpiApplicationSocial");actionPage32.putString( "pyCaption","Social");actionPage32.putString( "pySummary","");actionPage32.putString( "pyBadgeProperty","");actionPage32.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage32.putString( "pyAutomationID","201803290308530572362");}actionPage32.putString( "pyBadgeFormat","Standard (label)");actionPage32.putString( "pyDeferLoad","false");actionPage32.putString( "pyImage","lpiBase lpiApplicationSocial");actionPage32.putString("pyType","Action");
executePage=actionPage32.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage32 = actionPage32.getPage("pyBehaviors(<append>)");
behaviorPage32.putString("pyAction","openLanding");ClipboardPage commandPage32 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage32.putString( "pyAction","Display");commandPage32.putString( "pyName","Case Management: Social");commandPage32.putString( "pyClassName","Pega-Landing-Process");commandPage32.putString( "pyLevelA","");commandPage32.putString( "pyLevelB","");commandPage32.putString( "pyLevelC","");commandPage32.putString( "pyElementName","");commandPage32.putString( "pyTargetElement","");commandPage32.putString( "pyIsTargetMicroDC","");commandPage32.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPApplicationSocial");commandPage32.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage32.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage32.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage32);
behaviorPage32.putPage("pyActionAPI",commandPage32);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage32.getPage("pyBehaviors(<LAST>)")).register();
commandPage32.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("social")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("social".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - social*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage33= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage32 != null ? actionPage32.getReference() : "" 
;actionPage33 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage33 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage33.putString("pyHidden",String.valueOf(hideElement));actionPage33.putString("pyDisabled",String.valueOf(disableElement));actionPage33.putString( "pyName","social");actionPage33.putString( "pyCaption","Tag Configuration");actionPage33.putString( "pySummary","");actionPage33.putString( "pyBadgeProperty","");actionPage33.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage33.putString( "pyAutomationID","201803290308530561655");}actionPage33.putString( "pyBadgeFormat","Standard (label)");actionPage33.putString( "pyDeferLoad","false");actionPage33.putString( "pyImage","");actionPage33.putString("pyType","Action");
executePage=actionPage33.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage33 = actionPage33.getPage("pyBehaviors(<append>)");
behaviorPage33.putString("pyAction","openLanding");ClipboardPage commandPage33 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage33.putString( "pyAction","Display");commandPage33.putString( "pyName","Case Management: Social");commandPage33.putString( "pyClassName","Pega-Landing-Process");commandPage33.putString( "pyLevelA","");commandPage33.putString( "pyLevelB","");commandPage33.putString( "pyLevelC","TagConfiguration");commandPage33.putString( "pyElementName","");commandPage33.putString( "pyTargetElement","");commandPage33.putString( "pyIsTargetMicroDC","");commandPage33.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPApplicationSocial");commandPage33.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage33.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage33.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage33);
behaviorPage33.putPage("pyActionAPI",commandPage33);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage33.getPage("pyBehaviors(<LAST>)")).register();
commandPage33.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("PegaSurvey".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - PegaSurvey*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage36= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage36 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage36 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyShowSurveyMenu";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage36.putString("pyHidden",String.valueOf(hideElement));actionPage36.putString("pyDisabled",String.valueOf(disableElement));actionPage36.putString( "pyName","PegaSurvey");actionPage36.putString( "pyImageSource","styleclass");actionPage36.putString( "pyIconStyle","LpiBase PegaSurveyImage");actionPage36.putString( "pyCaption","Questionnaire");actionPage36.putString( "pySummary","");actionPage36.putString( "pyBadgeProperty","");actionPage36.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage36.putString( "pyAutomationID","201803290308530595996");}actionPage36.putString( "pyBadgeFormat","Standard (label)");actionPage36.putString( "pyDeferLoad","false");actionPage36.putString( "pyImage","LpiBase PegaSurveyImage");if (!hideElement) { 
actionPage36.putString("pyType","Action");
executePage=actionPage36.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage36 = actionPage36.getPage("pyBehaviors(<append>)");
behaviorPage36.putString("pyAction","openLanding");ClipboardPage commandPage36 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage36.putString( "pyAction","Display");commandPage36.putString( "pyName","Questionnaire");commandPage36.putString( "pyClassName","Pega-Landing-PegaSurvey-SurveyManagement");commandPage36.putString( "pyLevelA","");commandPage36.putString( "pyLevelB","");commandPage36.putString( "pyLevelC","");commandPage36.putString( "pyElementName","");commandPage36.putString( "pyTargetElement","");commandPage36.putString( "pyIsTargetMicroDC","");commandPage36.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","SurveyManagement");commandPage36.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage36.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage36.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage36);
behaviorPage36.putPage("pyActionAPI",commandPage36);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage36.getPage("pyBehaviors(<LAST>)")).register();
commandPage36.removeFromClipboard();
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
if(processAction||("processAndRulesTools".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - processAndRulesTools*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage38= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage38 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage38 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage38.putString("pyHidden",String.valueOf(hideElement));actionPage38.putString("pyDisabled",String.valueOf(disableElement));actionPage38.putString( "pyName","processAndRulesTools");actionPage38.putString( "pyImageSource","styleclass");actionPage38.putString( "pyIconStyle","lpiBase lpiTools");actionPage38.putString( "pyCaption","Tools");actionPage38.putString( "pySummary","");actionPage38.putString( "pyBadgeProperty","");actionPage38.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage38.putString( "pyAutomationID","201803290308540596842");}actionPage38.putString( "pyBadgeFormat","Standard (label)");actionPage38.putString( "pyDeferLoad","false");actionPage38.putString( "pyImage","lpiBase lpiTools");actionPage38.putString("pyType","Action");
executePage=actionPage38.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","__empty__");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("processAndRulesTools")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("findRules".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - findRules*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage39= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage38 != null ? actionPage38.getReference() : "" 
;actionPage39 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage39 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage39.putString("pyHidden",String.valueOf(hideElement));actionPage39.putString("pyDisabled",String.valueOf(disableElement));actionPage39.putString( "pyName","findRules");actionPage39.putString( "pyCaption","Find Rules");actionPage39.putString( "pySummary","");actionPage39.putString( "pyBadgeProperty","");actionPage39.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage39.putString( "pyAutomationID","201803290308530631500");}actionPage39.putString( "pyBadgeFormat","Standard (label)");actionPage39.putString( "pyDeferLoad","false");actionPage39.putString( "pyImage","");actionPage39.putString("pyType","Action");
executePage=actionPage39.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage39 = actionPage39.getPage("pyBehaviors(<append>)");
behaviorPage39.putString("pyAction","openLanding");ClipboardPage commandPage39 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage39.putString( "pyAction","Display");commandPage39.putString( "pyName","Case Management: Find Rules");commandPage39.putString( "pyClassName","Pega-Landing-Process");commandPage39.putString( "pyLevelA","");commandPage39.putString( "pyLevelB","");commandPage39.putString( "pyLevelC","");commandPage39.putString( "pyElementName","");commandPage39.putString( "pyTargetElement","");commandPage39.putString( "pyIsTargetMicroDC","");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPProcessAndRulesToolsFindRules");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage39);
behaviorPage39.putPage("pyActionAPI",commandPage39);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage39.getPage("pyBehaviors(<LAST>)")).register();
commandPage39.removeFromClipboard();
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
if(processAction||("ID1399629536789000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1399629536789000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage41= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage38 != null ? actionPage38.getReference() : "" 
;actionPage41 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage41 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage41.putString("pyHidden",String.valueOf(hideElement));actionPage41.putString("pyDisabled",String.valueOf(disableElement));actionPage41.putString( "pyName","ID1399629536789000");actionPage41.putString( "pyCaption","Find Rules By Custom Field");actionPage41.putString( "pySummary","");actionPage41.putString( "pyBadgeProperty","");actionPage41.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage41.putString( "pyAutomationID","201803290308530652848");}actionPage41.putString( "pyBadgeFormat","Standard (label)");actionPage41.putString( "pyDeferLoad","false");actionPage41.putString( "pyImage","");actionPage41.putString("pyType","Action");
executePage=actionPage41.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage41 = actionPage41.getPage("pyBehaviors(<append>)");
behaviorPage41.putString("pyAction","openWizard");ClipboardPage commandPage41 = tools.createPage("Embed-DesktopAPI-OpenWizard","commandType");
commandPage41.putString( "pyClass","PegaAccel-Task-Wizard");commandPage41.putString( "pywizardLabel","Find Rules By Custom Field");executePage.putPage("pyOpenWizard",commandPage41);
behaviorPage41.putPage("pyActionAPI",commandPage41);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage41.getPage("pyBehaviors(<LAST>)")).register();
commandPage41.removeFromClipboard();
executePage.putString("pyCommand","openWizard");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workAdmin".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workAdmin*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage43= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage38 != null ? actionPage38.getReference() : "" 
;actionPage43 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage43 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage43.putString("pyHidden",String.valueOf(hideElement));actionPage43.putString("pyDisabled",String.valueOf(disableElement));actionPage43.putString( "pyName","workAdmin");actionPage43.putString( "pyCaption","Work Admin");actionPage43.putString( "pySummary","");actionPage43.putString( "pyBadgeProperty","");actionPage43.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage43.putString( "pyAutomationID","201803290308540061843");}actionPage43.putString( "pyBadgeFormat","Standard (label)");actionPage43.putString( "pyDeferLoad","false");actionPage43.putString( "pyImage","");actionPage43.putString("pyType","Action");
executePage=actionPage43.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("workAdmin")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("worklistAssignmentErrors".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - worklistAssignmentErrors*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage44= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage44 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage44 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage44.putString("pyHidden",String.valueOf(hideElement));actionPage44.putString("pyDisabled",String.valueOf(disableElement));actionPage44.putString( "pyName","worklistAssignmentErrors");actionPage44.putString( "pyCaption","Worklist Assignment Errors");actionPage44.putString( "pySummary","");actionPage44.putString( "pyBadgeProperty","");actionPage44.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage44.putString( "pyAutomationID","201803290308530841805");}actionPage44.putString( "pyBadgeFormat","");actionPage44.putString( "pyDeferLoad","");actionPage44.putString( "pyImage","");actionPage44.putString("pyType","Action");
executePage=actionPage44.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage44 = actionPage44.getPage("pyBehaviors(<append>)");
behaviorPage44.putString("pyAction","runScript");ClipboardPage commandPage44 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage44.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Assign-Worklist");commandPage44.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage44.getProperty("pyParameters").getPageValue(2).putString( "pyValue","ProblemAssignments");commandPage44.getProperty("pyParameters").getPageValue(2).putString( "pyName","param2");commandPage44.getProperty("pyParameters").getPageValue(3).putString( "pyValue","script:null");commandPage44.getProperty("pyParameters").getPageValue(3).putString( "pyName","param3");commandPage44.getProperty("pyParameters").getPageValue(4).putString( "pyValue","Refresh");commandPage44.getProperty("pyParameters").getPageValue(4).putString( "pyName","param4");commandPage44.putString( "pyFunctionName","showListInWindow");executePage.putPage("pyCustom",commandPage44);
behaviorPage44.putPage("pyActionAPI",commandPage44);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage44.getPage("pyBehaviors(<LAST>)")).register();
commandPage44.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workbasketAssignmentErrors".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workbasketAssignmentErrors*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage46= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage46 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage46 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage46.putString("pyHidden",String.valueOf(hideElement));actionPage46.putString("pyDisabled",String.valueOf(disableElement));actionPage46.putString( "pyName","workbasketAssignmentErrors");actionPage46.putString( "pyCaption","Work queue Assignment Errors");actionPage46.putString( "pySummary","");actionPage46.putString( "pyBadgeProperty","");actionPage46.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage46.putString( "pyAutomationID","201803290308530894700");}actionPage46.putString( "pyBadgeFormat","Standard (label)");actionPage46.putString( "pyDeferLoad","false");actionPage46.putString( "pyImage","");actionPage46.putString("pyType","Action");
executePage=actionPage46.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage46 = actionPage46.getPage("pyBehaviors(<append>)");
behaviorPage46.putString("pyAction","runScript");ClipboardPage commandPage46 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage46.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Assign-WorkBasket");commandPage46.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage46.getProperty("pyParameters").getPageValue(2).putString( "pyValue","ProblemAssignments");commandPage46.getProperty("pyParameters").getPageValue(2).putString( "pyName","param2");commandPage46.getProperty("pyParameters").getPageValue(3).putString( "pyValue","script:null");commandPage46.getProperty("pyParameters").getPageValue(3).putString( "pyName","param3");commandPage46.getProperty("pyParameters").getPageValue(4).putString( "pyValue","Refresh");commandPage46.getProperty("pyParameters").getPageValue(4).putString( "pyName","param4");commandPage46.putString( "pyFunctionName","showListInWindow");executePage.putPage("pyCustom",commandPage46);
behaviorPage46.putPage("pyActionAPI",commandPage46);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage46.getPage("pyBehaviors(<LAST>)")).register();
commandPage46.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage48= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage48 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage48 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage48.putString("pyHidden",String.valueOf(hideElement));actionPage48.putString("pyDisabled",String.valueOf(disableElement));actionPage48.putString( "pyName","");actionPage48.putString( "pyCaption","------------------");actionPage48.putString( "pySummary","");actionPage48.putString( "pyBadgeProperty","");actionPage48.putString( "pyToolTip","");actionPage48.putString( "pyBadgeFormat","");actionPage48.putString( "pyDeferLoad","");actionPage48.putString( "pyImage","");actionPage48.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("suspendedWorkInCurrentWorkpool".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - suspendedWorkInCurrentWorkpool*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage50= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage50 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage50 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage50.putString("pyHidden",String.valueOf(hideElement));actionPage50.putString("pyDisabled",String.valueOf(disableElement));actionPage50.putString( "pyName","suspendedWorkInCurrentWorkpool");actionPage50.putString( "pyCaption","Suspended Work in Current Workpool");actionPage50.putString( "pySummary","");actionPage50.putString( "pyBadgeProperty","");actionPage50.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage50.putString( "pyAutomationID","201803290308530927987");}actionPage50.putString( "pyBadgeFormat","");actionPage50.putString( "pyDeferLoad","");actionPage50.putString( "pyImage","");actionPage50.putString("pyType","Action");
executePage=actionPage50.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage50 = actionPage50.getPage("pyBehaviors(<append>)");
behaviorPage50.putString("pyAction","runScript");ClipboardPage commandPage50 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
propertyValue = "pxThread.pxCurrentWorkPool";
commandPage50.getProperty("pyParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage50.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage50.getProperty("pyParameters").getPageValue(2).putString( "pyValue","SuspendedWork");commandPage50.getProperty("pyParameters").getPageValue(2).putString( "pyName","param2");commandPage50.getProperty("pyParameters").getPageValue(3).putString( "pyValue","script:null");commandPage50.getProperty("pyParameters").getPageValue(3).putString( "pyName","param3");commandPage50.getProperty("pyParameters").getPageValue(4).putString( "pyValue","Refresh");commandPage50.getProperty("pyParameters").getPageValue(4).putString( "pyName","param4");commandPage50.putString( "pyFunctionName","showListInWindow");executePage.putPage("pyCustom",commandPage50);
behaviorPage50.putPage("pyActionAPI",commandPage50);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage50.getPage("pyBehaviors(<LAST>)")).register();
commandPage50.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("suspendedWorkAssignments".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - suspendedWorkAssignments*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage52= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage52 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage52 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage52.putString("pyHidden",String.valueOf(hideElement));actionPage52.putString("pyDisabled",String.valueOf(disableElement));actionPage52.putString( "pyName","suspendedWorkAssignments");actionPage52.putString( "pyCaption","Suspended Work Assignments");actionPage52.putString( "pySummary","");actionPage52.putString( "pyBadgeProperty","");actionPage52.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage52.putString( "pyAutomationID","2018032903085309517");}actionPage52.putString( "pyBadgeFormat","");actionPage52.putString( "pyDeferLoad","");actionPage52.putString( "pyImage","");actionPage52.putString("pyType","Action");
executePage=actionPage52.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage52 = actionPage52.getPage("pyBehaviors(<append>)");
behaviorPage52.putString("pyAction","runScript");ClipboardPage commandPage52 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage52.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Assign-Suspend");commandPage52.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage52.getProperty("pyParameters").getPageValue(2).putString( "pyValue","SuspendedAssignments");commandPage52.getProperty("pyParameters").getPageValue(2).putString( "pyName","param2");commandPage52.getProperty("pyParameters").getPageValue(3).putString( "pyValue","script:null");commandPage52.getProperty("pyParameters").getPageValue(3).putString( "pyName","param3");commandPage52.getProperty("pyParameters").getPageValue(4).putString( "pyValue","Refresh");commandPage52.getProperty("pyParameters").getPageValue(4).putString( "pyName","param4");commandPage52.putString( "pyFunctionName","showListInWindow");executePage.putPage("pyCustom",commandPage52);
behaviorPage52.putPage("pyActionAPI",commandPage52);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage52.getPage("pyBehaviors(<LAST>)")).register();
commandPage52.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage54= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage54 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage54 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage54.putString("pyHidden",String.valueOf(hideElement));actionPage54.putString("pyDisabled",String.valueOf(disableElement));actionPage54.putString( "pyName","");actionPage54.putString( "pyCaption","------------------");actionPage54.putString( "pySummary","");actionPage54.putString( "pyBadgeProperty","");actionPage54.putString( "pyToolTip","");actionPage54.putString( "pyBadgeFormat","");actionPage54.putString( "pyDeferLoad","");actionPage54.putString( "pyImage","");actionPage54.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("myLocks".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - myLocks*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage56= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage56 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage56 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage56.putString("pyHidden",String.valueOf(hideElement));actionPage56.putString("pyDisabled",String.valueOf(disableElement));actionPage56.putString( "pyName","myLocks");actionPage56.putString( "pyCaption","My Locks");actionPage56.putString( "pySummary","");actionPage56.putString( "pyBadgeProperty","");actionPage56.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage56.putString( "pyAutomationID","201803290308530983910");}actionPage56.putString( "pyBadgeFormat","");actionPage56.putString( "pyDeferLoad","");actionPage56.putString( "pyImage","");actionPage56.putString("pyType","Action");
executePage=actionPage56.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage56 = actionPage56.getPage("pyBehaviors(<append>)");
behaviorPage56.putString("pyAction","runScript");ClipboardPage commandPage56 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage56.getProperty("pyParameters").getPageValue(1).putString( "pyValue","System-Locks");commandPage56.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage56.getProperty("pyParameters").getPageValue(2).putString( "pyValue","MyLockCount");commandPage56.getProperty("pyParameters").getPageValue(2).putString( "pyName","param2");commandPage56.getProperty("pyParameters").getPageValue(3).putString( "pyValue","script:null");commandPage56.getProperty("pyParameters").getPageValue(3).putString( "pyName","param3");commandPage56.getProperty("pyParameters").getPageValue(4).putString( "pyValue","Refresh");commandPage56.getProperty("pyParameters").getPageValue(4).putString( "pyName","param4");commandPage56.putString( "pyFunctionName","showSummaryInWindow");executePage.putPage("pyCustom",commandPage56);
behaviorPage56.putPage("pyActionAPI",commandPage56);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage56.getPage("pyBehaviors(<LAST>)")).register();
commandPage56.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("allLocks".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - allLocks*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage58= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage58 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage58 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage58.putString("pyHidden",String.valueOf(hideElement));actionPage58.putString("pyDisabled",String.valueOf(disableElement));actionPage58.putString( "pyName","allLocks");actionPage58.putString( "pyCaption","All Locks");actionPage58.putString( "pySummary","");actionPage58.putString( "pyBadgeProperty","");actionPage58.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage58.putString( "pyAutomationID","201803290308540005973");}actionPage58.putString( "pyBadgeFormat","");actionPage58.putString( "pyDeferLoad","");actionPage58.putString( "pyImage","");actionPage58.putString("pyType","Action");
executePage=actionPage58.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage58 = actionPage58.getPage("pyBehaviors(<append>)");
behaviorPage58.putString("pyAction","runScript");ClipboardPage commandPage58 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage58.getProperty("pyParameters").getPageValue(1).putString( "pyValue","System-Locks");commandPage58.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage58.getProperty("pyParameters").getPageValue(2).putString( "pyValue","LockCount");commandPage58.getProperty("pyParameters").getPageValue(2).putString( "pyName","param2");commandPage58.getProperty("pyParameters").getPageValue(3).putString( "pyValue","script:null");commandPage58.getProperty("pyParameters").getPageValue(3).putString( "pyName","param3");commandPage58.getProperty("pyParameters").getPageValue(4).putString( "pyValue","Refresh");commandPage58.getProperty("pyParameters").getPageValue(4).putString( "pyName","param4");commandPage58.putString( "pyFunctionName","showSummaryInWindow");executePage.putPage("pyCustom",commandPage58);
behaviorPage58.putPage("pyActionAPI",commandPage58);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage58.getPage("pyBehaviors(<LAST>)")).register();
commandPage58.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage60= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage60 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage60 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage60.putString("pyHidden",String.valueOf(hideElement));actionPage60.putString("pyDisabled",String.valueOf(disableElement));actionPage60.putString( "pyName","");actionPage60.putString( "pyCaption","------------------");actionPage60.putString( "pySummary","");actionPage60.putString( "pyBadgeProperty","");actionPage60.putString( "pyToolTip","");actionPage60.putString( "pyBadgeFormat","");actionPage60.putString( "pyDeferLoad","");actionPage60.putString( "pyImage","");actionPage60.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("externalAssignments".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - externalAssignments*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage62= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage62 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage62 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage62.putString("pyHidden",String.valueOf(hideElement));actionPage62.putString("pyDisabled",String.valueOf(disableElement));actionPage62.putString( "pyName","externalAssignments");actionPage62.putString( "pyCaption","External Assignments");actionPage62.putString( "pySummary","");actionPage62.putString( "pyBadgeProperty","");actionPage62.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage62.putString( "pyAutomationID","201803290308540037247");}actionPage62.putString( "pyBadgeFormat","");actionPage62.putString( "pyDeferLoad","");actionPage62.putString( "pyImage","");actionPage62.putString("pyType","Action");
executePage=actionPage62.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage62 = actionPage62.getPage("pyBehaviors(<append>)");
behaviorPage62.putString("pyAction","runScript");ClipboardPage commandPage62 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage62.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Assign-External");commandPage62.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage62.getProperty("pyParameters").getPageValue(2).putString( "pyValue","ExternalAssignmentsCount");commandPage62.getProperty("pyParameters").getPageValue(2).putString( "pyName","param2");commandPage62.getProperty("pyParameters").getPageValue(3).putString( "pyValue","script:null");commandPage62.getProperty("pyParameters").getPageValue(3).putString( "pyName","param3");commandPage62.getProperty("pyParameters").getPageValue(4).putString( "pyValue","Refresh");commandPage62.getProperty("pyParameters").getPageValue(4).putString( "pyName","param4");commandPage62.putString( "pyFunctionName","showSummaryInWindow");executePage.putPage("pyCustom",commandPage62);
behaviorPage62.putPage("pyActionAPI",commandPage62);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage62.getPage("pyBehaviors(<LAST>)")).register();
commandPage62.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage64= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage43 != null ? actionPage43.getReference() : "" 
;actionPage64 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage64 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage64.putString("pyHidden",String.valueOf(hideElement));actionPage64.putString("pyDisabled",String.valueOf(disableElement));actionPage64.putString( "pyName","");actionPage64.putString( "pyCaption","------------------");actionPage64.putString( "pySummary","");actionPage64.putString( "pyBadgeProperty","");actionPage64.putString( "pyToolTip","");actionPage64.putString( "pyBadgeFormat","");actionPage64.putString( "pyDeferLoad","");actionPage64.putString( "pyImage","");actionPage64.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("myWork".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - myWork*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage67= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage38 != null ? actionPage38.getReference() : "" 
;actionPage67 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage67 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage67.putString("pyHidden",String.valueOf(hideElement));actionPage67.putString("pyDisabled",String.valueOf(disableElement));actionPage67.putString( "pyName","myWork");actionPage67.putString( "pyCaption","My Work");actionPage67.putString( "pySummary","");actionPage67.putString( "pyBadgeProperty","");actionPage67.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage67.putString( "pyAutomationID","201803290308540585691");}actionPage67.putString( "pyBadgeFormat","");actionPage67.putString( "pyDeferLoad","");actionPage67.putString( "pyImage","");actionPage67.putString("pyType","Action");
executePage=actionPage67.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","");
executePage.putString("pyCommand","");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("myWork")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("myWorklist".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - myWorklist*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage68= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage67 != null ? actionPage67.getReference() : "" 
;actionPage68 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage68 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage68.putString("pyHidden",String.valueOf(hideElement));actionPage68.putString("pyDisabled",String.valueOf(disableElement));actionPage68.putString( "pyName","myWorklist");actionPage68.putString( "pyCaption","My WorkList");actionPage68.putString( "pySummary","");actionPage68.putString( "pyBadgeProperty","");actionPage68.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage68.putString( "pyAutomationID","201803290308540093188");}actionPage68.putString( "pyBadgeFormat","Standard (label)");actionPage68.putString( "pyDeferLoad","false");actionPage68.putString( "pyImage","");actionPage68.putString("pyType","Action");
executePage=actionPage68.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage68 = actionPage68.getPage("pyBehaviors(<append>)");
behaviorPage68.putString("pyAction","runScript");ClipboardPage commandPage68 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
propertyValue = "OperatorID.pyUserIdentifier";
commandPage68.getProperty("pyParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage68.getProperty("pyParameters").getPageValue(1).putString( "pyName","param1");commandPage68.putString( "pyFunctionName","showUserWorkList");executePage.putPage("pyCustom",commandPage68);
behaviorPage68.putPage("pyActionAPI",commandPage68);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage68.getPage("pyBehaviors(<LAST>)")).register();
commandPage68.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workEnteredByMe".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workEnteredByMe*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage70= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage67 != null ? actionPage67.getReference() : "" 
;actionPage70 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage70 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage70.putString("pyHidden",String.valueOf(hideElement));actionPage70.putString("pyDisabled",String.valueOf(disableElement));actionPage70.putString( "pyName","workEnteredByMe");actionPage70.putString( "pyCaption","Work Entered By Me");actionPage70.putString( "pySummary","");actionPage70.putString( "pyBadgeProperty","");actionPage70.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage70.putString( "pyAutomationID","201803290308540115491");}actionPage70.putString( "pyBadgeFormat","Standard (label)");actionPage70.putString( "pyDeferLoad","false");actionPage70.putString( "pyImage","");actionPage70.putString("pyType","Action");
executePage=actionPage70.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage70 = actionPage70.getPage("pyBehaviors(<append>)");
behaviorPage70.putString("pyAction","reportDefinition");ClipboardPage commandPage70 = tools.createPage("Embed-DesktopAPI-ReportDefinition","commandType");
commandPage70.putString( "pyClass","Work-");commandPage70.putString( "pyName","pyEnteredByMe");commandPage70.putString( "pyDisplayMode","");commandPage70.putString( "pyTarget","popup");commandPage70.putString( "pyShortcutHandle","");commandPage70.putString( "pyReportAction","");commandPage70.getProperty("pyReportDefParams").getPageValue(1).putString( "pyValue","");commandPage70.getProperty("pyReportDefParams").getPageValue(1).putString( "pyName","");behaviorPage70.putPage("pyActionAPI",commandPage70);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage70.getPage("pyBehaviors(<LAST>)")).register();
commandPage70.removeFromClipboard();
executePage.putString("pyCommand","reportDefinition");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workAssociatedWithMeByParty".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workAssociatedWithMeByParty*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage72= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage67 != null ? actionPage67.getReference() : "" 
;actionPage72 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage72 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage72.putString("pyHidden",String.valueOf(hideElement));actionPage72.putString("pyDisabled",String.valueOf(disableElement));actionPage72.putString( "pyName","workAssociatedWithMeByParty");actionPage72.putString( "pyCaption","Work Associated With Me By Party");actionPage72.putString( "pySummary","");actionPage72.putString( "pyBadgeProperty","");actionPage72.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage72.putString( "pyAutomationID","201803290308540352514");}actionPage72.putString( "pyBadgeFormat","");actionPage72.putString( "pyDeferLoad","");actionPage72.putString( "pyImage","");actionPage72.putString("pyType","Action");
executePage=actionPage72.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage72 = actionPage72.getPage("pyBehaviors(<append>)");
behaviorPage72.putString("pyAction","openUrlInWindow");ClipboardPage commandPage72 = tools.createPage("Embed-DesktopAPI-OpenURLInWindow","commandType");
commandPage72.putString( "pyWindowName","");commandPage72.putString( "pyOptions","location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1");commandPage72.putString( "pyReplace","false");commandPage72.putString( "pyUseAlternateUrlBase","false");commandPage72.putString( "pyNoEncodingUrl","");commandPage72.putString( "pyUrl",tools.findPage("pxThread").getString("pxReqURI"));commandPage72 .putString( "pyActivity","Rule-Obj-SummaryView.ShowView");
 commandPage72.getProperty("pyQueryString").getPageValue(1).putString( "pyValue","Index-WorkPartyUri");commandPage72.getProperty("pyQueryString").getPageValue(1).putString( "pyName","ViewClass");commandPage72.getProperty("pyQueryString").getPageValue(2).putString( "pyValue","AssociatedWork");commandPage72.getProperty("pyQueryString").getPageValue(2).putString( "pyName","ViewPurpose");commandPage72.getProperty("pyQueryString").getPageValue(3).putString( "pyValue","Refresh");commandPage72.getProperty("pyQueryString").getPageValue(3).putString( "pyName","pyAction");executePage.putPage("pyOpenUrlInWindow",commandPage72);
behaviorPage72.putPage("pyActionAPI",commandPage72);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage72.getPage("pyBehaviors(<LAST>)")).register();
commandPage72.removeFromClipboard();
executePage.putString("pyCommand","openUrlInWindow");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workResolvedByMeRecently".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workResolvedByMeRecently*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage74= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage67 != null ? actionPage67.getReference() : "" 
;actionPage74 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage74 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage74.putString("pyHidden",String.valueOf(hideElement));actionPage74.putString("pyDisabled",String.valueOf(disableElement));actionPage74.putString( "pyName","workResolvedByMeRecently");actionPage74.putString( "pyCaption","Work Resolved By Me Recently");actionPage74.putString( "pySummary","");actionPage74.putString( "pyBadgeProperty","");actionPage74.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage74.putString( "pyAutomationID","201803290308540385204");}actionPage74.putString( "pyBadgeFormat","");actionPage74.putString( "pyDeferLoad","");actionPage74.putString( "pyImage","");actionPage74.putString("pyType","Action");
executePage=actionPage74.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage74 = actionPage74.getPage("pyBehaviors(<append>)");
behaviorPage74.putString("pyAction","openUrlInWindow");ClipboardPage commandPage74 = tools.createPage("Embed-DesktopAPI-OpenURLInWindow","commandType");
commandPage74.putString( "pyWindowName","ReportResults");commandPage74.putString( "pyOptions","location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1");commandPage74.putString( "pyReplace","false");commandPage74.putString( "pyUseAlternateUrlBase","false");commandPage74.putString( "pyNoEncodingUrl","");commandPage74.putString( "pyUrl",tools.findPage("pxThread").getString("pxReqURI"));commandPage74 .putString( "pyActivity", tools.getProperty(".pxObjClass").getStringValue() + ".pzShowViewWithDate");
 propertyValue = "pxRequestor.pxCurrentWorkPool";
commandPage74.getProperty("pyQueryString").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage74.getProperty("pyQueryString").getPageValue(1).putString( "pyName","ViewClass");commandPage74.getProperty("pyQueryString").getPageValue(2).putString( "pyValue","ResolvedByMe");commandPage74.getProperty("pyQueryString").getPageValue(2).putString( "pyName","ViewPurpose");commandPage74.getProperty("pyQueryString").getPageValue(3).putString( "pyValue","Refresh");commandPage74.getProperty("pyQueryString").getPageValue(3).putString( "pyName","pyAction");commandPage74.getProperty("pyQueryString").getPageValue(4).putString( "pyValue","-3");commandPage74.getProperty("pyQueryString").getPageValue(4).putString( "pyName","DaysToAdd");commandPage74.getProperty("pyQueryString").getPageValue(5).putString( "pyValue","Rule-Obj-ListView");commandPage74.getProperty("pyQueryString").getPageValue(5).putString( "pyName","ObjClass");executePage.putPage("pyOpenUrlInWindow",commandPage74);
behaviorPage74.putPage("pyActionAPI",commandPage74);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage74.getPage("pyBehaviors(<LAST>)")).register();
commandPage74.removeFromClipboard();
executePage.putString("pyCommand","openUrlInWindow");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("workByWorkbasket".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - workByWorkbasket*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage76= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage67 != null ? actionPage67.getReference() : "" 
;actionPage76 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage76 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage76.putString("pyHidden",String.valueOf(hideElement));actionPage76.putString("pyDisabled",String.valueOf(disableElement));actionPage76.putString( "pyName","workByWorkbasket");actionPage76.putString( "pyCaption","Work By Work queue");actionPage76.putString( "pySummary","");actionPage76.putString( "pyBadgeProperty","");actionPage76.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage76.putString( "pyAutomationID","201803290308540416110");}actionPage76.putString( "pyBadgeFormat","Standard (label)");actionPage76.putString( "pyDeferLoad","false");actionPage76.putString( "pyImage","");actionPage76.putString("pyType","Action");
executePage=actionPage76.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage76 = actionPage76.getPage("pyBehaviors(<append>)");
behaviorPage76.putString("pyAction","reportDefinition");ClipboardPage commandPage76 = tools.createPage("Embed-DesktopAPI-ReportDefinition","commandType");
commandPage76.putString( "pyClass","Assign-WorkBasket");commandPage76.putString( "pyName","pyASSIGNMENTSFORWORKBASKET");commandPage76.putString( "pyDisplayMode","");commandPage76.putString( "pyTarget","popup");commandPage76.putString( "pyShortcutHandle","");commandPage76.putString( "pyReportAction","");commandPage76.getProperty("pyReportDefParams").getPageValue(1).putString( "pyValue","default@pega.com");commandPage76.getProperty("pyReportDefParams").getPageValue(1).putString( "pyName","WorkbasketID");behaviorPage76.putPage("pyActionAPI",commandPage76);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage76.getPage("pyBehaviors(<LAST>)")).register();
commandPage76.removeFromClipboard();
executePage.putString("pyCommand","reportDefinition");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Pega-Landing","pyExtendedCaseManagementLPMenu",commonPrefix,uniqueSuffix,actionPage1, tools, "actionPage1","false",actionPage1);
tools.putParamValue("deferLoadPath", deferLoadPath);
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION PEGA-LANDING PZPROCESSANDCASERULESMAINMENU #20210128T124230.032 GMT", "Pega-Landing pzProcessAndCaseRulesMainMenu", "Pega-LP-ProcessAndRules", "08-06-01", "20210128T124230.032 GMT");
}
