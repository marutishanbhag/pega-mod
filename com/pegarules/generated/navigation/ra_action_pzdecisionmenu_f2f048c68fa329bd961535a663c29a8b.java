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
public class ra_action_pzdecisionmenu_f2f048c68fa329bd961535a663c29a8b  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzDecisionMenu.Pega_Landing.Action");
	public ra_action_pzdecisionmenu_f2f048c68fa329bd961535a663c29a8b(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION PEGA-LANDING PZDECISIONMENU #20230618T002146.209 GMT	Pega-DecisionArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzDecisionMenu"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzDecisionMenu");
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSRUNACTIVITY", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZDECISIONMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSRUNACTIVITY","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSRUNACTIVITY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZDECISIONMENU","Rule-Navigation","PEGA-LANDING",false,"","Pega-DecisionArchitect","08-23-01","RULE-NAVIGATION PEGA-LANDING PZDECISIONMENU #20230618T002146.209 GMT","!PZDECISIONMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1450438437)
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
//	RULE-NAVIGATION PEGA-LANDING PZDECISIONMENU #20230618T002146.209 GMT:20230630T121051.713 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEENCODED #20180713T133341.517 GMT:20180713T133341.517 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUELOCALIZED #20180713T133341.527 GMT:20180713T133341.527 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZGETRUNTIMEPAGEREFERENCE #20180713T133341.536 GMT:20180713T133341.536 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCONTEXTREFRESH #20180713T133341.611 GMT:20180713T133341.611 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENLANDINGPAGE #20180918T064825.561 GMT:20181015T130125.636 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSRUNACTIVITY #20180713T133342.796 GMT:20180713T133342.796 GMT
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
		return "e720859a7760acd6ca1c9289e430098c";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Landing";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDecisionMenu" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "Decisions".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("Decisions")){
return;}
if(processShortcut &&"Decisions".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","Decisions");actionPage1.putString( "pyImageSource","styleclass");actionPage1.putString( "pyIconStyle","lpiBase lpiDecisioning");actionPage1.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Decisioning"));actionPage1.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage1.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage1.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201711091043540290757");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","lpiBase lpiDecisioning");actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","__empty__");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage1);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("Decisions")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1377678550698000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1377678550698000*/

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
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","ID1377678550698000");actionPage2.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Decisions"));actionPage2.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage2.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage2.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage2.putString( "pyAutomationID","201711091043530400858");}actionPage2.putString( "pyBadgeFormat","Standard (label)");actionPage2.putString( "pyDeferLoad","false");actionPage2.putString( "pyImage","");actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1377678550698000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1341816235210000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1341816235210000*/

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
actionPage3.putString("pyHidden",String.valueOf(hideElement));actionPage3.putString("pyDisabled",String.valueOf(disableElement));actionPage3.putString( "pyName","ID1341816235210000");actionPage3.putString( "pyImageSource","styleclass");actionPage3.putString( "pyIconStyle","lpiBase lpiPropositionManagement");actionPage3.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Proposition Management"));actionPage3.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage3.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage3.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage3.putString( "pyAutomationID","201711091043530263897");}actionPage3.putString( "pyBadgeFormat","Standard (label)");actionPage3.putString( "pyDeferLoad","false");actionPage3.putString( "pyImage","lpiBase lpiPropositionManagement");actionPage3.putString("pyType","Action");
executePage=actionPage3.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage3 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","openLanding");ClipboardPage commandPage3 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage3.putString( "pyAction","Display");commandPage3.putString( "pyName","Decisioning: Proposition Management");commandPage3.putString( "pyClassName","Pega-Landing-Decision-StrategyHierarchy");commandPage3.putString( "pyLevelA","");commandPage3.putString( "pyLevelB","");commandPage3.putString( "pyLevelC","");commandPage3.putString( "pyElementName","");commandPage3.putString( "pyTargetElement","");commandPage3.putString( "pyIsTargetMicroDC","");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPStrategyHierarchy");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage3.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage3);
behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1341816235210000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347275654454000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347275654454000*/

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
parentPageRef = actionPage3 != null ? actionPage3.getReference() : "" 
;actionPage4 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage4 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage4.putString("pyHidden",String.valueOf(hideElement));actionPage4.putString("pyDisabled",String.valueOf(disableElement));actionPage4.putString( "pyName","ID1347275654454000");actionPage4.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Hierarchy"));actionPage4.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage4.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage4.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage4.putString( "pyAutomationID","201711091043530191246");}actionPage4.putString( "pyBadgeFormat","Standard (label)");actionPage4.putString( "pyDeferLoad","false");actionPage4.putString( "pyImage","");actionPage4.putString("pyType","Action");
executePage=actionPage4.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage4 = actionPage4.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","openLanding");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage4.putString( "pyAction","Display");commandPage4.putString( "pyName","Decisioning: Proposition Management");commandPage4.putString( "pyClassName","Pega-Landing-Decision-StrategyHierarchy");commandPage4.putString( "pyLevelA","");commandPage4.putString( "pyLevelB","");commandPage4.putString( "pyLevelC","Hierarchy");commandPage4.putString( "pyElementName","");commandPage4.putString( "pyTargetElement","");commandPage4.putString( "pyIsTargetMicroDC","false");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPStrategyHierarchy");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage4.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage4);
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
if(processAction||("ID1347275654455000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347275654455000*/

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
parentPageRef = actionPage3 != null ? actionPage3.getReference() : "" 
;actionPage6 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage6 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage6.putString("pyHidden",String.valueOf(hideElement));actionPage6.putString("pyDisabled",String.valueOf(disableElement));actionPage6.putString( "pyName","ID1347275654455000");actionPage6.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "UnversionedPropositionData"));actionPage6.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage6.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage6.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage6.putString( "pyAutomationID","201711091043530218889");}actionPage6.putString( "pyBadgeFormat","Standard (label)");actionPage6.putString( "pyDeferLoad","false");actionPage6.putString( "pyImage","");actionPage6.putString("pyType","Action");
executePage=actionPage6.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage6 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","openLanding");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage6.putString( "pyAction","Display");commandPage6.putString( "pyName","Decisioning: Proposition Management");commandPage6.putString( "pyClassName","Pega-Landing-Decision-StrategyHierarchy");commandPage6.putString( "pyLevelA","");commandPage6.putString( "pyLevelB","");commandPage6.putString( "pyLevelC","Propositions");commandPage6.putString( "pyElementName","");commandPage6.putString( "pyTargetElement","");commandPage6.putString( "pyIsTargetMicroDC","false");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPStrategyHierarchy");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage6.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage6);
behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
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
if(processAction||("ID1498024217655000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1498024217655000*/

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
parentPageRef = actionPage3 != null ? actionPage3.getReference() : "" 
;actionPage8 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage8 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage8.putString("pyHidden",String.valueOf(hideElement));actionPage8.putString("pyDisabled",String.valueOf(disableElement));actionPage8.putString( "pyName","ID1498024217655000");actionPage8.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "CopyPropositions"));actionPage8.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage8.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage8.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage8.putString( "pyAutomationID","201711091043530248518");}actionPage8.putString( "pyBadgeFormat","Standard (label)");actionPage8.putString( "pyDeferLoad","false");actionPage8.putString( "pyImage","");actionPage8.putString("pyType","Action");
executePage=actionPage8.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage8 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","openLanding");ClipboardPage commandPage8 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage8.putString( "pyAction","Display");commandPage8.putString( "pyName","Copy groups");commandPage8.putString( "pyClassName","Pega-Landing-Decision-StrategyHierarchy");commandPage8.putString( "pyLevelA","");commandPage8.putString( "pyLevelB","");commandPage8.putString( "pyLevelC","Copy groups");commandPage8.putString( "pyElementName","");commandPage8.putString( "pyTargetElement","");commandPage8.putString( "pyIsTargetMicroDC","");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPCopyDecisioningItems");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage8.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage8);
behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
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
showWhenCondition = true;
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzShowSimulationLP",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Pega-Landing","pzSimulationTesting",commonPrefix,uniqueSuffix,actionPage2, tools, "actionPage2","false",actionPage2);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//END OF WHEN CONDITION
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1409856619169000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1409856619169000*/

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
parentPageRef = actionPage2 != null ? actionPage2.getReference() : "" 
;actionPage13 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage13 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage13.putString("pyHidden",String.valueOf(hideElement));actionPage13.putString("pyDisabled",String.valueOf(disableElement));actionPage13.putString( "pyName","ID1409856619169000");actionPage13.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Data Flows"));actionPage13.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage13.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage13.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage13.putString( "pyAutomationID","201711091043530387960");}actionPage13.putString( "pyBadgeFormat","Standard (label)");actionPage13.putString( "pyDeferLoad","false");actionPage13.putString( "pyImage","");actionPage13.putString("pyType","Action");
executePage=actionPage13.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage13 = actionPage13.getPage("pyBehaviors(<append>)");
behaviorPage13.putString("pyAction","openLanding");ClipboardPage commandPage13 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage13.putString( "pyAction","Display");commandPage13.putString( "pyName","Decisioning: Data Flows");commandPage13.putString( "pyClassName","Pega-Landing-Decision-DDF");commandPage13.putString( "pyLevelA","");commandPage13.putString( "pyLevelB","");commandPage13.putString( "pyLevelC","");commandPage13.putString( "pyElementName","");commandPage13.putString( "pyTargetElement","");commandPage13.putString( "pyIsTargetMicroDC","false");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDecisionDataFlowsLP");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage13.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage13);
behaviorPage13.putPage("pyActionAPI",commandPage13);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage13.getPage("pyBehaviors(<LAST>)")).register();
commandPage13.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1409856619169000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1412091880685000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1412091880685000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage14= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage13 != null ? actionPage13.getReference() : "" 
;actionPage14 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage14 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage14.putString("pyHidden",String.valueOf(hideElement));actionPage14.putString("pyDisabled",String.valueOf(disableElement));actionPage14.putString( "pyName","ID1412091880685000");actionPage14.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Batch Processing"));actionPage14.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage14.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage14.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage14.putString( "pyAutomationID","201711091043530337112");}actionPage14.putString( "pyBadgeFormat","Standard (label)");actionPage14.putString( "pyDeferLoad","false");actionPage14.putString( "pyImage","");actionPage14.putString("pyType","Action");
executePage=actionPage14.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage14 = actionPage14.getPage("pyBehaviors(<append>)");
behaviorPage14.putString("pyAction","openLanding");ClipboardPage commandPage14 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage14.putString( "pyAction","Display");commandPage14.putString( "pyName","Decisioning: Data Flows");commandPage14.putString( "pyClassName","Pega-Landing-Decision-DDF");commandPage14.putString( "pyLevelA","");commandPage14.putString( "pyLevelB","");commandPage14.putString( "pyLevelC","Batch processing");commandPage14.putString( "pyElementName","");commandPage14.putString( "pyTargetElement","");commandPage14.putString( "pyIsTargetMicroDC","false");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDecisionDataFlowsLP");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage14);
behaviorPage14.putPage("pyActionAPI",commandPage14);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage14.getPage("pyBehaviors(<LAST>)")).register();
commandPage14.removeFromClipboard();
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
if(processAction||("ID1421329325911000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1421329325911000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage16= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage13 != null ? actionPage13.getReference() : "" 
;actionPage16 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage16 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage16.putString("pyHidden",String.valueOf(hideElement));actionPage16.putString("pyDisabled",String.valueOf(disableElement));actionPage16.putString( "pyName","ID1421329325911000");actionPage16.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Real-time Processing"));actionPage16.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage16.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage16.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage16.putString( "pyAutomationID","201711091043530356731");}actionPage16.putString( "pyBadgeFormat","Standard (label)");actionPage16.putString( "pyDeferLoad","false");actionPage16.putString( "pyImage","");actionPage16.putString("pyType","Action");
executePage=actionPage16.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage16 = actionPage16.getPage("pyBehaviors(<append>)");
behaviorPage16.putString("pyAction","openLanding");ClipboardPage commandPage16 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage16.putString( "pyAction","Display");commandPage16.putString( "pyName","Decisioning: Data Flows");commandPage16.putString( "pyClassName","Pega-Landing-Decision-DDF");commandPage16.putString( "pyLevelA","");commandPage16.putString( "pyLevelB","");commandPage16.putString( "pyLevelC","Real-time processing");commandPage16.putString( "pyElementName","");commandPage16.putString( "pyTargetElement","");commandPage16.putString( "pyIsTargetMicroDC","false");commandPage16.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDecisionDataFlowsLP");commandPage16.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage16.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage16.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage16);
behaviorPage16.putPage("pyActionAPI",commandPage16);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage16.getPage("pyBehaviors(<LAST>)")).register();
commandPage16.removeFromClipboard();
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
if(processAction||("ID1511963080314000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1511963080314000*/

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
parentPageRef = actionPage13 != null ? actionPage13.getReference() : "" 
;actionPage18 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage18 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage18.putString("pyHidden",String.valueOf(hideElement));actionPage18.putString("pyDisabled",String.valueOf(disableElement));actionPage18.putString( "pyName","ID1511963080314000");actionPage18.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Single Case Processing"));actionPage18.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage18.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage18.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage18.putString( "pyAutomationID","201711291443200574707");}actionPage18.putString( "pyBadgeFormat","Standard (label)");actionPage18.putString( "pyDeferLoad","false");actionPage18.putString( "pyImage","");actionPage18.putString("pyType","Action");
executePage=actionPage18.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage18 = actionPage18.getPage("pyBehaviors(<append>)");
behaviorPage18.putString("pyAction","openLanding");ClipboardPage commandPage18 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage18.putString( "pyAction","Display");commandPage18.putString( "pyName","Decisioning: Data Flows");commandPage18.putString( "pyClassName","Pega-Landing-Decision-DDF");commandPage18.putString( "pyLevelA","");commandPage18.putString( "pyLevelB","");commandPage18.putString( "pyLevelC","Single case Processing");commandPage18.putString( "pyElementName","");commandPage18.putString( "pyTargetElement","");commandPage18.putString( "pyIsTargetMicroDC","false");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDecisionDataFlowsLP");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage18.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage18);
behaviorPage18.putPage("pyActionAPI",commandPage18);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage18.getPage("pyBehaviors(<LAST>)")).register();
commandPage18.removeFromClipboard();
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
if(processAction||("ID1458116830837000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1458116830837000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage20= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage13 != null ? actionPage13.getReference() : "" 
;actionPage20 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage20 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzEnableEDF";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage20.putString("pyHidden",String.valueOf(hideElement));actionPage20.putString("pyDisabled",String.valueOf(disableElement));actionPage20.putString( "pyName","ID1458116830837000");actionPage20.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "External Processing"));actionPage20.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage20.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage20.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage20.putString( "pyAutomationID","201711091043530376533");}actionPage20.putString( "pyBadgeFormat","Standard (label)");actionPage20.putString( "pyDeferLoad","false");actionPage20.putString( "pyImage","");if (!hideElement) { 
actionPage20.putString("pyType","Action");
executePage=actionPage20.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage20 = actionPage20.getPage("pyBehaviors(<append>)");
behaviorPage20.putString("pyAction","openLanding");ClipboardPage commandPage20 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage20.putString( "pyAction","Display");commandPage20.putString( "pyName","Decision: Data Flows");commandPage20.putString( "pyClassName","Pega-Landing-Decision-DDF");commandPage20.putString( "pyLevelA","");commandPage20.putString( "pyLevelB","");commandPage20.putString( "pyLevelC","External processing");commandPage20.putString( "pyElementName","");commandPage20.putString( "pyTargetElement","");commandPage20.putString( "pyIsTargetMicroDC","false");commandPage20.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDecisionDataFlowsLP");commandPage20.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage20.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage20.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage20);
behaviorPage20.putPage("pyActionAPI",commandPage20);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage20.getPage("pyBehaviors(<LAST>)")).register();
commandPage20.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
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
if(processAction||("ID1512139292155000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1512139292155000*/

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
parentPageRef = actionPage2 != null ? actionPage2.getReference() : "" 
;actionPage23 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage23 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage23.putString("pyHidden",String.valueOf(hideElement));actionPage23.putString("pyDisabled",String.valueOf(disableElement));actionPage23.putString( "pyName","ID1512139292155000");actionPage23.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Data Sources"));actionPage23.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage23.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage23.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage23.putString( "pyAutomationID","201712010941300800113");}actionPage23.putString( "pyBadgeFormat","Standard (label)");actionPage23.putString( "pyDeferLoad","false");actionPage23.putString( "pyImage","");actionPage23.putString("pyType","Action");
executePage=actionPage23.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage23 = actionPage23.getPage("pyBehaviors(<append>)");
behaviorPage23.putString("pyAction","openLanding");ClipboardPage commandPage23 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage23.putString( "pyAction","Display");commandPage23.putString( "pyName","Decisioning: Data Sources");commandPage23.putString( "pyClassName","Pega-Landing-Decision-DataSource");commandPage23.putString( "pyLevelA","");commandPage23.putString( "pyLevelB","");commandPage23.putString( "pyLevelC","");commandPage23.putString( "pyElementName","");commandPage23.putString( "pyTargetElement","");commandPage23.putString( "pyIsTargetMicroDC","false");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDecisionDataSourcesLP");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage23.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage23);
behaviorPage23.putPage("pyActionAPI",commandPage23);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage23.getPage("pyBehaviors(<LAST>)")).register();
commandPage23.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1512139292155000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1512140260988002".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1512140260988002*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage24= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage23 != null ? actionPage23.getReference() : "" 
;actionPage24 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage24 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage24.putString("pyHidden",String.valueOf(hideElement));actionPage24.putString("pyDisabled",String.valueOf(disableElement));actionPage24.putString( "pyName","ID1512140260988002");actionPage24.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Interaction History Summaries"));actionPage24.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage24.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage24.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage24.putString( "pyAutomationID","201712010957400955819");}actionPage24.putString( "pyBadgeFormat","Standard (label)");actionPage24.putString( "pyDeferLoad","false");actionPage24.putString( "pyImage","");actionPage24.putString("pyType","Action");
executePage=actionPage24.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage24 = actionPage24.getPage("pyBehaviors(<append>)");
behaviorPage24.putString("pyAction","openLanding");ClipboardPage commandPage24 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage24.putString( "pyAction","Display");commandPage24.putString( "pyName","Decisioning: Data Sources");commandPage24.putString( "pyClassName","Pega-Landing-Decision-DataSource");commandPage24.putString( "pyLevelA","");commandPage24.putString( "pyLevelB","");commandPage24.putString( "pyLevelC","");commandPage24.putString( "pyElementName","");commandPage24.putString( "pyTargetElement","");commandPage24.putString( "pyIsTargetMicroDC","false");commandPage24.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDecisionDataSourcesLP");commandPage24.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage24.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage24.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage24);
behaviorPage24.putPage("pyActionAPI",commandPage24);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage24.getPage("pyBehaviors(<LAST>)")).register();
commandPage24.removeFromClipboard();
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
if(processAction||("ID1606877575704000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1606877575704000*/

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
parentPageRef = actionPage2 != null ? actionPage2.getReference() : "" 
;actionPage27 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage27 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage27.putString("pyHidden",String.valueOf(hideElement));actionPage27.putString("pyDisabled",String.valueOf(disableElement));actionPage27.putString( "pyName","ID1606877575704000");actionPage27.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Strategy Optimizations"));actionPage27.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage27.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage27.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage27.putString( "pyAutomationID","202012012152550688147");}actionPage27.putString( "pyBadgeFormat","Standard (label)");actionPage27.putString( "pyDeferLoad","false");actionPage27.putString( "pyImage","");actionPage27.putString("pyType","Action");
executePage=actionPage27.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage27 = actionPage27.getPage("pyBehaviors(<append>)");
behaviorPage27.putString("pyAction","refresh");ClipboardPage commandPage27 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage27.putString( "pyTarget","thisSection");commandPage27.putString( "pyUsingPage","");commandPage27.putString( "pyActivity","");commandPage27.putString( "pySection","");commandPage27.putString( "pyDisableSubmit","false");commandPage27.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage27.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage27.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage27.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage27.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage27.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");executePage.putPage("pyRefresh",commandPage27);
behaviorPage27.putPage("pyActionAPI",commandPage27);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage27.getPage("pyBehaviors(<LAST>)")).register();
commandPage27.removeFromClipboard();
executePage.putString("pyCommand","refresh");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1606877575704000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1686743749959000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1686743749959000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage28= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage27 != null ? actionPage27.getReference() : "" 
;actionPage28 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage28 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzGOSVersionManagementDisabled";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage28.putString("pyHidden",String.valueOf(hideElement));actionPage28.putString("pyDisabled",String.valueOf(disableElement));actionPage28.putString( "pyName","ID1686743749959000");actionPage28.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Globally Optimized Strategies"));actionPage28.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage28.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage28.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage28.putString( "pyAutomationID","202306141355490918656");}actionPage28.putString( "pyBadgeFormat","Standard (label)");actionPage28.putString( "pyDeferLoad","false");actionPage28.putString( "pyImage","");if (!hideElement) { 
actionPage28.putString("pyType","Action");
executePage=actionPage28.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage28 = actionPage28.getPage("pyBehaviors(<append>)");
behaviorPage28.putString("pyAction","openLanding");ClipboardPage commandPage28 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage28.putString( "pyAction","Display");commandPage28.putString( "pyName","Decisioning: Strategy Optimizations");commandPage28.putString( "pyClassName","Pega-Landing-Decision-Strategy");commandPage28.putString( "pyLevelA","");commandPage28.putString( "pyLevelB","");commandPage28.putString( "pyLevelC","GOSLP");commandPage28.putString( "pyElementName","");commandPage28.putString( "pyTargetElement","");commandPage28.putString( "pyIsTargetMicroDC","");commandPage28.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzStrategiesLP");commandPage28.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage28.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage28.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage28);
behaviorPage28.putPage("pyActionAPI",commandPage28);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage28.getPage("pyBehaviors(<LAST>)")).register();
commandPage28.removeFromClipboard();
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
if(processAction||("ID1673875790296000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1673875790296000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage30= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage27 != null ? actionPage27.getReference() : "" 
;actionPage30 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage30 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzGOSVersionManagementEnabled";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage30.putString("pyHidden",String.valueOf(hideElement));actionPage30.putString("pyDisabled",String.valueOf(disableElement));actionPage30.putString( "pyName","ID1673875790296000");actionPage30.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Globally Optimized Strategies"));actionPage30.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage30.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage30.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage30.putString( "pyAutomationID","202301161429500221550");}actionPage30.putString( "pyBadgeFormat","Standard (label)");actionPage30.putString( "pyDeferLoad","false");actionPage30.putString( "pyImage","");if (!hideElement) { 
actionPage30.putString("pyType","Action");
executePage=actionPage30.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage30 = actionPage30.getPage("pyBehaviors(<append>)");
behaviorPage30.putString("pyAction","openLanding");ClipboardPage commandPage30 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage30.putString( "pyAction","Display");commandPage30.putString( "pyName","Decisioning: Strategy Optimizations");commandPage30.putString( "pyClassName","Pega-Landing-Decision-Strategy");commandPage30.putString( "pyLevelA","");commandPage30.putString( "pyLevelB","");commandPage30.putString( "pyLevelC","GOSRevisions");commandPage30.putString( "pyElementName","");commandPage30.putString( "pyTargetElement","");commandPage30.putString( "pyIsTargetMicroDC","");commandPage30.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzStrategiesLPGOSRevisions");commandPage30.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage30.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage30.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage30);
behaviorPage30.putPage("pyActionAPI",commandPage30);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage30.getPage("pyBehaviors(<LAST>)")).register();
commandPage30.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
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
if(processAction||("ID1486448034519000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1486448034519000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage34= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage34 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage34 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage34.putString("pyHidden",String.valueOf(hideElement));actionPage34.putString("pyDisabled",String.valueOf(disableElement));actionPage34.putString( "pyName","ID1486448034519000");actionPage34.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Model Management"));actionPage34.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage34.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage34.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage34.putString( "pyAutomationID","201711091043530420648");}actionPage34.putString( "pyBadgeFormat","Standard (label)");actionPage34.putString( "pyDeferLoad","false");actionPage34.putString( "pyImage","");actionPage34.putString("pyType","Action");
executePage=actionPage34.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage34 = actionPage34.getPage("pyBehaviors(<append>)");
behaviorPage34.putString("pyAction","openLanding");ClipboardPage commandPage34 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage34.putString( "pyAction","Display");commandPage34.putString( "pyName","Decisioning: Model Management");commandPage34.putString( "pyClassName","Pega-Landing-Decision-AdaptiveModel");commandPage34.putString( "pyLevelA","");commandPage34.putString( "pyLevelB","");commandPage34.putString( "pyLevelC","");commandPage34.putString( "pyElementName","");commandPage34.putString( "pyTargetElement","");commandPage34.putString( "pyIsTargetMicroDC","false");commandPage34.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPAdaptiveModelManagement");commandPage34.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage34.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage34.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage34);
behaviorPage34.putPage("pyActionAPI",commandPage34);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage34.getPage("pyBehaviors(<LAST>)")).register();
commandPage34.removeFromClipboard();
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
if(processAction||("ID1377678550698002".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1377678550698002*/

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
actionPage36.putString("pyHidden",String.valueOf(hideElement));actionPage36.putString("pyDisabled",String.valueOf(disableElement));actionPage36.putString( "pyName","ID1377678550698002");actionPage36.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Monitoring"));actionPage36.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage36.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage36.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage36.putString( "pyAutomationID","201711091043530576506");}actionPage36.putString( "pyBadgeFormat","Standard (label)");actionPage36.putString( "pyDeferLoad","false");actionPage36.putString( "pyImage","");actionPage36.putString("pyType","Action");
executePage=actionPage36.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1377678550698002")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1377680480868000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1377680480868000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage37= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage36 != null ? actionPage36.getReference() : "" 
;actionPage37 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage37 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage37.putString("pyHidden",String.valueOf(hideElement));actionPage37.putString("pyDisabled",String.valueOf(disableElement));actionPage37.putString( "pyName","ID1377680480868000");actionPage37.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Interaction History"));actionPage37.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage37.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage37.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage37.putString( "pyAutomationID","201711091043530448668");}actionPage37.putString( "pyBadgeFormat","Standard (label)");actionPage37.putString( "pyDeferLoad","false");actionPage37.putString( "pyImage","");actionPage37.putString("pyType","Action");
executePage=actionPage37.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage37 = actionPage37.getPage("pyBehaviors(<append>)");
behaviorPage37.putString("pyAction","openLanding");ClipboardPage commandPage37 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage37.putString( "pyAction","Display");commandPage37.putString( "pyName","Decisioning: Interaction History");commandPage37.putString( "pyClassName","Pega-Landing-Decision-StrategyHierarchy");commandPage37.putString( "pyLevelA","");commandPage37.putString( "pyLevelB","");commandPage37.putString( "pyLevelC","");commandPage37.putString( "pyElementName","");commandPage37.putString( "pyTargetElement","");commandPage37.putString( "pyIsTargetMicroDC","");commandPage37.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPInteractionHistory");commandPage37.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage37.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage37.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage37);
behaviorPage37.putPage("pyActionAPI",commandPage37);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage37.getPage("pyBehaviors(<LAST>)")).register();
commandPage37.removeFromClipboard();
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
if(processAction||("ID1302264884561000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1302264884561000*/

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
parentPageRef = actionPage36 != null ? actionPage36.getReference() : "" 
;actionPage39 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage39 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage39.putString("pyHidden",String.valueOf(hideElement));actionPage39.putString("pyDisabled",String.valueOf(disableElement));actionPage39.putString( "pyName","ID1302264884561000");actionPage39.putString( "pyImageSource","styleclass");actionPage39.putString( "pyIconStyle","lpiBase lpiVBD");actionPage39.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Visual Business Director"));actionPage39.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage39.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage39.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage39.putString( "pyAutomationID","201711091043530544421");}actionPage39.putString( "pyBadgeFormat","Standard (label)");actionPage39.putString( "pyDeferLoad","false");actionPage39.putString( "pyImage","lpiBase lpiVBD");actionPage39.putString("pyType","Action");
executePage=actionPage39.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage39 = actionPage39.getPage("pyBehaviors(<append>)");
behaviorPage39.putString("pyAction","openLanding");ClipboardPage commandPage39 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage39.putString( "pyAction","Display");commandPage39.putString( "pyName","Decisioning: Visual Business Director");commandPage39.putString( "pyClassName","Pega-Landing-Decision-VBD");commandPage39.putString( "pyLevelA","");commandPage39.putString( "pyLevelB","");commandPage39.putString( "pyLevelC","");commandPage39.putString( "pyElementName","");commandPage39.putString( "pyTargetElement","");commandPage39.putString( "pyIsTargetMicroDC","false");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPVBD");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage39.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage39);
behaviorPage39.putPage("pyActionAPI",commandPage39);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage39.getPage("pyBehaviors(<LAST>)")).register();
commandPage39.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1302264884561000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1375186374565000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1375186374565000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage40= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage39 != null ? actionPage39.getReference() : "" 
;actionPage40 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage40 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage40.putString("pyHidden",String.valueOf(hideElement));actionPage40.putString("pyDisabled",String.valueOf(disableElement));actionPage40.putString( "pyName","ID1375186374565000");actionPage40.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Data Sources"));actionPage40.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage40.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage40.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage40.putString( "pyAutomationID","201711091043530482793");}actionPage40.putString( "pyBadgeFormat","Standard (label)");actionPage40.putString( "pyDeferLoad","false");actionPage40.putString( "pyImage","");actionPage40.putString("pyType","Action");
executePage=actionPage40.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage40 = actionPage40.getPage("pyBehaviors(<append>)");
behaviorPage40.putString("pyAction","openLanding");ClipboardPage commandPage40 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage40.putString( "pyAction","Display");commandPage40.putString( "pyName","Decisioning: Visual Business Director");commandPage40.putString( "pyClassName","Pega-Landing-Decision-VBD");commandPage40.putString( "pyLevelA","");commandPage40.putString( "pyLevelB","");commandPage40.putString( "pyLevelC","AvailableSources");commandPage40.putString( "pyElementName","");commandPage40.putString( "pyTargetElement","");commandPage40.putString( "pyIsTargetMicroDC","false");commandPage40.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPVBD");commandPage40.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage40.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage40.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage40);
behaviorPage40.putPage("pyActionAPI",commandPage40);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage40.getPage("pyBehaviors(<LAST>)")).register();
commandPage40.removeFromClipboard();
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
if(processAction||("ID1373883994816000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1373883994816000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage42= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage39 != null ? actionPage39.getReference() : "" 
;actionPage42 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage42 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage42.putString("pyHidden",String.valueOf(hideElement));actionPage42.putString("pyDisabled",String.valueOf(disableElement));actionPage42.putString( "pyName","ID1373883994816000");actionPage42.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Key Performance Indicators"));actionPage42.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage42.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage42.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage42.putString( "pyAutomationID","201711091043530505230");}actionPage42.putString( "pyBadgeFormat","Standard (label)");actionPage42.putString( "pyDeferLoad","false");actionPage42.putString( "pyImage","");actionPage42.putString("pyType","Action");
executePage=actionPage42.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage42 = actionPage42.getPage("pyBehaviors(<append>)");
behaviorPage42.putString("pyAction","openLanding");ClipboardPage commandPage42 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage42.putString( "pyAction","Display");commandPage42.putString( "pyName","Decisioning: Visual Business Director");commandPage42.putString( "pyClassName","Pega-Landing-Decision-VBD");commandPage42.putString( "pyLevelA","");commandPage42.putString( "pyLevelB","");commandPage42.putString( "pyLevelC","KPIDefinitions");commandPage42.putString( "pyElementName","");commandPage42.putString( "pyTargetElement","");commandPage42.putString( "pyIsTargetMicroDC","false");commandPage42.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPVBD");commandPage42.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage42.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage42.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage42);
behaviorPage42.putPage("pyActionAPI",commandPage42);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage42.getPage("pyBehaviors(<LAST>)")).register();
commandPage42.removeFromClipboard();
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
if(processAction||("ID1375186527534000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1375186527534000*/

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
parentPageRef = actionPage39 != null ? actionPage39.getReference() : "" 
;actionPage44 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage44 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="Never";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage44.putString("pyHidden",String.valueOf(hideElement));actionPage44.putString("pyDisabled",String.valueOf(disableElement));actionPage44.putString( "pyName","ID1375186527534000");actionPage44.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Views"));actionPage44.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage44.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage44.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage44.putString( "pyAutomationID","201711091043530529599");}actionPage44.putString( "pyBadgeFormat","Standard (label)");actionPage44.putString( "pyDeferLoad","false");actionPage44.putString( "pyImage","");if (!hideElement) { 
actionPage44.putString("pyType","Action");
executePage=actionPage44.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage44 = actionPage44.getPage("pyBehaviors(<append>)");
behaviorPage44.putString("pyAction","openLanding");ClipboardPage commandPage44 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage44.putString( "pyAction","Display");commandPage44.putString( "pyName","Decisioning: Visual Business Director");commandPage44.putString( "pyClassName","Pega-Landing-Decision-VBD");commandPage44.putString( "pyLevelA","");commandPage44.putString( "pyLevelB","");commandPage44.putString( "pyLevelC","UserViews");commandPage44.putString( "pyElementName","");commandPage44.putString( "pyTargetElement","");commandPage44.putString( "pyIsTargetMicroDC","false");commandPage44.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPVBD");commandPage44.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage44.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage44.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage44);
behaviorPage44.putPage("pyActionAPI",commandPage44);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage44.getPage("pyBehaviors(<LAST>)")).register();
commandPage44.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
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
if(processAction||("ID1502276282796000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1502276282796000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage47= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage36 != null ? actionPage36.getReference() : "" 
;actionPage47 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage47 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="Never";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage47.putString("pyHidden",String.valueOf(hideElement));actionPage47.putString("pyDisabled",String.valueOf(disableElement));actionPage47.putString( "pyName","ID1502276282796000");actionPage47.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Adaptive Models Reporting"));actionPage47.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage47.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage47.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage47.putString( "pyAutomationID","201711091043530565321");}actionPage47.putString( "pyBadgeFormat","Standard (label)");actionPage47.putString( "pyDeferLoad","false");actionPage47.putString( "pyImage","");if (!hideElement) { 
actionPage47.putString("pyType","Action");
executePage=actionPage47.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage47 = actionPage47.getPage("pyBehaviors(<append>)");
behaviorPage47.putString("pyAction","openLanding");ClipboardPage commandPage47 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage47.putString( "pyAction","Display");commandPage47.putString( "pyName","Decisioning: Adaptive Models Reporting");commandPage47.putString( "pyClassName","Pega-Landing-Decision-AdaptiveModel");commandPage47.putString( "pyLevelA","");commandPage47.putString( "pyLevelB","");commandPage47.putString( "pyLevelC","");commandPage47.putString( "pyElementName","");commandPage47.putString( "pyTargetElement","");commandPage47.putString( "pyIsTargetMicroDC","false");commandPage47.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPDeprecatedAdaptiveModelReporting");commandPage47.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage47.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage47.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage47);
behaviorPage47.putPage("pyActionAPI",commandPage47);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage47.getPage("pyBehaviors(<LAST>)")).register();
commandPage47.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
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
if(processAction||("ID1377678550698003".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1377678550698003*/

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage50 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage50 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage50.putString("pyHidden",String.valueOf(hideElement));actionPage50.putString("pyDisabled",String.valueOf(disableElement));actionPage50.putString( "pyName","ID1377678550698003");actionPage50.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Infrastructure"));actionPage50.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage50.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage50.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage50.putString( "pyAutomationID","201711091043540265984");}actionPage50.putString( "pyBadgeFormat","Standard (label)");actionPage50.putString( "pyDeferLoad","false");actionPage50.putString( "pyImage","");actionPage50.putString("pyType","Action");
executePage=actionPage50.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1377678550698003")))){
deferIndex ++;
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
showWhenCondition = true;
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("Never",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Pega-Landing","pyPropositionGroupsAuthorization",commonPrefix,uniqueSuffix,actionPage50, tools, "actionPage50","false",actionPage50);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//END OF WHEN CONDITION
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1377680481513000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1377680481513000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage53= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage50 != null ? actionPage50.getReference() : "" 
;actionPage53 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage53 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage53.putString("pyHidden",String.valueOf(hideElement));actionPage53.putString("pyDisabled",String.valueOf(disableElement));actionPage53.putString( "pyName","ID1377680481513000");actionPage53.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Services"));actionPage53.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage53.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage53.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage53.putString( "pyAutomationID","201711091043530888819");}actionPage53.putString( "pyBadgeFormat","Standard (label)");actionPage53.putString( "pyDeferLoad","false");actionPage53.putString( "pyImage","");actionPage53.putString("pyType","Action");
executePage=actionPage53.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage53 = actionPage53.getPage("pyBehaviors(<append>)");
behaviorPage53.putString("pyAction","openLanding");ClipboardPage commandPage53 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage53.putString( "pyAction","Display");commandPage53.putString( "pyName","Decisioning: Services");commandPage53.putString( "pyClassName","Pega-Landing-Decision-Services");commandPage53.putString( "pyLevelA","");commandPage53.putString( "pyLevelB","");commandPage53.putString( "pyLevelC","");commandPage53.putString( "pyElementName","");commandPage53.putString( "pyTargetElement","");commandPage53.putString( "pyIsTargetMicroDC","false");commandPage53.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pxServicesLP");commandPage53.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage53.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage53.getProperty("pyDisplay").getPageValue().putString( "pyModel","pyDefault");executePage.putPage("pyOpenLanding",commandPage53);
behaviorPage53.putPage("pyActionAPI",commandPage53);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage53.getPage("pyBehaviors(<LAST>)")).register();
commandPage53.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1377680481513000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1459238843345000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1459238843345000*/

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
parentPageRef = actionPage53 != null ? actionPage53.getReference() : "" 
;actionPage54 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage54 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage54.putString("pyHidden",String.valueOf(hideElement));actionPage54.putString("pyDisabled",String.valueOf(disableElement));actionPage54.putString( "pyName","ID1459238843345000");actionPage54.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Decision Data Store"));actionPage54.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage54.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage54.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage54.putString( "pyAutomationID","201711091043530791442");}actionPage54.putString( "pyBadgeFormat","Standard (label)");actionPage54.putString( "pyDeferLoad","false");actionPage54.putString( "pyImage","");actionPage54.putString("pyType","Action");
executePage=actionPage54.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage54 = actionPage54.getPage("pyBehaviors(<append>)");
behaviorPage54.putString("pyAction","openLanding");ClipboardPage commandPage54 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage54.putString( "pyAction","Display");commandPage54.putString( "pyName","Decisioning: Services");commandPage54.putString( "pyClassName","Pega-Landing-Decision-Services");commandPage54.putString( "pyLevelA","");commandPage54.putString( "pyLevelB","");commandPage54.putString( "pyLevelC","DDS");commandPage54.putString( "pyElementName","");commandPage54.putString( "pyTargetElement","");commandPage54.putString( "pyIsTargetMicroDC","false");commandPage54.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pxServicesLP");commandPage54.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage54.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage54.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage54);
behaviorPage54.putPage("pyActionAPI",commandPage54);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage54.getPage("pyBehaviors(<LAST>)")).register();
commandPage54.removeFromClipboard();
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
if(processAction||("ID1459238843346000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1459238843346000*/

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
parentPageRef = actionPage53 != null ? actionPage53.getReference() : "" 
;actionPage56 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage56 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage56.putString("pyHidden",String.valueOf(hideElement));actionPage56.putString("pyDisabled",String.valueOf(disableElement));actionPage56.putString( "pyName","ID1459238843346000");actionPage56.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Adaptive Decision Manager"));actionPage56.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage56.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage56.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage56.putString( "pyAutomationID","20171109104353081027");}actionPage56.putString( "pyBadgeFormat","Standard (label)");actionPage56.putString( "pyDeferLoad","false");actionPage56.putString( "pyImage","");actionPage56.putString("pyType","Action");
executePage=actionPage56.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage56 = actionPage56.getPage("pyBehaviors(<append>)");
behaviorPage56.putString("pyAction","openLanding");ClipboardPage commandPage56 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage56.putString( "pyAction","Display");commandPage56.putString( "pyName","Decisioning: Services");commandPage56.putString( "pyClassName","Pega-Landing-Decision-Services");commandPage56.putString( "pyLevelA","");commandPage56.putString( "pyLevelB","");commandPage56.putString( "pyLevelC","ADM");commandPage56.putString( "pyElementName","");commandPage56.putString( "pyTargetElement","");commandPage56.putString( "pyIsTargetMicroDC","false");commandPage56.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pxServicesLP");commandPage56.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage56.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage56.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage56);
behaviorPage56.putPage("pyActionAPI",commandPage56);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage56.getPage("pyBehaviors(<LAST>)")).register();
commandPage56.removeFromClipboard();
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
if(processAction||("ID1459239093870000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1459239093870000*/

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
parentPageRef = actionPage53 != null ? actionPage53.getReference() : "" 
;actionPage58 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage58 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage58.putString("pyHidden",String.valueOf(hideElement));actionPage58.putString("pyDisabled",String.valueOf(disableElement));actionPage58.putString( "pyName","ID1459239093870000");actionPage58.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Data Flow"));actionPage58.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage58.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage58.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage58.putString( "pyAutomationID","201711091043530830361");}actionPage58.putString( "pyBadgeFormat","Standard (label)");actionPage58.putString( "pyDeferLoad","false");actionPage58.putString( "pyImage","");actionPage58.putString("pyType","Action");
executePage=actionPage58.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage58 = actionPage58.getPage("pyBehaviors(<append>)");
behaviorPage58.putString("pyAction","openLanding");ClipboardPage commandPage58 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage58.putString( "pyAction","Display");commandPage58.putString( "pyName","Decisioning: Services");commandPage58.putString( "pyClassName","Pega-Landing-Decision-Services");commandPage58.putString( "pyLevelA","");commandPage58.putString( "pyLevelB","");commandPage58.putString( "pyLevelC","DataFlow");commandPage58.putString( "pyElementName","");commandPage58.putString( "pyTargetElement","");commandPage58.putString( "pyIsTargetMicroDC","false");commandPage58.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pxServicesLP");commandPage58.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage58.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage58.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage58);
behaviorPage58.putPage("pyActionAPI",commandPage58);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage58.getPage("pyBehaviors(<LAST>)")).register();
commandPage58.removeFromClipboard();
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
if(processAction||("ID1459239093870001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1459239093870001*/

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
parentPageRef = actionPage53 != null ? actionPage53.getReference() : "" 
;actionPage60 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage60 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage60.putString("pyHidden",String.valueOf(hideElement));actionPage60.putString("pyDisabled",String.valueOf(disableElement));actionPage60.putString( "pyName","ID1459239093870001");actionPage60.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Real-time Data Grid"));actionPage60.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage60.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage60.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage60.putString( "pyAutomationID","20171109104353084997");}actionPage60.putString( "pyBadgeFormat","Standard (label)");actionPage60.putString( "pyDeferLoad","false");actionPage60.putString( "pyImage","");actionPage60.putString("pyType","Action");
executePage=actionPage60.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage60 = actionPage60.getPage("pyBehaviors(<append>)");
behaviorPage60.putString("pyAction","openLanding");ClipboardPage commandPage60 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage60.putString( "pyAction","Display");commandPage60.putString( "pyName","Decisioning: Services");commandPage60.putString( "pyClassName","Pega-Landing-Decision-Services");commandPage60.putString( "pyLevelA","");commandPage60.putString( "pyLevelB","");commandPage60.putString( "pyLevelC","VBD");commandPage60.putString( "pyElementName","");commandPage60.putString( "pyTargetElement","");commandPage60.putString( "pyIsTargetMicroDC","");commandPage60.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pxServicesLP");commandPage60.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage60.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage60.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage60);
behaviorPage60.putPage("pyActionAPI",commandPage60);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage60.getPage("pyBehaviors(<LAST>)")).register();
commandPage60.removeFromClipboard();
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
if(processAction||("ID1510242233882000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1510242233882000*/

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
parentPageRef = actionPage53 != null ? actionPage53.getReference() : "" 
;actionPage62 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage62 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage62.putString("pyHidden",String.valueOf(hideElement));actionPage62.putString("pyDisabled",String.valueOf(disableElement));actionPage62.putString( "pyName","ID1510242233882000");actionPage62.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Stream"));actionPage62.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage62.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage62.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage62.putString( "pyAutomationID","201711091043530872782");}actionPage62.putString( "pyBadgeFormat","Standard (label)");actionPage62.putString( "pyDeferLoad","false");actionPage62.putString( "pyImage","");actionPage62.putString("pyType","Action");
executePage=actionPage62.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage62 = actionPage62.getPage("pyBehaviors(<append>)");
behaviorPage62.putString("pyAction","openLanding");ClipboardPage commandPage62 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage62.putString( "pyAction","Display");commandPage62.putString( "pyName","Decisioning: Services");commandPage62.putString( "pyClassName","Pega-Landing-Decision-Services");commandPage62.putString( "pyLevelA","");commandPage62.putString( "pyLevelB","");commandPage62.putString( "pyLevelC","Stream");commandPage62.putString( "pyElementName","");commandPage62.putString( "pyTargetElement","");commandPage62.putString( "pyIsTargetMicroDC","false");commandPage62.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pxServicesLP");commandPage62.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage62.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage62.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage62);
behaviorPage62.putPage("pyActionAPI",commandPage62);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage62.getPage("pyBehaviors(<LAST>)")).register();
commandPage62.removeFromClipboard();
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
if(processAction||("ID1592287263620000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1592287263620000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage65= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage50 != null ? actionPage50.getReference() : "" 
;actionPage65 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage65 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage65.putString("pyHidden",String.valueOf(hideElement));actionPage65.putString("pyDisabled",String.valueOf(disableElement));actionPage65.putString( "pyName","ID1592287263620000");actionPage65.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "pyPredictionSetting"));actionPage65.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage65.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage65.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage65.putString( "pyAutomationID","202006160201030420780");}actionPage65.putString( "pyBadgeFormat","Standard (label)");actionPage65.putString( "pyDeferLoad","false");actionPage65.putString( "pyImage","");actionPage65.putString("pyType","Action");
executePage=actionPage65.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage65 = actionPage65.getPage("pyBehaviors(<append>)");
behaviorPage65.putString("pyAction","openLanding");ClipboardPage commandPage65 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage65.putString( "pyAction","Display");commandPage65.putString( "pyName","Decisioning: Prediction Studio settings");commandPage65.putString( "pyClassName","Pega-Landing-Decision-DSMConfiguration");commandPage65.putString( "pyLevelA","");commandPage65.putString( "pyLevelB","");commandPage65.putString( "pyLevelC","");commandPage65.putString( "pyElementName","");commandPage65.putString( "pyTargetElement","");commandPage65.putString( "pyIsTargetMicroDC","");commandPage65.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pyPredictiveAnalyticsDirectorSettings");commandPage65.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage65.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage65.getProperty("pyDisplay").getPageValue().putString( "pyModel","pyDefault");executePage.putPage("pyOpenLanding",commandPage65);
behaviorPage65.putPage("pyActionAPI",commandPage65);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage65.getPage("pyBehaviors(<LAST>)")).register();
commandPage65.removeFromClipboard();
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
if(processAction||("ID1571417337252000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1571417337252000*/

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
parentPageRef = actionPage50 != null ? actionPage50.getReference() : "" 
;actionPage67 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage67 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzBiasCheckEnabled";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage67.putString("pyHidden",String.valueOf(hideElement));actionPage67.putString("pyDisabled",String.valueOf(disableElement));actionPage67.putString( "pyName","ID1571417337252000");actionPage67.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "pzEthicalBias"));actionPage67.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage67.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage67.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Ethical bias policy settings"));if(testIDWhen || functionalTestingWhen){actionPage67.putString( "pyAutomationID","201910181848560678967");}actionPage67.putString( "pyBadgeFormat","Standard (label)");actionPage67.putString( "pyDeferLoad","false");actionPage67.putString( "pyImage","");if (!hideElement) { 
actionPage67.putString("pyType","Action");
executePage=actionPage67.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage67 = actionPage67.getPage("pyBehaviors(<append>)");
behaviorPage67.putString("pyAction","openLanding");ClipboardPage commandPage67 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage67.putString( "pyAction","Display");commandPage67.putString( "pyName","Ethical Bias Policy");commandPage67.putString( "pyClassName","Pega-Landing-Decision-EthicalBias");commandPage67.putString( "pyLevelA","");commandPage67.putString( "pyLevelB","");commandPage67.putString( "pyLevelC","");commandPage67.putString( "pyElementName","");commandPage67.putString( "pyTargetElement","");commandPage67.putString( "pyIsTargetMicroDC","");commandPage67.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzEthicalBiasSettings");commandPage67.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage67.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage67.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage67);
behaviorPage67.putPage("pyActionAPI",commandPage67);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage67.getPage("pyBehaviors(<LAST>)")).register();
commandPage67.removeFromClipboard();
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
if(processAction||("ID1500299917950000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1500299917950000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage69= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage50 != null ? actionPage50.getReference() : "" 
;actionPage69 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage69 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage69.putString("pyHidden",String.valueOf(hideElement));actionPage69.putString("pyDisabled",String.valueOf(disableElement));actionPage69.putString( "pyName","ID1500299917950000");actionPage69.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Model Transparency Policies"));actionPage69.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage69.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage69.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage69.putString( "pyAutomationID","201711091043540016373");}actionPage69.putString( "pyBadgeFormat","Standard (label)");actionPage69.putString( "pyDeferLoad","false");actionPage69.putString( "pyImage","");actionPage69.putString("pyType","Action");
executePage=actionPage69.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage69 = actionPage69.getPage("pyBehaviors(<append>)");
behaviorPage69.putString("pyAction","runActivity");ClipboardPage commandPage69 = tools.createPage("Embed-SelectedContextAPI-RunActivity","commandType");
commandPage69.putString( "pyActivity","pyFetchTScoreSettings");commandPage69.putString( "pyUsingPage", tools.getStepPage().getReference());commandPage69.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage69.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","issueClass");commandPage69.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage69.getProperty("pyActivityParameters").getPageValue(2).putString( "pyValue","");commandPage69.getProperty("pyActivityParameters").getPageValue(2).putString( "pyName","CanSkipDelete");commandPage69.getProperty("pyActivityParameters").getPageValue(2).putString( "pxObjClass","Embed-NameValuePair");executePage.putPage("pyRunActivity",commandPage69);
behaviorPage69.putPage("pyActionAPI",commandPage69);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage69.getPage("pyBehaviors(<LAST>)")).register();
commandPage69.removeFromClipboard();
ClipboardPage behaviorPage70 = actionPage69.getPage("pyBehaviors(<append>)");
behaviorPage70.putString("pyAction","openLanding");ClipboardPage commandPage70 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage70.putString( "pyAction","Display");commandPage70.putString( "pyName","Model Transparency Policy");commandPage70.putString( "pyClassName","Pega-Landing-Decision-TSwitchSettings");commandPage70.putString( "pyLevelA","");commandPage70.putString( "pyLevelB","");commandPage70.putString( "pyLevelC","");commandPage70.putString( "pyElementName","");commandPage70.putString( "pyTargetElement","");commandPage70.putString( "pyIsTargetMicroDC","false");commandPage70.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pyShowTSwitchSettings");commandPage70.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage70.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage70.getProperty("pyDisplay").getPageValue().putString( "pyModel","");behaviorPage70.putPage("pyActionAPI",commandPage70);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage69.getPage("pyBehaviors(<LAST>)")).register();
commandPage70.removeFromClipboard();
executePage.putString("pyCommand","runActivity");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1540978286849000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1540978286849000*/

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
parentPageRef = actionPage50 != null ? actionPage50.getReference() : "" 
;actionPage72 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage72 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage72.putString("pyHidden",String.valueOf(hideElement));actionPage72.putString("pyDisabled",String.valueOf(disableElement));actionPage72.putString( "pyName","ID1540978286849000");actionPage72.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "ProductionDataMigration"));actionPage72.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage72.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage72.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage72.putString( "pyAutomationID","201810310531260770274");}actionPage72.putString( "pyBadgeFormat","Standard (label)");actionPage72.putString( "pyDeferLoad","false");actionPage72.putString( "pyImage","");actionPage72.putString("pyType","Action");
executePage=actionPage72.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage72 = actionPage72.getPage("pyBehaviors(<append>)");
behaviorPage72.putString("pyAction","openLanding");ClipboardPage commandPage72 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage72.putString( "pyAction","Display");commandPage72.putString( "pyName","Data Migration");commandPage72.putString( "pyClassName","Pega-Landing-DataMigration");commandPage72.putString( "pyLevelA","");commandPage72.putString( "pyLevelB","");commandPage72.putString( "pyLevelC","");commandPage72.putString( "pyElementName","");commandPage72.putString( "pyTargetElement","");commandPage72.putString( "pyIsTargetMicroDC","");commandPage72.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pyDataMigrationLanding");commandPage72.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage72.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage72.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage72);
behaviorPage72.putPage("pyActionAPI",commandPage72);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage72.getPage("pyBehaviors(<LAST>)")).register();
commandPage72.removeFromClipboard();
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
if(processAction||("ID1658733056938000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1658733056938000*/

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
parentPageRef = actionPage50 != null ? actionPage50.getReference() : "" 
;actionPage74 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage74 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage74.putString("pyHidden",String.valueOf(hideElement));actionPage74.putString("pyDisabled",String.valueOf(disableElement));actionPage74.putString( "pyName","ID1658733056938000");actionPage74.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "ProductionExportIHSettings"));actionPage74.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage74.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage74.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "ProductionExportIHSettings"));if(testIDWhen || functionalTestingWhen){actionPage74.putString( "pyAutomationID","202207250310560842370");}actionPage74.putString( "pyBadgeFormat","Standard (label)");actionPage74.putString( "pyDeferLoad","false");actionPage74.putString( "pyImage","");actionPage74.putString("pyType","Action");
executePage=actionPage74.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage74 = actionPage74.getPage("pyBehaviors(<append>)");
behaviorPage74.putString("pyAction","openLanding");ClipboardPage commandPage74 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage74.putString( "pyAction","Display");commandPage74.putString( "pyName","Interaction History Settings");commandPage74.putString( "pyClassName","Pega-Landing-ExportIHSettings");commandPage74.putString( "pyLevelA","");commandPage74.putString( "pyLevelB","");commandPage74.putString( "pyLevelC","");commandPage74.putString( "pyElementName","");commandPage74.putString( "pyTargetElement","");commandPage74.putString( "pyIsTargetMicroDC","");commandPage74.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pyExportIHSettingsLanding");commandPage74.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage74.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage74.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage74);
behaviorPage74.putPage("pyActionAPI",commandPage74);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage74.getPage("pyBehaviors(<LAST>)")).register();
commandPage74.removeFromClipboard();
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
showWhenCondition = true;
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyRMAvailable",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Pega-Landing","pyRevisionManagement",commonPrefix,uniqueSuffix,actionPage50, tools, "actionPage50","false",actionPage50);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//END OF WHEN CONDITION
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
pega_uiengine_pznavigation.pzProcessNavigationNode("Pega-Landing","pyCustomerMovie",commonPrefix,uniqueSuffix,actionPage50, tools, "actionPage50","false",actionPage50);
tools.putParamValue("deferLoadPath", deferLoadPath);
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
showWhenCondition = true;
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyNLPAvailable",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Pega-Landing","pySocialMetadataMenu",commonPrefix,uniqueSuffix,actionPage50, tools, "actionPage50","false",actionPage50);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//END OF WHEN CONDITION
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1495752374055000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1495752374055000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage82= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage50 != null ? actionPage50.getReference() : "" 
;actionPage82 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage82 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyEnableDecisionProfiler";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage82.putString("pyHidden",String.valueOf(hideElement));actionPage82.putString("pyDisabled",String.valueOf(disableElement));actionPage82.putString( "pyName","ID1495752374055000");actionPage82.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Profiler"));actionPage82.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage82.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage82.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage82.putString( "pyAutomationID","201711091043540250539");}actionPage82.putString( "pyBadgeFormat","Standard (label)");actionPage82.putString( "pyDeferLoad","false");actionPage82.putString( "pyImage","");if (!hideElement) { 
actionPage82.putString("pyType","Action");
executePage=actionPage82.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage82 = actionPage82.getPage("pyBehaviors(<append>)");
behaviorPage82.putString("pyAction","openLanding");ClipboardPage commandPage82 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage82.putString( "pyAction","Display");commandPage82.putString( "pyName","Profiler");commandPage82.putString( "pyClassName","Pega-Landing-Decision-Profiler");commandPage82.putString( "pyLevelA","");commandPage82.putString( "pyLevelB","");commandPage82.putString( "pyLevelC","");commandPage82.putString( "pyElementName","");commandPage82.putString( "pyTargetElement","");commandPage82.putString( "pyIsTargetMicroDC","false");commandPage82.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pxProfiler");commandPage82.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage82.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage82.getProperty("pyDisplay").getPageValue().putString( "pyModel","");executePage.putPage("pyOpenLanding",commandPage82);
behaviorPage82.putPage("pyActionAPI",commandPage82);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage82.getPage("pyBehaviors(<LAST>)")).register();
commandPage82.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
}
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
pega_uiengine_pznavigation.pzProcessNavigationNode("Pega-Landing","pzDSMUpgrade",commonPrefix,uniqueSuffix,actionPage1, tools, "actionPage1","false",actionPage1);
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION PEGA-LANDING PZDECISIONMENU #20230618T002146.209 GMT", "Pega-Landing pzDecisionMenu", "Pega-DecisionArchitect", "08-23-01", "20230630T121051.713 GMT");
}
