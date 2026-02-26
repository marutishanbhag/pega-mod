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
 * Builds JSP stream @BASECLASS!PZAPPLICATIONEXPLORER.
 */
public class ra_stream_pzapplicationexplorer_463f3d57e25f8d71bf19f997d8fdaf8c extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzApplicationExplorer.Code_Pega_List.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -2010035131;
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
	public ra_stream_pzapplicationexplorer_463f3d57e25f8d71bf19f997d8fdaf8c(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "7d5b67b13acc1459e38625dfe26abdb68922f670";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT	Pega-Desktop:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "7d5b67b13acc1459e38625dfe26abdb68922f670";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzApplicationExplorer",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT */
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
	"Rule-HTML-Section:PZAPPLICATIONEXPLORER", 
	"Rule-Obj-Property:PYCLASSNAME", 
	"Rule-Obj-Property:PYAPPEXPLORERWORKPOOL", 
	"Rule-HTML-Property:PXAUTOCOMPLETE", 
	"Rule-HTML-Property:PXTEXTINPUT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZAPPLICATIONEXPLORER","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-05-01","RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT","!PZAPPLICATIONEXPLORER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2010035131), 
		new DependentRuleInfo("PYCLASSNAME","Rule-Obj-Property","RULE-OBJ-CLASS",true,"Rule-Obj-Class","Pega-ProCom","08-08-01","RULE-OBJ-PROPERTY RULE-OBJ-CLASS PYCLASSNAME #20220504T193113.758 GMT","!PYCLASSNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYAPPEXPLORERWORKPOOL","Rule-Obj-Property","@BASECLASS",true,"@baseclass","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYAPPEXPLORERWORKPOOL #20180713T135010.519 GMT","!PYAPPEXPLORERWORKPOOL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXAUTOCOMPLETE","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXAUTOCOMPLETE #20190131T183501.505 GMT","PXAUTOCOMPLETE",true,false,"ABSOLUTE_CLASSLESS",94628781), 
		new DependentRuleInfo("PXTEXTINPUT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT","PXTEXTINPUT",true,false,"ABSOLUTE_CLASSLESS",228709330)
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
//	RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT:20200330T191344.575 GMT
//	RULE-HTML-PROPERTY PXAUTOCOMPLETE #20190131T183501.505 GMT:20190131T183501.505 GMT
//	RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT:20190131T183501.688 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-CLASS PYCLASSNAME #20220504T193113.758 GMT:20220527T153840.485 GMT
//	RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT:20190131T183501.688 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-CLASS PYCLASSNAME #20220504T193113.758 GMT:20220527T153840.485 GMT
//	RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT:20190131T183501.688 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-CLASS PYCLASSNAME #20220504T193113.758 GMT:20220527T153840.485 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYAPPEXPLORERWORKPOOL #20180713T135010.519 GMT:20180713T135010.519 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayoutContainer_3( {"methodName", "String", ""}
//	simpleLayout_1(
//	pzLayoutContainer_2( {"methodName", "String", ""}

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID CREATETEMPLATEGRIDXML #20180713T133337.729 GMT:20180713T133337.729 GMT
//	RULE-UTILITY-FUNCTION GRID GENERATEGRIDLAYOUT #20180713T133337.732 GMT:20180713T133337.732 GMT
//	RULE-UTILITY-FUNCTION GRID GENERATEGRIDLAYOUTASSECTION #20180713T133337.736 GMT:20180713T133337.736 GMT
//	RULE-UTILITY-FUNCTION GRID GETTOTALRECORDS #20180713T133337.740 GMT:20180718T092706.975 GMT
//	RULE-UTILITY-FUNCTION GRID PZGENERATEGRIDCATEGORYHEADERROW #20180713T133337.754 GMT:20180713T133337.754 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS DEFERLOADRETRIEVALACTIVITY #20180713T132449.546 GMT:20180713T132449.546 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETPAGECLASS #20180713T132451.045 GMT:20180713T132451.045 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEGETPARAMPAGE--(CLIPBOARDPAGE,STRING) #20200702T145600.500 GMT:20200702T145600.500 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORSPAN #20180713T133339.912 GMT:20180713T133339.912 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAZYLOADBOTTOM--(STRING,STRING,CLIPBOARDPAGE,STRING) #20180713T133339.970 GMT:20180713T133339.970 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAZYLOADTOP--(STRING, CLIPBOARDPAGE) #20180713T133339.980 GMT:20180713T133339.980 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
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
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONCLOSECONTAINER--(BOOLEAN6B602F7DF1B1291F08F65DCCD1AA9BC2 #20180713T133343.012 GMT:20180713T133343.012 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETVALUE--(CLIPBOARDPAGED2D8EBC7F29F977F1A20CFC6559990AA #20180713T133344.640 GMT:20180713T133344.640 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDGRIDXMLFORAC #20201230T105617.048 GMT:20201230T105617.048 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCONTROLACTIONTOKENIZER--(STRIN8BE29C608C407B0F03A6B69F6478D6BB #20180713T133344.800 GMT:20180713T133344.800 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEAUTOCOMPLETE #20230618T001619.369 GMT:20230618T001619.369 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGRIDACTIONTOKENIZER--(STRING,JAVA.UTIL.LIST) #20180713T133346.434 GMT:20180713T133346.434 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
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
		return "b5d73f488c207883c5c1c2090e121942";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
 if("EXPANDEDSubSectionpzApplicationExplorer1_pyAppExplorerWorkPool".equals(tools.getParamValue("RenderSingle")) ){ 
 tools.putParamValue("rowVisibleWhen",".pyClassName:contains"); 
 tools.putParamValue("AC_BestBetsProp",".pyBestBet"); 
 } 
 if("InitialRender_EXPANDEDSubSectionpzApplicationExplorer1_pyAppExplorerWorkPool".equals(tools.getParamValue("RenderSingle")) ){ 
 tools.putParamValue("rowVisibleWhen",".pyClassName:contains"); 
 tools.putParamValue("AC_BestBetsProp",".pyBestBet"); 
 { 
 String acPropPageName = tools.getParamValue("AC_PropPage");
 if("".equals(acPropPageName)) { 
 acGridPreProcessor_1();  
gridLayoutAsSection_1();
 } else {
 PRStackFrame frame = pega.pushStackFrame("ACContextPage",null, tools.findPage(acPropPageName),false, false);
 acGridPreProcessor_1();  
gridLayoutAsSection_1();
pega.popStackFrame(frame, false);
 } 
 } 
 } 
buildWhiteList_1();
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzApplicationExplorer",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzApplicationExplorer','insKey':'RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT','sectionType':'standard'}");
sectionDefaultValues_1();
pzLayout_1();
pzLayout_2();
pzLayout_3();
 if(tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpzApplicationExplorer1_pyAppExplorerWorkPool")){gridLayout_1(); } 
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void buildWhiteList_4() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("PreActivity", "pzAppExplorerClassSelect");
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "pageList");
config.put("pySourceName", "pyAppExplorerClassSelect.pxResults");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzApplicationExplorer");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
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
public void pzLayoutBody_3(String lazyLoadToken) {
if("deferLoad".equals(lazyLoadToken)) {
includeSectionBody_2();
}else {
Map<String, Object> loadingSectionInfo = new HashMap<String, Object>();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_28", "pyLoadingMessage", loadingSectionInfo);
}
}
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_2();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","D_AppExplorerPinnedClasses");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_26","pzAppExplorerTreePinClasses", secInfo);
}
public void buildWhiteList_3() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("PreActivity", "pzAppExplorerClassSelect");
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "pageList");
config.put("pySourceName", "pyAppExplorerClassSelect.pxResults");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzApplicationExplorer");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}


public void includeSectionBody_2() { 
	buildWhiteList_3();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	{tools.putParamValue("decParamList","{}");tools.putParamValue("sectionPageNameBase","D_AppExplorerPinnedClasses");}
	String includedSectionName = "";includedSectionName = "pzAppExplorerTreePinClasses";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"D_AppExplorerPinnedClasses",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzApplicationExplorerBBB","",false);
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
String paramName = "EXPANDEDSubSectionpzApplicationExplorerBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(3)','clipboardPath':'pzAppExplorerTreePinClasses'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","3");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
if("".equals(methodName)) {
containerComponent.forceReload();
}
if(!"".equals(methodName)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addParameterPage(pxUniqueStreamHash+"_27");
metadataPage.put("parampg",pxUniqueStreamHash+"_27");
boolean includeADPParam = pzIsADP_1();
	int DPScope = pega.getDeclarativePageUtils().getDeclarePageScope("D_AppExplorerPinnedClasses");
	if(includeADPParam) {
		metadataPage.put("isADP", "1");
			metadataPage.put("pyAssociateRequestor", String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isAssociateRequestor()));
				metadataPage.put("pyDPScope", String.valueOf(DPScope));
					metadataPage.put("pySectionId", "S8");
						metadataPage.put("pyDPParams", "{}");
							metadataPage.put("pyUsingPage", "D_AppExplorerPinnedClasses");
						}
						}
						containerComponent.beginComponent("pxLayoutContainer",metadataPage);
						if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
						methodName = "";
						}
						if("".equals(methodName)) {
						}
						if(!"".equals(methodName))
						containerComponent.addPropertyToMetadata("methodnm", methodName);
						pzLayoutBody_3("".equals(methodName) ? "deferLoad" : "");
						containerComponent.endComponent();
						}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(3)','clipboardPath':'pzAppExplorerTreePinClasses'}") + ">");
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){
if(tools.getParamValue("lazyLoadId").equals("S8") || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))){
			 tools.putParamValue("RenderSingle" , "");
			 tools.putParamValue("lazyLoadId" , "");
			 if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() &&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("<div id='lazyContent'>");
			}
pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_5();
}
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("</div>");}
			 tools.putParamValue("RenderSingle" , "S8");
			 tools.putParamValue("lazyLoadId" , "S8");
		}else{
		
			if(!tools.getParamValue("lazySection ").equals("pzApplicationExplorer")){boolean includeADPParam = pzIsADP_1();
				  int DPScope = -1;
				 String readOnly = "-1".equals(tools.getParamValue("ReadOnly")) || "-1".equals(tools.getParamValue("SectionReadOnly")) || !tools.hasInputEnabled() ? "-1" : "0";
				   tools.putSaveValue("lazyLoadDivId" , ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique() + "");String lazyLoadDivIdSaveValue=tools.getSaveValue("lazyLoadDivId");String lazyLoadInfoValue=tools.getParamValue("lazyLoadInfo");if(lazyLoadInfoValue.equals("null")){lazyLoadInfoValue="";}
						boolean pyAssociateRequestor = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isAssociateRequestor();
				   tools.putParamValue("lazyLoadInfo" , lazyLoadInfoValue + tools.getSaveValue("lazyLoadDivId") + ",S8" + (includeADPParam?",isADP=1,pyUsingPage=D_AppExplorerPinnedClasses":"") + "" + (includeADPParam?",pyDPParams={}":"") + "" + (includeADPParam?(",pyDPScope="+DPScope):"") + "" + (includeADPParam?(",pyAssociateRequestor="+pyAssociateRequestor):"") + ",subscriptionId=" + tools.getParamValue("subscriptionId") + "ReadOnly=" + readOnly + getParamPage_1() + "~#LLDELIM#~");
					if(includeADPParam) {
							tools.appendString("<div style='display:block;' data-lazyloaddivid='" + lazyLoadDivIdSaveValue + "' data-isadp='true' data-pysectionid='S8' class='lazyload-layout' data-pydpparams=\"{}\" data-pyusingpage='D_AppExplorerPinnedClasses' data-pydpscope='"+DPScope+"' data-adpparameterpage='"+tools.getParamValueCSF("lazyLoadInfo").replace("~#LLDELIM#~","")+"' >");
					} else {
						tools.appendString("<div style='display:block;' data-lazyloaddivid='" + lazyLoadDivIdSaveValue + "' data-layoutid='S8' class='lazyload-layout' data-parampage='"+tools.getParamValueCSF("lazyLoadInfo").replace("~#LLDELIM#~","")+"' >");
					}
if(tools.getParamValue("RenderSingle").equals("")){pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null); }tools.appendString("</div>");
			}
		}
	
}
if(bWrapIncSection){
tools.appendString("</span>");
}if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3("pzLayoutContainer_3");
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_2(String lazyLoadToken) {
if("deferLoad".equals(lazyLoadToken)) {
includeSectionBody_1();
}else {
Map<String, Object> loadingSectionInfo = new HashMap<String, Object>();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_25", "pyLoadingMessage", loadingSectionInfo);
}
}
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_23","pzAppExplorerTreeGrid", secInfo);
}
public void buildWhiteList_2() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("PreActivity", "pzAppExplorerClassSelect");
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "pageList");
config.put("pySourceName", "pyAppExplorerClassSelect.pxResults");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzApplicationExplorer");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzAppExplorerTreeGrid";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzApplicationExplorerBB","",false);
}
public void pzLayoutContainer_2(String methodName) {
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
String paramName = "EXPANDEDSubSectionpzApplicationExplorerBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pzAppExplorerTreeGrid'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","2");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
if("".equals(methodName)) {
containerComponent.forceReload();
}
if(!"".equals(methodName)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addParameterPage(pxUniqueStreamHash+"_24");
metadataPage.put("parampg",pxUniqueStreamHash+"_24");
}
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
methodName = "";
}
if("".equals(methodName)) {
}
if(!"".equals(methodName))
containerComponent.addPropertyToMetadata("methodnm", methodName);
pzLayoutBody_2("".equals(methodName) ? "deferLoad" : "");
containerComponent.endComponent();
}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pzAppExplorerTreeGrid'}") + ">");
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){
if(tools.getParamValue("lazyLoadId").equals("S2") || pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))){
			 tools.putParamValue("RenderSingle" , "");
			 tools.putParamValue("lazyLoadId" , "");
			 if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() &&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("<div id='lazyContent'>");
			}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_4();
}
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("</div>");}
			 tools.putParamValue("RenderSingle" , "S2");
			 tools.putParamValue("lazyLoadId" , "S2");
		}else{
		
			if(!tools.getParamValue("lazySection ").equals("pzApplicationExplorer")){
				 String readOnly = "-1".equals(tools.getParamValue("ReadOnly")) || "-1".equals(tools.getParamValue("SectionReadOnly")) || !tools.hasInputEnabled() ? "-1" : "0";
				   tools.putSaveValue("lazyLoadDivId" , ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique() + "");String lazyLoadDivIdSaveValue=tools.getSaveValue("lazyLoadDivId");String lazyLoadInfoValue=tools.getParamValue("lazyLoadInfo");if(lazyLoadInfoValue.equals("null")){lazyLoadInfoValue="";}
						boolean pyAssociateRequestor = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isAssociateRequestor();
				   tools.putParamValue("lazyLoadInfo" , lazyLoadInfoValue + tools.getSaveValue("lazyLoadDivId") + ",S2,subscriptionId=" + tools.getParamValue("subscriptionId") + "ReadOnly=" + readOnly + getParamPage_1() + "~#LLDELIM#~");tools.appendString("<div style='display:block;' data-lazyloaddivid='" + lazyLoadDivIdSaveValue + "' data-layoutid='S2' class='lazyload-layout' data-parampage='"+tools.getParamValueCSF("lazyLoadInfo").replace("~#LLDELIM#~","")+"' >");if(tools.getParamValue("RenderSingle").equals("")){pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null); }tools.appendString("</div>");
			}
		}
	
}
if(bWrapIncSection){
tools.appendString("</span>");
}if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2("pzLayoutContainer_2");
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
public void inclFormattedVal_4(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" ),"","",true,"associated"));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("PreActivity", "pzAppExplorerClassSelect");
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "pageList");
config.put("pySourceName", "pyAppExplorerClassSelect.pxResults");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzApplicationExplorer");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzLoadAppExplorerData");
config.put("StaticActivityParams", "ClassDisplay=");
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
pega.getUIEngine().getUIAction("paginate", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.control.AutoCompleteAG.setFocusToInput");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyActivity", "SubmitModalFlowAction");
pega.getUIEngine().getUIAction("closeContainer", config).register();
}
public void pzLayoutBodyWrapper_2() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");if(!tools.getParamValue("gridAction").equals("PAGINATE")){}if(!tools.getParamValue("gridAction").equals("PAGINATE")){
  

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
  
}
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}


public void pxTextInput_3(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = pzAuto.getSection().getControl().isControlEditable(false, null);
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		isEditable = true;
	 }
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	if(isEditable && "true".equals(tools.getParamValue("isControlEditableOriginal"))) {
	sEntryHandle = tools.getActive().getEntryHandle();
	 } else {
	sEntryHandle = tools.getActive().getEntryHandle(true, false);
	 }
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
	 if(pzAuto.getSection().getControl().isExpTarget(sEntryHandle) ) {
	 pega_rules_utilities.pzRegisterActivity(tools,"GetTargets");
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){
inclCalVal_2("pxTextInput","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")){
		textInputIncludes_1();boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering(); boolean doAutoFormatting = false;

		tools.appendString("<span data-control-mode='input' class= ' explorer_search' nowrap>");
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		String placeHolderR = "";

	String showDefaultPlaceholderForNumber = tools.getSystemSettings().getDynamic("Pega-UIEngine","showDefaultPlaceholderForNumber");if(doAutoFormatting && "true".equals(showDefaultPlaceholderForNumber)) {placeHolderR = "123,456.78";}String activeValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
List<String> unSupportedLocales = new ArrayList<String>();
unSupportedLocales.add("hi_IN");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);
		String classValue = "";
		classValue += "leftJustifyStyle";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
			classValue += " ErrorShade ";
		}
		tools.appendString(" <input  data-ctl='[\"TextInput\"]' ");
		tools.appendString(" id=\"");boolean repeating = true;
		tools.appendString(((PegaAPI) tools).getHTMLIDForProperty(repeating,"text"));
		tools.appendString("\"");
		if(maxLength > 0) {tools.appendString(" maxLength='"+maxLength+"' ");}
		tools.appendString(" type='text' ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		String propertyHandle =  sEntryHandle;
		tools.appendString(pega_uiengine_offlinesupport.pzGetDataInitAttribute(propertyHandle,"property", null));
		tools.appendString(bOptimizedMarkup ? " data-cdb-value=\"" : " value=\"");String ref = tools.getProperty(".pyClassName").getReference();
controlRuntimeUtilities.markUpForReadOnlyFormatting(bOptimizedMarkup, ref, activeValue, tools, pzAuto);if(bOptimizedMarkup){propertyHandle = pzAuto.getUIComponentRuntime().changeTrackProperty(propertyHandle,"entryHandle");}
		tools.appendString("\" name=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("\" ");
		tools.appendString(" aria-describedby=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("Error\" ");
		tools.appendString(" class=\""+ classValue +"\" ");
		 if(bOptimizedMarkup){ tools.appendString(" data-bindprops=\"title,data-value,data-cdb-value\" "); } 
		tools.appendString(">");
		tools.appendString("</span>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxTextInput");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "class='explorer_search' ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");
	}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); } catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyClassName", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'style='");
	tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(false,"","autocompleteAGleft",pzSection.getValueStyle()));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxTextInput_3(".pyClassName",0,"","ClassName","Identifier");
									tools.appendString("</DIV>"); } else { pxTextInput_3(".pyClassName",0,"","ClassName","Identifier");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
getInlineStyle_3() {
try {
tools.appendString("visibility:hidden;height:1px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_3() {
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyClassName";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString("");
		tools.appendString(" class='");
		tools.appendString("hiddenCell");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:0px;");tools.appendString("width:"); if(!tools.getParamValueCSF("pyAppExplorerClassSelectPpxResults4colWidthCache3").equals("")){ tools.appendParamCSF("pyAppExplorerClassSelectPpxResults4colWidthCache3"); } else { tools.appendString("152"); } tools.appendString("px;");tools.appendString("");getInlineStyle_3(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:0px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "pyClassName", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</td>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public String gridCategoryHeaderRow_1(String strPrevRowCategory, int prevCategoryLastRowIndex) {

					java.util.List categorizedColsList = new ArrayList();

					java.util.List categorizedColHeadersList =  new ArrayList();

					 String pyCustomGroupingSection = "pzGridCategoryHeaderForAC" ; 

					categorizedColsList.add(".pyBestBet");

					categorizedColHeadersList.add("");

					categorizedColsList.add(".pyCategory");

					categorizedColHeadersList.add("");

					StringBuffer sbCategorizeLabel = new StringBuffer();

					String strCurrentRowCategory = null;

					String strCategorizedColName = null;

					int currentRowIndex = tools.getActive().indexOf();

					ClipboardPage prevRowPage = null;

					StringBuffer sbGroupedCol = new StringBuffer();

					if(strPrevRowCategory==null && currentRowIndex!=1) {

					ClipboardProperty cp_parentProp = tools.getActive().getParentProperty();

					int prevRowIndex = currentRowIndex - 1;

					prevRowPage = cp_parentProp.getPageValue(prevRowIndex);

					ClipboardPage filterCriteriaPage = tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

					if(filterCriteriaPage != null) {

					
							 Map uniqueValues = (Map)tools.getParameterPage().getObject("selUniqMappyAppExplorerClassSelect_pxResultsL7");

					
					while(prevRowPage!= null) {

					
					
					PRStackFrame frame = pega.pushStackFrame("CategorizeFilteredGrid",null, prevRowPage, false, false);

					
					
					tools.putActive(cp_parentProp.getPropertyValue(prevRowIndex));

					
					
					boolean prevPageMatchesFilter = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(filterCriteriaPage,uniqueValues);

					
					
					pega.popStackFrame(frame, false);

					
					
					if(prevPageMatchesFilter) {

					
					
					prevCategoryLastRowIndex = prevRowIndex;

					
					
					break;

					
					
					}

					
					
					else {

					
					
					prevRowPage = --prevRowIndex > 0 ? cp_parentProp.getPageValue(prevRowIndex) : null;

					
					
					}

					
					}

					}

					if(prevRowPage!=null) {

					Map functionsMap= (java.util.Map)tools.getParameterPage().get("currentFunctionsMap");

					
					for(int cnt=0; cnt<categorizedColsList.size(); cnt++) {

					
					
					strCategorizedColName = (String)categorizedColsList.get(cnt);

					
					
					try {

					
					
					sbGroupedCol.append(prevRowPage.getProperty((String)functionsMap.get(strCategorizedColName)).getStringValue().trim());

					
					
					} catch(Exception e) {

					
					
					sbGroupedCol.append(prevRowPage.getProperty(strCategorizedColName).getStringValue().trim());

					
					
					}

					
					}

					
					strPrevRowCategory = sbGroupedCol.toString();

					}

					if("true".equals(tools.getParamValue("dontgenMarkup"))) {

					tools.getParameterPage().remove("dontgenMarkup");

					if (prevRowPage != null) {

					return strPrevRowCategory;

					}else {return null;}

					}

					ClipboardPage currentRowPage = cp_parentProp.getPageValue(currentRowIndex);

					tools.putActive(cp_parentProp.getPropertyValue(currentRowIndex));

					}

					for(int cnt=0; cnt<categorizedColsList.size(); cnt++) {

					
					strCategorizedColName = (String)categorizedColsList.get(cnt);

					
					sbCategorizeLabel.append(tools.getActive().getProperty(strCategorizedColName).getStringValue().trim());

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

					categoryHtml.append("<tr class=\"grid-categorize-header cellCont\"><td style=\"height:15px;\" class=\"gridCell\" colspan=\"");

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

					
					tools.putParamValue("pxCategoryColumnLabel", headerLabel);

					
					tools.putParamValue("pxCategoryColumnProperty", strCategorizedColName);

					
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
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxTextInput_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = pzAuto.getSection().getControl().isControlEditable(false, null);
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		isEditable = true;
	 }
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	if(isEditable && "true".equals(tools.getParamValue("isControlEditableOriginal"))) {
	sEntryHandle = tools.getActive().getEntryHandle();
	 } else {
	sEntryHandle = tools.getActive().getEntryHandle(true, false);
	 }
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
	 if(pzAuto.getSection().getControl().isExpTarget(sEntryHandle) ) {
	 pega_rules_utilities.pzRegisterActivity(tools,"GetTargets");
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")){
inclCalVal_2("pxTextInput","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){
		textInputIncludes_1();boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering(); boolean doAutoFormatting = false;

		tools.appendString("<span data-control-mode='input' class= ' explorer_search' nowrap>");
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		String placeHolderR = "";

	String showDefaultPlaceholderForNumber = tools.getSystemSettings().getDynamic("Pega-UIEngine","showDefaultPlaceholderForNumber");if(doAutoFormatting && "true".equals(showDefaultPlaceholderForNumber)) {placeHolderR = "123,456.78";}String activeValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
List<String> unSupportedLocales = new ArrayList<String>();
unSupportedLocales.add("hi_IN");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);
		String classValue = "";
		classValue += "leftJustifyStyle";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
			classValue += " ErrorShade ";
		}
		tools.appendString(" <input  data-ctl='[\"TextInput\"]' ");
		tools.appendString(" id=\"");boolean repeating = true;
		tools.appendString(((PegaAPI) tools).getHTMLIDForProperty(repeating,"text"));
		tools.appendString("\"");
		if(maxLength > 0) {tools.appendString(" maxLength='"+maxLength+"' ");}
		tools.appendString(" type='text' ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		String propertyHandle =  sEntryHandle;
		tools.appendString(pega_uiengine_offlinesupport.pzGetDataInitAttribute(propertyHandle,"property", null));
		tools.appendString(bOptimizedMarkup ? " data-cdb-value=\"" : " value=\"");String ref = tools.getProperty(".pyClassName").getReference();
controlRuntimeUtilities.markUpForReadOnlyFormatting(bOptimizedMarkup, ref, activeValue, tools, pzAuto);if(bOptimizedMarkup){propertyHandle = pzAuto.getUIComponentRuntime().changeTrackProperty(propertyHandle,"entryHandle");}
		tools.appendString("\" name=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("\" ");
		tools.appendString(" aria-describedby=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("Error\" ");
		tools.appendString(" class=\""+ classValue +"\" ");
		 if(bOptimizedMarkup){ tools.appendString(" data-bindprops=\"title,data-value,data-cdb-value\" "); } 
		tools.appendString(">");
		tools.appendString("</span>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxTextInput");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "class='explorer_search' ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");
	}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); } catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyClassName", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'style='");
	tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(false,"","autocompleteAGleft",pzSection.getValueStyle()));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxTextInput_2(".pyClassName",0,"","ClassName","Identifier");
									tools.appendString("</DIV>"); } else { pxTextInput_2(".pyClassName",0,"","ClassName","Identifier");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void inclFormattedVal_3(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();HashStringMap commonData = new HashStringMap();commonData.put("highlight",tools.getParamValue("AC_Grid_FilterParamValue"));tools.appendString(pega_uiengine_formatter.pxFormatCommon(commonData, 
		pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" ),"","",true,"associated")));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}


public void textInputIncludes_1() {
if (pzAuto.doOnlyOnce("TextInput")) {
pzAuto.emitIncludeStreamReference("pzTextinputIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();HashStringMap commonData = new HashStringMap();commonData.put("highlight",tools.getParamValue("AC_Grid_FilterParamValue"));tools.appendString(pega_uiengine_formatter.pxFormatCommon(commonData, 
		pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" ),"","",true,"associated")));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclCalVal_2(String controlName,String controlFormat, String styleClass) {tools.appendString("<P id=\"CV\" name=\"");tools.appendString(tools.getActive().getEntryHandle());tools.appendString("\" ");tools.appendString("RHP_NAME=\"");tools.appendString(controlName);tools.appendString(" \" ");tools.appendString(" data-ctl data-ctlformat=\"");tools.appendString(controlFormat);tools.appendString("\" ");
		tools.appendString(" class='");
		tools.appendString(styleClass);
		tools.appendString(" explorer_search");
		tools.appendString("' ");if(tools.getParamValue("AJAXTrackID") != null){com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));	changeTracker.trackValueChanges(tools.getActive(),-1);}
}


public void pxTextInput_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = pzAuto.getSection().getControl().isControlEditable(false, null);
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		isEditable = true;
	 }
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	if(isEditable && "true".equals(tools.getParamValue("isControlEditableOriginal"))) {
	sEntryHandle = tools.getActive().getEntryHandle();
	 } else {
	sEntryHandle = tools.getActive().getEntryHandle(true, false);
	 }
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
	 if(pzAuto.getSection().getControl().isExpTarget(sEntryHandle) ) {
	 pega_rules_utilities.pzRegisterActivity(tools,"GetTargets");
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){
inclCalVal_2("pxTextInput","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){
		textInputIncludes_1();boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering(); boolean doAutoFormatting = false;

		tools.appendString("<span data-control-mode='input' class= ' explorer_search' nowrap>");
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		String placeHolderR = "";

	String showDefaultPlaceholderForNumber = tools.getSystemSettings().getDynamic("Pega-UIEngine","showDefaultPlaceholderForNumber");if(doAutoFormatting && "true".equals(showDefaultPlaceholderForNumber)) {placeHolderR = "123,456.78";}String activeValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
List<String> unSupportedLocales = new ArrayList<String>();
unSupportedLocales.add("hi_IN");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);
		String classValue = "";
		classValue += "leftJustifyStyle";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
			classValue += " ErrorShade ";
		}
		tools.appendString(" <input  data-ctl='[\"TextInput\"]' ");
		tools.appendString(" id=\"");boolean repeating = true;
		tools.appendString(((PegaAPI) tools).getHTMLIDForProperty(repeating,"text"));
		tools.appendString("\"");
		if(maxLength > 0) {tools.appendString(" maxLength='"+maxLength+"' ");}
		tools.appendString(" type='text' ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		String propertyHandle =  sEntryHandle;
		tools.appendString(pega_uiengine_offlinesupport.pzGetDataInitAttribute(propertyHandle,"property", null));
		tools.appendString(bOptimizedMarkup ? " data-cdb-value=\"" : " value=\"");String ref = tools.getProperty(".pyClassName").getReference();
controlRuntimeUtilities.markUpForReadOnlyFormatting(bOptimizedMarkup, ref, activeValue, tools, pzAuto);if(bOptimizedMarkup){propertyHandle = pzAuto.getUIComponentRuntime().changeTrackProperty(propertyHandle,"entryHandle");}
		tools.appendString("\" name=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("\" ");
		tools.appendString(" aria-describedby=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("Error\" ");
		tools.appendString(" class=\""+ classValue +"\" ");
		 if(bOptimizedMarkup){ tools.appendString(" data-bindprops=\"title,data-value,data-cdb-value\" "); } 
		tools.appendString(">");
		tools.appendString("</span>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxTextInput");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "class='explorer_search' ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");
	}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); } catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyClassName", ".pySections(4).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'style='");
	tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(false,"","autocompleteAGleft",pzSection.getValueStyle()));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxTextInput_1(".pyClassName",0,"","ClassName","Identifier");
									tools.appendString("</DIV>"); } else { pxTextInput_1(".pyClassName",0,"","ClassName","Identifier");}
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
try {
tools.appendString("display:none;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void 
getInlineStyle_2() {
}


public void pyAppExplorerClassSelect_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString(",");
		tools.appendString(",\"up\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString(",");
		tools.appendString(",\"down\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"setValue\", [[\"");
String stepPage2 = tools.getParamValue("AC_PropPage");
String stepPageTop2 = (stepPage2.indexOf(".") >= 0) ? stepPage2.substring(0, stepPage2.indexOf(".")) : stepPage2;
String stepPageRest2 = (stepPage2.indexOf(".") >= 0) ? stepPage2.substring(stepPage2.indexOf(".")) : "";
tools.appendString(stepPageRest2 + ".pyAppExplorerWorkPool\", \"" + stepPageTop2 + "\", \"~!.pyClassName\", \"\", \"");

		tools.appendString("#~.pyClassName$0$~#");tools.appendString("\"]]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"runScript\", [\"pega.control.AutoCompleteAG.setFocusToInput(event)\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "SubmitModalFlowAction");
	String primaryPage = tools.getParamValue("pzPrimaryPageName");
	actionRequest.registerFixedParameter("pzPrimaryPageName",primaryPage);
	String ModalActionName = tools.getParamValue("NewTaskStatus");
	actionRequest.registerFixedParameter("ModalActionName", ModalActionName);
	actionRequest.registerFixedParameter("actionName", "");
	pzAuto.registerActionRequest(actionRequest);
	tools.appendString("[\"closeContainer\",[\":event\"]");
	}

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

					if(tools.getParamValue("partialTrigger").equals("appendTopyAppExplorerClassSelect.pxResults4")|| tools.getParamValue("partialTrigger").equals("editRowpyAppExplorerClassSelect.pxResults4") ){

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

					String curRowClass = cp.getProperty("curRowClass").getStringValue();

					tools.putParamValue("gridRowClass", curRowClass);

					tools.putParamValue("strIndexInList", tools.getStepPage().getProperty(pyPropRef).indexOf());

					tools.putParamValue("curRowNum", curRowNum);

					}

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getProperty("pyAppExplorerClassSelect.pxResults");

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

					 tools.putSaveValue("rowClass",tools.getParamValue("gridRowClass"));

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.pyAppExplorerClassSelect.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pyClassName"),-1);

					
 }}catch(Exception e){}

					tools.appendString(" data-gargs='[");

					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyClassName").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("'  PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					 repeatingDataCell_1(); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdroppyAppExplorerClassSelect.pxResults4")) {

					
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

					
		 pageListProp = tools.getProperty("pyAppExplorerClassSelect.pxResults");

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopuppyAppExplorerClassSelect.pxResults4")) { 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendTopyAppExplorerClassSelect.pxResults4") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty("pyAppExplorerClassSelect.pxResults");

					
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

					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					 tools.putSaveValue("rowClass",tools.getParamValue("gridRowClass"));

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.pyAppExplorerClassSelect.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("'  PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_2(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					 /* GenerateGrid: End */

					
					}

					
					public void 
gridBeginLayout_2
					
					() {

					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
 String strPageMode = "Progressive Load"; 

					
					
 String strPageSize = "10"; 

					
					
 String returnTotalCount = ""; 

					
					if("".equals(tools.getParamValue("gridAction"))) {String gridAction = tools.getParamValue("gridAction");tools.putParamValue("PageListProperty", "pyAppExplorerClassSelect.pxResults");tools.putParamValue("ClassName", "Rule-Obj-Class");tools.putParamValue("sortProperty", "");tools.putParamValue("sortType", "");tools.putParamValue("isReportDef", "false");tools.putParamValue("isLoadActivity", "false");tools.putParamValue("bCBOptimize", "true");tools.putParamValue("pyPageSize", "10");tools.putParamValue("startIndex", "1");tools.putParamValue("pyPageMode","Next Previous");

					
					tools.putParamValue("gridAction", "SORT");tools.putParamValue("categorizeBy", "[{'pyFieldName':'.pyBestBet','pySortType':'DESC','pySortOrder':1},{'pyFieldName':'.pyCategory','pySortType':'ASC','pySortOrder':2}]");HashStringMap keys = new HashStringMap();keys.put("pxObjClass","Rule-Obj-Activity");tools.putParamValue("isLoadActivity", "false");keys.put("pyActivityName","pzGridSortPaginate");tools.doActivity(keys,tools.getPrimaryPage(),null);tools.putParamValue("gridAction", gridAction);}
 ClipboardPage gFCritPagepyAppExplorerClassSelect_pxResultsL7=null;

					
					
 Map selUniqMappyAppExplorerClassSelect_pxResultsL7 = null;

					
					
 Set filteredIndicesSetpyAppExplorerClassSelect_pxResultsL7 = null;

					
					
	 String strFCPage = "pyFilterCriteria_pyAppExplorerClassSelect.pxResults_pzApplicationExplorer_4";

					
					
	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

					
					
	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

					
					
if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

					
					
	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

					
					
}

					
					
	 gFCritPagepyAppExplorerClassSelect_pxResultsL7 = tools.findPage(strFCPage, true);

					
					
	 if(gFCritPagepyAppExplorerClassSelect_pxResultsL7==null){gFCritPagepyAppExplorerClassSelect_pxResultsL7 = tools.createPage("Pega-GridFilterCriteria", strFCPage);}

					
					
tools.putParamValue("pyGridFilterCriteriaPage", strFCPage);

					
					
gFCritPagepyAppExplorerClassSelect_pxResultsL7.getProperty("pyRowVisibleWhenCondition").setValue("pzACRowVisibleWhen");

					
					
  selUniqMappyAppExplorerClassSelect_pxResultsL7 = null; // reset the variable

					
					
 if(gFCritPagepyAppExplorerClassSelect_pxResultsL7 != null){ 

					
					
 		 filteredIndicesSetpyAppExplorerClassSelect_pxResultsL7 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPagepyAppExplorerClassSelect_pxResultsL7, "pyAppExplorerClassSelect.pxResults");

					
					
 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetpyAppExplorerClassSelect_pxResultsL7);

					
					
 tools.putParamValue("populateSelectedUIValues", "true");

					
					
 		 selUniqMappyAppExplorerClassSelect_pxResultsL7 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPagepyAppExplorerClassSelect_pxResultsL7); 

					
					
 		 tools.getParameterPage().put("selUniqMappyAppExplorerClassSelect_pxResultsL7", selUniqMappyAppExplorerClassSelect_pxResultsL7);

					
					
 tools.putParamValue("populateSelectedUIValues", "");

					
					
 }

					
					if(tools.getParamValue("gridAction")!=null && !tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					tools.appendString("<div  section_index='4' ");

					
					tools.appendString(" dataSource='");tools.appendString("pyAppExplorerClassSelect.pxResults");tools.appendString("_pzApplicationExplorer_4'");

					
					tools.appendString(" bRowHovering='true' deferLoadAct='' class=\"");

					
					tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");

					
					if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");

					
					tools.appendString("");

					
					tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");

					
					tools.appendString(" fixedRow='true' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true'");

					
					if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {

					
					tools.appendString(" bFilteredGrid = 'true'");

					
					}

					
					tools.appendString(" bRangeFilterByFormat='false' bRowVisibleWhen = 'true' openOnDblClick='false' OAFunc='openRuleByKeys' ");

					
					pyAppExplorerClassSelect_pxResults_1();

					
					tools.appendString(">");

					
					

 ClipboardProperty pageListProp = null;

					
					
 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


					
					
 int currentPageIndex = 0; 

					
					
 if(startIndex == 0){ startIndex = 1; } 

					
					
 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

					
					
 tools.putParamValue("pyPageMode", strPageMode); 


					
					
 tools.putParamValue("pyPageSize", "10"); 

					
					
 tools.putSaveValue("pyPageSize", "10"); 

					
					
 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

					
					
 boolean bDiscardInvisibleRows = "true".equals(tools.getParamValue("bDiscardInvisibleRows"));

					
					
 if (!bDiscardInvisibleRows) {

					
					
 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 

					
					
 if(!"".equals(tools.getParamValue("recordsInCurrentPage"))) {

					
					
 currentPageIndex = Integer.parseInt(tools.getParamValue("recordsInCurrentPage"))/pyPageSize;

					
					
 }

					
					
 } else {

					
					
 if(!"".equals(tools.getParamValue("currentPageIndex"))) {

					
					
 currentPageIndex = Integer.parseInt(tools.getParamValue("currentPageIndex"));

					
					
 } }

					
					
 tools.putParamValue("startIndex",startIndex); 

					
					
 tools.putParamValue("currentPageIndex",currentPageIndex); 

					
					
 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

					
					
 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

					
					
 tools.putParamValue("endPageIndex",endPageIndex); 

					
					if(tools.findPage("pyAppExplorerClassSelect", true)!=null) {

					
					pageListProp = tools.getProperty("pyAppExplorerClassSelect.pxResults");

					
					}

					
					
 if(pageListProp!=null) { 

					
					
 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

					
					
 } else {

					
					
 tools.putParamValue("PageListProperty","pyAppExplorerClassSelect.pxResults");}

					
					/* to calculate the total number of records in case of filtering with pagination..false*/

					
					/* to calculate the total number of records in case of filtering with pagination..*/

					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					ClipboardProperty propActivePrev = tools.getActive(); 


					
					
					Iterator itr = tools.getProperty("pyAppExplorerClassSelect.pxResults").iterator();

					
					
					
					Set filteredResultsSet = new HashSet();

					
					
					
					
					while(itr.hasNext()){

					
					
					
					
					
					ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();

					
					
					
					
					
					ClipboardPage pg_eachProp = cp_eachProp.getPageValue();

					
					
					
					
					
					PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);

					
					
					
					
					
					tools.putActive(cp_eachProp);

					
					
					
					
					
					boolean bFilterResult = false;

					
					
					
					
					
					if(gFCritPagepyAppExplorerClassSelect_pxResultsL7!= null){

					
					
					
					
					
					bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPagepyAppExplorerClassSelect_pxResultsL7, selUniqMappyAppExplorerClassSelect_pxResultsL7);

					
					
					
					
					
					}

					
					
					
					
					
					if(bFilterResult){

					
					
					
					
					
					
					int itemIndex = cp_eachProp.indexOf() ;

					
					
					
					
					
					
					
					filteredResultsSet.add((Integer)itemIndex);

					
					
					
					
					
					
					
					}

					
					
					
					
					
					
					
					
 			 if (gFCritPagepyAppExplorerClassSelect_pxResultsL7== null || bFilterResult) {

					
					
					
					
					
					
					
					
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

					
					
					
					
					
					
					
					pageListProp = tools.getProperty("pyAppExplorerClassSelect.pxResults"); }

					
					
					
					
					
					
					
					
 	   int totalRecords = 0; 

					
					
					
					
					
					
					
					   if(!"".equals(tools.getParamValue("totalRecords"))){

					
					
					
					
					
					
					
					try{

					
					
					
					
					
					
					
					 totalRecords = Integer.parseInt(tools.getParamValue("totalRecords"));

					
					
					
					
					
					
					
					}catch(Exception e){/*A number format exception has occured.*/} }

					
					
					
					
					
					
					
					   tools.putSaveValue("totalRecords", ""+totalRecords); 


					
					
					
					
					
					
					
					 if(!tools.getParamValue("totalRecords").equals("")){ 


					
					
					
					
					
					
					
					   int endIndex = 0;


					
					
					
					
					
					
					
					   endIndex = startIndex + (pyPageSize*2) - 1;


					
					
					
					
					
					
					
					   endIndex = endIndex>totalRecords ? totalRecords : endIndex; 


					
					
					
					
					
					
					
					if (endIndex == 0 && gFCritPagepyAppExplorerClassSelect_pxResultsL7 != null && tools.getParamValue("gridAction").toLowerCase().equals("submitrow")) {

					
					
					
					
					
					
					
					endIndex = 1;

					
					
					
					
					
					
					
					}

					
					
					
					
					
					
					
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

					
					
					
					
					
					}

					
					
					
					
					
					

public void gridCentreLayout_1() {/*gridCentreLayout*/

					
					
					
					
					
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					
					
					
					
					
					java.util.Map functionsMap = null;

					
					
					
					
					
					java.util.Map classesMap = null;

					
					
					
					
					
					ClipboardPage gFCritPagepyAppExplorerClassSelect_pxResultsL7=null;

					
					
					
					
					
					Map selUniqMappyAppExplorerClassSelect_pxResultsL7 = null;

					
					
					
					
					
					selUniqMappyAppExplorerClassSelect_pxResultsL7 = null; // reset the variable

					
					
					
					
					
					gFCritPagepyAppExplorerClassSelect_pxResultsL7=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

					
					
					
					
					
							 selUniqMappyAppExplorerClassSelect_pxResultsL7 = (Map)tools.getParameterPage().getObject("selUniqMappyAppExplorerClassSelect_pxResultsL7");

					
					
					
					
					
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

					
					
					
					
					
					if(!tools.getParamValue("gridAction").equals("PAGINATE")){

					
					
					
					
					
					tools.putSaveValue("bAllowRowUpdate","true");

					
					
					
					
					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					
					
					
					tools.putSaveValue("bUseMenuInline","false");

					
					
					
					
					
					
					pzGridIncludes_1();

					
					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")){

					
					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("pyAppExplorerClassSelect.pxResults");

					
					
					
					
					
					
					}

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyBestBet .pyCategory .pyClassName  ' class='yui-skin-sam gPXFixed");

					
					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					
					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					
					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='pyAppExplorerClassSelectPpxResults4' editRowIndex='");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false categorizedGrid='true' categorizeBy='[{\"pyFieldName\":\".pyBestBet\",\"pySortType\":\"DESC\",\"pySortOrder\":1},{\"pyFieldName\":\".pyCategory\",\"pySortType\":\"ASC\",\"pySortOrder\":2}]'");

					
					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					
					}

					
					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					
					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}if(tools.getParamValue("refreshLayout").equals("true") && !tools.getParamValueCSF("editRowIndex").equals("") && !tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { tools.appendString("reloadSomePages='true'"); }tools.appendString(" pyGridAutoHeight=\"true\" pyNoScrollContainer=\"true\" pyPageSize = '");

					
					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">\n\t\t\t\t\t\t\t<div id='gridLayoutWrapper' noWidth='true' noHeight='true' style=\"");

					
					
					
					
					
					
					if(pzAuto.getBrowserUtils().isIE()){tools.appendString("width:0.0px;");

					
					
					
					
					
					
					}else{tools.appendString("width:2.0px;");

					
					
					
					
					
					
					}tools.appendString("height:220px;overflow-y:auto;\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					
					tools.appendString("");

					
					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"pyAppExplorerClassSelectPpxResults4colWidthGBL\" id=\"pyAppExplorerClassSelectPpxResults4colWidthGBL\" value=\"");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("pyAppExplorerClassSelectPpxResults4colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"pyAppExplorerClassSelectPpxResults4colWidthGBR\" id=\"pyAppExplorerClassSelectPpxResults4colWidthGBR\" value=\"");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("pyAppExplorerClassSelectPpxResults4colWidthGBR"));

					
					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >");

					
					
					
					
					
					
					
							 if(!tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t<div id='grid-topBuffer'></div> ");

					
					
					
					
					
					
					
							 }

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ' style='width:");

					
					
					
					
					
					
					 if(!tools.getParamValue("pyAppExplorerClassSelectPpxResults4colWidthGBL").equals("")) { tools.appendParamCSF("pyAppExplorerClassSelectPpxResults4colWidthGBL"); } else { 

					
					
					
					
					
					
					tools.appendString("246.0"); } 

					
					
					
					
					
					
					tools.appendString("px;table-layout:fixed;' cellspacing=0 cellpadding=0 id='bodyTbl_right' bRowResize=\"false\" PL_PROP='");

					
					
					
					
					
					
					
tools.appendString("pyAppExplorerClassSelect.pxResults");

					
					
					
					
					
					
					tools.appendString("' PL_PROP_CLASS='Rule-Obj-Class' PRIM_PAGE='");

					
					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t<tbody>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					
					
					
					
					
					
					
Boolean inputEnabled = tools.hasInputEnabled();

					
					
					
					
					
					
					
	 tools.setInput(false);

					
					
					
					
					
					
					 repeatingDataCell_3(); 

					
					
					
					
					
					
					activeName = tools.getActiveName(); 
tools.setInput(inputEnabled);

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
					
				 } 

					
					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
					StringBuffer countStrJson = new StringBuffer();

					
					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
					
							 if(tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					
					
					
					
					
					
							 tools.putSaveValue("isGrid", "true"); 

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t<table id='bodyTbl_right'>\n\t\t\t\t\t\t\t\t\t<tbody id='tempTBody'>");

					
					
					
					
					
					
					
							 }

					
					
					
					
					
					
					String strGroupedCol = null;

					
					
					
					
					
					
					String currentRow = null;

					
					
					
					
					
					
					int categorizeRowCount = 0;

					
					
					
					
					
					
					int prevCategoryLastRowIndex = 0;

					
					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					
					
								 itr_3 = tools.getProperty("pyAppExplorerClassSelect.pxResults").iterator(); 

					
					
					
					
					
					
					
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
										 } else if(gFCritPagepyAppExplorerClassSelect_pxResultsL7!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPagepyAppExplorerClassSelect_pxResultsL7, selUniqMappyAppExplorerClassSelect_pxResultsL7);
										 }
										 if (gFCritPagepyAppExplorerClassSelect_pxResultsL7== null || 

					
					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
					
										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

					
					
					
					
					
					
					
										 tools.getStepPage().getProperty("pyExpanded").setValue("true");

					
					
					
					
					
					
					}

					
					
					
					
					
					
					
										 counter++; 

					
					
					
					
					
					
					 if( !"".equals(tools.getParamValue("startIndex")) && !"".equals(tools.getParamValue("recordsInCurrentPage")) && ((counter>=(Integer.parseInt(tools.getParamValue("startIndex"))) && rowsDisplayed<(Integer.parseInt(tools.getParamValue("recordsInCurrentPage")))))) {

					
					
					
					
					
					
					if(strGroupedCol == null) {

					
					
					
					
					
					
					countStrJson.append("{\"" + "GCH" + tools.getParamValue("index") + "\":");

					
					
					
					
					
					
					currentRow =gridCategoryHeaderRow_1(strGroupedCol, prevCategoryLastRowIndex);

					
					
					
					
					
					
					prevCategoryLastRowIndex = tools.getActive().indexOf();

					
					
					
					
					
					
					strGroupedCol = currentRow;

					
					
					
					
					
					
					categorizeRowCount++;

					
					
					
					
					
					
					} else {

					
					
					
					
					
					
					currentRow =gridCategoryHeaderRow_1(strGroupedCol, prevCategoryLastRowIndex);

					
					
					
					
					
					
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

					
					
					
					
					
					
					 tools.putSaveValue("curRowNum",""+(rowsDisplayed + (Integer.parseInt(tools.getParamValue("startIndex"))) - 1)); 

					
					
					
					
					
					
					
						 tools.putParamValue("expandRL","true");

					
					
					
					
					
					
					
							 if(categorizeRowCount%2==0) { 

					
					
					
					
					
					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					
					
					
					
					
					 
								 if(!bGenerationForOffline) {

					
					
					
					
					
					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					
					
					
					
					
					}

					
					
					
					
					
					
					tools.appendString(" cellCont' ");

					
					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					
					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					
					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.pyAppExplorerClassSelect.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					
					 
								 }

					
					
					
					
					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
					
					
					
 ct_gridAction.trackValueChanges(tools.getProperty(".pyClassName"),-1);

					
					
					
					
					
					
					
 }}catch(Exception e){}

					
					
					
					
					
					
					tools.appendString(" data-gargs='[");

					
					
					
					
					
					
					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyClassName").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");

					
					
					
					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					
					
					
					gridOpenActionIncl_1();

					
					
					
					
					
					
					tools.appendString(" id='");

					
					
					
					
					
					
					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("'  PL_INDEX = '");

					
					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					
					 repeatingDataCell_4(); 

					
					
					
					
					
					
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

					
					
					
					
					
					
					if(categorizeRowCount !=0){

					
					
					
					
					
					
					countStrJson.append(categorizeRowCount + "}");

					
					
					
					
					
					
					}

					
					
					
					
					
					
					
								 }

					
					
					
					
					
					
					
							 if(tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t</tbody>\n\t\t\t\t\t\t\t\t</table>");

					
					
					
					
					
					
					
							 }else{

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t</tbody>");

					
					
					
					
					
					
					
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

					
					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"3\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Rule-Obj-Class", "tempNoRespg");

					
					
					
					
					
					
					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
					
					
					
					
					
					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					
					
					
					
					
					
					gridNoRowsMesgIncl_1(); 

					
					
					
					
					
					
					
									  pega.popStackFrame(frame, false);  

					
					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
					
					
					
					
					
					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
					
					
					
					
					
					
 tempNoRespg.removeFromClipboard();

					
					
					
					
					
					
					tools.appendString("\n </td></tr>");

					
					
					
					
					
					
					 } } }   

					
					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					
					
				 if(!tools.getParamValue("gridAction").equals("PAGINATE")) { 

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t<div id='grid-bottomBuffer' style='height:");

					
					
					
					
					
					
					 if(!"".equals(tools.getParamValue("totalRecords"))) tools.appendString(Integer.toString((Integer.parseInt(tools.getParamValue("totalRecords"))-(2*10))*22));

					
					
					
					
					
					
					tools.appendString("px;'></div> \n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodespyAppExplorerClassSelect.pxResults4") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
					
						 tools.putParamValue("partialTrigger",""); 
}

					
					
					
					
					
					
					
					 /* GenerateGrid: End */

					
					
					
					
					
					
					 } 

					
					
					
					
					
					
					}

					
					
					
					
					
					
					public void 
gridEndLayout_1
					
					
					
					
					
					
					() {

					
					
					
					
					
					
					
 tools.getParameterPage().remove("pyReportPageName"); 

					
					
					
					
					
					
					
 tools.getParameterPage().remove("pyGridFilterCriteriaPage"); 

					
					
					
					
					
					tools.appendString("</div></div>");

					
					
					
					
					
					}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzApplicationExplorer1_pyAppExplorerWorkPool";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\"><tr><td>");
}
public void 
gridLayout_1() {
	gridBeginLayout_2();
	gridCentreLayout_1();
	gridEndLayout_1();
}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</td></tr></table>");
}
public void 
acGridPreProcessor_1() {
	String strPropName= "pyAppExplorerWorkPool";
	String strClassName = "@baseclass";
	ClipboardProperty cbpResults=null;
	ParameterPage paramPage = new ParameterPage();
		 if( !"".equals(tools.getParamValue("AC_SrcParams"))){
			 ClipboardPage cpParams = tools.createPage("","");
			 try{cpParams.adoptJSONObject(tools.getParamValue("AC_SrcParams"));
			  Iterator propItr = cpParams.keySet().iterator(); ;
			  while(propItr.hasNext()){
				 String key = (String)propItr.next(); 
				 String value = cpParams.getString(key); 
				 if(key.startsWith("ACT_")){ 
					 paramPage.putParamValue(key.substring(4), value); }
			  }}catch(Exception e){}
		 }
	pega_rulesengine_utilities.pzRunActivity("pzAppExplorerClassSelect",paramPage,tools.getStepPage(),tools);
	}


public void autocompleteagIncludes_1() {
if (pzAuto.doOnlyOnce("pzAutoCompleteAGIncludes")) {
pzAuto.emitIncludeStreamReference("pzAutoCompleteAGIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;
		tools.appendString(" data-change-lazy='false'");isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzApplicationExplorer",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "pzAppExplorerTreeGrid");
						refreshActionRequest.registerFixedParameter("PreActivity", "pzLoadAppExplorerData");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzApplicationExplorer"));
						staticURLStr.append("&PreActivity=pzLoadAppExplorerData");
						tools.appendString("[\"refresh\", [\"thisSection\",\"pzAppExplorerTreeGrid\", \"pzLoadAppExplorerData\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassDisplay\":\"\"");
						tools.appendString("\", \"\", \",");
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
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }									{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
										com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
											StringBuffer staticURLStr = new StringBuffer();
											StringBuffer preActParamStr = new StringBuffer();
											StringBuffer preDTParamStr = new StringBuffer();
											String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
											tools.putParamValue("runTimeSecStreamName", "");
											if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
												try{
													pzPackageRuntime.packageSection("pzApplicationExplorer",
													tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
													}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
													}
													refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
													refreshActionRequest.registerFixedParameter("SectionName", "pzAppExplorerTreeGrid");
													refreshActionRequest.registerFixedParameter("PreActivity", "pzLoadAppExplorerData");
													staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
													staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzApplicationExplorer"));
													staticURLStr.append("&PreActivity=pzLoadAppExplorerData");
													tools.appendString("[\"refresh\", [\"thisSection\",\"pzAppExplorerTreeGrid\", \"pzLoadAppExplorerData\", \"");
													refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
													preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassDisplay\":\"\"");
													tools.appendString("\", \"\", \",");
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

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}															String returnString = actionsStringBuilder.toString();
															tools.popStreamBody();
															return returnString;
														}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" ),"","",true,"associated"));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclAction_1() {
}
public void inclCalVal_1(String controlName,String controlFormat, String styleClass) {tools.appendString("<P id=\"CV\" name=\"");tools.appendString(tools.getActive().getEntryHandle());tools.appendString("\" ");tools.appendString("RHP_NAME=\"");tools.appendString(controlName);tools.appendString(" \" ");tools.appendString(" data-ctl data-ctlformat=\"");tools.appendString(controlFormat);tools.appendString("\" ");
		tools.appendString(" class='");
		tools.appendString(styleClass);
		tools.appendString("' ");if(tools.getParamValue("AJAXTrackID") != null){com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));	changeTracker.trackValueChanges(tools.getActive(),-1);}
}
public void 
gridLayoutAsSection_1() {
	pzLayout.beginUIInspectorSpan();
	pzLayout.endUIInspectorSpan();
	tools.putSaveValue("sectionUniqueID", "SID" + (((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique())+ "");
	pzSection.includeExpressions();
	  pzSection.beginSection("pzApplicationExplorer",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzApplicationExplorer','insKey':'RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT','sectionType':'standard'}");
	
	 LayoutWrapperTableStart_1(); 
	gridLayout_1();
	 LayoutWrapperTableEnd_1(); 
	
	 pzSection.endSection(); inclAction_1();
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


public void pxAutoComplete_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = pzAuto.getSection().getControl().isControlEditable(false, null);
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		isEditable = true;
	 }
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	if(isEditable && "true".equals(tools.getParamValue("isControlEditableOriginal"))) {
	sEntryHandle = tools.getActive().getEntryHandle();
	 } else {
	sEntryHandle = tools.getActive().getEntryHandle(true, false);
	 }
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
	 if(pzAuto.getSection().getControl().isExpTarget(sEntryHandle) ) {
	 pega_rules_utilities.pzRegisterActivity(tools,"GetTargets");
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
inclCalVal_1("pxAutoComplete","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20141009131642034910493",true));
	cellPage.put("pyValue",".pyAppExplorerWorkPool");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyAppExplorerWorkPool");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyAppExplorerWorkPool", ".pyCaption");
	String associatedPropType = tools.getProperty(".pyAppExplorerWorkPool").getTypeName();
	boolean isAssPropNumeric = false;
	if ( associatedPropType.equals("Decimal") || associatedPropType.equals("Double")){
	isAssPropNumeric = true;
	modePage1.put("isAssPropNumeric",isAssPropNumeric);
	}
	String ddPropEntryHandle = tools.getActive().getEntryHandle();
	ddPropEntryHandle = pzAuto.getUIComponentRuntime().getRepeatingReference(ddPropEntryHandle , "entryHandle",false);
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyAppExplorerWorkPool",pxUniqueStreamHash+"_5");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_5");
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	modePage1.put("pyID","pyAppExplorerWorkPool");
	modePage1.put("styleOther","");
	modePage1.put("pyDisplayAsComboBox","false");
	modePage1.put("pyLightWeightAutoComplete","false");
	modePage1.put("pyDisplayFullScreen","true");
	modePage1.put("pyHighlightMatch","true");
	modePage1.put("pyMatchString","false");
	modePage1.put("pyAllowFreeFormInput","true");
	boolean is4Offline = pega_uiengine_offlinesupport.pzIsForOfflineTemplate();
	if(is4Offline) {
	String defaultValue="";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("pxThread.pxCurrentWorkPool");
	defaultValue = "pxThread.pxCurrentWorkPool";
	modePage1.put("defaultValue","pxThread.pxCurrentWorkPool");
	}
	modePage1.put("pySpecifySize","custom");
	modePage1.put("pyWidth","100");
	modePage1.put("pyWidthUnits","%");
	String spxUniqueStreamHash6 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash6 != null && !"".equals(spxUniqueStreamHash6)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash6,pxUniqueStreamHash+"_6");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_6");
	}
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyHelperTextType = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyHelperTextType","none\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("none", ".pyHelperTextType");
	}
	pyHelperTextType = "none";
	modePage1.put("helpertype",pyHelperTextType);
	IUIComponentMetadata pyListDataSource = pzAuto.getUIComponentRuntime().createMetadata();
	pyListDataSource.put("pyListSource","pageList");
	modePage1.put("pySourceName","pyAppExplorerClassSelect.pxResults");
	IUIComponentMetadata pyCBPage = pzAuto.getUIComponentRuntime().createMetadata();
	pyCBPage.put("pyListPreActivity","pzAppExplorerClassSelect");
	IUIComponentMetadata pyActParams = null;  
	ctPropRefs.add(tools.getStepPage().getReference()+".pyAppExplorerWorkPool");
	pyActParams = pzAuto.getUIComponentRuntime().createMetadata();  
	pyActParams.put("pyName","searchTerm");
	pyActParams.put("pyValue","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyAppExplorerWorkPool")+"~#");
	pyCBPage.addMetadataInArray("pyActParams",pyActParams);
	IUIComponentMetadata pyAdditionalField = null;  
	boolean isAdditionalPropNumeric = false;
	String additionalPropType = "";
	pyAdditionalField = pzAuto.getUIComponentRuntime().createMetadata();  
	pyAdditionalField.put("pyDisplayProperty",".pyClassName");
	pyAdditionalField.put("pyUseForSearch","true");
	pyAdditionalField.put("pyShow","true");
	pyAdditionalField.put("pySetValueOnSelect","true");
	pyAdditionalField.put("pyPropertyTarget","Associated property");
	ctPropRefs.add("pyCell.pyModes(1).pyListDataSource.pyCBPage.pyAdditionalFields(1).pyPropertyTarget");
	pyCBPage.addMetadataInArray("pyAdditionalFields",pyAdditionalField);
	pyListDataSource.putMetadata("pyCBPage",pyCBPage);
	String dataAttributes = "[\"EXPANDEDSubSectionpzApplicationExplorer1_pyAppExplorerWorkPool\",0,80,{\"ACT_searchTerm\" : \".pyAppExplorerWorkPool\"},\""+pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getStepPage().getReference(),"",false)+"\",10,false]";
	modePage1.put("dataAttributes",dataAttributes);
	modePage1.putMetadata("pyListDataSource",pyListDataSource);
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20141009131642034910493",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyAppExplorerWorkPool");
	pyValueR = ".pyAppExplorerWorkPool";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyAppExplorerWorkPool");
	pyValueOrig = ".pyAppExplorerWorkPool";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","associated");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","text");
	modePage2.put("pyReadonlyValidation",false);
	String pyAutoPrepend = "";
	String pyAutoAppend = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyCaption");
	pyAutoAppend ="";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyCaption");
	pyAutoPrepend ="";
	modePage2.put("pyAutoPrepend",pyAutoPrepend);
	modePage2.put("pyAutoAppend",pyAutoAppend);
	String spxUniqueStreamHash7 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash7,pxUniqueStreamHash+"_7");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_7");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addDependentScripts("pzpega_ui_template_autocomplete.js");
	ctrlComponent.addAdditionalScripts("pzAutoCompleteAGIncludes","pzpega_ui_template_autocompleteResults.js","pzpega_control_autocompleteag.js");
	ctrlComponent.beginComponent("pxAutoComplete",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	{
	try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")) {
	com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		ct_controlAction.trackValueChanges(tools.getProperty(".pyAppExplorerWorkPool"), -1);
	}}catch(Exception e){}
	}
} else {
	autocompleteagIncludes_1();
	
			String disabled_ctrl = ""; 
	String strPropName= tools.getActive().getName();
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				
cellChangeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyAppExplorerWorkPool", -1);
			}
		}catch(Exception e){}
		
		{com.pega.pegarules.priv.runtime.IActionRequest propertyActionRequest = pzAuto.getPropertyActionRequest();
		
		propertyActionRequest.registerClientParameter("AC_Grid_FilterParamValue");}
		String activeValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		String styleName = "autocomplete_input ac_";
				if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		styleName += " ErrorShade ";
				}
		tools.appendString("<span nowrap data-ctl='[\\\"AutoCompleteAG\\\"]' >");
		HashStringMap keys= new HashStringMap();
		keys.put("pxObjClass","Rule-Obj-When");
		keys.put("pyClassName","@baseclass");
		keys.put("pyBlockName","pyIsMobilePhone");
		 boolean isMobilePhone = tools.evaluateWhen(keys);
		tools.appendString("<input  " + pzCell.getTestIdIfEnabled("20141009131642034910493") + " type='text' data-ctl='[\"AutoCompleteAG\"]' autocomplete='off' autocorrect='off' autocapitalize='off' role='combobox' aria-expanded='false' name='" + pega_uiengine_pzcontrol.pzGetActiveName((PegaStreamAPI)tools,true) + "' aria-describedby='" + pega_uiengine_pzcontrol.pzGetActiveName((PegaStreamAPI)tools,true) + "Error' id='");
		tools.appendString(tools.getHTMLIDForProperty(false,"autocomplete"));
		tools.appendString("' " + disabled_ctrl + " ");

		{boolean isBehaviorAdded = false;
		tools.appendString(" data-change-lazy='false'");isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
				com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
					StringBuffer staticURLStr = new StringBuffer();
					StringBuffer preActParamStr = new StringBuffer();
					StringBuffer preDTParamStr = new StringBuffer();
					String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
					tools.putParamValue("runTimeSecStreamName", "");
					if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
						try{
							pzPackageRuntime.packageSection("pzApplicationExplorer",
							tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
							}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
							}
							refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
							refreshActionRequest.registerFixedParameter("SectionName", "pzAppExplorerTreeGrid");
							refreshActionRequest.registerFixedParameter("PreActivity", "pzLoadAppExplorerData");
							staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
							staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzApplicationExplorer"));
							staticURLStr.append("&PreActivity=pzLoadAppExplorerData");
							tools.appendString("[\"refresh\", [\"thisSection\",\"pzAppExplorerTreeGrid\", \"pzLoadAppExplorerData\", \"");
							refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
							preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassDisplay\":\"\"");
							tools.appendString("\", \"\", \",");
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
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keydown='[");if(isBehaviorAdded && true){ tools.appendString(","); }										{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
											com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
												StringBuffer staticURLStr = new StringBuffer();
												StringBuffer preActParamStr = new StringBuffer();
												StringBuffer preDTParamStr = new StringBuffer();
												String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
												tools.putParamValue("runTimeSecStreamName", "");
												if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
													try{
														pzPackageRuntime.packageSection("pzApplicationExplorer",
														tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
														}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
														}
														refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
														refreshActionRequest.registerFixedParameter("SectionName", "pzAppExplorerTreeGrid");
														refreshActionRequest.registerFixedParameter("PreActivity", "pzLoadAppExplorerData");
														staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
														staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzApplicationExplorer"));
														staticURLStr.append("&PreActivity=pzLoadAppExplorerData");
														tools.appendString("[\"refresh\", [\"thisSection\",\"pzAppExplorerTreeGrid\", \"pzLoadAppExplorerData\", \"");
														refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
														preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"ClassDisplay\":\"\"");
														tools.appendString("\", \"\", \",");
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

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}																tools.appendString(" ");
																pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
																	if(isMobilePhone){
																	tools.appendString("data-displayFullScreen = \"true\"");
																}
																tools.appendString("class=\""+styleName+"\"");
																String associatedPropValue = activeValue;
																tools.appendString(" value=\"");
																String associatedPropertyType= tools.getProperty(".pyAppExplorerWorkPool").getTypeName(); 
																boolean isAssPropNumeric= (associatedPropertyType.equals("Double") || associatedPropertyType.equals("Decimal"))?true : false; 
																if (isAssPropNumeric && associatedPropValue!=null && !associatedPropValue.equals("")){
																tools.appendCSF(PRNumberFormat.format(null,PRNumberFormat.DEFAULT_DECIMAL, false, null,Double.parseDouble(associatedPropValue)));
																} else {
																tools.appendCSF(associatedPropValue);
																}
																tools.appendString("\" ");
																if (isAssPropNumeric){
																tools.appendString("data-ac-numeric-prop = true");
																}
																tools.appendString(" style='width:100%' data-attributes='[ \"EXPANDEDSubSectionpzApplicationExplorer1_pyAppExplorerWorkPool\",0,0,{\"ACT_searchTerm\" : \".pyAppExplorerWorkPool\"},\"" + tools.getStepPage().getReference() + "\",10,false]' /><span class='autocomplete_span' ><div class='autocomplete_icon' id='acspin'  ></div></span>");
																pega_uiengine_pzcontrol.pzAddMessages(tools,"SIMPLELAYOUT");
																tools.appendString("</span>");
																String strHiddenPropName =""; 
																boolean isAdditionalPropNumeric = false;
																String additionalPropType = "" ;
																String additionalPropActualVal = "" ;
															}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");															
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxAutoComplete");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20141009131642034910493") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");															
	}
															tools.putParamValue("doAutoFormatting", "false");
															tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); 															} catch (Exception e) {

															
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'															&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }																}


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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxAutoComplete",".pyAppExplorerWorkPool",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "    " + pzSection.getCustomStyle(false, "","explorer_search","explorer_search")  + " '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxAutoComplete_1(".pyAppExplorerWorkPool",0,"","","Text");
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141009131642034910493-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxAutoComplete");
	pgCells.put("forLabel",".pyAppExplorerWorkPool");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("customROStyles","explorer_search");
	pgCells.put("customRWStyles","explorer_search");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxAutoComplete",".pyAppExplorerWorkPool",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxAutoComplete_1(".pyAppExplorerWorkPool",0,"","","Text");labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpzApplicationExplorerB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201910211633260625755") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-stacked content-stacked  clearfix" + "'  ");
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
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","stacked");
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
	String paramName = "EXPANDEDSubSectionpzApplicationExplorerB";
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
public void 
sectionDefaultValues_1() {
	boolean isInputEnabled=true;
	if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	isInputEnabled=tools.hasInputEnabled();
	}if(isInputEnabled){
	ClipboardPage myStepPage = tools.getPrimaryPage();
	if(pzAuto.handleEvaluateWhen(" o2== rx.pyAppExplorerWorkPool cq",".pyAppExplorerWorkPool", "cell", "active" )) {
		 tools.getProperty(".pyAppExplorerWorkPool").setValue(FUAUtil.createQueryBuilder().scalarProperty("pxCurrentWorkPool").buildScalarValueQuery().resolveToString(tools, pega.findPageWithException("pxThread", "Code-Pega-Thread"), ImmutablePropertyInfo.TYPE_TEXT));if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){String tempDefault=tools.getProperty(".pyAppExplorerWorkPool").toString();
		 tools.getProperty(".pyAppExplorerWorkPool").setValue("");pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDefaultValue(".pyAppExplorerWorkPool",tempDefault);}
}
	tools.getInfEngUtils().forwardChain(tools);
	}}


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
}public boolean pzIsADP_1() {

				  boolean includeADPParam = false;
					 if (((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).isDeclarativePageName("D_AppExplorerPinnedClasses")) {pega.getDeclarativePageUtils().getDeclarePageScope("D_AppExplorerPinnedClasses");
							tools.putParamValue("subscriptionId", tools.getRequestor().getId()+"_"+tools.getThread().getName()+"_"+tools.getParamValue("ChannelName")+"_"+tools.getParamValue("ChannelParam"));
							((PegaAPI)tools).loadAsyncDeclarativePage("D_AppExplorerPinnedClasses");
							if (!((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).isDeclarePageReady("D_AppExplorerPinnedClasses", true)) {
								includeADPParam = true;
							}
					 }
return includeADPParam;
}



private void performStream_1() throws Throwable {
buildWhiteList_4();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzApplicationExplorer");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayoutContainer_3", new String[][] { {"methodName", "String", ""}});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("pzLayoutContainer_2", new String[][] { {"methodName", "String", ""}});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZAPPLICATIONEXPLORER #20191217T182451.065 GMT", "@baseclass pzApplicationExplorer", "Pega-Desktop", "08-05-01", "20200330T191344.575 GMT");
}
