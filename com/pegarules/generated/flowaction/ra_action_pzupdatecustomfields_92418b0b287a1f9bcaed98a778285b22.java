package com.pegarules.generated.flowaction;
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
public class ra_action_pzupdatecustomfields_92418b0b287a1f9bcaed98a778285b22  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_FlowAction.pzUpdateCustomFields.Rule_.Action");
	public ra_action_pzupdatecustomfields_92418b0b287a1f9bcaed98a778285b22(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-FLOWACTION RULE- PZUPDATECUSTOMFIELDS #20180713T135456.865 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
		mTraceInfo = oTraceInfo_0;
		mRuleSet = "Pega-Desktop";
		mFlowActionHandle = "RULE-OBJ-FLOWACTION RULE- PZUPDATECUSTOMFIELDS #20180713T135456.865 GMT";
		
		interestPage = tools.getStepPage();
		myStepPage = tools.getStepPage();
		if (interestPage.isEmbedded())
			workPage = interestPage.getTopLevelPage();
		else
			workPage = interestPage;
		String workPageName = workPage.getName();
		
		String purpose = tools.getParamValue("pyFlowActionPurpose");
		if (purpose.equals("ADD"))
		{
			String strActionType = tools.getParamValue("ActionType");
			ClipboardPage assignPage = tools.findPage(tools.getParamValue("assignPage"));
			boolean isSelectedAction = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "isSelectedAction");
			boolean displaySeparatorAbove = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "displaySeparatorAbove");
			tools.putParamValue("AddOpRetVal", new Boolean(AddFlowAction_circum0(strActionType, assignPage, isSelectedAction, displaySeparatorAbove)).toString());
			
			// Also let the caller know what pyUsedAs is set to
			tools.putParamValue("pyUsedAs", "LOCALANDCONNECTOR");
		}
		
		else if (purpose.equals("REFRESHSETTINGS"))
		{
			String strPageListName = tools.getParamValue("PageListName");
					 if (!strPageListName.equals("")){ 
			CheckRefreshSettings_circum0(strPageListName);
					}
		}
		
		else if (purpose.equals("ACTIVITY"))
		{
			String strActionType = tools.getParamValue("ActionType");
			RunFlowActionActivity_circum0(strActionType);
			tools.putParamValue("pyActionLabel", "Add custom fields");
		}
		
		else if (purpose.equals("RUNREFRESHDT"))
		{
			String refreshFor = tools.getParamValue("refreshFor");
			RunRefreshDataTransform_circum0(refreshFor);
		}
		
		else if (purpose.equals("VALIDATE"))
		{
			// First check security
			if (CheckPrivileges_circum0() == false)
				throw new PRRuntimeException("Unable to authorize flow action execution: " + mFlowActionHandle);
			if (CheckWhens_circum0() == false)
				throw new PRRuntimeException("Unable to authorize flow action execution: " + mFlowActionHandle);
			
			// Next validate required properties
			ValidateRequiredProperties_circum0();
			
			// Set parameters for back-to-back assignment checking or the next harness
			tools.putParamValue("keepWorkingOnSame", "true");
			tools.putParamValue("keepWorkingOnSameFlow", "false");
			tools.putParamValue("keepWorkingOnSameCover", "false");
			tools.putParamValue("keepWorkingOnSameWorkBasket", "false");
			tools.putParamValue("confirmHarness", "Confirm");
		}
		
		else if (purpose.equals("CHECKWHENS"))
		{
			// Check when security
			tools.putParamValue("AddOpRetVal", new Boolean(CheckWhens_circum0()).toString());
		}
		else if (purpose.equals("CHECKSECURITY"))
		{
			String retVal = "true";
			// Check privileges
			if (CheckPrivileges_circum0() == false)
				retVal = "false";
			// Check when security
			else if (CheckWhens_circum0() == false)
				retVal = "false";
			tools.putParamValue("CheckSecurityRetVal", retVal);
		}
		else if (purpose.equals("GETSTREAMTYPE"))
		{
			tools.putParamValue("StreamType", "Rule-HTML-Section");
			tools.putParamValue("pyUsedAs", "LOCALANDCONNECTOR");
		}
		else if (purpose.equals("GETLABEL"))
		{
			tools.putParamValue("pzFALabel", "Add custom fields");
		}
		else if (purpose.equals("NEXTHARNESS"))
		{
			// Put the harness name into the parameter HarnessName
			tools.putParamValue("HarnessName", "Confirm");
		}
}
	} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODACCESS", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODCLOSE", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODCALLVERSION", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODINIT", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODVERSIONHEADER", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODABSENT", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODFINISH", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODCALL", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODVERSIONFINISH", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODBODY", 
	"Rule-Utility-Function:FLOWACTIONFUA!FLOWACTIONMETHODHEADER", 
	"Rule-Obj-FlowAction:PZUPDATECUSTOMFIELDS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-OBJ-FLOWACTION",true,"Rule-Obj-FlowAction","Pega-ProcessEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-FLOWACTION DOFUASSEMBLY #20180713T133038.240 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1230422315), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODACCESS #20180713T133137.544 GMT","FLOWACTIONFUA!FLOWACTIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODCLOSE","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODCLOSE #20180713T133137.558 GMT","FLOWACTIONFUA!FLOWACTIONMETHODCLOSE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODCALLVERSION","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODCALLVERSION #20180713T133137.554 GMT","FLOWACTIONFUA!FLOWACTIONMETHODCALLVERSION",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODINIT","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODINIT #20180713T133137.568 GMT","FLOWACTIONFUA!FLOWACTIONMETHODINIT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODVERSIONHEADER","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODVERSIONHEADER #20180713T133137.575 GMT","FLOWACTIONFUA!FLOWACTIONMETHODVERSIONHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODABSENT #20180713T133137.538 GMT","FLOWACTIONFUA!FLOWACTIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODFINISH #20180713T133137.561 GMT","FLOWACTIONFUA!FLOWACTIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODCALL #20180713T133137.551 GMT","FLOWACTIONFUA!FLOWACTIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODVERSIONFINISH","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODVERSIONFINISH #20180713T133137.570 GMT","FLOWACTIONFUA!FLOWACTIONMETHODVERSIONFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-23-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODBODY #20230618T003029.890 GMT","FLOWACTIONFUA!FLOWACTIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FLOWACTIONFUA!FLOWACTIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-ProcessEngine","08-01-01","RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODHEADER #20180713T133137.565 GMT","FLOWACTIONFUA!FLOWACTIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZUPDATECUSTOMFIELDS","Rule-Obj-FlowAction","RULE-",false,"","Pega-Desktop","08-01-01","RULE-OBJ-FLOWACTION RULE- PZUPDATECUSTOMFIELDS #20180713T135456.865 GMT","!PZUPDATECUSTOMFIELDS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-558511479)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-FLOWACTION DOFUASSEMBLY #20180713T133038.240 GMT:crc:1230422315
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODABSENT #20180713T133137.538 GMT:20180713T133137.538 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODACCESS #20180713T133137.544 GMT:20180713T133137.544 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODBODY #20230618T003029.890 GMT:20230618T003029.890 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODCALL #20180713T133137.551 GMT:20180713T133137.551 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODFINISH #20180713T133137.561 GMT:20180713T133137.561 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODHEADER #20180713T133137.565 GMT:20180713T133137.565 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODVERSIONHEADER #20180713T133137.575 GMT:20180713T133137.575 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODCALLVERSION #20180713T133137.554 GMT:20180713T133137.554 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODVERSIONFINISH #20180713T133137.570 GMT:20180713T133137.570 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODINIT #20180713T133137.568 GMT:20180713T133137.568 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODCLOSE #20180713T133137.558 GMT:20180713T133137.558 GMT
//	RULE-OBJ-FLOWACTION RULE- PZUPDATECUSTOMFIELDS #20180713T135456.865 GMT:20180713T135456.865 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT QUOTE #20180713T131438.272 GMT:20180713T131438.272 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA ADDACTIONSEPARATOR #20180713T133137.510 GMT:20180713T133137.510 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA ADDFLOWACTION #20220512T130107.547 GMT:20220512T130107.547 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA CHECKPRIVILEGES #20180713T133137.527 GMT:20180713T133137.527 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA CHECKWHENS #20180713T133137.534 GMT:20180713T133137.534 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODBODY #20230618T003029.890 GMT:20230618T003029.890 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODCLOSE #20180713T133137.558 GMT:20180713T133137.558 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODFINISH #20180713T133137.561 GMT:20180713T133137.561 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODHEADER #20180713T133137.565 GMT:20180713T133137.565 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA FLOWACTIONMETHODINIT #20180713T133137.568 GMT:20180713T133137.568 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA LOGTRACEEVENT #20180713T133137.582 GMT:20180713T133137.582 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA PZCHECKREFRESHSETTINGS--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.902 GMT:20230618T003029.902 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA PZRUNREFRESHDATATRANSFORM--(PUBLICAPI,CLIPBOARDPAGE) #20230618T003029.914 GMT:20230618T003029.914 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA RUNFLOWACTIONACTIVITY #20180713T133137.586 GMT:20180713T133137.586 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA SAVEFLOWACTIONDATAPAGES--(PUBLICAPI,CLIPBOARDPAGE) #20200218T064840.805 GMT:20200228T060401.572 GMT
//	RULE-UTILITY-FUNCTION FLOWACTIONFUA VALIDATEREQUIREDPROPERTIES #20180713T133137.596 GMT:20180713T133137.596 GMT
//	RULE-UTILITY-FUNCTION UTILITIES ESCAPESPECIALCHARSANDQUOTE #20180713T131443.047 GMT:20180713T131443.047 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "1d62761c3eabf38437a17d2437ba4975";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
	}
public String getAspect() {
return "Action";
}
	private boolean CheckPrivileges_circum0()
	{
		boolean hasSecurity = false;
		 String primaryPageClassName = null;
		 if(tools.getPrimaryPage() != null)
			 primaryPageClassName = tools.getPrimaryPage().getString("pxObjClass");
		 if(primaryPageClassName == null) {
		 primaryPageClassName = "Rule-";
		 }
			 if(!hasSecurity && tools.getAuthorizationHandle().havePrivilege(tools,  "AM:RULE-OBJ-FLOWACTION:RULE-!PZUPDATECUSTOMFIELDS",primaryPageClassName, interestPage,true))
			 hasSecurity = true;
		if (!hasSecurity)
			return false;
		
		return true;
	}
	private boolean CheckWhens_circum0()
	{
		return true;
	}

	private boolean AddFlowAction_circum0(String strActionType, ClipboardPage newAssignPage, boolean isSelectedAction, boolean displaySeparatorAbove)
	{
		String strActionName = "pzUpdateCustomFields";
		
		// This flow action is disqualified from bulk processing
		if (tools.getParamValue("PopulateForBulk").equals("true"))
			return false;
		
		if (newAssignPage != null)
		tools.putParamValue("isSystemFlow",newAssignPage.getString("pxSystemFlow"));
		else tools.putParamValue("isSystemFlow","false");
		if (CheckPrivileges_circum0() == false)
			return false;
		if (CheckWhens_circum0() == false)
			return false;
		
		if (newAssignPage == null)
			return false;
		ClipboardProperty pyAssignActions = newAssignPage.getProperty(".pyAssignActions");
		
		if (displaySeparatorAbove)
		{
			// first add the divider ----
			AddActionSeparator(pyAssignActions);
		}
		
		ClipboardPage AssignActionPage = tools.createPage("Embed-Pega-AssignAction", "");
		
		if (tools.getParamValue("bUsesWhenSecurity").equals("true"))
			AssignActionPage.getProperty("pyUsesWhenSecurity").setValue(true);
		else
			AssignActionPage.getProperty("pyUsesWhenSecurity").setValue(false);
		
		// check the help properties and set the action help present property
		String strActionInstructions = "";
		String strActionHelpStream = "";
		if (strActionInstructions.length() > 0 || strActionHelpStream.length() > 0)
			AssignActionPage.putString(".pyActionHelpPresent", "true");
		else
			AssignActionPage.putString(".pyActionHelpPresent", "false");
		
		// read the properties from the Rule-Obj-FlowAction into the assignment
		AssignActionPage.putString(".pyActionHTML", "");
		AssignActionPage.putString(".pyActionInstructions", strActionInstructions);
		AssignActionPage.putString(".pyActionInstructionsCaption", "Instructions");
		String strActionLabel = tools.getLocalizedTextForString("pyCaption", "Add custom fields");
		AssignActionPage.putString(".pyActionLabel", strActionLabel);
		AssignActionPage.putString(".pyLabel", "Add custom fields");
		AssignActionPage.putString(".pyActionName", strActionName);
		AssignActionPage.putString(".pyActionNextAssignment", "true");
		AssignActionPage.putString(".pyActionType", strActionType);
		AssignActionPage.putString(".pyHelpType", "DEFINE");
		AssignActionPage.putString(".pySectionReference", "pzUpdateCustomFields");
		AssignActionPage.putString(".pyStreamType", "Rule-Obj-FlowAction");
		AssignActionPage.putString(".pyOldStreamType", "Rule-HTML-Section");
		AssignActionPage.putString(".pyJSRCompliant", "false");
		AssignActionPage.putString(".pyDisqualifyAction", "true");
		
		// Now add the AssignActionPage to the pyAssignActions list
		pyAssignActions.add(AssignActionPage);
		
		if (isSelectedAction) {
			pega_processengine_flowutilities.pxSetDefaultFlowAction(newAssignPage, pyAssignActions.size(), AssignActionPage);
		}
		return true;
	}

	private void CheckRefreshSettings_circum0(String PageListName)
	{
			ClipboardPage pgRefreshSettingsList = tools.createPage("Code-Pega-List", PageListName);
	}

	private void RunRefreshDataTransform_circum0(String refreshFor){
		ParameterPage newParamsPage = tools.getParameterPage();
		String strTransform = "";
	}
	private void RunFlowActionActivity_circum0(String actType)
	{
		String strActionName = "pzUpdateCustomFields";
		boolean IsPostProcessingSuccess = true;
		String strActivityToRun = "";
		String strTransform = "";
		ParameterPage newParamsPage = tools.getParameterPage();
		
		if (actType.equals("PRE"))
		{
			strActivityToRun = "pzPreProcessingForCustomFields";
			try {
				pega_rules_utilities.callActivity(interestPage, strActivityToRun, newParamsPage);
			} catch (ActivityTerminateException e) {
				throw e;
			} catch (Throwable e) {
				String errorMessage;
				if (e instanceof PRRuntimeError)
					errorMessage = e.getMessage();
				else if (e instanceof PRRuntimeException)
					errorMessage = e.getMessage();
				else if (e instanceof PRException)
					errorMessage = e.getMessage();
				else if (e instanceof PRAppRuntimeException)
					errorMessage = e.getMessage();
				else
					errorMessage = e.toString();
				workPage.addMessage("Flow_PreProcessFail\t" + strActivityToRun + "\t" + errorMessage, "pyMessageLabel", "@baseclass");
				tools.putParamValue("pyErrorMessage", errorMessage);
				tools.putParamValue("pyStackTrace", pega_rules_utilities.getStackTrace(e));
			}
		}
		else if (actType.startsWith("POST"))
		{
			if (actType.equals("POSTCONNECTOR"))
			{
				// Trace Flow Action
				LogTraceEvent(mFlowActionHandle,
					strActionName,
					"Flow Action");
			}
			
				// Save data pages as part of flow processing
			SaveFlowActionDataPages_circum0();
		
		
			strActivityToRun = "pzPostProcessingOfCustomFields";
			if (actType.equals("POSTCONNECTOR"))
			{
				// Trace Post-Processing activity
				LogTraceEvent("Rule-Obj-Activity " + interestPage.getClassName() + "." + strActivityToRun,
					strActionName,
					"Flow Action Activity");
			}
			
			try {
				pega_rules_utilities.callActivity(interestPage, strActivityToRun, newParamsPage);
			} catch (ActivityTerminateException e) {
				throw e;
			} catch (Throwable e) {
				String errorMessage;
				if (e instanceof PRRuntimeError)
					errorMessage = e.getMessage();
				else if (e instanceof PRRuntimeException)
					errorMessage = e.getMessage();
				else if (e instanceof PRException)
					errorMessage = e.getMessage();
				else if (e instanceof PRAppRuntimeException)
					errorMessage = e.getMessage();
				else
					errorMessage = e.toString();
				IsPostProcessingSuccess = false;				workPage.addMessage("Flow_PostProcessFail\t" + strActivityToRun + "\t" + errorMessage, "pyMessageLabel", "@baseclass");
				tools.putParamValue("pyErrorMessage", errorMessage);
				tools.putParamValue("pyStackTrace", pega_rules_utilities.getStackTrace(e));
			}
		}
		else
		{
			workPage.addMessage("Flow_UnsupportedFlowActionType\t" + actType, "pyMessageLabel");
		}
		
	}

	private void SaveFlowActionDataPages_circum0()
	{
		ClipboardPage dataPage;
		boolean IsDataPageSaveSuccess = true;
		String errorMessage;
		
	}

	private boolean ValidateRequiredProperties_circum0()
	{
		// This flow action does not use the first tab to define the html
		return true;
	}

public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
	private com.pega.pegarules.priv.tracer.RuleTraceInfo mTraceInfo;
	private String mRuleSet;
	private String mFlowActionHandle;
	
	private ClipboardPage workPage;
	private ClipboardPage interestPage;
	private ClipboardPage myStepPage;
	private void LogTraceMessage(String message)
	{
		LogTraceEvent(message, "", "Flow Message");
	}

	private void LogTraceEvent(String rulekey, String stepMethod, String eventType)
	{
		HashStringMap optionalProperties = new HashStringMap();
		optionalProperties.putString("FlowActionHandle", mFlowActionHandle);
	
		pega.logTraceEvent("Flow",
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
	
	private void AddActionSeparator(ClipboardProperty pyAssignActions)
	{
		ClipboardPage AssignActionPage = tools.createPage("Embed-Pega-AssignAction", "");
		AssignActionPage.putString(".pyActionName", "");
		AssignActionPage.putString(".pyActionLabel", "-----------");
		AssignActionPage.putString(".pyActionHTML", "");
		AssignActionPage.putString(".pyActionType", "LocalAction");
		AssignActionPage.putString(".pyActionInstructions", "");
		AssignActionPage.putString(".pyActionInstructionsCaption", "");
		AssignActionPage.putString(".pyStreamType", "");
		AssignActionPage.putString(".pyHelpType", "");
		AssignActionPage.putString(".pySectionReference", "");
		AssignActionPage.putString(".pyActionNextAssignment", "");
		AssignActionPage.putString(".pyActionHelpPresent", "");
		pyAssignActions.add(AssignActionPage);
	}



private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-FLOWACTION RULE- PZUPDATECUSTOMFIELDS #20180713T135456.865 GMT", "Rule- pzUpdateCustomFields", "Pega-Desktop", "08-01-01", "20180713T135456.865 GMT");
}
