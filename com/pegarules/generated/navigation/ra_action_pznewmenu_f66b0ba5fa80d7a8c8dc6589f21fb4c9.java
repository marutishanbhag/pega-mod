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
public class ra_action_pznewmenu_f66b0ba5fa80d7a8c8dc6589f21fb4c9  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzNewMenu._baseclass.Action");
	public ra_action_pznewmenu_f66b0ba5fa80d7a8c8dc6589f21fb4c9(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION @BASECLASS PZNEWMENU #20180713T135314.001 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzGetRelatedRules"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzGetRelatedRules");
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCREATENEWWORK", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSRUNACTIVITY", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTIONLISTNODE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZNEWMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCREATENEWWORK","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCREATENEWWORK",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSRUNACTIVITY","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSRUNACTIVITY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTIONLISTNODE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTIONLISTNODE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZNEWMENU","Rule-Navigation","@BASECLASS",false,"","Pega-Desktop","08-01-01","RULE-NAVIGATION @BASECLASS PZNEWMENU #20180713T135314.001 GMT","!PZNEWMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1359534059)
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
//	RULE-NAVIGATION @BASECLASS PZNEWMENU #20180713T135314.001 GMT:20180713T135314.001 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEENCODED #20180713T133341.517 GMT:20180713T133341.517 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEFORCUSTOM #20180713T133341.521 GMT:20180713T133341.521 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUELOCALIZED #20180713T133341.527 GMT:20180713T133341.527 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZGETRUNTIMEPAGEREFERENCE #20180713T133341.536 GMT:20180713T133341.536 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZISREFERENCEFORCUSTOM #20180713T133341.542 GMT:20180713T133341.542 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONLISTNODE--(FIRSTU2AC9705C05F7021E3ECC6D11477422D3 #20230618T001619.232 GMT:20230618T001619.232 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCREATENEWWORK #20201103T105517.453 GMT:20201103T105517.453 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCUSTOM #20180713T133341.621 GMT:20180713T133341.621 GMT
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
		return "504b19a9e550e2665ad41933936b05e2";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzGetRelatedRules" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(processShortcut &&"".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("")){
return;}
preActParamMap = new HashStringMap();
newParamsPage = new ParameterPage();
preActParamMap.put("pyClassName","@baseclass");
preActParamMap.put("pyActivityName","pzExplorerMenuClass");
tools.doActivity(preActParamMap, tools.getStepPage(), newParamsPage);
nodePageList = tools.getIfPresent("Declare_RuleTypeMenu.pzCategory");
String strChildListPageRef1 = null;
if (nodePageList != null) {
String actionListParentPage1 = tools.getParamValue("ApplyToPage");	Iterator actionListIter1 = nodePageList.iterator();
	while (actionListIter1.hasNext()) {		iterListResult = (ClipboardProperty)actionListIter1.next();
		childListPage = iterListResult.getPageValue();
		;
		strChildListPageRef1 = childListPage.getReference();
		;
		if(strChildListPageRef1.lastIndexOf(".") == 0) {
			strChildListPageRef1 = "Declare_RuleTypeMenu" + strChildListPageRef1;
		}
		tools.putParamValue("ApplyToPage", strChildListPageRef1);
		((PegaAPI)tools).pushStackFrame("navigation", null, childListPage, false, false);
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
String whenResolved ="pyDisplayCategory";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","");propertyValue = ".pyLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyLabel";if(!isDynamicFieldNameForMenu){actionPage1.putString("pyCaption",tools.getLocalizedTextForString("pyCaption", tools.getProperty(propertyValue).getStringValue()));}else{actionPage1.putString("pyCaption",tools.getLocalizedTextForString(".pyLabel", "\t["+tools.getProperty(tools.getParamValue("ApplyToPage")+".pxObjClass").getStringValue()+".pyLabel]"+tools.getProperty(propertyValue).getStringValue()));}actionPage1.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage1.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage1.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","");propertyValue = ".pxListSubscript";
propertyValue = tools.getParamValue("ApplyToPage")+".pxListSubscript";actionPage1.putString("pySubscript",tools.getProperty(propertyValue).getStringValue());if(testIDWhen || functionalTestingWhen){if(!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue())) {actionPage1.putString("pyAutomationID","201806260301000977303" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue());}else if (!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue())) {actionPage1.putString("pyAutomationID","201806260301000977303" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue());}else {actionPage1.putString( "pyAutomationID","201806260301000977303");}}actionPage1.putString( "pyImage","");if (!hideElement) { 
actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
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
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1345496543459000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1345496543459000*/

nodePageList = tools.getIfPresent(".pzRuleType");
String strChildListPageRef2 = null;
if (nodePageList != null) {
String actionListParentPage2 = tools.getParamValue("ApplyToPage");	Iterator actionListIter2 = nodePageList.iterator();
	while (actionListIter2.hasNext()) {		iterListResult = (ClipboardProperty)actionListIter2.next();
		childListPage = iterListResult.getPageValue();
		;
		strChildListPageRef2 = childListPage.getReference();
		;
		tools.putParamValue("ApplyToPage", strChildListPageRef2);
		((PegaAPI)tools).pushStackFrame("navigation", null, childListPage, false, false);
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
showWhenCondition = true;
String whenResolved ="pyDisplayRuleType";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","ID1345496543459000");propertyValue = ".pyLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyLabel";if(!isDynamicFieldNameForMenu){actionPage2.putString("pyCaption",tools.getLocalizedTextForString("pyCaption", tools.getProperty(propertyValue).getStringValue()));}else{actionPage2.putString("pyCaption",tools.getLocalizedTextForString(".pyLabel", "\t["+tools.getProperty(tools.getParamValue("ApplyToPage")+".pxObjClass").getStringValue()+".pyLabel]"+tools.getProperty(propertyValue).getStringValue()));}actionPage2.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage2.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage2.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage2.putString( "pyBadgeFormat","Standard (label)");actionPage2.putString( "pyDeferLoad","");propertyValue = ".pxListSubscript";
propertyValue = tools.getParamValue("ApplyToPage")+".pxListSubscript";actionPage2.putString("pySubscript",tools.getProperty(propertyValue).getStringValue());if(testIDWhen || functionalTestingWhen){if(!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue())) {actionPage2.putString("pyAutomationID","201806260301000762873" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue());}else if (!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue())) {actionPage2.putString("pyAutomationID","201806260301000762873" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue());}else {actionPage2.putString( "pyAutomationID","201806260301000762873");}}actionPage2.putString( "pyImage","");if (!hideElement) { 
actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage2 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","runScript");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage2.getProperty("pyParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage2.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage2.getProperty("pyParameters").getPageValue(2).putString( "pyValue","");commandPage2.getProperty("pyParameters").getPageValue(2).putString( "pyName","");propertyValue = "Declare_RuleTypeMenu.pyClassName";
commandPage2.getProperty("pyParameters").getPageValue(3).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage2.getProperty("pyParameters").getPageValue(3).putString( "pyName","");commandPage2.getProperty("pyParameters").getPageValue(4).putString( "pyValue","true");commandPage2.getProperty("pyParameters").getPageValue(4).putString( "pyName","");commandPage2.putString( "pyFunctionName","OpenRuleInPortal");executePage.putPage("pyCustom",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
ClipboardPage behaviorPage3 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","runActivity");ClipboardPage commandPage3 = tools.createPage("Embed-SelectedContextAPI-RunActivity","commandType");
commandPage3.putString( "pyActivity","pzPreRMAction");commandPage3.putString( "pyUsingPage", tools.getStepPage().getReference());commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","pyWorkPage");commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","PageName");commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage3.getProperty("pyActivityParameters").getPageValue(2).putString( "pyValue","NewModalFlow");commandPage3.getProperty("pyActivityParameters").getPageValue(2).putString( "pyName","FlowType");commandPage3.getProperty("pyActivityParameters").getPageValue(2).putString( "pxObjClass","Embed-NameValuePair");commandPage3.getProperty("pyActivityParameters").getPageValue(3).putString( "pyValue","Work-ProjectManagement-New");commandPage3.getProperty("pyActivityParameters").getPageValue(3).putString( "pyName","FlowClass");commandPage3.getProperty("pyActivityParameters").getPageValue(3).putString( "pxObjClass","Embed-NameValuePair");commandPage3.getProperty("pyActivityParameters").getPageValue(4).putString( "pyValue","");commandPage3.getProperty("pyActivityParameters").getPageValue(4).putString( "pyName","ClassName");commandPage3.getProperty("pyActivityParameters").getPageValue(4).putString( "pxObjClass","Embed-NameValuePair");commandPage3.getProperty("pyActivityParameters").getPageValue(5).putString( "pyValue","");commandPage3.getProperty("pyActivityParameters").getPageValue(5).putString( "pyName","ObjClass");commandPage3.getProperty("pyActivityParameters").getPageValue(5).putString( "pxObjClass","Embed-NameValuePair");commandPage3.getProperty("pyActivityParameters").getPageValue(6).putString( "pyValue","true");commandPage3.getProperty("pyActivityParameters").getPageValue(6).putString( "pyName","newRule");commandPage3.getProperty("pyActivityParameters").getPageValue(6).putString( "pxObjClass","Embed-NameValuePair");behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
ClipboardPage behaviorPage4 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","createWork");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-CreateNewWork","commandType");
commandPage4.putString( "pyClassName","Work-ProjectManagement-New");commandPage4.putString( "pyFlowName","NewModalFlow");commandPage4.putString( "pyElementName","");commandPage4.putString( "pyTargetElement","");commandPage4.putString( "pyIsTargetMicroDC","false");commandPage4.putString( "pyACName","");commandPage4.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage4.getProperty("pyFlowParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage4.getProperty("pyFlowParameters").getPageValue(1).putString( "pyName","newObjClass");commandPage4.getProperty("pyFlowParameters").getPageValue(1).putString( "pxObjClass","Embed-MethodParams");propertyValue = "Declare_RuleTypeMenu.pyClassName";
commandPage4.getProperty("pyFlowParameters").getPageValue(2).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage4.getProperty("pyFlowParameters").getPageValue(2).putString( "pyName","newClassName");commandPage4.getProperty("pyFlowParameters").getPageValue(2).putString( "pxObjClass","Embed-MethodParams");commandPage4.getProperty("pyFlowParameters").getPageValue(3).putString( "pyValue","");commandPage4.getProperty("pyFlowParameters").getPageValue(3).putString( "pyName","RuleSetName");commandPage4.getProperty("pyFlowParameters").getPageValue(3).putString( "pxObjClass","Embed-MethodParams");behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
}
deferLoad = false;
pyNameSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String deferPagePath = tools.getParamValue("deferPagePath");
if( (StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length) && actionPage1 != null) {
		actionPage1.getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}else{
tools.findPage(deferPagePath).getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}
	}
	tools.putParamValue("ApplyToPage", actionListParentPage2);}
		((PegaAPI)tools).pushStackFrame("navigation", null, stepPage, false, false);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
pyNameSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
		tools.findPage(tools.getParamValue("PageName")).getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
	}
	tools.putParamValue("ApplyToPage", actionListParentPage1);}
		((PegaAPI)tools).pushStackFrame("navigation", null, stepPage, false, false);
}//end of if for pxProcessShortcut
}//end of method
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION @BASECLASS PZNEWMENU #20180713T135314.001 GMT", "@baseclass pzNewMenu", "Pega-Desktop", "08-01-01", "20180713T135314.001 GMT");
}
