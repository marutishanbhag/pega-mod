package com.pegarules.generated.html_property;
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
 * Builds directive stream URLENCODEDVALUE.
 */
public class ra_stream_urlencodedvalue_7f7bf05ffd7e73d0e1db979c4705c6be extends AbstractBuildStreamSupport implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.urlEncodedValue.Stream");
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
	public ra_stream_urlencodedvalue_7f7bf05ffd7e73d0e1db979c4705c6be(com.pega.pegarules.priv.PegaAPI aContext) {
		super((com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext);
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "5a1234a87a1de1bd9db93c648f51260507eef541";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	pzAuto.beginStream(pega);
	pega.noteLegacyAPIUse();
try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
/*
 * Begin RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT";if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
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
/* end RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT */
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
	"Rule-HTML-Property:SHOWPROPERTY-INSERT", 
	"Rule-HTML-Property:SHOWDECLARATIVEPROPERTY-INSERT", 
	"Rule-HTML-Property:URLENCODEDVALUE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SHOWME-INSERT","Rule-HTML-Fragment","",false,"","Pega-ProCom","08-01-01","RULE-HTML-FRAGMENT SHOWME-INSERT #20180713T131957.318 GMT","SHOWME-INSERT",true,false,"ABSOLUTE_CLASSLESS",-445053904), 
		new DependentRuleInfo("SHOWPROPERTY-INSERT","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT","SHOWPROPERTY-INSERT",true,false,"ABSOLUTE_CLASSLESS",1353247226), 
		new DependentRuleInfo("SHOWDECLARATIVEPROPERTY-INSERT","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT","SHOWDECLARATIVEPROPERTY-INSERT",true,false,"ABSOLUTE_CLASSLESS",2062711663), 
		new DependentRuleInfo("URLENCODEDVALUE","Rule-HTML-Property","",false,"","Pega-WB","08-01-01","RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT","URLENCODEDVALUE",true,false,"ABSOLUTE_CLASSLESS",-1143695916)
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
//	RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT:20180713T131553.626 GMT
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
		return "4ebd07259d88df072d0a1933f5629b4f";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Build the result of a condition. */
private void conditionResult_4() {
tools.appendString("<a Class=\"Link\" style=\"color:maroon\" href=\"javascript:showDeclarativeNetwork('");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getSaveValue("PropertyPage"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getSaveValue("PropertyPageClass"), StreamBuilder.FMT_NORMAL);
tools.appendString("','");
tools.appendFormatted(tools.getSaveValue("Subscript"), StreamBuilder.FMT_NORMAL);
tools.appendString("');\" title=\"Show Dependency Network of ");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"), StreamBuilder.FMT_NORMAL);
tools.appendString("\">D</a> ");
}
/**
 * Build the result of a condition. */
private void conditionResult_2() {
tools.appendString("<a Class=\"Link\" style=\"color:maroon\" href=\"javascript:openRuleRecord('");
tools.appendFormatted(tools.getSaveValue("InsHandle"), StreamBuilder.FMT_NORMAL);
tools.appendString("','Rule-Obj-Property')\" title=\"Open Rule-Obj-Property=");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName"), StreamBuilder.FMT_NORMAL);
tools.appendString(".");
tools.appendFormatted(tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"), StreamBuilder.FMT_NORMAL);
tools.appendString("\">P</a> ");
}
/**
 * Build the result of a condition. */
private void conditionResult_1() {
if (pega_wb_default.HaveCustomizationRight(tools.getSaveValue("InsHandle"), this)) {
conditionResult_2();
}
}
/**
 * Build the result of a condition. */
private void conditionResult_3() {
if (pega_wb_default.HaveCustomizationRight(tools.getSaveValue("InsHandle"), this)) {
conditionResult_4();
}
}
private void performStream_1() {
{
   appendString(pega_rules_utilities.encodeURLParameter(tools.getActive().getStringValue()));
}
if (!"Internal".equals(mParentStreamProperties.get("pyMethodStatus"))) {
	/* Show-me property */
if (pega.isShowMePropertyEnabled()) {
/* handling 0 of 1 show-me definitions (isLast)  (isOnly) */
{
/* Show-Me Rule instance RULE-HTML-PROPERTY SHOWPROPERTY-INSERT #20180713T132014.582 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
tools.putSaveValue("InsHandle", tools.getDictionary().fromDefinition(tools.getActive(), "pzInsKey"));
tools.putSaveValue("streamName", "urlEncodedValue");
if (((! tools.getSaveValue("streamName").equals("JSEncodedValue")) && (! tools.getSaveValue("streamName").equals("urlEncodedValue")))) {
conditionResult_1();
}
}
}
	/* Show-me declarative */
if (pega.isShowMeDeclarativeEnabled()) {
/* handling 0 of 1 show-me definitions (isLast)  (isOnly) */
{
/* Show-Me Rule instance RULE-HTML-PROPERTY SHOWDECLARATIVEPROPERTY-INSERT #20180713T132014.569 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
tools.putSaveValue("PropertyName", tools.getDictionary().fromDefinition(tools.getActive(), "pyPropertyName"));
{
     // We shouldn't display a Declarative marker next to an editable field
    tools.putSaveValue("IsDeclarative", "false");

	// Initialize Subscript
	tools.putSaveValue("Subscript", "");

    if (!tools.useModeInput()) {

		String strClassName = tools.getActive().getTopLevelPage().getClassName();
		String strPropertyClass = tools.getActive().getParentPage().getClassName();
		String strPropertyName = tools.getSaveValue("PropertyName");

    // Build a list of all page list or group entries and their subscripts.
    // For example, the third entry in  pagelist2 within the second entry in pagelist1 would be pagelist1(2)pagelist1(3). 
    ClipboardProperty activeProp = tools.getActive().getParentProperty();
		String subscript = pega_rules_utilities.getShowMeDeclarativePropertyDescription(activeProp);
		tools.putSaveValue("Subscript", subscript);
		
		if (tools.getInfEngUtils().getTrackingInfoForTargetProperty(strClassName, strPropertyClass, strPropertyName) != null) {
				tools.putSaveValue("IsDeclarative", "true");
		} else {
				tools.putSaveValue("IsDeclarative", "false");
		}
}
tools.putSaveValue("InsHandle", tools.getDictionary().fromDefinition(tools.getActive(), "pzInsKey"));
tools.putSaveValue("PropertyPage", tools.getActive().getTopLevelPage().getName());
tools.putSaveValue("PropertyPageClass", tools.getActive().getTopLevelPage().getString("pxObjClass"));
if ( tools.getSaveValue("IsDeclarative").equals("true") ) {
conditionResult_3();
}
{
}
}
}
}
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-01");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-WB");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "urlEncodedValue");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Property");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY URLENCODEDVALUE #20180713T131553.626 GMT", "urlEncodedValue", "Pega-WB", "08-01-01", "20180713T131553.626 GMT");
}
