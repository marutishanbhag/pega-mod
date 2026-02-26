package com.pegarules.generated.html_section;
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
import com.pega.pegarules.priv.runtime.IStaticContentRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderSection;
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
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream RULE-OBJ-PROPERTY!GENERAL.
 */
public class ra_stream_general_d38e70a3cbe59d01b9b66e694d0c2958 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.General.Rule_Obj_Property.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1484434280;
private static boolean pz_isValidAssembly= true;
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
	public ra_stream_general_d38e70a3cbe59d01b9b66e694d0c2958(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
		initAssemblyParameters(tools);
	}
public static Map<String, AssemblyParameters> getAssemblyParametersMap(StreamBuilderToolKit tools) {		
 initAssemblyParameters(tools);	
 Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();	
 clone.putAll(oAssemblyParamsMap);	
 return clone;
}
public static void initAssemblyParameters(StreamBuilderToolKit tools) { 
	try {
		if(oAssemblyParamsMap == null || oAssemblyParamsMap.isEmpty()){
			oAssemblyParamsMap = tools.getControlUtilities().getAssemblyParamsMap(oControlPathsMap, tools, oCellRuntimeParamsMap, pxUniqueStreamHash);
		if(oAssemblyParamsMap != null && !oAssemblyParamsMap.isEmpty()){
			oControlPathsMap = null;
			oCellRuntimeParamsMap = null;
		}
		}
	} catch(IllegalStateException e) {
	pz_isValidAssembly = false;
	}
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "28c93d36965306bc180ab0fde5ab3e276cda0fd3";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	if(!pz_isValidAssembly){
	throw new PRRuntimeException("Invalid Section Assembly ");
	}
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
/* Instance RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "28c93d36965306bc180ab0fde5ab3e276cda0fd3";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("General",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT
 * Set up context.
 */
final String prevRuleKey_10 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT";final String prevClass_10 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_10 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_10);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_10);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_10();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_10);
	mStreamResponse.setJspBaseClass(prevClass_10);
	pz_CurrentRuleKey = prevRuleKey_10;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT */
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
	"Rule-File-Text:WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS", 
	"Rule-File-Text:WEBWB!PEGA_UI_WUTILS!JS", 
	"Rule-File-Text:WEBWB!PXOPENRULEADVANCED!JS", 
	"Rule-File-Text:WEBWB!PEGA_UI_OPENRULE!JS", 
	"Rule-File-Text:WEBWB!PEGA_RULEFORM_RMACTION!JS", 
	"Rule-File-Text:WEBWB!RF_GETPARAMS!JS", 
	"Rule-File-Text:WEBWB!ISNSSMARTPROMPTZEUS!JS", 
	"Rule-File-Text:WEBWB!ISNSSMARTPROMPTCORE!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:SMARTPROMPTWITHOPENRULEINCLUDE", 
	"Rule-HTML-Fragment:RMACTION_VARIABLES", 
	"Rule-HTML-Fragment:PZACTIONSETATTRIBUTES", 
	"Rule-HTML-Fragment:SMARTPROMPT", 
	"Rule-HTML-Fragment:RF_GETPARAMSINCLUDE", 
	"Rule-File-Bundle:SMARTPROMPT!SCRIPT", 
	"Rule-File-Bundle:PXOPENRULE!SCRIPT", 
	"Rule-HTML-Section:GENERAL", 
	"Rule-Obj-Property:PYPAGECLASS", 
	"Rule-Obj-Property:PXREQURI", 
	"Rule-Obj-Property:PYSTREAMNAME", 
	"Rule-Obj-Property:PYSTRINGTYPE", 
	"Rule-Obj-Property:PYJAVAOBJECTCLASS", 
	"Rule-Obj-Property:PXTHREADNAME", 
	"Rule-HTML-Property:RF_GETPARAMS", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXDROPDOWN", 
	"Rule-HTML-Property:OPENRULEADVANCED", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS","Rule-File-Text","",false,"","Pega-UIDesign","","RULE-FILE-TEXT WEBWB PEGA_UI_SMARTPROMPTONFOCUS!JS #20180713T133619.669 GMT","WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_UI_WUTILS!JS","Rule-File-Text","",false,"","Pega-WB","","RULE-FILE-TEXT WEBWB PEGA_UI_WUTILS!JS #20180713T131539.879 GMT","WEBWB!PEGA_UI_WUTILS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PXOPENRULEADVANCED!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PXOPENRULEADVANCED!JS #20200901T092404.264 GMT","WEBWB!PXOPENRULEADVANCED!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_UI_OPENRULE!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PEGA_UI_OPENRULE!JS #20201217T121412.225 GMT","WEBWB!PEGA_UI_OPENRULE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_RULEFORM_RMACTION!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PEGA_RULEFORM_RMACTION!JS #20180713T135106.479 GMT","WEBWB!PEGA_RULEFORM_RMACTION!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!RF_GETPARAMS!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB RF_GETPARAMS!JS #20180713T135112.603 GMT","WEBWB!RF_GETPARAMS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!ISNSSMARTPROMPTZEUS!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTZEUS!JS #20190912T062232.821 GMT","WEBWB!ISNSSMARTPROMPTZEUS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!ISNSSMARTPROMPTCORE!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTCORE!JS #20190226T135044.839 GMT","WEBWB!ISNSSMARTPROMPTCORE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SMARTPROMPTWITHOPENRULEINCLUDE","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT","SMARTPROMPTWITHOPENRULEINCLUDE",true,false,"ABSOLUTE_CLASSLESS",-344924644), 
		new DependentRuleInfo("RMACTION_VARIABLES","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT","RMACTION_VARIABLES",true,false,"ABSOLUTE_CLASSLESS",804686993), 
		new DependentRuleInfo("PZACTIONSETATTRIBUTES","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT","PZACTIONSETATTRIBUTES",true,false,"ABSOLUTE_CLASSLESS",791254997), 
		new DependentRuleInfo("SMARTPROMPT","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-05-01","RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT","SMARTPROMPT",true,false,"ABSOLUTE_CLASSLESS",23632326), 
		new DependentRuleInfo("RF_GETPARAMSINCLUDE","Rule-HTML-Fragment","",false,"","Pega-ProCom","08-01-01","RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT","RF_GETPARAMSINCLUDE",true,false,"ABSOLUTE_CLASSLESS",550848167), 
		new DependentRuleInfo("SMARTPROMPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-WB","","RULE-FILE-BUNDLE SMARTPROMPT SCRIPT #20180713T131524.483 GMT","SMARTPROMPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PXOPENRULE!SCRIPT","Rule-File-Bundle","",false,"","Pega-Desktop","","RULE-FILE-BUNDLE PXOPENRULE SCRIPT #20180713T135105.133 GMT","PXOPENRULE!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("GENERAL","Rule-HTML-Section","RULE-OBJ-PROPERTY",false,"","Pega-SystemArchitect","08-01-01","RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT","!GENERAL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1484434280), 
		new DependentRuleInfo("PYPAGECLASS","Rule-Obj-Property","RULE-OBJ-PROPERTY",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT","!PYPAGECLASS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXREQURI","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXREQURI #20180713T131215.530 GMT","!PXREQURI",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYSTREAMNAME","Rule-Obj-Property","RULE-OBJ-PROPERTY",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYSTREAMNAME #20180713T131304.015 GMT","!PYSTREAMNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYSTRINGTYPE","Rule-Obj-Property","RULE-OBJ-PROPERTY",true,"Rule-Obj-Property","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYSTRINGTYPE #20180713T131304.021 GMT","!PYSTRINGTYPE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYJAVAOBJECTCLASS","Rule-Obj-Property","RULE-OBJ-PROPERTY",true,"Rule-Obj-Property","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYJAVAOBJECTCLASS #20180713T131303.856 GMT","!PYJAVAOBJECTCLASS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXTHREADNAME","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXTHREADNAME #20180713T131215.557 GMT","!PXTHREADNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("RF_GETPARAMS","Rule-HTML-Property","",false,"","Pega-Desktop","08-01-01","RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT","RF_GETPARAMS",true,false,"ABSOLUTE_CLASSLESS",26548145), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
		new DependentRuleInfo("PXDROPDOWN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT","PXDROPDOWN",true,false,"ABSOLUTE_CLASSLESS",1414051726), 
		new DependentRuleInfo("OPENRULEADVANCED","Rule-HTML-Property","",false,"","Pega-Desktop","08-23-02","RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT","OPENRULEADVANCED",true,false,"ABSOLUTE_CLASSLESS",74845631), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("CLIENTVALIDATION","Rule-HTML-Property","",false,"","Pega-UIEngine","08-02-01","RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT","CLIENTVALIDATION",true,false,"ABSOLUTE_CLASSLESS",1287463259)
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
//	RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT:20180807T111434.152 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYSTRINGTYPE #20180713T131304.021 GMT:20180713T131304.021 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYJAVAOBJECTCLASS #20180713T131303.856 GMT:20180713T131303.856 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYSTREAMNAME #20180713T131304.015 GMT:20180713T131304.015 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYSTREAMNAME #20180713T131304.015 GMT:20180713T131304.015 GMT
//	RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT:20180713T135131.800 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT:20180713T131957.283 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB RF_GETPARAMS!JS #20180713T135112.603 GMT:20180713T135112.603 GMT
//	RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT:20230925T083901.516 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-BUNDLE PXOPENRULE SCRIPT #20180713T135105.133 GMT:20180713T135105.133 GMT
//	RULE-FILE-TEXT WEBWB PXOPENRULEADVANCED!JS #20200901T092404.264 GMT:20201021T161322.155 GMT
//	RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT:20180713T131549.303 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT:20200403T114021.492 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXREQURI #20180713T131215.530 GMT:20180713T131215.530 GMT
//	RULE-FILE-BUNDLE SMARTPROMPT SCRIPT #20180713T131524.483 GMT:20180713T131524.483 GMT
//	RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTCORE!JS #20190226T135044.839 GMT:20190522T125947.212 GMT
//	RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTZEUS!JS #20190912T062232.821 GMT:20191129T094244.850 GMT
//	RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT:20180713T131549.076 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXTHREADNAME #20180713T131215.557 GMT:20180713T131215.557 GMT
//	RULE-FILE-TEXT WEBWB PEGA_UI_SMARTPROMPTONFOCUS!JS #20180713T133619.669 GMT:20180713T133619.669 GMT
//	RULE-FILE-TEXT WEBWB PEGA_UI_OPENRULE!JS #20201217T121412.225 GMT:20201217T121412.225 GMT
//	RULE-FILE-TEXT WEBWB PEGA_UI_WUTILS!JS #20180713T131539.879 GMT:20180713T131539.879 GMT
//	RULE-FILE-TEXT WEBWB PEGA_RULEFORM_RMACTION!JS #20180713T135106.479 GMT:20180713T135106.479 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT:20181008T083757.252 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT:20180713T133243.581 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYSTREAMNAME #20180713T131304.015 GMT:20180713T131304.015 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYSTREAMNAME #20180713T131304.015 GMT:20180713T131304.015 GMT
//	RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT:20180713T135131.800 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_2(
//	simpleLayout_3(
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTEVENTPARAMS--(STRINGBUFFER,CLIPBOARDPAGE,BOOLEAN) #20180713T133337.845 GMT:20180713T133337.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEDROPDOWN #20230618T001619.478 GMT:20230618T001619.478 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "66106ccb938870cf218d43b4ac16cd1d";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Property";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
String actionName = tools.getParamValue("pyAction");
if(!actionName.equals("PostValue") && !actionName.equals("ReadonlyFormat")){
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("General",1,"Rule-HTML-Section","{'type':'Section','ruleName':'General','insKey':'RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT','sectionType':'standard'}");
pzLayout_2();
pzLayout_4();
pzLayout_6();
 tools.putSaveValue("ContainerID", "");
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {tools.putParamValue("setPostValueURL", "true");} else {tools.appendString("<div style=\"display:none;\" data-postvalue-url=\"" + StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=ReloadCell&StreamName=General")) + "\"></div>");}
 pzSection.endSection(); 
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {tools.putParamValue("setPostValueURL", "");}
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
} else {	PRStackFrame frame = pega.pushStackFrame("ContextPage", null, tools.findPage(tools.getParamValue("contextPage")), false, false);				getControlMarkup_1();	pega.popStackFrame(frame, false);}
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyModalTemplate");
config.put("NewTaskStatus", "pzNonAutoControlParams");
pega.getUIEngine().getUIAction("localAction", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void 
getControlMarkup_1() {
try {
if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyPageClass").getEntryHandle())){
tools.appendString("<div class=\"RequiredField\">");

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyPageClass", "input", "OpenRuleAdvanced")) {
	return;
}
tools.appendString("</div>");
}
else if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyPageClass").getEntryHandle())){
tools.appendString("<div class=\"RequiredField\">");

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyPageClass", "input", "OpenRuleAdvanced")) {
	return;
}
tools.appendString("</div>");
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void pzLayoutHeader_3() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("headerType","COLLAPSIBLE");
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionGeneralBBB"));
if("".equals(tools.getParamValue("EXPANDEDSubSectionGeneralBBB"))) {
metadataPage.put("expanded",true);
} else {
metadataPage.put("expanded",Boolean.parseBoolean(tools.getParamValue("EXPANDEDSubSectionGeneralBBB")));
}
metadataPage.put("isLocalized","false");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","Display and validation");
metadataPage.put("uniqueid", "202602230424000122");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201808070627120143620") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_6() {
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionGeneralBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='3' id='EXPAND-INNERDIV' class='layout-body'  >");
} else {
tools.appendString("<div section_index='3' id='EXPAND-INNERDIV' class='layout-body'  style='display:none'  >");
if(false && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("<input id='EXPAND-INDICATOR' type='hidden' name='" + StringUtils.crossScriptingFilter(expandParam) + "' value='" + expandparamalue + "' />");

tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_6();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_6() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_42","pzPropertyValidationSection", secInfo);
}


public void sectionBodyIncludeInCell_6() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_6();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzPropertyValidationSection"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionCellGeneral607","",false);
}
public void pzLayout_5() {
pzSetExpandParam_6();
pzLayoutBodyWrapper_5();
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_39","pzPropertyValidationSection", secInfo);
}


public void sectionBodyIncludeInCell_5() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzPropertyValidationSection"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}
public void checkForScriptTags_1(String ScriptTags) {
	String isEncodingAllowed = tools.getSystemSettings().getDynamic("Pega-UIEngine","isLinkLabelEncodingAllowed");
	if("false".equals(isEncodingAllowed)){
		tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));
	}
	else{if(ScriptTags.toLowerCase().contains("<script>") || ScriptTags.toLowerCase().contains("<<include") || ScriptTags.toLowerCase().contains("<%")){
		tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));} else {
		tools.appendString(StringUtils.filterRichText(ScriptTags));}
	}
}
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pzNonAutoControlParams");
		String strLAClassName = "";
		String offlineUsingPage = "";
		strLAClassName = tools.getStepPage().getString("pxObjClass");
		offlineUsingPage = tools.getStepPage().getReference();
		keyMap.putString("pyClassName", strLAClassName);
		ParameterPage newParamsPage = new ParameterPage();
		newParamsPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
		try { tools.doAction(keyMap, tools.getStepPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String streamType = newParamsPage.getString("StreamType");
		newParamsPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
		try { tools.doAction(keyMap, tools.getPrimaryPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String bHasPrivilege = newParamsPage.getString("CheckSecurityRetVal");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
		pzPackageRuntime.packageLocalAction("pzNonAutoControlParams", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("General",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pzNonAutoControlParams\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}						String returnString = actionsStringBuilder.toString();
						tools.popStreamBody();
						return returnString;
					}


public void pxLink_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	tools.putParamValue("skipHTMLEncoding", "true");
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20141128011503050244275",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","General_$CTX$_21");
		String repeatIndx = "";
	modePage2.put("styles","");
	String pyTooltip = "";
	pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("imgSrc","none");
	modePage2.put("actionImgPos","left");
	String customStyles = null;
	String pyLabel = "";
	pyLabel = "Parameters";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","text");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash36 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash36 != null && !"".equals(spxUniqueStreamHash36)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash36,pxUniqueStreamHash+"_36");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_36");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_link.js");
	ctrlComponent.beginComponent("pxLink",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='General_"+ referenceString+ "_21'";
	 String securedPropValue = null;
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141128011503050244275") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pzNonAutoControlParams");
		String strLAClassName = "";
		String offlineUsingPage = "";
		strLAClassName = tools.getStepPage().getString("pxObjClass");
		offlineUsingPage = tools.getStepPage().getReference();
		keyMap.putString("pyClassName", strLAClassName);
		ParameterPage newParamsPage = new ParameterPage();
		newParamsPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
		try { tools.doAction(keyMap, tools.getStepPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String streamType = newParamsPage.getString("StreamType");
		newParamsPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
		try { tools.doAction(keyMap, tools.getPrimaryPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String bHasPrivilege = newParamsPage.getString("CheckSecurityRetVal");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
		pzPackageRuntime.packageLocalAction("pzNonAutoControlParams", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("General",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pzNonAutoControlParams\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false; checkForScriptTags_1("Parameters"); 
		tools.appendString("</a>");					}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }					tools.putParamValue("doAutoFormatting", "false");
					tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}					} catch (Exception e) {

					
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'					&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }						}


}



public void field_RF_GetParams_2() { 
try {
final ParameterPage params_2 = new ParameterPage();
params_2.putString("DisplayProperty", "pyStreamName");
params_2.putString("CustomQuery", "&pyActivity=Rule-Obj-Property.PopulateDisplayType");
params_2.putString("RuleType", "Rule-HTML-Property");
params_2.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_2.putString("bLocalize", "false");
	final ClipboardProperty currentProperty_2 = tools.getProperty(".pyStreamName");
	if (currentProperty_2 != null && currentProperty_2.getParentPage().getClassName().equals("Rule-Obj-Property")) {
		final ClipboardProperty propPrevActive_2 = tools.putActive(currentProperty_2);
		final boolean prevInputMode_2 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput((tools.hasInputEnabled()  || tools.hasEditableEnabled()) && !currentProperty_2.hasAttrProtected());
		final PRStackFrame stack_2 = ((PegaAPI) tools).pushStackFrame( params_2, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "RF_GetParams" );
		try {
			final String currentPropertyRef_2 = currentProperty_2.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_2);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_2);
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Property_RF_GetParams();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_PROPERTY, showMeParams_5);
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_DECLARATIVE, showMeParams_5);
			}
		} finally {
			pega.popStackFrame(stack_2, false);
			tools.putActive(propPrevActive_2);
		}
	} else {
if (_jspx_meth_pega_reference__4(pageContext, ".pyStreamName", "input", "RF_GetParams")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__4(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
_jspx_th_pega_reference_.setFormat(aFormat);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_eval_pega_reference_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_reference_;
if (_jspx_meth_pega_param__1(pageContext, "DisplayProperty", "pyStreamName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "CustomQuery", "&pyActivity=Rule-Obj-Property.PopulateDisplayType")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "RuleType", "Rule-HTML-Property")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_reference_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private static final String[] showMeParams_5 = {
"", "", "", "", "", "", "04-02", "Internal", "Rule-HTML-Property", "Final", "", "Pega-Desktop", "08-01-01", "", "RF_GetParams", "", "RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT" };
private static final String[] showMeParams_4 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-Desktop", "08-23-02", "", "OpenRuleAdvanced", "", "RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT" };
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_23() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\t\t");
if (!foundChoice && when_4("isDeclarePageAndPropertyPrompt", "true")) {
tools.appendString("\n\t\t\t\tONKEYUP=\"handlePropAndPagePrompting()\" \n                          ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t\t\t\t  ");
if (!foundChoice) {
tools.appendString("\n\t\t\t\t\t\t  ONKEYUP=\"handlePropAndRulePrompting(this, event)\";\n\t\t\t\t\t\t  ");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_22() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\t\t");
if (!foundChoice && when_2("LabelField", "")) {
tools.appendString("\n\t\t\t\t");
pzAuto.putSaveRef("ISNS_LABELFIELD", "param.LabelField", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t\t\t");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_21() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\t\t");
if (!foundChoice && when_2("MaxRows", "")) {
tools.appendString("\n\t\t\t\t");
pzAuto.putSaveRef("ISNS_MAXROWS", "param.MaxRows", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t\t\t");

foundChoice = !pega.isPreviewMode();
}
}
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private boolean when_3(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((areValsEqual(tools.getParamValue(aParam1), aParam2)) && (areValsEqual(tools.getParamValue(aParam3), aParam4))));
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__3(PageContext aPageContext, java.lang.String aName) throws Throwable {
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
private void performStream_7() throws Throwable {
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_6();

}
private static final Map oPropDefinitions_9 = null;
private static final Map oStreamProperties_9 = new HashMap();
static {
	oStreamProperties_9.put("pyRuleAvailable", "Final");
	oStreamProperties_9.put("pyCircumstanceDateProp", "");
	oStreamProperties_9.put("pyCircumstanceVal", "");
	oStreamProperties_9.put("pyMethodStatus", "Internal");
	oStreamProperties_9.put("pyClassName", "");
	oStreamProperties_9.put("pyCircumstanceProp", "");
	oStreamProperties_9.put("pzInsKey", "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT");
	oStreamProperties_9.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_9.put("pyCircumstanceDate", "");
	oStreamProperties_9.put("pyRuleEnds", "");
	oStreamProperties_9.put("pyRuleStarts", "");
	oStreamProperties_9.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_9.put("pyXMLType", "");
	oStreamProperties_9.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_9.put("pyCorrType", "");
	oStreamProperties_9.put("pyStreamName", "pzActionSetAttributes");
	oStreamProperties_9.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 */
private void include_7() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 * Set up context.
 */
final String prevRuleKey_9 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT";final String prevClass_9 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_9 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_9);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_9);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_9)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_7();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_9);
	mStreamResponse.setJspBaseClass(prevClass_9);
	pz_CurrentRuleKey = prevRuleKey_9;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_9,true);
}
/* end RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_20() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", ",", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "validationType=\'");
tools.appendString(" ");
tools.putSaveValue("bAddedValidationType", "true");
tools.appendString(" ");
}
}
private void performStream_6() throws Throwable {
tools.appendString(" ");
out.print( tools.getParamValue("pega_attributes") );
tools.appendString(" ");

  String mode1 = tools.getSaveValue("mode1Action");
  String mode2 = tools.getSaveValue("mode2Action");

tools.appendString(" ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
tools.appendString(" ");
out.print(mode2);
tools.appendString(" ");
}
tools.appendString("  ");

  /* BUG-394080: resetting mode1Action and mode2Action after added to control */
  tools.putSaveValue("mode1Action", "");
  tools.putSaveValue("mode2Action", "");

tools.appendString("  ");

String pvclientval = "";
com.pega.pegarules.pub.context.PRStackFrame previousStack = tools.getStackFrame().getPrevious();
int i = 5;
while(i != 0 && previousStack != null && previousStack.getParameterPage() != null){
pvclientval = previousStack.getParameterPage().getString("PVClientVal");
if(pvclientval != null && pvclientval.length() > 0) {
break;
}
i--;
previousStack = previousStack.getPrevious();

}

tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString("  ");
boolean isValidation = "true".equals(tools.getSaveValue("bClientValidation")) || "true".equals(pvclientval);
tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getActive()!=null) {
tools.appendString(" ");
	boolean foundChoice_9 = false;
tools.appendString(" ");
if (!foundChoice_9 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_10 = false;
tools.appendString(" ");
if (!foundChoice_10 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
tools.appendString("  ");
	if (pega.isPreviewMode() || (!areValsEqual(lookupThisDefinition(tools, "pyEditValidate"), ""))) {
tools.appendString("  ");
tools.putSaveValue("validationAttributes", "validationType=\'");
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyEditValidate").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
tools.putSaveValue("bAddedValidationType", "true");
tools.appendString(" ");
	}
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").equalsIgnoreCase("text")) {
tools.appendString(" ");
choose_20();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_2("pega_validation", "")) {
tools.appendString("  ");
choose_20();
tools.appendString("  ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_1("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_10) {
tools.appendString(" ");
	if (when_2("pega_validation", "")) {
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes", "validationType=\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
}
tools.appendString("  ");

foundChoice_9 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_9) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString(" ");
}
tools.appendString("  ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(validationAttributes)", "literal")) {
	return;
}
tools.appendString(" ");
	}
}
private static final Map oPropDefinitions_8 = null;
private static final Map oStreamProperties_8 = new HashMap();
static {
	oStreamProperties_8.put("pyRuleAvailable", "Final");
	oStreamProperties_8.put("pyCircumstanceDateProp", "");
	oStreamProperties_8.put("pyCircumstanceVal", "");
	oStreamProperties_8.put("pyMethodStatus", "Internal");
	oStreamProperties_8.put("pyClassName", "");
	oStreamProperties_8.put("pyCircumstanceProp", "");
	oStreamProperties_8.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_8.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_8.put("pyCircumstanceDate", "");
	oStreamProperties_8.put("pyRuleEnds", "");
	oStreamProperties_8.put("pyRuleStarts", "");
	oStreamProperties_8.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_8.put("pyXMLType", "");
	oStreamProperties_8.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_8.put("pyCorrType", "");
	oStreamProperties_8.put("pyStreamName", "ClientValidation");
	oStreamProperties_8.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_Rule_Obj_Property_ClientValidation
 */
private void property_Rule_Obj_Property_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_8 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_8 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_8 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_8);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_8);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_8)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_6();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_8);
	mStreamResponse.setJspBaseClass(prevClass_8);
	pz_CurrentRuleKey = prevRuleKey_8;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_8,true);
}
/* end RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_Obj_Property_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__2(PageContext aPageContext, java.lang.String aN) throws Throwable {
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
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN, java.lang.String aM) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
_jspx_th_p_r_.setM(aM);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private void performStream_5() throws Throwable {


boolean isBadVal = false;

if (tools.getActive().getMessages().length() == 0) {
	isBadVal = tools.getActive().isBad();
} else {
	isBadVal = true;
}
tools.putSaveValue("isBad",Boolean.toString(isBadVal));



tools.appendString(" ");
pzAuto.putSaveRef("messages", "$this-message", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("isBad"), "false"))) {
tools.appendString(" ");


	String message = tools.getSaveValue("messages");

	try {
		message = tools.getLocalizedTextForString("pxRequestor.pyMessageLabel", message);
	} catch(Exception e) {
		oLog.error(e);
	}
	message = XMLUtils.encodeString(message);

	if(message != null) {
		if(tools.getSaveValue("FieldError").equals("ERRORTEXT")){
			 message= message.replaceAll("\n"," "); 

		}
	         else{
			message= message.replaceAll("\n","&#10");
		}
		tools.putSaveValue("localizedMessage",message);
	}

tools.appendString(" ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
tools.appendString("  ");
tools.putSaveValue("errorDivStyle", "iconErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "iconError");
tools.appendString(" ");
}
tools.appendString("  <div id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("Error\" class=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(errorDivStyle)"
 */
if (_jspx_meth_p_r__2(pageContext, "$SAVE(errorDivStyle)")) {
	return;
}
tools.appendString(" ");
	if (when_1("parentLayoutVal", "SIMPLELAYOUT")) {
tools.appendString(" dynamic-icon-error-div ");
	}
tools.appendString("\" style=\"display:block;\" > <span class=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(errorSpanStyle)"
 */
if (_jspx_meth_p_r__2(pageContext, "$SAVE(errorSpanStyle)")) {
	return;
}
tools.appendString(" ");
	if (when_1("parentLayoutVal", "SIMPLELAYOUT")) {
tools.appendString(" dynamic-icon-error ");
	}
tools.appendString("\" errId=\"\" title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "javascript"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "javascript")) {
	return;
}
tools.appendString("\" ");
	if (when_1("isBad", "true")) {
tools.appendString(" id=\"PegaRULESErrorFlag\" ");
	}
tools.appendString(" > ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString("  </span> </div> ");
	}
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
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-UIDesign");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "Messages");
	oStreamProperties_7.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_Obj_Property_Messages
 */
private void property_Rule_Obj_Property_Messages() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_7 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_7);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_7);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
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
	mStreamResponse.setPropertyDefinitions(prevPropDefs_7);
	mStreamResponse.setJspBaseClass(prevClass_7);
	pz_CurrentRuleKey = prevRuleKey_7;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_7,true);
}
/* end RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_Obj_Property_Messages();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_19() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ClassGroupInstances", "false")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_CLASSGROUPONLY", "ON", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_18() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("XMLObjName", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_XMLOBJNAME", "param.XMLObjName", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_17() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("PropertyExtras", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_PROPERTYEXTRAS", "param.PropertyExtras", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_16() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ShowGroups", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_SHOWGROUPS", "param.ShowGroups", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_15() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("PropertyAutoPrompt", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_PROPAUTOPROMPT", "param.PropertyAutoPrompt", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_14() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("FieldType", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_FIELDTYPE", "param.FieldType", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_13() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ValueTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("VALUETOOLTIP", "param.ValueTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_12() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ListName", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_LISTNAME", "param.ListName", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_11() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ID", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ID", "param.ID", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_10() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("Size", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("Size", "param.Size", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_9() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("DisplayPropertyTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_TTIPNODE", "param.DisplayPropertyTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_8() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("AdditionalParams", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_ADDLPARAMS", "param.AdditionalParams", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_7() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("DisplayProperty", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_DATANODE", "param.DisplayProperty", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_6() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("CustomQuery", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_MYQUERY", "param.CustomQuery", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_5() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("OtherKeyValuePairs", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("OTHERKEYVALUEPAIRS", "param.OtherKeyValuePairs", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_4() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("OpenRuleTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strButtonToolTip", "param.OpenRuleTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("TextBoxTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strToolTip", "param.TextBoxTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ApplyTo", "")) {
tools.appendString("\n           ");
pzAuto.putSaveRef("ISNS_BASECLASS", "param.ApplyTo", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\t\n    ");

foundChoice = !pega.isPreviewMode();
}
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("Class", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_CLASS", "param.Class", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
private static final String[] showMeParams_3 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-WB", "08-01-01", "", "SmartPromptWithOpenRuleInclude", "", "RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT" };
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "API", "Rule-HTML-Fragment", "Final", "", "Pega-UIEngine", "08-05-01", "", "SmartPrompt", "", "RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT" };
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__3(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString("\n\t ");
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addBundle("smartprompt", "1863241345");
tools.appendString("\n");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
/**
 * OnlyOnce condition: SmartPrompt
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_3() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("SmartPrompt")) {
tools.appendString("\n\n<script> var gsServerReqURI = \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "pxThread.pxReqURI", "normal")) {
	return;
}
tools.appendString("\";</script>\n");
if (_jspx_meth_pega_static__3(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\n\n<script>\n\tfunction SmartPromptFocusHandler(e) {\n\t\tvar evt = e || window.event || arguments.callee.caller.arguments[0];\n \t\tif(typeof(evt)  != \"undefined\" ) {\n\t\t\tvar evtTarget = evt.srcElement || evt.target;\n\t\t\tif (ISnsSmartPromptInitActive(evtTarget, false))\n\t\t\t\treturn;\n\t\t}\t\t\n\t}\n\tfunction zUtil_SmartPromptFocusHandler(e) {\n\t\tvar evt = e || window.event || arguments.callee.caller.arguments[0];\n\t\tSmartPromptFocusHandler(evt);\n\t}\n</script>\n\n");
}
}
private void performStream_2() throws Throwable {
onlyOnce_3();
}
private static final Map oPropDefinitions_5 = null;
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Final");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "API");
	oStreamProperties_5.put("pyClassName", "");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "SmartPrompt");
	oStreamProperties_5.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT	Pega-UIEngine:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_5)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_5);
	mStreamResponse.setJspBaseClass(prevClass_5);
	pz_CurrentRuleKey = prevRuleKey_5;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_5,true);
}
/* end RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__4(PageContext aPageContext, java.lang.String aApp, java.lang.String aType) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setApp(aApp);
_jspx_th_pega_static_.setType(aType);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__8 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__8.addFile("pega_ui_smartpromptonfocus", "13155984262", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__10 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__10.addFile("pega_ui_openrule", "12604479638", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__12 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__12.addFile("pega_ui_wutils", "13323188170", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__14 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__14.addFile("pega_ruleform_rmaction", "11183668284", "js");
tools.appendString("\n  ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Yes", "", "Pega-WB", "08-01-01", "", "RMAction_Variables", "", "RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT" };
private void performStream_3() throws Throwable {
tools.appendString("<script>\nvar gCurrentThread = \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, "pxThread.pxThreadName", "normal")) {
	return;
}
tools.appendString("\";\n</script>");
}
private static final Map oPropDefinitions_6 = null;
private static final Map oStreamProperties_6 = new HashMap();
static {
	oStreamProperties_6.put("pyRuleAvailable", "Yes");
	oStreamProperties_6.put("pyCircumstanceDateProp", "");
	oStreamProperties_6.put("pyCircumstanceVal", "");
	oStreamProperties_6.put("pyMethodStatus", "");
	oStreamProperties_6.put("pyClassName", "");
	oStreamProperties_6.put("pyCircumstanceProp", "");
	oStreamProperties_6.put("pzInsKey", "RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-WB");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "RMAction_Variables");
	oStreamProperties_6.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_6)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_6);
	mStreamResponse.setJspBaseClass(prevClass_6);
	pz_CurrentRuleKey = prevRuleKey_6;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_6,true);
}
/* end RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_2);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * OnlyOnce condition: SmartPromptWithOpenRule
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_4() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("SmartPromptWithOpenRule")) {
tools.appendString("\n  ");
/* Include stream RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT */
include_3();

tools.appendString("\n  ");
if (_jspx_meth_pega_static__4(pageContext, "webwb", "script")) {
	return;
}
tools.appendString("\n");
}
}
private void performStream_4() throws Throwable {
/* Include stream RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT */
include_2();

tools.appendString("\n");
onlyOnce_4();
}
private static final Map oPropDefinitions_4 = null;
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "");
	oStreamProperties_4.put("pyClassName", "");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-WB");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "SmartPromptWithOpenRuleInclude");
	oStreamProperties_4.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT
 */
private void include_4() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_4)) {
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_4,true);
}
/* end RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_3);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__2(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString("\n\t\t");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addBundle("pxopenrule", "1224330301");
tools.appendString("\n\t");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
/**
 * OnlyOnce condition: OpenRuleAdvanced
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_2() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("OpenRuleAdvanced")) {
tools.appendString("\n\t");
if (_jspx_meth_pega_static__2(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\n");
}
}
private void performStream_8() throws Throwable {

//US-393053: Fixing BAC issues in a generic way in this control when a custom query is passed to the control.

//Fetch the custom query and encrypt only the activity name parameter that is being passed with Custom query
String cQuery= tools.getParameterPage().getString("CustomQuery");

//encrypt only the non-empty parameter which has pyActivity passed.
if(cQuery!=null && cQuery!="" && cQuery.contains("pyActivity")) {

  //fetch the string that is before pyActivity to a variable.
  String cQuery_start = cQuery.substring(0,cQuery.indexOf("pyActivity"));
  int lengthOfCqueryStart = cQuery_start.length();

  //Fetch the string from pyActivity to end of cQuery into a variable.
  String cQuery1 = cQuery.substring(lengthOfCqueryStart,cQuery.length());
  String cQuery_encrypt = "";
  String cQuery_end = "";

  // if custom query has parameters appended after activity name or ends with '&'
  if(cQuery1.contains("&")){
    //fetch the string that is after &
    cQuery_end = cQuery1.substring(cQuery1.indexOf("&"),cQuery1.length());

    //fetch the main part of the parameter to encrypt i.e., pyActivity name.
    cQuery_encrypt = cQuery1.substring(0,cQuery1.indexOf("&"));
  }
  //if the custom query parameter is not ending with '&' or if there is no value after activity name...
  else{
    cQuery_end = "";
    cQuery_encrypt = cQuery1;
  }
  
  //Encrypt the activity name and append it back to custom query parameter.
  String cQuery_Encrypted=  pega_rules_utilities.pzEncryptURLActionString(tools, "Thread",cQuery_encrypt);
  tools.getParameterPage().putString("CustomQuery",cQuery_start+cQuery_Encrypted+cQuery_end); 
}


tools.appendString("\n");
onlyOnce_2();
tools.appendString("\n\n\n");

	String pAttributes = tools.getParamValue("pega_attributes");

	String parentLayoutVal = tools.getSaveValue("parentLayouttype");

    String isGrird = tools.getSaveValue("isGrid");
    if(!isGrird.equals("true")){
      tools.putSaveValue("parentLayoutVal",parentLayoutVal);
    }
    else{
      tools.putSaveValue("parentLayoutVal",""); 
    }

	if (pAttributes.indexOf("ONBLUR") > -1)
		pAttributes = pAttributes.replaceAll("ONBLUR", "ONBLUR_CUSTOM");
	if (pAttributes.indexOf("ONCHANGE") > -1)
		pAttributes = pAttributes.replaceAll("ONCHANGE", "ONCHANGE_CUSTOM");
	tools.putParamValue("pega_attributes", pAttributes);
	String textBoxToolTip = tools.getParamValue("TextBoxTooltip");
	tools.putParamValue("TextBoxTooltip", tools.getLocalizedTextForString("pyToolTip",textBoxToolTip));
	
	String OpenRuleTooltip = tools.getParamValue("OpenRuleTooltip");
	tools.putParamValue("OpenRuleTooltip", tools.getLocalizedTextForString("pyToolTip",OpenRuleTooltip));
	

          if("Rule-Declare-Pages/Rule-Obj-Property".equals(tools.getParamValue("Class"))){
		tools.putParamValue("Class","Rule-Obj-Property");
		tools.putParamValue("isDeclarePageAndPropertyPrompt","true"); 
	}else{
		tools.putParamValue("isDeclarePageAndPropertyPrompt","false");
	}

tools.appendString("\n\n<script type=\"text/javascript\">\nvar CONTROL_NOT_VISIBLE_IN_DDPROXY=true;\nvar sBUILDINGLIST='");
out.print(tools.getLocalizedTextForString("pyCaption","Building List ..."));
tools.appendString("';\nvar sMORE='");
out.print(tools.getLocalizedTextForString("pyCaption","More.."));
tools.appendString("';\n</script>\n\n\n\n");
	boolean foundChoice_2 = false;
tools.appendString("\n");
if (!foundChoice_2 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString("\n\n");
	if (when_1("prepareForDataGrid", "true")) {
tools.appendString("\n<script>\n\n\nfunction OpenRuleAdvanced_getValue(){\n\tvar fieldName=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\";\n\tvar field = document.getElementsByName(fieldName)[0];\n\tif (field){\n\t\treturn field.value;\n\t}\n\telse{\n\t\treturn \"\";\n\t}\n}\nfunction OpenRuleAdvanced_setValue(val){\n\tvar fieldName=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\";\n\tvar field = document.getElementsByName(fieldName)[0];\n\tif (field){\n\t\tfield.value = val;\n\t}\n}\nfunction OpenRuleAdvanced_setFocus(){\n\tvar fieldName=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\";\n\tvar field = document.getElementsByName(fieldName)[0];\n\tif ((field.tagName == \"INPUT\") || (field.tagName == \"input\")){\n\t\tfield.focus();\n\t}\n}\n</script>\n");
	}
tools.appendString("\n\n<script>\n");
	boolean foundChoice_3 = false;
tools.appendString("\n  ");
if (!foundChoice_3 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("isDeclarePageAndPropertyPrompt"), "true")))) {
tools.appendString("\n\tfunction handlePropAndPagePrompting(event){   \n\t\tevent = pega.util.Event.getEvent(event);\n\t\tvar field = pega.util.Event.getTarget(event);\n\t\tif(field.dupCheck && field.dupCheck == true) return; \n\t\tvar classChanged = false;\n\t\tif(field.value.indexOf(\".\") != -1 && field.getAttribute(\"ISNS_CLASS\") != \"Rule-Obj-Property\"){\n\t\t    field.setAttribute(\"ISNS_CLASS\", \"Rule-Obj-Property\");\n            field.setAttribute(\"ISNS_PROPAUTOPROMPT\", \"NO\");\n            field.setAttribute(\"ISNS_FIELDTYPE\", \"PROPERTY\");\n\t\t\tfield.setAttribute(\"ISNS_BASECLASS\", '");
out.print( tools.getParamValue("ApplyTo"));
tools.appendString("');\n            classChanged = true;\n\t\t}else if(field.value.indexOf(\".\") == -1 && field.getAttribute(\"ISNS_CLASS\") != \"Rule-Declare-Pages\"){\n\t\t    field.setAttribute(\"ISNS_CLASS\", \"Rule-Declare-Pages\");\n            field.setAttribute(\"ISNS_PROPAUTOPROMPT\", \"NO\");\n            field.setAttribute(\"ISNS_FIELDTYPE\", \"RULEKEY\");\n\t\t\tfield.setAttribute(\"ISNS_BASECLASS\", \"\");\n\t\t    classChanged = true;\n\t\t}     \n\t\tif(classChanged)               \n\t\t\tobjSmartPrompt.doOnFocus(null, event);\n\t\tif(event.keyCode == 190 ) {\n\t\t\tISnsInputKeyUpCommon(40,field,true);\t\t\n\t\t}\n\t\t\n\t\t \n\t}\n  ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString("\n\n\nfunction fireEventOnField(eventName,fieldObj){\n\t\tif(!fieldObj) return;\n\t\tif(fieldObj.dispatchEvent){\n\t\t\tvar customevent = document.createEvent(\"HTMLEvents\");\n\t\t\tcustomevent.isnsType = true;\n\t\t\tcustomevent.initEvent(eventName,true,false);\n\t\t\tfieldObj.dispatchEvent(customevent);\n\t\t}else if(fieldObj.fireEvent){\n\t\t\tfieldObj.fireEvent(\"on\"+eventName);\n\t\t}\n}\nfunction setSmartPromptClassFieldValue(value){\n    var smartPromptClassField=document.querySelector('input[name$=\"pySmartPromptClass\"]');\n    if(smartPromptClassField){\n\t\t\tsmartPromptClassField.value=value;\n\t\t\tfireEventOnField(\"click\",smartPromptClassField);\n\t\t\t}\n}\n\nvar tempObj;\nif((tempObj=document.getElementById(\"pyRangeFiltering\"))){\n\tif(tempObj.value.indexOf(\"pyCustomerID\")!=-1){\n\t\ttempObj.value=\"\";\n\t}\n}\n\n");

	// Detect if grid or repeat dynamic layout property panel before including custom JS
  String cpBodyType = tools.getStepPage().getString("pyBodyType");
  String cpRepeatDirection = tools.getStepPage().getString("pyRepeatDirection");
  if(cpBodyType.equals("REPEATING")  && (cpRepeatDirection.equals("TreeGrid") || cpRepeatDirection.equals("RepeatGrid") ||  cpRepeatDirection.equals("Tree")) // Grid property panel check
		|| cpBodyType.equals("SIMPLELAYOUT") && cpRepeatDirection.equals("DYNAMIC")) // RDL property panel check
	{

tools.appendString("\n/*Grid related JS code (will be executed only once)*/\nif(!document.getElementById(\"grid_openRuleAdvanced_jsLoaded\")){\n    /* BUG-211425: Moving the declaration of these variables in the scope, \n     * keeping them lying around is affecting other layout property panels \n     * (specially isGridPropertyPanel was being set to true once and forever) */\n  \tvar isGridPropertyPanel = false,isRDLPropertyPanel = false;\n\n\t\n\tvar gridlRuleSet=\"\";\n\tvar gridlRuleSetVersion=\"\";\n\tvar gridsectionClassName=\"\";\n\tvar gridrowPageClassName=\"\";\n\tif(document.querySelector(\"[node_name='pzGrid_PropPanel']\")){\n\t\tisGridPropertyPanel=true;\n\t}else if(document.querySelector(\"[node_name='pzPropertyPanel_RepeatingDynamicLayoutFormat']\")){\n    isRDLPropertyPanel = true;\n  }\n  \n\tif(isGridPropertyPanel || isRDLPropertyPanel){\n\t\n\t\t/*START: reading info from pagesAndClassesTab*/\n\t\tvar inputList=document.getElementsByTagName(\"input\");\n\t\tvar pagesList=[];\n\t\tvar classesList=[];\n\t\tfor(var i=0;i<inputList.length;i++){\n\t\t\tif(inputList[i].id==\"pyPagesAndClassesPage\"){\n\t\t\t\tpagesList.push(inputList[i].value);\n\t\t\t}else if(inputList[i].id==\"pyPagesAndClassesClass\"){\n\t\t\t\tclassesList.push(inputList[i].value);\n\t\t\t}\n\t\t}\n\t\t/*END: reading info from pagesAndClassesTab*/\n\t\t\n\t\t/*reading PRXML from section xml for getting info about PagesAndClasses and Section Parameters*/\n\t\tif(document.getElementById(\"PRXML\")){\n\t\t\tvar txt=document.getElementById(\"PRXML\").value;\n\t\t\ttxt=txt.replace(/\\n[ ]*/g, \"\");\n\t\t\tif(txt.trim){\n\t\t\t\ttxt=txt.trim();\n\t\t\t}\n\t\t\tvar cache_prxml=window.cachedPRXML;\n\t\t\tif(!cache_prxml){cache_prxml=\"\";}\n\t\t\tcache_prxml=cache_prxml.replace(/\\n[ ]*/g, \"\");\n\t\t\tif(cache_prxml.trim){\n\t\t\t\tcache_prxml=cache_prxml.trim();\n\t\t\t}\n\t\t\tvar xmlDoc=pega.tools.XMLDocument.get();\n\t\t\txmlDoc.async= false;\n\t\t\txmlDoc.loadXML(txt); \n\t\t\tvar xmlDocCache=pega.tools.XMLDocument.get();\n\t\t\txmlDocCache.async= false;\n\t\t\txmlDocCache.loadXML(cache_prxml); \n\t\t\ttry{\n\t\t\t\tgridsectionClassName=xmlDoc.getElementsByTagName(\"pyClassName\")[0].text;\n\t\t\t}catch(sectionClassNotFoundError){\n\t\t\t\ttry{\n\t\t\t\t\tgridsectionClassName=xmlDocCache.getElementsByTagName(\"pyClassName\")[0].text;\n\t\t\t\t}catch(promptClassNotFoundError){\n\t\t\t\t\ttry{gridsectionClassName=xmlDoc.getElementsByTagName(\"pyPromptClass\")[0].text;}catch(err){}\n\t\t\t\t}\n\t\t\t}\n\t\t\tsetTimeout(function(){\n        setSmartPromptClassFieldValue(gridsectionClassName);\n\t\t\t},1250);\n\t\t\ttry{\n\t\t\t\tgridlRuleSet=xmlDoc.getElementsByTagName(\"pxInstanceLockedRuleSet\")[0].text;\n\t\t\t}catch(err){\n\t\t\t\ttry{gridlRuleSet=xmlDocCache.getElementsByTagName(\"pxInstanceLockedRuleSet\")[0].text;}catch(err1){}\n\t\t\t}\n\t\t\ttry{\n\t\t\t\tgridlRuleSetVersion=xmlDoc.getElementsByTagName(\"pxInstanceLockedRuleSetVersion\")[0].text;\n\t\t\t}catch(err){\n\t\t\t\ttry{gridlRuleSetVersion=xmlDocCache.getElementsByTagName(\"pxInstanceLockedRuleSetVersion\")[0].text;}catch(err2){}\n\t\t\t}\n\t\t\tvar pagesAndClasses;\n\t\t\ttry{\n\t\t\t\tpagesAndClasses=xmlDoc.getElementsByTagName(\"pyPagesAndClasses\")[0];\n\t\t\t\tif(!pagesAndClasses){\n\t\t\t\t\tpagesAndClasses=xmlDocCache.getElementsByTagName(\"pyPagesAndClasses\")[0];\n\t\t\t\t}\n\t\t\t}catch(err){\n\t\t\t}\n\t\t\tvar sectionparameters;\n\t\t\ttry{\n\t\t\t\tsectionparameters=xmlDoc.getElementsByTagName(\"pyParameters\")[0];\n\t\t\t\tif(!sectionparameters){\n\t\t\t\t\tsectionparameters=xmlDocCache.getElementsByTagName(\"pyParameters\")[0];\n\t\t\t\t}\n\t\t\t}catch(err){\n\t\t\t}\n\t\t\tif(pagesAndClasses){\n\t\t\tvar allpages=pagesAndClasses.getElementsByTagName(\"pyPagesAndClassesPage\");\n\t\t\tvar allclasses=pagesAndClasses.getElementsByTagName(\"pyPagesAndClassesClass\");\n\t\t\t}\n\t\t\ttry{\n\t\t\t\t/*storing the xml version as text for consumption in pzExpressionBuilderGadget*/\n\t\t\t\tvar gridsectionparameters_txt=sectionparameters.xml;\n\t\t\t}catch(err){\n\t\t\t\tvar gridsectionparameters_txt=\"\";\n\t\t\t}\n\t\t\ttry{\n\t\t\t\t/*storing the xml version as text for consumption in pzExpressionBuilderGadget*/\n\t\t\t\tvar gridsectionpagesandclasses_txt=pagesAndClasses.xml;\n\t\t\t}catch(err){\n\t\t\t\tvar gridsectionpagesandclasses_txt=\"\";\n\t\t\t}\n\t\t} else {\n            /* BUG-208664: PRXML is not present in case of runtime property panel. In case of \n             * runtime, when the property panel opens, the section is run on primary page\n             * pyTemp_PropPanelPage.pySections(1).pySectionBody(1)\n             * Getting the section class from pySmartPromptClass property on \n             * pyTemp_PropPanelPage.pySections(1) page\n             */\n            gridsectionClassName = '");
out.print(tools.getPrimaryPage().getParentPage().getString("pySmartPromptClass"));
tools.appendString("';\n        }\n\t\t\n    var sourceTypeField=document.querySelector('select[name$=\"pySourceType\"]');\n\t\tif(sourceTypeField){\n\t\t\t/*Tried using \"Run Script\", but it did not work, so manually registering the change listener*/\n\t\t\tpega.util.Event.addListener(sourceTypeField,\"change\", setFocusOnDSField);\n\t\t\tvar sourceFieldValue=sourceTypeField[sourceTypeField.selectedIndex].value;\n\t\t\tif(sourceFieldValue==\"Property\"){\n\t\t\t\t/*emptying the pyPageListProperty field on UI when the value is .pyTemplatePageList -> when dropping a new grid */\n\t\t\t\tif(document.getElementById(\"pyPageListProperty\") && document.getElementById(\"pyPageListProperty\").value.indexOf(\"pyTemplatePagelist\")!=-1){\n\t\t\t\t\tdocument.getElementById(\"pyPageListProperty\").value=\"\";\n\t\t\t\t}\n        var pageListPropertyClassField=document.querySelector('[name$=\"pyPageListPropertyClass\"]');\n\t\t\t\t/*Updating the rowpageclass variable*/\n\t\t\t\tif(pageListPropertyClassField){\n\t\t\t\t\tgridrowPageClassName=pageListPropertyClassField.value;\n          var smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t}else if(sourceFieldValue==\"Report Definition\"){\n\t\t\t\t/*Update gridrowclass variable*/\n\t\t\t\tif(document.getElementById(\"pyRDAppliesTo\")){\n\t\t\t\t\tgridrowPageClassName=document.getElementById(\"pyRDAppliesTo\").value;\n\t\t\t\t\tvar smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t\t/*Wait for DOM to be ready after Refresh Section happens.*/\n\t\t\t\t/*setTimeout(function(){setRDPageDefaults();},1000);*/\n\t\t\t}else if(sourceFieldValue==\"Data Object\"){\n\t\t\t\t/*Update rowpageclass*/\n        var dpResultsClassField=document.getElementById(\"pyDPResultsClass\");\n\t\t\t\tif(dpResultsClassField){\n\t\t\t\t\tgridrowPageClassName=dpResultsClassField.value;\n\t\t\t\t\tvar smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t\tvar pageListPropertyClassField=document.querySelector('[name$=\"pyPageListPropertyClass\"]');\n\t\t\t\tif(pageListPropertyClassField){\n\t\t\t\t\tgridrowPageClassName=pageListPropertyClassField.value;\n\t\t\t\t\tvar smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t}\n\t\t\t/*updating the \"PrevValue\" with current selection.*/\n\t\t\tsourceTypeField.setAttribute(\"PrevValue\",sourceFieldValue);\n\t\t}\n\t\t/*creating a hidden DOM element to ensure that code is executed only once.*/\n\t\tvar jsLoadedIndicator=document.createElement(\"div\");\n\t\tjsLoadedIndicator.id=\"grid_openRuleAdvanced_jsLoaded\";\n\t\tjsLoadedIndicator.style.display=\"none\";\n\t\tsourceTypeField.parentNode.appendChild(jsLoadedIndicator);\n\t}\n}\n\nvar gridFieldPromptingMappings={\n\"pyActivity\":\"CUSTOMHANDLING\" /*BUG-120548*/,\n\"pyProperty\":\"ROWCLASS\",\n\"pyDataSource\":\"ROWCLASS\" /*DISPLAY->MENU*/,\n\"pyRowRefreshIndex\":\"ROWCLASS\",\n\"pyActivityClass\":\"ROWCLASS\",\n\"pySelectedFlowAction\":\"ROWCLASS\" /*PROCESS WORK->PERFORM ACTION*/,\n\"pyLocalAction\":\"CUSTOMHANDLING\" /*BUG-120596 Launch -> Local Action -> with / without using page */,\n\"pyWindowName\":\"ROWCLASS\",\n\"pyValue\":\"ROWCLASS\",\n\"pyClipboardPage\":\"ROWCLASS\",\n\"pyWhen\":\"ROWCLASS\",\n\"pyElementName\":\"ROWCLASS\",\n\"pyName\":\"CUSTOMHANDLING\" /*BUG-120599, BUG-120548*/,\n\"pyCategoryHeaderTemplate\":\"ROWCLASS\",\n\"pyInsName\":\"ROWCLASS\" /*BUG-120538*/,\n\"pyInsKey\":\"ROWCLASS\" /*BUG-120524*/,\n\"pySelectedFlow\":\"CUSTOMHANDLING\" /*BUG-120590*/,\n\"pyHarnessName\":\"CUSTOMHANDLING\" /*BUG-120593*/,\n\"pyKey\":\"ROWCLASS\" /*BUG-120524*/,\n\"pyItemId\":\"ROWCLASS\" /*BUG-120524*/\n};\n\nif(!gridFieldPromptingMappings.checkAndUpdatePrompting){\n\tgridFieldPromptingMappings.checkAndUpdatePrompting=function(fieldObj){\n\t\tif(!document.querySelector(\"[node_name='pzGrid_PropPanel']\")){\n\t\t\treturn; /*This API is intended only for Repeating Grids, Tree, TreeGrids hence returning from here in other cases. Please do not alter this logic.*/\n\t\t}\n\t\tif(!fieldObj){return;}\n\t\tif(this[fieldObj.id]==\"ROWCLASS\"){\n\t\t\tif(fieldObj.getAttribute(\"ISNS_BASECLASS\")){\n\t\t\t\tvar promptFields=document.getElementsByName(fieldObj.getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t\t}\n        setSmartPromptClassFieldValue(gridrowPageClassName);\n\t\t\t}\n\t\t}else if(this[fieldObj.id]==\"CUSTOMHANDLING\"){\n\t\t\ttry{\n\t\t\t\tGridPropertyPanelActionMappings[\"handle_\"+fieldObj.id]();\n\t\t\t\t/*Function(\"GridPropertyPanelActionMappings.handle_\"+fieldObj.id+\"();\")();*/\n\t\t\t}catch(err){\n\t\t\t\tif(window.console && window.console.log){window.console.log(\"Error: \"+err);}\n\t\t\t}\n\t\t}\n\t};\n}\n\nwindow.GridPropertyPanelActionMappings={\n\thandle_pyHarnessName:function(){ /*BUG-120593*/ /*Please don't change function name / signature*/\n\tvar tmp;\n\t\tif((tmp=document.getElementById(\"pyActivityClass\")) && tmp.value==\"\"){\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyHarnessName\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\n\t\t}\n\t},\n\thandle_pySelectedFlow:function(){ /*BUG-120590*/ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value!=\"\"){\n\t\t\tvar pySelectedFlowPromptClass=\"\";\n\t\t\tif(pagesList.length>0 && classesList.length>0){\n\t\t\t\tfor(var q=0;q<pagesList.length;q++){\n\t\t\t\t\tif(pagesList[q]==document.getElementById(\"pyUsingPage\").value){\n\t\t\t\t\t\tpySelectedFlowPromptClass=classesList[q];\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tif(pySelectedFlowPromptClass!=\"\"){\n\t\t\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pySelectedFlow\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\t\tpromptFields[i].value=pySelectedFlowPromptClass;\n\t\t\t\t\t}\n          setSmartPromptClassFieldValue(pySelectedFlowPromptClass);\n\t\t\t\t\t\n\t\t\t}\n\t\t}else if(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value==\"\"){\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pySelectedFlow\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n      setSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t}\n\t},\n\thandle_pyActivity:function(){ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyTarget\") && document.getElementById(\"pyTarget\")[document.getElementById(\"pyTarget\").selectedIndex].value==\"otherSection\"){\n\t\t\tthis.handleOtherSectionScenarioForDisplay_RefreshAction();\n\t\t}else{\n\t\t\tvar activityPromptFields=document.getElementsByName(document.getElementById(\"pyActivity\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<activityPromptFields.length;i++){\n\t\t\t\tactivityPromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t}\n\t},\n\thandle_pyName:function(){ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyTarget\") && document.getElementById(\"pyTarget\")[document.getElementById(\"pyTarget\").selectedIndex].value==\"otherSection\"){\n\t\t\tthis.handleOtherSectionScenarioForDisplay_RefreshAction();\n\t\t}else{\n\t\t\t/*BUG-120599: For Report Definition nothing has to be done, but only in case of Open URL in Window (Rule-Obj-Model) some logic is required.*/ \n\t\t\t/*BUG-120585: Case of Set Value (Rule-Obj-Property) */\n\t\t\tif(document.getElementById(\"pyName\").getAttribute(\"isns_class\")==\"Rule-Obj-Model\" || document.getElementById(\"pyName\").getAttribute(\"isns_class\")==\"Rule-Obj-Property\"){ /*case of Open URL in Window*/\n\t\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyName\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t\t}\n\t\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t\t}\n\t\t}\n\t},\n\thandle_pyLocalAction:function(){ /*BUG-120596: Handling Local Action with & without \"using page\" */ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value==\"\"){ /*without using page -> prompt from row class*/\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyLocalAction\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t}else if(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value!=\"\"){ /*with using page -> prompt from page class / user entered input class */\n\t\t\tif(!document.getElementById(\"pyClass\") || document.getElementById(\"pyClass\").value==\"\"){\n\t\t\t\treturn;\n\t\t\t}\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyLocalAction\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=document.getElementById(\"pyClass\").value;\n\t\t\t}\n      setSmartPromptClassFieldValue(document.getElementById(\"pyClass\").value);\t\n\t\t}\n\t},\n\thandleOtherSectionScenarioForDisplay_RefreshAction:function(){ /*Called from within handle_pyActivity, handle_pyName*/\n\t\tif(!document.getElementById(\"pyTarget\")){\n\t\t\treturn;\n\t\t}\n\t\tvar pyTargetDropDown=document.getElementById(\"pyTarget\");\n\t\tvar selval=pyTargetDropDown[pyTargetDropDown.selectedIndex].value;\n\t\tif(selval==\"otherSection\"){\n\t\t\tif(document.getElementById(\"pyActivityClass\") && document.getElementById(\"pyActivityClass\").value!=\"\"){\n\t\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyName\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\tpromptFields[i].value=document.getElementById(\"pyActivityClass\").value;\n\t\t\t\t}\n\t\t\t\tvar activityPromptFields=document.getElementsByName(document.getElementById(\"pyActivity\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<activityPromptFields.length;i++){\n\t\t\t\t\tactivityPromptFields[i].value=document.getElementById(\"pyActivityClass\").value;\n\t\t\t\t}\n        setSmartPromptClassFieldValue(document.getElementById(\"pyActivityClass\").value);\n\t\t\t}\n\t\t}\n\t}\n};\n");

}

tools.appendString("\n\nfunction onChangeHandler(elem, event){\n\tvar evt = event || window.event;\n\tvar srcElement = evt.srcElement || evt.target;\n\tif(srcElement === elem){\n\t\tif(!OpenRuleAdvanced_isActive()) { \n\t\t\tif(elem.getAttribute(\"ONCHANGE_CUSTOM\") != null) {\n\t\t\t\teval(elem.getAttribute(\"ONCHANGE_CUSTOM\"));\n\t\t\t}\n\t\t\tif(elem.getAttribute(\"ONBLUR_CUSTOM\") !=null) {\n\t\t\t\teval(elem.getAttribute(\"ONBLUR_CUSTOM\"));\n\t\t\t}\n\t\t}\n      \t// If element has a standard data-change defined - simulate a HTML event to trigger the event infra handlers\n      \tif(elem.getAttribute(\"data-change\") != null) {\n        \tfireEventOnField(\"change\", elem);\n      \t}\n\n\t}\n\telse{\n\t\tpega.util.Event.fireEvent(elem,'onchange');\n\t\tpega.util.Event.fireEvent(elem,'onblur');\n\t}\n}\n</script>\n\n\n");
/* Include stream RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT */
include_4();

tools.appendString("\n\n\n");
choose_1();
tools.appendString("\n\n\n");
choose_2();
tools.appendString("\n\n\n");
choose_3();
tools.appendString("\n\n\n");
choose_4();
tools.appendString("\n\n\n");
choose_5();
tools.appendString("\n\n\n");
choose_6();
tools.appendString("\n\n\n");
choose_7();
tools.appendString("\n\n\n");
choose_8();
tools.appendString("\n\n\n");
choose_9();
tools.appendString("\n\n\n");
choose_10();
tools.appendString("\n\n\n");
choose_11();
tools.appendString("\n\n\n");
	if (when_2("GroupNode", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("ISNS_GROUPNODE", "param.GroupNode", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n");
	if (when_2("MaxRows", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("ISNS_MAXROWS", "param.MaxRows", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n");
	if (when_2("LabelField", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("ISNS_LABELFIELD", "param.LabelField", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n");
	if (when_2("PlaceholderText", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("placeholderText", "param.PlaceholderText", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n  \n");
	boolean foundChoice_4 = false;
tools.appendString("\n    ");
if (!foundChoice_4 && (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize").equals(""))) {
tools.appendString("\n        \n\t");
 
	tools.putSaveValue("pzResult", ""); //Bug-11491 : reset the save variable
	float expSize = 0;
	try{
		expSize  = (float)Integer.parseInt(tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize"));
		expSize += java.lang.Math.ceil(expSize*20/100);
	} catch(NumberFormatException e){
		/* Use zero. */
	}
	String strExpectedSize = (int)expSize + "";
	tools.putSaveValue("strExpectedSize",strExpectedSize);
	
tools.appendString("\n    ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_4 && when_2("Size", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strExpectedSize", "param.Size", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_4) {
tools.appendString("\n\t");
tools.putSaveValue("strExpectedSize", "");
tools.appendString("\n    ");
}
tools.appendString("\n\n\n\n");
pzAuto.putSaveRef("strExpectedWidth", "param.Width", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\n\n");

	String strExpectedSize = tools.getSaveValue("strExpectedSize");
	if(strExpectedSize != ""){
		String strActualSize = tools.getSaveValue("strExpectedSize");
		tools.putSaveValue("strExpectedSize",strActualSize);
	}

	
	String strInputWidth = "";
	String strTDWidth = "";
	String strExpectedWidth = tools.getSaveValue("strExpectedWidth");


	if( strExpectedWidth != ""){
		if( strExpectedWidth.endsWith("px") ){ /* Pixel-based */
			String strTableWidth = "";
			strInputWidth = strExpectedWidth;
/*
			int index = strExpectedWidth.indexOf("px");
			String subStr = strExpectedWidth.substring(0,index);
			tools.putSaveValue("subStr", subStr);		
			strInputWidth = (Integer.parseInt(tools.getSaveValue("subStr")) - 21) + "px";
			tools.putSaveValue("strExpectedWidth",strTableWidth);
*/
		}	
		else if( strExpectedWidth.endsWith("%") ){ /* Percentage-based */
			strInputWidth = "100%";
			strTDWidth = "100%";
			tools.putSaveValue("strExpectedWidth",strExpectedWidth);
		}
		else if ( strExpectedWidth.indexOf("auto") >= 0) { /* auto */
			strInputWidth = "auto";
			strTDWidth = "auto";
			tools.putSaveValue("strExpectedWidth","auto");
		}
	}

	

	tools.putSaveValue("strInputWidth",strInputWidth);
	tools.putSaveValue("strTDWidth",strTDWidth);
  
  String noOpenRule = tools.getParamValue("NoOpenRule");
  if(!("true".equals(noOpenRule) || "-1".equals(noOpenRule))){
    try{
      ClipboardPage actionPage = pega.getUIEngine().getUIActionPage("runActivity");
      actionPage.getPage("pyActionAPI").putString("pyActivity", "@baseclass.pzLoadClassKeysInXML");
      pega.getUIEngine().getUIAction(actionPage).register();
      actionPage.removeFromClipboard();
      //registering Embed-Display-Table-Cell.getInskeyFromXml
      actionPage = pega.getUIEngine().getUIActionPage("runActivity");
      actionPage.getPage("pyActionAPI").putString("pyActivity", "Embed-Display-Table-Cell.getInskeyFromXml");
      pega.getUIEngine().getUIAction(actionPage).register();
      actionPage.removeFromClipboard();
      //registering create work
      actionPage = pega.getUIEngine().getUIActionPage("createWork");
      actionPage.getPage("pyActionAPI").putString("pyClassName", "Work-ProjectManagement-New");
      actionPage.getPage("pyActionAPI").putString("pyFlowName", "NewModalFlow");
      pega.getUIEngine().getUIAction(actionPage).register();
      actionPage.removeFromClipboard();
    }catch(Exception ex) {
      ex.printStackTrace();
    }
  }

tools.appendString("\n\n\n");
choose_12();
tools.appendString("\n\n\n");
choose_13();
tools.appendString("\n\n\n");
choose_14();
tools.appendString("\n\n\n");
choose_15();
tools.appendString("\n\n\n");
choose_16();
tools.appendString("\n\n\n");
choose_17();
tools.appendString("\n\n\n");
choose_18();
tools.appendString("\n\n\n");
choose_19();
tools.appendString("\n\n\n");
 String pageName = tools.getStepPage().getName();
   if(pageName.equals("")){
      pageName = tools.getActive().getTopLevelPage().getName();
      
   }
   tools.putSaveValue("pageName",pageName);

tools.appendString("\n\n<!-- Save the RF_GetParams HTML Property Parameters values if RuleParameters node exists --> \n\n");
	if (pega.isPreviewMode() || tools.getParameterPage().getParameterValue("RuleParameters")!= null) {
tools.appendString("\n\t");
pzAuto.putSaveRef("RuleType", "param.RuleType", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t");
pzAuto.putSaveRef("RuleClass", "param.RuleClass", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t");
pzAuto.putSaveRef("RuleParameters", "param.RuleParameters", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t");
pzAuto.putSaveRef("HideParametersList", "param.HideParametersList", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n\n\n\n\t<table id=\"SL_Table\" cellspacing=0 cellpadding=0\n\t\tstyle='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strExpectedWidth)", "literal")) {
	return;
}
tools.appendString("' >\n\t<tr>\n\t");
	boolean foundChoice_5 = false;
tools.appendString("\n     ");
 
    
    if(!("true".equals(noOpenRule) || "-1".equals(noOpenRule))){
tools.appendString("\n\t\t<td id=\"SL_Input\"\t\n    ");
 } 
tools.appendString("\n\t");
if (!foundChoice_5) {
tools.appendString("\n\t\t<td \n\t");
}
tools.appendString("\n\t\n\t\t\tSTYLE='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strTDWidth)", "literal")) {
	return;
}
tools.appendString("'>\n\t");
	if (pega.isPreviewMode() || !tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT")) {
tools.appendString("\n\t\t\t");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_5();

tools.appendString("\n\t\t");
	}
tools.appendString("\n\t<INPUT \n\t\t");
	if (when_2("SkipClientValidation", "-1")) {
tools.appendString("\n\t\t\t");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_6();

tools.appendString(" \n\t\t");
	}
tools.appendString("\n\t\t");
/* Include stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
include_7();

tools.appendString("\nname=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\"\n\t\tSIZE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strExpectedSize)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(strExpectedSize)")) {
	return;
}
tools.appendString("\"\n\n\t\t");
	boolean foundChoice_11 = false;
tools.appendString("\n\t\t");
if (!foundChoice_11 && when_2("ID", "")) {
tools.appendString(" \n\t\t\tID=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ID)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ID)")) {
	return;
}
tools.appendString("\"\n\t\t");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t");
if (!foundChoice_11) {
tools.appendString("\n\t\tID=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-Definition(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$this-Definition(pyPropertyName)")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" \t\t\n\t\t");
}
tools.appendString("\n\t\t\n\t\tTYPE=\"text\" value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\"\n\t\t");
	if (when_2("Width", "")) {
tools.appendString(" \n\t\t\tSTYLE='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strInputWidth)", "literal")) {
	return;
}
tools.appendString(";'\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_2("PlaceholderText", "")) {
tools.appendString(" \n\t\t\tPLACEHOLDER='");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(placeholderText)", "NORMAL")) {
	return;
}
tools.appendString("'\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("Size", "")) {
tools.appendString("\n\t\t\tSIZE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(Size)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(Size)")) {
	return;
}
tools.appendString("\"\t\t \t\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_3("Width", "", "Size", "")) {
tools.appendString("\n\t\t\tSIZE=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-Definition(pyExpectedSize)", "NORMAL")) {
	return;
}
tools.appendString("\"\t\t \t\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("Class", "")) {
tools.appendString("\n\t\t\tISNS_CLASS=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_CLASS)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_CLASS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_2("ApplyTo", "")) {
tools.appendString("\n\t\t\tISNS_BASECLASS=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_BASECLASS)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_BASECLASS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("TextBoxTooltip", "")) {
tools.appendString("\n\t\t\tTITLE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strToolTip)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(strToolTip)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\t\t\n\t\t");
	if (when_2("NoSmartPrompt", "-1")) {
tools.appendString("\t\n\t\t\tONFOCUS=\"if(window.objSmartPrompt && window.setGridClassNameDefaults) { objSmartPrompt.doOnFocus(null, event); setGridClassNameDefaults(this); }\" \n\t\t\tCLASS=\"InputIntellisenseStyle\"\n\t\t\tISNS_ONCHANGE = \"onChangeHandler\"\n\t\t\t");
	if (when_2("NoEventOnPick", "-1")) {
tools.appendString("\n\t\t\t\tISNS_ONPICK = \"onChangeHandler\"\n\t\t\t");
	}
tools.appendString("\n\t\t");
	}
tools.appendString("\t\t\n\t\t\n\t\t");
	if (when_2("OtherKeyValuePairs", "")) {
tools.appendString("\n\t\t\t ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(OTHERKEYVALUEPAIRS)", "literal")) {
	return;
}
tools.appendString("\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("CustomQuery", "")) {
tools.appendString("\n\t\t\tISNS_MYQUERY=\"");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_MYQUERY)", "literal")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("DisplayProperty", "")) {
tools.appendString("\n\t\t\tISNS_DATANODE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_DATANODE)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_DATANODE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("DisplayPropertyTooltip", "")) {
tools.appendString("\n\t\t\tISNS_TTIPNODE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_TTIPNODE)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_TTIPNODE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("AdditionalParams", "")) {
tools.appendString("\n\t\t\tISNS_ADDLPARAMS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_ADDLPARAMS)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_ADDLPARAMS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n                  ");
	if (when_4("ListName", "")) {
tools.appendString("\n\t\t\tISNS_LISTNAME=\"List\"\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_2("ListName", "")) {
tools.appendString("\n\t\t\tISNS_LISTNAME = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_LISTNAME)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_LISTNAME)")) {
	return;
}
tools.appendString("\"\n\n                  ");
	}
tools.appendString("\n                  ");
	if (when_2("FieldType", "")) {
tools.appendString("\n\t\t\tISNS_FIELDTYPE = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_FIELDTYPE)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_FIELDTYPE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n                   \n\t\t");
	if (when_2("ShowGroups", "")) {
tools.appendString("\n\t\t\tISNS_SHOWGROUPS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_SHOWGROUPS)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_SHOWGROUPS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n                   \n\t\t");
	if (when_2("PropertyAutoPrompt", "")) {
tools.appendString("\n\t\t\tISNS_PROPAUTOPROMPT = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_PROPAUTOPROMPT)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_PROPAUTOPROMPT)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("PropertyExtras", "")) {
tools.appendString("\n\t\t\tISNS_PROPERTYEXTRAS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_PROPERTYEXTRAS)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_PROPERTYEXTRAS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_4("PropertyExtras", "")) {
tools.appendString("\n\t\t\tISNS_PROPERTYEXTRAS = \"oOpenRuleAdvPropExtra\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("XMLObjName", "")) {
tools.appendString("\n\t\t\tISNS_XMLOBJNAME = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_XMLOBJNAME)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_XMLOBJNAME)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("ClassGroupInstances", "false")) {
tools.appendString("\n\t\t\tISNS_CLASSGROUPONLY = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_CLASSGROUPONLY)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_CLASSGROUPONLY)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("GroupNode", "")) {
tools.appendString("\n\t\t\tISNS_GROUPNODE = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_GROUPNODE)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_GROUPNODE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("MaxRows", "")) {
tools.appendString("\n\t\t\tISNS_MAXROWS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_MAXROWS)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_MAXROWS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("LabelField", "")) {
tools.appendString("\n\t\t\tISNS_LABELFIELD = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_LABELFIELD)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_LABELFIELD)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n   ");
 if(!"".equals(tools.getParamValue("ariaLabel"))){ 
tools.appendString("\n                 aria-label='");
out.print( tools.getParamValue("ariaLabel"));
tools.appendString("'\n           ");
} 
tools.appendString("\n  \n\t\t");
choose_21();
tools.appendString("\n\t\t\n\n\t\t");
choose_22();
tools.appendString("\n\t\t\n\t\t\n\t\t");
	if (when_4("DisableInputBox", "-1")) {
tools.appendString("\n                   \tdisabled\n                   ");
	}
tools.appendString("\n  \n  \t");
	if (when_4("DisableInputBoxTF", "true")) {
tools.appendString("\n                   \tdisabled\n                   ");
	}
tools.appendString("\n                  \t\t\n\t\tISNS_POPUPTYPE=\"DIV\"\n\t\tisBaseClassSet = \"false\"\n\t\tAUTOCOMPLETE=\"off\"  \n\t\t\n\t\t");
choose_23();
tools.appendString("\n\t\t   \n\t\tonchange=\"getGridDataSourceClass(this);\"\n    ");

    pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-Property.GetPageListPropertyClasses");
  
tools.appendString("\n\t\tonblur=\"processExpressionField(this);\"\n\t\t>\n      ");
	if (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT")) {
tools.appendString("\n\t\t\t");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_5();

tools.appendString("\n\t\t");
	}
tools.appendString("\n      </td>\n     ");
 
    
    if(!("true".equals(noOpenRule) || "-1".equals(noOpenRule))){
tools.appendString("\n\t<td style=\"font-size: 2pt;\">&nbsp;</td>\n\t");
	if (when_2("OpenRuleTooltip", "NoOpenRuleIcon")) {
tools.appendString("\n\t<td nowrap style=\"vertical-align: top;padding-top:4px;\">\n\t<BUTTON style=\"BORDER-RIGHT: 0px; BORDER-TOP: 0px; MARGIN: 0px; BORDER-LEFT: 0px; BORDER-BOTTOM:0px; width: auto;\" ONCLICK=\"setSectionClassForPageListPropertyOpen('");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("'); oPega_openRuleManager.pega_openRuleSP('");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("',event); return false;\" TITLE =\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strButtonToolTip)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(strButtonToolTip)")) {
	return;
}
tools.appendString("\" type=\"button\" name=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("-button\">\n\t<SPAN class=\"iconOpenRule\" ONMOUSEOVER=\"this.className='iconOpenRule_on'\"  \n\tONMOUSEOUT=\"this.className='iconOpenRule'\" SPANTYPE=\"BUTTON\" style=\"vertical-align:middle; cursor: pointer;\"></SPAN>\n\t</BUTTON></td>\n\t");
	}
tools.appendString("\n\t");
 } 
tools.appendString("\n\t");
	if (pega.isPreviewMode() || tools.getParameterPage().getParameterValue("RuleParameters")!= null) {
tools.appendString("\n<!-- Params button, will be displayed when using GETPARAMS Html Property  -->\n\t<td nowrap>\n\t<button style=\"border-width:0;\" \nonclick=\"getRuleParams(event,'");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"\nRuleType=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RuleType)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(RuleType)")) {
	return;
}
tools.appendString("\"\nRuleClass=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RuleClass)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(RuleClass)")) {
	return;
}
tools.appendString("\"\nRuleParameters=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RuleParameters)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(RuleParameters)")) {
	return;
}
tools.appendString("\"\nHideParametersList=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(HideParametersList)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(HideParametersList)")) {
	return;
}
tools.appendString("\"\nAdditionalParams=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_ADDLPARAMS)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(ISNS_ADDLPARAMS)")) {
	return;
}
tools.appendString("\"\npageName=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(pageName)"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$save(pageName)")) {
	return;
}
tools.appendString("\"\ntype=\"button\">\n\t<span class=\"iconUpdate\" onmouseover=\"this.className='iconUpdate_on'\"  \n\tonmouseout=\"this.className='iconUpdate'\"></span>\n\t</button></td>  \n\t");
	}
tools.appendString("\n\t</tr></table>\n  \n\n");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_2) {
tools.appendString("\n");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\n");
}
tools.appendString("\n\n\n");

  //US-393053: BAC issue fixes for open rule advanced controls used in when rule form advanced tab and configure tab of Decision Tree
  pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-When.pzGetJavaBooleanFunctions");
  pega_rules_utilities.pzRegisterActivity(tools, "Rule-Alias-Function.ListAliases");

}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "OpenRuleAdvanced");
	oStreamProperties_3.put("pyRuleSetVersion", "08-23-02");
}
/**
 * Generates stream property_Rule_Obj_Property_OpenRuleAdvanced
 */
private void property_Rule_Obj_Property_OpenRuleAdvanced() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT	Pega-Desktop:08-23-02	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_3)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_8();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,true);
}
/* end RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT
 */
private void include_8() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_Obj_Property_OpenRuleAdvanced();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_4);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__1(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString("\n\t");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("rf_getparams", "121771986", "js");
tools.appendString("\n");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
private void performStream_1() throws Throwable {
pzAuto.putSaveRef("propName", "$this-Definition(pyPropertyName)", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n<SCRIPT>\n");

/* The below script variables are used in the case of Rule-HTML-Property */
if(tools.getParamValue("RuleType").equals("Rule-HTML-Property")){
	String pClassName = tools.getPrimaryPage().getString("pyClassName");
	tools.appendString("var pClassName= '" + pClassName +"'; ");
	String pPropertyName = tools.getPrimaryPage().getString("pyPropertyName");
	tools.appendString("var pPropertyName = '" + pPropertyName +"'; ");
}

tools.appendString("\n</SCRIPT>\n\n");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\n\n\n\n");
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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "RF_GetParamsInclude");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * OnlyOnce condition: RF_GetParamsInclude
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("RF_GetParamsInclude")) {
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT */
include_1();

tools.appendString(" ");
}
}
private void performStream_9() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || tools.findPage("pxRequestor").getString("pyPegaDesignMode").equals("true"))) {
tools.appendString(" <label>Params</label> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
onlyOnce_1();
tools.appendString(" ");
  
	/* Supply parameters to OpenRuleAdvanced HTML property */
	tools.putParamValue("Class" , tools.getParamValue("RuleType"));
	tools.putParamValue("ApplyTo" , tools.getParamValue("RuleClass"));
	tools.putParamValue("CustomQuery" , tools.getParamValue("CustomQuery"));
	tools.putParamValue("DisplayProperty" , tools.getParamValue("DisplayProperty"));
	tools.putParamValue("AdditionalParams" , tools.getParamValue("AdditionalParams"));
	
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT */
include_8();

tools.appendString(" ");
}
tools.appendString(" ");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "RF_GetParams");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_Obj_Property_RF_GetParams
 */
private void property_Rule_Obj_Property_RF_GetParams() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_9();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT */
}
}


public void field_RF_GetParams_1() { 
try {
final ParameterPage params_1 = new ParameterPage();
params_1.putString("DisplayProperty", "pyStreamName");
params_1.putString("CustomQuery", "&pyActivity=Rule-Obj-Property.PopulateDisplayType");
params_1.putString("RuleType", "Rule-HTML-Property");
params_1.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_1.putString("bLocalize", "false");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pyStreamName");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Rule-Obj-Property")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput((tools.hasInputEnabled()  || tools.hasEditableEnabled()) && !currentProperty_1.hasAttrProtected());
		final PRStackFrame stack_1 = ((PegaAPI) tools).pushStackFrame( params_1, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "RF_GetParams" );
		try {
			final String currentPropertyRef_1 = currentProperty_1.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_1);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_1);
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Property_RF_GetParams();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_PROPERTY, showMeParams_5);
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_DECLARATIVE, showMeParams_5);
			}
		} finally {
			pega.popStackFrame(stack_1, false);
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__4(pageContext, ".pyStreamName", "input", "RF_GetParams")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxshowPresentation","showPresentation","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("RF_GetParams",".pyStreamName",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20141127011602015927-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyStreamName" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString("UI Control</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20141127011602015927-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyStreamName" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString("UI Control</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_31")) {field_RF_GetParams_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("localize","false");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141127011602015927-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","RF_GetParams");
	pgCells.put("forLabel",".pyStreamName");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxshowPresentation",pxUniqueStreamHash+"_33");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_33");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","showPresentation");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Property");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_33");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxshowPresentation", pxUniqueStreamHash+"_33"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("RF_GetParams",".pyStreamName",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_34")) {	field_RF_GetParams_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "UI Control";
	pgCells.put("pyLabelValue",labelName);
	}
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxLink_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("localize","false");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141128011503050244275-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxLink");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxLink_1();labelName = "";
	pgCells.put("pyLabelValue",labelName);
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzPropertyValidationSection",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("localize","false");
	pgCells.put("useLabel","true");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzPropertyValidationSection",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_5();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionGeneralBBB","",true);
}
public void LayoutWrapperTableStart_3() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionGeneralBBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Display and validation";
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
if(pzSection.getLayout().loadLayoutHeader()) {
tools.putSaveValue("EXPAND_COLLAPSE" ,"Expanded");
pzLayout.createECImgForDivHeader(true,"Expanded", l_sectionTitle, false,false,true,"",false,false,"202602230424000050","aria-level=2");
} else {
 tools.putSaveValue("EXPAND_COLLAPSE" ,"");
pzLayout.createECImgForDivHeader(false,"Collapsed", l_sectionTitle, false,false,true,"",false,false,"202602230424000050","aria-level=2");
}
tools.appendString("<div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id=''>" + l_sectionTitle + "</h2><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionGeneralBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash30 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash30 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash30 != null && !"".equals(spxUniqueStreamHash30)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash30,pxUniqueStreamHash+"_30");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201808070627120143620") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString(" class='" + " content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash30 != null && !"".equals(spxUniqueStreamHash30)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_30");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","stacked");
		pg_dlmeta.put("isFlex","false");
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_6(index);
	}else{
		index=simpleLayoutTemplateCell_6(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_7(index);
	}else{
		index=simpleLayoutTemplateCell_7(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_8(index);
	}else{
		index=simpleLayoutTemplateCell_8(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_3() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionGeneralBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("pyInnerDivId","EXPAND-INNERDIV");
	metadataPage.put("containerStyle","layout-body");
	metadataPage.put("sectionIndex","3");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2|| o2|| o2|| o2|| o2== rx.pyPropertyMode cqString o2== rx.pyPropertyMode cqStringList o2== rx.pyPropertyMode cqStringGroup o2== rx.pyPropertyMode cqJavaProperty o2== rx.pyPropertyMode cqJavaPropertyList", pxUniqueStreamHash+"_43");IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_43");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutHeader_3();
	pzLayoutBody_3();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_6() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2|| o2|| o2|| o2|| o2== rx.pyPropertyMode cqString o2== rx.pyPropertyMode cqStringList o2== rx.pyPropertyMode cqStringGroup o2== rx.pyPropertyMode cqJavaProperty o2== rx.pyPropertyMode cqJavaPropertyList",".pyPropertyMode == \'String\' || .pyPropertyMode == \'StringList\' || .pyPropertyMode == \'StringGroup\' || .pyPropertyMode == \'JavaProperty\' || .pyPropertyMode == \'JavaPropertyList\'", "layout", "visible" )) {pzSetExpandParam_5();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_3(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_3();
}
pzLayoutBodyWrapper_6();
 LayoutWrapperTableEnd_1(); }
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutHeader_2() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionGeneralBB"));
metadataPage.put("isLocalized","false");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","Data access");
metadataPage.put("uniqueid", "202602230424000049");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201808070627120143619") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_4() {
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_3() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_4();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_27","pzBehavior", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzBehavior"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionCellGeneral569","",false);
}
public void pzLayout_3() {
pzSetExpandParam_4();
pzLayoutBodyWrapper_3();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_24","pzBehavior", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzBehavior"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzBehavior",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("localize","false");
	pgCells.put("useLabel","true");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzBehavior",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionGeneralBB","",true);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionGeneralBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_2(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Data access";
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel5517' data-layout-id='202602230424000044" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel5517'>" + l_sectionTitle + "</h2><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionGeneralBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	boolean bodyVisibility = pzAuto.getUIComponentRuntime().isTemplateRendering() || pzAuto.handleEvaluateWhen(" o2&& wxpzShowDataAccess o2!= rx.pyIsManualReference cqtrue","pzShowDataAccess && .pyIsManualReference != \'true\'", "layout", "visible" );
	if(bodyVisibility) {String spxUniqueStreamHash23 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash23 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash23 != null && !"".equals(spxUniqueStreamHash23)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash23,pxUniqueStreamHash+"_23");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201808070627120143619") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString(" class='" + " content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash23 != null && !"".equals(spxUniqueStreamHash23)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_23");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","stacked");
		pg_dlmeta.put("isFlex","false");
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_5(index);
	}else{
		index=simpleLayoutTemplateCell_5(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
		}
	}
	public void pzLayoutContainer_2() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionGeneralBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& wxpzShowDataAccess o2!= rx.pyIsManualReference cqtrue", pxUniqueStreamHash+"_28");IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_28");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutHeader_2();
	boolean pyVisibility_BV = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& wxpzShowDataAccess o2!= rx.pyIsManualReference cqtrue", pxUniqueStreamHash+"_29");pxWhenIdentifiers.put("pyBodyVisibilityWhenId",pxUniqueStreamHash+"_29");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	if(pyVisibility_BV) {
	pzLayoutBody_2();
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_4() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& wxpzShowDataAccess o2!= rx.pyIsManualReference cqtrue","pzShowDataAccess && .pyIsManualReference !=\'true\'", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_2();
}
pzLayoutBodyWrapper_4();
 LayoutWrapperTableEnd_1(); }
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionGeneralB"));
metadataPage.put("isLocalized","false");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","Property type");
metadataPage.put("uniqueid", "202602230424000038");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201808070627120123149") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_2() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}


public void pxTextInput_1() {String key="8||RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","false","8"};oCellRuntimeParamsMap.put("8||RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT",paramValues);oControlPathsMap.put("8||RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__2(PageContext aPageContext, java.lang.String aName, java.lang.String aRef) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setRef(aRef);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__1(PageContext aPageContext, java.lang.String aName, java.lang.String aValue) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setValue(aValue);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
_jspx_th_pega_reference_.setFormat(aFormat);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_eval_pega_reference_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_reference_;
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "SkipClientValidation", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "300px")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "FieldType", "RULEKEY")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Class")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoEventOnPick", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
	return true;
}
tools.putSaveValue("attributes", " PN =.pyPageClass ONCHANGE= \"handleClientEvent(\'POSTCELL\', \'\',\'\' ");
pzAuto.putSaveValue("attributes", ", \'", IAutoStreamRuntime.SAVE_APPEND);
pzAuto.putSaveValue("attributes", "-1", IAutoStreamRuntime.SAVE_APPEND);
pzAuto.putSaveValue("attributes", "\', event)\"", IAutoStreamRuntime.SAVE_APPEND);
if (_jspx_meth_pega_param__2(pageContext, "pega_attributes", "$save(attributes)")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "pega_events", "true")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "pega_validation", "required")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_reference_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}


public void field_OpenRuleAdvanced_1() { 
tools.appendString("<div class=\"RequiredField\">");
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyPageClass", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.appendString("</div>");
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", isSecuredProp);tools.putParamValue("proSecurity_activePropValue", activePropValue);}
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",false,(PegaStreamAPI)tools),false,"","",false,"caption"));
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",false,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = "no value";
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",false,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", "");tools.putParamValue("proSecurity_activePropValue", "");}
}


public void drodownButtonIncludes_1() {
if (pzAuto.doOnlyOnce("pzDropdown")) {
pzAuto.emitIncludeStreamReference("pzDropdownButtonIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("General",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"General"));
						tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("=\", \"\", \",");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("\",\":event\",\"\",[\"");
						if(!"".equals(preActParamStr.toString())) {
							staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
							}
							if(!"".equals(preDTParamStr.toString())) {
								staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
								}
								tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
								pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}								String returnString = actionsStringBuilder.toString();
								tools.popStreamBody();
								return returnString;
							}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",false,(PegaStreamAPI)tools)),false,"","",false,"caption"));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",false,(PegaStreamAPI)tools))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = "no value";
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",false,(PegaStreamAPI)tools))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclCalVal_1(String controlName,String controlFormat, String styleClass) {tools.appendString("<P id=\"CV\" name=\"");tools.appendString(tools.getActive().getEntryHandle());tools.appendString("\" ");tools.appendString("RHP_NAME=\"");tools.appendString(controlName);tools.appendString(" \" ");tools.appendString(" data-ctl data-ctlformat=\"");tools.appendString(controlFormat);tools.appendString("\" ");
		tools.appendString(" class='");
		tools.appendString(styleClass);
		tools.appendString("' ");if(tools.getParamValue("AJAXTrackID") != null){com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));	changeTracker.trackValueChanges(tools.getActive(),-1);}
}


public void pxDropdown_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = pzAuto.getSection().getControl().isControlEditable(false, null);
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		isEditable = true;
	 }
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	if(isEditable && "true".equals(tools.getParamValue("isControlEditableOriginal"))) {
	sEntryHandle = tools.getActive().getEntryHandle();
	 } else {
	sEntryHandle = tools.getActive().getEntryHandle(true, false);
	 }
	 String securedPropValue = null;
	 String activePropValue = null;
	 boolean isSecuredProp = false;
	 try {
			 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), tools.getActive(), tools);
			 if(propSecInfo !=null && propSecInfo.isObfuscated()) {
					 securedPropValue = propSecInfo.getPropValue(); 
			 }else if ("ENCRYPTED".equalsIgnoreCase(propSecInfo.getPropType().toString())){
					 isSecuredProp = true;
					 activePropValue = propSecInfo.getPropValue();
			}
	 } catch(Exception e) { }
	 if(pzAuto.getSection().getControl().isExpTarget(sEntryHandle) ) {
	 pega_rules_utilities.pzRegisterActivity(tools,"GetTargets");
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");pzHeaderCellContent_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String repeatIndx = "";
	IUIComponentMetadata pyUserData = pzAuto.getUIComponentRuntime().createMetadata();
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014112701160201526298",true));
	cellPage.put("pyValue",".pyStringType");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStringType");
	String pyHelperTextType="";
	pyHelperTextType = "none";
	cellPage.put("helpertype",pyHelperTextType);
	modePage1.put("pyHasNoSelection","false");
	String ddPropRef = tools.getActive().getReference();
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyStringType",pxUniqueStreamHash+"_9");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_9");
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	modePage1.put("pyID","pyStringType");
	modePage1.put("pyControlLoadMode","auto");
	String strPropName= tools.getActive().getName();
	String strClassName = tools.getDictionary().fromDefinition(tools.getActive(),"pyClassName");
	if ("".equals(strClassName)) {
	strClassName = "Rule-Obj-Property";
	}
	String tableInfo[] =  tools.getDictionary().getTableEditInfo(strClassName,strPropName);
	ClipboardProperty cbpResults = pega_rulesengine_utilities.pzGetValidValues(strClassName,strPropName,false,tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLEOPTION],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLECLASS],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLESELECTOR],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDNAME],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDCLASS],false);
	StringBuilder results = new StringBuilder("");
	int listSize = cbpResults.size();
	if(cbpResults != null && listSize > 0){
	java.util.Iterator resIter = cbpResults.iterator();
	results.append("[");
	for(int i=0; i< listSize; i++){
	ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
	String sDisplay = cbpRow.getString(".pyLabel");
	String sValue = cbpRow.getString(".pyFieldValue");
	results.append("{");
	results.append("\"pyLabel\":" +"\"" +StringUtils.escapeIntoJSONString(sDisplay)+"\"");
	results.append(",\"pyFieldValue\":" + "\""+ StringUtils.escapeIntoJSONString(sValue)+"\"");
	results.append("}");
	if(i != listSize-1){
	results.append(",");
	}
	}
	results.append("]");
	}
	if(results.toString().equals("")){
	results = new StringBuilder("{ \"pxResults\" : \"\"}");
	}
	else{
	results = new StringBuilder("{ \"pxResults\" : "+ results +"}"); 
	}
	modePage1.put("pyTempText",results.toString());
	modePage1.put("pyValue",".pyFieldValue");
	modePage1.put("pyPrompt",".pyLabel");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	modePage1.put("pySpecifySize","");
	modePage1.put("styleOther","standard");
	String spxUniqueStreamHash10 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash10 != null && !"".equals(spxUniqueStreamHash10)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash10,pxUniqueStreamHash+"_10");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_10");
	}
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014112701160201526298",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStringType");
	pyValueR = ".pyStringType";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStringType");
	pyValueOrig = ".pyStringType";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","caption");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","none");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyShowValueAs","");
	String spxUniqueStreamHash11 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash11 != null && !"".equals(spxUniqueStreamHash11)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash11,pxUniqueStreamHash+"_11");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_11");
	}
	
			 Boolean pyUseAccessibleDropdown = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
	modePage1.put("pyUseAccessibleDropdown",pyUseAccessibleDropdown+"");
	modePage1.put("hasChangeEvent","true");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addDependentScripts("pzpega_ui_template_dropdown.js","pzpega_control_dropdown.js","pzpega_ui_dropdown.js","pzpega_control_dropdownbutton.js");
	ctrlComponent.beginComponent("pxDropdown",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
	String ddPropRef = tools.getActive().getReference();
	String ddPropEntryHandle = tools.getActive().getEntryHandle();
	String disabled_ctrl = "";
			String strPropName= tools.getActive().getName();
			String styleAttribute = "";
			styleAttribute = "standard";
					if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
			styleAttribute += " ErrorShade";
					}
			if(!"".equals(styleAttribute)){
			styleAttribute = "class='"+styleAttribute+"'";
			}
			ClipboardPage cbpRes=null;
			ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12");}if(beginNonTemplate){			HashStringMap params = new HashStringMap();
			String strClassName = tools.getDictionary().fromDefinition(tools.getActive(), "pyClassName");
			if("".equals(strClassName)){
			strClassName = "Rule-Obj-Property";
			}
			String tableInfo[] =  tools.getDictionary().getTableEditInfo(strClassName,strPropName);
			if(tableInfo!=null) {
			
		cbpResults = pega_rulesengine_utilities.pzGetValidValues(strClassName,strPropName,false,tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLEOPTION],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLECLASS],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_TABLESELECTOR],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDNAME],tableInfo[tools.getDictionary().TABLEEDITINFO_INDEX_FIELDCLASS],false);
			}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);			String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
			String displayString ="";
			String valueString ="";
			String selected ="";
			String groupbyString ="";
			boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
			if(!isAccessible) {
				tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
				tools.appendString(" " + pzCell.getTestIdIfEnabled("2014112701160201526298") + " ");
				tools.appendString(styleAttribute + disabled_ctrl + " id='");
				tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
			tools.appendString("'");
			} else {
			tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
			}

		String dropdownName = "";			tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));			tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");} else{			tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;			tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");			tools.appendString(" ");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
			tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }				{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
					com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
						StringBuffer staticURLStr = new StringBuffer();
						StringBuffer preActParamStr = new StringBuffer();
						StringBuffer preDTParamStr = new StringBuffer();
						String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
						tools.putParamValue("runTimeSecStreamName", "");
						if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
							try{
								pzPackageRuntime.packageSection("General",
								tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
								}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
								}
								refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
								refreshActionRequest.registerFixedParameter("SectionName", "");
								staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
								staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"General"));
								tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
								refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
								tools.appendString("=\", \"\", \",");
								refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
								tools.appendString("\",\":event\",\"\",[\"");
								if(!"".equals(preActParamStr.toString())) {
									staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
									}
									if(!"".equals(preDTParamStr.toString())) {
										staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
										}
										tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
										pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}										if(isAccessible) {
											tools.appendString(" value='");
											if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
												String pyValueProp = "pyFieldValue";
												java.util.Iterator tempIter = cbpResults.iterator();
												strValue = ((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp);
												while(tempIter.hasNext()){
													if("".equals(((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp))){
													strValue = "";
													break;
												}
											}
											tempIter = null;
										}
										tools.appendString(strValue + "' /><select ");
										tools.appendString(" " + pzCell.getTestIdIfEnabled("2014112701160201526298") + " ");
										tools.appendString(styleAttribute + disabled_ctrl + " id='");
										tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
									tools.appendString("'");
									}
									tools.appendString(" >");
									if (cbpResults != null && cbpResults.size() > 0) {
										int iListSize = cbpResults.size();
										java.util.Iterator resIter = cbpResults.iterator();
										while(resIter.hasNext()) {
											ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
											displayString = cbpRow.getStringIfPresent("pyLabel");
											valueString = cbpRow.getStringIfPresent("pyFieldValue");
											if (null == displayString || null == valueString) {
												continue;
											}
											if ("".equals(displayString) && "".equals(valueString)) {
												String skipEmptyCaption = tools.getSystemSettings().getDynamic("Pega-UIEngine","skipEmptyCaption");
											if ("true".equals(skipEmptyCaption)) {
														continue;
												}
										}
										valueString = valueString.trim();
										pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
										if("".equals(displayString))
											displayString = valueString ;
										selected = (valueString.equals(strValue)) ? "selected " : ""; 
									tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\">" + StringUtils.crossScriptingFilter(displayString) + "</option>");
									}
								}
								tools.appendString("</select >");
								if(isAccessible) {
									String pyBtnLbl = ".pyButtonLabel";
									String ctrName = "Select";
									tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
									drodownButtonIncludes_1();
								}
								try { if(cbpResults != null){ cbpResults.getParentPage().removeFromClipboard(); } } catch(Exception e){}
								pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}							}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");							
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("2014112701160201526298") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");							
	}
							tools.putParamValue("doAutoFormatting", "false");
							tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(isEditable);
	tools.putActive(propActivePrev); 							} catch (Exception e) {

							
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'							&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Type");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }								}


}

public void pzLayoutBodyWrapper_1() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_2();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_6","pzPropertyMode", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzPropertyMode"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionCellGeneral332","",false);
}
public void pzLayout_1() {
pzSetExpandParam_2();
pzLayoutBodyWrapper_1();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","pzPropertyMode", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzPropertyMode"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}


public void generateClientWhenDiv_1() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" style='");
else
clientWhenAttr += "style='";
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
}
public String 
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();
	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzPropertyMode",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("localize","false");
	pgCells.put("useLabel","true");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzPropertyMode",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_1();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2|| o2|| o2|| o2== rx.pyPropertyMode cqJavaProperty o2== rx.pyPropertyMode cqJavaPropertyList o2== rx.pyPropertyMode cqStringList o2== rx.pyPropertyMode cqStringGroup",".pyPropertyMode == \'JavaProperty\' || .pyPropertyMode == \'JavaPropertyList\' || .pyPropertyMode == \'StringList\' || .pyPropertyMode == \'StringGroup\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDropdown",".pyStringType",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2014112701160201526298-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStringType"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString("Type</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2014112701160201526298-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStringType"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString("Type</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDropdown_1(".pyStringType",0,"","","Identifier");
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("localize","false");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014112701160201526298-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDropdown");
	pgCells.put("forLabel",".pyStringType");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2|| o2|| o2|| o2== rx.pyPropertyMode cqJavaProperty o2== rx.pyPropertyMode cqJavaPropertyList o2== rx.pyPropertyMode cqStringList o2== rx.pyPropertyMode cqStringGroup",pxUniqueStreamHash+"_15");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_15");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".pyPropertyMode == 'JavaProperty' || .pyPropertyMode == 'JavaPropertyList' || .pyPropertyMode == 'StringList' || .pyPropertyMode == 'StringGroup'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Property");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_15");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2|| o2|| o2|| o2== rx.pyPropertyMode cqJavaProperty o2== rx.pyPropertyMode cqJavaPropertyList o2== rx.pyPropertyMode cqStringList o2== rx.pyPropertyMode cqStringGroup", pxUniqueStreamHash+"_15"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxDropdown",".pyStringType",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDropdown_1(".pyStringType",0,"","","Identifier");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Type";
	pgCells.put("pyLabelValue",labelName);
	}
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxshowPageClass","showPageClass","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyPageClass",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2014112701160201577431-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyPageClass" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	String spanAttr = "class";
	if(!showstar){ spanAttr = "data-class"; }
	tools.appendString("<span ");
	if(!isSecCellReadOnly){
	tools.appendString(spanAttr + "='iconRequired standard (label)_iconRequired' ");
	}
	tools.appendString(">Page definition</span>");
	String reqString = "Required";
	if(!isSecCellReadOnly){
	tools.appendString("<strong class=\"required-field-accessibility");
	if(!showstar){ 
	tools.appendString(" display-none");
	}
	tools.appendString("\" >" + reqString + "</strong>");
	}
	tools.appendString("</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2014112701160201577431-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyPageClass" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	String spanAttr = "class";
	if(!showstar){ spanAttr = "data-class"; }
	tools.appendString("<span ");
	if(!isSecCellReadOnly){
	tools.appendString(spanAttr + "='iconRequired standard (label)_iconRequired' ");
	}
	tools.appendString(">Page definition</span>");
	String reqString = "Required";
	if(!isSecCellReadOnly){
	tools.appendString("<strong class=\"required-field-accessibility");
	if(!showstar){ 
	tools.appendString(" display-none");
	}
	tools.appendString("\" >" + reqString + "</strong>");
	}
tools.appendString("</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")) {field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("localize","false");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014112701160201577431-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRuleAdvanced");
	pgCells.put("forLabel",".pyPageClass");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard (label)_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxshowPageClass",pxUniqueStreamHash+"_18");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_18");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","showPageClass");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Property");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_18");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxshowPageClass", pxUniqueStreamHash+"_18"); 
	}
	if(pyDLCellVisibility) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("",pxUniqueStreamHash+"_19");
	pxWhenIdentifiersForCell.put("pyRequiredWhenId",pxUniqueStreamHash+"_19");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyPageClass",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")) {	field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Page definition";
	pgCells.put("pyLabelValue",labelName);
	}
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxshowJavaClass","showJavaClass","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyJavaObjectClass",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2014112701160201588892-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyJavaObjectClass"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString("Java class</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2014112701160201588892-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyJavaObjectClass"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString("Java class</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_1();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat= "pyRequired";
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("localize","false");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014112701160201588892-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyJavaObjectClass");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxshowJavaClass",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","showJavaClass");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Property");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxshowJavaClass", pxUniqueStreamHash+"_22"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyJavaObjectClass",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_1();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Java class";
	pgCells.put("pyLabelValue",labelName);
	}
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzHeaderCellContent_1() {
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionGeneralB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionGeneralB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Property type";
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel9039' data-layout-id='202602230424000008" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel9039'>" + l_sectionTitle + "</h2><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionGeneralB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash2 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash2 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash2,pxUniqueStreamHash+"_2");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201808070627120123149") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString(" class='" + " content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_2");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","stacked");
		pg_dlmeta.put("isFlex","false");
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_1(index);
	}else{
		index=simpleLayoutTemplateCell_1(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_2(index);
	}else{
		index=simpleLayoutTemplateCell_2(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_3(index);
	}else{
		index=simpleLayoutTemplateCell_3(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_4(index);
	}else{
		index=simpleLayoutTemplateCell_4(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void LayoutWrapperTableEnd_1() {
	tools.appendString("</div>");
	}
	public void pzLayoutContainer_1() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionGeneralB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutHeader_1();
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_2();
 LayoutWrapperTableEnd_1(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}



private void performStream_10() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_10 = new HashMap();
static {
	oPropDefinitions_10.put("Rule-Obj-Property.pyPageClass", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyPageClass", "sIN", false, true, "Default", false));
	oPropDefinitions_10.put("Rule-Obj-Property.pyStreamName", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyStreamName", "sIN", false, true, "Default", false));
}
private static final Map oStreamProperties_10 = new HashMap();
static {
	oStreamProperties_10.put("pyRuleAvailable", "Yes");
	oStreamProperties_10.put("pyCircumstanceDateProp", "");
	oStreamProperties_10.put("pyCircumstanceVal", "");
	oStreamProperties_10.put("pyMethodStatus", "");
	oStreamProperties_10.put("pyClassName", "Rule-Obj-Property");
	oStreamProperties_10.put("pyCircumstanceProp", "");
	oStreamProperties_10.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT");
	oStreamProperties_10.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_10.put("pyCircumstanceDate", "");
	oStreamProperties_10.put("pyRuleEnds", "");
	oStreamProperties_10.put("pyRuleStarts", "");
	oStreamProperties_10.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_10.put("pyXMLType", "");
	oStreamProperties_10.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_10.put("pyCorrType", "");
	oStreamProperties_10.put("pyStreamName", "General");
	oStreamProperties_10.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_8 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_7 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_9 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT", "pzActionSetAttributes", "Pega-UIEngine", "08-01-01", "20180713T133243.581 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT", "SmartPromptWithOpenRuleInclude", "Pega-WB", "08-01-01", "20180713T131549.303 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT", "OpenRuleAdvanced", "Pega-Desktop", "08-23-02", "20230925T083901.516 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT", "RMAction_Variables", "Pega-WB", "08-01-01", "20180713T131549.076 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT", "SmartPrompt", "Pega-UIEngine", "08-05-01", "20200403T114021.492 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-PROPERTY GENERAL #20180713T135657.988 GMT", "Rule-Obj-Property General", "Pega-SystemArchitect", "08-01-01", "20180807T111434.152 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT RF_GETPARAMSINCLUDE #20180713T131957.283 GMT", "RF_GetParamsInclude", "Pega-ProCom", "08-01-01", "20180713T131957.283 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY RF_GETPARAMS #20180713T135131.800 GMT", "RF_GetParams", "Pega-Desktop", "08-01-01", "20180713T135131.800 GMT");
}
