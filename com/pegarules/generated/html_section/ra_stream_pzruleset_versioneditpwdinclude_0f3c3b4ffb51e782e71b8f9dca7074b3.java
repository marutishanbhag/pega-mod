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
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.ComplexParameterPage;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.IStaticContentRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
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
/**
 * Builds JSP stream RULE-RULESET-VERSION!PZRULESET_VERSIONEDITPWDINCLUDE.
 */
public class ra_stream_pzruleset_versioneditpwdinclude_0f3c3b4ffb51e782e71b8f9dca7074b3 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleSet_VersionEditPwdInclude.Rule_RuleSet_Version.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 2130802607;
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
	public ra_stream_pzruleset_versioneditpwdinclude_0f3c3b4ffb51e782e71b8f9dca7074b3(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "c8e570d95a25b102ea547f600e6fb8f54f3b1e9d";
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
/* Instance RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "c8e570d95a25b102ea547f600e6fb8f54f3b1e9d";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleSet_VersionEditPwdInclude",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
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
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT */
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
	"Rule-File-Text:WEBWB!PZPEGA_CONTROL_DATEPICKER!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_SPINNER!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_MOMENT_WITH_LOCALES!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_MOMENT_TIMEZONE_WITH_DATA!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_CALENDAR!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_CALENDAR_DBP!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_CALENDAR_UTIL!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-File-Bundle:PZDATEPICKERADVANCED!SCRIPT", 
	"Rule-HTML-Section:PZRULESET_VERSIONEDITPWDINCLUDE", 
	"Rule-Obj-Property:PYVERSIONFORMEDITPWD", 
	"Rule-Obj-Property:PYRULESETVERSIONEFFECTIVEDATE", 
	"Rule-HTML-Property:PXDATETIME", 
	"Rule-File-Binary:WEBWB!PZSPACER!GIF"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PZPEGA_CONTROL_DATEPICKER!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_DATEPICKER!JS #20230906T050457.600 GMT","WEBWB!PZPEGA_CONTROL_DATEPICKER!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_SPINNER!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_UI_SPINNER!JS #20210527T094910.097 GMT","WEBWB!PZPEGA_UI_SPINNER!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_MOMENT_WITH_LOCALES!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_MOMENT_WITH_LOCALES!JS #20230618T002001.381 GMT","WEBWB!PZPEGA_MOMENT_WITH_LOCALES!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_MOMENT_TIMEZONE_WITH_DATA!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_MOMENT_TIMEZONE_WITH_DATA!JS #20230618T002000.668 GMT","WEBWB!PZPEGA_MOMENT_TIMEZONE_WITH_DATA!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_CALENDAR!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_CALENDAR!JS #20230618T002001.474 GMT","WEBWB!PZPEGA_UI_CALENDAR!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_CALENDAR_DBP!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_CALENDAR_DBP!JS #20230618T002001.436 GMT","WEBWB!PZPEGA_UI_CALENDAR_DBP!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_CALENDAR_UTIL!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_CALENDAR_UTIL!JS #20230618T002001.518 GMT","WEBWB!PZPEGA_UI_CALENDAR_UTIL!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDATEPICKERADVANCED!SCRIPT","Rule-File-Bundle","",false,"","Pega-Gadgets","","RULE-FILE-BUNDLE PZDATEPICKERADVANCED SCRIPT #20190130T074013.049 GMT","PZDATEPICKERADVANCED!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZRULESET_VERSIONEDITPWDINCLUDE","Rule-HTML-Section","RULE-RULESET-VERSION",false,"","Pega-SystemArchitect","08-01-01","RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT","!PZRULESET_VERSIONEDITPWDINCLUDE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",2130802607), 
		new DependentRuleInfo("PYVERSIONFORMEDITPWD","Rule-Obj-Property","RULE-RULESET-VERSION",true,"Rule-RuleSet-Version","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYVERSIONFORMEDITPWD #20180713T131310.160 GMT","!PYVERSIONFORMEDITPWD",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYRULESETVERSIONEFFECTIVEDATE","Rule-Obj-Property","RULE-RULESET-VERSION",true,"Rule-RuleSet-Version","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYRULESETVERSIONEFFECTIVEDATE #20180713T131310.150 GMT","!PYRULESETVERSIONEFFECTIVEDATE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXDATETIME","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXDATETIME #20190131T183501.543 GMT","PXDATETIME",true,false,"ABSOLUTE_CLASSLESS",1269011618), 
		new DependentRuleInfo("WEBWB!PZSPACER!GIF","Rule-File-Binary","",false,"","Pega-Desktop","","RULE-FILE-BINARY WEBWB PZSPACER!GIF #20180713T135103.472 GMT","WEBWB!PZSPACER!GIF",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT:20180713T135703.163 GMT
//	RULE-HTML-PROPERTY PXDATETIME #20190131T183501.543 GMT:20190131T183501.543 GMT
//	RULE-FILE-BUNDLE PZDATEPICKERADVANCED SCRIPT #20190130T074013.049 GMT:20190130T074013.049 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_CALENDAR_UTIL!JS #20230618T002001.518 GMT:20230618T002001.518 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_DATEPICKER!JS #20230906T050457.600 GMT:20231107T084751.793 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_CALENDAR_DBP!JS #20230618T002001.436 GMT:20230618T002001.436 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_CALENDAR!JS #20230618T002001.474 GMT:20230618T002001.474 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_SPINNER!JS #20210527T094910.097 GMT:20210527T094910.097 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MOMENT_WITH_LOCALES!JS #20230618T002001.381 GMT:20230618T002001.381 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MOMENT_TIMEZONE_WITH_DATA!JS #20230618T002000.668 GMT:20230618T002000.668 GMT
//	RULE-FILE-BINARY WEBWB PZSPACER!GIF #20180713T135103.472 GMT:20180713T135103.472 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYRULESETVERSIONEFFECTIVEDATE #20180713T131310.150 GMT:20180713T131310.150 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYVERSIONFORMEDITPWD #20180713T131310.160 GMT:20180713T131310.160 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELINCLUDE #20181206T140519.218 GMT:20181206T140519.218 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEDATEPICKER--(CLIPBOARD131E322B0C47E77F51CFE1BC9DD38DE5 #20230925T171736.195 GMT:20230925T171736.195 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
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
		return "c9eb2db1807de7d7418131f68fee2549";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-RuleSet-Version";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzRuleSet_VersionEditPwdInclude",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzRuleSet_VersionEditPwdInclude','insKey':'RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT','sectionType':'null'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")) ){
pzLayout_2();
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
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzRuleSet_SetVersionUpdateFlag");
pega.getUIEngine().getUIAction("refresh", config).register();
}
public void pzLayoutBodyWrapper_2() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_2();
}
tools.putSaveValue("rowClass","");
}


public void pxPassword_1() {String key="11||RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxPassword", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxPassword", "","","","","","TEMPLATE","","",""," cttrue","T","false","0","","","Text","false","11"};oCellRuntimeParamsMap.put("11||RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT",paramValues);oControlPathsMap.put("11||RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");}


public void layoutBody_2() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("TEMPLATE",".pySections(2)") + "  section_index='2'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead RL1","dataLabelWrite RL1"), "",false,"","");labelIncludeInCell_1("","","","",false,"Enter Password To Add/Update Version",false,false,"Standard",false);
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxPassword",".pyVersionFormEditPwd",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead RV1","dataValueWrite RV1"), "",false,"","");tools.putSaveValue("parentLayouttype","");pxPassword_1();
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleSet_VersionEditPwdIncludeBB","",false);
}
public void pzLayout_2() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2|| o2!= rxTOP.pyVersionUpdatePassword cq o2!= rxTOP.pyVersionAddPassword cq","TOP.pyVersionUpdatePassword != \'\' || TOP.pyVersionAddPassword != \'\'", "layout", "visible" )) {pzSetExpandParam_2();
pzLayoutBodyWrapper_2();
}
}
}
public void pzLayoutBodyWrapper_1() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_1();
}
tools.putSaveValue("rowClass","");
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Short","associated",false);
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
		String noValue = "no value";
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclDaysDD_1(String ddWidth, int fwdYrs, int bckYrs, Calendar cal, Calendar todayCal, ClipboardProperty curProp, String defaultLocale,String disabled_ctrl,String dateTimeTooltip) {
			{
		boolean AccessibleWhen = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
		boolean isAccessibleMode = true && AccessibleWhen;
		String propRefName = curProp.getReference().replaceAll("\\.", "").replaceAll("\\(","").replaceAll("\\)","");
				String[] dateFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^Mdy]", false, false);
				for(int i=0;i<dateFormat.length;i++) {
					if(dateFormat[i].toLowerCase().indexOf("m") != -1) {
						String months[] = PRDateFormat.getShortMonths(defaultLocale);if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL)+"' id='"+curProp.getEntryHandle()+"MoSel' name='"+propRefName+"MoSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MoSel'  name='"+propRefName+"MoSel' style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("' ");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString("><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						for(int j=0,l=months.length;j<l;j++){
							tools.appendString("<option value='" + (j+1) +"'");
							if(cal != null && j == cal.get(Calendar.MONTH)) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+months[j]+"</option>");
						}						tools.appendString("</select>");
					} else if(dateFormat[i].toLowerCase().indexOf("d") != -1) {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" + dateTimeTooltip +":"+tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL)+"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel'  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("' ");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString("><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						for(int j=1;j<=31;j++){
							tools.appendString("<option value='" + j +"'");
							if(cal != null && j == cal.get(Calendar.DATE)) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j)+"</option>");
						}
						tools.appendString("</select>");
					} else {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" + dateTimeTooltip +":"+tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL)+"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel'  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("'");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString(" ><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						int start = (cal != null && (cal.get(Calendar.YEAR) < (todayCal.get(Calendar.YEAR)-bckYrs))) ? cal.get(Calendar.YEAR) : todayCal.get(Calendar.YEAR)-bckYrs;
						int end = (cal != null && (cal.get(Calendar.YEAR) > (todayCal.get(Calendar.YEAR)+fwdYrs))) ? cal.get(Calendar.YEAR) : todayCal.get(Calendar.YEAR)+fwdYrs;
						for(int j=start;j<=end;j++){
							tools.appendString("<option value='" + j +"'");
							if(cal != null && j == cal.get(Calendar.YEAR)) {
								tools.appendString(" selected ");
							}
						tools.appendString(">"+com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j)+"</option>");
						}
						tools.appendString("</select>");
					}
				}
			}
}


public void dtlIncludes_1() {
if (pzAuto.doOnlyOnce("pzCalendarPopupScripts")) {
pzAuto.emitIncludeStreamReference("pzDateTimeLocaleScript", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Short","associated",false);
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
		String noValue = "no value";
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
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  ");
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


public void pxDateTime_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){String disabled_ctrl = "";
String iconStyle_ctrl = "inactvIcon";
String iconDisabled_ctrl = "";
String dateTimeTooltip = "";int calNav = 1;	if(pzAuto.isMobile()){
calNav = 0;}
String strType = "";

		dtlIncludes_1();
		if(pzAuto.doOnlyOnce("pzDatePickerAdvancedIncludes")) {IStaticContentRuntime pzStatic_pzDatePickerAdvancedIncludes = pzAuto.getStaticBlock("script");
	pzStatic_pzDatePickerAdvancedIncludes.addBundle("pzDatePickerAdvanced", "11333989227");
pzStatic_pzDatePickerAdvancedIncludes.setMoveToEnd(true);
pzStatic_pzDatePickerAdvancedIncludes.emitContent();

		}
		String dateFormatStr = "	date_4yshort";
		ClipboardPage threadPage = tools.findPage("pxThread");
		ClipboardPage operatorPage = tools.findPage("OperatorID");
		String defaultLocale = "";
		 if(("Developer".equals(threadPage.getStringIfPresent("pxPortal"))) && (operatorPage != null) && ("true".equals(operatorPage.getStringIfPresent(".pyPreferences.pyIgnoreLocale")))){
				 defaultLocale = tools.findPage("pxRequestor").getString(".pxReqLocale");
		}else{
				 defaultLocale = tools.findPage("pxRequestor").getString(".pyUseLocale");
		}
		String[] localeDateFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^Mdy]", false, false);
		int showYearFirst = (localeDateFormat != null && localeDateFormat.length > 0 && localeDateFormat[0].toLowerCase().startsWith("y")) ? 1 : 0;
		String customTimeZoneAttr = "";
		String defaultTimeZone = "GMT";
		ClipboardProperty curProp = tools.getActive();
		 String outerSpanClass = "";
			if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
			 outerSpanClass = " class = 'ErrorShade' ";
			}
		if(!com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)){
			Map defaultInputWidth = new HashMap();
			defaultInputWidth.put("ie",new Float(11.625));
			defaultInputWidth.put("ff",new Float(11.719));
			defaultInputWidth.put("webkit",new Float(12));
			float pyWidth = 100;boolean isTemplate = true;boolean isDynamic = false;
			 if(!isTemplate && !isDynamic ){if(pega_rules_default.BrowserIsIE(tools)) {pyWidth = ((Float)defaultInputWidth.get("ie")).floatValue();}
				 else if(pega_rules_default.BrowserIsFireFox(tools)) {pyWidth = ((Float)defaultInputWidth.get("ff")).floatValue();}
				 else if(pega_uiengine_uiengine.pzBrowserIsSafariOrChrome(tools)) {pyWidth = ((Float)defaultInputWidth.get("webkit")).floatValue();}
			};
			tools.appendString("<span id='"+curProp.getEntryHandle()+"Span' role='group'"+outerSpanClass);	String disabledWeekendVal = null ;

			tools.appendString(" data-calendar='{\"d\":[0,0,0,0],\"l\":"+showYearFirst+" ,\"m\":0, \"calendarNavigation\":" + calNav + " , \"minInterval\":0, \"displayWeekNo\":false, \"disabledWeekends\":" + disabledWeekendVal + " }' style=' width:inherit;' onmouseover='pega.c.DatePicker && pega.c.DatePicker.dtTmHvr(event);' >");
			pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		String inputtype = "text";
		String inputtypem = "text";
		boolean rpzIsMobile = pzAuto.isMobile();	if(rpzIsMobile){

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString("");}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString("");}
tools.appendString("data-autoSeparator = 'true'");

		tools.appendString(" title='"+dateTimeTooltip+"'");
			tools.appendString(" class='inactvDtTmTxt");
		tools.appendString("' "); tools.appendString(disabled_ctrl);

			tools.appendString(" value='"); 
			if(curProp.getMessages().equals("")){
				if(!curProp.getStringValue().equals("")){
					try{
						tools.appendString(PRDateFormat.format(defaultLocale, defaultTimeZone, dateFormatStr, isSecuredProp?(Date)PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()):curProp.toDate()));
					} catch(Exception e) {
						tools.appendCSF(isSecuredProp?PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()).toString():curProp.getStringValue());
					}
				} else {
				}
			} else {
				try{
					if(!curProp.getStringValue().equals("")){
						tools.appendString(PRDateFormat.format(defaultLocale, defaultTimeZone, dateFormatStr, isSecuredProp?(Date)PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()):curProp.toDate()));
					} else {
				}
				} catch(Exception e) {
					tools.appendCSF(isSecuredProp?PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()).toString():curProp.getStringValue());
				}
			}
			tools.appendString("' style='padding-right:17px;'");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType+strType,pegaValidation.toString());
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
		com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
			StringBuffer staticURLStr = new StringBuffer();
			StringBuffer preActParamStr = new StringBuffer();
			StringBuffer preDTParamStr = new StringBuffer();
			String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
			tools.putParamValue("runTimeSecStreamName", "");
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				try{
					pzPackageRuntime.packageSection("pzRuleSet_VersionEditPwdInclude",
					tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
					}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
					}
					refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
					refreshActionRequest.registerFixedParameter("SectionName", "");
					refreshActionRequest.registerFixedParameter("PreActivity", "pzRuleSet_SetVersionUpdateFlag");
					staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
					staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzRuleSet_VersionEditPwdInclude"));
					staticURLStr.append("&PreActivity=pzRuleSet_SetVersionUpdateFlag");
					tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzRuleSet_SetVersionUpdateFlag\", \"");
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
			tools.appendString(" />");							boolean rpyAddNativeSupport = false;
								if(rpzIsMobile && rpyAddNativeSupport){
							}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString("");
			tools.appendString(" style='cursor:pointer;' ");
	tools.appendString("role='button' aria-label='");
			if(curProp.getMessages().equals("")){
				if(!curProp.getStringValue().equals("")){
					try{
			if(activeValue.length() > 0){
		tools.appendString(" Selected date is ");
			}
						tools.appendString(PRDateFormat.format(defaultLocale, defaultTimeZone, dateFormatStr, isSecuredProp?(Date)PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()):curProp.toDate()));
					} catch(Exception e) {
						tools.appendCSF(curProp.getStringValue());
					}
				}
			} else {
				try{
					if(!curProp.getStringValue().equals("")){
						tools.appendString(PRDateFormat.format(defaultLocale, defaultTimeZone, dateFormatStr, isSecuredProp?(Date)PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()):curProp.toDate()));
					}
				} catch(Exception e) {
					tools.appendCSF(isSecuredProp?PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()).toString():curProp.getStringValue());
				}
			}
		tools.appendString(" Date picker");
	tools.appendString("' ");
	tools.appendString(" tabindex='0' ");
			tools.appendString(" />");						}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString("Effective Start Date");
			tools.appendString(" ");
			tools.appendString("' data-calendar='{\"d\":[1,0,0,0],\"l\":"+showYearFirst+",\"m\":0, \"calendarNavigation\":" + calNav +", \"minInterval\":0 , \"displayWeekNo\":false}' style='display:inline-block;'>");
			pega_uiengine_pzcontrol.pzAddMessages(tools,"");
			tools.appendString("<input type='hidden' "+ customTimeZoneAttr +" data-calendar='Calendar' data-ctl='[\"DatePicker\"]' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' value='");
			if(curProp.getMessages().equals("")){
				if(!curProp.getStringValue().equals("")){
					try{
						tools.appendString(PRDateFormat.format(defaultLocale, defaultTimeZone, dateFormatStr, isSecuredProp?(Date)PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()):curProp.toDate()));
					} catch(Exception e) {
						tools.appendCSF(isSecuredProp?PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()).toString():curProp.getStringValue());
					}
				}
			} else {
				try{
					if(!curProp.getStringValue().equals("")){
						tools.appendString(PRDateFormat.format(defaultLocale, defaultTimeZone, dateFormatStr, isSecuredProp?(Date)PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()):curProp.toDate()));
					}
				} catch(Exception e) {
					tools.appendCSF(isSecuredProp?PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()).toString():curProp.getStringValue());
				}
			}
			tools.appendString("' ");
			if(!com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
				pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType+"dd"+strType,pegaValidation.toString());
			} else {
				pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,"Acc"+pyStringType+"dd"+strType,pegaValidation.toString());
			}
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }							{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
								com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
									StringBuffer staticURLStr = new StringBuffer();
									StringBuffer preActParamStr = new StringBuffer();
									StringBuffer preDTParamStr = new StringBuffer();
									String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
									tools.putParamValue("runTimeSecStreamName", "");
									if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
										try{
											pzPackageRuntime.packageSection("pzRuleSet_VersionEditPwdInclude",
											tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
											}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
											}
											refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
											refreshActionRequest.registerFixedParameter("SectionName", "");
											refreshActionRequest.registerFixedParameter("PreActivity", "pzRuleSet_SetVersionUpdateFlag");
											staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
											staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzRuleSet_VersionEditPwdInclude"));
											staticURLStr.append("&PreActivity=pzRuleSet_SetVersionUpdateFlag");
											tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzRuleSet_SetVersionUpdateFlag\", \"");
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
			tools.appendString(" ");													tools.appendString(disabled_ctrl);

			tools.appendString(" />");
			Calendar cal = null;
			if(defaultLocale == null || defaultLocale.equals("")) {
				defaultLocale = tools.findPage("pxRequestor").getString(".pxReqLocale");
			}
			String[] locTokens = defaultLocale.split("_");
			Locale loc = (locTokens.length == 2) ? (new Locale(locTokens[0], locTokens[1])) : (new Locale(locTokens[0]));
			Calendar todayCal = Calendar.getInstance(TimeZone.getTimeZone(defaultTimeZone), loc);
			todayCal.setTime(new Date());
			if(!curProp.getStringValue().equals("") && curProp.hasValidValue()) {
				cal = Calendar.getInstance(TimeZone.getTimeZone(defaultTimeZone), loc);
				todayCal = Calendar.getInstance(TimeZone.getTimeZone(defaultTimeZone), loc);
				cal.setTime(isSecuredProp?(Date)PRStringFormat.pegaToAny(curProp.getType(), activePropValue, null, curProp.getType()):curProp.toDate());
			}
			inclDaysDD_1("auto",10,10,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}													if(true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
														String pyBtnLbl = ".pyButtonLabel";
														String ctrName = "Select";
														tools.appendString("<input type='button' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' name='SB_" + curProp.getEntryHandle() + "' style='width:auto;' onclick='pega.u.d.handleDPDropdowns(event)' />");

			}
			tools.appendString("</span>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");														
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDateTime");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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


	tools.putActive(propActivePrev); 														} catch (Exception e) {

														
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



public void layoutBody_1() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("TEMPLATE",".pySections(1)") + "  section_index='1'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead RL1","dataLabelWrite RL1"), "",false,"","");labelIncludeInCell_1("","","","",false,"Effective Start Date",false,false,"Standard",false);
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxDateTime",".pyRuleSetVersionEffectiveDate",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead RV1","dataValueWrite RV1"), "",false,"","");tools.putSaveValue("parentLayouttype","");pxDateTime_1(".pyRuleSetVersionEffectiveDate",0,"","","Date");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleSet_VersionEditPwdIncludeB","",false);
}
public void pzLayout_1() {
pzSetExpandParam_1();
pzLayoutBodyWrapper_1();
}


private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-RuleSet-Version");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzRuleSet_VersionEditPwdInclude");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_VERSIONEDITPWDINCLUDE #20180713T135703.163 GMT", "Rule-RuleSet-Version pzRuleSet_VersionEditPwdInclude", "Pega-SystemArchitect", "08-01-01", "20180713T135703.163 GMT");
}
