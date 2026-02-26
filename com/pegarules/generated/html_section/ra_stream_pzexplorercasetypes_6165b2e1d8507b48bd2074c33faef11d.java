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
 * Builds JSP stream PEGA-EXT-EXPEXPLORER-CASE!PZEXPLORERCASETYPES.
 */
public class ra_stream_pzexplorercasetypes_6165b2e1d8507b48bd2074c33faef11d extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzExplorerCaseTypes.Pega_Ext_ExpExplorer_Case.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -120498987;
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
	public ra_stream_pzexplorercasetypes_6165b2e1d8507b48bd2074c33faef11d(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "de8089bc26c5b5bd0451c655123dc7002b23fb2";
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
/* Instance RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT	Pega-EndUserUI:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "de8089bc26c5b5bd0451c655123dc7002b23fb2";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzExplorerCaseTypes",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT */
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
	"Rule-File-Text:WEBWB!PZPEGA_MENU_TEMPLATE!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_MENUBAR_TEMPLATE!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_CONTROL_MENU!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS", 
	"Rule-File-Text:WEBWB!PZJQUERY_MENUAIM!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-File-Bundle:PZPEGA_CONTROL_MENU_SCRIPTS!SCRIPT", 
	"Rule-HTML-Section:PZEXPLORERCASETYPES", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXICON"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PZPEGA_MENU_TEMPLATE!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT","WEBWB!PZPEGA_MENU_TEMPLATE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_MENUBAR_TEMPLATE!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT","WEBWB!PZPEGA_MENUBAR_TEMPLATE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_CONTROL_MENU!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT","WEBWB!PZPEGA_CONTROL_MENU!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT","WEBWB!PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT","WEBWB!PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZJQUERY_MENUAIM!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT","WEBWB!PZJQUERY_MENUAIM!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZPEGA_CONTROL_MENU_SCRIPTS!SCRIPT","Rule-File-Bundle","",false,"","Pega-UIEngine","","RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT","PZPEGA_CONTROL_MENU_SCRIPTS!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZEXPLORERCASETYPES","Rule-HTML-Section","PEGA-EXT-EXPEXPLORER-CASE",false,"","Pega-EndUserUI","08-23-01","RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT","!PZEXPLORERCASETYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-120498987), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
		new DependentRuleInfo("PXICON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT","PXICON",true,false,"ABSOLUTE_CLASSLESS",-794576025)
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
//	RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT:20230803T192647.117 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_2(
//	simpleLayout_1(
//	gridTemplatePartial_1(
//	generateGridCellModes_1( {"strGridMetadataPage", "String", ""}
//	simpleLayout_2(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION GRID GETTOTALRECORDS #20180713T133337.740 GMT:20180718T092706.975 GMT
//	RULE-UTILITY-FUNCTION GRID PZGETPROPERTYCLASSNAME #20180713T133337.766 GMT:20180713T133337.766 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEGRIDFIELDINCLUDE--(STR2D70A853CCD6654B51AFD65192EDF57E #20180713T133339.756 GMT:20180713T133339.756 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
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
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDJSONVALUE--(STRING8F901A9DF674B9184A2C782BF6532117 #20190219T093521.972 GMT:20190219T093521.972 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI6175A0208F0ADF73D975410F7546F032 #20180713T133342.984 GMT:20180713T133342.984 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNACTIVITY #20190830T074358.805 GMT:20190830T074358.805 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSHOWHARNESS--(CLIPBOARDPB0E4216D380188E48B403B96B76CE8F0 #20190218T093631.826 GMT:20190219T093521.982 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSHOWMENU #20220112T101247.778 GMT:20220112T101247.778 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDDTACTION--(CLIPBOARDPROPE42DB21F900D3B3C81891D406B4B08598 #20190219T093521.991 GMT:20190219T093521.991 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZENABLEDSKIPLOCALIZATION #20180713T133344.810 GMT:20180713T133344.810 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEMENUSCRIPTS #20180713T133346.297 GMT:20180713T133346.297 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPAGECLASS #20190222T143815.273 GMT:20190222T143815.273 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVNODELEVELDEFERLOADED--(STRING,STRING,CLIPBOARDPAGE) #20180713T133346.455 GMT:20180713T133346.455 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVNODELEVELDEFERLOADEDINNER--(CLIPBOARDPAGE) #20180713T133346.450 GMT:20180713T133346.450 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVTYPECUSTOM #20180713T133346.460 GMT:20180713T133346.460 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVTYPECUSTOMINNER #20180713T133346.472 GMT:20180713T133346.472 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSETMOBILETRANSITION--(CLIPBOARBD730748D4A4889BCBC7588C6050A02F #20181029T101028.041 GMT:20181029T101028.041 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "576b37c7668b29cb0986b666fd2ed153";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Ext-ExpExplorer-Case";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
pzLayoutBodyWrapper_3();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzExplorerCaseTypes",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzExplorerCaseTypes','insKey':'RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT','sectionType':'standard'}");
pzLayout_5();
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
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pzFilterCaseTypes");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzExplorerCaseTypes");
pega.getUIEngine().getUIAction("sort", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyNextGenGridModalTemplate");
config.put("ModalSection", "pyNextGenGridModalTemplate");
config.put("NewTaskStatus", "");
pega.getUIEngine().getUIAction("editItemImplicit", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("UPDATEGRIDCOLUMNSSTATE", null).register();
config = new HashMap<String, String>();
config.put("pyPageMode", "Numeric");
pega.getUIEngine().getUIAction("paginate", config).register();
pega.getUIEngine().getUIAction("filter", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pzSetSelectedCaseType");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("harnessName", "pzCaseTypeLP");
config.put("className", "Rule-Obj-Class");
config.put("model", "{\"pyDataTransform\":\"pzSetExpressSkinForEditMode\",\"pyDataTransformParams\":{}}");
config.put("preActivity", "pzPrepareCaseTypeLP");
config.put("preActivityParams", "{\"lpParamIsCaseOpenedFromUCC\":\"\",\"lpDisplayDataModelTab\":\"\"}");
config.put("target", "newDocument");
pega.getUIEngine().getUIAction("showHarness", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "formFactorIframe.hideFormFactorIframe");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pzSetSelectedCaseType");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("harnessName", "pzCaseTypeLP");
config.put("className", "Rule-Obj-Class");
config.put("model", "{\"pyDataTransform\":\"pzSetExpressSkinForEditMode\",\"pyDataTransformParams\":{}}");
config.put("preActivity", "pzPrepareCaseTypeLP");
config.put("preActivityParams", "{\"lpParamIsCaseOpenedFromUCC\":\"\",\"lpDisplayDataModelTab\":\"\"}");
config.put("target", "newDocument");
pega.getUIEngine().getUIAction("showHarness", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "formFactorIframe.hideFormFactorIframe");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("navName", "pzMenuForCaseLauncher");
pega.getUIEngine().getUIAction("showMenu", config).register();
config = new HashMap<String, String>();
config.put("navName", "pzMenuForCaseLauncher");
pega.getUIEngine().getUIAction("showMenu", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_8() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_7() {
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_42","pzNoExplorerCaseTypes", secInfo);
}


public void sectionBodyIncludeInCell_6() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_6();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
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
	String sectionName = "pzNoExplorerCaseTypes"; 
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
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionCellpzExplorerCaseTypes869","",false);
}
public void pzLayout_4() {
pzSetExpandParam_5();
pzLayoutBodyWrapper_7();
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_38","pzNoExplorerCaseTypes", secInfo);
}


public void sectionBodyIncludeInCell_5() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
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
	String sectionName = "pzNoExplorerCaseTypes"; 
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


public void generateClientWhenDiv_3() {
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
tools.appendString(" SWP=\".pxResultCount\"  SHOW_WHEN=\"D_pzExplorerCaseTypes.pxResultCount == 0\"");
if(pzAuto.evaluateWhen("D_pzExplorerCaseTypes.pxResultCount == 0",null,true)){
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
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges("D_pzExplorerCaseTypes.pxResultCount", -1);
	}
}catch(Exception e){}
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_6() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_1() {
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_1();
return;}tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridCentreLayout_1();
  

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
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridCentreLayout_1();
  

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
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }	if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
	  IActionRequest actionRequest = pzAuto.getActionRequest();
	  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
	  pzAuto.registerActionRequest(actionRequest);
	}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("pzExplorerCaseTypes",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
			if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
			tools.appendString("\",\"UITemplatingStatus\":\"Y");
			}
			tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			tools.appendString("menu-format-standard");
			}
			else{
			tools.appendString("Standard");
			}
			tools.appendString("\" , \"loadBehavior\":");
			if(pzAuto.isOffline() || false) {
			tools.appendString("\"screenload\"");
			}else{
			tools.appendString("\"ondisplay\"");
			}
			tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009547");
			if(pzAuto.isOffline() || false) {
			try{
			pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009547","", false, false, false, false);
			}catch(Exception e){oLog.error(e);}
			}
			tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			  IActionRequest actionRequest = pzAuto.getActionRequest();
			  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
			  pzAuto.registerActionRequest(actionRequest);
			}
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				try{
					pzPackageRuntime.packageSection("pzExplorerCaseTypes",
					tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
					}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
					}
					tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
					if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
					tools.appendString("\",\"UITemplatingStatus\":\"Y");
					}
					tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
					if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
					tools.appendString("menu-format-standard");
					}
					else{
					tools.appendString("Standard");
					}
					tools.appendString("\" , \"loadBehavior\":");
					if(pzAuto.isOffline() || false) {
					tools.appendString("\"screenload\"");
					}else{
					tools.appendString("\"ondisplay\"");
					}
					tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009550");
					if(pzAuto.isOffline() || false) {
					try{
					pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009550","", false, false, false, false);
					}catch(Exception e){oLog.error(e);}
					}
					tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}					String returnString = actionsStringBuilder.toString();
					tools.popStreamBody();
					return returnString;
				}


public void pxIcon_4() {boolean isDisplayTextWithParam = false;
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
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pzExplorerCaseTypes");
	cellPage.put("pyCellID","27");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","More options\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("More options", ".pyActionPrompt");
	}
	pyTooltip = "More options";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	String classProp = "";
	classProp ="pi pi-dot-3";
	modePage1.put("class",classProp);
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","styleclass");
	modePage1.put("pyFormatTypeActionable","none");
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20191104074028061670924") + " ");
	String spxUniqueStreamHash30 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash30 != null && !"".equals(spxUniqueStreamHash30)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash30,pxUniqueStreamHash+"_30");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_30");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	if (!pzAuto.hasStaticContentJSOptimization() ) {
		ctrlComponent.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
		ctrlComponent.addAdditionalFragment("MenuBarOld","pzMenuBarInclude");
	}
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_27'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		String alttempText = tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL);
		String classProp = "";
		 classProp ="pi pi-dot-3";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("20191104074028061670924") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
			tools.appendString(" alt= '");
			tools.appendString(alttempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }		if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
		  IActionRequest actionRequest = pzAuto.getActionRequest();
		  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
		  pzAuto.registerActionRequest(actionRequest);
		}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("pzExplorerCaseTypes",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
				if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
				tools.appendString("\",\"UITemplatingStatus\":\"Y");
				}
				tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
				if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
				tools.appendString("menu-format-standard");
				}
				else{
				tools.appendString("Standard");
				}
				tools.appendString("\" , \"loadBehavior\":");
				if(pzAuto.isOffline() || false) {
				tools.appendString("\"screenload\"");
				}else{
				tools.appendString("\"ondisplay\"");
				}
				tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009553");
				if(pzAuto.isOffline() || false) {
				try{
				pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009553","", false, false, false, false);
				}catch(Exception e){oLog.error(e);}
				}
				tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }				if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
				  IActionRequest actionRequest = pzAuto.getActionRequest();
				  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
				  pzAuto.registerActionRequest(actionRequest);
				}
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzExplorerCaseTypes",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
						if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
						tools.appendString("\",\"UITemplatingStatus\":\"Y");
						}
						tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
						if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
						tools.appendString("menu-format-standard");
						}
						else{
						tools.appendString("Standard");
						}
						tools.appendString("\" , \"loadBehavior\":");
						if(pzAuto.isOffline() || false) {
						tools.appendString("\"screenload\"");
						}else{
						tools.appendString("\"ondisplay\"");
						}
						tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009556");
						if(pzAuto.isOffline() || false) {
						try{
						pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009556","", false, false, false, false);
						}catch(Exception e){oLog.error(e);}
						}
						tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></i>");
		}						}
menubarIncludes_1();						if(pzAuto.doOnlyOnce("ControlMenu")){
							if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
						}
						}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }						tools.putParamValue("doAutoFormatting", "false");
						tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}						} catch (Exception e) {

						
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'						&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }							}


}

public void repeatingDataCell_8() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:35px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxIcon_4();
									tools.appendString("</DIV>"); } else { pxIcon_4();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxLink_4() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20191101061327097353644",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","pzExplorerCaseTypes_$CTX$_24");
		String repeatIndx = "";
	modePage2.put("styles","");
	String pyTooltip = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyLabel");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyLabel", ".pyActionPrompt");
	pyTooltip = ".pyLabel";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("imgSrc","none");
	modePage2.put("actionImgPos","left");
	String customStyles = null;
	String pyLabel = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyLabel");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyLabel", ".pyButtonLabel");
	pyLabel = ".pyLabel";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","propertyReference");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash28 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash28 != null && !"".equals(spxUniqueStreamHash28)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash28,pxUniqueStreamHash+"_28");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_28");
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
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_24'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20191101061327097353644") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);			tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}			tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());			tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}			tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			pzPackageRuntime.packageHarness("pzCaseTypeLP",
			"Rule-Obj-Class"
			,"Display","0");
			}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{
				StringBuffer ractURLStr = new StringBuffer();
				StringBuffer ractParamStr = new StringBuffer();
				ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
				tools.appendString("[\"runActivity\", [\"\", \"");
				ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
				tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
				if(!"".equals(ractParamStr.toString())) {
					ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
					}
					tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
					}
					tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);					tools.appendString("\"]");
					tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);					tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}					tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());					tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}					tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);					tools.appendString("\"]");
					if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					pzPackageRuntime.packageHarness("pzCaseTypeLP",
					"Rule-Obj-Class"
					,"Display","0");
					}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyParentLabel"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyTopLevelClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyCircumstanceVal"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyLabel"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt",tools.getProperty(".pyLabel").getStringValue()+"\t"+repeatIndx,StreamBuilder.FMT_LITERAL)) + "' ";
		tools.appendString(toolTipVal);tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");				}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }				tools.putParamValue("doAutoFormatting", "false");
				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}				} catch (Exception e) {

				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}

public void repeatingDataCell_7() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Case Types"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:37px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_4();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_4();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingHeaderCell_4() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyTemplateInputBox";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20191104074028061569678") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache4").equals("")) { tools.appendParamCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache4");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:25px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzExplorerCaseTypesPpxResults1colWidthCache4' id='D_pzExplorerCaseTypesPpxResults1colWidthCache4' value='" + tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache4") + "' />");
				if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
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
tools.appendString(" role='columnheader' aria-label='Referenced Data Objects' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160721093355058239712") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Referenced Data Objects"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache3").equals("")) { tools.appendParamCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache3");} else { tools.appendString("41.14441416893733"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:25px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzExplorerCaseTypesPpxResults1colWidthCache3' id='D_pzExplorerCaseTypesPpxResults1colWidthCache3' value='" + tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache3") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Referenced Data Objects", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
tools.appendString(" role='columnheader' aria-label='Type' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("202010311450390612592") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Type"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache2").equals("")) { tools.appendParamCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache2");} else { tools.appendString("13.896457765667575"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:25px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzExplorerCaseTypesPpxResults1colWidthCache2' id='D_pzExplorerCaseTypesPpxResults1colWidthCache2' value='" + tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache2") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Type", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
	String strFieldValue = ".pyLabel";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Case Types' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20191101061327097252702") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Case Types"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("height:27px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache1");} else { tools.appendString("41.14441416893733"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:25px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_pzExplorerCaseTypesPpxResults1colWidthCache1' id='D_pzExplorerCaseTypesPpxResults1colWidthCache1' value='" + tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthCache1") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Case Types", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
public void gridTemplatePartial_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
ClipboardProperty dataCells = null;
boolean isPartial = true;
boolean isQueryable = false;
Map configMap = new HashMap(); 
String gridAction = tools.getParamValue("listAction"); 
String DSName = tools.getParamValue("DSName"); 
String uniqueId = tools.getParamValue("instanceId"); 
String resultsClass = tools.getParamValue("pyResultsClass"); 
ClipboardPage gridMetadataPage = tools.findPage(tools.getParamValue("pxGridMetadataPage")); 
configMap.put("pxGridMetadataPage", gridMetadataPage); 
configMap.put("instanceId", uniqueId); 
configMap.put("pyContext", DSName); 
configMap.put("listAction", gridAction); 
int startIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"startIndex"); 
int endIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"endIndex"); 
int pxPageSize = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageSize"); 
int pxPageIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageIndex"); 
configMap.put("pxPageSize", pxPageSize); 
configMap.put("pxPageIndex", pxPageIndex); 
List<Integer> indices = pega.getUIEngine().getGridUtilities().getIndicesToBeChangeTracked();
if(indices != null){
configMap.put("indices", indices); 
}
if(startIndex > 0 && endIndex >= startIndex){ 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
} 
gridWrapper.put("resultsClass",resultsClass); 
metadataPage.put("uniqueId",uniqueId); 
metadataPage.putMetadata("gridWrapper",gridWrapper);
gridTemplateBody_1(dataCells, metadataPage, configMap, isPartial, "pxGrid1" ); 
}
public void generateGridSections_1(IUIComponentMetadata metadataPage, ClipboardPage gridMetadataPage) {
IUIComponentMetadata gridSectionsInfo = pzAuto.getUIComponentRuntime().createMetadata();
Map<String, Object> sectionParams = new HashMap<>();
String pageId = pxUniqueStreamHash+"_25";
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
ClipboardPage gridResultsPage = tools.createPage(pageListClassName, "gridResultsPage"+pageId);
PRStackFrame gridResultsPageFrame = pega.pushStackFrame(gridResultsPage.getName(), null, gridResultsPage, false, false); 
com.google.gson.JsonObject gridTable = metadataPage.getNestedObject("gridTable");
gridTable.addProperty("noDataText",tools.getLocalizedTextForString("pyCaption","No case types found"));
pega.popStackFrame(gridResultsPageFrame, false);
gridResultsPage.removeFromClipboard(); 
ClipboardPage filterPage = tools.createPage("Pega-UI-Component-Grid-Filter", "filterPage");
sectionParams.put("usingPage", filterPage.getName()); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_26","pyFilterIcon", sectionParams);
gridSectionsInfo.put("pxGridFilterIconId",pxUniqueStreamHash+"_26");
sectionParams.clear(); 
filterPage.removeFromClipboard(); 
metadataPage.put("isToolBar",false);
if(gridSectionsInfo.getObject().entrySet().size() > 0){
metadataPage.putMetadata("gridSectionsInfo",gridSectionsInfo);
}
}
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }	if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
	  IActionRequest actionRequest = pzAuto.getActionRequest();
	  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
	  pzAuto.registerActionRequest(actionRequest);
	}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("pzExplorerCaseTypes",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName() + "\",\"isTemplatizedGrid\":\"true");
			if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
			tools.appendString("\",\"UITemplatingStatus\":\"Y");
			}
			tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			tools.appendString("menu-format-standard");
			}
			else{
			tools.appendString("Standard");
			}
			tools.appendString("\" , \"loadBehavior\":");
			if(pzAuto.isOffline() || false) {
			tools.appendString("\"screenload\"");
			}else{
			tools.appendString("\"ondisplay\"");
			}
			tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009522");
			if(pzAuto.isOffline() || false) {
			try{
			pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009522","", false, false, false, false);
			}catch(Exception e){oLog.error(e);}
			}
			tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			  IActionRequest actionRequest = pzAuto.getActionRequest();
			  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
			  pzAuto.registerActionRequest(actionRequest);
			}
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				try{
					pzPackageRuntime.packageSection("pzExplorerCaseTypes",
					tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
					}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
					}
					tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName() + "\",\"isTemplatizedGrid\":\"true");
					if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
					tools.appendString("\",\"UITemplatingStatus\":\"Y");
					}
					tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
					if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
					tools.appendString("menu-format-standard");
					}
					else{
					tools.appendString("Standard");
					}
					tools.appendString("\" , \"loadBehavior\":");
					if(pzAuto.isOffline() || false) {
					tools.appendString("\"screenload\"");
					}else{
					tools.appendString("\"ondisplay\"");
					}
					tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009525");
					if(pzAuto.isOffline() || false) {
					try{
					pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009525","", false, false, false, false);
					}catch(Exception e){oLog.error(e);}
					}
					tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}					String returnString = actionsStringBuilder.toString();
					tools.popStreamBody();
					return returnString;
				}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_22","pzCaseDataObjects", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	inputType = "NoInput";
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzCaseDataObjects"; 
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
	tools.getParameterPage().remove("SectionReadOnly");
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_21","pzDisplayCaseTypeCategory", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	inputType = "NoInput";
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzDisplayCaseTypeCategory"; 
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
	tools.getParameterPage().remove("SectionReadOnly");
}
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);			tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}			tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());			tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}			tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			pzPackageRuntime.packageHarness("pzCaseTypeLP",
			"Rule-Obj-Class"
			,"Display","0");
			}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{
				StringBuffer ractURLStr = new StringBuffer();
				StringBuffer ractParamStr = new StringBuffer();
				ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
				tools.appendString("[\"runActivity\", [\"\", \"");
				ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
				tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
				if(!"".equals(ractParamStr.toString())) {
					ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
					}
					tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
					}
					tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);					tools.appendString("\"]");
					tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);					tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}					tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());					tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}					tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);					tools.appendString("\"]");
					if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					pzPackageRuntime.packageHarness("pzCaseTypeLP",
					"Rule-Obj-Class"
					,"Display","0");
					}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyParentLabel"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyTopLevelClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyCircumstanceVal"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyLabel"), -1);
		}}catch(Exception e){}					String returnString = actionsStringBuilder.toString();
					tools.popStreamBody();
					return returnString;
				}
public void pushActionPropertieForCT_1() {
}


public void pxLink_3() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20191101061327097353644",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","pzExplorerCaseTypes_$CTX$_24");
		String repeatIndx = "";
	modePage2.put("styles","");
	String pyTooltip = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyLabel");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyLabel", ".pyActionPrompt");
	pyTooltip = ".pyLabel";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("imgSrc","none");
	modePage2.put("actionImgPos","left");
	String customStyles = null;
	String pyLabel = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyLabel");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyLabel", ".pyButtonLabel");
	pyLabel = ".pyLabel";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","propertyReference");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","none");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash20 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash20 != null && !"".equals(spxUniqueStreamHash20)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash20,pxUniqueStreamHash+"_20");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_20");
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
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_24'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20191101061327097353644") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);			tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}			tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());			tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}			tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			pzPackageRuntime.packageHarness("pzCaseTypeLP",
			"Rule-Obj-Class"
			,"Display","0");
			}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{
				StringBuffer ractURLStr = new StringBuffer();
				StringBuffer ractParamStr = new StringBuffer();
				ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
				tools.appendString("[\"runActivity\", [\"\", \"");
				ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
				tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
				if(!"".equals(ractParamStr.toString())) {
					ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
					}
					tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
					}
					tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);					tools.appendString("\"]");
					tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);					tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}					tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());					tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}					tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);					tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);					tools.appendString("\"]");
					if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					pzPackageRuntime.packageHarness("pzCaseTypeLP",
					"Rule-Obj-Class"
					,"Display","0");
					}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyParentLabel"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyTopLevelClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyCircumstanceVal"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyLabel"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt",tools.getProperty(".pyLabel").getStringValue()+"\t"+repeatIndx,StreamBuilder.FMT_LITERAL)) + "' ";
		tools.appendString(toolTipVal);tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");				}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }				tools.putParamValue("doAutoFormatting", "false");
				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}				} catch (Exception e) {

				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}



public void pxIcon_3() {				boolean isDisplayTextWithParam = false;
				String displayTextParamName = "";
				String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
				try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }				if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
					IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
					IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
					IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
					IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
					java.util.List<String> ctPropRefs = new ArrayList<String>();
					IUIComponent ctrlComponent = pzAuto.getUIComponent();
					String expressionId = null;
					com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
					IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
					modePage1.put("generateName","true");
					cellPage.put("pyStreamName","pzExplorerCaseTypes");
					cellPage.put("pyCellID","27");
					pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
					String repeatIndx = "";
					boolean disable = false;
					if(expressionId !=null && expressionId.length() > 0){
					modePage1.put("pyExpressionId",expressionId);
					}
					String pyTooltip = "";
					if(pega.getPackageRuntime().canPackage()){
						tools.getLocalizedTextForString(".pyActionPrompt","More options\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
					} else {
						pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("More options", ".pyActionPrompt");
					}
					pyTooltip = "More options";
					modePage1.put("tooltip",pyTooltip);
					modePage1.put("helpertype","tooltip");
					modePage1.put("isActionabale","true");
					modePage1.put("isClickable","true");
					String pyFormatValue = "";
					StringMap whenHc=new HashStringMap();
					whenHc.putString("pyBlockName", "pyIsHybridClient");
					String classProp = "";
					classProp ="pi pi-dot-3";
					modePage1.put("class",classProp);
					if(disable){
					modePage1.put("pyDisabled",disable+"");
					}
					modePage1.put("iconSrc","styleclass");
					modePage1.put("pyFormatTypeActionable","none");
					cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20191104074028061670924") + " ");
					String spxUniqueStreamHash24 = getUIActionsMetaData_3();
					if(spxUniqueStreamHash24 != null && !"".equals(spxUniqueStreamHash24)){
					pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash24,pxUniqueStreamHash+"_24");
					modePage1.put("pyActionStringID",pxUniqueStreamHash+"_24");
					}
					cellPage.addMetadataInArray("pyModes",modePage1);
					cellPage.addMetadataInArray("pyModes",modePage2);
					metadataPage.putMetadata("pyCell",cellPage);
					ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
					if (!pzAuto.hasStaticContentJSOptimization() ) {
						ctrlComponent.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
						ctrlComponent.addAdditionalFragment("MenuBarOld","pzMenuBarInclude");
					}
					ctrlComponent.beginComponent("pxIcon",metadataPage);
					ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
					tools.putParamValue("isControlEditableOriginal", true);
					ctrlComponent.endComponent();
					} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_27'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		String alttempText = tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL);
		String classProp = "";
		 classProp ="pi pi-dot-3";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("20191104074028061670924") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
			tools.appendString(" alt= '");
			tools.appendString(alttempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }						if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
						  IActionRequest actionRequest = pzAuto.getActionRequest();
						  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
						  pzAuto.registerActionRequest(actionRequest);
						}
						if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
							try{
								pzPackageRuntime.packageSection("pzExplorerCaseTypes",
								tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
								}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
								}
								tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName() + "\",\"isTemplatizedGrid\":\"true");
								if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
								tools.appendString("\",\"UITemplatingStatus\":\"Y");
								}
								tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
								if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
								tools.appendString("menu-format-standard");
								}
								else{
								tools.appendString("Standard");
								}
								tools.appendString("\" , \"loadBehavior\":");
								if(pzAuto.isOffline() || false) {
								tools.appendString("\"screenload\"");
								}else{
								tools.appendString("\"ondisplay\"");
								}
								tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009528");
								if(pzAuto.isOffline() || false) {
								try{
								pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009528","", false, false, false, false);
								}catch(Exception e){oLog.error(e);}
								}
								tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }								if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
								  IActionRequest actionRequest = pzAuto.getActionRequest();
								  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
								  pzAuto.registerActionRequest(actionRequest);
								}
								if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
									try{
										pzPackageRuntime.packageSection("pzExplorerCaseTypes",
										tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
										}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
										}
										tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName() + "\",\"isTemplatizedGrid\":\"true");
										if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
										tools.appendString("\",\"UITemplatingStatus\":\"Y");
										}
										tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
										if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
										tools.appendString("menu-format-standard");
										}
										else{
										tools.appendString("Standard");
										}
										tools.appendString("\" , \"loadBehavior\":");
										if(pzAuto.isOffline() || false) {
										tools.appendString("\"screenload\"");
										}else{
										tools.appendString("\"ondisplay\"");
										}
										tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009531");
										if(pzAuto.isOffline() || false) {
										try{
										pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009531","", false, false, false, false);
										}catch(Exception e){oLog.error(e);}
										}
										tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></i>");
		}										}
menubarIncludes_1();										if(pzAuto.doOnlyOnce("ControlMenu")){
											if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
										}
										}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }										tools.putParamValue("doAutoFormatting", "false");
										tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}										} catch (Exception e) {

										
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'										&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }											}


}

public void gridTemplateBody_1(ClipboardProperty dataCells, IUIComponentMetadata metadataPage, Map configMap, boolean isPartial, String tempGridName) {
ClipboardPage gridMetadataPage = (ClipboardPage)configMap.get("pxGridMetadataPage"); 
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
boolean newPageCreated = false; 
ClipboardPage itemPage = null; 
String pageListProperty = (String)configMap.get("pyContext"); 
pageListProperty = pzAuto.getUIComponentRuntime().getResolvedRefernce(pageListProperty); 
ClipboardProperty cpSource = tools.getProperty(pageListProperty); 
if(null != cpSource){ 
Iterator itemPages = cpSource.iterator(); 
if(itemPages.hasNext()) { 
 itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
}
}
if(null == itemPage){
itemPage = tools.createPage(pageListClassName,"");
newPageCreated = true; 
}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus(); 
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y'); 
if(!isPartial){ 
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
if(org.apache.commons.lang3.StringUtils.isNotBlank((String)configMap.get("pyContext"))){
IUIComponent cc_grid = pzAuto.getUIComponent();
if(!isPartial){ 
cc_grid.addAdditionalBundles("RepeatingGrid", "pzpega_grid_staticbundle");
cc_grid.addAdditionalScripts("RepeatingGrid", "pzpega_ui_template_paginate.js");
} 
if(!isPartial && !pzAuto.isForOfflineTemplate()){ 
metadataPage.put("pxFilterConditionId",pxUniqueStreamHash+"_18");
gridMetadataPage.putString("pxFilterConditionId", pxUniqueStreamHash+"_18");
} 
if(!isPartial){ 
metadataPage.put("pyRowVisibleCondition"," axpzRowMatchesSearchText");
gridMetadataPage.putString("pyRowVisibleCondition", " axpzRowMatchesSearchText");
} 
String sectionBodyPath = ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2)";
ClipboardPage gridStatePage = null;
cc_grid.beginComponent(tempGridName, metadataPage, configMap);
String oldSectionReadOnly = tools.getParamValue("SectionReadOnly"); 
tools.putParamValue("SectionReadOnly","-1"); 
boolean inputEnabledStatus = tools.hasInputEnabled();
tools.setInput(false);
IUIComponent gridBodyComp = pzAuto.getUIComponent();
gridBodyComp.beginComponent("pxGridBody",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent gridHeaderRowComp = pzAuto.getUIComponent(); 
gridHeaderRowComp.beginComponent("pxGridHeaderRow",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent headerHtmlComp = null; 
IUIComponentMetadata headermetadata_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
headermetadata_1 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Case Types",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_1); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
headermetadata_2 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Type",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_2); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
headermetadata_3 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Referenced Data Objects",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_3); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
headermetadata_4 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("","",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_4); 
headerHtmlComp.endComponent(); 


 
gridHeaderRowComp.endComponent(); 
PRStackFrame itemFrame = pega.pushStackFrame("GridFirstRowItem", null, itemPage, true, false); 
IUIComponent gridRowComp = pzAuto.getUIComponent(IUIComponent.ComponentType.GRID); 
gridRowComp.beginComponent("pxGridDataRow",pzAuto.getUIComponentRuntime().createMetadata(), configMap); 
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("pzInsKey");
pushActionPropertieForCT_1();
IUIComponent cellHtmlComp = null; 
IUIComponentMetadata cellMetaData_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
cellMetaData_1 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxLink",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_1); 
if(itemPage != null){
pxLink_3();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
cellMetaData_2 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayCaseTypeCategory",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_2); 
if(itemPage != null){
sectionBodyIncludeInCell_3();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
cellMetaData_3 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("SUB_SECTION","pzCaseDataObjects",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_3); 
if(itemPage != null){
sectionBodyIncludeInCell_4();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
cellMetaData_4 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_4); 
if(itemPage != null){
pxIcon_3();
}
cellHtmlComp.endComponent(); 


 
pega.popStackFrame(itemFrame, false); 
gridRowComp.endComponent(); 
if(!isPartial){ 
generateGridSections_1(metadataPage, gridMetadataPage);
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
gridBodyComp.endComponent(); 
cc_grid.endComponent();
tools.putParamValue("SectionReadOnly",oldSectionReadOnly); 
tools.setInput(inputEnabledStatus);
}else { 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_18","pyNextGenGridNoResultsMessage","@baseclass","",false,null);
}
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(currentTemplatingStatus); 
if(newPageCreated){
itemPage.removeFromClipboard(); 
}
tools.putParamValue("paramIndexValue",""); 
tools.putParamValue("skipTracking","false"); 
}
public void generateGridCellModes_1(String strGridMetadataPage) {
ClipboardPage gridMetadataPage = tools.findPage(strGridMetadataPage, true);
List<String> modesList = new ArrayList<String>(); 
modesList.add(""); 
modesList.add(""); 
modesList.add(""); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyIconStyle>pi pi-dot-3</pyIconStyle><pyMediaAutoplay>false</pyMediaAutoplay><pyRunOnClient>false</pyRunOnClient><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyWhenNotMet>hide</pyWhenNotMet><pyUIElement>icon</pyUIElement><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyTooltip>More options</pyTooltip><pyCannedIcon>pxIcon</pyCannedIcon><pyStyleName>Standard</pyStyleName><pyDirection>vertical</pyDirection><pyFormatTypeActionable>none</pyFormatTypeActionable><pyHelperTextType>tooltip</pyHelperTextType><pyImageSize>auto</pyImageSize><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyModeType>Read-Only</pyModeType><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pySpecifySize>auto</pySpecifySize><pyObfuscated>false</pyObfuscated><pyFormatType>text</pyFormatType><pyMediaLoop>false</pyMediaLoop><pyMediaPreload>auto</pyMediaPreload><pyDisabledNew>false</pyDisabledNew><pyDisabled>false</pyDisabled><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyIconSource>styleclass</pyIconSource><pyIconShow>false</pyIconShow><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyLabel>Button</pyLabel><pyTextAlign>Left</pyTextAlign><pyContent>associated</pyContent><pxSubscript>2</pxSubscript><pyBehaviors REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Control-Mode-Behaviors</pxObjClass><pyActionLabel>Menu</pyActionLabel><pyUIElement>icon</pyUIElement><pyExpanded>false</pyExpanded><pyAction>showMenu</pyAction><pyEvent>click</pyEvent><pyActionAPI><pyActivityClassOrig>Rule-Obj-Class</pyActivityClassOrig><pyActivityClass>Rule-Obj-Class</pyActivityClass><pxObjClass>Embed-SelectedContextAPI-ShowMenu</pxObjClass><pxCreateOperator>veers2</pxCreateOperator><pyLoadBehavior>ondisplay</pyLoadBehavior><pxCreateDateTime>20191104T123945.340 GMT</pxCreateDateTime><pyDataSource>pzMenuForCaseLauncher</pyDataSource><pyEllipsisAfter>999</pyEllipsisAfter><pyMenuAlign>left</pyMenuAlign><pxCreateSystemID>sls-envhyd84</pxCreateSystemID><pyFormat>Standard</pyFormat><pyMaxWidth>auto</pyMaxWidth><pxCreateOpName>Sasi Bhushan Veeramachaneni</pxCreateOpName><pyActionAPI><pxObjClass>Embed-DesktopAPI</pxObjClass></pyActionAPI><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pyActionAPI><pyActionConditions REPEATINGTYPE=\"PageList\"/><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Embed-Control-Mode-Behaviors</pxObjClass><pyUIElement>icon</pyUIElement><pyActionLabel>Menu</pyActionLabel><pyExpanded>false</pyExpanded><pyAction>showMenu</pyAction><pyEvent>keyboard</pyEvent><pyKeyCode>enter</pyKeyCode><pyActionAPI><pyActivityClassOrig>Rule-Obj-Class</pyActivityClassOrig><pyActivityClass>Rule-Obj-Class</pyActivityClass><pxObjClass>Embed-SelectedContextAPI-ShowMenu</pxObjClass><pxCreateOperator>veers2</pxCreateOperator><pyLoadBehavior>ondisplay</pyLoadBehavior><pxCreateDateTime>20191104T123945.340 GMT</pxCreateDateTime><pyEllipsisAfter>999</pyEllipsisAfter><pyDataSource>pzMenuForCaseLauncher</pyDataSource><pyMenuAlign>left</pyMenuAlign><pxCreateSystemID>sls-envhyd84</pxCreateSystemID><pyMaxWidth>auto</pyMaxWidth><pyFormat>Standard</pyFormat><pxCreateOpName>Sasi Bhushan Veeramachaneni</pxCreateOpName><pyActionAPI><pxObjClass>Embed-DesktopAPI</pxObjClass></pyActionAPI><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pyActionAPI><pyActionConditions REPEATINGTYPE=\"PageList\"/><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></rowdata></pyBehaviors><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
ClipboardProperty gridMetaColumns = gridMetadataPage.getProperty("pyColumns"); 
java.util.Iterator it = gridMetaColumns.iterator(); 
ClipboardPage pyModesPage = tools.createPage("@baseclass", "pyModesPage"); 
while(it.hasNext()) { 

ClipboardPage columnProp = ((ClipboardProperty)it.next()).getPageValue(); 
boolean noModes = columnProp.getPage("pyModes").isEmpty(); 
if(noModes) { 
int index = columnProp.getInteger(".pyInitialOrder") - 1; 
String strModesXML = modesList.get(index); 
if(!org.apache.commons.lang.StringUtils.isBlank(strModesXML)){ 
	try { 
		pyModesPage.adoptXMLForm(strModesXML); 
        columnProp.putPage(".pyModes", pyModesPage); 
	} catch (InvalidStreamError e) { 
		oLog.error(e); 
	} 
} 
} 
} 
pyModesPage.removeFromClipboard(); 
}


public void D_pzExplorerCaseTypes_pxResults_2() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-up='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-down='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public String 
getGridActions_1() {
	boolean directStream = ((PegaStreamAPI)tools).isDirectStreaming();
	if(directStream) {
		((PegaStreamAPI)tools).disableDirectStreaming();
	}
	String currentStream = tools.getCurrentStream();
	D_pzExplorerCaseTypes_pxResults_2();
	String returnString = tools.getCurrentStream();
	tools.appendString(currentStream);
	if(directStream) {
		((PegaStreamAPI)tools).forceDirectStreaming();
	}
	return returnString;
}
public void getGridMetaData_1(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
metadataPage.put("pyWidthOfContent","%");
gridWrapper.put("responsive","true");
gridWrapper.put("contentClass","grid-responsive-default  gPercent ");
gridWrapper.put("pzClass","default");
gridWrapper.put("DPName","D_pzExplorerCaseTypes.pxResults");
gridWrapper.put("propType","Property");
gridWrapper.put("resultsClass","Rule-Obj-Class");
String dataTestId = pzAuto.getTestIdIfEnabled("20191101061151031041", true); 
if(!"".equalsIgnoreCase(dataTestId)){
gridWrapper.put("automationId","20191101061151031041");
}
gridWrapper.put("isFilteringEnabled","true");
gridWrapper.put("isColumnResizeEnabled","true");
gridWrapper.put("isColumnReorderEnabled","true");
gridWrapper.put("isRefreshListEnabled","false");
gridWrapper.put("pyPassCurrentParamPage","false");
gridWrapper.put("isSortingEnabled","true");
gridWrapper.put("isRowHeightEnabled","false");
gridWrapper.put("isColumnTogglerEnabled","false");
gridWrapper.put("isPersonalizationEnabled","false");
gridWrapper.put("isCategorizationEnabled","false");
gridWrapper.put("isRowVisibilityEnabled","true");
IUIComponentMetadata gridTable = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata rowOperations = pzAuto.getUIComponentRuntime().createMetadata();
gridTable.put("isDPParameterized","false");
gridTable.put("inlinestyle","width:100%;");
gridTable.put("gridSummary",tools.getLocalizedTextForString("pyCaption",""));
gridTable.put("gridCaption",tools.getLocalizedTextForString("pyCaption",""));
gridWrapper.put("hasRowOperations","false");
pega.getUIEngine().getGridUtilities().populateLocalizedText(gridWrapper, gridTable);
if(!pzAuto.isForOfflineTemplate()){
metadataPage.put("pyShowFiltersInModal","false");
}
gridWrapper.put("sectionName","pzExplorerCaseTypes");
gridWrapper.put("sectionClass","Pega-Ext-ExpExplorer-Case");
metadataPage.putMetadata("gridTable",gridTable);
metadataPage.putMetadata("rowOperations",rowOperations);
}
public void gridTemplateMain_1(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
Map dpParamsMap = new HashMap();
String gridXML = "<?xml version=\"1.0\"?><pagedata><pxObjClass>Pega-UI-Component-Grid</pxObjClass><pyWidthOfContent>%</pyWidthOfContent><pzStatus>false</pzStatus><pzGridTable><pxObjClass>Pega-UI-Component-Grid-GridTable</pxObjClass><pzStyle>width:100%;</pzStyle></pzGridTable><pyDataCells REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>false</pyColumnFiltering><pyColumnSorting>false</pyColumnSorting><pyCellWidth>300px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Auto</pyEditOptions><pyHeaderLabel>Case Types</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyLabel</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnFiltering>false</pyColumnFiltering><pyColumnSorting>false</pyColumnSorting><pyCellWidth>100px</pyCellWidth><pyContentType>SUB_SECTION</pyContentType><pyEditOptions>Auto</pyEditOptions><pyHeaderLabel>Type</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>pzDisplayCaseTypeCategory</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnVisibility>IV</pyColumnVisibility><pyColumnFiltering>false</pyColumnFiltering><pyColumnSorting>false</pyColumnSorting><pyCellWidth>300px</pyCellWidth><pyContentType>SUB_SECTION</pyContentType><pyEditOptions>Auto</pyEditOptions><pyHeaderLabel>Referenced Data Objects</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>pzCaseDataObjects</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnFiltering>false</pyColumnFiltering><pyColumnSorting>false</pyColumnSorting><pyCellWidth>26px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Auto</pyEditOptions><pyPropertyName>.pyTemplateInputBox</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata></pyDataCells><pzGridWrapper><pxObjClass>Pega-UI-Component-Grid-GridWrapper</pxObjClass><pzContentClass>grid-responsive-default  gPercent </pzContentClass><pzPropertyType>Property</pzPropertyType><pyResultsClass>Rule-Obj-Class</pyResultsClass><pzClass>default</pzClass><pyDataPageName>D_pzExplorerCaseTypes.pxResults</pyDataPageName><pyResponsive>true</pyResponsive><pyAutomationID>20191101061151031041</pyAutomationID></pzGridWrapper></pagedata>";
ClipboardPage temp_gridConfigPage = tools.createPage(null,"temp_gridConfigPage");
try {
  temp_gridConfigPage.adoptXMLForm(gridXML);
} catch(InvalidStreamError e){oLog.error(e);}
getGridMetaData_1(metadataPage,gridWrapper);
Map configMap = new HashMap(); 
ClipboardPage gridMetadataPage = tools.createPage("Pega-UI-Component-Grid-Filter","GridMetadata_Main"+pzAuto.getUIComponentRuntime().generateUniqueId());
gridMetadataPage.putString(".pySectionClass","Pega-Ext-ExpExplorer-Case");
gridMetadataPage.putString(".pySectionName","pzExplorerCaseTypes");
configMap.put("pxGridMetadataPage", gridMetadataPage); 
gridMetadataPage.putString("pyFilteringEnabled", "true");
gridMetadataPage.putString("pySortingEnabled", "true");
gridMetadataPage.putString(".pyIsCategorizationEnabled", "false");
metadataPage.put("gridActions",getGridActions_1().trim());
String strDSName = gridWrapper.getString("DPName"); 
String strDSNameWithToken = pzAuto.getUIComponentRuntime().generateTokensForString(strDSName);
gridWrapper.put("pageListProp",strDSNameWithToken);
String strDSNameWithResolved = pzAuto.getUIComponentRuntime().getResolvedRefernce(strDSName);
gridMetadataPage.putString("pyPageList",strDSNameWithResolved);
boolean isQueryable = gridMetadataPage.getBoolean("isQueryable");
ClipboardProperty dataCells = temp_gridConfigPage.getProperty(".pyDataCells"); 
temp_gridConfigPage.remove(".pyDataCells"); 
ClipboardPage gridStatePage = null;
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
pega.getUIEngine().getGridUtilities().registerGridActiviy();
configMap.put("params", dpParamsMap); 
configMap.put("pyContext", strDSName); 
configMap.put("listAction", "INIT"); 
configMap.put("pyCollectProps", "true"); 
configMap.put("pxDataSourceId", pxUniqueStreamHash+"_17");
gridWrapper.put("datasrcid",pxUniqueStreamHash+"_17");
if(isQueryable){
gridWrapper.put("isPagingEnabled","true");
gridWrapper.put("isSearchEnabled","false");
}else {
gridWrapper.put("isSearchEnabled","false");
gridWrapper.put("isPagingEnabled","true");
}
IUIComponentMetadata pagingSettings = pzAuto.getUIComponentRuntime().createMetadata();
com.pega.pegarules.priv.util.PaginatorMetaData.getPaginationMetaData(30, 1, strDSNameWithToken,"Numeric",pzAuto, "", metadataPage, pagingSettings); 
   int startIndex = 1; 
   int endIndex = 0; 
   int pxResultCount = Integer.parseInt(pagingSettings.getString("pageSize")); 
   endIndex = pxResultCount; 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
configMap.put("pxPageSize", pxResultCount); 
configMap.put("pxPageIndex", 1); 
gridWrapper.put("cellMethodName","generateGridCellModes_1");
if(isQueryable){
boolean isTablecategorized = false; 
if(gridStatePage != null) {
ClipboardPage tempPage = tools.createPage("System-User-Grids", "tempPage"); 
 tempPage.putAll(gridStatePage, ClipboardPage.PUTALL_KEEPNEW); 
tempPage.putString("isFilteringEnabled",gridMetadataPage.getString("pyFilteringEnabled"));
tempPage.putString("isSortingEnabled",gridMetadataPage.getString("pySortingEnabled"));
tempPage.putString("pxPageSize",gridMetadataPage.getString("pxPageSize"));
tempPage.putString("pxPageIndex",gridMetadataPage.getString("pxPageIndex"));
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(tempPage.getProperty("pyColumns"),tempPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(true ,tempPage);
tempPage.removeFromClipboard();
}else {
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(dataCells,gridMetadataPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(false ,gridMetadataPage);
}
isQueryable = gridMetadataPage.getBoolean("isQueryable");
if(isQueryable){
pega.getUIEngine().getGridUtilities().mergeColumnInfo(dataCells,gridMetadataPage);
gridWrapper.put("isQueryable","true");
if(isTablecategorized) {
configMap.put("isQueryable", "false"); 
}else{
configMap.put("isQueryable", "true"); 
}
}else{
}
}
gridWrapper.put("ctMethodName","gridTemplatePartial_1");
metadataPage.putMetadata("gridWrapper",gridWrapper);
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage(); 
gridTemplateBody_1(dataCells, metadataPage, configMap, false, "pxGrid");
temp_gridConfigPage.removeFromClipboard(); 
tools.putParamValue("isDPParameterized",""); 
gridMetadataPage.removeFromClipboard();
dataCells.removeFromClipboard();
gridUtilities.clearVisitedFlagInGridState(gridStatePage);
}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzExplorerCaseTypesBBB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzExplorerCaseTypesBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void gridTemplateInit_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
gridTemplateMain_1(metadataPage, gridWrapper);
}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Numeric"; 

 String strPageSize = "30"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPageD_pzExplorerCaseTypes_pxResultsL5=null;

 Map selUniqMapD_pzExplorerCaseTypes_pxResultsL5 = null;

 Set filteredIndicesSetD_pzExplorerCaseTypes_pxResultsL5 = null;

	 String strFCPage = "pyFilterCriteria_D_pzExplorerCaseTypes.pxResults_pzExplorerCaseTypes_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

	 gFCritPageD_pzExplorerCaseTypes_pxResultsL5 = tools.findPage(strFCPage, true);

	 if(gFCritPageD_pzExplorerCaseTypes_pxResultsL5==null){gFCritPageD_pzExplorerCaseTypes_pxResultsL5 = tools.createPage("Pega-GridFilterCriteria", strFCPage);}

tools.putParamValue("pyGridFilterCriteriaPage", strFCPage);

gFCritPageD_pzExplorerCaseTypes_pxResultsL5.getProperty("pyRowVisibleWhenCondition").setValue("pzRowMatchesSearchText");

  selUniqMapD_pzExplorerCaseTypes_pxResultsL5 = null; // reset the variable

 if(gFCritPageD_pzExplorerCaseTypes_pxResultsL5 != null){ 

 		 filteredIndicesSetD_pzExplorerCaseTypes_pxResultsL5 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_pzExplorerCaseTypes_pxResultsL5, "D_pzExplorerCaseTypes.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_pzExplorerCaseTypes_pxResultsL5);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapD_pzExplorerCaseTypes_pxResultsL5 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_pzExplorerCaseTypes_pxResultsL5); 

 		 tools.getParameterPage().put("selUniqMapD_pzExplorerCaseTypes_pxResultsL5", selUniqMapD_pzExplorerCaseTypes_pxResultsL5);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div id='CT' RLW='true' RRLocalsP=\".pyIsVisible\" RRW=\".pyIsVisible changes\" type=\"allLocals\"><div  section_index='1' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pzExplorerCaseTypes.pxResults").getReference());tools.appendString("_pzExplorerCaseTypes_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("20191101061151031041") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='nextGenReadOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' bRowVisibleWhen = 'true' OAFunc='openRuleByKeys' ");
D_pzExplorerCaseTypes_pxResults_1();
tools.appendString(">");


 ClipboardProperty pageListProp = null;

 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


 int currentPageIndex = 0; 

 if(startIndex == 0){ startIndex = 1; } 

 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

 tools.putParamValue("pyPageMode", strPageMode); 


 tools.putParamValue("pyPageSize", "30"); 

 tools.putSaveValue("pyPageSize", "30"); 

 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 

 tools.putParamValue("startIndex",startIndex); 

 tools.putParamValue("currentPageIndex",currentPageIndex); 

 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

 tools.putParamValue("endPageIndex",endPageIndex); 
if(tools.findPage("D_pzExplorerCaseTypes", true)!=null) {
pageListProp = tools.getProperty("D_pzExplorerCaseTypes.pxResults");
}

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","D_pzExplorerCaseTypes.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("D_pzExplorerCaseTypes.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageD_pzExplorerCaseTypes_pxResultsL5!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pzExplorerCaseTypes_pxResultsL5, selUniqMapD_pzExplorerCaseTypes_pxResultsL5);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageD_pzExplorerCaseTypes_pxResultsL5== null || bFilterResult) {
						
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
						pageListProp = tools.getProperty("D_pzExplorerCaseTypes.pxResults"); }
						
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
					ClipboardPage gFCritPageD_pzExplorerCaseTypes_pxResultsL5=null;
					Map selUniqMapD_pzExplorerCaseTypes_pxResultsL5 = null;
					selUniqMapD_pzExplorerCaseTypes_pxResultsL5 = null; // reset the variable
					gFCritPageD_pzExplorerCaseTypes_pxResultsL5=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
							 selUniqMapD_pzExplorerCaseTypes_pxResultsL5 = (Map)tools.getParameterPage().getObject("selUniqMapD_pzExplorerCaseTypes_pxResultsL5");
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

					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")){

					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_pzExplorerCaseTypes.pxResults");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyLabel   .pyTemplateInputBox  ' class='yui-skin-sam gPercent grid-responsive-default ");

					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					tools.appendString("' gPropIndex='D_pzExplorerCaseTypesPpxResults1' editRowIndex='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" pyPageSize = '");

					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("20191101061151031041-layout") + " ");

					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_pzExplorerCaseTypesPpxResults1colWidthGBL\" id=\"D_pzExplorerCaseTypesPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"D_pzExplorerCaseTypesPpxResults1colWidthGBR\" id=\"D_pzExplorerCaseTypesPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pzExplorerCaseTypesPpxResults1colWidthGBR"));

					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					
					 if(!("".equals(tools.getParamValue("D_pzExplorerCaseTypesPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' bColumnResize=\"true\" PL_PROP='");

					
					
					
					
					
					
tools.appendString("D_pzExplorerCaseTypes.pxResults");

					
					
					
					
					
					tools.appendString("' PL_PROP_CLASS='Rule-Obj-Class' PRIM_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					
					
					
					
					
					 repeatingHeaderCell_1(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					
								 itr_3 = tools.getProperty("D_pzExplorerCaseTypes.pxResults").iterator(); 

					
					
					
					
					
					
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
										 } else if(gFCritPageD_pzExplorerCaseTypes_pxResultsL5!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pzExplorerCaseTypes_pxResultsL5, selUniqMapD_pzExplorerCaseTypes_pxResultsL5);
										 }
										 if (gFCritPageD_pzExplorerCaseTypes_pxResultsL5== null || 

					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

					
					
					
					
					
					
										 tools.getStepPage().getProperty("pyExpanded").setValue("true");

					
					
					
					
					
					}

					
					
					
					
					
					
										 counter++; 

					
					
					
					
					
					 if( !"".equals(tools.getParamValue("startIndex")) && !"".equals(tools.getParamValue("recordsInCurrentPage")) && ((counter>=(Integer.parseInt(tools.getParamValue("startIndex"))) && rowsDisplayed<(Integer.parseInt(tools.getParamValue("recordsInCurrentPage")))))) {

					
					
					
					
					
											try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
					
					
							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyIsVisible"), -1);

					
					
					
					
					
					}}catch(Exception e){e.printStackTrace();}

					
					
					
					
					
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

					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_pzExplorerCaseTypes.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					 
								 }

					
					
					
					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
					
					
 }}catch(Exception e){}

					
					
					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					
					
					gridOpenActionIncl_1();

					
					
					
					
					
					tools.appendString(" id='");

					
					
					
					
					
					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("' ");

					
					
					
					
					
					{

					
					
					
					
					
					String tempTestID = "";

					
					
					
					
					
					String rowTestID = "R";

					
					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzExplorerCaseTypes.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzExplorerCaseTypes.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzExplorerCaseTypes.pxResults"); } catch (Exception ex) { }

					
					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					
					}

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20191101061151031041-" + rowTestID) + " ");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_7(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_8(); 

					
					
					
					
					
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

					
					
					
					
					
					
 	 } else {

					
					
					
					
					
					boolean noItemsRowVisibleWhen = true;

					
					
					
					
					
					ClipboardPage pyGridFilterCriteriaPage = tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

					
					
					
					
					
					if (pyGridFilterCriteriaPage.getProperty("pyColumnFilterCriteria").size() != 0) {

					
					
					
					
					
						java.util.Iterator colItr = pyGridFilterCriteriaPage.getProperty("pyColumnFilterCriteria").iterator();

					
					
					
					
					
					while(colItr.hasNext()) {

					
					
					
					
					
						ClipboardProperty curCol = (ClipboardProperty)colItr.next();

					
					
					
					
					
					ClipboardPage curColPage = curCol.getPageValue();

					
					
					
					
					
						if (curColPage.getIfPresent("pyFilterCriteriaType") != null && curColPage.getIfPresent("pyUniqueValues") != null && curColPage.getIfPresent("pyUniqueValues").size() != 0) {

					
					
					
					
					
							noItemsRowVisibleWhen = false;

					
					
					
					
					
							break;

					
					
					
					
					
						}

					
					
					
					
					
					} }

					
					
					
					
					
					if (noItemsRowVisibleWhen) { tools.putParamValue("showOnLoadMsg", "showOnLoadMsg"); }

					
					
					
					
					
					
 	 } 

					
					
					
					
					
					 String tempRenderSingle = tools.getParamValue("RenderSingle");

					
					
					
					
					
					 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"4\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Rule-Obj-Class", "tempNoRespg");

					
					
					
					
					
					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
					
					
					
					
					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					
					
					
					
					
					if(tools.getParamValue("showOnLoadMsg").equals("showOnLoadMsg")) {

					
					
					
					
					
					tools.appendString(tools.getLocalizedTextForString("pyCaption","No case types found"));

					
					
					
					
					
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

					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_pzExplorerCaseTypes.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
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

					
					
					
					
					tools.appendString("</td></tr></table>");

					
					
					
					
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

					
					
					
					
					String paramName = "EXPANDEDSubSectionpzExplorerCaseTypesBBB";

					
					
					
					
					metadataPage.put("paramName", paramName);

					
					
					
					
					String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");

					
					
					
					
					if(!inspectorLayoutData.isEmpty()) {

					
					
					
					
					metadataPage.put("liveUI", inspectorLayoutData);

					
					
					
					
					}

					
					
					
					
					String pyPrefix = null;

					
					
					
					
					metadataPage.put("sectionIndex","4");

					
					
					
					
					IUIComponent containerComponent = pzAuto.getUIComponent();

					
					
					
					
					com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();

					
					
					
					
					boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2!= rxD_pzExplorerCaseTypes.pxResultCount ci0", pxUniqueStreamHash+"_31");metadataPage.put("dlChild","true");

					
					
					
					
					metadataPage.put("lMode","Inline-block");

					
					
					
					
					IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();

					
					
					
					
					pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_31");

					
					
					
					
					metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);

					
					
					
					
					containerComponent.beginComponent("pxLayoutContainer",metadataPage);

					
					
					
					
					if(pyVisibility) {

					
					
					
					
					pzLayoutBody_1();

					
					
					
					
					}

					
					
					
					
					containerComponent.endComponent();

					
					
					
					
					runtimeContextTree.endVisibleWhen();

					
					
					
					
					}
public void pzLayout_2() {
String gridLayoutMethodName="pzLayout_2";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2!= rxD_pzExplorerCaseTypes.pxResultCount ci0","D_pzExplorerCaseTypes.pxResultCount != 0", "layout", "visible" )) {pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_1();
return;}pzLayoutBodyWrapper_5();
 LayoutWrapperTableEnd_1(); }
}
}
tools.putParamValue("gridLayoutMethodName","");
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}


public void generateClientWhenDiv_2() {
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


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2!= rxD_pzExplorerCaseTypes.pxResultCount ci0","D_pzExplorerCaseTypes.pxResultCount != 0","cell", "visible" )) {
		return index;
	}
	generateClientWhenDiv_2();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2!= rxD_pzExplorerCaseTypes.pxResultCount ci0",pxUniqueStreamHash+"_33");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_33");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","D_pzExplorerCaseTypes.pxResultCount != 0");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Pega-Ext-ExpExplorer-Case");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_33");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2!= rxD_pzExplorerCaseTypes.pxResultCount ci0", pxUniqueStreamHash+"_33"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzExplorerCaseTypesBB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash14 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash14 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash14,pxUniqueStreamHash+"_14");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
	if("".equals(strMethodName)) {
	strMethodName = tools.getParamCSF("pyLayoutMethodName");
	}
	refreshAttributes += "data-refresh=true data-methodName=\"";
	refreshAttributes += strMethodName;
	refreshAttributes +="\""; 
	refreshAttributes += " RWP=\".pySearchText\" RW=\"D_pzExplorerSearch.pySearchText Changes\" ";
	
	String strDTransform = "";
	strDTransform = "";
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_pzExplorerSearch.pySearchText"), -1);
		}
	}catch(Exception e){}
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202002130606420670180") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_15";
		try{
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_pzExplorerSearch.pySearchText Changes", expressionId);
		expressionId = expression.getId();
		}
		catch(ClassCastException e){
		expressionId = "";
		}
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_16";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  "D_pzExplorerCaseTypes.pxResultCount != 0",expressionId);
			if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
			pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_14");
			}
			if(!StringUtils.isBlank(expressionId)) {
			pg_dlmeta.put("pyExpressionId",expressionId);
			}
			if(!"".equals(strMethodName))
			pg_dlmeta.put("methodnm",strMethodName);
			pg_dlmeta.put("format","default");
			String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
			if(!inspectorData.equals("\"\"")) {
			pg_dlmeta.put("liveUI",inspectorData);
			}
			pg_dlmeta.put("isDLChild","true");
			pg_dlmeta.put("clear","false");
			pg_dlmeta.put("lMode","SimpleDiv");
			pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
			cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
			}
			int index = 1;
			if(currentTemplatingStatus != 'Y') {
			index=simpleLayoutCell_2(index);
	}else{
			index=simpleLayoutTemplateCell_2(index);
	}
			if(currentTemplatingStatus != 'Y'){
			tools.appendString("</div>");
			if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
			tools.appendString("</div></div>");
			tools.putParamValue("bIsWrapperAdded", "false");
			}
			}else {
			cc_dl.endComponent();
			}
			pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
		}
		public void pzLayoutContainer_2() {
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_34";
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen", "D_pzExplorerCaseTypes.pxResultCount != 0", expressionId);
		expressionId = expression.getId();
		String expressionId_BV = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
		if(!StringUtils.isBlank(expressionId_BV)) {
			metadataPage.put("expressionId_BV",expressionId_BV);
		}
		String paramName = "EXPANDEDSubSectionpzExplorerCaseTypesBB";
		String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
		if(!inspectorLayoutData.isEmpty()) {
		metadataPage.put("liveUI", inspectorLayoutData);
		}
		String pyPrefix = null;
		IUIComponent containerComponent = pzAuto.getUIComponent();
		metadataPage.put("dlChild","true");
		metadataPage.put("lMode","SimpleDiv");
		containerComponent.beginComponent("pxLayoutContainer",metadataPage);
		pzLayoutBody_2();
		containerComponent.endComponent();
		}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_6();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_2();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","D_pzExplorerSearch");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_13","pzCaseExplorerSearch", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	{tools.putParamValue("decParamList","{}");tools.putParamValue("sectionPageNameBase","D_pzExplorerSearch");}
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
	String sectionName = "pzCaseExplorerSearch"; 
	String usingPage = null;
	usingPage = "D_pzExplorerSearch";
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
pzSection.getLayout().setExpandParam("SubSectionCellpzExplorerCaseTypes808","",false);
}
public void pzLayout_1() {
pzSetExpandParam_2();
pzLayoutBodyWrapper_4();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","D_pzExplorerSearch");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_9","pzCaseExplorerSearch", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	{tools.putParamValue("decParamList","{}");tools.putParamValue("sectionPageNameBase","D_pzExplorerSearch");}
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
	String sectionName = "pzCaseExplorerSearch"; 
	String usingPage = null;
	usingPage = "D_pzExplorerSearch";
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
tools.appendString(" SWP=\".pxResultCount\"  SHOW_WHEN=\"D_pzExplorerCaseTypes.pxResultCount != 0\"");
if(pzAuto.evaluateWhen("D_pzExplorerCaseTypes.pxResultCount != 0",null,true)){
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
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges("D_pzExplorerCaseTypes.pxResultCount", -1);
	}
}catch(Exception e){}
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
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzCaseExplorerSearch",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	expressionId = pxUniqueStreamHash+"_12";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  "D_pzExplorerCaseTypes.pxResultCount != 0", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzCaseExplorerSearch",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_1();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	expressionId = pxUniqueStreamHash+"_37";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  "D_pzExplorerCaseTypes.pxResultCount != 0", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_3();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzNoExplorerCaseTypes",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	expressionId = pxUniqueStreamHash+"_41";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  "D_pzExplorerCaseTypes.pxResultCount == 0", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzNoExplorerCaseTypes",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_4();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzExplorerCaseTypesB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash7 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash7 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash7,pxUniqueStreamHash+"_7");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
	if("".equals(strMethodName)) {
	strMethodName = tools.getParamCSF("pyLayoutMethodName");
	}
	refreshAttributes += "data-refresh=true data-methodName=\"";
	refreshAttributes += strMethodName;
	refreshAttributes +="\""; 
	refreshAttributes += " RWP=\".pxResultCount\" RW=\"D_pzExplorerCaseTypes.pxResultCount Changes\" ";
	
	String strDTransform = "";
	strDTransform = "";
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_pzExplorerCaseTypes.pxResultCount"), -1);
		}
	}catch(Exception e){}
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201911010626030221958") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-stacked content-stacked cs-styled-grid-wrapper" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_8";
		try{
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_pzExplorerCaseTypes.pxResultCount Changes", expressionId);
		expressionId = expression.getId();
		}
		catch(ClassCastException e){
		expressionId = "";
		}
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_7");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","cs-styled-grid-wrapper");
		pg_dlmeta.put("format","stacked");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
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
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("</div></div>");
		tools.putParamValue("bIsWrapperAdded", "false");
		}
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
	String paramName = "EXPANDEDSubSectionpzExplorerCaseTypesB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_3();
	containerComponent.endComponent();
	}
public void pzLayout_5() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_8();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_3() {
pzLayoutBodyWrapper_2();
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_2() {

if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxIcon_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_27'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		String alttempText = tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL);
		String classProp = "";
		 classProp ="pi pi-dot-3";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("20191104074028061670924") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
			tools.appendString(" alt= '");
			tools.appendString(alttempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
  IActionRequest actionRequest = pzAuto.getActionRequest();
  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
  pzAuto.registerActionRequest(actionRequest);
}
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("pzExplorerCaseTypes",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
		if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
		tools.appendString("\",\"UITemplatingStatus\":\"Y");
		}
		tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
		if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
		tools.appendString("menu-format-standard");
		}
		else{
		tools.appendString("Standard");
		}
		tools.appendString("\" , \"loadBehavior\":");
		if(pzAuto.isOffline() || false) {
		tools.appendString("\"screenload\"");
		}else{
		tools.appendString("\"ondisplay\"");
		}
		tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009471");
		if(pzAuto.isOffline() || false) {
		try{
		pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009471","", false, false, false, false);
		}catch(Exception e){oLog.error(e);}
		}
		tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
		  IActionRequest actionRequest = pzAuto.getActionRequest();
		  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
		  pzAuto.registerActionRequest(actionRequest);
		}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("pzExplorerCaseTypes",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
				if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
				tools.appendString("\",\"UITemplatingStatus\":\"Y");
				}
				tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
				if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
				tools.appendString("menu-format-standard");
				}
				else{
				tools.appendString("Standard");
				}
				tools.appendString("\" , \"loadBehavior\":");
				if(pzAuto.isOffline() || false) {
				tools.appendString("\"screenload\"");
				}else{
				tools.appendString("\"ondisplay\"");
				}
				tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009474");
				if(pzAuto.isOffline() || false) {
				try{
				pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009474","", false, false, false, false);
				}catch(Exception e){oLog.error(e);}
				}
				tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></i>");
		}menubarIncludes_1();				if(pzAuto.doOnlyOnce("ControlMenu")){
					if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
				}
				}
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");				tools.putParamValue("doAutoFormatting", "false");
				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}				} catch (Exception e) {

				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}

public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:35px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxIcon_2();
									tools.appendString("</DIV>"); } else { pxIcon_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxLink_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_24'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20191101061327097353644") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }{
	StringBuffer ractURLStr = new StringBuffer();
	StringBuffer ractParamStr = new StringBuffer();
	ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
	tools.appendString("[\"runActivity\", [\"\", \"");
	ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
	tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
	if(!"".equals(ractParamStr.toString())) {
		ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
		}
		tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
		}
		tools.appendString("\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);		tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}		tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());		tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}		tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		pzPackageRuntime.packageHarness("pzCaseTypeLP",
		"Rule-Obj-Class"
		,"Display","0");
		}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
			StringBuffer ractURLStr = new StringBuffer();
			StringBuffer ractParamStr = new StringBuffer();
			ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
			tools.appendString("[\"runActivity\", [\"\", \"");
			ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
			tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
			if(!"".equals(ractParamStr.toString())) {
				ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
				}
				tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
				}
				tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);				tools.appendString("\"]");
				tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);				tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}				tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());				tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}				tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);				tools.appendString("\"]");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				pzPackageRuntime.packageHarness("pzCaseTypeLP",
				"Rule-Obj-Class"
				,"Display","0");
				}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyParentLabel"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyTopLevelClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyCircumstanceVal"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyLabel"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt",tools.getProperty(".pyLabel").getStringValue()+"\t"+repeatIndx,StreamBuilder.FMT_LITERAL)) + "' ";
		tools.appendString(toolTipVal);tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");				tools.putParamValue("doAutoFormatting", "false");
				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}				} catch (Exception e) {

				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}

public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Case Types"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:37px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_2();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void menubarIncludes_1() {
pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}


public void pxIcon_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_27'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		String alttempText = tools.getLocalizedTextForString(".pyActionPrompt","More options\t" + repeatIndx ,StreamBuilder.FMT_LITERAL);
		String classProp = "";
		 classProp ="pi pi-dot-3";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("20191104074028061670924") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
			tools.appendString(" alt= '");
			tools.appendString(alttempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
  IActionRequest actionRequest = pzAuto.getActionRequest();
  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
  pzAuto.registerActionRequest(actionRequest);
}
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("pzExplorerCaseTypes",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
		if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
		tools.appendString("\",\"UITemplatingStatus\":\"Y");
		}
		tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
		if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
		tools.appendString("menu-format-standard");
		}
		else{
		tools.appendString("Standard");
		}
		tools.appendString("\" , \"loadBehavior\":");
		if(pzAuto.isOffline() || false) {
		tools.appendString("\"screenload\"");
		}else{
		tools.appendString("\"ondisplay\"");
		}
		tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009444");
		if(pzAuto.isOffline() || false) {
		try{
		pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009444","", false, false, false, false);
		}catch(Exception e){oLog.error(e);}
		}
		tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
		  IActionRequest actionRequest = pzAuto.getActionRequest();
		  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
		  pzAuto.registerActionRequest(actionRequest);
		}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("pzExplorerCaseTypes",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzMenuForCaseLauncher\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
				if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
				tools.appendString("\",\"UITemplatingStatus\":\"Y");
				}
				tools.appendString("\",\"menuAlign\":\"left\",\"format\":\"");
				if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
				tools.appendString("menu-format-standard");
				}
				else{
				tools.appendString("Standard");
				}
				tools.appendString("\" , \"loadBehavior\":");
				if(pzAuto.isOffline() || false) {
				tools.appendString("\"screenload\"");
				}else{
				tools.appendString("\"ondisplay\"");
				}
				tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771686009447");
				if(pzAuto.isOffline() || false) {
				try{
				pega_uiengine_pzcontrol.pzGetMenu("pzMenuForCaseLauncher", "", "pyNavigation1771686009447","", false, false, false, false);
				}catch(Exception e){oLog.error(e);}
				}
				tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></i>");
		}menubarIncludes_1();				if(pzAuto.doOnlyOnce("ControlMenu")){
					if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
				}
				}
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");				tools.putParamValue("doAutoFormatting", "false");
				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}				} catch (Exception e) {

				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}

public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:35px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxIcon_1();
									tools.appendString("</DIV>"); } else { pxIcon_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pzCaseDataObjects_1() {
pzAuto.emitIncludeStreamReference("pzCaseDataObjects", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_3() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Referenced Data Objects"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzCaseDataObjects", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString(" headers='a3' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:35px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	tools.putParamValue("section_params","");
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzCaseDataObjects_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void pzDisplayCaseTypeCategory_1() {
pzAuto.emitIncludeStreamReference("pzDisplayCaseTypeCategory", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_2() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Type"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayCaseTypeCategory", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:35px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	tools.putParamValue("section_params","");
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzDisplayCaseTypeCategory_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
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


public void pxLink_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzExplorerCaseTypes_"+ referenceString+ "_24'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20191101061327097353644") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }{
	StringBuffer ractURLStr = new StringBuffer();
	StringBuffer ractParamStr = new StringBuffer();
	ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
	tools.appendString("[\"runActivity\", [\"\", \"");
	ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
	tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
	if(!"".equals(ractParamStr.toString())) {
		ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
		}
		tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
		}
		tools.appendString("\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);		tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}		tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());		tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}		tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		pzPackageRuntime.packageHarness("pzCaseTypeLP",
		"Rule-Obj-Class"
		,"Display","0");
		}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
			StringBuffer ractURLStr = new StringBuffer();
			StringBuffer ractParamStr = new StringBuffer();
			ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetSelectedCaseType");
			tools.appendString("[\"runActivity\", [\"\", \"");
			ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
			tools.appendString("\", \"\", \":event\", \"\", \"\", \"\", \"");
			if(!"".equals(ractParamStr.toString())) {
				ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
				}
				tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
				}
				tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);				tools.appendString("\"]");
				tools.appendString("],[\"showHarnessWrapper\",[\"newDocument\",\"");

		tools.appendFormatted("Rule-Obj-Class",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("pzCaseTypeLP",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("pzPrepareCaseTypeLP",StreamBuilder.FMT_NORMAL);				tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("lpParampyClassName","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");}{propRefJSON.addProperty("lpParamImmediateParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyParentLabel")+"~#");}{propRefJSON.addProperty("lpParamTopMostParent","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyTopLevelClassName")+"~#");}{propRefJSON.addProperty("lpParampyCircumstanceVal","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyCircumstanceVal")+"~#");}{propRefJSON.addProperty("lpTitle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");}{jObject.addProperty("lpParamIsCaseOpenedFromUCC", "");}{jObject.addProperty("lpDisplayDataModelTab", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}				tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());				tools.appendString("\",\"");

		tools.appendFormatted(tools.getLocalizedTextForString("pyCaption", "EditModeExpressTab"),StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"No\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();com.google.gson.JsonObject jObjectWithParam = new com.google.gson.JsonObject();if(!"{}".equals(propRefJSON.toString())){jObjectWithParam.add("pyDataTransformDynamicParams",propRefJSON);}jObjectWithParam.addProperty("pyDataTransform", "pzSetExpressSkinForEditMode");jObjectWithParam.add("pyDataTransformParams", jObject);
		tools.appendFormatted(jObjectWithParam.toString(),StreamBuilder.FMT_NORMAL);}				tools.appendString(",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);				tools.appendString("\"]");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				pzPackageRuntime.packageHarness("pzCaseTypeLP",
				"Rule-Obj-Class"
				,"Display","0");
				}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				tools.appendString("[\"runScript\", [\"formFactorIframe.hideFormFactorIframe()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyParentLabel"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyTopLevelClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyCircumstanceVal"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyLabel"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt",tools.getProperty(".pyLabel").getStringValue()+"\t"+repeatIndx,StreamBuilder.FMT_LITERAL)) + "' ";
		tools.appendString(toolTipVal);tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");				tools.putParamValue("doAutoFormatting", "false");
				tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}				} catch (Exception e) {

				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}

public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Case Types"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:37px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_1();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxLink_1();}
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


public void D_pzExplorerCaseTypes_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-up='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-down='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

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

					if(tools.getParamValue("partialTrigger").equals("appendToD_pzExplorerCaseTypes.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowD_pzExplorerCaseTypes.pxResults1") ){

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

					ClipboardProperty pageListProp = tools.getProperty("D_pzExplorerCaseTypes.pxResults");

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pzExplorerCaseTypes.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzExplorerCaseTypes.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzExplorerCaseTypes.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzExplorerCaseTypes.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20191101061151031041-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					activeName = tools.getActiveName();  repeatingDataCell_3(); 

					activeName = tools.getActiveName();  repeatingDataCell_4(); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_pzExplorerCaseTypes.pxResults1")) {

					
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

					
		 pageListProp = tools.getProperty("D_pzExplorerCaseTypes.pxResults");

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_pzExplorerCaseTypes.pxResults1")) { 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_pzExplorerCaseTypes.pxResults1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty("D_pzExplorerCaseTypes.pxResults");

					
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

					
											try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyIsVisible"), -1);

					
					}}catch(Exception e){e.printStackTrace();}

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
					
						 tools.putParamValue("expandRL","true");

					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pzExplorerCaseTypes.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pzExplorerCaseTypes.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pzExplorerCaseTypes.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pzExplorerCaseTypes.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20191101061151031041-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_5(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_3(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_6(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
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
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Pega-Ext-ExpExplorer-Case");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-EndUserUI");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzExplorerCaseTypes");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("gridTemplatePartial_1", new String[][] {});
pzExternalMethodMapping.put("generateGridCellModes_1", new String[][] { {"strGridMetadataPage", "String", ""}});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION PEGA-EXT-EXPEXPLORER-CASE PZEXPLORERCASETYPES #20230618T002048.954 GMT", "Pega-Ext-ExpExplorer-Case pzExplorerCaseTypes", "Pega-EndUserUI", "08-23-01", "20230803T192647.117 GMT");
}
