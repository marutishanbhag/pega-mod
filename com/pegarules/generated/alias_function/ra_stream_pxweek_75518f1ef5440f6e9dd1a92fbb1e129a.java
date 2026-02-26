package com.pegarules.generated.alias_function;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
import com.pega.pegarules.jsptags.TagTools;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.context.PegaThread;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.ComplexParameterPage;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.util.JSPResponse;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.generator.*;
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
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
/**
 * Builds JSP stream EMBED-USERFUNCTION!PXWEEK.
 */
public class ra_stream_pxweek_75518f1ef5440f6e9dd1a92fbb1e129a extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Alias_Function.pxWeek.Embed_UserFunction.Stream");
/** The current stream builder. */
	/** Properties of the stream definition for the stream that included the current stream (or null if none). */
	private Map mParentStreamProperties = null;

	/** The handle of the current stream. */
	protected String pz_CurrentRuleKey;
private IControlRuntimeUtilities controlRuntimeUtilities = null;

/**
 * Creates a stream builder.
 *
 * @param aContext the current executable
 */
	public ra_stream_pxweek_75518f1ef5440f6e9dd1a92fbb1e129a(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "bc645797408139df3799b87cdb3a0336d030797e";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
previousTemplatingStatus = '\0';
	pzAuto.beginStream(pega);
	initRequiredPages();
pageContext = pega.getJSPFactory().getPageContext(mHttpServlet, request, mStreamResponse, null, true, 0, true);
application = pageContext.getServletContext();
out = pageContext.getOut();
session = pageContext.getSession();
mStreamResponse.setContentType("text/html;charset=UTF-8");
try {
final PegaThread thread_1 = (PegaThread) pega.getThread();
Date ruleResolutionDate_1 = thread_1.getRuleDateOverride();
if (ruleResolutionDate_1 == null) {
	ruleResolutionDate_1 = new Date();
}
final RuleChooser ruleChooser_1 = ((PegaDatabase) tools.getDatabase()).getRuleChooser(tools.getThread());
/* handling 1 of 5 definitions  */
if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyProductType", "TERADATA", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT	Pega-RulesEngine:08-01-01	.pyProductType=TERADATA	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_1();
/* handling 2 of 5 definitions  */
} else if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyProductType", "SQLSERVER", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT	Pega-RulesEngine:08-01-01	.pyProductType=SQLSERVER	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_2();
/* handling 3 of 5 definitions  */
} else if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyProductType", "POSTGRESQL", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT	Pega-RulesEngine:08-01-01	.pyProductType=POSTGRESQL	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_3();
/* handling 4 of 5 definitions  */
} else if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyProductType", "ORACLE", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT	Pega-RulesEngine:08-01-01	.pyProductType=ORACLE	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_4();
/* handling 5 of 5 definitions (isLast)  */
} else {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT	Pega-RulesEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_5();
}
	} catch (Throwable ex) {
		handleError(ex);
	} finally {
		pzAuto.finishStream();
		if (pega.getJSPFactory() != null) {
			pega.getJSPFactory().releasePageContext(pageContext);
		}
		pega.returnHTTPServletRequest(request);
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Alias-Function:PXWEEK", 
	"Rule-Alias-Function:PXWEEK", 
	"Rule-Alias-Function:PXWEEK", 
	"Rule-Alias-Function:PXWEEK", 
	"Rule-Alias-Function:PXWEEK", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXWEEK","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-RulesEngine","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT","!PXWEEK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1243171286), 
		new DependentRuleInfo("PXWEEK","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-RulesEngine","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT","!PXWEEK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2009652548), 
		new DependentRuleInfo("PXWEEK","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-RulesEngine","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT","!PXWEEK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-51220914), 
		new DependentRuleInfo("PXWEEK","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-RulesEngine","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT","!PXWEEK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",174951396), 
		new DependentRuleInfo("PXWEEK","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-RulesEngine","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT","!PXWEEK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",849769573), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-Alias-Function","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1)
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
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT:20180713T132610.980 GMT
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT:20180713T132610.971 GMT
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT:20180713T132610.963 GMT
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT:20180713T132610.952 GMT
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT:20180713T132610.988 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "b0d5b664794daba8175f0dc50fb0d073";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-UserFunction";
	}
public String getAspect() {
return "Stream";
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_11() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t");
if (!foundChoice && when_1(".pyParameters(1).pyDBDataType", "TIMESTAMP")) {
tools.appendString("\n\t\tSUBSTR(REPLACE(VARCHAR(TIMESTAMP(DATE({1}) - ( DAYOFWEEK({1})-1 ) DAYS,'00.00.00') ),'-',''), 1, 8)\n         ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t");
if (!foundChoice) {
tools.appendString("\n\t(CASE WHEN {1} IS NOT NULL \n          THEN \t\tSUBSTR(REPLACE(VARCHAR(TIMESTAMP(SUBSTR({1}, 1, 8) ||'000000') - ( DAYOFWEEK(TIMESTAMP(SUBSTR({1}, 1, 8) ||'000000'))-1 ) DAYS),'-',''), 1, 8)        \n          END)\n\t");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_10() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t     ");
if (!foundChoice && when_1(".pyParameters(1).pyDBDataType", "DATE")) {
tools.appendString("\n\t\t  SUBSTR(REPLACE(VARCHAR(TIMESTAMP(({1}) - ( DAYOFWEEK({1})-1 ) DAYS,'00.00.00') ),'-',''), 1, 8)\n             ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n             ");
if (!foundChoice) {
tools.appendString("\n                 (CASE WHEN {1} IS NOT NULL \t\n                       THEN\n\t              SUBSTR(REPLACE(VARCHAR(TIMESTAMP(SUBSTR({1}, 1, 8) ||'000000') - ( DAYOFWEEK(TIMESTAMP(SUBSTR({1}, 1, 8) ||'000000'))-1 ) DAYS),'-',''), 1, 8)        \n                 END) \n            ");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_12() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATE")) {
tools.appendString("\n         ");
choose_10();
tools.appendString("\n         \n");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATETIME")) {
tools.appendString("\n     ");
choose_11();
tools.appendString("\n     \n");

foundChoice = !pega.isPreviewMode();
}
}
private void performStream_5() throws Throwable {
choose_12();
tools.appendString("\n");
}
private static final Map oPropDefinitions_5 = null;
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Final");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "");
	oStreamProperties_5.put("pyClassName", "Embed-UserFunction");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-RulesEngine");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "");
	oStreamProperties_5.put("pyRuleSetVersion", "08-01-01");
}
private boolean when_2(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((areValsEqual(getPropertyVal(tools, aParam1), aParam2)) || (areValsEqual(getPropertyVal(tools, aParam3), aParam4))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_8() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t");
if (!foundChoice && when_2(".pyParameters(1).pyDBDataType", "DATE", ".pyParameters(1).pyDBDataType", "TIMESTAMP")) {
tools.appendString("\n\t        \n\t\t\tTO_CHAR((TRUNC(({1}+1), 'IW')-1),'YYYYMMDD')\n\t\t\t\n\t");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t");
if (!foundChoice) {
tools.appendString("\n\t(CASE WHEN {1} IS NOT NULL \n          THEN \n\t\t  TO_CHAR(TO_DATE(SUBSTR({1},1,8), 'YYYYMMDD') - (((TRUNC(TO_DATE(SUBSTR({1},1,8), 'YYYYMMDD')) - (TRUNC((TO_DATE(SUBSTR({1},1,8), 'YYYYMMDD')+1), 'IW')-1))+1) -1),'YYYYMMDD')\n          END)\n\t");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_9() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATE")) {
tools.appendString("\n    (CASE WHEN {1} IS NOT NULL \t\n       THEN\n\t\n\tTO_CHAR(TO_DATE(SUBSTR({1},1,8), 'YYYYMMDD') - (((TRUNC(TO_DATE(SUBSTR({1},1,8), 'YYYYMMDD')) - (TRUNC((TO_DATE(SUBSTR({1},1,8), 'YYYYMMDD')+1), 'IW')-1))+1) -1),'YYYYMMDD')\n    END)  \n");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATETIME")) {
tools.appendString("\n     ");
choose_8();
tools.appendString("\n     \n");

foundChoice = !pega.isPreviewMode();
}
}
private void performStream_4() throws Throwable {
choose_9();
tools.appendString("\n");
}
private static final Map oPropDefinitions_4 = null;
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "ORACLE");
	oStreamProperties_4.put("pyMethodStatus", "");
	oStreamProperties_4.put("pyClassName", "Embed-UserFunction");
	oStreamProperties_4.put("pyCircumstanceProp", ".pyProductType");
	oStreamProperties_4.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-RulesEngine");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "");
	oStreamProperties_4.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_6() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t   ");
if (!foundChoice && when_1(".pyParameters(1).pyDBDataType", "TIMESTAMP")) {
tools.appendString("\n\t      (CASE WHEN (CAST(EXTRACT(DOW FROM  {1}::TIMESTAMP)AS INT) )= 0 THEN to_char( {1}::TIMESTAMP ,'YYYYMMDD')\n             ELSE to_char((date_trunc ('week', {1}::TIMESTAMP) - interval '1 day'),'YYYYMMDD') END)\n   \n       ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t  ");
if (!foundChoice) {
tools.appendString("\n\t      (CASE WHEN (CAST(EXTRACT(DOW FROM  to_date(SUBSTR({1},1,8), 'YYYYMMDD')::TIMESTAMP)AS INT) )= 0 THEN to_char(to_date(SUBSTR({1},1,8), 'YYYYMMDD')::TIMESTAMP ,'YYYYMMDD')\n           ELSE to_char((date_trunc ('week', to_date(SUBSTR({1},1,8), 'YYYYMMDD')) - interval '1 day'),'YYYYMMDD') END)\n \t ");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_5() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t  ");
if (!foundChoice && when_1(".pyParameters(1).pyDBDataType", "VARCHAR")) {
tools.appendString("\n            (CASE WHEN (CAST(EXTRACT(DOW FROM  to_date(SUBSTR({1},1,8), 'YYYYMMDD')::TIMESTAMP)AS INT) )= 0 THEN to_char(to_date(SUBSTR({1},1,8), 'YYYYMMDD')::TIMESTAMP ,'YYYYMMDD')\n            ELSE to_char((date_trunc ('week', to_date(SUBSTR({1},1,8), 'YYYYMMDD')) - interval '1 day'),'YYYYMMDD') END)\n\t\t\t  \n      ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n      ");
if (!foundChoice) {
tools.appendString("\n          (CASE WHEN {1} IS NOT NULL \t\n            THEN    \n\t\t       (CASE WHEN (CAST(EXTRACT(DOW FROM  {1}::TIMESTAMP)AS INT) )= 0 THEN to_char({1}::TIMESTAMP ,'YYYYMMDD')\n                  ELSE to_char((date_trunc ('week', {1}) - interval '1 day'),'YYYYMMDD') END) \n\n            END)\n\t\t\n\t  ");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_7() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATE")) {
tools.appendString("\n    ");
choose_5();
tools.appendString("\n     \n  \n");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATETIME")) {
tools.appendString("\n     ");
choose_6();
tools.appendString("\n    \n");

foundChoice = !pega.isPreviewMode();
}
}
private void performStream_3() throws Throwable {
choose_7();
tools.appendString("\n");
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "POSTGRESQL");
	oStreamProperties_3.put("pyMethodStatus", "");
	oStreamProperties_3.put("pyClassName", "Embed-UserFunction");
	oStreamProperties_3.put("pyCircumstanceProp", ".pyProductType");
	oStreamProperties_3.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-RulesEngine");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "");
	oStreamProperties_3.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\n         ");
if (!foundChoice && when_1(".pyParameters(1).pyDBDataType", "DATETIME")) {
tools.appendString("\n\t\t\n\t\t  SUBSTRING(REPLACE(CONVERT(VARCHAR(30),DATEADD(dd, DATEDIFF(dd,0,DATEADD(dd, - (CASE WHEN ((DATEPART(dw,CONVERT(datetime,{1},120)+@@DATEFIRST-2)%7)+2 -1) = 7 THEN 0 \n\t\t  ELSE ((DATEPART(dw,CONVERT(datetime,{1},120)+@@DATEFIRST-2)%7)+2 -1)  END),CONVERT(datetime,{1},120))),0),126),'-',''),1,8)\n         ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t");
if (!foundChoice) {
tools.appendString("\n\t(CASE WHEN {1} IS NOT NULL \n         THEN \t            \n           \n          SUBSTRING(REPLACE(CONVERT(VARCHAR(30),DATEADD(dd, -\n\t\t  (CASE WHEN ((DATEPART(dw,CAST(SUBSTRING({1},1,4) + '-' +SUBSTRING({1},5,2) + '-' + SUBSTRING({1},7,2) +'T00:00:00.000' AS DATETIME)+@@DATEFIRST-2)%7)+2 -1) = 7 THEN 0 \n\t\t  ELSE ((DATEPART(dw,CAST(SUBSTRING({1},1,4) + '-' +SUBSTRING({1},5,2) + '-' + SUBSTRING({1},7,2) +'T00:00:00.000' AS DATETIME)+@@DATEFIRST-2)%7)+2 -1)  END),\n\t\t  CAST(SUBSTRING({1},1,4) + '-' +SUBSTRING({1},5,2) + '-' + SUBSTRING({1},7,2) +'T00:00:00.000' AS DATETIME)),126),'-',''),1,8)\n          END)\n\t");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_4() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATE")) {
tools.appendString("\n    (CASE WHEN {1} IS NOT NULL \t\n       THEN\n          \n          SUBSTRING(REPLACE(CONVERT(VARCHAR(30),DATEADD(dd, -\n\t\t  (CASE WHEN ((DATEPART(dw,CAST(SUBSTRING({1},1,4) + '-' +SUBSTRING({1},5,2) + '-' + SUBSTRING({1},7,2) +'T00:00:00.000' AS DATETIME)+@@DATEFIRST-2)%7)+2 -1) = 7 THEN 0 \n\t\t  ELSE ((DATEPART(dw,CAST(SUBSTRING({1},1,4) + '-' +SUBSTRING({1},5,2) + '-' + SUBSTRING({1},7,2) +'T00:00:00.000' AS DATETIME)+@@DATEFIRST-2)%7)+2 -1)  END),\n\t\t  CAST(SUBSTRING({1},1,4) + '-' +SUBSTRING({1},5,2) + '-' + SUBSTRING({1},7,2) +'T00:00:00.000' AS DATETIME)),126),'-',''),1,8)\n    END)  \n");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATETIME")) {
tools.appendString("\n     ");
choose_3();
tools.appendString("\n     \n");

foundChoice = !pega.isPreviewMode();
}
}
private void performStream_2() throws Throwable {
 //pyDBDataType property for Timestamp columns contains DATETIME as the value 
tools.appendString("\n");
choose_4();
tools.appendString("\n");
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "SQLSERVER");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "Embed-UserFunction");
	oStreamProperties_2.put("pyCircumstanceProp", ".pyProductType");
	oStreamProperties_2.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-RulesEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t");
if (!foundChoice && when_1(".pyParameters(1).pyDBDataType", "TIMESTAMP")) {
tools.appendString("\n\t\t\tCAST(CAST(CAST({1} AS DATE)-(((cast({1} as date) - Date '1900-01-01') Mod 7)+1) AS FORMAT 'YYYYMMDD') AS CHAR(8))\n         ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t");
if (!foundChoice) {
tools.appendString("\n\t(CASE WHEN {1} IS NOT NULL \n          THEN \t\n\t\tCAST(CAST(CAST (SUBSTR({1},1,8) as DATE FORMAT 'YYYYMMDD')-(((CAST (SUBSTR({1},1,8) as DATE FORMAT 'YYYYMMDD') - Date '1900-01-01') Mod 7)+1) AS  FORMAT 'YYYYMMDD') AS CHAR(8))       \n          END)\n\t");
}
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(getPropertyVal(tools, aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATE")) {
tools.appendString("\n                 (CASE WHEN {1} IS NOT NULL \t\n                       THEN\t\t\t\t   \n\t              CAST(CAST(CAST (SUBSTR({1},1,8) as DATE FORMAT 'YYYYMMDD')-(((CAST (SUBSTR({1},1,8) as DATE FORMAT 'YYYYMMDD') - Date '1900-01-01') Mod 7)+1) AS  FORMAT 'YYYYMMDD') AS CHAR(8))      \n                 END) \n");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice && when_1(".pyParameters(1).pyUserEnteredDataType", "DATETIME")) {
tools.appendString("\n     ");
choose_1();
tools.appendString("\n     \n");

foundChoice = !pega.isPreviewMode();
}
}
private void performStream_1() throws Throwable {
choose_2();
tools.appendString("\n");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "TERADATA");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Embed-UserFunction");
	oStreamProperties_1.put("pyCircumstanceProp", ".pyProductType");
	oStreamProperties_1.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-RulesEngine");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private void executeStream_1() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Alias-Function");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT */
}
private void executeStream_2() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Alias-Function");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,false);
}
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT */
}
private void executeStream_3() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Alias-Function");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,false);
}
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT */
}
private void executeStream_4() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Alias-Function");
final Map prevPropDefs_4 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_4);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_4);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_3)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_4();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_4);
	mStreamResponse.setJspBaseClass(prevClass_4);
	pz_CurrentRuleKey = prevRuleKey_4;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,false);
}
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT */
}
private void executeStream_5() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Alias-Function");
final Map prevPropDefs_5 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_5);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_5);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_4)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_5();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_5);
	mStreamResponse.setJspBaseClass(prevClass_5);
	pz_CurrentRuleKey = prevRuleKey_5;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_4,false);
}
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT */
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_4;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_4.getRuleSetName(), oTraceInfo_4.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentTag = null;
	mStreamResponse = (JSPResponse) tools;
	mHttpServlet = aContext == null ? null : (HttpServlet) aContext.getHttpServlet();
	request = aContext == null ? null : (HttpServletRequest)aContext.getHttpServletRequest();
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-Alias-Function");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.988 GMT", "Embed-UserFunction pxWeek", "Pega-RulesEngine", "08-01-01", "20180713T132610.988 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.952 GMT", "Embed-UserFunction pxWeek", "Pega-RulesEngine", "08-01-01", "20180713T132610.952 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.980 GMT", "Embed-UserFunction pxWeek", "Pega-RulesEngine", "08-01-01", "20180713T132610.980 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.963 GMT", "Embed-UserFunction pxWeek", "Pega-RulesEngine", "08-01-01", "20180713T132610.963 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXWEEK #20180713T132610.971 GMT", "Embed-UserFunction pxWeek", "Pega-RulesEngine", "08-01-01", "20180713T132610.971 GMT");
}
