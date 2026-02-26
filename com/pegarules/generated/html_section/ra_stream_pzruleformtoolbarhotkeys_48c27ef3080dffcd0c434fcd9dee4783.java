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
 * Builds JSP stream @BASECLASS!PZRULEFORMTOOLBARHOTKEYS.
 */
public class ra_stream_pzruleformtoolbarhotkeys_48c27ef3080dffcd0c434fcd9dee4783 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleFormToolbarHotKeys.Data_Admin_Operator_ID.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -240717161;
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
	public ra_stream_pzruleformtoolbarhotkeys_48c27ef3080dffcd0c434fcd9dee4783(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "de4376724dbb7cf80947d85ad87ce8c134e5fad7";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT	Pega-Desktop:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "de4376724dbb7cf80947d85ad87ce8c134e5fad7";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleFormToolbarHotKeys",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT */
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
	"Rule-HTML-Section:PZRULEFORMTOOLBARHOTKEYS", 
	"Rule-HTML-Property:PXMENU", 
	"Rule-HTML-Property:PXBUTTON"
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
		new DependentRuleInfo("PZRULEFORMTOOLBARHOTKEYS","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-04-01","RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT","!PZRULEFORMTOOLBARHOTKEYS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-240717161), 
		new DependentRuleInfo("PXMENU","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXMENU #20190131T183501.609 GMT","PXMENU",true,false,"ABSOLUTE_CLASSLESS",786250596), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883)
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
//	RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT:20191127T083130.787 GMT
//	RULE-HTML-PROPERTY PXMENU #20190131T183501.609 GMT:20190131T183501.609 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-HTML-PROPERTY PXMENU #20190131T183501.609 GMT:20190131T183501.609 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDJSONVALUE--(STRING8F901A9DF674B9184A2C782BF6532117 #20190219T093521.972 GMT:20190219T093521.972 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENURLINWINDOW #20190717T074339.248 GMT:20191031T072346.716 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNACTIVITY #20190830T074358.805 GMT:20190830T074358.805 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNDATATRANSFORM--(CLIPB9514A9C33ADD6709FD6A843ADA2991DD #20220104T102659.447 GMT:20220104T102659.447 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSHOWHARNESS--(CLIPBOARDPB0E4216D380188E48B403B96B76CE8F0 #20190218T093631.826 GMT:20190219T093521.982 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDDTACTION--(CLIPBOARDPROPE42DB21F900D3B3C81891D406B4B08598 #20190219T093521.991 GMT:20190219T093521.991 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEMENU #20190205T102848.614 GMT:20190531T073908.638 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEMENUSCRIPTS #20180713T133346.297 GMT:20180713T133346.297 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVNODELEVELDEFERLOADED--(STRING,STRING,CLIPBOARDPAGE) #20180713T133346.455 GMT:20180713T133346.455 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVNODELEVELDEFERLOADEDINNER--(CLIPBOARDPAGE) #20180713T133346.450 GMT:20180713T133346.450 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
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
		return "7c1606a7e26e17fa8630820a6d03493a";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
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
  pzSection.beginSection("pzRuleFormToolbarHotKeys",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzRuleFormToolbarHotKeys','insKey':'RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT','sectionType':'standard'}");
pzLayout_1();
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
config = new HashMap<String, String>();
config.put("navName", "pzRuleFormToolbarMenu");
pega.getUIEngine().getUIAction("showMenu", config).register();
config = new HashMap<String, String>();
config.put("navName", "pzRuleFormToolbarSaveMenu");
pega.getUIEngine().getUIAction("showMenu", config).register();
config = new HashMap<String, String>();
config.put("pyPreActivity", "Visualize");
config.put("insName", "");
config.put("objClass", "");
config.put("category", "PREVIEW");
pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzSetFiltersForRuleReferences");
config.put("ShowVersionsAndCircumstances", "false");
config.put("pzDataTransformStaticParams", "ShowVersionsAndCircumstances&ViewReferencesRuleSets");
config.put("ViewReferencesRuleSets", "All");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("ObjClass", "");
config.put("ShowVersionsAndCircumstances", "");
config.put("pzActivityStaticParams", "InsName&ObjClass&bFromFilters&ShowVersionsAndCircumstances");
config.put("bFromFilters", "false");
config.put("InsName", "");
config.put("pzActivity", "pzLoadRuleReferences");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.ruleform_slidepanel.show");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyPreActivity", "Rule-.GetSiblings");
pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
config = new HashMap<String, String>();
config.put("harnessName", "pzGeneratedJava");
config.put("className", "@baseclass");
config.put("readOnly", "true");
config.put("preActivity", "pzShowJava");
config.put("target", "popup");
pega.getUIEngine().getUIAction("showHarness", config).register();
config = new HashMap<String, String>();
config.put("SkipNewLineRemoval", "");
config.put("pyPreActivity", "ShowXMLOfPage");
config.put("RemovePage", "");
config.put("ReturnAsParam", "");
config.put("PageName", "Primary");
config.put("XMLString", "");
pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
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
public String 
getUIActionsMetaData_6() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=ShowXMLOfPage");
	} else {
	tools.appendString("&amp;pyPreActivity=ShowXMLOfPage");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&PageName=");
	} else {
	tools.appendString("&amp;PageName=");
	}
	tools.appendString("Primary");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&RemovePage=");
	} else {
	tools.appendString("&amp;RemovePage=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&ReturnAsParam=");
	} else {
	tools.appendString("&amp;ReturnAsParam=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&SkipNewLineRemoval=");
	} else {
	tools.appendString("&amp;SkipNewLineRemoval=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&XMLString=");
	} else {
	tools.appendString("&amp;XMLString=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public void pxButton_5() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("201801101029510962950") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleFormToolbarHotKeys_$CTX$_7");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "hotkey-ruleform-viewxml";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","viewXml\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("viewXml", ".pyButtonLabel");
	}
	pyLabel = "viewXml";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash26 = getUIActionsMetaData_6();
	if(spxUniqueStreamHash26 != null && !"".equals(spxUniqueStreamHash26)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash26,pxUniqueStreamHash+"_26");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_26");
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
		 String buttonUID = "name='pzRuleFormToolbarHotKeys_"+ referenceString+ "_7'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("201801101029510962950") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=ShowXMLOfPage");
	} else {
	tools.appendString("&amp;pyPreActivity=ShowXMLOfPage");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&PageName=");
	} else {
	tools.appendString("&amp;PageName=");
	}
	tools.appendString("Primary");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&RemovePage=");
	} else {
	tools.appendString("&amp;RemovePage=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&ReturnAsParam=");
	} else {
	tools.appendString("&amp;ReturnAsParam=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&SkipNewLineRemoval=");
	} else {
	tools.appendString("&amp;SkipNewLineRemoval=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&XMLString=");
	} else {
	tools.appendString("&amp;XMLString=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="hotkey-ruleform-viewxml";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="viewXml".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","viewXml",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public String 
getUIActionsMetaData_5() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"showHarnessWrapper\",[\"popup\",\"");

		tools.appendString("@baseclass");	tools.appendString("\",\"");

		tools.appendFormatted("pzGeneratedJava",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("pzShowJava",StreamBuilder.FMT_NORMAL);	tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{jObject.addProperty("", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}	tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());	tools.appendString("\",\"Yes\",\"scrollbars=yes,resizable=1,width=");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString(",height=");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyShowJavaWindowName")+"~#");	tools.appendString("\",\"\",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzPackageRuntime.packageHarness("pzGeneratedJava",
	"@baseclass"
	,"Display","-1");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyShowJavaWindowName"), -1);
		}}catch(Exception e){}	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public void pxButton_4() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2018010916285906977765") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleFormToolbarHotKeys_$CTX$_6");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "hotkey-ruleform-viewjava";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","viewJava\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("viewJava", ".pyButtonLabel");
	}
	pyLabel = "viewJava";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash22 = getUIActionsMetaData_5();
	if(spxUniqueStreamHash22 != null && !"".equals(spxUniqueStreamHash22)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash22,pxUniqueStreamHash+"_22");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_22");
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
		 String buttonUID = "name='pzRuleFormToolbarHotKeys_"+ referenceString+ "_6'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("2018010916285906977765") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"showHarnessWrapper\",[\"popup\",\"");

		tools.appendString("@baseclass");	tools.appendString("\",\"");

		tools.appendFormatted("pzGeneratedJava",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("pzShowJava",StreamBuilder.FMT_NORMAL);	tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{jObject.addProperty("", "");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}	tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());	tools.appendString("\",\"Yes\",\"scrollbars=yes,resizable=1,width=");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString(",height=");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyShowJavaWindowName")+"~#");	tools.appendString("\",\"\",\":event\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);	tools.appendString("\",\"");

		tools.appendFormatted("false",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzPackageRuntime.packageHarness("pzGeneratedJava",
	"@baseclass"
	,"Display","-1");
	}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyShowJavaWindowName"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="hotkey-ruleform-viewjava";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="viewJava".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","viewJava",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=Rule-.GetSiblings");
	} else {
	tools.appendString("&amp;pyPreActivity=Rule-.GetSiblings");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pxObjClass=");
	} else {
	tools.appendString("&amp;pxObjClass=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxObjClass")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pxInsId=");
	} else {
	tools.appendString("&amp;pxInsId=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxInsId")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyClassName=");
	} else {
	tools.appendString("&amp;pyClassName=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyRuleSet=");
	} else {
	tools.appendString("&amp;pyRuleSet=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleSet")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyRuleSetVersion=");
	} else {
	tools.appendString("&amp;pyRuleSetVersion=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleSetVersion")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pzInsKey=");
	} else {
	tools.appendString("&amp;pzInsKey=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	tools.appendString("\", \"Siblings\", \"height=500,width=800,location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxObjClass"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pxInsId"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleSet"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleSetVersion"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}	String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20180110105445055726579") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleFormToolbarHotKeys_$CTX$_5");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "hotkey-ruleform-siblings";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","viewSiblings\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("viewSiblings", ".pyButtonLabel");
	}
	pyLabel = "viewSiblings";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash18 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash18 != null && !"".equals(spxUniqueStreamHash18)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash18,pxUniqueStreamHash+"_18");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_18");
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
		 String buttonUID = "name='pzRuleFormToolbarHotKeys_"+ referenceString+ "_5'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20180110105445055726579") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=Rule-.GetSiblings");
	} else {
	tools.appendString("&amp;pyPreActivity=Rule-.GetSiblings");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pxObjClass=");
	} else {
	tools.appendString("&amp;pxObjClass=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxObjClass")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pxInsId=");
	} else {
	tools.appendString("&amp;pxInsId=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxInsId")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyClassName=");
	} else {
	tools.appendString("&amp;pyClassName=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyRuleSet=");
	} else {
	tools.appendString("&amp;pyRuleSet=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleSet")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyRuleSetVersion=");
	} else {
	tools.appendString("&amp;pyRuleSetVersion=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleSetVersion")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pzInsKey=");
	} else {
	tools.appendString("&amp;pzInsKey=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	tools.appendString("\", \"Siblings\", \"height=500,width=800,location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxObjClass"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pxInsId"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleSet"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleSetVersion"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="hotkey-ruleform-siblings";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="viewSiblings".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","viewSiblings",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzSetFiltersForRuleReferences");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzSetFiltersForRuleReferences\", \"ShowVersionsAndCircumstances=false");
			actionRequestD.registerFixedParameter("ShowVersionsAndCircumstances","false");
			tools.appendString("&ViewReferencesRuleSets=All");
			actionRequestD.registerFixedParameter("ViewReferencesRuleSets","All");
			tools.appendString("\", \"" + usingPageString);
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			String contextClass;if(StringUtils.isBlank(usingPageString)){
			contextClass = tools.getStepPage().getString("pxObjClass");}else{
			 String oflineTmpUsgPg = usingPageString;
			if(oflineTmpUsgPg.contains("$CTX$")){
			oflineTmpUsgPg = oflineTmpUsgPg.replace("$CTX$",tools.getPrimaryPage().getReference());
			}if(oflineTmpUsgPg.matches("\\$PARENT(\\d)*\\$")){
			oflineTmpUsgPg = pzAuto.getUIComponentRuntime().replaceParentsKeyToken(oflineTmpUsgPg);}
			if(oflineTmpUsgPg.contains("$TOP$")){
			oflineTmpUsgPg = oflineTmpUsgPg.replace("$TOP$",tools.getStepPage().getTopLevelPage().getReference());}
			contextClass = tools.findPage(oflineTmpUsgPg, false).getString("pxObjClass");}
			pzPackageRuntime.packageDataTransform(contextClass, "pzSetFiltersForRuleReferences");
			}
				pzAuto.registerActionRequest(actionRequest);
				}
				tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				{
					StringBuffer ractURLStr = new StringBuffer();
					StringBuffer ractParamStr = new StringBuffer();
					ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzLoadRuleReferences");
					tools.appendString("[\"runActivity\", [\"\", \"InsHandle=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"InsName\":\"\"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"ObjClass\":\"\"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"bFromFilters\":\"false\"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"ShowVersionsAndCircumstances\":\"\"");
					tools.appendString("&ApplicationOnly=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken("RuleReferencesParams.pyViewReferencesRuleSets")+"~#");					ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
					tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
					if(!"".equals(ractParamStr.toString())) {
						ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
						}
						tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
						}
						tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"pega.desktop.ruleform_slidepanel.show(\\\"@baseclass\\\",\\\"pzRuleReferencesPanelWrapper\\\",\\\"pega.desktop.rulereferences.panelLoadCallback\\\",\\\"pega.desktop.rulereferences.cleanUp\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty("RuleReferencesParams.pyViewReferencesRuleSets"), -1);
		}}catch(Exception e){}						String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20180110105445055725901") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleFormToolbarHotKeys_$CTX$_4");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "hotkey-ruleform-references";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","referencingRules\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("referencingRules", ".pyButtonLabel");
	}
	pyLabel = "referencingRules";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash14 = getUIActionsMetaData_3();
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
		 String buttonUID = "name='pzRuleFormToolbarHotKeys_"+ referenceString+ "_4'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20180110105445055725901") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzSetFiltersForRuleReferences");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzSetFiltersForRuleReferences\", \"ShowVersionsAndCircumstances=false");
			actionRequestD.registerFixedParameter("ShowVersionsAndCircumstances","false");
			tools.appendString("&ViewReferencesRuleSets=All");
			actionRequestD.registerFixedParameter("ViewReferencesRuleSets","All");
			tools.appendString("\", \"" + usingPageString);
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			String contextClass;if(StringUtils.isBlank(usingPageString)){
			contextClass = tools.getStepPage().getString("pxObjClass");}else{
			 String oflineTmpUsgPg = usingPageString;
			if(oflineTmpUsgPg.contains("$CTX$")){
			oflineTmpUsgPg = oflineTmpUsgPg.replace("$CTX$",tools.getPrimaryPage().getReference());
			}if(oflineTmpUsgPg.matches("\\$PARENT(\\d)*\\$")){
			oflineTmpUsgPg = pzAuto.getUIComponentRuntime().replaceParentsKeyToken(oflineTmpUsgPg);}
			if(oflineTmpUsgPg.contains("$TOP$")){
			oflineTmpUsgPg = oflineTmpUsgPg.replace("$TOP$",tools.getStepPage().getTopLevelPage().getReference());}
			contextClass = tools.findPage(oflineTmpUsgPg, false).getString("pxObjClass");}
			pzPackageRuntime.packageDataTransform(contextClass, "pzSetFiltersForRuleReferences");
			}
				pzAuto.registerActionRequest(actionRequest);
				}
				tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				{
					StringBuffer ractURLStr = new StringBuffer();
					StringBuffer ractParamStr = new StringBuffer();
					ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzLoadRuleReferences");
					tools.appendString("[\"runActivity\", [\"\", \"InsHandle=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"InsName\":\"\"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"ObjClass\":\"\"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"bFromFilters\":\"false\"");
					ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"ShowVersionsAndCircumstances\":\"\"");
					tools.appendString("&ApplicationOnly=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken("RuleReferencesParams.pyViewReferencesRuleSets")+"~#");					ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
					tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
					if(!"".equals(ractParamStr.toString())) {
						ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
						}
						tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
						}
						tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"pega.desktop.ruleform_slidepanel.show(\\\"@baseclass\\\",\\\"pzRuleReferencesPanelWrapper\\\",\\\"pega.desktop.rulereferences.panelLoadCallback\\\",\\\"pega.desktop.rulereferences.cleanUp\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty("RuleReferencesParams.pyViewReferencesRuleSets"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="hotkey-ruleform-references";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="referencingRules".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","referencingRules",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");					}

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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }						}


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
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=Visualize");
	} else {
	tools.appendString("&amp;pyPreActivity=Visualize");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&insHandle=");
	} else {
	tools.appendString("&amp;insHandle=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&insName=");
	} else {
	tools.appendString("&amp;insName=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&objClass=");
	} else {
	tools.appendString("&amp;objClass=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&category=");
	} else {
	tools.appendString("&amp;category=");
	}
	tools.appendString("PREVIEW");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyStreamName")+"~#");	tools.appendString("\", \"height=600,width=700,location=0,menubar=0,toolbar=0,status=1,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyStreamName"), -1);
		}}catch(Exception e){}	String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20180110105445055724983") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleFormToolbarHotKeys_$CTX$_3");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "hotkey-ruleform-preview";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","preview\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("preview", ".pyButtonLabel");
	}
	pyLabel = "preview";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash10 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash10 != null && !"".equals(spxUniqueStreamHash10)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash10,pxUniqueStreamHash+"_10");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_10");
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
		 String buttonUID = "name='pzRuleFormToolbarHotKeys_"+ referenceString+ "_3'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20180110105445055724983") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=Visualize");
	} else {
	tools.appendString("&amp;pyPreActivity=Visualize");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&insHandle=");
	} else {
	tools.appendString("&amp;insHandle=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&insName=");
	} else {
	tools.appendString("&amp;insName=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&objClass=");
	} else {
	tools.appendString("&amp;objClass=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&category=");
	} else {
	tools.appendString("&amp;category=");
	}
	tools.appendString("PREVIEW");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyStreamName")+"~#");	tools.appendString("\", \"height=600,width=700,location=0,menubar=0,toolbar=0,status=1,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyStreamName"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="hotkey-ruleform-preview";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="preview".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","preview",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void generateMenu_2() {
/*generate menu markup*/
String uniqueTS = "";
uniqueTS = String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
String navPageName = "pyNavigation"+uniqueTS;
String uniqueMenuId = "";
uniqueMenuId = "@baseclasspzRuleFormToolbarSaveMenu2";
{
  IActionRequest actionRequest = pzAuto.getActionRequest();
  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
  actionRequest.registerFixedParameter("navPageName", navPageName);
  pzAuto.registerActionRequest(actionRequest);
}
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("pzRuleFormToolbarHotKeys",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage = pzAuto.getUIComponentRuntime().createMetadata();
		modePage.put("styleOther","menu-format-standard");
		modePage.put("nav","pzRuleFormToolbarSaveMenu");
		modePage.put("pyUniqueMenuID",uniqueMenuId);
		modePage.put("navPage",navPageName);
		String navPageRef = pxUniqueStreamHash+"_6";
		modePage.put("navPageRef",navPageRef);
		modePage.put("navDefer",(pzAuto.isOffline() ? "false" : "false"));
		modePage.put("navCache","true");
		modePage.put("MenuType","horizontal");
		modePage.put("isMobile",String.valueOf(pzAuto.isMobile()));
		modePage.put("usingPage",tools.getStepPage().getReference());
		cellPage.addMetadataInArray("pyModes",modePage);
		metadataPage.putMetadata("pyCell",cellPage);
			Map meta = new HashMap();
			IUIComponent cc = pzAuto.getUIComponent();
			cc.beginComponent("pxMenu",metadataPage);
			cc.addDependentBundles("pzPega_control_menu_scripts");
		if(pzAuto.isOffline()) {
		pega_uiengine_pzcontrol.pzGetMenu("pzRuleFormToolbarSaveMenu", "", navPageName,"", true , false,  (pzAuto.isOffline() ? false :false), true);
		} else {
		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_LOCALIZE, true);
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_IS_GRID, false);
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_IS_DEFER_LOAD, false);
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_IS_REMOVE_NAV_PAGE, true);
			pzAuto.getControl().executeNavRule("pzRuleFormToolbarSaveMenu", navPageName, "", navPageRef, options);
		}
			cc.endComponent();
		} else {
			pega_uiengine_pzcontrol.pzGetMenu("pzRuleFormToolbarSaveMenu", "", navPageName,"", true , false,  (pzAuto.isOffline() ? false :false), true);
			if(pzAuto.doOnlyOnce("ControlMenu")){
				if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
			}
			}
			tools.appendString("<div id='div-menu-" + uniqueTS + "' style='display:none;'></div><script type=\"text/javascript\">pega.control.menu.pxMenuManager.schedule(\"menu-" + uniqueTS + "\", {\"type\": \"horizontal\", \"format\": \"menu-format-standard\", \"menuID\": \"menu-" + uniqueTS + "\", \"navName\": \"pzRuleFormToolbarSaveMenu\", \"navPage\": \"" + navPageName + "\", \"navUID\": \"pzRuleFormToolbarSaveMenu_2\", \"isMobile\": \"" + pzAuto.isMobile() + "\", \"usingPage\": \"" + tools.getStepPage().getReference() + "\"");
			if(!pzAuto.isOffline() && false) {
			tools.appendString(", \"deferLoad\": \"false\", \"enableCache\": \"true\"");
			}
		tools.appendString("});</script>");
		}
		}


public void pxMenu_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

generateMenu_2();

		tools.putParamValue("pega_attributes","");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}} catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Ruleform Save As Menu");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void generateMenu_1() {
/*generate menu markup*/
String uniqueTS = "";
uniqueTS = String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
String navPageName = "pyNavigation"+uniqueTS;
String uniqueMenuId = "";
uniqueMenuId = "@baseclasspzRuleFormToolbarMenu1";
{
  IActionRequest actionRequest = pzAuto.getActionRequest();
  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
  actionRequest.registerFixedParameter("navPageName", navPageName);
  pzAuto.registerActionRequest(actionRequest);
}
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("pzRuleFormToolbarHotKeys",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage = pzAuto.getUIComponentRuntime().createMetadata();
		modePage.put("styleOther","menu-format-standard");
		modePage.put("nav","pzRuleFormToolbarMenu");
		modePage.put("pyUniqueMenuID",uniqueMenuId);
		modePage.put("navPage",navPageName);
		String navPageRef = pxUniqueStreamHash+"_3";
		modePage.put("navPageRef",navPageRef);
		modePage.put("navDefer",(pzAuto.isOffline() ? "false" : "false"));
		modePage.put("navCache","true");
		modePage.put("MenuType","horizontal");
		modePage.put("isMobile",String.valueOf(pzAuto.isMobile()));
		modePage.put("usingPage",tools.getStepPage().getReference());
		cellPage.addMetadataInArray("pyModes",modePage);
		metadataPage.putMetadata("pyCell",cellPage);
			Map meta = new HashMap();
			IUIComponent cc = pzAuto.getUIComponent();
			cc.beginComponent("pxMenu",metadataPage);
			cc.addDependentBundles("pzPega_control_menu_scripts");
		if(pzAuto.isOffline()) {
		pega_uiengine_pzcontrol.pzGetMenu("pzRuleFormToolbarMenu", "", navPageName,"", true , false,  (pzAuto.isOffline() ? false :false), true);
		} else {
		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_LOCALIZE, true);
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_IS_GRID, false);
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_IS_DEFER_LOAD, false);
		options.put(com.pega.pegarules.priv.runtime.IControlRuntime.B_IS_REMOVE_NAV_PAGE, true);
			pzAuto.getControl().executeNavRule("pzRuleFormToolbarMenu", navPageName, "", navPageRef, options);
		}
			cc.endComponent();
		} else {
			pega_uiengine_pzcontrol.pzGetMenu("pzRuleFormToolbarMenu", "", navPageName,"", true , false,  (pzAuto.isOffline() ? false :false), true);
			if(pzAuto.doOnlyOnce("ControlMenu")){
				if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
			}
			}
			tools.appendString("<div id='div-menu-" + uniqueTS + "' style='display:none;'></div><script type=\"text/javascript\">pega.control.menu.pxMenuManager.schedule(\"menu-" + uniqueTS + "\", {\"type\": \"horizontal\", \"format\": \"menu-format-standard\", \"menuID\": \"menu-" + uniqueTS + "\", \"navName\": \"pzRuleFormToolbarMenu\", \"navPage\": \"" + navPageName + "\", \"navUID\": \"pzRuleFormToolbarMenu_1\", \"isMobile\": \"" + pzAuto.isMobile() + "\", \"usingPage\": \"" + tools.getStepPage().getReference() + "\"");
			if(!pzAuto.isOffline() && false) {
			tools.appendString(", \"deferLoad\": \"false\", \"enableCache\": \"true\"");
			}
		tools.appendString("});</script>");
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


public void pxMenu_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

generateMenu_1();

		tools.putParamValue("pega_attributes","");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}} catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Ruleform Actions Menu");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxMenu",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxMenu_1();
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201509081053260714117-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxMenu");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxMenu",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxMenu_1();labelName = "Ruleform Actions Menu";
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


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxMenu",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxMenu_2();
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201509081053260715231-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxMenu");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxMenu",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxMenu_2();labelName = "Ruleform Save As Menu";
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_1();
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20180110105445055724983-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_1();labelName = "Button";
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


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_2();
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20180110105445055725901-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_2();labelName = "Button";
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_3();
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20180110105445055726579-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_3();labelName = "Button";
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


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("hotkey-ruleform-viewxml' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(6)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_4();
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
	pgCells.put("inlinestyle","hotkey-ruleform-viewxml");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2018010916285906977765-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(6)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_4();labelName = "Button";
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


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(7)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_5();
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201801101029510962950-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateButton",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(7)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_5();labelName = "Button";
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
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormToolbarHotKeysB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201801091528020030956") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-default content-default hidden clearfix" + "'  ");
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
		pg_dlmeta.put("customClassName","hidden");
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","default");
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
	String paramName = "EXPANDEDSubSectionpzRuleFormToolbarHotKeysB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_1();
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
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzRuleFormToolbarHotKeys");
	oStreamProperties_1.put("pyRuleSetVersion", "08-04-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARHOTKEYS #20191127T083130.787 GMT", "@baseclass pzRuleFormToolbarHotKeys", "Pega-Desktop", "08-04-01", "20191127T083130.787 GMT");
}
