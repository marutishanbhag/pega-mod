package com.pegarules.generated.template;
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
public class ra_action_pxdevicetype_616bcc3fb7b1e6d843a43c4b7dbf1a30  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Circumstance_Template.pxDeviceType.Data_Portal.Action");
	public ra_action_pxdevicetype_616bcc3fb7b1e6d843a43c4b7dbf1a30(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
public void perform() {
	myStepPage = tools.getStepPage();
	bInitialChaining = pega.isBackwardChaining();
	
	String strAllowMissingProperties = tools.getParamValue("AllowMissingProperties");
	if (strAllowMissingProperties != null)
		bAllowMissingProperties = tools.interpretBoolean(strAllowMissingProperties);
		
	tools.putParamValue("DecisionResult", "");
	tools.putParamValue("DecisionTableStatus", "");
	tools.putParamValue("DecisionTableInvalidProperty", "");

	pega.setBackwardChaining(!bAllowMissingProperties);
	try {

/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance 	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
		 bConditions_circum0 = new boolean[1];
evaluateDecisionTable_circum0();
} finally {
}
}
	} finally {
		pega.setBackwardChaining(bInitialChaining);
	}
} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:DECISIONTABLEFUA!DECISIONTABLEMETHODABSENT", 
	"Rule-Utility-Function:DECISIONTABLEFUA!DECISIONTABLEMETHODBODY", 
	"Rule-Utility-Function:DECISIONTABLEFUA!DECISIONTABLEMETHODCALL", 
	"Rule-Utility-Function:DECISIONTABLEFUA!DECISIONTABLEMETHODACCESS", 
	"Rule-Utility-Function:DECISIONTABLEFUA!TEMPLATEMETHODHEADER", 
	"Rule-Utility-Function:DECISIONTABLEFUA!DECISIONTABLEMETHODFINISH", 
	"Rule-Obj-Property:PXDEVICETYPE", 
	"Rule-Circumstance-Template:PXDEVICETYPE", 
	"Rule-Circumstance-Definition:PXDEVICETYPE!PHONE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-CIRCUMSTANCE-TEMPLATE",true,"Rule-Circumstance-Template","Pega-RULES","08-01-01","RULE-OBJ-ACTIVITY RULE-CIRCUMSTANCE-TEMPLATE DOFUASSEMBLY #20180713T131352.799 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("DECISIONTABLEFUA!DECISIONTABLEMETHODABSENT","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODABSENT #20180713T131434.932 GMT","DECISIONTABLEFUA!DECISIONTABLEMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONTABLEFUA!DECISIONTABLEMETHODBODY","Rule-Utility-Function","",false,"","Pega-RULES","08-07-01","RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODBODY #20210322T164655.531 GMT","DECISIONTABLEFUA!DECISIONTABLEMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONTABLEFUA!DECISIONTABLEMETHODCALL","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODCALL #20180713T131434.959 GMT","DECISIONTABLEFUA!DECISIONTABLEMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONTABLEFUA!DECISIONTABLEMETHODACCESS","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODACCESS #20180713T131434.935 GMT","DECISIONTABLEFUA!DECISIONTABLEMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONTABLEFUA!TEMPLATEMETHODHEADER","Rule-Utility-Function","",false,"","Pega-RULES","08-01-01","RULE-UTILITY-FUNCTION DECISIONTABLEFUA TEMPLATEMETHODHEADER #20180713T131434.996 GMT","DECISIONTABLEFUA!TEMPLATEMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("DECISIONTABLEFUA!DECISIONTABLEMETHODFINISH","Rule-Utility-Function","",false,"","Pega-RULES","08-02-01","RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODFINISH #20181112T172738.580 GMT","DECISIONTABLEFUA!DECISIONTABLEMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PXDEVICETYPE","Rule-Obj-Property","CODE-PEGA-REQUESTOR",true,"Code-Pega-Requestor","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-REQUESTOR PXDEVICETYPE #20180713T135016.282 GMT","!PXDEVICETYPE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXDEVICETYPE","Rule-Circumstance-Template","@BASECLASS",false,"","Theme-Cosmos","04-01-01","RULE-CIRCUMSTANCE-TEMPLATE @BASECLASS PXDEVICETYPE #20210506T204025.611 GMT","!PXDEVICETYPE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-782254720), 
		new DependentRuleInfo("PXDEVICETYPE!PHONE","Rule-Circumstance-Definition","@BASECLASS",false,"","Theme-Cosmos","04-01-01","RULE-CIRCUMSTANCE-DEFINITION @BASECLASS PXDEVICETYPE!PHONE #20210506T204025.579 GMT","!PXDEVICETYPE!PHONE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-251729752)
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
//	RULE-OBJ-ACTIVITY RULE-CIRCUMSTANCE-TEMPLATE DOFUASSEMBLY #20180713T131352.799 GMT:20180713T131352.799 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODABSENT #20180713T131434.932 GMT:20180713T131434.932 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODACCESS #20180713T131434.935 GMT:20180713T131434.935 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODBODY #20210322T164655.531 GMT:20210322T164655.531 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODCALL #20180713T131434.959 GMT:20180713T131434.959 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODFINISH #20181112T172738.580 GMT:20181113T192900.730 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA TEMPLATEMETHODHEADER #20180713T131434.996 GMT:20180713T131434.996 GMT
//	RULE-CIRCUMSTANCE-TEMPLATE @BASECLASS PXDEVICETYPE #20210506T204025.611 GMT:20210506T204025.611 GMT
//	RULE-CIRCUMSTANCE-DEFINITION @BASECLASS PXDEVICETYPE!PHONE #20210506T204025.579 GMT:20210506T204025.579 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-REQUESTOR PXDEVICETYPE #20180713T135016.282 GMT:20180713T135016.282 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-REQUESTOR PXDEVICETYPE #20180713T135016.282 GMT:20180713T135016.282 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DECISION ADDRUNRULEDATA #20180713T131434.648 GMT:20180713T131434.648 GMT
//	RULE-UTILITY-FUNCTION DECISION BREAKUPCONDITION #20180713T131434.661 GMT:20180713T131434.661 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAALLOWEDVALUESPROPERTYSET #20180713T131434.682 GMT:20180713T131434.682 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAEXPRESSION--(PUBLICAPI,CLIPBO917A16913494B72C8895425D799766D9 #20180713T131434.691 GMT:20180713T131434.691 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAHANDLECHANGETRACKING #20180713T131434.703 GMT:20180713T131434.703 GMT
//	RULE-UTILITY-FUNCTION DECISION FUAINITIALPROPERTYSET #20180713T131434.709 GMT:20180713T131434.709 GMT
//	RULE-UTILITY-FUNCTION DECISION GETLOCALTYPE #20180713T131434.726 GMT:20180713T131434.726 GMT
//	RULE-UTILITY-FUNCTION DECISION GETSUBSTITUTEKEYWORD--(CLIPBOARDPAGE) #20180713T131434.734 GMT:20180713T131434.734 GMT
//	RULE-UTILITY-FUNCTION DECISION ISLITERALEXPRESSIONVALID #20180713T131434.747 GMT:20180713T131434.747 GMT
//	RULE-UTILITY-FUNCTION DECISION VALIDATERESULTS #20180713T131435.158 GMT:20180713T131435.158 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODBODY #20210322T164655.531 GMT:20210322T164655.531 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODFINISH #20181112T172738.580 GMT:20181113T192900.730 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA DECISIONTABLEMETHODHEADER #20180713T131434.985 GMT:20180713T131434.985 GMT
//	RULE-UTILITY-FUNCTION DECISIONTABLEFUA TEMPLATEMETHODHEADER #20180713T131434.996 GMT:20180713T131434.996 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASPRIMARYPAGE #20180713T131436.747 GMT:20180713T131436.747 GMT
//	RULE-UTILITY-FUNCTION DEFAULT ISJAVARESERVEDWORD #20180713T131436.845 GMT:20180713T131436.845 GMT
//	RULE-UTILITY-FUNCTION DEFAULT QUOTE #20180713T131438.272 GMT:20180713T131438.272 GMT
//	RULE-UTILITY-FUNCTION DEFAULT UNQUOTE #20180713T131438.311 GMT:20180713T131438.311 GMT
//	RULE-UTILITY-FUNCTION DEFAULT VALIDATEUNICODEIDENTIFIER #20180713T131438.339 GMT:20180713T131438.339 GMT
//	RULE-UTILITY-FUNCTION RULESHORTCUTASSEMBLY ISRULEREDIRECTED #20180713T131441.512 GMT:20180713T131441.512 GMT
//	RULE-UTILITY-FUNCTION STRING INSTRING #20180713T131441.635 GMT:20180713T131441.635 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING REPLACEALL #20180713T131442.783 GMT:20180713T131442.783 GMT
//	RULE-UTILITY-FUNCTION STRING WHATCOMESAFTERLAST #20180713T131442.850 GMT:20180713T131442.850 GMT
//	RULE-UTILITY-FUNCTION STRING WHATCOMESBEFOREFIRST #20180713T131442.854 GMT:20180713T131442.854 GMT
//	RULE-UTILITY-FUNCTION STRING WHATCOMESBEFORELAST #20180713T131442.860 GMT:20180713T131442.860 GMT
//	RULE-UTILITY-FUNCTION UTILITIES FINDCLASSOFPAGEREFERENCE #20190724T221819.167 GMT:20190724T221819.167 GMT
//	RULE-UTILITY-FUNCTION UTILITIES FINDCLASSOFPAGEREFERENCECONDITIONAL #20190724T221819.246 GMT:20190724T221819.246 GMT
//	RULE-UTILITY-FUNCTION UTILITIES FINDPARENTCLASSOFPAGEREFERENCE #20180713T131443.079 GMT:20180713T131443.079 GMT
//	RULE-UTILITY-FUNCTION UTILITIES GETDATASYSTEMSETTING #20180713T131443.105 GMT:20180713T131443.105 GMT
//	RULE-UTILITY-FUNCTION UTILITIES GETPROPERTYCLASSANDNAME #20180713T131443.190 GMT:20180713T131443.190 GMT
//	RULE-UTILITY-FUNCTION UTILITIES ISINPAGELIST #20180713T131444.398 GMT:20180713T131444.398 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "95772969124ad683c8a204181334eb5d";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
class RowBlock_circum0{
	boolean evaluateRowConditions_circum0(int row, boolean bDoDecisionPath, ClipboardProperty pathProp, ClipboardProperty runRuleProp){
	return false;
	}
	void doRows_circum0(int row){
	}
	void doPropSets_circum0(int row, int col){
	}
}
public void evaluateDecisionTable_circum0(){
		 bConditions_circum0 = new boolean[1];
		// First set the generic fields
		mRuleSet = "Theme-Cosmos";
		mRuleHandle = "RULE-DECLARE-DECISIONTABLE @BASECLASS PXDEVICETYPE #20260221T064223.831 GMT";
		
//If there is a runPathPage then populate it with information about the result paths.
ClipboardPage runPathPage = null;ClipboardProperty pathProp = null;
runPathPage = tools.findPage("runPathPage");
ClipboardProperty runRuleProp = null;
if (runPathPage != null)
{	runRuleProp = runPathPage.getProperty("pyDecisionRules");
	ClipboardPage runRulePage = tools.createPage("Embed-DecisionRuleRun","");
	runRulePage.putString("pyInsKey", "");
	runRulePage.putString("pyAppliesToClass", "@baseclass");
	runRulePage.putString("pyDecisionName", "pxDeviceType");
	runRulePage.putString("pyDecisionType", "Rule-Declare-DecisionTable");
	runRuleProp.add(runRulePage);
	runRulePage = runRuleProp.getPageValue(runRuleProp.size());
	pathProp = runRulePage.getProperty("pyPaths");
}
boolean bDoDecisionPath = false;
colVar1Set = false;
		propSetValues_circum0 = new String[1];
		// Now go through the rows and evaluate each cell
		// If all the cells in a row are true, then we have found our result
		
for(int i = 0; i < 1; i++){
	for(int j = 0; j < 1000 && ((i * 1000) + j) < 1; j++){
		if(rowBlocks_circum0[i].evaluateRowConditions_circum0(j,bDoDecisionPath,pathProp,runRuleProp ))
			return;
	}
}
		// Return the default
			if (bDoDecisionPath) {
				pathProp.add("pyDefaultResult");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");
		}
		PerformPropertySets_circum0("\"\"");
		
		tools.putParamValue("DecisionResult", "");

} //end of evaluateDecisionTable

class RowBlock0_circum0 extends RowBlock_circum0{
	boolean evaluateRowConditions_circum0(int row, boolean bDoDecisionPath, ClipboardProperty pathProp, ClipboardProperty runRuleProp){
switch(row){
		case 0:
			if(evaluateRow_circum0(0, "Phone", bDoDecisionPath, pathProp, runRuleProp))
			{
				tools.putParamValue("DecisionResult", "Phone");
			return true;			}
			return false;			default: return false;
		}
	}
void doRows_circum0(int row)
	{
int lowerLimit=0;String str="";lowerLimit = row-row%100 + 0 % 100 ;	switch(lowerLimit) { 
		case 0: 
		doRows_circum0_0_99(row);
		break;
	}
}
void doRows_circum0_0_99(int row)
	{
		switch(row) {			case 0:
if(colVar1Set == false) {			setColVar1_circum0();
	}
		bConditions_circum0[0] = (colVar1_circum0.equals("phone"));
if(!bConditions_circum0[0]) {		return;
	}
		break;
			default: break;
		
}
	
}
	void setColVar1_circum0()
	{
		String pz_4 = scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT);
		colVar1_circum0 = pz_4;
		colVar1Set = true;
	}
	
void doPropSets_circum0(int row, int col)
	{
int lowerLimit=0;String str="";lowerLimit = row-row%100 + 0 % 100 ;	switch(lowerLimit) { 
		case 0: 
	doPropSets_circum0_0_99(row, col);
		break;
	}
	}
void doPropSets_circum0_0_99(int row, int col)
	{
		switch(row) {			case 0:
			switch(col) {				case 1:
		propSetValues_circum0[0] = null;
		break;
				default: break;
			}
		break;
			default: break;
		}
	}

}
RowBlock_circum0[] rowBlocks_circum0 = {new RowBlock0_circum0()};
	boolean evaluateRow_circum0(int row, String strResult,boolean bDoDecisionPath,ClipboardProperty pathProp,ClipboardProperty runRuleProp)
	{
int rowBlockIndex = row / 1000;
rowBlocks_circum0[rowBlockIndex].doRows_circum0(row);
		if (!bConditions_circum0[0]) {return false; }
			PerformPropertySets_circum0(strResult);
			if (bDoDecisionPath) {
				pathProp.add(row+1+"");
			ClipboardPage runRulePage = runRuleProp.getPageValue(runRuleProp.size());
			runRulePage.putString("pyDecisionRes", "true");
		}
		
			
		return true;	}
	void PerformPropertySets_circum0(String strValue)
	{
		// We do not worry about missing properties in this section
		pega.setBackwardChaining(false);
		
		if (strValue.equals(""))
		{
		}
		
		// restore the allow missing properties setting
		pega.setBackwardChaining(!bAllowMissingProperties);
	}
	
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
	// Log Property Set Trace for Decision Table Event
	void logPropertySetTraceEvent(String sEventType, String sEventName,
			String sRuleSet, String sPropertyName, String sPropertyValue) {
		if (pega.isTraceEnabled(sEventType, sRuleSet)) {
			pega.logTraceEvent(sEventType, sEventName, "", sRuleSet,
				sPropertyName + " = " + sPropertyValue,"Property-Set",
				false, tools.getPrimaryPage(), tools.getStackFrame().getParameterPage(), null);
		}
	}

private ClipboardPage myStepPage;
private String mRuleSet;
private String mRuleHandle;
private boolean bAllowMissingProperties = false;
private boolean bInitialChaining;
private double cellDateValue = 0;
		String colVar1_circum0 = "";
		boolean colVar1Set = false;
		public boolean[] bConditions_circum0;		public String[] propSetValues_circum0;public void invokeBaseDecision() {

}

private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pxDeviceType").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pxDeviceType").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("", "@baseclass pxDeviceType", "Theme-Cosmos", "04-01-01", null);
}
