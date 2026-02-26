package com.pegarules.generated.alias_function;
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
 * Builds JSP stream EMBED-USERFUNCTION!PXDIVIDE.
 */
public class ra_stream_pxdivide_1ca44cf66a92210c3d02706f8d9085bb extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Alias_Function.pxDivide.Embed_UserFunction.Stream");
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
	public ra_stream_pxdivide_1ca44cf66a92210c3d02706f8d9085bb(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "9491eb75c9fad24006bf7353bc9afeb6f707e2ce";
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
/* handling 1 of 3 definitions  */
if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyProductType", "TERADATA", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT	Pega-Reporting:08-01-01	.pyProductType=TERADATA	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_1();
/* handling 2 of 3 definitions  */
} else if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyProductType", "SQLSERVER", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT	Pega-Reporting:08-01-01	.pyProductType=SQLSERVER	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_2();
/* handling 3 of 3 definitions (isLast)  */
} else {
/* Instance RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_3();
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
	"Rule-Alias-Function:PXDIVIDE", 
	"Rule-Alias-Function:PXDIVIDE", 
	"Rule-Alias-Function:PXDIVIDE", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXDIVIDE","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-Reporting","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT","!PXDIVIDE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1151512660), 
		new DependentRuleInfo("PXDIVIDE","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-Reporting","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT","!PXDIVIDE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-119970143), 
		new DependentRuleInfo("PXDIVIDE","Rule-Alias-Function","EMBED-USERFUNCTION",false,"","Pega-Reporting","08-01-01","RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT","!PXDIVIDE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1714461288), 
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
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT:20180713T134047.908 GMT
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT:20180713T134047.900 GMT
//	RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT:20180713T134047.916 GMT
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
		return "2e2782785af60c1dde411b7626f27c6e";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-UserFunction";
	}
public String getAspect() {
return "Stream";
}
private void performStream_3() throws Throwable {
tools.appendString("CASE WHEN (({2}!=0.0) AND ({2} IS NOT NULL)) THEN ({1} / CAST({2} as DOUBLE PRECISION)) ELSE NULL END");
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "");
	oStreamProperties_3.put("pyClassName", "Embed-UserFunction");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Reporting");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "");
	oStreamProperties_3.put("pyRuleSetVersion", "08-01-01");
}
private void performStream_2() throws Throwable {
tools.appendString("CASE WHEN (( CAST( {2} AS DECIMAL(31,10)) !=0.0) AND ({2} IS NOT NULL)) THEN ({1} / CAST({2} as DOUBLE PRECISION)) ELSE NULL END");
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
	oStreamProperties_2.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Reporting");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
private void performStream_1() throws Throwable {
tools.appendString("CASE WHEN (({2}<>0) AND ({2} IS NOT NULL)) THEN ({1} / CAST({2} as DOUBLE PRECISION)) ELSE NULL END");
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
	oStreamProperties_1.put("pzInsKey", "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Alias-Function");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Reporting");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private void executeStream_1() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT */
}
private void executeStream_2() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT */
}
private void executeStream_3() {
/*
 * Begin RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
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
/* end RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT */
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_2;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_2.getRuleSetName(), oTraceInfo_2.getRuleSetVersion() };}
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.908 GMT", "Embed-UserFunction pxDivide", "Pega-Reporting", "08-01-01", "20180713T134047.908 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.916 GMT", "Embed-UserFunction pxDivide", "Pega-Reporting", "08-01-01", "20180713T134047.916 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ALIAS-FUNCTION EMBED-USERFUNCTION PXDIVIDE #20180713T134047.900 GMT", "Embed-UserFunction pxDivide", "Pega-Reporting", "08-01-01", "20180713T134047.900 GMT");
}
