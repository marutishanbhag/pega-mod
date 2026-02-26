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
 * Builds JSP stream @BASECLASS!PZAPPEXPLORERTREEPINCLASSES.
 */
public class ra_stream_pzappexplorertreepinclasses_50bd5d5518bac108e6f312342950c308 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzAppExplorerTreePinClasses.Code_Pega_List.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1409288613;
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
	public ra_stream_pzappexplorertreepinclasses_50bd5d5518bac108e6f312342950c308(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "c7722f2aa85415e85c41f5b0e932f4006c750643";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT	Pega-Desktop:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "c7722f2aa85415e85c41f5b0e932f4006c750643";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzAppExplorerTreePinClasses",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT */
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
	"Rule-HTML-Section:PZAPPEXPLORERTREEPINCLASSES", 
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
		new DependentRuleInfo("PZAPPEXPLORERTREEPINCLASSES","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-05-01","RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT","!PZAPPEXPLORERTREEPINCLASSES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1409288613), 
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
//	RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT:20200311T184438.496 GMT
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
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
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(
//	simpleLayout_3(
//	pzLayout_4(
//	simpleLayout_2(
//	simpleLayout_4(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID PZGETPROPERTYCLASSNAME #20180713T133337.766 GMT:20180713T133337.766 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLOCALACTION--(CLIPBOARDP735454E5CE9DE0AF1D25BFD33036C12C #20190423T162450.172 GMT:20190423T162450.172 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSHOWMENU #20220112T101247.778 GMT:20220112T101247.778 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEMENUSCRIPTS #20180713T133346.297 GMT:20180713T133346.297 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGRIDACTIONTOKENIZER--(STRING,JAVA.UTIL.LIST) #20180713T133346.434 GMT:20180713T133346.434 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT
//	RULE-UTILITY-FUNCTION UTILITIES PZVALIDATEFIELDVALUEREFERENCE #20231004T060003.271 GMT:20231004T060003.271 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f4f94ebe55386d5cf38cd16c1403220d";
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
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayoutBodyWrapper_2();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzAppExplorerTreePinClasses",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzAppExplorerTreePinClasses','insKey':'RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT','sectionType':'standard'}");
pzLayout_1();
pzLayout_3();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")) ){
pzLayout_4();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyModalTemplate");
config.put("NewTaskStatus", "pzAppExplorerPinnedClasses");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("harnessName", "pzViewInstances");
config.put("className", "@baseclass");
config.put("readOnly", "true");
config.put("preActivity", "pzLoadViewInstances");
config.put("preActivityParams", "{\"Action\":\"forcerun\",\"ShowInstances\":\"true\",\"Label\":\"Instances\"}");
config.put("target", "newDocument");
pega.getUIEngine().getUIAction("showHarness", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "removeScreenLayoutMask");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "document.activeElement.click()");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("navName", "pzExplorerMenu");
pega.getUIEngine().getUIAction("showMenu", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_4() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
}
public void pzLayoutBodyWrapper_7() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='4' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("20150113144614080327683") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead explorer_secondary_dataLabelRead","dataLabelWrite explorer_secondary_dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","pzNoPinnedClasses") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("pyType","label");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150113144614080327683")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired explorer_secondary_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelRead explorer_secondary_dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite explorer_secondary_dataLabelWrite");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "pzNoPinnedClasses";
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
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpzAppExplorerTreePinClassesBBBBB","",false);
}


public void simpleLayout_4() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash17 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash17 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash17 != null && !"".equals(spxUniqueStreamHash17)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash17,pxUniqueStreamHash+"_17");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("20191023170203026772") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(4)'}") + " class='" + " content  layout-content-simple_list content-simple_list  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash17 != null && !"".equals(spxUniqueStreamHash17)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_17");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(4)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
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
	public void pzLayoutContainer_4() {
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
	String paramName = "EXPANDEDSubSectionpzAppExplorerTreePinClassesBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(4)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","4");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxpzShowPinnedClassesTreeGrid", pxUniqueStreamHash+"_20");metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_20");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_4();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_5() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o1! wxpzShowPinnedClassesTreeGrid","!pzShowPinnedClassesTreeGrid", "layout", "visible" )) {pzSetExpandParam_5();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_7();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_6() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridCentreLayout_1();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public void repeatingDataCell_5() {
	tools.appendString("<li  title='");
	tools.appendString("'   class='");
	tools.appendString(" cellCont");tools.appendString(" ");tools.appendString(" rowHandle ");tools.appendString(" gridColumn");tools.appendString(" ' style='width:16px;");
	tools.appendString("height:30px;");tools.appendString(""); if(!pzAuto.isOrientationRTL())    {tools.appendString(";left:");}else{tools.appendString(";right:");} int level = 0; try {int indentationLevel = level;tools.appendString( (indentationLevel*18)+"px");}catch(Exception e){tools.appendString("0");} ;tools.appendString("' >");
	if(!pzAuto.getBrowserUtils().isIE()){
	tools.appendString("<DIV class='oflowDiv' style='height:30px;'>");
	}else{
	tools.appendString("<span class='wspan'></span><div class='cellIn'>");
	}
	if(pzAuto.handleEvaluateWhen(" o1! axpzIsTopLevelNode","!pzIsTopLevelNode", "cell", "visible" )) {
	tools.appendString("<div id='iconExpandCollapse' style='' ><a href=\"#\" style='' onclick=\"return false;\" ");
	if(tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")){ if(!(tools.getStepPage().getIfPresent(".pxResults") != null && tools.getStepPage().getProperty(".pxResults").size()>0)){tools.appendString(" tabIndex='-1' ");
	} }tools.appendString(" class=\"");
	if(tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")){ if(tools.getStepPage().getIfPresent(".pxResults") != null && tools.getStepPage().getProperty(".pxResults").size()>0){tools.appendString("collapseNode\"  tabIndex='0' title='");
	tools.appendString(tools.getLocalizedTextForString(".pyCaption","Collapse to hide child rows",StreamBuilder.FMT_NORMAL));
	tools.appendString("'");
	} else {tools.appendString("noEC\"");
	 } } else {tools.appendString("expandNode\"  tabIndex='0' title='");
	tools.appendString(tools.getLocalizedTextForString(".pyCaption","Expand to show child rows",StreamBuilder.FMT_NORMAL));
	tools.appendString("'");
	}tools.appendString(">&nbsp;</a></div>");
	} else{tools.appendString("<a href=\"#\" title='");
	tools.appendString(tools.getLocalizedTextForString(".pyCaption","This row has no child nodes",StreamBuilder.FMT_NORMAL));
	tools.appendString("' onclick=\"return false;\" class='hiddenExpColl'></a>");
	}
	tools.appendString("<div id='dragHandle' style='");
	tools.appendString("display: none");
tools.appendString(";  '>&nbsp;</div></div></li>");
}
public void repeatingDataCell_4() {
		tools.appendString("<li title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20150113144614080218181") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" class='");
		tools.appendString(" cellCont");tools.appendString(" ");tools.appendString(" gridColumn");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:21px;");tools.appendString(""); tools.appendString("'>");
		
									tools.appendString("<div class='oflowWrap'>");
 if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDiv' style='height:21px;'>");
									tools.appendString("&nbsp;");}else{ 
									tools.appendString("<span class='wspan'></span><div class='cellIn'>");
									tools.appendString("&nbsp;");}if("".equals(tools.getParamValue("sortProperty"))){       tools.putParamValue("columnSortOrder","");  }else{      if("".equals(tools.getParamValue("sortProperty"))){          tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));     }   }       if("ASC".equals(tools.getParamValue("columnSortOrder"))){       tools.putParamValue("sortTitleText","columnsorted_asc");    }else if("DESC".equals(tools.getParamValue("columnSortOrder"))){        tools.putParamValue("sortTitleText","columnsorted_desc");   }else{      tools.putParamValue("sortTitleText","Enter to sort");   }tools.appendString("<div id='titleDesc1834237892' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");tools.appendString("<span id='sort'"); if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){  tools.appendString("tabIndex='0'"); } tools.appendString("class='highlight-ele ' >&nbsp;</span>");tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");tools.appendString("</div>");
									tools.appendString("</div>");
	tools.appendString("</li>");
	}
public void repeatingDataCell_3() {
		tools.appendString("<li title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20150113144614080117388") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(" cellCont");tools.appendString(" ");tools.appendString(" ");tools.appendString(" rowHandleHead ");tools.appendString(" gridColumn");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:21px;");tools.appendString(""); if(!pzAuto.isOrientationRTL())    {tools.appendString(";left:");}else{tools.appendString(";right:");} int level = 0; try {int indentationLevel = level;tools.appendString( (indentationLevel*18)+"px");}catch(Exception e){tools.appendString("0");} ;tools.appendString("'>");
		
									tools.appendString("<div class='oflowWrap'>");
 if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDiv' style='height:21px;'>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }}else{ 
									tools.appendString("<span class='wspan'></span><div class='cellIn'>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }}if("".equals(tools.getParamValue("sortProperty"))){       tools.putParamValue("columnSortOrder","");  }else{      if("".equals(tools.getParamValue("sortProperty"))){          tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));     }   }       if("ASC".equals(tools.getParamValue("columnSortOrder"))){       tools.putParamValue("sortTitleText","columnsorted_asc");    }else if("DESC".equals(tools.getParamValue("columnSortOrder"))){        tools.putParamValue("sortTitleText","columnsorted_desc");   }else{      tools.putParamValue("sortTitleText","Enter to sort");   }tools.appendString("<div id='titleDesc1025859214' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");tools.appendString("<span id='sort'"); if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){  tools.appendString("tabIndex='0'"); } tools.appendString("class='highlight-ele ' >&nbsp;</span>");tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");tools.appendString("</div>");
									tools.appendString("</div>");
	tools.appendString("</li>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}


public void D_AppExplorerPinnedClasses_pxResults_2() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-rightclick='[");if(isBehaviorAdded && true){ tools.appendString(","); }if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
  IActionRequest actionRequest = pzAuto.getActionRequest();
  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
  pzAuto.registerActionRequest(actionRequest);
}
tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzExplorerMenu\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"");

		tools.appendString("#~.pxObjClass$0$~#");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
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
tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771593784902");
if(pzAuto.isOffline() || false) {
try{
ClipboardPage pg_tempPrimPg = tools.createPage("Embed-ExplorerNode-Class","tempNavStepPg");
tools.putParamValue("tempNavStepPg",pg_tempPrimPg.getName());
pega_uiengine_pzcontrol.pzGetMenu("pzExplorerMenu", "", "pyNavigation1771593784902","", false, true, false, false);
tools.getParameterPage().remove("tempNavStepPg");
pg_tempPrimPg.removeFromClipboard();
}catch(Exception e){oLog.error(e);}
}
tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"runScript\", [\"document.activeElement.click&#40;&#41;()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzAppExplorerTreePinClassesBBBB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATTREEGRID','pgRef':'.pySections(3)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzAppExplorerTreePinClassesBBBB";
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

 ClipboardPage gFCritPageD_AppExplorerPinnedClasses_pxResultsL14=null;

 Map selUniqMapD_AppExplorerPinnedClasses_pxResultsL14 = null;
tools.appendString("<div  section_index='3' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_AppExplorerPinnedClasses.pxResults").getReference());tools.appendString("_pzAppExplorerTreePinClasses_3'");
tools.appendString(" bRowHovering='false' deferLoadAct='pzRunAppExplorerExpand' class=\"");
tools.appendString("repeatContainer gridDefault  TreeGrid  ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='true' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='false' OAFunc='openRuleByKeys' ");
D_AppExplorerPinnedClasses_pxResults_2();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='Explorer_Tree'>");
}


public void gridCentreLayout_1() {/*gridCentreLayout*/
if(pzAuto.doOnlyOnce("ControlMenu")){
	if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
}
}
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
pega_rules_utilities.pzRegisterActivity(tools, "pzupdateExpandStatus");
config = new HashMap<String, String>();
config.put("pyCustomActivity", "pzRunAppExplorerExpand");
config.put("pzActivity", "pzgetChildNodes");
pega.getUIEngine().getUIAction("runActivity", config).register();
pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					tools.putSaveValue("bUseMenuInline","false");

					pzGridIncludes_1();

					if(tools.getParamValue("partialRefresh").equals("")){

					ClipboardProperty prop = tools.getProperty("D_AppExplorerPinnedClasses.pxResults");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='   ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("' gPropIndex='D_AppExplorerPinnedClassesPpxResults3' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false  bTreegridSingleCol='true' ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_AppExplorerPinnedClassesPpxResults3colWidthGBL\" id=\"D_AppExplorerPinnedClassesPpxResults3colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("D_AppExplorerPinnedClassesPpxResults3colWidthGBL"));tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<table cellpadding='0' id='bodyTbl_gbl' cellspacing='0' border='0' width='100%' style='width: ");

					if(!tools.getParamValue("D_AppExplorerPinnedClassesPpxResults3colWidthGBL").equals("")) { tools.appendParamCSF("D_AppExplorerPinnedClassesPpxResults3colWidthGBL"); } 

					tools.appendString("px;'><tr><td valign='top'>\n\t\t\t\t\t\t\t\t\t<div id='gridBody_left' style=''>\n\t\t\t\t\t\t\t\t\t\t<UL  id='gridNode' bRowResize='false' bColumnResize='false' class='gridNode' >\n\t\t\t\t\t\t\t\t\t\t<li class='gridRow' style=\"display:none;\">");

					tools.appendString("<ul class='rowContent  headerRowContent  ' ");

					if(pzAuto.getBrowserUtils().isFF()){tools.appendString("style='height:23px;");}else{tools.appendString("style='height:23px;");}getInlineStyle_1(); if(!pzAuto.isOrientationRTL())    {tools.appendString(";padding-left:");}else{tools.appendString(";padding-right:");} try { int level = 0;tools.appendString(18 + (level * 18)+ "px");}catch(Exception e){tools.appendString("18px");} tools.appendString("'");

					tools.appendString(" >");

					 repeatingDataCell_3(); 

					 repeatingDataCell_4(); 

					tools.appendString("</ul>\n\t\t\t\t\t\t\t\t\t\t</li>");

					
 {int counter = 0; int rowsDisplayed = 0;

					
								{Iterator itr_2 = tools.getStepPage().getProperty("D_AppExplorerPinnedClasses.pxResults").iterator(); 

					
								 while(itr_2.hasNext()){ 

					
									 ClipboardProperty cp_eachProp_2 = (ClipboardProperty)itr_2.next(); 

					
									  ClipboardPage pg_eachProp_2 = cp_eachProp_2.getPageValue();

					
									 PRStackFrame frame_2 = pega.pushStackFrame("FixedColTreeGrid", null, pg_eachProp_2, false, false);

					
									 tools.putActive(cp_eachProp_2); 

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
										 counter++; 

					 rowsDisplayed++; 

					tools.putSaveValue("curRowNum",""+rowsDisplayed );

					
						 tools.putParamValue("expandRL","true");

					tools.appendString("\n\t\t\t\t\t\t\t<li class='gridRow' isWrapEnabled=false  id='");

					 tools.appendString(tools.getActiveName()); 

					tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_AppExplorerPinnedClasses.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_AppExplorerPinnedClasses.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index"));tools.appendString("' >");

					tools.appendString("<ul ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString("objclass=\"");

					tools.appendString(tools.getStepPage().getClassName());

					tools.appendString("\"class='rowContent ");

					tools.appendString(" ' ");

					if((pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()) && !pega_uiengine_harness.pzInStandardsMode()){tools.appendString("style='height:31px;");}else{tools.appendString("style='height:30px;");}getInlineStyle_1(); if(!pzAuto.isOrientationRTL())    {tools.appendString(";padding-left:");}else{tools.appendString(";padding-right:");} try { int level = 0;tools.appendString(18 + (level * 18)+ "px");}catch(Exception e){tools.appendString("18px");} tools.appendString("'");tools.appendString(" >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_5(); 

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_2(); 

					tools.appendString("</ul>");

					
						 tools.putParamValue("expandRL","false"); 

					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")){ String strTempProp = tools.getParamValue("pyPropRef");

					tools.putParamValue("pyPropRef",tools.getActive().getReference()+".pxResults");

					
							 StringMap keys = new HashStringMap();

					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
								 keys.putString("pyStreamName","pzAppExplorerTreePinClasses");

					
								 keys.putString("pyClassName","@baseclass" );

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","left");

					
								 int dotsToIgnore = tools.getProperty("pyPropRef").getReference().split("\\.").length-1;

					
								 tools.putParamValue("pzLevelParam",dotsToIgnore);

					
								 tools.putParamValue("partialTrigger","getChildNodesD_AppExplorerPinnedClasses.pxResults3");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

					 } 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</li>");

					
									 pega.popStackFrame(frame_2, false);

					
								} }

					
							 { 

					
								if(rowsDisplayed == 0){ 

					
									if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { 

					
									 tools.putParamValue("showOnLoadMsg", "showOnLoadMsg");

					
									}
								 String tempRenderSingle = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
								

					tools.appendString("\n\t\t\t\t\t\t\t\t\t<li id=\"Grid_NoResults\" class=\"gridRow\" ><ul class=\"rowContent\"><li>");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-ExplorerNode-Class", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					gridNoRowsMesgIncl_1(); 

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					tools.appendString(" </li> </ul></li>");

					
							 } }   

					
									 }  

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</ul>\n\t\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t\t</td></tr></table></td><td valign='top' class='mainGridTableCell' width='0.0%'><input type=\"hidden\" name=\"D_AppExplorerPinnedClassesPpxResults3colWidthGBR\" id=\"D_AppExplorerPinnedClassesPpxResults3colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("D_AppExplorerPinnedClassesPpxResults3colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("D_AppExplorerPinnedClassesPpxResults3colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right' PL_PROP='");

					
tools.appendString("D_AppExplorerPinnedClasses.pxResults");

					tools.appendString("' PL_PROP_CLASS='Embed-ExplorerNode-Class' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty("D_AppExplorerPinnedClasses.pxResults").iterator(); 

					
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

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					 
								 if(!bGenerationForOffline) {

					tools.appendString(tools.getSaveValue("rowClass"));  

					}

					tools.appendString(" cellCont' ");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					tools.appendString(" ng-repeat=\"Item in rootData.D_AppExplorerPinnedClasses.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
								 }

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pxObjClass"),-1);

					
 }}catch(Exception e){}

					tools.appendString(" data-gargs='[");

					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pxObjClass").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]'  id='");

					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_AppExplorerPinnedClasses.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_AppExplorerPinnedClasses.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", "");

					 
								 }

					
						 tools.putParamValue("expandRL","false");

					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")) { String strTempProp = tools.getParamValue("pyPropRef");

					tools.putActive(cp_eachProp_3);

					tools.putParamValue("pyPropRef",tools.getActive().getReference()+".pxResults");

					
							 StringMap keys = new HashStringMap();

					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
								 keys.putString("pyStreamName","pzAppExplorerTreePinClasses" );

					
								 keys.putString("pyClassName","@baseclass");

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","right");

					
								 tools.putParamValue("partialTrigger","getChildNodesD_AppExplorerPinnedClasses.pxResults3");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t<td style=\"height:24px;\" class=\"hiddenCell \"><div class=\"oflowDiv\" style=\"height:24px;\"><div class=\"divCont\"><span class=\"wspan\"></span><div class=\"cellIn\">&nbsp;</div></div></div> </td></tr>");

					 } } }   

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					menubarIncludes_1(); 

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && tools.getParamValue("partialRefresh").equals("false")) {

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
public void pzLayout_4() {
String gridLayoutMethodName="pzLayout_4";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpzShowPinnedClassesTreeGrid","pzShowPinnedClassesTreeGrid", "layout", "visible" )) {pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_6();
 LayoutWrapperTableEnd_1(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_5() {
tools.appendString("<div class='layout layout-none set-width-auto'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void menubarIncludes_1() {
pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
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
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pzAppExplorerPinnedClasses");
		String strLAClassName = "";
		String offlineUsingPage = "D_AppExplorerPinnedClasses";
		strLAClassName = "Code-Pega-List";
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
		pzPackageRuntime.packageLocalAction("pzAppExplorerPinnedClasses", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("pzAppExplorerTreePinClasses",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "D_AppExplorerPinnedClasses";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pzAppExplorerPinnedClasses\",\"true\",\":event\",\"D_AppExplorerPinnedClasses\",\""+streamType+"\",\"\",\"\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
								com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
									StringBuffer staticURLStr = new StringBuffer();
									StringBuffer preActParamStr = new StringBuffer();
									StringBuffer preDTParamStr = new StringBuffer();
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("StreamList", "pzAppExplorerTreeGrid|Rule-HTML-Section|:");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&PreActivity=pzLoadAppExplorerData");
									tools.appendString("[\"refresh\", [\"otherSection\",\"pzAppExplorerTreeGrid\", \"pzLoadAppExplorerData\", \"");
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
		}											String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2015011314461408008697") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzAppExplorerTreePinClasses_$CTX$_31");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","Simple");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Edit\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Edit", ".pyButtonLabel");
	}
	pyLabel = "Edit";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash9 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash9 != null && !"".equals(spxUniqueStreamHash9)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash9,pxUniqueStreamHash+"_9");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_9");
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
		 String buttonUID = "name='pzAppExplorerTreePinClasses_"+ referenceString+ "_31'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("2015011314461408008697") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pzAppExplorerPinnedClasses");
		String strLAClassName = "";
		String offlineUsingPage = "D_AppExplorerPinnedClasses";
		strLAClassName = "Code-Pega-List";
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
		pzPackageRuntime.packageLocalAction("pzAppExplorerPinnedClasses", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("pzAppExplorerTreePinClasses",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "D_AppExplorerPinnedClasses";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pzAppExplorerPinnedClasses\",\"true\",\":event\",\"D_AppExplorerPinnedClasses\",\""+streamType+"\",\"\",\"\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
								com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
									StringBuffer staticURLStr = new StringBuffer();
									StringBuffer preActParamStr = new StringBuffer();
									StringBuffer preDTParamStr = new StringBuffer();
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("StreamList", "pzAppExplorerTreeGrid|Rule-HTML-Section|:");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&PreActivity=pzLoadAppExplorerData");
									tools.appendString("[\"refresh\", [\"otherSection\",\"pzAppExplorerTreeGrid\", \"pzLoadAppExplorerData\", \"");
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
			String repeatIndx = "";tools.appendString("class='Simple pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Edit".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Edit",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");										}
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



public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_1();
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2015011314461408008697-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzAppExplorerTreePinClassesBBB","",false);
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
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201910231702030265702") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_7");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
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
	String paramName = "EXPANDEDSubSectionpzAppExplorerTreePinClassesBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","29");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_2();
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
pzLayoutBodyWrapper_4();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " float-right set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	pgCells.put("partialClass","float-right set-width-auto");
	pgCells.put("spanClass","iconRequired _iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelForRead _dataLabelForRead");
	pgCells.put("labelWriteClass","dataLabelForWrite _dataLabelForWrite");
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
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-label item-" + Integer.toString(index) + "    " + pzSection.getCustomStyle(false, "","explorer_heading_dataLabelRead","explorer_heading_dataLabelWrite")  + " '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("2015011314461407995897") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead explorer_heading_dataLabelRead","dataLabelWrite explorer_heading_dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Pinned classes") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("pyType","label");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2015011314461407995897")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired explorer_heading_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelRead explorer_heading_dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite explorer_heading_dataLabelWrite");
	pgCells.put("customROStyles","explorer_heading_dataLabelRead");
	pgCells.put("customRWStyles","explorer_heading_dataLabelWrite");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "Pinned classes";
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzAppExplorerTreePinClassesBB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash6 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash6 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash6 != null && !"".equals(spxUniqueStreamHash6)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash6,pxUniqueStreamHash+"_6");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201910231702030264438") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + " content  set-width-auto auto-width-column layout-content-inline_bottom content-inline_bottom  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash6 != null && !"".equals(spxUniqueStreamHash6)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_6");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","set-width-auto auto-width-column clearfix");
		pg_dlmeta.put("format","inline_bottom");
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
	String paramName = "EXPANDEDSubSectionpzAppExplorerTreePinClassesBB";
	metadataPage.put("paramName", paramName);
	metadataPage.put("floatClass"," set-width-auto");
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_3();
	containerComponent.endComponent();
	}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_5();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_3() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("2015011314461407991935") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("pyType","label");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2015011314461407991935")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpzAppExplorerTreePinClassesB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash3 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash3 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash3,pxUniqueStreamHash+"_3");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201910231702030264584") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-simple_list content-simple_list  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_3");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","simple_list");
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
	String paramName = "EXPANDEDSubSectionpzAppExplorerTreePinClassesB";
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
pzLayoutBodyWrapper_3();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_2() {

tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pzAppExplorerPin_1() {
pzAuto.emitIncludeStreamReference("pzAppExplorerPin", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Section", null);
}
public void repeatingDataCell_2() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<li  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzAppExplorerPin", ".pySections(3).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridColumn");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:30px;");tools.appendString(""); tools.appendString("'>");
	if(!pzAuto.getBrowserUtils().isIE()){
	tools.appendString("<DIV class='oflowDiv' style='height:30px;'>");
	}else{
	tools.appendString("<span class='wspan'></span><div class='cellIn'>");
	}
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	pzAppExplorerPin_1();
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</div></li>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_1() {
	tools.appendString("<li  title='");
	tools.appendString("'   class='");
	tools.appendString(" cellCont");tools.appendString(" ");tools.appendString(" rowHandle ");tools.appendString(" gridColumn");tools.appendString(" ' style='width:16px;");
	tools.appendString("height:30px;");tools.appendString(""); if(!pzAuto.isOrientationRTL())    {tools.appendString(";left:");}else{tools.appendString(";right:");} int level = 0; try {String pyPropRef = tools.getParamValueCSF("pyPropRef"); if("".equals(pyPropRef))level=0; else if(!"".equals(tools.getParamValueCSF("pzLevelParam"))) level = pyPropRef.split("\\.").length-Integer.parseInt(tools.getParamValueCSF("pzLevelParam")); else level = pyPropRef.split("\\.").length-2; int indentationLevel = level;tools.appendString( (indentationLevel*18)+"px");}catch(Exception e){tools.appendString("0");} ;tools.appendString("' >");
	if(!pzAuto.getBrowserUtils().isIE()){
	tools.appendString("<DIV class='oflowDiv' style='height:30px;'>");
	}else{
	tools.appendString("<span class='wspan'></span><div class='cellIn'>");
	}
	if(pzAuto.handleEvaluateWhen(" o1! axpzIsTopLevelNode","!pzIsTopLevelNode", "cell", "visible" )) {
	tools.appendString("<div id='iconExpandCollapse' style='' ><a href=\"#\" style='' onclick=\"return false;\" ");
	if(tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")){ if(!(tools.getStepPage().getIfPresent(".pxResults") != null && tools.getStepPage().getProperty(".pxResults").size()>0)){tools.appendString(" tabIndex='-1' ");
	} }tools.appendString(" class=\"");
	if(tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")){ if(tools.getStepPage().getIfPresent(".pxResults") != null && tools.getStepPage().getProperty(".pxResults").size()>0){tools.appendString("collapseNode\"  tabIndex='0' title='");
	tools.appendString(tools.getLocalizedTextForString(".pyCaption","Collapse to hide child rows",StreamBuilder.FMT_NORMAL));
	tools.appendString("'");
	} else {tools.appendString("noEC\"");
	 } } else {tools.appendString("expandNode\"  tabIndex='0' title='");
	tools.appendString(tools.getLocalizedTextForString(".pyCaption","Expand to show child rows",StreamBuilder.FMT_NORMAL));
	tools.appendString("'");
	}tools.appendString(">&nbsp;</a></div>");
	} else{tools.appendString("<a href=\"#\" title='");
	tools.appendString(tools.getLocalizedTextForString(".pyCaption","This row has no child nodes",StreamBuilder.FMT_NORMAL));
	tools.appendString("' onclick=\"return false;\" class='hiddenExpColl'></a>");
	}
	tools.appendString("<div id='dragHandle' style='");
	tools.appendString("display: none");
tools.appendString(";  '>&nbsp;</div></div></li>");
}


public void gridOpenActionIncl_1() {
pzAuto.emitIncludeStreamReference("pzGridOpenAction", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Fragment", null);
}
public void 
getInlineStyle_1() {
}


public void D_AppExplorerPinnedClasses_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-rightclick='[");if(isBehaviorAdded && true){ tools.appendString(","); }if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
  IActionRequest actionRequest = pzAuto.getActionRequest();
  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
  pzAuto.registerActionRequest(actionRequest);
}
tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzExplorerMenu\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"");

		tools.appendString("#~.pxObjClass$0$~#");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
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
tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771593784848");
if(pzAuto.isOffline() || false) {
try{
ClipboardPage pg_tempPrimPg = tools.createPage("Embed-ExplorerNode-Class","tempNavStepPg");
tools.putParamValue("tempNavStepPg",pg_tempPrimPg.getName());
pega_uiengine_pzcontrol.pzGetMenu("pzExplorerMenu", "", "pyNavigation1771593784848","", false, true, false, false);
tools.getParameterPage().remove("tempNavStepPg");
pg_tempPrimPg.removeFromClipboard();
}catch(Exception e){oLog.error(e);}
}
tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"runScript\", [\"document.activeElement.click&#40;&#41;()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public void 
gridBeginLayout_1() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());
}


public void gridDoPartialRefresh_1() { /*gridDoPartialRefresh*/
if(pzAuto.doOnlyOnce("ControlMenu")){
	if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();
}
}
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					if(tools.getParamValue("partialTrigger").equals("appendToD_AppExplorerPinnedClasses.pxResults3")|| tools.getParamValue("partialTrigger").equals("editRowD_AppExplorerPinnedClasses.pxResults3") || tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") ){

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3"))

					tools.putParamValue("partialRefresh", "false");

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					String strIndex = tools.getParamValue("strIndexInList");

					tools.putParamValue("strIndexInList", pageListProp.size());

					if(tools.getParamValue("partialTrigger").indexOf("editRow")<0)

					pageListProp = pageListProp.getPropertyValue(Integer.parseInt(strIndex));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pageListProp);

					if(tools.getParamValue("EditRow").equals("false") && pageListProp.getPageValue().hasMessages()){tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					}

					}

					 if(tools.getParamValue("table").equals("") ||  tools.getParamValue("table").equals("left") ) { 

					if(tools.getParamValue("partialRefresh").equals("true") && tools.getParamValue("table").equals("left") && tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && tools.getStepPage().getProperty(tools.getParamValue("pyPropRef")).size()>0 ){

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<UL  id='gridNode' bRowResize='false' bColumnResize='false' class='gridNode' >");

					 } 

					Iterator propItr = null;

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardPage jsonRefreshRows = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

						tools.appendString("<UL id='gridNode'>");

					if(jsonRefreshRows != null)

					propItr = jsonRefreshRows.getProperty("JSONArrayList").iterator(); 

					}

					while(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows") || (propItr != null && propItr.hasNext())){

					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardProperty cp = (ClipboardProperty) propItr.next();

					tools.putParamValue("pyPropRef", cp.getProperty("pyPropRef").getStringValue());

					}

					
 ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.putActive(pageListProp);

					}

					
 Iterator iterPageListProp = pageListProp.iterator();

					
 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) tools.putParamValue("partialRefresh", "false");

					
 while(iterPageListProp.hasNext()){ if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")){ ClipboardProperty prop = (ClipboardProperty)iterPageListProp.next(); tools.putActive(prop);}

					
									  PRStackFrame frame_2 = pega.pushStackFrame("FixedColTreeGrid", null, tools.getActive().getPageValue(), false, false); 

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum", ""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum", ""+tools.getActive().indexOf());} 

					
						 tools.putParamValue("expandRL","true");

					tools.appendString("\n\t\t\t\t\t\t\t<li class='gridRow' isWrapEnabled=false  id='");

					 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { tools.appendString(tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")")); } else { tools.appendString(tools.getActiveName()); } 

					tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_AppExplorerPinnedClasses.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_AppExplorerPinnedClasses.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index"));tools.appendString("' >");

					tools.appendString("<ul ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString("objclass=\"");

					tools.appendString(tools.getStepPage().getClassName());

					tools.appendString("\"class='rowContent ");

					tools.appendString(" ' ");

					if((pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()) && !pega_uiengine_harness.pzInStandardsMode()){tools.appendString("style='height:31px;");}else{tools.appendString("style='height:30px;");}getInlineStyle_1(); if(!pzAuto.isOrientationRTL())    {tools.appendString(";padding-left:");}else{tools.appendString(";padding-right:");} try { int level = 0;String pyPropRef = tools.getParamValue("pyPropRef"); if("".equals(pyPropRef))level = 0; else if(!"".equals(tools.getParamValue("pzLevelParam"))) level = pyPropRef.split("\\.").length-Integer.parseInt(tools.getParamValue("pzLevelParam")); else level = pyPropRef.split("\\.").length-2; tools.appendString(18 + (level * 18)+ "px");}catch(Exception e){tools.appendString("18px");} tools.appendString("'");tools.appendString(" >");

					

					 repeatingDataCell_1(); 

					

					 repeatingDataCell_2(); 

					tools.appendString("</ul>");

					
						 tools.putParamValue("expandRL","false"); 

					 if(tools.getParamValue("partialTrigger").equals("") || tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { 

					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")){ String strTempProp = tools.getParamValue("pyPropRef");

					
							 tools.putParamValue("pyPropRef",strTempProp+"("+tools.getActive().indexOf()+").pxResults");

					
							 StringMap keys = new HashStringMap();

					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
								 keys.putString("pyStreamName","pzAppExplorerTreePinClasses");

					
								 keys.putString("pyClassName","@baseclass" );

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","left");

					
								 tools.putParamValue("partialTrigger","getChildNodesD_AppExplorerPinnedClasses.pxResults3");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

					 } 

					 } 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</li>");

					
									 pega.popStackFrame(frame_2, false);

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3"))break;

					}//close the while loop

					if(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					break;

					}

					}//close refreshrows while loop

					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.appendString("</UL>");

					}

					
  if(tools.getParamValue("table").equals("left") && tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")  && tools.getStepPage().getProperty(tools.getParamValue("pyPropRef")).size()>0) { 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</ul>");

					
 } 

					
 } 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					 if(tools.getParamValue("table").equals("") ||  tools.getParamValue("table").equals("right")) { 

					Iterator propItr = null;

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardPage jsonRefreshRows = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

						tools.appendString("<table id='bodyTbl_right'><tbody>");

						if (jsonRefreshRows != null)

					propItr = jsonRefreshRows.getProperty("JSONArrayList").iterator();

					}

					while(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows") || (propItr != null && propItr.hasNext())){

					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardProperty cp = (ClipboardProperty) propItr.next();

					tools.putParamValue("pyPropRef", cp.getProperty("pyPropRef").getStringValue());

					}

					
 ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					
 Iterator iterPageListProp = pageListProp.iterator();

					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.putActive(pageListProp);

					}

					
 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) tools.putParamValue("partialRefresh", "false");

					
 while(iterPageListProp.hasNext()){ if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) {ClipboardProperty prop = (ClipboardProperty)iterPageListProp.next(); tools.putActive(prop);}

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
						 tools.putParamValue("expandRL","true");

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_AppExplorerPinnedClasses.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pxObjClass"),-1);

					
 }}catch(Exception e){}

					tools.appendString(" data-gargs='[");

					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pxObjClass").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]'  id='");

					 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { tools.appendString(tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")")); } else { tools.appendString(tools.getActiveName()); } 

					tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_AppExplorerPinnedClasses.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_AppExplorerPinnedClasses.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					

					

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					 if(tools.getParamValue("partialTrigger").equals("") || tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { 

					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")) { String strTempProp = tools.getParamValue("pyPropRef");

					
							 tools.putParamValue("pyPropRef",strTempProp+"("+tools.getActive().indexOf()+").pxResults");

					
							 StringMap keys = new HashStringMap();

					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
								 keys.putString("pyStreamName","pzAppExplorerTreePinClasses" );

					
								 keys.putString("pyClassName","@baseclass");

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","right");

					
								 tools.putParamValue("partialTrigger","getChildNodesD_AppExplorerPinnedClasses.pxResults3");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

					 } 

					 } 

					
									  pega.popStackFrame(frame_3, false); 

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3"))break;

					}//close the while loop

					if(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					break;

					}

					}//close refreshrows while loop

					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.appendString("</tbody></table>||END||");

					ClipboardPage jsonClipboardPage = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					if(jsonClipboardPage != null)

					jsonClipboardPage.removeFromClipboard();

					 } 

					 } 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					 } 

					 tools.putSaveValue("isGrid", "false"); 

					
	 /* generate the transaction ID if it has been changed due to DB commit operations */ 

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_AppExplorerPinnedClasses.pxResults3")) {

					
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

					
		 String strPageName = (tools.getParamValue("PageName"));

					
		 if("".equals(strPageName)) {

					
			 pageListProp = tools.getProperty("D_AppExplorerPinnedClasses.pxResults");

					
		 } else {

					
			 pageListProp = tools.getProperty(strPageName+".pxResults");

					
		 }

					
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

					if(pzAuto.doOnlyOnce("ControlMenu")){

					
					if (!pzAuto.hasStaticContentJSOptimization() ) {
IStaticContentRuntime pzStatic_ControlMenu = pzAuto.getStaticBlock("script");
	pzStatic_ControlMenu.addBundle("pzPega_control_menu_scripts", "13196980576");
pzStatic_ControlMenu.emitContent();

					}

					}

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					java.util.Map functionsMap = null;

					java.util.Map classesMap = null;

					tools.putSaveValue("bAllowRowUpdate","true");

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_AppExplorerPinnedClasses.pxResults3") ){

					
					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3"))

					
					tools.putParamValue("partialRefresh", "false");

					
					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					
					String strIndex = tools.getParamValue("lastRowToRetrieve");

					
					if("".equals(strIndex) || Integer.parseInt(strIndex) > pageListProp.size())

					
					strIndex = tools.getParamValue("strIndexInList");

					
					tools.putParamValue("strIndexInList", pageListProp.size());

					
					if(tools.getParamValue("partialTrigger").indexOf("editRow")<0)

					
					pageListProp = pageListProp.getPropertyValue(Integer.parseInt(strIndex));

					
					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pageListProp);

					
					if(tools.getParamValue("EditRow").equals("false") && pageListProp.getPageValue().hasMessages()){tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					
					}

					
					}

					
					 if(tools.getParamValue("table").equals("") ||  tools.getParamValue("table").equals("left") ) { 

					
					if(tools.getParamValue("partialRefresh").equals("true") && tools.getParamValue("table").equals("left") && tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && tools.getStepPage().getProperty(tools.getParamValue("pyPropRef")).size()>0 ){

					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<UL  id='gridNode' bRowResize='false' bColumnResize='false' class='gridNode' >");

					
					 } 

					
					
 ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					
					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					
					tools.putActive(pageListProp);

					
					}

					
					
 Iterator iterPageListProp = pageListProp.iterator();

					
					
 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) tools.putParamValue("partialRefresh", "false");

					
					
 while(iterPageListProp.hasNext()){ if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")){ ClipboardProperty prop = (ClipboardProperty)iterPageListProp.next(); tools.putActive(prop);}

					
					
									  PRStackFrame frame_2 = pega.pushStackFrame("FixedColTreeGrid", null, tools.getActive().getPageValue(), false, false); 

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum", ""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum", ""+tools.getActive().indexOf());} 

					
					
						 tools.putParamValue("expandRL","true");

					
					tools.appendString("\n\t\t\t\t\t\t\t<li class='gridRow' isWrapEnabled=false  id='");

					
					 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { tools.appendString(tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")")); } else { tools.appendString(tools.getActiveName()); } 

					
					tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_AppExplorerPinnedClasses.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_AppExplorerPinnedClasses.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index"));tools.appendString("' >");

					
					tools.appendString("<ul ");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString("objclass=\"");

					
					tools.appendString(tools.getStepPage().getClassName());

					
					tools.appendString("\"class='rowContent ");

					
					tools.appendString(" ' ");

					
					if((pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()) && !pega_uiengine_harness.pzInStandardsMode()){tools.appendString("style='height:31px;");}else{tools.appendString("style='height:30px;");}getInlineStyle_1(); if(!pzAuto.isOrientationRTL())    {tools.appendString(";padding-left:");}else{tools.appendString(";padding-right:");} try { int level = 0;String pyPropRef = tools.getParamValue("pyPropRef"); if("".equals(pyPropRef))level = 0; else if(!"".equals(tools.getParamValue("pzLevelParam"))) level = pyPropRef.split("\\.").length-Integer.parseInt(tools.getParamValue("pzLevelParam")); else level = pyPropRef.split("\\.").length-2; tools.appendString(18 + (level * 18)+ "px");}catch(Exception e){tools.appendString("18px");} tools.appendString("'");tools.appendString(" >");

					
					

					
					 repeatingDataCell_1(); 

					
					

					
					 repeatingDataCell_2(); 

					
					tools.appendString("</ul>");

					
					
						 tools.putParamValue("expandRL","false"); 

					
					 if(tools.getParamValue("partialTrigger").equals("") || tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { 

					
					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")){ String strTempProp = tools.getParamValue("pyPropRef");

					
					
							 tools.putParamValue("pyPropRef",strTempProp+"("+tools.getActive().indexOf()+").pxResults");

					
					
							 StringMap keys = new HashStringMap();

					
					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
					
								 keys.putString("pyStreamName","pzAppExplorerTreePinClasses");

					
					
								 keys.putString("pyClassName","@baseclass" );

					
					
								 tools.putParamValue("partialRefresh","true");

					
					
								 tools.putParamValue("table","left");

					
					
								 tools.putParamValue("partialTrigger","getChildNodesD_AppExplorerPinnedClasses.pxResults3");

					
					
								 tools.appendString(tools.getStream(keys, null));

					
					tools.putParamValue("pyPropRef",strTempProp);

					
					 } 

					
					 } 

					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</li>");

					
					
									 pega.popStackFrame(frame_2, false);

					
					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3"))break;

					
					}//close the while loop

					
					
  if(tools.getParamValue("table").equals("left") && tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")  && tools.getStepPage().getProperty(tools.getParamValue("pyPropRef")).size()>0) { 

					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</ul>");

					
					
 } 

					
					
 } 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
					 if(tools.getParamValue("table").equals("") ||  tools.getParamValue("table").equals("right")) { 

					
					
 ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					
					
 Iterator iterPageListProp = pageListProp.iterator();

					
					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					
					tools.putActive(pageListProp);

					
					}

					
					
 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) tools.putParamValue("partialRefresh", "false");

					
					
 while(iterPageListProp.hasNext()){ if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) {ClipboardProperty prop = (ClipboardProperty)iterPageListProp.next(); tools.putActive(prop);}

					
					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
					
						 tools.putParamValue("expandRL","true");

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_AppExplorerPinnedClasses.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\" id='");

					
					 if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { tools.appendString(tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")")); } else { tools.appendString(tools.getActiveName()); } 

					
					tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_AppExplorerPinnedClasses.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_AppExplorerPinnedClasses.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201707121045570436288-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					

					
					

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					 if(tools.getParamValue("partialTrigger").equals("") || tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3")) { 

					
					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")) { String strTempProp = tools.getParamValue("pyPropRef");

					
					
							 tools.putParamValue("pyPropRef",strTempProp+"("+tools.getActive().indexOf()+").pxResults");

					
					
							 StringMap keys = new HashStringMap();

					
					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
					
								 keys.putString("pyStreamName","pzAppExplorerTreePinClasses" );

					
					
								 keys.putString("pyClassName","@baseclass");

					
					
								 tools.putParamValue("partialRefresh","true");

					
					
								 tools.putParamValue("table","right");

					
					
								 tools.putParamValue("partialTrigger","getChildNodesD_AppExplorerPinnedClasses.pxResults3");

					
					
								 tools.appendString(tools.getStream(keys, null));

					
					tools.putParamValue("pyPropRef",strTempProp);

					
					 } 

					
					 } 

					
					
									  pega.popStackFrame(frame_3, false); 

					
					if(!tools.getParamValue("partialTrigger").equals("getChildNodesD_AppExplorerPinnedClasses.pxResults3"))break;

					
					}//close the while loop

					
					 } 

					
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
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzAppExplorerTreePinClasses");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("pzLayout_4", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEPINCLASSES #20191217T182450.892 GMT", "@baseclass pzAppExplorerTreePinClasses", "Pega-Desktop", "08-05-01", "20200311T184438.496 GMT");
}
