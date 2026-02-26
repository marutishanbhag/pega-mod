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
/**
 * Builds JSP stream @BASECLASS!PZVIEWINSTANCES.
 */
public class ra_stream_pzviewinstances_bf61cd51534ed1abd9b75cdda50692ed extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzViewInstances.Data_Admin_Operator_ID.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1431695259;
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
	public ra_stream_pzviewinstances_bf61cd51534ed1abd9b75cdda50692ed(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "3907b595629e1aeb09a9e56f0b020c1d0890fcc";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT	Pega-Desktop:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "3907b595629e1aeb09a9e56f0b020c1d0890fcc";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzViewInstances",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT */
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
	"Rule-HTML-Section:PZVIEWINSTANCES", 
	"Rule-Obj-Property:PYTEMPLATEDISPLAYTEXT", 
	"Rule-Obj-Property:PYSELECTEDCLASS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZVIEWINSTANCES","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-06-01","RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT","!PZVIEWINSTANCES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1431695259), 
		new DependentRuleInfo("PYTEMPLATEDISPLAYTEXT","Rule-Obj-Property","@BASECLASS",true,"@baseclass","Pega-UIDesign","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEDISPLAYTEXT #20180713T133539.875 GMT","!PYTEMPLATEDISPLAYTEXT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSELECTEDCLASS","Rule-Obj-Property","@BASECLASS",true,"@baseclass","Pega-LP-DataModel","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYSELECTEDCLASS #20180713T142654.813 GMT","!PYSELECTEDCLASS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1)
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
//	RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT:20210216T220131.511 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEDISPLAYTEXT #20180713T133539.875 GMT:20180713T133539.875 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEDISPLAYTEXT #20180713T133539.875 GMT:20180713T133539.875 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTEDCLASS #20180713T142654.813 GMT:20180713T142654.813 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEDISPLAYTEXT #20180713T133539.875 GMT:20180713T133539.875 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEDISPLAYTEXT #20180713T133539.875 GMT:20180713T133539.875 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_3(
//	pzLayout_4(
//	simpleLayout_1(
//	simpleLayout_2(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME GETCURRENTTIMESTAMPUNIQUE #20180713T131433.071 GMT:20180713T131433.071 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PXADDGUARDRAILMESSAGE #20180713T131742.411 GMT:20180713T131742.411 GMT
//	RULE-UTILITY-FUNCTION GRID PZGENERATEGRIDCATEGORYHEADERROW #20180713T133337.754 GMT:20180713T133337.754 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION GRID PZNORMALIZEKEY #20180713T133337.799 GMT:20180713T133337.799 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGB2D03618C4D6FCE3A07CB882EBEA3D958 #20201222T180835.601 GMT:20201222T180835.601 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELINCLUDE #20181206T140519.218 GMT:20181206T140519.218 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISFORMATTEDCONTROL #20180713T133341.276 GMT:20180713T133341.276 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL #20180713T133341.320 GMT:20180713T133341.320 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENRULE--(CLIPBOARDPAGED2D8EBC7F29F977F1A20CFC6559990AA #20180713T133344.491 GMT:20180713T133344.491 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENSELECTEDITEM #20180713T133344.495 GMT:20180713T133344.495 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCHECKAUTOGENCONTROL--(CLIPBOARDPROPERTY) #20180713T133344.796 GMT:20180713T133344.796 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGRIDACTIONTOKENIZER--(STRING,JAVA.UTIL.LIST) #20180713T133346.434 GMT:20180713T133346.434 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "12cc2d589ab2ee2099b6a44dc064ff0d";
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
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzViewInstances",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzViewInstances','insKey':'RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT','sectionType':'standard'}");
pzLayout_1();
pzLayout_2();
pzLayout_3();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_25")) ){
pzLayout_4();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
config.put("StreamName", "pzViewInstances");
pega.getUIEngine().getUIAction("sort", config).register();
pega.getUIEngine().getUIAction("paginate", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "OpenRuleInPortal");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBodyWrapper_5() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='4' class='" + clsScroll + " layout-body clearfix'>");
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();layoutBody_1();gridCentreLayout_1();
  

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
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public void 
pegaReferenceTag_4(String strPropName, String controlName, ClipboardPage paramPg) {
try {
 java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 
if(paramPg != null) {java.util.Collection propertiesCollection = paramPg.values();ClipboardProperty cp_thisProperty;String propertyName, propertyValue;java.util.Iterator propertiesIter = propertiesCollection.iterator();com.pega.pegarules.jsptags.ParamTag params = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);params.setPageContext(pageContext);while (propertiesIter.hasNext()) {cp_thisProperty = (ClipboardProperty) propertiesIter.next();propertyName = cp_thisProperty.getName();propertyValue = cp_thisProperty.getStringValue();if(propertyValue.length() > 0){if(true) {if(propertyValue.charAt(0) == '"' && propertyValue.charAt(propertyValue.length()-1)== '"'){propertyValue = propertyValue.substring(1, propertyValue.length()-1);}params.setName(propertyName);params.setValue(propertyValue);}else{params.setName(propertyName);params.setRef(propertyValue);}}params.doStartTag();}}

/*
 * reference tag
 * Cannot inline because: format is JSP expression
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__4 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__4.setPageContext(pageContext);
_jspx_th_pega_reference__4.setParent(mParentTag);
_jspx_th_pega_reference__4.setName((String)functionsMap.get(strPropName));
_jspx_th_pega_reference__4.setMode("input");
_jspx_th_pega_reference__4.setFormat(controlName);
int _jspx_eval_pega_reference__4 = _jspx_th_pega_reference__4.doStartTag();
if (_jspx_th_pega_reference__4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__4);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_4(String strPropName,ClipboardPage controlInfoPage) {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamValue("DataAtrributeName"), StreamBuilder.FMT_NORMAL)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",strPropName, ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:22px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_4(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_4(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_4(strPropName, "", null);}}} else {

				pegaReferenceTag_4(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_4(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_4(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_4(strPropName, "", null);}}} else {

				pegaReferenceTag_4(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingHeaderCell_1(String strHeaderLabel,String strColumnWidth,String strSortOrder,String strSortType,String filterType,String strColumnProp, String headerCellSection) {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataColumnProp = strColumnProp;
	dataColumnProp = pega_uiengine_grid.pzNormalizeKey(dataColumnProp);
	classesMap = (java.util.Map) tools.getParameterPage().get("currentClassesMap");
	dataPropClass = null;
	if(classesMap != null){
	dataPropClass = (String) classesMap.get(dataColumnProp);
	}
	lastDotIndex = dataColumnProp.lastIndexOf(".");
	dataColumnProp = dataColumnProp.substring(lastDotIndex+1);
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
	String sortOrder = strSortOrder;
	String sortType = strSortType;
	String maxSortOrder = tools.getParamValue("maxSortOrder");
	strFieldValue = tools.getParamValue("sortField");
	tools.putParamValue("columnSortOrder",sortType);
	String strSortProperty = tools.getParamValue("sortProperty");
	if(tools.getParamAsBoolean(ImmutablePropertyInfo.MODE_STRING,"stableSort"))
	strSortProperty = "";
	if(!"".equals(strSortProperty) && strFieldValue.equals(strSortProperty)){
	   sortOrder = "1";
	   if(!"".equals(tools.getParamValue("sortType")))
	   sortType = tools.getParamValueCSF("sortType");
	   else   sortType = "DESC";
	}else if(!"".equals(strSortProperty) && !strFieldValue.equals(strSortProperty)){
	   sortOrder = ""; sortType = ""; 
	}
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20150403095848040268511") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamValue("DataAtrributeName"), StreamBuilder.FMT_NORMAL)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(4).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("  ");tools.appendString("' pyCellType = 'dynamic' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true'");
		String strSortProp = tools.getParamValue("sortField"); 
		 tools.appendString(" sortField = '"+strSortProp+"' "); 
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("height:19px;");if(tools.getParamValue("pyColumnWidthUnit").equalsIgnoreCase("percent")){tools.appendString("width:"+strColumnWidth+"%;");}else{tools.appendString("width:"+strColumnWidth+"px;");}tools.appendString(""); tools.appendString("'>");
		if(null != headerCellSection) {StringMap keys = new HashStringMap();keys.putString("pxObjClass", "Rule-HTML-Section");keys.putString("pyStreamName", headerCellSection);tools.appendString(tools.getStream(keys, null));tools.appendString("</th>");return;}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:17px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc452947825'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", strHeaderLabel, StreamBuilder.FMT_NORMAL));
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder",strSortType); 
}else{
if(strFieldValue.equals(tools.getParamValue("sortProperty"))){
tools.putParamValue("columnSortOrder",tools.getParamValue("sortType"));       
} 
}
       if("ASC".equals(tools.getParamValue("columnSortOrder"))){   
  tools.putParamValue("sortTitleText","columnsorted_asc");    
}else 
if("DESC".equals(tools.getParamValue("columnSortOrder"))){    
  tools.putParamValue("sortTitleText","columnsorted_desc");   
}else{    
  tools.putParamValue("sortTitleText","Enter to sort");   
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc452947825' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc452947825' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc452947825' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele pointerStyle ");  tools.appendString(sortType); tools.appendString(" '  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc452947825' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13!=null && !gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPageValue(tools.getParamValue("RDColumnName")).isEmpty() && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="" && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle452947825\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13!=null && !gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPageValue(tools.getParamValue("RDColumnName")).isEmpty() && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="" && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType="+filterType+"></span><span id=\"filterTitle452947825\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13!=null && !gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPageValue(tools.getParamValue("RDColumnName")).isEmpty() && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="" && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType="+filterType+"></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13!=null && !gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPageValue(tools.getParamValue("RDColumnName")).isEmpty() && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="" && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType="+filterType+"></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13!=null && !gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPageValue(tools.getParamValue("RDColumnName")).isEmpty() && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="" && gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13.getProperty("pyColumnFilterCriteria").getPropertyValue(tools.getParamValue("RDColumnName")).getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType="+filterType+"></a></span>");}tools.putParamValue("pzPropertyType","");}}
			int dynamicColumnIndex = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER, "dynamicColumnIndex");int dynamicColsCount = 0;if(!"".equals(tools.getParamValueCSF("dynamicColCount"))) {dynamicColsCount = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER,"dynamicColCount");}
			if(columnNumberDT > dynamicColumnIndex){
			int newColumnIndex = columnNumber +(dynamicColsCount-1);
		int lastIndexposition = subScriptForColumn.lastIndexOf(""+columnNumber);
				if(lastIndexposition > -1){
		subScriptForColumn = subScriptForColumn.substring(0,lastIndexposition)+newColumnIndex;
				}
			}}dataColumnProp = strColumnProp;dataColumnProp = pega_uiengine_grid.pzNormalizeKey(dataColumnProp);classesMap = (java.util.Map) tools.getParameterPage().get("currentClassesMap");dataPropClass = null;if(classesMap != null){dataPropClass = (String) classesMap.get(dataColumnProp);}lastDotIndex = dataColumnProp.lastIndexOf(".");dataColumnProp = dataColumnProp.substring(lastDotIndex+1);bSecured= tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
String navRuleStreamVal = tools.getParamValue("navRuleStream");
if(bSecured)
{
 navRuleStreamVal="";
}
String navRuleStream = "<span id='pui_menu' filterType='"+filterType+"'>"+navRuleStreamVal+"</span>";
if(!"".equals(tools.getParamValue("columnMenuPrefix")) && tools.getParamValue("columnMenuPrefix")!= null){
tools.appendString(navRuleStream.replace("columnMenu",tools.getParamValue("columnMenuPrefix")+"-column-menu columnMenu"));
}else{
tools.appendString(navRuleStream);
}
tools.putParamValue("columnMenuPrefix","");if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public String gridCategoryHeaderRow_1(String strPrevRowCategory, int prevCategoryLastRowIndex, List categorizedColsList, List categorizedColHeadersList, List categorizedColHiddenList) {
 String pyCustomGroupingSection = tools.getParamValue("pyCustomGroupingSection"); 
 if(StringUtils.isBlank(pyCustomGroupingSection))pyCustomGroupingSection = "pzGridCategoryHeader"; 
StringBuffer sbCategorizeLabel = new StringBuffer();
String strCurrentRowCategory = null;
String strCategorizedColName = null;
Map functionsMap= (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");
for(int cnt=0; cnt<categorizedColsList.size(); cnt++) {

					strCategorizedColName = (String)categorizedColsList.get(cnt);

					try {

					sbCategorizeLabel.append(tools.getActive().getProperty((String)functionsMap.get(strCategorizedColName)).getStringValue().trim());

					} catch(Exception e) {

					sbCategorizeLabel.append(tools.getActive().getProperty(strCategorizedColName).getStringValue().trim());

					}
}
strCurrentRowCategory = sbCategorizeLabel.toString();
if(strPrevRowCategory==null || !strCurrentRowCategory.equalsIgnoreCase(strPrevRowCategory)) { 
StringBuffer categoryHtml = new StringBuffer();
int dynamicColsCount = 0; int pyGroupingSortNumber = 0;
if(!"".equals(tools.getParamValue("dynamicColCount"))) {
dynamicColsCount = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER,"dynamicColCount");
pyGroupingSortNumber = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER,"pyGroupingSortNumber");
if(dynamicColsCount > 0) {
dynamicColsCount = dynamicColsCount - 1 - pyGroupingSortNumber;
}
}
int colSpanValue = 1+ dynamicColsCount; 
categoryHtml.append("<tr class=\"grid-categorize-header cellCont\"><td style=\"height:19px;\" class=\"gridCell\" colspan=\"");
categoryHtml.append(colSpanValue);
categoryHtml.append("\">");
categoryHtml.append("<table cellpadding='0' cellspacing='0' style=\"width:100%\"><tr>");
categoryHtml.append("<td class=\"grid-content\">");
if(pzAuto.isAccessible()){
categoryHtml.append("<div style=\"height:0px; width:0px; overflow:hidden;\">");
categoryHtml.append(tools.getLocalizedTextForString(".pyCaption", "Category header", StreamBuilder.FMT_NORMAL));
categoryHtml.append("</div>");
}
HashStringMap keys = new HashStringMap();
keys.put("pxObjClass", "Rule-HTML-Section");
keys.put("pyStreamName", "pzGridCategoryRowLabel");
for(int cnt=0; cnt<categorizedColsList.size(); cnt++) {

					strCategorizedColName = (String)categorizedColsList.get(cnt);

					String headerLabel = (String)categorizedColHeadersList.get(cnt);

					boolean isHidden = (Boolean)categorizedColHiddenList.get(cnt);

					if(isHidden)continue; 

					tools.putParamValue("pxCategoryColumnLabel", headerLabel);

					if(((String)functionsMap.get(strCategorizedColName)) != null) {

					tools.putParamValue("pxCategoryColumnProperty", (String)functionsMap.get(strCategorizedColName));

					} else {

					tools.putParamValue("pxCategoryColumnProperty", strCategorizedColName);

					}

					tools.putParamValue("pxCategoryColumnCount", cnt + 1);

					tools.putParamValue("pxTotalCategoryColumns", categorizedColsList.size());

					tools.putParamValue("pxPrevCategoryLastRowIndex", prevCategoryLastRowIndex);

					categoryHtml.append(pzAuto.getSection().getSectionStream(pyCustomGroupingSection, tools.getActive().getPageValue().getReference(), false, ""));

					if (tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE, "pyHideGridCategoryHeader")) {

					tools.getParameterPage().remove("pxCategoryColumnLabel");

					tools.getParameterPage().remove("pxCategoryColumnProperty");

					tools.getParameterPage().remove("pxCategoryColumnCount");

					tools.getParameterPage().remove("pxTotalCategoryColumns");

					tools.getParameterPage().remove("pyHideGridCategoryHeader");

					tools.getParameterPage().remove("pxPrevCategoryLastRowIndex");

					return "";

					}
}
tools.getParameterPage().remove("pxCategoryColumnLabel");
tools.getParameterPage().remove("pxCategoryColumnProperty");
tools.getParameterPage().remove("pxCategoryColumnCount");
tools.getParameterPage().remove("pxTotalCategoryColumns");
tools.getParameterPage().remove("pxPrevCategoryLastRowIndex");
if(pzAuto.isAccessible()){
categoryHtml.append("<div style=\"height:0px; width:0px; overflow:hidden;\">");
categoryHtml.append(tools.getLocalizedTextForString(".pyCaption", "Category count", StreamBuilder.FMT_NORMAL));
categoryHtml.append("</div>");
}
categoryHtml.append("</td><td id='GCH" + tools.getParamValueCSF("index"));
categoryHtml.append("' class=\"grid-count\"></td>");
categoryHtml.append("</tr></table></td></tr>");
tools.appendString(categoryHtml.toString());
tools.getParameterPage().remove("pyHideGridCategoryHeader");
}
return strCurrentRowCategory;
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
	secInfo.put("pxGadgetClass", "PegaGadget-GridPagination");
	Map<String, String> advanceParams = new HashMap<String, String>();
	advanceParams.put("pyPageMode", "Next Previous");
	advanceParams.put("pxObjClass", "PegaGadget-GridPagination");
	advanceParams.put("pxCreateOperator", "bokks");
	advanceParams.put("pxCreateDateTime", "20100625T142549.323 GMT");
	advanceParams.put("pyPaginationButtonsFormat", "pzhc");
	advanceParams.put("pxCreateSystemID", "sde");
	advanceParams.put("pyAppliesTo", "@baseclass");
	advanceParams.put("pxCreateOpName", "Suman Bokkasam");
	secInfo.put("advanceParams", advanceParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_26","pyGridPaginator", secInfo);
}


public void sectionBodyIncludeInCell_1(boolean isEditable, boolean isReadOnly, String strReadOnlyWhen, String streamName) { 
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
buildSection_1();
return;
}
String tempRenderSingle = tools.getParamValue("RenderSingle");
tools.putParamValue("RenderSingle","");
if((isReadOnly) && (!strReadOnlyWhen.equals(""))){
if(pzAuto.handleEvaluateWhen(strReadOnlyWhen,strReadOnlyWhen, "cell", "visible" )) {

pzAuto.emitIncludeStreamReference(streamName, null, "NoInput", "Rule-HTML-Section",null);
}else{

pzAuto.emitIncludeStreamReference(streamName, null, "null","Rule-HTML-Section",null);
}
}else if(isReadOnly){

pzAuto.emitIncludeStreamReference(streamName, null, "NoInput", "Rule-HTML-Section",null);
}else if(isEditable){
String tempSectionReadOnlyValue = StringUtils.crossScriptingFilter(tools.getParamValue("SectionReadOnly"));
tools.getParameterPage().remove("SectionReadOnly");

pzAuto.emitIncludeStreamReference(streamName, null, "Input", "Rule-HTML-Section",null);
tools.putParamValue("SectionReadOnly",tempSectionReadOnlyValue);
}else{

pzAuto.emitIncludeStreamReference(streamName, null,!tools.hasInputEnabled() ? "NoInput" : "Input" , "Rule-HTML-Section",null);
}
tools.putParamValue("RenderSingle",tempRenderSingle);
}


public void 
pzGenerateAdvParam_1() {{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
{
ClipboardPage pyDocuments = tools.findPage("pyDocuments",false);
ClipboardProperty pyDocument = pyDocuments.getProperty("pyDocument");
String harnessID = tools.getParamValue("pzHarnessID");
 if(!harnessID.equals("")){
 ClipboardProperty myDocProp = pyDocument.getPropertyValue(harnessID);
 ClipboardProperty pyGadgets = myDocProp.getProperty("pyGadgets");
 if(myDocProp.isEmpty())	 pyDocument.add(harnessID,pyGadgets);
 ClipboardPage pg_Gadgets = pyGadgets.getPageValue();
 java.util.Set subscriptsKey = pg_Gadgets.keySet();
 String oldcontainerIDList = tools.getParamValue("SectionIDList");
 if(!oldcontainerIDList.equals("")) { 
 StringTokenizer st = new StringTokenizer(oldcontainerIDList, ":"); 
 while (st.hasMoreTokens()) {
 String eachtoken = st.nextToken();
 java.util.Iterator iter_subscripts = subscriptsKey.iterator();
 while(iter_subscripts.hasNext()){ 
 String Key = (String)iter_subscripts.next();
 if(Key.indexOf(eachtoken) > -1) { 
 ClipboardProperty paramPageProperty = (ClipboardProperty)pg_Gadgets.get(Key) ;
 ClipboardPage paramPage = paramPageProperty.getPageValue();
 pg_Gadgets.remove(Key);
 } 
	 }
	 } 
		 }
		ClipboardPage pyAdvParams = tools.createPage("PegaGadget-GridPagination","");
		
								pyAdvParams.putString("pyPageMode",tools.getParamValue("pyPageMode"));
								pyAdvParams.putString("pxObjClass","PegaGadget-GridPagination");
								pyAdvParams.putString("pxCreateOperator","bokks");
								pyAdvParams.putString("pxCreateDateTime","20100625T142549.323 GMT");
								pyAdvParams.putString("pyPaginationButtonsFormat","pzhc");
								pyAdvParams.putString("pxCreateSystemID","sde");
								pyAdvParams.putString("pyAppliesTo","@baseclass");
								pyAdvParams.putString("pxCreateOpName","Suman Bokkasam");
		pyAdvParams.putString("SectionName","pyGridPaginator");
		pyGadgets.add(newSectionID, pyAdvParams);
			 } 
				 } 
				tools.putParamValue("newSectionID",newSectionID); } 
				}


public void elementModel_1(String pyInclude,String pyStreamName,String pyHeaderType,String pyElementName) { 

	try {

ClipboardPage pg_displayTemp = tools.findPage("pyDisplayTemp",true);

if(pg_displayTemp != null) {

		ClipboardPage pg_SectionTabNested = tools.findPage("pyDisplayTemp").getProperty("pyElements").getPageValue(pyInclude);

		if(pg_SectionTabNested.getProperty("pyUIElements").size() == 0) {

			pg_SectionTabNested.getParentProperty().removeFromClipboard();
		}else {

			ClipboardPage pg_outerSection = tools.findPage("pyDisplayTemp").getProperty("pyElements").getPageValue(pyStreamName);

			 if(!"".equalsIgnoreCase(pg_displayTemp.getStringIfPresent("pyMode"))){ pg_outerSection.putString("pyMode",pg_displayTemp.getString("pyMode"));}

			  boolean bNested = false;
 if(!"".equals(pyElementName)){

			Iterator iter_elements = pg_outerSection.getProperty("pyUIElements").iterator();

			while(iter_elements.hasNext()){

				ClipboardPage pg_elem = ((ClipboardProperty)iter_elements.next()).getPageValue();

				String elemName = pg_elem.getProperty("pyElementName").getStringValue();

				if(elemName.equals(pyElementName)) {

					Iterator iter_elements2 = null;

					iter_elements2 = pg_SectionTabNested.getProperty("pyUIElements").iterator();

					while(iter_elements2.hasNext()){

						ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

						 pg_elem.movePage("pyUIElements(<APPEND>)", pg_innerElem);

					}

					iter_elements2 = pg_SectionTabNested.getProperty("pyUIActive").iterator();

					while(iter_elements2.hasNext()){ 

						ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

						pg_elem.movePage("pyUIActive(<APPEND>)", pg_innerElem);

					}

					break;

				}

			}

			 bNested = true;
}//if(pyElementName)

			 if(!bNested){

			Iterator iter_elements2 = pg_SectionTabNested.getProperty("pyUIElements").iterator();

			while(iter_elements2.hasNext()){

				ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

				pg_outerSection.movePage("pyUIElements(<APPEND>)", pg_innerElem);

			}

			iter_elements2 = pg_SectionTabNested.getProperty("pyUIActive").iterator();

			while(iter_elements2.hasNext()){

				ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

				pg_outerSection.movePage("pyUIActive(<APPEND>)", pg_innerElem);

			}

			}//if(bNested)

			pg_SectionTabNested.getParentProperty().removeFromClipboard();

		}

	}

	} catch(Exception e){

		

	}
}


public void sectionIncludeInCell_pyGridPaginator_1(){
pzGenerateAdvParam_1();
sectionBodyIncludeInCell_1(false,false,"","pyGridPaginator");elementModel_1("pyGridPaginator","pzViewInstances","BAR","");
 } 
public void 
labelIncludeInCell_2(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20150403095848040163832") + "  ");
if(!labelForAttribute.equals("")){tools.appendString(" for='" + labelForAttribute + rlIndex + "' ");
}String labelForError="";if(!propertyName.equals("")){try { labelForError = pzSection.getCell().getLabelForError(pageName,propertyName);}catch(Exception e) {} }tools.appendString(labelForError);
if(!accessKey.equals("")){tools.appendString(accessKey);
}else if(bRuntimeAccesskey){String aKey = pega_uiengine_harness.pzGetAKey(".pyCaption",labelValue,pega_procom_harness.IsParam(labelValue) );tools.appendString(aKey);
}tools.appendString(" >");
if(isRequired){
tools.appendString("<span class=\"iconRequired " + sLabelFormat + "_iconRequired\">");
}
if(bRuntimeAccesskey)labelValue=tools.getParamValue("pzULabel");else if(pega_procom_harness.IsParam(labelValue) ){String paramName = labelValue.substring(labelValue.indexOf(".")+1);labelValue = tools.getParamValueCSF(paramName);if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);}else if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);tools.appendString(labelValue);
if(isRequired){
tools.appendString("</span>");
}
if(isRequired){
String reqString = "Required";
if(bLocalize){
reqString = tools.getLocalizedTextForParameterizedString("pyCaption","Required");
}
tools.appendString("<strong class=\"required-field-accessibility\">" + reqString + "</strong>");
}
tools.appendString("</label>");
}
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("201504031548520372117454") + "  ");
if(!labelForAttribute.equals("")){tools.appendString(" for='" + labelForAttribute + rlIndex + "' ");
}String labelForError="";if(!propertyName.equals("")){try { labelForError = pzSection.getCell().getLabelForError(pageName,propertyName);}catch(Exception e) {} }tools.appendString(labelForError);
if(!accessKey.equals("")){tools.appendString(accessKey);
}else if(bRuntimeAccesskey){String aKey = pega_uiengine_harness.pzGetAKey(".pyCaption",labelValue,pega_procom_harness.IsParam(labelValue) );tools.appendString(aKey);
}tools.appendString(" >");
if(isRequired){
tools.appendString("<span class=\"iconRequired " + sLabelFormat + "_iconRequired\">");
}
if(bRuntimeAccesskey)labelValue=tools.getParamValue("pzULabel");else if(pega_procom_harness.IsParam(labelValue) ){String paramName = labelValue.substring(labelValue.indexOf(".")+1);labelValue = tools.getParamValueCSF(paramName);if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);}else if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);tools.appendString(labelValue);
if(isRequired){
tools.appendString("</span>");
}
if(isRequired){
String reqString = "Required";
if(bLocalize){
reqString = tools.getLocalizedTextForParameterizedString("pyCaption","Required");
}
tools.appendString("<strong class=\"required-field-accessibility\">" + reqString + "</strong>");
}
tools.appendString("</label>");
}


public void layoutBody_1() { 
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='1' class = 'gridActionTop'>" + "<table role='presentation'  section_index='4'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:33%;",false,"","");tools.appendString("<nobr>");
	labelIncludeInCell_1("","","","",false,"",true,false,"Standard",false);
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignCenter","dataLabelWrite gridActionAlignCenter"), "width:33%;",false,"","");labelIncludeInCell_2("","","","",false,"",true,false,"Standard",false);
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("SUB_SECTION","pyGridPaginator",".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignRight","dataLabelWrite gridActionAlignRight"), "width:33%;",false,"","");sectionIncludeInCell_pyGridPaginator_1(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzViewInstancesBBBB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(4)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzViewInstancesBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Next Previous"; 

 String strPageSize = "50"; 

 String returnTotalCount = ""; 

 ParameterPage newParams = null;

 newParams = tools.getParameterPage();

 newParams.putString("pyReportName","pyInstanceList");

 newParams.putString("pyReportClass","@baseclass");
if(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null){
if("Rule-Obj-Report-Definition".equals(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)).getClassName())){

 newParams.putString("pyReportPageName",pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true));
}
else { 
oLog.error("The section 'pzViewInstances' has a Grid with virtual RD Page 'D_pzInstanceListDisplay.pyReference' specified. This page isn't of the class Rule-Obj-Report-Definition.");
}
}

 if(!tools.getParamValue("gridAction").equals("SORT") && !tools.getParamValue("gridAction").equals("PAGINATE") && !tools.getParamValue("gridAction").equals("FILTER") && !tools.getParamValue("gridAction").equals("REFRESHLIST") && !tools.getParamValue("refreshLayout").equals("true")){ 


try{

 HashStringMap keys = new HashStringMap();

 keys.putString("pxObjClass","Rule-Obj-Activity");

 keys.putString("pyClassName","Rule-Obj-Report-Definition");

if(!tools.getParamValue("pyPegaDesignMode").equals("true")) { 

 keys.putString("pyActivityName","pxRetrieveReportData");} else {

 keys.putString("pyActivityName","pzDesignTimeReportData");}
 boolean bSkipRemoveClipboard= false;
String reportPageName = pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true);
String reportContPageName = pega_uiengine_grid.pzResolveReportPageName("pgRepPgSubSectionpzViewInstancesBBBB", false);
 if(reportPageName.indexOf(".") != -1) {if(reportContPageName.startsWith(reportPageName.substring(0,reportPageName.indexOf(".")))){bSkipRemoveClipboard=true;} } 
 if(!bSkipRemoveClipboard){ ClipboardPage oldPage = tools.findPage(pega_uiengine_grid.pzResolveReportPageName("pgRepPgSubSectionpzViewInstancesBBBB", false));
if(oldPage != null) {oldPage.removeFromClipboard();}}

 newParams.putString("pyPageName",pega_uiengine_grid.pzResolveReportPageName("pgRepPgSubSectionpzViewInstancesBBBB", false));

 ClipboardPage pg = tools.createPage("@baseclass","");

 String paramPg = "paramPage";

 if("pgRepPgSubSectionpzViewInstancesBBBB".indexOf("pgRepPg") > -1){

 	paramPg+= "pgRepPgSubSectionpzViewInstancesBBBB".substring(7);

 }else {

 	paramPg+= pega_uiengine_grid.pzResolveReportPageName("pgRepPgSubSectionpzViewInstancesBBBB", false).replace(".","__1_");

 }

 ClipboardPage pyReportParamPageName  = tools.createPage("Embed-QueryInputs", paramPg);

 ClipboardPage pyPagingSettings  = tools.createPage("Embed-PagingSettings", "");

 pyPagingSettings.putString("pyReturnTotalResultCount","true");

 pyPagingSettings.getProperty("pyPagingEnabled").setValue(true);

 pyPagingSettings.putString("pyPageIndex","1");

 pyPagingSettings.putString("pyPageSize",""+strPageSize);

 pyPagingSettings.putString("pyReturnResultCount", returnTotalCount);

 tools.putParamValue("pyReturnResultCount", returnTotalCount);

 pyPagingSettings.putString("pyPageMode", strPageMode);

 pyReportParamPageName.getProperty("pyPagingSettings").setValue(pyPagingSettings);

 newParams.putString("pyReportParamPageName",paramPg);

 tools.doActivity(keys,pg,newParams);

 ClipboardPage pgRepContPageWithResults = tools.findPage(pega_uiengine_grid.pzResolveReportPageName("pgRepPgSubSectionpzViewInstancesBBBB", false));

 tools.putParamValue("totalRecords",pgRepContPageWithResults.getProperty("pxTotalResultCount").getStringValue());

 tools.putParamValue("morePages",pgRepContPageWithResults.getProperty("pxMore").getStringValue());

 pg.removeFromClipboard();

 }catch(Exception e){}

 } 
else if(tools.getParamValue("refreshLayout").equals("true")) {try{
ClipboardPage pgRepContPageWithResults = tools.findPage(pega_uiengine_grid.pzResolveReportPageName("pgRepPgSubSectionpzViewInstancesBBBB", false));
tools.putParamValue("totalRecords",pgRepContPageWithResults.getProperty("pxTotalResultCount").getStringValue());
tools.putParamValue("morePages",pgRepContPageWithResults.getProperty("pxMore").getStringValue());
}catch(Exception e){}}

 ClipboardPage gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13=null;

 Map selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 = null;

	 String strFCPage = "pyFilterCriteria_pgRepPgSubSectionpzViewInstancesBBBB.pxResults_pzViewInstances_4";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

  selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 = null; // reset the variable

 if(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 != null){ 

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13); 

 		 tools.getParameterPage().put("selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13", selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div  section_index='4' ");
tools.appendString(" dataSource='");tools.appendString("pgRepPgSubSectionpzViewInstancesBBBB.pxResults");tools.appendString("_pzViewInstances_4'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201704040320550048263") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='true' bLoadActivity='false' bDataObject='false' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false'");
String pyReportPageNameLocal=pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true);tools.appendString("RDPageName='"+pyReportPageNameLocal+"'");tools.appendString(" RDName = '");
tools.appendString(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null ? tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)).getStringIfPresent("pyStreamName") : "pyInstanceList");tools.appendString("' RDAppliesToClass = '");
tools.appendString(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null ? tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)).getStringIfPresent("pyClassName") : "@baseclass");tools.appendString("' RDContPage = '");
tools.appendString(pega_uiengine_grid.pzResolveReportPageName("pgRepPgSubSectionpzViewInstancesBBBB", false));tools.appendString("' gridLayoutID=\"SubSectionpzViewInstancesBBBB\"  openOnDblClick='false'");
String OAFunc = ""; 
String PLClass = tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null ?tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference",true)).getStringIfPresent("pyClassName"): "null" ;
if(tools.getDictionary().getClassInfo("Work-").isAncestorOf(PLClass)) {
	OAFunc = "openWorkByHandle"; 
} 
else if(tools.getDictionary().getClassInfo("Assign-").isAncestorOf(PLClass)){ 
	OAFunc = "openAssignment"; 
} 
else if(tools.getDictionary().getClassInfo("Rule-").isAncestorOf(PLClass)){ 
	OAFunc = "openRuleByKeys"; 
} 
tools.appendString(" data-virtualRD='true' OAFunc='" + OAFunc + "'"); 
tools.appendString(" ");
pgRepPgSubSectionpzViewInstancesBBBB_pxResults_1();
tools.appendString(">");


 ClipboardProperty pageListProp = null;

 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


 int currentPageIndex = 0; 

 if(startIndex == 0){ startIndex = 1; } 

 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

 tools.putParamValue("pyPageMode", strPageMode); 


 tools.putParamValue("pyPageSize", "50"); 

 tools.putSaveValue("pyPageSize", "50"); 

 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 

 tools.putParamValue("startIndex",startIndex); 

 tools.putParamValue("currentPageIndex",currentPageIndex); 

 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

 tools.putParamValue("endPageIndex",endPageIndex); 
if(tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB", true)!=null) {
pageListProp = tools.getProperty("pgRepPgSubSectionpzViewInstancesBBBB.pxResults");
}

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","pgRepPgSubSectionpzViewInstancesBBBB.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/

 if(pageListProp==null && !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {
pageListProp = tools.getProperty("pgRepPgSubSectionpzViewInstancesBBBB.pxResults"); }

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
String resultsPage = "" ;
resultsPage = "pgRepPgSubSectionpzViewInstancesBBBB";
ClipboardPage pg_metaDataPage = null;
HashStringMap metaDataKeys = new HashStringMap();
metaDataKeys.put("pxObjClass","Rule-Obj-Activity");
metaDataKeys.put("pyClassName","Rule-Obj-Report-Definition");
metaDataKeys.put("pyActivityName","pxRetrieveReportMetaData");
tools.putParamValue("pyReportName","pyInstanceList");
tools.putParamValue("pyReportClass","@baseclass");
if(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null){
if("Rule-Obj-Report-Definition".equals(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)).getClassName())){
tools.putParamValue("pyReportPageName",pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true));
}
}
tools.putParamValue("pyPageName","pgRepPgSubSectionpzViewInstancesBBBBMETADATA");
ClipboardPage tempDummy = tools.createPage("@baseclass", "tempdummy");
tools.doActivity(metaDataKeys,tempDummy ,null);
tempDummy.removeFromClipboard();
pg_metaDataPage = tools.findPage("pgRepPgSubSectionpzViewInstancesBBBBMETADATA");
HashStringMap unCategorizedOrHiddenColsKeys = new HashStringMap();
int gridColIndex = 1; 
ClipboardProperty cp_rdListFields = pg_metaDataPage.getProperty("pyListFields");
String headerCellSection = null;
ClipboardPage pg_resultsPage = tools.findPage(resultsPage);
if (null != pg_resultsPage && null != pg_resultsPage.getIfPresent("pyColumnInfo")) {
ClipboardProperty headerSectionProp = pg_metaDataPage.getIfPresent(".pyHeaderCellSection");
if (null != headerSectionProp) {
if (!"".equals(headerSectionProp.getStringValue())) {
headerCellSection = headerSectionProp.getStringValue();
cp_rdListFields = pg_resultsPage.getProperty("pyColumnInfo");
}
}
}
for(int i=1; i<=cp_rdListFields.size();i++){
	ClipboardPage RDColumn = cp_rdListFields.getPageValue(i);
	if(!("true".equals(RDColumn.getString("pyIsColumnHide"))) ) {
	dynamicColCount +=  1;
	     unCategorizedOrHiddenColsKeys.put(""+gridColIndex,""+i); 
	     gridColIndex = gridColIndex + 1; 
	}
}
tools.putParamValue("dynamicColCount",dynamicColCount);
String maxSortOrder = pg_metaDataPage.getString("pyMaxSortOrder");
tools.putParamValue("maxSortOrder",maxSortOrder);
String pyHeaderDisplay = pg_metaDataPage.getString("pyHeaderDisplay"); 
tools.putParamValue("pyHeaderDisplay",pyHeaderDisplay);
boolean pyGroupingEnabled = pg_metaDataPage.getBoolean("pyGroupingEnabled");
tools.putParamValue("pyGroupingEnabled",""+pyGroupingEnabled);
tools.putParamValue("pyCustomGroupingSection",pg_metaDataPage.getString("pyCustomGroupingSection"));
int pyGroupingSortNumber = pg_metaDataPage.getInteger("pyGroupingSortNumber");
   java.util.List categorizedColsList = new ArrayList(); 
   java.util.List categorizedColHeadersList =  new ArrayList(); 
   java.util.List categorizedColHiddenList =  new ArrayList(); 
for(int i=0;i<pyGroupingSortNumber;i++){ 
   categorizedColsList.add(null); 
   categorizedColHeadersList.add(null); 
   categorizedColHiddenList.add(null); 
} 
tools.putParamValue("pyGroupingSortNumber",""+pyGroupingSortNumber);
StringBuilder categorizeJson = new StringBuilder("["); 
StringBuilder columnList = new StringBuilder(); 
if(pyGroupingEnabled) 
{ 
   for(int i=1; i<=cp_rdListFields.size();i++){ 
	 ClipboardPage current = cp_rdListFields.getPageValue(i); 
       String fieldName = current.getString("pyFieldName"); 
       columnList.append(fieldName); columnList.append(" ");
	 if(current.getBoolean(".pyIsCategorized"))
	 { 
	     int pySortOrder = current.getInteger("pySortOrder"); 
       String sortType =  current.getString("pySortType"); 
       boolean ishidden =  current.getBoolean("pyIsColumnHide"); 
       String categorizeToken = "{'pyFieldName':'"+fieldName+"','pySortType':'"+sortType+"','pySortOrder':"+pySortOrder+"},"; 
       categorizeJson.append(categorizeToken); 
fieldName= pega_uiengine_grid.pzNormalizeKey(fieldName);
	 categorizedColsList.set(pySortOrder-1,fieldName); 
       categorizedColHeadersList.set(pySortOrder-1,current.getString("pyFieldLabel")); 
       categorizedColHiddenList.set(pySortOrder-1,ishidden); 
	 } 
   } 
} 
categorizeJson.append("]");
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
ClipboardPage gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13=null;
Map selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 = null;
selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 = null; // reset the variable
gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
		 selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13 = (Map)tools.getParameterPage().getObject("selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13");
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

					ClipboardProperty prop = tools.getProperty("pgRepPgSubSectionpzViewInstancesBBBB.pxResults");

					}

					functionsMap = new HashStringMap();

					 classesMap = new HashStringMap();

					functionsMap = pega_uiengine_uiengine.pzGetRDFunctionsMap(tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB"));

					classesMap = pega_uiengine_uiengine.pzGetRDClassesMap(tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB"));

					
										 tools.getParameterPage().put("currentFunctionsMap", functionsMap);

					
										 tools.getParameterPage().put("currentClassesMap", classesMap);

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='true ");

					tools.appendString("' columnList='"+columnList.toString());

					tools.appendString("' class='yui-skin-sam gPercent grid-responsive-default ");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("' gPropIndex='pgRepPgSubSectionpzViewInstancesBBBBPpxResults4' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					tools.appendString("categorizedGrid="+pyGroupingEnabled+" ");

					if(pyGroupingEnabled) 

					tools.appendString("categorizeBy="+StringUtils.escapeIntoJSONString(categorizeJson.toString().replace(" ","&#32;")));

					tools.appendString("  dynamicColumnIndex ='1'");

					tools.appendString(" stableSort='"+!StringUtils.isBlank(pg_metaDataPage.getString("pyRankType"))+"' ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" rdParams=\"\" pyPageSize = '");

					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pyPaginateActivity=\"\" pySortHandled=\"false\" pyFilterHandled=\"false\">");

					

					tools.appendString("\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201704040320550048263-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"pgRepPgSubSectionpzViewInstancesBBBBPpxResults4colWidthGBL\" id=\"pgRepPgSubSectionpzViewInstancesBBBBPpxResults4colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("pgRepPgSubSectionpzViewInstancesBBBBPpxResults4colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"pgRepPgSubSectionpzViewInstancesBBBBPpxResults4colWidthGBR\" id=\"pgRepPgSubSectionpzViewInstancesBBBBPpxResults4colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("pgRepPgSubSectionpzViewInstancesBBBBPpxResults4colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("pgRepPgSubSectionpzViewInstancesBBBBPpxResults4colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PL_PROP='");

					
tools.appendString("pgRepPgSubSectionpzViewInstancesBBBB.pxResults");

					tools.appendString("' PL_PROP_CLASS='");

					tools.appendString(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null ? tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)).getStringIfPresent("pyClassName") : "@baseclass" );

					tools.appendString("' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					ClipboardProperty currentProp = null;

					ClipboardPage current = null;

					String strHeaderLabel = null;

					String strColumnProp = null;

					String strColumnWidth = null;

					String strSortOrder = null;

					String strSortType = null;

					String filterType = "";

					catColCnt = 0;

					for(int i=1; i<=cp_rdListFields.size();i++){

					ClipboardPage controlInfoPage = null;

					
					current = cp_rdListFields.getPageValue(i);

					
					
					 if(current.getBoolean(".pyIsCategorized")|| current.getBoolean("pyIsColumnHide")){catColCnt++;   } 

					
					
					
					currentProp = cp_rdListFields.getPropertyValue(i);

					
					
					
					if(!("true".equals(current.getString("pyIsColumnHide")))) {

					
					
					
					tools.putParamValue("DataAtrributeName",current.getString("pyFieldLabel"));

					
					
					
					strHeaderLabel = current.getString("pyFieldLabel");

					
					
					
					strColumnProp = current.getString("pyFieldName");

					
					
					
					strSortOrder  = current.getString("pySortOrder");

					
					
					
					strSortType = current.getString("pySortType");

					
					
					
					tools.putParamValue("sortField",current.getString("pyFieldName"));

					
					
					
					tools.putParamValue("pyColumnWidthUnit","");

					
					
					
					if(("px".equals(current.getStringIfPresent("pyColumnWidthUnit"))) && current.getStringIfPresent("pyColumnWidth")!=null ){

					
					
					
					strColumnWidth = current.getString("pyColumnWidth"); } else if(("percent".equals(current.getString("pyColumnWidthUnit"))) ){

					
					
					
					strColumnWidth = current.getString("pyColumnWidth");

					
					
					
					tools.putParamValue("pyColumnWidthUnit",current.getStringIfPresent("pyColumnWidthUnit"));}else{

					
					
					
					strColumnWidth = "78"; }

					
					
					
					String colName = current.getString("pyFieldName"); 
		  

					
					
					
					if(!colName.startsWith(".")){
			colName = colName.replaceFirst("\\.","_");
		}  

					
					
					
					else{
			colName = 

					
					
					
					colName.replaceFirst("\\.","");
		}
		  

					
					
					
					if(colName.startsWith("@@")) {
			colName = 

					
					
					
					colName.replaceFirst("\\@@","");  

					
					
					
					
			colName = colName.replaceAll("\\,","_").replaceAll("[^a-zA-Z0-9]+","_");
		}		
		colName = 

					
					
					
					colName.replaceAll("\\(","").replaceAll("\\)","").replaceAll("\\.","");  

					
					
					
					tools.putParamValue("RDColumnName",colName +(currentProp.indexOf()+0-catColCnt)); 

					
					
					
					visibleColCount = visibleColCount+1;

					
					
					
					tools.putParamValue("pzPropertyType",current.getString("pzPropertyType"));

					
					
					
					tools.putParamValue("strSortOrder",current.getString("pySortOrder"));

					
					
					
					if(!current.getBoolean(".pyIsCategorized")){

					
					
					
					   if(!StringUtils.isBlank(strSortOrder) && !"99999".equalsIgnoreCase(strSortOrder)){ 

					
					
					
					     strSortOrder = ""+(Integer.parseInt(strSortOrder) - categorizedColsList.size()); 

					
					
					
					     tools.putParamValue("strSortOrder", strSortOrder); 

					
					
					
					   } 

					
					
					
					if(!(pyHeaderDisplay.equalsIgnoreCase("true"))){

					
					
					
					filterType = current.getStringIfPresent("pyColumnFilteringDropDown");

					
					
					
					if(null == filterType || "".equalsIgnoreCase(filterType)){filterType = "true";}

					
					
					
					PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, current, false, false);

					
					
					
					 repeatingHeaderCell_1(strHeaderLabel,strColumnWidth,strSortOrder,strSortType,filterType,strColumnProp,headerCellSection); 

					
					
					
					pega.popStackFrame(frame_3, false);

					
					
					}

					
					}

					}
}
tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 
StringBuffer countStrJson = new StringBuffer();

 {int counter = 0; int rowsDisplayed = 0; 
String strGroupedCol = null;
String currentRow = null;
int categorizeRowCount = 0;
int prevCategoryLastRowIndex = 0;

								 {Iterator itr_3 = null;

								 itr_3 = tools.getProperty("pgRepPgSubSectionpzViewInstancesBBBB.pxResults").iterator(); 

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
										 } else if(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13, selUniqMappgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13);
										 }
										 if (gFCritPagepgRepPgSubSectionpzViewInstancesBBBB_pxResultsL13== null || 
 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 
 bFilterResult) {

										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

										 tools.getStepPage().getProperty("pyExpanded").setValue("true");
}

										 counter++; 
if(strGroupedCol == null) {
countStrJson.append("{\"" + "GCH" + tools.getParamValue("index") + "\":");
if(pyGroupingEnabled){
currentRow =gridCategoryHeaderRow_1(strGroupedCol, prevCategoryLastRowIndex,categorizedColsList,categorizedColHeadersList,categorizedColHiddenList);
}
prevCategoryLastRowIndex = tools.getActive().indexOf();
strGroupedCol = currentRow;
categorizeRowCount++;
} else {
if(pyGroupingEnabled){
currentRow =gridCategoryHeaderRow_1(strGroupedCol, prevCategoryLastRowIndex,categorizedColsList,categorizedColHeadersList,categorizedColHiddenList);
}
prevCategoryLastRowIndex = tools.getActive().indexOf();
if(strGroupedCol.equalsIgnoreCase(currentRow)) {
strGroupedCol = currentRow;
categorizeRowCount++;
} else {
countStrJson.append(categorizeRowCount);
categorizeRowCount = 1;
countStrJson.append(",\"" + "GCH" + tools.getParamValue("index") + "\":");
strGroupedCol = currentRow;
}
}
 rowsDisplayed++; 
tools.putSaveValue("curRowNum",""+rowsDisplayed );

						 tools.putParamValue("expandRL","true");

							 tools.putSaveValue("recordNumber",String.valueOf(Integer.parseInt(tools.getParamValue("startIndex")) + tools.getActive().indexOf() - 1));

							 if(categorizeRowCount%2==0) { 
 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 
tools.appendString("\n\t\t\t\t\t\t\t<tr class='");
 
								 if(!bGenerationForOffline) {
tools.appendString(tools.getSaveValue("rowClass"));  
}
tools.appendString(" cellCont' ");
 
								 if(bGenerationForOffline) {
tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());
tools.appendString(" ng-repeat=\"Item in rootData.pgRepPgSubSectionpzViewInstancesBBBB.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");
 
								 }

 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

 ct_gridAction.trackValueChanges(tools.getProperty(".pxObjClass"),-1);

 ct_gridAction.trackValueChanges(tools.getProperty(".pyPurpose"),-1);

 ct_gridAction.trackValueChanges(tools.getProperty(".pyClassName"),-1);

 ct_gridAction.trackValueChanges(tools.getProperty(".pzInsKey"),-1);

 }}catch(Exception e){}
tools.appendString(" data-gargs='[");
tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pxObjClass").getStringValue()) );tools.appendString("\"");tools.appendString(",");tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyPurpose").getStringValue()) );tools.appendString("\"");tools.appendString(",");tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyClassName").getStringValue()) );tools.appendString("\"");tools.appendString(",");tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pzInsKey").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");
 tools.putParamValue("GenOAFunc", "true"); 
gridOpenActionIncl_1();
tools.appendString(" id='");
String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("' ");
{
String tempTestID = "";
String rowTestID = "R";
 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("pgRepPgSubSectionpzViewInstancesBBBB.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodespgRepPgSubSectionpzViewInstancesBBBB.pxResults4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 
if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){
String strEntryHandlePLProp = "";
try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("pgRepPgSubSectionpzViewInstancesBBBB.pxResults"); } catch (Exception ex) { }
if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}
tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");
String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;
for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}
if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){
rowTestID = rowTestID.substring(0,rowTestID.length()-1);
}
}
tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201704040320550048263-" + rowTestID) + " ");
}
tools.appendString(" PL_INDEX = '");
if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");
tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");
String strPropName = null;
catColCnt = 0;
for(int i=1; i<=cp_rdListFields.size();i++){
ClipboardPage controlInfoPage = null;

					current = cp_rdListFields.getPageValue(i);

					
					 if(current.getBoolean(".pyIsCategorized")|| current.getBoolean("pyIsColumnHide")){catColCnt++;   } 

					
					
					currentProp = cp_rdListFields.getPropertyValue(i);

					
					
					if(!("true".equals(current.getString("pyIsColumnHide")))) {

					
					
					tools.putParamValue("DataAtrributeName",current.getString("pyFieldLabel"));

					
					
					tools.putParamValue("propTypeForFormatting",current.getString(".pyDataType")); if(current.getString(".pyDataType").replace(" ","").equalsIgnoreCase("DateTime")){tools.putParamValue("propTypeForFormatting",ImmutablePropertyInfo.TYPE_DATETIME);}

					
					
					strPropName = current.getString("pyFieldName");

					
					
					String strpyAutoHTML = current.getPage("pyFieldFormat").getString("pyAutoHTML");

					
					
					if("true".equals(strpyAutoHTML)){

					
					
					ClipboardProperty modesProp = current.getPage("pyFieldFormat").getIfPresent("pyMergedModes");

					
					
					 controlInfoPage = null;

					
					
					if(modesProp != null) {

					
					
					controlInfoPage = modesProp.getPageValue(2);

					
					
					}

					
					
					}

					
					
					else {

					
					
					controlInfoPage = current.getPage("pyFieldFormat");

					
					
					}

					
					
					tools.putParamValue("pyColumnWidthUnit","");

					
					
					if(("px".equals(current.getStringIfPresent("pyColumnWidthUnit"))) && current.getStringIfPresent("pyColumnWidth")!=null ){

					
					
					strColumnWidth = current.getString("pyColumnWidth"); } else if(("percent".equals(current.getString("pyColumnWidthUnit"))) ){

					
					
					strColumnWidth = current.getString("pyColumnWidth");

					
					
					tools.putParamValue("pyColumnWidthUnit",current.getStringIfPresent("pyColumnWidthUnit"));}else{

					
					
					strColumnWidth = "78"; }

					
					
					String colName = current.getString("pyFieldName"); 
		  

					
					
					if(!colName.startsWith(".")){
			colName = colName.replaceFirst("\\.","_");
		}  

					
					
					else{
			colName = 

					
					
					colName.replaceFirst("\\.","");
		}
		  

					
					
					if(colName.startsWith("@@")) {
			colName = 

					
					
					colName.replaceFirst("\\@@","");  

					
					
					
			colName = colName.replaceAll("\\,","_").replaceAll("[^a-zA-Z0-9]+","_");
		}		
		colName = 

					
					
					colName.replaceAll("\\(","").replaceAll("\\)","").replaceAll("\\.","");  

					
					
					tools.putParamValue("RDColumnName",colName +(currentProp.indexOf()+0-catColCnt)); 

					
					
					visibleColCount = visibleColCount+1;

					
					
					tools.putParamValue("pzPropertyType",current.getString("pzPropertyType"));

					
					
					tools.putParamValue("strSortOrder",current.getString("pySortOrder"));

					
					
					if(!current.getBoolean(".pyIsCategorized")){

					
					
					 repeatingDataCell_4(strPropName,controlInfoPage); 

					
					}

					}
}
tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");
 
								 if(bGenerationForOffline) {
tools.putParamValue("templateRowHandle", "");
 
								 }

						 tools.putParamValue("expandRL","false");

										} 

									  pega.popStackFrame(frame_3, false); 

								 }

									 tools.putActive(propActivePrev);
if(categorizeRowCount !=0){
countStrJson.append(categorizeRowCount + "}");
}

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
tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"");
tools.appendString(pega_uiengine_grid.pzGetGridColumnCount(1,cp_rdListFields.size()-1));tools.appendString("\" class=\"dataLabelRead gridCell\" >");

								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

								 tools.putParamValue("RenderSingle",""); 

									 ClipboardPage tempNoRespg = tools.createPage("@baseclass", "tempNoRespg");

									 tools.putParamValue("noResParam","tempNoRespg"); 

									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 
if(tools.getParamValue("showOnLoadMsg").equals("showOnLoadMsg")) {
gridNoRowsMesgIncl_1(); 
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
tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' id='categoryCounts' categoryCountsJSON='" + countStrJson.toString() + "' ></div>");
 tools.putSaveValue("isGrid", "false"); 
 { if(tools.getSaveValue("bUseMenuInline").equals("true")){ tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB").removeFromClipboard(); }}
 tools.putSaveValue("bUseMenuInline", "false");
 if( tools.getParamValue("partialTrigger").equals("getChildNodespgRepPgSubSectionpzViewInstancesBBBB.pxResults4") && tools.getParamValue("partialRefresh").equals("false")) {
	 tools.putParamValue("partialTrigger",""); 
}
pg_metaDataPage.removeFromClipboard();
tools.getParameterPage().remove("dynamicColCount");

					 /* GenerateGrid: End */
}
public void 
gridEndLayout_1() {

 tools.getParameterPage().remove("pyReportPageName"); 

 tools.getParameterPage().remove("pyGridFilterCriteriaPage"); 
tools.appendString("</div></div>");
}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</div>");
}
public void pzLayout_4() {
String gridLayoutMethodName="pzLayout_4";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2== rx.pzViewInstanceOfClassNotExists cffalse wxpzClassCanWriteInstances",".pzViewInstanceOfClassNotExists = false && pzClassCanWriteInstances", "layout", "visible" )) {pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_5();
 LayoutWrapperTableEnd_1(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-noheader layout-noheader-errors'>");
 String clsScroll= "";tools.appendString("<div section_index='3' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxDisplayText_5() {String key="41||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","false","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","41"};oCellRuntimeParamsMap.put("41||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",paramValues);oControlPathsMap.put("41||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(5)");}


public void pxDisplayText_4() {String key="40||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","false","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","40"};oCellRuntimeParamsMap.put("40||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",paramValues);oControlPathsMap.put("40||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");}


public void pxDisplayText_3() {String key="39||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","false","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","39"};oCellRuntimeParamsMap.put("39||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",paramValues);oControlPathsMap.put("39||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");}


public void pxDisplayText_2() {String key="38||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","false","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","38"};oCellRuntimeParamsMap.put("38||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",paramValues);oControlPathsMap.put("38||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");}


public void pxDisplayText_1() {String key="37||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","","","","false","SIMPLELAYOUT","SIMPLELAYOUT","",""," cffalse","T","false","0","","","Text","true","37"};oCellRuntimeParamsMap.put("37||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",paramValues);oControlPathsMap.put("37||RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");}


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	isCellReadOnly = true;
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("2015031203281801115637-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
	tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2015031203281801115637-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</label>");
}
tools.appendString("<div class='field-item dataValueRead'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDisplayText_1();
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2015031203281801115637-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyTemplateDisplayText");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	isCellReadOnly = true;
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20150312035110045128183-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
	tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20150312035110045128183-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</label>");
}
tools.appendString("<div class='field-item dataValueRead'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDisplayText_2();
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150312035110045128183-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyTemplateDisplayText");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pySelectedClass",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	isCellReadOnly = true;
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20150312034851036610380-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pySelectedClass"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
	tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20150312034851036610380-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pySelectedClass"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</label>");
}
tools.appendString("<div class='field-item dataValueRead'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDisplayText_3();
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150312034851036610380-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pySelectedClass");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pySelectedClass",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
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


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	isCellReadOnly = true;
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20150312035110045128183-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
	tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20150312035110045128183-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</label>");
}
tools.appendString("<div class='field-item dataValueRead'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDisplayText_4();
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150312035110045128183-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyTemplateDisplayText");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
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


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(5)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	isCellReadOnly = true;
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20150312034354022854713-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
	tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20150312034354022854713-Label") + "  class='field-caption dataLabelForRead' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyTemplateDisplayText"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	isSecCellReadOnly = true;
tools.appendString(tools.getLocalizedTextForString("pyCaption","") + "</label>");
}
tools.appendString("<div class='field-item dataValueRead'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxDisplayText_5();
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150312034354022854713-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxDisplayText");
	pgCells.put("forLabel",".pyTemplateDisplayText");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxDisplayText",".pyTemplateDisplayText",".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(5)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxDisplayText_5();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpzViewInstancesBBB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash13 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash13 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash13 != null && !"".equals(spxUniqueStreamHash13)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash13,pxUniqueStreamHash+"_13");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("2018062505002900434") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}") + " class='" + " content  layout-content-inline content-inline  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash13 != null && !"".equals(spxUniqueStreamHash13)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_13");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","inline");
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
	String paramName = "EXPANDEDSubSectionpzViewInstancesBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(3)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-errors");
	metadataPage.put("sectionIndex","3");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" rx.pzViewInstanceOfClassNotExists", pxUniqueStreamHash+"_24");metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_24");
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
if(pzAuto.handleEvaluateWhen(" rx.pzViewInstanceOfClassNotExists",".pzViewInstanceOfClassNotExists", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_4();
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
public void pzLayoutBodyWrapper_3() {
tools.appendString("<div class='layout layout-noheader layout-noheader-information'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("Paragraph","pzClassCanNotHaveInstances",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-paragraph item-" + Integer.toString(index) + "    " + pzSection.getCustomStyle(false, "","margin-r-1x","margin-r-1x")  + " flex '  STRING_TYPE='paragraph' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
	StringMap keys = new HashStringMap();
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y' && pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata(); 
		keys.putString("pyClassName", tools.getStepPage().getString("pxObjClass"));
		keys.putString("pyStreamName","pzClassCanNotHaveInstances" );
		keys.putString("pxObjClass","RULE-HTML-PARAGRAPH" );
		try{
			ClipboardPage paragraphPage = tools.getDatabase().open(keys,false);
			String sourceStream = paragraphPage.getString("pySourceStream");
			String className = paragraphPage.getString("pyClassName");
			String pattern = "<pega:(?!reference)|<p:(?!r)|<(?=%)|<pega:reference.*(?=format=)";
			java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
			java.util.regex.Matcher m = r.matcher(sourceStream);
			if(m.find()){
				tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
				keys.putString("pxObjClass", "Rule-HTML-Paragraph");
				keys.putString("pyStreamName","pzClassCanNotHaveInstances" );
				tools.appendStream(keys);
				}else{
					metadataPage.putString("pzSectionContext", tools.getStepPage().getReference());
					metadataPage.putString("pxInsName", paragraphPage.getString("pxInsName"));
					Map<String, String> paraRecord = new HashMap<String, String>();
					paraRecord.put("pxInsName", paragraphPage.getString("pxInsName"));
					pzPackageRuntime.getRecordManager().getParagraphRecorder().record(paraRecord);
					IUIComponent ctrlComponent = pzAuto.getUIComponent();
					ctrlComponent.beginComponent("pxParagraph",metadataPage);
					ctrlComponent.setTrackedProperties(new String[]{"pxInsName","pzSectionContext"});
					ctrlComponent.endComponent();
				}
			}
			catch(DatabaseException e){oLog.error("ENGIN API:Could not found Paragraph rule - @baseclass!pzClassCanNotHaveInstances ", e);}
		}else{
			tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
			keys.putString("pxObjClass", "Rule-HTML-Paragraph");
			keys.putString("pyStreamName","pzClassCanNotHaveInstances" );
			tools.appendStream(keys);
			}
			tools.appendString("</div>");
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
			pgCells.put("pyType","paragraph");
			pgCells.put("pyLabelReserveSpace","true");
			pgCells.put("partialClass","flex");
			pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201602251332220487175268-Label")).append(" ").toString().replace("data-test-id=","").trim());
			pgCells.put("spanClass","iconRequired standard_iconRequired");
			pgCells.put("customROStyles","margin-r-1x");
			pgCells.put("customRWStyles","margin-r-1x");
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
			String inspectorData=pzCell.getInspectorDataDynamic("Paragraph","pzClassCanNotHaveInstances",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
			if(!inspectorData.isEmpty()) {
			pgCells.put("liveUI",inspectorData);
			}
			boolean nonTemplateBegin = true;
			if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
				 nonTemplateBegin = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11");
				}
				if(nonTemplateBegin){
				StringMap keys = new HashStringMap();
				if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y' && pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata(); 
					keys.putString("pyClassName", tools.getStepPage().getString("pxObjClass"));
					keys.putString("pyStreamName","pzClassCanNotHaveInstances" );
					keys.putString("pxObjClass","RULE-HTML-PARAGRAPH" );
					try{
						ClipboardPage paragraphPage = tools.getDatabase().open(keys,false);
						String sourceStream = paragraphPage.getString("pySourceStream");
						String className = paragraphPage.getString("pyClassName");
						String pattern = "<pega:(?!reference)|<p:(?!r)|<(?=%)|<pega:reference.*(?=format=)";
						java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
						java.util.regex.Matcher m = r.matcher(sourceStream);
						if(m.find()){
							tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
							keys.putString("pxObjClass", "Rule-HTML-Paragraph");
							keys.putString("pyStreamName","pzClassCanNotHaveInstances" );
							tools.appendStream(keys);
							}else{
								metadataPage.putString("pzSectionContext", tools.getStepPage().getReference());
								metadataPage.putString("pxInsName", paragraphPage.getString("pxInsName"));
								Map<String, String> paraRecord = new HashMap<String, String>();
								paraRecord.put("pxInsName", paragraphPage.getString("pxInsName"));
								pzPackageRuntime.getRecordManager().getParagraphRecorder().record(paraRecord);
								IUIComponent ctrlComponent = pzAuto.getUIComponent();
								ctrlComponent.beginComponent("pxParagraph",metadataPage);
								ctrlComponent.setTrackedProperties(new String[]{"pxInsName","pzSectionContext"});
								ctrlComponent.endComponent();
							}
						}
						catch(DatabaseException e){oLog.error("ENGIN API:Could not found Paragraph rule - @baseclass!pzClassCanNotHaveInstances ", e);}
					}else{
						tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
						keys.putString("pxObjClass", "Rule-HTML-Paragraph");
						keys.putString("pyStreamName","pzClassCanNotHaveInstances" );
						tools.appendStream(keys);
						}
						}
						if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
							pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
							}
							labelName = "pzClassCanNotHaveInstances";
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzViewInstancesBB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("no-unlock-ruleset-to-convert-message") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + "flex  content  layout-content-mimic_a_sentence content-mimic_a_sentence " + "'  ");
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
		pg_dlmeta.put("format","mimic_a_sentence");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
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
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzViewInstancesBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-information");
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxpzClassCanWriteInstances", pxUniqueStreamHash+"_12");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_12");
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
if(pzAuto.handleEvaluateWhen(" o1! wxpzClassCanWriteInstances","!pzClassCanWriteInstances", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_3();
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
public void pzLayoutBodyWrapper_2() {
tools.appendString("<div class='layout layout-noheader layout-noheader-information'>");
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
	tools.appendString("' " + pzCell.getInspectorDataDynamic("Paragraph","pzSomeKeysAreNotExposed",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-paragraph item-" + Integer.toString(index) + "    " + pzSection.getCustomStyle(false, "","margin-r-1x","margin-r-1x")  + " flex '  STRING_TYPE='paragraph' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
	StringMap keys = new HashStringMap();
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y' && pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata(); 
		keys.putString("pyClassName", tools.getStepPage().getString("pxObjClass"));
		keys.putString("pyStreamName","pzSomeKeysAreNotExposed" );
		keys.putString("pxObjClass","RULE-HTML-PARAGRAPH" );
		try{
			ClipboardPage paragraphPage = tools.getDatabase().open(keys,false);
			String sourceStream = paragraphPage.getString("pySourceStream");
			String className = paragraphPage.getString("pyClassName");
			String pattern = "<pega:(?!reference)|<p:(?!r)|<(?=%)|<pega:reference.*(?=format=)";
			java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
			java.util.regex.Matcher m = r.matcher(sourceStream);
			if(m.find()){
				tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
				keys.putString("pxObjClass", "Rule-HTML-Paragraph");
				keys.putString("pyStreamName","pzSomeKeysAreNotExposed" );
				tools.appendStream(keys);
				}else{
					metadataPage.putString("pzSectionContext", tools.getStepPage().getReference());
					metadataPage.putString("pxInsName", paragraphPage.getString("pxInsName"));
					Map<String, String> paraRecord = new HashMap<String, String>();
					paraRecord.put("pxInsName", paragraphPage.getString("pxInsName"));
					pzPackageRuntime.getRecordManager().getParagraphRecorder().record(paraRecord);
					IUIComponent ctrlComponent = pzAuto.getUIComponent();
					ctrlComponent.beginComponent("pxParagraph",metadataPage);
					ctrlComponent.setTrackedProperties(new String[]{"pxInsName","pzSectionContext"});
					ctrlComponent.endComponent();
				}
			}
			catch(DatabaseException e){oLog.error("ENGIN API:Could not found Paragraph rule - @baseclass!pzSomeKeysAreNotExposed ", e);}
		}else{
			tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
			keys.putString("pxObjClass", "Rule-HTML-Paragraph");
			keys.putString("pyStreamName","pzSomeKeysAreNotExposed" );
			tools.appendStream(keys);
			}
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
			pgCells.put("pyType","paragraph");
			pgCells.put("pyLabelReserveSpace","true");
			pgCells.put("partialClass","flex");
			pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201602251332220487175268-Label")).append(" ").toString().replace("data-test-id=","").trim());
			pgCells.put("spanClass","iconRequired standard_iconRequired");
			pgCells.put("customROStyles","margin-r-1x");
			pgCells.put("customRWStyles","margin-r-1x");
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
			String inspectorData=pzCell.getInspectorDataDynamic("Paragraph","pzSomeKeysAreNotExposed",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
			if(!inspectorData.isEmpty()) {
			pgCells.put("liveUI",inspectorData);
			}
			boolean nonTemplateBegin = true;
			if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
				 nonTemplateBegin = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6");
				}
				if(nonTemplateBegin){
				StringMap keys = new HashStringMap();
				if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y' && pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata(); 
					keys.putString("pyClassName", tools.getStepPage().getString("pxObjClass"));
					keys.putString("pyStreamName","pzSomeKeysAreNotExposed" );
					keys.putString("pxObjClass","RULE-HTML-PARAGRAPH" );
					try{
						ClipboardPage paragraphPage = tools.getDatabase().open(keys,false);
						String sourceStream = paragraphPage.getString("pySourceStream");
						String className = paragraphPage.getString("pyClassName");
						String pattern = "<pega:(?!reference)|<p:(?!r)|<(?=%)|<pega:reference.*(?=format=)";
						java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
						java.util.regex.Matcher m = r.matcher(sourceStream);
						if(m.find()){
							tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
							keys.putString("pxObjClass", "Rule-HTML-Paragraph");
							keys.putString("pyStreamName","pzSomeKeysAreNotExposed" );
							tools.appendStream(keys);
							}else{
								metadataPage.putString("pzSectionContext", tools.getStepPage().getReference());
								metadataPage.putString("pxInsName", paragraphPage.getString("pxInsName"));
								Map<String, String> paraRecord = new HashMap<String, String>();
								paraRecord.put("pxInsName", paragraphPage.getString("pxInsName"));
								pzPackageRuntime.getRecordManager().getParagraphRecorder().record(paraRecord);
								IUIComponent ctrlComponent = pzAuto.getUIComponent();
								ctrlComponent.beginComponent("pxParagraph",metadataPage);
								ctrlComponent.setTrackedProperties(new String[]{"pxInsName","pzSectionContext"});
								ctrlComponent.endComponent();
							}
						}
						catch(DatabaseException e){oLog.error("ENGIN API:Could not found Paragraph rule - @baseclass!pzSomeKeysAreNotExposed ", e);}
					}else{
						tools.appendString("<span style=display:none;  " + pzCell.getTestIdIfEnabled("201602251332220487175268") + " ></span>");
						keys.putString("pxObjClass", "Rule-HTML-Paragraph");
						keys.putString("pyStreamName","pzSomeKeysAreNotExposed" );
						tools.appendStream(keys);
						}
						}
						if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
							pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
							}
							labelName = "pzSomeKeysAreNotExposed";
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
pzSection.getLayout().setExpandParam("SubSectionpzViewInstancesB","",false);
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
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("no-unlock-ruleset-to-convert-message") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-mimic_a_sentence content-mimic_a_sentence " + "'  ");
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
		pg_dlmeta.put("format","mimic_a_sentence");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
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
	String paramName = "EXPANDEDSubSectionpzViewInstancesB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-information");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& wxpzInstanceListSourcedFromListView wxpzClassCanWriteInstances", pxUniqueStreamHash+"_7");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_7");
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
if(pzAuto.handleEvaluateWhen(" o2&& wxpzInstanceListSourcedFromListView wxpzClassCanWriteInstances","pzInstanceListSourcedFromListView && pzClassCanWriteInstances", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_2();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void 
pegaReferenceTag_3(String strPropName, String controlName, ClipboardPage paramPg) {
try {
 java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 
if(paramPg != null) {java.util.Collection propertiesCollection = paramPg.values();ClipboardProperty cp_thisProperty;String propertyName, propertyValue;java.util.Iterator propertiesIter = propertiesCollection.iterator();com.pega.pegarules.jsptags.ParamTag params = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);params.setPageContext(pageContext);while (propertiesIter.hasNext()) {cp_thisProperty = (ClipboardProperty) propertiesIter.next();propertyName = cp_thisProperty.getName();propertyValue = cp_thisProperty.getStringValue();if(propertyValue.length() > 0){if(true) {if(propertyValue.charAt(0) == '"' && propertyValue.charAt(propertyValue.length()-1)== '"'){propertyValue = propertyValue.substring(1, propertyValue.length()-1);}params.setName(propertyName);params.setValue(propertyValue);}else{params.setName(propertyName);params.setRef(propertyValue);}}params.doStartTag();}}

/*
 * reference tag
 * Cannot inline because: format is JSP expression
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__3 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__3.setPageContext(pageContext);
_jspx_th_pega_reference__3.setParent(mParentTag);
_jspx_th_pega_reference__3.setName((String)functionsMap.get(strPropName));
_jspx_th_pega_reference__3.setMode("input");
_jspx_th_pega_reference__3.setFormat(controlName);
int _jspx_eval_pega_reference__3 = _jspx_th_pega_reference__3.doStartTag();
if (_jspx_th_pega_reference__3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__3);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_3(String strPropName,ClipboardPage controlInfoPage) {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamValue("DataAtrributeName"), StreamBuilder.FMT_NORMAL)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",strPropName, ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:22px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_3(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_3(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_3(strPropName, "", null);}}} else {

				pegaReferenceTag_3(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_3(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_3(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_3(strPropName, "", null);}}} else {

				pegaReferenceTag_3(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
pegaReferenceTag_2(String strPropName, String controlName, ClipboardPage paramPg) {
try {
 java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 
if(paramPg != null) {java.util.Collection propertiesCollection = paramPg.values();ClipboardProperty cp_thisProperty;String propertyName, propertyValue;java.util.Iterator propertiesIter = propertiesCollection.iterator();com.pega.pegarules.jsptags.ParamTag params = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);params.setPageContext(pageContext);while (propertiesIter.hasNext()) {cp_thisProperty = (ClipboardProperty) propertiesIter.next();propertyName = cp_thisProperty.getName();propertyValue = cp_thisProperty.getStringValue();if(propertyValue.length() > 0){if(true) {if(propertyValue.charAt(0) == '"' && propertyValue.charAt(propertyValue.length()-1)== '"'){propertyValue = propertyValue.substring(1, propertyValue.length()-1);}params.setName(propertyName);params.setValue(propertyValue);}else{params.setName(propertyName);params.setRef(propertyValue);}}params.doStartTag();}}

/*
 * reference tag
 * Cannot inline because: format is JSP expression
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__2 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__2.setPageContext(pageContext);
_jspx_th_pega_reference__2.setParent(mParentTag);
_jspx_th_pega_reference__2.setName((String)functionsMap.get(strPropName));
_jspx_th_pega_reference__2.setMode("input");
_jspx_th_pega_reference__2.setFormat(controlName);
int _jspx_eval_pega_reference__2 = _jspx_th_pega_reference__2.doStartTag();
if (_jspx_th_pega_reference__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__2);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_2(String strPropName,ClipboardPage controlInfoPage) {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",strPropName, ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_2(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_2(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_2(strPropName, "", null);}}} else {

				pegaReferenceTag_2(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_2(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_2(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_2(strPropName, "", null);}}} else {

				pegaReferenceTag_2(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
pegaReferenceTag_1(String strPropName, String controlName, ClipboardPage paramPg) {
try {
 java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 
if(paramPg != null) {java.util.Collection propertiesCollection = paramPg.values();ClipboardProperty cp_thisProperty;String propertyName, propertyValue;java.util.Iterator propertiesIter = propertiesCollection.iterator();com.pega.pegarules.jsptags.ParamTag params = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);params.setPageContext(pageContext);while (propertiesIter.hasNext()) {cp_thisProperty = (ClipboardProperty) propertiesIter.next();propertyName = cp_thisProperty.getName();propertyValue = cp_thisProperty.getStringValue();if(propertyValue.length() > 0){if(true) {if(propertyValue.charAt(0) == '"' && propertyValue.charAt(propertyValue.length()-1)== '"'){propertyValue = propertyValue.substring(1, propertyValue.length()-1);}params.setName(propertyName);params.setValue(propertyValue);}else{params.setName(propertyName);params.setRef(propertyValue);}}params.doStartTag();}}

/*
 * reference tag
 * Cannot inline because: format is JSP expression
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName((String)functionsMap.get(strPropName));
_jspx_th_pega_reference__1.setMode("input");
_jspx_th_pega_reference__1.setFormat(controlName);
int _jspx_eval_pega_reference__1 = _jspx_th_pega_reference__1.doStartTag();
if (_jspx_th_pega_reference__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__1);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_1(String strPropName,ClipboardPage controlInfoPage) {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamValue("DataAtrributeName"), StreamBuilder.FMT_NORMAL)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",strPropName, ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:22px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_1(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_1(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_1(strPropName, "", null);}}} else {

				pegaReferenceTag_1(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
 strPropName = pega_uiengine_grid.pzNormalizeKey(strPropName);java.util.Map functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");String returnVal = tools.getStepPage().getStringIfPresent((String)functionsMap.get(strPropName));if(controlInfoPage != null && returnVal != null){String strpyAutoHTML = null; if("Embed-Control-Mode".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = "true"; }else if("Embed-ReportHtmlProp".equals(controlInfoPage.getStringIfPresent("pxObjClass"))) { strpyAutoHTML = controlInfoPage.getStringIfPresent("pyAutoHTML"); }boolean bpyNonAutoHTML = !"true".equals(strpyAutoHTML);if(bpyNonAutoHTML) {String nonAutoCtrlName = controlInfoPage.getStringIfPresent("pyPropertyName");if(nonAutoCtrlName != null && nonAutoCtrlName.length() != 0) {ClipboardProperty parametersProp = controlInfoPage.getIfPresent("pyPropertyParameters");ClipboardPage paramPg = null;if(parametersProp != null) {paramPg = parametersProp.getPageValue();}pegaReferenceTag_1(strPropName, nonAutoCtrlName, paramPg);}else { pegaReferenceTag_1(strPropName, "", null);}} else {try { 
 ClipboardProperty cpTemp = tools.getStepPage().getProperty((String)functionsMap.get(strPropName)); 
ClipboardProperty oldActiveProp = tools.getActive(); 
tools.putActive(cpTemp); 
com.pega.pegarules.pub.security.PropertySecurityInfo propertySecurityInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), cpTemp, tools);
if(propertySecurityInfo.getPropType().toString().equals("ENCRYPTED")){
returnVal = pega_uiengine_formatter.pxFormatValue(propertySecurityInfo.getPropValue(),controlInfoPage, true,true);
}else{
returnVal = pega_uiengine_formatter.pxFormatValue(returnVal,controlInfoPage, true,true); 
}
tools.putActive(oldActiveProp); } catch(Exception e) {}if(!("".equals(returnVal))) { tools.appendString(returnVal);}else { 
				pegaReferenceTag_1(strPropName, "", null);}}} else {

				pegaReferenceTag_1(strPropName, "", null);}
				getInlineStyle_1();
								String columnName = "1";
								String subScriptForColumn = columnName;
								int columnNumberDT = 1;
								int columnNumber = 1;}
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


public void pgRepPgSubSectionpzViewInstancesBBBB_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"OPEN\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"runScript\", [\"OpenRuleInPortal(");
String strPropReference51 = "#~.pxObjClass$0$~#";
String strFormattedPropReference51 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference51);
if(strPropReference51.equals(strFormattedPropReference51)) {
tools.appendString("\\\"");
tools.appendFormatted(strFormattedPropReference51.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
tools.appendString("\\\"");
} else {
tools.appendFormatted(strFormattedPropReference51.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
}
tools.appendString(",");
String strPropReference52 = "#~.pyPurpose$1$~#";
String strFormattedPropReference52 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference52);
if(strPropReference52.equals(strFormattedPropReference52)) {
tools.appendString("\\\"");
tools.appendFormatted(strFormattedPropReference52.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
tools.appendString("\\\"");
} else {
tools.appendFormatted(strFormattedPropReference52.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
}
tools.appendString(",");
String strPropReference53 = "#~.pyClassName$2$~#";
String strFormattedPropReference53 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference53);
if(strPropReference53.equals(strFormattedPropReference53)) {
tools.appendString("\\\"");
tools.appendFormatted(strFormattedPropReference53.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
tools.appendString("\\\"");
} else {
tools.appendFormatted(strFormattedPropReference53.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
}
tools.appendString(",\\\"\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"openRule\",[\"");

		tools.appendString("#~.pzInsKey$3$~#");tools.appendString("\",\"true\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\"]");

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
String resultsPage = "" ;
resultsPage = "pgRepPgSubSectionpzViewInstancesBBBB";
ClipboardPage pg_metaDataPage = null;
String optimizeFilter = tools.getParamValue("optimizeFilter"); 
if("true".equals(optimizeFilter)){ 
pg_metaDataPage = tools.findPage("pgRepPgSubSectionpzViewInstancesBBBBMETADATA");
}
 if(pg_metaDataPage == null){ 
HashStringMap metaDataKeys = new HashStringMap();
metaDataKeys.put("pxObjClass","Rule-Obj-Activity");
metaDataKeys.put("pyClassName","Rule-Obj-Report-Definition");
metaDataKeys.put("pyActivityName","pxRetrieveReportMetaData");
tools.putParamValue("pyReportName","pyInstanceList");
tools.putParamValue("pyReportClass","@baseclass");
if(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null){
if("Rule-Obj-Report-Definition".equals(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)).getClassName())){
tools.putParamValue("pyReportPageName",pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true));
}
}
tools.putParamValue("pyPageName","pgRepPgSubSectionpzViewInstancesBBBBMETADATA");
ClipboardPage tempDummy = tools.createPage("@baseclass", "tempdummy");
tools.doActivity(metaDataKeys,tempDummy ,null);
tempDummy.removeFromClipboard();
pg_metaDataPage = tools.findPage("pgRepPgSubSectionpzViewInstancesBBBBMETADATA");
 } 
HashStringMap unCategorizedOrHiddenColsKeys = new HashStringMap();
int gridColIndex = 1; 
int pyGroupingSortNumber = pg_metaDataPage.getInteger("pyGroupingSortNumber"); 
tools.putParamValue("pyGroupingSortNumber",pyGroupingSortNumber+"");
ClipboardProperty cp_rdListFields = pg_metaDataPage.getProperty("pyListFields");
for(int i=1; i<=cp_rdListFields.size();i++){
	ClipboardPage RDColumn = cp_rdListFields.getPageValue(i);
	if(!("true".equals(RDColumn.getString("pyIsColumnHide"))) && !("true".equals(RDColumn.getString("pyIsCategorized")))) {
	dynamicColCount +=  1;
	     unCategorizedOrHiddenColsKeys.put(""+gridColIndex,""+i); 
	     gridColIndex = gridColIndex + 1; 
	}
}
tools.putParamValue("dynamicColCount",dynamicColCount);
String maxSortOrder = pg_metaDataPage.getString("pyMaxSortOrder");
tools.putParamValue("maxSortOrder",maxSortOrder);
String pyHeaderDisplay = pg_metaDataPage.getString("pyHeaderDisplay"); 
tools.putParamValue("pyHeaderDisplay",pyHeaderDisplay);
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					if(tools.getParamValue("partialTrigger").equals("appendTopgRepPgSubSectionpzViewInstancesBBBB.pxResults4")|| tools.getParamValue("partialTrigger").equals("editRowpgRepPgSubSectionpzViewInstancesBBBB.pxResults4") ){

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

					ClipboardProperty pageListProp = tools.getProperty("pgRepPgSubSectionpzViewInstancesBBBB.pxResults");

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

					
							 tools.putSaveValue("recordNumber",String.valueOf(Integer.parseInt(tools.getParamValue("startIndex")) + tools.getActive().indexOf() - 1));

					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.pgRepPgSubSectionpzViewInstancesBBBB.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pxObjClass"),-1);

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pyPurpose"),-1);

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pyClassName"),-1);

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pzInsKey"),-1);

					
 }}catch(Exception e){}

					tools.appendString(" data-gargs='[");

					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pxObjClass").getStringValue()) );tools.appendString("\"");tools.appendString(",");tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyPurpose").getStringValue()) );tools.appendString("\"");tools.appendString(",");tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyClassName").getStringValue()) );tools.appendString("\"");tools.appendString(",");tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pzInsKey").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");

					 tools.putParamValue("GenOAFunc", "true"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("pgRepPgSubSectionpzViewInstancesBBBB.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodespgRepPgSubSectionpzViewInstancesBBBB.pxResults4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("pgRepPgSubSectionpzViewInstancesBBBB.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201704040320550048263-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					 functionsMap = new HashStringMap();

					 classesMap = new HashStringMap();

					functionsMap = pega_uiengine_uiengine.pzGetRDFunctionsMap(tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB"));

					classesMap = pega_uiengine_uiengine.pzGetRDClassesMap(tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB"));

					
										 tools.getParameterPage().put("currentFunctionsMap", functionsMap);

					
										 tools.getParameterPage().put("currentClassesMap", classesMap);

					ClipboardPage current = null;

					ClipboardProperty currentProp = null;

					String strColumnWidth = null;

					String strPropName = null;

					catColCnt = 0;

					for(int i=1; i<=cp_rdListFields.size();i++){

					ClipboardPage controlInfoPage = null;

					
					current = cp_rdListFields.getPageValue(i);

					
					
					 if(current.getBoolean(".pyIsCategorized")|| current.getBoolean("pyIsColumnHide")){catColCnt++;   } 

					
					
					
					currentProp = cp_rdListFields.getPropertyValue(i);

					
					
					
					if(!("true".equals(current.getString("pyIsColumnHide")))) {

					
					
					
					tools.putParamValue("DataAtrributeName",current.getString("pyFieldLabel"));

					
					
					
					tools.putParamValue("propTypeForFormatting",current.getString(".pyDataType")); if(current.getString(".pyDataType").replace(" ","").equalsIgnoreCase("DateTime")){tools.putParamValue("propTypeForFormatting",ImmutablePropertyInfo.TYPE_DATETIME);}

					
					
					
					strPropName = current.getString("pyFieldName");

					
					
					
					String strpyAutoHTML = current.getPage("pyFieldFormat").getString("pyAutoHTML");

					
					
					
					if("true".equals(strpyAutoHTML)){

					
					
					
					ClipboardProperty modesProp = current.getPage("pyFieldFormat").getIfPresent("pyMergedModes");

					
					
					
					 controlInfoPage = null;

					
					
					
					if(modesProp != null) {

					
					
					
					controlInfoPage = modesProp.getPageValue(2);

					
					
					
					}

					
					
					
					}

					
					
					
					else {

					
					
					
					controlInfoPage = current.getPage("pyFieldFormat");

					
					
					
					}

					
					
					
					tools.putParamValue("pyColumnWidthUnit","");

					
					
					
					if(("px".equals(current.getStringIfPresent("pyColumnWidthUnit"))) && current.getStringIfPresent("pyColumnWidth")!=null ){

					
					
					
					strColumnWidth = current.getString("pyColumnWidth"); } else if(("percent".equals(current.getString("pyColumnWidthUnit"))) ){

					
					
					
					strColumnWidth = current.getString("pyColumnWidth");

					
					
					
					tools.putParamValue("pyColumnWidthUnit",current.getStringIfPresent("pyColumnWidthUnit"));}else{

					
					
					
					strColumnWidth = "78"; }

					
					
					
					String colName = current.getString("pyFieldName"); 
		  

					
					
					
					if(!colName.startsWith(".")){
			colName = colName.replaceFirst("\\.","_");
		}  

					
					
					
					else{
			colName = 

					
					
					
					colName.replaceFirst("\\.","");
		}
		  

					
					
					
					if(colName.startsWith("@@")) {
			colName = 

					
					
					
					colName.replaceFirst("\\@@","");  

					
					
					
					
			colName = colName.replaceAll("\\,","_").replaceAll("[^a-zA-Z0-9]+","_");
		}		
		colName = 

					
					
					
					colName.replaceAll("\\(","").replaceAll("\\)","").replaceAll("\\.","");  

					
					
					
					tools.putParamValue("RDColumnName",colName +(currentProp.indexOf()+0-catColCnt)); 

					
					
					
					visibleColCount = visibleColCount+1;

					
					
					
					tools.putParamValue("pzPropertyType",current.getString("pzPropertyType"));

					
					
					
					tools.putParamValue("strSortOrder",current.getString("pySortOrder"));

					
					
					
					if(!current.getBoolean(".pyIsCategorized")){

					
					
					
					 repeatingDataCell_1(strPropName,controlInfoPage); 

					
					
					}

					
					}

					}

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdroppgRepPgSubSectionpzViewInstancesBBBB.pxResults4")) {

					
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

					
		 pageListProp = tools.getProperty("pgRepPgSubSectionpzViewInstancesBBBB.pxResults");

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopuppgRepPgSubSectionpzViewInstancesBBBB.pxResults4")) { 

					
			String subScriptForColumn = tools.getParamValue("subScriptForColumn");

					
			int columnIndex = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER,"columnIndex");

					
			int dynamicColumnIndex = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER, "dynamicColumnIndex");

					
			if(columnIndex > (dynamicColumnIndex+dynamicColCount-1)){

					
			int newColumnIndex = columnIndex-(dynamicColCount-1);

					
		int lastIndexposition = subScriptForColumn.lastIndexOf(""+columnIndex);

					
				if(lastIndexposition > -1){

					
		subScriptForColumn = subScriptForColumn.substring(0,lastIndexposition)+newColumnIndex;

					
				}

					
			}

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

					if(strCellType.equals("static")) {  

						int unCategorizedDynamicCols = unCategorizedOrHiddenColsKeys.size(); 

						if(columnIndex > (unCategorizedDynamicCols+dynamicColumnIndex -1)) 

						{ 

							int newColumnIndex = columnIndex-1; 

							subScriptForColumn = subScriptForColumn.substring(0,subScriptForColumn.length()-1)+newColumnIndex; 

						} 

					} 

					
			 if(strCellType.equals("dynamic")) { 

					
			 int staticColsCategorized = 0; 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					
  if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false);  

					int intIndex = columnIndex -(dynamicColumnIndex -1 - staticColsCategorized); 

						if(unCategorizedOrHiddenColsKeys.size()>0) intIndex = Integer.valueOf((String)unCategorizedOrHiddenColsKeys.get(""+intIndex)); 

					ClipboardPage current = cp_rdListFields.getPageValue(intIndex); 

					ClipboardPage controlInfoPage = null; 

					String strPropName = current.getString("pyFieldName"); 

					tools.putParamValue("propTypeForFormatting",current.getString(".pyDataType"));

					if(current.getString(".pyDataType").replace(" ","").equalsIgnoreCase("DateTime")){tools.putParamValue("propTypeForFormatting",ImmutablePropertyInfo.TYPE_DATETIME);}

					String strpyAutoHTML = current.getPage("pyFieldFormat").getString("pyAutoHTML"); 

					if ("true".equals(strpyAutoHTML)) { 

					    ClipboardProperty modesProp = current.getPage("pyFieldFormat").getIfPresent("pyMergedModes"); 

					    if (modesProp != null) { 

					        controlInfoPage = modesProp.getPageValue(2); 

					    } 

					} else { 

					    controlInfoPage = current.getPage("pyFieldFormat"); 

					} 

					tools.putParamValue("bSuppressTD","true");

					 repeatingDataCell_2(strPropName,controlInfoPage); 

					tools.putParamValue("bSuppressTD","");

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 } 

					if(!"true".equals(optimizeFilter)){ 

					pg_metaDataPage.removeFromClipboard();

					}

					tools.getParameterPage().remove("dynamicColCount");

					
					 /* GenerateGrid: End */

					}

					

public void gridLastRow_1() { /*gridLastRow*/

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					String resultsPage = "" ;

					resultsPage = "pgRepPgSubSectionpzViewInstancesBBBB";

					ClipboardPage pg_metaDataPage = null;

					String optimizeFilter = tools.getParamValue("optimizeFilter"); 

					if("true".equals(optimizeFilter)){ 

					pg_metaDataPage = tools.findPage("pgRepPgSubSectionpzViewInstancesBBBBMETADATA");

					}

					 if(pg_metaDataPage == null){ 

					HashStringMap metaDataKeys = new HashStringMap();

					metaDataKeys.put("pxObjClass","Rule-Obj-Activity");

					metaDataKeys.put("pyClassName","Rule-Obj-Report-Definition");

					metaDataKeys.put("pyActivityName","pxRetrieveReportMetaData");

					tools.putParamValue("pyReportName","pyInstanceList");

					tools.putParamValue("pyReportClass","@baseclass");

					if(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)) != null){

					if("Rule-Obj-Report-Definition".equals(tools.findPage(pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true)).getClassName())){

					tools.putParamValue("pyReportPageName",pega_uiengine_grid.pzResolveReportPageName("D_pzInstanceListDisplay.pyReference", true));

					}

					}

					tools.putParamValue("pyPageName","pgRepPgSubSectionpzViewInstancesBBBBMETADATA");

					ClipboardPage tempDummy = tools.createPage("@baseclass", "tempdummy");

					tools.doActivity(metaDataKeys,tempDummy ,null);

					tempDummy.removeFromClipboard();

					pg_metaDataPage = tools.findPage("pgRepPgSubSectionpzViewInstancesBBBBMETADATA");

					 } 

					HashStringMap unCategorizedOrHiddenColsKeys = new HashStringMap();

					int gridColIndex = 1; 

					int pyGroupingSortNumber = pg_metaDataPage.getInteger("pyGroupingSortNumber"); 

					tools.putParamValue("pyGroupingSortNumber",pyGroupingSortNumber+"");

					ClipboardProperty cp_rdListFields = pg_metaDataPage.getProperty("pyListFields");

					for(int i=1; i<=cp_rdListFields.size();i++){

					
					ClipboardPage RDColumn = cp_rdListFields.getPageValue(i);

					
					if(!("true".equals(RDColumn.getString("pyIsColumnHide"))) && !("true".equals(RDColumn.getString("pyIsCategorized")))) {

					
					dynamicColCount +=  1;

					
					     unCategorizedOrHiddenColsKeys.put(""+gridColIndex,""+i); 

					
					     gridColIndex = gridColIndex + 1; 

					
					}

					}

					tools.putParamValue("dynamicColCount",dynamicColCount);

					String maxSortOrder = pg_metaDataPage.getString("pyMaxSortOrder");

					tools.putParamValue("maxSortOrder",maxSortOrder);

					String pyHeaderDisplay = pg_metaDataPage.getString("pyHeaderDisplay"); 

					tools.putParamValue("pyHeaderDisplay",pyHeaderDisplay);

					java.util.Map functionsMap = null;

					java.util.Map classesMap = null;

					tools.putSaveValue("bAllowRowUpdate","true");

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					if(tools.getParamValue("partialTrigger").equals("appendTopgRepPgSubSectionpzViewInstancesBBBB.pxResults4") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty("pgRepPgSubSectionpzViewInstancesBBBB.pxResults");

					
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

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
					
						 tools.putParamValue("expandRL","true");

					
					
							 tools.putSaveValue("recordNumber",String.valueOf(Integer.parseInt(tools.getParamValue("startIndex")) + tools.getActive().indexOf() - 1));

					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.pgRepPgSubSectionpzViewInstancesBBBB.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "true"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("pgRepPgSubSectionpzViewInstancesBBBB.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodespgRepPgSubSectionpzViewInstancesBBBB.pxResults4") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("pgRepPgSubSectionpzViewInstancesBBBB.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201704040320550048263-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 functionsMap = new HashStringMap();

					
					 classesMap = new HashStringMap();

					
					functionsMap = pega_uiengine_uiengine.pzGetRDFunctionsMap(tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB"));

					
					classesMap = pega_uiengine_uiengine.pzGetRDClassesMap(tools.findPage("pgRepPgSubSectionpzViewInstancesBBBB"));

					
					
										 tools.getParameterPage().put("currentFunctionsMap", functionsMap);

					
					
										 tools.getParameterPage().put("currentClassesMap", classesMap);

					
					ClipboardPage current = null;

					
					ClipboardProperty currentProp = null;

					
					String strColumnWidth = null;

					
					String strPropName = null;

					
					catColCnt = 0;

					
					for(int i=1; i<=cp_rdListFields.size();i++){

					
					ClipboardPage controlInfoPage = null;

					
					
					current = cp_rdListFields.getPageValue(i);

					
					
					
					 if(current.getBoolean(".pyIsCategorized")|| current.getBoolean("pyIsColumnHide")){catColCnt++;   } 

					
					
					
					
					currentProp = cp_rdListFields.getPropertyValue(i);

					
					
					
					
					if(!("true".equals(current.getString("pyIsColumnHide")))) {

					
					
					
					
					tools.putParamValue("DataAtrributeName",current.getString("pyFieldLabel"));

					
					
					
					
					tools.putParamValue("propTypeForFormatting",current.getString(".pyDataType")); if(current.getString(".pyDataType").replace(" ","").equalsIgnoreCase("DateTime")){tools.putParamValue("propTypeForFormatting",ImmutablePropertyInfo.TYPE_DATETIME);}

					
					
					
					
					strPropName = current.getString("pyFieldName");

					
					
					
					
					String strpyAutoHTML = current.getPage("pyFieldFormat").getString("pyAutoHTML");

					
					
					
					
					if("true".equals(strpyAutoHTML)){

					
					
					
					
					ClipboardProperty modesProp = current.getPage("pyFieldFormat").getIfPresent("pyMergedModes");

					
					
					
					
					 controlInfoPage = null;

					
					
					
					
					if(modesProp != null) {

					
					
					
					
					controlInfoPage = modesProp.getPageValue(2);

					
					
					
					
					}

					
					
					
					
					}

					
					
					
					
					else {

					
					
					
					
					controlInfoPage = current.getPage("pyFieldFormat");

					
					
					
					
					}

					
					
					
					
					tools.putParamValue("pyColumnWidthUnit","");

					
					
					
					
					if(("px".equals(current.getStringIfPresent("pyColumnWidthUnit"))) && current.getStringIfPresent("pyColumnWidth")!=null ){

					
					
					
					
					strColumnWidth = current.getString("pyColumnWidth"); } else if(("percent".equals(current.getString("pyColumnWidthUnit"))) ){

					
					
					
					
					strColumnWidth = current.getString("pyColumnWidth");

					
					
					
					
					tools.putParamValue("pyColumnWidthUnit",current.getStringIfPresent("pyColumnWidthUnit"));}else{

					
					
					
					
					strColumnWidth = "78"; }

					
					
					
					
					String colName = current.getString("pyFieldName"); 
		  

					
					
					
					
					if(!colName.startsWith(".")){
			colName = colName.replaceFirst("\\.","_");
		}  

					
					
					
					
					else{
			colName = 

					
					
					
					
					colName.replaceFirst("\\.","");
		}
		  

					
					
					
					
					if(colName.startsWith("@@")) {
			colName = 

					
					
					
					
					colName.replaceFirst("\\@@","");  

					
					
					
					
					
			colName = colName.replaceAll("\\,","_").replaceAll("[^a-zA-Z0-9]+","_");
		}		
		colName = 

					
					
					
					
					colName.replaceAll("\\(","").replaceAll("\\)","").replaceAll("\\.","");  

					
					
					
					
					tools.putParamValue("RDColumnName",colName +(currentProp.indexOf()+0-catColCnt)); 

					
					
					
					
					visibleColCount = visibleColCount+1;

					
					
					
					
					tools.putParamValue("pzPropertyType",current.getString("pzPropertyType"));

					
					
					
					
					tools.putParamValue("strSortOrder",current.getString("pySortOrder"));

					
					
					
					
					if(!current.getBoolean(".pyIsCategorized")){

					
					
					
					
					 repeatingDataCell_3(strPropName,controlInfoPage); 

					
					
					
					}

					
					
					}

					
					}

					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					if(!"true".equals(optimizeFilter)){ 

					
					pg_metaDataPage.removeFromClipboard();

					
					}

					
					tools.getParameterPage().remove("dynamicColCount");

					
					
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzViewInstances");
	oStreamProperties_1.put("pyRuleSetVersion", "08-06-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("pzLayout_4", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZVIEWINSTANCES #20201016T180700.850 GMT", "@baseclass pzViewInstances", "Pega-Desktop", "08-06-01", "20210216T220131.511 GMT");
}
