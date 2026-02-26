package com.pegarules.generated.mapvalue;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public class ra_action_validtransitions_f9bc745c88cb18ad097d48145725b37c  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_MapValue.ValidTransitions.Data_MO_Connector_Transition.Action");
	public ra_action_validtransitions_f9bc745c88cb18ad097d48145725b37c(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT	Pega-ProcessEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
myStepPage = tools.getStepPage();
bInitialChaining = pega.isBackwardChaining();

String strAllowMissingProperties = tools.getParamValue("AllowMissingProperties");
if (strAllowMissingProperties != null) {
	bAllowMissingProperties = tools.interpretBoolean(strAllowMissingProperties);
}

tools.putParamValue("DecisionResult", "");
tools.putParamValue("DecisionMapStatus", "");
tools.putParamValue("DecisionMapInvalidProperty", "");

pega.setBackwardChaining(!bAllowMissingProperties);
try {

if (pega.isTraceEnabled("Declare DecisionMap", oTraceInfo_0)) {
pega.logTraceEvent("Declare DecisionMap", "DecisionMap", null, oTraceInfo_0, "RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT", "Begin", false, myStepPage, null, null);
}

try {
		// First set the generic fields
		mRuleSet = "Pega-ProcessEngine";
		mRuleHandle = "RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT";
		
//If there is a runPathPage then populate it with information about the result paths.
ClipboardPage runPathPage = null;ClipboardProperty pathProp = null;
runPathPage = tools.findPage("runPathPage");
ClipboardProperty runRuleProp = null;
if (runPathPage != null)
{	runRuleProp = runPathPage.getProperty("pyDecisionRules");
	ClipboardPage runRulePage = tools.createPage("Embed-DecisionRuleRun","");
	runRulePage.putString("pyInsKey", "RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT");
	runRulePage.putString("pyAppliesToClass", "Data-MO-Connector-Transition");
	runRulePage.putString("pyDecisionName", "ValidTransitions");
	runRulePage.putString("pyDecisionType", "Rule-Obj-MapValue");
	runRuleProp.add(runRulePage);
	runRulePage = runRuleProp.getPageValue(runRuleProp.size());
	pathProp = runRulePage.getProperty("pyPaths");
}
boolean bDoDecisionPath = (pathProp != null) ? true : false;
		// MapValues preferentially take the input they are called with
		// over what is specified as defaults in the rule
		// First we look at the row input
		String strRowInput = tools.getParamValue("RowInput");
		if (strRowInput == null)
			strRowInput = "";
		String input = strRowInput;
		
		String rowInputValue = "";
		if ((input == null) || input.equals("none") || (input.trim().length() == 0))
		{
			// No default property specified, so keep the initial value above
		}
		else
		{
			rowInputValue = input;
		} // end of else
		
		// Now examine the column input
		boolean bTwoDimensional = true;
		String strColumnInput = tools.getParamValue("ColumnInput");
		if (strColumnInput == null)
			strColumnInput = "";
		input = strColumnInput;
		if (input.equals("none"))
			// This is a 2-dim MapValue treated as 1-dim, so first column will be true
			bTwoDimensional = false;
		
		String columnInputValue = "";
		if ((input == null) || input.equals("none") || (input.trim().length() == 0))
		{
			// Use default input property instead
			String pz_4 = scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
			columnInputValue = pz_4;
		}
		else
		{
			columnInputValue = input;
		} // end of else
		
		int rowResultIndex = 0;
		rowResultIndex = getRowResultIndex_circum0(rowResultIndex,rowInputValue);
		int columnResultIndex = 0;
		if (!bTwoDimensional)
{			// This MapValue is being evaluated in only one-dimension
			columnResultIndex = 1;}
		 else {columnResultIndex = getColumnResultIndex_circum0(columnResultIndex,columnInputValue);}
		// Now we have the row and column indices; find the result and return it
		if (rowResultIndex == 1)
		{
			doRowEval_1_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 2)
		{
			doRowEval_2_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 3)
		{
			doRowEval_3_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 4)
		{
			doRowEval_4_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 5)
		{
			doRowEval_5_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 6)
		{
			doRowEval_6_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 7)
		{
			doRowEval_7_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 8)
		{
			doRowEval_8_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 9)
		{
			doRowEval_9_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 10)
		{
			doRowEval_10_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 11)
		{
			doRowEval_11_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 12)
		{
			doRowEval_12_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
		if (rowResultIndex == 13)
		{
			doRowEval_13_circum0(rowResultIndex,columnResultIndex,bDoDecisionPath,pathProp, runRuleProp);
			return;
		}
} finally {
if (pega.isTraceEnabled("Declare DecisionMap", oTraceInfo_0)) {
pega.logTraceEvent("Declare DecisionMap", "DecisionMap", tools.getParamValue("DecisionResult"), oTraceInfo_0, "RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT", "End", false, myStepPage, null, null);
}
}
	} finally {
		pega.setBackwardChaining(bInitialChaining);
	}
}
} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODCLOSE", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODABSENT", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODACCESS", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODCALL", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODVERSIONFINISH", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODHEADER", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODCALLVERSION", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODVERSIONHEADER", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODFINISH", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODINIT", 
	"Rule-Utility-Function:DECISIONMAPFUA!DECISIONMAPMETHODBODY", 
	"Rule-Obj-MapValue:VALIDTRANSITIONS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-OBJ-MAPVALUE",true,"Rule-Obj-MapValue","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-MAPVALUE DOFUASSEMBLY #20180713T132655.219 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1804759677), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODCLOSE","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODCLOSE #20180713T131434.823 GMT","DECISIONMAPFUA!DECISIONMAPMETHODCLOSE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODABSENT","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODABSENT #20180713T131434.787 GMT","DECISIONMAPFUA!DECISIONMAPMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODACCESS","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODACCESS #20180713T131434.803 GMT","DECISIONMAPFUA!DECISIONMAPMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODCALL","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODCALL #20180713T131434.810 GMT","DECISIONMAPFUA!DECISIONMAPMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODVERSIONFINISH","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODVERSIONFINISH #20180713T131434.914 GMT","DECISIONMAPFUA!DECISIONMAPMETHODVERSIONFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODHEADER","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODHEADER #20180713T131434.905 GMT","DECISIONMAPFUA!DECISIONMAPMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODCALLVERSION","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODCALLVERSION #20180713T131434.818 GMT","DECISIONMAPFUA!DECISIONMAPMETHODCALLVERSION",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODVERSIONHEADER","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODVERSIONHEADER #20180713T131434.919 GMT","DECISIONMAPFUA!DECISIONMAPMETHODVERSIONHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODFINISH","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODFINISH #20180713T131434.901 GMT","DECISIONMAPFUA!DECISIONMAPMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODINIT","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODINIT #20180713T131434.910 GMT","DECISIONMAPFUA!DECISIONMAPMETHODINIT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONMAPFUA!DECISIONMAPMETHODBODY","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODBODY #20180713T131434.807 GMT","DECISIONMAPFUA!DECISIONMAPMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("VALIDTRANSITIONS","Rule-Obj-MapValue","DATA-MO-CONNECTOR-TRANSITION",false,"","Pega-ProcessEngine","08-01-01","RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT","!VALIDTRANSITIONS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",650695747)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-MAPVALUE DOFUASSEMBLY #20180713T132655.219 GMT:crc:1804759677
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODABSENT #20180713T131434.787 GMT:20180713T131434.787 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODACCESS #20180713T131434.803 GMT:20180713T131434.803 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODBODY #20180713T131434.807 GMT:20180713T131434.807 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODCALL #20180713T131434.810 GMT:20180713T131434.810 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODFINISH #20180713T131434.901 GMT:20180713T131434.901 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODHEADER #20180713T131434.905 GMT:20180713T131434.905 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODVERSIONHEADER #20180713T131434.919 GMT:20180713T131434.919 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODCALLVERSION #20180713T131434.818 GMT:20180713T131434.818 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODVERSIONFINISH #20180713T131434.914 GMT:20180713T131434.914 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODINIT #20180713T131434.910 GMT:20180713T131434.910 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODCLOSE #20180713T131434.823 GMT:20180713T131434.823 GMT
//	RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT:20180713T133119.108 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DECISION ADDRUNRULEDATA #20180713T131434.648 GMT:20180713T131434.648 GMT
//	RULE-UTILITY-FUNCTION DECISION BREAKUPCONDITION #20180713T131434.661 GMT:20180713T131434.661 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAALLOWEDVALUESPROPERTYSET #20180713T131434.682 GMT:20180713T131434.682 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAHANDLECHANGETRACKING #20180713T131434.703 GMT:20180713T131434.703 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAINITIALPROPERTYSET #20180713T131434.709 GMT:20180713T131434.709 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAPROCESSINPUT #20180713T131434.713 GMT:20180713T131434.713 GMT
//	RULE-UTILITY-FUNCTION DECISION GETLOCALTYPE #20180713T131434.726 GMT:20180713T131434.726 GMT
//	RULE-UTILITY-FUNCTION DECISION ISLITERALEXPRESSIONVALID--(PUBLI7AF94A074F9D1321648BB8A6AA837EE4 #20180713T131434.751 GMT:20180713T131434.751 GMT
//	RULE-UTILITY-FUNCTION DECISION ISVALIDFORTYPE #20180713T131434.762 GMT:20180713T131434.762 GMT
//	RULE-UTILITY-FUNCTION DECISION LOGTRACEEVENT--(STRING,COM.PEGA.27AA8E22C35B916AEF7C412FBE9721E1 #20180713T131434.779 GMT:20180713T131434.779 GMT
//	RULE-UTILITY-FUNCTION DECISION VALIDATERESULTS #20180713T131435.158 GMT:20180713T131435.158 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODBODY #20180713T131434.807 GMT:20180713T131434.807 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODCLOSE #20180713T131434.823 GMT:20180713T131434.823 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODFINISH #20180713T131434.901 GMT:20180713T131434.901 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODHEADER #20180713T131434.905 GMT:20180713T131434.905 GMT
//	RULE-UTILITY-FUNCTION DECISIONMAPFUA DECISIONMAPMETHODINIT #20180713T131434.910 GMT:20180713T131434.910 GMT
//	RULE-UTILITY-FUNCTION DEFAULT QUOTE #20180713T131438.272 GMT:20180713T131438.272 GMT
//	RULE-UTILITY-FUNCTION DEFAULT QUOTEANDESCAPE #20180713T131438.278 GMT:20180713T131438.278 GMT
//	RULE-UTILITY-FUNCTION DEFAULT UNQUOTE #20180713T131438.311 GMT:20180713T131438.311 GMT
//	RULE-UTILITY-FUNCTION RULESHORTCUTASSEMBLY ISRULEREDIRECTED #20180713T131441.512 GMT:20180713T131441.512 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING REPLACEALL #20180713T131442.783 GMT:20180713T131442.783 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8ae34ffe1860b3f46afc36ca31c23fa9";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-MO-Connector-Transition";
	}
public String getAspect() {
return "Action";
}
		void doRowEval_1_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("1");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("1");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("1");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("1");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("1");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("1");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("1");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_2_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("2");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("2");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("2");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("2");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("2");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("2");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("2");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_3_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("3");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("3");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("3");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("3");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("3");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("3");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("3");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_4_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("4");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("4");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("4");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("4");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("4");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("4");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("4");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_5_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("5");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("5");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("5");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("5");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("5");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("5");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("5");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_6_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("6");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("6");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("6");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("6");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("6");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("6");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("6");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_7_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("7");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("7");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("7");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("7");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("7");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("7");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("7");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_8_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("8");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("8");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("8");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("8");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("8");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("8");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("8");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_9_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("9");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("9");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("9");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("9");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("9");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("9");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("9");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_10_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("10");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("10");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("10");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("10");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("10");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("10");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("10");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_11_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("11");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("11");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("11");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("11");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("11");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("11");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("11");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_12_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("12");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("12");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("12");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("12");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("12");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("12");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("12");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
		void doRowEval_13_circum0(int rowResultIndex, int columnResultIndex,boolean bDoDecisionPath,ClipboardProperty pathProp, ClipboardProperty runRuleProp) {
			if (columnResultIndex == 1)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("13");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("1");
			}
				return;
			}
			else if (columnResultIndex == 2)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("13");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("2");
			}
				return;
			}
			else if (columnResultIndex == 3)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("13");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("3");
			}
				return;
			}
			else if (columnResultIndex == 4)
			{
				PerformPropertySets_circum0("Valid");
// Expression: Valid
				tools.putParamValue("DecisionResult", "Valid");
			if (bDoDecisionPath) {
				pathProp.add("13");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("4");
			}
				return;
			}
			else if (columnResultIndex == 5)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("13");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("5");
			}
				return;
			}
			else if (columnResultIndex == 6)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("13");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("6");
			}
				return;
			}
			else if (columnResultIndex == 7)
			{
				PerformPropertySets_circum0("Invalid");
// Expression: Invalid
				tools.putParamValue("DecisionResult", "Invalid");
			if (bDoDecisionPath) {
				pathProp.add("13");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");

			}			if (bDoDecisionPath) {
				pathProp.add("7");
			}
				return;
			}
		}
	int getRowResultIndex_circum0(int rowResultIndex,String rowInputValue) {
		String input = "";
		boolean bCondition = false;
		// MapValues preferentially take the input they are called with
		// over what is specified as defaults in the rule
		// First we look at the row input
		String strRowInput = tools.getParamValue("RowInput");
		if (strRowInput == null)
			strRowInput = "";
		input = strRowInput;
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Event-End"
// Expression: Local.rowInputValue == "Data-MO-Event-End"
			bCondition = (rowInputValue.equals("Data-MO-Event-End"));
			if (bCondition)
				rowResultIndex = 1;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Event-Start"
// Expression: Local.rowInputValue == "Data-MO-Event-Start"
			bCondition = (rowInputValue.equals("Data-MO-Event-Start"));
			if (bCondition)
				rowResultIndex = 2;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Event-StartScreenFlow"
// Expression: Local.rowInputValue == "Data-MO-Event-StartScreenFlow"
			bCondition = (rowInputValue.equals("Data-MO-Event-StartScreenFlow"));
			if (bCondition)
				rowResultIndex = 3;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Activity-SubProcess-Spinoff"
// Expression: Local.rowInputValue == "Data-MO-Activity-SubProcess-Spinoff"
			bCondition = (rowInputValue.equals("Data-MO-Activity-SubProcess-Spinoff"));
			if (bCondition)
				rowResultIndex = 4;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Activity-Assignment"
// Expression: Local.rowInputValue == "Data-MO-Activity-Assignment"
			bCondition = (rowInputValue.equals("Data-MO-Activity-Assignment"));
			if (bCondition)
				rowResultIndex = 5;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Activity-Assignment-WorkAction"
// Expression: Local.rowInputValue == "Data-MO-Activity-Assignment-WorkAction"
			bCondition = (rowInputValue.equals("Data-MO-Activity-Assignment-WorkAction"));
			if (bCondition)
				rowResultIndex = 6;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Activity-Assignment-Invoke"
// Expression: Local.rowInputValue == "Data-MO-Activity-Assignment-Invoke"
			bCondition = (rowInputValue.equals("Data-MO-Activity-Assignment-Invoke"));
			if (bCondition)
				rowResultIndex = 7;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Activity-Assignment-WorkList"
// Expression: Local.rowInputValue == "Data-MO-Activity-Assignment-WorkList"
			bCondition = (rowInputValue.equals("Data-MO-Activity-Assignment-WorkList"));
			if (bCondition)
				rowResultIndex = 8;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Activity-Assignment-WorkBasket"
// Expression: Local.rowInputValue == "Data-MO-Activity-Assignment-WorkBasket"
			bCondition = (rowInputValue.equals("Data-MO-Activity-Assignment-WorkBasket"));
			if (bCondition)
				rowResultIndex = 9;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Gateway-Decision"
// Expression: Local.rowInputValue == "Data-MO-Gateway-Decision"
			bCondition = (rowInputValue.equals("Data-MO-Gateway-Decision"));
			if (bCondition)
				rowResultIndex = 10;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Gateway-DataXOR"
// Expression: Local.rowInputValue == "Data-MO-Gateway-DataXOR"
			bCondition = (rowInputValue.equals("Data-MO-Gateway-DataXOR"));
			if (bCondition)
				rowResultIndex = 11;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is = "Data-MO-Activity-Assignment-Wait"
// Expression: Local.rowInputValue == "Data-MO-Activity-Assignment-Wait"
			bCondition = (rowInputValue.equals("Data-MO-Activity-Assignment-Wait"));
			if (bCondition)
				rowResultIndex = 12;
		}
		
		if (rowResultIndex == 0)
		{
			// row condition is Default
			bCondition = true;
			if (bCondition)
				rowResultIndex = 13;
		}
		
	return rowResultIndex;}
	int getColumnResultIndex_circum0(int columnResultIndex,String columnInputValue) {
		String input = "";
		boolean bCondition = false;
		// Now examine the column input
		boolean bTwoDimensional = true;
		String strColumnInput = tools.getParamValue("ColumnInput");
		if (strColumnInput == null)
			strColumnInput = "";
		input = strColumnInput;
		if (input.equals("none"))
			// This is a 2-dim MapValue treated as 1-dim, so first column will be true
			return 1;
		
		if (columnResultIndex == 0)
		{
			// column condition is = Always
// Expression: Local.columnInputValue == "Always"
			bCondition = (columnInputValue.equals("Always"));
			if (bCondition)
				columnResultIndex = 1;
		}
		
		if (columnResultIndex == 0)
		{
			// column condition is = Else
// Expression: Local.columnInputValue == "Else"
			bCondition = (columnInputValue.equals("Else"));
			if (bCondition)
				columnResultIndex = 2;
		}
		
		if (columnResultIndex == 0)
		{
			// column condition is = Status
// Expression: Local.columnInputValue == "Status"
			bCondition = (columnInputValue.equals("Status"));
			if (bCondition)
				columnResultIndex = 3;
		}
		
		if (columnResultIndex == 0)
		{
			// column condition is = When
// Expression: Local.columnInputValue == "When"
			bCondition = (columnInputValue.equals("When"));
			if (bCondition)
				columnResultIndex = 4;
		}
		
		if (columnResultIndex == 0)
		{
			// column condition is = Action
// Expression: Local.columnInputValue == "Action"
			bCondition = (columnInputValue.equals("Action"));
			if (bCondition)
				columnResultIndex = 5;
		}
		
		if (columnResultIndex == 0)
		{
			// column condition is = Percentage
// Expression: Local.columnInputValue == "Percentage"
			bCondition = (columnInputValue.equals("Percentage"));
			if (bCondition)
				columnResultIndex = 6;
		}
		
		if (columnResultIndex == 0)
		{
			// column condition is Default
			bCondition = true;
			if (bCondition)
				columnResultIndex = 7;
		}
		
		return columnResultIndex;
	}
	void PerformPropertySets_circum0(String strValue)
	{
		// We do not worry about missing properties in this section
		pega.setBackwardChaining(false);
		
		if (strValue.equals("Valid"))
		{
		}
		
		else if (strValue.equals("Invalid"))
		{
		}
		
		// restore the allow missing properties setting
		pega.setBackwardChaining(!bAllowMissingProperties);
	}
	
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private ClipboardPage myStepPage;
private String mRuleSet;
private String mRuleHandle;
private boolean bAllowMissingProperties = false;
private boolean bInitialChaining;

	void logPropertySetTraceEvent(String sEventType, String sEventName,
			String sRuleSet, String sPropertyName, String sPropertyValue) {
		if (pega.isTraceEnabled(sEventType, sRuleSet)) {
			pega.logTraceEvent(sEventType, sEventName, "", sRuleSet,
				sPropertyName + " = " + sPropertyValue,"Property-Set",
				false, tools.getPrimaryPage(), tools.getStackFrame().getParameterPage(), null);
		}
	}


private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyConditionType").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyConditionType").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MAPVALUE DATA-MO-CONNECTOR-TRANSITION VALIDTRANSITIONS #20180713T133119.108 GMT", "Data-MO-Connector-Transition ValidTransitions", "Pega-ProcessEngine", "08-01-01", "20180713T133119.108 GMT");
}
