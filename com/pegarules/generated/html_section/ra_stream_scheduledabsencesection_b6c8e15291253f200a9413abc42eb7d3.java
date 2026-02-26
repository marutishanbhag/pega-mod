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
 * Builds JSP stream DATA-ADMIN-OPERATOR-ID!SCHEDULEDABSENCESECTION.
 */
public class ra_stream_scheduledabsencesection_b6c8e15291253f200a9413abc42eb7d3 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.ScheduledAbsenceSection.Data_Admin_Operator_ID.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1300109271;
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
	public ra_stream_scheduledabsencesection_b6c8e15291253f200a9413abc42eb7d3(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "9ccbd916d29a30fbcd8c4296b50c972e56a256a6";
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
/* Instance RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "9ccbd916d29a30fbcd8c4296b50c972e56a256a6";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("ScheduledAbsenceSection",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT */
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
	"Rule-HTML-Section:SCHEDULEDABSENCESECTION", 
	"Rule-Obj-Property:PYUNAVAILABLETO", 
	"Rule-Obj-Property:PYUNAVAILABLEFROM", 
	"Rule-HTML-Property:PXADDLISTITEM", 
	"Rule-HTML-Property:PXDATETIME", 
	"Rule-HTML-Property:PXDELETELISTITEM", 
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
		new DependentRuleInfo("SCHEDULEDABSENCESECTION","Rule-HTML-Section","DATA-ADMIN-OPERATOR-ID",false,"","Pega-SystemArchitect","08-01-01","RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT","!SCHEDULEDABSENCESECTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1300109271), 
		new DependentRuleInfo("PYUNAVAILABLETO","Rule-Obj-Property","EMBED-DATA-ADMIN-UNAVAILABLEPERIOD",true,"Embed-Data-Admin-UnavailablePeriod","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLETO #20180713T131859.052 GMT","!PYUNAVAILABLETO",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYUNAVAILABLEFROM","Rule-Obj-Property","EMBED-DATA-ADMIN-UNAVAILABLEPERIOD",true,"Embed-Data-Admin-UnavailablePeriod","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLEFROM #20180713T131859.048 GMT","!PYUNAVAILABLEFROM",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXADDLISTITEM","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXADDLISTITEM #20180713T133433.426 GMT","PXADDLISTITEM",true,false,"ABSOLUTE_CLASSLESS",-237514687), 
		new DependentRuleInfo("PXDATETIME","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXDATETIME #20190131T183501.543 GMT","PXDATETIME",true,false,"ABSOLUTE_CLASSLESS",1269011618), 
		new DependentRuleInfo("PXDELETELISTITEM","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT","PXDELETELISTITEM",true,false,"ABSOLUTE_CLASSLESS",-991878613), 
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
//	RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT:20180713T135640.975 GMT
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
//	RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLEFROM #20180713T131859.048 GMT:20180713T131859.048 GMT
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
//	RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLETO #20180713T131859.052 GMT:20180713T131859.052 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
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
//	RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLEFROM #20180713T131859.048 GMT:20180713T131859.048 GMT
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
//	RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLETO #20180713T131859.052 GMT:20180713T131859.052 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
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
//	RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLEFROM #20180713T131859.048 GMT:20180713T131859.048 GMT
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
//	RULE-OBJ-PROPERTY EMBED-DATA-ADMIN-UNAVAILABLEPERIOD PYUNAVAILABLETO #20180713T131859.052 GMT:20180713T131859.052 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-HTML-PROPERTY PXADDLISTITEM #20180713T133433.426 GMT:20180713T133433.426 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELINCLUDE #20181206T140519.218 GMT:20181206T140519.218 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONADDROW #20190204T044757.846 GMT:20190204T044757.846 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONDELETEROW--(CLIPBOARDPAG0B11B94B773838E3A9E06E99689ED6C8 #20180915T103511.007 GMT:20180915T103511.007 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEDATEPICKER--(CLIPBOARD131E322B0C47E77F51CFE1BC9DD38DE5 #20230925T171736.195 GMT:20230925T171736.195 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
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
		return "b2f9c36b792c2ab61fbda27591d15b18";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-ID";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("ScheduledAbsenceSection",1,"Rule-HTML-Section","{'type':'Section','ruleName':'ScheduledAbsenceSection','insKey':'RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")) ){
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
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
}
public void pzLayoutBodyWrapper_2() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridCentreLayout_1();layoutBody_1();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void 
labelIncludeInCell_2(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20160112081952096625963") + "  ");
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
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20160112081952096524380") + "  ");
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


public void pxAddListItem_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_31")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='ScheduledAbsenceSection_"+ referenceString+ "_23'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20160112081952096523576") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconInsert' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title = 'Add item"+ " "+repeatIndx+"' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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



public void layoutBody_1() { 
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='3' class = 'gridActionBottom'>" + "<table role='presentation'  section_index='1'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxAddListItem",".pyTemplateInputBox",".pySections(1).pySectionBody(3).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "height:29px;width:182px;",false,"","");tools.putSaveValue("parentLayouttype","ACTION");pxAddListItem_1();
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(3).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignCenter","dataLabelWrite gridActionAlignCenter"), "height:29px;width:186px;",false,"","");labelIncludeInCell_1("","","","",false,"",false,false,"Standard",false);
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(3).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignRight","dataLabelWrite gridActionAlignRight"), "height:29px;width:186px;",false,"","");labelIncludeInCell_2("","","","",false,"",false,false,"Standard",false);
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}


public void pxDeleteListItem_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_30")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='ScheduledAbsenceSection_"+ referenceString+ "_49'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2016011208195209644978") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconDelete' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title = 'Delete item"+ " "+repeatIndx+"' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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

public void repeatingDataCell_9() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:24px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_3();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDateTime_6(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_26")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_28")){String disabled_ctrl = "";
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
			float pyWidth = 100;boolean isTemplate = false;boolean isDynamic = false;
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

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");}
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
			tools.appendString(" />");boolean rpyAddNativeSupport = false;
	if(rpzIsMobile && rpyAddNativeSupport){
}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839-DatePicker") + " ");
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
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString("");
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
			tools.appendString(" ");tools.appendString(disabled_ctrl);

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
			inclDaysDD_2("auto",10,10,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_29")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_8() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDateTime",".pyUnavailableTo", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:24px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDateTime_6(".pyUnavailableTo",0,"","","Date");
									tools.appendString("</DIV>"); } else { pxDateTime_6(".pyUnavailableTo",0,"","","Date");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDateTime_5(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_22")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_23")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")){String disabled_ctrl = "";
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
			float pyWidth = 100;boolean isTemplate = false;boolean isDynamic = false;
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

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");}
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
			tools.appendString(" />");boolean rpyAddNativeSupport = false;
	if(rpzIsMobile && rpyAddNativeSupport){
}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211-DatePicker") + " ");
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
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString("");
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
			tools.appendString(" ");tools.appendString(disabled_ctrl);

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
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_25")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_7() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDateTime",".pyUnavailableFrom", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:26px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDateTime_5(".pyUnavailableFrom",0,"","","Date");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDateTime_5(".pyUnavailableFrom",0,"","","Date");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingHeaderCell_3() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096345695") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUnavailablePeriod1colWidthCache3").equals("")){ tools.appendParamCSF("PpyUnavailablePeriod1colWidthCache3"); } else { tools.appendString("4"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:20px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("&nbsp;");if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='To' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096344913") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUnavailablePeriod1colWidthCache2").equals("")){ tools.appendParamCSF("PpyUnavailablePeriod1colWidthCache2"); } else { tools.appendString("151"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:20px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont wrapHeader '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("To");if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_1() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Unavailable From' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096243860") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:22px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyUnavailablePeriod1colWidthCache1").equals("")){ tools.appendParamCSF("PpyUnavailablePeriod1colWidthCache1"); } else { tools.appendString("150"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:20px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont wrapHeader '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("Unavailable From");if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionScheduledAbsenceSectionB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionScheduledAbsenceSectionB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyUnavailablePeriodL3=null;

 Map selUniqMap_pyUnavailablePeriodL3 = null;
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyUnavailablePeriod");tools.appendString("_ScheduledAbsenceSection_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString("");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyUnavailablePeriod_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='transparent'>");
}


public void gridCentreLayout_1() {/*gridCentreLayout*/
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
pega_rules_utilities.pzRegisterActivity(tools, "pzPerformGridAction");
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pyTargetStream", "pzGridModalHTML");
config.put("gridAction", "SUBMITROW");
config.put("pzActivity", "ShowStream");
pega.getUIEngine().getUIAction("runActivity", config).register();
pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					tools.putSaveValue("bUseMenuInline","false");

					pzGridIncludes_1();

					if(tools.getParamValue("partialRefresh").equals("")){

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyUnavailablePeriod");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyUnavailableFrom .pyUnavailableTo .pyTemplateInputBox  ' class='yui-skin-sam gPXAuto");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					}tools.appendString("' style='");

					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='PpyUnavailablePeriod1' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString("");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "Unavailable period";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyUnavailablePeriod1colWidthGBL\" id=\"PpyUnavailablePeriod1colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUnavailablePeriod1colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyUnavailablePeriod1colWidthGBR\" id=\"PpyUnavailablePeriod1colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyUnavailablePeriod1colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyUnavailablePeriod1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' style='width:");

					 if(!tools.getParamValue("PpyUnavailablePeriod1colWidthGBL").equals("")) { tools.appendParamCSF("PpyUnavailablePeriod1colWidthGBL"); } else { 

					tools.appendString("305.0"); } 

					tools.appendString("px;' cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='Unavailable period' PL_PROP='");

					
tools.appendString(".pyUnavailablePeriod");

					tools.appendString("' PL_PROP_CLASS='Embed-Data-Admin-UnavailablePeriod' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					 repeatingHeaderCell_1(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyUnavailablePeriod").iterator(); 

					
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

					
										 counter++; 

					 rowsDisplayed++; 

					tools.putSaveValue("curRowNum",""+rowsDisplayed );

					
						 tools.putParamValue("expandRL","true");

					
							  if(tools.getActive().indexOf()%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					 
								 if(!bGenerationForOffline) {

					tools.appendString(tools.getSaveValue("rowClass"));  

					}

					tools.appendString(" cellCont' ");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					tools.appendString(" ng-repeat=\"Item in rootData..pyUnavailablePeriod\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
								 }

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("'  PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_7(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_8(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_9(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", "");

					 
								 }

					
						 tools.putParamValue("expandRL","false");

					
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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"3\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-Data-Admin-UnavailablePeriod", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					gridNoRowsMesgIncl_1(); 

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
 tempNoRespg.removeFromClipboard();

					tools.appendString("\n </td></tr>");

					 } } }   

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyUnavailablePeriod1") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					
					 /* GenerateGrid: End */

					}

					public void 
gridEndLayout_1
					() {

					
 tools.getParameterPage().remove("pyReportPageName"); 
tools.appendString("</div></div>");
}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</td></tr></table>");
}
public void pzLayout_1() {
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_2();
 LayoutWrapperTableEnd_1(); tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxDeleteListItem_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='ScheduledAbsenceSection_"+ referenceString+ "_49'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2016011208195209644978") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconDelete' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title = 'Delete item"+ " "+repeatIndx+"' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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

public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:24px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_2();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDateTime_4(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){String disabled_ctrl = "";
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
			float pyWidth = 100;boolean isTemplate = false;boolean isDynamic = false;
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

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");}
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
			tools.appendString(" />");boolean rpyAddNativeSupport = false;
	if(rpzIsMobile && rpyAddNativeSupport){
}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839-DatePicker") + " ");
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
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString("");
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
			tools.appendString(" ");tools.appendString(disabled_ctrl);

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
			inclDaysDD_2("auto",10,10,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDateTime",".pyUnavailableTo", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:24px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDateTime_4(".pyUnavailableTo",0,"","","Date");
									tools.appendString("</DIV>"); } else { pxDateTime_4(".pyUnavailableTo",0,"","","Date");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDateTime_3(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){String disabled_ctrl = "";
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
			float pyWidth = 100;boolean isTemplate = false;boolean isDynamic = false;
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

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");}
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
			tools.appendString(" />");boolean rpyAddNativeSupport = false;
	if(rpzIsMobile && rpyAddNativeSupport){
}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211-DatePicker") + " ");
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
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString("");
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
			tools.appendString(" ");tools.appendString(disabled_ctrl);

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
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDateTime",".pyUnavailableFrom", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:26px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDateTime_3(".pyUnavailableFrom",0,"","","Date");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDateTime_3(".pyUnavailableFrom",0,"","","Date");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDeleteListItem_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='ScheduledAbsenceSection_"+ referenceString+ "_49'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2016011208195209644978") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconDelete' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title = 'Delete item"+ " "+repeatIndx+"' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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

public void repeatingDataCell_3() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:24px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_1();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void inclDaysDD_2(String ddWidth, int fwdYrs, int bckYrs, Calendar cal, Calendar todayCal, ClipboardProperty curProp, String defaultLocale,String disabled_ctrl,String dateTimeTooltip) {
			{
		boolean AccessibleWhen = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
		boolean isAccessibleMode = false && AccessibleWhen;
		String propRefName = curProp.getReference().replaceAll("\\.", "").replaceAll("\\(","").replaceAll("\\)","");
				String[] dateFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^Mdy]", false, false);
				for(int i=0;i<dateFormat.length;i++) {
					if(dateFormat[i].toLowerCase().indexOf("m") != -1) {
						String months[] = PRDateFormat.getShortMonths(defaultLocale);if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL)+"' id='"+curProp.getEntryHandle()+"MoSel' name='"+propRefName+"MoSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MoSel'  " + pzCell.getTestIdIfEnabled("20160112081952096448839-Month") + "  name='"+propRefName+"MoSel' style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel'  " + pzCell.getTestIdIfEnabled("20160112081952096448839-Day") + "  style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel'  " + pzCell.getTestIdIfEnabled("20160112081952096448839-Year") + "  style='margin:1px;width:");}
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


public void pxDateTime_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){String disabled_ctrl = "";
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
			float pyWidth = 100;boolean isTemplate = false;boolean isDynamic = false;
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

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");}
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
			tools.appendString(" />");boolean rpyAddNativeSupport = false;
	if(rpzIsMobile && rpyAddNativeSupport){
}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096448839-DatePicker") + " ");
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
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString("");
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
			tools.appendString(" ");tools.appendString(disabled_ctrl);

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
			inclDaysDD_2("auto",10,10,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20160112081952096448839") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDateTime",".pyUnavailableTo", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:24px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDateTime_2(".pyUnavailableTo",0,"","","Date");
									tools.appendString("</DIV>"); } else { pxDateTime_2(".pyUnavailableTo",0,"","","Date");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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
		boolean isAccessibleMode = false && AccessibleWhen;
		String propRefName = curProp.getReference().replaceAll("\\.", "").replaceAll("\\(","").replaceAll("\\)","");
				String[] dateFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^Mdy]", false, false);
				for(int i=0;i<dateFormat.length;i++) {
					if(dateFormat[i].toLowerCase().indexOf("m") != -1) {
						String months[] = PRDateFormat.getShortMonths(defaultLocale);if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL)+"' id='"+curProp.getEntryHandle()+"MoSel' name='"+propRefName+"MoSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MoSel'  " + pzCell.getTestIdIfEnabled("20160112081952096447211-Month") + "  name='"+propRefName+"MoSel' style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel'  " + pzCell.getTestIdIfEnabled("20160112081952096447211-Day") + "  style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel'  " + pzCell.getTestIdIfEnabled("20160112081952096447211-Year") + "  style='margin:1px;width:");}
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
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
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){String disabled_ctrl = "";
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
			float pyWidth = 100;boolean isTemplate = false;boolean isDynamic = false;
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

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");}
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
			tools.appendString(" />");boolean rpyAddNativeSupport = false;
	if(rpzIsMobile && rpyAddNativeSupport){
}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("20160112081952096447211-DatePicker") + " ");
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
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString("");
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
			tools.appendString(" ");tools.appendString(disabled_ctrl);

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
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20160112081952096447211") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	tools.putActive(propActivePrev); 	} catch (Exception e) {

	
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'	&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDateTime",".pyUnavailableFrom", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:26px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDateTime_1(".pyUnavailableFrom",0,"","","Date");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDateTime_1(".pyUnavailableFrom",0,"","","Date");}
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


public void pyUnavailablePeriod_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString(",");
		tools.appendString(",\"up\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString(",");
		tools.appendString(",\"down\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

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

					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUnavailablePeriod1")|| tools.getParamValue("partialTrigger").equals("editRow.pyUnavailablePeriod1") ){

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

					ClipboardProperty pageListProp = tools.getProperty(".pyUnavailablePeriod");

					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(tools.getParamValue("strIndexInList")));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					if(tools.getParamValue("EditRow").equals("false") && pagePropInList.getPageValue().hasMessages()){ tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					tools.putParamValue("strIndexInList", pageListProp.size());

					}

					
						 tools.putParamValue("expandRL","false"); 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
						 tools.putParamValue("expandRL","true");

					
							  if(tools.getActive().indexOf()%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUnavailablePeriod\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("'  PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_2(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_3(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					
									  pega.popStackFrame(frame_3, false); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyUnavailablePeriod1")) {

					
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

					
		 pageListProp = tools.getProperty(".pyUnavailablePeriod");

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyUnavailablePeriod1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(".pyUnavailablePeriod");

					
					String strIndex1 = tools.getParamValue("lastRowToRetrieve");

					
					if("".equals(strIndex1) || Integer.parseInt(strIndex1) > pageListProp.size())

					
					strIndex1 = tools.getParamValue("strIndexInList");

					
					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(strIndex1));

					
					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					
					if(tools.getParamValue("EditRow").equals("false") && pagePropInList.getPageValue().hasMessages()){ tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					
					tools.putParamValue("strIndexInList", pageListProp.size());

					
					}

					
					
						 tools.putParamValue("expandRL","false"); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
					
						 tools.putParamValue("expandRL","true");

					
					
							  if(tools.getActive().indexOf()%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyUnavailablePeriod\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("'  PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					

					
					 repeatingDataCell_4(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_5(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_6(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					 /* GenerateGrid: End */

					
					}
private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Data-Admin-Operator-ID");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "ScheduledAbsenceSection");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION DATA-ADMIN-OPERATOR-ID SCHEDULEDABSENCESECTION #20180713T135640.975 GMT", "Data-Admin-Operator-ID ScheduledAbsenceSection", "Pega-SystemArchitect", "08-01-01", "20180713T135640.975 GMT");
}
