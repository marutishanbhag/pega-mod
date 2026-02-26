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
import com.pega.pegarules.priv.context.PegaThread;
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
 * Builds JSP stream RULE-!PZUNITTESTCASES.
 */
public class ra_stream_pzunittestcases_1679af0a2d7f73f1f6f39a6d26949474 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzUnitTestCases.Rule_Obj_Activity.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1921578320;
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
	public ra_stream_pzunittestcases_1679af0a2d7f73f1f6f39a6d26949474(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "cf8a9e052738818cd36758c0373f1e8493826b0a";
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
/* Instance RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT	Pega-AutoTest:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "cf8a9e052738818cd36758c0373f1e8493826b0a";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzUnitTestCases",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT */
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
	"Rule-File-Text:WEBWB!PZPEGA_CONTROL_CHECKBOX!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:PZUNITTESTCASES", 
	"Rule-Obj-Property:PYLATESTRESULT", 
	"Rule-Obj-Property:PYSELECTED", 
	"Rule-Obj-Property:PXCREATEOPNAME", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXDROPDOWN", 
	"Rule-HTML-Property:PXCREATEOPNAME", 
	"Rule-HTML-Property:PXCHECKBOX", 
	"Rule-HTML-Property:PXBUTTON"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PZPEGA_CONTROL_CHECKBOX!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT","WEBWB!PZPEGA_CONTROL_CHECKBOX!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZUNITTESTCASES","Rule-HTML-Section","RULE-",false,"","Pega-AutoTest","08-03-01","RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT","!PZUNITTESTCASES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1921578320), 
		new DependentRuleInfo("PYLATESTRESULT","Rule-Obj-Property","RULE-TEST-UNIT-CASE",true,"Rule-Test-Unit-Case","Pega-AutoTest","08-01-01","RULE-OBJ-PROPERTY RULE-TEST-UNIT-CASE PYLATESTRESULT #20180713T142145.705 GMT","!PYLATESTRESULT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSELECTED","Rule-Obj-Property","@BASECLASS",true,"Rule-Test-Unit-Case","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT","!PYSELECTED",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXCREATEOPNAME","Rule-Obj-Property","@BASECLASS",false,"","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT","!PXCREATEOPNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
		new DependentRuleInfo("PXDROPDOWN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT","PXDROPDOWN",true,false,"ABSOLUTE_CLASSLESS",1414051726), 
		new DependentRuleInfo("PXCREATEOPNAME","Rule-HTML-Property","",false,"","Pega-RULES","08-01-01","RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT","PXCREATEOPNAME",true,false,"ABSOLUTE_CLASSLESS",-2113945581), 
		new DependentRuleInfo("PXCHECKBOX","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT","PXCHECKBOX",true,false,"ABSOLUTE_CLASSLESS",-1770834696), 
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
//	RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT:20190311T100657.855 GMT
//	RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT:20190131T183501.527 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT:20180713T133232.019 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT:20180713T131328.240 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY RULE-TEST-UNIT-CASE PYLATESTRESULT #20180713T142145.705 GMT:20180713T142145.705 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY RULE-TEST-UNIT-CASE PYLATESTRESULT #20180713T142145.705 GMT:20180713T142145.705 GMT
//	RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT:20190131T183501.527 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT:20180713T133232.019 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT:20180713T131328.240 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY RULE-TEST-UNIT-CASE PYLATESTRESULT #20180713T142145.705 GMT:20180713T142145.705 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT:20190131T183501.527 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT:20180713T133232.019 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-HTML-PROPERTY PXCHECKBOX #20190131T183501.527 GMT:20190131T183501.527 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_CHECKBOX!JS #20180713T133232.019 GMT:20180713T133232.019 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYSELECTED #20180713T131842.942 GMT:20180713T131842.942 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT:20180713T131328.240 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY RULE-TEST-UNIT-CASE PYLATESTRESULT #20180713T142145.705 GMT:20180713T142145.705 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_9(
//	simpleLayout_3(
//	simpleLayout_2(
//	simpleLayout_1(
//	simpleLayout_4(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENRULE--(CLIPBOARDPAGED2D8EBC7F29F977F1A20CFC6559990AA #20180713T133344.491 GMT:20180713T133344.491 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONPOSTVALUE--(BOOLEAN,CLIPBOARDPAGE,CLIPBOARDPAGE) #20200623T114924.749 GMT:20200626T092833.607 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNDATATRANSFORM--(CLIPB9514A9C33ADD6709FD6A843ADA2991DD #20220104T102659.447 GMT:20220104T102659.447 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCHECKAUTOGENCONTROL--(CLIPBOARDPROPERTY) #20180713T133344.796 GMT:20180713T133344.796 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZENABLEDSKIPLOCALIZATION #20180713T133344.810 GMT:20180713T133344.810 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECHECKBOX #20220110T052602.744 GMT:20220210T153209.831 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPAGECLASS #20190222T143815.273 GMT:20190222T143815.273 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
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
		return "b5154261fa1d415ccc9af77edd91c675";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
String actionName = tools.getParamValue("pyAction");
if(!actionName.equals("PostValue") && !actionName.equals("ReadonlyFormat")){
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
pzLayoutBodyWrapper_2();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzUnitTestCases",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzUnitTestCases','insKey':'RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT','sectionType':'standard'}");
pzLayout_10();
 tools.putSaveValue("ContainerID", "");
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {tools.putParamValue("setPostValueURL", "true");} else {tools.appendString("<div style=\"display:none;\" data-postvalue-url=\"" + StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=ReloadCell&StreamName=pzUnitTestCases")) + "\"></div>");}
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
pega.getUIEngine().getUIAction("refresh", null).register();
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
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pzPrimaryPageName", "RunRecordWindow");
config.put("checkForNewPage", "true");
config.put("harnessName", "pxRunRecord");
config.put("className", "Pega-RunRecord");
config.put("pzPrimaryPage", "RunRecordWindow");
config.put("preActivity", "pzRunRecordInitializeWrapper");
config.put("target", "popup");
pega.getUIEngine().getUIAction("showHarness", config).register();
config = new HashMap<String, String>();
config.put("pyPreActivity", "WBRun");
config.put("contextSelect", "");
config.put("ErrorMessage", "");
pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzPostTestRunTransform");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "pzExpireDataPage");
config.put("StaticDataTransformParams", "IsCalledFromRefreshButton=true");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "exportToExcelLP");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzUnitTestCases");
pega.getUIEngine().getUIAction("sort", config).register();
config = new HashMap<String, String>();
config.put("pyPageMode", "Numeric");
pega.getUIEngine().getUIAction("paginate", config).register();
pega.getUIEngine().getUIAction("filter", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refreshList", null).register();
config = new HashMap<String, String>();
config.put("selectedCount", "");
config.put("pyPreDataTransform.pyName", "pzRFUpdateSelectedCount");
config.put("pzDataTransformStaticParams", "selectedCount&runAll&isRuleFormContext");
config.put("runAll", "");
config.put("isRuleFormContext", "true");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
config = new HashMap<String, String>();
config.put("selectedCount", "");
config.put("pyPreDataTransform.pyName", "pzIncrementCount");
config.put("pzDataTransformStaticParams", "selectedCount&runAll");
config.put("runAll", "");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("paramKeys", "pyRunTime&pzInsKey&pyPurpose&pxInstanceLockedKey&pyTestCaseKey");
config.put("harnessName", "pzShowTestRunDetails");
config.put("action", "Display");
config.put("className", "Data-TestCaseResults");
config.put("model", "pzSetDocumentKey");
config.put("readOnly", "false");
config.put("label", "View Test for");
pega.getUIEngine().getUIAction("openlanding", config).register();
}
public void 
getControlMarkup_1() {
try {
if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pySelected").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxCheckbox_3(".pySelected",0,"","","True-False");pzAuto.getUIComponentRuntime().insertTemplateScripts();}
else if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pySelected").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxCheckbox_4(".pySelected",0,"","","True-False");pzAuto.getUIComponentRuntime().insertTemplateScripts();}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void pzLayoutBody_4() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
}
public void pzLayoutBodyWrapper_12() {
tools.appendString("<div class='layout layout-noheader layout-noheader-default'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_11() {
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
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}


public void pxDropdown_4(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_81")){
inclCalVal_1("pxDropdown","TF&&text&&false&&Yes&&No","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_82")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20171124013856093156302") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_83")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_15() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Disabled"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyLatestResult", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_4(".pyLatestResult",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_4(".pyLatestResult",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
pegaReferenceTag_3() {
try {
	final ClipboardProperty currentProperty_3 = tools.getProperty(".pxCreateOpName");
	if (currentProperty_3 != null && currentProperty_3.getParentPage().getClassName().equals("Rule-Obj-Activity")) {
		final ClipboardProperty propPrevActive_3 = tools.putActive(currentProperty_3);
		final boolean prevInputMode_3 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
			final String currentPropertyRef_3 = currentProperty_3.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_3);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_3);
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Activity_pxCreateOpName();
			}
		} finally {
			tools.putActive(propPrevActive_3);
		}
	} else {
if (_jspx_meth_pega_reference__2(pageContext, ".pxCreateOpName", "input")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_14() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Created by"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",".pxCreateOpName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_3();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_3();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxLink_4() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_80")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_43'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141209010514018021404") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"openRule\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");tools.appendString("\",\"false\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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

public void repeatingDataCell_13() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Name"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxLink_4();
									tools.appendString("</DIV>"); } else { pxLink_4();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxCheckbox_4(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = true;
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_77")){
inclCalVal_1("pxCheckbox","TF&&text&&false&&True&&False","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_78")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_79")){String disabled_ctrl = "";

		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		 if(isSecuredProp){
				 activeValue = activePropValue;
		}boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
String pegaRLindex = tools.getParamValueCSF("pega_RLindex");
if (!"".equals(rptDynamicIdx)) {
	pegaRLindex += "_rdi_" + rptDynamicIdx;
}

		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(tools.getActive().getEntryHandle(), new String[]{"true","false"});String errorClass = "";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		errorClass += " ErrorShade";
		}

		if(pzAuto.doOnlyOnce("Checkbox")) {IStaticContentRuntime pzStatic_Checkbox = pzAuto.getStaticBlock("script");
	pzStatic_Checkbox.addFile("pzpega_control_checkbox", "11562282053", "js");
pzStatic_Checkbox.setMoveToEnd(true);
pzStatic_Checkbox.emitContent();

		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		tools.appendString("\n<input type='hidden' value='false' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); } tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" /><input type='checkbox'  " + pzCell.getTestIdIfEnabled("201501220214230757250644") + "   class='checkbox chkBxCtl"+errorClass+"' value='true' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); }
		String checkboxName = ""; tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));
		checkboxName = StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());
		checkboxName = StringUtils.crossScriptingFilter(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" aria-describedby='"+checkboxName+"Error'");
		tools.appendString(" id='");if(bOptimizedMarkup){
tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' data-ctl='Checkbox' ");} else{
tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' data-ctl='Checkbox' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		if(!bOptimizedMarkup && (activeValue != null) && activeValue.equalsIgnoreCase("true")){
			tools.appendString(" checked ");
				 if(bOptimizedMarkup){ tools.appendString(" data-bindDefaultValue='true' ");} 
		}
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzUnitTestCases";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}tools.appendString("[\"postValue\",[\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
	com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
	actionRequestD.registerFixedParameter("pyModelName","pzIncrementCount");
		String usingPageString = "";
		usingPageString = "";
		tools.appendString("[\"runDataTransform\", [\"pzIncrementCount\", \"selectedCount=");
		actionRequestD.registerFixedParameter("selectedCount","");
		tools.appendString("&runAll=");
		actionRequestD.registerFixedParameter("runAll","");
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
		pzPackageRuntime.packageDataTransform(contextClass, "pzIncrementCount");
		}
			pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" />");
		tools.appendString("<label  class=' cb_standard' for='");if(bOptimizedMarkup){
		tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' ");} else{
		tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' ");}
		tools.appendString("data-click='.' ");
	 tools.appendString("data-ctl ='Checkbox'"); 
	tools.appendString("class='chkbxCaptionRight'>");
		tools.appendString("</label>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");			
	}
			tools.putParamValue("doAutoFormatting", "false");
			tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); 			} catch (Exception e) {

			
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'			&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }				}


}

public void repeatingDataCell_12() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ".pySelected"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxCheckbox",".pySelected", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:49px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxCheckbox_4(".pySelected",0,"","","True-False");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxCheckbox_4(".pySelected",0,"","","True-False");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingHeaderCell_7() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataColumnProp = "pzTestCaseRunStatusWrapperLP";
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxPages(RESULT).pyTestCaseRunResult";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Result' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141208074814021717286") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Result"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(7)")); tools.appendString(" id='a7' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString(" pointerStyle ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		
		tools.appendString(" bSortable = 'true' sortField = '.pxPages(RESULT).pyTestCaseRunResult' ");
		
		
		tools.appendString(" bSecInclude = 'true' ");
		
		
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthCache7").equals("")) { tools.appendParamCSF("D_pxGetTestCaseDataPpxResults1colWidthCache7");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:34px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1645587619'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Result", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1645587619' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1645587619' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1645587619' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxPages&#40;RESULT&#41;.pyTestCaseRunResult")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1645587619' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");
									tools.appendString("</div>");
								ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyTestCaseRunResult7").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1645587619\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyTestCaseRunResult7").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1645587619\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyTestCaseRunResult7").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyTestCaseRunResult7").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyTestCaseRunResult7").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyTestCaseRunResult7").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_6() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataColumnProp = "pzShowRunAndExpectedTimeWrapper";
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxPages(RESULT).pyActualElapsedTime";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Run/Expected time' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20150205065608045049987") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Run/Expected time"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(6)")); tools.appendString(" id='a6' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false' sortField = '.pxPages(RESULT).pyActualElapsedTime' ");
		
		
		tools.appendString(" bSecInclude = 'true' ");
		
		
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthCache6").equals("")) { tools.appendParamCSF("D_pxGetTestCaseDataPpxResults1colWidthCache6");} else { tools.appendString("15.860597439544808"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:34px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont leftAlign filterapplied'");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Run/Expected time", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");
								ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyActualElapsedTime6").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1774518311\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyActualElapsedTime6").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1774518311\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyActualElapsedTime6").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyActualElapsedTime6").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyActualElapsedTime6").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyActualElapsedTime6").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_5() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Rule-Test-Unit-Case";
	dataColumnProp = "pyLatestResult";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyLatestResult";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Disabled' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20171124013856092755184") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Disabled"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)")); tools.appendString(" id='a5' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyLatestResult' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'format'  pyRangeFiltering = ''  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthCache5").equals("")) { tools.appendParamCSF("D_pxGetTestCaseDataPpxResults1colWidthCache5");} else { tools.appendString("7.32574679943101"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:34px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1646388360'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Disabled", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1646388360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1646388360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1646388360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyLatestResult")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1646388360' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLatestResult5").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1646388360\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLatestResult5").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1646388360\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLatestResult5").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLatestResult5").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLatestResult5").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLatestResult5").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_4() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataColumnProp = "pzTestCaseRunTimeWrapperLP";
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxPages(RESULT).pyRunTime";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Last run' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141208074814021716581") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Last run"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString(" pointerStyle ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		
		tools.appendString(" bSortable = 'true' sortField = '.pxPages(RESULT).pyRunTime' ");
		
		
		tools.appendString(" bSecInclude = 'true'  data-dateTimeFormat = '' ");
		
		
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthCache4").equals("")) { tools.appendParamCSF("D_pxGetTestCaseDataPpxResults1colWidthCache4");} else { tools.appendString("17.852062588904694"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:34px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1062157019'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Last run", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1062157019' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1062157019' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1062157019' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxPages&#40;RESULT&#41;.pyRunTime")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1062157019' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");
									tools.appendString("</div>");
								ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyRunTime4").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1062157019\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyRunTime4").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1062157019\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyRunTime4").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyRunTime4").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxPagesRESULTpyRunTime4").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxPagesRESULTpyRunTime4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_3() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Rule-Test-Unit-Case";
	dataColumnProp = "pxCreateOpName";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxCreateOpName";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Created by' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141208074814021715571") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Created by"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxCreateOpName' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthCache3").equals("")) { tools.appendParamCSF("D_pxGetTestCaseDataPpxResults1colWidthCache3");} else { tools.appendString("12.660028449502134"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:34px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1974431255'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Created by", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1974431255' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1974431255' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1974431255' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxCreateOpName")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1974431255' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName3").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1974431255\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName3").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1974431255\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName3").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName3").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName3").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "Rule-Test-Unit-Case";
	dataColumnProp = "pyLabel";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyLabel";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Name' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141208074814021614488") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Name"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyLabel' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthCache2").equals("")) { tools.appendParamCSF("D_pxGetTestCaseDataPpxResults1colWidthCache2");} else { tools.appendString("30.938833570412516"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:34px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc908662778'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Name", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(!bSecured){if("".equals(tools.getParamValue("sortProperty"))){ 
tools.putParamValue("columnSortOrder","");
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc908662778' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc908662778' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc908662778' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyLabel")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc908662778' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle908662778\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle908662778\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_pxGetTestCaseData_pxResultsL7!=null && !gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_pxGetTestCaseData_pxResultsL7.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void inclFormattedVal_4(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		String formattedValue = pega_uiengine_formatter.pxFormatTrueFalse((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"True","False",true,"text","","");
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}


public void pxCheckbox_3(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_73")){
inclCalVal_1("pxCheckbox","TF&&text&&false&&True&&False","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_74")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_75")){String disabled_ctrl = "";

		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		 if(isSecuredProp){
				 activeValue = activePropValue;
		}boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
String pegaRLindex = tools.getParamValueCSF("pega_RLindex");
if (!"".equals(rptDynamicIdx)) {
	pegaRLindex += "_rdi_" + rptDynamicIdx;
}

		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(tools.getActive().getEntryHandle(), new String[]{"true","false"});String errorClass = "";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		errorClass += " ErrorShade";
		}

		if(pzAuto.doOnlyOnce("Checkbox")) {IStaticContentRuntime pzStatic_Checkbox = pzAuto.getStaticBlock("script");
	pzStatic_Checkbox.addFile("pzpega_control_checkbox", "11562282053", "js");
pzStatic_Checkbox.setMoveToEnd(true);
pzStatic_Checkbox.emitContent();

		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		tools.appendString("\n<input type='hidden' value='false' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); } tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" /><input type='checkbox'  " + pzCell.getTestIdIfEnabled("201501220214230755244237") + "   class='checkbox chkBxCtl"+errorClass+"' value='true' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); }
		String checkboxName = ""; tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));
		checkboxName = StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());
		checkboxName = StringUtils.crossScriptingFilter(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" aria-describedby='"+checkboxName+"Error'");
		tools.appendString(" id='");if(bOptimizedMarkup){
tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' data-ctl='Checkbox' ");} else{
tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' data-ctl='Checkbox' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		if(!bOptimizedMarkup && (activeValue != null) && activeValue.equalsIgnoreCase("true")){
			tools.appendString(" checked ");
				 if(bOptimizedMarkup){ tools.appendString(" data-bindDefaultValue='true' ");} 
		}
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzUnitTestCases";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}tools.appendString("[\"postValue\",[\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"REFRESHLIST\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
	com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
	actionRequestD.registerFixedParameter("pyModelName","pzRFUpdateSelectedCount");
		String usingPageString = "";
		usingPageString = "";
		tools.appendString("[\"runDataTransform\", [\"pzRFUpdateSelectedCount\", \"selectedCount=");
		actionRequestD.registerFixedParameter("selectedCount","");
		tools.appendString("&runAll=");
		actionRequestD.registerFixedParameter("runAll","");
		tools.appendString("&isRuleFormContext=true");
		actionRequestD.registerFixedParameter("isRuleFormContext","true");
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
		pzPackageRuntime.packageDataTransform(contextClass, "pzRFUpdateSelectedCount");
		}
			pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" />");
		tools.appendString("<label  class=' cb_standard' for='");if(bOptimizedMarkup){
		tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' ");} else{
		tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' ");}
		tools.appendString("data-click='.' ");
	 tools.appendString("data-ctl ='Checkbox'"); 
	tools.appendString("class='chkbxCaptionRight'>");
		tools.appendString("</label>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");			
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxCheckbox");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("201501220214230755244237") + " ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_76")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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


	tools.putActive(propActivePrev); 			} catch (Exception e) {

			
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'			&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }				}


}

public void repeatingHeaderCell_1() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pySelected";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='.pySelected' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("201501220214230755244237") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ".pySelected"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxCheckbox",".pySelected", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("height:36px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_pxGetTestCaseDataPpxResults1colWidthCache1");} else { tools.appendString("2.5604551920341394"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:34px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");pxCheckbox_3(".pySelected",0,"","","True-False");if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public void buildSection_11() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	secInfo.put("pxGadgetClass", "PegaGadget-GridPagination");
	Map<String, String> advanceParams = new HashMap<String, String>();
	advanceParams.put("pyPageMode", "Numeric");
	advanceParams.put("pxObjClass", "PegaGadget-GridPagination");
	advanceParams.put("pxCreateOperator", "bokks");
	advanceParams.put("pxCreateDateTime", "20100625T142549.323 GMT");
	advanceParams.put("pyPaginationButtonsFormat", "pzhc");
	advanceParams.put("pxCreateSystemID", "sde");
	advanceParams.put("pyAppliesTo", "@baseclass");
	advanceParams.put("pxCreateOpName", "Suman Bokkasam");
	secInfo.put("advanceParams", advanceParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_72","pyGridPaginator", secInfo);
}


public void sectionBodyIncludeInCell_11(boolean isEditable, boolean isReadOnly, String strReadOnlyWhen, String streamName) { 
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
buildSection_11();
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
sectionBodyIncludeInCell_11(false,false,"","pyGridPaginator");elementModel_1("pyGridPaginator","pzUnitTestCases","BAR","");
 } 
public void 
labelIncludeInCell_2(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2014120807481401836915") + "  ");
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
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20150122071132031181930") + "  ");
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
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='1' class = 'gridActionTop'>" + "<table role='presentation'  section_index='1'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:89%;",false,"","");tools.appendString("<nobr>");
	labelIncludeInCell_1("","","","",false,"",true,false,"Standard",false);
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignCenter","dataLabelWrite gridActionAlignCenter"), "width:0%;",false,"","");labelIncludeInCell_2("","","","",false,"",true,false,"Standard",false);
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("SUB_SECTION","pyGridPaginator",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignRight","dataLabelWrite gridActionAlignRight"), "width:9%;",false,"","");sectionIncludeInCell_pyGridPaginator_1(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 
public void pzSetExpandParam_10() {
pzSection.getLayout().setExpandParam("SubSectionpzUnitTestCasesBBBBB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzUnitTestCasesBBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Numeric"; 

 String strPageSize = "10"; 

 String returnTotalCount = ""; 
if(tools.getIfPresent(".pxInsName") != null)
tools.putParamValue("RecordsUnderTest",tools.getProperty(".pxInsName").getStringValue());
tools.putParamValue("ApplicationScopeList","");
tools.putParamValue("ReturnResult","true");
if(tools.getIfPresent(".pxObjClass") != null)
tools.putParamValue("RecordsUnderTestType",tools.getProperty(".pxObjClass").getStringValue());
ClipboardPage tmpDeclarePageParams = null;
String dpParams = tools.getParamValue("declarePageParams");
java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(\\{)(.+?)(:)|(,)(.+?)(:)");
java.util.regex.Matcher matcher = pattern.matcher(dpParams);
while (matcher.find()) {
String name = matcher.group(2);
String name1 = matcher.group(5);
if (name != null)
dpParams = dpParams.replace(name, name.replaceAll("\\.", "_"));
if (name1 != null)
dpParams = dpParams.replace(name1, name1.replaceAll("\\.", "_"));
}
try {
if (!"".equals(dpParams)) {
Object dpParamsList = tools.createPage("@baseclass","Temp_Grid_DeclarePageParams");
tmpDeclarePageParams = (ClipboardPage)dpParamsList;
tmpDeclarePageParams.adoptJSONObject(dpParams);
}
if (tmpDeclarePageParams != null && tmpDeclarePageParams.getProperty("D_pxGetTestCaseData_pxResults_pzUnitTestCases_1") != null) {
ClipboardPage paramList = tmpDeclarePageParams.getProperty("D_pxGetTestCaseData_pxResults_pzUnitTestCases_1").getPageValue();
java.util.Collection col= paramList.values();
Iterator it = col.iterator();
while(it.hasNext()){
ClipboardProperty cp= (ClipboardProperty)it.next();
tools.putParamValue(cp.getName(),cp.toString());
}
}
} catch(InvalidStreamError e){
oLog.error("ReloadSections:Invalid JSON Stream for data page params : "+e.getMessage());
} catch(Exception e){
oLog.error("ReloadSections:Expection : "+e.getMessage());
}

 ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7=null;

 Map selUniqMapD_pxGetTestCaseData_pxResultsL7 = null;

 Set filteredIndicesSetD_pxGetTestCaseData_pxResultsL7 = null;

	 String strFCPage = "pyFilterCriteria_D_pxGetTestCaseData.pxResults_pzUnitTestCases_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

gFCritPageD_pxGetTestCaseData_pxResultsL7=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

  selUniqMapD_pxGetTestCaseData_pxResultsL7 = null; // reset the variable

 if(gFCritPageD_pxGetTestCaseData_pxResultsL7 != null){ 

 		 filteredIndicesSetD_pxGetTestCaseData_pxResultsL7 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_pxGetTestCaseData_pxResultsL7, "D_pxGetTestCaseData.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_pxGetTestCaseData_pxResultsL7);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapD_pxGetTestCaseData_pxResultsL7 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_pxGetTestCaseData_pxResultsL7); 

 		 tools.getParameterPage().put("selUniqMapD_pxGetTestCaseData_pxResultsL7", selUniqMapD_pxGetTestCaseData_pxResultsL7);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div id='CT' RLW='true'IRW=\".pxInsName Changes || .pxObjClass Changes\" data-declare-params=\"");
tools.appendString("{'RecordsUnderTest':'"+ "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxInsName")+"~#" +"','ReturnResult':'true','RecordsUnderTestType':'"+ "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxObjClass")+"~#" +"'}");tools.appendString("\" >");
						try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker refreshListWhenTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pxInsName"), -1);

							refreshListWhenTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pxObjClass"), -1);
}}catch(Exception e){}
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pxGetTestCaseData.pxResults").getReference());tools.appendString("_pzUnitTestCases_1'");
tools.appendString(" hashed-dp-page='");
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pxGetTestCaseData.pxResults").getReference());tools.appendString("' bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201702170653250413635") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='false' bLoadActivity='false' bDataObject='true' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='true' DPSectionID=\"SubSectionpzUnitTestCasesBBBBB\"  openOnDblClick='false' OAFunc='openRuleByKeys' ");
D_pxGetTestCaseData_pxResults_1();
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

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {


 pageListProp = tools.getProperty("D_pxGetTestCaseData.pxResults"); 
 int iDPTotPages = (pageListProp.size()%pyPageSize==0) ? (pageListProp.size()/pyPageSize) : (pageListProp.size()/pyPageSize)+1;
 if(((startIndex/pyPageSize)+1)>iDPTotPages) {
	 currentPageIndex = iDPTotPages;
	 startIndex = ((iDPTotPages-1)*pyPageSize)+1;
 }
if(currentPageIndex<=0) { currentPageIndex = 1; }
if(startIndex<=0) { startIndex = 1; }
}

 tools.putParamValue("startIndex",startIndex); 

 tools.putParamValue("currentPageIndex",currentPageIndex); 

 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

 tools.putParamValue("endPageIndex",endPageIndex); 

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","D_pxGetTestCaseData.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("D_pxGetTestCaseData.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageD_pxGetTestCaseData_pxResultsL7!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pxGetTestCaseData_pxResultsL7, selUniqMapD_pxGetTestCaseData_pxResultsL7);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageD_pxGetTestCaseData_pxResultsL7== null || bFilterResult) {
						
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
						pageListProp = tools.getProperty("D_pxGetTestCaseData.pxResults"); }
						
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
					java.util.Map functionsMap = null;
					java.util.Map classesMap = null;
					ClipboardPage gFCritPageD_pxGetTestCaseData_pxResultsL7=null;
					Map selUniqMapD_pxGetTestCaseData_pxResultsL7 = null;
					selUniqMapD_pxGetTestCaseData_pxResultsL7 = null; // reset the variable
					gFCritPageD_pxGetTestCaseData_pxResultsL7=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
							 selUniqMapD_pxGetTestCaseData_pxResultsL7 = (Map)tools.getParameterPage().getObject("selUniqMapD_pxGetTestCaseData_pxResultsL7");
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

					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")&& !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()){

					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_pxGetTestCaseData.pxResults");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pySelected .pyLabel .pxCreateOpName  .pyLatestResult    ' class='yui-skin-sam gPercent grid-responsive-default ");

					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					tools.appendString("' gPropIndex='D_pxGetTestCaseDataPpxResults1' editRowIndex='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"false\"");

					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" dpParams=\"RecordsUnderTest,ApplicationScopeList,ReturnResult,RecordsUnderTestType\" pyPageSize = '");

					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">");

					
					
					
					
					
					

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201702170653250413635-layout") + " ");

					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "Test Cases";

					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_pxGetTestCaseDataPpxResults1colWidthGBL\" id=\"D_pxGetTestCaseDataPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"D_pxGetTestCaseDataPpxResults1colWidthGBR\" id=\"D_pxGetTestCaseDataPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pxGetTestCaseDataPpxResults1colWidthGBR"));

					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					
					 if(!("".equals(tools.getParamValue("D_pxGetTestCaseDataPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='Test Cases' PL_PROP='D_pxGetTestCaseData.pxResults' PL_PROP_CLASS='Rule-Test-Unit-Case' PRIM_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					
					
					
					
					
					 repeatingHeaderCell_1(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_5(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_6(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_7(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
					
					
					
					
								 itr_3 = tools.getProperty("D_pxGetTestCaseData.pxResults").iterator(); 

					
					
					
					
					
					} else {

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed", rowsDisplayed + "");

					
					
					
					
					
					}

					
					
					
					
					
					
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
										 } else if(gFCritPageD_pxGetTestCaseData_pxResultsL7!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pxGetTestCaseData_pxResultsL7, selUniqMapD_pxGetTestCaseData_pxResultsL7);
										 }
										 if (gFCritPageD_pxGetTestCaseData_pxResultsL7== null || 

					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

					
					
					
					
					
					
										 tools.getStepPage().getProperty("pyExpanded").setValue("true");

					
					
					
					
					
					}

					
					
					
					
					
					
										 counter++; 

					
					
					
					
					
					 if( !"".equals(tools.getParamValue("startIndex")) && !"".equals(tools.getParamValue("recordsInCurrentPage")) && ((counter>=(Integer.parseInt(tools.getParamValue("startIndex"))) && rowsDisplayed<(Integer.parseInt(tools.getParamValue("recordsInCurrentPage")))))) {

					
					
					
					
					
					 rowsDisplayed++; 

					
					
					
					
					
					 tools.putSaveValue("curRowNum",""+(rowsDisplayed + (Integer.parseInt(tools.getParamValue("startIndex"))) - 1)); 

					
					
					
					
					
					
						 tools.putParamValue("expandRL","true");

					
					
					
					
					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					
					
					
					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					
					
					
					
					 
								 if(!bGenerationForOffline) {

					
					
					
					
					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" cellCont' ");

					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_pxGetTestCaseData.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					 
								 }

					
					
					
					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
					
					
 }}catch(Exception e){}

					
					
					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					
					
					gridOpenActionIncl_1();

					
					
					
					
					
					tools.appendString(" id='");

					
					
					
					
					
					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("' ");

					
					
					
					
					
					{

					
					
					
					
					
					String tempTestID = "";

					
					
					
					
					
					String rowTestID = "R";

					
					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pxGetTestCaseData.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pxGetTestCaseData.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pxGetTestCaseData.pxResults"); } catch (Exception ex) { }

					
					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					
					}

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702170653250413635-" + rowTestID) + " ");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_12(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_13(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_14(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_15(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_6(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_7(); 

					
					
					
					
					
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

					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"7\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Rule-Test-Unit-Case", "tempNoRespg");

					
					
					
					
					
					
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

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_pxGetTestCaseData.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
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
public void pzLayout_9() {
String gridLayoutMethodName="pzLayout_9";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_10();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_11();
 LayoutWrapperTableEnd_1(); tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_10() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_9() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"exportToExcelLP(");
	String strPropReference21 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxInsName")+"~#";
	String strFormattedPropReference21 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference21);
	if(strPropReference21.equals(strFormattedPropReference21)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference21.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference21.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(",this,event,");
	String strPropReference24 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxObjClass")+"~#";
	String strFormattedPropReference24 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference24);
	if(strPropReference24.equals(strFormattedPropReference24)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference24.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference24.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxInsName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pxObjClass"), -1);
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20161202094334004765972") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzUnitTestCases_$CTX$_15");
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
		tools.getLocalizedTextForString(".pyButtonLabel","Export to excel\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Export to excel", ".pyButtonLabel");
	}
	pyLabel = "Export to excel";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash64 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash64 != null && !"".equals(spxUniqueStreamHash64)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash64,pxUniqueStreamHash+"_64");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_64");
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
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_15'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20161202094334004765972") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"exportToExcelLP(");
	String strPropReference21 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxInsName")+"~#";
	String strFormattedPropReference21 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference21);
	if(strPropReference21.equals(strFormattedPropReference21)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference21.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference21.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(",this,event,");
	String strPropReference24 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxObjClass")+"~#";
	String strFormattedPropReference24 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference24);
	if(strPropReference24.equals(strFormattedPropReference24)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference24.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference24.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pxInsName"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pxObjClass"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Export to excel".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Export to excel",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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

public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzPostTestRunTransform");
			String usingPageString = "";
			usingPageString = "D_pzUnitTestCase";
			tools.appendString("[\"runDataTransform\", [\"pzPostTestRunTransform\", \"=");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzPostTestRunTransform");
			}
				pzAuto.registerActionRequest(actionRequest);
				}
				tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
						com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
							StringBuffer staticURLStr = new StringBuffer();
							StringBuffer preActParamStr = new StringBuffer();
							StringBuffer preDTParamStr = new StringBuffer();
							String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
							tools.putParamValue("runTimeSecStreamName", "");
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("pzUnitTestCases",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("SectionName", "");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzUnitTestCases"));
									staticURLStr.append("&PreDataTransform=pzExpireDataPage");
									tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									tools.appendString("=\", \"\", \"pzExpireDataPage,");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									preDTParamStr.append((!"".equals(preDTParamStr.toString())?",":"") + "\"IsCalledFromRefreshButton\":\"true\"");
									refreshActionRequestD.registerFixedParameter("IsCalledFromRefreshButton","true");
									tools.appendString("\",\":event\",\"\",[\"");
									if(!"".equals(preActParamStr.toString())) {
										staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
										}
										if(!"".equals(preDTParamStr.toString())) {
											staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
											}
											tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
											if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
											pzPackageRuntime.packageDataTransform(tools.getStepPage().getString("pxObjClass"), "pzExpireDataPage");
											}
											pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}											String returnString = actionsStringBuilder.toString();
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
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20150107041111032699266") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzUnitTestCases_$CTX$_14");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Refresh\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Refresh", ".pyActionPrompt");
	}
	pyTooltip = "Refresh";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Refresh\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Refresh", ".pyButtonLabel");
	}
	pyLabel = "Refresh";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash60 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash60 != null && !"".equals(spxUniqueStreamHash60)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash60,pxUniqueStreamHash+"_60");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_60");
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
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_14'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20150107041111032699266") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzPostTestRunTransform");
			String usingPageString = "";
			usingPageString = "D_pzUnitTestCase";
			tools.appendString("[\"runDataTransform\", [\"pzPostTestRunTransform\", \"=");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzPostTestRunTransform");
			}
				pzAuto.registerActionRequest(actionRequest);
				}
				tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
						com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
							StringBuffer staticURLStr = new StringBuffer();
							StringBuffer preActParamStr = new StringBuffer();
							StringBuffer preDTParamStr = new StringBuffer();
							String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
							tools.putParamValue("runTimeSecStreamName", "");
							if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
								try{
									pzPackageRuntime.packageSection("pzUnitTestCases",
									tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
									}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
									}
									refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
									refreshActionRequest.registerFixedParameter("SectionName", "");
									staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
									staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzUnitTestCases"));
									staticURLStr.append("&PreDataTransform=pzExpireDataPage");
									tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									tools.appendString("=\", \"\", \"pzExpireDataPage,");
									refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
									preDTParamStr.append((!"".equals(preDTParamStr.toString())?",":"") + "\"IsCalledFromRefreshButton\":\"true\"");
									refreshActionRequestD.registerFixedParameter("IsCalledFromRefreshButton","true");
									tools.appendString("\",\":event\",\"\",[\"");
									if(!"".equals(preActParamStr.toString())) {
										staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
										}
										if(!"".equals(preDTParamStr.toString())) {
											staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
											}
											tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
											if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
											pzPackageRuntime.packageDataTransform(tools.getStepPage().getString("pxObjClass"), "pzExpireDataPage");
											}
											pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Refresh\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Refresh".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Refresh",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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

public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=WBRun");
	} else {
	tools.appendString("&amp;pyPreActivity=WBRun");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&InsHandle=");
	} else {
	tools.appendString("&amp;InsHandle=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&ErrorMessage=");
	} else {
	tools.appendString("&amp;ErrorMessage=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&contextSelect=");
	} else {
	tools.appendString("&amp;contextSelect=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");	tools.appendString("\", \"height=950,width=750,location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyLabel"), -1);
		}}catch(Exception e){}	String returnString = actionsStringBuilder.toString();
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(".pzInsKey = '' || .pyToolBarSettings.pyRun = false",pxUniqueStreamHash+"_55");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage2.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_55");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20160826080101056563876") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzUnitTestCases_$CTX$_13");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Add Test case\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Add Test case", ".pyActionPrompt");
	}
	pyTooltip = "Add Test case";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Add new\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Add new", ".pyButtonLabel");
	}
	pyLabel = "Add new";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash56 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash56 != null && !"".equals(spxUniqueStreamHash56)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash56,pxUniqueStreamHash+"_56");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_56");
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
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_13'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20160826080101056563876") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=WBRun");
	} else {
	tools.appendString("&amp;pyPreActivity=WBRun");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&InsHandle=");
	} else {
	tools.appendString("&amp;InsHandle=");
	}

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&ErrorMessage=");
	} else {
	tools.appendString("&amp;ErrorMessage=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&contextSelect=");
	} else {
	tools.appendString("&amp;contextSelect=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyLabel")+"~#");	tools.appendString("\", \"height=950,width=750,location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyLabel"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Add Test case\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, ".pzInsKey = '' || .pyToolBarSettings.pyRun = false", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Add new".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Add new",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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
		metadata.put("cellInfo", "Add new");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}



public void generateClientWhenDiv_5() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pxObjClass\"  SHOW_WHEN=\".pxObjClass != 'Rule-Obj-CaseType' && .pxObjClass != 'Rule-Obj-Flow' && .pxObjClass != 'Rule-Declare-DecisionTable' && .pxObjClass != 'Rule-Declare-DecisionTree' && .pxObjClass != 'Rule-Decision-Strategy' && .pxObjClass != 'Rule-Obj-Report-Definition'  && .pxObjClass != 'Rule-Obj-MapValue'  && .pxObjClass != 'Rule-Declare-Expressions'\"");
if(pzAuto.evaluateWhen(".pxObjClass != 'Rule-Obj-CaseType' && .pxObjClass != 'Rule-Obj-Flow' && .pxObjClass != 'Rule-Declare-DecisionTable' && .pxObjClass != 'Rule-Declare-DecisionTree' && .pxObjClass != 'Rule-Decision-Strategy' && .pxObjClass != 'Rule-Obj-Report-Definition'  && .pxObjClass != 'Rule-Obj-MapValue'  && .pxObjClass != 'Rule-Declare-Expressions'",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pxObjClass", -1);
	}
}catch(Exception e){}
}


public void pxButton_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_50")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_12'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("2014120807481402192849") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"showHarnessWrapper\",[\"popup\",\"");

		tools.appendFormatted("Pega-RunRecord",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("pxRunRecord",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("pzRunRecordInitializeWrapper",StreamBuilder.FMT_NORMAL);tools.appendString("\",");
{com.google.gson.JsonObject jObject = new com.google.gson.JsonObject();com.google.gson.JsonObject propRefJSON = new com.google.gson.JsonObject();{propRefJSON.addProperty("InsHandle","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");}if(!"{}".equals(propRefJSON.toString())){jObject.add("preActivityDynamicParams",propRefJSON);}
		tools.appendFormatted(jObject.toString(),StreamBuilder.FMT_NORMAL);}tools.appendString(",\"");

		tools.appendString(pzAuto.getUIComponentRuntime().generateActionTokenForStepPage());tools.appendString("\",\"No\",\"scrollbars=yes,resizable=1,width=");

		tools.appendFormatted("950",StreamBuilder.FMT_NORMAL);tools.appendString(",height=");

		tools.appendFormatted("700",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");tools.appendString("\",\"\",\":event\",\"RunRecordWindow\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\"]");
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
pzPackageRuntime.packageHarness("pxRunRecord",
"RunRecordWindow",
"Pega-RunRecord"
,"Display","0");
}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Add Test case\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, ".pzInsKey = '' || .pyToolBarSettings.pyRun = false", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString("class='pzhc");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		tools.appendString("<div class='pzbtn-rnd'  data-click='.'><div class='pzbtn-lft'  data-click='..' ");
		tools.appendString(" ><div class='pzbtn-rgt'  data-click='...'><div class='pzbtn-mid' ");if(bOptimizedMarkup){tools.appendString("data-bindprops='innerHTML,title' ");}tools.appendString(" data-click='....'>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Add new".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.....' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Add new",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("<img alt='' src='webwb/zblankimage.gif' class='pzbtn-i'/>");
		tools.appendString("</div></div></div></div>");
		tools.appendString("</button>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}} catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Add new");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void pzLayoutBodyWrapper_8() {
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_49","pzRuleSpecificButtons", secInfo);
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
	String sectionName = "pzRuleSpecificButtons"; 
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
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionCellpzUnitTestCases892","",false);
}
public void pzLayout_6() {
pzSetExpandParam_9();
pzLayoutBodyWrapper_8();
}
public void buildSection_9() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_45","pzRuleSpecificButtons", secInfo);
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
	String sectionName = "pzRuleSpecificButtons"; 
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


public void generateClientWhenDiv_4() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pxObjClass\"  SHOW_WHEN=\".pxObjClass == 'Rule-Obj-CaseType'\"");
if(pzAuto.evaluateWhen(".pxObjClass == 'Rule-Obj-CaseType'",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pxObjClass", -1);
	}
}catch(Exception e){}
}
public void pzLayoutBodyWrapper_7() {
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_44","pzRuleSpecificButtons", secInfo);
}


public void sectionBodyIncludeInCell_8() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_8();
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
	String sectionName = "pzRuleSpecificButtons"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellpzUnitTestCases59","",false);
}
public void pzLayout_5() {
pzSetExpandParam_8();
pzLayoutBodyWrapper_7();
}
public void buildSection_7() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_40","pzRuleSpecificButtons", secInfo);
}


public void sectionBodyIncludeInCell_7() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_7();
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
	String sectionName = "pzRuleSpecificButtons"; 
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


public void generateClientWhenDiv_3() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pxObjClass\"  SHOW_WHEN=\".pxObjClass== 'Rule-Obj-Flow'\"");
if(pzAuto.evaluateWhen(".pxObjClass== 'Rule-Obj-Flow'",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pxObjClass", -1);
	}
}catch(Exception e){}
}
public void pzLayoutBodyWrapper_6() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_6();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_6() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","D_pzUnitTestCase");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_39","pzRFRunSelected", secInfo);
}


public void sectionBodyIncludeInCell_6() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_6();
	return;
	}
	String strSectionPageProp = "";
	
	{tools.putParamValue("decParamList","{}");tools.putParamValue("sectionPageNameBase","D_pzUnitTestCase");}
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
	String sectionName = "pzRFRunSelected"; 
	String usingPage = null;
	usingPage = "D_pzUnitTestCase";
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
pzSection.getLayout().setExpandParam("SubSectionCellpzUnitTestCases593","",false);
}
public void pzLayout_4() {
pzSetExpandParam_7();
pzLayoutBodyWrapper_6();
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","D_pzUnitTestCase");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_36","pzRFRunSelected", secInfo);
}


public void sectionBodyIncludeInCell_5() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	
	{tools.putParamValue("decParamList","{}");tools.putParamValue("sectionPageNameBase","D_pzUnitTestCase");}
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
	String sectionName = "pzRFRunSelected"; 
	String usingPage = null;
	usingPage = "D_pzUnitTestCase";
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRFRunSelected",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
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
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRFRunSelected",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_3();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSpecificButtons",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_7();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
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
	expressionId = pxUniqueStreamHash+"_43";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pxObjClass== 'Rule-Obj-Flow'", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSpecificButtons",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
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


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_4();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSpecificButtons",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_9();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
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
	expressionId = pxUniqueStreamHash+"_48";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pxObjClass == 'Rule-Obj-CaseType'", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSpecificButtons",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
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


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_5();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	expressionId = pxUniqueStreamHash+"_53";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pxObjClass != 'Rule-Obj-CaseType' && .pxObjClass != 'Rule-Obj-Flow' && .pxObjClass != 'Rule-Declare-DecisionTable' && .pxObjClass != 'Rule-Declare-DecisionTree' && .pxObjClass != 'Rule-Decision-Strategy' && .pxObjClass != 'Rule-Obj-Report-Definition'  && .pxObjClass != 'Rule-Obj-MapValue'  && .pxObjClass != 'Rule-Declare-Expressions'", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014120807481402192849-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_1();labelName = "Add new";
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


public int simpleLayoutCell_9( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2|| o2|| o2|| o2|| o2== rx.pxObjClass cqRule-Declare-DecisionTable o2== rx.pxObjClass cqRule-Declare-DecisionTree o2== rx.pxObjClass cqRule-Obj-Report-Definition o2== rx.pxObjClass cqRule-Obj-MapValue o2== rx.pxObjClass cqRule-Declare-Expressions",".pxObjClass == \'Rule-Declare-DecisionTable\' || .pxObjClass == \'Rule-Declare-DecisionTree\' || .pxObjClass == \'Rule-Obj-Report-Definition\' || .pxObjClass == \'Rule-Obj-MapValue\' || .pxObjClass == \'Rule-Declare-Expressions\'","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_2();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20160826080101056563876-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2|| o2|| o2|| o2|| o2== rx.pxObjClass cqRule-Declare-DecisionTable o2== rx.pxObjClass cqRule-Declare-DecisionTree o2== rx.pxObjClass cqRule-Obj-Report-Definition o2== rx.pxObjClass cqRule-Obj-MapValue o2== rx.pxObjClass cqRule-Declare-Expressions",pxUniqueStreamHash+"_58");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_58");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName",".pxObjClass == 'Rule-Declare-DecisionTable' || .pxObjClass == 'Rule-Declare-DecisionTree' || .pxObjClass == 'Rule-Obj-Report-Definition' || .pxObjClass == 'Rule-Obj-MapValue' || .pxObjClass == 'Rule-Declare-Expressions'");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_58");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2|| o2|| o2|| o2|| o2== rx.pxObjClass cqRule-Declare-DecisionTable o2== rx.pxObjClass cqRule-Declare-DecisionTree o2== rx.pxObjClass cqRule-Obj-Report-Definition o2== rx.pxObjClass cqRule-Obj-MapValue o2== rx.pxObjClass cqRule-Declare-Expressions", pxUniqueStreamHash+"_58"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(5)");
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
	labelName = "Add new";
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


public int simpleLayoutCell_10( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(6)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_3();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150107041111032699266-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(6)");
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


public int simpleLayoutCell_11( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(7)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing remove-right-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_4();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20161202094334004765972-Label")).append(" ").toString().replace("data-test-id=","").trim());
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(7)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_4();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpzUnitTestCasesBBBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash35 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash35 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash35 != null && !"".equals(spxUniqueStreamHash35)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash35,pxUniqueStreamHash+"_35");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201801110225390726620") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash35 != null && !"".equals(spxUniqueStreamHash35)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_35");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}") + "").append("\"").toString();
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
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_9(index);
	}else{
		index=simpleLayoutTemplateCell_9(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_10(index);
	}else{
		index=simpleLayoutTemplateCell_10(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_11(index);
	}else{
		index=simpleLayoutTemplateCell_11(index);
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
	String paramName = "EXPANDEDSubSectionpzUnitTestCasesBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","7");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_2();
	containerComponent.endComponent();
	}
public void pzLayout_7() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_6();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_9();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_5() {
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_34","pzRFProgressbarWrapper", secInfo);
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
	String sectionName = "pzRFProgressbarWrapper"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellpzUnitTestCases74","",false);
}
public void pzLayout_3() {
pzSetExpandParam_5();
pzLayoutBodyWrapper_5();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_31","pzRFProgressbarWrapper", secInfo);
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
	String sectionName = "pzRFProgressbarWrapper"; 
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
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
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
	index++;
	return index;
}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzUnitTestCasesBBB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash28 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash28 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash28 != null && !"".equals(spxUniqueStreamHash28)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash28,pxUniqueStreamHash+"_28");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201801110225390726406") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + " content  layout-content-simple_list content-simple_list " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash28 != null && !"".equals(spxUniqueStreamHash28)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_28");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
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
	String paramName = "EXPANDEDSubSectionpzUnitTestCasesBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","4");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_4();
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
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Rule-");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_27","pzRFSelectAllTestCases", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"pzRFSelectAllTestCases", tools.getStepPage().getReference(),"Rule-");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	
	
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
	String sectionName = "pzRFSelectAllTestCases"; 
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
pzSection.getLayout().setExpandParam("SubSectionCellpzUnitTestCases450","",false);
}
public void pzLayout_1() {
pzSetExpandParam_3();
pzLayoutBodyWrapper_3();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Rule-");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_23","pzRFSelectAllTestCases", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"pzRFSelectAllTestCases", tools.getStepPage().getReference(),"Rule-");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	
	
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
	String sectionName = "pzRFSelectAllTestCases"; 
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


public void generateClientWhenDiv_2() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
String strRWPreActivity = "";
strRWPreActivity = "";
if(currentTemplatingStatus =='N'){

}
String strDTransform = "";
strDTransform = "";
if(currentTemplatingStatus =='N') {
try {
tools.appendString("RWP=\".pySelected,.pySelectedTestsCount\" RW=\"D_pzUnitTestCase.pySelected Changes || D_pzUnitTestCase.pySelectedTestsCount Changes\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
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
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_pzUnitTestCase.pySelected"), -1);
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking("D_pzUnitTestCase.pySelectedTestsCount"), -1);
	}
}catch(Exception e){}
}


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_2();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRFSelectAllTestCases",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
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
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_26";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  "D_pzUnitTestCase.pySelected Changes || D_pzUnitTestCase.pySelectedTestsCount Changes",expressionId);
		 String pyCustomRequireFormat= "";
		pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
		String baseRef ="";
		boolean pyDLCellVisibility = false;
		IUIComponent cc_dlCell = pzAuto.getUIComponent();
		IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
		pgCells.put("pyType","sub_section");
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
		String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRFSelectAllTestCases",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
	

public int simpleLayoutCell_3( int index) {
		IUIComponent uiComp = null;
		String labelName = "";
		String ariahiddenString = "";
		String baseRef ="";
		generateClientWhenDiv_1();
		tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
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
		tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRFProgressbarWrapper",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
		String tempRenderSingle = "";
		
		
		tempRenderSingle = tools.getParamValue("RenderSingle");
		tools.putParamValue("RenderSingle","");
		sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
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
		String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRFProgressbarWrapper",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
		if(!inspectorData.isEmpty()) {
		pgCells.put("liveUI",inspectorData);
		}
		String tempRenderSingle = "";
		tempRenderSingle = tools.getParamValue("RenderSingle");
		tools.putParamValue("RenderSingle", "");
		pzLayout_3();
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
	

public int simpleLayoutCell_12( int index) {
		IUIComponent uiComp = null;
		String labelName = "";
		String ariahiddenString = "";
		String baseRef ="";
		generateClientWhenDiv_1();
		tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing float-left set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
		pzLayout_7();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
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
		String baseRef ="";
		boolean pyDLCellVisibility = false;
		IUIComponent cc_dlCell = pzAuto.getUIComponent();
		IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
		pgCells.put("pyType","layout");
		pgCells.put("RWActive","false");
		pgCells.put("partialClass","remove-all-spacing float-left set-width-auto");
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
		pzLayout_7();
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzUnitTestCasesBB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash22 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash22 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash22 != null && !"".equals(spxUniqueStreamHash22)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash22,pxUniqueStreamHash+"_22");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201801110225390724685") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + " content  layout-content-simple_list content-simple_list " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash22 != null && !"".equals(spxUniqueStreamHash22)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_22");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","simple_list");
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
		index=simpleLayoutCell_12(index);
	}else{
		index=simpleLayoutTemplateCell_12(index);
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
	String paramName = "EXPANDEDSubSectionpzUnitTestCasesBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_3();
	containerComponent.endComponent();
	}
public void pzLayout_8() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_10();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
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


public int simpleLayoutCell_13( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_8();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","flex flex-row");
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


public int simpleLayoutCell_14( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_71")) ){pzLayout_9();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","flex flex-row");
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
	
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_71")) ){pzLayout_9();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
pzSection.getLayout().setExpandParam("SubSectionpzUnitTestCasesB","",false);
}


public void simpleLayout_4() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash21 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash21 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash21 != null && !"".equals(spxUniqueStreamHash21)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash21,pxUniqueStreamHash+"_21");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201801110225390724216") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash21 != null && !"".equals(spxUniqueStreamHash21)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_21");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","stacked");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
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
	String paramName = "EXPANDEDSubSectionpzUnitTestCasesB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_4();
	containerComponent.endComponent();
	}
public void pzLayout_10() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_12();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_2() {

if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxDropdown_3(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){
inclCalVal_1("pxDropdown","TF&&text&&false&&Yes&&No","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20171124013856093156302") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_11() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Disabled"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyLatestResult", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_3(".pyLatestResult",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_3(".pyLatestResult",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
pegaReferenceTag_2() {
try {
	final ClipboardProperty currentProperty_2 = tools.getProperty(".pxCreateOpName");
	if (currentProperty_2 != null && currentProperty_2.getParentPage().getClassName().equals("Rule-Obj-Activity")) {
		final ClipboardProperty propPrevActive_2 = tools.putActive(currentProperty_2);
		final boolean prevInputMode_2 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
			final String currentPropertyRef_2 = currentProperty_2.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_2);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_2);
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Activity_pxCreateOpName();
			}
		} finally {
			tools.putActive(propPrevActive_2);
		}
	} else {
if (_jspx_meth_pega_reference__2(pageContext, ".pxCreateOpName", "input")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_10() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Created by"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",".pxCreateOpName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_2();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_2();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxLink_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_43'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141209010514018021404") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"openRule\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");tools.appendString("\",\"false\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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

public void repeatingDataCell_9() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Name"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxLink_3();
									tools.appendString("</DIV>"); } else { pxLink_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxCheckbox_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = true;
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){
inclCalVal_1("pxCheckbox","TF&&text&&false&&True&&False","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){String disabled_ctrl = "";

		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		 if(isSecuredProp){
				 activeValue = activePropValue;
		}boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
String pegaRLindex = tools.getParamValueCSF("pega_RLindex");
if (!"".equals(rptDynamicIdx)) {
	pegaRLindex += "_rdi_" + rptDynamicIdx;
}

		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(tools.getActive().getEntryHandle(), new String[]{"true","false"});String errorClass = "";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		errorClass += " ErrorShade";
		}

		if(pzAuto.doOnlyOnce("Checkbox")) {IStaticContentRuntime pzStatic_Checkbox = pzAuto.getStaticBlock("script");
	pzStatic_Checkbox.addFile("pzpega_control_checkbox", "11562282053", "js");
pzStatic_Checkbox.setMoveToEnd(true);
pzStatic_Checkbox.emitContent();

		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		tools.appendString("\n<input type='hidden' value='false' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); } tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" /><input type='checkbox'  " + pzCell.getTestIdIfEnabled("201501220214230757250644") + "   class='checkbox chkBxCtl"+errorClass+"' value='true' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); }
		String checkboxName = ""; tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));
		checkboxName = StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());
		checkboxName = StringUtils.crossScriptingFilter(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" aria-describedby='"+checkboxName+"Error'");
		tools.appendString(" id='");if(bOptimizedMarkup){
tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' data-ctl='Checkbox' ");} else{
tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' data-ctl='Checkbox' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		if(!bOptimizedMarkup && (activeValue != null) && activeValue.equalsIgnoreCase("true")){
			tools.appendString(" checked ");
				 if(bOptimizedMarkup){ tools.appendString(" data-bindDefaultValue='true' ");} 
		}
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzUnitTestCases";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}tools.appendString("[\"postValue\",[\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
	com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
	actionRequestD.registerFixedParameter("pyModelName","pzIncrementCount");
		String usingPageString = "";
		usingPageString = "";
		tools.appendString("[\"runDataTransform\", [\"pzIncrementCount\", \"selectedCount=");
		actionRequestD.registerFixedParameter("selectedCount","");
		tools.appendString("&runAll=");
		actionRequestD.registerFixedParameter("runAll","");
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
		pzPackageRuntime.packageDataTransform(contextClass, "pzIncrementCount");
		}
			pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" />");
		tools.appendString("<label  class=' cb_standard' for='");if(bOptimizedMarkup){
		tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' ");} else{
		tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' ");}
		tools.appendString("data-click='.' ");
	 tools.appendString("data-ctl ='Checkbox'"); 
	tools.appendString("class='chkbxCaptionRight'>");
		tools.appendString("</label>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");			
	}
			tools.putParamValue("doAutoFormatting", "false");
			tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); 			} catch (Exception e) {

			
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'			&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }				}


}

public void repeatingDataCell_8() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ".pySelected"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxCheckbox",".pySelected", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:49px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxCheckbox_2(".pySelected",0,"","","True-False");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxCheckbox_2(".pySelected",0,"","","True-False");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pzTestCaseRunStatusWrapperLP_1() {
pzAuto.emitIncludeStreamReference("pzTestCaseRunStatusWrapperLP", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_7() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Result"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzTestCaseRunStatusWrapperLP", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString(" headers='a7' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzTestCaseRunStatusWrapperLP_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void pzShowRunAndExpectedTimeWrapper_1() {
pzAuto.emitIncludeStreamReference("pzShowRunAndExpectedTimeWrapper", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_6() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Run/Expected time"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzShowRunAndExpectedTimeWrapper", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString(" headers='a6' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzShowRunAndExpectedTimeWrapper_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void inclFormattedVal_3(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", isSecuredProp);tools.putParamValue("proSecurity_activePropValue", activePropValue);}
		pega.checkIfActivePropertyMissing();
		String formattedValue = pega_uiengine_formatter.pxFormatTrueFalse(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",true,(PegaStreamAPI)tools),"Yes","No",true,"text","null","null");
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("associated","null","null","","","","null","null",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", "");tools.putParamValue("proSecurity_activePropValue", "");}
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		String formattedValue = pega_uiengine_formatter.pxFormatTrueFalse((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools)),"Yes","No",true,"text","null","null");
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}


public void pxDropdown_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
inclCalVal_1("pxDropdown","TF&&text&&false&&Yes&&No","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20171124013856093156302") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Disabled"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyLatestResult", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_1(".pyLatestResult",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_1(".pyLatestResult",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pzTestCaseRunTimeWrapperLP_1() {
pzAuto.emitIncludeStreamReference("pzTestCaseRunTimeWrapperLP", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_4() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Last run"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzTestCaseRunTimeWrapperLP", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString(" headers='a4' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzTestCaseRunTimeWrapperLP_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName, java.lang.String aMode) throws Throwable {
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
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private void performStream_1() throws Throwable {

	// We do a fieldvalue lookup if the performer has 'Agent' in it
	String thisValue = tools.getActive().getStringValue();
	if (thisValue.indexOf("Agent") > -1)
	{
		thisValue = tools.getLocalizedTextForString("pxRequestor.pyMessageLabel", thisValue);
	}
	tools.putSaveValue("thisValue", thisValue);


tools.appendString("\n\n\n<label title='");
 tools.appendString(tools.getActive().getParentPage().getString(".pxCreateOperator")); 
tools.appendString("' >");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(thisValue)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(thisValue)")) {
	return;
}
tools.appendString(" </label>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-RULES");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pxCreateOpName");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_Obj_Activity_pxCreateOpName
 */
private void property_Rule_Obj_Activity_pxCreateOpName() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT	Pega-RULES:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT */
}
}
public void 
pegaReferenceTag_1() {
try {
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pxCreateOpName");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Rule-Obj-Activity")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		try {
			final String currentPropertyRef_1 = currentProperty_1.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_1);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_1);
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Activity_pxCreateOpName();
			}
		} finally {
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__2(pageContext, ".pxCreateOpName", "input")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_3() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Created by"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",".pxCreateOpName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_1();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_1();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
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


public void pxLink_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_43'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141209010514018021404") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"openRule\",[\"");

		tools.appendString("#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#");tools.appendString("\",\"false\",\"\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\",\"");

		tools.appendFormatted("",StreamBuilder.FMT_NORMAL);tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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

public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Name"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pyLabel", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:47px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxLink_1();
									tools.appendString("</DIV>"); } else { pxLink_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		String formattedValue = pega_uiengine_formatter.pxFormatTrueFalse((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"True","False",true,"text","","");
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
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


public void pxCheckbox_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	boolean isEditable = true;
	boolean isControlEditable = isEditable;tools.putParamValue("isControlEditableOriginal", isEditable);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
inclCalVal_1("pxCheckbox","TF&&text&&false&&True&&False","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){String disabled_ctrl = "";

		String activeValue = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
		 if(isSecuredProp){
				 activeValue = activePropValue;
		}boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
String pegaRLindex = tools.getParamValueCSF("pega_RLindex");
if (!"".equals(rptDynamicIdx)) {
	pegaRLindex += "_rdi_" + rptDynamicIdx;
}

		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(tools.getActive().getEntryHandle(), new String[]{"true","false"});String errorClass = "";
		if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		errorClass += " ErrorShade";
		}

		if(pzAuto.doOnlyOnce("Checkbox")) {IStaticContentRuntime pzStatic_Checkbox = pzAuto.getStaticBlock("script");
	pzStatic_Checkbox.addFile("pzpega_control_checkbox", "11562282053", "js");
pzStatic_Checkbox.setMoveToEnd(true);
pzStatic_Checkbox.emitContent();

		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		tools.appendString("\n<input type='hidden' value='false' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); } tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" /><input type='checkbox'  " + pzCell.getTestIdIfEnabled("201501220214230757250644") + "   class='checkbox chkBxCtl"+errorClass+"' value='true' ");if(bOptimizedMarkup){  tools.appendString(" data-bindprops='value' "); }
		String checkboxName = ""; tools.appendString(" name='");if(bOptimizedMarkup){
		tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));
		checkboxName = StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getEntryHandle(),"entryHandle"));} else{
		tools.appendString(tools.getActive().getEntryHandle());
		checkboxName = StringUtils.crossScriptingFilter(tools.getActive().getEntryHandle());}
		tools.appendString("' ");tools.appendString(disabled_ctrl);

		tools.appendString(" aria-describedby='"+checkboxName+"Error'");
		tools.appendString(" id='");if(bOptimizedMarkup){
tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' data-ctl='Checkbox' ");} else{
tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' data-ctl='Checkbox' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		if(!bOptimizedMarkup && (activeValue != null) && activeValue.equalsIgnoreCase("true")){
			tools.appendString(" checked ");
				 if(bOptimizedMarkup){ tools.appendString(" data-bindDefaultValue='true' ");} 
		}
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }{String strStreamName="";String strPropertyTarget ="";String strPageName ="";strStreamName="pzUnitTestCases";if(tools.getPrimaryPage() != null){ strPageName = tools.getPrimaryPage().getName();}if(tools.getActive() != null){strPropertyTarget = tools.getActive().getEntryHandle();}com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();actionRequest.registerFixedParameter("pyActivity", "ReloadCell"); actionRequest.registerFixedParameter("pyPropertyTarget", strPropertyTarget ); actionRequest.registerFixedParameter("StreamName", strStreamName); actionRequest.registerFixedParameter("pzPrimaryPageName", strPageName); pzAuto.registerActionRequest(actionRequest);}tools.appendString("[\"postValue\",[\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }{
	com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
	actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
	com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
	actionRequestD.registerFixedParameter("pyModelName","pzIncrementCount");
		String usingPageString = "";
		usingPageString = "";
		tools.appendString("[\"runDataTransform\", [\"pzIncrementCount\", \"selectedCount=");
		actionRequestD.registerFixedParameter("selectedCount","");
		tools.appendString("&runAll=");
		actionRequestD.registerFixedParameter("runAll","");
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
		pzPackageRuntime.packageDataTransform(contextClass, "pzIncrementCount");
		}
			pzAuto.registerActionRequest(actionRequest);
			}
			tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" />");
		tools.appendString("<label  class=' cb_standard' for='");if(bOptimizedMarkup){
		tools.appendString(propName.substring(propName.lastIndexOf(".")+1)+pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getProperty(".pySelected").getReference(),"",true)+"' ");} else{
		tools.appendString(tools.getHTMLIDForProperty(true,"checkbox")+"' ");}
		tools.appendString("data-click='.' ");
	 tools.appendString("data-ctl ='Checkbox'"); 
	tools.appendString("class='chkbxCaptionRight'>");
		tools.appendString("</label>");
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");			
	}
			tools.putParamValue("doAutoFormatting", "false");
			tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); 			} catch (Exception e) {

			
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'			&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }				}


}

public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ".pySelected"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxCheckbox",".pySelected", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:49px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxCheckbox_1(".pySelected",0,"","","True-False");
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxCheckbox_1(".pySelected",0,"","","True-False");}
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


public void pxLink_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzUnitTestCases_"+ referenceString+ "_43'";
	 String securedPropValue = null;
	 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(),tools.getProperty(".pyLabel"), tools);
	 if(propSecInfo != null && !"UNSECURED".equalsIgnoreCase(propSecInfo.getPropType().toString())) {
		 securedPropValue = propSecInfo.getPropValue();
	 }
	  if(securedPropValue == null) {
		 securedPropValue = tools.getProperty(".pyLabel").getStringValue();
	  }
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20141209010514018021404") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");if(bOptimizedMarkup){
		tools.appendString(StringUtils.filterRichText(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getDataBindingToken(tools.getProperty(".pyLabel").getReference())));} else { checkForScriptTags_1(tools.getLocalizedTextForString(".pyButtonLabel",securedPropValue,StreamBuilder.FMT_LITERAL)); }
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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



public void pxDropdown_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle(true, false);tools.putParamValue("isControlEditableOriginal", false);
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){
inclCalVal_1("pxDropdown","TF&&text&&false&&Yes&&No","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20171124013856093156302") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}



public void D_pxGetTestCaseData_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && false){ tools.appendString(","); }
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

					if(tools.getParamValue("partialTrigger").equals("appendToD_pxGetTestCaseData.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowD_pxGetTestCaseData.pxResults1") ){

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

					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

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

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pxGetTestCaseData.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pxGetTestCaseData.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pxGetTestCaseData.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pxGetTestCaseData.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702170653250413635-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					activeName = tools.getActiveName();  repeatingDataCell_3(); 

					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					activeName = tools.getActiveName();  repeatingDataCell_5(); 

					activeName = tools.getActiveName();  repeatingDataCell_6(); 

					activeName = tools.getActiveName();  repeatingDataCell_7(); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_pxGetTestCaseData.pxResults1")) {

					
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

					pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_pxGetTestCaseData.pxResults1")) { 

					
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

					
			 if(subScriptForColumn.equals("pyLabel2") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxLink_2();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxCreateOpName3") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {

/*
 * reference tag
 * Cannot inline because: parameters prevent us from inlining
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName(".pxCreateOpName");
_jspx_th_pega_reference__1.setMode("display");
_jspx_th_pega_reference__1.setFormat("pxCreateOpName");
int _jspx_eval_pega_reference__1 = _jspx_th_pega_reference__1.doStartTag();
if (_jspx_eval_pega_reference__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_reference__1;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_1;
		int evalDoAfterBody = _jspx_th_pega_reference__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__1);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pzTestCaseRunTimeWrapperLP4") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property "pzTestCaseRunTimeWrapperLP" at assembly time
 */
if (_jspx_meth_pega_reference__2(pageContext, "pzTestCaseRunTimeWrapperLP", "display")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyLatestResult5") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDropdown_2(".pyLatestResult",0,"","","Text");

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pzShowRunAndExpectedTimeWrapper6") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property "pzShowRunAndExpectedTimeWrapper" at assembly time
 */
if (_jspx_meth_pega_reference__2(pageContext, "pzShowRunAndExpectedTimeWrapper", "display")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pzTestCaseRunStatusWrapperLP7") && strCellType.equals("static")) { 

					
				  functionsMap = (java.util.Map)tools.getParameterPage().get("currentFunctionsMap"); 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property "pzTestCaseRunStatusWrapperLP" at assembly time
 */
if (_jspx_meth_pega_reference__2(pageContext, "pzTestCaseRunStatusWrapperLP", "display")) {
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

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					java.util.Map functionsMap = null;

					java.util.Map classesMap = null;

					tools.putSaveValue("bAllowRowUpdate","true");

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_pxGetTestCaseData.pxResults1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
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

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pxGetTestCaseData.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_pxGetTestCaseData.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_pxGetTestCaseData.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_pxGetTestCaseData.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702170653250413635-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_8(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_9(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_10(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_11(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_6(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_7(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					 /* GenerateGrid: End */

					
					}



private void performStream_2() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_2 = new HashMap();
static {
	oPropDefinitions_2.put("Rule-Obj-Activity.pxCreateOpName", new LiteweightPropertyDefinition("Rule-Obj-Activity", "pxCreateOpName", "sTY", true, true, "pxCreateOpName", false));
}
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "Rule-");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-AutoTest");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzUnitTestCases");
	oStreamProperties_2.put("pyRuleSetVersion", "08-03-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_9", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE- PZUNITTESTCASES #20190213T113102.708 GMT", "Rule- pzUnitTestCases", "Pega-AutoTest", "08-03-01", "20190311T100657.855 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PXCREATEOPNAME #20180713T131328.240 GMT", "pxCreateOpName", "Pega-RULES", "08-01-01", "20180713T131328.240 GMT");
}
