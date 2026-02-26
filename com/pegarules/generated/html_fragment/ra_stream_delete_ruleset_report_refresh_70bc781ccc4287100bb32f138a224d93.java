package com.pegarules.generated.html_fragment;
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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractBuildStreamSupport;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.util.JSPResponse;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * Builds directive stream DELETE_RULESET_REPORT_REFRESH.
 */
public class ra_stream_delete_ruleset_report_refresh_70bc781ccc4287100bb32f138a224d93 extends AbstractBuildStreamSupport implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Fragment.Delete_RuleSet_Report_Refresh.Stream");
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
	public ra_stream_delete_ruleset_report_refresh_70bc781ccc4287100bb32f138a224d93(com.pega.pegarules.priv.PegaAPI aContext) {
		super((com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext);
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "384f324cbb91bbdf75f51a36a312d5e74c791366";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	pzAuto.beginStream(pega);
	pega.noteLegacyAPIUse();
try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT	Pega-RuleRefactoring:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT";if (mParentStreamProperties == null) {
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
} finally { 
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT */
}
	} finally {
		pzAuto.finishStream();
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:SHOWME-INSERT", 
	"Rule-HTML-Fragment:DELETE_RULESET_REPORT_REFRESH", 
	"Rule-HTML-Property:SHOWPROPERTY-INSERT", 
	"Rule-HTML-Property:SHOWDECLARATIVEPROPERTY-INSERT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SHOWME-INSERT","Rule-HTML-Fragment","",false,"","Pega-ProCom","08-01-01","RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT","SHOWME-INSERT",true,false,"ABSOLUTE_CLASSLESS",-445053904), 
		new DependentRuleInfo("DELETE_RULESET_REPORT_REFRESH","Rule-HTML-Fragment","",false,"","Pega-RuleRefactoring","08-05-01","RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT","DELETE_RULESET_REPORT_REFRESH",true,false,"ABSOLUTE_CLASSLESS",-496832086), 
		new DependentRuleInfo("SHOWPROPERTY-INSERT","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT","SHOWPROPERTY-INSERT",true,false,"ABSOLUTE_CLASSLESS",1353247226), 
		new DependentRuleInfo("SHOWDECLARATIVEPROPERTY-INSERT","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT","SHOWDECLARATIVEPROPERTY-INSERT",true,false,"ABSOLUTE_CLASSLESS",2062711663)
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
//	RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT:20200316T092020.821 GMT
//	RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT:20180713T131957.318 GMT
//	RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT:20180713T132014.582 GMT
//	RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT:20180713T132014.569 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "bc96681e38de34bd19ecace62cbbc641";
	}

	public String getDefinitionAppliesToClass() {
		return "null";
	}
public String getAspect() {
return "Stream";
}
/**
 * Build the result of a condition. */
private void conditionResult_5() {
tools.appendString("<a href=\"javascript:openRuleRecord( 'RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT','Rule-HTML-Fragment')\" title=\"Open ");
tools.appendFormatted(tools.getSaveValue("key"), StreamBuilder.FMT_NORMAL);
tools.appendString("\">H</a> ");
}
/**
 * Build the result of a condition. */
private void conditionResult_4() {
tools.appendString(" ");
tools.putSaveValue("insHandle", "RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT");
tools.appendString(" ");
if (pega_wb_default.HaveCustomizationRight(saveValueGet("insHandle"), this)) {
conditionResult_5();
}
}
/**
 * Build the result of a condition. */
private void conditionResult_3() {
if ((! saveValueGet("name").startsWith("px") || saveValueGet("name").startsWith("pz"))) {
conditionResult_4();
}
}
/**
 * Build the result of a condition. */
private void conditionResult_1() {
/* Fragments for HarnessString appear in the html tags and may cause javascript errors */
}
/**
 * Build the result of a condition. */
private void conditionResult_2() {
tools.putSaveValue("key", "Rule-HTML-Fragment=Delete_RuleSet_Report_Refresh");
tools.putSaveValue("objClass", "Rule-HTML-Fragment");
if ( !tools.getSaveValue("objClass").equals("Rule-HTML-Property")&&
				 !tools.getSaveValue("objClass").equals("Rule-HTML-Section")&&
				 !tools.getSaveValue("objClass").equals("Rule-HTML-Harness")&&
				 !tools.getSaveValue("objClass").equals("Rule-Obj-FlowAction") ) {
conditionResult_3();
}
tools.putSaveValue("circ", "default circumstance");
}
private void performStream_1() {
tools.appendString("<script type=text/javascript>\n\n\tvar strLogKey = \"");
tools.appendFormatted(tools.getParamValue("pyLogKey"), StreamBuilder.FMT_NORMAL);
tools.appendString("\";\n\tvar strUrl=\"");
tools.appendFormatted(tools.getProperty("pxThread.pxReqURI").toString(), StreamBuilder.FMT_NORMAL);
tools.appendString("\";\n\tvar strOldRuleSet = \"");
tools.appendFormatted(tools.getParamValue("pyOldRuleSet"), StreamBuilder.FMT_NORMAL);
tools.appendString("\";\n\tvar strNewRuleSet = \"");
tools.appendFormatted(tools.getParamValue("pyNewRuleSet"), StreamBuilder.FMT_NORMAL);
tools.appendString("\";\n\tvar pyCommitTime1 = \"");
tools.appendFormatted(tools.getParamValue("pyCommitTime"), StreamBuilder.FMT_NORMAL);
tools.appendString("\";\n\n\t\n\n\tfunction Refresh_RuleSet_Report(obj)\n\t{\n\n\t\tvar url = strUrl + \"?\" + \"");
{tools.appendString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=Log-Delete.Delete_RuleSet_Report_Run"));}
tools.appendString("\" + \"&pyOldRuleSet=\" + escape(strOldRuleSet) + \"&pyNewRuleSet=\" + escape(strNewRuleSet) + \"&pyLogKey=\" + escape(strLogKey) + \"&pyCommitTime=\" + pyCommitTime1;      \n                  document.location.href = url;\n\n\t}\n\n\t\n\t</script>");
if (!"Internal".equals(mParentStreamProperties.get("pyMethodStatus"))) {
	/* Show-me property */
}
	/* Show-me insert */
if (pega.isShowMeInsertEnabled()) {
/* handling 0 of 1 show-me definitions (isLast)  (isOnly) */
{
/* Show-Me Rule instance RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
tools.putSaveValue("name", "Delete_RuleSet_Report_Refresh");
if (tools.getSaveValue("name").startsWith("HarnessString")) {
conditionResult_1();
} else {
conditionResult_2();
}
}
}
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-01");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-RuleRefactoring");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "Delete_RuleSet_Report_Refresh");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	super.cleanForReuse((com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext);
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Fragment");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT DELETE_RULESET_REPORT_REFRESH #20200316T092020.821 GMT", "Delete_RuleSet_Report_Refresh", "Pega-RuleRefactoring", "08-05-01", "20200316T092020.821 GMT");
}
