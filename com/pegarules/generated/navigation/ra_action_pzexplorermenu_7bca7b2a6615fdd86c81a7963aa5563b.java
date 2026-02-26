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
public class ra_action_pzexplorermenu_7bca7b2a6615fdd86c81a7963aa5563b  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzExplorerMenu.Embed_ExplorerNode_Class.Action");
	public ra_action_pzexplorermenu_7bca7b2a6615fdd86c81a7963aa5563b(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION EMBED-EXPLORERNODE-CLASS PZEXPLORERMENU #20180713T135314.563 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(false){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzExplorerMenu"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzExplorerMenu");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method4_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method11_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method12_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method13_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method14_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method15_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method16_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method21_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method22_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method24_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
}
	} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODBODY", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCREATENEWWORK", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSSHOWHARNESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENRULEBYCLASSANDNAME", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSRUNACTIVITY", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTIONLISTNODE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZEXPLORERMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCREATENEWWORK","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCREATENEWWORK",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENLANDINGPAGE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSSHOWHARNESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSSHOWHARNESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENRULEBYCLASSANDNAME","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENRULEBYCLASSANDNAME",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSRUNACTIVITY","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSRUNACTIVITY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTIONLISTNODE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTIONLISTNODE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZEXPLORERMENU","Rule-Navigation","EMBED-EXPLORERNODE-CLASS",false,"","Pega-Desktop","08-01-01","RULE-NAVIGATION EMBED-EXPLORERNODE-CLASS PZEXPLORERMENU #20180713T135314.563 GMT","!PZEXPLORERMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-584164516)
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
//	RULE-NAVIGATION EMBED-EXPLORERNODE-CLASS PZEXPLORERMENU #20180713T135314.563 GMT:20180730T130712.844 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEENCODED #20180713T133341.517 GMT:20180713T133341.517 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZGETRUNTIMEPAGEREFERENCE #20180713T133341.536 GMT:20180713T133341.536 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONLISTNODE--(FIRSTU2AC9705C05F7021E3ECC6D11477422D3 #20230618T001619.232 GMT:20230618T001619.232 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCONTEXTREFRESH #20180713T133341.611 GMT:20180713T133341.611 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCREATENEWWORK #20201103T105517.453 GMT:20201103T105517.453 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENLANDINGPAGE #20180918T064825.561 GMT:20181015T130125.636 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENMODALWINDOW #20190423T162450.106 GMT:20190423T162450.106 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENRULEBYCLASSANDNAME #20180713T133342.756 GMT:20180713T133342.756 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSRUNACTIVITY #20180713T133342.796 GMT:20180713T133342.796 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSSHOWHARNESS #20181002T085420.943 GMT:20181029T095208.072 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZNAVIGATION PZISREFERENCE #20180713T133347.956 GMT:20180713T133347.956 GMT
//	RULE-UTILITY-FUNCTION STRING ISDOUBLE #20180713T131441.648 GMT:20180713T131441.648 GMT
//	RULE-UTILITY-FUNCTION STRING ISINTEGER #20180713T131441.652 GMT:20180713T131441.652 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "c429523597817d4d6c13bf1f123839a4";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ExplorerNode-Class";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1349380874320000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1349380874320000")){
return;}
if(processShortcut &&"ID1349380874320000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1349380874320000");actionPage1.putString( "pyCaption","Create");actionPage1.putString( "pySummary","");actionPage1.putString( "pyBadgeProperty","");actionPage1.putString( "pyToolTip","Create");if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201805171944460097535");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","");actionPage1.putString("pyType","Action");
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
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1349380874320000")))){
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
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Embed-ExplorerNode-Class","pzNewMenu",commonPrefix,uniqueSuffix,actionPage1, tools, "actionPage1","false",actionPage1);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method4_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1349380874320001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage4";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1349380874320001")){
return;}
if(processShortcut &&"ID1349380874320001".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage4 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage4 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage4.putString("pyHidden",String.valueOf(hideElement));actionPage4.putString("pyDisabled",String.valueOf(disableElement));actionPage4.putString( "pyName","ID1349380874320001");actionPage4.putString( "pyCaption","View");actionPage4.putString( "pySummary","");actionPage4.putString( "pyBadgeProperty","");actionPage4.putString( "pyToolTip","View");if(testIDWhen || functionalTestingWhen){actionPage4.putString( "pyAutomationID","201805171944460287946");}actionPage4.putString( "pyBadgeFormat","Standard (label)");actionPage4.putString( "pyDeferLoad","false");actionPage4.putString( "pyImage","");actionPage4.putString("pyType","Action");
executePage=actionPage4.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage4);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1349380874320001")))){
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

nodePageList = tools.getIfPresent("Declare_RuleTypeMenu.pzCategory");
String strChildListPageRef5 = null;
if (nodePageList != null) {
String actionListParentPage5 = tools.getParamValue("ApplyToPage");	Iterator actionListIter5 = nodePageList.iterator();
	while (actionListIter5.hasNext()) {		iterListResult = (ClipboardProperty)actionListIter5.next();
		childListPage = iterListResult.getPageValue();
		;
		strChildListPageRef5 = childListPage.getReference();
		;
		if(strChildListPageRef5.lastIndexOf(".") == 0) {
			strChildListPageRef5 = "Declare_RuleTypeMenu" + strChildListPageRef5;
		}
		tools.putParamValue("ApplyToPage", strChildListPageRef5);
		((PegaAPI)tools).pushStackFrame("navigation", null, childListPage, false, false);
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
parentPageRef = actionPage4 != null ? actionPage4.getReference() : "" 
;actionPage5 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage5 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
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
actionPage5.putString("pyHidden",String.valueOf(hideElement));actionPage5.putString("pyDisabled",String.valueOf(disableElement));actionPage5.putString( "pyName","");propertyValue = ".pyLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyLabel";actionPage5.putString("pyCaption",tools.getProperty(propertyValue).getStringValue());actionPage5.putString( "pySummary","");actionPage5.putString( "pyBadgeProperty","");propertyValue = ".pyLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyLabel";actionPage5.putString("pyToolTip",tools.getProperty(propertyValue).getStringValue());actionPage5.putString( "pyBadgeFormat","Standard (label)");actionPage5.putString( "pyDeferLoad","");propertyValue = ".pxListSubscript";
propertyValue = tools.getParamValue("ApplyToPage")+".pxListSubscript";actionPage5.putString("pySubscript",tools.getProperty(propertyValue).getStringValue());if(testIDWhen || functionalTestingWhen){if(!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue())) {actionPage5.putString("pyAutomationID","201805171944460145438" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue());}else if (!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue())) {actionPage5.putString("pyAutomationID","201805171944460145438" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue());}else {actionPage5.putString( "pyAutomationID","201805171944460145438");}}actionPage5.putString( "pyImage","");if (!hideElement) { 
actionPage5.putString("pyType","Action");
executePage=actionPage5.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
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
if(processAction||("ID1349967078028000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1349967078028000*/

nodePageList = tools.getIfPresent(".pzRuleType");
String strChildListPageRef6 = null;
if (nodePageList != null) {
String actionListParentPage6 = tools.getParamValue("ApplyToPage");	Iterator actionListIter6 = nodePageList.iterator();
	while (actionListIter6.hasNext()) {		iterListResult = (ClipboardProperty)actionListIter6.next();
		childListPage = iterListResult.getPageValue();
		;
		strChildListPageRef6 = childListPage.getReference();
		;
		tools.putParamValue("ApplyToPage", strChildListPageRef6);
		((PegaAPI)tools).pushStackFrame("navigation", null, childListPage, false, false);
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
parentPageRef = actionPage5 != null ? actionPage5.getReference() : "" 
;actionPage6 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage6 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage6.putString("pyHidden",String.valueOf(hideElement));actionPage6.putString("pyDisabled",String.valueOf(disableElement));actionPage6.putString( "pyName","ID1349967078028000");propertyValue = ".pyLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyLabel";actionPage6.putString("pyCaption",tools.getProperty(propertyValue).getStringValue());actionPage6.putString( "pySummary","");actionPage6.putString( "pyBadgeProperty","");propertyValue = ".pyLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyLabel";actionPage6.putString("pyToolTip",tools.getProperty(propertyValue).getStringValue());actionPage6.putString( "pyBadgeFormat","Standard (label)");actionPage6.putString( "pyDeferLoad","");propertyValue = ".pxListSubscript";
propertyValue = tools.getParamValue("ApplyToPage")+".pxListSubscript";actionPage6.putString("pySubscript",tools.getProperty(propertyValue).getStringValue());if(testIDWhen || functionalTestingWhen){if(!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue())) {actionPage6.putString("pyAutomationID","201805171944460120217" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue());}else if (!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue())) {actionPage6.putString("pyAutomationID","201805171944460120217" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue());}else {actionPage6.putString( "pyAutomationID","201805171944460120217");}}actionPage6.putString( "pyImage","");actionPage6.putString("pyType","Action");
executePage=actionPage6.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage6 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","showHarness");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage6.putString( "pyTarget","newDocument");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage6.putString("pyTitle",tools.getProperty(propertyValue).getStringValue());commandPage6.putString( "pyActivityClass","@baseclass");commandPage6.putString( "pyHarnessName","pzViewInstances");commandPage6.putString( "pyReadOnly","No");commandPage6.putString( "pyKey","");commandPage6.putString( "pyActivity","pzLoadViewInstances");commandPage6.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage6.putString( "pyUsingPage","");commandPage6.putString( "pyElementName","");commandPage6.putString( "pyTargetElement","");commandPage6.putString( "pySelectedMobileTransitionType","");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage6.putString("pzPrimaryPage",strPageName);commandPage6.putString( "pyKey","");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage6.getProperty("pyActivityParams").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage6.getProperty("pyActivityParams").getPageValue(1).putString( "pyName","RuleClass");propertyValue = "Declare_RuleTypeMenu.pyClassName";
commandPage6.getProperty("pyActivityParams").getPageValue(2).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage6.getProperty("pyActivityParams").getPageValue(2).putString( "pyName","AppliesToClass");commandPage6.getProperty("pyActivityParams").getPageValue(3).putString( "pyValue","forcerun");commandPage6.getProperty("pyActivityParams").getPageValue(3).putString( "pyName","Action");commandPage6.getProperty("pyActivityParams").getPageValue(4).putString( "pyValue","");commandPage6.getProperty("pyActivityParams").getPageValue(4).putString( "pyName","ShowInstances");propertyValue = ".pyLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyLabel";commandPage6.getProperty("pyActivityParams").getPageValue(5).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage6.getProperty("pyActivityParams").getPageValue(5).putString( "pyName","Label");commandPage6.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage6.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage6.putString( "pyAlwaysRenderFromServer","");executePage.putPage("pyShowHarness",commandPage6);
behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
executePage.putString("pyCommand","showHarness");
}
deferLoad = false;
pyNameSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String deferPagePath = tools.getParamValue("deferPagePath");
if( (StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length) && actionPage5 != null) {
		actionPage5.getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}else{
tools.findPage(deferPagePath).getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}
	}
	tools.putParamValue("ApplyToPage", actionListParentPage6);}
		((PegaAPI)tools).pushStackFrame("navigation", null, stepPage, false, false);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
pyNameSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String deferPagePath = tools.getParamValue("deferPagePath");
if( (StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length) && actionPage4 != null) {
		actionPage4.getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}else{
tools.findPage(deferPagePath).getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}
	}
	tools.putParamValue("ApplyToPage", actionListParentPage5);}
		((PegaAPI)tools).pushStackFrame("navigation", null, stepPage, false, false);
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1349410704229000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1349410704229000*/

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
parentPageRef = actionPage4 != null ? actionPage4.getReference() : "" 
;actionPage9 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage9 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage9.putString("pyHidden",String.valueOf(hideElement));actionPage9.putString("pyDisabled",String.valueOf(disableElement));actionPage9.putString( "pyName","ID1349410704229000");actionPage9.putString( "pyCaption","Instances");actionPage9.putString( "pySummary","");actionPage9.putString( "pyBadgeProperty","");actionPage9.putString( "pyToolTip","Instances");if(testIDWhen || functionalTestingWhen){actionPage9.putString( "pyAutomationID","201805171944460274638");}actionPage9.putString( "pyBadgeFormat","");actionPage9.putString( "pyDeferLoad","");actionPage9.putString( "pyImage","");actionPage9.putString("pyType","Action");
executePage=actionPage9.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage9 = actionPage9.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","showHarness");ClipboardPage commandPage9 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage9.putString( "pyTarget","newDocument");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage9.putString("pyTitle",tools.getProperty(propertyValue).getStringValue());commandPage9.putString( "pyActivityClass","@baseclass");commandPage9.putString( "pyHarnessName","pzViewInstances");commandPage9.putString( "pyReadOnly","No");commandPage9.putString( "pyKey","");commandPage9.putString( "pyActivity","pzLoadViewInstances");commandPage9.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage9.putString( "pyUsingPage","");commandPage9.putString( "pyElementName","");commandPage9.putString( "pyTargetElement","");commandPage9.putString( "pySelectedMobileTransitionType","");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage9.putString("pzPrimaryPage",strPageName);commandPage9.putString( "pyKey","");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage9.getProperty("pyActivityParams").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage9.getProperty("pyActivityParams").getPageValue(1).putString( "pyName","RuleClass");propertyValue = "Declare_RuleTypeMenu.pyClassName";
commandPage9.getProperty("pyActivityParams").getPageValue(2).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage9.getProperty("pyActivityParams").getPageValue(2).putString( "pyName","AppliesToClass");propertyValue = "Declare_RuleTypeMenu.pyViewInstancesClassSelector";
commandPage9.getProperty("pyActivityParams").getPageValue(3).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage9.getProperty("pyActivityParams").getPageValue(3).putString( "pyName","Action");commandPage9.getProperty("pyActivityParams").getPageValue(4).putString( "pyValue","true");commandPage9.getProperty("pyActivityParams").getPageValue(4).putString( "pyName","ShowInstances");commandPage9.getProperty("pyActivityParams").getPageValue(5).putString( "pyValue","Instances");commandPage9.getProperty("pyActivityParams").getPageValue(5).putString( "pyName","Label");commandPage9.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage9.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage9.putString( "pyAlwaysRenderFromServer","");executePage.putPage("pyShowHarness",commandPage9);
behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage9.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
executePage.putString("pyCommand","showHarness");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method11_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1360309560048000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage11";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1360309560048000")){
return;}
if(processShortcut &&"ID1360309560048000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage11= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage11 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage11 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage11.putString("pyHidden",String.valueOf(hideElement));actionPage11.putString("pyDisabled",String.valueOf(disableElement));actionPage11.putString( "pyName","ID1360309560048000");actionPage11.putString( "pyCaption","Definition");actionPage11.putString( "pySummary","");actionPage11.putString( "pyBadgeProperty","");actionPage11.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage11.putString( "pyAutomationID","201805171944460296123");}actionPage11.putString( "pyBadgeFormat","");actionPage11.putString( "pyDeferLoad","");actionPage11.putString( "pyImage","");actionPage11.putString("pyType","Action");
executePage=actionPage11.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
ClipboardPage behaviorPage11 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage11.putString("pyAction","openRuleByClassAndName");ClipboardPage commandPage11 = tools.createPage("Embed-DesktopAPI-OpenRuleByClassAndName","commandType");
propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage11.putString("pyInsName",tools.getProperty(propertyValue).getStringValue());commandPage11.putString( "pyObjClass","Rule-Obj-Class");commandPage11.putString( "pyElementName","");commandPage11.putString( "pyTargetElement","");executePage.putPage("pyOpenRuleByClassAndName",commandPage11);
behaviorPage11.putPage("pyActionAPI",commandPage11);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage11.removeFromClipboard();
executePage.putString("pyCommand","openRuleByClassAndName");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage11);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method12_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1360309560048001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage12";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1360309560048001")){
return;}
if(processShortcut &&"ID1360309560048001".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage12 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage12 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","ID1360309560048001");actionPage12.putString( "pyCaption","Inheritance");actionPage12.putString( "pySummary","");actionPage12.putString( "pyBadgeProperty","");actionPage12.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage12.putString( "pyAutomationID","201805171944460440482");}actionPage12.putString( "pyBadgeFormat","");actionPage12.putString( "pyDeferLoad","");actionPage12.putString( "pyImage","");actionPage12.putString("pyType","Action");
executePage=actionPage12.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage12 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","localAction");ClipboardPage commandPage12 = tools.createPage("Embed-DesktopAPI-OpenModalWindow","commandType");

StringMap commandPage12Map = new HashStringMap();
commandPage12Map.putString("pxObjClass", "Rule-Obj-FlowAction");
commandPage12Map.putString("pyActionName","pzShowInheritanceDialog");
commandPage12Map.putString("pyClassName",tools.getProperty("pxObjClass").getStringValue());
ParameterPage commandPage12ParamPage = new ParameterPage();
commandPage12ParamPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
try{
tools.doAction(commandPage12Map, tools.getStepPage(), commandPage12ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String commandPage12Type = commandPage12ParamPage.getString("StreamType"); commandPage12ParamPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
try{
tools.doAction(commandPage12Map, tools.getStepPage(), commandPage12ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String bcommandPage12HasPrivilege = commandPage12ParamPage.getString("CheckSecurityRetVal"); commandPage12ParamPage.putString("pyFlowActionPurpose", "GETLABEL");
try{
tools.doAction(commandPage12Map, tools.getStepPage(), commandPage12ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
ClipboardPage commandPage12targetAnimation = tools.createPage("","");
 commandPage12targetAnimation.putString("pyLaunch","anim-null");
 commandPage12targetAnimation.putString("pyDismiss","anim-null");
ClipboardPage commandPage12newTargetAnimation = tools.createPage("","");
 commandPage12newTargetAnimation.putString("pyValue","%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22none%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22copyreveal%22%2C%22speed%22%3A%22default%22%7D%7D%7D");
String commandPage12FALabel= commandPage12ParamPage.getString("pzFALabel");
 if(commandPage12Type.equals("")) {commandPage12Type = "Rule-Obj-FlowAction";}if("true".equals(bcommandPage12HasPrivilege )){
commandPage12.putString("pyLocalAction", "pzShowInheritanceDialog");}else {
commandPage12.putString("pyLocalAction", "pyLocalActionPrivilegeError");
commandPage12.putString("pyActionPrivilegeError",tools.getLocalizedTextForString("pyMessageLabel","pzFlowActionAuthorization"));} 
commandPage12.putString("pyStreamType", commandPage12Type);
commandPage12.putString("pyFALabel", commandPage12FALabel);
commandPage12.putString("pyClassName", commandPage12Map.getString("pyClassName"));
commandPage12.putString("pyUsingPage","");
commandPage12.putString("pyModalDialog","");
commandPage12.putString("pyLATarget","overlay");
commandPage12.putString("pyModalFullScreen","true");
commandPage12.putPage("pyAnimations(DesktopReveal)",commandPage12newTargetAnimation);
commandPage12.putString("pyFormatStyle","");
commandPage12.putString("pyCustomTemplateName","");
commandPage12.putString("pyDisableOverlayClickAway","false");
commandPage12.putString("pyShowOverlayInCenter","false");executePage.putPage("pyOpenModalWindow",commandPage12);
behaviorPage12.putPage("pyActionAPI",commandPage12);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
executePage.putString("pyCommand","localAction");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage12);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzExplorerMenu" */

private void method13_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String actionPageParent="actionPage13";
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage13 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage13 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage13.putString("pyHidden",String.valueOf(hideElement));actionPage13.putString("pyDisabled",String.valueOf(disableElement));actionPage13.putString( "pyName","");actionPage13.putString( "pyCaption","------------------");actionPage13.putString( "pySummary","");actionPage13.putString( "pyBadgeProperty","");actionPage13.putString( "pyToolTip","");actionPage13.putString( "pyBadgeFormat","");actionPage13.putString( "pyDeferLoad","");actionPage13.putString( "pyImage","");actionPage13.putString("pyType","Separator");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage13);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method14_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1353014514966000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage14";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1353014514966000")){
return;}
if(processShortcut &&"ID1353014514966000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage14 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage14 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage14.putString("pyHidden",String.valueOf(hideElement));actionPage14.putString("pyDisabled",String.valueOf(disableElement));actionPage14.putString( "pyName","ID1353014514966000");actionPage14.putString( "pyCaption","View in data designer");actionPage14.putString( "pySummary","");actionPage14.putString( "pyBadgeProperty","");actionPage14.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage14.putString( "pyAutomationID","20180517194446048374");}actionPage14.putString( "pyBadgeFormat","Standard (label)");actionPage14.putString( "pyDeferLoad","false");actionPage14.putString( "pyImage","");actionPage14.putString("pyType","Action");
executePage=actionPage14.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage14 = actionPage14.getPage("pyBehaviors(<append>)");
behaviorPage14.putString("pyAction","openLanding");ClipboardPage commandPage14 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage14.putString( "pyAction","Display");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage14.putString("pyName",tools.getProperty(propertyValue).getStringValue());commandPage14.putString( "pyClassName","Rule-Obj-Class");commandPage14.putString( "pyLevelA","");commandPage14.putString( "pyLevelB","");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage14.putString("pyLevelC",tools.getProperty(propertyValue).getStringValue());commandPage14.putString( "pyElementName","");commandPage14.putString( "pyTargetElement","");commandPage14.putString( "pyIsTargetMicroDC","false");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzDataTypeOverview");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage14.getProperty("pyDisplay").getPageValue().putString( "pyModel","pzInitializeDataType");executePage.putPage("pyOpenLanding",commandPage14);
behaviorPage14.putPage("pyActionAPI",commandPage14);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage14.getPage("pyBehaviors(<LAST>)")).register();
commandPage14.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage14);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method15_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1527651566661000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage15";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1527651566661000")){
return;}
if(processShortcut &&"ID1527651566661000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage15 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage15 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage15.putString("pyHidden",String.valueOf(hideElement));actionPage15.putString("pyDisabled",String.valueOf(disableElement));actionPage15.putString( "pyName","ID1527651566661000");actionPage15.putString( "pyCaption","Manage relevant records");actionPage15.putString( "pySummary","");actionPage15.putString( "pyBadgeProperty","");actionPage15.putString( "pyToolTip","Manage relevant records");if(testIDWhen || functionalTestingWhen){actionPage15.putString( "pyAutomationID","201805292339260596258");}actionPage15.putString( "pyBadgeFormat","Standard (label)");actionPage15.putString( "pyDeferLoad","false");actionPage15.putString( "pyImage","");actionPage15.putString("pyType","Action");
executePage=actionPage15.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage15 = actionPage15.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","openLanding");ClipboardPage commandPage15 = tools.createPage("Embed-DesktopAPI-OpenLanding","commandType");
commandPage15.putString( "pyAction","Display");commandPage15.putString( "pyName","Application: Inventory");commandPage15.putString( "pyClassName","Pega-Landing-Application");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage15.putString("pyLevelA",tools.getProperty(propertyValue).getStringValue());commandPage15.putString( "pyLevelB","");commandPage15.putString( "pyLevelC","RelevantRecords");commandPage15.putString( "pyElementName","");commandPage15.putString( "pyTargetElement","");commandPage15.putString( "pyIsTargetMicroDC","false");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage15.getProperty("pyParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage15.getProperty("pyParameters").getPageValue(1).putString( "pyName","LPContextClass");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyHarnessName","pzLPApplicationInventory");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyPage","");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyReadOnly","false");commandPage15.getProperty("pyDisplay").getPageValue().putString( "pyModel","pzSetRevRecordClassValid");executePage.putPage("pyOpenLanding",commandPage15);
behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage15.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
executePage.putString("pyCommand","openLanding");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage15);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method16_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1355330400728000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage16";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1355330400728000")){
return;}
if(processShortcut &&"ID1355330400728000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage16 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage16 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage16.putString("pyHidden",String.valueOf(hideElement));actionPage16.putString("pyDisabled",String.valueOf(disableElement));actionPage16.putString( "pyName","ID1355330400728000");actionPage16.putString( "pyCaption","Refactor");actionPage16.putString( "pySummary","");actionPage16.putString( "pyBadgeProperty","");actionPage16.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage16.putString( "pyAutomationID","201805171944460602236");}actionPage16.putString( "pyBadgeFormat","");actionPage16.putString( "pyDeferLoad","");actionPage16.putString( "pyImage","");actionPage16.putString("pyType","Action");
executePage=actionPage16.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage16);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1355330400728000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1354219634952000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1354219634952000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage17= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage16 != null ? actionPage16.getReference() : "" 
;actionPage17 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage17 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage17.putString("pyHidden",String.valueOf(hideElement));actionPage17.putString("pyDisabled",String.valueOf(disableElement));actionPage17.putString( "pyName","ID1354219634952000");actionPage17.putString( "pyCaption","Rename class");actionPage17.putString( "pySummary","");actionPage17.putString( "pyBadgeProperty","");actionPage17.putString( "pyToolTip","Rename class");if(testIDWhen || functionalTestingWhen){actionPage17.putString( "pyAutomationID","2018051719444605329");}actionPage17.putString( "pyBadgeFormat","Standard (label)");actionPage17.putString( "pyDeferLoad","");actionPage17.putString( "pyImage","");actionPage17.putString("pyType","Action");
executePage=actionPage17.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage17 = actionPage17.getPage("pyBehaviors(<append>)");
behaviorPage17.putString("pyAction","createWork");ClipboardPage commandPage17 = tools.createPage("Embed-DesktopAPI-CreateNewWork","commandType");
commandPage17.putString( "pyClassName","PegaAccel-Management-Refactor-Class");commandPage17.putString( "pyFlowName","RefactorClass");commandPage17.putString( "pyElementName","");commandPage17.putString( "pyTargetElement","");commandPage17.putString( "pyIsTargetMicroDC","");commandPage17.putString( "pyACName","");commandPage17.putString( "pySelectedMobileTransitionType","");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage17.getProperty("pyFlowParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage17.getProperty("pyFlowParameters").getPageValue(1).putString( "pyName","ClassToRename");commandPage17.getProperty("pyFlowParameters").getPageValue(1).putString( "pxObjClass","Embed-MethodParams");executePage.putPage("pyCreateNewWork",commandPage17);
behaviorPage17.putPage("pyActionAPI",commandPage17);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage17.getPage("pyBehaviors(<LAST>)")).register();
commandPage17.removeFromClipboard();
executePage.putString("pyCommand","createWork");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1354219634952001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1354219634952001*/

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
parentPageRef = actionPage16 != null ? actionPage16.getReference() : "" 
;actionPage19 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage19 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage19.putString("pyHidden",String.valueOf(hideElement));actionPage19.putString("pyDisabled",String.valueOf(disableElement));actionPage19.putString( "pyName","ID1354219634952001");actionPage19.putString( "pyCaption","Move rules");actionPage19.putString( "pySummary","");actionPage19.putString( "pyBadgeProperty","");actionPage19.putString( "pyToolTip","Move rules");if(testIDWhen || functionalTestingWhen){actionPage19.putString( "pyAutomationID","201805171944460586755");}actionPage19.putString( "pyBadgeFormat","");actionPage19.putString( "pyDeferLoad","");actionPage19.putString( "pyImage","");actionPage19.putString("pyType","Action");
executePage=actionPage19.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage19 = actionPage19.getPage("pyBehaviors(<append>)");
behaviorPage19.putString("pyAction","showHarness");ClipboardPage commandPage19 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage19.putString( "pyTarget","newDocument");commandPage19.putString( "pyTitle","Move Rules");commandPage19.putString( "pyActivityClass","Data-Rule-Summary");commandPage19.putString( "pyHarnessName","RuletypesForClass");commandPage19.putString( "pyReadOnly","No");commandPage19.putString( "pyKey","");commandPage19.putString( "pyActivity","");commandPage19.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","pzPrepareMoveWizard");commandPage19.putString( "pyUsingPage","");commandPage19.putString( "pyElementName","");commandPage19.putString( "pyTargetElement","");commandPage19.putString( "pySelectedMobileTransitionType","");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage19.putString("pzPrimaryPage",strPageName);commandPage19.putString( "pyKey","");propertyValue = ".pyClassName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyClassName";commandPage19.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage19.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","classNameParam");commandPage19.putString( "pyAlwaysRenderFromServer","");executePage.putPage("pyShowHarness",commandPage19);
behaviorPage19.putPage("pyActionAPI",commandPage19);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage19.getPage("pyBehaviors(<LAST>)")).register();
commandPage19.removeFromClipboard();
executePage.putString("pyCommand","showHarness");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzExplorerMenu" */

private void method21_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String actionPageParent="actionPage21";
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
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage21= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage21 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage21 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage21.putString("pyHidden",String.valueOf(hideElement));actionPage21.putString("pyDisabled",String.valueOf(disableElement));actionPage21.putString( "pyName","");actionPage21.putString( "pyCaption","------------------");actionPage21.putString( "pySummary","");actionPage21.putString( "pyBadgeProperty","");actionPage21.putString( "pyToolTip","");actionPage21.putString( "pyBadgeFormat","");actionPage21.putString( "pyDeferLoad","");actionPage21.putString( "pyImage","");actionPage21.putString("pyType","Separator");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage21);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method22_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1357308928505000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage22";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1357308928505000")){
return;}
if(processShortcut &&"ID1357308928505000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage22 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage22 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage22.putString("pyHidden",String.valueOf(hideElement));actionPage22.putString("pyDisabled",String.valueOf(disableElement));actionPage22.putString( "pyName","ID1357308928505000");propertyValue = ".pyRefreshLabel";
propertyValue = tools.getParamValue("ApplyToPage")+".pyRefreshLabel";actionPage22.putString("pyCaption",tools.getProperty(propertyValue).getStringValue());actionPage22.putString( "pySummary","");actionPage22.putString( "pyBadgeProperty","");actionPage22.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage22.putString( "pyAutomationID","201805171944460617322");}actionPage22.putString( "pyBadgeFormat","");actionPage22.putString( "pyDeferLoad","");actionPage22.putString( "pyImage","");actionPage22.putString("pyType","Action");
executePage=actionPage22.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage22 = actionPage22.getPage("pyBehaviors(<append>)");
behaviorPage22.putString("pyAction","runActivity");ClipboardPage commandPage22 = tools.createPage("Embed-SelectedContextAPI-RunActivity","commandType");
commandPage22.putString( "pyActivity","pzRefreshAppExplorerClass");commandPage22.putString( "pyUsingPage", tools.getStepPage().getReference());commandPage22.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage22.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage22.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");executePage.putPage("pyRunActivity",commandPage22);
behaviorPage22.putPage("pyActionAPI",commandPage22);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage22.getPage("pyBehaviors(<LAST>)")).register();
commandPage22.removeFromClipboard();
ClipboardPage behaviorPage23 = actionPage22.getPage("pyBehaviors(<append>)");
behaviorPage23.putString("pyAction","refresh");ClipboardPage commandPage23 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage23.putString( "pyTarget","thisSection");commandPage23.putString( "pyUsingPage","");commandPage23.putString( "pyActivity","");commandPage23.putString( "pySection","");commandPage23.putString( "pyDisableSubmit","false");commandPage23.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage23.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage23.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage23.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage23.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage23.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");behaviorPage23.putPage("pyActionAPI",commandPage23);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage22.getPage("pyBehaviors(<LAST>)")).register();
commandPage23.removeFromClipboard();
executePage.putString("pyCommand","runActivity");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage22);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzExplorerMenu" */

private void method24_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1357566500488000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage24";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1357566500488000")){
return;}
if(processShortcut &&"ID1357566500488000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage24 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage24 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage24.putString("pyHidden",String.valueOf(hideElement));actionPage24.putString("pyDisabled",String.valueOf(disableElement));actionPage24.putString( "pyName","ID1357566500488000");actionPage24.putString( "pyCaption","Refresh all");actionPage24.putString( "pySummary","");actionPage24.putString( "pyBadgeProperty","");actionPage24.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage24.putString( "pyAutomationID","201805171944460636425");}actionPage24.putString( "pyBadgeFormat","");actionPage24.putString( "pyDeferLoad","");actionPage24.putString( "pyImage","");actionPage24.putString("pyType","Action");
executePage=actionPage24.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage24 = actionPage24.getPage("pyBehaviors(<append>)");
behaviorPage24.putString("pyAction","refresh");ClipboardPage commandPage24 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage24.putString( "pyTarget","otherSection");commandPage24.putString( "pyUsingPage","");commandPage24.putString( "pyActivity","pzLoadAppExplorerData");commandPage24.putString( "pySection","pzAppExplorerInclude");commandPage24.putString( "pyDisableSubmit","false");commandPage24.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","pzDeletePinnedClassesDataPage");commandPage24.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage24.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage24.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage24.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage24.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");executePage.putPage("pyRefresh",commandPage24);
behaviorPage24.putPage("pyActionAPI",commandPage24);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage24.getPage("pyBehaviors(<LAST>)")).register();
commandPage24.removeFromClipboard();
executePage.putString("pyCommand","refresh");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage24);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION EMBED-EXPLORERNODE-CLASS PZEXPLORERMENU #20180713T135314.563 GMT", "Embed-ExplorerNode-Class pzExplorerMenu", "Pega-Desktop", "08-01-01", "20180730T130712.844 GMT");
}
