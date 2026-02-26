package com.pegarules.generated.listview;
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
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream RULE-APPLICATION!DELETE_RULESET_REPORT!ALL.
 */
public class ra_stream_delete_ruleset_report_all_3a524389a164a15ccbc3a2ec53b584a3 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_ListView.Delete_RuleSet_Report.All.Rule_Application.Stream");
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
	public ra_stream_delete_ruleset_report_all_3a524389a164a15ccbc3a2ec53b584a3(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return false;
	}
private static String pxUniqueStreamHash = "1b88bdc4b46269446ee3272589a5c3b44615a645";
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
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT	Pega-RuleRefactoring:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-ListView");
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

	performStream_7();

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
/* end RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT */
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
	"Rule-Obj-HTML:PZINCLUDESKELETONS", 
	"Rule-Obj-HTML:PZCLIENTDYNAMICDATABOTTOM", 
	"Rule-Obj-HTML:PZONLYONCECHANGES", 
	"Rule-Obj-HTML:PYDOMAINOVERRIDE", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PZDECLAREEXPRESSIONDEFERRED", 
	"Rule-HTML-Fragment:SHOWME-VIEWINSERT", 
	"Rule-HTML-Fragment:PZINCLUDEWEBANALYTICSDI", 
	"Rule-HTML-Fragment:DOCUMENTINFO", 
	"Rule-Obj-ListView:DELETE_RULESET_REPORT!ALL", 
	"Rule-Obj-Property:PYPORTALVERSION", 
	"Rule-Obj-Property:PXASSIGNEDOPERATORID", 
	"Rule-Obj-Property:PZPRODUCTIONLEVEL", 
	"Rule-Obj-Property:PXPORTALHELPURI", 
	"Rule-Obj-Property:PZINSKEY", 
	"Rule-Obj-Property:PXFORMNAME", 
	"Rule-Obj-Property:PXTASKNAME"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZINCLUDESKELETONS","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT","!PZINCLUDESKELETONS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1021157923), 
		new DependentRuleInfo("PZCLIENTDYNAMICDATABOTTOM","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-07-01","RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT","!PZCLIENTDYNAMICDATABOTTOM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1332820899), 
		new DependentRuleInfo("PZONLYONCECHANGES","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT","!PZONLYONCECHANGES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1613232256), 
		new DependentRuleInfo("PYDOMAINOVERRIDE","Rule-Obj-HTML","@BASECLASS",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT","!PYDOMAINOVERRIDE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",326045783), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-ListView","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDECLAREEXPRESSIONDEFERRED","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT","PZDECLAREEXPRESSIONDEFERRED",true,false,"ABSOLUTE_CLASSLESS",89458520), 
		new DependentRuleInfo("SHOWME-VIEWINSERT","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT","SHOWME-VIEWINSERT",true,false,"ABSOLUTE_CLASSLESS",965821247), 
		new DependentRuleInfo("PZINCLUDEWEBANALYTICSDI","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT","PZINCLUDEWEBANALYTICSDI",true,false,"ABSOLUTE_CLASSLESS",-561733845), 
		new DependentRuleInfo("DOCUMENTINFO","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT","DOCUMENTINFO",true,false,"ABSOLUTE_CLASSLESS",-414417818), 
		new DependentRuleInfo("DELETE_RULESET_REPORT!ALL","Rule-Obj-ListView","RULE-APPLICATION",false,"","Pega-RuleRefactoring","08-01-01","RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT","!DELETE_RULESET_REPORT!ALL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",57932362), 
		new DependentRuleInfo("PYPORTALVERSION","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PYPORTALVERSION #20180713T131215.611 GMT","!PYPORTALVERSION",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXASSIGNEDOPERATORID","Rule-Obj-Property","ASSIGN-",true,"Assign-","Pega-RulesEngine","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXASSIGNEDOPERATORID #20180713T132512.882 GMT","!PXASSIGNEDOPERATORID",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PZPRODUCTIONLEVEL","Rule-Obj-Property","CODE-PEGA-PROCESS",true,"Code-Pega-Process","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-PROCESS PZPRODUCTIONLEVEL #20180713T131211.669 GMT","!PZPRODUCTIONLEVEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXPORTALHELPURI","Rule-Obj-Property","PEGA-HELPCONTENT",true,"Pega-HelpContent","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY PEGA-HELPCONTENT PXPORTALHELPURI #20180713T132914.378 GMT","!PXPORTALHELPURI",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PZINSKEY","Rule-Obj-Property","@BASECLASS",true,"Assign-","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PZINSKEY #20180713T131156.617 GMT","!PZINSKEY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXFORMNAME","Rule-Obj-Property","ASSIGN-",true,"Assign-","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXFORMNAME #20180713T131151.821 GMT","!PXFORMNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXTASKNAME","Rule-Obj-Property","ASSIGN-",true,"Assign-","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY ASSIGN- PXTASKNAME #20180713T131152.099 GMT","!PXTASKNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0)
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
//	RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT:20180713T141410.968 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT:20180713T131549.246 GMT
//	RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT:20180713T133243.503 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT:20210618T153855.616 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXFORMNAME #20180713T131151.821 GMT:20180713T131151.821 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PZINSKEY #20180713T131156.617 GMT:20180713T131156.617 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXTASKNAME #20180713T131152.099 GMT:20180713T131152.099 GMT
//	RULE-OBJ-PROPERTY ASSIGN- PXASSIGNEDOPERATORID #20180713T132512.882 GMT:20180713T132512.882 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PYPORTALVERSION #20180713T131215.611 GMT:20180713T131215.611 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-PROCESS PZPRODUCTIONLEVEL #20180713T131211.669 GMT:20180713T131211.669 GMT
//	RULE-OBJ-PROPERTY PEGA-HELPCONTENT PXPORTALHELPURI #20180713T132914.378 GMT:20180713T132914.378 GMT
//	RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT:20180713T133243.626 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT:20180713T133322.374 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT:20180713T133322.434 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT:20180713T133243.745 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT:20180713T133322.219 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "dd7f6ee48b0a3a3a34bf036d407f9efb";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Application";
	}
public String getAspect() {
return "Stream";
}
private static final String[] showMeParams_1 = {
"", "", "", "", "@baseclass", "", "04-02", "", "Rule-Obj-HTML", "Yes", "", "Pega-UIEngine", "08-01-01", "", "pyDomainOverride", "", "RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT" };
private static final Map oPropDefinitions_8 = null;
private static final Map oStreamProperties_8 = new HashMap();
static {
	oStreamProperties_8.put("pyRuleAvailable", "Yes");
	oStreamProperties_8.put("pyCircumstanceDateProp", "");
	oStreamProperties_8.put("pyCircumstanceVal", "");
	oStreamProperties_8.put("pyMethodStatus", "");
	oStreamProperties_8.put("pyClassName", "@baseclass");
	oStreamProperties_8.put("pyCircumstanceProp", "");
	oStreamProperties_8.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT");
	oStreamProperties_8.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_8.put("pyCircumstanceDate", "");
	oStreamProperties_8.put("pyRuleEnds", "");
	oStreamProperties_8.put("pyRuleStarts", "");
	oStreamProperties_8.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_8.put("pyXMLType", "");
	oStreamProperties_8.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_8.put("pyCorrType", "");
	oStreamProperties_8.put("pyStreamName", "pyDomainOverride");
	oStreamProperties_8.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT
 */
private void include_7() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT
 * Set up context.
 */
final String prevRuleKey_8 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT";final String prevClass_8 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
final Map prevPropDefs_8 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_8);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_8);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_7)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_5();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_8);
	mStreamResponse.setJspBaseClass(prevClass_8);
	pz_CurrentRuleKey = prevRuleKey_8;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_7,true);
}
/* end RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_5() throws Throwable {
}
private static final Map oPropDefinitions_7 = null;
private static final Map oStreamProperties_7 = new HashMap();
static {
	oStreamProperties_7.put("pyRuleAvailable", "Final");
	oStreamProperties_7.put("pyCircumstanceDateProp", "");
	oStreamProperties_7.put("pyCircumstanceVal", "");
	oStreamProperties_7.put("pyMethodStatus", "Internal");
	oStreamProperties_7.put("pyClassName", "");
	oStreamProperties_7.put("pyCircumstanceProp", "");
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "pzIncludeWebAnalyticsDI");
	oStreamProperties_7.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_7 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_7);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_7);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_6)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_5();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_7);
	mStreamResponse.setJspBaseClass(prevClass_7);
	pz_CurrentRuleKey = prevRuleKey_7;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_6,true);
}
/* end RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_4() throws Throwable {

final Set names = new TreeSet(pega_rules_pegarulesutilities.getNewOnlyOnceNames(tools));
if (! names.isEmpty()) {
  final Iterator namesIter = names.iterator();
  int i=0;
  StringBuilder sb = new StringBuilder();
  while (namesIter.hasNext()) {
    final String name = (String) namesIter.next();
    if(++i==1){
      sb.append("[\"").append(name).append("\"");
    } else {
      sb.append(",\"").append(name).append("\"");
    }
  }
  if(i>0) {
    sb.append("]");
  }
  
tools.appendString("\n<div style='display:none;' id='PegaOnlyOnce' data-json='");
out.print( sb.toString() );
tools.appendString("'></div>\n");
 } 
}
private static final Map oPropDefinitions_6 = null;
private static final Map oStreamProperties_6 = new HashMap();
static {
	oStreamProperties_6.put("pyRuleAvailable", "Final");
	oStreamProperties_6.put("pyCircumstanceDateProp", "");
	oStreamProperties_6.put("pyCircumstanceVal", "");
	oStreamProperties_6.put("pyMethodStatus", "Internal");
	oStreamProperties_6.put("pyClassName", "@baseclass");
	oStreamProperties_6.put("pyCircumstanceProp", "");
	oStreamProperties_6.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "pzOnlyOnceChanges");
	oStreamProperties_6.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
final Map prevPropDefs_6 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_6);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_6);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_5)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_4();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_6);
	mStreamResponse.setJspBaseClass(prevClass_6);
	pz_CurrentRuleKey = prevRuleKey_6;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_5,true);
}
/* end RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_3() throws Throwable {

ArrayList skeletonList = (ArrayList)tools.getParameterPage().getObject("skeletonList");

if(skeletonList != null && skeletonList.size() > 0){
    char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
    pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(com.pega.pegarules.priv.runtime.IUIComponentRuntime.TEMPLATE_STATUS_NO);    
    for(int i =0; i < skeletonList.size(); i++){       
        StringMap  keys = new HashStringMap();
		    keys.putString("pxObjClass", "Rule-HTML-Section");
      
        String skeletonName = "pyLaunchHarnessSkeleton";
        String className = "@baseclass";
        String targetMicroDC = "false";
      
        String skeletonAndClassName = (String)skeletonList.get(i);      
        if(skeletonAndClassName != null){
          String[] skeletonAndClassNameArr = skeletonAndClassName.split("~\\$~");
          if(skeletonAndClassNameArr != null && skeletonAndClassNameArr.length > 0){
            skeletonName = skeletonAndClassNameArr[0];
            className = skeletonAndClassNameArr[1];
            if(skeletonAndClassNameArr.length > 2)
            targetMicroDC = skeletonAndClassNameArr[2];
          }     
        }           
			  keys.putString("pyClassName", className); 
        try{
        
      /*ClipboardPage pg_temp = tools.createPage("Rule-HTML-Section", "");
			pg_temp.putString(".pyStreamName", skeletonName);
			pg_temp.putString(".pyClassName", className);

			boolean bSectionExists = true;
			try
			{
				pg_temp = tools.getDatabase().open(pg_temp, true);
				if (pg_temp == null ) bSectionExists = false;
			}
			catch (Exception e)
			{
				bSectionExists = false;
			}*/
        if(className != null && "@baseclass".equals(className))
          className = "baseclass";      
      
      /*if(!bSectionExists){
        oLog.error("Skeleton: Could not open the  section "+skeletonName+" in class "+className);
        skeletonName = "pyLaunchHarnessSkeleton";
        keys.putString("pyStreamName", skeletonName);
        keys.putString("pyClassName", "@baseclass");
      } else{*/
      /*if(bSectionExists){*/
        keys.putString("pyStreamName", skeletonName);
			  String strSkeleton = tools.getStream(keys, null);
          if("true".equals(targetMicroDC) || (pzAuto.isMobile() && !pzAuto.isTablet())){

tools.appendString("\n      <div id=\"");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("\" style=\"display:none;\" class=\"skeleton\" data-skeleton='true'>            \n        ");
out.print( strSkeleton );
tools.appendString("\n        <script>\n          if(typeof removeDuplicateSkeleton != \"undefined\"){\n            removeDuplicateSkeleton('");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("');\n          }\n        </script>\n      </div>\n");
  }   } catch (Exception e){
        oLog.error("Skeleton: from pzIncludeSkeletons: Could not open the section "+skeletonName+" in class "+className);
      } 
        
    }
  pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
} else{
  ClipboardPage pyDocuments = tools.findPage("pyDocuments", true);
  if(pyDocuments != null){
    ClipboardProperty pySkeletons = pyDocuments.getProperty("pySkeletons");
    java.util.Iterator skeletonItr = pySkeletons.iterator();
    if(skeletonItr != null && pySkeletons.size() > 0){                    
      boolean ifPresent = false;
      char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
      pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(com.pega.pegarules.priv.runtime.IUIComponentRuntime.TEMPLATE_STATUS_NO);
      while(skeletonItr.hasNext()){
        ClipboardProperty thisSkeletonWrapper = (ClipboardProperty)skeletonItr.next();
        ClipboardPage thisSkeleton = thisSkeletonWrapper.getPageValue();
        String thisSkeletonStr = thisSkeleton.getString("pySkeletonDetails");          
        if(thisSkeletonStr !=null){
          StringMap  keys = new HashStringMap();
		      keys.putString("pxObjClass", "Rule-HTML-Section");
      
          String skeletonName = "pyLaunchHarnessSkeleton";
          String className = "@baseclass";
          String targetMicroDC = "false";
      
          String skeletonAndClassName = thisSkeletonStr;      
          if(skeletonAndClassName != null){
            String[] skeletonAndClassNameArr = skeletonAndClassName.split("~\\$~");
            if(skeletonAndClassNameArr != null && skeletonAndClassNameArr.length > 0){
              skeletonName = skeletonAndClassNameArr[0];
              className = skeletonAndClassNameArr[1]; 
              if(skeletonAndClassNameArr.length > 2)
              targetMicroDC = skeletonAndClassNameArr[2];
            }     
          }           
			    keys.putString("pyClassName", className); 
          try{
            if(className != null && "@baseclass".equals(className))
              className = "baseclass";
             keys.putString("pyStreamName", skeletonName);
              String strSkeleton = tools.getStream(keys, null);
             if("true".equals(targetMicroDC) || (pzAuto.isMobile() && !pzAuto.isTablet())){

tools.appendString("\n            <div id=\"");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("\" style=\"display:none;\" class=\"skeleton\" data-skeleton='true'>                             \n              ");
out.print( strSkeleton );
tools.appendString("\n              <script>\n                if(typeof removeDuplicateSkeleton != \"undefined\"){\n                  removeDuplicateSkeleton('");
out.print(skeletonName);
tools.appendString("-");
out.print(className);
tools.appendString("');\n                }\n              </script>\n            </div>\n");
      }  } catch (Exception e){
            oLog.error("Skeleton: from pzIncludeSkeletons: Could not open the section "+skeletonName+" in class "+className);
          } 
            
        }// inner if
      }//while
      pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
    }//if ske
  }//if doc
}// else

}
private static final Map oPropDefinitions_5 = null;
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Final");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "Internal");
	oStreamProperties_5.put("pyClassName", "@baseclass");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "pzIncludeSkeletons");
	oStreamProperties_5.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT
 */
private void include_4() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
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

	performStream_3();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_5);
	mStreamResponse.setJspBaseClass(prevClass_5);
	pz_CurrentRuleKey = prevRuleKey_5;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_4,true);
}
/* end RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_2() throws Throwable {

{
  tools.appendString(tools.getSaveValue("pzDeclareExpressionJs"));
}

}
private static final Map oPropDefinitions_4 = null;
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "Internal");
	oStreamProperties_4.put("pyClassName", "");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "pzDeclareExpressionDeferred");
	oStreamProperties_4.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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

	performStream_2();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_4);
	mStreamResponse.setJspBaseClass(prevClass_4);
	pz_CurrentRuleKey = prevRuleKey_4;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,true);
}
/* end RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_8() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_2("bFlowAction", "true")) {
tools.appendString(" function SmartPromptFocusHandler(e) { var evt = e || window.event || arguments.callee.caller.arguments[0]; if(typeof(evt) != \"undefined\" ) { var evtTarget = evt.srcElement || evt.target; if (ISnsSmartPromptInitActive(evtTarget, false)) return; } } function zUtil_SmartPromptFocusHandler(e) { var evt = e || window.event || arguments.callee.caller.arguments[0]; SmartPromptFocusHandler(evt); } ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" function SmartPromptFocusHandler() { if (ISnsSmartPromptInitActive(window.event.srcElement, false)) return; } function zUtil_SmartPromptFocusHandler() { SmartPromptFocusHandler(); } ");
}
}
private boolean when_11() throws Throwable {
boolean whenResult_14 = pega.invokeWhen("isAccessible", "", "");
return whenResult_14;
}
private boolean when_10() throws Throwable {
boolean whenResult_12 = pega.invokeWhen("WarnBeforeChangingWindow", "", "");
return whenResult_12;
}
private boolean when_9() throws Throwable {
boolean whenResult_10 = pega.invokeWhen("isAccessible", "", "");
return whenResult_10;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_7() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("HarnessType", "")) {
tools.appendString(" \"processHarnessType\": \"Display\", ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"processHarnessType\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.HarnessType")) {
	return;
}
tools.appendString("\", ");
}
}
/**
 * Implements a pega:option tag.
 */private boolean _jspx_meth_pega_option__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:option */
com.pega.pegarules.jsptags.OptionTag _jspx_th_pega_option_ = (com.pega.pegarules.jsptags.OptionTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.OptionTag.class);
_jspx_th_pega_option_.setPageContext(pageContext);
_jspx_th_pega_option_.setParent(mParentTag);
_jspx_th_pega_option_.setName(aName);
int _jspx_eval_pega_option_ = _jspx_th_pega_option_.doStartTag();
if (_jspx_th_pega_option_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_option_);
return false;
}
/**
 * Implements a pega:url tag.
 */private boolean _jspx_meth_pega_url__1(PageContext aPageContext) throws Throwable {
/* pega:url */
com.pega.pegarules.jsptags.UrlTag _jspx_th_pega_url_ = (com.pega.pegarules.jsptags.UrlTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.UrlTag.class);
_jspx_th_pega_url_.setPageContext(pageContext);
_jspx_th_pega_url_.setParent(mParentTag);
int _jspx_eval_pega_url_ = _jspx_th_pega_url_.doStartTag();
if (_jspx_eval_pega_url_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_url_;
if (_jspx_meth_pega_option__1(pageContext, "long")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_url_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_url_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_url_);
return false;
}
private boolean when_8() throws Throwable {
boolean whenResult_9 = pega.invokeWhen("pyFocusInsideIframe", "", "");
return whenResult_9;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_6() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_8()) {
tools.appendString(" \"focusInsideIframe\": true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"focusInsideIframe\": false, ");
}
}
private boolean when_7() throws Throwable {
boolean whenResult_8 = pega.invokeWhen("pyEnableAgileWorkbench", "", "");
return whenResult_8;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_5() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_7()) {
tools.appendString(" \"isAgileWorkbenchEnabled\": true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"isAgileWorkbenchEnabled\": false, ");
}
}
private boolean when_6() throws Throwable {
boolean whenResult_7 = pega.invokeWhen("pyEnableUIInspectorButton", "", "");
return whenResult_7;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_4() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_6()) {
tools.appendString(" \"isUIInspectorButtonEnabled\": true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"isUIInspectorButtonEnabled\": false, ");
}
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private boolean when_5() throws Throwable {
boolean whenResult_5 = pega.invokeWhen("InCompositeDesktop", "", "");
return whenResult_5;
}
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (((!((areValsEqual(tools.getParamValue(aParam1), aParam2)))))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_4("IndexInList", "")) {
tools.appendString(" \"indexInList\": ");

/*
 * reference tag
 * Cannot inline because: mode is "richtext"
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.IndexInList", "richtext")) {
	return;
}
tools.appendString(", ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"indexInList\": 0, ");
}
}
private boolean when_3() throws Throwable {
boolean whenResult_3 = pega.invokeWhen("pyShowExitConfirmationOnAndroidApp", "", "");
return whenResult_3;
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_3()) {
tools.appendString(" \"showExitConfirmationOnAndroidApp\":true, ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" \"showExitConfirmationOnAndroidApp\":false, ");
}
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
private void performStream_1() throws Throwable {
tools.appendString(" function getBrowserFingerprint() { var options = { excludes: { 'enumerateDevices': true, 'sessionStorage': true, 'colorDepth': true, 'indexedDb': true, 'canvas': true, 'hasLiedLanguages': true, 'touchSupport': true, 'plugins': true, 'hasLiedResolution': true, 'adBlock': true, 'hasLiedBrowser': true, 'audio': true, 'hasLiedOs': true, 'fonts': true, 'addBehavior': true, 'openDatabase': true, 'pixelRatio': true, 'doNotTrack': true, 'fontsFlash': true, 'screenResolution': true, 'availableScreenResolution': true, 'webglVendorAndRenderer': true, 'webgl': true } }; var components = {}; Fingerprint2.get(options, function(components) { var values = components.map(function(component) { return component.value; }); fingerprintToken = Fingerprint2.x64hash128(values.join(''), 31); pega.d.browserFingerprint = '{v2}' + fingerprintToken; }); }; if (!pega.u.d.ServerProxy.isDestinationLocal()) { getBrowserFingerprint(); } function setBrowserFingerprint() { var element = document.getElementById(\"pzBFP\"); if (element != null) { document.getElementById(\"pzBFP\").value = pega.d.browserFingerprint; }; }; pega.u.d.attachOnload(setBrowserFingerprint); pega.u.d.attachOnFrameLoads(setBrowserFingerprint); var isCreateStage = \"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.bIsInCreateStage", "normal")) {
	return;
}
tools.appendString("\"; isCreateStage = isCreateStage == \"true\"?true:false; var bottomVars = { \"dynamic_context\" : { \"strHarnessPurpose\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.Purpose", "normal")) {
	return;
}
tools.appendString("\", \"bIsInCreateStage\": isCreateStage, ");

  	tools.putSaveValue("strPageName", tools.getStepPage()!=null?tools.getStepPage().getName():"");

tools.appendString(" \"bActionIframe\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(bFlowAction)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(bFlowAction)")) {
	return;
}
tools.appendString("\", ");
	if (when_2("bFlowAction", "true")) {
tools.appendString("  \"bClientValidation\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(bClientValidation)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(bClientValidation)")) {
	return;
}
tools.appendString("\", \"bExpressionCalculation\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(bExpressionCalculation)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(bExpressionCalculation)")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" ");

String isDesignViewIframe = tools.getParamValue("DesignViewIframe");
boolean isPackaging = pega_uiengine_offlinesupport.pzIsForOfflineTemplate();
boolean isHybridClient = false;
boolean isPegaElectron = false;
boolean isMobileClient = false;

/*changes related to MobileClient URL*/
String pxReqURI = tools.findPage("pxThread").getString("pxReqURI");

tools.appendString(" ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getProperty("pxRequestor.pxIsMobileClient").getStringValue(), "true"))) {
tools.appendString(" ");
  
   /* BUG-527209 : Getting pxReqURI properly using API */
  /* BUG-529778 : PRPC can be deployed at the root context. /prweb is linked with the application context. */
  try {
    pxReqURI = pega.getExternalURLBuilder().useCurrentContext().withServlet("PRAuth").currentApplication().currentAccessGroup().currentThread().build();
    java.net.URL aURL = new java.net.URL(pxReqURI);
    pxReqURI = aURL.getFile();
  } catch (Exception ex) {
    oLog.error("pzClientDynamicData : pega.ctx.pxReqURI will be empty. Applicaiton will not be rendered");
    oLog.error("Exception "+ ex);
  }
      isMobileClient = true;
  
tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_1 = pega.invokeWhen("pyIsHybridClient", "", "");
	if (whenResult_1) {
tools.appendString(" ");
 isHybridClient = true; 
tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_2 = pega.invokeWhen("pyIsPegaElectronContainer", "", "");
	if (whenResult_2) {
tools.appendString(" ");
 isPegaElectron = true; 
tools.appendString(" ");
	}
tools.appendString(" ");
choose_2();
tools.appendString("  ");
 String mUserAgent = pega_rulesengine_utilities.pzGetUserAgentString(tools);
tools.appendString(" ");
 int maxAttachmentSizeBytes = 0;
tools.appendString(" ");
	if (pega.isPreviewMode() || ( mUserAgent.matches(".*(Android|iPhone|iPad|iPod|Electron).*") )) {
tools.appendString("  ");

  int maxAttachmentSizeMB = 100;
String attachmentMaxSize = tools.getSystemSettings().getDynamic("Pega-EndUserUI", "uiengine/mobile/maxattachmentsize");
if (!(attachmentMaxSize == null || "".equals(attachmentMaxSize))) {
  try {
    maxAttachmentSizeMB = Integer.parseInt(attachmentMaxSize);
  } catch (Exception e) {
    maxAttachmentSizeMB = 100;
  }
}
maxAttachmentSizeBytes = maxAttachmentSizeMB * 1048576; //convert to bytes

tools.appendString(" ");
	}
tools.appendString("  \"maxAttachmentSizeBytes\": \"#JSON_PARSE_TO_INT#(\\\"");
out.print( maxAttachmentSizeBytes);
tools.appendString("\\\")\",  \"pySectionShortDesc\":\"");
out.print( StringUtils.escapeIntoJavaString(StringUtils.crossScriptingFilter(tools.getParamValue("pySectionShortDesc"))));
tools.appendString("\", ");
	if (when_1("Purpose", "")) {
tools.appendString(" \"strHarnessPurpose\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.StreamName", "normal")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" \"strHarnessClass\": \"");
out.print(tools.getPrimaryPage()!=null ? tools.getPrimaryPage().getString("pxObjClass") : "");
tools.appendString("\", ");
 
  	String tempstrKey = "";
    try {
      if(tools.getStepPage()!=null)
        tempstrKey = com.pega.pegarules.pub.util.StringUtils.crossScriptingFilter(tools.getDatabase().getHandle(tools.getStepPage()));
    }catch (DatabaseException de) {	}
    tools.putSaveValue("strKey", tempstrKey);

tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getThread().getThreadPage().getString("isWebMashup").equals("true")) {
tools.appendString("  ");
	}
tools.appendString(" \"strPropertyName\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.PageListProperty")) {
	return;
}
tools.appendString("\", ");
choose_3();
tools.appendString("  ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.findPage("newAssignPage") != null)) {
tools.appendString(" \"strDisplayHarnessParms\": \"&FinishingActivity=DisplayHarness&Purpose=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "newAssignPage.pxFormName", "normal")) {
	return;
}
tools.appendString("&AssignInsKey=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "newAssignPage.pzInsKey", "normal")) {
	return;
}
tools.appendString("&AssignTaskName=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "newAssignPage.pxTaskName", "normal")) {
	return;
}
tools.appendString("&AssignOperator=");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "newAssignPage.pxAssignedOperatorID", "normal")) {
	return;
}
tools.appendString("\", ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" \"strDisplayHarnessParms\": \"\", ");
}
tools.appendString("  ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "EncryptURL"))))) {
tools.appendString(" ");

  	tools.putSaveValue("bEncryptURLs", "true");

tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" ");

  	tools.putSaveValue("bEncryptURLs", "false");

tools.appendString(" ");
}
tools.appendString("  ");
	if (pega.isPreviewMode() || !tools.getParamValue("bExcludeLegacyJS").equalsIgnoreCase("true")) {
tools.appendString(" ");

tempstrKey = "";
String tempinsname = "";
String tempObjClass = "";
String tempPageName = "";

ClipboardPage theStepPage = tools.getStepPage();

if (theStepPage != null) {
  try {
    tempstrKey = tools.getDatabase().getHandle(theStepPage);
  } catch (DatabaseException dbEx) {
    oLog.debug("Failed to calculate handle in PRWBScripts", dbEx);
    tempstrKey = "";
  }

  tempstrKey = pega_rules_utilities.getJSEncodedValue(tempstrKey);
  tempinsname = theStepPage.getString(".pxInsName");
  tempinsname = pega_rules_utilities.getJSEncodedValue(tempinsname);
  tempObjClass = theStepPage.getString(".pxObjClass");
  tempPageName = theStepPage.getName();
  
  tools.putSaveValue("strKey", tempstrKey);
  tools.putSaveValue("strPageName", tempPageName);
}

tools.appendString(" \"insName\": \"");
 tools.appendString(tempinsname); 
tools.appendString("\", \"strClassName\": \"");
 tools.appendString(tempObjClass); 
tools.appendString("\", \"pxReqURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", \"portalVersion\": \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "pxThread.pyPortalVersion", "normal")) {
	return;
}
tools.appendString("\", ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("bFlowAction"), "true")))) {
tools.appendString(" \"gsServerReqURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", \"safeUrlRequestURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", ");

  	tools.putSaveValue("bEncryptURLs", "false");

tools.appendString(" ");
boolean whenResult_4 = pega.invokeWhen("EncryptURL", "", "");
	if (whenResult_4) {
tools.appendString(" ");

  	tools.putSaveValue("bEncryptURLs", "true");

tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
tools.appendString(" ");
}
tools.appendString("  ");
	}
tools.appendString(" \"bEncryptURLs\": ");
out.print( tools.getSaveValue("bEncryptURLs") );
tools.appendString(", \"strKey\": \"");
out.print( tools.getSaveValue("strKey") );
tools.appendString("\", \"strPageName\": \"");
out.print( tools.getSaveValue("strPageName") );
tools.appendString("\" }, \"pega.d\" : { ");
boolean whenResult_6 = pega.invokeWhen("InCompositeDesktop", "", "");
	if (whenResult_6) {
tools.appendString(" \"productionLevel\": \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "pxProcess.pzProductionLevel", "javascript")) {
	return;
}
tools.appendString("\", \"activeSpaceName\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "javascript"
 */
if (_jspx_meth_pega_reference__2(pageContext, "param.spaceName", "javascript")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" \"obfuscateKey\": \"");
out.print( tools.getObfuscationKey() );
tools.appendString("\", \"globalobfuscateKey\": \"");
out.print( tools.getGlobalObfuscationKey() );
tools.appendString("\", \"pxReqURI\": \"");
 tools.appendString(pxReqURI); 
tools.appendString("\", \"pxHelpURI\": \"");

/*
 * reference tag
 * Cannot inline because: mode is "javascript"
 */
if (_jspx_meth_pega_reference__2(pageContext, "pyPortal.pyHelpContentInformation.pxPortalHelpURI", "javascript")) {
	return;
}
tools.appendString("\" }, \"pega.desktop\" : { \"pyRequestorToken\": \"");
out.print(tools.getRequestor().getRequestorPage().getString("pyRequestorToken") );
tools.appendString("\", \"pxClientSession\": \"");
out.print(tools.getRequestor().getRequestorPage().getString("pxClientSession") );
tools.appendString("\" }, \"pega.u.d\" : { \"bExcludeLegacyJS\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.bExcludeLegacyJS")) {
	return;
}
tools.appendString("\", \"portalName\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.portalName")) {
	return;
}
tools.appendString("\", \"portalID\": \"");
out.print(tools.findPage("pxThread").getString("pyPortalID"));
tools.appendString("\",   ");
  if( ("true".equals(tools.getRootParamValue("isDCSPA")) || "true".equals(tools.getRootParamValue("isMDC")) || "true".equals(tools.getParamValue("pyIsSPA"))) ){ 
tools.appendString(" ");
	if (when_2("skinRuleName", "")) {
tools.appendString(" \"skinRuleName\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(skinRuleName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(skinRuleName)")) {
	return;
}
tools.appendString("\", ");
	}
tools.appendString(" ");

} else {

tools.appendString(" \"skinRuleName\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(skinRuleName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(skinRuleName)")) {
	return;
}
tools.appendString("\", ");

       }

tools.appendString(" \"documentKey\": \"");
out.print( tools.getPrimaryPage()!= null ? StringUtils.escapeIntoJavaString(StringUtils.crossScriptingFilter(tools.getPrimaryPage().getString("pzDocumentKey"))) : "" );
tools.appendString("\", \"documentTooltip\": \"");
out.print( tools.getPrimaryPage()!= null ? StringUtils.escapeIntoJavaString(StringUtils.crossScriptingFilter(tools.getPrimaryPage().getString("pyDocumentTooltip"))) : "" );
tools.appendString("\", ");
choose_4();
tools.appendString("  ");
choose_5();
tools.appendString("  ");
choose_6();
tools.appendString("  ");

if (((!isPackaging) && (isHybridClient || isPegaElectron )) || isMobileClient ) {
  if(isMobileClient && isPackaging){

tools.appendString(" \"url\": \"");
if (_jspx_meth_pega_url__1(pageContext)) {
	return;
}
tools.appendString("\".replace(\"PRRestService\", \"PRAuth\"), ");
    
}else {

tools.appendString(" \"url\": \"");
if (_jspx_meth_pega_url__1(pageContext)) {
	return;
}
tools.appendString("\", ");
    
  }
}

tools.appendString(" \"keepFixedVisible\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.KeepFixedVisible")) {
	return;
}
tools.appendString("\", \"ignoreDirty\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.IgnoreDirty")) {
	return;
}
tools.appendString("\", \"harnessType\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(harnessType)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(harnessType)")) {
	return;
}
tools.appendString("\", \"topHarness\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(topHarness)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(topHarness)")) {
	return;
}
tools.appendString("\", \"formPost\": \"");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_p_r__1(pageContext, "param.formPost")) {
	return;
}
tools.appendString("\", \"assign_02\": \"if(pega.ui.HarnessContextMap.get(\\\"keepFixedVisible\\\") == \\\"\\\") pega.ui.HarnessContextMap.set(\\\"keepFixedVisible\\\",true);\",  \"AccordionAnimSpeed\": 1, ");
choose_7();
tools.appendString("  ");
boolean whenResult_11 = pega.invokeWhen("isAccessible", "", "");
	if (whenResult_11) {
tools.appendString(" \"isAccessible\": true, ");
boolean whenResult_13 = pega.invokeWhen("WarnBeforeChangingWindow", "", "");
	if (whenResult_13) {
tools.appendString(" \"bWarnBeforeChangingWindow\": true, ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");

  String localizedString="";
if(tools.getPrimaryPage()!=null)
  localizedString = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString( ".pyCaption", tools.getDictionary().fromDefinition(tools.getPrimaryPage().getString("pxObjClass"), "pyLabel"), StreamBuilder.FMT_JAVASCRIPT));

tools.appendString(" \"workLabel\": \"");
out.print( localizedString);
tools.appendString("\", \"formErrorType\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(FormError)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(FormError)")) {
	return;
}
tools.appendString("\", \"fieldErrorType\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(FieldError)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(FieldError)")) {
	return;
}
tools.appendString("\", \"alwaysShowFormLevelErrors\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(AlwaysShowFormLevelErrors)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(AlwaysShowFormLevelErrors)")) {
	return;
}
tools.appendString("\", \"pyCustomError\": \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(pyCustomError)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(pyCustomError)")) {
	return;
}
tools.appendString("\" }, \"pega.feedback.Globals\" : { ");
	if (pega.isPreviewMode() || tools.getThread().getAuthorization().havePrivilege(tools.getThread(), "UserFeedback", "Pega-Feedback", tools.getStepPage())) {
tools.appendString(" ");
 /* Added below when condition for BUG-117159 */ 
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getProperty("pxThread.pxPortal").getStringValue().equals("Developer")) {
tools.appendString(" ");

  /* Check if property exists */
  ClipboardProperty prefProperty = tools.getProperty("OperatorID.pyPreferences.pyToolsPrefs.pyShowFeedbackPin");
String desktopType = tools.getProperty("pyPortal.pyDesktopType").getStringValue();

if (prefProperty == null || (prefProperty != null && prefProperty.getStringValue().equals(""))) {
  tools.putParamValue("Preferred", true);
} else {
  tools.putParamValue("Preferred", prefProperty.toBoolean());
}

tools.appendString(" ");
	if (pega.isPreviewMode() || Boolean.valueOf(tools.getParamValue("Preferred")).booleanValue()) {
tools.appendString(" ");

  String originatorEmail = null;
try {
  originatorEmail = tools.findPage("OperatorID").getProperty("pyAddresses").getProperty("Email").getPageValue().getString("pyEmailAddress");
}
catch(Exception e) {
  originatorEmail = "";
}

tools.appendString(" \"assign_01\": \"pega.namespace(\\\"pega.feedback\\\");\", \"assign_02\": \"pega.u.d.HideFeedback = '");

/*
 * reference tag
 * Cannot inline because: parameter reference
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.HideFeedback")) {
	return;
}
tools.appendString("';\", \"assign_03\": \"pega.feedback.Globals = {};\", ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("HideFeedback"), "true")))) {
tools.appendString(" ");

  String pmfEnabled = null;
ClipboardPage app = tools.findPage("Application");
if (app != null) {
  pmfEnabled = app.getString("pyProjectManagementEnabled");
}
if (pmfEnabled != null && !pmfEnabled.toLowerCase().equals("true")) {
  tools.appendString("\"assign_03-feedback\": \"pega.feedback.bPMFEnabled = false\",");
}
tools.appendString("  \"originatorEmail\": \"");
out.print(originatorEmail);
tools.appendString("\", \"assign_04\": \"pega.util.Event.addListener(window,\\\"load\\\",handlePushpinOnLoad)\" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
tools.appendString(" \"originatorEmail\": \"");
out.print(originatorEmail);
tools.appendString("\" ");
}
tools.appendString("  ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");
	}
tools.appendString(" } }; processDynamicData(bottomVars); ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("bFlowAction"), "true")))) {
tools.appendString("  ");
	if (pega.isPreviewMode() || ((areValsEqual(tools.getSaveValue("bClientValidation"), "true")) || (areValsEqual(tools.getSaveValue("bExpressionCalculation"), "true")))) {
tools.appendString(" ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue("bClientValidation"), "true"))) {
tools.appendString(" ");

    String strValidate = tools.getSaveValue("FlowActionValidate");
if(strValidate .equals("")){

  if(tools.getPrimaryPage().getString("pyID").equals("")){
    strValidate="OnAdd";
  }else{
    strValidate="Validate";
  }
}
if(!strValidate.equals("NO_VALIDATION")){
  StringMap validate_keys = new HashStringMap();
  validate_keys.put("pxObjClass", "Rule-Obj-Validate");
  validate_keys.put("pyActivityName", strValidate);
  if(!tools.getPrimaryPage().getName().equals("")){ /* getMetaData PublicAPI throws exception for unnamed page */
    java.util.Map metadata = tools.getMetadata(validate_keys, tools.getPrimaryPage());
    if(metadata!=null){
      if(!metadata.isEmpty()){
        tools.appendString("");
        tools.appendString("function configure_rule_obj_validate(){");
        java.util.Iterator iter_metadata = metadata.keySet().iterator();
        String name;
        String values[];
        try {
          while(iter_metadata .hasNext()){
            name=(String)iter_metadata .next();
            values = (String[])metadata.get(name);
            tools.appendString("rule_obj_validate('"+name+"','"+values[0]+"','"+values[3]+"','");
            if(tools.getRuleMessage(values[4]).startsWith("**"))
              tools.appendString(tools.getLocalizedTextForString("pyMessageLabel", values[4]));
            else
              tools.appendString(tools.getRuleMessage(values[4]));
            tools.appendString("');");
          }
        } catch (Exception e) {
          oLog.error("Exception occurred for " + strValidate + "--" + e.getMessage());
        }
        tools.appendString("}");
        tools.appendString("");
      }
    }else{
      oLog.info("Meta Data is null for "+strValidate +" for page "+tools.getPrimaryPage().getName());
    }
  }
}

tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_15 = pega.invokeWhen("isAccessible", "", "");
	if (whenResult_15) {
tools.appendString(" if(typeof(display_displayConfirm)!='undefined' && typeof(accessibleErrorHandling)!='undefined' && accessibleErrorHandling){ /* function used to show all errors - usually called before submit */ validation_displayErrors = display_displayConfirm; /* function used to show one error - usually called by an event */ validation_displayFieldError = display_displayConfirm; } ");
	}
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString("   var harCtxMgr = pega.ui.HarnessContextMgr; var pyRequestorToken = harCtxMgr.get(\"pyRequestorToken\"); var pxClientSession = harCtxMgr.get(\"pxClientSession\"); try { if(window == pega.desktop.support.getDesktopWindow() && window.localStorage){ localStorage.setItem(\"pyRequestorToken\"+pxClientSession, pyRequestorToken); localStorage.setItem(\"pyRequestorToken\", pyRequestorToken); } } catch (e) { console.debug(\"Issue: window.localStorage not supported by browser. Perhaps you are in private/incognito mode.\"); } ");
	if (pega.isPreviewMode() || !tools.getParamValue("bExcludeLegacyJS").equalsIgnoreCase("true")) {
tools.appendString(" ");
choose_8();
tools.appendString("  ");
	}
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "@baseclass");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "pzClientDynamicDataBottom");
	oStreamProperties_3.put("pyRuleSetVersion", "08-07-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT	Pega-UIEngine:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
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

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_6() throws Throwable {
tools.appendString(" ");
 
    boolean arePackaging = pega_uiengine_offlinesupport.pzIsForOfflineTemplate(); 
  	String topHarness = tools.getParamValue("topHarness");
   
  	/* If included by harness generated java or in a flow action in iframe */
  	if (tools.getSaveValue("AutoDocInfoInclude").equals("true") || tools.getSaveValue("bFlowAction").equals("true")) { 
   
		/* Add bottom vars for portal harness only when packaging, always set primpary page when packaging */
		if ((arePackaging && topHarness.equals("yes")) || (!arePackaging)) {  
tools.appendString(" <script > ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT */
include_2();

tools.appendString(" </script> ");

		}    
		else if (arePackaging) { 
tools.appendString(" <script> pega.u.d.setPrimaryPage('");
out.print(tools.getPrimaryPage().getName());
tools.appendString("'); </script> ");

    	} 
       
		/* Include prebuilt expression map string if expressions enabled  */
    	if (tools.getSaveValue("bExpressionCalculation").equals("true")) { 
tools.appendString(" <script> ");
/* Include stream RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT */
include_3();

tools.appendString(" </script> ");

        } 
       
tools.appendString(" ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT */
include_4();

tools.appendString(" ");
     
  	/* Not included in harness therefore ajax operation, load any additional script files */
  	} else {
  	
tools.appendString(" ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT */
include_5();

tools.appendString(" ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT */
include_4();

tools.appendString(" ");

  	}

   
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT */
include_6();

tools.appendString(" <script> ");
/* Include stream RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT */
include_7();

tools.appendString(" </script>  ");
 
	// if have no staticContentJSOptimization, include deferredStaticBodyContent as normal
	if (!pzAuto.hasStaticContentJSOptimization()) {
   
		// Insert cached deferred script found during rendering
		pzAuto.insertDeferredStaticBodyContent(); 
	} 

}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "DocumentInfo");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT
 */
private void include_8() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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

	performStream_6();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:withPage tag.
 */private boolean _jspx_meth_pega_withPage__2(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:withPage */
com.pega.pegarules.jsptags.WithPageTag _jspx_th_pega_withPage_ = (com.pega.pegarules.jsptags.WithPageTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithPageTag.class);
_jspx_th_pega_withPage_.setPageContext(pageContext);
_jspx_th_pega_withPage_.setParent(mParentTag);
_jspx_th_pega_withPage_.setName(aName);
int _jspx_eval_pega_withPage_ = _jspx_th_pega_withPage_.doStartTag();
if (_jspx_eval_pega_withPage_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_withPage_;
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ListViewFooter", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_withPage_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withPage_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withPage_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName, java.lang.String aMode) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("PreViewMode", "true")) {
tools.appendString(" <tr id='tr_nodata'> ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" <tr class='lvFixedHeaderRow' style='height:100%;'> ");
}
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
/**
 * Build stream RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
StringMap  keys_1 = new HashStringMap();
keys_1.putString("pxObjClass", "Rule-HTML-Fragment");
keys_1.putString("pyStreamName", "ShowMe-ViewInsert");
tools.appendStream(keys_1);
keys_1 = null;
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:withPage tag.
 */private boolean _jspx_meth_pega_withPage__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:withPage */
com.pega.pegarules.jsptags.WithPageTag _jspx_th_pega_withPage_ = (com.pega.pegarules.jsptags.WithPageTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithPageTag.class);
_jspx_th_pega_withPage_.setPageContext(pageContext);
_jspx_th_pega_withPage_.setParent(mParentTag);
_jspx_th_pega_withPage_.setName(aName);
int _jspx_eval_pega_withPage_ = _jspx_th_pega_withPage_.doStartTag();
if (_jspx_eval_pega_withPage_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_withPage_;
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ListViewHeader", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_withPage_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withPage_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withPage_);
return false;
}
private void performStream_7() throws Throwable {
tools.appendString(" ");
if (_jspx_meth_pega_withPage__1(pageContext, "param.pyViewPageName")) {
	return;
}
tools.appendString(" ");
tools.putSaveValue("ViewFieldsCount", "4");
tools.appendString(" ");
String strKeyParams = "&pyClassName=$stream-definition(pyClassName)&pyStreamName=$stream-definition(pyStreamName)&pyOwner=$stream-definition(pyOwner)";tools.putSaveValue("keyParams", strKeyParams);
tools.appendString(" ");
pzAuto.putSaveRef("key", "$stream-definition(pxObjClass)=$stream-definition(pyClassName).$stream-definition(pyStreamName).$stream-definition(pyOwner)", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
pzAuto.putSaveRef("objClass", "$stream-definition(pxObjClass)", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT */
include_1();

tools.appendString(" ");

ClipboardPage pgData = tools.findPage("pyRenameRuleSetLVReportPage");	
if(pgData != null) { 
	tools.putSaveValue("QueryTimeStamp",pgData.getString("pyQueryTimeStamp"));	
	String strMessages = pgData.getMessagesObject().trim();	
	tools.putSaveValue("strMessages",strMessages); 
}

tools.appendString(" <div id='lvdata1'> ");
 
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {
	tools.putSaveValue("strLVSummary","summary='"+tools.getSaveValue("strLVTitle")+"'" ); 
 } 

tools.appendString(" <table class='ViewTableStyle' id='ViewTable' tabIndex=0 ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strLVSummary)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strLVSummary)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strLVOnKeyDown)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strLVOnKeyDown)")) {
	return;
}
tools.appendString(" cellpadding=0 cellspacing=0 onclick='return ViewTable_onclick()' ondblclick='return ViewTable_ondblclick()' onmouseover='return ViewTable_onmouseover()'> ");
choose_1();
tools.appendString("  ");

 /*For order of columns*/ 
 java.util.ArrayList lvColsToDisplay = new java.util.ArrayList(); 
 String strDisplayCols = tools.getParamValue("lv_displaycols"); 
 if(!strDisplayCols.equals("")) { 
	String[] t_cols = strDisplayCols.split("_");
	for (int x=0; x<t_cols.length; x++) {
		lvColsToDisplay.add(t_cols[x]);
	}
 }

tools.appendString(" ");
  
 int lvFilterRecordCount = 0;  
 /* For storing html properties with paramters*/  
 ParameterPage parampgHTML0= new ParameterPage();
 ParameterPage parampgHTML1= new ParameterPage();
 ParameterPage parampgHTML2= new ParameterPage();
 ParameterPage parampgHTML3= new ParameterPage();

tools.appendString(" ");

 for (int colIndex=0; colIndex<4; colIndex++) { 
	int displayColIndex = colIndex; 
	int nColsSize = lvColsToDisplay.size(); 
	if(nColsSize > 0) { 
		if(colIndex < nColsSize) { 
			String strTmpIndex = (String)lvColsToDisplay.get(colIndex);
			try { 
				displayColIndex = Integer.parseInt(strTmpIndex)-1; 
			}catch(NumberFormatException e) {} 
		} else { 
			break; 
		} 
	} 
	
tools.appendString(" ");
 if(displayColIndex == 0) { 
tools.appendString(" ");

		String strFilterColumn = tools.getParamValue("lv_filtercol0"); 
		
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_Key' ");
tools.putSaveValue("columnProperty", tools.findPage(tools.getParamValue("pyViewPageName")).getProperty(".pyFields(1).pySelectionProperty").getStringValue());
tools.appendString(" ondblclick='window.event.cancelBubble = true;' style='cursor: pointer;cursor: hand;' onclick='sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"1\">");
String strSortedColumn0 = tools.getParamValue("sortColumn");    tools.putSaveValue("strColSpan",""); tools.putSaveValue("strColOrderTip",""); tools.putSaveValue("strColOrder","");if(tools.getSaveValue("columnProperty").equals(strSortedColumn0))   {	if (tools.getParamValue("sortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D");  } 	else  if (tools.getParamValue("sortingOrder").equals("A")){ tools.putSaveValue("strColSpan","U"); }}else if(strSortedColumn0.equals("")){	if(tools.getSaveValue("columnProperty").equals(tools.getSaveValue("lvdefSortColumn"))) 	{		if (tools.getSaveValue("lvdefSortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D"); }		else if(tools.getSaveValue("lvdefSortingOrder").equals("A")) { tools.putSaveValue("strColSpan","U"); }	}}
  String strColumnTitle0= "Click to sort by"; tools.putSaveValue("strColumnTitle",strColumnTitle0 ); 
  String strColumnCaptionNew0 = "Key"; tools.putSaveValue("strColumnCaption",strColumnCaptionNew0 );  
  String strRowTitle0= "Click for a detailed view"; tools.putSaveValue("strRowTitle",strRowTitle0 );    if(tools.getSaveValue("strColSpan").equals("D")) {          tools.putSaveValue("strColOrderTip","(Currently in Descending Order)");      tools.putSaveValue("strColOrder"," in Ascending");  }else if(tools.getSaveValue("strColSpan").equals("U")){          tools.putSaveValue("strColOrderTip","(Currently in Ascending Order)");      tools.putSaveValue("strColOrder","in Descending");  }    
tools.appendString("<span class= 'lv_header_span'><a href='javascript:sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnTitle)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnTitle)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnCaption)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrder)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColOrder)")) {
	return;
}
tools.appendString("'>");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
		if (tools.getSaveValue("strColSpan").equals("D")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowdown' style='width:12px;' title='Descending Order'></span>"); }		else if(tools.getSaveValue("strColSpan").equals("U")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowup' style='width:12px;' title='Ascending Order'></span>"); }
tools.appendString("</a></span></div> </th> ");
 } else if(displayColIndex == 1) { 
tools.appendString(" ");

		String strFilterColumn = tools.getParamValue("lv_filtercol1"); 
		
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_ClassName' ");
tools.putSaveValue("columnProperty", tools.findPage(tools.getParamValue("pyViewPageName")).getProperty(".pyFields(2).pySelectionProperty").getStringValue());
tools.appendString(" ondblclick='window.event.cancelBubble = true;' style='cursor: pointer;cursor: hand;' onclick='sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"2\">");
String strSortedColumn1 = tools.getParamValue("sortColumn");    tools.putSaveValue("strColSpan",""); tools.putSaveValue("strColOrderTip",""); tools.putSaveValue("strColOrder","");if(tools.getSaveValue("columnProperty").equals(strSortedColumn1))   {	if (tools.getParamValue("sortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D");  } 	else  if (tools.getParamValue("sortingOrder").equals("A")){ tools.putSaveValue("strColSpan","U"); }}else if(strSortedColumn1.equals("")){	if(tools.getSaveValue("columnProperty").equals(tools.getSaveValue("lvdefSortColumn"))) 	{		if (tools.getSaveValue("lvdefSortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D"); }		else if(tools.getSaveValue("lvdefSortingOrder").equals("A")) { tools.putSaveValue("strColSpan","U"); }	}}
  String strColumnTitle1= "Click to sort by"; tools.putSaveValue("strColumnTitle",strColumnTitle1 ); 
  String strColumnCaptionNew1 = "Class Name"; tools.putSaveValue("strColumnCaption",strColumnCaptionNew1 );  
  String strRowTitle1= "Click for a detailed view"; tools.putSaveValue("strRowTitle",strRowTitle1 );    if(tools.getSaveValue("strColSpan").equals("D")) {          tools.putSaveValue("strColOrderTip","(Currently in Descending Order)");      tools.putSaveValue("strColOrder"," in Ascending");  }else if(tools.getSaveValue("strColSpan").equals("U")){          tools.putSaveValue("strColOrderTip","(Currently in Ascending Order)");      tools.putSaveValue("strColOrder","in Descending");  }    
tools.appendString("<span class= 'lv_header_span'><a href='javascript:sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnTitle)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnTitle)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnCaption)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrder)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColOrder)")) {
	return;
}
tools.appendString("'>");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
		if (tools.getSaveValue("strColSpan").equals("D")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowdown' style='width:12px;' title='Descending Order'></span>"); }		else if(tools.getSaveValue("strColSpan").equals("U")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowup' style='width:12px;' title='Ascending Order'></span>"); }
tools.appendString("</a></span></div> </th> ");
 } else if(displayColIndex == 2) { 
tools.appendString(" ");

		String strFilterColumn = tools.getParamValue("lv_filtercol2"); 
		
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_RuleSet' ");
tools.putSaveValue("columnProperty", tools.findPage(tools.getParamValue("pyViewPageName")).getProperty(".pyFields(3).pySelectionProperty").getStringValue());
tools.appendString(" ondblclick='window.event.cancelBubble = true;' style='cursor: pointer;cursor: hand;' onclick='sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"3\">");
String strSortedColumn2 = tools.getParamValue("sortColumn");    tools.putSaveValue("strColSpan",""); tools.putSaveValue("strColOrderTip",""); tools.putSaveValue("strColOrder","");if(tools.getSaveValue("columnProperty").equals(strSortedColumn2))   {	if (tools.getParamValue("sortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D");  } 	else  if (tools.getParamValue("sortingOrder").equals("A")){ tools.putSaveValue("strColSpan","U"); }}else if(strSortedColumn2.equals("")){	if(tools.getSaveValue("columnProperty").equals(tools.getSaveValue("lvdefSortColumn"))) 	{		if (tools.getSaveValue("lvdefSortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D"); }		else if(tools.getSaveValue("lvdefSortingOrder").equals("A")) { tools.putSaveValue("strColSpan","U"); }	}}
  String strColumnTitle2= "Click to sort by"; tools.putSaveValue("strColumnTitle",strColumnTitle2 ); 
  String strColumnCaptionNew2 = "RuleSet"; tools.putSaveValue("strColumnCaption",strColumnCaptionNew2 );  
  String strRowTitle2= "Click for a detailed view"; tools.putSaveValue("strRowTitle",strRowTitle2 );    if(tools.getSaveValue("strColSpan").equals("D")) {          tools.putSaveValue("strColOrderTip","(Currently in Descending Order)");      tools.putSaveValue("strColOrder"," in Ascending");  }else if(tools.getSaveValue("strColSpan").equals("U")){          tools.putSaveValue("strColOrderTip","(Currently in Ascending Order)");      tools.putSaveValue("strColOrder","in Descending");  }    
tools.appendString("<span class= 'lv_header_span'><a href='javascript:sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnTitle)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnTitle)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnCaption)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrder)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColOrder)")) {
	return;
}
tools.appendString("'>");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
		if (tools.getSaveValue("strColSpan").equals("D")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowdown' style='width:12px;' title='Descending Order'></span>"); }		else if(tools.getSaveValue("strColSpan").equals("U")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowup' style='width:12px;' title='Ascending Order'></span>"); }
tools.appendString("</a></span></div> </th> ");
 } else if(displayColIndex == 3) { 
tools.appendString(" ");

		String strFilterColumn = tools.getParamValue("lv_filtercol3"); 
		
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_RuleSetVersion' ");
tools.putSaveValue("columnProperty", tools.findPage(tools.getParamValue("pyViewPageName")).getProperty(".pyFields(4).pySelectionProperty").getStringValue());
tools.appendString(" ondblclick='window.event.cancelBubble = true;' style='cursor: pointer;cursor: hand;' onclick='sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"4\">");
String strSortedColumn3 = tools.getParamValue("sortColumn");    tools.putSaveValue("strColSpan",""); tools.putSaveValue("strColOrderTip",""); tools.putSaveValue("strColOrder","");if(tools.getSaveValue("columnProperty").equals(strSortedColumn3))   {	if (tools.getParamValue("sortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D");  } 	else  if (tools.getParamValue("sortingOrder").equals("A")){ tools.putSaveValue("strColSpan","U"); }}else if(strSortedColumn3.equals("")){	if(tools.getSaveValue("columnProperty").equals(tools.getSaveValue("lvdefSortColumn"))) 	{		if (tools.getSaveValue("lvdefSortingOrder").equals("D")) { tools.putSaveValue("strColSpan","D"); }		else if(tools.getSaveValue("lvdefSortingOrder").equals("A")) { tools.putSaveValue("strColSpan","U"); }	}}
  String strColumnTitle3= "Click to sort by"; tools.putSaveValue("strColumnTitle",strColumnTitle3 ); 
  String strColumnCaptionNew3 = "RuleSet Version"; tools.putSaveValue("strColumnCaption",strColumnCaptionNew3 );  
  String strRowTitle3= "Click for a detailed view"; tools.putSaveValue("strRowTitle",strRowTitle3 );    if(tools.getSaveValue("strColSpan").equals("D")) {          tools.putSaveValue("strColOrderTip","(Currently in Descending Order)");      tools.putSaveValue("strColOrder"," in Ascending");  }else if(tools.getSaveValue("strColSpan").equals("U")){          tools.putSaveValue("strColOrderTip","(Currently in Ascending Order)");      tools.putSaveValue("strColOrder","in Descending");  }    
tools.appendString("<span class= 'lv_header_span'><a href='javascript:sortColumn(\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(columnProperty)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(columnProperty)")) {
	return;
}
tools.appendString("\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnTitle)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnTitle)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColumnCaption)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrder)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColOrder)")) {
	return;
}
tools.appendString("'>");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
		if (tools.getSaveValue("strColSpan").equals("D")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowdown' style='width:12px;' title='Descending Order'></span>"); }		else if(tools.getSaveValue("strColSpan").equals("U")) { tools.appendString("<span nowrap='nowrap' class='rplistarrowup' style='width:12px;' title='Ascending Order'></span>"); }
tools.appendString("</a></span></div> </th> ");
 } 
tools.appendString(" ");
 } 
tools.appendString(" </tr> ");
	if (pega.isPreviewMode() || !(tools.getSaveValue("strMessages").length() > 0)) {
tools.appendString(" ");
tools.putSaveValue("HasData", "false");
tools.appendString(" ");
 String strAlternateStyle = ""; 
tools.appendString(" ");
/* pega:forEach */
com.pega.pegarules.jsptags.ForEachTag _jspx_th_pega_forEach__1 = (com.pega.pegarules.jsptags.ForEachTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ForEachTag.class);
_jspx_th_pega_forEach__1.setPageContext(pageContext);
_jspx_th_pega_forEach__1.setParent(mParentTag);
_jspx_th_pega_forEach__1.setName("pyRenameRuleSetLVReportPage.pxResults");
int _jspx_eval_pega_forEach__1 = _jspx_th_pega_forEach__1.doStartTag();
if (_jspx_eval_pega_forEach__1 != Tag.SKIP_BODY) {
	if (_jspx_eval_pega_forEach__1 != Tag.EVAL_BODY_INCLUDE) {
		BodyContent bodyContent = pageContext.pushBody();
		out = bodyContent;
		_jspx_th_pega_forEach__1.setBodyContent(bodyContent);
		_jspx_th_pega_forEach__1.doInitBody();
	}	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_forEach__1;
tools.appendString(" ");
/* pega:withEmbedded */
com.pega.pegarules.jsptags.WithEmbeddedTag _jspx_th_pega_withEmbedded__1 = (com.pega.pegarules.jsptags.WithEmbeddedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithEmbeddedTag.class);
_jspx_th_pega_withEmbedded__1.setPageContext(pageContext);
_jspx_th_pega_withEmbedded__1.setParent(mParentTag);
_jspx_th_pega_withEmbedded__1.setName("$this");
int _jspx_eval_pega_withEmbedded__1 = _jspx_th_pega_withEmbedded__1.doStartTag();
if (_jspx_eval_pega_withEmbedded__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_2 = mParentTag;
mParentTag = _jspx_th_pega_withEmbedded__1;
tools.appendString(" ");

	ClipboardPage pgCurRow = tools.getActive().getPageValue();	
	tools.putSaveValue("filterThisRow","false");	
		
tools.appendString(" ");
 if(strAlternateStyle.equals("")){ strAlternateStyle = ""; } else { strAlternateStyle = "";} 
 if(tools.getSaveValue("bEnableAccessibility").equals("true") && (tools.getActive().indexOf() == 1)) { tools.putSaveValue("strLVOnFocus","onfocus='scrollViewTable(event);'" ); } else {tools.putSaveValue("strLVOnFocus","" );  } 
 tools.putSaveValue("strTabIndex","tabIndex=0" );  
 if(tools.getSaveValue("bEnableAccessibility").equals("true") && (tools.getActive().indexOf() == 1)) { tools.putSaveValue("strLVOnFocus","onfocus='scrollViewTable(event);'" ); } else {tools.putSaveValue("strLVOnFocus","" );  } 
 tools.putSaveValue("strTabIndex","tabIndex=0" );  
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ListView_ProcessFilteredInRow", null, null, null, null);
tools.appendString(" ");
tools.putSaveValue("HasData", "true");
tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "ListView_OddRow"))))) {
tools.appendString(" <tr title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strRowTitle)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strRowTitle)")) {
	return;
}
tools.appendString("' ");
 if(tools.getActive().indexOf() == 1) tools.appendString(tools.getSaveValue("strTabIndex")); 
tools.appendString(" rowIndex ='");
out.print( tools.getActive().indexOf() + "");
tools.appendString("' class='");
out.print( strAlternateStyle);
tools.appendString(" listTableRowStyle' ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strLVOnFocus)", "literal")) {
	return;
}
tools.appendString(" onMouseOver= \"highlightRow(this, true)\" onMouseOut = \"highlightRow(this, false)\" > ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || ((invokeWhenRule(tools, "ListView_EvenRow"))))) {
tools.appendString(" <tr title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strRowTitle)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strRowTitle)")) {
	return;
}
tools.appendString("' ");
 if(tools.getActive().indexOf() == 1) tools.appendString(tools.getSaveValue("strTabIndex")); 
tools.appendString(" rowIndex ='");
out.print( tools.getActive().indexOf() + "");
tools.appendString("' class='");
out.print( strAlternateStyle);
tools.appendString(" listTableRowShadedStyle' ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strLVOnFocus)", "literal")) {
	return;
}
tools.appendString(" onMouseOver= \"highlightRow(this, true)\" onMouseOut = \"highlightRow(this, false)\" > ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" <tr class='");
out.print( strAlternateStyle);
tools.appendString("' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strRowTitle)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strRowTitle)")) {
	return;
}
tools.appendString("' rowIndex ='");
out.print( tools.getActive().indexOf()+ "");
tools.appendString("' onMouseOver= \"highlightRow(this, true)\" onMouseOut = \"highlightRow(this, false)\" > ");
}
tools.appendString("  ");
  if(!tools.getParamValue("ViewReadOnly").equalsIgnoreCase("true"))  {  ClipboardPage pgCurrentRow = tools.getActive().getPageValue();   String strTheKey = pgCurrentRow.getStringIfPresent(".pxInsHandle") ;   String strInsName = pgCurrentRow.getStringIfPresent(".pxInsName") ;   String strClassName = pgCurrentRow.getClassName();   if(strTheKey == null || strTheKey.length() == 0) strTheKey = pgCurrentRow.getStringIfPresent(".pzInsKey") ;   if(strTheKey == null || strTheKey.length() == 0) try{strTheKey = tools.getDatabase().getHandle(pgCurrentRow);}catch(DatabaseException de){}    if(strTheKey == null) strTheKey = "";   if(strInsName == null) strInsName = "";   int nRowIdx = tools.getActive().indexOf();    tools.appendString("<DIV id='vKeys'> ");   tools.appendString("<Label id='VIsn" + nRowIdx + "'>" + com.pega.pegarules.pub.util.StringUtils.crossScriptingFilter(strInsName) +"</Label> ");   tools.appendString("<Label id='VKey" + nRowIdx + "'>" + com.pega.pegarules.pub.util.StringUtils.crossScriptingFilter(strTheKey) + "</Label> ");   tools.appendString("<Label id='VCls" + nRowIdx + "'>" + strClassName+ "</Label> ");   tools.appendString("</DIV> "); } 
tools.appendString(" ");
 
		tools.putSaveValue("SelectionChecked"," checked "); 
		ClipboardPage pgRowSelected = tools.getActive().getPageValue(); 
		if(!pgRowSelected.getString(".pyRowSelected").equalsIgnoreCase("true"))  { 
			pgRowSelected.putString("pyRowSelected","false"); 
			tools.putSaveValue("SelectionChecked",""); 
		} 
	
tools.appendString(" ");
 for (int colIndex=0; colIndex<4; colIndex++) { 
	int displayColIndex = colIndex; 
	int nColsSize = lvColsToDisplay.size(); 
	if(nColsSize > 0) { 
		if(colIndex < nColsSize) { 
			String strTmpIndex = (String)lvColsToDisplay.get(colIndex);
			try { 
				displayColIndex = Integer.parseInt(strTmpIndex)-1; 
			}catch(NumberFormatException e) {} 
		} else { 
			break; 
		} 
	} 

tools.appendString(" ");

	if(displayColIndex == 0) { 
tools.appendString(" <td class='tdLeftStyle' ");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_Key' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage0 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp0 = pgCurrentPage0.getProperty(".pzInsKey");    
		tools.appendProperty(cpTmpProp0,null,false);    

tools.appendString(" </td> ");

	} else if(displayColIndex == 1) { 
tools.appendString(" <td class='tdLeftStyle' ");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_ClassName' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage1 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp1 = pgCurrentPage1.getProperty(".pyClassName");    
		tools.appendProperty(cpTmpProp1,null,false);    

tools.appendString(" </td> ");

	} else if(displayColIndex == 2) { 
tools.appendString(" <td class='tdLeftStyle' ");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_RuleSet' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage2 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp2 = pgCurrentPage2.getProperty(".pyRuleSet");    
		tools.appendProperty(cpTmpProp2,null,false);    

tools.appendString(" </td> ");

	} else if(displayColIndex == 3) { 
tools.appendString(" <td class='tdLeftStyle' ");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_RuleSetVersion' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage3 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp3 = pgCurrentPage3.getProperty(".pyRuleSetVersion");    
		tools.appendProperty(cpTmpProp3,null,false);    

tools.appendString(" </td> ");
 } 
tools.appendString(" ");
 } 
tools.appendString(" </tr> ");
mParentTag = prevParentTag_2;
		int evalDoAfterBody = _jspx_th_pega_withEmbedded__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withEmbedded__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withEmbedded__1);
tools.appendString(" ");
mParentTag = prevParentTag_1;
		int evalDoAfterBody = _jspx_th_pega_forEach__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
	if (_jspx_eval_pega_forEach__1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
		out = pageContext.popBody();
	}
}
if (_jspx_th_pega_forEach__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_forEach__1);
tools.appendString(" ");
	}
tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("strMessages").length() > 0)) {
tools.appendString(" <TR id='tr_nodata' class='listTableRowStyle'><TD class='tdLeftStyle' colspan='4' >");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strMessages)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strMessages)")) {
	return;
}
tools.appendString("</TD></TR> ");
	
					ClipboardPage pgDataTmp1 = tools.findPage("pyRenameRuleSetLVReportPage");	
					pgDataTmp1.clearMessages(); 
				
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.findPage("pyRenameRuleSetLVReportPage").getProperty(".pxResults").size() == 0)) {
tools.appendString(" <TR id='tr_nodata' class='listTableRowStyle'><TD class='tdLeftStyle' colspan='4' >");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(NoMatchFoundMsg)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(NoMatchFoundMsg)")) {
	return;
}
tools.appendString("</TD></TR> ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("  </table> </div> ");
if (_jspx_meth_pega_withPage__2(pageContext, "param.pyViewPageName")) {
	return;
}
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT */
include_8();

tools.appendString(" </body> </html> ");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Rule-Application");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT");
	oStreamProperties_1.put("pyOwner", "All");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-ListView");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-RuleRefactoring");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "Delete_RuleSet_Report");
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
	mParentTag = null;
	mStreamResponse = (JSPResponse) tools;
	mHttpServlet = aContext == null ? null : (HttpServlet) aContext.getHttpServlet();
	request = aContext == null ? null : (HttpServletRequest)aContext.getHttpServletRequest();
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-Obj-ListView");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_7 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PYDOMAINOVERRIDE #20180713T133322.219 GMT", "@baseclass pyDomainOverride", "Pega-UIEngine", "08-01-01", "20180713T133322.219 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZINCLUDESKELETONS #20180713T133322.374 GMT", "@baseclass pzIncludeSkeletons", "Pega-UIEngine", "08-01-01", "20180713T133322.374 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZDECLAREEXPRESSIONDEFERRED #20180713T133243.626 GMT", "pzDeclareExpressionDeferred", "Pega-UIEngine", "08-01-01", "20180713T133243.626 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZINCLUDEWEBANALYTICSDI #20180713T133243.745 GMT", "pzIncludeWebAnalyticsDI", "Pega-UIEngine", "08-01-01", "20180713T133243.745 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZONLYONCECHANGES #20180713T133322.434 GMT", "@baseclass pzOnlyOnceChanges", "Pega-UIEngine", "08-01-01", "20180713T133322.434 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-LISTVIEW RULE-APPLICATION DELETE_RULESET_REPORT!ALL #20180713T141410.968 GMT", "Rule-Application Delete_RuleSet_Report All", "Pega-RuleRefactoring", "08-01-01", "20180713T141410.968 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZCLIENTDYNAMICDATABOTTOM #20210407T104643.952 GMT", "@baseclass pzClientDynamicDataBottom", "Pega-UIEngine", "08-07-01", "20210618T153855.616 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT DOCUMENTINFO #20180713T133243.503 GMT", "DocumentInfo", "Pega-UIEngine", "08-01-01", "20180713T133243.503 GMT");
}
