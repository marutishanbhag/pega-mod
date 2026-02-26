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
 * Builds JSP stream @BASECLASS!PZAPPEXPLORERTREEGRID.
 */
public class ra_stream_pzappexplorertreegrid_f702cee27e43abdb3e865a61306ca044 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzAppExplorerTreeGrid.Code_Pega_List.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1201575462;
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
	public ra_stream_pzappexplorertreegrid_f702cee27e43abdb3e865a61306ca044(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "5730b9888304d7dc66fb3fffd7b959aa7ed7434d";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT	Pega-Desktop:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "5730b9888304d7dc66fb3fffd7b959aa7ed7434d";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzAppExplorerTreeGrid",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT */
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
	"Rule-HTML-Section:PZAPPEXPLORERTREEGRID"
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
		new DependentRuleInfo("PZAPPEXPLORERTREEGRID","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-05-01","RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT","!PZAPPEXPLORERTREEGRID",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1201575462)
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
//	RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT:20191217T182450.581 GMT
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
//	RULE-FILE-BUNDLE PZPEGA_CONTROL_MENU_SCRIPTS SCRIPT #20180713T133225.800 GMT:20180713T133225.800 GMT
//	RULE-FILE-TEXT WEBWB PZJQUERY_MENUAIM!JS #20210112T172930.471 GMT:20210112T172930.471 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_MENU!JS #20231031T085204.702 GMT:20231031T085204.702 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENUBAR_TEMPLATE!JS #20210929T084935.942 GMT:20210929T084935.942 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_TEMPLATE!JS #20210929T084936.142 GMT:20210929T084936.142 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ANCHOR_TEMPLATE!JS #20210706T115852.824 GMT:20210929T084936.012 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_MENU_ITEM_ICON_TEMPLATE!JS #20210929T084936.050 GMT:20210929T084936.050 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_1(
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PXISANCESTOROF #20180713T131438.217 GMT:20180713T131438.217 GMT
//	RULE-UTILITY-FUNCTION GRID PZGETPROPERTYCLASSNAME #20180713T133337.766 GMT:20180713T133337.766 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNDATATRANSFORM--(CLIPB9514A9C33ADD6709FD6A843ADA2991DD #20220104T102659.447 GMT:20220104T102659.447 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSHOWMENU #20220112T101247.778 GMT:20220112T101247.778 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCHECKAUTOGENCONTROL--(CLIPBOARDPROPERTY) #20180713T133344.796 GMT:20180713T133344.796 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEMENUSCRIPTS #20180713T133346.297 GMT:20180713T133346.297 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGRIDACTIONTOKENIZER--(STRING,JAVA.UTIL.LIST) #20180713T133346.434 GMT:20180713T133346.434 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION UTILITIES GETPUBLICAPI #20180713T131444.323 GMT:20180713T131444.323 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7d987da68c09f78e8eb6129ff548fe5c";
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
  pzSection.beginSection("pzAppExplorerTreeGrid",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzAppExplorerTreeGrid','insKey':'RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayout_2();
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
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzSetTopLevelNodeFlag");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("navName", "pzExplorerMenu");
pega.getUIEngine().getUIAction("showMenu", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "document.activeElement.click()");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-noheader layout-noheader-explorer_list_item'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
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
	index++;
	return index;
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzAppExplorerTreeGridBB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash4 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash4 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash4 != null && !"".equals(spxUniqueStreamHash4)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash4,pxUniqueStreamHash+"_4");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201910171752070653924") + " ");
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
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash4 != null && !"".equals(spxUniqueStreamHash4)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_4");
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
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzAppExplorerTreeGridBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-explorer_list_item");
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_4();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_3() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridCentreLayout_1();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void menubarIncludes_1() {
pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public void repeatingDataCell_5() {
	tools.appendString("<li  title='");
	tools.appendString("'   class='");
	tools.appendString(" cellCont");tools.appendString(" ");tools.appendString(" rowHandle ");tools.appendString(" gridColumn");tools.appendString(" ' style='width:16px;");
	tools.appendString("height:27px;");tools.appendString(""); if(!pzAuto.isOrientationRTL())    {tools.appendString(";left:");}else{tools.appendString(";right:");} int level = 0; try {int indentationLevel = level;if(level!=0){indentationLevel = level-1;}int leftAdjust = 2;if(level!=0){tools.appendString( (indentationLevel*18)+"px");}else{tools.appendString( ((indentationLevel*18)-leftAdjust)+"px");}}catch(Exception e){tools.appendString("0");} ;if(level == 0){tools.appendString("; width:0px; ");}tools.appendString("' >");
	if(!pzAuto.getBrowserUtils().isIE()){
	tools.appendString("<DIV class='oflowDiv' style='height:27px;'>");
	}else{
	tools.appendString("<span class='wspan'></span><div class='cellIn'>");
	}
	if(pzAuto.handleEvaluateWhen(" o1! axpzIsTopLevelNode","!pzIsTopLevelNode", "cell", "visible" )) {
	tools.appendString("<div id='iconExpandCollapse' style='");
	if(level == 0){tools.appendString(" display:none;");
	}tools.appendString("' ><a href=\"#\" style='' onclick=\"return false;\" ");
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
	tools.appendString("' onclick=\"return false;\" class='hiddenExpColl'");
	if(level==0){tools.appendString("style='display:none;'");
	}tools.appendString("></a>");
	}
	tools.appendString("<div id='dragHandle' style='");
	tools.appendString("display: none");
tools.appendString(";  '>&nbsp;</div></div></li>");
}
public void repeatingDataCell_4() {
		tools.appendString("<li title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("2017011204234504859135") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" class='");
		tools.appendString(" cellCont");tools.appendString(" ");tools.appendString(" gridColumn");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:20px;");tools.appendString(""); tools.appendString("'>");
		
									tools.appendString("<div class='oflowWrap'>");
 if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDiv' style='height:20px;'>");
									tools.appendString("&nbsp;");}else{ 
									tools.appendString("<span class='wspan'></span><div class='cellIn'>");
									tools.appendString("&nbsp;");}if("".equals(tools.getParamValue("sortProperty"))){       tools.putParamValue("columnSortOrder","");  }else{      if("".equals(tools.getParamValue("sortProperty"))){          tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));     }   }       if("ASC".equals(tools.getParamValue("columnSortOrder"))){       tools.putParamValue("sortTitleText","columnsorted_asc");    }else if("DESC".equals(tools.getParamValue("columnSortOrder"))){        tools.putParamValue("sortTitleText","columnsorted_desc");   }else{      tools.putParamValue("sortTitleText","Enter to sort");   }tools.appendString("<div id='titleDesc352448746' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");tools.appendString("<span id='sort'"); if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){  tools.appendString("tabIndex='0'"); } tools.appendString("class='highlight-ele ' >&nbsp;</span>");tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");tools.appendString("</div>");
									tools.appendString("</div>");
	tools.appendString("</li>");
	}
public void repeatingDataCell_3() {
		tools.appendString("<li title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("2017011204234504858590") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(" cellCont");tools.appendString(" ");tools.appendString(" ");tools.appendString(" rowHandleHead ");tools.appendString(" gridColumn");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:20px;");tools.appendString(""); if(!pzAuto.isOrientationRTL())    {tools.appendString(";left:");}else{tools.appendString(";right:");} int level = 0; try {int indentationLevel = level;tools.appendString( (indentationLevel*18)+"px");}catch(Exception e){tools.appendString("0");} ;tools.appendString("'>");
		
									tools.appendString("<div class='oflowWrap'>");
 if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDiv' style='height:20px;'>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }}else{ 
									tools.appendString("<span class='wspan'></span><div class='cellIn'>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }}if("".equals(tools.getParamValue("sortProperty"))){       tools.putParamValue("columnSortOrder","");  }else{      if("".equals(tools.getParamValue("sortProperty"))){          tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));     }   }       if("ASC".equals(tools.getParamValue("columnSortOrder"))){       tools.putParamValue("sortTitleText","columnsorted_asc");    }else if("DESC".equals(tools.getParamValue("columnSortOrder"))){        tools.putParamValue("sortTitleText","columnsorted_desc");   }else{      tools.putParamValue("sortTitleText","Enter to sort");   }tools.appendString("<div id='titleDesc56652735' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");tools.appendString("<span id='sort'"); if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){  tools.appendString("tabIndex='0'"); } tools.appendString("class='highlight-ele ' >&nbsp;</span>");tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");tools.appendString("</div>");
									tools.appendString("</div>");
	tools.appendString("</li>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}


public void Declare_AppExplorerData_pxResults_2() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-rightclick='[");if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
	com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
	actionRequestD.registerFixedParameter("pyModelName","pzSetTopLevelNodeFlag");
		String usingPageString = "";
		usingPageString = "";
		tools.appendString("[\"runDataTransform\", [\"pzSetTopLevelNodeFlag\", \"=");
		actionRequestD.registerFixedParameter("","");
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
		pzPackageRuntime.packageDataTransform(contextClass, "pzSetTopLevelNodeFlag");
		}
			pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			  IActionRequest actionRequest = pzAuto.getActionRequest();
			  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
			  pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzExplorerMenu\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"");

		tools.appendString("#~.pxObjClass$0$~#");			if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
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
			tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771593783882");
			if(pzAuto.isOffline() || false) {
			try{
			ClipboardPage pg_tempPrimPg = tools.createPage("Embed-ExplorerNode-Class","tempNavStepPg");
			tools.putParamValue("tempNavStepPg",pg_tempPrimPg.getName());
			pega_uiengine_pzcontrol.pzGetMenu("pzExplorerMenu", "", "pyNavigation1771593783882","", false, true, false, false);
			tools.getParameterPage().remove("tempNavStepPg");
			pg_tempPrimPg.removeFromClipboard();
			}catch(Exception e){oLog.error(e);}
			}
			tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"document.activeElement.click&#40;&#41;()\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzAppExplorerTreeGridB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATTREEGRID','pgRef':'.pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzAppExplorerTreeGridB";
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

 ClipboardPage gFCritPageDeclare_AppExplorerData_pxResultsL3=null;

 Map selUniqMapDeclare_AppExplorerData_pxResultsL3 = null;

 Set filteredIndicesSetDeclare_AppExplorerData_pxResultsL3 = null;

	 String strFCPage = "pyFilterCriteria_Declare_AppExplorerData.pxResults_pzAppExplorerTreeGrid_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

	 gFCritPageDeclare_AppExplorerData_pxResultsL3 = tools.findPage(strFCPage, true);

	 if(gFCritPageDeclare_AppExplorerData_pxResultsL3==null){gFCritPageDeclare_AppExplorerData_pxResultsL3 = tools.createPage("Pega-GridFilterCriteria", strFCPage);}

tools.putParamValue("pyGridFilterCriteriaPage", strFCPage);

gFCritPageDeclare_AppExplorerData_pxResultsL3.getProperty("pyRowVisibleWhenCondition").setValue("!pyHideCategory");

  selUniqMapDeclare_AppExplorerData_pxResultsL3 = null; // reset the variable

 if(gFCritPageDeclare_AppExplorerData_pxResultsL3 != null){ 

 		 filteredIndicesSetDeclare_AppExplorerData_pxResultsL3 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageDeclare_AppExplorerData_pxResultsL3, "Declare_AppExplorerData.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetDeclare_AppExplorerData_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapDeclare_AppExplorerData_pxResultsL3 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageDeclare_AppExplorerData_pxResultsL3); 

 		 tools.getParameterPage().put("selUniqMapDeclare_AppExplorerData_pxResultsL3", selUniqMapDeclare_AppExplorerData_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div id='CT' RLW='true' RRLocalsP=\".pyIsPinned\" RRW=\".pyIsPinned Changes\" type=\"allLocals\"><div  section_index='1' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("Declare_AppExplorerData.pxResults").getReference());tools.appendString("_pzAppExplorerTreeGrid_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='pzRunAppExplorerExpand' class=\"");
tools.appendString("repeatContainer gridDefault  TreeGrid  ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201910171733310312680") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='true' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='false'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' bRowVisibleWhen = 'true' openOnDblClick='false' OAFunc='openRuleByKeys' ");
Declare_AppExplorerData_pxResults_2();
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
ClipboardPage gFCritPageDeclare_AppExplorerData_pxResultsL3=null;
Map selUniqMapDeclare_AppExplorerData_pxResultsL3 = null;
selUniqMapDeclare_AppExplorerData_pxResultsL3 = null; // reset the variable
gFCritPageDeclare_AppExplorerData_pxResultsL3=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
		 selUniqMapDeclare_AppExplorerData_pxResultsL3 = (Map)tools.getParameterPage().getObject("selUniqMapDeclare_AppExplorerData_pxResultsL3");
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

					ClipboardProperty prop = tools.getProperty("Declare_AppExplorerData.pxResults");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='   ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("' gPropIndex='Declare_AppExplorerDataPpxResults1' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false  bAlwaysExpandRoot='true'  bTreegridSingleCol='true' ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201910171733310312680-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"Declare_AppExplorerDataPpxResults1colWidthGBL\" id=\"Declare_AppExplorerDataPpxResults1colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("Declare_AppExplorerDataPpxResults1colWidthGBL"));tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<table cellpadding='0' id='bodyTbl_gbl' cellspacing='0' border='0' width='100%' style='width: ");

					if(!tools.getParamValue("Declare_AppExplorerDataPpxResults1colWidthGBL").equals("")) { tools.appendParamCSF("Declare_AppExplorerDataPpxResults1colWidthGBL"); } 

					tools.appendString("px;'><tr><td valign='top'>\n\t\t\t\t\t\t\t\t\t<div id='gridBody_left' style=''>\n\t\t\t\t\t\t\t\t\t\t<UL  id='gridNode' bRowResize='false' bColumnResize='false' class='gridNode' >\n\t\t\t\t\t\t\t\t\t\t<li class='gridRow' style=\"display:none;\">");

					tools.appendString("<ul class='rowContent  headerRowContent  ' ");

					if(pzAuto.getBrowserUtils().isFF()){tools.appendString("style='height:22px;");}else{tools.appendString("style='height:22px;");}getInlineStyle_1(); if(!pzAuto.isOrientationRTL())    {tools.appendString(";padding-left:");}else{tools.appendString(";padding-right:");} try { int level = 0;tools.appendString(18 + (level * 18)+ "px");}catch(Exception e){tools.appendString("18px");} tools.appendString("'");

					tools.appendString(" >");

					 repeatingDataCell_3(); 

					 repeatingDataCell_4(); 

					tools.appendString("</ul>\n\t\t\t\t\t\t\t\t\t\t</li>");

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
 {int counter = 0; int rowsDisplayed = 0;

					
								{Iterator itr_2 = tools.getStepPage().getProperty("Declare_AppExplorerData.pxResults").iterator(); 

					
								 while(itr_2.hasNext()){ 

					
									 ClipboardProperty cp_eachProp_2 = (ClipboardProperty)itr_2.next(); 

					tools.putParamValue("pyCustomActivity", "pzRunAppExplorerExpand");

					tools.putParamValue("pyPropRef", cp_eachProp_2.getReference());

					tools.putParamValue("pyChildPropRef", "Declare_AppExplorerData.pxResults");

					tools.putParamValue("initialLoad", "true");

					HashStringMap activitykeys = new HashStringMap();

					activitykeys.put("pxObjClass","Rule-Obj-Activity");

					activitykeys.put("pyClassName","@baseclass");

					activitykeys.put("pyActivityName","pzgetChildNodes");

					tools.doActivity(activitykeys,null,null);

					tools.getParameterPage().remove("initialLoad");

					cp_eachProp_2.getProperty("pyExpanded").setValue(true);

					
									  ClipboardPage pg_eachProp_2 = cp_eachProp_2.getPageValue();

					
									 PRStackFrame frame_2 = pega.pushStackFrame("FixedColTreeGrid", null, pg_eachProp_2, false, false);

					
									 tools.putActive(cp_eachProp_2); 

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					Set filteredResultsSet = (HashSet)tools.getParameterPage().getObject("filteredResultsSet");boolean bFilterResult = false;
										 if (filteredResultsSet != null) { int itemIndex = cp_eachProp_2.indexOf() ;
										 bFilterResult = filteredResultsSet.contains(itemIndex); 
										 } else if(gFCritPageDeclare_AppExplorerData_pxResultsL3!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageDeclare_AppExplorerData_pxResultsL3, selUniqMapDeclare_AppExplorerData_pxResultsL3);
										 }
										 if (gFCritPageDeclare_AppExplorerData_pxResultsL3== null ||  tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) ||  bFilterResult) {

					
										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

					
										 tools.getStepPage().getProperty("pyExpanded").setValue("true");

					 }

					
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("Declare_AppExplorerData.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("Declare_AppExplorerData.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201910171733310312680-" + rowTestID) + " ");

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

					tools.appendString("style='height:27px;");getInlineStyle_1(); if(!pzAuto.isOrientationRTL())    {tools.appendString(";padding-left:");}else{tools.appendString(";padding-right:");} try { int level = 0;tools.appendString(0+ (level == 0 ? 2 : 0) + (level * 18)+ "px");}catch(Exception e){tools.appendString("0px");} tools.appendString("'");tools.appendString(" >");

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

					
								 keys.putString("pyStreamName","pzAppExplorerTreeGrid");

					
								 keys.putString("pyClassName","@baseclass" );

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","left");

					
								 int dotsToIgnore = tools.getProperty("pyPropRef").getReference().split("\\.").length-1;

					
								 tools.putParamValue("pzLevelParam",dotsToIgnore);

					
								 tools.putParamValue("partialTrigger","getChildNodesDeclare_AppExplorerData.pxResults1");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

					 } 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</li>");

					
										 } 

					
									 pega.popStackFrame(frame_2, false);

					
								} }

					
							 { 

					
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

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</ul>\n\t\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t\t</td></tr></table></td><td valign='top' class='mainGridTableCell' width='0.0%'><input type=\"hidden\" name=\"Declare_AppExplorerDataPpxResults1colWidthGBR\" id=\"Declare_AppExplorerDataPpxResults1colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("Declare_AppExplorerDataPpxResults1colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("Declare_AppExplorerDataPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right' PL_PROP='");

					
tools.appendString("Declare_AppExplorerData.pxResults");

					tools.appendString("' PL_PROP_CLASS='Embed-ExplorerNode-Class' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty("Declare_AppExplorerData.pxResults").iterator(); 

					
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
										 } else if(gFCritPageDeclare_AppExplorerData_pxResultsL3!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageDeclare_AppExplorerData_pxResultsL3, selUniqMapDeclare_AppExplorerData_pxResultsL3);
										 }
										 if (gFCritPageDeclare_AppExplorerData_pxResultsL3== null || 

					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					 bFilterResult) {

					
										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

					
										 tools.getStepPage().getProperty("pyExpanded").setValue("true");

					}

					
										 counter++; 

											try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyIsPinned"), -1);

					}}catch(Exception e){e.printStackTrace();}

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

					tools.appendString(" ng-repeat=\"Item in rootData.Declare_AppExplorerData.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("Declare_AppExplorerData.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("Declare_AppExplorerData.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201910171733310312680-" + rowTestID) + " ");

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

					
								 keys.putString("pyStreamName","pzAppExplorerTreeGrid" );

					
								 keys.putString("pyClassName","@baseclass");

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","right");

					
								 tools.putParamValue("partialTrigger","getChildNodesDeclare_AppExplorerData.pxResults1");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t<td style=\"height:24px;\" class=\"hiddenCell \"><div class=\"oflowDiv\" style=\"height:24px;\"><div class=\"divCont\"><span class=\"wspan\"></span><div class=\"cellIn\">&nbsp;</div></div></div> </td></tr>");

					 } } }   

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					menubarIncludes_1(); 

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

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
public void pzLayout_1() {
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_3();
 LayoutWrapperTableEnd_1(); tools.putParamValue("gridLayoutMethodName","");
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


public void pzAppExplorerNode_1() {
pzAuto.emitIncludeStreamReference("pzAppExplorerNode", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_2() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<li  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzAppExplorerNode", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" cellCont");tools.appendString(" gridColumn");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:27px;");tools.appendString(""); tools.appendString("'>");
	if(!pzAuto.getBrowserUtils().isIE()){
	tools.appendString("<DIV class='oflowDiv' style='height:27px;'>");
	}else{
	tools.appendString("<span class='wspan'></span><div class='cellIn'>");
	}
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzAppExplorerNode_1();
	tools.putParamValue("pega_RLindex","");
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
	tools.appendString("height:27px;");tools.appendString(""); if(!pzAuto.isOrientationRTL())    {tools.appendString(";left:");}else{tools.appendString(";right:");} int level = 0; try {String pyPropRef = tools.getParamValueCSF("pyPropRef"); if("".equals(pyPropRef))level=0; else if(!"".equals(tools.getParamValueCSF("pzLevelParam"))) level = pyPropRef.split("\\.").length-Integer.parseInt(tools.getParamValueCSF("pzLevelParam")); else level = pyPropRef.split("\\.").length-2; int indentationLevel = level;if(level!=0){indentationLevel = level-1;}int leftAdjust = 2;if(level!=0){tools.appendString( (indentationLevel*18)+"px");}else{tools.appendString( ((indentationLevel*18)-leftAdjust)+"px");}}catch(Exception e){tools.appendString("0");} ;if(level == 0){tools.appendString("; width:0px; ");}tools.appendString("' >");
	if(!pzAuto.getBrowserUtils().isIE()){
	tools.appendString("<DIV class='oflowDiv' style='height:27px;'>");
	}else{
	tools.appendString("<span class='wspan'></span><div class='cellIn'>");
	}
	if(pzAuto.handleEvaluateWhen(" o1! axpzIsTopLevelNode","!pzIsTopLevelNode", "cell", "visible" )) {
	tools.appendString("<div id='iconExpandCollapse' style='");
	if(level == 0){tools.appendString(" display:none;");
	}tools.appendString("' ><a href=\"#\" style='' onclick=\"return false;\" ");
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
	tools.appendString("' onclick=\"return false;\" class='hiddenExpColl'");
	if(level==0){tools.appendString("style='display:none;'");
	}tools.appendString("></a>");
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


public void Declare_AppExplorerData_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-rightclick='[");if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
	com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
	actionRequestD.registerFixedParameter("pyModelName","pzSetTopLevelNodeFlag");
		String usingPageString = "";
		usingPageString = "";
		tools.appendString("[\"runDataTransform\", [\"pzSetTopLevelNodeFlag\", \"=");
		actionRequestD.registerFixedParameter("","");
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
		pzPackageRuntime.packageDataTransform(contextClass, "pzSetTopLevelNodeFlag");
		}
			pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			if(pega_uiengine_pznavigation.pzUseNewMenu() && true) {
			  IActionRequest actionRequest = pzAuto.getActionRequest();
			  actionRequest.registerFixedParameter("pyActivity", "pzGetMenu");
			  pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("[\"showMenu\",[{\"dataSource\":\"pzExplorerMenu\", \"isNavNLDeferLoaded\":\"false\", \"isNavTypeCustom\":\"false\", \"className\":\"");

		tools.appendString("#~.pxObjClass$0$~#");			if(pzAuto.getUIComponentRuntime().isTemplateRendering()){ 
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
			tools.appendString(", \"ellipsisAfter\":\"999\",\"usingPage\":\"\", \"useNewMenu\":\"" + pega_uiengine_pznavigation.pzUseNewMenu() + "\", \"isMobile\":\"" + pega_uiengine_pznavigation.pzIsMobile() + "\", \"navPageName\":\"pyNavigation1771593783856");
			if(pzAuto.isOffline() || false) {
			try{
			ClipboardPage pg_tempPrimPg = tools.createPage("Embed-ExplorerNode-Class","tempNavStepPg");
			tools.putParamValue("tempNavStepPg",pg_tempPrimPg.getName());
			pega_uiengine_pzcontrol.pzGetMenu("pzExplorerMenu", "", "pyNavigation1771593783856","", false, true, false, false);
			tools.getParameterPage().remove("tempNavStepPg");
			pg_tempPrimPg.removeFromClipboard();
			}catch(Exception e){oLog.error(e);}
			}
			tools.appendString("\"},\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"document.activeElement.click&#40;&#41;()\"]");

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

					if(tools.getParamValue("partialTrigger").equals("appendToDeclare_AppExplorerData.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowDeclare_AppExplorerData.pxResults1") || tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") ){

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1"))

					tools.putParamValue("partialRefresh", "false");

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					String strIndex = tools.getParamValue("strIndexInList");

					tools.putParamValue("strIndexInList", pageListProp.size());

					if(tools.getParamValue("partialTrigger").indexOf("editRow")<0)

					pageListProp = pageListProp.getPropertyValue(Integer.parseInt(strIndex));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pageListProp);

					}

					}

					 if(tools.getParamValue("table").equals("") ||  tools.getParamValue("table").equals("left") ) { 

					if(tools.getParamValue("partialRefresh").equals("true") && tools.getParamValue("table").equals("left") && tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && tools.getStepPage().getProperty(tools.getParamValue("pyPropRef")).size()>0 ){

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<UL  id='gridNode' bRowResize='false' bColumnResize='false' class='gridNode' >");

					 } 

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

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

												ClipboardPage filterCriteriaPage = tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

										String rowVisibleWhenConditionLeft = ""; if(filterCriteriaPage != null) { rowVisibleWhenConditionLeft = filterCriteriaPage.getString("pyRowVisibleWhenCondition");}

					
 if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")) tools.putParamValue("partialRefresh", "false");

					
 while(iterPageListProp.hasNext()){ if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")){ ClipboardProperty prop = (ClipboardProperty)iterPageListProp.next(); tools.putActive(prop);}

					
									  PRStackFrame frame_2 = pega.pushStackFrame("FixedColTreeGrid", null, tools.getActive().getPageValue(), false, false); 

											try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyIsPinned"), -1);

					}}catch(Exception e){e.printStackTrace();}

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
 if(tools.getParamValue("gridAction").equals("INSERTAFTER") || tools.getParamValue("gridAction").equals("INSERTBEFORE") || !tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") ||  pzAuto.evaluateWhen(rowVisibleWhenConditionLeft, null, true)) {

					 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum", ""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum", ""+tools.getActive().indexOf());} 

					
						 tools.putParamValue("expandRL","true");

					tools.appendString("\n\t\t\t\t\t\t\t<li class='gridRow' isWrapEnabled=false  id='");

					 if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")) { tools.appendString(tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")")); } else { tools.appendString(tools.getActiveName()); } 

					tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("Declare_AppExplorerData.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("Declare_AppExplorerData.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201910171733310312680-" + rowTestID) + " ");

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

					tools.appendString("style='height:27px;");getInlineStyle_1(); if(!pzAuto.isOrientationRTL())    {tools.appendString(";padding-left:");}else{tools.appendString(";padding-right:");} try { int level = 0;String pyPropRef = tools.getParamValue("pyPropRef"); if("".equals(pyPropRef))level = 0; else if(!"".equals(tools.getParamValue("pzLevelParam"))) level = pyPropRef.split("\\.").length-Integer.parseInt(tools.getParamValue("pzLevelParam")); else level = pyPropRef.split("\\.").length-2; tools.appendString(0+ (level == 0 ? 2 : 0) + (level * 18)+ "px");}catch(Exception e){tools.appendString("0px");} tools.appendString("'");tools.appendString(" >");

					 repeatingDataCell_1(); 

					 repeatingDataCell_2(); 

					tools.appendString("</ul>");

					
						 tools.putParamValue("expandRL","false"); 

					 if(tools.getParamValue("partialTrigger").equals("") || tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")) { 

					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")){ String strTempProp = tools.getParamValue("pyPropRef");

					
							 tools.putParamValue("pyPropRef",strTempProp+"("+tools.getActive().indexOf()+").pxResults");

					
							 StringMap keys = new HashStringMap();

					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
								 keys.putString("pyStreamName","pzAppExplorerTreeGrid");

					
								 keys.putString("pyClassName","@baseclass" );

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","left");

					
								 tools.putParamValue("partialTrigger","getChildNodesDeclare_AppExplorerData.pxResults1");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

					 } 

					 } 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</li>");

					}

					
									 pega.popStackFrame(frame_2, false);

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1"))break;

					}//close the while loop

					if(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					break;

					}

					}//close refreshrows while loop

					if(tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.appendString("</UL>");

					}

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
  if(tools.getParamValue("table").equals("left") && tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")  && tools.getStepPage().getProperty(tools.getParamValue("pyPropRef")).size()>0) { 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</ul>");

					
 } 

					
 } 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

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

												ClipboardPage filterCriteriaPage = tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

										String rowVisibleWhenConditionRight = ""; if(filterCriteriaPage != null) { rowVisibleWhenConditionRight = filterCriteriaPage.getString("pyRowVisibleWhenCondition");}

					
 if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")) tools.putParamValue("partialRefresh", "false");

					
 while(iterPageListProp.hasNext()){ if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")) {ClipboardProperty prop = (ClipboardProperty)iterPageListProp.next(); tools.putActive(prop);}

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
 if(tools.getParamValue("gridAction").equals("INSERTAFTER") || tools.getParamValue("gridAction").equals("INSERTBEFORE") || !tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") || pzAuto.evaluateWhen(rowVisibleWhenConditionRight, null, true)) {

					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
						 tools.putParamValue("expandRL","true");

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.Declare_AppExplorerData.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pxObjClass"),-1);

					
 }}catch(Exception e){}

					tools.appendString(" data-gargs='[");

					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pxObjClass").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]'  id='");

					 if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")) { tools.appendString(tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")")); } else { tools.appendString(tools.getActiveName()); } 

					tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("Declare_AppExplorerData.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("Declare_AppExplorerData.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201910171733310312680-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					 if(tools.getParamValue("partialTrigger").equals("") || tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1")) { 

					 if( (tools.getStepPage().getIfPresent("pyExpanded") != null && tools.getStepPage().getString("pyExpanded").equals("true")) || tools.getParamValue("pyPrintTreeGrid").equals("true")) { String strTempProp = tools.getParamValue("pyPropRef");

					
							 tools.putParamValue("pyPropRef",strTempProp+"("+tools.getActive().indexOf()+").pxResults");

					
							 StringMap keys = new HashStringMap();

					
								 keys.putString("pxObjClass", "Rule-HTML-Section");

					
								 keys.putString("pyStreamName","pzAppExplorerTreeGrid" );

					
								 keys.putString("pyClassName","@baseclass");

					
								 tools.putParamValue("partialRefresh","true");

					
								 tools.putParamValue("table","right");

					
								 tools.putParamValue("partialTrigger","getChildNodesDeclare_AppExplorerData.pxResults1");

					
								 tools.appendString(tools.getStream(keys, null));

					tools.putParamValue("pyPropRef",strTempProp);

					 } 

					 } 

					}

					
									  pega.popStackFrame(frame_3, false); 

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1"))break;

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

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					 } 

					 tools.putSaveValue("isGrid", "false"); 

					
	 /* generate the transaction ID if it has been changed due to DB commit operations */ 

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropDeclare_AppExplorerData.pxResults1")) {

					
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

					
			 pageListProp = tools.getProperty("Declare_AppExplorerData.pxResults");

					
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

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupDeclare_AppExplorerData.pxResults1")) { 

					
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

					
			 if(subScriptForColumn.equals("pzAppExplorerNode1") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property "pzAppExplorerNode" at assembly time
 */
if (_jspx_meth_pega_reference__1(pageContext, "pzAppExplorerNode", "display")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					
									 pega.popStackFrame(frame, false); } 

					
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

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;if(tools.getParamValue("partialTrigger").equals("appendToDeclare_AppExplorerData.pxResults1") ){

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1"))

					tools.putParamValue("partialRefresh", "false");

					if(!tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_AppExplorerData.pxResults1") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getStepPage().getProperty(tools.getParamValue("pyPropRef"));

					String strIndex = tools.getParamValue("lastRowToRetrieve");

					if("".equals(strIndex) || Integer.parseInt(strIndex) > pageListProp.size())

					strIndex = tools.getParamValue("strIndexInList");

					if(tools.getParamValue("partialTrigger").indexOf("editRow")<0)

					pageListProp = pageListProp.getPropertyValue(Integer.parseInt(strIndex));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pageListProp);

					}

					}

					
									  PRStackFrame frame_2 = pega.pushStackFrame("FixedColTreeGrid", null, tools.getActive().getPageValue(), false, false); 

											try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyIsPinned"), -1);

					}}catch(Exception e){e.printStackTrace();}

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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzAppExplorerTreeGrid");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZAPPEXPLORERTREEGRID #20191217T182450.581 GMT", "@baseclass pzAppExplorerTreeGrid", "Pega-Desktop", "08-05-01", "20191217T182450.581 GMT");
}
