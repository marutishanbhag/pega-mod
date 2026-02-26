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
public class ra_action_pzruleformtoolbaractionsmenu_9b0d1f2d4e2418b9f666dfcdc402e5b1  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzRuleFormToolbarActionsMenu._baseclass.Action");
	public ra_action_pzruleformtoolbaractionsmenu_9b0d1f2d4e2418b9f666dfcdc402e5b1(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION @BASECLASS PZRULEFORMTOOLBARACTIONSMENU #20230618T003139.647 GMT	Pega-Desktop:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzRuleFormToolbarActionsMenu"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzRuleFormToolbarActionsMenu");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method2_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method3_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method4_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method6_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method7_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method8_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method9_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method10_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method11_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method12_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method14_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method15_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSSETVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSRUNDATATRANSFORM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZRULEFORMTOOLBARACTIONSMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSSETVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSSETVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSRUNDATATRANSFORM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSRUNDATATRANSFORM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZRULEFORMTOOLBARACTIONSMENU","Rule-Navigation","@BASECLASS",false,"","Pega-Desktop","08-23-01","RULE-NAVIGATION @BASECLASS PZRULEFORMTOOLBARACTIONSMENU #20230618T003139.647 GMT","!PZRULEFORMTOOLBARACTIONSMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-974832321)
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
//	RULE-NAVIGATION @BASECLASS PZRULEFORMTOOLBARACTIONSMENU #20230618T003139.647 GMT:20230618T003139.647 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
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
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCONTEXTREFRESH #20180713T133341.611 GMT:20180713T133341.611 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCUSTOM #20180713T133341.621 GMT:20180713T133341.621 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENMODALWINDOW #20190423T162450.106 GMT:20190423T162450.106 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243 #20181120T072650.970 GMT:20181120T072650.970 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSRUNDATATRANSFORM #20180713T133342.800 GMT:20180713T133342.800 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSSETVALUE #20180713T133342.823 GMT:20180713T133342.823 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZNAVIGATION PZISREFERENCE #20180713T133347.956 GMT:20180713T133347.956 GMT
//	RULE-UTILITY-FUNCTION STRING ISDOUBLE #20180713T131441.648 GMT:20180713T131441.648 GMT
//	RULE-UTILITY-FUNCTION STRING ISINTEGER #20180713T131441.652 GMT:20180713T131441.652 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "93601fffce8605db6ba2a5bcc1f4a1c5";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

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
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzRuleFormToolbarShowRun",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("@baseclass","pzRuleFormToolbarRunMenu",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method2_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1360598066751000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage2";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1360598066751000")){
return;}
if(processShortcut &&"ID1360598066751000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage2 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage2 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowPreview";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("Always",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","ID1360598066751000");actionPage2.putString( "pyImageSource","styleclass");actionPage2.putString( "pyIconStyle","hotkey-ruleform-preview");actionPage2.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Preview"));actionPage2.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage2.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage2.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Preview"));if(testIDWhen || functionalTestingWhen){actionPage2.putString( "pyAutomationID","201710260330210129899");}actionPage2.putString( "pyBadgeFormat","Standard (label)");actionPage2.putString( "pyDeferLoad","false");actionPage2.putString( "pyImage","hotkey-ruleform-preview");if (!hideElement) { 
actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage2 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","openUrlInWindow");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-OpenURLInWindow","commandType");
propertyValue = ".pyStreamName";
propertyValue = tools.getParamValue("ApplyToPage")+".pyStreamName";commandPage2.putString("pyWindowName",tools.getProperty(propertyValue).getStringValue());commandPage2.putString( "pyOptions","height=600,width=700,location=0,menubar=0,toolbar=0,status=1,resizable=1,location=0,scrollbars=1");commandPage2.putString( "pyReplace","false");commandPage2.putString( "pyUseAlternateUrlBase","false");commandPage2.putString( "pyNoEncodingUrl","");commandPage2.putString( "pyUrl",tools.findPage("pxThread").getString("pxReqURI"));commandPage2 .putString( "pyActivity", tools.getProperty(".pxObjClass").getStringValue() + ".Visualize");
 propertyValue = ".pzInsKey";
propertyValue = tools.getParamValue("ApplyToPage")+".pzInsKey";commandPage2.getProperty("pyQueryString").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage2.getProperty("pyQueryString").getPageValue(1).putString( "pyName","insHandle");commandPage2.getProperty("pyQueryString").getPageValue(2).putString( "pyValue","PREVIEW");commandPage2.getProperty("pyQueryString").getPageValue(2).putString( "pyName","category");String strPrimaryPageName = tools.getParamValue("pzPrimaryPageName");
if(strPrimaryPageName !=null && !"".equals(strPrimaryPageName) ) {
commandPage2.getProperty("pyQueryString").getPageValue(3).putString("pyValue",strPrimaryPageName);
commandPage2.getProperty("pyQueryString").getPageValue(3).putString("pyName","pzPrimaryPageName");
} else {
commandPage2.getProperty("pyQueryString").getPageValue(3).putString("pyValue", tools.getStepPage().getReference() );
commandPage2.getProperty("pyQueryString").getPageValue(3).putString("pyName","pzPrimaryPageName");
}
executePage.putPage("pyOpenUrlInWindow",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
executePage.putString("pyCommand","openUrlInWindow");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage2);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method3_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1360598066751001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage3";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1360598066751001")){
return;}
if(processShortcut &&"ID1360598066751001".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage3 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage3 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowTraceOpenRule";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage3.putString("pyHidden",String.valueOf(hideElement));actionPage3.putString("pyDisabled",String.valueOf(disableElement));actionPage3.putString( "pyName","ID1360598066751001");actionPage3.putString( "pyImageSource","styleclass");actionPage3.putString( "pyIconStyle","hotkey-ruleform-tracer");actionPage3.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Trace"));actionPage3.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage3.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage3.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage3.putString( "pyAutomationID","201710260330210348732");}actionPage3.putString( "pyBadgeFormat","Standard (label)");actionPage3.putString( "pyDeferLoad","false");actionPage3.putString( "pyImage","hotkey-ruleform-tracer");if (!hideElement) { 
actionPage3.putString("pyType","Action");
executePage=actionPage3.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage3 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","openUrlInWindow");ClipboardPage commandPage3 = tools.createPage("Embed-DesktopAPI-OpenURLInWindow","commandType");
commandPage3.putString( "pyWindowName","");commandPage3.putString( "pyOptions","height=650,width=990,location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=0");commandPage3.putString( "pyReplace","false");commandPage3.putString( "pyUseAlternateUrlBase","false");commandPage3.putString( "pyNoEncodingUrl","false");commandPage3.putString( "pyUrl",tools.findPage("pxThread").getString("pxReqURI"));commandPage3 .putString( "pyActivity", tools.getProperty(".pxObjClass").getStringValue() + ".pzTraceOpenRule");
 propertyValue = ".pzInsKey";
propertyValue = tools.getParamValue("ApplyToPage")+".pzInsKey";commandPage3.getProperty("pyQueryString").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage3.getProperty("pyQueryString").getPageValue(1).putString( "pyName","insKey");propertyValue = ".pxObjClass";
propertyValue = tools.getParamValue("ApplyToPage")+".pxObjClass";commandPage3.getProperty("pyQueryString").getPageValue(2).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage3.getProperty("pyQueryString").getPageValue(2).putString( "pyName","className");propertyValue = "pxRequestor.pxClientConnection";
commandPage3.getProperty("pyQueryString").getPageValue(3).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage3.getProperty("pyQueryString").getPageValue(3).putString( "pyName","ConnectionID");propertyValue = "pxProcess.pxSystemNodeID";
commandPage3.getProperty("pyQueryString").getPageValue(4).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage3.getProperty("pyQueryString").getPageValue(4).putString( "pyName","NodeID");executePage.putPage("pyOpenUrlInWindow",commandPage3);
behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
executePage.putString("pyCommand","openUrlInWindow");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage3);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method4_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1366312798449000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1366312798449000")){
return;}
if(processShortcut &&"ID1366312798449000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
showWhenCondition = true;
String whenResolved ="pzShowRefresh";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage4.putString("pyHidden",String.valueOf(hideElement));actionPage4.putString("pyDisabled",String.valueOf(disableElement));actionPage4.putString( "pyName","ID1366312798449000");actionPage4.putString( "pyImageSource","styleclass");actionPage4.putString( "pyIconStyle","hotkey-ruleform-refresh");actionPage4.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Refresh"));actionPage4.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage4.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage4.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage4.putString( "pyAutomationID","201710260330210375480");}actionPage4.putString( "pyBadgeFormat","Standard (label)");actionPage4.putString( "pyDeferLoad","false");actionPage4.putString( "pyImage","hotkey-ruleform-refresh");if (!hideElement) { 
actionPage4.putString("pyType","Action");
executePage=actionPage4.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage4 = actionPage4.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","runScript");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyValue","REFRESH");commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage4.putString( "pyFunctionName","onBeforeExecuteActionWrapper");executePage.putPage("pyCustom",commandPage4);
behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage4.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
ClipboardPage behaviorPage5 = actionPage4.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","refresh");ClipboardPage commandPage5 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage5.putString( "pyTarget","currentharness");commandPage5.putString( "pyUsingPage","");commandPage5.putString( "pyActivity","pzRuleFormToolbarRefresh");commandPage5.putString( "pySection","");commandPage5.putString( "pyDisableSubmit","false");commandPage5.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage4.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage4);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method6_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String actionPageParent="actionPage6";
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
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzHighlightRuleSearchEnabled",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("@baseclass","pzRuleFormToolbarSearchRule",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method7_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String actionPageParent="actionPage7";
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
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyDisplayAvailabilityInActions",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("@baseclass","pzRuleFormToolbarAvailabilityActions",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method8_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String actionPageParent="actionPage8";
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
ClipboardPage actionPage8= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage8 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage8 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsAudienceSimulationSupported";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage8.putString("pyHidden",String.valueOf(hideElement));actionPage8.putString("pyDisabled",String.valueOf(disableElement));actionPage8.putString( "pyName","");actionPage8.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage8.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage8.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage8.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage8.putString( "pyBadgeFormat","Standard (label)");actionPage8.putString( "pyDeferLoad","false");actionPage8.putString( "pyImage","");if (!hideElement) { 
actionPage8.putString("pyType","Separator");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage8);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method9_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String actionPageParent="actionPage9";
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
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyIsAudienceSimulationSupported",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("@baseclass","pzRuleFormToolbarSimulationsMenu",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method10_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String actionPageParent="actionPage10";
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
ClipboardPage actionPage10= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage10 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage10 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzRuleFormToolbarShowFavoritesSeparator";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage10.putString("pyHidden",String.valueOf(hideElement));actionPage10.putString("pyDisabled",String.valueOf(disableElement));actionPage10.putString( "pyName","");actionPage10.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage10.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage10.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage10.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage10.putString( "pyBadgeFormat","");actionPage10.putString( "pyDeferLoad","");actionPage10.putString( "pyImage","");if (!hideElement) { 
actionPage10.putString("pyType","Separator");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage10);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method11_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1421226647340000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1421226647340000")){
return;}
if(processShortcut &&"ID1421226647340000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
showWhenCondition = true;
String whenResolved ="pzEnableDelegate";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage11.putString("pyHidden",String.valueOf(hideElement));actionPage11.putString("pyDisabled",String.valueOf(disableElement));actionPage11.putString( "pyName","ID1421226647340000");actionPage11.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Delegate"));actionPage11.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage11.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage11.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Delegate this item"));if(testIDWhen || functionalTestingWhen){actionPage11.putString( "pyAutomationID","201710260330210476296");}actionPage11.putString( "pyBadgeFormat","Standard (label)");actionPage11.putString( "pyDeferLoad","false");actionPage11.putString( "pyImage","");if (!hideElement) { 
actionPage11.putString("pyType","Action");
executePage=actionPage11.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage11 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage11.putString("pyAction","localAction");ClipboardPage commandPage11 = tools.createPage("Embed-DesktopAPI-OpenModalWindow","commandType");

StringMap commandPage11Map = new HashStringMap();
commandPage11Map.putString("pxObjClass", "Rule-Obj-FlowAction");
commandPage11Map.putString("pyActionName","pzMyDelegates");
commandPage11Map.putString("pyClassName",tools.getProperty("pxObjClass").getStringValue());
ParameterPage commandPage11ParamPage = new ParameterPage();
commandPage11ParamPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
try{
tools.doAction(commandPage11Map, tools.getStepPage(), commandPage11ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String commandPage11Type = commandPage11ParamPage.getString("StreamType"); commandPage11ParamPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
try{
tools.doAction(commandPage11Map, tools.getStepPage(), commandPage11ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String bcommandPage11HasPrivilege = commandPage11ParamPage.getString("CheckSecurityRetVal"); commandPage11ParamPage.putString("pyFlowActionPurpose", "GETLABEL");
try{
tools.doAction(commandPage11Map, tools.getStepPage(), commandPage11ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
ClipboardPage commandPage11targetAnimation = tools.createPage("","");
 commandPage11targetAnimation.putString("pyLaunch","anim-null");
 commandPage11targetAnimation.putString("pyDismiss","anim-null");
ClipboardPage commandPage11newTargetAnimation = tools.createPage("","");
 commandPage11newTargetAnimation.putString("pyValue","%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22none%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D");
String commandPage11FALabel= commandPage11ParamPage.getString("pzFALabel");
 if(commandPage11Type.equals("")) {commandPage11Type = "Rule-Obj-FlowAction";}if("true".equals(bcommandPage11HasPrivilege )){
commandPage11.putString("pyLocalAction", "pzMyDelegates");}else {
commandPage11.putString("pyLocalAction", "pyLocalActionPrivilegeError");
commandPage11.putString("pyActionPrivilegeError",tools.getLocalizedTextForString("pyMessageLabel","pzFlowActionAuthorization"));} 
commandPage11.putString("pyStreamType", commandPage11Type);
commandPage11.putString("pyFALabel", commandPage11FALabel);
commandPage11.putString("pyClassName", commandPage11Map.getString("pyClassName"));
commandPage11.putString("pyUsingPage","");
commandPage11.putString("pyModalDialog","");
commandPage11.putString("pyLATarget","true");
commandPage11.putString("pyModalFullScreen","true");
commandPage11.putPage("pyAnimations(DesktopReveal)",commandPage11newTargetAnimation);
commandPage11.putString("pyFormatStyle","");
commandPage11.putString("pyCustomTemplateName","pzDelegationModalTemplate");
commandPage11.putString("pyDisableOverlayClickAway","false");
commandPage11.putString("pyShowOverlayInCenter","false");executePage.putPage("pyOpenModalWindow",commandPage11);
behaviorPage11.putPage("pyActionAPI",commandPage11);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage11.removeFromClipboard();
executePage.putString("pyCommand","localAction");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage11);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method12_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1360598066752000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1360598066752000")){
return;}
if(processShortcut &&"ID1360598066752000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
showWhenCondition = true;
String whenResolved ="pzRuleFormToolbarShowFavorites";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzRuleFormToolbarShowFavorites",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","ID1360598066752000");actionPage12.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Add to favorites"));actionPage12.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage12.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage12.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage12.putString( "pyAutomationID","201710260330210568965");}actionPage12.putString( "pyBadgeFormat","Standard (label)");actionPage12.putString( "pyDeferLoad","false");actionPage12.putString( "pyImage","");if (!hideElement) { 
actionPage12.putString("pyType","Action");
executePage=actionPage12.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage12 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","runDataTransform");ClipboardPage commandPage12 = tools.createPage("Embed-SelectedContextAPI-RunDataTransform","commandType");
commandPage12.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","pzMyFavoritesPreLoad");commandPage12.putString( "pyUsingPage", tools.getStepPage().getReference());commandPage12.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage12.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","hasPrivilege");executePage.putPage("pyRunDataTransform",commandPage12);
behaviorPage12.putPage("pyActionAPI",commandPage12);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
ClipboardPage behaviorPage13 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage13.putString("pyAction","localAction");ClipboardPage commandPage13 = tools.createPage("Embed-DesktopAPI-OpenModalWindow","commandType");

StringMap commandPage13Map = new HashStringMap();
commandPage13Map.putString("pxObjClass", "Rule-Obj-FlowAction");
commandPage13Map.putString("pyActionName","pzMyFavorites");
commandPage13Map.putString("pyClassName", "@baseclass");
ParameterPage commandPage13ParamPage = new ParameterPage();
commandPage13ParamPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
try{
tools.doAction(commandPage13Map, tools.getStepPage(), commandPage13ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String commandPage13Type = commandPage13ParamPage.getString("StreamType"); commandPage13ParamPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
try{
tools.doAction(commandPage13Map, tools.getStepPage(), commandPage13ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String bcommandPage13HasPrivilege = commandPage13ParamPage.getString("CheckSecurityRetVal"); commandPage13ParamPage.putString("pyFlowActionPurpose", "GETLABEL");
try{
tools.doAction(commandPage13Map, tools.getStepPage(), commandPage13ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
ClipboardPage commandPage13targetAnimation = tools.createPage("","");
 commandPage13targetAnimation.putString("pyLaunch","anim-null");
 commandPage13targetAnimation.putString("pyDismiss","anim-null");
ClipboardPage commandPage13newTargetAnimation = tools.createPage("","");
 commandPage13newTargetAnimation.putString("pyValue","%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22none%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D");
String commandPage13FALabel= commandPage13ParamPage.getString("pzFALabel");
 if(commandPage13Type.equals("")) {commandPage13Type = "Rule-Obj-FlowAction";}if("true".equals(bcommandPage13HasPrivilege )){
commandPage13.putString("pyLocalAction", "pzMyFavorites");}else {
commandPage13.putString("pyLocalAction", "pyLocalActionPrivilegeError");
commandPage13.putString("pyActionPrivilegeError",tools.getLocalizedTextForString("pyMessageLabel","pzFlowActionAuthorization"));} 
commandPage13.putString("pyStreamType", commandPage13Type);
commandPage13.putString("pyFALabel", commandPage13FALabel);
commandPage13.putString("pyClassName", commandPage13Map.getString("pyClassName"));
commandPage13.putString("pyUsingPage","FavoriteDetails");
commandPage13.putString("pyModalDialog","");
commandPage13.putString("pyLATarget","overlay");
commandPage13.putString("pyModalFullScreen","true");
commandPage13.putPage("pyAnimations(DesktopReveal)",commandPage13newTargetAnimation);
commandPage13.putString("pyFormatStyle","");
commandPage13.putString("pyCustomTemplateName","");
commandPage13.putString("pyDisableOverlayClickAway","false");
commandPage13.putString("pyShowOverlayInCenter","false");behaviorPage13.putPage("pyActionAPI",commandPage13);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage13.removeFromClipboard();
executePage.putString("pyCommand","runDataTransform");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage12);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method14_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
showWhenCondition = true;
String whenResolved ="pzRuleFormToolbarShowReleaseLock";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
showHavePrivilege = true;
showHavePrivilege = tools.getThread().getAuthorization().havePrivilege(tools.getThread(),"OpenDeveloperForm","",stepPage);
if(!hideElement) {hideElement = !showHavePrivilege;}
if (!hideElement) {
}
actionPage14.putString("pyHidden",String.valueOf(hideElement));actionPage14.putString("pyDisabled",String.valueOf(disableElement));actionPage14.putString( "pyName","");actionPage14.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage14.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage14.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage14.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage14.putString( "pyBadgeFormat","");actionPage14.putString( "pyDeferLoad","");actionPage14.putString( "pyImage","");if (!hideElement) { 
actionPage14.putString("pyType","Separator");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage14);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRuleFormToolbarActionsMenu" */

private void method15_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1366036846910000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1366036846910000")){
return;}
if(processShortcut &&"ID1366036846910000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
showWhenCondition = true;
String whenResolved ="pzRuleFormToolbarShowReleaseLock";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
showHavePrivilege = true;
showHavePrivilege = tools.getThread().getAuthorization().havePrivilege(tools.getThread(),"OpenDeveloperForm","",stepPage);
if(!hideElement) {hideElement = !showHavePrivilege;}
if (!hideElement) {
}
actionPage15.putString("pyHidden",String.valueOf(hideElement));actionPage15.putString("pyDisabled",String.valueOf(disableElement));actionPage15.putString( "pyName","ID1366036846910000");actionPage15.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Release lock"));actionPage15.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage15.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage15.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage15.putString( "pyAutomationID","201710260330210620368");}actionPage15.putString( "pyBadgeFormat","");actionPage15.putString( "pyDeferLoad","");actionPage15.putString( "pyImage","");if (!hideElement) { 
actionPage15.putString("pyType","Action");
executePage=actionPage15.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage15 = actionPage15.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","setValue");ClipboardPage commandPage15 = tools.createPage("Embed-SelectedContextAPI-SetValue","commandType");

			String nameRef15index1 = tools.getProperty(".pyRMAction.pyAction").getReference();
	ClipboardPage pyNameValuePairs_commandPage15_1 = commandPage15.getProperty("pyNameValuePairs").getPageValue(ClipboardProperty.LIST_APPEND);
	pyNameValuePairs_commandPage15_1.putString("pyName", ".pyRMAction.pyAction");
	pyNameValuePairs_commandPage15_1.putString("pyDestValue", "unlock");
	pyNameValuePairs_commandPage15_1.putString("pyValue", "[\""+ nameRef15index1.substring(nameRef15index1.indexOf(".")) + "\",\"" + nameRef15index1.substring(0, nameRef15index1.indexOf(".")) + "\",\"\",\"\",\"unlock\"]");executePage.putPage("pySetValue",commandPage15);
behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage15.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
ClipboardPage behaviorPage16 = actionPage15.getPage("pyBehaviors(<append>)");
behaviorPage16.putString("pyAction","refresh");ClipboardPage commandPage16 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage16.putString( "pyTarget","currentharness");commandPage16.putString( "pyUsingPage","");commandPage16.putString( "pyActivity","ProcessRMAction");commandPage16.putString( "pySection","");commandPage16.putString( "pyDisableSubmit","false");commandPage16.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage16.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","InsKeyHandle");commandPage16.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(2).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(2).putString( "pyName","UpdateDateTime");commandPage16.getProperty("pyActivityParameters").getPageValue(2).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(3).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(3).putString( "pyName","InMemo");commandPage16.getProperty("pyActivityParameters").getPageValue(3).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(4).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(4).putString( "pyName","SkipPreCheckIn");commandPage16.getProperty("pyActivityParameters").getPageValue(4).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(5).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(5).putString( "pyName","ReturnValue");commandPage16.getProperty("pyActivityParameters").getPageValue(5).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(6).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(6).putString( "pyName","InsKey");commandPage16.getProperty("pyActivityParameters").getPageValue(6).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(7).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(7).putString( "pyName","InstanceLockedKey");commandPage16.getProperty("pyActivityParameters").getPageValue(7).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(8).putString( "pyValue","");commandPage16.getProperty("pyActivityParameters").getPageValue(8).putString( "pyName","openHandle");commandPage16.getProperty("pyActivityParameters").getPageValue(8).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getProperty("pyActivityParameters").getPageValue(9).putString( "pyValue","unlock");commandPage16.getProperty("pyActivityParameters").getPageValue(9).putString( "pyName","action");commandPage16.getProperty("pyActivityParameters").getPageValue(9).putString( "pxObjClass","Embed-NameValuePair");commandPage16.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage16.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");behaviorPage16.putPage("pyActionAPI",commandPage16);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage15.getPage("pyBehaviors(<LAST>)")).register();
commandPage16.removeFromClipboard();
executePage.putString("pyCommand","setValue");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage15);
if(nodePathValidated==false){
}
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION @BASECLASS PZRULEFORMTOOLBARACTIONSMENU #20230618T003139.647 GMT", "@baseclass pzRuleFormToolbarActionsMenu", "Pega-Desktop", "08-23-01", "20230618T003139.647 GMT");
}
