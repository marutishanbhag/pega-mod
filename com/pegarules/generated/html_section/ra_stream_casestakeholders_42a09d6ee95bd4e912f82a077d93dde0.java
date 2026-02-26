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
 * Builds JSP stream WORK-!CASESTAKEHOLDERS.
 */
public class ra_stream_casestakeholders_42a09d6ee95bd4e912f82a077d93dde0 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.CaseStakeholders.OFON2J_ProcessO_Work_Onboarding.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -159101452;
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
	public ra_stream_casestakeholders_42a09d6ee95bd4e912f82a077d93dde0(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "5125404c9b9a3bba615822b99f65976a89af8970";
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
/* Instance RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "5125404c9b9a3bba615822b99f65976a89af8970";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("CaseStakeholders",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT */
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
	"Rule-HTML-Section:CASESTAKEHOLDERS", 
	"Rule-Obj-Property:STAKEHOLDERSCOUNT", 
	"Rule-HTML-Property:PXBUTTON", 
	"Rule-File-Binary:WEBWB!STAKEHOLDER!SVG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("CASESTAKEHOLDERS","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT","!CASESTAKEHOLDERS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-159101452), 
		new DependentRuleInfo("STAKEHOLDERSCOUNT","Rule-Obj-Property","WORK-",true,"Work-","Theme-Cosmos","04-01-01","RULE-OBJ-PROPERTY WORK- STAKEHOLDERSCOUNT #20210506T204032.967 GMT","!STAKEHOLDERSCOUNT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883), 
		new DependentRuleInfo("WEBWB!STAKEHOLDER!SVG","Rule-File-Binary","",false,"","","","","WEBWB!STAKEHOLDER!SVG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT:20230706T113320.751 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-PROPERTY WORK- STAKEHOLDERSCOUNT #20210506T204032.967 GMT:20210506T204032.967 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(
//	simpleLayout_2(
//	getNextPage_1( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}
//	GetRDLRow_1( {"listSource", "String", ""},  {"index", "int", "0"}

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETREFRESHWHENPREACTIVITY #20180713T133340.025 GMT:20180713T133340.025 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLOCALACTION--(CLIPBOARDP735454E5CE9DE0AF1D25BFD33036C12C #20190423T162450.172 GMT:20190423T162450.172 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFIELDVALUEAPI #20200312T061421.553 GMT:20200319T144505.401 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5020b8953b352c8db53e80ac41a33ff2";
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
  pzSection.beginSection("CaseStakeholders",1,"Rule-HTML-Section","{'type':'Section','ruleName':'CaseStakeholders','insKey':'RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT','sectionType':'standard'}");
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
config = new HashMap<String, String>();
config.put("pySectionName", "CaseStakeholders");
pega.getUIEngine().getUIAction("rdlpagination", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkParties");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkParties");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkParties");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkPartiesInfo");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.openStakeholdersModal");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkParties");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkParties");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkPartiesInfo");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.infinity.openStakeholdersModal");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pyUpdateWorkParties");
pega.getUIEngine().getUIAction("localAction", config).register();
}
public void pzHeaderCell_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerCell = pzAuto.getUIComponent();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
metadataPage.put("pyStyle","height:38px;width:105px;");
metadataPage.put("pyInspectorData",pzCell.getInspectorDataDynamic("pxButton","",".pySections(1).pyHeaderTable.pyRows(1).pyCells(1)"));
metadataPage.put("pyWrap","false");
metadataPage.put("pyRenderedStyle",pzSection.getCustomStyle(false, "", "", ""));
boolean pyVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxStakeholdersGearIconEnabled", pxUniqueStreamHash+"_17");
IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_17");
metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
headerCell.beginComponent("pxHeaderCell",metadataPage);
if(pyVisibility){
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pzHeaderCellContent_1();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
headerCell.endComponent();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("hIconSrcType", "standard");
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
metadataPage.put("pyImage", "data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxNC44IiBoZWlnaHQ9IjIwIiB2aWV3Qm94PSIwIDAgMTQuOCAyMCI+CiAgPGRlZnM+CiAgICA8c3R5bGU+CiAgICAgIC5jbHMtMSB7CiAgICAgICAgZmlsbDogIzM1MzYzODsKICAgICAgfQogICAgPC9zdHlsZT4KICA8L2RlZnM+CiAgPHRpdGxlPnN0YWtlaG9sZGVyPC90aXRsZT4KICA8ZyBpZD0iTGF5ZXJfMiIgZGF0YS1uYW1lPSJMYXllciAyIj4KICAgIDxnIGlkPSJMYXllcl8xLTIiIGRhdGEtbmFtZT0iTGF5ZXIgMSI+CiAgICAgIDxwYXRoIGNsYXNzPSJjbHMtMSIgZD0iTTEzLjcsNC44bC01LTIuOVYuNEEuNC40LDAsMCwwLDguMywwQzQuMywwLC45LDMsLjksNi41YTcuOCw3LjgsMCwwLDAsMSwzLjgsNS4xLDUuMSwwLDAsMSwuNywyLjMsNC4yLDQuMiwwLDAsMS0xLjIsMi41LDEuOSwxLjksMCwwLDAtLjUsMSwuNC40LDAsMCwwLC40LjRIMTIuNmEuNC40LDAsMCwwLC40LS40LDMuNSwzLjUsMCwwLDAtMS4yLTIuM0E2LjYsNi42LDAsMCwxLDkuNiw5bDEuOS40YTIuNCwyLjQsMCwwLDAsMi4xLS44bDEuMS0xLjRjMC0uMS4xLS4yLjEtLjNWNi43QTIuMSwyLjEsMCwwLDAsMTMuNyw0LjhabS4yLDItMSwxLjNhMS41LDEuNSwwLDAsMS0xLjIuNWMtMS4xLS4yLTMuMS0uNi00LTEuNWEuNC40LDAsMCwwLS42LDAsLjQuNCwwLDAsMCwwLC42LDYuMiw2LjIsMCwwLDAsMS42LDEsNy41LDcuNSwwLDAsMCwyLjQsNS42LDQuMSw0LjEsMCwwLDEsMSwxLjRIMi4xYTQuNyw0LjcsMCwwLDAsMS40LTNBNS43LDUuNywwLDAsMCwyLjcsMTBhNy4yLDcuMiwwLDAsMS0xLTMuNUMxLjcsMy42LDQuNSwxLjEsNy44LjlWMi4ybC4yLjQsNS4zLDIuOWExLjQsMS40LDAsMCwxLC42LDEuMlptLTQuMy0yYS41LjUsMCwwLDEtLjUuNC40LjQsMCwwLDEtLjQtLjQuNS41LDAsMCwxLC40LS41QS41LjUsMCwwLDEsOS42LDQuOFpNMTMuNCwxOGEuOC44LDAsMCwwLS44LS42SDEuM2EuOC44LDAsMCwwLS44LjZMMCwxOS40YS40LjQsMCwwLDAsLjQuNkgxMy41YS40LjQsMCwwLDAsLjQtLjZaTTEsMTkuMWwuMy0uOEgxMi42bC4zLjhaIi8+CiAgICA8L2c+CiAgPC9nPgo8L3N2Zz4K");
}else{
metadataPage.put("pyImage", "webwb/stakeholder.svg");}
metadataPage.put("headingLevel","h3");
metadataPage.put("headCustom","flex-header");
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCaseStakeholdersB"));
metadataPage.put("titleType","Field Value");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
String sectionTitle = "StakeholdersGadgetHeading";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("StakeholdersGadgetHeading", "pyCaption");
metadataPage.put("title", sectionTitle);
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("uniqueid", "202602230450280865");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201907260536110116488") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
pzHeaderCell_1();
headerComponent.endComponent();
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_3() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
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


public void getNextPage_1(String listSource, int listStartIndex, int listEndIndex) {
	IUIComponent nextPageComponent = pzAuto.getUIComponent(IUIComponent.ComponentType.NEWPAGE);
	ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
	int totalRecords = rdlPageListProp.size();
	listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
	Map map = new HashMap();
	Map<String, String> indexMap = new HashMap<String, String>();
	indexMap.put("pyStartIndex",Integer.toString(listStartIndex));
	indexMap.put("pyEndIndex",Integer.toString(listEndIndex));
	map.put("pxDataSourceId", pxUniqueStreamHash+"_13");
	map.put("pyContext", listSource);
	map.put("pyPagination", indexMap);
	IUIComponentMetadata nextPageMetadata = pzAuto.getUIComponentRuntime().createMetadata();
	nextPageMetadata.put("datasrcid",pxUniqueStreamHash+"_13");
	nextPageMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("201905301015540323244" ) + "");
	nextPageMetadata.put("pageListProp",listSource);
	nextPageMetadata.put("strtindx",Integer.toString(listStartIndex));
	nextPageMetadata.put("endindx",Integer.toString(listEndIndex));
	nextPageMetadata.put("processChildren","false");
	nextPageMetadata.put("rdlshowdtls","false");
	nextPageComponent.addDependentScripts("pzpega_ui_nextpagetemplate.js");
	nextPageComponent.beginComponent("nextPage",nextPageMetadata,map);
	ClipboardProperty cpSource = tools.getProperty(listSource);
	ClipboardPage itemPage = null;
	Iterator itemPages = cpSource.iterator();
	if(itemPages.hasNext()) {
		itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		simpleLayoutCell_2(1);
	pega.popStackFrame(itemFrame, false);
	}
	nextPageComponent.endComponent();
	}
	

public void GetRDLRow_1(String listSource, int index) {
		ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
		ClipboardPage itemPage = rdlPageListProp.getPageValue(index);
		if(itemPage != null){
		tools.appendString("||RDLROWMARKUP_BEGIN||");
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		IUIComponent repeatingRow = null;
		if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow = pzAuto.getUIComponent();
		IUIComponentMetadata pg_repeatingRowMeta = pzAuto.getUIComponentRuntime().createMetadata();
		pg_repeatingRowMeta.put("index", index + "");
		repeatingRow.beginComponent("RepeatingRow", pg_repeatingRowMeta);
		}
		int cellIndex=simpleLayoutCell_2(index);
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow.endComponent();
		}
		pega.popStackFrame(itemFrame, false);
		tools.appendString("||RDLROWMARKUP_END||");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_10","pyMiniPartyDetails", secInfo);
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
	String sectionName = "pyMiniPartyDetails"; 
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
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionCellCaseStakeholders270","",false);
}
public void pzLayout_1() {
pzSetExpandParam_3();
pzLayoutBodyWrapper_1();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_7","pyMiniPartyDetails", secInfo);
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
	String sectionName = "pyMiniPartyDetails"; 
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


public int simpleLayoutCell_2(  int index) {
	String labelName="";
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pyMiniPartyDetails",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing    " + pzSection.getCustomStyle(false, "","padding-b-1x","padding-b-1x")  + " flex flex-row ' ");
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	tools.appendString("NAME='BASE_REF' BASE_REF='");
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	String strSub="";
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	tools.putParamValue("index",strSub);
	tools.appendString(tools.getStepPage().getReference() + "' ");
	String rowTestID = tools.getParamValue("index");
	tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201905301015540323244-" + rowTestID) + " ");
	}else {
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getStepPage().getReference(),"") + "' ");
	}
	tools.appendString(" STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.putParamValue("bRDLShowDetails",prevState);
	tools.appendString("</div>");
	index++;
	return index;
	}else{
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	 baseRef = "NAME='BASE_REF' BASE_REF='";
	String strSub="";
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	baseRef +=".pyWorkParty(";
	baseRef += tools.getStepPage().getString("pxSubscript");
	baseRef += ")";
	}else {
	baseRef += tools.getStepPage().getReference();
	}
	baseRef += "'";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("firstItemClass"," remove-top-spacing remove-left-spacing");
	pgCells.put("lastItemClass"," remove-bottom-spacing remove-right-spacing");
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","padding-b-1x");
	pgCells.put("customRWStyles","padding-b-1x");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pyMiniPartyDetails",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
	tools.putParamValue("bRDLShowDetails",prevState);
	return index;
	}
}
public void pzTemplateRDL_1() {
IUIComponentMetadata pgRDMetadata = null;
IUIComponentMetadata pgSection = null;  
IUIComponentMetadata pgSectionBody = null;  
IUIComponentMetadata pgCells  = null; 
IUIComponentMetadata pyRDDataPageParams = null;
IUIComponent cc = pzAuto.getUIComponent(IUIComponent.ComponentType.RDL);
String pyInstanceId ="";
char mode = tools.getProperty(".pyWorkParty").getMode();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pgRDMetadata = pzAuto.getUIComponentRuntime().createMetadata();
pgRDMetadata.put("pyProcessChildren","false");
String strLayoutMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
ClipboardPage dummyPage = tools.createPage("Data-Party","NoDataPage");
PRStackFrame itemFrame1 = pega.pushStackFrame("NoResultsPage", null, dummyPage, true, false);
pgRDMetadata.put("noresulttype", "section");
Map<String, Object> RDLNoRowMessageSectionParams = new HashMap<>();
RDLNoRowMessageSectionParams.put("doNotAddToMetadataTree", true);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_11","UtilityNoResultsMessage", RDLNoRowMessageSectionParams);
String pyNoDataReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("nodatasec", pyNoDataReference);
pega.popStackFrame(itemFrame1, false);
dummyPage.removeFromClipboard();
pgRDMetadata.put("methodnm",strLayoutMethodName);
pgSection = pzAuto.getUIComponentRuntime().createMetadata();
pgSectionBody = pzAuto.getUIComponentRuntime().createMetadata();
pgCells = pzAuto.getUIComponentRuntime().createMetadata();
pgSection.put("class","content    flex  layout-content-stacked content-stacked "); 
pgSection.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + ""); 
pgRDMetadata.put("isformnavigation","false");
pgRDMetadata.put("rdlnavigationtype","tabkey");
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression;
if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
expressionId = pxUniqueStreamHash+"_12";
expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  ".pyWorkParty AddDelete", expressionId, true);
expressionId = expression.getId();
}
ClipboardProperty rdlPageListProp = tools.getProperty(".pyWorkParty");
String rdlPageListPropRef = ".pyWorkParty";
if(rdlPageListProp != null) {
rdlPageListPropRef = rdlPageListProp.getReference();
}
String rdlRefreshWhenStr = ".pyWorkParty AddDelete";
rdlRefreshWhenStr = rdlRefreshWhenStr.replace(".pyWorkParty",rdlPageListPropRef);
if(!StringUtils.isBlank(expressionId)) {
	pgRDMetadata.put("pyExpressionId", expressionId);
}
pgRDMetadata.put("nextpg","getNextPage_1");
pgRDMetadata.put("pyenableswipe","false");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty(".pyWorkParty").getReference(),"", false).replaceFirst("_pa[0-9]+pz","")); 
} else {
pgSectionBody.put("pageListProp", ".pyWorkParty");
}
pgSectionBody.put("sourcetype","Property");
Map map = new HashMap();
Map paramsMap = new HashMap();
map.put("params", paramsMap);
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pzPackageRuntime.packageProperty(tools.getProperty(".pyWorkParty").getReference(), null);
}
pgSectionBody.put("dpname","");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgRDMetadata.put("generatePath","true");
}
pgSectionBody.addMetadataInArray("cells",pgCells);
pgSection.addMetadataInArray("sectionbody",pgSectionBody);
pgRDMetadata.putMetadata("section",pgSection);
pyInstanceId =String.valueOf(System.currentTimeMillis());
pgRDMetadata.put("uniqueid", "RDL" + pyInstanceId);
pgRDMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("201905301015540323244" ) + "");
cc.addDependentScripts("pzpega_ui_RDLTemplate.js");
cc.addDependentScripts("pzpega_ui_RDLRowTemplate.js");
cc.addAdditionalScripts("rdlincludes","pzpega_ui_rdl.js");
pgRDMetadata.put("rowmethod","GetRDLRow_1");
map.put("pyContext", ".pyWorkParty");
cc.beginComponent("RepeatingDynamicLayout",pgRDMetadata,map);
Map<String,String> repeatMap  = null; if(tools.getParameterPage().getParameterValue("pzRepeatProperties")!=null){
repeatMap = (Map<String,String>)tools.getParameterPage().getParameterValue("pzRepeatProperties");
}else {
repeatMap = new HashMap<String,String>();
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty(".pyWorkParty").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""), "RDL" + pyInstanceId);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty(".pyWorkParty").getReference(),"", false),pyInstanceId);
}
tools.getParameterPage().putObject("pzRepeatProperties",repeatMap);
ClipboardProperty cpSource = tools.getProperty(".pyWorkParty");
boolean bIsSourceEmpty = false;
ClipboardPage itemPage = null;
if(cpSource.size()==0){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
bIsSourceEmpty=true;
ClipboardPage cpParentPage = cpSource.getTopLevelPage();
String dummyPageName = "";
if(tools.isValidDataPage(cpParentPage.getName())){
dummyPageName = "Dummy"+cpParentPage.getName();
}else{
dummyPageName = "Dummy_pyWorkParty";
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty(".pyWorkParty").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""),"RDL" + pyInstanceId + ":" + dummyPageName);
itemPage = tools.createPage("Data-Party",dummyPageName);
PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
simpleLayoutCell_2(1);
	pega.popStackFrame(itemFrame, false);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty(".pyWorkParty").getReference(),"",false),pyInstanceId + ":" + dummyPageName);
}
}else{
if(mode =='L' || mode =='G'){
Iterator itemPages = cpSource.iterator();
int pageCounter = 0;
while(itemPages.hasNext()) {
	pageCounter++;
	itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
	PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
	if(pageCounter == 1) {
	simpleLayoutCell_2(1);
	}
	pega.popStackFrame(itemFrame, false);
}
}}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty(".pyWorkParty").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""));
} else {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty(".pyWorkParty").getReference(),"", false));
}
cc.endComponent();
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("CaseStakeholders",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionCaseStakeholdersBB","",false);
}


public void simpleLayout_1() {
	String strRWPreActivity = "";
	strRWPreActivity = "";
	
	String strDTransform = "";
	strDTransform = "";
	pega_rules_utilities.pzRegisterActivity(tools, "ShowStream");
	boolean bGenerateNonTemplateRDL = false;
	if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled() && !bGenerateNonTemplateRDL) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	HashStringMap whenKeys= new HashStringMap();
	whenKeys.put("pxObjClass","Rule-Obj-When");
	whenKeys.put("pyClassName",tools.getPrimaryPage().getString("pxObjClass"));
	whenKeys.put("pyBlockName","pzIsRDLTemplatized");
	boolean isRDLTemplatized = tools.evaluateWhen(whenKeys);
	if(pzAuto.getUIComponentRuntime().isTemplateRendering() || isRDLTemplatized) {
	pzTemplateRDL_1();
	return;
	}
	} else {
	bGenerateNonTemplateRDL = true;
	tools.putParamValue("bGenerateNonTemplateRDL","true");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_14");
	}
	int totalRecords=0;
	tools.appendString("<div class='rdlWrapperDiv'>");
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
	tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
	tools.putParamValue("bIsWrapperAdded", "true");
	}
	tools.appendString("<div bSimpleLayout='true' " + "data-repeat-source= '");
	tools.appendString(tools.getProperty(".pyWorkParty").getReference()+ "' ");
	tools.appendString(" " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "  class=' flex content   layout-content-stacked content-stacked  ' ");
	String strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
	ClipboardProperty rdlPageListProperty = tools.getProperty(".pyWorkParty");
	String rdlPageListPropRef = ".pyWorkParty";
	if(rdlPageListProperty != null) {
	rdlPageListPropRef = rdlPageListProperty.getReference();
	}
	String rdlRefreshWhenStr = ".pyWorkParty AddDelete";
	rdlRefreshWhenStr = rdlRefreshWhenStr.replace(".pyWorkParty",rdlPageListPropRef);
	tools.appendString(" data-refresh=\"true\" data-methodName='" + strMethodName + "' data-rowmethodname='GetRDLRow_1' ");
try {
tools.appendString("RWP=\".pyWorkParty\" RW=\"");
tools.appendString(rdlRefreshWhenStr);
tools.appendString("\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201905301015540323244" ) + " ");
	tools.appendString(">");
	int index = 1;
	tools.putParamValue("bIsRDL","true");
	String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
	String rptDynamicIdx_prefix = "";
	if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
	ClipboardProperty rdlPageListProp =null;
	if (tools.getParamValue("pyPegaDesignMode").equals("true")) { return;}
	rdlPageListProp = tools.getProperty(".pyWorkParty");
	totalRecords = rdlPageListProp.size();
	Iterator itemPages = rdlPageListProp.iterator();
	while(itemPages.hasNext()) {
		ClipboardPage itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx_prefix + index);
		tools.putParamValue("pega_RLindex",rptDynamicIdx_prefix +index);
		tools.putParamValue("expandRL","true");
		index=simpleLayoutCell_2(index);
	tools.putParamValue("expandRL","false");
		pega.popStackFrame(itemFrame, false);
	}
	tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx);
	tools.putParamValue("bIsRDL","");
	tools.putParamValue("pega_RLindex","");
	tools.appendString("</div>");
	if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
	tools.appendString("</div></div>");
	tools.putParamValue("bIsWrapperAdded", "false");
	}
	tools.appendString("</div>");
	if(bGenerateNonTemplateRDL) {
	tools.getParameterPage().remove("bGenerateNonTemplateRDL");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	}
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
String paramName = "EXPANDEDSubSectionCaseStakeholdersBB";
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
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
pzSetExpandParam_2();
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


public void pxDisplayText_1() {String key="14||RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","N","false","0","","","Integer","true","14"};oCellRuntimeParamsMap.put("14||RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT",paramValues);oControlPathsMap.put("14||RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}
public String 
getUIActionsMetaData_2() {
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
	if(!pzAuto.handleEvaluateWhen(" o2!= rx.StakeholdersCount cq",".StakeholdersCount!=\'\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".StakeholdersCount",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   utils-badge dataValueRead flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxDisplayText_1();
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
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("202007010005100953567-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".StakeholdersCount");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","utils-badge");
	pgCells.put("customRWStyles","utils-badge");
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2!= rx.StakeholdersCount cq",pxUniqueStreamHash+"_6");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_6");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".StakeholdersCount!=''");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_6");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2!= rx.StakeholdersCount cq", pxUniqueStreamHash+"_6"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".StakeholdersCount",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDisplayText_1();}
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-bottom-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
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
	pgCells.put("partialClass","remove-bottom-spacing flex flex-row");
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
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!pxIsMobileDevice",null,false) && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.infinity.openStakeholdersModal(event)\"]");

		tools.appendString("]");isBehaviorAdded = true;
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pxIsMobileDevice",null,false) || com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pyUpdateWorkParties");
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
		pzPackageRuntime.packageLocalAction("pyUpdateWorkParties", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyFlexModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseStakeholders",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pyUpdateWorkParties\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"pyFlexModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		}
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!pxIsMobileDevice",null,false) && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"pega.desktop.infinity.openStakeholdersModal(event)\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pxIsMobileDevice",null,false) || com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }						{
							StringMap keyMap = new HashStringMap();
							keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
							keyMap.putString("pyActionName", "pyUpdateWorkParties");
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
							pzPackageRuntime.packageLocalAction("pyUpdateWorkParties", offlineUsingPage , strLAClassName);
							pzPackageRuntime.packageSection("pyFlexModalTemplate", offlineUsingPage , strLAClassName, true);
							}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseStakeholders",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									}
									if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
									String usingPage = "";
									if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
									if("true".equals(bHasPrivilege )) {
										tools.appendString("[\"processAction\", [\"pyUpdateWorkParties\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"pyFlexModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
										} else {
											tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
											}
											}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		}
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
	cellPage.put("automationId","");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseStakeholders_$CTX$_12");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Manage stakeholders\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Manage stakeholders", ".pyActionPrompt");
	}
	pyTooltip = "Manage stakeholders";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-gear-solid";
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
	String spxUniqueStreamHash3 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash3,pxUniqueStreamHash+"_3");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_3");
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
		 String buttonUID = "name='CaseStakeholders_"+ referenceString+ "_12'";
	 String securedPropValue = null;
		tools.appendString("<button data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!pxIsMobileDevice",null,false) && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.infinity.openStakeholdersModal(event)\"]");

		tools.appendString("]");isBehaviorAdded = true;
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pxIsMobileDevice",null,false) || com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pyUpdateWorkParties");
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
		pzPackageRuntime.packageLocalAction("pyUpdateWorkParties", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyFlexModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseStakeholders",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pyUpdateWorkParties\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"pyFlexModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;
		}
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!pxIsMobileDevice",null,false) && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"!IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"pega.desktop.infinity.openStakeholdersModal(event)\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
}
		if((com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pxIsMobileDevice",null,false) || com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"IsSecondaryAjaxContainerContext",null,false)
		)){if(isBehaviorAdded && true){ tools.appendString(","); }						{
							StringMap keyMap = new HashStringMap();
							keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
							keyMap.putString("pyActionName", "pyUpdateWorkParties");
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
							pzPackageRuntime.packageLocalAction("pyUpdateWorkParties", offlineUsingPage , strLAClassName);
							pzPackageRuntime.packageSection("pyFlexModalTemplate", offlineUsingPage , strLAClassName, true);
							}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("CaseStakeholders",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									}
									if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
									String usingPage = "";
									if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
									if("true".equals(bHasPrivilege )) {
										tools.appendString("[\"processAction\", [\"pyUpdateWorkParties\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"pyFlexModalTemplate\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
										} else {
											tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
											}
											}

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		}
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Manage stakeholders\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-gear-solid";
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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }											}


}

public void pzHeaderCellContent_1() {
tools.putSaveValue("parentLayouttype","");pxButton_1();
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionCaseStakeholdersB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='layout layout-outline layout-outline-utility' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionCaseStakeholdersB";
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
String labelName = "StakeholdersGadgetHeading";
labelName =  tools.getLocalizedTextForString(".pyCaption","StakeholdersGadgetHeading");
l_sectionTitle = labelName;
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='3' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4465' data-layout-id='202602230450280832" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><span class='header-element'><img src='webwb/stakeholder.svg'  alt= '" + sectionImageTitle + "'  title= '" + sectionImageTitle + "'  /></span><h3  class='header-title' id='headerlabel4465'>" + l_sectionTitle + "</h3>");
if(pzAuto.handleEvaluateWhen(" wxStakeholdersGearIconEnabled","StakeholdersGearIconEnabled", "cell", "visible" )){
tools.appendString("<span class='header-element header-title-table " + pzSection.getCustomStyle(false, "", "", "") + "' style='");
try {
tools.appendString("height:38px;width:105px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.appendString("'><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr></span>");
}
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionCaseStakeholdersB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash4 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash4 = getUIActionsMetaData_2();
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201907260536110116488") + " ");
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
		tools.appendString(" class='" + "flex  content  layout-content-stacked content-stacked utility" + "'  " + "role='tab' tabindex='0' " + " aria-label = '"+tools.getLocalizedTextForString(".pyCaption", StringUtils.escapeCrossScriptingFilter("Stakeholders"))+"'" );
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
		pg_dlmeta.put("skipTarget"," tabindex='0' ");
		pg_dlmeta.put("customClassName","utility");
		pg_dlmeta.put("format","stacked");
		pg_dlmeta.put("ariaRole","tab");
		pg_dlmeta.put("ariaLabel",""+tools.getLocalizedTextForString(".pyCaption", StringUtils.escapeCrossScriptingFilter("Stakeholders")));
		pg_dlmeta.put("ariaRoleType","component");
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
	public void LayoutWrapperTableEnd_1() {
	tools.appendString("</div>");
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
	String paramName = "EXPANDEDSubSectionCaseStakeholdersB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-utility");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutHeader_1();
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
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_3();
 LayoutWrapperTableEnd_1(); }
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "CaseStakeholders");
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
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("getNextPage_1", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
pzExternalMethodMapping.put("GetRDLRow_1", new String[][] { {"listSource", "String", ""},  {"index", "int", "0"}});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- CASESTAKEHOLDERS #20210506T204027.117 GMT", "Work- CaseStakeholders", "Theme-Cosmos", "04-01-01", "20230706T113320.751 GMT");
}
