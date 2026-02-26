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
 * Builds JSP stream WORK-!CASEACTIONHEADER.
 */
public class ra_stream_caseactionheader_6a4a697085ab0b6c14075a9d5744274f extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.CaseActionHeader.OFON2J_ProcessO_Work_Onboarding.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1331451861;
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
	public ra_stream_caseactionheader_6a4a697085ab0b6c14075a9d5744274f(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "a7b970279aca98e2ac0dcef4853074a68a175df4";
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
/* Instance RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "a7b970279aca98e2ac0dcef4853074a68a175df4";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("CaseActionHeader",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT */
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
	"Rule-HTML-Section:CASEACTIONHEADER", 
	"Rule-HTML-Section:PXCASEACTIONHEADER", 
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
		new DependentRuleInfo("CASEACTIONHEADER","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT","!CASEACTIONHEADER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1331451861), 
		new DependentRuleInfo("PXCASEACTIONHEADER","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PXCASEACTIONHEADER #20210506T204027.740 GMT","!PXCASEACTIONHEADER",false,false,"MISSING",1183832596), 
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
//	RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT:20210506T204026.925 GMT
//	RULE-HTML-SECTION WORK- PXCASEACTIONHEADER #20210506T204027.740 GMT:20211008T073502.741 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_2(
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNACTIVITY #20190830T074358.805 GMT:20190830T074358.805 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSHOWMENU #20220112T101247.778 GMT:20220112T101247.778 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEMENUSCRIPTS #20180713T133346.297 GMT:20180713T133346.297 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVNODELEVELDEFERLOADED--(STRING,STRING,CLIPBOARDPAGE) #20180713T133346.455 GMT:20180713T133346.455 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVNODELEVELDEFERLOADEDINNER--(CLIPBOARDPAGE) #20180713T133346.450 GMT:20180713T133346.450 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVTYPECUSTOM #20180713T133346.460 GMT:20180713T133346.460 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZISNAVTYPECUSTOMINNER #20180713T133346.472 GMT:20180713T133346.472 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING INSTRING #20180713T131441.635 GMT:20180713T131441.635 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5429a4fbb875891f734a7978e5c8a9e1";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-";
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
  pzSection.beginSection("CaseActionHeader",1,"Rule-HTML-Section","{'type':'Section','ruleName':'CaseActionHeader','insKey':'RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT','templated':'true','editable':'true','sectionType':'workareaWidget'}");
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
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.ui.HarnessActions.changeStage");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.ui.HarnessActions.changeStage");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pyWorkActionsPopulatePerform");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("navName", "pyWorkCommonActions");
pega.getUIEngine().getUIAction("showMenu", config).register();
config = new HashMap<String, String>();
config.put("navName", "pyArchivedWorkActions");
pega.getUIEngine().getUIAction("showMenu", config).register();
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_3() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
	  IActionRequest actionRequest = pzAuto.getActionRequest();
	  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
	  pzAuto.registerActionRequest(actionRequest);
	}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("CaseActionHeader",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			tools.appendString("[\"showMenu\",[{\"dataSource\":\"pyArchivedWorkActions\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
			if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
			tools.appendString("\",\"UITemplatingStatus\":\"Y");
			}
			tools.appendString("\",\"menuAlign\":\"right\",\"format\":\"");
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
			tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840215225");
			if(pzAuto.isOffline() || false) {
			try{
			pega_uiengine_pzcontrol.pzGetMenu("pyArchivedWorkActions", "", "pyNavigation1771840215225","", false, false, false, false);
			}catch(Exception e){oLog.error(e);}
			}
			tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}			String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20141009112850013521365") + " ");
	if(false || (pzAuto.isOffline() && true) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseActionHeader_$CTX$_6");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Actions\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Actions", ".pyActionPrompt");
	}
	pyTooltip = "Actions";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Simple");
	modePage2.put("showMenu","true");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-caret-menu-down";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","right");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Actions\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Actions", ".pyButtonLabel");
	}
	pyLabel = "Actions";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash20 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash20 != null && !"".equals(spxUniqueStreamHash20)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash20,pxUniqueStreamHash+"_20");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_20");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	if (!pzAuto.hasStaticContentJSOptimization() ) {
		ctrlComponent.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
		ctrlComponent.addAdditionalFragment("MenuBarOld","pzMenuBarInclude");
	}
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
		 String buttonUID = "name='CaseActionHeader_"+ referenceString+ "_6'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20141009112850013521365") + "  data-ctl='Button'  type='button' role='button' aria-haspopup='true' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
	  IActionRequest actionRequest = pzAuto.getActionRequest();
	  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
	  pzAuto.registerActionRequest(actionRequest);
	}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("CaseActionHeader",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			tools.appendString("[\"showMenu\",[{\"dataSource\":\"pyArchivedWorkActions\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
			if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
			tools.appendString("\",\"UITemplatingStatus\":\"Y");
			}
			tools.appendString("\",\"menuAlign\":\"right\",\"format\":\"");
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
			tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840215228");
			if(pzAuto.isOffline() || false) {
			try{
			pega_uiengine_pzcontrol.pzGetMenu("pyArchivedWorkActions", "", "pyNavigation1771840215228","", false, false, false, false);
			}catch(Exception e){oLog.error(e);}
			}
			tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Actions\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Simple pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-caret-menu-down";
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Actions".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Actions",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		if(hasLineBreaks) {
		tools.appendString("</span>");}
		tools.appendString(" <i aria-hidden='true'  data-click='.' class='" + classProp  +"'></i>");
		tools.appendString("</button>");		}
menubarIncludes_1();		if(pzAuto.doOnlyOnce("ControlMenu")){
			if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
		}
		}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}		} catch (Exception e) {

		
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'		&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }			}


}



public void menubarIncludes_1() {
pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pyWorkActionsPopulatePerform");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			  IActionRequest actionRequest = pzAuto.getActionRequest();
			  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
			  pzAuto.registerActionRequest(actionRequest);
			}
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				try{
					pzPackageRuntime.packageSection("CaseActionHeader",
					tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
					}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
					}
					tools.appendString("[\"showMenu\",[{\"dataSource\":\"pyWorkCommonActions\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
					if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
					tools.appendString("\",\"UITemplatingStatus\":\"Y");
					}
					tools.appendString("\",\"menuAlign\":\"right\",\"format\":\"");
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
					tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840215213");
					if(pzAuto.isOffline() || false) {
					try{
					pega_uiengine_pzcontrol.pzGetMenu("pyWorkCommonActions", "", "pyNavigation1771840215213","", false, false, false, false);
					}catch(Exception e){oLog.error(e);}
					}
					tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}					String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20141009112850013521365") + " ");
	if(false || (pzAuto.isOffline() && true) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseActionHeader_$CTX$_5");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Actions\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Actions", ".pyActionPrompt");
	}
	pyTooltip = "Actions";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Simple");
	modePage2.put("showMenu","true");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-caret-menu-down";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","right");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Actions\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Actions", ".pyButtonLabel");
	}
	pyLabel = "Actions";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash16 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash16 != null && !"".equals(spxUniqueStreamHash16)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash16,pxUniqueStreamHash+"_16");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_16");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	if (!pzAuto.hasStaticContentJSOptimization() ) {
		ctrlComponent.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
		ctrlComponent.addAdditionalFragment("MenuBarOld","pzMenuBarInclude");
	}
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
		 String buttonUID = "name='CaseActionHeader_"+ referenceString+ "_5'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20141009112850013521365") + "  data-ctl='Button'  type='button' role='button' aria-haspopup='true' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pyWorkActionsPopulatePerform");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			  IActionRequest actionRequest = pzAuto.getActionRequest();
			  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
			  pzAuto.registerActionRequest(actionRequest);
			}
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				try{
					pzPackageRuntime.packageSection("CaseActionHeader",
					tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
					}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
					}
					tools.appendString("[\"showMenu\",[{\"dataSource\":\"pyWorkCommonActions\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"" + tools.getStepPage().getClassName());
					if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
					tools.appendString("\",\"UITemplatingStatus\":\"Y");
					}
					tools.appendString("\",\"menuAlign\":\"right\",\"format\":\"");
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
					tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840215216");
					if(pzAuto.isOffline() || false) {
					try{
					pega_uiengine_pzcontrol.pzGetMenu("pyWorkCommonActions", "", "pyNavigation1771840215216","", false, false, false, false);
					}catch(Exception e){oLog.error(e);}
					}
					tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Actions\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Simple pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-caret-menu-down";
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Actions".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Actions",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		if(hasLineBreaks) {
		tools.appendString("</span>");}
		tools.appendString(" <i aria-hidden='true'  data-click='.' class='" + classProp  +"'></i>");
		tools.appendString("</button>");				}
menubarIncludes_1();				if(pzAuto.doOnlyOnce("ControlMenu")){
					if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
				}
				}

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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}

public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_2() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionCaseActionHeaderBB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash12 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash12 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash12 != null && !"".equals(spxUniqueStreamHash12)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash12,pxUniqueStreamHash+"_12");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("20190129143547059192") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)','region':'Additional actions'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash12 != null && !"".equals(spxUniqueStreamHash12)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_12");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)','region':'Additional actions'}") + "").append("\"").toString();
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
	public void pzLayoutContainer_1() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseActionHeaderBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)','region':'Additional actions'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_2();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
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
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.ui.HarnessActions.changeStage(\\\"true\\\",\\\"\\\",\\\"\\\",\\\"true\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.ui.HarnessActions.changeStage(\\\"true\\\",\\\"\\\",\\\"\\\",\\\"true\\\")\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = actionsStringBuilder.toString();
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("CanMoveToNextStage",pxUniqueStreamHash+"_8");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage2.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_8");
	pxWhenIdentifiers.put("pyDisabledWhenName","CanMoveToNextStage");
	pxWhenIdentifiers.put("pyDisabledWhenClass",((String)pega.getStreamProperties().get("pyClassName")));
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20190201022655064113525") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseActionHeader_$CTX$_2");
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
		tools.getLocalizedTextForString(".pyButtonLabel","Complete stage\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Complete stage", ".pyButtonLabel");
	}
	pyLabel = "Complete stage";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash9 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash9 != null && !"".equals(spxUniqueStreamHash9)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash9,pxUniqueStreamHash+"_9");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_9");
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
		 String buttonUID = "name='CaseActionHeader_"+ referenceString+ "_2'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20190201022655064113525") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.ui.HarnessActions.changeStage(\\\"true\\\",\\\"\\\",\\\"\\\",\\\"true\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.ui.HarnessActions.changeStage(\\\"true\\\",\\\"\\\",\\\"\\\",\\\"true\\\")\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "CanMoveToNextStage", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Complete stage".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Complete stage",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_6","EditAction", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
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
	String sectionName = "EditAction"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellCaseActionHeader606","",false);
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","EditAction", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
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
	String sectionName = "EditAction"; 
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
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","EditAction",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
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
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","EditAction",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpyShowCompleteStage","pyShowCompleteStage","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_1();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190201022655064113525-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpyShowCompleteStage",pxUniqueStreamHash+"_11");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_11");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pyShowCompleteStage");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_11");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpyShowCompleteStage", pxUniqueStreamHash+"_11"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_1();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Button";
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
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_2();
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
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
	pzLayout_2();
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
	if(!pzAuto.handleEvaluateWhen(" o1! wxpyShowArchivedCase","!pyShowArchivedCase","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","margin-l-auto summary-actions","margin-l-auto summary-actions")  + " " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_2();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141009112850013521365-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","margin-l-auto summary-actions");
	pgCells.put("customRWStyles","margin-l-auto summary-actions");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o1! wxpyShowArchivedCase",pxUniqueStreamHash+"_18");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_18");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!pyShowArchivedCase");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_18");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o1! wxpyShowArchivedCase", pxUniqueStreamHash+"_18"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_2();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Button";
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
	if(!pzAuto.handleEvaluateWhen(" wxpyShowArchivedCase","pyShowArchivedCase","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","margin-l-auto summary-actions","margin-l-auto summary-actions")  + " " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_3();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141009112850013521365-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","margin-l-auto summary-actions");
	pgCells.put("customRWStyles","margin-l-auto summary-actions");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpyShowArchivedCase",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pyShowArchivedCase");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpyShowArchivedCase", pxUniqueStreamHash+"_22"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_3();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "Button";
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
pzSection.getLayout().setExpandParam("SubSectionCaseActionHeaderB","",false);
}


public void simpleLayout_2() {
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
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201901291426290586158") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle actions-header padding-lr-2x padding-b-1x" + "'  ");
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
		pg_dlmeta.put("customClassName","actions-header padding-lr-2x padding-b-1x");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("ariaRole","menubar");
		pg_dlmeta.put("clear","false");
		pg_dlmeta.put("lMode","SimpleDiv");
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
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseActionHeaderB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","SimpleDiv");
	metadataPage.put("contCustom","margin-0");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_2();
	containerComponent.endComponent();
	}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_3();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
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
	oStreamProperties_1.put("pyClassName", "Work-");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "CaseActionHeader");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- CASEACTIONHEADER #20210506T204026.925 GMT", "Work- CaseActionHeader", "Theme-Cosmos", "04-01-01", "20210506T204026.925 GMT");
}
