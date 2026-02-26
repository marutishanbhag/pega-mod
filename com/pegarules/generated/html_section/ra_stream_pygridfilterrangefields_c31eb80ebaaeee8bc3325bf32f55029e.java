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
 * Builds JSP stream PEGA-COLUMNFILTERCRITERIA!PYGRIDFILTERRANGEFIELDS.
 */
public class ra_stream_pygridfilterrangefields_c31eb80ebaaeee8bc3325bf32f55029e extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pyGridFilterRangeFields.Pega_ColumnFilterCriteria.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1061598509;
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
	public ra_stream_pygridfilterrangefields_c31eb80ebaaeee8bc3325bf32f55029e(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "38ffc4ac51fa18aa9b47e221e5f1968e15001c5f";
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
/* Instance RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "38ffc4ac51fa18aa9b47e221e5f1968e15001c5f";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pyGridFilterRangeFields",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT */
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
	"Rule-HTML-Section:PYGRIDFILTERRANGEFIELDS", 
	"Rule-Obj-Property:PYENDDECIMAL", 
	"Rule-Obj-Property:PYENDDATE", 
	"Rule-Obj-Property:PYSTARTDATE", 
	"Rule-Obj-Property:PYENDDOUBLE", 
	"Rule-Obj-Property:PYENDDATETIME", 
	"Rule-Obj-Property:PYSTARTINTEGER", 
	"Rule-Obj-Property:PYDISPLAYTIMEPERIOD", 
	"Rule-Obj-Property:PYSTARTDATETIME", 
	"Rule-Obj-Property:PYSTARTDECIMAL", 
	"Rule-Obj-Property:PYSTARTDOUBLE", 
	"Rule-Obj-Property:PYENDINTEGER", 
	"Rule-Obj-Property:PYSEARCHTEXT", 
	"Rule-HTML-Property:PXDROPDOWN", 
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
		new DependentRuleInfo("PYGRIDFILTERRANGEFIELDS","Rule-HTML-Section","PEGA-COLUMNFILTERCRITERIA",false,"","Pega-Gadgets","08-01-01","RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT","!PYGRIDFILTERRANGEFIELDS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1061598509), 
		new DependentRuleInfo("PYENDDECIMAL","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDECIMAL #20180713T133405.778 GMT","!PYENDDECIMAL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYENDDATE","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDATE #20180713T133405.756 GMT","!PYENDDATE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSTARTDATE","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDATE #20180713T133405.844 GMT","!PYSTARTDATE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYENDDOUBLE","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDOUBLE #20180713T133405.785 GMT","!PYENDDOUBLE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYENDDATETIME","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDATETIME #20180713T133405.765 GMT","!PYENDDATETIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSTARTINTEGER","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTINTEGER #20180713T133405.890 GMT","!PYSTARTINTEGER",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYDISPLAYTIMEPERIOD","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYDISPLAYTIMEPERIOD #20180713T133405.750 GMT","!PYDISPLAYTIMEPERIOD",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSTARTDATETIME","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDATETIME #20180713T133405.862 GMT","!PYSTARTDATETIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSTARTDECIMAL","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDECIMAL #20180713T133405.867 GMT","!PYSTARTDECIMAL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSTARTDOUBLE","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDOUBLE #20180713T133405.877 GMT","!PYSTARTDOUBLE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYENDINTEGER","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDINTEGER #20180713T133405.795 GMT","!PYENDINTEGER",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSEARCHTEXT","Rule-Obj-Property","PEGA-COLUMNFILTERCRITERIA",true,"Pega-ColumnFilterCriteria","Pega-Gadgets","08-01-01","RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSEARCHTEXT #20180713T133405.833 GMT","!PYSEARCHTEXT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXDROPDOWN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT","PXDROPDOWN",true,false,"ABSOLUTE_CLASSLESS",1414051726), 
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
//	RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT:20180713T133450.844 GMT
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
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDATE #20180713T133405.844 GMT:20180713T133405.844 GMT
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
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDATE #20180713T133405.756 GMT:20180713T133405.756 GMT
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
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDATETIME #20180713T133405.862 GMT:20180713T133405.862 GMT
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
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDATETIME #20180713T133405.765 GMT:20180713T133405.765 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDECIMAL #20180713T133405.867 GMT:20180713T133405.867 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDECIMAL #20180713T133405.778 GMT:20180713T133405.778 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTDOUBLE #20180713T133405.877 GMT:20180713T133405.877 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDDOUBLE #20180713T133405.785 GMT:20180713T133405.785 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSTARTINTEGER #20180713T133405.890 GMT:20180713T133405.890 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYENDINTEGER #20180713T133405.795 GMT:20180713T133405.795 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYSEARCHTEXT #20180713T133405.833 GMT:20180713T133405.833 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY PEGA-COLUMNFILTERCRITERIA PYDISPLAYTIMEPERIOD #20180713T133405.750 GMT:20180713T133405.750 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_3(
//	simpleLayout_1(
//	simpleLayout_2(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDPARAMETERPAGE #20180713T133344.777 GMT:20180713T133344.777 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEDATEPICKER--(CLIPBOARD131E322B0C47E77F51CFE1BC9DD38DE5 #20230925T171736.195 GMT:20230925T171736.195 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEDROPDOWN #20230618T001619.478 GMT:20230618T001619.478 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPAGECLASS #20190222T143815.273 GMT:20190222T143815.273 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION UTILITIES PZVALIDATEFIELDVALUEREFERENCE #20231004T060003.271 GMT:20231004T060003.271 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "1eaacb959c9c10a3ecaab0ef5a6adc68";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-ColumnFilterCriteria";
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
  pzSection.beginSection("pyGridFilterRangeFields",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pyGridFilterRangeFields','insKey':'RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT','sectionType':'standard'}");
pzLayout_1();
pzLayout_2();
pzLayout_3();
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
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_3() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='3' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void inclFormattedVal_4(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", isSecuredProp);tools.putParamValue("proSecurity_activePropValue", activePropValue);}
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_DisplayTimePeriod","","","D_DisplayTimePeriod","pyFieldName","pyColumnName",true,(PegaStreamAPI)tools),false,"","",true,"caption"));
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_DisplayTimePeriod","","","D_DisplayTimePeriod","pyFieldName","pyColumnName",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_DisplayTimePeriod","","","D_DisplayTimePeriod","pyFieldName","pyColumnName",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", "");tools.putParamValue("proSecurity_activePropValue", "");}
}


public void drodownButtonIncludes_1() {
if (pzAuto.doOnlyOnce("pzDropdown")) {
pzAuto.emitIncludeStreamReference("pzDropdownButtonIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public void inclFormattedVal_3(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools)),false,"","",true,"caption"));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_53")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_54")){
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181105470548131456",true));
	cellPage.put("pyValue",".pyDisplayTimePeriod");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyDisplayTimePeriod");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyDisplayTimePeriod", ".pyCaption");
	modePage1.put("pyHasNoSelection","false");
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyDisplayTimePeriod",pxUniqueStreamHash+"_55");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_55");
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	modePage1.put("pyID","pyDisplayTimePeriod");
	modePage1.put("pyControlLoadMode","auto");
	modePage1.put("pyEnableGrouping","true");
	modePage1.put("pyGroupOrder","asc");
	Map<String, Object> listProperties = new HashMap<String, Object>();
	if(listProperties.containsKey("pyFieldName")){
	Set<String> currentPropFieldNames = (Set<String>)listProperties.get("pyFieldName");
	currentPropFieldNames.add("pyCaption");
	listProperties.put("pyFieldName",currentPropFieldNames);
	}else{
	Set<String> fieldNames = new HashSet<String>();
	fieldNames.add("pyCaption");
	listProperties.put("pyFieldName",fieldNames);
	}
	if(listProperties.containsKey("pyColumnName")){
	Set<String> currentPropFieldNames = (Set<String>)listProperties.get("pyColumnName");
	listProperties.put("pyColumnName",currentPropFieldNames);
	}else{
	Set<String> fieldNames = new HashSet<String>();
	listProperties.put("pyColumnName",fieldNames);
	}
	if(listProperties.containsKey("pyFieldName")){
	Set<String> currentPropFieldNames = (Set<String>)listProperties.get("pyFieldName");
	currentPropFieldNames.add("pyTooltip");
	listProperties.put("pyFieldName",currentPropFieldNames);
	}else{
	Set<String> fieldNames = new HashSet<String>();
	fieldNames.add("pyTooltip");
	listProperties.put("pyFieldName",fieldNames);
	}
	if(listProperties.containsKey("pyColumnType")){
	Set<String> currentPropFieldNames = (Set<String>)listProperties.get("pyColumnType");
	currentPropFieldNames.add("pyCaption");
	listProperties.put("pyColumnType",currentPropFieldNames);
	}else{
	Set<String> fieldNames = new HashSet<String>();
	fieldNames.add("pyCaption");
	listProperties.put("pyColumnType",fieldNames);
	}
	modePage1.put("pyResultsUniqueID",pxUniqueStreamHash+"_56");
	Map<String, String> sourceDPParams = new HashMap<String, String>();
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
	tools.findPage("D_DisplayTimePeriod");
	}
	tools.putParamValue("bListOptionsLocalize","true");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadDataPage("D_DisplayTimePeriod", listProperties, pxUniqueStreamHash+"_56", sourceDPParams);
	tools.putParamValue("bListOptionsLocalize","");
	IUIComponentMetadata pyDataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pyListDataSource = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pyDataPageParams = null;  
	pyListDataSource.putMetadata("pyDataPage",pyDataPage);
	modePage1.putMetadata("pyListDataSource",pyListDataSource);
	String pageName = "D_DisplayTimePeriod";
	String dataPageName = "D_DisplayTimePeriod";
	if(tools.findPage("D_DisplayTimePeriod") != null){
	pageName = tools.findPage("D_DisplayTimePeriod").getReference();
	}
	modePage1.put("pySourceName",dataPageName);
	modePage1.put("pyHashedDataPage",pageName);
	pageName = "D_DisplayTimePeriod";
	modePage1.put("tooltip","pyFieldName");
	modePage1.put("pyGroupLabel","pyColumnType");
	modePage1.put("pyValue","pyColumnName");
	modePage1.put("pyPrompt","pyFieldName");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	modePage1.put("pySpecifySize","custom");
	modePage1.put("pyWidth","196");
	modePage1.put("pyWidthUnits","px");
	modePage1.put("styleOther","standard");
	String spxUniqueStreamHash57 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash57 != null && !"".equals(spxUniqueStreamHash57)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash57,pxUniqueStreamHash+"_57");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_57");
	}
	modePage2.put("pySourceName","D_DisplayTimePeriod");
	modePage2.put("pyPrompt","pyFieldName");
	modePage2.put("pyValue","pyColumnName");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181105470548131456",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyDisplayTimePeriod");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyDisplayTimePeriod", ".pyCaption");
	pyValueR = ".pyDisplayTimePeriod";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyDisplayTimePeriod");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyDisplayTimePeriod", ".pyCaption");
	pyValueOrig = ".pyDisplayTimePeriod";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","caption");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","none");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyShowValueAs","");
	String spxUniqueStreamHash58 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash58 != null && !"".equals(spxUniqueStreamHash58)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash58,pxUniqueStreamHash+"_58");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_58");
	}
	
			 Boolean pyUseAccessibleDropdown = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
	modePage1.put("pyUseAccessibleDropdown",pyUseAccessibleDropdown+"");
	modePage1.put("hasChangeEvent","false");
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
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_59");}if(beginNonTemplate){			HashStringMap params = new HashStringMap();
			String pageName ="D_DisplayTimePeriod";
			if(pageName.indexOf(".")==0) {
			
	pageName = tools.getStepPage().getName()+pageName;
			}
			if(null!=tools.findPage(pageName) && tools.findPage(pageName).getClassName().equals("Code-Pega-List")) {
				cbpResults =  tools.getProperty(pageName+".pxResults");
			} else {
				cbpResults =  tools.getProperty(pageName);
				if(cbpResults == null || (cbpResults != null && cbpResults.size() <= 0)) {
					try{
						cbpResults =  tools.getProperty(pageName+".pxResults");
					}catch(Exception e){}
				}
			}
			pega_rulesengine_utilities.pxSortPageList(cbpResults,"pyColumnType","asc");

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);			String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
			String displayString ="";
			String valueString ="";
			String selected ="";
			String groupbyString ="";
			boolean isAccessible = false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
			if(!isAccessible) {
				tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
				tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181105470548131456") + " ");
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
			if(isAccessible) {
				tools.appendString(" value='");
				if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
					String pyValueProp = "pyColumnName";
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
			tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181105470548131456") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		}
		tools.appendString(" style='width:196px' >");
		if (cbpResults != null && cbpResults.size() > 0) {
			int iListSize = cbpResults.size();
			String groupPropValue = "";
			String groupPropLocValue = "";
			boolean openedOptTag = false;
			java.util.Iterator resIter = cbpResults.iterator();
			while(resIter.hasNext()) {
				ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
				displayString = cbpRow.getStringIfPresent("pyFieldName");
				valueString = cbpRow.getStringIfPresent("pyColumnName");
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
			if(!groupPropValue.equals(cbpRow.getString("pyColumnType"))) {
				groupPropValue = cbpRow.getString("pyColumnType");
					groupPropLocValue = groupPropValue;
					groupPropLocValue = tools.getLocalizedTextForString(".pyCaption",groupPropLocValue,StreamBuilder.FMT_LITERAL);
					if(openedOptTag) {
					tools.appendString("</optgroup>");
					}
					tools.appendString("<optgroup label='" + groupPropLocValue + "'>");
					openedOptTag = true;
				}
				displayString = tools.getLocalizedTextForString(".pyCaption",displayString ,StreamBuilder.FMT_LITERAL);
				pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
				if("".equals(displayString))
					displayString = valueString ;
				selected = (valueString.equals(strValue)) ? "selected " : ""; 
				tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\"");
				String titleString = cbpRow.getString("pyFieldName");
				titleString = tools.getLocalizedTextForString(".pyTooltip",titleString ,StreamBuilder.FMT_LITERAL);
			tools.appendString(" title='" + StringUtils.crossScriptingFilter(titleString) + "'>" + StringUtils.crossScriptingFilter(displayString) + "</option>");
			}
			if(openedOptTag) {
			tools.appendString("</optgroup>");
			}
		}
		tools.appendString("</select >");
		if(isAccessible) {
			String pyBtnLbl = ".pyButtonLabel";
			String ctrName = "Select";
			tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
			drodownButtonIncludes_1();
		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}	}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");	
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201411181105470548131456") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_60")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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



public int simpleLayoutCell_12( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDropdown",".pyDisplayTimePeriod",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181105470548131456-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyDisplayTimePeriod"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181105470548131456-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyDisplayTimePeriod"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDropdown_1(".pyDisplayTimePeriod",0,"","","Text");
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_12( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181105470548131456-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDropdown");
	pgCells.put("forLabel",".pyDisplayTimePeriod");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDropdown",".pyDisplayTimePeriod",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDropdown_1(".pyDisplayTimePeriod",0,"","","Text");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpyGridFilterRangeFieldsBBB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash52 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash52 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash52 != null && !"".equals(spxUniqueStreamHash52)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash52,pxUniqueStreamHash+"_52");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201805240504200705327") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash52 != null && !"".equals(spxUniqueStreamHash52)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_52");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_12(index);
	}else{
		index=simpleLayoutTemplateCell_12(index);
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
	String paramName = "EXPANDEDSubSectionpyGridFilterRangeFieldsBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","3");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2== pxparam.inputType cqSymbolic", pxUniqueStreamHash+"_63");IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_63");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_3();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== pxparam.inputType cqSymbolic","param.inputType == \'Symbolic\'", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_3();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_2() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxTextInput_7() {String key="12||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","12"};oCellRuntimeParamsMap.put("12||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",paramValues);oControlPathsMap.put("12||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}


public int simpleLayoutCell_11( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2== pxparam.pyColumnType cqText","param.pyColumnType==\'Text\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pySearchText",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181100280377101613-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pySearchText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","SearchText") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181100280377101613-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pySearchText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","SearchText") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_7();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_11( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181100280377101613-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pySearchText");
	pgCells.put("pyAutoHTML","true");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2== pxparam.pyColumnType cqText",pxUniqueStreamHash+"_50");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_50");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.pyColumnType=='Text'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_50");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2== pxparam.pyColumnType cqText", pxUniqueStreamHash+"_50"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pySearchText",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_7();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "SearchText";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpyGridFilterRangeFieldsBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash48 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash48 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash48 != null && !"".equals(spxUniqueStreamHash48)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash48,pxUniqueStreamHash+"_48");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201805240504200705642") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash48 != null && !"".equals(spxUniqueStreamHash48)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_48");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_11(index);
	}else{
		index=simpleLayoutTemplateCell_11(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
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
	String paramName = "EXPANDEDSubSectionpyGridFilterRangeFieldsBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2== pxparam.inputType cqSearch o2!= pxparam.pyColumnActDataType cqTrueFalse", pxUniqueStreamHash+"_51");IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_51");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_2();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqSearch o2!= pxparam.pyColumnActDataType cqTrueFalse","param.inputType == \'Search\' && param.pyColumnActDataType != \'TrueFalse\'", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_2();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_1() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxTextInput_6() {String key="10||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","N","false","0","","","Integer","true","10"};oCellRuntimeParamsMap.put("10||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",paramValues);oControlPathsMap.put("10||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(10)");}


public void pxTextInput_5() {String key="9||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","N","false","0","","","Integer","true","9"};oCellRuntimeParamsMap.put("9||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",paramValues);oControlPathsMap.put("9||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(9)");}


public void pxTextInput_4() {String key="8||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","E","false","0","","","Double","true","8"};oCellRuntimeParamsMap.put("8||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",paramValues);oControlPathsMap.put("8||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(8)");}


public void pxTextInput_3() {String key="7||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","E","false","0","","","Double","true","7"};oCellRuntimeParamsMap.put("7||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",paramValues);oControlPathsMap.put("7||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(7)");}


public void pxTextInput_2() {String key="6||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","R","false","0","","","Decimal","true","6"};oCellRuntimeParamsMap.put("6||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",paramValues);oControlPathsMap.put("6||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(6)");}


public void pxTextInput_1() {String key="5||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","R","false","0","","","Decimal","true","5"};oCellRuntimeParamsMap.put("5||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",paramValues);oControlPathsMap.put("5||RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)");}
public void inclTimeDD_2(String ddWidth, Calendar cal, ClipboardProperty curProp, String defaultLocale,String disabled_ctrl,String dateTimeTooltip) {
			{
		boolean AccessibleWhen = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
		boolean isAccessibleMode = false && AccessibleWhen;
		String propRefName = curProp.getReference().replaceAll("\\.", "").replaceAll("\\(","").replaceAll("\\)","");
				boolean setAmDefault = true;
				setAmDefault = false;
				String[] timeFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^mhHa]", false, true);
				for(int i=0;i<timeFormat.length;i++) {
					if(timeFormat[i].indexOf("m") != -1) {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","Minute",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MiSel' name='"+propRefName+"MiSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Minute",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MiSel' name='"+propRefName+"MiSel'  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Minute") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("' ");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Minute",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString(" ><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						String minute = "";
						int zMinute = 0;
							String zerominute = com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null,zMinute);
						for(int j=0;j<=59;j+=1){
							minute = com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j);
							tools.appendString("<option value='" + j +"'");
							if(cal != null && j == cal.get(Calendar.MINUTE)) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+(j<10?(zerominute+minute):minute)+"</option>");
						}
						tools.appendString("</select>");
					} else if(timeFormat[i].indexOf("h") != -1) {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel'  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Hour") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("'");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString("><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						for(int j=1;j<=12;j++){
							tools.appendString("<option value='" + j +"'");
							if(cal != null && (j == cal.get(Calendar.HOUR) || (j - 12) == cal.get(Calendar.HOUR))) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j)+"</option>");
						}
						tools.appendString("</select>");
					} else if(timeFormat[i].indexOf("H") != -1) {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel'  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Hour") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("'");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString(" ><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						for(int j=0;j<=23;j++){
							tools.appendString("<option value='" + j +"'");
							if(cal != null && j == cal.get(Calendar.HOUR_OF_DAY)) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j)+"</option>");
						}
						tools.appendString("</select>");
					} else if(timeFormat[i].indexOf("a") != -1) {
						String ampm[] = PRDateFormat.getAmPmStrings(defaultLocale);if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" + dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","AM or PM",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"ApSel' name='"+propRefName+"ApSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","AM or PM",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"ApSel' name='"+propRefName+"ApSel'  " + pzCell.getTestIdIfEnabled("201411181040470816801140-AMPM") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("' ");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","AM or PM",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString(" ><option value =''");
						if(cal == null && !setAmDefault) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						tools.appendString("<option value ='");
						tools.appendString(ampm[0]+"'");
						if((cal != null && cal.get(Calendar.AM_PM) == Calendar.AM) ||  (cal == null && setAmDefault)) {
							tools.appendString(" selected ");
						}
						tools.appendString(">"+ampm[0]+"</option>");
						tools.appendString("<option value ='");
						tools.appendString(ampm[1]+"'");
						if(cal != null && cal.get(Calendar.AM_PM) == Calendar.PM) {
							tools.appendString(" selected ");
							}
						tools.appendString(">"+ampm[1]+"</option>");
						tools.appendString("</select>");
					}
				}
			}
}
public void inclDaysDD_4(String ddWidth, int fwdYrs, int bckYrs, Calendar cal, Calendar todayCal, ClipboardProperty curProp, String defaultLocale,String disabled_ctrl,String dateTimeTooltip) {
			{
		boolean AccessibleWhen = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
		boolean isAccessibleMode = false && AccessibleWhen;
		String propRefName = curProp.getReference().replaceAll("\\.", "").replaceAll("\\(","").replaceAll("\\)","");
				String[] dateFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^Mdy]", false, false);
				for(int i=0;i<dateFormat.length;i++) {
					if(dateFormat[i].toLowerCase().indexOf("m") != -1) {
						String months[] = PRDateFormat.getShortMonths(defaultLocale);if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL)+"' id='"+curProp.getEntryHandle()+"MoSel' name='"+propRefName+"MoSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MoSel'  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Month") + "  name='"+propRefName+"MoSel' style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel'  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Day") + "  style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel'  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Year") + "  style='margin:1px;width:");}
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_28")){
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181040470816801140",true));
	modePage1.put("pyDateTime","dateTime");
	modePage1.put("pyFutureNumber","100");
	modePage1.put("pyPastNumber","100");
	modePage1.put("pyCalendarNavigation","1");
	cellPage.put("pyValue",".pyEndDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyEndDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyEndDateTime", ".pyCaption");
	String pyLabelFor = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyCaption","To\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("To", ".pyCaption");
	}
	pyLabelFor = "To";
	modePage1.put("pyLabelFor",pyLabelFor);
	cellPage.put("pyID","pyEndDateTime");
	modePage1.put("pyWidth","width:196px;");
	modePage1.put("pySpanWidth","width:196px;");
	String stringType = pyStringType;
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, stringType,pegaValidation.toString());
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	if(!"".equals(pyOnInput)) {
	modePage1.put("editInputAttrs",pyOnInput);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyEndDateTime",pxUniqueStreamHash+"_29");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_29");
	String pyHelperTextType = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyHelperTextType","none\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("none", ".pyHelperTextType");
	}
	pyHelperTextType = "none";
	modePage1.put("helpertype",pyHelperTextType);
	String spxUniqueStreamHash30 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash30 != null && !"".equals(spxUniqueStreamHash30)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash30,pxUniqueStreamHash+"_30");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_30");
	}
	
			 Boolean bUseAccessibleDate = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
	modePage1.put("useAccessibleDate",bUseAccessibleDate+"");
	modePage1.put("hasChangeEvent","false");
	modePage1.put("confirmationButtonLabel",tools.getLocalizedTextForString("pyButtonLabel","Select",StreamBuilder.FMT_LITERAL));
	modePage1.put("pyDisplayMode","calendar");
	modePage1.put("pyIgnoreLocaleSettings","false");
	modePage1.put("pyAddNativeSupport","false");
	modePage1.put("pyAllowTextEntry","true");
	boolean isMobile = pzAuto.isMobile();
	modePage1.put("pyIsMobile",isMobile+"");
	modePage1.put("pySetAMDefault","false");
	modePage1.put("pyDisplayLongFormat","false");
	modePage1.put("pyAllowMinuteInterval","false");
	modePage1.put("pyMinuteInterval","0");
	modePage1.put("pyDisplayWeekNumber","false");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181040470816801140",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyEndDateTime");
	pyValueR = ".pyEndDateTime";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyEndDateTime");
	pyValueOrig = ".pyEndDateTime";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","associated");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","datetime");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateTimeFormat","DateTime-Short");
	modePage2.put("pyDateTimeHourFormat","false");
	tools.putParamValue("forDateTimeFormatTemplate","true");
	tools.putParamValue("pyFormatType","datetime");
	pega_uiengine_formatter.pxFormatDateTime("20150821T065508.000 GMT","DateTime-Short", "datetime",true);
	String requestorLocale = null;
	if(tools.findPage("pxRequestor")!=null){
	requestorLocale = tools.findPage("pxRequestor").getString(".pxReqLocale");
	}
	String dateFormatForTemplate = tools.getParamValue("PRDateFormatCodeforTemplate");
	if("".equals(dateFormatForTemplate)) {
		dateFormatForTemplate = PRDateFormat.DEFAULT_DATE_MEDIUM;
	}
	String pyCustDateTime = PRDateFormat.getFormatPattern(requestorLocale, dateFormatForTemplate);
	modePage2.put("pyCustDateTime",pyCustDateTime);
	tools.putParamValue("forDateTimeFormatTemplate","false");
	tools.putParamValue("PRDateFormatCodeforTemplate","");
	tools.putParamValue("pyFormatType","");
	String spxUniqueStreamHash31 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash31 != null && !"".equals(spxUniqueStreamHash31)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash31,pxUniqueStreamHash+"_31");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_31");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addDependentScripts("pzpega_ui_template_datetime.js","pzpega_control_datePicker.js");
	ctrlComponent.addAdditionalScripts("pzDateCommonInclude","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_spinner.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.beginComponent("pxDateTime",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
		String disabled_ctrl = "";
		String iconStyle_ctrl = "inactvIcon";
		String iconDisabled_ctrl = "";
String dateTimeTooltip = "";int calNav = 1;			if(pzAuto.isMobile()){
calNav = 0;		}
		String strType = "";

		dtlIncludes_1();
		if(pzAuto.doOnlyOnce("pzDatePickerAdvancedIncludes")) {IStaticContentRuntime pzStatic_pzDatePickerAdvancedIncludes = pzAuto.getStaticBlock("script");
	pzStatic_pzDatePickerAdvancedIncludes.addBundle("pzDatePickerAdvanced", "11333989227");
pzStatic_pzDatePickerAdvancedIncludes.setMoveToEnd(true);
pzStatic_pzDatePickerAdvancedIncludes.emitContent();

		}
		String dateFormatStr = "	datetime_4yshort";
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
		String defaultTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");
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
			float pyWidth = 196;boolean isTemplate = false;boolean isDynamic = true;
			tools.appendString("<span id='"+curProp.getEntryHandle()+"Span' role='group'"+outerSpanClass);			String disabledWeekendVal = null ;

			tools.appendString(" data-calendar='{\"d\":[0,1,100,100],\"l\":"+showYearFirst+" ,\"m\":0, \"calendarNavigation\":" + calNav + " , \"minInterval\":0, \"displayWeekNo\":false, \"disabledWeekends\":" + disabledWeekendVal + " }' style='width:196px;' onmouseover='pega.c.DatePicker && pega.c.DatePicker.dtTmHvr(event);' >");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		String inputtype = "text";
		String inputtypem = "text";
		boolean rpzIsMobile = pzAuto.isMobile();			if(rpzIsMobile){

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470816801140") + " ");		}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470816801140") + " ");	}

		tools.appendString(" title='"+dateTimeTooltip+"'");
			tools.appendString(" class='inactvDtTmTxt");
		tools.appendString("' "); 	tools.appendString(disabled_ctrl);

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
			tools.appendString("' style='padding-right:17px;width:196px;'");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType+strType,pegaValidation.toString());
			tools.appendString(" />");	boolean rpyAddNativeSupport = false;
		if(rpzIsMobile && rpyAddNativeSupport){
	}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470816801140-DatePicker") + " ");
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
		tools.appendString(tools.getLocalizedTextForString("pyCaption","Open date picker"));
	tools.appendString("' ");
	tools.appendString(" tabindex='0' ");
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString(tools.getLocalizedTextForString("pyCaption","To",StreamBuilder.FMT_LITERAL));
			tools.appendString(" ");
			tools.appendString("' data-calendar='{\"d\":[1,1,100,100],\"l\":"+showYearFirst+",\"m\":0, \"calendarNavigation\":" + calNav +", \"minInterval\":0 , \"displayWeekNo\":false}' style='display:inline-block;width:196px;'>");
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
			inclDaysDD_4("auto",100,100,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
						tools.appendString(" <br> ");
			inclTimeDD_2("auto",cal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input type='button' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' name='SB_" + curProp.getEntryHandle() + "' style='width:auto;' onclick='pega.u.d.handleDPDropdowns(event)' />");

			}
			pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
			tools.appendString("</span>");	}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");	
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDateTime");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201411181040470816801140") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_32")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "To");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void inclTimeDD_1(String ddWidth, Calendar cal, ClipboardProperty curProp, String defaultLocale,String disabled_ctrl,String dateTimeTooltip) {
			{
		boolean AccessibleWhen = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
		boolean isAccessibleMode = false && AccessibleWhen;
		String propRefName = curProp.getReference().replaceAll("\\.", "").replaceAll("\\(","").replaceAll("\\)","");
				boolean setAmDefault = true;
				setAmDefault = false;
				String[] timeFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^mhHa]", false, true);
				for(int i=0;i<timeFormat.length;i++) {
					if(timeFormat[i].indexOf("m") != -1) {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","Minute",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MiSel' name='"+propRefName+"MiSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Minute",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MiSel' name='"+propRefName+"MiSel'  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Minute") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("' ");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Minute",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString(" ><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						String minute = "";
						int zMinute = 0;
							String zerominute = com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null,zMinute);
						for(int j=0;j<=59;j+=1){
							minute = com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j);
							tools.appendString("<option value='" + j +"'");
							if(cal != null && j == cal.get(Calendar.MINUTE)) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+(j<10?(zerominute+minute):minute)+"</option>");
						}
						tools.appendString("</select>");
					} else if(timeFormat[i].indexOf("h") != -1) {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel'  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Hour") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("'");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString("><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						for(int j=1;j<=12;j++){
							tools.appendString("<option value='" + j +"'");
							if(cal != null && (j == cal.get(Calendar.HOUR) || (j - 12) == cal.get(Calendar.HOUR))) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j)+"</option>");
						}
						tools.appendString("</select>");
					} else if(timeFormat[i].indexOf("H") != -1) {if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"HrSel' name='"+propRefName+"HrSel'  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Hour") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("'");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","Hour",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString(" ><option value =''");
						if(cal == null) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						for(int j=0;j<=23;j++){
							tools.appendString("<option value='" + j +"'");
							if(cal != null && j == cal.get(Calendar.HOUR_OF_DAY)) {
								tools.appendString(" selected ");
							}
							tools.appendString(">"+com.pega.pegarules.pub.util.PRNumberFormat.format(defaultLocale, com.pega.pegarules.pub.util.PRNumberFormat.DEFAULT_INTEGER, false, null, j)+"</option>");
						}
						tools.appendString("</select>");
					} else if(timeFormat[i].indexOf("a") != -1) {
						String ampm[] = PRDateFormat.getAmPmStrings(defaultLocale);if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" + dateTimeTooltip +":"+ tools.getLocalizedTextForString(".pyCaption","AM or PM",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"ApSel' name='"+propRefName+"ApSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","AM or PM",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"ApSel' name='"+propRefName+"ApSel'  " + pzCell.getTestIdIfEnabled("20141118104047081580062-AMPM") + "  style='margin:1px;width:");}
						tools.appendString(""+ddWidth);
			tools.appendString("' ");
			tools.appendString(" data-fieldname='"+tools.getLocalizedTextForString(".pyCaption","AM or PM",StreamBuilder.FMT_NORMAL)+"' ");
		if(!isAccessibleMode){
					tools.appendString("onchange='pega.u.d.handleDPDropdowns(event)'");
		}tools.appendString(disabled_ctrl);

						tools.appendString(" ><option value =''");
						if(cal == null && !setAmDefault) {
							tools.appendString(" selected ");
						}
						tools.appendString(">--</option>");
						tools.appendString("<option value ='");
						tools.appendString(ampm[0]+"'");
						if((cal != null && cal.get(Calendar.AM_PM) == Calendar.AM) ||  (cal == null && setAmDefault)) {
							tools.appendString(" selected ");
						}
						tools.appendString(">"+ampm[0]+"</option>");
						tools.appendString("<option value ='");
						tools.appendString(ampm[1]+"'");
						if(cal != null && cal.get(Calendar.AM_PM) == Calendar.PM) {
							tools.appendString(" selected ");
							}
						tools.appendString(">"+ampm[1]+"</option>");
						tools.appendString("</select>");
					}
				}
			}
}
public void inclDaysDD_3(String ddWidth, int fwdYrs, int bckYrs, Calendar cal, Calendar todayCal, ClipboardProperty curProp, String defaultLocale,String disabled_ctrl,String dateTimeTooltip) {
			{
		boolean AccessibleWhen = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
		boolean isAccessibleMode = false && AccessibleWhen;
		String propRefName = curProp.getReference().replaceAll("\\.", "").replaceAll("\\(","").replaceAll("\\)","");
				String[] dateFormat = pega_uiengine_pzcontrol.pzGetFormatTokensArray(defaultLocale, "[^Mdy]", false, false);
				for(int i=0;i<dateFormat.length;i++) {
					if(dateFormat[i].toLowerCase().indexOf("m") != -1) {
						String months[] = PRDateFormat.getShortMonths(defaultLocale);if(dateTimeTooltip != ""){
						tools.appendString("<select class=\"standard\" title='" +  dateTimeTooltip +":"+tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL)+"' id='"+curProp.getEntryHandle()+"MoSel' name='"+propRefName+"MoSel' style='margin:1px;width:");}else{
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MoSel'  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Month") + "  name='"+propRefName+"MoSel' style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel'  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Day") + "  style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel'  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Year") + "  style='margin:1px;width:");}
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")){
inclCalVal_1("pxDateTime","D&&DateTime-Short&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20141118104047081580062",true));
	modePage1.put("pyDateTime","dateTime");
	modePage1.put("pyFutureNumber","100");
	modePage1.put("pyPastNumber","100");
	modePage1.put("pyCalendarNavigation","1");
	cellPage.put("pyValue",".pyStartDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStartDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyStartDateTime", ".pyCaption");
	String pyLabelFor = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyCaption","From\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("From", ".pyCaption");
	}
	pyLabelFor = "From";
	modePage1.put("pyLabelFor",pyLabelFor);
	cellPage.put("pyID","pyStartDateTime");
	modePage1.put("pyWidth","width:196px;");
	modePage1.put("pySpanWidth","width:196px;");
	String stringType = pyStringType;
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, stringType,pegaValidation.toString());
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	if(!"".equals(pyOnInput)) {
	modePage1.put("editInputAttrs",pyOnInput);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyStartDateTime",pxUniqueStreamHash+"_21");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_21");
	String pyHelperTextType = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyHelperTextType","none\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("none", ".pyHelperTextType");
	}
	pyHelperTextType = "none";
	modePage1.put("helpertype",pyHelperTextType);
	String spxUniqueStreamHash22 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash22 != null && !"".equals(spxUniqueStreamHash22)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash22,pxUniqueStreamHash+"_22");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_22");
	}
	
			 Boolean bUseAccessibleDate = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
	modePage1.put("useAccessibleDate",bUseAccessibleDate+"");
	modePage1.put("hasChangeEvent","false");
	modePage1.put("confirmationButtonLabel",tools.getLocalizedTextForString("pyButtonLabel","Select",StreamBuilder.FMT_LITERAL));
	modePage1.put("pyDisplayMode","calendar");
	modePage1.put("pyIgnoreLocaleSettings","false");
	modePage1.put("pyAddNativeSupport","false");
	modePage1.put("pyAllowTextEntry","true");
	boolean isMobile = pzAuto.isMobile();
	modePage1.put("pyIsMobile",isMobile+"");
	modePage1.put("pySetAMDefault","false");
	modePage1.put("pyDisplayLongFormat","false");
	modePage1.put("pyAllowMinuteInterval","false");
	modePage1.put("pyMinuteInterval","0");
	modePage1.put("pyDisplayWeekNumber","false");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20141118104047081580062",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStartDateTime");
	pyValueR = ".pyStartDateTime";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStartDateTime");
	pyValueOrig = ".pyStartDateTime";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","associated");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","datetime");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateTimeFormat","DateTime-Short");
	modePage2.put("pyDateTimeHourFormat","false");
	tools.putParamValue("forDateTimeFormatTemplate","true");
	tools.putParamValue("pyFormatType","datetime");
	pega_uiengine_formatter.pxFormatDateTime("20150821T065508.000 GMT","DateTime-Short", "datetime",true);
	String requestorLocale = null;
	if(tools.findPage("pxRequestor")!=null){
	requestorLocale = tools.findPage("pxRequestor").getString(".pxReqLocale");
	}
	String dateFormatForTemplate = tools.getParamValue("PRDateFormatCodeforTemplate");
	if("".equals(dateFormatForTemplate)) {
		dateFormatForTemplate = PRDateFormat.DEFAULT_DATE_MEDIUM;
	}
	String pyCustDateTime = PRDateFormat.getFormatPattern(requestorLocale, dateFormatForTemplate);
	modePage2.put("pyCustDateTime",pyCustDateTime);
	tools.putParamValue("forDateTimeFormatTemplate","false");
	tools.putParamValue("PRDateFormatCodeforTemplate","");
	tools.putParamValue("pyFormatType","");
	String spxUniqueStreamHash23 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash23 != null && !"".equals(spxUniqueStreamHash23)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash23,pxUniqueStreamHash+"_23");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_23");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addDependentScripts("pzpega_ui_template_datetime.js","pzpega_control_datePicker.js");
	ctrlComponent.addAdditionalScripts("pzDateCommonInclude","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_spinner.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.beginComponent("pxDateTime",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
		String disabled_ctrl = "";
		String iconStyle_ctrl = "inactvIcon";
		String iconDisabled_ctrl = "";
String dateTimeTooltip = "";int calNav = 1;			if(pzAuto.isMobile()){
calNav = 0;		}
		String strType = "";

		dtlIncludes_1();
		if(pzAuto.doOnlyOnce("pzDatePickerAdvancedIncludes")) {IStaticContentRuntime pzStatic_pzDatePickerAdvancedIncludes = pzAuto.getStaticBlock("script");
	pzStatic_pzDatePickerAdvancedIncludes.addBundle("pzDatePickerAdvanced", "11333989227");
pzStatic_pzDatePickerAdvancedIncludes.setMoveToEnd(true);
pzStatic_pzDatePickerAdvancedIncludes.emitContent();

		}
		String dateFormatStr = "	datetime_4yshort";
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
		String defaultTimeZone = tools.findPage("pxRequestor").getString(".pyUseTimeZone");
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
			float pyWidth = 196;boolean isTemplate = false;boolean isDynamic = true;
			tools.appendString("<span id='"+curProp.getEntryHandle()+"Span' role='group'"+outerSpanClass);			String disabledWeekendVal = null ;

			tools.appendString(" data-calendar='{\"d\":[0,1,100,100],\"l\":"+showYearFirst+" ,\"m\":0, \"calendarNavigation\":" + calNav + " , \"minInterval\":0, \"displayWeekNo\":false, \"disabledWeekends\":" + disabledWeekendVal + " }' style='width:196px;' onmouseover='pega.c.DatePicker && pega.c.DatePicker.dtTmHvr(event);' >");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		String inputtype = "text";
		String inputtypem = "text";
		boolean rpzIsMobile = pzAuto.isMobile();			if(rpzIsMobile){

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20141118104047081580062") + " ");		}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("20141118104047081580062") + " ");	}

		tools.appendString(" title='"+dateTimeTooltip+"'");
			tools.appendString(" class='inactvDtTmTxt");
		tools.appendString("' "); 	tools.appendString(disabled_ctrl);

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
			tools.appendString("' style='padding-right:17px;width:196px;'");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType+strType,pegaValidation.toString());
			tools.appendString(" />");	boolean rpyAddNativeSupport = false;
		if(rpzIsMobile && rpyAddNativeSupport){
	}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("20141118104047081580062-DatePicker") + " ");
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
		tools.appendString(tools.getLocalizedTextForString("pyCaption","Open date picker"));
	tools.appendString("' ");
	tools.appendString(" tabindex='0' ");
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString(tools.getLocalizedTextForString("pyCaption","From",StreamBuilder.FMT_LITERAL));
			tools.appendString(" ");
			tools.appendString("' data-calendar='{\"d\":[1,1,100,100],\"l\":"+showYearFirst+",\"m\":0, \"calendarNavigation\":" + calNav +", \"minInterval\":0 , \"displayWeekNo\":false}' style='display:inline-block;width:196px;'>");
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
			inclDaysDD_3("auto",100,100,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
						tools.appendString(" <br> ");
			inclTimeDD_1("auto",cal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input type='button' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' name='SB_" + curProp.getEntryHandle() + "' style='width:auto;' onclick='pega.u.d.handleDPDropdowns(event)' />");

			}
			pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
			tools.appendString("</span>");	}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");	
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDateTime");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20141118104047081580062") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "From");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MoSel'  " + pzCell.getTestIdIfEnabled("201411181040470814799691-Month") + "  name='"+propRefName+"MoSel' style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel'  " + pzCell.getTestIdIfEnabled("201411181040470814799691-Day") + "  style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel'  " + pzCell.getTestIdIfEnabled("201411181040470814799691-Year") + "  style='margin:1px;width:");}
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181040470814799691",true));
	modePage1.put("pyDateTime","date");
	modePage1.put("pyFutureNumber","100");
	modePage1.put("pyPastNumber","100");
	modePage1.put("pyCalendarNavigation","1");
	cellPage.put("pyValue",".pyEndDate");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyEndDate");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyEndDate", ".pyCaption");
	String pyLabelFor = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyCaption","To\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("To", ".pyCaption");
	}
	pyLabelFor = "To";
	modePage1.put("pyLabelFor",pyLabelFor);
	cellPage.put("pyID","pyEndDate");
	modePage1.put("pyWidth","width:196px;");
	modePage1.put("pySpanWidth","width:196px;");
	String stringType = pyStringType;
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, stringType,pegaValidation.toString());
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	if(!"".equals(pyOnInput)) {
	modePage1.put("editInputAttrs",pyOnInput);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyEndDate",pxUniqueStreamHash+"_13");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_13");
	String pyHelperTextType = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyHelperTextType","none\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("none", ".pyHelperTextType");
	}
	pyHelperTextType = "none";
	modePage1.put("helpertype",pyHelperTextType);
	String spxUniqueStreamHash14 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash14,pxUniqueStreamHash+"_14");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_14");
	}
	
			 Boolean bUseAccessibleDate = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
	modePage1.put("useAccessibleDate",bUseAccessibleDate+"");
	modePage1.put("hasChangeEvent","false");
	modePage1.put("confirmationButtonLabel",tools.getLocalizedTextForString("pyButtonLabel","Select",StreamBuilder.FMT_LITERAL));
	modePage1.put("pyDisplayMode","calendar");
	modePage1.put("pyIgnoreLocaleSettings","false");
	modePage1.put("pyAddNativeSupport","false");
	modePage1.put("pyAllowTextEntry","true");
	boolean isMobile = pzAuto.isMobile();
	modePage1.put("pyIsMobile",isMobile+"");
	modePage1.put("pySetAMDefault","false");
	modePage1.put("pyDisplayLongFormat","false");
	modePage1.put("pyAllowMinuteInterval","false");
	modePage1.put("pyMinuteInterval","0");
	modePage1.put("pyDisplayWeekNumber","false");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181040470814799691",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyEndDate");
	pyValueR = ".pyEndDate";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyEndDate");
	pyValueOrig = ".pyEndDate";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","associated");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","datetime");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateTimeFormat","DateTime-Short");
	modePage2.put("pyDateTimeHourFormat","false");
	tools.putParamValue("forDateTimeFormatTemplate","true");
	tools.putParamValue("pyFormatType","datetime");
	pega_uiengine_formatter.pxFormatDateTime("20150821T065508.000 GMT","DateTime-Short", "datetime",true);
	String requestorLocale = null;
	if(tools.findPage("pxRequestor")!=null){
	requestorLocale = tools.findPage("pxRequestor").getString(".pxReqLocale");
	}
	String dateFormatForTemplate = tools.getParamValue("PRDateFormatCodeforTemplate");
	if("".equals(dateFormatForTemplate)) {
		dateFormatForTemplate = PRDateFormat.DEFAULT_DATE_MEDIUM;
	}
	String pyCustDateTime = PRDateFormat.getFormatPattern(requestorLocale, dateFormatForTemplate);
	modePage2.put("pyCustDateTime",pyCustDateTime);
	tools.putParamValue("forDateTimeFormatTemplate","false");
	tools.putParamValue("PRDateFormatCodeforTemplate","");
	tools.putParamValue("pyFormatType","");
	String spxUniqueStreamHash15 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash15 != null && !"".equals(spxUniqueStreamHash15)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash15,pxUniqueStreamHash+"_15");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_15");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addDependentScripts("pzpega_ui_template_datetime.js","pzpega_control_datePicker.js");
	ctrlComponent.addAdditionalScripts("pzDateCommonInclude","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_spinner.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.beginComponent("pxDateTime",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
		String disabled_ctrl = "";
		String iconStyle_ctrl = "inactvIcon";
		String iconDisabled_ctrl = "";
String dateTimeTooltip = "";int calNav = 1;			if(pzAuto.isMobile()){
calNav = 0;		}
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
			float pyWidth = 196;boolean isTemplate = false;boolean isDynamic = true;
			tools.appendString("<span id='"+curProp.getEntryHandle()+"Span' role='group'"+outerSpanClass);			String disabledWeekendVal = null ;

			tools.appendString(" data-calendar='{\"d\":[0,0,100,100],\"l\":"+showYearFirst+" ,\"m\":0, \"calendarNavigation\":" + calNav + " , \"minInterval\":0, \"displayWeekNo\":false, \"disabledWeekends\":" + disabledWeekendVal + " }' style='width:196px;' onmouseover='pega.c.DatePicker && pega.c.DatePicker.dtTmHvr(event);' >");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		String inputtype = "text";
		String inputtypem = "text";
		boolean rpzIsMobile = pzAuto.isMobile();			if(rpzIsMobile){

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470814799691") + " ");		}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470814799691") + " ");	}
	tools.appendString("data-autoSeparator = 'true'");

		tools.appendString(" title='"+dateTimeTooltip+"'");
			tools.appendString(" class='inactvDtTmTxt");
		tools.appendString("' "); 	tools.appendString(disabled_ctrl);

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
			tools.appendString("' style='padding-right:17px;width:196px;'");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType+strType,pegaValidation.toString());
			tools.appendString(" />");	boolean rpyAddNativeSupport = false;
		if(rpzIsMobile && rpyAddNativeSupport){
	}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470814799691-DatePicker") + " ");
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
		tools.appendString(tools.getLocalizedTextForString("pyCaption","Open date picker"));
	tools.appendString("' ");
	tools.appendString(" tabindex='0' ");
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString(tools.getLocalizedTextForString("pyCaption","To",StreamBuilder.FMT_LITERAL));
			tools.appendString(" ");
			tools.appendString("' data-calendar='{\"d\":[1,0,100,100],\"l\":"+showYearFirst+",\"m\":0, \"calendarNavigation\":" + calNav +", \"minInterval\":0 , \"displayWeekNo\":false}' style='display:inline-block;width:196px;'>");
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
			inclDaysDD_2("auto",100,100,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input type='button' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' name='SB_" + curProp.getEntryHandle() + "' style='width:auto;' onclick='pega.u.d.handleDPDropdowns(event)' />");

			}
			pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
			tools.appendString("</span>");	}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");	
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDateTime");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201411181040470814799691") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "To");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


}

public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Short","associated",true);
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Month",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"MoSel'  " + pzCell.getTestIdIfEnabled("201411181040470809798341-Month") + "  name='"+propRefName+"MoSel' style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Day",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"DySel' name='"+propRefName+"DySel'  " + pzCell.getTestIdIfEnabled("201411181040470809798341-Day") + "  style='margin:1px;width:");}
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
						tools.appendString("<select class=\"standard\" title='" +  tools.getLocalizedTextForString(".pyCaption","Year",StreamBuilder.FMT_NORMAL) +"' id='"+curProp.getEntryHandle()+"YrSel' name='"+propRefName+"YrSel'  " + pzCell.getTestIdIfEnabled("201411181040470809798341-Year") + "  style='margin:1px;width:");}
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
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Short","associated",true);
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181040470809798341",true));
	modePage1.put("pyDateTime","date");
	modePage1.put("pyFutureNumber","100");
	modePage1.put("pyPastNumber","100");
	modePage1.put("pyCalendarNavigation","1");
	cellPage.put("pyValue",".pyStartDate");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStartDate");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyStartDate", ".pyCaption");
	String pyLabelFor = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyCaption","From\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("From", ".pyCaption");
	}
	pyLabelFor = "From";
	modePage1.put("pyLabelFor",pyLabelFor);
	cellPage.put("pyID","pyStartDate");
	modePage1.put("pyWidth","width:196px;");
	modePage1.put("pySpanWidth","width:196px;");
	String stringType = pyStringType;
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, stringType,pegaValidation.toString());
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	if(!"".equals(pyOnInput)) {
	modePage1.put("editInputAttrs",pyOnInput);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyStartDate",pxUniqueStreamHash+"_5");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_5");
	String pyHelperTextType = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyHelperTextType","none\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("none", ".pyHelperTextType");
	}
	pyHelperTextType = "none";
	modePage1.put("helpertype",pyHelperTextType);
	String spxUniqueStreamHash6 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash6 != null && !"".equals(spxUniqueStreamHash6)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash6,pxUniqueStreamHash+"_6");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_6");
	}
	
			 Boolean bUseAccessibleDate = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false);
	modePage1.put("useAccessibleDate",bUseAccessibleDate+"");
	modePage1.put("hasChangeEvent","false");
	modePage1.put("confirmationButtonLabel",tools.getLocalizedTextForString("pyButtonLabel","Select",StreamBuilder.FMT_LITERAL));
	modePage1.put("pyDisplayMode","calendar");
	modePage1.put("pyIgnoreLocaleSettings","false");
	modePage1.put("pyAddNativeSupport","false");
	modePage1.put("pyAllowTextEntry","true");
	boolean isMobile = pzAuto.isMobile();
	modePage1.put("pyIsMobile",isMobile+"");
	modePage1.put("pySetAMDefault","false");
	modePage1.put("pyDisplayLongFormat","false");
	modePage1.put("pyAllowMinuteInterval","false");
	modePage1.put("pyMinuteInterval","0");
	modePage1.put("pyDisplayWeekNumber","false");
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201411181040470809798341",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStartDate");
	pyValueR = ".pyStartDate";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStartDate");
	pyValueOrig = ".pyStartDate";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","associated");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","datetime");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateTimeFormat","DateTime-Short");
	modePage2.put("pyDateTimeHourFormat","false");
	tools.putParamValue("forDateTimeFormatTemplate","true");
	tools.putParamValue("pyFormatType","datetime");
	pega_uiengine_formatter.pxFormatDateTime("20150821T065508.000 GMT","DateTime-Short", "datetime",true);
	String requestorLocale = null;
	if(tools.findPage("pxRequestor")!=null){
	requestorLocale = tools.findPage("pxRequestor").getString(".pxReqLocale");
	}
	String dateFormatForTemplate = tools.getParamValue("PRDateFormatCodeforTemplate");
	if("".equals(dateFormatForTemplate)) {
		dateFormatForTemplate = PRDateFormat.DEFAULT_DATE_MEDIUM;
	}
	String pyCustDateTime = PRDateFormat.getFormatPattern(requestorLocale, dateFormatForTemplate);
	modePage2.put("pyCustDateTime",pyCustDateTime);
	tools.putParamValue("forDateTimeFormatTemplate","false");
	tools.putParamValue("PRDateFormatCodeforTemplate","");
	tools.putParamValue("pyFormatType","");
	String spxUniqueStreamHash7 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash7,pxUniqueStreamHash+"_7");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_7");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addDependentScripts("pzpega_ui_template_datetime.js","pzpega_control_datePicker.js");
	ctrlComponent.addAdditionalScripts("pzDateCommonInclude","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_spinner.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.beginComponent("pxDateTime",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
		String disabled_ctrl = "";
		String iconStyle_ctrl = "inactvIcon";
		String iconDisabled_ctrl = "";
String dateTimeTooltip = "";int calNav = 1;			if(pzAuto.isMobile()){
calNav = 0;		}
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
			float pyWidth = 196;boolean isTemplate = false;boolean isDynamic = true;
			tools.appendString("<span id='"+curProp.getEntryHandle()+"Span' role='group'"+outerSpanClass);			String disabledWeekendVal = null ;

			tools.appendString(" data-calendar='{\"d\":[0,0,100,100],\"l\":"+showYearFirst+" ,\"m\":0, \"calendarNavigation\":" + calNav + " , \"minInterval\":0, \"displayWeekNo\":false, \"disabledWeekends\":" + disabledWeekendVal + " }' style='width:196px;' onmouseover='pega.c.DatePicker && pega.c.DatePicker.dtTmHvr(event);' >");
		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		String inputtype = "text";
		String inputtypem = "text";
		boolean rpzIsMobile = pzAuto.isMobile();			if(rpzIsMobile){

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" data-calendar='Calendar' id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470809798341") + " ");		}else{

			tools.appendString("<input type='"+ inputtype +"' "+ customTimeZoneAttr +" id='"+tools.getHTMLIDForProperty(true,"datepicker")+"' name='"+curProp.getEntryHandle()+"' aria-describedby='"+curProp.getEntryHandle()+"Error' data-ctl='[\"DatePicker\"]'"); tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470809798341") + " ");	}
	tools.appendString("data-autoSeparator = 'true'");

		tools.appendString(" title='"+dateTimeTooltip+"'");
			tools.appendString(" class='inactvDtTmTxt");
		tools.appendString("' "); 	tools.appendString(disabled_ctrl);

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
			tools.appendString("' style='padding-right:17px;width:196px;'");
			pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType+strType,pegaValidation.toString());
			tools.appendString(" />");	boolean rpyAddNativeSupport = false;
		if(rpzIsMobile && rpyAddNativeSupport){
	}else{

			tools.appendString("<img src='");
		tools.appendString("webwb/pzspacer_11792674401.gif!!.gif");
	tools.appendString("' class='"+iconStyle_ctrl+"' data-ctl='[\"DatePicker\"]' ");
	tools.appendString(iconDisabled_ctrl);
	tools.appendString(" " + pzCell.getTestIdIfEnabled("201411181040470809798341-DatePicker") + " ");
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
		tools.appendString(tools.getLocalizedTextForString("pyCaption","Open date picker"));
	tools.appendString("' ");
	tools.appendString(" tabindex='0' ");
			tools.appendString(" />");}

			if(pega_rules_default.BrowserIsIE(tools)){
				tools.appendString("<script>try{ positionDatePickerIcn(document.getElementById('"+curProp.getEntryHandle()+"Span')); }catch(e) {}</script>");
			}
		} else {

			tools.appendString("<span id='"+curProp.getEntryHandle()+"' role='group'"+outerSpanClass+" aria-label='");
			tools.appendString(tools.getLocalizedTextForString("pyCaption","From",StreamBuilder.FMT_LITERAL));
			tools.appendString(" ");
			tools.appendString("' data-calendar='{\"d\":[1,0,100,100],\"l\":"+showYearFirst+",\"m\":0, \"calendarNavigation\":" + calNav +", \"minInterval\":0 , \"displayWeekNo\":false}' style='display:inline-block;width:196px;'>");
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
			inclDaysDD_1("auto",100,100,cal,todayCal,curProp,defaultLocale,disabled_ctrl,dateTimeTooltip);
		}if(false && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"UseAccessibleDate",null,false)) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input type='button' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' name='SB_" + curProp.getEntryHandle() + "' style='width:auto;' onclick='pega.u.d.handleDPDropdowns(event)' />");

			}
			pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
			tools.appendString("</span>");	}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");	
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDateTime");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201411181040470809798341") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "From");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }		}


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
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDate","param.inputType==\'From\' && param.pyColumnType==\'Date\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDateTime",".pyStartDate",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470809798341-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDate"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470809798341-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDate"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDateTime_1(".pyStartDate",0,"","","Date");
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470809798341-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDateTime");
	pgCells.put("forLabel",".pyStartDate");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDate",pxUniqueStreamHash+"_10");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_10");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='From' && param.pyColumnType=='Date'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_10");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDate", pxUniqueStreamHash+"_10"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxDateTime",".pyStartDate",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDateTime_1(".pyStartDate",0,"","","Date");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "From";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDate","param.inputType==\'To\' && param.pyColumnType==\'Date\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDateTime",".pyEndDate",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470814799691-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDate"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470814799691-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDate"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDateTime_2(".pyEndDate",0,"","","Date");
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470814799691-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDateTime");
	pgCells.put("forLabel",".pyEndDate");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDate",pxUniqueStreamHash+"_18");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_18");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='To' && param.pyColumnType=='Date'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_18");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDate", pxUniqueStreamHash+"_18"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxDateTime",".pyEndDate",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDateTime_2(".pyEndDate",0,"","","Date");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "To";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDateTime","param.inputType==\'From\' && param.pyColumnType==\'DateTime\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDateTime",".pyStartDateTime",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDateTime"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20141118104047081580062-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDateTime"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDateTime_3(".pyStartDateTime",0,"","","Date Time");
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141118104047081580062-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDateTime");
	pgCells.put("forLabel",".pyStartDateTime");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDateTime",pxUniqueStreamHash+"_26");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_26");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='From' && param.pyColumnType=='DateTime'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_26");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDateTime", pxUniqueStreamHash+"_26"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxDateTime",".pyStartDateTime",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDateTime_3(".pyStartDateTime",0,"","","Date Time");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "From";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDateTime","param.inputType==\'To\' && param.pyColumnType==\'DateTime\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDateTime",".pyEndDateTime",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDateTime"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470816801140-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDateTime"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDateTime_4(".pyEndDateTime",0,"","","Date Time");
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470816801140-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDateTime");
	pgCells.put("forLabel",".pyEndDateTime");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDateTime",pxUniqueStreamHash+"_34");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_34");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='To' && param.pyColumnType=='DateTime'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_34");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDateTime", pxUniqueStreamHash+"_34"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxDateTime",".pyEndDateTime",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDateTime_4(".pyEndDateTime",0,"","","Date Time");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "To";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDecimal","param.inputType==\'From\' && param.pyColumnType==\'Decimal\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyStartDecimal",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470816802282-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDecimal"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470816802282-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDecimal"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_1();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470816802282-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyStartDecimal");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDecimal",pxUniqueStreamHash+"_36");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_36");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='From' && param.pyColumnType=='Decimal'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_36");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDecimal", pxUniqueStreamHash+"_36"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyStartDecimal",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)");
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
	labelName = "From";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDecimal","param.inputType==\'To\' && param.pyColumnType==\'Decimal\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyEndDecimal",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(6)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470817803745-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDecimal"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470817803745-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDecimal"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_2();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470817803745-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyEndDecimal");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDecimal",pxUniqueStreamHash+"_38");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_38");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='To' && param.pyColumnType=='Decimal'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_38");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDecimal", pxUniqueStreamHash+"_38"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyEndDecimal",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(6)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_2();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "To";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDouble","param.inputType==\'From\' && param.pyColumnType==\'Double\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyStartDouble",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(7)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470818804737-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDouble"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470818804737-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartDouble"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_3();
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470818804737-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyStartDouble");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDouble",pxUniqueStreamHash+"_40");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_40");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='From' && param.pyColumnType=='Double'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_40");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqDouble", pxUniqueStreamHash+"_40"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyStartDouble",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(7)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_3();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "From";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDouble","param.inputType==\'To\' && param.pyColumnType==\'Double\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyEndDouble",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(8)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470818805718-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDouble"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470818805718-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndDouble"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_4();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470818805718-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyEndDouble");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDouble",pxUniqueStreamHash+"_42");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_42");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='To' && param.pyColumnType=='Double'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_42");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqDouble", pxUniqueStreamHash+"_42"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyEndDouble",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(8)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_4();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "To";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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


public int simpleLayoutCell_9( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqInteger","param.inputType==\'From\' && param.pyColumnType==\'Integer\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyStartInteger",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(9)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20141118104047081980618-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartInteger"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20141118104047081980618-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStartInteger"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","From") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_5();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_9( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141118104047081980618-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyStartInteger");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqInteger",pxUniqueStreamHash+"_44");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_44");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='From' && param.pyColumnType=='Integer'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_44");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqFrom o2== pxparam.pyColumnType cqInteger", pxUniqueStreamHash+"_44"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyStartInteger",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(9)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_5();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "From";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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


public int simpleLayoutCell_10( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqInteger","param.inputType==\'To\' && param.pyColumnType==\'Integer\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyEndInteger",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(10)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("201411181040470820807467-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndInteger"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201411181040470820807467-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyEndInteger"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","To") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_6();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_10( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201411181040470820807467-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyEndInteger");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqInteger",pxUniqueStreamHash+"_46");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_46");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","param.inputType=='To' && param.pyColumnType=='Integer'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-ColumnFilterCriteria");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_46");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2== pxparam.inputType cqTo o2== pxparam.pyColumnType cqInteger", pxUniqueStreamHash+"_46"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyEndInteger",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(10)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_6();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "To";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
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
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpyGridFilterRangeFieldsB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201805240504200704210") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-stacked content-stacked " + "'  ");
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
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
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
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_5(index);
	}else{
		index=simpleLayoutTemplateCell_5(index);
	}
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
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_9(index);
	}else{
		index=simpleLayoutTemplateCell_9(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_10(index);
	}else{
		index=simpleLayoutTemplateCell_10(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
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
	String paramName = "EXPANDEDSubSectionpyGridFilterRangeFieldsB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2|| o2== pxparam.inputType cqFrom o2== pxparam.inputType cqTo", pxUniqueStreamHash+"_47");IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_47");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_1();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2|| o2== pxparam.inputType cqFrom o2== pxparam.inputType cqTo","param.inputType==\'From\' || param.inputType==\'To\'", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_1();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
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
	oStreamProperties_1.put("pyClassName", "Pega-ColumnFilterCriteria");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyGridFilterRangeFields");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION PEGA-COLUMNFILTERCRITERIA PYGRIDFILTERRANGEFIELDS #20180713T133450.844 GMT", "Pega-ColumnFilterCriteria pyGridFilterRangeFields", "Pega-Gadgets", "08-01-01", "20180713T133450.844 GMT");
}
