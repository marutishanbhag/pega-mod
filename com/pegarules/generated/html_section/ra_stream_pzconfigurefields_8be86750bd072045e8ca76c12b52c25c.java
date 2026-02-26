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
 * Builds JSP stream RULE-HTML-SECTION!PZCONFIGUREFIELDS.
 */
public class ra_stream_pzconfigurefields_8be86750bd072045e8ca76c12b52c25c extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzConfigureFields.Rule_HTML_Section.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1523763223;
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
	public ra_stream_pzconfigurefields_8be86750bd072045e8ca76c12b52c25c(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "16c8ff5a90e6287e845599bf375cb7f79a37eec";
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
/* Instance RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "16c8ff5a90e6287e845599bf375cb7f79a37eec";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzConfigureFields",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT */
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
	"Rule-HTML-Section:PZCONFIGUREFIELDS", 
	"Rule-Obj-Property:PYLABEL", 
	"Rule-HTML-Property:PXICON"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZCONFIGUREFIELDS","Rule-HTML-Section","RULE-HTML-SECTION",false,"","Pega-ProcessArchitect","08-23-01","RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT","!PZCONFIGUREFIELDS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1523763223), 
		new DependentRuleInfo("PYLABEL","Rule-Obj-Property","@BASECLASS",true,"Rule-HTML-Section","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT","!PYLABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
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
//	RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT:20230618T001738.022 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYLABEL #20180713T131156.327 GMT:20180713T131156.327 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_2(
//	simpleLayout_5(
//	simpleLayout_1(
//	simpleLayout_3(
//	simpleLayout_4(

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
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNDATATRANSFORM--(CLIPB9514A9C33ADD6709FD6A843ADA2991DD #20220104T102659.447 GMT:20220104T102659.447 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETITEMFOCUS #20180713T133344.629 GMT:20180713T133344.629 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPAGECLASS #20190222T143815.273 GMT:20190222T143815.273 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "320b4dafe744ecda30f7e0ee6f432793";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-HTML-Section";
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
  pzSection.beginSection("pzConfigureFields",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzConfigureFields','insKey':'RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT','sectionType':'standard'}");
pzLayout_9();
pzLayout_10();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void pzLayoutBody_7() {
includeSectionBody_1();
}
public void pzLayoutBodyWrapper_10() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_7() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secParams.put("sectionName","pzConfigureFieldsInnerWrapper");
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_42","pzDisableViewWhenLabelBlank", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzGenerateViewName");
config.put("StaticActivityParams", "updateBreadCrumb=true");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzGenerateViewName");
config.put("StaticActivityParams", "updateBreadCrumb=true");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLayoutEditorSelectFieldsTab");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzSetupValidateConditions");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzClearFieldsSourceContextDataPage");
config.put("FieldSourceContext", "SpecifiedFields");
config.put("pzDataTransformStaticParams", "FieldSourceContext&ContextPageReference");
config.put("ContextPageReference", "");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzLoadPrePostProcessingTransform");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_7();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("sectionName","pzConfigureFieldsInnerWrapper");tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzDisableViewWhenLabelBlank";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_10() {
pzSection.getLayout().setExpandParam("SubSectionpzConfigureFieldsBBBBBBB","",false);
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
String paramName = "EXPANDEDSubSectionpzConfigureFieldsBBBBBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pzDisableViewWhenLabelBlank'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","2");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutBody_7();
containerComponent.endComponent();
}
public void pzLayout_10() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pzDisableViewWhenLabelBlank'}") + ">");
}
pzSetExpandParam_10();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_10();
}
if(bWrapIncSection){
tools.appendString("</span>");
}if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_7();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_6() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
}
public void pzLayoutBodyWrapper_9() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_5() {
tools.putParamValue("LAYOUT_METHOD_NAME","layoutGroup_1");layoutGroup_1();layoutBody_2();
}
public void pzLayoutBodyWrapper_8() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";if(!pzAuto.isMobile()) { clsScroll = "container-scroll";}tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","layoutGroup_1");layoutGroup_1();layoutBody_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_2() { 
tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUTGROUP",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)") + "  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 
public void pzLayoutHeader_3() {
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
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pre/Post Processing");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h2");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzConfigureFieldsBBBBBB"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Pre/Post Processing", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","Pre/Post Processing");
	metadataPage.put("uniqueid", "202602230444360467");
	metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("202212141111540724615") + " ");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_4(String lazyLoadToken) {
	if("deferLoad".equals(lazyLoadToken)) {
	if( "true".equals( tools.getParamValue("isActiveLayout") ) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))) {tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();}
	}else {
	Map<String, Object> loadingSectionInfo = new HashMap<String, Object>();
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_39", "pyLoadingMessage", loadingSectionInfo);
	}
	}
public void pzLayoutBodyWrapper_7() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body' tabindex='0' role='tabpanel'");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))){
tools.appendString(" data-deferinvoke='simpleLayout_4'");
}
tools.appendString(">");
if( "true".equals( tools.getParamValue("isActiveLayout") ) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))) {tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_6() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_6();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_6() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","pyTempFlowAction");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_37","pzConfigurePreAndPostProcessing", secInfo);
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
	String sectionName = "pzConfigurePreAndPostProcessing"; 
	String usingPage = null;
	usingPage = "pyTempFlowAction";
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
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionCellpzConfigureFields449","",false);
}
public void pzLayout_6() {
pzSetExpandParam_9();
pzLayoutBodyWrapper_6();
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","pyTempFlowAction");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_34","pzConfigurePreAndPostProcessing", secInfo);
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
	String sectionName = "pzConfigurePreAndPostProcessing"; 
	String usingPage = null;
	usingPage = "pyTempFlowAction";
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
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzConfigurePreAndPostProcessing",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
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
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing flex flex-row");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzConfigurePreAndPostProcessing",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_6();
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
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionpzConfigureFieldsBBBBBB","",true);
}

 public void pzHeaderBody_5(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230444360462" + rptDynamicIndex + "'");
if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
	tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
	String l_sectionTitleReference="";
	String l_sectionTitleType="";
	String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pre/Post Processing");
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
		tools.appendString(l_sectionTitle);
		}
	tools.appendString("'");
	} else {
		tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pre/Post Processing");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("'");
			if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			tools.appendString(" data-defer='true'");
			}
		}
		tools.appendString("><h2  aria-level='2' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
		String l_sectionTitleReference="";
		String l_sectionTitleType="";
		String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pre/Post Processing");
		if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
			tools.appendString(l_sectionTitle);
			}
			tools.appendString("</h2>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
			}
			
 public void pzHeaderBody_6(){ 
			String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
			String strSaveTextValue="";String l_sectionTitle="";
			String l_sectionTitleFVMeta = "";
			l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
			l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pre/Post Processing");
			String sectionImageTitle="";
			sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
			

	/***-- Grid HeaderElements: Begin --**/
			tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel2868' data-layout-id='202602230444360462" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel2868'>" + l_sectionTitle + "</h2><nobr>");
			pzHeaderCellContent_1();
			tools.appendString("</nobr>");
			boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
			tools.appendString("<span class='header-element header-title-table'>");
			if(showContainerIcons){
			tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
			}
			if(showContainerIcons){
			pzLayout.includeHeaderIcon("SubSectionpzConfigureFieldsBBBBBB","tdRightStyle");}
			if(showContainerIcons){
			tools.appendString("</tr></table>");
			}
			tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
			
	 /***Grid HeaderElements: End ***/

			}
			

public void simpleLayout_4() {
				char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
				char currentTemplatingStatus = 'Y';
				if(!tools.getParamValue("UITemplatingStatus").equals("N")){
				currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
				} else{
				currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
				}
				if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
				ParameterPage newParamsPage = new ParameterPage();
				String strPropertyValue="";
				String[] arReturn;
				strPropertyValue="TempPlaceHolder";
				arReturn = new String[2];
				if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"TempPlaceHolder",arReturn)){
				strPropertyValue = arReturn[0];
				}else {
				strPropertyValue = "";
				}
				newParamsPage.putString("pyTempPlaceHolder", strPropertyValue);
				newParamsPage.putString("pyTempPlaceHolder", "TempPlaceHolder");
				HashStringMap keys = new HashStringMap();
				keys.putString("pxObjClass", "Rule-Obj-Activity");
				keys.putString("pyClassName",  tools.getStepPage().getString("pxObjClass") );
				keys.putString("pyActivityName", "pzLoadPrePostProcessingTransform");
				try{
				tools.doActivity(keys, tools.getStepPage(), newParamsPage);
				}catch(RuleNotFoundException e){
				oLog.error("Unable to find Defer load activity"+e.getMessage());
				}catch(Exception e){
				oLog.error("Error calling defer load activity"+e.getMessage());
				}
				}
				String spxUniqueStreamHash33 = "";
				if(currentTemplatingStatus != 'N'){
				spxUniqueStreamHash33 = getUIActionsMetaData_1();
				if(spxUniqueStreamHash33 != null && !"".equals(spxUniqueStreamHash33)){
				pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash33,pxUniqueStreamHash+"_33");
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
				pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("202212141111540724615") + " ");
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
					tools.appendString(" class='" + "flex  content  layout-content-default content-default " + "'  ");
					if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
					tools.appendString(" ");
					}
					tools.appendString(" " + refreshAttributes + ">");
					}else {
					String expressionId = null;
					com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
					pg_dlmeta.put("RWActive",false);
					if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash33 != null && !"".equals(spxUniqueStreamHash33)){
					pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_33");
					}
					if(!StringUtils.isBlank(expressionId)) {
					pg_dlmeta.put("pyExpressionId",expressionId);
					}
					if(!"".equals(strMethodName))
					pg_dlmeta.put("methodnm",strMethodName);
					pg_dlmeta.put("format","default");
					pg_dlmeta.put("isDLChild","true");
					pg_dlmeta.put("isLGChild","true");
					pg_dlmeta.put("clear","false");
					pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
					cc_dl.forceReload();
					cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
					}
					int index = 1;
					if(currentTemplatingStatus != 'Y') {
					index=simpleLayoutCell_6(index);
	}else{
					index=simpleLayoutTemplateCell_6(index);
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
				public void pzLayoutContainer_4(String methodName) {
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
				String paramName = "EXPANDEDSubSectionpzConfigureFieldsBBBBBB";
				metadataPage.put("paramName", paramName);
				String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
				if(!inspectorLayoutData.isEmpty()) {
				metadataPage.put("liveUI", inspectorLayoutData);
				}
				String pyPrefix = null;
				if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
				if(!"true".equals(tools.getParamValue("isActiveLayout")))
				metadataPage.put("methodnm", "simpleLayout_4");
				}
				metadataPage.put("sectionIndex","23");
				IUIComponent containerComponent = pzAuto.getUIComponent();
				com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
				boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2!= rx.pySkipFlowActionCreation cttrue", pxUniqueStreamHash+"_38");metadataPage.put("dlChild","true");
				metadataPage.put("lgChild","true");
				metadataPage.put("lMode","Flexbox");
				if("".equals(methodName)) {
				containerComponent.forceReload();
				}
				IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
				pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_38");
				metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
				containerComponent.beginComponent("pxLayoutContainer",metadataPage);
				if(pyVisibility) {
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
				methodName = "";
				}
				pzLayoutHeader_3();
				pzLayoutBody_4("".equals(methodName) ? "deferLoad" : "");
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
if(pzAuto.handleEvaluateWhen(" o2!= rx.pySkipFlowActionCreation cttrue",".pySkipFlowActionCreation!=true", "layout", "visible" )) {pzSetExpandParam_8();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_5();
pzLayoutBodyWrapper_7();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
if("true".equals(tools.getParamValue("isActiveLayout")))
pzLayoutContainer_4("");
else
pzLayoutContainer_4("pzLayoutContainer_4");
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutHeader_2() {
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
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Validations");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h2");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	metadataPage.put("LGBehaviorPropertiesCount"," data-click='.'");
	metadataPage.put("LGActionString",getUIActionsMetaData_5());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzConfigureFieldsBBBBB"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Validations", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","Validations");
	metadataPage.put("uniqueid", "202602230444360457");
	metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("20180417154659062555") + " ");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_3(String lazyLoadToken) {
	if("deferLoad".equals(lazyLoadToken)) {
	if( "true".equals( tools.getParamValue("isActiveLayout") ) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))) {tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();}layoutBody_1();
	}else {
	Map<String, Object> loadingSectionInfo = new HashMap<String, Object>();
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_30", "pyLoadingMessage", loadingSectionInfo);
	}
	}
public void pzLayoutBodyWrapper_5() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))){
tools.appendString(" data-deferinvoke='simpleLayout_3'");
}
tools.appendString(">");
if( "true".equals( tools.getParamValue("isActiveLayout") ) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))) {tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();}layoutBody_1();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_4();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","ValidatePage");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_28","pzConditionsContainer", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
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
	String sectionName = "pzConditionsContainer"; 
	String usingPage = null;
	usingPage = "ValidatePage";
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
pzSection.getLayout().setExpandParam("SubSectionCellpzConfigureFields999","",false);
}
public void pzLayout_4() {
pzSetExpandParam_7();
pzLayoutBodyWrapper_4();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","ValidatePage");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_25","pzConditionsContainer", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
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
	String sectionName = "pzConditionsContainer"; 
	String usingPage = null;
	usingPage = "ValidatePage";
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
getUIActionsMetaData_5() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzClearFieldsSourceContextDataPage");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzClearFieldsSourceContextDataPage\", \"FieldSourceContext=SpecifiedFields");
			actionRequestD.registerFixedParameter("FieldSourceContext","SpecifiedFields");
			tools.appendString("&ContextClass=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");			tools.appendString("&ContextPageReference=");
			actionRequestD.registerFixedParameter("ContextPageReference","");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzClearFieldsSourceContextDataPage");
			}
				pzAuto.registerActionRequest(actionRequest);
				}
				tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
		}}catch(Exception e){}				String returnString = actionsStringBuilder.toString();
				tools.popStreamBody();
				return returnString;
			}


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzConditionsContainer",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzConditionsContainer",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionpzConfigureFieldsBBBBB","",true);
}

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230444360439" + rptDynamicIndex + "'");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
	com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
	actionRequestD.registerFixedParameter("pyModelName","pzClearFieldsSourceContextDataPage");
		String usingPageString = "";
		usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
		tools.appendString("[\"runDataTransform\", [\"pzClearFieldsSourceContextDataPage\", \"FieldSourceContext=SpecifiedFields");
		actionRequestD.registerFixedParameter("FieldSourceContext","SpecifiedFields");
		tools.appendString("&ContextClass=");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");		tools.appendString("&ContextPageReference=");
		actionRequestD.registerFixedParameter("ContextPageReference","");
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
		pzPackageRuntime.packageDataTransform(contextClass, "pzClearFieldsSourceContextDataPage");
		}
			pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
		}}catch(Exception e){}			if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
				tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
				String l_sectionTitleReference="";
				String l_sectionTitleType="";
				String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Validations");
				if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
					tools.appendString(l_sectionTitle);
					}
				tools.appendString("'");
				} else {
					tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
					String l_sectionTitleReference="";
					String l_sectionTitleType="";
					String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Validations");
					if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
						tools.appendString(l_sectionTitle);
						}
						tools.appendString("'");
						if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
						tools.appendString(" data-defer='true'");
						}
					}
					tools.appendString("><h2  data-click='.' aria-level='2' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
					String l_sectionTitleReference="";
					String l_sectionTitleType="";
					String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Validations");
					if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
						tools.appendString(l_sectionTitle);
						}
						tools.appendString("</h2>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
						}
						
 public void pzHeaderBody_4(){ 
						String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
						String strSaveTextValue="";String l_sectionTitle="";
						String l_sectionTitleFVMeta = "";
						l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
						l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Validations");
						String sectionImageTitle="";
						sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
						

	/***-- Grid HeaderElements: Begin --**/
						tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4240' data-layout-id='202602230444360439" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel4240'>" + l_sectionTitle + "</h2><nobr>");
						pzHeaderCellContent_1();
						tools.appendString("</nobr>");
						boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
						tools.appendString("<span class='header-element header-title-table'>");
						if(showContainerIcons){
						tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
						}
						if(showContainerIcons){
						pzLayout.includeHeaderIcon("SubSectionpzConfigureFieldsBBBBB","tdRightStyle");}
						if(showContainerIcons){
						tools.appendString("</tr></table>");
						}
						tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");
						
	 /***Grid HeaderElements: End ***/

						}
						

public void simpleLayout_3() {
							char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
							char currentTemplatingStatus = 'Y';
							if(!tools.getParamValue("UITemplatingStatus").equals("N")){
							currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
							} else{
							currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
							}
							if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
							ParameterPage newParamsPage = new ParameterPage();
							String strPropertyValue="";
							String[] arReturn;
							strPropertyValue="<pyDeferLoadRetrievalActivityParams/>";
							arReturn = new String[2];
							if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"<pyDeferLoadRetrievalActivityParams/>",arReturn)){
							strPropertyValue = arReturn[0];
							}else {
							strPropertyValue = "";
							}
							newParamsPage.putString("pxObjClass", strPropertyValue);
							newParamsPage.putString("pyTempPlaceHolder", "TempPlaceHolder");
							HashStringMap keys = new HashStringMap();
							keys.putString("pxObjClass", "Rule-Obj-Activity");
							keys.putString("pyClassName",  tools.getStepPage().getString("pxObjClass") );
							keys.putString("pyActivityName", "pzSetupValidateConditions");
							try{
							tools.doActivity(keys, tools.getStepPage(), newParamsPage);
							}catch(RuleNotFoundException e){
							oLog.error("Unable to find Defer load activity"+e.getMessage());
							}catch(Exception e){
							oLog.error("Error calling defer load activity"+e.getMessage());
							}
							}
							String spxUniqueStreamHash23 = "";
							if(currentTemplatingStatus != 'N'){
							spxUniqueStreamHash23 = getUIActionsMetaData_5();
							if(spxUniqueStreamHash23 != null && !"".equals(spxUniqueStreamHash23)){
							pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash23,pxUniqueStreamHash+"_23");
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
							refreshAttributes += " RWP=\".pyEmbeddedFields.pyLabel\" RW=\".pyEmbeddedFields.pyLabel Changes\" ";
							
							String strDTransform = "";
							strDTransform = "";
							try{
								if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
									com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
									changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyEmbeddedFields.pyLabel"), -1);
								}
							}catch(Exception e){}
							IUIComponent cc_dl = null;
							cc_dl = pzAuto.getUIComponent();
							IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
							pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("20180417154659062555") + " ");
							String subscriptionID = null;
							String ackEnabled = null;
							if(currentTemplatingStatus != 'Y'){
								tools.appendString("<div bSimpleLayout='true' ");
								if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
								tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
								}
								tools.appendString(" class='" + " content  layout-content-default content-default  clearfix" + "'  ");
								if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
								tools.appendString(" ");
								}
								tools.appendString(" " + refreshAttributes + ">");
								}else {
								String expressionId = null;
								com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
								expressionId = pxUniqueStreamHash+"_24";
								try{
								expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  ".pyEmbeddedFields.pyLabel Changes", expressionId);
								expressionId = expression.getId();
								}
								catch(ClassCastException e){
								expressionId = "";
								}
								pg_dlmeta.put("RWActive",false);
								if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash23 != null && !"".equals(spxUniqueStreamHash23)){
								pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_23");
								}
								if(!StringUtils.isBlank(expressionId)) {
								pg_dlmeta.put("pyExpressionId",expressionId);
								}
								if(!"".equals(strMethodName))
								pg_dlmeta.put("methodnm",strMethodName);
								pg_dlmeta.put("class","clearfix");
								pg_dlmeta.put("format","default");
								pg_dlmeta.put("isFlex","false");
								pg_dlmeta.put("isLGChild","true");
								pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
								cc_dl.forceReload();
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
							public void pzLayoutContainer_3(String methodName) {
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
							String paramName = "EXPANDEDSubSectionpzConfigureFieldsBBBBB";
							metadataPage.put("paramName", paramName);
							String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
							if(!inspectorLayoutData.isEmpty()) {
							metadataPage.put("liveUI", inspectorLayoutData);
							}
							String pyPrefix = null;
							if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
							if(!"true".equals(tools.getParamValue("isActiveLayout")))
							metadataPage.put("methodnm", "simpleLayout_3");
							}
							metadataPage.put("sectionIndex","15");
							IUIComponent containerComponent = pzAuto.getUIComponent();
							com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
							boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2&& o1! wxpzIsReviewConfigureView o2!= rx.pySkipFlowActionCreation cttrue o1! rx.pyUnsupported", pxUniqueStreamHash+"_29");metadataPage.put("dlChild","true");
							metadataPage.put("lgChild","true");
							metadataPage.put("lMode","Inline-block");
							if("".equals(methodName)) {
							containerComponent.forceReload();
							}
							IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
							pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_29");
							metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
							containerComponent.beginComponent("pxLayoutContainer",metadataPage);
							if(pyVisibility) {
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
							methodName = "";
							}
							pzLayoutHeader_2();
							pzLayoutBody_3("".equals(methodName) ? "deferLoad" : "");
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
if(pzAuto.handleEvaluateWhen(" o2&& o2&& o1! wxpzIsReviewConfigureView o2!= rx.pySkipFlowActionCreation cttrue o1! rx.pyUnsupported","! pzIsReviewConfigureView && .pySkipFlowActionCreation!=true && ! .pyUnsupported", "layout", "visible" )) {pzSetExpandParam_6();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_3();
pzLayoutBodyWrapper_5();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
if("true".equals(tools.getParamValue("isActiveLayout")))
pzLayoutContainer_3("");
else
pzLayoutContainer_3("pzLayoutContainer_3");
tools.putParamValue("pyInlineStyleSec","");
}
}
public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzConfigureFields",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "pzFieldsEntryScreen");
						refreshActionRequest.registerFixedParameter("PreActivity", "pzLayoutEditorSelectFieldsTab");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&PreActivity=pzLayoutEditorSelectFieldsTab");
						tools.appendString("[\"refresh\", [\"thisSection\",\"pzFieldsEntryScreen\", \"pzLayoutEditorSelectFieldsTab\", \"");
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
		}								String returnString = actionsStringBuilder.toString();
								tools.popStreamBody();
								return returnString;
							}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
String l_sectionTitleReference="";
String l_sectionTitleType="";
String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Fields");
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString(l_sectionTitle);
	}
	metadataPage.put("isActiveLayout", tools.getParamValue("isActiveLayout"));
	if(!"".equals(l_sectionTitle))metadataPage.put("title", l_sectionTitle);
	metadataPage.put("headingLevel", "h2");
	metadataPage.put("layoutHeaderKey", tools.getParamValue("pzAKey"));
	metadataPage.put("LGBehaviorPropertiesCount"," data-click='.'");
	metadataPage.put("LGActionString",getUIActionsMetaData_4());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", "pyActionPrompt");
	metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpzConfigureFieldsBBBB"));
	String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	if(!"".equals(sectionTitleFVMeta)){
	metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Fields", "pyCaption");
	String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(inspectorFVData)){
	metadataPage.put("fieldValueInspectorData",inspectorFVData);
	}
	metadataPage.put("title","Fields");
	metadataPage.put("uniqueid", "202602230444360434");
	metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("201804171546590625309") + " ");
	headerComponent.beginComponent("pxLayoutHeader",metadataPage);
	headerComponent.endComponent();
	}
	public void pzLayoutBody_2() {
	tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();layoutBody_1();
	}
public void pzLayoutBodyWrapper_3() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix' tabindex='0' role='tabpanel'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();layoutBody_1();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}


public void layoutBody_1() { 
tools.appendString("<table role='presentation'   cellpadding='0' cellspacing='0' ID='' width='100%'>\n\t\t\t\t\t\t\t</table>");
 } 
public void pzLayoutBodyWrapper_2() {
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_20","pzConfigureFieldsInnerWrapper", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
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
	String sectionName = "pzConfigureFieldsInnerWrapper"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellpzConfigureFields810","",false);
}
public void pzLayout_2() {
pzSetExpandParam_5();
pzLayoutBodyWrapper_2();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_17","pzConfigureFieldsInnerWrapper", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
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
	String sectionName = "pzConfigureFieldsInnerWrapper"; 
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
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
				refreshActionRequest.registerFixedParameter("SectionName", "pzFieldsEntryScreen");
				refreshActionRequest.registerFixedParameter("PreActivity", "pzLayoutEditorSelectFieldsTab");
				staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
				staticURLStr.append("&PreActivity=pzLayoutEditorSelectFieldsTab");
				tools.appendString("[\"refresh\", [\"thisSection\",\"pzFieldsEntryScreen\", \"pzLayoutEditorSelectFieldsTab\", \"");
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
		}						String returnString = actionsStringBuilder.toString();
						tools.popStreamBody();
						return returnString;
					}


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzConfigureFieldsInnerWrapper",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzConfigureFieldsInnerWrapper",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
public void pzHeaderCellContent_1() {
}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzConfigureFieldsBBBB","",true);
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String l_layoutTitleFVMeta = "";
l_layoutTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
tools.appendString("<div class='header' role='tab' bSimpleLayout='true' " + l_layoutTitleFVMeta + "' data-layout-id='202602230444360427" + rptDynamicIndex + "'");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
		com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
			StringBuffer staticURLStr = new StringBuffer();
			StringBuffer preActParamStr = new StringBuffer();
			StringBuffer preDTParamStr = new StringBuffer();
			String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
			tools.putParamValue("runTimeSecStreamName", "");
			refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
			refreshActionRequest.registerFixedParameter("SectionName", "pzFieldsEntryScreen");
			refreshActionRequest.registerFixedParameter("PreActivity", "pzLayoutEditorSelectFieldsTab");
			staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
			staticURLStr.append("&PreActivity=pzLayoutEditorSelectFieldsTab");
			tools.appendString("[\"refresh\", [\"thisSection\",\"pzFieldsEntryScreen\", \"pzLayoutEditorSelectFieldsTab\", \"");
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
		}					if( "true".equals( tools.getParamValue("isActiveLayout") ) ) {
						tools.appendString("tabindex='0' aria-selected='true'  aria-label='");
						String l_sectionTitleReference="";
						String l_sectionTitleType="";
						String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Fields");
						if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
							tools.appendString(l_sectionTitle);
							}
						tools.appendString("'");
						} else {
							tools.appendString("tabindex='-1' aria-selected='false' aria-label='");
							String l_sectionTitleReference="";
							String l_sectionTitleType="";
							String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Fields");
							if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
								tools.appendString(l_sectionTitle);
								}
							tools.appendString("'");
							}
							tools.appendString("><h2  data-click='.' aria-level='2' class='layout-group-item-title' ><i class='icon icon-openclose'></i>");
							String l_sectionTitleReference="";
							String l_sectionTitleType="";
							String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Fields");
							if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
								tools.appendString(l_sectionTitle);
								}
								tools.appendString("</h2>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
								}
								
 public void pzHeaderBody_2(){ 
								String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
								String strSaveTextValue="";String l_sectionTitle="";
								String l_sectionTitleFVMeta = "";
								l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
								l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Fields");
								String sectionImageTitle="";
								sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");
								

	/***-- Grid HeaderElements: Begin --**/
								tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel4773' data-layout-id='202602230444360427" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel4773'>" + l_sectionTitle + "</h2><nobr>");
								pzHeaderCellContent_1();
								tools.appendString("</nobr>");
								boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
								tools.appendString("<span class='header-element header-title-table'>");
								if(showContainerIcons){
								tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
								}
								if(showContainerIcons){
								pzLayout.includeHeaderIcon("SubSectionpzConfigureFieldsBBBB","tdRightStyle");}
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
									String spxUniqueStreamHash16 = "";
									if(currentTemplatingStatus != 'N'){
									spxUniqueStreamHash16 = getUIActionsMetaData_3();
									if(spxUniqueStreamHash16 != null && !"".equals(spxUniqueStreamHash16)){
									pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash16,pxUniqueStreamHash+"_16");
									}
									}
									String refreshAttributes = "";
									String strMethodName = "";
									IUIComponent cc_dl = null;
									cc_dl = pzAuto.getUIComponent();
									IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
									pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201804171546590625309") + " ");
									String subscriptionID = null;
									String ackEnabled = null;
									if(currentTemplatingStatus != 'Y'){
										tools.appendString("<div bSimpleLayout='true' ");
										if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
										tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
										}
										tools.appendString(" class='" + " content  layout-content-default content-default  clearfix" + "'  ");
										if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
										tools.appendString(" ");
										}
										tools.appendString(" " + refreshAttributes + ">");
										}else {
										String expressionId = null;
										com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
										pg_dlmeta.put("RWActive",false);
										if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash16 != null && !"".equals(spxUniqueStreamHash16)){
										pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_16");
										}
										if(!StringUtils.isBlank(expressionId)) {
										pg_dlmeta.put("pyExpressionId",expressionId);
										}
										if(!"".equals(strMethodName))
										pg_dlmeta.put("methodnm",strMethodName);
										pg_dlmeta.put("class","clearfix");
										pg_dlmeta.put("format","default");
										pg_dlmeta.put("isFlex","false");
										pg_dlmeta.put("isLGChild","true");
										pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
										cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
										}
										int index = 1;
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
									String paramName = "EXPANDEDSubSectionpzConfigureFieldsBBBB";
									metadataPage.put("paramName", paramName);
									String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
									if(!inspectorLayoutData.isEmpty()) {
									metadataPage.put("liveUI", inspectorLayoutData);
									}
									String pyPrefix = null;
									metadataPage.put("sectionIndex","7");
									IUIComponent containerComponent = pzAuto.getUIComponent();
									metadataPage.put("dlChild","true");
									metadataPage.put("lgChild","true");
									metadataPage.put("lMode","Inline-block");
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
pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");

pzHeaderBody_1();
pzLayoutBodyWrapper_3();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
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
	pyLGInspectorData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
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
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");labelName = "";
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
	tools.appendString("' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)") + " data-lg-child-id='1' data-refreshOnClick='false' class='layout");
	if( index == 1) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "' >");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	pyLGInspectorData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("LGCellIndex","2");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& o2&& o1! wxpzIsReviewConfigureView o2!= rx.pySkipFlowActionCreation cttrue o1! rx.pyUnsupported",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","! pzIsReviewConfigureView && .pySkipFlowActionCreation!=true && ! .pyUnsupported");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-HTML-Section");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& o2&& o1! wxpzIsReviewConfigureView o2!= rx.pySkipFlowActionCreation cttrue o1! rx.pyUnsupported", pxUniqueStreamHash+"_22"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_5();
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
	return index;
}


public int layoutGroupCell_2( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& o2&& o1! wxpzIsReviewConfigureView o2!= rx.pySkipFlowActionCreation cttrue o1! rx.pyUnsupported","! pzIsReviewConfigureView && .pySkipFlowActionCreation!=true && ! .pyUnsupported","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)") + " data-lg-child-id='2' data-refreshOnClick='false' class='layout");
	if( index == 2) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "' >");
	pzLayout_5();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	pyLGInspectorData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isLG","true");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("lgClass",pyLGCustomClass);
	pgCells.put("lgInspectorData",pyLGInspectorData);
	pgCells.put("LGCellIndex","3");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2!= rx.pySkipFlowActionCreation cttrue",pxUniqueStreamHash+"_32");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_32");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".pySkipFlowActionCreation!=true");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-HTML-Section");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_32");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2!= rx.pySkipFlowActionCreation cttrue", pxUniqueStreamHash+"_32"); 
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
	return index;
}


public int layoutGroupCell_3( int index, int numVisibleLayouts ) {
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2!= rx.pySkipFlowActionCreation cttrue",".pySkipFlowActionCreation!=true","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pzSection.getLayout().getInspectorData("DYNAMICLAYOUT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)") + " data-lg-child-id='3' data-refreshOnClick='false' class='layout");
	if( index == 3) {
		tools.appendString(" active multiactive");
		tools.putParamValue("isActiveLayout","true");
	} else {
		tools.putParamValue("isActiveLayout","false");
	}
	tools.appendString(" count-" + numVisibleLayouts + "' >");
	pzLayout_7();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzConfigureFieldsBBB","",false);
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
			tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " data-lg-id='LGLayoutGrouppzConfigureFieldsS3' role= 'tablist'  class='" + classTabFlow + " content content-layout-group layout-group-tab count-1 edit-fields-tabs' data-lg-options='{\"swipe\":\"false\"}'>");
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
			tools.appendString("<div class='layout-group-nav' tabindex='0'' data-layout-id='202602230444360422" + rptDynamicIndex + "'aria-haspopup='true' role='menuitem'><h2 class='layout-group-nav-title' ><i class='icon icon-openclose'></i>");
			}
			int defaultIndexActiveLayout= 0;
			int numVisibleLayouts = 0;
			boolean isActiveLayout = false;
			int prioritizedActiveLayout = 0;
			List<Integer> notVisibleLayoutsList = new ArrayList<Integer>();
			int flagAnyActiveWhenState = 0;
			ArrayList activeWhenList = new ArrayList<String>();
			String sectionName = "LayoutGrouppzConfigureFieldsS3";
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
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("hasMessages", pxUniqueStreamHash+"_12");
			pxWhenIdentifiersForActiveWhen.put("pyLGActiveWhenId",pxUniqueStreamHash+"_12");
			pg_layoutGroupMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForActiveWhen);
			activeWhenList.add("1;EXP="+pxUniqueStreamHash+"_12");
			isActiveLayout=pzAuto.handleEvaluateWhen(" wxhasMessages","hasMessages","cell", "visible" ); 
			if(flagAnyActiveWhenState == 0 || flagAnyActiveWhenState == 2) { if(isActiveLayout) {
			  flagAnyActiveWhenState = 1;  indexActiveLayout = 1; 
			}else flagAnyActiveWhenState = 2; }
			if(defaultIndexActiveLayout==0 && isActiveLayout){
				defaultIndexActiveLayout= 1;prioritizedActiveLayout = 1;
			} else { if(!isActiveLayout){ if(defaultIndexActiveLayout == 0 || defaultIndexActiveLayout == expandedGrpIdIndex){defaultIndexActiveLayout = expandedGrpIdIndex;} else {defaultIndexActiveLayout= 1;} if(expandedGrpIdIndex==1 && 1==1) defaultIndexActiveLayout = 0; } else if(prioritizedActiveLayout == 0 || indexExpAccordian!=null){ prioritizedActiveLayout = 1; defaultIndexActiveLayout= 1;} else defaultIndexActiveLayout= 1; }
			if((isActiveLayout && indexActiveLayout== 0) || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 1)) { 
				indexActiveLayout= 1;
				if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
				String l_sectionTitleReference="";
				String l_sectionTitleType="";
				String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Fields");
				if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
					tools.appendString(l_sectionTitle);
					}
					if(!"".equals(l_sectionTitle))
					pg_layoutGroupMeta.put("title",l_sectionTitle);
					}
				}
				isActiveLayout=false;
				if(pzAuto.handleEvaluateWhen(" o2&& o2&& o1! wxpzIsReviewConfigureView o2!= rx.pySkipFlowActionCreation cttrue o1! rx.pyUnsupported","! pzIsReviewConfigureView && .pySkipFlowActionCreation!=true && ! .pyUnsupported","cell", "visible" )) 
				{
					if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
						defaultIndexActiveLayout= 2; /*if(2 != 1) prioritizedActiveLayout = 2;*/
					} else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
					if(isActiveLayout && indexActiveLayout== 0 || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 2)) {
						indexActiveLayout = 2;
						if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
						String l_sectionTitleReference="";
						String l_sectionTitleType="";
						String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Validations");
						if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
							tools.appendString(l_sectionTitle);
							}
							if(!"".equals(l_sectionTitle))
							pg_layoutGroupMeta.put("title",l_sectionTitle);
							}
						}
						numVisibleLayouts++;
						} else if(expandedGrpId != null && expandedGrpId.length()!= 0 && (expandedGrpIdIndex == 2 || (indexExpAccordian!= null &&  Arrays.asList(indexExpAccordian).contains("2")))) { 
							if(indexExpAccordian!= null){ indexExpAccordian = (String[])org.apache.commons.lang.ArrayUtils.removeElement(indexExpAccordian, "2"); if(indexExpAccordian.length == 0) expandedGrpId = null;}
							else{expandedGrpId = null; } if(expandedGrpIdIndex == 2) prioritizedActiveLayout = 1; notVisibleLayoutsList.add(2);
						} else { if(expandedGrpId != null && expandedGrpId.length() != 0 && 2!=1){ if(expandedGrpIdIndex != 2){ if(flagAnyActiveWhenState != 1){ prioritizedActiveLayout = expandedGrpIdIndex;}else{prioritizedActiveLayout = indexActiveLayout;} }else prioritizedActiveLayout = 1; /* case if expand index is same with non visible index */ }else{ if(expandedGrpIdIndex != 2 ) {if(flagAnyActiveWhenState != 1){ prioritizedActiveLayout = expandedGrpIdIndex; if(defaultIndexActiveLayout == 0)defaultIndexActiveLayout = expandedGrpIdIndex;}else{ prioritizedActiveLayout = indexActiveLayout; if(defaultIndexActiveLayout == 0)defaultIndexActiveLayout = indexActiveLayout;}}else  {prioritizedActiveLayout = 3;}} notVisibleLayoutsList.add(2); }
						isActiveLayout=false;
						if(pzAuto.handleEvaluateWhen(" o2!= rx.pySkipFlowActionCreation cttrue",".pySkipFlowActionCreation!=true","cell", "visible" )) 
						{
							if((expandedGrpId == "" || expandedGrpId == null) && defaultIndexActiveLayout==0){
								defaultIndexActiveLayout= 3; /*if(3 != 1) prioritizedActiveLayout = 3;*/
							} else {if(prioritizedActiveLayout == 0) defaultIndexActiveLayout = expandedGrpIdIndex;}
							if(isActiveLayout && indexActiveLayout== 0 || (prioritizedActiveLayout == 0 && expandedGrpId != null && expandedGrpId.length()!= 0 && expandedGrpIdIndex == 3)) {
								indexActiveLayout = 3;
								if(!"menu".equalsIgnoreCase(LGType) && !("".equalsIgnoreCase(LGType))){
								String l_sectionTitleReference="";
								String l_sectionTitleType="";
								String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pre/Post Processing");
								if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
									tools.appendString(l_sectionTitle);
									}
									if(!"".equals(l_sectionTitle))
									pg_layoutGroupMeta.put("title",l_sectionTitle);
									}
								}
								numVisibleLayouts++;
								} else if(expandedGrpId != null && expandedGrpId.length()!= 0 && (expandedGrpIdIndex == 3 || (indexExpAccordian!= null &&  Arrays.asList(indexExpAccordian).contains("3")))) { 
									if(indexExpAccordian!= null){ indexExpAccordian = (String[])org.apache.commons.lang.ArrayUtils.removeElement(indexExpAccordian, "3"); if(indexExpAccordian.length == 0) expandedGrpId = null;}
									else{expandedGrpId = null; } if(expandedGrpIdIndex == 3) prioritizedActiveLayout = 1; notVisibleLayoutsList.add(3);
								} else { if(expandedGrpId != null && expandedGrpId.length() != 0 && 3!=1){ if(expandedGrpIdIndex != 3){ if(flagAnyActiveWhenState != 1){ prioritizedActiveLayout = expandedGrpIdIndex;}else{prioritizedActiveLayout = indexActiveLayout;} }else prioritizedActiveLayout = 1; /* case if expand index is same with non visible index */ }else{ if(expandedGrpIdIndex != 3 ) {if(flagAnyActiveWhenState != 1){ prioritizedActiveLayout = expandedGrpIdIndex; if(defaultIndexActiveLayout == 0)defaultIndexActiveLayout = expandedGrpIdIndex;}else{ prioritizedActiveLayout = indexActiveLayout; if(defaultIndexActiveLayout == 0)defaultIndexActiveLayout = indexActiveLayout;}}else  {prioritizedActiveLayout = 4;}} notVisibleLayoutsList.add(3); }
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
										String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Fields");
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
											String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Validations");
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
												String l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Pre/Post Processing");
												if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
													tools.appendString(l_sectionTitle);
													}
													if(!"".equals(l_sectionTitle))
													pg_layoutGroupMeta.put("title",l_sectionTitle);
												}
											}
											numVisibleLayouts+=1;
											if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
												tools.appendString("</h2></div>");
												}
												List<Integer> visibleLayoutsListInAccordion = new ArrayList<Integer>();
												if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
													pg_layoutGroupMeta.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "");
													if(!repeatSelected.isEmpty()){
													org.json.simple.JSONObject JSONRepeatObj = new org.json.simple.JSONObject(repeatSelected);
													pg_layoutGroupMeta.put("lgActiveMap",JSONRepeatObj.toString());
													}
													pg_layoutGroupMeta.put("labelJSP","false");
													pg_layoutGroupMeta.put("tabGrpId","pzConfigureFieldsS3");
													pg_layoutGroupMeta.put("format","tab");
													pg_layoutGroupMeta.put("nVisibleLayout","1");
													pg_layoutGroupMeta.put("customcss","edit-fields-tabs");
													pg_layoutGroupMeta.put("class"," count-1");
													pg_layoutGroupMeta.put("optKeys","{\"swipe\":\"false\"}");
													pg_layoutGroupMeta.put("headinglev","h2");
													pg_layoutGroupMeta.put("menuPage",tools.getStepPage().getReference());
													pg_layoutGroupMeta.put("isMobile",isMobile);
													pg_layoutGroupMeta.put("uniqueid","202602230444360422");
													if(!"".equals(LGType))
													pg_layoutGroupMeta.put("lgType",LGType);
												}
												if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
													tools.appendString("<span class=\"layout-active-when\" data-activewhen = '' ></span>");
													}else {
													com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
													String expressionId = pxUniqueStreamHash+"_13";
													expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpressionGroup("activeWhen",activeWhenList, expressionId);
													if(!StringUtils.isBlank(expressionId)) {
														pg_layoutGroupMeta.put("pyExpressionId",expressionId);
													}
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
													lgExpandedGrpIdHidden= (tools.getParamCSF("EXPANDEDLGLayoutGrouppzConfigureFieldsS3") != "" && tools.getParamCSF("EXPANDEDLGLayoutGrouppzConfigureFieldsS3") != null) ? tools.getParamCSF("EXPANDEDLGLayoutGrouppzConfigureFieldsS3") : indexActiveLayout+"";
													if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
													}
													if(!"accordion".equals(LGType)){
													if(indexActiveLayout == 0) {
													if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
														tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzConfigureFieldsS3' value='" + lgExpandedGrpIdHidden + "'/>");
														
													}
												} else {
												if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
													tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzConfigureFieldsS3' value='" + indexActiveLayout + "'/>");
													
												}
											}
											}else {
											if(visibleLayoutsListInAccordion.size() > 0){
											commaSeparateList = visibleLayoutsListInAccordion.toString().replaceAll("[\\s\\[\\]]", "");
											if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
												tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzConfigureFieldsS3' value='" + commaSeparateList + "'/>");
												
											}
											} else {
											if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
												tools.appendString("<input type='hidden' name='EXPANDEDLGLayoutGrouppzConfigureFieldsS3' value='" + lgExpandedGrpIdHidden + "'/>");
												
											}
											}
											}
											if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
												tools.appendString("<input type='hidden' name='LGTypeLGLayoutGrouppzConfigureFieldsS3' value='" + tools.getParamCSF(LGTypeHiddenId) + "'/>");
												
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
										public void pzLayoutContainer_5() {
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
										String paramName = "EXPANDEDSubSectionpzConfigureFieldsBBB";
										metadataPage.put("paramName", paramName);
										String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUTGROUP','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
										if(!inspectorLayoutData.isEmpty()) {
										metadataPage.put("liveUI", inspectorLayoutData);
										}
										String pyPrefix = null;
										metadataPage.put("sectionIndex","5");
										IUIComponent containerComponent = pzAuto.getUIComponent();
										metadataPage.put("dlChild","true");
										containerComponent.beginComponent("pxLayoutContainer",metadataPage);
										pzLayoutBody_5();
										containerComponent.endComponent();
										}
public void pzLayout_8() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_8();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_5();
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
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"setItemFocus\",[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel") + "\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public void pxIcon_1() {boolean isDisplayTextWithParam = false;
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
	cellPage.put("pyStreamName","pzConfigureFields");
	cellPage.put("pyCellID","4");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Edit view name\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Edit view name", ".pyActionPrompt");
	}
	pyTooltip = "Edit view name";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	String classProp = "";
	classProp ="pi pi-pencil pi-white";
	modePage1.put("class",classProp);
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","styleclass");
	modePage1.put("pyFormatTypeActionable","none");
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20170201132102092218412") + " ");
	String spxUniqueStreamHash7 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash7,pxUniqueStreamHash+"_7");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_7");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzConfigureFields_"+ referenceString+ "_4'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Edit view name\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		String alttempText = tools.getLocalizedTextForString(".pyActionPrompt","Edit view name\t" + repeatIndx ,StreamBuilder.FMT_LITERAL);
		String classProp = "";
		 classProp ="pi pi-pencil pi-white";
		tools.appendString("<i  " + pzCell.getTestIdIfEnabled("20170201132102092218412") + "  href='' onclick='pd(event);' data-ctl='Icon' "); tools.appendString(" class='");
		tools.appendString(" icons "+classProp+"' ");
		tools.appendString("tabindex='0' role='link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
			tools.appendString(" alt= '");
			tools.appendString(alttempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"setItemFocus\",[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel") + "\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></i>");
		}		}

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



public void pxTextInput_1() {String key="3||RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "","","","","","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","64","","","Text","true","3"};oCellRuntimeParamsMap.put("3||RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT",paramValues);oControlPathsMap.put("3||RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxTextInput",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing remove-left-spacing    " + pzSection.getCustomStyle(false, "","data-type name","data-type name")  + " '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxTextInput_1();
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
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing remove-left-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20170201131716075774481-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxTextInput");
	pgCells.put("forLabel",".pyLabel");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("customROStyles","data-type name");
	pgCells.put("customRWStyles","data-type name");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxTextInput",".pyLabel",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxTextInput_1();labelName = "";
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing remove-right-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_1();
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
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20170201132102092218412-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_1();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpzConfigureFieldsBB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201804171546590624646") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + " content  layout-content-inline_middle content-inline_middle configure-view-label clearfix" + "'  ");
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
		pg_dlmeta.put("customClassName","configure-view-label");
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
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
	String paramName = "EXPANDEDSubSectionpzConfigureFieldsBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
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
pzSetExpandParam_2();
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_1();
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	pzLayout_1();
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


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_8();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	pzLayout_8();
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
pzSection.getLayout().setExpandParam("SubSectionpzConfigureFieldsB","",false);
}


public void simpleLayout_5() {
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201804171546590623466") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-simple_list content-simple_list configure-fields-section clearfix" + "'  ");
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
		pg_dlmeta.put("customClassName","configure-fields-section");
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
		index=simpleLayoutCell_3(index);
	}else{
		index=simpleLayoutTemplateCell_3(index);
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
	public void pzLayoutContainer_6() {
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
	String paramName = "EXPANDEDSubSectionpzConfigureFieldsB";
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
	pzLayoutBody_6();
	containerComponent.endComponent();
	}
public void pzLayout_9() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_9();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_6();
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
	oStreamProperties_1.put("pyClassName", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzConfigureFields");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_5", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-HTML-SECTION PZCONFIGUREFIELDS #20230618T001738.022 GMT", "Rule-HTML-Section pzConfigureFields", "Pega-ProcessArchitect", "08-23-01", "20230618T001738.022 GMT");
}
