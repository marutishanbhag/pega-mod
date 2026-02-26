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
 * Builds JSP stream @BASECLASS!WORKSEARCHGADGET.
 */
public class ra_stream_worksearchgadget_e2933e19b52b2c7810d86629e45fa3b2 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.WorkSearchGadget.Data_Portal.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 137433668;
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
	public ra_stream_worksearchgadget_e2933e19b52b2c7810d86629e45fa3b2(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "7b7f2aa644f7271353e0c0e098d409a780f576c5";
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
/* Instance RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "7b7f2aa644f7271353e0c0e098d409a780f576c5";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("WorkSearchGadget",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT */
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
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:WORKSEARCHGADGET", 
	"Rule-Obj-Property:PYSKIPOPENWORKITEM", 
	"Rule-Obj-Property:PYSEARCHTEXT", 
	"Rule-HTML-Property:PXBUTTON", 
	"Rule-HTML-Property:PXHIDDEN"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("WORKSEARCHGADGET","Rule-HTML-Section","@BASECLASS",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT","!WORKSEARCHGADGET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",137433668), 
		new DependentRuleInfo("PYSKIPOPENWORKITEM","Rule-Obj-Property","@BASECLASS",true,"@baseclass","Pega-EndUserUI","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYSKIPOPENWORKITEM #20180713T134648.492 GMT","!PYSKIPOPENWORKITEM",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSEARCHTEXT","Rule-Obj-Property","@BASECLASS",true,"@baseclass","Pega-EndUserUI","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYSEARCHTEXT #20180713T134648.480 GMT","!PYSEARCHTEXT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883), 
		new DependentRuleInfo("PXHIDDEN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT","PXHIDDEN",true,false,"ABSOLUTE_CLASSLESS",1000971257)
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
//	RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT:20210622T210855.927 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSEARCHTEXT #20180713T134648.480 GMT:20180713T134648.480 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSKIPOPENWORKITEM #20180713T134648.492 GMT:20180713T134648.492 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSKIPOPENWORKITEM #20180713T134648.492 GMT:20180713T134648.492 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENWORKBYHANDLE--(IAUTO591205311DA543B2EDDD2E46D0E6BB0F #20190520T072316.567 GMT:20190520T072316.567 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNACTIVITY #20190830T074358.805 GMT:20190830T074358.805 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNDATATRANSFORM--(CLIPB9514A9C33ADD6709FD6A843ADA2991DD #20220104T102659.447 GMT:20220104T102659.447 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETVALUE--(CLIPBOARDPAGED2D8EBC7F29F977F1A20CFC6559990AA #20180713T133344.640 GMT:20180713T133344.640 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEHIDDEN--(CLIPBOARDPAGEE2BC591D2BB656F265183A20B6CFAC93 #20180713T133346.239 GMT:20180713T133346.239 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSETMOBILETRANSITION--(CLIPBOARBD730748D4A4889BCBC7588C6050A02F #20181029T101028.041 GMT:20181029T101028.041 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
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
		return "8937d811a58a4ab970693ef646917c71";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
String actionName = tools.getParamValue("pyAction");
if(!actionName.equals("PostValue") && !actionName.equals("ReadonlyFormat")){
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("WorkSearchGadget",1,"Rule-HTML-Section","{'type':'Section','ruleName':'WorkSearchGadget','insKey':'RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT','sectionType':'standard'}");
pzLayout_1();
 tools.putSaveValue("ContainerID", "");
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {tools.putParamValue("setPostValueURL", "true");} else {tools.appendString("<div style=\"display:none;\" data-postvalue-url=\"" + StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=ReloadCell&StreamName=WorkSearchGadget")) + "\"></div>");}
 pzSection.endSection(); 
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {tools.putParamValue("setPostValueURL", "");}
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
} else {	PRStackFrame frame = pega.pushStackFrame("ContextPage", null, tools.findPage(tools.getParamValue("contextPage")), false, false);				getControlMarkup_1();	pega.popStackFrame(frame, false);}
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pySearchOnProperty", "pyID");
config.put("pyReportName", "pyWorkIDSearch");
config.put("pyReportClassName", "Work-");
config.put("pzActivityStaticParams", "pySearchOnProperty&pySearchMethod&pyReportClassName&pyReportName");
config.put("pzActivity", "pyWorkIDSearch");
config.put("pySearchMethod", "exact");
pega.getUIEngine().getUIAction("runActivity", config).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pyPopulateSearchString");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("harnessName", "SearchResultsPage");
config.put("className", "Data-Portal");
config.put("target", "newDocument");
pega.getUIEngine().getUIAction("showHarness", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.openPageInNewTab");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pySearchOnProperty", "pyID");
config.put("pyReportName", "pyWorkIDSearch");
config.put("pyReportClassName", "Work-");
config.put("pzActivityStaticParams", "pySearchOnProperty&pySearchMethod&pyReportClassName&pyReportName");
config.put("pzActivity", "pyWorkIDSearch");
config.put("pySearchMethod", "exact");
pega.getUIEngine().getUIAction("runActivity", config).register();
pega.getUIEngine().getUIAction("openWorkByHandle", null).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pyPopulateSearchString");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("harnessName", "SearchResultsPage");
config.put("className", "Data-Portal");
config.put("target", "newDocument");
pega.getUIEngine().getUIAction("showHarness", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.openPageInNewTab");
pega.getUIEngine().getUIAction("runScript", config).register();
}
public void 
getControlMarkup_1() {
try {
if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pySearchText").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxTextInput_1();pzAuto.getUIComponentRuntime().insertTemplateScripts();}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_1() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxHidden_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle();
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
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
	 }
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
	cellPage.put("pyValue",".pySkipOpenWorkItem");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pySkipOpenWorkItem");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2016122110475608403802",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pySkipOpenWorkItem");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pySkipOpenWorkItem", ".pyCaption");
	String spxUniqueStreamHash10 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash10 != null && !"".equals(spxUniqueStreamHash10)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash10,pxUniqueStreamHash+"_10");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_10");
	}
	String errorMsgHTML = pzAuto.getCell().getErrorMessagesHTML("SIMPLELAYOUT","");
	modePage1.put("errMsgHTML",errorMsgHTML);
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	modePage2.put("clintValidAttrs",clientValidationAttributes);
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_hidden.js");
	ctrlComponent.beginComponent("pxHidden",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
boolean bUITemplatized = pzAuto.getUIComponentRuntime().isTemplateRendering();pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2016122110475608403802") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pySkipOpenWorkItem"));}else {
	tools.appendCSF(isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true));}
	tools.appendString("\" name=\"");
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryHandle"));
	tools.appendString("\" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
	tools.appendString(" data-ctl ");if(bUITemplatized){
	tools.appendString(" data-bindprops=\"value\" ");}
	tools.appendString(">");		}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
	tools.putActive(propActivePrev); 		} catch (Exception e) {

		
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



public void pxHidden_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle();
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
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
	 }
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
	cellPage.put("pyValue",".pySkipOpenWorkItem");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pySkipOpenWorkItem");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2016122110475608403802",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pySkipOpenWorkItem");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pySkipOpenWorkItem", ".pyCaption");
	String spxUniqueStreamHash9 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash9 != null && !"".equals(spxUniqueStreamHash9)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash9,pxUniqueStreamHash+"_9");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_9");
	}
	String errorMsgHTML = pzAuto.getCell().getErrorMessagesHTML("SIMPLELAYOUT","");
	modePage1.put("errMsgHTML",errorMsgHTML);
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	modePage2.put("clintValidAttrs",clientValidationAttributes);
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_hidden.js");
	ctrlComponent.beginComponent("pxHidden",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
boolean bUITemplatized = pzAuto.getUIComponentRuntime().isTemplateRendering();pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2016122110475608403802") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pySkipOpenWorkItem"));}else {
	tools.appendCSF(isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true));}
	tools.appendString("\" name=\"");
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryHandle"));
	tools.appendString("\" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
	tools.appendString(" data-ctl ");if(bUITemplatized){
	tools.appendString(" data-bindprops=\"value\" ");}
	tools.appendString(">");		}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
	tools.putActive(propActivePrev); 		} catch (Exception e) {

		
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



public void pxTextInput_1() {String key="2||RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","2"};oCellRuntimeParamsMap.put("2||RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT",paramValues);oControlPathsMap.put("2||RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");}
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
		tools.appendString(" data-click='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pyWorkIDSearch");
		tools.appendString("[\"runActivity\", [\"\", \"pySearchString=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pySearchText")+"~#");		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pySearchOnProperty\":\"pyID\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pySearchMethod\":\"exact\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pyReportClassName\":\"Work-\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pyReportName\":\"pyWorkIDSearch\"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"setValue\", [[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle") + "\", \"\", \"\", \"\", \"true\"], [\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pySkipOpenWorkItem") + "\", \"\", \"\", \"\", \"true\"]]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"setValue\", [[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pySkipOpenWorkItem") + "\", \"\", \"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle") + "\", \"\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle")+"~#");			tools.appendString("\"]]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }				{
				com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
				actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
				actionRequest.registerFixedParameter("action", "openWorkByHandle");
				pzAuto.registerActionRequest(actionRequest);
				tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);				tools.appendString("\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");				tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle")+"~#");				tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
				}

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }				{
					com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
					actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
					com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
					actionRequestD.registerFixedParameter("pyModelName","pyPopulateSearchString");
						String usingPageString = "";
						usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
						tools.appendString("[\"runDataTransform\", [\"pyPopulateSearchString\", \"=");
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
						pzPackageRuntime.packageDataTransform(contextClass, "pyPopulateSearchString");
						}
							pzAuto.registerActionRequest(actionRequest);
							}
							tools.appendString("\",\":event\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"runScript\", [\"pega.desktop.infinity.openPageInNewTab(\\\"Data-Portal\\\",\\\"SearchResultsPage\\\")\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pySearchText"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyWorkIDSearchHandle"), -1);
		}}catch(Exception e){}							String returnString = actionsStringBuilder.toString();
							tools.popStreamBody();
							return returnString;
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2016122110475608391271") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","WorkSearchGadget_$CTX$_1");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Click to trigger the search\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Click to trigger the search", ".pyActionPrompt");
	}
	pyTooltip = "Click to trigger the search";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-search";
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
	String spxUniqueStreamHash4 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash4 != null && !"".equals(spxUniqueStreamHash4)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash4,pxUniqueStreamHash+"_4");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_4");
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
		 String buttonUID = "name='WorkSearchGadget_"+ referenceString+ "_1'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("2016122110475608391271") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pyWorkIDSearch");
		tools.appendString("[\"runActivity\", [\"\", \"pySearchString=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pySearchText")+"~#");		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pySearchOnProperty\":\"pyID\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pySearchMethod\":\"exact\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pyReportClassName\":\"Work-\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"pyReportName\":\"pyWorkIDSearch\"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"setValue\", [[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle") + "\", \"\", \"\", \"\", \"true\"], [\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pySkipOpenWorkItem") + "\", \"\", \"\", \"\", \"true\"]]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"setValue\", [[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pySkipOpenWorkItem") + "\", \"\", \"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle") + "\", \"\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle")+"~#");			tools.appendString("\"]]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }				{
				com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
				actionRequest.registerFixedParameter("pyActivity", "@baseclass.doUIAction");
				actionRequest.registerFixedParameter("action", "openWorkByHandle");
				pzAuto.registerActionRequest(actionRequest);
				tools.appendString("[\"setMobileTransition\",[\"");

		tools.appendFormatted("pega.mobile.transitions.NONE",StreamBuilder.FMT_NORMAL);				tools.appendString("\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");				tools.appendString("],[\"openWorkByHandle\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyWorkIDSearchHandle")+"~#");				tools.appendString("\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);				tools.appendString("\",\"false\",\"false\",{\"target\":\"primary\"}]");
				}

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }				{
					com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
					actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
					com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
					actionRequestD.registerFixedParameter("pyModelName","pyPopulateSearchString");
						String usingPageString = "";
						usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
						tools.appendString("[\"runDataTransform\", [\"pyPopulateSearchString\", \"=");
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
						pzPackageRuntime.packageDataTransform(contextClass, "pyPopulateSearchString");
						}
							pzAuto.registerActionRequest(actionRequest);
							}
							tools.appendString("\",\":event\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySearchText").getEntryHandle(true));
		tools.appendString("\",\"!=\",");
		tools.appendString("\"\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySearchText").getStringValue(),"!=","")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"runScript\", [\"pega.desktop.infinity.openPageInNewTab(\\\"Data-Portal\\\",\\\"SearchResultsPage\\\")\"]");

		tools.appendString(",[\"&\"");
		tools.appendString(",[\"OP\"");
		tools.appendString(",[");
		tools.appendString("\"");
		tools.appendString(tools.getProperty(".pySkipOpenWorkItem").getEntryHandle(true));
		tools.appendString("\",\"=\",");
		tools.appendString("\"true\"");
		tools.appendString(",\"");
		if(com.pegarules.generated.pega_uiengine_expressionevaluators.pzCompareValues(tools.getProperty(".pySkipOpenWorkItem").getStringValue(),"=","true")){
			tools.appendString("true");}else{
			tools.appendString("false");}
		tools.appendString("\"]");
		tools.appendString("]");
		tools.appendString("]");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pySearchText"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyWorkIDSearchHandle"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Click to trigger the search\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-search";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");						}

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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","nav-icon-filled main-search-action","nav-icon-filled main-search-action")  + " " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_1();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2016122110475608391271-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","nav-icon-filled main-search-action");
	pgCells.put("customRWStyles","nav-icon-filled main-search-action");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pySearchText",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing    " + pzSection.getCustomStyle(false, "","main-header-search hide-label padding-lr-2x width-100-pct","main-header-search hide-label padding-lr-2x width-100-pct")  + " flex '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2016122110475608391271-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
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
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Search") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2016122110475608391271-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
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
tools.appendString(tools.getLocalizedTextForString("pyCaption","Search") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxTextInput_1();
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-all-spacing flex");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2016122110475608391271-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pySearchText");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","main-header-search hide-label padding-lr-2x width-100-pct");
	pgCells.put("customRWStyles","main-header-search hide-label padding-lr-2x width-100-pct");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pySearchText",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_1();labelName = "Search";
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
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_1(".pySkipOpenWorkItem",0,"","","Text");
	return index;
}


public int simpleLayoutTemplateCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_2(".pySkipOpenWorkItem",0,"","","Text");
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionWorkSearchGadgetB","",false);
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
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806010302330474658") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle flex-nowrap width-100-pct" + "'  " + "role='search' tabindex='-1'  data-skip-target ='search' ");
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
		pg_dlmeta.put("skipTarget"," tabindex='-1'  data-skip-target ='search' ");
		pg_dlmeta.put("customClassName","flex-nowrap width-100-pct");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("ariaRole","search");
		pg_dlmeta.put("ariaRoleType","landmark");
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
	String paramName = "EXPANDEDSubSectionWorkSearchGadgetB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","SimpleDiv");
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
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "WorkSearchGadget");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS WORKSEARCHGADGET #20210506T204031.205 GMT", "@baseclass WorkSearchGadget", "Theme-Cosmos", "04-01-01", "20210622T210855.927 GMT");
}
