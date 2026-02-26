package com.pegarules.generated.casetype;
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
public class ra_action_pydefault_ad3da8467dd34ea9d03201b1512c74bc  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_CaseType.pyDefault.OFON2J_ProcessO_Work_Onboarding.Action");
	public ra_action_pydefault_ad3da8467dd34ea9d03201b1512c74bc(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-CASETYPE OFON2J-PROCESSO-WORK-ONBOARDING PYDEFAULT #20260223T094402.277 GMT	ProcessO:01-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
		mTraceInfo = oTraceInfo_0;
		mRuleSet = "ProcessO";
		mCaseTypeHandle = "RULE-OBJ-CASETYPE OFON2J-PROCESSO-WORK-ONBOARDING PYDEFAULT #20260223T094402.277 GMT";
		myStepPage = tools.getStepPage();
		purpose = tools.getParamValue("pyCaseTypePurpose");
		LogTraceEvent(mCaseTypeHandle, purpose, "CaseType Start");
		
		ClipboardPage pgFlowTemp = tools.createPage("Rule-Obj-Flow", "");
		ParameterPage paramsPage = new ParameterPage();
		ParameterPage pp = new ParameterPage();
		StringMap startFlowKeys = new HashStringMap();
			ClipboardPage casePage = null;
			ClipboardPage pyStartingFlows = null;

		 ClipboardProperty cpAdhoc = tools.getPrimaryPage() == null ? null : tools.getPrimaryPage().getIfPresent("pxIsAdhoc");
		 if(cpAdhoc != null){
			if(cpAdhoc.toBoolean())
{				LogTraceEvent(mCaseTypeHandle, purpose, "Skipping CaseType for Adhoc work");
				tools.putParamValue("ErrorMessage", "CaseTypeIsAbstract");
return;}
}
		if (purpose.equals("ADHOCFLOWS"))
		{
			String pageName = tools.getParamValue("pyPageName");
			ClipboardPage pgAdhocFlows = tools.createPage("Code-Pega-List", pageName);
			pgAdhocFlows.putString("pyObjClass", "Rule-Obj-Flow");
			ClipboardProperty pxResults = pgAdhocFlows.getProperty(".pxResults");
			boolean bAutoWhenResult;
			boolean bManualWhenResult;
			boolean instAutomaticWhenResult;
			String strAutoStart;
			String strManualStart;
			ClipboardPage pageToAdd;
			String pyLabel = "";

		 String sInstantiation = tools.getParamValue("pyInstantiation");
		//When bInstantiation is true we are getting a list of ad hoc flows to auto start 
		//and when it is false we are getting a list of manually startable ad hoc flows
		 boolean bInstantiation = sInstantiation.equals("INSTANTIATE");
			pega.sortPageList(pxResults, new String[] {"pyLabel"}, new boolean[] {true}, new String[] {""});
			pgAdhocFlows.putString("pxResultCount", pxResults.size() + "");
		}
		
		else if (purpose.equals("GETFLOWCALLPARAMS"))
		{
			String flowNameParam = tools.getParamValue("flowType");
			ClipboardPage pyCallParams = tools.createPage("@baseclass", "pyCallParams");
		if(flowNameParam.equals(""))
		{
		}
		}
		else if (purpose.equals("GETSTAGEOPTIONALFLOWCALLPARAMS"))
		{
			String flowNameParam = tools.getParamValue("flowType");
			String stageIDParam = tools.getParamValue("currentStage");
			ClipboardPage pyCallParams = tools.createPage("@baseclass", "pyCallParams");
		}
		else if (purpose.equals("COVERABLEFLOWS"))
		{
			String pageName = tools.getParamValue("pyPageName");
			pgFlowTemp = tools.createPage("Rule-Obj-Flow", "");
			ClipboardPage pgCoverableFlows = tools.createPage("Code-Pega-List", pageName);
			pgCoverableFlows.putString("pyObjClass", "Rule-Obj-Flow");
			boolean retval;
		}
		
		else if (purpose.equals("GETAPPCONCLUSIONDATA"))		{			casePage = tools.createPage("OFON2J-ProcessO-Work-Onboarding", "pyTempCallCasePage");
			startFlowKeys.putString("pxObjClass", "Rule-Obj-CaseType");
			startFlowKeys.putString("pyPurpose", "pyDefault");
			startFlowKeys.putString("pyClassName","OFON2J-ProcessO-Work-Onboarding");
			tools.putParamValue("pyCaseTypePurpose", "GETSTARTINGFLOWS");
			tools.doActivity(startFlowKeys, casePage, tools.getParameterPage());
			tools.putParamValue("pyCaseTypePurpose", "GETLOCKTIMEOUT");
			tools.doActivity(startFlowKeys, casePage, tools.getParameterPage());
			tools.putParamValue("pyCaseTypePurpose", "GETLOCKINGMODE");
			tools.doActivity(startFlowKeys, casePage, tools.getParameterPage());
			tools.putParamValue("pyCaseTypePurpose", "GETSELECTEDCONFIRMVIEWNAME");
			tools.doActivity(startFlowKeys, casePage, tools.getParameterPage());
			tools.putParamValue("pyCaseTypePurpose", "GETNEXTWORK");
			tools.doActivity(startFlowKeys, casePage, tools.getParameterPage());
				casePage.removeFromClipboard();
		}

		else if (purpose.equals("GETWORKPARTIESRULE"))
		{
		tools.putParamValue("WorkPartiesRule", "pyCaseManagementDefault");
		}
		
		else if (purpose.equals("GETCASECREATIONINFO")) {
				fetchCaseCreationInfo();
		}

		else if (purpose.equals("CREATECASE")) {
				ParameterPage initiateCTParams = new ParameterPage();
							tools.putParamValue("CurrentStage","PRIM0");
							initiateCTParams.putParamValue("InitializationStage","PRIM0");
						getNextStage_circum0();
							initiateCTParams.putParamValue("MoveToStage",tools.getParamValue("NextStage"));
							initiateCTParams.putParamValue("CurrentStageName","Create");
							initiateCTParams.putParamValue("processExistInInitStage","true");
				StringMap activity = new HashStringMap();
				activity.putString("pxObjClass", "Rule-Obj-Activity");
				activity.putString("pyClassName", "Work-");
				activity.putString("pyActivityName", "pzInitializeNewCase");
				tools.doAction(activity, tools.getPrimaryPage(), initiateCTParams);
		}

		else if (purpose.equals("GETSTARTINGFLOWS"))		{				tools.putParamValue("CaseLabel","Onboarding");
				fetchCaseCreationInfo();
		}
		else if (purpose.equals("GETCASETYPECATEGORY"))		{			tools.putParamValue("casetypeCategory", "Custom");
		}
		else if (purpose.equals("AUTOSTARTFLOWS"))
		{
		//this is in fact the 06-03 verseion of the function
				LogTraceMessage("Checking for auto instantiated coverable classes");
			String pageName = tools.getParamValue("pyPageName");
			ClipboardPage pgCoverableFlows = tools.createPage("Code-Pega-List", pageName);
			pgCoverableFlows.putString("pyObjClass", "Rule-Obj-Flow");
			ClipboardProperty pxResults = pgCoverableFlows.getProperty(".pxResults");
			boolean whenResult;
			String pyLabel = "";
			ParameterPage newParamsPage = new ParameterPage();
			newParamsPage.putString("Coverable", "false");
			newParamsPage.putString("GetPrivileges", "true");
			newParamsPage.putString("pyObjClass", "Rule-Obj-Flow");
			newParamsPage.putString("ClassGroup", "false");
			newParamsPage.putString("pyListName", "List");
			newParamsPage.putString("showResults", "NO");
			newParamsPage.putString("pageName", "FlowList");
			newParamsPage.putString("p2", "pyCanCreateWorkObject");
			newParamsPage.putString("v2", "true");
			java.util.Iterator itFlows;
			StringMap strMap = new HashStringMap();

			pega.sortPageList(pxResults, new String[] {"pyLabel"}, new boolean[] {true}, new String[] {""});
			pgCoverableFlows.putString("pxResultCount", pxResults.size() + "");
		}
		
		else if (purpose.equals("GETMAXCOUNT"))
		{
			//Set MaxCount Parameter to value of pyMaxCount property for each class
			String pyWorkClass = tools.getParamValue("pyWorkClass");

		}
		
		else if (purpose.equals("ISCOVEREDCLASS"))
		{
			String pyWorkClass = tools.getParamValue("pyWorkClass");

			tools.putParamValue("ClassIsCovered","false");
		}
		
		else if (purpose.equals("CANRESOLVE"))
		{
			LogTraceMessage("Checking for required items");
			//No Required Attachments found");
			LogTraceMessage("No covered items required");
			//There was no required work, so exit.
			}
		else if (purpose.equals("CHILDCHANGE")) {
		ClipboardPage changeTrackPage = tools.findPage("pyCaseTypeContext");
			HashStringMap optionalProperties = new HashStringMap();
			optionalProperties.putString("CaseTypeHandle", mCaseTypeHandle);
			pega.logTraceEvent("CaseType",
				"Update Calculations",
				"",
				mTraceInfo,
				mCaseTypeHandle,
				"CHILDCHANGE",
				true,
				changeTrackPage,
				tools.getStackFrame().getParameterPage(),
				optionalProperties);
			String childClass = changeTrackPage.getString("pyClassName");
			String childKey = changeTrackPage.getString("pzInsKey");
			// Loop through the properties that changed for this class
			ClipboardProperty pzChangedProperties = changeTrackPage.getProperty("pzChangedProperties");
			java.util.Iterator itChanged = pzChangedProperties.iterator();
			while (itChanged.hasNext())
			{
				ClipboardProperty cpPropChange = (ClipboardProperty)itChanged.next();
				ClipboardPage pgPropChange = cpPropChange.getPageValue();
				String propName = pgPropChange.getString("pyPropertyName");
				String oldValue = pgPropChange.getString("pzOldValue");
				String newValue = pgPropChange.getString("pzNewValue");
				UpdateCalculation_circum0(childClass, propName, oldValue, newValue);
			}
			pega_rules_page.removePagesThatStartWith("pyCT_");
		}
		
		else if (purpose.equals("CHILDREMOVE"))
		{
			// the workPage parameter contains the name of the former child work object
			String pageName = tools.getParamValue("workPage");
			ClipboardPage childWorkPage = tools.findPage(pageName);
			String childClass = childWorkPage.getClassName();
			
				ChildRemoveInvokeCalculation_circum0(childClass,childWorkPage);
			pega_rules_page.removePagesThatStartWith("pyCT_");
		}
		
		else if(purpose.equals("ISPARENTLOCKREQUIRED"))
		{
			tools.putParamValue("DoNotLockParent","false");
		}

		else if(purpose.equals("ISOPTIMISTICPARENTLOCKREQUIRED"))
		{
			tools.putParamValue("LockOptimisticParent","false");
		}

		else if(purpose.equals("GETLOCKTIMEOUT"))
		{
			 tools.putParamValue("LockTimeOut","");
		}

		else if(purpose.equals("GETLOCALEREFERENCE"))
		{
		}

		else if(purpose.equals("GETLOCKINGMODE"))
		{
			tools.putParamValue("LockingMode","");
		}

		else if(purpose.equals("GETSELECTEDCONFIRMVIEWNAME"))
		{
			tools.putParamValue("ConfirmViewName","false");
		}

		else if(purpose.equals("GETNEXTWORK"))
		{
			tools.putParamValue("EnableGetNextWork","false");
		}

		else if(purpose.equals("GETBACKBUTTONVISIBILITY"))
		{
		String currentStageId = tools.getParamValue("currentStageID");
		String currentFlowName = tools.getParamValue("currentFlowName");
		String currentStageFlowID = tools.getParamValue("currentStageFlowID");
		String type = tools.getParamValue("type");
			if(type.equalsIgnoreCase("FLOW") && currentStageId.equalsIgnoreCase("PRIM0") && currentStageFlowID.equalsIgnoreCase("FLOW0")){
				tools.putParamValue("ShowBackButton","false");
				return;
			}
		}

		else if(purpose.equals("GETCONDITIONALLAUNCHSTAGE"))
		{
			String currentStageId = tools.getParamValue("currentStageID");
		}

		else if(purpose.equals("GETCASEMATCHRULENAME"))
		{
			tools.putParamValue("CaseMatchRuleName","");
		}

		else if (purpose.equals("PROPAGATE"))
		{
LogTraceMessage("Propagating properties from parent to child");
			myStepPage=tools.getPrimaryPage();
			String sWorkClass = tools.getParamValue("workPageClass");
			ClipboardPage workPage = null;
LogTraceMessage("Child class: " + sWorkClass);
			ParameterPage dtParams = null;			if(sWorkClass.equals("")) {
				workPage = tools.findPage(tools.getParamValue("ChildPage"));
				if (workPage == null)
					throw new PRAppRuntimeException("Pega-ProcessEngine", 0, "Child page ChildPage not present on clipboard!");
			ClipboardPage pgWork = tools.findPage(tools.getParamValue("ChildPage"));LogTraceMessage("Looking for properties to propagate for ");
			}
		}
		else if (purpose.equals("ADDATTACHMENT"))
		{
				ParameterPage attachmentParams = new ParameterPage();
				StringMap addAttachKeys = new HashStringMap();
				addAttachKeys.putString("pxObjClass", "Rule-Obj-Activity");
				addAttachKeys.putString("pyClassName", "Embed-AttachmentCategory");
				addAttachKeys.putString("pyActivityName", "pzAppendAttachment");
		}
		
		else if (purpose.equals("CHILDADD"))
		{
			// the workPage parameter contains the name of the new child work object
			String pageName = tools.getParamValue("workPage");
			ClipboardPage childWorkPage = tools.findPage(pageName);
			String childClass = childWorkPage.getClassName();
			
				ChildAddInvokeCalculation_circum0(childClass,childWorkPage);
			pega_rules_page.removePagesThatStartWith("pyCT_");
		}
		
		else if (purpose.equals("RECALCULATE"))
		{
			// Update each of the calculations
			Recalculate_circum0("ALL");
			pega_rules_page.removePagesThatStartWith("pyCT_");
		}
		
		else if (purpose.equals("GETMILESTONE"))
		{
			tools.putParamValue("CurrentMilestone","");
		}

		else if (purpose.equals("STATUSCATEGORIES"))
		{
			String pageListName = tools.getParamValue("PageListName");
			ClipboardPage pgStatusCategories = tools.createPage("Code-Pega-List", pageListName);
			pgStatusCategories.putString("pyObjClass", "Embed-Rule-Obj-CaseType-Status");

		}

		 //Code for setting icon information
		else if (purpose.equals("GETICON"))
		{
		tools.putParamValue("pyTreeGridIconSelected", "cmicons/pycase.svg");
		}
		
		 //Code for setting circumstance value
		else if (purpose.equals("GETCIRCUMSTANCEKEY"))
		{
		 //No circumstance key for base cases 
		tools.putParamValue("CircumstanceKey","");		}
		
		else if (purpose.equals("ISUSEDINDEPENDENCYNETWORK"))		{
				tools.putParamValue("IsUsedInDependencyNetwork","false");
		}
		
		else if (purpose.equals("HASCHILDWITHDEPENDENCIES"))
		{

				tools.putParamValue("HasChildDependencies","false");
		}
		
		else if (purpose.equals("GETAUTOSTARTOPTION"))
		{

		String dependentCaseType = tools.getParamValue("DependentCaseTypeClass");
			if(dependentCaseType.equals(""))
				tools.putParamValue("autoStartOption","");
		}
		
		else if (purpose.equals("HASACTIVATORS"))
		{

		boolean bHasActivators = false;
		String activatorsVolume = "";
		tools.putParamValue("HasActivators" , bHasActivators);
		tools.putParamValue("ActivatorsVolume" , activatorsVolume );
		}
		
		else if(purpose.equals("GETCREATEACTIVATORS"))
		{
			String DependentCaseTypeClass = tools.getParamValue("DependentCaseTypeClass");
		}

		else if(purpose.equals("GETCOMPLETEACTIVATORS"))
		{
			String DependentCaseTypeClass = tools.getParamValue("DependentCaseTypeClass");
		}

		else if(purpose.equals("GETCASETYPECOVERS"))
		{
			String DependentCaseTypeClass = tools.getParamValue("DependentCaseTypeClass");
		}

		else if(purpose.equals("GETCREATEDEPENDENCIES"))
		{
			String ActivatorCaseTypeClass = tools.getParamValue("ActivatorCaseTypeClass");
		}

		else if(purpose.equals("GETCOMPLETEDEPENDENCIES"))
		{
			String ActivatorCaseTypeClass = tools.getParamValue("ActivatorCaseTypeClass");
		}

		else if(purpose.equals("HASCREATEDEPENDENCIES"))
		{
			String ActivatorCaseTypeClass = tools.getParamValue("ActivatorCaseTypeClass");
		boolean bhasCreateDependencies = false;
			tools.putParamValue("HasCreateDependencies" , bhasCreateDependencies);
		}

		else if(purpose.equals("HASCOMPLETEDEPENDENCIES"))
		{
			String ActivatorCaseTypeClass = tools.getParamValue("ActivatorCaseTypeClass");
		boolean bhasCompleteDependencies = false;
			tools.putParamValue("HasCompleteDependencies" , bhasCompleteDependencies);
		}

		else if(purpose.equals("HASSTATUSDEPENDENCIES"))
		{
			String ActivatorCaseTypeClass = tools.getParamValue("ActivatorCaseTypeClass");
		boolean bhasStatusDependencies = false;
			tools.putParamValue("HasStatusDependencies",bhasStatusDependencies);
		}

		else if(purpose.equals("GETSTATUSDEPENDENCIES"))
		{
			String ActivatorCaseTypeClass = tools.getParamValue("ActivatorCaseTypeClass");
		}

		else if(purpose.equals("GETSTATUSACTIVATORS"))
		{
			String DependentCaseTypeClass = tools.getParamValue("DependentCaseTypeClass");
		}

		else if (purpose.equals("GETADVANCEDSETTINGS"))
		{
		tools.putParamValue("PublishAsRemote",false);
		tools.putParamValue("PermitInstantiation",false);
		tools.putParamValue("SEOEnabled",false);
		tools.putParamValue("LPGeolocationStatus",false);
		tools.putParamValue("ConstantTrackingEnabled",false);
		}

		else if (purpose.equals("GETCOVERABLEWORKTYPEINFO"))
		{
			String pageListName = tools.getParamValue("PageListName");
			ClipboardPage pgPopulate = tools.createPage("Code-Pega-List", pageListName);
			pgPopulate.putString("pyObjClass", "Rule-Obj-CaseType");
		}

		else if (purpose.equals("GETRELATEDCLASSESINFO"))
		{
			String pageListName = tools.getParamValue("PageListName");
			ClipboardPage pgPopulate = tools.createPage("Code-Pega-List", pageListName);
			pgPopulate.putString("pyObjClass", "Rule-Obj-CaseType");
		}

		else if (purpose.equals("GETATTACHMENTDETAILS"))
		{
			String pageListName = tools.getParamValue("PageListName");
			ClipboardPage pgPopulate = tools.createPage("Code-Pega-List", pageListName);
			pgPopulate.putString("pyObjClass", "Rule-Obj-CaseType");
		}

		else if (purpose.startsWith("STAGE_")) {
			doStagePurposes_circum0(purpose);
		}

		else if(purpose.equals("GETCASENOTIFICATIONS")) {
		tools.putParamValue("EmailNotificationIsEnabled","false");
		tools.putParamValue("PushNotificationIsEnabled","false");
		}

		else if(purpose.equals("GETCASEPREDICTIONS"))
		{
		 ClipboardPage myStepPage = tools.getStepPage();
		 myStepPage.putString("pyCaseHasPredictions" , "false");
		tools.putParamValue("CaseHasPredictions","false");
		}

		else if(purpose.equals("GETPERSONAS"))
		{
		String pageName = tools.getParamValue("pyPageName");
		ClipboardPage pgPersonaList = tools.createPage("Code-Pega-List", pageName);
		pgPersonaList.putString("pyObjClass", "Embed-CasePersona");
		ClipboardProperty pxResults = pgPersonaList.getProperty(".pxResults");
		ClipboardProperty pxResultCount = pgPersonaList.getProperty(".pxResultCount");
		pxResultCount.setValue(0);
		}

		else if(purpose.equals("GETDATAOBJECTS"))
		{
		String pageName = tools.getParamValue("pyPageName");
		ClipboardPage pgDataObjectList = tools.createPage("Code-Pega-List", pageName);
		pgDataObjectList.putString("pyObjClass", "Embed-CaseDataObject");
		ClipboardProperty pxResults = pgDataObjectList.getProperty(".pxResults");
		ClipboardProperty pxResultCount = pgDataObjectList.getProperty(".pxResultCount");
		pxResultCount.setValue(0);
		}

		else if(purpose.equals("GETATTACHMENTS"))
		{
		String pageName = tools.getParamValue("pyPageName");
		ClipboardPage pgAttachmentsList = tools.createPage("Code-Pega-List", pageName);
		pgAttachmentsList.putString("pyObjClass", "Embed-CaseAttachmentCategory");
		ClipboardProperty pxResults = pgAttachmentsList.getProperty(".pxResults");
		ClipboardProperty pxResultCount = pgAttachmentsList.getProperty(".pxResultCount");
		pxResultCount.setValue(0);
		}

		else if(purpose.equals("GETVIEW"))
		{
				boolean isCreateStage = pega_rules_utilities.callWhen(tools, "pzIsCreateStage", myStepPage);
				if(isCreateStage)
				{
					tools.putParamValue("viewType","Harness");
					tools.putParamValue("viewPurpose","pyCreate");
				}
				else
				{
					tools.putParamValue("viewType","Harness");
					tools.putParamValue("viewPurpose","Perform");
				}
		}
		LogTraceEvent(mCaseTypeHandle, purpose, "CaseType End");
		
}
	} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODBODY", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODINIT", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODCALLVERSION", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODHEADER", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODVERSIONFINISH", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODCLOSE", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODFINISH", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODVERSIONHEADER", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODACCESS", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODCALL", 
	"Rule-Utility-Function:CASETYPEFUA!CASETYPEMETHODABSENT", 
	"Rule-Obj-CaseType:PYDEFAULT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-OBJ-CASETYPE",true,"Rule-Obj-CaseType","Pega-ProcessEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE DOFUASSEMBLY #20180713T133037.868 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",-279538275), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODBODY","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-23-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODBODY #20230618T003029.403 GMT","CASETYPEFUA!CASETYPEMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODINIT","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODINIT #20180713T133137.422 GMT","CASETYPEFUA!CASETYPEMETHODINIT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODCALLVERSION","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODCALLVERSION #20180713T133137.405 GMT","CASETYPEFUA!CASETYPEMETHODCALLVERSION",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODHEADER","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODHEADER #20180713T133137.419 GMT","CASETYPEFUA!CASETYPEMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODVERSIONFINISH","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODVERSIONFINISH #20180713T133137.425 GMT","CASETYPEFUA!CASETYPEMETHODVERSIONFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODCLOSE","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODCLOSE #20180713T133137.409 GMT","CASETYPEFUA!CASETYPEMETHODCLOSE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODFINISH","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODFINISH #20180713T133137.413 GMT","CASETYPEFUA!CASETYPEMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODVERSIONHEADER","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODVERSIONHEADER #20180713T133137.430 GMT","CASETYPEFUA!CASETYPEMETHODVERSIONHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODACCESS","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODACCESS #20180713T133137.392 GMT","CASETYPEFUA!CASETYPEMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODCALL","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODCALL #20180713T133137.402 GMT","CASETYPEFUA!CASETYPEMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("CASETYPEFUA!CASETYPEMETHODABSENT","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODABSENT #20180713T133137.389 GMT","CASETYPEFUA!CASETYPEMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PYDEFAULT","Rule-Obj-CaseType","OFON2J-PROCESSO-WORK-ONBOARDING",false,"","ProcessO","01-01-01","RULE-OBJ-CASETYPE OFON2J-PROCESSO-WORK-ONBOARDING PYDEFAULT #20260223T094402.277 GMT","!PYDEFAULT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",784631978)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE DOFUASSEMBLY #20180713T133037.868 GMT:crc:-279538275
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODABSENT #20180713T133137.389 GMT:20180713T133137.389 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODACCESS #20180713T133137.392 GMT:20180713T133137.392 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODBODY #20230618T003029.403 GMT:20231006T065144.183 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODCALL #20180713T133137.402 GMT:20180713T133137.402 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODFINISH #20180713T133137.413 GMT:20180713T133137.413 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODHEADER #20180713T133137.419 GMT:20180713T133137.419 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODVERSIONHEADER #20180713T133137.430 GMT:20180713T133137.430 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODCALLVERSION #20180713T133137.405 GMT:20180713T133137.405 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODVERSIONFINISH #20180713T133137.425 GMT:20180713T133137.425 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODINIT #20180713T133137.422 GMT:20180713T133137.422 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODCLOSE #20180713T133137.409 GMT:20180713T133137.409 GMT
//	RULE-OBJ-CASETYPE OFON2J-PROCESSO-WORK-ONBOARDING PYDEFAULT #20260223T094402.277 GMT:20260223T094403.046 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODBODY #20230618T003029.403 GMT:20231006T065144.183 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODCLOSE #20180713T133137.409 GMT:20180713T133137.409 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODFINISH #20180713T133137.413 GMT:20180713T133137.413 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODHEADER #20180713T133137.419 GMT:20180713T133137.419 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA CASETYPEMETHODINIT #20180713T133137.422 GMT:20180713T133137.422 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA LOGTRACEEVENT #20180713T133137.437 GMT:20180713T133137.437 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZCOVERABLEFLOWS #20210125T085119.081 GMT:20210125T085119.081 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZPROPAGATEPROPCODE #20180713T133137.449 GMT:20180713T133137.449 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZRECALCULATE #20180713T133137.456 GMT:20180713T133137.456 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGEMETHODS--(PUBLICAPI,CLIPBOARDPAGE,STRINGMAP) #20211027T131014.818 GMT:20211109T071024.758 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGE_ENDSTAGE--(CLIPBOARDPAGE,STRING) #20180713T133137.459 GMT:20180713T133137.459 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGE_GETOPTIONALPROCESSLIST #20180713T133137.463 GMT:20180713T133137.463 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGE_GETSTAGEPROCESSLIST #20180713T133137.467 GMT:20180713T133137.467 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGE_GETSTAGES #20200402T055408.015 GMT:20200402T055408.015 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGE_ONPROCESSEND #20180713T133137.478 GMT:20180713T133137.478 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGE_STARTNEXTPROCESS #20180713T133137.483 GMT:20180713T133137.483 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZSTAGE_STARTSTAGEPROCESSES #20180713T133137.487 GMT:20180713T133137.487 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA PZUPDATECALCULATION #20180713T133137.495 GMT:20180713T133137.495 GMT
//	RULE-UTILITY-FUNCTION CASETYPEFUA SUMCHILDREN #20180713T133137.503 GMT:20180713T133137.503 GMT
//	RULE-UTILITY-FUNCTION DEFAULT QUOTE #20180713T131438.272 GMT:20180713T131438.272 GMT
//	RULE-UTILITY-FUNCTION UTILITIES CALLACTIVITY #20180713T131442.960 GMT:20180713T131442.960 GMT
//	RULE-UTILITY-FUNCTION WORKUTILITIES PZPAGENAMECLEAN #20180713T133140.771 GMT:20180713T133140.771 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "0fea725dc152ebe43c378259d46002c9";
	}

	public String getDefinitionAppliesToClass() {
		return "OFON2J-ProcessO-Work-Onboarding";
	}
public String getAspect() {
return "Action";
}
	private void ChildAddInvokeCalculation_circum0(String childClass, ClipboardPage childWorkPage) {
		LogTraceEvent(mCaseTypeHandle, "", "ChildAddInvokeCalculation Start");

	}

	private void ChildRemoveInvokeCalculation_circum0(String childClass, ClipboardPage childWorkPage) {
		LogTraceEvent(mCaseTypeHandle, "", "ChildRemoveInvokeCalculation Start");

	}

	private void UpdateCalculation_circum0(String workClass, String propName, String oldValue, String newValue) {
		LogTraceEvent(mCaseTypeHandle, "", "UpdateCalculation Start");
		if (propName.charAt(0) == '.') {propName = propName.substring(1);}
	}

	protected void DeltaSumDest_circum0(com.pega.pegarules.priv.clipboard.PegaClipboardPage aCoverPage, String aTargetPropertyName, char aSourceType, String aOldValue, String aNewValue) {
		if(aOldValue == null || "".equals(aOldValue)) {aOldValue="0";}
		if(aNewValue == null || "".equals(aNewValue)) {aNewValue="0";}
		com.pega.pegarules.priv.clipboard.PegaClipboardProperty property = (com.pega.pegarules.priv.clipboard.PegaClipboardProperty)aCoverPage.getProperty(aTargetPropertyName);
		ClipboardPage changedPropertyPage = tools.createPage("Embed-CaseTypeContext-ChangedProperty", "");
		changedPropertyPage.putString(".pyPropertyName", aTargetPropertyName);
		char aDestinationType = tools.getDictionary().getClassInfo(aCoverPage.getClassName()).getImmutablePropertyInfo(aTargetPropertyName).getType();
		if (aDestinationType == ImmutablePropertyInfo.TYPE_INTEGER) {
			int delta = 0;
			if (aSourceType == ImmutablePropertyInfo.TYPE_INTEGER) {delta = getDeltaInt(aNewValue, aOldValue);}
			else if (aSourceType == ImmutablePropertyInfo.TYPE_DOUBLE) {delta = (int)getDeltaDouble(aNewValue, aOldValue);}
			else if (aSourceType == ImmutablePropertyInfo.TYPE_DECIMAL) {delta = getDeltaDecimal(aNewValue, aOldValue).intValue();}
			int oldTargetValue = aCoverPage.getInteger(aTargetPropertyName);
			changedPropertyPage.getProperty(".pzOldValue").setValue(oldTargetValue);
			int newTargetValue = oldTargetValue + delta;
			changedPropertyPage.getProperty(".pzNewValue").setValue(newTargetValue);
			property.setEntryCode("sNN");
			property.setValue(newTargetValue);
		} else if (aDestinationType == ImmutablePropertyInfo.TYPE_DOUBLE) {
			double doubleDeltaValue = 0.0;
			if (aSourceType == ImmutablePropertyInfo.TYPE_INTEGER) {doubleDeltaValue = getDeltaInt(aNewValue, aOldValue);}
			else if (aSourceType == ImmutablePropertyInfo.TYPE_DOUBLE) {doubleDeltaValue = getDeltaDouble(aNewValue, aOldValue);}
			else if (aSourceType == ImmutablePropertyInfo.TYPE_DECIMAL) {doubleDeltaValue = getDeltaDecimal(aNewValue, aOldValue).doubleValue();}
			double resultDouble = aCoverPage.getDouble(aTargetPropertyName);
			changedPropertyPage.getProperty(".pzOldValue").setValue(resultDouble);
			resultDouble += doubleDeltaValue;
			changedPropertyPage.getProperty(".pzNewValue").setValue(resultDouble);
			property.setEntryCode("sEN");
			property.setValue(resultDouble);
		} else if (aDestinationType == ImmutablePropertyInfo.TYPE_DECIMAL) {
			BigDecimal decimalDeltaValue = null;
			if (aSourceType == ImmutablePropertyInfo.TYPE_INTEGER) {decimalDeltaValue = new BigDecimal(getDeltaInt(aNewValue, aOldValue));}
			else if (aSourceType == ImmutablePropertyInfo.TYPE_DOUBLE) {decimalDeltaValue = new BigDecimal(getDeltaDouble(aNewValue, aOldValue));}
			else if (aSourceType == ImmutablePropertyInfo.TYPE_DECIMAL) {decimalDeltaValue = getDeltaDecimal(aNewValue, aOldValue);}
			if (decimalDeltaValue != null) {
				BigDecimal resultDecimal = aCoverPage.getBigDecimal(aTargetPropertyName);
				changedPropertyPage.getProperty(".pzOldValue").setValue(resultDecimal);
				resultDecimal = resultDecimal.add(decimalDeltaValue);
				changedPropertyPage.getProperty(".pzNewValue").setValue(resultDecimal);
				property.setEntryCode("sRN");
				property.setValue(resultDecimal);
			}
		}
		ClipboardPage pyCaseTypeContextOut = tools.findPage("pyCaseTypeContextOut");
		if(pyCaseTypeContextOut != null) {
			pyCaseTypeContextOut.getProperty(".pzChangedProperties").add(changedPropertyPage);
		}
		tools.getDictionary().validate(property, false);
	}
	// coverPropName can either be the property name to recompute or the literal ALL which will recompute all expressions
	private void Recalculate_circum0(String coverPropName)
	{
		com.pega.ibm.icu.math.BigDecimal runningTotal;
		com.pega.ibm.icu.math.BigDecimal val;
		String strClassName;
		String strPropertyName;
		
	}
	
		private void fetchCaseCreationInfo() {
				tools.putParamValue("SkipNewHarness","true");
				tools.putParamValue("CaseTypeWithInitializationStage","true");
				tools.putParamValue("CreatesTemporaryObject","false");
				tools.putParamValue("pyPurpose","pyDefault");
				tools.putParamValue("StartingModel","pyDefault");
				tools.putParamValue("WorkPartiesRule", "pyCaseManagementDefault");
		}
	private void doStagePurposes_circum0(String purpose){
		if(purpose.equals("STAGE_GETFIRST")) {
			getFirstStage_circum0();
		}
		else if(purpose.equals("STAGE_GETLIST")) {
			getStages_circum0();
		}
		else if(purpose.equals("STAGE_GETPRIMARY")) {
			getPrimaryStages_circum0();
		}
		else if(purpose.equals("STAGE_GETALTERNATE")) {
			getAlternateStages_circum0();
		}
		else if(purpose.equals("STAGE_GETNEXT")) {
			getNextStage_circum0();
		}
		else if(purpose.equals("STAGE_GETSTAGENAME")) {
			getStageName_circum0();
		}
		else if(purpose.equals("STAGE_GETSTAGEID")) {
			getStageID_circum0();
		}
		else if(purpose.equals("STAGE_GETPROCESSLIST")) {
			getStageProcessList_circum0();
		}
		else if(purpose.equals("STAGE_STARTPROCESSES")) {
			startStageProcesses_circum0();
		}
		else if(purpose.equals("STAGE_ISVALID")) {
			isStageValid_circum0();
		}
		else if(purpose.equals("STAGE_GETOPTIONALPROCESSLIST")) {
			getOptionalProcessList_circum0();
		}
		else if(purpose.equals("STAGE_ONPROCESSEND")) {
			onProcessEnd_circum0();
		}
		else if(purpose.equals("STAGE_ONSTAGEEND")) {
			OnStageEnd_circum0();
		}
		else if(purpose.equals("STAGE_VALIDATION")) {
			validateStage_circum0();
		}
		else if(purpose.equals("STAGE_SKIPSTAGE")) {
			evalSkipStage_circum0();
		}
		else if(purpose.equals("STAGE_GETACTIONS")) {
			getActionsList_circum0();
		}
	}
	private boolean startNextProcess_circum0(){
		boolean foundAFlowToKickOff = false;
		String strCurrentProcess = tools.getParamValue("CurrentProcess");
		String strStageFlowID = tools.getParamValue("StageFlowID");
		String stageID = tools.getParamValue("CurrentStage");
		tools.putParamValue("CurrentStageID",stageID);
		tools.putParamValue("StageOfTheStep",stageID);
		getStageName_circum0();
		String stageLabel = tools.getParamValue("StageName");
		boolean foundStage = getStageProcessList_circum0();
		boolean foundProcess = false;
		if (foundStage) {
		String processPageName = tools.getParamValue("pyProcessPageName");
		if(!processPageName.equals("")) {
			ClipboardPage processPage = tools.findPage(processPageName);
			if (processPage != null) {
				if (processPage.getInteger("pxResultCount") > 0) {
					ClipboardProperty cpResults = processPage.getProperty("pxResults");
					for(int i = 1;i<=cpResults.size();i++){
						 ClipboardPage embedPage = cpResults.getPageValue(i);
							String strFlowName = embedPage.getString(".pyFlowName");
							String strFlowID = embedPage.getString(".pxFlowID");
							if(strStageFlowID.equals(strFlowID) && strCurrentProcess.equals(strFlowName)){
								for(int j=i+1;j<=cpResults.size();j++){
									ClipboardPage embedNextPage = cpResults.getPageValue(j);
									if(embedNextPage.getString(".pyStartType").equals("SEQUENTIAL")){
										boolean whenRes = true;
										String whenRule = embedNextPage.getString(".pyStartWhen");
										String flowID = embedNextPage.getString(".pxFlowID");
										if(whenRule != ""){
											whenRes = pega_rules_utilities.callWhen(tools,whenRule,myStepPage);
										}
												if(whenRes){
													Iterator paramsIt = embedNextPage.getProperty("pyCallParams").iterator();
													ClipboardProperty cpParam;
													while(paramsIt.hasNext()) {
														cpParam = (ClipboardProperty) paramsIt.next();
														tools.putParamValue(cpParam.getName(), cpParam.getStringValue());
													}
													ClipboardPage saveAssignPage = tools.findPage("newAssignPage");
													if(saveAssignPage != null) {
														if (saveAssignPage.getClassName().length() == 0 || saveAssignPage.getBoolean(".pxSystemFlow") == true)
															saveAssignPage = null;
														else
															saveAssignPage.rename("saveStageAssignPage");
													}
							tools.putParamValue("FlowID",flowID);
													pega_processengine_workutilities.pzStartStageFlow(tools.getPrimaryPage(),embedNextPage.getString(".pyFlowName"),"");
													String strNextFlowName = embedNextPage.getString(".pyFlowName");
													LogTraceEvent("Starting Flow: \"" + strNextFlowName + "\" in Stage: " + stageLabel + " (" + stageID + ")", purpose, "Starting Flow");
													foundAFlowToKickOff = true;
													if(saveAssignPage != null) {
														saveAssignPage.rename("newAssignPage");
													}
													return foundAFlowToKickOff;
												}
										else{
										LogTraceEvent("Skipping Flow: \"" + embedNextPage.getString(".pyFlowName") + "\" in Stage: " + stageLabel + " (" + stageID + ")", purpose, "Skipping Flow");
										continue;
										}
									}
									else{
										return foundAFlowToKickOff;									}
								}
							foundProcess = true;
							}
					}
				}
				processPage.removeFromClipboard();
			}
		}
		}
		//if no process was found, check the case-wide processes
		if (foundStage && !foundProcess) {
			if (strCurrentProcess.equals("")) {
				foundProcess = true;
			}
		}
		ClipboardPage workPage = tools.getPrimaryPage();
		String workClass = workPage.getString("pxObjClass");
		String workStatus = workPage.getString("pyStatusWork");
		if (!(foundStage && foundProcess)) {
			if (!workStatus.startsWith("Resolved")) {
				ParameterPage pp = tools.getParameterPage();
				StringMap activity = new HashStringMap();
				activity.putString("pxObjClass", "Rule-Obj-Activity");
				activity.putString("pyClassName", "Work-");
				activity.putString("pyActivityName", "getFlowProblemOperator");
				tools.doAction(activity, tools.getPrimaryPage(), pp);
				if (!foundStage) {
					pp.putParamValue("ErrorMessage", "The stage that " + strCurrentProcess + " was defined on no longer exists.");				} else {
					pp.putParamValue("ErrorMessage", "The stage that " + strCurrentProcess + " was defined on no longer contains " + strCurrentProcess + ".");				}
				String flowName = pega_procom_flow.AddFlow(tools, tools.getPrimaryPage(), "pzStageProblems", "pzStageProblems", "");
				pega_procom_flow.StartFlow(flowName, tools.getPrimaryPage(), pp);
				foundAFlowToKickOff = true;
				LogTraceEvent(pp.getString("ErrorMessage"), purpose, "Problem Flow");
			} else if (!foundStage) {
				oLog.error(strCurrentProcess + " ended and resolved a case, but the stage it was associated with is no longer defined on the case type.");
			} else if (!foundProcess) {
				oLog.error(strCurrentProcess + " ended and resolved a case, but the process is no longer defined on its stage.");
			}
		}
		return foundAFlowToKickOff;
	}
	
	private void getFirstStage_circum0(){
		tools.putParamValue("FirstStage","PRIM0");
	}
	private void getStages_circum0(){
		String pageName = tools.getParamValue("pyPageName");
		ClipboardPage pgStageList = tools.createPage("Code-Pega-List", pageName);
		pgStageList.putString("pyObjClass", "Embed-Stage");
		ClipboardProperty pxResults = pgStageList.getProperty(".pxResults");
		ClipboardPage pgStageToAdd = null;
		pgStageToAdd = tools.createPage("Embed-Stage","");
		pgStageToAdd.putString(".pyStageID", "PRIM0");
		pgStageToAdd.putString(".pyStageName", "Create");
		pgStageToAdd.putString(".pyStageTransition", "automatic");
		pgStageToAdd.putString(".pyStageWorkStatus", "");
		pgStageToAdd.putString(".pyCleanupProcess", "");
		pgStageToAdd.putString(".pyResolveChildCases", "");
		pgStageToAdd.putString(".pyChildCaseStatus", "");
		pgStageToAdd.putString(".pyValidate", "");
		pgStageToAdd.putString(".pyStageRule", "");
		pgStageToAdd.getProperty(".pyIsInitializationStage").setValue(true);
		pxResults.add(pgStageToAdd);
		ClipboardProperty pxResultCount = pgStageList.getProperty(".pxResultCount");
		pxResultCount.setValue(1);
	}
	private void getPrimaryStages_circum0(){
		String pageName = tools.getParamValue("pyPageName");
		ClipboardPage pgStageList = tools.createPage("Code-Pega-List", pageName);
		pgStageList.putString("pyObjClass", "Embed-Stage");
		ClipboardProperty pxResults = pgStageList.getProperty(".pxResults");
		ClipboardPage pgStageToAdd = null;
		pgStageToAdd = tools.createPage("Embed-Stage","");
		pgStageToAdd.putString(".pyStageID", "PRIM0");
		pgStageToAdd.putString(".pyStageName", "Create");
		pgStageToAdd.putString(".pyStageTransition", "automatic");
		pgStageToAdd.putString(".pyStageWorkStatus", "");
		pgStageToAdd.putString(".pyCleanupProcess", "");
		pgStageToAdd.putString(".pyResolveChildCases", "");
		pgStageToAdd.putString(".pyChildCaseStatus", "");
		pxResults.add(pgStageToAdd);
		ClipboardProperty pxResultCount = pgStageList.getProperty(".pxResultCount");
		pxResultCount.setValue(1);
	}
	private void getAlternateStages_circum0(){
	}
	private void getNextStage_circum0(){
		String currentStage = tools.getParamValue("CurrentStage");
		boolean foundNext = false;
		if (!currentStage.equals("")) {
		}
		if (!foundNext) {
			tools.putParamValue("NextStage", "");
		}
	}
	private void getStageName_circum0(){
		String currentStageID = tools.getParamValue("CurrentStageID");
		boolean foundNext = false;
		if (!currentStageID.equals("")) {
			if(currentStageID.equals("PRIM0")) {
				tools.putParamValue("StageName","Create");
				foundNext = true;
			}
		}
		if (!foundNext) {
			tools.putParamValue("StageName", "");
		}
	}
	private void getStageID_circum0(){
		String currentStageName = tools.getParamValue("CurrentStageName");
		boolean foundNext = false;
		if (!currentStageName.equals("")) {
			if(currentStageName.equals("Create")) {
				tools.putParamValue("StageID","PRIM0");
				foundNext = true;
			}
		}
		if (!foundNext) {
			tools.putParamValue("stageID", "");
		}
	}
	
	private void PRIM0_getStageProcessList_circum0() {
		String pageName = tools.getParamValue("pyProcessPageName");
		ClipboardPage pyProcessPage = tools.createPage("Code-Pega-List", pageName);
		pyProcessPage.putString("pyObjClass", "Rule-Obj-Flow");
		ClipboardProperty pxResults = pyProcessPage.getProperty(".pxResults");
		ClipboardPage pgStageProcess;
		pgStageProcess = tools.createPage("Embed-StageProcess", "");
		pgStageProcess.putString("pyFlowName", "CreateForm_Default");
		pgStageProcess.putString("pxFlowID", "FLOW0");
		pgStageProcess.putString("pyStartWhen", "!pxIsEmail");
		pgStageProcess.putString("pyLabel", "Create");
		pgStageProcess.putString("pyStartType", "PARALLEL");
		pgStageProcess.putString("pyLaunchOnReentry", "false");
		pgStageProcess.putString("pyStepSLA", "");
		pxResults.add(pgStageProcess);
		pyProcessPage.getProperty(".pxResultCount").setValue(pyProcessPage.getProperty(".pxResults").size());
	}
	
	private boolean getStageProcessList_circum0(){
		boolean stageFound = false;
		String currentStage = tools.getParamValue("CurrentStage");
		if (!currentStage.equals("")) {
			if(currentStage.equals("PRIM0")) {
			PRIM0_getStageProcessList_circum0();
			stageFound = true;
			}
		}
		return stageFound;
	}
	
	private void startStageProcesses_circum0(){
		String currentStageID = tools.getParamValue("CurrentStage");
		if ("PRIM0".equals(currentStageID)) {
			tools.putParamValue("AutomaticTransition", PropertyInfo.TYPE_TRUEFALSE, false);
			PRIM0_start_circum0();
		}
	}
	
	private void PRIM0_start_circum0() {
		tools.getPrimaryPage().getProperty("pzStageStartInProgress").setValue(true);
		PRIM0_FLOW0_start_circum0();
		tools.getPrimaryPage().getProperty("pzStageStartInProgress").setValue(false);
		if (!pega_processengine_workutilities.pzCheckForAndDoAutomaticStageTransition(tools.getPrimaryPage())) {
		if ("PRIM0".equals(tools.getPrimaryPage().getString("pxCurrentStage"))) {
			pega_procom_flow.RemoveFlow(tools.getPrimaryPage(), "pzInternalStageFlow", tools);
// Expression: 
		}
			pega_rules_utilities.callActivity(tools.getPrimaryPage(), "RecalculateAndSave", tools.getParameterPage());
		}
	}
	private void PRIM0_FLOW0_start_circum0() {
	ClipboardPage myStepPage = tools.getPrimaryPage();
// Expression: 
// Expression: pxIsEmail
		if ( !pega_rules_utilities.callWhen(tools, "pxIsEmail", tools.getPrimaryPage()) && !tools.getParamValue("isThisReEntry").equals("Yes")) {
			//set parameters
			pega_processengine_workutilities.pzStartStageFlow(tools.getPrimaryPage(), "CreateForm_Default", "FLOW0", "", "");
		} else {
			PRIM0_FLOW0_end_circum0();
		}
	}
	
	private void PRIM0_FLOW0_end_circum0() {
		pega_processengine_workutilities.pzCheckForAndDoAutomaticStageTransition(tools.getPrimaryPage());
	}
	
	private void onProcessEnd_circum0() {
		String stageID = tools.getParamValue("CurrentStage");
		if ("PRIM0".equals(stageID)) {
			tools.putParamValue("AutomaticTransition", PropertyInfo.TYPE_TRUEFALSE, false);
			PRIM0_processEnd_circum0();
		} else {
			pega_rules_utilities.callActivity(tools.getPrimaryPage(), "getFlowProblemOperator", tools.getParameterPage());
			tools.putParamValue("ErrorMessage", "FlowProblemNoSuchStage\t" + tools.getParamValue("CurrentProcess"));
			String flowName = pega_procom_flow.AddFlow(tools, tools.getPrimaryPage(), "pzStageProblems", "pzStageProblems", "");
			pega_procom_flow.StartFlow(flowName, tools.getPrimaryPage(), tools.getParameterPage());
		}
	}
	private void PRIM0_processEnd_circum0() {
		String endingFlowID = tools.getParamValue("StageFlowID");
		if ("FLOW0".equals(endingFlowID)) {
			PRIM0_FLOW0_end_circum0();
		} else if ("true".equals(tools.getParamValue("ProcessIsOptional"))) {
			pega_processengine_workutilities.pzCheckForAndDoAutomaticStageTransition(tools.getPrimaryPage());
		} else {
			pega_rules_utilities.callActivity(tools.getPrimaryPage(), "getFlowProblemOperator", tools.getParameterPage())
;			tools.putParamValue("ErrorMessage", "FlowProblemMissingStageFlow\t" + tools.getParamValue("CurrentProcess"));
			String flowName = pega_procom_flow.AddFlow(tools, tools.getPrimaryPage(), "pzStageProblems", "pzStageProblems", "");
			pega_procom_flow.StartFlow(flowName, tools.getPrimaryPage(), tools.getParameterPage());
		}
	}
	
	
	private void OnStageEnd_circum0(){
		String currentStageID = tools.getParamValue("CurrentStage");
		if ("PRIM0".equals(currentStageID)) {
			PRIM0_end_circum0();
		}
	}
	
	private void PRIM0_end_circum0() {
			tools.putParamValue("AutomaticTransition", PropertyInfo.TYPE_TRUEFALSE, false);
		ParameterPage paramsPage = new ParameterPage();
		paramsPage.putParamValue("strPrevStage", PropertyInfo.TYPE_TEXT, tools.getParamValue("CurrentStage") );
		paramsPage.putParamValue("strPrevStageSubscript", PropertyInfo.TYPE_TEXT, tools.getParamValue("CurrentStageSubscript") );
		pega_rules_utilities.callActivity(tools.getPrimaryPage(), "pxUpdateStageHistory", paramsPage);
	}
	
	private void isStageValid_circum0(){
		tools.putParamValue("StageIsValid","false");
	}
	private boolean isStageAlternate_circum0(){
		boolean isStageAlternate = false;
		return isStageAlternate;
	}
	private void PRIM0_getOptionalProcessList_circum0() {
	}
	
	private void getOptionalProcessList_circum0(){
		String currentStage = tools.getParamValue("CurrentStage");
		if (!currentStage.equals("")) {
			if(currentStage.equals("PRIM0")) {
			PRIM0_getOptionalProcessList_circum0();
			}
		}
	}
	
	private void validateStage_circum0(){
		String currentStage = tools.getParamValue("CurrentStage");
		if (!currentStage.equals("")) {
			if(currentStage.equals("PRIM0")) {
				PRIM0_validate_circum0();
			}
		}
	}
	private void PRIM0_validate_circum0() {
	}
	private void evalSkipStage_circum0(){
	myStepPage = tools.getPrimaryPage();
	String nextStage = tools.getParamValue("NextStage");
	boolean stageHasWhen = false;
	boolean stageHasExpression = false;
	boolean expressionValue = false;
	boolean whenValue = false;
	if (!nextStage.equals("")) {
		String activityClass = myStepPage.getClassName();
		StringMap when = new HashStringMap();
		String blockName = "";
		if(stageHasExpression) {
			tools.putParamValue("SkipStage", String.valueOf(expressionValue));
		 }else if(stageHasWhen) {
			tools.putParamValue("SkipStage", String.valueOf(whenValue));
		} else {
			tools.putParamValue("SkipStage", "false");
		}
		if(tools.getParamValue("SkipStage") == "true"){
		String stageID = nextStage;
		String stageIDHolder = tools.getParamValue("CurrentStageID");
		tools.putParamValue("CurrentStageID",stageID);
		getStageName_circum0();
		String stageLabel = tools.getParamValue("StageName");
		tools.putParamValue("CurrentStageID",stageIDHolder);
			LogTraceEvent("Skipping Stage: " + stageLabel + " (" + stageID + ")", purpose, "Skipping Stage");
		}
	}
}
	private void PRIM0_getActionsList_circum0() {
	ClipboardPage myStepPage = tools.getPrimaryPage();
	String pageName = "pyActionsList";
	ClipboardPage actionsPage = tools.createPage("Code-Pega-List", pageName);
	ClipboardProperty pxResults = actionsPage.getProperty("pxResults");
	ClipboardPage pgAction;
	}
	
private void getActionsList_circum0(){
	ClipboardPage myStepPage = tools.getPrimaryPage();
	String currentStage = myStepPage.getString("pxCurrentStage");
	if (currentStage.equals("PRIM0")) {
		PRIM0_getActionsList_circum0();
	}	
	getCaseWideActionList_circum0();
}
private void getCaseWideActionList_circum0(){
	ClipboardPage myStepPage = tools.getPrimaryPage();
	String pageName = "pyCaseActionsList";
	ClipboardPage actionsList = tools.createPage("Code-Pega-List", pageName);
	ClipboardProperty pxResults = actionsList.getProperty("pxResults");
	 boolean isNotResolved = !pega_rules_utilities.callWhen(tools, "Resolved", myStepPage);
	ClipboardPage pgAction;
	if (isNotResolved) {
	if (true) {
		pgAction = tools.createPage("Embed-Pega-AssignAction", "");
		pgAction.putString("pyActionName", "pyUpdateCaseDetails");
		pxResults.add(pgAction);
	}
	}
	if (isNotResolved) {
	if (true) {
		pgAction = tools.createPage("Embed-Pega-AssignAction", "");
		pgAction.putString("pyActionName", "pyChangeStage");
		pxResults.add(pgAction);
	}
	}
	if (pega_rules_utilities.callWhen(tools, "Resolved", myStepPage)) {
		pgAction = tools.createPage("Embed-Pega-AssignAction", "");
		pgAction.putString("pyActionName", "pyReopen");
		pxResults.add(pgAction);
	}
}
	 private void addCoverableFlows(String strClass, String circumProp, String circumValue, String strWhen, String strMaxCount, String className, boolean isLastElement){
			StringMap noteKeys = new HashStringMap();
			StringMap startFlowKeys = new HashStringMap();
			String pageName = tools.getParamValue("pyPageName");
			ClipboardPage pgFlowTemp = tools.createPage("Rule-Obj-Flow", "");
			ClipboardPage pgCoverableFlows = tools.findPage(pageName,false);
			pgCoverableFlows.putString("pyObjClass", "Rule-Obj-Flow");
			ClipboardProperty pxResults = pgCoverableFlows.getProperty(".pxResults");
			boolean whenResult;
			ClipboardPage startingFlowsInClass;
			ClipboardPage reducedStartingFlows;
			ClipboardPage pageToAdd = null;
			ClipboardPage testCaseTypeClassPage = null;
			String pyLabel = "";
			ParameterPage newParamsPage = new ParameterPage();
			ParameterPage paramsPage = new ParameterPage();
			ParameterPage pp = new ParameterPage();
			newParamsPage.putString("Coverable", "false");
			newParamsPage.putString("GetPrivileges", "true");
			newParamsPage.putString("pyObjClass", "Rule-Obj-Flow");
			newParamsPage.putString("ClassGroup", "false");
			newParamsPage.putString("pyListName", "List");
			newParamsPage.putString("showResults", "NO");
			newParamsPage.putString("pageName", "FlowList");
			newParamsPage.putString("p2", "pyCanCreateWorkObject");
			newParamsPage.putString("v2", "true");
			java.util.Iterator itFlows;
	ClipboardPage pyStartingFlows = null;

			paramsPage.putString("Coverable", "false");
			paramsPage.putString("GetPrivileges", "true");
			paramsPage.putString("pyObjClass", "Rule-Obj-Flow");
			paramsPage.putString("ClassGroup", "false");
			paramsPage.putString("pyListName", "List");
			paramsPage.putString("showResults", "NO");
			paramsPage.putString("pageName", "FlowList");
			paramsPage.putString("Action", "inherited");
			paramsPage.putString("p1", "pyClassName");
			paramsPage.putString("v1", strClass);
				paramsPage.putString("pyBaseClass",strClass);
			startFlowKeys.putString("pxObjClass", "Rule-Obj-CaseType");
			startFlowKeys.putString("pyPurpose", "pyDefault");
			startFlowKeys.putString("pyClassName",strClass);
			pp.putString("pyCaseTypePurpose", "GETSTARTINGFLOWS");
			pp.putString("pyPageName", "StartingFlows");
			// make a page to call the casetype of the covered class
			 ClipboardPage casePage = tools.createPage(strClass, "pyTempCallCasePage");
		if(circumProp.length() > 0){			 casePage.putString(circumProp,circumValue);
			}
			tools.doActivity(startFlowKeys, casePage, pp);
			pyStartingFlows = tools.findPage("StartingFlows");
			String CaseTypeWithInitializationStage = pp.getString("CaseTypeWithInitializationStage");
			if(("true").equals(CaseTypeWithInitializationStage)){
				ClipboardPage startingFlow = tools.createPage("Rule-Obj-Flow","");
				startingFlow.putString("pyClassName",strClass);
				startingFlow.putString("pyLabel",pp.getString("CaseLabel"));
					 if (!strWhen.equals("")){ 
					startingFlow.putString(".pyWhensList(1).pyWhenName",strWhen);
					}
			 if (!strMaxCount.equals("")) { 
					startingFlow.putString(".pyMaxCount",strMaxCount);
			}				pxResults.add(startingFlow);
			}
			else {
			if(pyStartingFlows != null && pyStartingFlows.getProperty("pxResults").size() > 0){				// Get a list of all the starting flows in class strClass 
				pega_rules_utilities.callActivity(pgFlowTemp, "LookupList", paramsPage);
				startingFlowsInClass = tools.findPage("FlowList");
				pega_rules_utilities.callActivity(startingFlowsInClass, "ReduceProcessListForStartingFlows", paramsPage);
				reducedStartingFlows = tools.findPage("ProcessList");
			Iterator startFlowIt = reducedStartingFlows.getProperty("pxResults").iterator();
			while(startFlowIt.hasNext()){
				ClipboardProperty cpStartingFlowToCompare = (ClipboardProperty)startFlowIt.next();				String strStartingFlowNameToCompare = cpStartingFlowToCompare.getStringValue("pyFlowType");				String strStartingFlowClassToCompare = cpStartingFlowToCompare.getStringValue("pyClassName");				Iterator flowIt = pyStartingFlows.getProperty("pxResults").iterator();
				while(flowIt.hasNext()){
				ClipboardProperty cpFlowToCompare = (ClipboardProperty)flowIt.next();
				String strFlowNameToCompare = cpFlowToCompare.getStringValue("pyFlowType");
				if(strStartingFlowNameToCompare.equals(strFlowNameToCompare)){
					ClipboardPage pgFlowToCompare = cpStartingFlowToCompare.getPageValue();
					pageToAdd = pgFlowToCompare.copy();
				 pageToAdd.putString("caseTypeClass",strClass);
					 if (!strWhen.equals("")){ 
					pageToAdd.putString(".pyWhensList(1).pyWhenName",strWhen);
					}
					int masterSize = pxResults.size();
					if(masterSize > 0){
					java.util.Iterator  masterIter = pxResults.iterator();
					boolean foundInTheMaster = false;
					while(masterIter.hasNext()){
						ClipboardProperty masterFlowToCompare = (ClipboardProperty)masterIter.next();
						String masterFlowClass = masterFlowToCompare.getStringValue("caseTypeClass");
						String masterFlowName = masterFlowToCompare.getStringValue("pyFlowType");
						if(masterFlowClass.equals(strClass) && masterFlowName.equals(strStartingFlowNameToCompare)){
						foundInTheMaster = true;
						break;
						}
						}
						if(!foundInTheMaster){
							pxResults.add(pageToAdd);
						}
					}
					else
						pxResults.add(pageToAdd);
				}
				}
				}
if(pyStartingFlows.removeFromClipboard()){
}
pyStartingFlows = null;
			}				else{
				// Get a list of all the starting flows in class strClass  

				newParamsPage.putString("pyBaseClass",strClass);
			LogTraceMessage("Getting starting flows for class " + newParamsPage.getString("pyBaseClass"));
				pega_rules_utilities.callActivity(pgFlowTemp, "LookupList", newParamsPage);
				startingFlowsInClass = tools.findPage("FlowList");
				pega_rules_utilities.callActivity(startingFlowsInClass, "ReduceProcessList", newParamsPage);
				reducedStartingFlows = tools.findPage("ProcessList");
				LogTraceMessage(reducedStartingFlows.getString(".pxResultCount") + " flows in class " + newParamsPage.getString("pyBaseClass"));

				// Add each starting flow in the list to the composite list
				itFlows = reducedStartingFlows.getProperty(".pxResults").iterator();
					ClipboardProperty cpFlow = null;
					ClipboardPage pgFlow = null;
				while (itFlows.hasNext())
				{
					 cpFlow = (ClipboardProperty)itFlows.next();
					 pgFlow = cpFlow.getPageValue();
					pageToAdd = pgFlow.copy();
					 if (!strWhen.equals("")) { 
					pageToAdd.putString(".pyWhensList(1).pyWhenName",strWhen);
					}
			 if (!strMaxCount.equals("")) { 
					pageToAdd.putString(".pyMaxCount",strMaxCount);
			}					pxResults.add(pageToAdd);
					LogTraceMessage("Adding flow " + pgFlow.getString(".pyFlowType"));
				}
				}

				startingFlowsInClass.removeFromClipboard();
				reducedStartingFlows.removeFromClipboard();
				}
			 if(isLastElement){ 
				casePage.removeFromClipboard();
			pega.sortPageList(pxResults, new String[] {"pyLabel"}, new boolean[] {true}, new String[] {""});
			pgCoverableFlows.putString("pxResultCount", pxResults.size() + "");
			}			}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
	private com.pega.pegarules.priv.tracer.RuleTraceInfo mTraceInfo;
	private String mRuleSet;
	private String mCaseTypeHandle;
	private ClipboardPage myStepPage;
	private String purpose;
	
	int getDeltaInt(String aNewValue, String aOldValue) {return Integer.parseInt(aNewValue) - Integer.parseInt(aOldValue);}
	double getDeltaDouble(String aNewValue, String aOldValue) {return Double.parseDouble(aNewValue) - Double.parseDouble(aOldValue);}
	BigDecimal getDeltaDecimal(String aNewValue, String aOldValue) {return new BigDecimal(aNewValue).subtract(new BigDecimal(aOldValue));}
	private com.pega.ibm.icu.math.BigDecimal SumChildren(String strClassName, String strPropertyName, String coverKey)
	{
		com.pega.ibm.icu.math.BigDecimal retval = new com.pega.ibm.icu.math.BigDecimal(0);
		
		// First get the type of the property on the child object
		ClassInfo ci = tools.getDictionary().getClassInfo(strClassName);
		if (ci == null) return null;
		ImmutablePropertyInfo pi = ci.getImmutableTerminalPropertyInfo(strPropertyName);
		if (pi == null) return null;
		char propertyType = pi.getType();
		
		// Second see if the list of child objects is already on the clipboard
		String childObjectsPageName = pega_rules_string.replaceAll("pyCT_" + strClassName + "_" + pega_rules_string.toJavaIdentifier(coverKey), "-", "_");
		ClipboardPage childResults = tools.findPage(childObjectsPageName);
		if (childResults == null)
		{
			// Discover if the property is on an exposed column
			ClassDefinition cd = tools.getDatabase().getClassDef(strClassName);
			boolean isExposed = false;
			/* uncomment when SQL to sum up child values is in place
			try {
				 isExposed = cd.isPropertyExposed(strPropertyName, tools);
			} catch (DatabaseException de) { oLog.error(de); }
			*/
			if (isExposed)
			{
				// Use SQL to sum up the children values
				// TODO
			}
			else
			{
				// Run a report getting all the child objects
				// We can't specify a rule-obj-list because we know the property we want is in the blob
				childResults = tools.createPage("Code-Pega-List", childObjectsPageName);
				childResults.putString(".pyMaxRecords", "0");
				childResults.putString(".pyObjClass", strClassName);
				childResults.putString(".pyCondition(1).pyConditionFieldName", "pxCoverInsKey");
				childResults.putString(".pyCondition(1).pyConditionOperation", "=");
				childResults.putString(".pyCondition(1).pyConditionValue1", coverKey);
				try {
					tools.getDatabase().list(childResults, false);
				}catch (DatabaseException de) {
					throw new PRAppRuntimeException("Pega-ProCom", 0, de.getMessage());
				}
			}
		}
		if (childResults != null)
		{
			ClipboardProperty pxResults = childResults.getProperty(".pxResults");
			java.util.Iterator itResults = pxResults.iterator();
			if (propertyType == PropertyInfo.TYPE_INTEGER)
			{
				int runningIntTotal = 0;
				while (itResults.hasNext())
				{
					ClipboardProperty cpChild = (ClipboardProperty)itResults.next();
					ClipboardPage pgChild = cpChild.getPageValue();
					runningIntTotal += pgChild.getProperty(strPropertyName).toInteger();
				}
				retval = new com.pega.ibm.icu.math.BigDecimal(runningIntTotal);
			}
			else if (propertyType == PropertyInfo.TYPE_DOUBLE)
			{
				double runningDoubleTotal = 0;
				while (itResults.hasNext())
				{
					ClipboardProperty cpChild = (ClipboardProperty)itResults.next();
					ClipboardPage pgChild = cpChild.getPageValue();
					runningDoubleTotal += pgChild.getProperty(strPropertyName).toDouble();
				}
				retval = new com.pega.ibm.icu.math.BigDecimal(runningDoubleTotal);
			}
			else if (propertyType == PropertyInfo.TYPE_DECIMAL)
			{
				while (itResults.hasNext())
				{
					ClipboardProperty cpChild = (ClipboardProperty)itResults.next();
					ClipboardPage pgChild = cpChild.getPageValue();
					retval = retval.add(pgChild.getProperty(strPropertyName).toBigDecimal());
				}
			}
			else
				throw new PRAppRuntimeException("Pega-ProCom", 0, "Property type " + propertyType + " used by " + strClassName + "." + strPropertyName + " is not supported for aggregation.");
		}
		return retval;
	}

	private void LogTraceMessage(String message)
	{
		LogTraceEvent(message, "", "CaseType Message");
	}

	private void LogTraceEvent(String rulekey, String stepMethod, String eventType)
	{
		HashStringMap optionalProperties = new HashStringMap();
		optionalProperties.putString("CaseTypeHandle", mCaseTypeHandle);
	
		pega.logTraceEvent("CaseType",
				eventType,
				"",
				mTraceInfo,
				rulekey,
				stepMethod,
				false,
				tools.getPrimaryPage(),
				tools.getStackFrame().getParameterPage(),
				optionalProperties);
	}
	


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-CASETYPE OFON2J-PROCESSO-WORK-ONBOARDING PYDEFAULT #20260223T094402.277 GMT", "OFON2J-ProcessO-Work-Onboarding pyDefault", "ProcessO", "01-01-01", "20260223T094403.046 GMT");
}
