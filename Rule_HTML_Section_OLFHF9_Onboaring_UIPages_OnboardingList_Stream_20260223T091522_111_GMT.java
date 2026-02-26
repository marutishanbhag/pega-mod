package com.pegarules.generated.testgen;

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
 * Builds JSP stream .
 */
public class Rule_HTML_Section_OLFHF9_Onboaring_UIPages_OnboardingList_Stream_20260223T091522_111_GMT extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.OnboardingList.OLFHF9_Onboaring_UIPages.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1514258960;
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
	public Rule_HTML_Section_OLFHF9_Onboaring_UIPages_OnboardingList_Stream_20260223T091522_111_GMT(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "e2c4676ecc7d4767ac6894cb2666a0c2ae459ed7";
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
pxUniqueStreamHash = "e2c4676ecc7d4767ac6894cb2666a0c2ae459ed7";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("OnboardingList",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin 
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end  */
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
	"Rule-Obj-Property:PXCREATEDATETIME", 
	"Rule-Obj-Property:PXCREATEOPNAME", 
	"Rule-Obj-Property:PYID", 
	"Rule-Obj-Property:PYLABEL", 
	"Rule-HTML-Property:PXDISPLAYTEXT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXCREATEDATETIME","Rule-Obj-Property","WORK-",true,"OLFHF9-Onboaring-Work-Onboarding","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY WORK- PXCREATEDATETIME #20180713T131935.660 GMT","!PXCREATEDATETIME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXCREATEOPNAME","Rule-Obj-Property","@BASECLASS",true,"OLFHF9-Onboaring-Work-Onboarding","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT","!PXCREATEOPNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYID","Rule-Obj-Property","WORK-COVER-",true,"OLFHF9-Onboaring-Work-Onboarding","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY WORK-COVER- PYID #20180713T131935.559 GMT","!PYID",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYLABEL","Rule-Obj-Property","WORK-",true,"OLFHF9-Onboaring-Work-Onboarding","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY WORK- PYLABEL #20180713T131937.372 GMT","!PYLABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXDISPLAYTEXT","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT","PXDISPLAYTEXT",true,false,"ABSOLUTE_CLASSLESS",1365141955)
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
//	RULE-OBJ-PROPERTY WORK-COVER- PYID #20180713T131935.559 GMT:20180713T131935.559 GMT
//	RULE-OBJ-PROPERTY WORK- PYLABEL #20180713T131937.372 GMT:20180713T131937.372 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY WORK- PXCREATEDATETIME #20180713T131935.660 GMT:20180713T131935.660 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY WORK-COVER- PYID #20180713T131935.559 GMT:20180713T131935.559 GMT
//	RULE-OBJ-PROPERTY WORK- PYLABEL #20180713T131937.372 GMT:20180713T131937.372 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY WORK- PXCREATEDATETIME #20180713T131935.660 GMT:20180713T131935.660 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY WORK-COVER- PYID #20180713T131935.559 GMT:20180713T131935.559 GMT
//	RULE-OBJ-PROPERTY WORK- PYLABEL #20180713T131937.372 GMT:20180713T131937.372 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY WORK- PXCREATEDATETIME #20180713T131935.660 GMT:20180713T131935.660 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY WORK-COVER- PYID #20180713T131935.559 GMT:20180713T131935.559 GMT
//	RULE-OBJ-PROPERTY WORK- PYLABEL #20180713T131937.372 GMT:20180713T131937.372 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY WORK- PXCREATEDATETIME #20180713T131935.660 GMT:20180713T131935.660 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-PROPERTY WORK-COVER- PYID #20180713T131935.559 GMT:20180713T131935.559 GMT
//	RULE-OBJ-PROPERTY WORK- PYLABEL #20180713T131937.372 GMT:20180713T131937.372 GMT
//	RULE-HTML-PROPERTY PXDISPLAYTEXT #20190131T183501.550 GMT:20190131T183501.550 GMT
//	RULE-OBJ-PROPERTY WORK- PXCREATEDATETIME #20180713T131935.660 GMT:20180713T131935.660 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEOPNAME #20180713T131841.211 GMT:20180713T131841.211 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	generateGridCellModes_1( {"strGridMetadataPage", "String", ""}
//	pzLayout_1(
//	gridTemplatePartial_1(
//	gridTemplateSwitchPersonalization_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION GRID GETTOTALRECORDS #20180713T133337.740 GMT:20180718T092706.975 GMT
//	RULE-UTILITY-FUNCTION GRID PZGETPROPERTYCLASSNAME #20180713T133337.766 GMT:20180713T133337.766 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGB2D03618C4D6FCE3A07CB882EBEA3D958 #20201222T180835.601 GMT:20201222T180835.601 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEGRIDFIELDINCLUDE--(STR2D70A853CCD6654B51AFD65192EDF57E #20180713T133339.756 GMT:20180713T133339.756 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELINCLUDE #20181206T140519.218 GMT:20181206T140519.218 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISFORMATTEDCONTROL #20180713T133341.276 GMT:20180713T133341.276 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL #20180713T133341.320 GMT:20180713T133341.320 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATEDECLAREPAGEANDPARAMS #20180713T133341.383 GMT:20180713T133341.383 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
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
		return "b1a8c2cc726525366111e25c7cac6881";
	}

	public String getDefinitionAppliesToClass() {
		return "OLFHF9-Onboaring-UIPages";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("OnboardingList",1,"Rule-HTML-Section","{'type':'Section','ruleName':'OnboardingList','insKey':'null','sectionType':'standard'}");
pzLayout_1();
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
config.put("StreamName", "");
pega.getUIEngine().getUIAction("sort", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyNextGenGridModalTemplate");
config.put("ModalSection", "pyNextGenGridModalTemplate");
config.put("NewTaskStatus", "");
pega.getUIEngine().getUIAction("editItemImplicit", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("UPDATEGRIDCOLUMNSSTATE", null).register();
config = new HashMap<String, String>();
config.put("pyPageMode", "Numeric");
pega.getUIEngine().getUIAction("paginate", config).register();
pega.getUIEngine().getUIAction("filter", null).register();
pega.getUIEngine().getUIAction("personalization", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_1() {
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_1();
return;}tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
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
public void pzLayoutBodyWrapper_2() {
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
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","24"};oCellRuntimeParamsMap.put("24||",paramValues);oControlPathsMap.put("24||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}


public void pxDisplayText_11(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_22")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_23")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20180720120041074154614") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
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
	String repeatIndx = "";
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20180720120041074154614",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxCreateDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxCreateDateTime", ".pyCaption");
	pyValueR = ".pxCreateDateTime";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxCreateDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxCreateDateTime", ".pyCaption");
	pyValueOrig = ".pxCreateDateTime";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","localizevalue");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","datetime");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateTimeFormat","DateTime-Frame");
	modePage2.put("pyDateTimeSecondCutoff","3");
	ClipboardProperty currProp = tools.getActive();
	String propTypeName = currProp.getTypeName();
	modePage2.put("pyPropertyType",propTypeName);
	String[] fieldValuesArray ={};
	fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
	for(int i=0;i<fieldValuesArray.length;i++){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
	}
	String spxUniqueStreamHash24 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash24 != null && !"".equals(spxUniqueStreamHash24)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash24,pxUniqueStreamHash+"_24");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_24");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
	ctrlComponent.beginComponent("pxDisplayText",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_7() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Creation date/time"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxCreateDateTime", "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:34px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_11(".pxCreateDateTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_11(".pxCreateDateTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","22"};oCellRuntimeParamsMap.put("22||",paramValues);oControlPathsMap.put("22||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","32","","","Text","true","21"};oCellRuntimeParamsMap.put("21||",paramValues);oControlPathsMap.put("21||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingHeaderCell_5() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Case status' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180720120041074056166") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Case status"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)")); tools.appendString(" id='a5' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		
		tools.appendString(" bSortable = 'false'");
		
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache5").equals("")) { tools.appendParamCSF("D_OnboardingListPpxResults1colWidthCache5");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_OnboardingListPpxResults1colWidthCache5' id='D_OnboardingListPpxResults1colWidthCache5' value='" + tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache5") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Case status", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_4() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "OLFHF9-Onboaring-Work-Onboarding";
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
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180720120041074059300") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Created by"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxCreateOpName' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache4").equals("")) { tools.appendParamCSF("D_OnboardingListPpxResults1colWidthCache4");} else { tools.appendString("14.912280701754385"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc28960347'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_OnboardingListPpxResults1colWidthCache4' id='D_OnboardingListPpxResults1colWidthCache4' value='" + tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache4") + "' />");
				
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc28960347' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc28960347' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc28960347' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxCreateOpName")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc28960347' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_OnboardingList_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName4").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle28960347\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName4").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle28960347\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName4").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName4").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateOpName4").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateOpName4").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_3() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "OLFHF9-Onboaring-Work-Onboarding";
	dataColumnProp = "pxCreateDateTime";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pxCreateDateTime";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Creation date/time' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180720120041074053517") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Creation date/time"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pxCreateDateTime' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache3").equals("")) { tools.appendParamCSF("D_OnboardingListPpxResults1colWidthCache3");} else { tools.appendString("28.947368421052634"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1508407745'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_OnboardingListPpxResults1colWidthCache3' id='D_OnboardingListPpxResults1colWidthCache3' value='" + tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache3") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Creation date/time", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1508407745' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1508407745' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1508407745' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pxCreateDateTime")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1508407745' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_OnboardingList_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateDateTime3").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1508407745\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateDateTime3").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1508407745\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateDateTime3").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateDateTime3").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pxCreateDateTime3").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pxCreateDateTime3").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "OLFHF9-Onboaring-Work-Onboarding";
	dataColumnProp = "pyLabel";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyLabel";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Label' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20180720120041074047624") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Label"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyLabel' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache2").equals("")) { tools.appendParamCSF("D_OnboardingListPpxResults1colWidthCache2");} else { tools.appendString("28.947368421052634"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc1000963521'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_OnboardingListPpxResults1colWidthCache2' id='D_OnboardingListPpxResults1colWidthCache2' value='" + tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache2") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Label", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc1000963521' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc1000963521' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc1000963521' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyLabel")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc1000963521' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_OnboardingList_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle1000963521\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle1000963521\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyLabel2").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyLabel2").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_1() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	dataPropClass = "OLFHF9-Onboaring-Work-Onboarding";
	dataColumnProp = "pyID";
	bSecured = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertySecured(dataPropClass, dataColumnProp,tools);
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyID";
		tools.appendString("<th title='");
		 tools.appendString(tools.getLocalizedTextForString("pyCaption", "Click to sort by" ,StreamBuilder.FMT_NORMAL)); tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='ID' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160721093355058239712") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "ID"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" colResize");if(!bSecured){tools.appendString(" pointerStyle ");}tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString(" title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'");
		if(!bSecured){
		tools.appendString(" bSortable = 'true' sortField = '.pyID' ");
		}
		if(!bSecured){
		tools.appendString(" pyShowFilterUIBy = 'value'  bformattedControl ='true'");
		}
		tools.appendString("  style='");
		tools.appendString("height:26px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("D_OnboardingListPpxResults1colWidthCache1");} else { tools.appendString("12.280701754385964"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:24px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont  filterapplied'");if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("aria-describedby='titleDesc843918310'");}tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("<input type='hidden' name='D_OnboardingListPpxResults1colWidthCache1' id='D_OnboardingListPpxResults1colWidthCache1' value='" + tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthCache1") + "' />");
				
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "ID", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
}if(!pzAuto.getBrowserUtils().isIE()){tools.appendString("<div id='titleDesc843918310' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){ if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){tools.appendString("<span id='titleDesc843918310' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}else{tools.appendString("<span id='titleDesc843918310' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}
									tools.appendString("</div>");}
tools.appendString("<span id='sort'"); 
if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))){ 
 tools.appendString("tabIndex='0'"); 
} 
tools.appendString("class='highlight-ele  pointerStyle "); if(tools.getParamValueCSF("sortProperty").equals(".pyID")){tools.appendParamCSF("sortType"); } tools.appendString("'  title= '");  if("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder"))) { tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText")) + " "); } tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Click to sort by", StreamBuilder.FMT_NORMAL)); tools.appendString("'>");if(pzAuto.getBrowserUtils().isIE() && ("ASC".equals(tools.getParamValue("columnSortOrder")) || "DESC".equals(tools.getParamValue("columnSortOrder")))){tools.appendString("<span id='titleDesc843918310' class='gridSortTitleDesc' aria-live='assertive'>");tools.appendString(tools.getLocalizedTextForString(".pyCaption", tools.getParamCSF("sortTitleText"), StreamBuilder.FMT_NORMAL));tools.appendString("</span>");}tools.appendString("</span>");
tools.appendString(sortImgHTML+sortNoHTML);tools.putParamValue("columnSortOrder","");tools.putParamValue("sortTitleText","");}
									tools.appendString("</div>");if(!bSecured){
								ClipboardPage gFCritPageD_OnboardingList_pxResultsL3 = tools.findPage(tools.getParamValueCSF("pyGridFilterCriteriaPage"));if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyID1").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="none"){tools.putParamValue("filterState","FILTERED");}else{ tools.putParamValue("filterState","NOTFILTERED"); }if(pzAuto.evaluateWhen("BrowserIsFireFox",null, true)){tools.appendString("<span><span aria-describedby=\"filterTitle843918310\" id='pui_filter' tabIndex='0' title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyID1").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span><span id=\"filterTitle843918310\" style=\"display:none;\">");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("</span></span>");tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyID1").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}else{if(pzAuto.evaluateWhen("isAccessible",null, true)){tools.appendString("<span><span id='pui_filter' tabindex = '0'  title='");if("FILTERED".equals(tools.getParamValue("filterState"))){tools.appendString(tools.getLocalizedTextForString(".pyCaption", "filteredcolumn", StreamBuilder.FMT_NORMAL));}else{tools.appendString(tools.getLocalizedTextForString(".pyCaption", "Enter to filter", StreamBuilder.FMT_NORMAL));}tools.appendString("' "); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyID1").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></span></span>");}else{
String bFilterExposedCols = "false" ; 
if(!"unexposed".equals(tools.getParamValue("pzPropertyType")) || bFilterExposedCols.equals("true")){tools.appendString("<span><a id='pui_filter' tabIndex='0' title='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"'aria-label='"+tools.getLocalizedTextForString(".pyCaption", "Click to filter", StreamBuilder.FMT_NORMAL)+"' role='link'"); if(gFCritPageD_OnboardingList_pxResultsL3!=null && !gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPageValue("pyID1").isEmpty() && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="" && gFCritPageD_OnboardingList_pxResultsL3.getProperty("pyColumnFilterCriteria").getPropertyValue("pyID1").getStringValue("pyFilterCriteriaType")!="none"){tools.appendString("class='filtered highlight-ele'");tools.putParamValue("columnMenuPrefix","move");}else{tools.appendString("class='filter highlight-ele'");} tools.appendString(" filterType=true></a></span>");}tools.putParamValue("pzPropertyType","");}}}if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public void buildSection_2() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_21","pyGridPaginator", secInfo);
}


public void sectionBodyIncludeInCell_2(boolean isEditable, boolean isReadOnly, String strReadOnlyWhen, String streamName) { 
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
buildSection_2();
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
sectionBodyIncludeInCell_2(false,false,"","pyGridPaginator");elementModel_1("pyGridPaginator","OnboardingList","BAR","");
 } 
public void 
labelIncludeInCell_2(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2016072109232603516456") + "  ");
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
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20180720120041065929797") + "  ");
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
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,"TableTemplate.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:33%;",false,"","");tools.appendString("<nobr>");
	labelIncludeInCell_1("","","","",false,"",true,false,"Standard",false);
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,"TableTemplate.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignCenter","dataLabelWrite gridActionAlignCenter"), "width:33%;",false,"","");labelIncludeInCell_2("","","","",false,"",true,false,"Standard",false);
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("SUB_SECTION","pyGridPaginator","TableTemplate.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead gridActionAlignRight","dataLabelWrite gridActionAlignRight"), "width:33%;",false,"","");sectionIncludeInCell_pyGridPaginator_1(); pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 
public void gridTemplateSwitchPersonalization_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
gridWrapper.put("pzCTResetSaveMethodName",tools.getParamValue("pzCTResetSaveMethodName"));
tools.findPage(tools.getParamValue("pxGridMetadataPage")).removeFromClipboard(); 
ClipboardPage sectionContext = tools.findPage(tools.getParamValue("sectionContext"),true);
PRStackFrame frame = null; 
if(null != sectionContext){
  frame = pega.pushStackFrame(tools.getParameterPage(), sectionContext, false, false, PRStackFrame.Type.APPEND_STREAM, "discardPersonalize");
}
String pyGridStateUniqueID= "1532102217971";
String pySectionInsName= "";
String pyOperatorID= tools.findPage("OperatorID").getString(".pyUserIdentifier");
String harnessClassName = tools.getParamValue("strPHarnessClass");
if(StringUtils.isBlank(harnessClassName)) {
harnessClassName = tools.getParamValue("className");
}
String harnessName = tools.getParamValue("innerHarnessName");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("strPHarnessPurpose");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("Purpose");
}
}
String pyHarnessInsName= harnessClassName+"!"+harnessName;
metadataPage.put("pyGridStateUniqueID",pyGridStateUniqueID);
metadataPage.put("pySectionInsName",pySectionInsName);
metadataPage.put("pyOperatorID",pyOperatorID);
metadataPage.put("pyHarnessInsName",pyHarnessInsName);
String propType = "Data Object";
String DSNameViaAjax = tools.getParamValue("DSName");
if(org.apache.commons.lang3.StringUtils.isNotBlank(DSNameViaAjax) && "Property".equals(propType) ){
gridWrapper.putString("DPName",DSNameViaAjax);
}
gridTemplateMain_1(metadataPage,gridWrapper);
if(null != frame){
  pega.popStackFrame(frame, false);
}
}
public void gridTemplatePartial_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
ClipboardProperty dataCells = null;
boolean isPartial = true;
boolean isQueryable = false;
Map configMap = new HashMap(); 
String gridAction = tools.getParamValue("listAction"); 
String DSName = tools.getParamValue("DSName"); 
String uniqueId = tools.getParamValue("instanceId"); 
String resultsClass = tools.getParamValue("pyResultsClass"); 
ClipboardPage gridMetadataPage = tools.findPage(tools.getParamValue("pxGridMetadataPage"), true); 
if(null != gridMetadataPage){ 
isQueryable = gridMetadataPage.getBoolean("isQueryable"); 
configMap.put("pxGridMetadataPage", gridMetadataPage); 
} 
configMap.put("instanceId", uniqueId); 
configMap.put("pyContext", DSName); 
configMap.put("listAction", gridAction); 
int startIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"startIndex"); 
int endIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"endIndex"); 
int pxPageSize = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageSize"); 
int pxPageIndex = tools.getParamAsInteger(ImmutablePropertyInfo.MODE_STRING,"pxPageIndex"); 
configMap.put("pxPageSize", pxPageSize); 
configMap.put("pxPageIndex", pxPageIndex); 
if(isQueryable){
gridMetadataPage.putString("pxPageSize", String.valueOf(pxPageSize)); 
gridMetadataPage.putString("pxPageIndex", String.valueOf(pxPageIndex)); 
pega.getUIEngine().getGridUtilities().setImplicitParameter(true, gridMetadataPage);
boolean bIsTableGrouped = gridMetadataPage.getBoolean("pyIsTableCategorized");
if(bIsTableGrouped) {
configMap.put("isQueryable", "false"); 
}else{
configMap.put("isQueryable", Boolean.toString(isQueryable)); 
}
}
List<Integer> indices = pega.getUIEngine().getGridUtilities().getIndicesToBeChangeTracked();
if(indices != null){
configMap.put("indices", indices); 
}
if(startIndex > 0 && endIndex >= startIndex){ 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
} 
gridWrapper.put("resultsClass",resultsClass); 
metadataPage.put("uniqueId",uniqueId); 
metadataPage.putMetadata("gridWrapper",gridWrapper);
gridTemplateBody_1(dataCells, metadataPage, configMap, isPartial, "pxGrid1" ); 
}
public void generateGridSections_1(IUIComponentMetadata metadataPage, ClipboardPage gridMetadataPage) {
IUIComponentMetadata gridSectionsInfo = pzAuto.getUIComponentRuntime().createMetadata();
Map<String, Object> sectionParams = new HashMap<>();
String pageId = pxUniqueStreamHash+"_18";
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
ClipboardPage gridResultsPage = tools.createPage(pageListClassName, "gridResultsPage"+pageId);
PRStackFrame gridResultsPageFrame = pega.pushStackFrame(gridResultsPage.getName(), null, gridResultsPage, false, false); 
pega.popStackFrame(gridResultsPageFrame, false);
gridResultsPage.removeFromClipboard(); 
ClipboardPage filterPage = tools.createPage("Pega-UI-Component-Grid-Filter", "filterPage");
sectionParams.put("usingPage", filterPage.getName()); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_19","pyFilterIcon", sectionParams);
gridSectionsInfo.put("pxGridFilterIconId",pxUniqueStreamHash+"_19");
sectionParams.clear(); 
filterPage.removeFromClipboard(); 
gridMetadataPage.putString("pyIsRowHeightEnabled", "false");
gridMetadataPage.putString("pyIsColumnTogglerEnabled", "false");
gridMetadataPage.putString("pyIsRefreshListEnabled", "false");
boolean isQueryable = gridMetadataPage.getBoolean("isQueryable");
if(isQueryable){
gridMetadataPage.putString("pyIsSearchEnabled", "false");
}else{
gridMetadataPage.putString("pyIsSearchEnabled", "false");
}
gridMetadataPage.putString("pyIsPersonalized", metadataPage.getString("pyIsPersonalized"));
gridMetadataPage.putString("pyIsPersonalizationEnabled", "true");
gridMetadataPage.putString("pyImplicitSave", "true");
gridMetadataPage.putString("pyPersonalizedName", metadataPage.getString("pyPersonalizedName"));
sectionParams.put("usingPage", gridMetadataPage.getName()); 
sectionParams.put("doNotAddToMetadataTree", true); 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_20","pyTableToolbar", sectionParams);
gridSectionsInfo.put("pxGridToolbarId",pxUniqueStreamHash+"_20");
gridSectionsInfo.put("pxGridToolbarPage",gridMetadataPage.getName());
sectionParams.clear(); 
sectionParams.clear(); 
metadataPage.put("isToolBar",true);
if(gridSectionsInfo.getObject().entrySet().size() > 0){
metadataPage.putMetadata("gridSectionsInfo",gridSectionsInfo);
}
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_17","pyCaseStatusInList", secInfo);
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
	inputType = "NoInput";
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pyCaseStatusInList"; 
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
	tools.getParameterPage().remove("SectionReadOnly");
}
public String 
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();
	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public void pxDisplayText_7() {String key="21||";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","false","32","","","Text","true","21"};oCellRuntimeParamsMap.put("21||",paramValues);oControlPathsMap.put("21||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}


public void pxDisplayText_8() {String key="22||";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","22"};oCellRuntimeParamsMap.put("22||",paramValues);oControlPathsMap.put("22||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxDisplayText_9(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20180720120041074154614") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
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
	String repeatIndx = "";
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20180720120041074154614",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxCreateDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxCreateDateTime", ".pyCaption");
	pyValueR = ".pxCreateDateTime";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pxCreateDateTime");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pxCreateDateTime", ".pyCaption");
	pyValueOrig = ".pxCreateDateTime";
	cellPage.put("pyValue",pyValueOrig);
	cellPage.put("pyValueRO",pyValueR);
	modePage2.put("pyContent","localizevalue");
	modePage2.put("styleOther","");
	modePage2.put("pyFormatType","datetime");
	modePage2.put("pyReadonlyValidation",false);
	modePage2.put("pyDateTimeFormat","DateTime-Frame");
	modePage2.put("pyDateTimeSecondCutoff","3");
	ClipboardProperty currProp = tools.getActive();
	String propTypeName = currProp.getTypeName();
	modePage2.put("pyPropertyType",propTypeName);
	String[] fieldValuesArray ={};
	fieldValuesArray = new String[]{"yearsmonths ago","yearsmonth ago","yearmonths ago","yearmonth ago","yearsmonths from now","yearsmonth from now","yearmonths from now","yearmonth from now","monthsdays ago","monthsday ago","monthdays ago","monthday ago","monthsdays from now","monthsday from now","monthdays from now","monthday from now","dayshours ago","dayshour ago","dayhours ago","dayhour ago","dayshours from now","dayshour from now","dayhours from now","dayhour from now","hoursminutes ago","hoursminute ago","hourminutes ago","hourminute ago","hoursminutes from now","hoursminute from now","hourminutes from now","hourminute from now","about a minute","about a minute ago","about a minute from now","less than a minute","less than a minute ago","less than a minute from now","years ago","years from now","year ago","year from now","months ago","months from now","month ago","month from now","days ago","days from now","day ago","day from now","hours ago","hours from now","hour ago","hour from now","minutes ago","minutes from now","today","It is"};
	for(int i=0;i<fieldValuesArray.length;i++){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(fieldValuesArray[i], "pyFormatter");
	}
	String spxUniqueStreamHash16 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash16 != null && !"".equals(spxUniqueStreamHash16)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash16,pxUniqueStreamHash+"_16");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_16");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
	ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
	ctrlComponent.beginComponent("pxDisplayText",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);
}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
}
tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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



public void pxDisplayText_10() {String key="24||";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","false");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","false","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","24"};oCellRuntimeParamsMap.put("24||",paramValues);oControlPathsMap.put("24||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
public void gridTemplateBody_1(ClipboardProperty dataCells, IUIComponentMetadata metadataPage, Map configMap, boolean isPartial, String tempGridName) {
ClipboardPage gridMetadataPage = (ClipboardPage)configMap.get("pxGridMetadataPage"); 
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
String pageListClassName = metadataPage.getNestedProperty("gridWrapper.resultsClass"); 
boolean newPageCreated = false; 
ClipboardPage itemPage = null; 
String pageListProperty = (String)configMap.get("pyContext"); 
pageListProperty = pzAuto.getUIComponentRuntime().getResolvedRefernce(pageListProperty); 
ClipboardProperty cpSource = tools.getProperty(pageListProperty); 
if(null != cpSource){ 
Iterator itemPages = cpSource.iterator(); 
if(itemPages.hasNext()) { 
 itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
}
}
if(null == itemPage){
itemPage = tools.createPage(pageListClassName,"");
newPageCreated = true; 
}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus(); 
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y'); 
if(!isPartial){ 
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
if(org.apache.commons.lang3.StringUtils.isNotBlank((String)configMap.get("pyContext"))){
IUIComponent cc_grid = pzAuto.getUIComponent();
if(!isPartial){ 
cc_grid.addAdditionalBundles("RepeatingGrid", "pzpega_grid_staticbundle");
cc_grid.addAdditionalScripts("RepeatingGrid", "pzpega_ui_template_paginate.js");
} 
if(!isPartial && !pzAuto.isForOfflineTemplate()){ 
metadataPage.put("pxFilterConditionId",pxUniqueStreamHash+"_13");
gridMetadataPage.putString("pxFilterConditionId", pxUniqueStreamHash+"_13");
} 
String sectionBodyPath = "TableTemplate.pySections(1).pySectionBody(2)";
ClipboardPage gridStatePage = null;
if(!isPartial){ 
metadataPage.put("pyIsPersonalized","false");
gridStatePage = pega.getUIEngine().getGridUtilities().getPersonalizedViewsPage(metadataPage.getString("pyGridStateUniqueID"), null, metadataPage.getString("pySectionInsName"), metadataPage.getString("pyOperatorID"), metadataPage.getString("pyHarnessInsName")); 
if(gridStatePage !=null) {
metadataPage.put("pyIsPersonalized","true");
metadataPage.put(gridUtilities.PY_GRID_MINWIDTH,gridStatePage.getString(gridUtilities.PY_GRID_MINWIDTH));
metadataPage.put(gridUtilities.PY_GRID_ROWHEIGHT,gridStatePage.getString(gridUtilities.PY_GRID_ROWHEIGHT));
metadataPage.put(gridUtilities.PY_PERSONALIZED_NAME,gridStatePage.getString(gridUtilities.PYLABEL));
}
}
cc_grid.beginComponent(tempGridName, metadataPage, configMap);
String oldSectionReadOnly = tools.getParamValue("SectionReadOnly"); 
tools.putParamValue("SectionReadOnly","-1"); 
boolean inputEnabledStatus = tools.hasInputEnabled();
tools.setInput(false);
IUIComponent gridBodyComp = pzAuto.getUIComponent();
gridBodyComp.beginComponent("pxGridBody",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent gridHeaderRowComp = pzAuto.getUIComponent(); 
gridHeaderRowComp.beginComponent("pxGridHeaderRow",pzAuto.getUIComponentRuntime().createMetadata()); 
IUIComponent headerHtmlComp = null; 
IUIComponentMetadata headermetadata_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
headermetadata_1 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("","ID","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_1); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
headermetadata_2 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Label","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_2); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
headermetadata_3 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Creation date/time","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_3); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
headermetadata_4 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Created by","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_4); 
headerHtmlComp.endComponent(); 


 
IUIComponentMetadata headermetadata_5 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(5);
headermetadata_5 = gridUtilities.constructGridHeaderMetaData(rowCellPage, gridMetadataPage,5, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
headermetadata_5.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
headermetadata_5.put("data-ui-meta",pzCell.getInspectorDataDynamic("","Case status","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)"));
} 
} 
headerHtmlComp = pzAuto.getUIComponent(); 
headerHtmlComp.beginComponent("pxGridHeaderCell",headermetadata_5); 
headerHtmlComp.endComponent(); 


 
gridHeaderRowComp.endComponent(); 
PRStackFrame itemFrame = pega.pushStackFrame("GridFirstRowItem", null, itemPage, true, false); 
IUIComponent gridRowComp = pzAuto.getUIComponent(IUIComponent.ComponentType.GRID); 
gridRowComp.beginComponent("pxGridDataRow",pzAuto.getUIComponentRuntime().createMetadata(), configMap); 
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty("pzInsKey");
inclAction_1();
IUIComponent cellHtmlComp = null; 
IUIComponentMetadata cellMetaData_1 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(1);
cellMetaData_1 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,1, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_1.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_1.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pyID","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_1); 
if(itemPage != null){
pxDisplayText_7();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_2 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(2);
cellMetaData_2 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,2, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_2.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_2.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pyLabel","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_2); 
if(itemPage != null){
pxDisplayText_8();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_3 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(3);
cellMetaData_3 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,3, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_3.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_3.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxCreateDateTime","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_3); 
if(itemPage != null){
pxDisplayText_9(".pxCreateDateTime",0,"","","Date Time");
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_4 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(4);
cellMetaData_4 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,4, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_4.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_4.put("data-ui-meta",pzCell.getInspectorDataDynamic("pxDisplayText",".pxCreateOpName","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_4); 
if(itemPage != null){
pxDisplayText_10();
}
cellHtmlComp.endComponent(); 


 
IUIComponentMetadata cellMetaData_5 = pzAuto.getUIComponentRuntime().createMetadata();
if(!isPartial){ 
ClipboardPage rowCellPage =  dataCells.getPageValue(5);
cellMetaData_5 = gridUtilities.constructGridCellMetaData(rowCellPage, gridMetadataPage,5, gridStatePage,null);
if(rowCellPage.getStringIfPresent("pyEditOptions") !=null) {
cellMetaData_5.put("pyEditOptions",rowCellPage.getStringIfPresent("pyEditOptions"));
cellMetaData_5.put("data-ui-meta",pzCell.getInspectorDataDynamic("SUB_SECTION","pyCaseStatusInList","TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)"));
} 
} 
cellHtmlComp = pzAuto.getUIComponent(); 
cellHtmlComp.beginComponent("pxGridDataCell",cellMetaData_5); 
if(itemPage != null){
sectionBodyIncludeInCell_1();
}
cellHtmlComp.endComponent(); 


 
pega.popStackFrame(itemFrame, false); 
gridRowComp.endComponent(); 
if(!isPartial){ 
generateGridSections_1(metadataPage, gridMetadataPage);
gridMetadataPage.putString(".pyResultsClass", pageListClassName);
} 
gridBodyComp.endComponent(); 
cc_grid.endComponent();
tools.putParamValue("SectionReadOnly",oldSectionReadOnly); 
tools.setInput(inputEnabledStatus);
}else { 
pega.getUIEngine().getGridUtilities().loadSection(pxUniqueStreamHash+"_13","pyNextGenGridNoResultsMessage","@baseclass","",false,null);
}
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(currentTemplatingStatus); 
if(newPageCreated){
itemPage.removeFromClipboard(); 
}
tools.putParamValue("paramIndexValue",""); 
tools.putParamValue("skipTracking","false"); 
}
public void generateGridCellModes_1(String strGridMetadataPage) {
ClipboardPage gridMetadataPage = tools.findPage(strGridMetadataPage, true);
List<String> modesList = new ArrayList<String>(); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyMediaAutoplay>false</pyMediaAutoplay><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyRunOnClient>false</pyRunOnClient><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyFormatType>none</pyFormatType><pyMediaMuted>true</pyMediaMuted><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyMediaAutoplay>false</pyMediaAutoplay><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyRunOnClient>false</pyRunOnClient><pyDisplayFullScreen>true</pyDisplayFullScreen><pySpecifySize>auto</pySpecifySize><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyFormatType>none</pyFormatType><pyMediaMuted>true</pyMediaMuted><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyIconShow>false</pyIconShow><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pyCannedIconNew>pxIcon</pyCannedIconNew><pySymbolPosition>left</pySymbolPosition><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyObfuscatedNew>false</pyObfuscatedNew><pyMediaAutoplay>false</pyMediaAutoplay><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyRunOnClient>false</pyRunOnClient><pySpecifySize>auto</pySpecifySize><pyDisplayFullScreen>true</pyDisplayFullScreen><pyType>M</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyFormatType>datetime</pyFormatType><pyMediaMuted>true</pyMediaMuted><pyMediaLoop>false</pyMediaLoop><pyDateTimeHourFormat>false</pyDateTimeHourFormat><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyIconShow>false</pyIconShow><pyDateTimeFormat>DateTime-Frame</pyDateTimeFormat><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyImageSize>auto</pyImageSize><pyHelperTextType>none</pyHelperTextType><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pySymbolPosition>left</pySymbolPosition><pyCannedIconNew>pxIcon</pyCannedIconNew><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add("<?xml version=\"1.0\"?><pagedata><pyModeType>Read-Only</pyModeType><pyMediaAutoplay>false</pyMediaAutoplay><pyHighlightMatch>true</pyHighlightMatch><pyMinSearchChars>2</pyMinSearchChars><pyRunOnClient>false</pyRunOnClient><pySpecifySize>auto</pySpecifySize><pyDisplayFullScreen>true</pyDisplayFullScreen><pyType>T</pyType><pyReadonlyValidation>false</pyReadonlyValidation><pyFalseLabel>False</pyFalseLabel><pyUIElement>label</pyUIElement><pyObfuscated>false</pyObfuscated><pyTrueLabel>True</pyTrueLabel><pyMediaMuted>true</pyMediaMuted><pyFormatType>none</pyFormatType><pyMediaLoop>false</pyMediaLoop><pyCannedIcon>pxIcon</pyCannedIcon><pyMediaPreload>auto</pyMediaPreload><pyDisabled>false</pyDisabled><pyDirection>vertical</pyDirection><pySeparators>true</pySeparators><pyDateTimeSecondCutoff>3</pyDateTimeSecondCutoff><pyIconShow>false</pyIconShow><pyDisplayCurrencyAs>currencySymbol</pyDisplayCurrencyAs><pyEllipsis>true</pyEllipsis><pyAttachContentFormat>button</pyAttachContentFormat><pyHelperTextType>none</pyHelperTextType><pyImageSize>auto</pyImageSize><pyLabelPosition>right</pyLabelPosition><pxObjClass>Embed-Control-Mode</pxObjClass><pyDisplayAsComboBox>false</pyDisplayAsComboBox><pyActionImagePosition>left</pyActionImagePosition><pyNegativeFormatStyle>NegativeNumber</pyNegativeFormatStyle><pyDecimalPlaces>2</pyDecimalPlaces><pyMediaControls>true</pyMediaControls><pySymbolPosition>left</pySymbolPosition><pyCannedIconNew>pxIcon</pyCannedIconNew><pyTextAlign>Left</pyTextAlign><pyContent>localizevalue</pyContent><pyBehaviors REPEATINGTYPE=\"PageList\"/><pyListDataSource><pxObjClass>Embed-Control-Mode-ListDefinition</pxObjClass><pyListSource>associated</pyListSource></pyListDataSource></pagedata>"); 
modesList.add(""); 
ClipboardProperty gridMetaColumns = gridMetadataPage.getProperty("pyColumns"); 
java.util.Iterator it = gridMetaColumns.iterator(); 
ClipboardPage pyModesPage = tools.createPage("@baseclass", "pyModesPage"); 
while(it.hasNext()) { 

ClipboardPage columnProp = ((ClipboardProperty)it.next()).getPageValue(); 
boolean noModes = columnProp.getPage("pyModes").isEmpty(); 
if(noModes) { 
int index = columnProp.getInteger(".pyInitialOrder") - 1; 
String strModesXML = modesList.get(index); 
if(!org.apache.commons.lang.StringUtils.isBlank(strModesXML)){ 
	try { 
		pyModesPage.adoptXMLForm(strModesXML); 
        columnProp.putPage(".pyModes", pyModesPage); 
	} catch (InvalidStreamError e) { 
		oLog.error(e); 
	} 
} 
} 
} 
pyModesPage.removeFromClipboard(); 
}


public void D_OnboardingList_pxResults_2() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString(",");
		tools.appendString(",\"up\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString(",");
		tools.appendString(",\"down\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doListAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public String 
getGridActions_1() {
	boolean directStream = ((PegaStreamAPI)tools).isDirectStreaming();
	if(directStream) {
		((PegaStreamAPI)tools).disableDirectStreaming();
	}
	String currentStream = tools.getCurrentStream();
	D_OnboardingList_pxResults_2();
	String returnString = tools.getCurrentStream();
	tools.appendString(currentStream);
	if(directStream) {
		((PegaStreamAPI)tools).forceDirectStreaming();
	}
	return returnString;
}
public void getGridMetaData_1(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
metadataPage.put("pyWidthOfContent","%");
gridWrapper.put("responsive","true");
gridWrapper.put("contentClass","grid-responsive-default  gPercent ");
gridWrapper.put("pzClass","default");
gridWrapper.put("DPName","D_OnboardingList.pxResults");
gridWrapper.put("propType","Data Object");
gridWrapper.put("resultsClass","OLFHF9-Onboaring-Work-Onboarding");
String dataTestId = pzAuto.getTestIdIfEnabled("201807201200410738626", true); 
if(!"".equalsIgnoreCase(dataTestId)){
gridWrapper.put("automationId","201807201200410738626");
}
gridWrapper.put("isFilteringEnabled","true");
gridWrapper.put("isColumnResizeEnabled","true");
gridWrapper.put("isColumnReorderEnabled","false");
gridWrapper.put("isRefreshListEnabled","false");
gridWrapper.put("pyPassCurrentParamPage","false");
gridWrapper.put("isSortingEnabled","true");
gridWrapper.put("isRowHeightEnabled","false");
gridWrapper.put("isColumnTogglerEnabled","false");
gridWrapper.put("isPersonalizationEnabled","true");
gridWrapper.put("isCategorizationEnabled","false");
gridWrapper.put("isImplicitSaveEnabled","true");
gridWrapper.put("pyDesignViewName","Default view");
metadataPage.put("pyPersonalizedName","Default view");
gridWrapper.put("isRowVisibilityEnabled","false");
IUIComponentMetadata gridTable = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata rowOperations = pzAuto.getUIComponentRuntime().createMetadata();
gridTable.put("isDPParameterized","false");
gridTable.put("inlinestyle","width:100%;");
gridTable.put("gridSummary",tools.getLocalizedTextForString("pyCaption",""));
gridTable.put("gridCaption",tools.getLocalizedTextForString("pyCaption",""));
gridWrapper.put("hasRowOperations","false");
pega.getUIEngine().getGridUtilities().populateLocalizedText(gridWrapper, gridTable);
if(!pzAuto.isForOfflineTemplate()){
metadataPage.put("pyShowFiltersInModal","false");
}
gridWrapper.put("sectionName","OnboardingList");
gridWrapper.put("sectionClass","OLFHF9-Onboaring-UIPages");
metadataPage.putMetadata("gridTable",gridTable);
metadataPage.putMetadata("rowOperations",rowOperations);
}
public void gridTemplateMain_1(IUIComponentMetadata metadataPage, IUIComponentMetadata gridWrapper) {
Map dpParamsMap = new HashMap();
if(!pzAuto.isForOfflineTemplate()){
String propWithToken =  null; 
String propResolved =  null; 
}
String gridXML = "<?xml version=\"1.0\"?><pagedata><pxObjClass>Pega-UI-Component-Grid</pxObjClass><pyWidthOfContent>%</pyWidthOfContent><pzStatus>false</pzStatus><pzGridTable><pxObjClass>Pega-UI-Component-Grid-GridTable</pxObjClass><pzStyle>width:100%;</pzStyle></pzGridTable><pyDataCells REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>82px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>ID</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyID</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"2\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>196px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Label</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pyLabel</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"3\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>196px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Creation date/time</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxCreateDateTime</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"4\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnFiltering>true</pyColumnFiltering><pyColumnSorting>true</pyColumnSorting><pyCellWidth>100px</pyCellWidth><pyContentType>FIELD</pyContentType><pyEditOptions>Read-only</pyEditOptions><pyHeaderLabel>Created by</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>.pxCreateOpName</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata><rowdata REPEATINGINDEX=\"5\"><pxObjClass>Pega-UI-Component-Cell-DataCell</pxObjClass><pyColumnFiltering>false</pyColumnFiltering><pyColumnSorting>false</pyColumnSorting><pyCellWidth>100px</pyCellWidth><pyContentType>SUB_SECTION</pyContentType><pyEditOptions>Auto</pyEditOptions><pyHeaderLabel>Case status</pyHeaderLabel><pyHorizontalAlignment>true</pyHorizontalAlignment><pyPropertyName>pyCaseStatusInList</pyPropertyName><pyColumnImportance>secondary</pyColumnImportance><PZ__ERROR DATAFLD=\"pyCellWidth\">pyCellWidth needs to be a number</PZ__ERROR></rowdata></pyDataCells><pzGridWrapper><pxObjClass>Pega-UI-Component-Grid-GridWrapper</pxObjClass><pzContentClass>grid-responsive-default  gPercent </pzContentClass><pzPropertyType>Data Object</pzPropertyType><pyResultsClass>OLFHF9-Onboaring-Work-Onboarding</pyResultsClass><pzClass>default</pzClass><pyDataPageName>D_OnboardingList.pxResults</pyDataPageName><pyResponsive>true</pyResponsive><pyAutomationID>201807201200410738626</pyAutomationID></pzGridWrapper></pagedata>";
ClipboardPage temp_gridConfigPage = tools.createPage(null,"temp_gridConfigPage");
try {
  temp_gridConfigPage.adoptXMLForm(gridXML);
} catch(InvalidStreamError e){oLog.error(e);}
getGridMetaData_1(metadataPage,gridWrapper);
Map configMap = new HashMap(); 
ClipboardPage gridMetadataPage = tools.createPage("Pega-UI-Component-Grid-Filter","GridMetadata_Main"+pzAuto.getUIComponentRuntime().generateUniqueId());
gridMetadataPage.putString(".pySectionClass","OLFHF9-Onboaring-UIPages");
gridMetadataPage.putString(".pySectionName","OnboardingList");
configMap.put("pxGridMetadataPage", gridMetadataPage); 
gridMetadataPage.putString("pyFilteringEnabled", "true");
gridMetadataPage.putString("pySortingEnabled", "true");
gridMetadataPage.putString(".pyIsCategorizationEnabled", "false");
metadataPage.put("gridActions",getGridActions_1().trim());
String strDSName = gridWrapper.getString("DPName"); 
String strDSNameWithToken = pzAuto.getUIComponentRuntime().generateTokensForString(strDSName);
gridWrapper.put("pageListProp",strDSNameWithToken);
String strDSNameWithResolved = pzAuto.getUIComponentRuntime().getResolvedRefernce(strDSName);
gridMetadataPage.putString("pyPageList",strDSNameWithResolved);
pega.getUIEngine().getGridUtilities().updateQueryableDPInfo(strDSName,gridMetadataPage);
boolean isQueryable = gridMetadataPage.getBoolean("isQueryable");
ClipboardProperty dataCells = temp_gridConfigPage.getProperty(".pyDataCells"); 
temp_gridConfigPage.remove(".pyDataCells"); 
ClipboardPage gridStatePage = null;
com.pega.pegarules.priv.runtime.IGridUtilities gridUtilities = pega.getUIEngine().getGridUtilities(); 
pega.getUIEngine().getGridUtilities().registerGridActiviy();
metadataPage.put("pyIsPersonalized","false");
gridStatePage = gridUtilities.getPersonalizedViewsPage(metadataPage.getString("pyGridStateUniqueID"), null, metadataPage.getString("pySectionInsName"), metadataPage.getString("pyOperatorID"), metadataPage.getString("pyHarnessInsName")); 
if(null != gridStatePage){ 
dataCells = gridUtilities.mergeViewAndDesign(dataCells, gridStatePage); 
} 
configMap.put("params", dpParamsMap); 
configMap.put("pyContext", strDSName); 
configMap.put("listAction", "INIT"); 
configMap.put("pyCollectProps", "true"); 
configMap.put("pxDataSourceId", pxUniqueStreamHash+"_12");
gridWrapper.put("datasrcid",pxUniqueStreamHash+"_12");
if(isQueryable){
gridWrapper.put("isPagingEnabled","true");
gridWrapper.put("isSearchEnabled","false");
}else {
gridWrapper.put("isSearchEnabled","false");
gridWrapper.put("isPagingEnabled","true");
}
IUIComponentMetadata pagingSettings = pzAuto.getUIComponentRuntime().createMetadata();
com.pega.pegarules.priv.util.PaginatorMetaData.getPaginationMetaData(30, 1, strDSNameWithToken,"Numeric",pzAuto, "", metadataPage, pagingSettings); 
   int startIndex = 1; 
   int endIndex = 0; 
   int pxResultCount = 30;
   endIndex = pxResultCount; 
Map pyPagination = new HashMap(); 
pyPagination.put("pyStartIndex", ""+startIndex); 
pyPagination.put("pyEndIndex", ""+endIndex); 
configMap.put("pyPagination", pyPagination); 
configMap.put("pxPageSize", pxResultCount); 
gridMetadataPage.putString("pxPageSize", "30"); 
gridMetadataPage.putString("pxPageIndex", "1"); 
configMap.put("pxPageIndex", 1); 
gridWrapper.put("cellMethodName","generateGridCellModes_1");
if(isQueryable){
boolean isTablecategorized = false; 
if(gridStatePage != null) {
ClipboardPage tempPage = tools.createPage("System-User-Grids", "tempPage"); 
 tempPage.putAll(gridStatePage, ClipboardPage.PUTALL_KEEPNEW); 
tempPage.putString("isFilteringEnabled",gridMetadataPage.getString("pyFilteringEnabled"));
tempPage.putString("isSortingEnabled",gridMetadataPage.getString("pySortingEnabled"));
tempPage.putString("pxPageSize",gridMetadataPage.getString("pxPageSize"));
tempPage.putString("pxPageIndex",gridMetadataPage.getString("pxPageIndex"));
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(tempPage.getProperty("pyColumns"),tempPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(true ,tempPage);
tempPage.removeFromClipboard();
}else {
isTablecategorized = pega.getUIEngine().getGridUtilities().setCategorizationStatus(dataCells,gridMetadataPage);
pega.getUIEngine().getGridUtilities().setImplicitParameter(false ,gridMetadataPage);
}
isQueryable = gridMetadataPage.getBoolean("isQueryable");
if(isQueryable){
pega.getUIEngine().getGridUtilities().mergeColumnInfo(dataCells,gridMetadataPage);
gridWrapper.put("isQueryable","true");
if(isTablecategorized) {
configMap.put("isQueryable", "false"); 
}else{
configMap.put("isQueryable", "true"); 
}
}else{
}
}
gridWrapper.put("ctMethodName","gridTemplatePartial_1");
metadataPage.putMetadata("gridWrapper",gridWrapper);
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage(); 
gridTemplateBody_1(dataCells, metadataPage, configMap, false, "pxGrid");
temp_gridConfigPage.removeFromClipboard(); 
tools.putParamValue("isDPParameterized",""); 
gridMetadataPage.removeFromClipboard();
dataCells.removeFromClipboard();
gridUtilities.clearVisitedFlagInGridState(gridStatePage);
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionOnboardingListB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'TableTemplate.pySections(1)','editable':'true'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionOnboardingListB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void gridTemplateInit_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponentMetadata gridWrapper = pzAuto.getUIComponentRuntime().createMetadata();
String pyGridStateUniqueID= "1532102217971";
String pySectionInsName= "";
String pyOperatorID= tools.findPage("OperatorID").getString(".pyUserIdentifier");
String harnessClassName = tools.getParamValue("strPHarnessClass");
if(StringUtils.isBlank(harnessClassName)) {
harnessClassName = tools.getParamValue("className");
}
String harnessName = tools.getParamValue("innerHarnessName");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("strPHarnessPurpose");
if(StringUtils.isBlank(harnessName)) {
harnessName = tools.getParamValue("Purpose");
}
}
String pyHarnessInsName= harnessClassName+"!"+harnessName;
metadataPage.put("pyGridStateUniqueID",pyGridStateUniqueID);
metadataPage.put("pySectionInsName",pySectionInsName);
metadataPage.put("pyOperatorID",pyOperatorID);
metadataPage.put("pyHarnessInsName",pyHarnessInsName);
gridWrapper.put("pzCTResetSaveMethodName","gridTemplateSwitchPersonalization_1");
gridTemplateMain_1(metadataPage, gridWrapper);
}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "Numeric"; 

 String strPageSize = "30"; 

 String returnTotalCount = ""; 
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
if (tmpDeclarePageParams != null && tmpDeclarePageParams.getProperty("D_OnboardingList_pxResults_OnboardingList_1") != null) {
ClipboardPage paramList = tmpDeclarePageParams.getProperty("D_OnboardingList_pxResults_OnboardingList_1").getPageValue();
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

 ClipboardPage gFCritPageD_OnboardingList_pxResultsL3=null;

 Map selUniqMapD_OnboardingList_pxResultsL3 = null;

 Set filteredIndicesSetD_OnboardingList_pxResultsL3 = null;

	 String strFCPage = "pyFilterCriteria_D_OnboardingList.pxResults_OnboardingList_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

gFCritPageD_OnboardingList_pxResultsL3=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

  selUniqMapD_OnboardingList_pxResultsL3 = null; // reset the variable

 if(gFCritPageD_OnboardingList_pxResultsL3 != null){ 

 		 filteredIndicesSetD_OnboardingList_pxResultsL3 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_OnboardingList_pxResultsL3, "D_OnboardingList.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_OnboardingList_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapD_OnboardingList_pxResultsL3 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_OnboardingList_pxResultsL3); 

 		 tools.getParameterPage().put("selUniqMapD_OnboardingList_pxResultsL3", selUniqMapD_OnboardingList_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_OnboardingList.pxResults").getReference());tools.appendString("_OnboardingList_1'");
tools.appendString(" hashed-dp-page='");
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_OnboardingList.pxResults").getReference());tools.appendString("' bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201807201200410738626") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='nextGenReadOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='true' bReportDefinition='false' bLoadActivity='false' bDataObject='true' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' DPSectionID=\"SubSectionOnboardingListB\"  OAFunc='openWorkByHandle' ");
D_OnboardingList_pxResults_1();
tools.appendString(">");


 ClipboardProperty pageListProp = null;

 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


 int currentPageIndex = 0; 

 if(startIndex == 0){ startIndex = 1; } 

 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

 tools.putParamValue("pyPageMode", strPageMode); 


 tools.putParamValue("pyPageSize", "30"); 

 tools.putSaveValue("pyPageSize", "30"); 

 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {


 pageListProp = tools.getProperty("D_OnboardingList.pxResults"); 
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

 tools.putParamValue("PageListProperty","D_OnboardingList.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("D_OnboardingList.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageD_OnboardingList_pxResultsL3!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_OnboardingList_pxResultsL3, selUniqMapD_OnboardingList_pxResultsL3);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageD_OnboardingList_pxResultsL3== null || bFilterResult) {
						
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
						pageListProp = tools.getProperty("D_OnboardingList.pxResults"); }
						
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
					ClipboardPage gFCritPageD_OnboardingList_pxResultsL3=null;
					Map selUniqMapD_OnboardingList_pxResultsL3 = null;
					selUniqMapD_OnboardingList_pxResultsL3 = null; // reset the variable
					gFCritPageD_OnboardingList_pxResultsL3=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
							 selUniqMapD_OnboardingList_pxResultsL3 = (Map)tools.getParameterPage().getObject("selUniqMapD_OnboardingList_pxResultsL3");
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

					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_OnboardingList.pxResults");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyID .pyLabel .pxCreateDateTime .pxCreateOpName   ' class='yui-skin-sam gPercent grid-responsive-default ");

					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					tools.appendString("' gPropIndex='D_OnboardingListPpxResults1' editRowIndex='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"true\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" dpParams=\"\" pyPageSize = '");

					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">");

					
					
					
					
					
					

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201807201200410738626-layout") + " ");

					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_OnboardingListPpxResults1colWidthGBL\" id=\"D_OnboardingListPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"D_OnboardingListPpxResults1colWidthGBR\" id=\"D_OnboardingListPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_OnboardingListPpxResults1colWidthGBR"));

					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					
					 if(!("".equals(tools.getParamValue("D_OnboardingListPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' bColumnResize=\"true\" PL_PROP='D_OnboardingList.pxResults' PL_PROP_CLASS='OLFHF9-Onboaring-Work-Onboarding' PRIM_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					
					
					
					
					
					 repeatingHeaderCell_1(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName();  repeatingHeaderCell_5(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
					
					
					
					
								 itr_3 = tools.getProperty("D_OnboardingList.pxResults").iterator(); 

					
					
					
					
					
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
										 } else if(gFCritPageD_OnboardingList_pxResultsL3!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_OnboardingList_pxResultsL3, selUniqMapD_OnboardingList_pxResultsL3);
										 }
										 if (gFCritPageD_OnboardingList_pxResultsL3== null || 

					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
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

					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_OnboardingList.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					 
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

					
					
					
					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_OnboardingList.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_OnboardingList.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					
					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					
					
					
					String strEntryHandlePLProp = "";

					
					
					
					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_OnboardingList.pxResults"); } catch (Exception ex) { }

					
					
					
					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					
					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					
					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					
					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					
					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					
					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					
					
					
					}

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201807201200410738626-" + rowTestID) + " ");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" PL_INDEX = '");

					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_1(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_7(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_4(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					 repeatingDataCell_5(); 

					
					
					
					
					
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

					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"5\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("OLFHF9-Onboaring-Work-Onboarding", "tempNoRespg");

					
					
					
					
					
					
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

					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_OnboardingList.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
						 tools.putParamValue("partialTrigger",""); 
}

					
					
					
					
					
					
					 /* GenerateGrid: End */

					
					
					
					
					
					}

					
					
					
					
					
					public void 
gridEndLayout_1
					
					
					
					
					
					() {

					
					
					
					
					
					
 tools.getParameterPage().remove("pyReportPageName"); 

					
					
					
					
					
					
 tools.getParameterPage().remove("pyGridFilterCriteriaPage"); 

					
					
					
					
					tools.appendString("</div></div>");

					
					
					
					
					}

					
					
					
					
					public void LayoutWrapperTableEnd_1() {

					
					
					
					
					tools.appendString("</td></tr></table>");

					
					
					
					
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

					
					
					
					
					String paramName = "EXPANDEDSubSectionOnboardingListB";

					
					
					
					
					metadataPage.put("paramName", paramName);

					
					
					
					
					String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'TableTemplate.pySections(1)','editable':'true'}");

					
					
					
					
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
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()){ 
gridTemplateInit_1();
return;}pzLayoutBodyWrapper_2();
 LayoutWrapperTableEnd_1(); }
tools.putParamValue("gridLayoutMethodName","");
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
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","24"};oCellRuntimeParamsMap.put("24||",paramValues);oControlPathsMap.put("24||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}


public void pxDisplayText_6(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20180720120041074154614") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Creation date/time"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxCreateDateTime", "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:34px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_6(".pxCreateDateTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_6(".pxCreateDateTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","22"};oCellRuntimeParamsMap.put("22||",paramValues);oControlPathsMap.put("22||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","32","","","Text","true","21"};oCellRuntimeParamsMap.put("21||",paramValues);oControlPathsMap.put("21||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}


public void pyCaseStatusInList_1() {
pzAuto.emitIncludeStreamReference("pyCaseStatusInList", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_5() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Case status"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pyCaseStatusInList", "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString(" headers='a5' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:34px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	tools.putParamValue("section_params","");
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pyCaseStatusInList_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void pxDisplayText_4() {String key="24||";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","24"};oCellRuntimeParamsMap.put("24||",paramValues);oControlPathsMap.put("24||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}
public void repeatingDataCell_4() {
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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxCreateOpName", "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:34px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_4();
									tools.appendString("</DIV>"); } else { pxDisplayText_4();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","localizevalue",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		 tools.putParamValue("pyDateTimeHourFormat","false");
		 tools.putParamValue("pyDateTimeSecondCutoff", "3");
		 tools.putParamValue("pyFormatType", "datetime");
		String formattedValue = pega_uiengine_formatter.pxFormatDateTime((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true)),"DateTime-Frame","localizevalue",true);
		if(pzAuto.handleEvaluateWhen(" cffalse","false","cell", "disable" )){
			StringBuffer showValue = new StringBuffer(formattedValue);
			int length = formattedValue.length();
			for(int i = 0; i < length; i++) {
				showValue.setCharAt(i,'●');
			}
		formattedValue = showValue.toString();
		}
		tools.appendString(formattedValue);
		 tools.putParamValue("pyDateTimeHourFormat","");
		 tools.putParamValue("pyFormatType", "");
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


public void pxDisplayText_3(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20180720120041074154614") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

public void repeatingDataCell_3() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Creation date/time"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pxCreateDateTime", "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:34px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_3(".pxCreateDateTime",0,"","","Date Time");
									tools.appendString("</DIV>"); } else { pxDisplayText_3(".pxCreateDateTime",0,"","","Date Time");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_2() {String key="22||";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","22"};oCellRuntimeParamsMap.put("22||",paramValues);oControlPathsMap.put("22||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Label"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyLabel", "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:34px;'");}tools.appendString("class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDisplayText_2();
									tools.appendString("</DIV>"); } else { pxDisplayText_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDisplayText_1() {String key="21||";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxDisplayText", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","32","","","Text","true","21"};oCellRuntimeParamsMap.put("21||",paramValues);oControlPathsMap.put("21||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "ID"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDisplayText",".pyID", "TableTemplate.pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:36px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDisplayText_1();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxDisplayText_1();}
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
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","32","","","Text","true","21"};oCellRuntimeParamsMap.put("21||",paramValues);oControlPathsMap.put("21||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","64","","","Text","true","22"};oCellRuntimeParamsMap.put("22||",paramValues);oControlPathsMap.put("22||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}


public void pxDisplayText_5(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")){
inclCalVal_1("pxDisplayText","D&&DateTime-Frame&& &&datetime","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20180720120041074154614") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	pzAuto.getSection().getControl().includeShowMe(false);
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

static{String[] paramValues = new String[]{"label", "pxDisplayText", "","D_OnboardingList.pxResults","","","true","FREEFORM","REPEATING","",""," cffalse","T","true","0","","","Text","true","24"};oCellRuntimeParamsMap.put("24||",paramValues);oControlPathsMap.put("24||",".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)");}


public void D_OnboardingList_pxResults_1() {
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

					if(tools.getParamValue("partialTrigger").equals("appendToD_OnboardingList.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowD_OnboardingList.pxResults1") ){

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_OnboardingList.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_OnboardingList.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_OnboardingList.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_OnboardingList.pxResults"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201807201200410738626-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					activeName = tools.getActiveName();  repeatingDataCell_3(); 

					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					activeName = tools.getActiveName();  repeatingDataCell_5(); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_OnboardingList.pxResults1")) {

					
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

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_OnboardingList.pxResults1")) { 

					
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

					
			 if(subScriptForColumn.equals("pyID1") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_1();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pyLabel2") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_2();

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxCreateDateTime3") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_5(".pxCreateDateTime",0,"","","Date Time");

					
									 pega.popStackFrame(frame, false); } 

					
			 } 

					
			 if(subScriptForColumn.equals("pxCreateOpName4") && strCellType.equals("static")) { 

					
				 tools.putActive((ClipboardProperty)tools.getParameterPage().get("currentRowPage")); 

					
									  { PRStackFrame frame = pega.pushStackFrame("ColRepeatRow", null, ((ClipboardProperty)tools.getParameterPage().get("currentRowPage")).getPageValue() , false, false); 

					pxDisplayText_4();

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_OnboardingList.pxResults1") ){

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_OnboardingList.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals("D_OnboardingList.pxResults")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodesD_OnboardingList.pxResults1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle("D_OnboardingList.pxResults"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201807201200410738626-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					 repeatingDataCell_1(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_2(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_6(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_4(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_5(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
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
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "OLFHF9-Onboaring-UIPages");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Onboaring");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "OnboardingList");
	oStreamProperties_1.put("pyRuleSetVersion", "01-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("generateGridCellModes_1", new String[][] { {"strGridMetadataPage", "String", ""}});
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
pzExternalMethodMapping.put("gridTemplatePartial_1", new String[][] {});
pzExternalMethodMapping.put("gridTemplateSwitchPersonalization_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("", "OLFHF9-Onboaring-UIPages OnboardingList", "Onboaring", "01-01-01", "20190204T134240.387 GMT");
}
