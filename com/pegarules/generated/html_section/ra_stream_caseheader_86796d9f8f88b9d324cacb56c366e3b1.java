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
 * Builds JSP stream WORK-!CASEHEADER.
 */
public class ra_stream_caseheader_86796d9f8f88b9d324cacb56c366e3b1 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.CaseHeader.OFON2J_ProcessO_Work_Onboarding.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 646790210;
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
	public ra_stream_caseheader_86796d9f8f88b9d324cacb56c366e3b1(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "408fb554fc211b3cea993156faf6b1f4173293b1";
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
/* Instance RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "408fb554fc211b3cea993156faf6b1f4173293b1";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("CaseHeader",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT */
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
	"Rule-HTML-Section:CASEHEADER", 
	"Rule-HTML-Section:PXCASEHEADER", 
	"Rule-Obj-Property:PYCASETYPELABEL", 
	"Rule-Obj-Property:PYID", 
	"Rule-HTML-Property:PXLINK", 
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
		new DependentRuleInfo("CASEHEADER","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT","!CASEHEADER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",646790210), 
		new DependentRuleInfo("PXCASEHEADER","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PXCASEHEADER #20210506T204027.776 GMT","!PXCASEHEADER",false,false,"MISSING",-1507616915), 
		new DependentRuleInfo("PYCASETYPELABEL","Rule-Obj-Property","WORK-",true,"Work-","Pega-ProcessEngine","08-05-01","RULE-OBJ-PROPERTY WORK- PYCASETYPELABEL #20200519T222256.896 GMT","!PYCASETYPELABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYID","Rule-Obj-Property","WORK-",true,"Work-","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY WORK- PYID #20180713T131937.357 GMT","!PYID",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
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
//	RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT:20210506T204027.018 GMT
//	RULE-HTML-SECTION WORK- PXCASEHEADER #20210506T204027.776 GMT:20230703T100551.430 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-OBJ-PROPERTY WORK- PYCASETYPELABEL #20200519T222256.896 GMT:20200519T222256.896 GMT
//	RULE-OBJ-PROPERTY WORK- PYID #20180713T131937.357 GMT:20180713T131937.357 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-PROPERTY WORK- PYID #20180713T131937.357 GMT:20180713T131937.357 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-PROPERTY WORK- PYCASETYPELABEL #20200519T222256.896 GMT:20200519T222256.896 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayoutContainer_16( {"methodName", "String", ""}
//	pzLayoutContainer_17( {"methodName", "String", ""}
//	simpleLayout_2(
//	simpleLayout_12(
//	simpleLayout_14(
//	sectionBodyIncludeInCell_20(
//	simpleLayout_11(
//	sectionBodyIncludeInCell_19(
//	simpleLayout_8(
//	sectionBodyIncludeInCell_22(
//	simpleLayout_10(
//	simpleLayout_6(
//	simpleLayout_7(
//	simpleLayout_1(
//	simpleLayout_4(
//	simpleLayout_13(
//	simpleLayout_3(
//	sectionBodyIncludeInCell_21(
//	simpleLayout_5(
//	simpleLayout_15(
//	simpleLayout_9(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS DEFERLOADRETRIEVALACTIVITY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133337.812 GMT:20180713T133337.812 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENAKEY #20180713T133339.591 GMT:20180713T133339.591 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEGETPARAMPAGE--(CLIPBOARDPAGE,STRING) #20200702T145600.500 GMT:20200702T145600.500 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEHEADERTITLE #20180713T133339.778 GMT:20180713T133339.778 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTGROUPHTML #20180713T133339.802 GMT:20180713T133339.802 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAZYLOADBOTTOM--(STRING,STRING,CLIPBOARDPAGE,STRING) #20180713T133339.970 GMT:20180713T133339.970 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAZYLOADTOP--(STRING, CLIPBOARDPAGE) #20180713T133339.980 GMT:20180713T133339.980 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONCANCEL--(CLIPBOARDPAGE,B7B07D7849989BE5A2CC9C2D808EBDE5C #20230710T080431.233 GMT:20230710T080431.233 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLOCALACTION--(CLIPBOARDP735454E5CE9DE0AF1D25BFD33036C12C #20190423T162450.172 GMT:20190423T162450.172 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENWORKBYHANDLE--(IAUTO591205311DA543B2EDDD2E46D0E6BB0F #20190520T072316.567 GMT:20190520T072316.567 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNACTIVITY #20190830T074358.805 GMT:20190830T074358.805 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSHOWMENU #20220112T101247.778 GMT:20220112T101247.778 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZENABLEDSKIPLOCALIZATION #20180713T133344.810 GMT:20180713T133344.810 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFIELDVALUEAPI #20200312T061421.553 GMT:20200319T144505.401 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEMENUSCRIPTS #20180713T133346.297 GMT:20180713T133346.297 GMT
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
//	RULE-UTILITY-FUNCTION STRING INSTRING #20180713T131441.635 GMT:20180713T131441.635 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d844a1365860732b2c2d6765597531e6";
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
  pzSection.beginSection("CaseHeader",1,"Rule-HTML-Section","{'type':'Section','ruleName':'CaseHeader','insKey':'RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT','templated':'true','editable':'true','sectionType':'workareaWidget'}");
pzLayout_22();
pzLayout_27();
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
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.closeSlideInPanels");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("cancel", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pyWorkActionsPopulatePerform");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("navName", "pyWorkCommonActions");
pega.getUIEngine().getUIAction("showMenu", config).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pyWorkActionsPopulatePerform");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("navName", "pyWorkCommonActions");
pega.getUIEngine().getUIAction("showMenu", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyOverlayTemplate");
config.put("NewTaskStatus", "pxShowBreadcrumbs");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyOverlayTemplate");
config.put("NewTaskStatus", "pxShowBreadcrumbs");
pega.getUIEngine().getUIAction("localAction", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyOverlayTemplate");
config.put("NewTaskStatus", "pxShowBreadcrumbs");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyOverlayTemplate");
config.put("NewTaskStatus", "pxShowBreadcrumbs");
pega.getUIEngine().getUIAction("localAction", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.hideSlideInPanel");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.hideSlideInPanel");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.hideSlideInPanel");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.hideSlideInPanel");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
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
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pyWorkActionsPopulatePerform");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("navName", "pyWorkCommonActions");
pega.getUIEngine().getUIAction("showMenu", config).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pyWorkActionsPopulatePerform");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("navName", "pyWorkCommonActions");
pega.getUIEngine().getUIAction("showMenu", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
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
}
public void pzLayoutBody_19() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_15");simpleLayout_15();
}
public void pzLayoutBodyWrapper_27() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_15");simpleLayout_15();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_18() {
tools.putParamValue("LAYOUT_METHOD_NAME","layoutGroup_1");layoutGroup_1();
}
public void pzLayoutBodyWrapper_26() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";if(!pzAuto.isMobile()) { clsScroll = "container-scroll";}tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","layoutGroup_1");layoutGroup_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_22() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_142","pyCasePreviewMore", secInfo);
}


public void sectionBodyIncludeInCell_22() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_22();
	return;
	}
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
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
	String sectionName = "pyCasePreviewMore"; 
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

 public void pzHeaderBody_13(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230450140331" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_14(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			String labelName = "More";
			labelName =  tools.getLocalizedTextForString(".pyCaption","More");
			l_sectionTitle = labelName;
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4207' data-layout-id='202602230450140331" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel4207'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_2();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellCaseHeader118","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}


public String getParamPage_2() {
	ParameterPage paramPage = tools.getParameterPage();
	if(paramPage.isEmpty()) {
		return "";
	}

	List paramsToAvoid = Arrays.asList(new Object[]{"pzuiactionzzz", "labelStyle", "workClass",  "CoverClass",
	"labelForStyle", "FlowType", "OutputPageName",
	"valueStyle","isWebMashup", "CreatesTemporaryObject", "repeatPageStyle",
	"streamKeys2", "ModelToUse", "pyActivity",
	"RunRuleInsKey", "Purpose", "FolderType",
	"pzHarnessID", "streamKeys", "InsClass",
	"FormError", "RenderSingle", "section_base_ref",
	"HTMLClass", "StartingModel", "separatorStyle",
	"repeatStyle", "MergePage", "workHandle",
	"FlowHandle", "SkipNewHarness", "AlwaysShowFormLevelErrors",
	"KeepFixedVisible", "GetWorkCreateInfo", "StartingHarness",
	"lazyLoadInfo", "OnlyCreateOutputPageIfError", "ReadOnly",
	"pzTransactionId", "StreamClass", "lazyLoadId",
	"PreActivity", "PreDataTransform", "BaseReference", "lazySection","pyListViewOutput",
	"StreamName", "SectionReadOnly", "ActivityParams",
	"filteredIndicesSet", "currentRowPage", "parameters", "StreamList", "UITemplateMetaDataPath" , "UITemplatingStatus"
	});

	List paramsToSkipEncoding = Arrays.asList(new Object[]{"pzPrimaryPageName", "TempAssignPage",  "InterestPage", "UsingPage"});

	StringBuffer paramsAsNameValue = new StringBuffer();

	java.util.Set params = paramPage.keySet();
	java.util.Iterator paramsIter = params.iterator();
	String paramName = "";
	Object paramValue = null;

	while (paramsIter.hasNext()) {
		boolean skipEncoding = false;
		paramName = paramsIter.next().toString();
		if(paramsToAvoid.contains(paramName)) {
			continue;
		}else if(paramsToSkipEncoding.contains(paramName)) {
			skipEncoding = true;
		}

		paramValue = paramPage.getDefinition(paramName);
		if(paramValue == null || !(paramValue instanceof String) || "".equals(paramValue.toString())) {
			continue;
		}

		paramsAsNameValue.append("," + paramName + "=" + (skipEncoding?paramValue.toString():StringUtils.crossScriptingFilter(paramValue.toString())));
	}

	return paramsAsNameValue.toString();
}public void pzLayoutHeader_5() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
if(! "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	metadataPage.put("isDataDefer", true);
	}
}
String l_sectionTitleReference="";
String l_sectionTitleType="";
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h3");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("headingLevel","h3");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCellCaseHeader118"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("More", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","More");
	metadataPage.put("uniqueid", "202602230450140329");
	metadataPage.put("automationId", "");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_17(String lazyLoadToken) {
	if("deferLoad".equals(lazyLoadToken)) {
	sectionBodyIncludeInCell_21();
	}else {
	Map<String, Object> loadingSectionInfo = new HashMap<String, Object>();
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_141", "pyLoadingMessage", loadingSectionInfo);
	}
	}
public void pzLayoutBodyWrapper_25() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'>");
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_21();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_21() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_139","pyCasePreviewMore", secInfo);
}


public void sectionBodyIncludeInCell_21() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_21();
	return;
	}
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
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
	String sectionName = "pyCasePreviewMore"; 
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
public void pzSetExpandParam_27() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader118","",true);
}

 public void pzHeaderBody_11(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230450140328" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_12(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			String labelName = "More";
			labelName =  tools.getLocalizedTextForString(".pyCaption","More");
			l_sectionTitle = labelName;
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel3850' data-layout-id='202602230450140328" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel3850'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_2();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellCaseHeader118","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}
			public void pzLayoutContainer_17(String methodName) {
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
			String paramName = "EXPANDEDSubSectionCellCaseHeader118";
			metadataPage.put("paramName", paramName);
			String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)','clipboardPath':'pyCasePreviewMore'}");
			if(!inspectorLayoutData.isEmpty()) {
			metadataPage.put("liveUI", inspectorLayoutData);
			}
			String pyPrefix = null;
			metadataPage.put("sectionIndex","2052f5d4-dd4c-415b-b5b0-45fd288d9326");
			IUIComponent containerComponent = pzAuto.getUIComponent();
			metadataPage.put("isSectionIncl","true");
			metadataPage.put("dlChild","true");
			metadataPage.put("lgChild","true");
			if("".equals(methodName)) {
			containerComponent.forceReload();
			}
			if(!"".equals(methodName)) {
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addParameterPage(pxUniqueStreamHash+"_140");
			metadataPage.put("parampg",pxUniqueStreamHash+"_140");
			}
			containerComponent.beginComponent("pxLayoutContainer",metadataPage);
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
			methodName = "";
			}
			if(!"".equals(methodName)) {
			pzLayoutHeader_5();
			}
			if(!"".equals(methodName))
			containerComponent.addPropertyToMetadata("methodnm", methodName);
			pzLayoutBody_17("".equals(methodName) ? "deferLoad" : "");
			containerComponent.endComponent();
			}
public void pzLayout_25() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_27();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_11();
pzLayoutBodyWrapper_25();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_17("pzLayoutContainer_17");
tools.putParamValue("pyInlineStyleSec","");
}
}
public void buildSection_20() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_136","PulseGadget", secInfo);
}


public void sectionBodyIncludeInCell_20() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_20();
	return;
	}
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
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
	String sectionName = "PulseGadget"; 
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

 public void pzHeaderBody_9(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230450140326" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_10(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			String labelName = "Pulse";
			labelName =  tools.getLocalizedTextForString(".pyCaption","Pulse");
			l_sectionTitle = labelName;
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4141' data-layout-id='202602230450140326" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel4141'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_2();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellCaseHeader222","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}


public String getParamPage_1() {
	ParameterPage paramPage = tools.getParameterPage();
	if(paramPage.isEmpty()) {
		return "";
	}

	List paramsToAvoid = Arrays.asList(new Object[]{"pzuiactionzzz", "labelStyle", "workClass",  "CoverClass",
	"labelForStyle", "FlowType", "OutputPageName",
	"valueStyle","isWebMashup", "CreatesTemporaryObject", "repeatPageStyle",
	"streamKeys2", "ModelToUse", "pyActivity",
	"RunRuleInsKey", "Purpose", "FolderType",
	"pzHarnessID", "streamKeys", "InsClass",
	"FormError", "RenderSingle", "section_base_ref",
	"HTMLClass", "StartingModel", "separatorStyle",
	"repeatStyle", "MergePage", "workHandle",
	"FlowHandle", "SkipNewHarness", "AlwaysShowFormLevelErrors",
	"KeepFixedVisible", "GetWorkCreateInfo", "StartingHarness",
	"lazyLoadInfo", "OnlyCreateOutputPageIfError", "ReadOnly",
	"pzTransactionId", "StreamClass", "lazyLoadId",
	"PreActivity", "PreDataTransform", "BaseReference", "lazySection","pyListViewOutput",
	"StreamName", "SectionReadOnly", "ActivityParams",
	"filteredIndicesSet", "currentRowPage", "parameters", "StreamList", "UITemplateMetaDataPath" , "UITemplatingStatus"
	});

	List paramsToSkipEncoding = Arrays.asList(new Object[]{"pzPrimaryPageName", "TempAssignPage",  "InterestPage", "UsingPage"});

	StringBuffer paramsAsNameValue = new StringBuffer();

	java.util.Set params = paramPage.keySet();
	java.util.Iterator paramsIter = params.iterator();
	String paramName = "";
	Object paramValue = null;

	while (paramsIter.hasNext()) {
		boolean skipEncoding = false;
		paramName = paramsIter.next().toString();
		if(paramsToAvoid.contains(paramName)) {
			continue;
		}else if(paramsToSkipEncoding.contains(paramName)) {
			skipEncoding = true;
		}

		paramValue = paramPage.getDefinition(paramName);
		if(paramValue == null || !(paramValue instanceof String) || "".equals(paramValue.toString())) {
			continue;
		}

		paramsAsNameValue.append("," + paramName + "=" + (skipEncoding?paramValue.toString():StringUtils.crossScriptingFilter(paramValue.toString())));
	}

	return paramsAsNameValue.toString();
}public void pzLayoutHeader_4() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
if(! "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	metadataPage.put("isDataDefer", true);
	}
}
String l_sectionTitleReference="";
String l_sectionTitleType="";
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h3");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("headingLevel","h3");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCellCaseHeader222"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Pulse", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","Pulse");
	metadataPage.put("uniqueid", "202602230450140324");
	metadataPage.put("automationId", "");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_16(String lazyLoadToken) {
	if("deferLoad".equals(lazyLoadToken)) {
	sectionBodyIncludeInCell_19();
	}else {
	Map<String, Object> loadingSectionInfo = new HashMap<String, Object>();
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_135", "pyLoadingMessage", loadingSectionInfo);
	}
	}
public void pzLayoutBodyWrapper_24() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'>");
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_19();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_19() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_133","PulseGadget", secInfo);
}


public void sectionBodyIncludeInCell_19() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_19();
	return;
	}
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
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
	String sectionName = "PulseGadget"; 
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
public void pzSetExpandParam_26() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader222","",true);
}

 public void pzHeaderBody_7(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230450140322" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_8(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			String labelName = "Pulse";
			labelName =  tools.getLocalizedTextForString(".pyCaption","Pulse");
			l_sectionTitle = labelName;
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel9623' data-layout-id='202602230450140322" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel9623'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_2();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellCaseHeader222","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}
			public void pzLayoutContainer_16(String methodName) {
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
			String paramName = "EXPANDEDSubSectionCellCaseHeader222";
			metadataPage.put("paramName", paramName);
			String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)','clipboardPath':'PulseGadget'}");
			if(!inspectorLayoutData.isEmpty()) {
			metadataPage.put("liveUI", inspectorLayoutData);
			}
			String pyPrefix = null;
			metadataPage.put("sectionIndex","8c10bff4-2259-478d-a0cb-46b2fcbb75f9");
			IUIComponent containerComponent = pzAuto.getUIComponent();
			metadataPage.put("isSectionIncl","true");
			metadataPage.put("dlChild","true");
			metadataPage.put("lgChild","true");
			if("".equals(methodName)) {
			containerComponent.forceReload();
			}
			if(!"".equals(methodName)) {
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addParameterPage(pxUniqueStreamHash+"_134");
			metadataPage.put("parampg",pxUniqueStreamHash+"_134");
			}
			containerComponent.beginComponent("pxLayoutContainer",metadataPage);
			if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
			methodName = "";
			}
			if(!"".equals(methodName)) {
			pzLayoutHeader_4();
			}
			if(!"".equals(methodName))
			containerComponent.addPropertyToMetadata("methodnm", methodName);
			pzLayoutBody_16("".equals(methodName) ? "deferLoad" : "");
			containerComponent.endComponent();
			}
public void pzLayout_24() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_26();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_7();
pzLayoutBodyWrapper_24();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_16("pzLayoutContainer_16");
tools.putParamValue("pyInlineStyleSec","");
}
}
public void buildSection_18() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_130","pyCasePreviewDetails", secInfo);
}


public void sectionBodyIncludeInCell_18() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_18();
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
	String sectionName = "pyCasePreviewDetails"; 
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

 public void pzHeaderBody_5(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230450140320" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_6(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			String labelName = "Overview";
			labelName =  tools.getLocalizedTextForString(".pyCaption","Overview");
			l_sectionTitle = labelName;
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel5930' data-layout-id='202602230450140320" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel5930'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_2();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellCaseHeader185","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}
public void pzLayoutHeader_3() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
String l_sectionTitleReference="";
String l_sectionTitleType="";
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h3");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("headingLevel","h3");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCellCaseHeader185"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Overview", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","Overview");
	metadataPage.put("uniqueid", "202602230450140319");
	metadataPage.put("automationId", "");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_15() {
	sectionBodyIncludeInCell_17();
	}
public void pzLayoutBodyWrapper_23() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'>");
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_17();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_17() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_129","pyCasePreviewDetails", secInfo);
}


public void sectionBodyIncludeInCell_17() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_17();
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
	String sectionName = "pyCasePreviewDetails"; 
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
public void pzHeaderCellContent_2() {
}
public void pzSetExpandParam_25() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader185","",true);
}

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230450140317" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
		tools.appendString("'");
		}
		tools.appendString("><h3  aria-level='3' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h3>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_4(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			String labelName = "Overview";
			labelName =  tools.getLocalizedTextForString(".pyCaption","Overview");
			l_sectionTitle = labelName;
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel882' data-layout-id='202602230450140317" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel882'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_2();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionCellCaseHeader185","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}
			public void pzLayoutContainer_15() {
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
			String paramName = "EXPANDEDSubSectionCellCaseHeader185";
			metadataPage.put("paramName", paramName);
			String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)','clipboardPath':'pyCasePreviewDetails'}");
			if(!inspectorLayoutData.isEmpty()) {
			metadataPage.put("liveUI", inspectorLayoutData);
			}
			String pyPrefix = null;
			metadataPage.put("sectionIndex","a9b78c9c-33e8-4c97-978b-4571d5c32e1d");
			IUIComponent containerComponent = pzAuto.getUIComponent();
			metadataPage.put("isSectionIncl","true");
			metadataPage.put("dlChild","true");
			metadataPage.put("lgChild","true");
			containerComponent.beginComponent("pxLayoutContainer",metadataPage);
			pzLayoutHeader_3();
			pzLayoutBody_15();
			containerComponent.endComponent();
			}
public void pzLayout_23() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_25();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_3();
pzLayoutBodyWrapper_23();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_15();
tools.putParamValue("pyInlineStyleSec","");
}
}


public void pzLayoutGroupIncludes_1() {
pzAuto.emitIncludeStreamReference("pzLayoutGroup_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}


public int layoutGroupTemplateCell_1( int index, int numVisibleLayouts ) {
	String labelName="";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String pyLGInspectorData = "";
	 StringBuilder lgCustomClass = new StringBuilder("layout "); 
	if( index == 1 ) {
		 lgCustomClass.append(" active multiactive ");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	String pyLGCustomClass = lgCustomClass.append("count-"+numVisibleLayouts).toString();
	tools.appendString(" ");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyNumberedAccordion","false");
	pgCells.put("pySemanticTabLayout","true");
	pgCells.put("pyAllowScrollForTabHeaders","true");
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pyCasePreviewDetails",".pyRegions(3).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_23();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	return index;
}


public int layoutGroupCell_1( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pyCasePreviewDetails",".pyRegions(3).pyCells(1)") + " data-lg-child-id='1' data-refreshOnClick='false' class='layout");
	if( index == 1) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "flex flex-row ' >");
	pzHeaderBody_5();tools.appendString("<div class=\"layout-body\" role=\"tabpanel\" tabindex=\"0\">");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_18();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int layoutGroupTemplateCell_2( int index, int numVisibleLayouts ) {
	String labelName="";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String pyLGInspectorData = "";
	 StringBuilder lgCustomClass = new StringBuilder("layout "); 
	if( index == 2 ) {
		 lgCustomClass.append(" active multiactive ");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	String pyLGCustomClass = lgCustomClass.append("count-"+numVisibleLayouts).toString();
	tools.appendString(" ");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyNumberedAccordion","false");
	pgCells.put("pySemanticTabLayout","true");
	pgCells.put("pyAllowScrollForTabHeaders","true");
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("LGCellIndex","2");
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","PulseGadget",".pyRegions(3).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_24();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	return index;
}


public int layoutGroupCell_2( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","PulseGadget",".pyRegions(3).pyCells(2)") + " data-lg-child-id='2' data-refreshOnClick='false' class='layout");
	if( index == 2) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "flex flex-row ' >");
	pzHeaderBody_9();tools.appendString("<div class=\"layout-body\" role=\"tabpanel\" tabindex=\"0\">");
	String tempRenderSingle = "";
	if(tools.getParamValue("lazyLoadId").equals("EXPANDEDSubSectionCellCaseHeader660") || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))){
			 tools.putParamValue("RenderSingle" , "");
			 tools.putParamValue("lazyLoadId" , "");
			 if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() &&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("<div id='lazyContent'>");
			}
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	tools.appendString("<div section_index='8c10bff4-2259-478d-a0cb-46b2fcbb75f9' id='INNERDIV' class='layout-body'>");
	sectionBodyIncludeInCell_20();tools.appendString("</div>");
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("</div>");}
			 tools.putParamValue("RenderSingle" , "EXPANDEDSubSectionCellCaseHeader660");
			 tools.putParamValue("lazyLoadId" , "EXPANDEDSubSectionCellCaseHeader660");
		}else{
		
			if(!tools.getParamValue("lazySection ").equals("PulseGadget")){
				 String readOnly = "-1".equals(tools.getParamValue("ReadOnly")) || "-1".equals(tools.getParamValue("SectionReadOnly")) || !tools.hasInputEnabled() ? "-1" : "0";
				   tools.putSaveValue("lazyLoadDivId" , ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique() + "");String lazyLoadDivIdSaveValue=tools.getSaveValue("lazyLoadDivId");String lazyLoadInfoValue=tools.getParamValue("lazyLoadInfo");if(lazyLoadInfoValue.equals("null")){lazyLoadInfoValue="";}
						boolean pyAssociateRequestor = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isAssociateRequestor();
				   tools.putParamValue("lazyLoadInfo" , lazyLoadInfoValue + tools.getSaveValue("lazyLoadDivId") + ",EXPANDEDSubSectionCellCaseHeader660,subscriptionId=" + tools.getParamValue("subscriptionId") + "ReadOnly=" + readOnly + getParamPage_1() + "~#LLDELIM#~");tools.appendString("<div style='display:block;' data-lazyloaddivid='" + lazyLoadDivIdSaveValue + "' data-layoutid='EXPANDEDSubSectionCellCaseHeader660' class='lazyload-layout' data-parampage='"+tools.getParamValueCSF("lazyLoadInfo").replace("~#LLDELIM#~","")+"' >");if(tools.getParamValue("RenderSingle").equals("")){pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null); }tools.appendString("</div>");
			}
		}
	
	tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int layoutGroupTemplateCell_3( int index, int numVisibleLayouts ) {
	String labelName="";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String pyLGInspectorData = "";
	 StringBuilder lgCustomClass = new StringBuilder("layout "); 
	if( index == 3 ) {
		 lgCustomClass.append(" active multiactive ");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	String pyLGCustomClass = lgCustomClass.append("count-"+numVisibleLayouts).toString();
	tools.appendString(" ");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyNumberedAccordion","false");
	pgCells.put("pySemanticTabLayout","true");
	pgCells.put("pyAllowScrollForTabHeaders","true");
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("LGCellIndex","3");
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pyCasePreviewMore",".pyRegions(3).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_25();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	return index;
}


public int layoutGroupCell_3( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pyCasePreviewMore",".pyRegions(3).pyCells(3)") + " data-lg-child-id='3' data-refreshOnClick='false' class='layout");
	if( index == 3) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "flex flex-row ' >");
	pzHeaderBody_13();tools.appendString("<div class=\"layout-body\" role=\"tabpanel\" tabindex=\"0\">");
	String tempRenderSingle = "";
	if(tools.getParamValue("lazyLoadId").equals("EXPANDEDSubSectionCellCaseHeader889") || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))){
			 tools.putParamValue("RenderSingle" , "");
			 tools.putParamValue("lazyLoadId" , "");
			 if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() &&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("<div id='lazyContent'>");
			}
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	tools.appendString("<div section_index='2052f5d4-dd4c-415b-b5b0-45fd288d9326' id='INNERDIV' class='layout-body'>");
	sectionBodyIncludeInCell_22();tools.appendString("</div>");
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("</div>");}
			 tools.putParamValue("RenderSingle" , "EXPANDEDSubSectionCellCaseHeader889");
			 tools.putParamValue("lazyLoadId" , "EXPANDEDSubSectionCellCaseHeader889");
		}else{
		
			if(!tools.getParamValue("lazySection ").equals("pyCasePreviewMore")){
				 String readOnly = "-1".equals(tools.getParamValue("ReadOnly")) || "-1".equals(tools.getParamValue("SectionReadOnly")) || !tools.hasInputEnabled() ? "-1" : "0";
				   tools.putSaveValue("lazyLoadDivId" , ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique() + "");String lazyLoadDivIdSaveValue=tools.getSaveValue("lazyLoadDivId");String lazyLoadInfoValue=tools.getParamValue("lazyLoadInfo");if(lazyLoadInfoValue.equals("null")){lazyLoadInfoValue="";}
						boolean pyAssociateRequestor = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isAssociateRequestor();
				   tools.putParamValue("lazyLoadInfo" , lazyLoadInfoValue + tools.getSaveValue("lazyLoadDivId") + ",EXPANDEDSubSectionCellCaseHeader889,subscriptionId=" + tools.getParamValue("subscriptionId") + "ReadOnly=" + readOnly + getParamPage_2() + "~#LLDELIM#~");tools.appendString("<div style='display:block;' data-lazyloaddivid='" + lazyLoadDivIdSaveValue + "' data-layoutid='EXPANDEDSubSectionCellCaseHeader889' class='lazyload-layout' data-parampage='"+tools.getParamValueCSF("lazyLoadInfo").replace("~#LLDELIM#~","")+"' >");if(tools.getParamValue("RenderSingle").equals("")){pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null); }tools.appendString("</div>");
			}
		}
	
	tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}
public void pzSetExpandParam_24() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBBBBBBBBB","",false);
}


public void layoutGroup_1() {
	if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	}
	String lgExpandedGrpIdHidden = "";
	if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	pzLayoutGroupIncludes_1();
	}
	String commaSeparateList = "";
	int indexActiveLayout= 0;
	String expressionForActiveWhenId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expressionForActiveWhen = null;
	IUIComponentMetadata pxWhenIdentifiersForActiveWhen = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pg_layoutGroupMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponent cc_lg = null;
	cc_lg = pzAuto.getUIComponent();
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
		cc_lg.beginComponent("LayoutGroup",pg_layoutGroupMeta);
		}
		boolean isMobile = pzAuto.isMobile();
		 String classTabFlow = ""; 
		if(!isMobile){
		 classTabFlow = "tab-overflow "; 
		}
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
			tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)','region':'Preview Content'}") + " data-lg-id='LGLayoutGroupCaseHeaderS16' role= 'tablist'  class='" + classTabFlow + " content content-layout-group layout-group-tab count-3 preview-content' data-lg-options='{\"swipe\":\"false\"}'>");
			if(!isMobile){
			tools.appendString(" <div class=\"tab-arrow left-tab-nav-controls left-arrow pi pi-caret-left\"></div>");
			}
			tools.appendString(" <div class=\"right-tab-nav-controls\">");
			if(!isMobile){
			tools.appendString("<div class=\"tab-arrow right-arrow pi pi-caret-right\"></div>");
			}
			tools.appendString("<div bsimplelayout='true' data-click='[[\"runScript\",[\"LayoutGroupModule.showActiveTabListMenu(event)\"]]]' class='layout-group-tablist-menu'data-menu-config='{\"usingPage\":\"" + tools.getStepPage().getReference() + "\",\"datasource\":\"\",\"isNavNLDeferLoaded\":\"false\",\"isNavTypeCustom\":\"false\",\"className\":\"\",\"menuAlign\":\"right\",\"format\":\"menu-format-standard\",\"loadBehavior\":\"ondisplay\",\"ellipsisAfter\":\"999\",\"useNewMenu\":\"true\",\"navPageName\":\"\",\"ContextPage\":\"\",\"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\"}'><a href='#' onclick='pd(event);' class='pi pi-caret-solid-down layout-group-tablist-menu-nav'></a></div></div>");
			if(!isMobile){
			tools.appendString("<div class=\"tab-indicator\"> <div class=\"current-selected-tab-indicator\"></div> </div>");
			}
			String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
			tools.appendString("<div class='layout-group-nav' tabindex='0'' data-layout-id='202602230450140316" + rptDynamicIndex + "'aria-haspopup='true' role='menuitem'><h3 class='layout-group-nav-title' ><i class='icon icon-openclose'></i>");
			}
			int defaultIndexActiveLayout= 0;
			int numVisibleLayouts = 0;
			boolean isActiveLayout = false;
			int prioritizedActiveLayout = 0;
			List<Integer> notVisibleLayoutsList = new ArrayList<Integer>();
			int flagAnyActiveWhenState = 0;
			ArrayList activeWhenList = new ArrayList<String>();
			String sectionName = "LayoutGroupCaseHeaderS16";
			String LGTabGrpId = "EXPANDEDLG"+pega_rules_string.stripSpecialChars(sectionName);
			String expandedGrpId = tools.getParamCSF(LGTabGrpId); 
			if(expandedGrpId.equals("0")){expandedGrpId = "";}
			String LGTypeHiddenId = "LGTypeLG"+pega_rules_string.stripSpecialChars(sectionName);
			String LGType = tools.getParamCSF(LGTypeHiddenId); 
			 Map<String, String> repeatSelected = new HashMap<String, String>();
			String LGTypeParentRepeatSize = tools.getParamCSF(LGTypeHiddenId+"RepeatSize"); 
			if(LGTypeParentRepeatSize != null && LGTypeParentRepeatSize != ""){
			 try{ 
			 int size = Integer.parseInt(LGTypeParentRepeatSize);
			 String expandedGrpIdRepeat = "";
			 String LGTabGrpIdRepeat = "";
			 for(int i=1; i<size+1; i++){ 
			 LGTabGrpIdRepeat = "EXPANDEDLG"+pega_rules_string.stripSpecialChars(sectionName)+i;
			 expandedGrpIdRepeat = tools.getParamCSF(LGTabGrpIdRepeat);
			 repeatSelected.put(i+"", expandedGrpIdRepeat);
			 } 
			 }catch(Exception e){ 
			 } 
			}
			int expandedGrpIdIndex = 1;
			String[] indexExpAccordian = null; 
			if("accordion".equals(LGType)){
			 if(expandedGrpId != "" && expandedGrpId != null) { 
			indexExpAccordian = expandedGrpId.split(","); 
			}
			} else{
			if(expandedGrpId != "" && expandedGrpId != null && expandedGrpId.length() != 0) { try  { expandedGrpIdIndex = Integer.parseInt(expandedGrpId);} catch(NumberFormatException nfe){expandedGrpIdIndex = 1;} } 
			}
			isActiveLayout=false;
			if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
				defaultIndexActiveLayout= 1; /*if(1 != 1) prioritizedActiveLayout = 1;*/
			}else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
			if((isActiveLayout && indexActiveLayout== 0) || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 1)) { 
				indexActiveLayout= 1;
				if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
				String l_sectionTitleReference="";
				String l_sectionTitleType="";
				String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
				if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
					tools.appendString(l_sectionTitle);
					}
					if(!"".equals(l_sectionTitle))
					pg_layoutGroupMeta.put("title",l_sectionTitle);
					}
				}
				isActiveLayout=false;
				if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
					defaultIndexActiveLayout= 2; /*if(2 != 1) prioritizedActiveLayout = 2;*/
				}else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
				if((isActiveLayout && indexActiveLayout== 0) || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 2)) { 
					indexActiveLayout= 2;
					if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
					String l_sectionTitleReference="";
					String l_sectionTitleType="";
					String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
					if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
						tools.appendString(l_sectionTitle);
						}
						if(!"".equals(l_sectionTitle))
						pg_layoutGroupMeta.put("title",l_sectionTitle);
						}
					}
					isActiveLayout=false;
					if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
						defaultIndexActiveLayout= 3; /*if(3 != 1) prioritizedActiveLayout = 3;*/
					}else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
					if((isActiveLayout && indexActiveLayout== 0) || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 3)) { 
						indexActiveLayout= 3;
						if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
						String l_sectionTitleReference="";
						String l_sectionTitleType="";
						String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
						if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
							tools.appendString(l_sectionTitle);
							}
							if(!"".equals(l_sectionTitle))
							pg_layoutGroupMeta.put("title",l_sectionTitle);
							}
						}
						if(defaultIndexActiveLayout != 0 && defaultIndexActiveLayout != indexActiveLayout) { 
							 /*if(flagAnyActiveWhenState == 1){ prioritizedActiveLayout = indexActiveLayout; } */ indexActiveLayout=0;
							if(prioritizedActiveLayout!=0) defaultIndexActiveLayout=prioritizedActiveLayout;
						}
						if(flagAnyActiveWhenState == 2) { if(prioritizedActiveLayout != 0) defaultIndexActiveLayout = prioritizedActiveLayout; else defaultIndexActiveLayout = expandedGrpIdIndex; indexActiveLayout = 0; }
						 int j = 0;
						 while (notVisibleLayoutsList.size() > j) {
						 if(notVisibleLayoutsList.contains(defaultIndexActiveLayout)) { 
						 defaultIndexActiveLayout = (notVisibleLayoutsList.get(j) + 1); 
						 if(!notVisibleLayoutsList.contains(defaultIndexActiveLayout)) break;
						 }
						 j++;
						 }
						if (indexActiveLayout == 0 || (("menu".equalsIgnoreCase(LGType)) || ("".equalsIgnoreCase(LGType)))) { 
							if(defaultIndexActiveLayout== 0) { 
								defaultIndexActiveLayout= 1;
							}
							if(defaultIndexActiveLayout==1) { 
								indexActiveLayout= 1;
								String l_sectionTitleReference="";
								String l_sectionTitleType="";
								String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Overview");
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
									tools.appendString(l_sectionTitle);
									}
									if(!"".equals(l_sectionTitle))
									pg_layoutGroupMeta.put("title",l_sectionTitle);
								}
								if(defaultIndexActiveLayout==2) { 
									indexActiveLayout= 2;
									String l_sectionTitleReference="";
									String l_sectionTitleType="";
									String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pulse");
									if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
										tools.appendString(l_sectionTitle);
										}
										if(!"".equals(l_sectionTitle))
										pg_layoutGroupMeta.put("title",l_sectionTitle);
									}
									if(defaultIndexActiveLayout==3) { 
										indexActiveLayout= 3;
										String l_sectionTitleReference="";
										String l_sectionTitleType="";
										String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","More");
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
											tools.appendString(l_sectionTitle);
											}
											if(!"".equals(l_sectionTitle))
											pg_layoutGroupMeta.put("title",l_sectionTitle);
										}
									}
									numVisibleLayouts+=3;
									if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
										tools.appendString("</h2></div>");
										}
										List<Integer> visibleLayoutsListInAccordion = new ArrayList<Integer>();
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											pg_layoutGroupMeta.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)','region':'Preview Content'}") + "");
											if(!repeatSelected.isEmpty()){
											org.json.simple.JSONObject JSONRepeatObj = new org.json.simple.JSONObject(repeatSelected);
											pg_layoutGroupMeta.put("lgActiveMap",JSONRepeatObj.toString());
											}
											pg_layoutGroupMeta.put("labelJSP","false");
											pg_layoutGroupMeta.put("tabGrpId","CaseHeaderS16");
											pg_layoutGroupMeta.put("format","tab");
											pg_layoutGroupMeta.put("pyNumberedAccordion","false");
											pg_layoutGroupMeta.put("pySemanticTabLayout","true");
											pg_layoutGroupMeta.put("pyAllowScrollForTabHeaders","true");
											pg_layoutGroupMeta.put("nVisibleLayout","3");
											pg_layoutGroupMeta.put("customcss","preview-content");
											pg_layoutGroupMeta.put("class"," count-3");
											pg_layoutGroupMeta.put("optKeys","{\"swipe\":\"false\"}");
											pg_layoutGroupMeta.put("menuPage",tools.getStepPage().getReference());
											pg_layoutGroupMeta.put("isMobile",isMobile);
											pg_layoutGroupMeta.put("uniqueid","202602230450140316");
											if(!"".equals(LGType))
											pg_layoutGroupMeta.put("lgType",LGType);
										}
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("1")){
											indexActiveLayout = 1; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 1==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupTemplateCell_1(indexActiveLayout, numVisibleLayouts );
	 }else{ 
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("1")){
											indexActiveLayout = 1; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 1==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupCell_1(indexActiveLayout, numVisibleLayouts );
	}
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("2")){
											indexActiveLayout = 2; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 2==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupTemplateCell_2(indexActiveLayout, numVisibleLayouts );
	 }else{ 
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("2")){
											indexActiveLayout = 2; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 2==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupCell_2(indexActiveLayout, numVisibleLayouts );
	}
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("3")){
											indexActiveLayout = 3; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 3==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupTemplateCell_3(indexActiveLayout, numVisibleLayouts );
	 }else{ 
											if("accordion".equals(LGType)){
											if(indexExpAccordian != null && Arrays.asList(indexExpAccordian).contains("3")){
											indexActiveLayout = 3; visibleLayoutsListInAccordion.add(indexActiveLayout);
											} else  {
											 if(indexExpAccordian != null && 3==1){ indexActiveLayout = 0; }  } if(prioritizedActiveLayout !=0 && !notVisibleLayoutsList.contains(prioritizedActiveLayout)) indexActiveLayout = prioritizedActiveLayout;
											}
											layoutGroupCell_3(indexActiveLayout, numVisibleLayouts );
	}
										lgExpandedGrpIdHidden= (tools.getParamCSF("EXPANDEDLGLayoutGroupCaseHeaderS16") != "" && tools.getParamCSF("EXPANDEDLGLayoutGroupCaseHeaderS16") != null) ? tools.getParamCSF("EXPANDEDLGLayoutGroupCaseHeaderS16") : indexActiveLayout+"";
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
										}
										if(!"accordion".equals(LGType)){
										if(indexActiveLayout == 0) {
										if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
											tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGroupCaseHeaderS16' value='" + lgExpandedGrpIdHidden + "'/>");
											
										}
									} else {
									if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
										tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGroupCaseHeaderS16' value='" + indexActiveLayout + "'/>");
										
									}
								}
								}else {
								if(visibleLayoutsListInAccordion.size() > 0){
								commaSeparateList = visibleLayoutsListInAccordion.toString().replaceAll("[\\s\\[\\]]", "");
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
									tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGroupCaseHeaderS16' value='" + commaSeparateList + "'/>");
									
								}
								} else {
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
									tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGroupCaseHeaderS16' value='" + lgExpandedGrpIdHidden + "'/>");
									
								}
								}
								}
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
									tools.appendString("<input type='hidden' name='LGTypeLGLayoutGroupCaseHeaderS16' value='" + tools.getParamCSF(LGTypeHiddenId) + "'/>");
									
								tools.appendString("</div>");
								}
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
									cc_lg.addPropertyToMetadata("expandGrpId",lgExpandedGrpIdHidden);
									if(!"".equals(commaSeparateList)) 
									cc_lg.addPropertyToMetadata("activeList",commaSeparateList);
									cc_lg.addPropertyToMetadata("indexActive",indexActiveLayout+"");
									cc_lg.addAdditionalBundles("LGBundle","pzPega_layout_group_scripts");
									cc_lg.addAdditionalBundles("ControlMenu","pzPega_control_menu_scripts");
									cc_lg.endComponent();
								}
							}
							public void pzLayoutContainer_18() {
							IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
							String expressionId = null;
							com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
							String expressionId_BV = null;
							com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
							if(!StringUtils.isBlank(expressionId_BV)) {
								metadataPage.put("expressionId_BV",expressionId_BV);
							}
							String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBBBBBB";
							String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)','region':'Preview Content'}");
							if(!inspectorLayoutData.isEmpty()) {
							metadataPage.put("liveUI", inspectorLayoutData);
							}
							String pyPrefix = null;
							IUIComponent containerComponent = pzAuto.getUIComponent();
							com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
							boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2== rxpxThread.pzACName cqacsecondary", pxUniqueStreamHash+"_143");metadataPage.put("dlChild","true");
							metadataPage.put("lMode","SimpleDiv");
							IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
							pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_143");
							metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
							containerComponent.beginComponent("pxLayoutContainer",metadataPage);
							if(pyVisibility) {
							pzLayoutBody_18();
							}
							containerComponent.endComponent();
							runtimeContextTree.endVisibleWhen();
							}
public void pzLayout_26() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== rxpxThread.pzACName cqacsecondary","pxThread.pzACName=\'acsecondary\'", "layout", "visible" )) {pzSetExpandParam_24();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_26();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_18();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_33( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2== rxpxThread.pzACName cqacsecondary","pxThread.pzACName=\'acsecondary\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_26();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_33( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2== rxpxThread.pzACName cqacsecondary",pxUniqueStreamHash+"_145");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_145");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pxThread.pzACName='acsecondary'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_145");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2== rxpxThread.pzACName cqacsecondary", pxUniqueStreamHash+"_145"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_26();
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
public void pzSetExpandParam_23() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBBBBBBBB","",false);
}


public void simpleLayout_15() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash125 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash125 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash125 != null && !"".equals(spxUniqueStreamHash125)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash125,pxUniqueStreamHash+"_125");
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
	refreshAttributes += " RWP=\".pxUpdateDateTime,.pxSaveDateTime\" RW=\".pxUpdateDateTime Changes  || .pxSaveDateTime Changes\" ";
	
	String strDTransform = "";
	strDTransform = "";
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pxUpdateDateTime"), -1);
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pxSaveDateTime"), -1);
		}
	}catch(Exception e){}
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202012280114450130270") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + "flex  content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_126";
		try{
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  ".pxUpdateDateTime Changes  || .pxSaveDateTime Changes", expressionId);
		expressionId = expression.getId();
		}
		catch(ClassCastException e){
		expressionId = "";
		}
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash125 != null && !"".equals(spxUniqueStreamHash125)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_125");
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
		pg_dlmeta.put("clear","false");
		pg_dlmeta.put("lMode","SimpleDiv");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_33(index);
	}else{
		index=simpleLayoutTemplateCell_33(index);
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
	public void pzLayoutContainer_19() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_19();
	containerComponent.endComponent();
	}
public void pzLayout_27() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_23();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_27();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_19();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_14() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_14");simpleLayout_14();
}
public void pzLayoutBodyWrapper_22() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_14");simpleLayout_14();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_13() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_13");simpleLayout_13();
}
public void pzLayoutBodyWrapper_21() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_13");simpleLayout_13();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_12() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_12");simpleLayout_12();
}
public void pzLayoutBodyWrapper_20() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_12");simpleLayout_12();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxLink_2() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201902011147110332174910",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","CaseHeader_$CTX$_50");
		String repeatIndx = "";
	modePage2.put("styles","no-peek-preview");
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyActionPrompt");
	}
	pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
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
	String spxUniqueStreamHash118 = getUIActionsMetaData_7();
	if(spxUniqueStreamHash118 != null && !"".equals(spxUniqueStreamHash118)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash118,pxUniqueStreamHash+"_118");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_118");
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
		 String buttonUID = "name='CaseHeader_"+ referenceString+ "_50'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201902011147110332174910") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.infinity.hideSlideInPanel()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"dynamicContainer\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"pega.desktop.infinity.hideSlideInPanel()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			{
			com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
			actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
			actionRequest.registerFixedParameter("action", "openWorkByHandle");
			pzAuto.registerActionRequest(actionRequest);
			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");			tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"false\",\"false\",{\"target\":\"dynamicContainer\"}]");
			}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='no-peek-preview");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");		}

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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }			}


}

public void pzLayoutHeader_2() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("headingLevel","h1");
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBBBB"));
metadataPage.put("titleType","Property");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
metadataPage.put("title", ".pyLabel");
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyLabel", "pyCaption");
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyLabel");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("uniqueid", "202602230450140212");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201806191352120508640") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_11() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_11");simpleLayout_11();
}
public void pzLayoutBodyWrapper_19() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_11");simpleLayout_11();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void pzSetExpandParam_22() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBBBBBBB","",true);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='layout layout-outline layout-outline' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBBBB";
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
l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption",tools.getProperty(".pyLabel").getStringValue()));
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='1' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel6098' data-layout-id='202602230450140209" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h1  class='header-title' id='headerlabel6098'>" + l_sectionTitle + "</h1><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionCaseHeaderBBBBBBBBBBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_11() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash113 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash113 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash113 != null && !"".equals(spxUniqueStreamHash113)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash113,pxUniqueStreamHash+"_113");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806191352120508640") + " ");
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
		tools.appendString(" class='" + "flex  content  layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash113 != null && !"".equals(spxUniqueStreamHash113)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_113");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","inline_middle");
		pg_dlmeta.put("isDLChild","true");
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
	public void pzLayoutContainer_11() {
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
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","44");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o1! wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel", pxUniqueStreamHash+"_114");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Flexbox");
	metadataPage.put("contCustom","layout-outline-fake");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_114");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutHeader_2();
	pzLayoutBody_11();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_19() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o1! wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel","!IsSecondaryAjaxContainerContext && (pyShowCaseID || ShowCaseTypeLabel)", "layout", "visible" )) {pzSetExpandParam_22();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_2();
}
pzLayoutBodyWrapper_19();
 LayoutWrapperTableEnd_1(); }
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_11();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_10() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_10");simpleLayout_10();
}
public void pzLayoutBodyWrapper_18() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_10");simpleLayout_10();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_9() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();
}
public void pzLayoutBodyWrapper_17() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzSetExpandParam_21() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBBBBBB","",false);
}


public void simpleLayout_9() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash107 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash107 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash107 != null && !"".equals(spxUniqueStreamHash107)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash107,pxUniqueStreamHash+"_107");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201808131316090012687") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)','region':'Case header actions'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle flex-justify-end" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash107 != null && !"".equals(spxUniqueStreamHash107)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_107");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","flex-justify-end");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)','region':'Case header actions'}") + "").append("\"").toString();
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
	public void pzLayoutContainer_9() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)','region':'Case header actions'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_108");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_108");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_9();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_17() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o1! wxIsSecondaryAjaxContainerContext","!IsSecondaryAjaxContainerContext", "layout", "visible" )) {pzSetExpandParam_21();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_17();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_9();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_16() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_16();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_16() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_106","pxFollowUnfollow", secInfo);
}


public void sectionBodyIncludeInCell_16() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_16();
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
	String sectionName = "pxFollowUnfollow"; 
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
public void pzSetExpandParam_20() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader523","",false);
}
public void pzLayout_16() {
pzSetExpandParam_20();
pzLayoutBodyWrapper_16();
}
public void buildSection_15() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_103","pxFollowUnfollow", secInfo);
}


public void sectionBodyIncludeInCell_15() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_15();
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
	String sectionName = "pxFollowUnfollow"; 
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
public void pzLayoutBodyWrapper_15() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_14();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_14() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_102","CaseActionHeader", secInfo);
}


public void sectionBodyIncludeInCell_14() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_14();
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
	String sectionName = "CaseActionHeader"; 
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
public void pzSetExpandParam_19() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader422","",false);
}
public void pzLayout_15() {
pzSetExpandParam_19();
pzLayoutBodyWrapper_15();
}
public void buildSection_13() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_99","CaseActionHeader", secInfo);
}


public void sectionBodyIncludeInCell_13() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_13();
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
	String sectionName = "CaseActionHeader"; 
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
public void pzLayoutBody_8() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();
}
public void pzLayoutBodyWrapper_14() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_7() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.infinity.hideSlideInPanel()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"dynamicContainer\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"pega.desktop.infinity.hideSlideInPanel()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			{
			com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
			actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
			actionRequest.registerFixedParameter("action", "openWorkByHandle");
			pzAuto.registerActionRequest(actionRequest);
			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");			tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"false\",\"false\",{\"target\":\"dynamicContainer\"}]");
			}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}			String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201902011147110332174910",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","CaseHeader_$CTX$_39");
		String repeatIndx = "";
	modePage2.put("styles","no-peek-preview");
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyActionPrompt");
	}
	pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
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
	String spxUniqueStreamHash93 = getUIActionsMetaData_7();
	if(spxUniqueStreamHash93 != null && !"".equals(spxUniqueStreamHash93)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash93,pxUniqueStreamHash+"_93");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_93");
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
		 String buttonUID = "name='CaseHeader_"+ referenceString+ "_39'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201902011147110332174910") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.infinity.hideSlideInPanel()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
		actionRequest.registerFixedParameter("action", "openWorkByHandle");
		pzAuto.registerActionRequest(actionRequest);
		tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);		tools.appendString("\"]");
		tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");		tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);		tools.appendString("\",\"false\",\"false\",{\"target\":\"dynamicContainer\"}]");
		}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"pega.desktop.infinity.hideSlideInPanel()\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			{
			com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
			actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
			actionRequest.registerFixedParameter("action", "openWorkByHandle");
			pzAuto.registerActionRequest(actionRequest);
			tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);			tools.appendString("\"]");
			tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");			tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);			tools.appendString("\",\"false\",\"false\",{\"target\":\"dynamicContainer\"}]");
			}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='no-peek-preview");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");		}

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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }			}


}

public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("headingLevel","h1");
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBB"));
metadataPage.put("titleType","Property");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
metadataPage.put("title", ".pyLabel");
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyLabel", "pyCaption");
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyLabel");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("uniqueid", "202602230450130993");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201806191352120508640") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_7() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();
}
public void pzLayoutBodyWrapper_13() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void pzHeaderCellContent_1() {
tools.putSaveValue("parentLayouttype","");}
public void pzSetExpandParam_18() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBBBBB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='layout layout-outline layout-outline' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBB";
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
l_sectionTitle=StringUtils.crossScriptingFilter(tools.getLocalizedTextForParameterizedString("pyCaption",tools.getProperty(".pyLabel").getStringValue()));
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='1' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel2483' data-layout-id='202602230450130988" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h1  class='header-title' id='headerlabel2483'>" + l_sectionTitle + "</h1><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionCaseHeaderBBBBBBBBBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_7() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash88 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash88 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash88 != null && !"".equals(spxUniqueStreamHash88)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash88,pxUniqueStreamHash+"_88");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806191352120508640") + " ");
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
		tools.appendString(" class='" + "flex  content  layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash88 != null && !"".equals(spxUniqueStreamHash88)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_88");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","inline_middle");
		pg_dlmeta.put("isDLChild","true");
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
	public void LayoutWrapperTableEnd_1() {
	tools.appendString("</div>");
	}
	public void pzLayoutContainer_7() {
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
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","33");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_89");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Flexbox");
	metadataPage.put("contCustom","layout-outline-fake");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_89");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutHeader_1();
	pzLayoutBody_7();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_13() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o1! wxIsSecondaryAjaxContainerContext","!IsSecondaryAjaxContainerContext", "layout", "visible" )) {pzSetExpandParam_18();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_13();
 LayoutWrapperTableEnd_1(); }
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_7();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_22( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o1! wxIsSecondaryAjaxContainerContext","!IsSecondaryAjaxContainerContext","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_13();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_22( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o1! wxIsSecondaryAjaxContainerContext",pxUniqueStreamHash+"_91");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_91");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!IsSecondaryAjaxContainerContext");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_91");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o1! wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_91"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_13();
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


public int simpleLayoutCell_23( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxIsSecondaryAjaxContainerContext","IsSecondaryAjaxContainerContext","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxLink",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","case-title","case-title")  + " " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxLink_1();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_23( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201902011147110332174910-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxLink");
	pgCells.put("forLabel",".pyLabel");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","case-title");
	pgCells.put("customRWStyles","case-title");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxIsSecondaryAjaxContainerContext",pxUniqueStreamHash+"_95");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_95");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","IsSecondaryAjaxContainerContext");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_95");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_95"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxLink",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxLink_1();}
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
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_17() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBBBB","",false);
}


public void simpleLayout_8() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash87 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash87 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash87 != null && !"".equals(spxUniqueStreamHash87)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash87,pxUniqueStreamHash+"_87");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202005270948130645142") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle height-100-pct" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash87 != null && !"".equals(spxUniqueStreamHash87)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_87");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","height-100-pct");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_22(index);
	}else{
		index=simpleLayoutTemplateCell_22(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_23(index);
	}else{
		index=simpleLayoutTemplateCell_23(index);
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
	public void pzLayoutContainer_8() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o1! wxpyShowCaseID o1! wxShowCaseTypeLabel", pxUniqueStreamHash+"_96");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_96");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_8();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_14() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o1! wxpyShowCaseID o1! wxShowCaseTypeLabel","!pyShowCaseID && !ShowCaseTypeLabel", "layout", "visible" )) {pzSetExpandParam_17();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_14();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_8();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_6() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();
}
public void pzLayoutBodyWrapper_12() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_5() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
}
public void pzLayoutBodyWrapper_11() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxDisplayText_4() {String key="30||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","30"};oCellRuntimeParamsMap.put("30||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",paramValues);oControlPathsMap.put("30||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}


public int simpleLayoutCell_19( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyCaseTypeLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing   case-type-label dataValueRead flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxDisplayText_4();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_19( int index) {
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
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190510022618055338234-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyCaseTypeLabel");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard (label for field)_iconRequired");
	pgCells.put("customROStyles","case-type-label");
	pgCells.put("customRWStyles","case-type-label");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyReadOnlyWhenCond","readonlyAlways");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyCaseTypeLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDisplayText_4();labelName = "";
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
public void pzSetExpandParam_16() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBBB","",false);
}


public void simpleLayout_5() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash78 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash78 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash78 != null && !"".equals(spxUniqueStreamHash78)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash78,pxUniqueStreamHash+"_78");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202005270911330590561") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash78 != null && !"".equals(spxUniqueStreamHash78)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_78");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_19(index);
	}else{
		index=simpleLayoutTemplateCell_19(index);
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
	public void pzLayoutContainer_5() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& wxShowCaseTypeLabel o1! wxpyShowCaseID", pxUniqueStreamHash+"_81");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_81");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_5();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_11() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& wxShowCaseTypeLabel o1! wxpyShowCaseID","ShowCaseTypeLabel && !pyShowCaseID", "layout", "visible" )) {pzSetExpandParam_16();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_11();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_5();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_4() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
}
public void pzLayoutBodyWrapper_10() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_6() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
		pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseHeader",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_71"+"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }						{
							StringMap keyMap = new HashStringMap();
							keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
							keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
							pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
							pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
							}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseHeader",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									}
									if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
									String usingPage = "";
									if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
									if("true".equals(bHasPrivilege )) {
										tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_71"+"\"]");
										} else {
											tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
											}
											}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}											String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20190807140236093243868") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseHeader_$CTX$_27");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Breadcrumbs\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Breadcrumbs", ".pyActionPrompt");
	}
	pyTooltip = "Breadcrumbs";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-caret-down";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyButtonLabel");
	}
	pyLabel = "";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash70 = getUIActionsMetaData_6();
	if(spxUniqueStreamHash70 != null && !"".equals(spxUniqueStreamHash70)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash70,pxUniqueStreamHash+"_70");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_70");
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
		 String buttonUID = "name='CaseHeader_"+ referenceString+ "_27'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20190807140236093243868") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
		pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseHeader",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_72"+"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }						{
							StringMap keyMap = new HashStringMap();
							keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
							keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
							pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
							pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
							}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseHeader",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									}
									if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
									String usingPage = "";
									if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
									if("true".equals(bHasPrivilege )) {
										tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_72"+"\"]");
										} else {
											tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
											}
											}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Breadcrumbs\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-caret-down";
		tools.appendString("<i aria-hidden='true'  data-keyboard='.' data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");										}

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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }											}


}



public void pxDisplayText_3() {String key="26||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","32","","","Text","true","26"};oCellRuntimeParamsMap.put("26||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",paramValues);oControlPathsMap.put("26||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}


public int simpleLayoutCell_16( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyID",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing   case-id text-size-small dataValueRead flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxDisplayText_3();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_16( int index) {
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
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190510022618055338234-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyID");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard (label for field)_iconRequired");
	pgCells.put("customROStyles","case-id text-size-small");
	pgCells.put("customRWStyles","case-id text-size-small");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyReadOnlyWhenCond","readonlyAlways");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyID",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDisplayText_3();labelName = "";
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


public int simpleLayoutCell_17( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2!= rx.pxCoverInsKey cq",".pxCoverInsKey!=\'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-bottom-spacing remove-right-spacing   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_5();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_17( int index) {
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
	pgCells.put("partialClass","remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190807140236093243868-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2!= rx.pxCoverInsKey cq",pxUniqueStreamHash+"_74");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_74");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".pxCoverInsKey!=''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_74");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2!= rx.pxCoverInsKey cq", pxUniqueStreamHash+"_74"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_5();}
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
public void pzSetExpandParam_15() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBBB","",false);
}


public void simpleLayout_4() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash66 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash66 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash66 != null && !"".equals(spxUniqueStreamHash66)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash66,pxUniqueStreamHash+"_66");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202005191802260919698") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash66 != null && !"".equals(spxUniqueStreamHash66)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_66");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_16(index);
	}else{
		index=simpleLayoutTemplateCell_16(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_17(index);
	}else{
		index=simpleLayoutTemplateCell_17(index);
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
	public void pzLayoutContainer_4() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& wxpyShowCaseID o1! wxShowCaseTypeLabel", pxUniqueStreamHash+"_75");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_75");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_4();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_10() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& wxpyShowCaseID o1! wxShowCaseTypeLabel","pyShowCaseID && !ShowCaseTypeLabel", "layout", "visible" )) {pzSetExpandParam_15();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_10();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_9() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_5() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
		pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseHeader",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_59"+"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }						{
							StringMap keyMap = new HashStringMap();
							keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
							keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
							pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
							pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
							}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseHeader",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									}
									if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
									String usingPage = "";
									if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
									if("true".equals(bHasPrivilege )) {
										tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_59"+"\"]");
										} else {
											tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
											}
											}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}											String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20190807140236093243868") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseHeader_$CTX$_23");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Breadcrumbs\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Breadcrumbs", ".pyActionPrompt");
	}
	pyTooltip = "Breadcrumbs";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-caret-down";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyButtonLabel");
	}
	pyLabel = "";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash58 = getUIActionsMetaData_5();
	if(spxUniqueStreamHash58 != null && !"".equals(spxUniqueStreamHash58)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash58,pxUniqueStreamHash+"_58");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_58");
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
		 String buttonUID = "name='CaseHeader_"+ referenceString+ "_23'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20190807140236093243868") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
		pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseHeader",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_60"+"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }						{
							StringMap keyMap = new HashStringMap();
							keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
							keyMap.putString("pyActionName", "pxShowBreadcrumbs");
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
							pzPackageRuntime.packageLocalAction("pxShowBreadcrumbs", offlineUsingPage , strLAClassName);
							pzPackageRuntime.packageSection("pyOverlayTemplate", offlineUsingPage, strLAClassName, true);
							}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseHeader",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									}
									if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
									String usingPage = "";
									if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
									if("true".equals(bHasPrivilege )) {
										tools.appendString("[\"processAction\", [\"pxShowBreadcrumbs\",\"overlay\",\":event\",\"\",\""+streamType+"\",\"\",\"pzModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"false\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"firstuse\",\""+pxUniqueStreamHash+"_60"+"\"]");
										} else {
											tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
											}
											}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Breadcrumbs\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-caret-down";
		tools.appendString("<i aria-hidden='true'  data-keyboard='.' data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");										}

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
		metadata.put("cellInfo", "Button");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }											}


}



public void pxDisplayText_2() {String key="22||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","32","","","Text","true","22"};oCellRuntimeParamsMap.put("22||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",paramValues);oControlPathsMap.put("22||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");}


public void pxDisplayText_1() {String key="21||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","21"};oCellRuntimeParamsMap.put("21||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",paramValues);oControlPathsMap.put("21||RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}


public int simpleLayoutCell_12( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyCaseTypeLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing   case-type-label dataValueRead flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxDisplayText_1();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190510022618055338234-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyCaseTypeLabel");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard (label for field)_iconRequired");
	pgCells.put("customROStyles","case-type-label");
	pgCells.put("customRWStyles","case-type-label");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyReadOnlyWhenCond","readonlyAlways");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyCaseTypeLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDisplayText_1();labelName = "";
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


public int simpleLayoutCell_13( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyID",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   case-id text-size-small dataValueRead flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxDisplayText_2();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_13( int index) {
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
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190510022618055338234-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyID");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard (label for field)_iconRequired");
	pgCells.put("customROStyles","case-id text-size-small");
	pgCells.put("customRWStyles","case-id text-size-small");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyReadOnlyWhenCond","readonlyAlways");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyID",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDisplayText_2();labelName = "";
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


public int simpleLayoutCell_14( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2!= rx.pxCoverInsKey cq",".pxCoverInsKey!=\'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-bottom-spacing remove-right-spacing   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_4();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_14( int index) {
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
	pgCells.put("partialClass","remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20190807140236093243868-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2!= rx.pxCoverInsKey cq",pxUniqueStreamHash+"_62");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_62");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".pxCoverInsKey!=''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_62");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2!= rx.pxCoverInsKey cq", pxUniqueStreamHash+"_62"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_4();}
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
public void pzSetExpandParam_14() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBBB","",false);
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
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202005191802260917129") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle " + "'  ");
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
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_12(index);
	}else{
		index=simpleLayoutTemplateCell_12(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_13(index);
	}else{
		index=simpleLayoutTemplateCell_13(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_14(index);
	}else{
		index=simpleLayoutTemplateCell_14(index);
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
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& wxpyShowCaseID wxShowCaseTypeLabel", pxUniqueStreamHash+"_63");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_63");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_3();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_9() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& wxpyShowCaseID wxShowCaseTypeLabel","pyShowCaseID && ShowCaseTypeLabel", "layout", "visible" )) {pzSetExpandParam_14();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_9();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_15( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& wxpyShowCaseID wxShowCaseTypeLabel","pyShowCaseID && ShowCaseTypeLabel","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_9();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_15( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& wxpyShowCaseID wxShowCaseTypeLabel",pxUniqueStreamHash+"_65");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_65");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pyShowCaseID && ShowCaseTypeLabel");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_65");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& wxpyShowCaseID wxShowCaseTypeLabel", pxUniqueStreamHash+"_65"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_9();
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


public int simpleLayoutCell_18( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& wxpyShowCaseID o1! wxShowCaseTypeLabel","pyShowCaseID && !ShowCaseTypeLabel","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_10();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_18( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& wxpyShowCaseID o1! wxShowCaseTypeLabel",pxUniqueStreamHash+"_77");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_77");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pyShowCaseID && !ShowCaseTypeLabel");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_77");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& wxpyShowCaseID o1! wxShowCaseTypeLabel", pxUniqueStreamHash+"_77"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_10();
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


public int simpleLayoutCell_20( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& wxShowCaseTypeLabel o1! wxpyShowCaseID","ShowCaseTypeLabel && !pyShowCaseID","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_11();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_20( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& wxShowCaseTypeLabel o1! wxpyShowCaseID",pxUniqueStreamHash+"_83");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_83");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","ShowCaseTypeLabel && !pyShowCaseID");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_83");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& wxShowCaseTypeLabel o1! wxpyShowCaseID", pxUniqueStreamHash+"_83"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_11();
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
public void pzSetExpandParam_13() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBBB","",false);
}


public void simpleLayout_6() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash51 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash51 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash51 != null && !"".equals(spxUniqueStreamHash51)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash51,pxUniqueStreamHash+"_51");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202005270948130645142") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle height-100-pct" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash51 != null && !"".equals(spxUniqueStreamHash51)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_51");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","height-100-pct");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_15(index);
	}else{
		index=simpleLayoutTemplateCell_15(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_18(index);
	}else{
		index=simpleLayoutTemplateCell_18(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_20(index);
	}else{
		index=simpleLayoutTemplateCell_20(index);
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
	public void pzLayoutContainer_6() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2|| wxpyShowCaseID wxShowCaseTypeLabel", pxUniqueStreamHash+"_84");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_84");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_6();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_12() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2|| wxpyShowCaseID wxShowCaseTypeLabel","pyShowCaseID || ShowCaseTypeLabel", "layout", "visible" )) {pzSetExpandParam_13();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_12();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_6();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_21( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2|| wxpyShowCaseID wxShowCaseTypeLabel","pyShowCaseID || ShowCaseTypeLabel","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_12();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_21( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2|| wxpyShowCaseID wxShowCaseTypeLabel",pxUniqueStreamHash+"_86");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_86");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pyShowCaseID || ShowCaseTypeLabel");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_86");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2|| wxpyShowCaseID wxShowCaseTypeLabel", pxUniqueStreamHash+"_86"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_12();
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


public int simpleLayoutCell_24( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o1! wxpyShowCaseID o1! wxShowCaseTypeLabel","!pyShowCaseID && !ShowCaseTypeLabel","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_14();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_24( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o1! wxpyShowCaseID o1! wxShowCaseTypeLabel",pxUniqueStreamHash+"_98");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_98");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!pyShowCaseID && !ShowCaseTypeLabel");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_98");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o1! wxpyShowCaseID o1! wxShowCaseTypeLabel", pxUniqueStreamHash+"_98"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_14();
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


public int simpleLayoutCell_25( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","CaseActionHeader",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","case-header-action-buttons","case-header-action-buttons")  + " flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_13();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_25( int index) {
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
	pgCells.put("customROStyles","case-header-action-buttons");
	pgCells.put("customRWStyles","case-header-action-buttons");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","CaseActionHeader",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_15();
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


public int simpleLayoutCell_26( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2&& o2!= pxParam.isFollowDisabled cttrue wxpzIsFollowEnabled o1! wxIsSecondaryAjaxContainerContext","Param.isFollowDisabled != true && pzIsFollowEnabled && !IsSecondaryAjaxContainerContext","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pxFollowUnfollow",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_15();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_26( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2&& o2!= pxParam.isFollowDisabled cttrue wxpzIsFollowEnabled o1! wxIsSecondaryAjaxContainerContext",pxUniqueStreamHash+"_105");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_105");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","Param.isFollowDisabled != true && pzIsFollowEnabled && !IsSecondaryAjaxContainerContext");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_105");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2&& o2!= pxParam.isFollowDisabled cttrue wxpzIsFollowEnabled o1! wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_105"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pxFollowUnfollow",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_16();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	}
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


public int simpleLayoutCell_27( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o1! wxIsSecondaryAjaxContainerContext","!IsSecondaryAjaxContainerContext","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_17();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_27( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o1! wxIsSecondaryAjaxContainerContext",pxUniqueStreamHash+"_110");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_110");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!IsSecondaryAjaxContainerContext");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_110");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o1! wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_110"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_17();
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
public void pzSetExpandParam_12() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBBB","",false);
}


public void simpleLayout_10() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash50 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash50 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash50 != null && !"".equals(spxUniqueStreamHash50)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash50,pxUniqueStreamHash+"_50");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806191352120508640") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle case-header-actions flex-nowrap flex-grow-1-item-2 padding-b-0_5x height-100-pct" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash50 != null && !"".equals(spxUniqueStreamHash50)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_50");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","case-header-actions flex-nowrap flex-grow-1-item-2 padding-b-0_5x height-100-pct");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isDLChild","true");
		pg_dlmeta.put("lMode","SimpleDiv");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_21(index);
	}else{
		index=simpleLayoutTemplateCell_21(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_24(index);
	}else{
		index=simpleLayoutTemplateCell_24(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_25(index);
	}else{
		index=simpleLayoutTemplateCell_25(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_26(index);
	}else{
		index=simpleLayoutTemplateCell_26(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_27(index);
	}else{
		index=simpleLayoutTemplateCell_27(index);
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
	public void pzLayoutContainer_10() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	metadataPage.put("contCustom","case-heading");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_10();
	containerComponent.endComponent();
	}
public void pzLayout_18() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_12();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_18();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_10();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_28( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_18();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_28( int index) {
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
	pzLayout_18();
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


public int simpleLayoutCell_29( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o1! wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel","!IsSecondaryAjaxContainerContext && (pyShowCaseID || ShowCaseTypeLabel)","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_19();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_29( int index) {
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o1! wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel",pxUniqueStreamHash+"_116");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_116");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!IsSecondaryAjaxContainerContext && (pyShowCaseID || ShowCaseTypeLabel)");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_116");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o1! wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel", pxUniqueStreamHash+"_116"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_19();
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


public int simpleLayoutCell_30( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel","IsSecondaryAjaxContainerContext && (pyShowCaseID || ShowCaseTypeLabel)","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxLink",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","case-title","case-title")  + " " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxLink_2();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_30( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201902011147110332174910-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxLink");
	pgCells.put("forLabel",".pyLabel");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","case-title");
	pgCells.put("customRWStyles","case-title");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel",pxUniqueStreamHash+"_120");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_120");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","IsSecondaryAjaxContainerContext && (pyShowCaseID || ShowCaseTypeLabel)");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_120");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& wxIsSecondaryAjaxContainerContext o2|| wxpyShowCaseID wxShowCaseTypeLabel", pxUniqueStreamHash+"_120"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxLink",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxLink_2();}
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
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_11() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBBB","",false);
}


public void simpleLayout_12() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash49 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash49 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash49 != null && !"".equals(spxUniqueStreamHash49)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash49,pxUniqueStreamHash+"_49");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201812131544210270508") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  layout-content-simple_list content-simple_list flex-grow-1 height-100-pct" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash49 != null && !"".equals(spxUniqueStreamHash49)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_49");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","flex-grow-1 height-100-pct");
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_28(index);
	}else{
		index=simpleLayoutTemplateCell_28(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_29(index);
	}else{
		index=simpleLayoutTemplateCell_29(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_30(index);
	}else{
		index=simpleLayoutTemplateCell_30(index);
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
	public void pzLayoutContainer_12() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_12();
	containerComponent.endComponent();
	}
public void pzLayout_20() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_11();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_20();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_12();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_8() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_12();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_12() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_48","pxCaseIcon", secInfo);
}


public void sectionBodyIncludeInCell_12() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_12();
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
	String sectionName = "pxCaseIcon"; 
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
public void pzSetExpandParam_10() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader789","",false);
}
public void pzLayout_8() {
pzSetExpandParam_10();
pzLayoutBodyWrapper_8();
}
public void buildSection_11() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_45","pxCaseIcon", secInfo);
}


public void sectionBodyIncludeInCell_11() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_11();
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
	String sectionName = "pxCaseIcon"; 
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


public int simpleLayoutCell_11( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpyShowCaseIcon","pyShowCaseIcon","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pxCaseIcon",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","case-icon","case-icon")  + " flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_11();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","case-icon");
	pgCells.put("customRWStyles","case-icon");
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
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpyShowCaseIcon",pxUniqueStreamHash+"_47");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_47");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pyShowCaseIcon");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_47");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpyShowCaseIcon", pxUniqueStreamHash+"_47"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pxCaseIcon",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_8();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	}
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


public int simpleLayoutCell_31( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_20();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_31( int index) {
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
	pzLayout_20();
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
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBBB","",false);
}


public void simpleLayout_13() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash44 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash44 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash44 != null && !"".equals(spxUniqueStreamHash44)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash44,pxUniqueStreamHash+"_44");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201904081028060734949") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " class='" + "flex  content  layout-content-inline content-inline case-title-id" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash44 != null && !"".equals(spxUniqueStreamHash44)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_44");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","case-title-id");
		pg_dlmeta.put("format","inline");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_11(index);
	}else{
		index=simpleLayoutTemplateCell_11(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_31(index);
	}else{
		index=simpleLayoutTemplateCell_31(index);
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
	public void pzLayoutContainer_13() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_13();
	containerComponent.endComponent();
	}
public void pzLayout_21() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_9();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_21();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_13();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_7() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_6() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void menubarIncludes_1() {
pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public String 
getUIActionsMetaData_4() {
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
					pzPackageRuntime.packageSection("CaseHeader",
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
					tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840213884");
					if(pzAuto.isOffline() || false) {
					try{
					pega_uiengine_pzcontrol.pzGetMenu("pyWorkCommonActions", "", "pyNavigation1771840213884","", false, false, false, false);
					}catch(Exception e){oLog.error(e);}
					}
					tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }					{
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

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
							  IActionRequest actionRequest = pzAuto.getActionRequest();
							  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
							  pzAuto.registerActionRequest(actionRequest);
							}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseHeader",
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
									tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840213887");
									if(pzAuto.isOffline() || false) {
									try{
									pega_uiengine_pzcontrol.pzGetMenu("pyWorkCommonActions", "", "pyNavigation1771840213887","", false, false, false, false);
									}catch(Exception e){oLog.error(e);}
									}
									tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}									String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("201910071317560236d65792ac-b1ea-4cd2-8dcc-6ade6c581eab450") + " ");
	if(false || (pzAuto.isOffline() && true) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseHeader_$CTX$_7f8f4794-4fe5-4cc3-8665-63fd31ead92d");
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
	modePage2.put("styles","Icon");
	modePage2.put("showMenu","true");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-dot-3";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyButtonLabel");
	}
	pyLabel = "";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash36 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash36 != null && !"".equals(spxUniqueStreamHash36)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash36,pxUniqueStreamHash+"_36");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_36");
	}
	modePage2.put("actionPath"," data-keyboard='.' data-click='.'");
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
		 String buttonUID = "name='CaseHeader_"+ referenceString+ "_7f8f4794-4fe5-4cc3-8665-63fd31ead92d'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("201910071317560236d65792ac-b1ea-4cd2-8dcc-6ade6c581eab450") + "  data-ctl='Button'  type='button' role='button' aria-haspopup='true' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
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
					pzPackageRuntime.packageSection("CaseHeader",
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
					tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840213890");
					if(pzAuto.isOffline() || false) {
					try{
					pega_uiengine_pzcontrol.pzGetMenu("pyWorkCommonActions", "", "pyNavigation1771840213890","", false, false, false, false);
					}catch(Exception e){oLog.error(e);}
					}
					tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }					{
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

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
							  IActionRequest actionRequest = pzAuto.getActionRequest();
							  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
							  pzAuto.registerActionRequest(actionRequest);
							}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseHeader",
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
									tools.appendString(", \"ellipsisAfter\":\"25\",\"usingPage\":\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771840213893");
									if(pzAuto.isOffline() || false) {
									try{
									pega_uiengine_pzcontrol.pzGetMenu("pyWorkCommonActions", "", "pyNavigation1771840213893","", false, false, false, false);
									}catch(Exception e){oLog.error(e);}
									}
									tools.appendString("\"},\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Actions\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-dot-3";
		tools.appendString("<i aria-hidden='true'  data-keyboard='.' data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");								}
menubarIncludes_1();								if(pzAuto.doOnlyOnce("ControlMenu")){
									if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
								}
								}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }								tools.putParamValue("doAutoFormatting", "false");
								tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}								} catch (Exception e) {

								
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'								&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }									}


}

public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_10();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_10() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_34","AdditionalPreviewActions", secInfo);
}


public void sectionBodyIncludeInCell_10() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_10();
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
	String sectionName = "AdditionalPreviewActions"; 
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
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader291","",false);
}
public void pzLayout_5() {
pzSetExpandParam_8();
pzLayoutBodyWrapper_5();
}
public void buildSection_9() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_31","AdditionalPreviewActions", secInfo);
}


public void sectionBodyIncludeInCell_9() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_9();
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
	String sectionName = "AdditionalPreviewActions"; 
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
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_8();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_8() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_30","EditActionIcon", secInfo);
}


public void sectionBodyIncludeInCell_8() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_8();
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
	String sectionName = "EditActionIcon"; 
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
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader288","",false);
}
public void pzLayout_4() {
pzSetExpandParam_7();
pzLayoutBodyWrapper_4();
}
public void buildSection_7() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_27","EditActionIcon", secInfo);
}


public void sectionBodyIncludeInCell_7() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_7();
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
	String sectionName = "EditActionIcon"; 
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


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","EditActionIcon",".pyRegions(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_7();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","EditActionIcon",".pyRegions(1).pyCells(1)");
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


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","AdditionalPreviewActions",".pyRegions(1).pyCells(2)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_9();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","AdditionalPreviewActions",".pyRegions(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_5();
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


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pyRegions(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_3();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201910071317560236d65792ac-b1ea-4cd2-8dcc-6ade6c581eab450-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pyRegions(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_3();labelName = "";
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
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBBB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash26 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash26 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash26 != null && !"".equals(spxUniqueStreamHash26)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash26,pxUniqueStreamHash+"_26");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201808131316090012687") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)','region':'Preview case header actions'}") + " class='" + "flex  content  set-width-auto layout-content-inline_middle content-inline_middle flex-justify-end" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash26 != null && !"".equals(spxUniqueStreamHash26)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_26");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","flex-justify-end");
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)','region':'Preview case header actions'}") + "").append("\"").toString();
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
	String paramName = "EXPANDEDSubSectionCaseHeaderBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5).pySections(1)','region':'Preview case header actions'}");
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
public void pzLayout_6() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_6();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_6();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_3() {
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_25","pxFollowUnfollow", secInfo);
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
	String sectionName = "pxFollowUnfollow"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader104","",false);
}
public void pzLayout_3() {
pzSetExpandParam_5();
pzLayoutBodyWrapper_3();
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_22","pxFollowUnfollow", secInfo);
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
	String sectionName = "pxFollowUnfollow"; 
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
public void pzLayoutBodyWrapper_2() {
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_21","pxPreviewBackButtonRefresh", secInfo);
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
	String sectionName = "pxPreviewBackButtonRefresh"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader410","",false);
}
public void pzLayout_2() {
pzSetExpandParam_4();
pzLayoutBodyWrapper_2();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_18","pxPreviewBackButtonRefresh", secInfo);
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
	String sectionName = "pxPreviewBackButtonRefresh"; 
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
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"setUserStart\",[\"CANCEL\"]],[\"doClose\",[\":event\", null, null, false]");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(".pyLabel=''",pxUniqueStreamHash+"_14");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage2.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_14");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2018081416571901933347") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseHeader_$CTX$_5");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Back to previous\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Back to previous", ".pyActionPrompt");
	}
	pyTooltip = "Back to previous";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-arrow-left";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyButtonLabel");
	}
	pyLabel = "";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash15 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash15 != null && !"".equals(spxUniqueStreamHash15)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash15,pxUniqueStreamHash+"_15");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_15");
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
		 String buttonUID = "name='CaseHeader_"+ referenceString+ "_5'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("2018081416571901933347") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);	tools.appendString("\"]");
	tools.appendString("],[\"setUserStart\",[\"CANCEL\"]],[\"doClose\",[\":event\", null, null, false]");
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
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Back to previous\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, ".pyLabel=''", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-arrow-left";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.infinity.closeSlideInPanels()\"]");

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
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2018081416571901933347") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseHeader_$CTX$_4");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Close preview\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Close preview", ".pyActionPrompt");
	}
	pyTooltip = "Close preview";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-times";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyButtonLabel");
	}
	pyLabel = "";
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
		 String buttonUID = "name='CaseHeader_"+ referenceString+ "_4'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("2018081416571901933347") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.infinity.closeSlideInPanels()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Close preview\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-times";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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



public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing remove-top-spacing   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing remove-top-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2018081416571901933347-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_1();labelName = "";
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_2();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("labelLit","false");
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2018081416571901933347-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_2();try{
	labelName = ".pyTemplateInputBox";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(labelName);
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	}catch(Exception ex){
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
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pxPreviewBackButtonRefresh",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing    " + pzSection.getCustomStyle(false, "","hidden","hidden")  + " flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
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
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","hidden");
	pgCells.put("customRWStyles","hidden");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pxPreviewBackButtonRefresh",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_2();
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2!= pxParam.isFollowDisabled cttrue wxpzIsFollowEnabled","Param.isFollowDisabled != true && pzIsFollowEnabled","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pxFollowUnfollow",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing flex flex-row");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2!= pxParam.isFollowDisabled cttrue wxpzIsFollowEnabled",pxUniqueStreamHash+"_24");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_24");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","Param.isFollowDisabled != true && pzIsFollowEnabled");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_24");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2!= pxParam.isFollowDisabled cttrue wxpzIsFollowEnabled", pxUniqueStreamHash+"_24"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pxFollowUnfollow",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	}
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


public int simpleLayoutCell_9( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing remove-bottom-spacing set-width-auto   flex flex-row  align-end'  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_6();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing remove-bottom-spacing align-end set-width-auto flex flex-row");
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
	pzLayout_6();
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
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash8 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash8 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash8 != null && !"".equals(spxUniqueStreamHash8)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash8,pxUniqueStreamHash+"_8");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201902011206040087273") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle peak-actions case-header-actions flex-nowrap margin-b-1x flex-grow-1-item-2" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash8 != null && !"".equals(spxUniqueStreamHash8)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_8");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","peak-actions case-header-actions flex-nowrap margin-b-1x flex-grow-1-item-2");
		pg_dlmeta.put("format","inline_middle");
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
		index=simpleLayoutCell_9(index);
	}else{
		index=simpleLayoutTemplateCell_9(index);
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
	String paramName = "EXPANDEDSubSectionCaseHeaderBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_41");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_41");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_2();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_7() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxIsSecondaryAjaxContainerContext","IsSecondaryAjaxContainerContext", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_7();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_7","PreviewPanelA11y", secInfo);
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
	String sectionName = "PreviewPanelA11y"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellCaseHeader456","",false);
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_4","PreviewPanelA11y", secInfo);
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
	String sectionName = "PreviewPanelA11y"; 
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
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","PreviewPanelA11y",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","PreviewPanelA11y",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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


public int simpleLayoutCell_10( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxIsSecondaryAjaxContainerContext","IsSecondaryAjaxContainerContext","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_7();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxIsSecondaryAjaxContainerContext",pxUniqueStreamHash+"_43");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_43");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","IsSecondaryAjaxContainerContext");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_43");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxIsSecondaryAjaxContainerContext", pxUniqueStreamHash+"_43"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_7();
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


public int simpleLayoutCell_32( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_21();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_32( int index) {
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
	pzLayout_21();
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
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionCaseHeaderB","",false);
}


public void simpleLayout_14() {
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
	strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
	if("".equals(strMethodName)) {
	strMethodName = tools.getParamCSF("pyLayoutMethodName");
	}
	refreshAttributes += "data-refresh=true data-methodName=\"";
	refreshAttributes += strMethodName;
	refreshAttributes +="\""; 
	refreshAttributes += " RWP=\".pxUpdateDateTime,.pxSaveDateTime\" RW=\".pxUpdateDateTime Changes  || .pxSaveDateTime Changes\" ";
	
	String strDTransform = "";
	strDTransform = "";
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pxUpdateDateTime"), -1);
			changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pxSaveDateTime"), -1);
		}
	}catch(Exception e){}
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201804050239300055399") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-simple_list content-simple_list case-header padding-tb-2x padding-lr-2x" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		expressionId = pxUniqueStreamHash+"_3";
		try{
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  ".pxUpdateDateTime Changes  || .pxSaveDateTime Changes", expressionId);
		expressionId = expression.getId();
		}
		catch(ClassCastException e){
		expressionId = "";
		}
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_2");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","case-header padding-tb-2x padding-lr-2x");
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
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
		index=simpleLayoutCell_10(index);
	}else{
		index=simpleLayoutTemplateCell_10(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_32(index);
	}else{
		index=simpleLayoutTemplateCell_32(index);
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
	public void pzLayoutContainer_14() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionCaseHeaderB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_14();
	containerComponent.endComponent();
	}
public void pzLayout_22() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_22();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_14();
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "CaseHeader");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayoutContainer_16", new String[][] { {"methodName", "String", ""}});
pzExternalMethodMapping.put("pzLayoutContainer_17", new String[][] { {"methodName", "String", ""}});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_12", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_14", new String[][] {});
pzExternalMethodMapping.put("sectionBodyIncludeInCell_20", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_11", new String[][] {});
pzExternalMethodMapping.put("sectionBodyIncludeInCell_19", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_8", new String[][] {});
pzExternalMethodMapping.put("sectionBodyIncludeInCell_22", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_10", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_6", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_7", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_13", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("sectionBodyIncludeInCell_21", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_5", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_15", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_9", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- CASEHEADER #20210506T204027.018 GMT", "Work- CaseHeader", "Theme-Cosmos", "04-01-01", "20210506T204027.018 GMT");
}
