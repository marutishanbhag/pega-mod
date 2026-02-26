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
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.AbstractStreamBuilderSupport;
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
 * Builds directive stream LISTVIEWSELECTORSCRIPT_RENAMETOOL.
 */
public class ra_stream_listviewselectorscript_renametool_b17a1ac8ea32d2551a7ce25acd63f95d extends AbstractStreamBuilderSupport implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Fragment.ListViewSelectorScript_RenameTool.Stream");
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
	public ra_stream_listviewselectorscript_renametool_b17a1ac8ea32d2551a7ce25acd63f95d(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "b7e6e839f3acdc3c381506a38ccf5195e3300eb6";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	pzAuto.beginStream(pega);
	pega.noteLegacyAPIUse();
try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT";if (mParentStreamProperties == null) {
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
/* end RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT */
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
	"Rule-HTML-Fragment:LISTVIEWSELECTORSCRIPT_RENAMETOOL", 
	"Rule-HTML-Fragment:LISTVIEWSELECTORSCRIPT", 
	"Rule-HTML-Property:SHOWPROPERTY-INSERT", 
	"Rule-HTML-Property:SHOWDECLARATIVEPROPERTY-INSERT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SHOWME-INSERT","Rule-HTML-Fragment","",false,"","Pega-ProCom","08-01-01","RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT","SHOWME-INSERT",true,false,"ABSOLUTE_CLASSLESS",-445053904), 
		new DependentRuleInfo("LISTVIEWSELECTORSCRIPT_RENAMETOOL","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT","LISTVIEWSELECTORSCRIPT_RENAMETOOL",true,false,"ABSOLUTE_CLASSLESS",-2108354253), 
		new DependentRuleInfo("LISTVIEWSELECTORSCRIPT","Rule-HTML-Fragment","",false,"","Pega-RuleRefactoring","08-01-01","RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT #20180713T141349.629 GMT","LISTVIEWSELECTORSCRIPT",true,false,"ABSOLUTE_CLASSLESS",-728004802), 
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
//	RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT:20180713T131546.827 GMT
//	RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT:20180713T131957.318 GMT
//	RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT:20180713T132014.582 GMT
//	RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT:20180713T132014.569 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT #20180713T141349.629 GMT:20180713T141349.629 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d1cc653c232d5b2177a1c502c8296b30";
	}

	public String getDefinitionAppliesToClass() {
		return "null";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() {
final java.util.Map prevStreamProperties_1 = pega.getStreamProperties();
try {
StringMap  keys_1 = new HashStringMap();
keys_1.putString("pxObjClass", "Rule-HTML-Fragment");
keys_1.putString("pyStreamName", "ListViewSelectorScript");
tools.appendStream(keys_1);
keys_1 = null;
} finally {
	pega.setStreamProperties(prevStreamProperties_1);}
tools.appendString("\n\n<script>\nfunction report_onLoad()\n{\n\ttry\n\t{\n\t\twindow.parent.frames[0].frames[0].hideReportMessage();\n\t}\n\tcatch(exception )\n\t{\n\t\t//alert(exception);\n\t}\n\t\n}\n</script>\n");
if (!"Internal".equals(mParentStreamProperties.get("pyMethodStatus"))) {
	/* Show-me property */
}
	/* Show-me insert */
/* No show-me insert for internal rules. */
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-01");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-WB");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "ListViewSelectorScript_RenameTool");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT LISTVIEWSELECTORSCRIPT_RENAMETOOL #20180713T131546.827 GMT", "ListViewSelectorScript_RenameTool", "Pega-WB", "08-01-01", "20180713T131546.827 GMT");
}
