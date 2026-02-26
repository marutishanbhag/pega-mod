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
import com.pega.pegarules.jsptags.WhenTag;
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
 * Builds JSP stream RULE-RULESET-!PZSHOWRULESFORRULESETVERSION.
 */
public class ra_stream_pzshowrulesforrulesetversion_62c9eebf95787ec5793542d6d5f952bc extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzShowRulesForRulesetVersion.Rule_RuleSet_Version.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1769854846;
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
	public ra_stream_pzshowrulesforrulesetversion_62c9eebf95787ec5793542d6d5f952bc(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "472fcb23217251be54217e5603597c1060dceae0";
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
/* Instance RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT	Pega-Desktop:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "472fcb23217251be54217e5603597c1060dceae0";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzShowRulesForRulesetVersion",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT
 * Set up context.
 */
final String prevRuleKey_11 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT";final String prevClass_11 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_11 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_11);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_11);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_11();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_11);
	mStreamResponse.setJspBaseClass(prevClass_11);
	pz_CurrentRuleKey = prevRuleKey_11;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT */
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
	"Rule-Obj-FieldValue:PYMESSAGELABEL!LOADING...", 
	"Rule-File-Text:WEBWB!SMARTINFOPOPUP!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_SMARTINFO!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PZACTIONSETATTRIBUTES", 
	"Rule-HTML-Fragment:PZSETSTRLOADMSG", 
	"Rule-HTML-Fragment:SMARTINFOPOPUPINCLUDE", 
	"Rule-HTML-Section:PZSHOWRULESFORRULESETVERSION", 
	"Rule-Obj-Property:PYLABEL", 
	"Rule-Obj-Property:PYMESSAGELABEL", 
	"Rule-Obj-Property:PYCIRCUMSTANCEVAL", 
	"Rule-Obj-Property:PXUPDATEOPNAME", 
	"Rule-Obj-Property:PYRULEAVAILABLE", 
	"Rule-Obj-Property:PXUPDATEDATETIME", 
	"Rule-Obj-Property:PYRULENAME", 
	"Rule-Obj-Property:PYCLASSNAME", 
	"Rule-HTML-Property:ATTRIBUTES", 
	"Rule-HTML-Property:DEFAULT", 
	"Rule-HTML-Property:PXDISPLAYTEXT", 
	"Rule-HTML-Property:STARTSMARTFIELD", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:PZELLIPSIS", 
	"Rule-HTML-Property:PXBUTTON", 
	"Rule-HTML-Property:ENDSMARTFIELD", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYMESSAGELABEL!LOADING...","Rule-Obj-FieldValue","@BASECLASS",true,"Code-Pega-Requestor","Pega-WB","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT","!PYMESSAGELABEL!LOADING...",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("WEBWB!SMARTINFOPOPUP!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB SMARTINFOPOPUP!JS #20180713T133429.322 GMT","WEBWB!SMARTINFOPOPUP!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_SMARTINFO!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_SMARTINFO!JS #20200214T063824.395 GMT","WEBWB!PZPEGA_UI_SMARTINFO!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZACTIONSETATTRIBUTES","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT","PZACTIONSETATTRIBUTES",true,false,"ABSOLUTE_CLASSLESS",791254997), 
		new DependentRuleInfo("PZSETSTRLOADMSG","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT","PZSETSTRLOADMSG",true,false,"ABSOLUTE_CLASSLESS",896523198), 
		new DependentRuleInfo("SMARTINFOPOPUPINCLUDE","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT","SMARTINFOPOPUPINCLUDE",true,false,"ABSOLUTE_CLASSLESS",623244020), 
		new DependentRuleInfo("PZSHOWRULESFORRULESETVERSION","Rule-HTML-Section","RULE-RULESET-",false,"","Pega-Desktop","08-03-01","RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT","!PZSHOWRULESFORRULESETVERSION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1769854846), 
		new DependentRuleInfo("PYLABEL","Rule-Obj-Property","@BASECLASS",true,"Data-Rule-Summary","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT","!PYLABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYMESSAGELABEL","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT","!PYMESSAGELABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYCIRCUMSTANCEVAL","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT","!PYCIRCUMSTANCEVAL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXUPDATEOPNAME","Rule-Obj-Property","@BASECLASS",true,"Data-Rule-Summary","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXUPDATEOPNAME #20180713T131155.911 GMT","!PXUPDATEOPNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYRULEAVAILABLE","Rule-Obj-Property","DATA-RULE-SUMMARY",true,"Data-Rule-Summary","Pega-WB","08-01-01","RULE-OBJ-PROPERTY DATA-RULE-SUMMARY PYRULEAVAILABLE #20180713T131451.278 GMT","!PYRULEAVAILABLE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXUPDATEDATETIME","Rule-Obj-Property","@BASECLASS",true,"Data-Rule-Summary","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT","!PXUPDATEDATETIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYRULENAME","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT","!PYRULENAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCLASSNAME","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT","!PYCLASSNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("ATTRIBUTES","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT","ATTRIBUTES",true,false,"ABSOLUTE_CLASSLESS",-1186972501), 
		new DependentRuleInfo("DEFAULT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT","DEFAULT",true,false,"ABSOLUTE_CLASSLESS",-1270549771), 
		new DependentRuleInfo("PXDISPLAYTEXT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT","PXDISPLAYTEXT",true,false,"ABSOLUTE_CLASSLESS",1365141955), 
		new DependentRuleInfo("STARTSMARTFIELD","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT","STARTSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",-1437336844), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("PZELLIPSIS","Rule-HTML-Property","",false,"","Pega-Gadgets","08-23-01","RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT","PZELLIPSIS",true,false,"ABSOLUTE_CLASSLESS",-1738432742), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883), 
		new DependentRuleInfo("ENDSMARTFIELD","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT","ENDSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",1047137300), 
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
//	RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT:20190515T171454.428 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT:20180713T133243.581 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT:20181008T083757.252 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT:20190614T125129.697 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT:20180713T133438.113 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT:20200428T081054.428 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_SMARTINFO!JS #20200214T063824.395 GMT:20200515T154936.126 GMT
//	RULE-FILE-TEXT WEBWB SMARTINFOPOPUP!JS #20180713T133429.322 GMT:20180713T133429.322 GMT
//	RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT:20200428T081054.535 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT:20180713T131842.875 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT:20180713T131654.066 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT:20180713T133432.763 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT:20180713T132011.328 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY DATA-RULE-SUMMARY PYRULEAVAILABLE #20180713T131451.278 GMT:20180713T131451.278 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEOPNAME #20180713T131155.911 GMT:20180713T131155.911 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY DATA-RULE-SUMMARY PYRULEAVAILABLE #20180713T131451.278 GMT:20180713T131451.278 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEOPNAME #20180713T131155.911 GMT:20180713T131155.911 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY DATA-RULE-SUMMARY PYRULEAVAILABLE #20180713T131451.278 GMT:20180713T131451.278 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEOPNAME #20180713T131155.911 GMT:20180713T131155.911 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULENAME #20180713T131308.007 GMT:20180713T131308.007 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-PROPERTY DATA-RULE-SUMMARY PYRULEAVAILABLE #20180713T131451.278 GMT:20180713T131451.278 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEOPNAME #20180713T131155.911 GMT:20180713T131155.911 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-OBJ-PROPERTY RULE- PYCIRCUMSTANCEVAL #20180713T131307.902 GMT:20180713T131307.902 GMT
//	RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT:20230727T113845.987 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T132449.639 GMT:20180713T132449.639 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENRULE--(CLIPBOARDPAGED2D8EBC7F29F977F1A20CFC6559990AA #20180713T133344.491 GMT:20180713T133344.491 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGRIDACTIONTOKENIZER--(STRING,JAVA.UTIL.LIST) #20180713T133346.434 GMT:20180713T133346.434 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ae823bbff65c40c35876799c3b61418e";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-RuleSet-";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzShowRulesForRulesetVersion",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzShowRulesForRulesetVersion','insKey':'RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void buildWhiteList_1() {
Map<String, String> config;
config = new HashMap<String, String>();
config.put("StreamName", "pzShowRulesForRulesetVersion");
pega.getUIEngine().getUIAction("sort", config).register();
pega.getUIEngine().getUIAction("paginate", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "OpenRuleInPortal");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("cancel", null).register();
config = new HashMap<String, String>();
config.put("pyPreActivity", "pzExportRulesForRulesetVersion");
pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
config = new HashMap<String, String>();
config.put("pyPreActivity", "pzExportRulesForRulesetVersion");
pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
}
public void pzLayoutBodyWrapper_2() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();layoutBody_1();gridCentreLayout_1();
  

 tools.putParamValue("totalRecords", "");
 tools.putSaveValue("totalRecords", "");
 tools.putParamValue("isHidePagingWhenOnePage", ""); 
 tools.putParamValue("pyPageSize", ""); 
 tools.putSaveValue("pyPageSize", ""); 
 tools.putParamValue("pyPageMode", ""); 
 tools.putParamValue("totalPages", "");
 tools.putSaveValue("totalPages", "");
 tools.putParamValue("startIndex",""); 
 tools.putParamValue("endIndex",""); 
 tools.putParamValue("currentPageIndex",""); 
 tools.putSaveValue("currentPageIndex",""); 
 tools.putParamValue("endPageIndex",""); 
 tools.putParamValue("pyReturnResultCount", "");
 tools.putParamValue("recordsInCurrentPage",""); 
 tools.putSaveValue("recordsInCurrentPage",""); 
 tools.getParameterPage().remove("filteredResultsSet"); 
  

				gridEndLayout_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public void 
pegaReferenceTag_9() {
try {
final ParameterPage params_12 = new ParameterPage();
params_12.putString("UseHeadingStyle", "0");
params_12.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_12 = tools.getProperty(".pyCircumstanceVal");
	if (currentProperty_12 != null && currentProperty_12.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_12 = tools.putActive(currentProperty_12);
		final boolean prevInputMode_12 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_12 = ((PegaAPI) tools).pushStackFrame( params_12, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_12, false);
			tools.putActive(propPrevActive_12);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyCircumstanceVal", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_15() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyCircumstanceVal", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString("headers='a7'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_9();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_9();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_7(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("2016072109335505834280") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_22")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); } catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_14() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxUpdateDateTime", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_7(".pxUpdateDateTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_7(".pxUpdateDateTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","37"};oCellRuntimeParamsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","36"};oCellRuntimeParamsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
public void 
pegaReferenceTag_8() {
try {
final ParameterPage params_11 = new ParameterPage();
params_11.putString("UseHeadingStyle", "0");
params_11.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_11 = tools.getProperty(".pyClassName");
	if (currentProperty_11 != null && currentProperty_11.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_11 = tools.putActive(currentProperty_11);
		final boolean prevInputMode_11 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_11 = ((PegaAPI) tools).pushStackFrame( params_11, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_11, false);
			tools.putActive(propPrevActive_11);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyClassName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_13() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyClassName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_8();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_8();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
pegaReferenceTag_7() {
try {
final ParameterPage params_10 = new ParameterPage();
params_10.putString("UseHeadingStyle", "0");
params_10.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_10 = tools.getProperty(".pyRuleName");
	if (currentProperty_10 != null && currentProperty_10.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_10 = tools.putActive(currentProperty_10);
		final boolean prevInputMode_10 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_10 = ((PegaAPI) tools).pushStackFrame( params_10, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_10, false);
			tools.putActive(propPrevActive_10);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyRuleName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_12() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyRuleName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_7();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_7();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","33"};oCellRuntimeParamsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingHeaderCell_7() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Data-Rule-Summary";
	dataColumnProp = "pyCircumstanceVal";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyCircumstanceVal";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Circumstance' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180604154537077938115") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(7)")); tools.appendString(" id='a7' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyCircumstanceVal' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache7").equals("")) { tools.appendParamCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache7");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc927937106'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Circumstance", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc927937106' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc927937106' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc927937106' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyCircumstanceVal")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc927937106' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyCircumstanceVal7").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle927937106\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyCircumstanceVal7").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle927937106\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyCircumstanceVal7").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyCircumstanceVal7").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyCircumstanceVal7").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyCircumstanceVal7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_6() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Data-Rule-Summary";
	dataColumnProp = "pxUpdateDateTime";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxUpdateDateTime";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Last updated' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180604154537078032157") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(6)")); tools.appendString(" id='a6' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxUpdateDateTime' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache6").equals("")) { tools.appendParamCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache6");} else { tools.appendString("11.990686845168801"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1186823170'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Last updated", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1186823170' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1186823170' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1186823170' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxUpdateDateTime")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1186823170' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateDateTime6").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1186823170\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateDateTime6").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1186823170\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateDateTime6").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateDateTime6").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateDateTime6").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateDateTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_5() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Data-Rule-Summary";
	dataColumnProp = "pxUpdateOpName";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxUpdateOpName";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Updated by' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180604154537077935218") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)")); tools.appendString(" id='a5' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxUpdateOpName' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache5").equals("")) { tools.appendParamCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache5");} else { tools.appendString("10.71012805587893"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc785331187'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Updated by", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc785331187' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc785331187' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc785331187' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxUpdateOpName")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc785331187' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateOpName5").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle785331187\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateOpName5").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle785331187\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateOpName5").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateOpName5").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxUpdateOpName5").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxUpdateOpName5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_4() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Data-Rule-Summary";
	dataColumnProp = "pyRuleAvailable";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyRuleAvailable";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Available' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("201806041540570256123901") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyRuleAvailable' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache4").equals("")) { tools.appendParamCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache4");} else { tools.appendString("8.498253783469151"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1398905356'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Available", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1398905356' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1398905356' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1398905356' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyRuleAvailable")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1398905356' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleAvailable4").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1398905356\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleAvailable4").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1398905356\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleAvailable4").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleAvailable4").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleAvailable4").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleAvailable4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_3() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Data-Rule-Summary";
	dataColumnProp = "pyClassName";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyClassName";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Applies to' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180604153449002360518") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyClassName' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache3").equals("")) { tools.appendParamCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache3");} else { tools.appendString("23.748544819557626"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc114769586'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Applies to", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc114769586' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc114769586' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc114769586' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyClassName")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc114769586' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyClassName3").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle114769586\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyClassName3").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle114769586\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyClassName3").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyClassName3").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyClassName3").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyClassName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Data-Rule-Summary";
	dataColumnProp = "pyRuleName";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyRuleName";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Rule name' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160721093355058239712") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyRuleName' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache2").equals("")) { tools.appendParamCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache2");} else { tools.appendString("23.63213038416764"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc541013117'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Rule name", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc541013117' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc541013117' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc541013117' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyRuleName")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc541013117' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleName2").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle541013117\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleName2").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle541013117\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleName2").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleName2").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyRuleName2").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyRuleName2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_1() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Data-Rule-Summary";
	dataColumnProp = "pyLabel";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxPages(ROC).pyLabel";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Rule type' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180604153625097713265") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxPages(ROC).pyLabel' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("height:26px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_pzRulesForRulesetVersionPpxResults1colWidthCache1");} else { tools.appendString("8.847497089639116"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc903792207'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Rule type", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc903792207' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc903792207' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc903792207' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxPages&#40;ROC&#41;.pyLabel")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc903792207' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesROCpyLabel1").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle903792207\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesROCpyLabel1").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle903792207\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesROCpyLabel1").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesROCpyLabel1").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!=null && !gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesROCpyLabel1").isEmpty() && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pzRulesForRulesetVersion_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesROCpyLabel1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
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
	secInfo.put("pxGadgetClass", "PegaGadget-GridPagination");
	Map<String, String> advanceParams = new HashMap<String, String>();
	advanceParams.put("pyPageMode", "Next Previous");
	advanceParams.put("pxObjClass", "PegaGadget-GridPagination");
	advanceParams.put("pxCreateOperator", "bokks");
	advanceParams.put("pxCreateDateTime", "20100625T142549.323 GMT");
	advanceParams.put("pyPaginationButtonsFormat", "pzhc");
	advanceParams.put("pxCreateSystemID", "sde");
	advanceParams.put("pyAppliesTo", "@baseclass");
	advanceParams.put("pxCreateOpName", "Suman Bokkasam");
	secInfo.put("advanceParams", advanceParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_19","pyGridPaginator", secInfo);
}


public void sectionBodyIncludeInCell_1(boolean isEditable, boolean isReadOnly, String strReadOnlyWhen, String streamName) { 
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
buildSection_1();
return;
}
String tempRenderSingle = tools.getParamValue("RenderSingle");
tools.putParamValue("RenderSingle","");
if((isReadOnly) && (!strReadOnlyWhen.equals(""))){
if(pzAuto.handleEvaluateWhen(strReadOnlyWhen,strReadOnlyWhen, "cell", "visible" )) {

pzAuto.emitIncludeStreamReference(streamName, null, "NoInput", "Rule-HTML-Section",null);
}else{

pzAuto.emitIncludeStreamReference(streamName, null, "null","Rule-HTML-Section",null);
}
}else if(isReadOnly){

pzAuto.emitIncludeStreamReference(streamName, null, "NoInput", "Rule-HTML-Section",null);
}else if(isEditable){
String tempSectionReadOnlyValue = StringUtils.crossScriptingFilter(tools.getParamValue("SectionReadOnly"));
tools.getParameterPage().remove("SectionReadOnly");

pzAuto.emitIncludeStreamReference(streamName, null, "Input", "Rule-HTML-Section",null);
tools.putParamValue("SectionReadOnly",tempSectionReadOnlyValue);
}else{

pzAuto.emitIncludeStreamReference(streamName, null,!tools.hasInputEnabled() ? "NoInput" : "Input" , "Rule-HTML-Section",null);
}
tools.putParamValue("RenderSingle",tempRenderSingle);
}


public void 
pzGenerateAdvParam_1() {{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
{
ClipboardPage pyDocuments = tools.findPage("pyDocuments",false);
ClipboardProperty pyDocument = pyDocuments.getProperty("pyDocument");
String harnessID = tools.getParamValue("pzHarnessID");
 if(!harnessID.equals("")){
 ClipboardProperty myDocProp = pyDocument.getPropertyValue(harnessID);
 ClipboardProperty pyGadgets = myDocProp.getProperty("pyGadgets");
 if(myDocProp.isEmpty())	 pyDocument.add(harnessID,pyGadgets);
 ClipboardPage pg_Gadgets = pyGadgets.getPageValue();
 java.util.Set subscriptsKey = pg_Gadgets.keySet();
 String oldcontainerIDList = tools.getParamValue("SectionIDList");
 if(!oldcontainerIDList.equals("")) { 
 StringTokenizer st = new StringTokenizer(oldcontainerIDList, ":"); 
 while (st.hasMoreTokens()) {
 String eachtoken = st.nextToken();
 java.util.Iterator iter_subscripts = subscriptsKey.iterator();
 while(iter_subscripts.hasNext()){ 
 String Key = (String)iter_subscripts.next();
 if(Key.indexOf(eachtoken) > -1) { 
 ClipboardProperty paramPageProperty = (ClipboardProperty)pg_Gadgets.get(Key) ;
 ClipboardPage paramPage = paramPageProperty.getPageValue();
 pg_Gadgets.remove(Key);
 } 
	 }
	 } 
		 }
		ClipboardPage pyAdvParams = tools.createPage("PegaGadget-GridPagination","");
		
								pyAdvParams.putString("pyPageMode",tools.getParamValue("pyPageMode"));
								pyAdvParams.putString("pxObjClass","PegaGadget-GridPagination");
								pyAdvParams.putString("pxCreateOperator","bokks");
								pyAdvParams.putString("pxCreateDateTime","20100625T142549.323 GMT");
								pyAdvParams.putString("pyPaginationButtonsFormat","pzhc");
								pyAdvParams.putString("pxCreateSystemID","sde");
								pyAdvParams.putString("pyAppliesTo","@baseclass");
								pyAdvParams.putString("pxCreateOpName","Suman Bokkasam");
		pyAdvParams.putString("SectionName","pyGridPaginator");
		pyGadgets.add(newSectionID, pyAdvParams);
			 } 
				 } 
				tools.putParamValue("newSectionID",newSectionID); } 
				}


public void elementModel_1(String pyInclude,String pyStreamName,String pyHeaderType,String pyElementName) { 

	try {

ClipboardPage pg_displayTemp = tools.findPage("pyDisplayTemp",true);

if(pg_displayTemp != null) {

		ClipboardPage pg_SectionTabNested = tools.findPage("pyDisplayTemp").getProperty("pyElements").getPageValue(pyInclude);

		if(pg_SectionTabNested.getProperty("pyUIElements").size() == 0) {

			pg_SectionTabNested.getParentProperty().removeFromClipboard();
		}else {

			ClipboardPage pg_outerSection = tools.findPage("pyDisplayTemp").getProperty("pyElements").getPageValue(pyStreamName);

			 if(!"".equalsIgnoreCase(pg_displayTemp.getStringIfPresent("pyMode"))){ pg_outerSection.putString("pyMode",pg_displayTemp.getString("pyMode"));}

			  boolean bNested = false;
 if(!"".equals(pyElementName)){

			Iterator iter_elements = pg_outerSection.getProperty("pyUIElements").iterator();

			while(iter_elements.hasNext()){

				ClipboardPage pg_elem = ((ClipboardProperty)iter_elements.next()).getPageValue();

				String elemName = pg_elem.getProperty("pyElementName").getStringValue();

				if(elemName.equals(pyElementName)) {

					Iterator iter_elements2 = null;

					iter_elements2 = pg_SectionTabNested.getProperty("pyUIElements").iterator();

					while(iter_elements2.hasNext()){

						ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

						 pg_elem.movePage("pyUIElements(<APPEND>)", pg_innerElem);

					}

					iter_elements2 = pg_SectionTabNested.getProperty("pyUIActive").iterator();

					while(iter_elements2.hasNext()){ 

						ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

						pg_elem.movePage("pyUIActive(<APPEND>)", pg_innerElem);

					}

					break;

				}

			}

			 bNested = true;
}//if(pyElementName)

			 if(!bNested){

			Iterator iter_elements2 = pg_SectionTabNested.getProperty("pyUIElements").iterator();

			while(iter_elements2.hasNext()){

				ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

				pg_outerSection.movePage("pyUIElements(<APPEND>)", pg_innerElem);

			}

			iter_elements2 = pg_SectionTabNested.getProperty("pyUIActive").iterator();

			while(iter_elements2.hasNext()){

				ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

				pg_outerSection.movePage("pyUIActive(<APPEND>)", pg_innerElem);

			}

			}//if(bNested)

			pg_SectionTabNested.getParentProperty().removeFromClipboard();

		}

	}

	} catch(Exception e){

		

	}
}


public void sectionIncludeInCell_pyGridPaginator_1(){
pzGenerateAdvParam_1();
sectionBodyIncludeInCell_1(false,false,"","pyGridPaginator");elementModel_1("pyGridPaginator","pzShowRulesForRulesetVersion","BAR","");
 } 
public void 
labelIncludeInCell_2(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20180604105823018628623") + "  ");
if(!labelForAttribute.equals("")){tools.appendString(" for='" + labelForAttribute + rlIndex + "' ");
}String labelForError="";if(!propertyName.equals("")){try { labelForError = pzSection.getCell().getLabelForError(pageName,propertyName);}catch(Exception e) {} }tools.appendString(labelForError);
if(!accessKey.equals("")){tools.appendString(accessKey);
}else if(bRuntimeAccesskey){String aKey = pega_uiengine_harness.pzGetAKey(".pyCaption",labelValue,pega_procom_harness.IsParam(labelValue) );tools.appendString(aKey);
}tools.appendString(" >");
if(isRequired){
tools.appendString("<span class=\"iconRequired " + sLabelFormat + "_iconRequired\">");
}
if(bRuntimeAccesskey)labelValue=tools.getParamValue("pzULabel");else if(pega_procom_harness.IsParam(labelValue) ){String paramName = labelValue.substring(labelValue.indexOf(".")+1);labelValue = tools.getParamValueCSF(paramName);if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);}else if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);tools.appendString(labelValue);
if(isRequired){
tools.appendString("</span>");
}
if(isRequired){
String reqString = "Required";
if(bLocalize){
reqString = tools.getLocalizedTextForParameterizedString("pyCaption","Required");
}
tools.appendString("<strong class=\"required-field-accessibility\">" + reqString + "</strong>");
}
tools.appendString("</label>");
}


public void generateClientWhenDiv_1() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pxResultCount,.pyMaxRecords\"  SHOW_WHEN=\"D_pzRulesForRulesetVersion.pxResultCount >= D_pzRulesForRulesetVersion.pyMaxRecords\"");
if(pzAuto.evaluateWhen("D_pzRulesForRulesetVersion.pxResultCount >= D_pzRulesForRulesetVersion.pyMaxRecords",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='N')
tools.appendString("'");
else
clientWhenAttr += "'";
if(currentTemplatingStatus =='N')
tools.appendString(">");
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges("D_pzRulesForRulesetVersion.pxResultCount", -1);
		changeTracker.trackValueChanges("D_pzRulesForRulesetVersion.pyMaxRecords", -1);
	}
}catch(Exception e){}
}
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20180605174438071757861") + "  ");
if(!labelForAttribute.equals("")){tools.appendString(" for='" + labelForAttribute + rlIndex + "' ");
}String labelForError="";if(!propertyName.equals("")){try { labelForError = pzSection.getCell().getLabelForError(pageName,propertyName);}catch(Exception e) {} }tools.appendString(labelForError);
if(!accessKey.equals("")){tools.appendString(accessKey);
}else if(bRuntimeAccesskey){String aKey = pega_uiengine_harness.pzGetAKey(".pyCaption",labelValue,pega_procom_harness.IsParam(labelValue) );tools.appendString(aKey);
}tools.appendString(" >");
if(isRequired){
tools.appendString("<span class=\"iconRequired " + sLabelFormat + "_iconRequired\">");
}
if(bRuntimeAccesskey)labelValue=tools.getParamValue("pzULabel");else if(pega_procom_harness.IsParam(labelValue) ){String paramName = labelValue.substring(labelValue.indexOf(".")+1);labelValue = tools.getParamValueCSF(paramName);if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);}else if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);tools.appendString(labelValue);
if(isRequired){
tools.appendString("</span>");
}
if(isRequired){
String reqString = "Required";
if(bLocalize){
reqString = tools.getLocalizedTextForParameterizedString("pyCaption","Required");
}
tools.appendString("<strong class=\"required-field-accessibility\">" + reqString + "</strong>");
}
tools.appendString("</label>");
}


public void layoutBody_1() { 
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='1' class = 'gridActionTop'>" + "<table role='presentation'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:55%;",false,"","");tools.appendString("<nobr>");
	labelIncludeInCell_1("","","","",false,"",true,false,"Standard",false);
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","heading_1_dataLabelRead ","heading_1_dataLabelWrite "), "width:24%;",false," o2>= rxD_pzRulesForRulesetVersion.pxResultCount rxD_pzRulesForRulesetVersion.pyMaxRecords","D_pzRulesForRulesetVersion.pxResultCount >= D_pzRulesForRulesetVersion.pyMaxRecords");generateClientWhenDiv_1();
	tools.appendString("<nobr>");
	labelIncludeInCell_2("","","","",false,"Showing first 10,000 results",true,false,"",false);
	tools.appendString("</nobr></div>");
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("SUB_SECTION","pyGridPaginator",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignRight","dataLabelWrite gridActionAlignRight"), "width:20%;",false,"","");sectionIncludeInCell_pyGridPaginator_1(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzShowRulesForRulesetVersion",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzShowRulesForRulesetVersion"));
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

		tools.appendString(",");
		tools.appendString(",\"any\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }									{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
										com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
											StringBuffer staticURLStr = new StringBuffer();
											StringBuffer preActParamStr = new StringBuffer();
											StringBuffer preDTParamStr = new StringBuffer();
											String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
											tools.putParamValue("runTimeSecStreamName", "");
											if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
												try{
													pzPackageRuntime.packageSection("pzShowRulesForRulesetVersion",
													tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
													}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
													}
													refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
													refreshActionRequest.registerFixedParameter("SectionName", "");
													staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
													staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzShowRulesForRulesetVersion"));
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
		}															String returnString = actionsStringBuilder.toString();
															tools.popStreamBody();
															return returnString;
														}


public void pxButton_3() {boolean isDisplayTextWithParam = false;
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
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId","");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzShowRulesForRulesetVersion_$CTX$_7");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Refresh\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Refresh", ".pyButtonLabel");
	}
	pyLabel = "Refresh";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash18 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash18 != null && !"".equals(spxUniqueStreamHash18)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash18,pxUniqueStreamHash+"_18");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_18");
	}
	modePage2.put("actionPath"," data-keyboard='.' data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
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
		 String buttonUID = "name='pzShowRulesForRulesetVersion_"+ referenceString+ "_7'";
	 String securedPropValue = null;
		tools.appendString("<button data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzShowRulesForRulesetVersion",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzShowRulesForRulesetVersion"));
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

		tools.appendString(",");
		tools.appendString(",\"any\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }									{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
										com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
											StringBuffer staticURLStr = new StringBuffer();
											StringBuffer preActParamStr = new StringBuffer();
											StringBuffer preDTParamStr = new StringBuffer();
											String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
											tools.putParamValue("runTimeSecStreamName", "");
											if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
												try{
													pzPackageRuntime.packageSection("pzShowRulesForRulesetVersion",
													tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
													}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
													}
													refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
													refreshActionRequest.registerFixedParameter("SectionName", "");
													staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
													staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzShowRulesForRulesetVersion"));
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
		}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Refresh".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Refresh",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");														}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }														tools.putParamValue("doAutoFormatting", "false");
														tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}														} catch (Exception e) {

														
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'														&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }															}


}

public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=pzExportRulesForRulesetVersion");
	} else {
	tools.appendString("&amp;pyPreActivity=pzExportRulesForRulesetVersion");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString(",");
		tools.appendString(",\"any\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=pzExportRulesForRulesetVersion");
	} else {
	tools.appendString("&amp;pyPreActivity=pzExportRulesForRulesetVersion");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public void pxButton_2() {boolean isDisplayTextWithParam = false;
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
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId","");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzShowRulesForRulesetVersion_$CTX$_6");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Export\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Export", ".pyButtonLabel");
	}
	pyLabel = "Export";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash16 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash16 != null && !"".equals(spxUniqueStreamHash16)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash16,pxUniqueStreamHash+"_16");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_16");
	}
	modePage2.put("actionPath"," data-keyboard='.' data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
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
		 String buttonUID = "name='pzShowRulesForRulesetVersion_"+ referenceString+ "_6'";
	 String securedPropValue = null;
		tools.appendString("<button data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=pzExportRulesForRulesetVersion");
	} else {
	tools.appendString("&amp;pyPreActivity=pzExportRulesForRulesetVersion");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString(",");
		tools.appendString(",\"any\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=pzExportRulesForRulesetVersion");
	} else {
	tools.appendString("&amp;pyPreActivity=pzExportRulesForRulesetVersion");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Export".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Export",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}} catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


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
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"setUserStart\",[\"CANCEL\"]],[\"doClose\",[\":event\", null, null, false]");
	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "doClose");
		actionRequest.registerClientParameter("retainLock");
		String primaryPageName = tools.getPrimaryPage()==null?"":tools.getPrimaryPage().getName();
		actionRequest.registerClientParameter("pzPrimaryPageName");
		pzAuto.registerActionRequest(actionRequest);
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}		String returnString = actionsStringBuilder.toString();
		tools.popStreamBody();
		return returnString;
	}


public void pxButton_1() {boolean isDisplayTextWithParam = false;
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
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20141208134506097417846") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzShowRulesForRulesetVersion_$CTX$_5");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-close-circle";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","right");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyButtonLabel");
	}
	pyLabel = "";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash14 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash14,pxUniqueStreamHash+"_14");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_14");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
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
		 String buttonUID = "name='pzShowRulesForRulesetVersion_"+ referenceString+ "_5'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20141208134506097417846") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"setUserStart\",[\"CANCEL\"]],[\"doClose\",[\":event\", null, null, false]");
	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "doClose");
		actionRequest.registerClientParameter("retainLock");
		String primaryPageName = tools.getPrimaryPage()==null?"":tools.getPrimaryPage().getName();
		actionRequest.registerClientParameter("pzPrimaryPageName");
		pzAuto.registerActionRequest(actionRequest);
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-close-circle";
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		if(hasLineBreaks) {
		tools.appendString("</span>");}
		tools.appendString(" <i aria-hidden='true'  data-click='.' class='" + classProp  +"'></i>");
		tools.appendString("</button>");	}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }	tools.putParamValue("doAutoFormatting", "false");
	tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", ".pyTemplateInputBox");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void pzHeaderCellContent_1() {
tools.putSaveValue("parentLayouttype","");pxButton_1();
}
public void pzHeaderCellContent_2() {
tools.putSaveValue("parentLayouttype","");pxButton_2();
}
public void pzHeaderCellContent_3() {
tools.putSaveValue("parentLayouttype","");pxButton_3();
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzShowRulesForRulesetVersionB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzShowRulesForRulesetVersionB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption",tools.getProperty(".pyRuleName").getStringValue()));
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4492' data-layout-id='202602230257420485" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel4492'>" + l_sectionTitle + "</h2><span class='header-element header-title-table " + pzSection.getCustomStyle(false, "", "hotkey-ruleform-close", "hotkey-ruleform-close") + "' style='");
try {
tools.appendString("height:36px;width:55px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.appendString("'><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr></span><span class='header-element header-title-table " + pzSection.getCustomStyle(false, "", "", "") + "' style='");
try {
tools.appendString("height:36px;width:100px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.appendString("'><nobr>");
pzHeaderCellContent_2();
tools.appendString("</nobr></span><span class='header-element header-title-table " + pzSection.getCustomStyle(false, "", "", "") + "' style='");
try {
tools.appendString("height:36px;width:100px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.appendString("'><nobr>");
pzHeaderCellContent_3();
tools.appendString("</nobr></span>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzShowRulesForRulesetVersionB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Next Previous"; 

 String strPageSize = "500"; 

 String returnTotalCount = ""; 
if(tools.getIfPresent(".pzInsKey") != null)
tools.putParamValue("key",tools.getProperty(".pzInsKey").getStringValue());
ClipboardPage tmpDeclarePageParams = null;
String dpParams = tools.getParamValue("declarePageParams");
java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(\\{)(.+?)(:)|(,)(.+?)(:)");
java.util.regex.Matcher matcher = pattern.matcher(dpParams);
while (matcher.find()) {
String name = matcher.group(2);
String name1 = matcher.group(5);
if (name != null)
dpParams = dpParams.replace(name, name.replaceAll("\\.", "_"));
if (name1 != null)
dpParams = dpParams.replace(name1, name1.replaceAll("\\.", "_"));
}
try {
if (!"".equals(dpParams)) {
Object dpParamsList = tools.createPage("@baseclass","Temp_Grid_DeclarePageParams");
tmpDeclarePageParams = (ClipboardPage)dpParamsList;
tmpDeclarePageParams.adoptJSONObject(dpParams);
}
if (tmpDeclarePageParams != null && tmpDeclarePageParams.getProperty("D_pzRulesForRulesetVersion_pxResults_pzShowRulesForRulesetVersion_1") != null) {
ClipboardPage paramList = tmpDeclarePageParams.getProperty("D_pzRulesForRulesetVersion_pxResults_pzShowRulesForRulesetVersion_1").getPageValue();
java.util.Collection col= paramList.values();
Iterator it = col.iterator();
while(it.hasNext()){
ClipboardProperty cp= (ClipboardProperty)it.next();
tools.putParamValue(cp.getName(),cp.toString());
}
}
} catch(InvalidStreamError e){
oLog.error("ReloadSections:Invalid JSON Stream for data page params : "+e.getMessage());
} catch(Exception e){
oLog.error("ReloadSections:Expection : "+e.getMessage());
}

 ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3=null;

 Map selUniqMapD_pzRulesForRulesetVersion_pxResultsL3 = null;

 Set filteredIndicesSetD_pzRulesForRulesetVersion_pxResultsL3 = null;

	 String strFCPage = "pyFilterCriteria_D_pzRulesForRulesetVersion.pxResults_pzShowRulesForRulesetVersion_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

gFCritPageD_pzRulesForRulesetVersion_pxResultsL3=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

  selUniqMapD_pzRulesForRulesetVersion_pxResultsL3 = null; // reset the variable

 if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3 != null){ 

 		 filteredIndicesSetD_pzRulesForRulesetVersion_pxResultsL3 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3, "D_pzRulesForRulesetVersion.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_pzRulesForRulesetVersion_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapD_pzRulesForRulesetVersion_pxResultsL3 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3); 

 		 tools.getParameterPage().put("selUniqMapD_pzRulesForRulesetVersion_pxResultsL3", selUniqMapD_pzRulesForRulesetVersion_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div id='CT' RLW='true'IRW=\".pzInsKey Changes\" data-declare-params=\"");
tools.appendString("{'key':'"+ "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#" +"'}");tools.appendString("\" >");
						try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pzInsKey"), -1);
}}catch(Exception e){}
tools.appendString("<div ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pzRulesForRulesetVersion.pxResults").getReference());tools.appendString("_pzShowRulesForRulesetVersion_1'");
tools.appendString(" hashed-dp-page='");
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pzRulesForRulesetVersion.pxResults").getReference());tools.appendString("' bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201806041058230325539") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='false' bLoadActivity='false' bDataObject='true' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' DPSectionID=\"SubSectionpzShowRulesForRulesetVersionB\"  openOnDblClick='false' OAFunc='openRuleByKeys' ");
D_pzRulesForRulesetVersion_pxResults_1();
tools.appendString(">");


 ClipboardProperty pageListProp = null;

 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


 int currentPageIndex = 0; 

 if(startIndex == 0){ startIndex = 1; } 

 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

 tools.putParamValue("pyPageMode", strPageMode); 


 tools.putParamValue("pyPageSize", "500"); 

 tools.putSaveValue("pyPageSize", "500"); 

 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {


 pageListProp = tools.getProperty("D_pzRulesForRulesetVersion.pxResults"); 
 int iDPTotPages = (pageListProp.size()%pyPageSize==0) ? (pageListProp.size()/pyPageSize) : (pageListProp.size()/pyPageSize)+1;
 if(((startIndex/pyPageSize)+1)>iDPTotPages) {
	 currentPageIndex = iDPTotPages;
	 startIndex = ((iDPTotPages-1)*pyPageSize)+1;
 }
if(currentPageIndex<=0) { currentPageIndex = 1; }
if(startIndex<=0) { startIndex = 1; }
}

 tools.putParamValue("startIndex",startIndex); 

 tools.putParamValue("currentPageIndex",currentPageIndex); 

 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

 tools.putParamValue("endPageIndex",endPageIndex); 

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","D_pzRulesForRulesetVersion.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("D_pzRulesForRulesetVersion.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3, selUniqMapD_pzRulesForRulesetVersion_pxResultsL3);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageD_pzRulesForRulesetVersion_pxResultsL3== null || bFilterResult) {
						
 			 counter++; 
						
 			 if(counter>=(Integer.parseInt(tools.getParamValue("startIndex"))) && rowsDisplayed<pyPageSize) { rowsDisplayed++; } 
						
 			 } 
						pega.popStackFrame(frame, false);
						}
						
 	   tools.putParamValue("filteredResultsSet", filteredResultsSet); 
						
 	   tools.putParamValue("totalRecords", counter); 
						tools.putActive(propActivePrev); 

						
 } 
						}
						
 if(pageListProp==null && !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {
						pageListProp = tools.getProperty("D_pzRulesForRulesetVersion.pxResults"); }
						
 	   int totalRecords = 0; 
						   if(!"".equals(tools.getParamValue("totalRecords"))){
						try{
						 totalRecords = Integer.parseInt(tools.getParamValue("totalRecords"));
						}catch(Exception e){/*A number format exception has occured.*/} }
						   tools.putSaveValue("totalRecords", ""+totalRecords); 

						 if(!tools.getParamValue("totalRecords").equals("")){ 

						   int endIndex = 0;

						   endIndex = startIndex + pyPageSize - 1;

						   endIndex = endIndex>totalRecords ? totalRecords : endIndex; 

						 if(tools.getParamValue("gridAction").toLowerCase().equals("insertafter")||tools.getParamValue("gridAction").toLowerCase().equals("insertbefore")||tools.getParamValue("gridAction").toLowerCase().equals("appendlast")){ 

						   endIndex = endIndex + 1;

						}

						   tools.putParamValue("endIndex",endIndex); 

						   int totalPages = (totalRecords % pyPageSize == 0)?(totalRecords / pyPageSize):(totalRecords / pyPageSize) +1; 

						   if(totalPages==0) totalPages=1; 

						   tools.putParamValue("totalPages", totalPages); 

						   tools.putSaveValue("totalPages", ""+totalPages); 

						   if("".equals(tools.getParamValue("recordsInCurrentPage"))) {

						   	 tools.putParamValue("recordsInCurrentPage", "" +(endIndex - startIndex +1));  

						   	 tools.putSaveValue("recordsInCurrentPage", "" +(endIndex - startIndex +1));  

						   }

						}

						 String pyPageMode = tools.getParamValue("pyPageMode"); 

					tools.appendString("<div  id='PEGA_GRID_SKIN' class='default'>");
					}
					

public void gridCentreLayout_1() {/*gridCentreLayout*/
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
					java.util.Map functionsMap = null;
					java.util.Map classesMap = null;
					ClipboardPage gFCritPageD_pzRulesForRulesetVersion_pxResultsL3=null;
					Map selUniqMapD_pzRulesForRulesetVersion_pxResultsL3 = null;
					selUniqMapD_pzRulesForRulesetVersion_pxResultsL3 = null; // reset the variable
					gFCritPageD_pzRulesForRulesetVersion_pxResultsL3=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
							 selUniqMapD_pzRulesForRulesetVersion_pxResultsL3 = (Map)tools.getParameterPage().getObject("selUniqMapD_pzRulesForRulesetVersion_pxResultsL3");
					pega_rules_utilities.pzRegisterActivity(tools, "pzPerformGridAction");
					Map<String, String> config;
					config = new HashMap<String, String>();
					config.put("pyTargetStream", "pzGridModalHTML");
					config.put("gridAction", "SUBMITROW");
					config.put("pzActivity", "ShowStream");
					pega.getUIEngine().getUIAction("runActivity", config).register();
					config = new HashMap<String, String>();
					config.put("SectionName", "pzGridFilterPanel");
					config.put("PreActivity", "pzGetGridColUniqueValues");
					config.put("pzActivity", "pzGetPopOverData");
					pega.getUIEngine().getUIAction("runActivity", config).register();
					pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
					tools.putSaveValue("bAllowRowUpdate","true");
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					
					
					tools.putSaveValue("bUseMenuInline","false");

					
					
					
					
					
					pzGridIncludes_1();

					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")&& !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()){

					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_pzRulesForRulesetVersion.pxResults");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='true ' columnList='.pxPages(ROC).pyLabel .pyRuleName .pyClassName .pyRuleAvailable .pxUpdateOpName .pxUpdateDateTime .pyCircumstanceVal  ' class='yui-skin-sam gPercent");

					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					tools.appendString("' gPropIndex='D_pzRulesForRulesetVersionPpxResults1' editRowIndex='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"false\"");

					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" dpParams=\"key\" pyPageSize = '");

					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">");

					
					
					
					
					
					

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201806041058230325539-layout") + " ");

					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_pzRulesForRulesetVersionPpxResults1colWidthGBL\" id=\"D_pzRulesForRulesetVersionPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"D_pzRulesForRulesetVersionPpxResults1colWidthGBR\" id=\"D_pzRulesForRulesetVersionPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pzRulesForRulesetVersionPpxResults1colWidthGBR"));

					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					
					 if(!("".equals(tools.getParamValue("D_pzRulesForRulesetVersionPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PL_PROP='D_pzRulesForRulesetVersion.pxResults' PL_PROP_CLASS='Data-Rule-Summary' PRIM_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					
					
					
					
					
					 repeatingHeaderCell_1(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_5(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_6(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_7(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
					
					
					
					
								 itr_3 = tools.getProperty("D_pzRulesForRulesetVersion.pxResults").iterator(); 

					
					
					
					
					
					} else {

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed", rowsDisplayed + "");

					
					
					
					
					
					}

					
					
					
					
					
					
								 boolean bGenerationForOffline = false; 

					
					
					
					
					
					
								 ClipboardProperty propActivePrev = tools.getActive();

					
					
					
					
					
					
								 while(itr_3 != null && itr_3.hasNext()){ 

					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					
									 break;

					
					
					
					
					
					 
								}

					
					
					
					
					
					
									 ClipboardProperty cp_eachProp_3 = (ClipboardProperty)itr_3.next(); 

					
					
					
					
					
					
									  ClipboardPage pg_eachProp_3 = cp_eachProp_3.getPageValue();

					
					
					
					
					
					
									 PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, pg_eachProp_3, false, false);

					
					
					
					
					
					
									 tools.putActive(cp_eachProp_3); 

					
					
					
					
					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
					
					
					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
					
					
					
					Set filteredResultsSet = (HashSet)tools.getParameterPage().getObject("filteredResultsSet");boolean bFilterResult = false;
										 if (filteredResultsSet != null) { int itemIndex = cp_eachProp_3.indexOf() ;
										 bFilterResult = filteredResultsSet.contains(itemIndex); 
										 } else if(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pzRulesForRulesetVersion_pxResultsL3, selUniqMapD_pzRulesForRulesetVersion_pxResultsL3);
										 }
										 if (gFCritPageD_pzRulesForRulesetVersion_pxResultsL3== null || 

					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

					
					
					
					
					
					
										 tools.getStepPage().getProperty("pyExpanded").setValue("true");

					
					
					
					
					
					}

					
					
					
					
					
					
										 counter++; 

					
					
					
					
					
					 if( !"".equals(tools.getParamValue("startIndex")) && !"".equals(tools.getParamValue("recordsInCurrentPage")) && ((counter>=(Integer.parseInt(tools.getParamValue("startIndex"))) && rowsDisplayed<(Integer.parseInt(tools.getParamValue("recordsInCurrentPage")))))) {

					
					
					
					
					
					 rowsDisplayed++; 

					
					
					
					
					
					 tools.putSaveValue("curRowNum",""+(rowsDisplayed + (Integer.parseInt(tools.getParamValue("startIndex"))) - 1)); 

					
					
					
					
					
					
						 tools.putParamValue("expandRL","true");

					
					
					
					
					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					
					
					
					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					
					
					
					
					 
								 if(!bGenerationForOffline) {

					
					
					
					
					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" cellCont' ");

					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_pzRulesForRulesetVersion.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					 
								 }

					
					
					
					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
					
					
 ct_gridAction.trackValueChanges(tools.getProperty(".pzInsKey"),-1);

					
					
					
					
					
					
 }}catch(Exception e){}

					
					
					
					
					
					tools.appendString(" data-gargs='[");

					
					
					
					
					
					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pzInsKey").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");

					
					
					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					
					
					gridOpenActionIncl_1();

					
					
					
					
					
					tools.appendString(" id='");

					
					
					
					
					
					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("' ");

					
					
					
					
					
					{

					
					
					
					
					
					String tempTestID = "";

					
					
					
					
					
					String rowTestID = "R";

					
					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzRulesForRulesetVersion.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzRulesForRulesetVersion.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzRulesForRulesetVersion.pxResults"); } catch (Exception ex) { }

					
					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					
					}

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201806041058230325539-" + rowTestID) + " ");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_1(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_12(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_13(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_5(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_14(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_15(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					tools.putParamValue("templateRowHandle", "");

					
					
					
					
					
					 
								 }

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false");

					
					
					
					
					
					
									 } 

					
					
					
					
					
					
										} 

					
					
					
					
					
					
									  pega.popStackFrame(frame_3, false); 

					
					
					
					
					
					
								 }

					
					
					
					
					
					
									 tools.putActive(propActivePrev);

					
					
					
					
					
					
								 }

					
					
					
					
					
					
									 tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");}  

					
					
					
					
					
					
  { 

					
					
					
					
					
					 String rowsDisStr = tools.getSaveValue("rowsDisplayed"); 

					
					
					
					
					
					 if(!rowsDisStr.equals("")) {

					
					
					
					
					
					
 int rowsDisplayed = Integer.parseInt(rowsDisStr);

					
					
					
					
					
					
 if(rowsDisplayed == 0){ 

					
					
					
					
					
					
 	if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { 

					
					
					
					
					
					
 	tools.putParamValue("showOnLoadMsg", "showOnLoadMsg");

					
					
					
					
					
					
 	 } String tempRenderSingle = tools.getParamValue("RenderSingle");

					
					
					
					
					
					 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"7\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Data-Rule-Summary", "tempNoRespg");

					
					
					
					
					
					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
					
					
					
					
					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					
					
					
					
					
					if(tools.getParamValue("showOnLoadMsg").equals("showOnLoadMsg")) {

					
					
					
					
					
					gridNoRowsMesgIncl_1(); 

					
					
					
					
					
					}else{

					
					
					
					
					
					gridNoRowsMesgIncl_1(); 

					
					
					
					
					
					}

					
					
					
					
					
					
									  pega.popStackFrame(frame, false);  

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
					
					
					
					
					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
					
					
					
					
					
 tempNoRespg.removeFromClipboard();

					
					
					
					
					
					tools.appendString("\n </td></tr>");

					
					
					
					
					
					 } } }   

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_pzRulesForRulesetVersion.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
						 tools.putParamValue("partialTrigger",""); 
}

					
					
					
					
					
					
					 /* GenerateGrid: End */

					
					
					
					
					
					}

					
					
					
					
					
					public void 
gridEndLayout_1
					
					
					
					
					
					() {

					
					
					
					
					
					
 tools.getParameterPage().remove("pyReportPageName"); 

					
					
					
					
					
					
 tools.getParameterPage().remove("pyGridFilterCriteriaPage"); 

					
					
					
					
					tools.appendString("</div></div></div>");

					
					
					
					
					}

					
					
					
					
					public void LayoutWrapperTableEnd_1() {

					
					
					
					
					tools.appendString("</div>");

					
					
					
					
					}
public void pzLayout_1() {
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_2();
 LayoutWrapperTableEnd_1(); tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void 
pegaReferenceTag_6() {
try {
final ParameterPage params_9 = new ParameterPage();
params_9.putString("UseHeadingStyle", "0");
params_9.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_9 = tools.getProperty(".pyCircumstanceVal");
	if (currentProperty_9 != null && currentProperty_9.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_9 = tools.putActive(currentProperty_9);
		final boolean prevInputMode_9 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_9 = ((PegaAPI) tools).pushStackFrame( params_9, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_9, false);
			tools.putActive(propPrevActive_9);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyCircumstanceVal", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_11() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyCircumstanceVal", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString("headers='a7'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_6();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_6();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_6(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("2016072109335505834280") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); } catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_10() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxUpdateDateTime", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_6(".pxUpdateDateTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_6(".pxUpdateDateTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","37"};oCellRuntimeParamsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","36"};oCellRuntimeParamsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
public void 
pegaReferenceTag_5() {
try {
final ParameterPage params_8 = new ParameterPage();
params_8.putString("UseHeadingStyle", "0");
params_8.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_8 = tools.getProperty(".pyClassName");
	if (currentProperty_8 != null && currentProperty_8.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_8 = tools.putActive(currentProperty_8);
		final boolean prevInputMode_8 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_8 = ((PegaAPI) tools).pushStackFrame( params_8, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_8, false);
			tools.putActive(propPrevActive_8);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyClassName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_9() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyClassName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_5();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_5();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
pegaReferenceTag_4() {
try {
final ParameterPage params_7 = new ParameterPage();
params_7.putString("UseHeadingStyle", "0");
params_7.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_7 = tools.getProperty(".pyRuleName");
	if (currentProperty_7 != null && currentProperty_7.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_7 = tools.putActive(currentProperty_7);
		final boolean prevInputMode_7 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_7 = ((PegaAPI) tools).pushStackFrame( params_7, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_7, false);
			tools.putActive(propPrevActive_7);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyRuleName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_8() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyRuleName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_4();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_4();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","33"};oCellRuntimeParamsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void 
pegaReferenceTag_3() {
try {
final ParameterPage params_3 = new ParameterPage();
params_3.putString("UseHeadingStyle", "0");
params_3.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_3 = tools.getProperty(".pyCircumstanceVal");
	if (currentProperty_3 != null && currentProperty_3.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_3 = tools.putActive(currentProperty_3);
		final boolean prevInputMode_3 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_3 = ((PegaAPI) tools).pushStackFrame( params_3, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_3, false);
			tools.putActive(propPrevActive_3);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyCircumstanceVal", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_7() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyCircumstanceVal", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString("headers='a7'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_3();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_3();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","associated",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","associated",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclAction_1() {
}
public void inclCalVal_1(String controlName,String controlFormat, String styleClass) {tools.appendString("<P id=\"CV\" name=\"");tools.appendString(tools.getActive().getEntryHandle());tools.appendString("\" ");tools.appendString("RHP_NAME=\"");tools.appendString(controlName);tools.appendString(" \" ");tools.appendString(" data-ctl data-ctlformat=\"");tools.appendString(controlFormat);tools.appendString("\" ");
		tools.appendString(" class='");
		tools.appendString(styleClass);
		tools.appendString("' ");if(tools.getParamValue("AJAXTrackID") != null){com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));	changeTracker.trackValueChanges(tools.getActive(),-1);}
}


public void pxDisplayText_4(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("2016072109335505834280") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); } catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxUpdateDateTime", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_4(".pxUpdateDateTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_4(".pxUpdateDateTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_3() {String key="37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","37"};oCellRuntimeParamsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)");}
public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxUpdateOpName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_3();
									tools.appendString("</DIV>"); } else { pxDisplayText_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_2() {String key="36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","36"};oCellRuntimeParamsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyRuleAvailable", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_2();
									tools.appendString("</DIV>"); } else { pxDisplayText_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
pegaReferenceTag_2() {
try {
final ParameterPage params_2 = new ParameterPage();
params_2.putString("UseHeadingStyle", "0");
params_2.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_2 = tools.getProperty(".pyClassName");
	if (currentProperty_2 != null && currentProperty_2.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_2 = tools.putActive(currentProperty_2);
		final boolean prevInputMode_2 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_2 = ((PegaAPI) tools).pushStackFrame( params_2, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_2, false);
			tools.putActive(propPrevActive_2);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyClassName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_3() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyClassName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_2();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_2();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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
 */private boolean _jspx_meth_pega_reference__3(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "UseHeadingStyle", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "true")) {
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
private static final String[] showMeParams_3 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-Gadgets", "08-04-01", "", "Default", "", "RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT" };
private boolean when_10(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || (((((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))) || (((((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam3), aParam4)))))))));
}
private void performStream_8() throws Throwable {
	if (when_10("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" </span> ");
	}
tools.appendString(" ");
}
private static final Map oPropDefinitions_10 = null;
private static final Map oStreamProperties_10 = new HashMap();
static {
	oStreamProperties_10.put("pyRuleAvailable", "Final");
	oStreamProperties_10.put("pyCircumstanceDateProp", "");
	oStreamProperties_10.put("pyCircumstanceVal", "");
	oStreamProperties_10.put("pyMethodStatus", "Internal");
	oStreamProperties_10.put("pyClassName", "");
	oStreamProperties_10.put("pyCircumstanceProp", "");
	oStreamProperties_10.put("pzInsKey", "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT");
	oStreamProperties_10.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_10.put("pyCircumstanceDate", "");
	oStreamProperties_10.put("pyRuleEnds", "");
	oStreamProperties_10.put("pyRuleStarts", "");
	oStreamProperties_10.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_10.put("pyXMLType", "");
	oStreamProperties_10.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_10.put("pyCorrType", "");
	oStreamProperties_10.put("pyStreamName", "EndSmartField");
	oStreamProperties_10.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_EndSmartField
 */
private void property_Rule_RuleSet_Version_EndSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 * Set up context.
 */
final String prevRuleKey_10 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT";final String prevClass_10 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_10 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_10);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_10);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_10)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_8();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_10);
	mStreamResponse.setJspBaseClass(prevClass_10);
	pz_CurrentRuleKey = prevRuleKey_10;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_10,true);
}
/* end RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 */
private void include_8() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_RuleSet_Version_EndSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_9(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
private boolean when_8(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(lookupThisDefinition(tools, aParam1), aParam2)));
}
private boolean when_7(String aParam1) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getActiveValue(), aParam1)));
}
private void performStream_7() throws Throwable {
tools.appendString(" ");
	boolean foundChoice_14 = false;
tools.appendString(" ");
if (!foundChoice_14 && (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize").equals(""))) {
tools.appendString("  ");
 
	/*tools.putSaveValue("pzResult", ""); //Bug-11491 : reset the save variable*/ //moved it to the default HTML property
	float expSize = 0;
	try{
		expSize  = (float)Integer.parseInt(tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize"));
		expSize += java.lang.Math.ceil(expSize*20/100);
	} catch(NumberFormatException e){
		/* Use zero. */
	}
	tools.putSaveValue("strExpectedSize",String.valueOf(expSize));
	
tools.appendString(" ");

foundChoice_14 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_14 && when_2("Size", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("strExpectedSize", "param.Size", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice_14 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_14) {
tools.appendString(" ");
tools.putSaveValue("strExpectedSize", "20");
tools.appendString(" ");
}
tools.appendString("  ");
pzAuto.putSaveRef("strWidth", "param.Width", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

String cssWidth = tools.getSaveValue("strWidth");
try {
	if(cssWidth!= null && cssWidth.trim().length() != 0) {
		int cssWidthNumericValue = Integer.parseInt(cssWidth);
		
		if(cssWidthNumericValue !=0){
			cssWidth = cssWidthNumericValue + "px";
		}
	}
} catch( NumberFormatException ex) {
}

tools.putSaveValue("cssWidth", cssWidth);

tools.appendString(" ");
pzAuto.putSaveRef("strExpectedWidth", "param.Width", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
	
	String strEnteredSize = StringUtils.crossScriptingFilter(tools.getSaveValue("strExpectedSize"));
	String strEnteredWidth = StringUtils.crossScriptingFilter(tools.getSaveValue("cssWidth"));
	if(!tools.getParamValue("bNoSize").equals("true"))
		tools.appendString("size='" + strEnteredSize + "' ");
	if( (!tools.getParamValue("bNoWidth").equals("true")) && (strEnteredWidth != "") )
		tools.appendString("style='width:" + strEnteredWidth + "' ");

	tools.putParamValue("bNoSize", "false");
	tools.putParamValue("bNoWidth", "false");

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
	oStreamProperties_9.put("pzInsKey", "RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT");
	oStreamProperties_9.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_9.put("pyCircumstanceDate", "");
	oStreamProperties_9.put("pyRuleEnds", "");
	oStreamProperties_9.put("pyRuleStarts", "");
	oStreamProperties_9.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_9.put("pyXMLType", "");
	oStreamProperties_9.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_9.put("pyCorrType", "");
	oStreamProperties_9.put("pyStreamName", "Attributes");
	oStreamProperties_9.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_Attributes
 */
private void property_Rule_RuleSet_Version_Attributes() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT
 * Set up context.
 */
final String prevRuleKey_9 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT";final String prevClass_9 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_9 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_9);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_9);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
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
/* end RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT
 */
private void include_7() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_RuleSet_Version_Attributes();
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
private void performStream_6() throws Throwable {


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
	boolean foundChoice_11 = false;
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_11) {
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
	boolean foundChoice_12 = false;
tools.appendString(" ");
if (!foundChoice_12 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_12 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_12 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_12 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_12 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_12 = !pega.isPreviewMode();
}
tools.appendString("  </span> </div> ");
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
	oStreamProperties_8.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT");
	oStreamProperties_8.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_8.put("pyCircumstanceDate", "");
	oStreamProperties_8.put("pyRuleEnds", "");
	oStreamProperties_8.put("pyRuleStarts", "");
	oStreamProperties_8.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_8.put("pyXMLType", "");
	oStreamProperties_8.put("pyRuleSet", "Pega-UIDesign");
	oStreamProperties_8.put("pyCorrType", "");
	oStreamProperties_8.put("pyStreamName", "Messages");
	oStreamProperties_8.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_Messages
 */
private void property_Rule_RuleSet_Version_Messages() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 * Set up context.
 */
final String prevRuleKey_8 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT";final String prevClass_8 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_RuleSet_Version_Messages();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName) throws Throwable {
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
private boolean when_6(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_6("SmartInfoHeader", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartLabel", "$this-definition(pyLabel)", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartLabel", "param.SmartInfoHeader", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
}
}
private boolean when_5(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))));
}
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || ((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_4("ReadOnlySmartInfo", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartInfoSection", "param.ReadOnlySmartInfo", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_5("ReadWriteSmartInfo", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartInfoSection", "param.ReadWriteSmartInfo", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
tools.putSaveValue("SmartInfoSection", "");
tools.appendString(" ");
}
}
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-Gadgets", "08-05-01", "", "SmartInfoPopupInclude", "", "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT" };
/**
 * Implements a pega:lookup tag.
 */private boolean _jspx_meth_pega_lookup__1(PageContext aPageContext, java.lang.String aProperty, java.lang.String aValue) throws Throwable {
/* pega:lookup */
com.pega.pegarules.jsptags.LookupTag _jspx_th_pega_lookup_ = (com.pega.pegarules.jsptags.LookupTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.LookupTag.class);
_jspx_th_pega_lookup_.setPageContext(pageContext);
_jspx_th_pega_lookup_.setParent(mParentTag);
_jspx_th_pega_lookup_.setProperty(aProperty);
_jspx_th_pega_lookup_.setValue(aValue);
int _jspx_eval_pega_lookup_ = _jspx_th_pega_lookup_.doStartTag();
if (_jspx_th_pega_lookup_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_lookup_);
return false;
}
private static final String[] showMeParams_1 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT", "Rule-Obj-FieldValue", "Pega-WB", "pyMessageLabel", "Code-Pega-Requestor", "Loading..." };
private void performStream_3() throws Throwable {
tools.appendString("<script> var strLoadMsg = \"");

/* Field value Code-Pega-Requestor pxRequestor.pyMessageLabel Loading... */
if (mInline_pxRequestor) {
	out.write("Loading...");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_1);
} else {
if (_jspx_meth_pega_lookup__1(pageContext, "pxRequestor.pyMessageLabel", "Loading...")) {
	return;
}
}
tools.appendString("\"; </script>");
}
private static final Map oPropDefinitions_7 = new HashMap();
static {
	oPropDefinitions_7.put("Code-Pega-Requestor.pyMessageLabel", new LiteweightPropertyDefinition("Code-Pega-Requestor", "pyMessageLabel", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_7 = new HashMap();
static {
	oStreamProperties_7.put("pyRuleAvailable", "Final");
	oStreamProperties_7.put("pyCircumstanceDateProp", "");
	oStreamProperties_7.put("pyCircumstanceVal", "");
	oStreamProperties_7.put("pyMethodStatus", "Internal");
	oStreamProperties_7.put("pyClassName", "");
	oStreamProperties_7.put("pyCircumstanceProp", "");
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "pzSetStrLoadMsg");
	oStreamProperties_7.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_7)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

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
/* end RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT */
}
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
tools.appendString(" ");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("pzpega_ui_smartinfo", "13318087721", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addFile("smartinfopopup", "1421806147", "js");
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT */
include_3();

tools.appendString(" ");
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
 * OnlyOnce condition: StreamIncluded_SmartInfo_Script
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("StreamIncluded_SmartInfo_Script")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_4() throws Throwable {
onlyOnce_1();
}
private static final Map oPropDefinitions_6 = null;
private static final Map oStreamProperties_6 = new HashMap();
static {
	oStreamProperties_6.put("pyRuleAvailable", "Final");
	oStreamProperties_6.put("pyCircumstanceDateProp", "");
	oStreamProperties_6.put("pyCircumstanceVal", "");
	oStreamProperties_6.put("pyMethodStatus", "");
	oStreamProperties_6.put("pyClassName", "");
	oStreamProperties_6.put("pyCircumstanceProp", "");
	oStreamProperties_6.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "SmartInfoPopupInclude");
	oStreamProperties_6.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 */
private void include_4() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_6,true);
}
/* end RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_2);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_3(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((!areValsEqual(tools.getParamValue(aParam1), aParam2)) || (!areValsEqual(tools.getParamValue(aParam3), aParam4))));
}
private void performStream_5() throws Throwable {
	if (when_3("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
include_4();

tools.appendString(" ");
	}
tools.appendString(" ");
choose_2();
tools.appendString("  ");
choose_3();
tools.appendString("  ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("SmartInfoSection"), ""))) {
tools.appendString(" <SPAN id=\"SI\" class=\"smartInfo\" si_usingpage='' si_headertext= '");
out.print(tools.getLocalizedTextForString("pyLabel", tools.getSaveValue("SmartLabel") ) );
tools.appendString(" ' si_sectionname = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(SmartInfoSection)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(SmartInfoSection)")) {
	return;
}
tools.appendString("' name='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-definition(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-definition(pyPropertyName)")) {
	return;
}
tools.appendString("' > ");
	}
}
private static final Map oPropDefinitions_5 = null;
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Final");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "Internal");
	oStreamProperties_5.put("pyClassName", "");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "StartSmartField");
	oStreamProperties_5.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_StartSmartField
 */
private void property_Rule_RuleSet_Version_StartSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_5 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_5);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_5);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_5)) {
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_5,true);
}
/* end RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_RuleSet_Version_StartSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_9() throws Throwable {
 
       tools.putSaveValue("pzResult", ""); /*Bug-11491 : reset the save variable*/
	   String tooltip = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyToolTip",tools.getParamValue("ToolTip")));

	if (pega.isPreviewMode() || ((areValsEqual(tools.getSaveValue("prepareForDataGrid"), "true")) && ((tools.useModeInput())))) {
tools.appendString("<script> function Default_getValue(){ ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\"; var field = document.getElementById(ID); if (field.checked){ return true; } else{ return false; } ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"; var field = document.getElementById(ID); if (field){ return field.value; } else{ return \"\"; } ");
}
tools.appendString("  } function Default_setValue(val){ ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"+ val; var field = document.getElementById(ID); if (field){ field.checked = true; } ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"; var field = document.getElementById(ID); if (field){ field.value = val; } ");
}
tools.appendString("  } function Default_setFocus(){ ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\"; ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
tools.appendString(" var ID=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\"; ");
}
tools.appendString("  var field = document.getElementById(ID); if (field && (field.tagName == \"INPUT\") || (field.tagName == \"input\")){ field.focus(); } } </script>");
	}
	if (pega.isPreviewMode() || !tools.getParamValue("ReadOnlySmartInfo").equals("") || !tools.getParamValue("ReadWriteSmartInfo").equals("")) {
/* Include stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
include_5();

	}
	boolean foundChoice_8 = false;
if (!foundChoice_8 && (WhenTag.evaluateWhen(pega, "$this:isScalar", null, false))) {
	boolean foundChoice_9 = false;
if (!foundChoice_9 && (pega.isPreviewMode() || (((!(tools.useModeInput())))))) {
	boolean foundChoice_10 = false;
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_PASSWORD)))) {
 
							int  idx = tools.getActiveValue().length();
							while (idx-- > 0) tools.appendString("*");
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATE)))) {
 
							java.util.Date theDate = null;
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
								try {
									theDate = tools.getActive().toDate();
								} catch (com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
									theDate = null;
									throw ive;
								} finally {
									if (theDate !=null) {
										tools.appendString(PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_DATE_DEFAULT, theDate));
									} else {
										tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
									}
								}
							}
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TIMEOFDAY)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								java.util.Date theDate = null;
								try {
									theDate = tools.getActive().toDate();
								} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
									theDate = null;
									throw ive;
								} finally {
									if (theDate !=null) {
										tools.appendString(PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_TIME_DEFAULT, theDate));
									} else {
										tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
									}
								}
							}
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)))) {
tools.appendString(" ");
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								java.util.Date theDate = null;
								try {
									theDate = tools.getActive().toDate();
								} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
									theDate = null;
								} finally {
									if (theDate !=null) {
										tools.appendString(PRDateFormat.format(null,null, PRDateFormat.DEFAULT_DATETIME_DEFAULT, theDate));
									} else {
										tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
									}
								}
							}
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DECIMAL)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								ClipboardProperty myProp = tools.getActive();
								com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
								int decimalPrecision = myProp.getDecimalPrecision();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DOUBLE)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								ClipboardProperty myProp = tools.getActive();
								double value = myProp.toDouble();
								int decimalPrecision = myProp.getDecimalPrecision();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_NUMBER)))) {
 
							if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
								double value = tools.getActive().toInteger();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_INTEGER, false, null, value));
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_AMOUNT)))) {
 
							ClipboardProperty baseProp = tools.getActive();
							String curr = null;
							if(tools.getDictionary().hasQualifier(baseProp,"pyCurrency") ) {
								ClipboardProperty prop = tools.getDictionary().getPropertyViaQualifier(baseProp, "pyCurrency");
								if(prop != null)
									curr = prop.getStringValue();
							}
							if( tools.getActiveValue().length() > 0 && baseProp.hasValidValue() ) {
								ClipboardProperty myProp = tools.getActive();
								com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
								int decimalPrecision = myProp.getDecimalPrecision();
								tools.appendString(PRNumberFormat.format(null, PRNumberFormat.DEFAULT_CURRENCY, false, null, decimalPrecision,value)); 
							} else {
								tools.appendString(StringUtils.crossScriptingFilter(tools.getActiveValue()));
							}
						

foundChoice_10 = !pega.isPreviewMode();
}
if (!foundChoice_10) {
out.print(StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",tools.getActiveValue(),StreamBuilder.FMT_LITERAL)));
}

foundChoice_9 = !pega.isPreviewMode();
}
if (!foundChoice_9) {
tools.appendString("<SPAN nowrap>");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_6();

	boolean foundChoice_13 = false;
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TEXT)))) {
tools.appendString("<input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_7("")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
	if (when_8("pyMaxLength", "")) {
tools.appendString("maxlength=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyMaxLength)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DECIMAL)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									ClipboardProperty myProp = tools.getActive();
									com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
									int decimalPrecision = myProp.getDecimalPrecision();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_9("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
	if (when_8("pyMaxLength", "")) {
tools.appendString("maxlength=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyMaxLength)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DOUBLE)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									ClipboardProperty myProp = tools.getActive();
									double value = myProp.toDouble();
									int decimalPrecision = myProp.getDecimalPrecision();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_DECIMAL, false, null, decimalPrecision,value));
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_9("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
	if (when_8("pyMaxLength", "")) {
tools.appendString("maxlength=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyMaxLength)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\"> ");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TRUEFALSE)))) {
tools.appendString("<input ");
out.print( tools.getActive().toBoolean() ? "checked" : "" );
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\" type=radio value=\"true\" class=\"Radio\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\"> <label for=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("true\">True</label> <input ");
out.print( tools.getActive().toBoolean() ? "" : "checked" );
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("false\" type=radio value=\"false\" class=\"Radio\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\"> <label for=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("false\">False</label>");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_PASSWORD)))) {
tools.appendString("<input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" type=password value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"leftJustifyStyle\" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATE)))) {
tools.appendString(" ");
 
								java.util.Date theDate = null;
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
									try {
										theDate = tools.getActive().toDate();
									} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
										theDate = null;
										throw ive;
									} finally {
										if (theDate !=null) 
											tools.putSaveValue("pzResult", PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_DATE_DEFAULT, theDate));
										else 
											tools.putSaveValue("pzResult", tools.getActiveValue());
									}
								}
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_9("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_TIMEOFDAY)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
									java.util.Date theDate = null;
									try {
										theDate = tools.getActive().toDate();
									} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
										theDate = null;
										throw ive;
									} finally {
										if (theDate !=null) 
											tools.putSaveValue("pzResult", PRDateFormat.format(null,"GMT", PRDateFormat.DEFAULT_TIME_DEFAULT, theDate));
										else 
											tools.putSaveValue("pzResult", tools.getActiveValue());
									}
								}
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_9("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_DATETIME)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue()) {
									java.util.Date theDate = null;
									try  {
										theDate = tools.getActive().toDate();
									} catch( com.pega.pegarules.pub.clipboard.InvalidValueException ive ) {
										theDate = null;
									} finally {
										if (theDate !=null) 
											tools.putSaveValue("pzResult", PRDateFormat.format(null,null, PRDateFormat.DEFAULT_DATETIME_DEFAULT, theDate));
										else 	
											tools.putSaveValue("pzResult", tools.getActiveValue());
									}
								}
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_9("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_NUMBER)))) {
 
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									double value = tools.getActive().toInteger();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_INTEGER, false, null, value));
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_9("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13 && (pega.isPreviewMode() || ((tools.getActive().getType() == PropertyInfo.TYPE_AMOUNT)))) {
tools.appendString(" ");
 
								ClipboardProperty baseProp = tools.getActive();
								String curr = null;
								if(tools.getDictionary().hasQualifier(baseProp,"pyCurrency") ) {
									ClipboardProperty prop = tools.getDictionary().getPropertyViaQualifier(baseProp, "pyCurrency");
									if(prop != null)
										curr = prop.getStringValue();
								}
								if( tools.getActiveValue().length() > 0 && tools.getActive().hasValidValue() ) {
									ClipboardProperty myProp = tools.getActive();
									com.pega.ibm.icu.math.BigDecimal value = myProp.toBigDecimal();
									int decimalPrecision = myProp.getDecimalPrecision();
									tools.putSaveValue("pzResult", PRNumberFormat.format(null, PRNumberFormat.DEFAULT_CURRENCY, false, null, decimalPrecision,value)); 
								} else 
									tools.putSaveValue("pzResult", tools.getActiveValue());
							
tools.appendString(" <input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"rightJustifyStyle\" type=\"text\"");
	if (when_9("pzResult", "")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(pzResult)", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\">");

foundChoice_13 = !pega.isPreviewMode();
}
if (!foundChoice_13) {
tools.appendString("<input ");
/* Include stream RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT */
include_7();

tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyPropertyName)", "NORMAL")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" class=\"leftJustifyStyle\" type=\"text\"");
	if (when_7("")) {
tools.appendString("value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("\" title =\"");
out.print( tooltip);
tools.appendString("\" alt =\"");
out.print( tooltip);
tools.appendString("\">");
}
tools.appendString("</SPAN>");
}

foundChoice_8 = !pega.isPreviewMode();
}
if (!foundChoice_8) {
}
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getParamValue("ReadOnlySmartInfo").equals("") || !tools.getParamValue("ReadWriteSmartInfo").equals("")) {
/* Include stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
include_8();

	}
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
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "Default");
	oStreamProperties_4.put("pyRuleSetVersion", "08-04-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_Default
 */
private void property_Rule_RuleSet_Version_Default() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT	Pega-Gadgets:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_4 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_4);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_4);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_4)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_9();

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
/* end RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT
 */
private void include_9() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_RuleSet_Version_Default();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_3);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName, java.lang.String aMode) throws Throwable {
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
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
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
private void performStream_1() throws Throwable {
tools.appendString(" ");
out.print( tools.getParamValue("pega_attributes") );
tools.appendString(" ");

  String mode1 = tools.getSaveValue("mode1Action");
  String mode2 = tools.getSaveValue("mode2Action");

tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
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
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
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
choose_1();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_2("pega_validation", "")) {
tools.appendString("  ");
choose_1();
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

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
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

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString(" ");
}
tools.appendString("  ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(validationAttributes)", "literal")) {
	return;
}
tools.appendString(" ");
	}
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "ClientValidation");
	oStreamProperties_3.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_ClientValidation
 */
private void property_Rule_RuleSet_Version_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,true);
}
/* end RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_RuleSet_Version_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_2() throws Throwable {
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzActionSetAttributes");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_10() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (!areValsEqual(tools.getProperty("pxRequestor.pyPegaDesignMode").getStringValue(), "true")))) {
tools.appendString(" ");
 String tableDivType = (tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"UseHeadingStyle")) ? "th" : "td";
  String titleValue=tools.getLocalizedTextForString("pyCaption",tools.getActiveValue(),StreamBuilder.FMT_LITERAL);
 tools.getParameterPage().putParamValue( "titleValue", titleValue ) ;
 
  
tools.appendString(" <table cellspacing='0' cellpadding='0' style=\"table-layout:fixed; width:100%; border-collapse:collapse; border-color:transparent; border-style:outset;font-size:inherit;\" > <tr> <");
out.print( tableDivType );
tools.appendString(" class=\"");
out.print( "ellipsis " + StringUtils.crossScriptingFilter(tools.getParamValue("StyleClass")));
tools.appendString("\" style=\"background-color:transparent;");
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("InlineStyle")));
tools.appendString(" ");
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("MouseHoverStyle")) );
tools.appendString("\" ");
/* Include stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
include_2();

tools.appendString(" > ");
/* Include stream RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT */
include_9();

tools.appendString(" </");
out.print( tableDivType );
tools.appendString("> </tr> </table> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT */
include_9();

tools.appendString("... ");
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzEllipsis");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_pzEllipsis
 */
private void property_Rule_RuleSet_Version_pzEllipsis() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT	Pega-Gadgets:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_10();

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
/* end RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT */
}
}
public void 
pegaReferenceTag_1() {
try {
final ParameterPage params_1 = new ParameterPage();
params_1.putString("UseHeadingStyle", "0");
params_1.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pyRuleName");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_1 = ((PegaAPI) tools).pushStackFrame( params_1, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_1, false);
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyRuleName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public String 
getActionsForCustomControls_1() {
	boolean directStream = ((PegaStreamAPI)tools).isDirectStreaming();
	if(directStream) {
		((PegaStreamAPI)tools).disableDirectStreaming();
	}
	String currentStream = tools.getCurrentStream();
	String returnString = tools.getCurrentStream();
	tools.appendString(currentStream);
	if(directStream) {
		((PegaStreamAPI)tools).forceDirectStreaming();
	}
	returnString = " data-ctl='non-auto' "+returnString;
	return returnString;
}
public void repeatingDataCell_2() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_1();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzEllipsis",".pyRuleName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:30px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_1();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_1();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_1() {String key="33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","33"};oCellRuntimeParamsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxPages(ROC).pyLabel", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:32px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pxPages(ROC).pyLabel cq",".pxPages(ROC).pyLabel!=\'\'", "cell", "visible" )) {pxDisplayText_1(); } 
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(pzAuto.handleEvaluateWhen(" o2!= rx.pxPages(ROC).pyLabel cq",".pxPages(ROC).pyLabel!=\'\'", "cell", "visible" )) {pxDisplayText_1(); } }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void gridOpenActionIncl_1() {
pzAuto.emitIncludeStreamReference("pzGridOpenAction", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Fragment", null);
}
public void 
getInlineStyle_1() {
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","33"};oCellRuntimeParamsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("33||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","36"};oCellRuntimeParamsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("36||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_pzRulesForRulesetVersion.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","37"};oCellRuntimeParamsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",paramValues);oControlPathsMap.put("37||RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)");}


public void pxDisplayText_5(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("2016072109335505834280") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); } catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}



public void D_pzRulesForRulesetVersion_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"runScript\", [\"OpenRuleInPortal(");
String strPropReference21 = "#~.pzInsKey$0$~#";
String strFormattedPropReference21 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference21);
if(strPropReference21.equals(strFormattedPropReference21)) {
tools.appendString("\\\"");
tools.appendFormatted(strFormattedPropReference21.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
tools.appendString("\\\"");
} else {
tools.appendFormatted(strFormattedPropReference21.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
}
tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"openRule\",[\"");

		tools.appendString("#~.pzInsKey$0$~#");tools.appendString("\",\"true\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public void 
gridBeginLayout_1() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());
}


public void gridDoPartialRefresh_1() { /*gridDoPartialRefresh*/
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					if(tools.getParamValue("partialTrigger").equals("appendToD_pzRulesForRulesetVersion.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowD_pzRulesForRulesetVersion.pxResults1") ){

					tools.putParamValue("partialRefresh", "false");

					Iterator propItr = null;

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardPage jsonRefreshRows = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					tools.appendString("<table id='bodyTbl_right'><tbody>");

					if(jsonRefreshRows != null)

					propItr = jsonRefreshRows.getProperty("JSONArrayList").iterator(); 

					}

					while(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows") || (propItr != null && propItr.hasNext())){

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardProperty cp = (ClipboardProperty) propItr.next();

					String pyPropRef = cp.getProperty("pyPropRef").getStringValue();

					String curRowNum = cp.getProperty("curRowNum").getStringValue();

					tools.putParamValue("strIndexInList", tools.getStepPage().getProperty(pyPropRef).indexOf());

					tools.putParamValue("curRowNum", curRowNum);

					}

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(tools.getParamValue("strIndexInList")));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					tools.putParamValue("strIndexInList", pageListProp.size());

					}

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
						 tools.putParamValue("expandRL","true");

					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pzRulesForRulesetVersion.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pzInsKey"),-1);

					
 }}catch(Exception e){}

					tools.appendString(" data-gargs='[");

					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pzInsKey").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzRulesForRulesetVersion.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzRulesForRulesetVersion.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzRulesForRulesetVersion.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201806041058230325539-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					activeName = tools.getActiveName();  repeatingDataCell_3(); 

					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					activeName = tools.getActiveName();  repeatingDataCell_5(); 

					activeName = tools.getActiveName();  repeatingDataCell_6(); 

					activeName = tools.getActiveName();  repeatingDataCell_7(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					
									  pega.popStackFrame(frame_3, false); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					if (!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					break;

					}

					}//close the refresh rows while loop

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.appendString("</tbody></table>||END||");

					ClipboardPage jsonClipboardPage = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					if(jsonClipboardPage != null)

					jsonClipboardPage.removeFromClipboard();

					}

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					 } 

					 tools.putSaveValue("isGrid", "false"); 

					
	 /* generate the transaction ID if it has been changed due to DB commit operations */ 

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_pzRulesForRulesetVersion.pxResults1")) {

					
		String latestTransID = tools.getRequestor().getRequestorPage().getString("pxClientExchange");

					
		String postedTransID = tools.getParamValue("pzTransactionId");

					
		if(!postedTransID.trim().equals(latestTransID.trim())){

					tools.appendString("\n\t\t\t||GRIDCOMMIT||");

					tools.appendString(latestTransID.trim());tools.appendString("||");

					
		 }

					
			 tools.putParamValue("partialRefresh", "false");

					
		 }

					
  if(tools.getParamValue("partialTrigger").equals("delete")) { 

					
	 if(tools instanceof StreamBuilderToolKit) {

					
		 ClipboardProperty pageListProp = null;

					pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_pzRulesForRulesetVersion.pxResults1")) { 

					
			String subScriptForColumn = tools.getParamValue("subScriptForColumn");

					
			int columnIndex = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER,"columnIndex");

					
			int dynamicColumnIndex = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER, "dynamicColumnIndex");

					String strCellType = tools.getParamValue("pyCellType"); 

					if(strCellType.equals("")){ strCellType = "static"; 

					if(columnIndex < dynamicColumnIndex) 

					{ 

					   strCellType = "static"; 

					}else if(columnIndex >= (dynamicColumnIndex+dynamicColCount)) 

					{ 

					   strCellType = "static"; 

					}else { 

					   strCellType = "dynamic"; 

					}} 

					
			 if(subScriptForColumn.equals("pxPages(ROC).pyLabel1") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_1();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyRuleName2") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {
final ParameterPage params_4 = new ParameterPage();
params_4.putString("UseHeadingStyle", "0");
params_4.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_4 = tools.getProperty(".pyRuleName");
	if (currentProperty_4 != null && currentProperty_4.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_4 = tools.putActive(currentProperty_4);
		final boolean prevInputMode_4 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_4 = ((PegaAPI) tools).pushStackFrame( params_4, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_4, false);
			tools.putActive(propPrevActive_4);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyRuleName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyClassName3") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {
final ParameterPage params_5 = new ParameterPage();
params_5.putString("UseHeadingStyle", "0");
params_5.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_5 = tools.getProperty(".pyClassName");
	if (currentProperty_5 != null && currentProperty_5.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_5 = tools.putActive(currentProperty_5);
		final boolean prevInputMode_5 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_5 = ((PegaAPI) tools).pushStackFrame( params_5, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_5, false);
			tools.putActive(propPrevActive_5);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyClassName", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyRuleAvailable4") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_2();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxUpdateOpName5") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_3();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxUpdateDateTime6") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_5(".pxUpdateDateTime",0,"","","Date Time");

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyCircumstanceVal7") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {
final ParameterPage params_6 = new ParameterPage();
params_6.putString("UseHeadingStyle", "0");
params_6.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_6 = tools.getProperty(".pyCircumstanceVal");
	if (currentProperty_6 != null && currentProperty_6.getParentPage().getClassName().equals("Rule-RuleSet-Version")) {
		final ClipboardProperty propPrevActive_6 = tools.putActive(currentProperty_6);
		final boolean prevInputMode_6 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_6 = ((PegaAPI) tools).pushStackFrame( params_6, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzEllipsis" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_RuleSet_Version_pzEllipsis();
		} finally {
			pega.popStackFrame(stack_6, false);
			tools.putActive(propPrevActive_6);
		}
	} else {
if (_jspx_meth_pega_reference__3(pageContext, ".pyCircumstanceVal", "display", "pzEllipsis")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 } 

					
					 /* GenerateGrid: End */

					}

					

public void gridLastRow_1() { /*gridLastRow*/

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					java.util.Map functionsMap = null;

					java.util.Map classesMap = null;

					tools.putSaveValue("bAllowRowUpdate","true");

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_pzRulesForRulesetVersion.pxResults1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
					String strIndex1 = tools.getParamValue("lastRowToRetrieve");

					
					if("".equals(strIndex1) || Integer.parseInt(strIndex1) > pageListProp.size())

					
					strIndex1 = tools.getParamValue("strIndexInList");

					
					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(strIndex1));

					
					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					
					tools.putParamValue("strIndexInList", pageListProp.size());

					
					}

					
					
						 tools.putParamValue("expandRL","false"); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
					
						 tools.putParamValue("expandRL","true");

					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pzRulesForRulesetVersion.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzRulesForRulesetVersion.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzRulesForRulesetVersion.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzRulesForRulesetVersion.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201806041058230325539-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_1(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_8(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_9(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_5(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_10(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_11(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					 /* GenerateGrid: End */

					
					}
private void performStream_11() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_11 = new HashMap();
static {
	oPropDefinitions_11.put("Rule-RuleSet-Version.pyClassName", new LiteweightPropertyDefinition("Rule-RuleSet-Version", "pyClassName", "siN", false, true, "Default", false));
	oPropDefinitions_11.put("Rule-RuleSet-Version.pyCircumstanceVal", new LiteweightPropertyDefinition("Rule-RuleSet-Version", "pyCircumstanceVal", "sTN64", false, true, "Default", false));
	oPropDefinitions_11.put("Rule-RuleSet-Version.pyRuleName", new LiteweightPropertyDefinition("Rule-RuleSet-Version", "pyRuleName", "sTY255", true, true, "Default", false));
}
private static final Map oStreamProperties_11 = new HashMap();
static {
	oStreamProperties_11.put("pyRuleAvailable", "Final");
	oStreamProperties_11.put("pyCircumstanceDateProp", "");
	oStreamProperties_11.put("pyCircumstanceVal", "");
	oStreamProperties_11.put("pyMethodStatus", "Internal");
	oStreamProperties_11.put("pyClassName", "Rule-RuleSet-");
	oStreamProperties_11.put("pyCircumstanceProp", "");
	oStreamProperties_11.put("pzInsKey", "RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT");
	oStreamProperties_11.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_11.put("pyCircumstanceDate", "");
	oStreamProperties_11.put("pyRuleEnds", "");
	oStreamProperties_11.put("pyRuleStarts", "");
	oStreamProperties_11.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_11.put("pyXMLType", "");
	oStreamProperties_11.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_11.put("pyCorrType", "");
	oStreamProperties_11.put("pyStreamName", "pzShowRulesForRulesetVersion");
	oStreamProperties_11.put("pyRuleSetVersion", "08-03-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
	private boolean mInline_pxRequestor = false;
protected void initRequiredPages() {
	ClipboardPage cpCheck = null;
	cpCheck = tools.findPage("pxRequestor");
	mInline_pxRequestor = ((cpCheck != null) && (cpCheck.getClassName().equals("Code-Pega-Requestor")));
}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_8 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_7 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT", "pzSetStrLoadMsg", "Pega-Gadgets", "08-05-01", "20200428T081054.535 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_9 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY ATTRIBUTES #20180713T133432.763 GMT", "Attributes", "Pega-Gadgets", "08-01-01", "20180713T133432.763 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY DEFAULT #20190614T125129.697 GMT", "Default", "Pega-Gadgets", "08-04-01", "20190614T125129.697 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT", "SmartInfoPopupInclude", "Pega-Gadgets", "08-05-01", "20200428T081054.428 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT", "StartSmartField", "Pega-Gadgets", "08-01-01", "20180713T133438.113 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-RULESET- PZSHOWRULESFORRULESETVERSION #20190515T171454.428 GMT", "Rule-RuleSet- pzShowRulesForRulesetVersion", "Pega-Desktop", "08-03-01", "20190515T171454.428 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT", "pzActionSetAttributes", "Pega-UIEngine", "08-01-01", "20180713T133243.581 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_10 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT", "EndSmartField", "Pega-ProCom", "08-01-01", "20180713T132011.328 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZELLIPSIS #20230727T113845.987 GMT", "pzEllipsis", "Pega-Gadgets", "08-23-01", "20230727T113845.987 GMT");
}
