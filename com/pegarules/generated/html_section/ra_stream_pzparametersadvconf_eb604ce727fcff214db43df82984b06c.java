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
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream RULE-OBJ-MODEL!PZPARAMETERSADVCONF.
 */
public class ra_stream_pzparametersadvconf_eb604ce727fcff214db43df82984b06c extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzParametersAdvConf.Rule_Obj_Model.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 585025199;
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
	public ra_stream_pzparametersadvconf_eb604ce727fcff214db43df82984b06c(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "a511c75569fa837f4033ccd4d9fdc508ef2ad73";
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
/* Instance RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "a511c75569fa837f4033ccd4d9fdc508ef2ad73";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzParametersAdvConf",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT */
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
	"Rule-HTML-Section:PZPARAMETERSADVCONF", 
	"Rule-Obj-Property:PYPARAMETERSPARAMNAME", 
	"Rule-Obj-Property:PYPARAMETERSPARAMTYPE", 
	"Rule-Obj-Property:PYPARAMETERSPARAMDEFAULTVALUE", 
	"Rule-Obj-Property:PYPARAMETERSPARAMINTELLIVALIDATEAS", 
	"Rule-Obj-Property:PYPARAMETERSPARAMDESC", 
	"Rule-HTML-Property:PXDROPDOWN", 
	"Rule-HTML-Property:PXADDLISTITEM", 
	"Rule-HTML-Property:PXDELETELISTITEM"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZPARAMETERSADVCONF","Rule-HTML-Section","RULE-OBJ-MODEL",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT","!PZPARAMETERSADVCONF",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",585025199), 
		new DependentRuleInfo("PYPARAMETERSPARAMNAME","Rule-Obj-Property","EMBED-METHODPARAMS",true,"Embed-MethodParams","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMNAME #20180713T131237.573 GMT","!PYPARAMETERSPARAMNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYPARAMETERSPARAMTYPE","Rule-Obj-Property","EMBED-METHODPARAMS",true,"Embed-MethodParams","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMTYPE #20180713T131237.581 GMT","!PYPARAMETERSPARAMTYPE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYPARAMETERSPARAMDEFAULTVALUE","Rule-Obj-Property","EMBED-METHODPARAMS",true,"Embed-MethodParams","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDEFAULTVALUE #20180713T131235.923 GMT","!PYPARAMETERSPARAMDEFAULTVALUE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYPARAMETERSPARAMINTELLIVALIDATEAS","Rule-Obj-Property","EMBED-METHODPARAMS",true,"Embed-MethodParams","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMINTELLIVALIDATEAS #20180713T131237.539 GMT","!PYPARAMETERSPARAMINTELLIVALIDATEAS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYPARAMETERSPARAMDESC","Rule-Obj-Property","EMBED-METHODPARAMS",true,"Embed-MethodParams","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDESC #20180713T131235.937 GMT","!PYPARAMETERSPARAMDESC",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXDROPDOWN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT","PXDROPDOWN",true,false,"ABSOLUTE_CLASSLESS",1414051726), 
		new DependentRuleInfo("PXADDLISTITEM","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXADDLISTITEM #20180713T133433.426 GMT","PXADDLISTITEM",true,false,"ABSOLUTE_CLASSLESS",-237514687), 
		new DependentRuleInfo("PXDELETELISTITEM","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT","PXDELETELISTITEM",true,false,"ABSOLUTE_CLASSLESS",-991878613)
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
//	RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT:20180713T135251.402 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMNAME #20180713T131237.573 GMT:20180713T131237.573 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDESC #20180713T131235.937 GMT:20180713T131235.937 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMTYPE #20180713T131237.581 GMT:20180713T131237.581 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDEFAULTVALUE #20180713T131235.923 GMT:20180713T131235.923 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMINTELLIVALIDATEAS #20180713T131237.539 GMT:20180713T131237.539 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMNAME #20180713T131237.573 GMT:20180713T131237.573 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDESC #20180713T131235.937 GMT:20180713T131235.937 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMTYPE #20180713T131237.581 GMT:20180713T131237.581 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDEFAULTVALUE #20180713T131235.923 GMT:20180713T131235.923 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMINTELLIVALIDATEAS #20180713T131237.539 GMT:20180713T131237.539 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMNAME #20180713T131237.573 GMT:20180713T131237.573 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDESC #20180713T131235.937 GMT:20180713T131235.937 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMTYPE #20180713T131237.581 GMT:20180713T131237.581 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMNAME #20180713T131237.573 GMT:20180713T131237.573 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDESC #20180713T131235.937 GMT:20180713T131235.937 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMTYPE #20180713T131237.581 GMT:20180713T131237.581 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMNAME #20180713T131237.573 GMT:20180713T131237.573 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDESC #20180713T131235.937 GMT:20180713T131235.937 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMTYPE #20180713T131237.581 GMT:20180713T131237.581 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDEFAULTVALUE #20180713T131235.923 GMT:20180713T131235.923 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMINTELLIVALIDATEAS #20180713T131237.539 GMT:20180713T131237.539 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-HTML-PROPERTY PXADDLISTITEM #20180713T133433.426 GMT:20180713T133433.426 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMNAME #20180713T131237.573 GMT:20180713T131237.573 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMDESC #20180713T131235.937 GMT:20180713T131235.937 GMT
//	RULE-HTML-PROPERTY PXDROPDOWN #20191010T062311.436 GMT:20191010T062311.436 GMT
//	RULE-OBJ-PROPERTY EMBED-METHODPARAMS PYPARAMETERSPARAMTYPE #20180713T131237.581 GMT:20180713T131237.581 GMT
//	RULE-HTML-PROPERTY PXADDLISTITEM #20180713T133433.426 GMT:20180713T133433.426 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(
//	simpleLayout_2(
//	pzLayout_1(
//	pzLayout_3(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T132449.639 GMT:20180713T132449.639 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONADDROW #20190204T044757.846 GMT:20190204T044757.846 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONDELETEROW--(CLIPBOARDPAG0B11B94B773838E3A9E06E99689ED6C8 #20180915T103511.007 GMT:20180915T103511.007 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDPARAMETERPAGE #20180713T133344.777 GMT:20180713T133344.777 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZCHECKAUTOGENCONTROL--(CLIPBOARDPROPERTY) #20180713T133344.796 GMT:20180713T133344.796 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECELLREFRESHDIV #20180713T133344.854 GMT:20180713T133344.854 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEDROPDOWN #20230618T001619.478 GMT:20230618T001619.478 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETCONTROLSFORMAT--(CLIPBOARDP67982A3A95FEBEAA95783F4B64F7D734 #20231101T074700.438 GMT:20231101T074700.438 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPAGECLASS #20190222T143815.273 GMT:20190222T143815.273 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE #20180713T131446.065 GMT:20180713T131446.065 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f2c3d02cab90b3df92cbb4f10efbe5ae";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Model";
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
pzLayoutBodyWrapper_4();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzParametersAdvConf",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzParametersAdvConf','insKey':'RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT','sectionType':'standard'}");
pzLayout_2();
pzLayout_4();
 tools.putSaveValue("ContainerID", "");
if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {tools.putParamValue("setPostValueURL", "true");} else {tools.appendString("<div style=\"display:none;\" data-postvalue-url=\"" + StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=ReloadCell&StreamName=pzParametersAdvConf")) + "\"></div>");}
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
pega.getUIEngine().getUIAction("reorder", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "parametersTabClickCallback");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void 
getControlMarkup_1() {
try {
if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyParametersParamName").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxTextInput_1();pzAuto.getUIComponentRuntime().insertTemplateScripts();}
else if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyParametersParamType").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxDropdown_5(".pyParametersParamType",0,"","","Text");pzAuto.getUIComponentRuntime().insertTemplateScripts();}
else if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyParametersParamName").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxTextInput_5();pzAuto.getUIComponentRuntime().insertTemplateScripts();}
else if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyParametersParamType").getEntryHandle())){if(tools.getParamValue("UITemplatingStatus").equals("Y")) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
}pxDropdown_6(".pyParametersParamType",0,"","","Text");pzAuto.getUIComponentRuntime().insertTemplateScripts();}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_8() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_7() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_4();gridCentreLayout_2();layoutBody_2();
				gridEndLayout_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxAddListItem_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_45")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzParametersAdvConf_"+ referenceString+ "_840'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Add item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140924151621077041206") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconInsert' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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



public void layoutBody_2() { 
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='3' class = 'gridActionBottom'>" + "<table role='presentation'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxAddListItem",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(3).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:100%;",false,"","");tools.putSaveValue("parentLayouttype","ACTION");pxAddListItem_2();
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 


public void pxDropdown_6(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_40")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_41")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_42")){String ddPropRef = tools.getActive().getReference();
String ddPropEntryHandle = tools.getActive().getEntryHandle();
String disabled_ctrl = "";
		String strPropName= tools.getActive().getName();
		String styleAttribute = "";
		styleAttribute = "standard";
				if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		styleAttribute += " ErrorShade";
				}
		if(!"".equals(styleAttribute)){
		styleAttribute = "class='"+styleAttribute+"'";
		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		ClipboardPage cbpRes=null;
		ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_43");}if(beginNonTemplate){		HashStringMap params = new HashStringMap();
		tools.putParamValue("ObjClass", 
		tools.getProperty("Top.pxObjClass").getStringValue()
		);
		String pageName ="D_DataType";
		if(pageName.indexOf(".")==0) {
		
	pageName = tools.getStepPage().getName()+pageName;
		}
		if(null!=tools.findPage(pageName) && tools.findPage(pageName).getClassName().equals("Code-Pega-List")) {
			cbpResults =  tools.getProperty(pageName+".pxResults");
		} else {
			cbpResults =  tools.getProperty(pageName);
			if(cbpResults == null || (cbpResults != null && cbpResults.size() <= 0)) {
				try{
					cbpResults =  tools.getProperty(pageName+".pxResults");
				}catch(Exception e){}
			}
		}
		tools.appendString("<div id='CT'  RCW = '.pxObjClass' RC = 'Top.pxObjClass Changes' CellId = '835");
		
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
		tools.appendString("' thread_name = '" + tools.getThread().getName());
		}
		tools.appendString("' >");
		try{
			if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
				com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				cellChangeTracker.trackValueChanges("Top.pxObjClass", -1);
			}
		}catch(Exception e){}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);		String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
		String displayString ="";
		String valueString ="";
		String selected ="";
		String groupbyString ="";
		boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
		if(!isAccessible) {
			tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
			tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		} else {
		tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
		}

		String dropdownName = "";		tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));		tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");		tools.appendString(" data-bindDefaultValue='STRING'");
} else{		tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;		tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");		tools.appendString(" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}		if(isAccessible) {
			tools.appendString(" value='");
			if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
				String pyValueProp = ".pyLabel";
				java.util.Iterator tempIter = cbpResults.iterator();
				strValue = ((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp);
				while(tempIter.hasNext()){
					if("".equals(((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp))){
					strValue = "";
					break;
				}
			}
			tempIter = null;
		}
		tools.appendString(strValue + "' /><select ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
		tools.appendString(styleAttribute + disabled_ctrl + " id='");
		tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
	tools.appendString("'");
	}
	tools.appendString(" style='width:100px' >");
	if (cbpResults != null && cbpResults.size() > 0) {
		int iListSize = cbpResults.size();
		java.util.Iterator resIter = cbpResults.iterator();
		while(resIter.hasNext()) {
			ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
			displayString = cbpRow.getStringIfPresent(".pyParametersParamType");
			valueString = cbpRow.getStringIfPresent(".pyLabel");
			if (null == displayString || null == valueString) {
				continue;
			}
			if ("".equals(displayString) && "".equals(valueString)) {
				String skipEmptyCaption = tools.getSystemSettings().getDynamic("Pega-UIEngine","skipEmptyCaption");
			if ("true".equals(skipEmptyCaption)) {
						continue;
				}
		}
		valueString = valueString.trim();
		displayString = tools.getLocalizedTextForString(".pyCaption",displayString ,StreamBuilder.FMT_LITERAL);
		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
		if("".equals(displayString))
			displayString = valueString ;
		selected = (valueString.equals(strValue)) ? "selected " : ""; 
		tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\"");
		String titleString = cbpRow.getString(".pyParametersParamType");
		titleString = tools.getLocalizedTextForString(".pyTooltip",titleString ,StreamBuilder.FMT_LITERAL);
	tools.appendString(" title='" + StringUtils.crossScriptingFilter(titleString) + "'>" + StringUtils.crossScriptingFilter(displayString) + "</option>");
	}
}
tools.appendString("</select >");
if(isAccessible) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
	drodownButtonIncludes_1();
}
tools.appendString("</div>");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_44")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_21() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyParametersParamType", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_6(".pyParametersParamType",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_6(".pyParametersParamType",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","834"};oCellRuntimeParamsMap.put("834||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("834||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","pzValidParameterPageName","Text","true","833"};oCellRuntimeParamsMap.put("833||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("833||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingHeaderCell_13() {
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
tools.appendString(" role='columnheader' aria-label='Required' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621075122415") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache4").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache4");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Required", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_12() {
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
tools.appendString(" role='columnheader' aria-label='Data type' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621074921316") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache3").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache3");} else { tools.appendString("20.19607843137255"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Data type", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_11() {
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
tools.appendString(" role='columnheader' aria-label='Description' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621074820899") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache2").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache2");} else { tools.appendString("39.6078431372549"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Description", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_10() {
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
tools.appendString(" role='columnheader' aria-label='Name' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621074719675") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache1").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache1");} else { tools.appendString("20.0"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Name", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzParametersAdvConfBBBB","",true);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzParametersAdvConfBBBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}

 public void pzHeaderBody_2(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Parameters");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel5392' data-layout-id='202602230421320415" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel5392'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzParametersAdvConfBBBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void 
gridBeginLayout_4() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyParametersL102=null;

 Map selUniqMap_pyParametersL102 = null;
tools.appendString("<div ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyParameters");tools.appendString("_pzParametersAdvConf_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault numberedgrid   ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' openOnDblClick='false' OAFunc='openRuleByKeys' ");
pyParameters_2();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='default'>");
}


public void gridCentreLayout_2() {/*gridCentreLayout*/
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
pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					tools.putSaveValue("bUseMenuInline","false");

					pzGridIncludes_1();

					if(tools.getParamValue("partialRefresh").equals("")){

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyParameters");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyParametersParamName .pyParametersParamDesc .pyParametersParamType   ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("' gPropIndex='PpyParameters1' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "Parameters";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyParameters1colWidthGBL\" id=\"PpyParameters1colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyParameters1colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyParameters1colWidthGBR\" id=\"PpyParameters1colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyParameters1colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyParameters1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='Parameters' PL_PROP='");

					
tools.appendString(".pyParameters");

					tools.appendString("' PL_PROP_CLASS='Embed-MethodParams' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' ><td class='cellCont rowHandleHead  ' style='height:50px;width:1%'>");

					if(pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>");

					 } 

					tools.appendString("<span></span></td>");

					 repeatingHeaderCell_10(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_11(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_12(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_13(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyParameters").iterator(); 

					
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

					
							  if(tools.getActive().indexOf()%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					 
								 if(!bGenerationForOffline) {

					tools.appendString(tools.getSaveValue("rowClass"));  

					}

					tools.appendString(" cellCont' ");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					tools.appendString(" ng-repeat=\"Item in rootData..pyParameters\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyParameters")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyParameters"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' ><td class='cellCont ");

					tools.appendString("rowHandle  ' style='height:55px;width:1%;'>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<DIV class='oflowDiv'");

					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					tools.appendString("style='height:55px;'");

					}

					tools.appendString(">");

					}

					tools.appendString("<div class=\"divCont\" ><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("</span></div></div>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("</DIV>");

					}

					tools.appendString("</td>");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_13(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_14(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_21(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_16(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", "");

					 
								 }

					
						 tools.putParamValue("expandRL","false");

					
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

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-MethodParams", "tempNoRespg");

					
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

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					
					 /* GenerateGrid: End */

					}

					public void LayoutWrapperTableEnd_2() {

					tools.appendString("</div>");

					}
public void pzLayout_3() {
String gridLayoutMethodName="pzLayout_3";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_2();
}
pzLayoutBodyWrapper_7();
 LayoutWrapperTableEnd_2(); tools.putParamValue("gridLayoutMethodName","");
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	sectionDefaultValues_1();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_39")) ){pzLayout_3();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
	sectionDefaultValues_1();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_39")) ){pzLayout_3();
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
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzParametersAdvConfBBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash38 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash38 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash38 != null && !"".equals(spxUniqueStreamHash38)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash38,pxUniqueStreamHash+"_38");
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
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash38 != null && !"".equals(spxUniqueStreamHash38)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_38");
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
	String paramName = "EXPANDEDSubSectionpzParametersAdvConfBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpzIsMappingModel", pxUniqueStreamHash+"_48");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_48");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_2();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_4() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpzIsMappingModel","pzIsMappingModel", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_8();
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
public void pzLayoutBodyWrapper_6() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_5() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_3();gridCentreLayout_1();layoutBody_1();
				gridEndLayout_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxAddListItem_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_34")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzParametersAdvConf_"+ referenceString+ "_811'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Add item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140924151621077041206") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconInsert' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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



public void layoutBody_1() { 
	tools.appendString("\n\t\t\t\t\t\t<div id='RULE_KEY' node_type = 'SECTION_BODY' body_type='DEFINE' body_index='3' class = 'gridActionBottom'>" + "<table role='presentation'   cellpadding='0' cellspacing='0' ID='' width='100%'>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("pxAddListItem",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(3).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead",pzSection.getValueStyle()), "width:100%;",false,"","");tools.putSaveValue("parentLayouttype","ACTION");pxAddListItem_1();
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>\n\n\t\t\t\t\t\t</div>");
 } 


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}


public void pxDeleteListItem_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_33")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzParametersAdvConf_"+ referenceString+ "_807'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140924151621076837255") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconDelete' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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

public void repeatingDataCell_20() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(9)")); tools.appendString("headers='a9'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_3();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","806"};oCellRuntimeParamsMap.put("806||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("806||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","804"};oCellRuntimeParamsMap.put("804||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("804||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}
public void 
pegaReferenceTag_5() {
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property ".pyParametersParamReq" at assembly time
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__3 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__3.setPageContext(pageContext);
_jspx_th_pega_reference__3.setParent(mParentTag);
_jspx_th_pega_reference__3.setName(".pyParametersParamReq");
_jspx_th_pega_reference__3.setMode("input");
_jspx_th_pega_reference__3.setFormat("pzPromptSelectParamReq");
int _jspx_eval_pega_reference__3 = _jspx_th_pega_reference__3.doStartTag();
if (_jspx_eval_pega_reference__3 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_3 = mParentTag;
mParentTag = _jspx_th_pega_reference__3;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_3;
		int evalDoAfterBody = _jspx_th_pega_reference__3.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__3);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_19() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_2();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzPromptSelectParamReq",".pyParametersParamReq", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_5();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_5();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDropdown_5(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_28")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_29")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_30")){String ddPropRef = tools.getActive().getReference();
String ddPropEntryHandle = tools.getActive().getEntryHandle();
String disabled_ctrl = "";
		String strPropName= tools.getActive().getName();
		String styleAttribute = "";
		styleAttribute = "standard";
				if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		styleAttribute += " ErrorShade";
				}
		if(!"".equals(styleAttribute)){
		styleAttribute = "class='"+styleAttribute+"'";
		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		ClipboardPage cbpRes=null;
		ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_31");}if(beginNonTemplate){		HashStringMap params = new HashStringMap();
		tools.putParamValue("ObjClass", 
		tools.getProperty("Top.pxObjClass").getStringValue()
		);
		String pageName ="D_DataType";
		if(pageName.indexOf(".")==0) {
		
	pageName = tools.getStepPage().getName()+pageName;
		}
		if(null!=tools.findPage(pageName) && tools.findPage(pageName).getClassName().equals("Code-Pega-List")) {
			cbpResults =  tools.getProperty(pageName+".pxResults");
		} else {
			cbpResults =  tools.getProperty(pageName);
			if(cbpResults == null || (cbpResults != null && cbpResults.size() <= 0)) {
				try{
					cbpResults =  tools.getProperty(pageName+".pxResults");
				}catch(Exception e){}
			}
		}
		tools.appendString("<div id='CT'  RCW = '.pxObjClass' RC = 'Top.pxObjClass Changes' CellId = '801");
		
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
		tools.appendString("' thread_name = '" + tools.getThread().getName());
		}
		tools.appendString("' >");
		try{
			if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
				com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				cellChangeTracker.trackValueChanges("Top.pxObjClass", -1);
			}
		}catch(Exception e){}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);		String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
		String displayString ="";
		String valueString ="";
		String selected ="";
		String groupbyString ="";
		boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
		if(!isAccessible) {
			tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
			tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		} else {
		tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
		}

		String dropdownName = "";		tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));		tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");		tools.appendString(" data-bindDefaultValue='STRING'");
} else{		tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;		tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");		tools.appendString(" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}		if(isAccessible) {
			tools.appendString(" value='");
			if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
				String pyValueProp = ".pyLabel";
				java.util.Iterator tempIter = cbpResults.iterator();
				strValue = ((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp);
				while(tempIter.hasNext()){
					if("".equals(((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp))){
					strValue = "";
					break;
				}
			}
			tempIter = null;
		}
		tools.appendString(strValue + "' /><select ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
		tools.appendString(styleAttribute + disabled_ctrl + " id='");
		tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
	tools.appendString("'");
	}
	tools.appendString(" style='width:100px' >");
	if (cbpResults != null && cbpResults.size() > 0) {
		int iListSize = cbpResults.size();
		java.util.Iterator resIter = cbpResults.iterator();
		while(resIter.hasNext()) {
			ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
			displayString = cbpRow.getStringIfPresent(".pyParametersParamType");
			valueString = cbpRow.getStringIfPresent(".pyLabel");
			if (null == displayString || null == valueString) {
				continue;
			}
			if ("".equals(displayString) && "".equals(valueString)) {
				String skipEmptyCaption = tools.getSystemSettings().getDynamic("Pega-UIEngine","skipEmptyCaption");
			if ("true".equals(skipEmptyCaption)) {
						continue;
				}
		}
		valueString = valueString.trim();
		displayString = tools.getLocalizedTextForString(".pyCaption",displayString ,StreamBuilder.FMT_LITERAL);
		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
		if("".equals(displayString))
			displayString = valueString ;
		selected = (valueString.equals(strValue)) ? "selected " : ""; 
		tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\"");
		String titleString = cbpRow.getString(".pyParametersParamType");
		titleString = tools.getLocalizedTextForString(".pyTooltip",titleString ,StreamBuilder.FMT_LITERAL);
	tools.appendString(" title='" + StringUtils.crossScriptingFilter(titleString) + "'>" + StringUtils.crossScriptingFilter(displayString) + "</option>");
	}
}
tools.appendString("</select >");
if(isAccessible) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
	drodownButtonIncludes_1();
}
tools.appendString("</div>");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_32")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_18() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyParametersParamType", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_5(".pyParametersParamType",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_5(".pyParametersParamType",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","800"};oCellRuntimeParamsMap.put("800||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("800||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","pzValidParameterPageName","Text","true","799"};oCellRuntimeParamsMap.put("799||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("799||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingHeaderCell_9() {
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
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621075727641") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(9)")); tools.appendString(" id='a9' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache9").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache9");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("&nbsp;");if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_8() {
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
tools.appendString(" role='columnheader' aria-label='Validate as' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621075626878") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(8)")); tools.appendString(" id='a8' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache8").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache8");} else { tools.appendString("11.233480176211454"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Validate as", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_7() {
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
tools.appendString(" role='columnheader' aria-label='Smartprompt type' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621075425712") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(7)")); tools.appendString(" id='a7' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache7").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache7");} else { tools.appendString("13.876651982378855"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Smartprompt type", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_6() {
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
tools.appendString(" role='columnheader' aria-label='Default value' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621075324484") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(6)")); tools.appendString(" id='a6' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache6").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache6");} else { tools.appendString("11.233480176211454"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Default value", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
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
tools.appendString(" role='columnheader' aria-label='In/Out' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621075223227") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(5)")); tools.appendString(" id='a5' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache5").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache5");} else { tools.appendString("6.497797356828194"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "In/Out", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Required' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621075122415") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(4)")); tools.appendString(" id='a4' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache4").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache4");} else { tools.appendString("7.158590308370044"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Required", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_3() {
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
tools.appendString(" role='columnheader' aria-label='Data type' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621074921316") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache3").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache3");} else { tools.appendString("11.343612334801762"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Data type", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
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
tools.appendString(" role='columnheader' aria-label='Description' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621074820899") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache2").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache2");} else { tools.appendString("22.24669603524229"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Description", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_1() {
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
tools.appendString(" role='columnheader' aria-label='Name' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621074719675") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyParameters1colWidthCache1").equals("")) { tools.appendParamCSF("PpyParameters1colWidthCache1");} else { tools.appendString("11.233480176211454"); }tools.appendString("%;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:48px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Name", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzParametersAdvConfBB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzParametersAdvConfBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Parameters");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel8613' data-layout-id='202602230421320342" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel8613'>" + l_sectionTitle + "</h2><nobr>");
inclAction_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzParametersAdvConfBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void 
gridBeginLayout_3() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyParametersL97=null;

 Map selUniqMap_pyParametersL97 = null;
tools.appendString("<div ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyParameters");tools.appendString("_pzParametersAdvConf_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault numberedgrid   draggablegrid ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546") + " ");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readWrite' editFormat='' template-name='' bGrid='true' bDragDrop='true' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyParameters_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='default'>");
}


public void gridCentreLayout_1() {/*gridCentreLayout*/
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
pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					tools.putSaveValue("bUseMenuInline","false");

					pzGridIncludes_1();

					if(tools.getParamValue("partialRefresh").equals("")){

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyParameters");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyParametersParamName .pyParametersParamDesc .pyParametersParamType .pyParametersParamReq .pyParametersParamInOut .pyParametersParamDefaultValue .pyParametersParamIntelliRule .pyParametersParamIntelliValidateAs .pyTemplateInputBox  ' class='yui-skin-sam gPercent");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					}tools.appendString("' style='");

					tools.appendString("' gPropIndex='PpyParameters1' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-layout") + " ");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "Parameters";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyParameters1colWidthGBL\" id=\"PpyParameters1colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyParameters1colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyParameters1colWidthGBR\" id=\"PpyParameters1colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyParameters1colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyParameters1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='Parameters' PL_PROP='");

					
tools.appendString(".pyParameters");

					tools.appendString("' PL_PROP_CLASS='Embed-MethodParams' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' ><td class='cellCont rowHandleHead  ' style='height:50px;width:1%'>");

					if(pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>");

					 } 

					tools.appendString("<span></span></td>");

					 repeatingHeaderCell_1(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_4(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_5(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_6(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_7(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_8(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_9(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyParameters").iterator(); 

					
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

					
							  if(tools.getActive().indexOf()%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					 
								 if(!bGenerationForOffline) {

					tools.appendString(tools.getSaveValue("rowClass"));  

					}

					tools.appendString(" cellCont' ");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					tools.appendString(" ng-repeat=\"Item in rootData..pyParameters\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					 
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

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyParameters")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyParameters"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' ><td class='cellCont ");

					tools.appendString("draggableCell ");tools.appendString("rowHandle  ' style='height:55px;width:1%;'>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<DIV class='oflowDiv'");

					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					tools.appendString("style='height:55px;'");

					}

					tools.appendString(">");

					}

					tools.appendString("<div class=\"divCont\" style=\"width:23px;\"><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("</span></div></div>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("</DIV>");

					}

					tools.appendString("</td>");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_2(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_18(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_19(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_5(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_6(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_7(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_8(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_20(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", "");

					 
								 }

					
						 tools.putParamValue("expandRL","false");

					
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

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"10\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-MethodParams", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					gridNoRowsMesgIncl_1(); 

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
 tempNoRespg.removeFromClipboard();

					tools.appendString("\n </td></tr>");

					 } } }   

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && tools.getParamValue("partialRefresh").equals("false")) {

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
tools.appendString("</div>");
}
public void pzLayout_1() {
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_5();
 LayoutWrapperTableEnd_1(); tools.putParamValue("gridLayoutMethodName","");
}
public void 
sectionDefaultValues_1() {
	boolean isInputEnabled=true;
	if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	isInputEnabled=tools.hasInputEnabled();
	}if(isInputEnabled){
	ClipboardPage myStepPage = tools.getPrimaryPage();
	repeatLayoutDefaultValues_1(".pyParameters",true,false);
	tools.getInfEngUtils().forwardChain(tools);
	}}
public void repeatLayoutDefaultValues_1(String strPageListProperty, boolean isRepeatingLayout,boolean bIsVLOrVG){
	ClipboardPage myStepPage = tools.getPrimaryPage();
	Iterator itr_1 = tools.getStepPage().getProperty(".pyParameters").iterator(); while(itr_1.hasNext()){ ClipboardProperty cp_eachProp_1 = (ClipboardProperty)itr_1.next();if(!bIsVLOrVG){
		 ClipboardPage pg_eachProp_1 = cp_eachProp_1.getPageValue(); PRStackFrame frame_1 = pega.pushStackFrame("RepeatValues", null, pg_eachProp_1, false, false);tools.putActive(cp_eachProp_1);if(pzAuto.handleEvaluateWhen(" o2== rx.pyParametersParamType cq",".pyParametersParamType", "cell", "active" )) {
		 tools.getProperty(".pyParametersParamType").setValue("STRING");if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){String tempDefault=tools.getProperty(".pyParametersParamType").toString();
		 tools.getProperty(".pyParametersParamType").setValue("");pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDefaultValue(".pyParametersParamType",tempDefault);}
}pega.popStackFrame(frame_1, false);}else{
		if(pzAuto.handleEvaluateWhen(" o2== rx.pyParametersParamType cq",".pyParametersParamType", "cell", "active" )) {
		 tools.getProperty(".pyParametersParamType").setValue("STRING");if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){String tempDefault=tools.getProperty(".pyParametersParamType").toString();
		 tools.getProperty(".pyParametersParamType").setValue("");pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDefaultValue(".pyParametersParamType",tempDefault);}
}}
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
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	sectionDefaultValues_1();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")) ){pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
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
	sectionDefaultValues_1();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")) ){pzLayout_1();
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
pzSection.getLayout().setExpandParam("SubSectionpzParametersAdvConfB","",false);
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-default content-default " + "'  ");
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
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
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
	String paramName = "EXPANDEDSubSectionpzParametersAdvConfB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxpzIsMappingModel", pxUniqueStreamHash+"_37");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_37");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_1();
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
if(pzAuto.handleEvaluateWhen(" o1! wxpzIsMappingModel","!pzIsMappingModel", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_6();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_4() {

if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_25")){pzLayoutBodyWrapper_3();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_3() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridDoPartialRefresh_2();gridLastRow_2();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxDropdown_4(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_22")){String ddPropRef = tools.getActive().getReference();
String ddPropEntryHandle = tools.getActive().getEntryHandle();
String disabled_ctrl = "";
		String strPropName= tools.getActive().getName();
		String styleAttribute = "";
		styleAttribute = "standard";
				if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		styleAttribute += " ErrorShade";
				}
		if(!"".equals(styleAttribute)){
		styleAttribute = "class='"+styleAttribute+"'";
		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		ClipboardPage cbpRes=null;
		ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_23");}if(beginNonTemplate){		HashStringMap params = new HashStringMap();
		tools.putParamValue("ObjClass", 
		tools.getProperty("Top.pxObjClass").getStringValue()
		);
		String pageName ="D_DataType";
		if(pageName.indexOf(".")==0) {
		
	pageName = tools.getStepPage().getName()+pageName;
		}
		if(null!=tools.findPage(pageName) && tools.findPage(pageName).getClassName().equals("Code-Pega-List")) {
			cbpResults =  tools.getProperty(pageName+".pxResults");
		} else {
			cbpResults =  tools.getProperty(pageName);
			if(cbpResults == null || (cbpResults != null && cbpResults.size() <= 0)) {
				try{
					cbpResults =  tools.getProperty(pageName+".pxResults");
				}catch(Exception e){}
			}
		}
		tools.appendString("<div id='CT'  RCW = '.pxObjClass' RC = 'Top.pxObjClass Changes' CellId = '835");
		
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
		tools.appendString("' thread_name = '" + tools.getThread().getName());
		}
		tools.appendString("' >");
		try{
			if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
				com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				cellChangeTracker.trackValueChanges("Top.pxObjClass", -1);
			}
		}catch(Exception e){}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);		String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
		String displayString ="";
		String valueString ="";
		String selected ="";
		String groupbyString ="";
		boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
		if(!isAccessible) {
			tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
			tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		} else {
		tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
		}

		String dropdownName = "";		tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));		tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");		tools.appendString(" data-bindDefaultValue='STRING'");
} else{		tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;		tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");		tools.appendString(" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}		if(isAccessible) {
			tools.appendString(" value='");
			if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
				String pyValueProp = ".pyLabel";
				java.util.Iterator tempIter = cbpResults.iterator();
				strValue = ((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp);
				while(tempIter.hasNext()){
					if("".equals(((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp))){
					strValue = "";
					break;
				}
			}
			tempIter = null;
		}
		tools.appendString(strValue + "' /><select ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
		tools.appendString(styleAttribute + disabled_ctrl + " id='");
		tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
	tools.appendString("'");
	}
	tools.appendString(" style='width:100px' >");
	if (cbpResults != null && cbpResults.size() > 0) {
		int iListSize = cbpResults.size();
		java.util.Iterator resIter = cbpResults.iterator();
		while(resIter.hasNext()) {
			ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
			displayString = cbpRow.getStringIfPresent(".pyParametersParamType");
			valueString = cbpRow.getStringIfPresent(".pyLabel");
			if (null == displayString || null == valueString) {
				continue;
			}
			if ("".equals(displayString) && "".equals(valueString)) {
				String skipEmptyCaption = tools.getSystemSettings().getDynamic("Pega-UIEngine","skipEmptyCaption");
			if ("true".equals(skipEmptyCaption)) {
						continue;
				}
		}
		valueString = valueString.trim();
		displayString = tools.getLocalizedTextForString(".pyCaption",displayString ,StreamBuilder.FMT_LITERAL);
		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
		if("".equals(displayString))
			displayString = valueString ;
		selected = (valueString.equals(strValue)) ? "selected " : ""; 
		tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\"");
		String titleString = cbpRow.getString(".pyParametersParamType");
		titleString = tools.getLocalizedTextForString(".pyTooltip",titleString ,StreamBuilder.FMT_LITERAL);
	tools.appendString(" title='" + StringUtils.crossScriptingFilter(titleString) + "'>" + StringUtils.crossScriptingFilter(displayString) + "</option>");
	}
}
tools.appendString("</select >");
if(isAccessible) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
	drodownButtonIncludes_1();
}
tools.appendString("</div>");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_17() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyParametersParamType", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_4(".pyParametersParamType",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_4(".pyParametersParamType",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","834"};oCellRuntimeParamsMap.put("834||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("834||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","pzValidParameterPageName","Text","true","833"};oCellRuntimeParamsMap.put("833||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("833||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}


public void pzParametersParamReqText_1() {
pzAuto.emitIncludeStreamReference("pzParametersParamReqText", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_16() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzParametersParamReqText", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString(" headers='a4' class='");
	tools.appendString(" gridCell");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzParametersParamReqText_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void pxDropdown_3(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){String ddPropRef = tools.getActive().getReference();
String ddPropEntryHandle = tools.getActive().getEntryHandle();
String disabled_ctrl = "";
		String strPropName= tools.getActive().getName();
		String styleAttribute = "";
		styleAttribute = "standard";
				if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		styleAttribute += " ErrorShade";
				}
		if(!"".equals(styleAttribute)){
		styleAttribute = "class='"+styleAttribute+"'";
		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		ClipboardPage cbpRes=null;
		ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18");}if(beginNonTemplate){		HashStringMap params = new HashStringMap();
		tools.putParamValue("ObjClass", 
		tools.getProperty("Top.pxObjClass").getStringValue()
		);
		String pageName ="D_DataType";
		if(pageName.indexOf(".")==0) {
		
	pageName = tools.getStepPage().getName()+pageName;
		}
		if(null!=tools.findPage(pageName) && tools.findPage(pageName).getClassName().equals("Code-Pega-List")) {
			cbpResults =  tools.getProperty(pageName+".pxResults");
		} else {
			cbpResults =  tools.getProperty(pageName);
			if(cbpResults == null || (cbpResults != null && cbpResults.size() <= 0)) {
				try{
					cbpResults =  tools.getProperty(pageName+".pxResults");
				}catch(Exception e){}
			}
		}
		tools.appendString("<div id='CT'  RCW = '.pxObjClass' RC = 'Top.pxObjClass Changes' CellId = '835");
		
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
		tools.appendString("' thread_name = '" + tools.getThread().getName());
		}
		tools.appendString("' >");
		try{
			if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
				com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				cellChangeTracker.trackValueChanges("Top.pxObjClass", -1);
			}
		}catch(Exception e){}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);		String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
		String displayString ="";
		String valueString ="";
		String selected ="";
		String groupbyString ="";
		boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
		if(!isAccessible) {
			tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
			tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		} else {
		tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
		}

		String dropdownName = "";		tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));		tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");		tools.appendString(" data-bindDefaultValue='STRING'");
} else{		tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;		tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");		tools.appendString(" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}		if(isAccessible) {
			tools.appendString(" value='");
			if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
				String pyValueProp = ".pyLabel";
				java.util.Iterator tempIter = cbpResults.iterator();
				strValue = ((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp);
				while(tempIter.hasNext()){
					if("".equals(((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp))){
					strValue = "";
					break;
				}
			}
			tempIter = null;
		}
		tools.appendString(strValue + "' /><select ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
		tools.appendString(styleAttribute + disabled_ctrl + " id='");
		tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
	tools.appendString("'");
	}
	tools.appendString(" style='width:100px' >");
	if (cbpResults != null && cbpResults.size() > 0) {
		int iListSize = cbpResults.size();
		java.util.Iterator resIter = cbpResults.iterator();
		while(resIter.hasNext()) {
			ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
			displayString = cbpRow.getStringIfPresent(".pyParametersParamType");
			valueString = cbpRow.getStringIfPresent(".pyLabel");
			if (null == displayString || null == valueString) {
				continue;
			}
			if ("".equals(displayString) && "".equals(valueString)) {
				String skipEmptyCaption = tools.getSystemSettings().getDynamic("Pega-UIEngine","skipEmptyCaption");
			if ("true".equals(skipEmptyCaption)) {
						continue;
				}
		}
		valueString = valueString.trim();
		displayString = tools.getLocalizedTextForString(".pyCaption",displayString ,StreamBuilder.FMT_LITERAL);
		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
		if("".equals(displayString))
			displayString = valueString ;
		selected = (valueString.equals(strValue)) ? "selected " : ""; 
		tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\"");
		String titleString = cbpRow.getString(".pyParametersParamType");
		titleString = tools.getLocalizedTextForString(".pyTooltip",titleString ,StreamBuilder.FMT_LITERAL);
	tools.appendString(" title='" + StringUtils.crossScriptingFilter(titleString) + "'>" + StringUtils.crossScriptingFilter(displayString) + "</option>");
	}
}
tools.appendString("</select >");
if(isAccessible) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
	drodownButtonIncludes_1();
}
tools.appendString("</div>");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyParametersParamType", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_3(".pyParametersParamType",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_3(".pyParametersParamType",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxTextInput_6() {String key="834||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","834"};oCellRuntimeParamsMap.put("834||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("834||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
public void repeatingDataCell_14() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyParametersParamDesc", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxTextInput_6();
									tools.appendString("</DIV>"); } else { pxTextInput_6();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxTextInput_5() {String key="833||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","pzValidParameterPageName","Text","true","833"};oCellRuntimeParamsMap.put("833||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("833||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingDataCell_13() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyParametersParamName", ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_5();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_5();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pyParameters_2() {
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

public void pzLayoutBodyWrapper_2() {

if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxDeleteListItem_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_13")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzParametersAdvConf_"+ referenceString+ "_807'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140924151621076837255") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconDelete' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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

public void repeatingDataCell_12() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(9)")); tools.appendString("headers='a9'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_2();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","806"};oCellRuntimeParamsMap.put("806||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("806||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","804"};oCellRuntimeParamsMap.put("804||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("804||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}
public void 
pegaReferenceTag_4() {
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property ".pyParametersParamReq" at assembly time
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__2 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__2.setPageContext(pageContext);
_jspx_th_pega_reference__2.setParent(mParentTag);
_jspx_th_pega_reference__2.setName(".pyParametersParamReq");
_jspx_th_pega_reference__2.setMode("input");
_jspx_th_pega_reference__2.setFormat("pzPromptSelectParamReq");
int _jspx_eval_pega_reference__2 = _jspx_th_pega_reference__2.doStartTag();
if (_jspx_eval_pega_reference__2 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_2 = mParentTag;
mParentTag = _jspx_th_pega_reference__2;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_2;
		int evalDoAfterBody = _jspx_th_pega_reference__2.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__2);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_11() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_2();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzPromptSelectParamReq",".pyParametersParamReq", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");
				pegaReferenceTag_4();
				getInlineStyle_1();
									tools.appendString("</DIV>"); } else { 
				pegaReferenceTag_4();
				getInlineStyle_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxDropdown_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
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
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){String ddPropRef = tools.getActive().getReference();
String ddPropEntryHandle = tools.getActive().getEntryHandle();
String disabled_ctrl = "";
		String strPropName= tools.getActive().getName();
		String styleAttribute = "";
		styleAttribute = "standard";
				if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		styleAttribute += " ErrorShade";
				}
		if(!"".equals(styleAttribute)){
		styleAttribute = "class='"+styleAttribute+"'";
		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		ClipboardPage cbpRes=null;
		ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_11");}if(beginNonTemplate){		HashStringMap params = new HashStringMap();
		tools.putParamValue("ObjClass", 
		tools.getProperty("Top.pxObjClass").getStringValue()
		);
		String pageName ="D_DataType";
		if(pageName.indexOf(".")==0) {
		
	pageName = tools.getStepPage().getName()+pageName;
		}
		if(null!=tools.findPage(pageName) && tools.findPage(pageName).getClassName().equals("Code-Pega-List")) {
			cbpResults =  tools.getProperty(pageName+".pxResults");
		} else {
			cbpResults =  tools.getProperty(pageName);
			if(cbpResults == null || (cbpResults != null && cbpResults.size() <= 0)) {
				try{
					cbpResults =  tools.getProperty(pageName+".pxResults");
				}catch(Exception e){}
			}
		}
		tools.appendString("<div id='CT'  RCW = '.pxObjClass' RC = 'Top.pxObjClass Changes' CellId = '801");
		
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
		tools.appendString("' thread_name = '" + tools.getThread().getName());
		}
		tools.appendString("' >");
		try{
			if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
				com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				cellChangeTracker.trackValueChanges("Top.pxObjClass", -1);
			}
		}catch(Exception e){}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);		String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
		String displayString ="";
		String valueString ="";
		String selected ="";
		String groupbyString ="";
		boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
		if(!isAccessible) {
			tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
			tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		} else {
		tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
		}

		String dropdownName = "";		tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));		tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");		tools.appendString(" data-bindDefaultValue='STRING'");
} else{		tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;		tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");		tools.appendString(" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}		if(isAccessible) {
			tools.appendString(" value='");
			if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
				String pyValueProp = ".pyLabel";
				java.util.Iterator tempIter = cbpResults.iterator();
				strValue = ((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp);
				while(tempIter.hasNext()){
					if("".equals(((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp))){
					strValue = "";
					break;
				}
			}
			tempIter = null;
		}
		tools.appendString(strValue + "' /><select ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
		tools.appendString(styleAttribute + disabled_ctrl + " id='");
		tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
	tools.appendString("'");
	}
	tools.appendString(" style='width:100px' >");
	if (cbpResults != null && cbpResults.size() > 0) {
		int iListSize = cbpResults.size();
		java.util.Iterator resIter = cbpResults.iterator();
		while(resIter.hasNext()) {
			ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
			displayString = cbpRow.getStringIfPresent(".pyParametersParamType");
			valueString = cbpRow.getStringIfPresent(".pyLabel");
			if (null == displayString || null == valueString) {
				continue;
			}
			if ("".equals(displayString) && "".equals(valueString)) {
				String skipEmptyCaption = tools.getSystemSettings().getDynamic("Pega-UIEngine","skipEmptyCaption");
			if ("true".equals(skipEmptyCaption)) {
						continue;
				}
		}
		valueString = valueString.trim();
		displayString = tools.getLocalizedTextForString(".pyCaption",displayString ,StreamBuilder.FMT_LITERAL);
		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
		if("".equals(displayString))
			displayString = valueString ;
		selected = (valueString.equals(strValue)) ? "selected " : ""; 
		tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\"");
		String titleString = cbpRow.getString(".pyParametersParamType");
		titleString = tools.getLocalizedTextForString(".pyTooltip",titleString ,StreamBuilder.FMT_LITERAL);
	tools.appendString(" title='" + StringUtils.crossScriptingFilter(titleString) + "'>" + StringUtils.crossScriptingFilter(displayString) + "</option>");
	}
}
tools.appendString("</select >");
if(isAccessible) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
	drodownButtonIncludes_1();
}
tools.appendString("</div>");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_10() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyParametersParamType", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_2(".pyParametersParamType",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_2(".pyParametersParamType",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","800"};oCellRuntimeParamsMap.put("800||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("800||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","pzValidParameterPageName","Text","true","799"};oCellRuntimeParamsMap.put("799||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("799||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}


public void pxDeleteListItem_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzParametersAdvConf_"+ referenceString+ "_807'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140924151621076837255") + "  href='"+hrefValue+"' ");
		tools.appendString("onclick='pd(event);' ");
		tools.appendString("data-ctl='Icon'"); tools.appendString(" class='");
		tools.appendString("iconDelete' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(9)")); tools.appendString("headers='a9'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_1();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxTextInput_4() {String key="806||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","806"};oCellRuntimeParamsMap.put("806||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("806||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)");}
public void repeatingDataCell_8() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyParametersParamIntelliValidateAs", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(8)")); tools.appendString("headers='a8'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxTextInput_4();
									tools.appendString("</DIV>"); } else { pxTextInput_4();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__1(PageContext aPageContext, java.lang.String aName, java.lang.String aValue) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setValue(aValue);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
_jspx_th_pega_reference_.setFormat(aFormat);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_eval_pega_reference_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_reference_;
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Class")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "OpenRuleTooltip", "Open")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "100%")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "true")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_reference_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
public void 
pegaReferenceTag_3() {
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property ".pyParametersParamIntelliRule" at assembly time
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyParametersParamIntelliRule", "input", "OpenRule")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public String 
getActionsForCustomControls_3() {
	boolean directStream = ((PegaStreamAPI)tools).isDirectStreaming();
	if(directStream) {
		((PegaStreamAPI)tools).disableDirectStreaming();
	}
	String currentStream = tools.getCurrentStream();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = tools.getCurrentStream();
	tools.appendString(currentStream);
	if(directStream) {
		((PegaStreamAPI)tools).forceDirectStreaming();
	}
	returnString = " data-ctl='non-auto' "+returnString;
	return returnString;
}
public void repeatingDataCell_7() {
	String mode1 = getActionsForCustomControls_3();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_2();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("OpenRule",".pyParametersParamIntelliRule", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(7)")); tools.appendString("headers='a7'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
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


public void pxTextInput_3() {String key="804||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","804"};oCellRuntimeParamsMap.put("804||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("804||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)");}
public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyParametersParamDefaultValue", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(6)")); tools.appendString("headers='a6'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxTextInput_3();
									tools.appendString("</DIV>"); } else { pxTextInput_3();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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
public void 
pegaReferenceTag_2() {
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyParametersParamInOut", "input")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_5() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_2();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("",".pyParametersParamInOut", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(5)")); tools.appendString("headers='a5'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
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
public void 
pegaReferenceTag_1() {
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property ".pyParametersParamReq" at assembly time
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName(".pyParametersParamReq");
_jspx_th_pega_reference__1.setMode("input");
_jspx_th_pega_reference__1.setFormat("pzPromptSelectParamReq");
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
}
public String 
getActionsForCustomControls_2() {
	boolean directStream = ((PegaStreamAPI)tools).isDirectStreaming();
	if(directStream) {
		((PegaStreamAPI)tools).disableDirectStreaming();
	}
	String currentStream = tools.getCurrentStream();
	String returnString = tools.getCurrentStream();
	tools.appendString(currentStream);
	if(directStream) {
		((PegaStreamAPI)tools).forceDirectStreaming();
	}
	returnString = " data-ctl='non-auto' "+returnString;
	return returnString;
}
public String 
getActionsForCustomControls_1() {
	boolean directStream = ((PegaStreamAPI)tools).isDirectStreaming();
	if(directStream) {
		((PegaStreamAPI)tools).disableDirectStreaming();
	}
	String currentStream = tools.getCurrentStream();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = tools.getCurrentStream();
	tools.appendString(currentStream);
	if(directStream) {
		((PegaStreamAPI)tools).forceDirectStreaming();
	}
	returnString = " data-ctl='non-auto' "+returnString;
	return returnString;
}
public void repeatingDataCell_4() {
	String mode1 = getActionsForCustomControls_1();
	tools.putSaveValue("mode1Action",mode1);
	String mode2 = getActionsForCustomControls_2();
	tools.putSaveValue("mode2Action",mode2);
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pzPromptSelectParamReq",".pyParametersParamReq", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(4)")); tools.appendString("headers='a4'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
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
public void inclFormattedVal_2(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam , String displayTextParamName) {if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", isSecuredProp);tools.putParamValue("proSecurity_activePropValue", activePropValue);}
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_DataType","","","D_DataType:ObjClass$Top.pxObjClass",".pyParametersParamType",".pyLabel",true,(PegaStreamAPI)tools),false,"","",true,"caption"));
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_DataType","","","D_DataType:ObjClass$Top.pxObjClass",".pyParametersParamType",".pyLabel",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals(pega_uiengine_pzcontrol.pzGetCaptionValue("datapage","null","D_DataType","","","D_DataType:ObjClass$Top.pxObjClass",".pyParametersParamType",".pyLabel",true,(PegaStreamAPI)tools)) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}if (isSecuredProp) { tools.putParamValue("proSecurity_isSecuredProp", "");tools.putParamValue("proSecurity_activePropValue", "");}
}


public void drodownButtonIncludes_1() {
if (pzAuto.doOnlyOnce("pzDropdown")) {
pzAuto.emitIncludeStreamReference("pzDropdownButtonIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public void inclFormattedVal_1(boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {
		pega.checkIfActivePropertyMissing();
		tools.appendString(pega_uiengine_formatter.pxFormatText((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools)),false,"","",true,"caption"));
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools))) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetCaptionValue("","","","","","","","",true,(PegaStreamAPI)tools))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
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


public void pxDropdown_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
inclCalVal_1("pxDropdown","NF","leftJustifyStyle");inclAction_1();
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
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){String ddPropRef = tools.getActive().getReference();
String ddPropEntryHandle = tools.getActive().getEntryHandle();
String disabled_ctrl = "";
		String strPropName= tools.getActive().getName();
		String styleAttribute = "";
		styleAttribute = "standard";
				if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
		styleAttribute += " ErrorShade";
				}
		if(!"".equals(styleAttribute)){
		styleAttribute = "class='"+styleAttribute+"'";
		}
		pega_uiengine_pzcontrol.pzAddMessages(tools,"");
		ClipboardPage cbpRes=null;
		ClipboardProperty cbpResults=null;
boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();boolean beginNonTemplate = true;if(bOptimizedMarkup){beginNonTemplate = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5");}if(beginNonTemplate){		HashStringMap params = new HashStringMap();
		tools.putParamValue("ObjClass", 
		tools.getProperty("Top.pxObjClass").getStringValue()
		);
		String pageName ="D_DataType";
		if(pageName.indexOf(".")==0) {
		
	pageName = tools.getStepPage().getName()+pageName;
		}
		if(null!=tools.findPage(pageName) && tools.findPage(pageName).getClassName().equals("Code-Pega-List")) {
			cbpResults =  tools.getProperty(pageName+".pxResults");
		} else {
			cbpResults =  tools.getProperty(pageName);
			if(cbpResults == null || (cbpResults != null && cbpResults.size() <= 0)) {
				try{
					cbpResults =  tools.getProperty(pageName+".pxResults");
				}catch(Exception e){}
			}
		}
		tools.appendString("<div id='CT'  RCW = '.pxObjClass' RC = 'Top.pxObjClass Changes' CellId = '801");
		
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
		tools.appendString("' thread_name = '" + tools.getThread().getName());
		}
		tools.appendString("' >");
		try{
			if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
				com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				cellChangeTracker.trackValueChanges("Top.pxObjClass", -1);
			}
		}catch(Exception e){}

		String strActiveValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);		String strValue = isSecuredProp ? activePropValue : tools.getProperty(ddPropRef).getStringValue();
		String displayString ="";
		String valueString ="";
		String selected ="";
		String groupbyString ="";
		boolean isAccessible = true && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"pyUseAccessibleDropdown",null,false);
		if(!isAccessible) {
			tools.appendString("<select data-ctl='[\"Dropdown\"]' ");
			tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
			tools.appendString(styleAttribute + disabled_ctrl + " id='");
			tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
		tools.appendString("'");
		} else {
		tools.appendString("<input type='hidden' data-ctl='[\"Dropdown\"]'" + disabled_ctrl);
		}

		String dropdownName = "";		tools.appendString(" name='");
if(bOptimizedMarkup){
		tools.appendCSF(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));
		dropdownName=StringUtils.crossScriptingFilter(pzAuto.getUIComponentRuntime().changeTrackProperty(ddPropEntryHandle,"entryHandle"));		tools.appendString("' ");
tools.appendString(" data-bindprops='value' ");		tools.appendString(" data-bindDefaultValue='STRING'");
} else{		tools.appendString(ddPropEntryHandle);

		dropdownName=ddPropEntryHandle;		tools.appendString("' ");
}
		tools.appendString("aria-describedby='"+dropdownName+"Error'");		tools.appendString(" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
		tools.appendString(" ");

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"parametersTabClickCallback(\\\"Object\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}		if(isAccessible) {
			tools.appendString(" value='");
			if("".equals(strValue) && cbpResults != null && cbpResults.size() > 0) {
				String pyValueProp = ".pyLabel";
				java.util.Iterator tempIter = cbpResults.iterator();
				strValue = ((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp);
				while(tempIter.hasNext()){
					if("".equals(((ClipboardProperty)tempIter.next()).getPageValue().getString(pyValueProp))){
					strValue = "";
					break;
				}
			}
			tempIter = null;
		}
		tools.appendString(strValue + "' /><select ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");
		tools.appendString(styleAttribute + disabled_ctrl + " id='");
		tools.appendString(tools.getHTMLIDForProperty(true,"dropdown"));
	tools.appendString("'");
	}
	tools.appendString(" style='width:100px' >");
	if (cbpResults != null && cbpResults.size() > 0) {
		int iListSize = cbpResults.size();
		java.util.Iterator resIter = cbpResults.iterator();
		while(resIter.hasNext()) {
			ClipboardPage cbpRow = ((ClipboardProperty)resIter.next()).getPageValue();
			displayString = cbpRow.getStringIfPresent(".pyParametersParamType");
			valueString = cbpRow.getStringIfPresent(".pyLabel");
			if (null == displayString || null == valueString) {
				continue;
			}
			if ("".equals(displayString) && "".equals(valueString)) {
				String skipEmptyCaption = tools.getSystemSettings().getDynamic("Pega-UIEngine","skipEmptyCaption");
			if ("true".equals(skipEmptyCaption)) {
						continue;
				}
		}
		valueString = valueString.trim();
		displayString = tools.getLocalizedTextForString(".pyCaption",displayString ,StreamBuilder.FMT_LITERAL);
		pzAuto.getPropertyActionRequest().registerEnumeratedParameter(ddPropEntryHandle, valueString);
		if("".equals(displayString))
			displayString = valueString ;
		selected = (valueString.equals(strValue)) ? "selected " : ""; 
		tools.appendString("<option " + selected + " value=\"" + tools.getXMLUtils().encodeString(valueString) + "\"");
		String titleString = cbpRow.getString(".pyParametersParamType");
		titleString = tools.getLocalizedTextForString(".pyTooltip",titleString ,StreamBuilder.FMT_LITERAL);
	tools.appendString(" title='" + StringUtils.crossScriptingFilter(titleString) + "'>" + StringUtils.crossScriptingFilter(displayString) + "</option>");
	}
}
tools.appendString("</select >");
if(isAccessible) {
	String pyBtnLbl = ".pyButtonLabel";
	String ctrName = "Select";
	tools.appendString("<input " + disabled_ctrl + " name='SB_" + ddPropEntryHandle + "' type='button' data-ctl='[\"DropdownButton\"]' value='" + tools.getLocalizedTextForString(pyBtnLbl, ctrName, StreamBuilder.FMT_LITERAL) + "' style='width:auto;' />");
	drodownButtonIncludes_1();
}
tools.appendString("</div>");
}if(bOptimizedMarkup){pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxDropdown");
		}
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20140924151621076131469") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDropdown",".pyParametersParamType", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDropdown_1(".pyParametersParamType",0,"","","Text");
									tools.appendString("</DIV>"); } else { pxDropdown_1(".pyParametersParamType",0,"","","Text");}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxTextInput_2() {String key="800||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","","Text","true","800"};oCellRuntimeParamsMap.put("800||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("800||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)");}
public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyParametersParamDesc", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString("headers='a2'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:51px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxTextInput_2();
									tools.appendString("</DIV>"); } else { pxTextInput_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pxTextInput_1() {String key="799||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT";
String pzFromGrid = tools.getParamValue("pzFromGrid");
tools.putParamValue("pzFromGrid","true");
AssemblyParameters assemblyParams = oAssemblyParamsMap.get(key);
((PegaAPI) tools).appendControlMarkup("pxTextInput", assemblyParams);
tools.putParamValue("pzFromGrid",pzFromGrid);
}
static{String[] paramValues = new String[]{"text", "pxTextInput", "",".pyParameters","","","true","FREEFORM","REPEATING","",""," cffalse","T","false","0","","pzValidParameterPageName","Text","true","799"};oCellRuntimeParamsMap.put("799||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",paramValues);oControlPathsMap.put("799||RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)");}
public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyParametersParamName", ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString(""); tools.appendString("'class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_1();
									tools.appendString("</DIV>"); } else {  if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_1();}
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
public void 
CellDefaultValues_1() {

					
					if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, ".pyParametersParamType == \"\"",null,true)){

					
					
					ClipboardPage myStepPage = tools.getPrimaryPage();

					
					
					if("".equals(tools.getProperty(".pyParametersParamType").getStringValue())){tools.getProperty(".pyParametersParamType").setValue("STRING");

					
					
					}}

					
					tools.getInfEngUtils().forwardChain(tools);

					}


public void pyParameters_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString(",");
		tools.appendString(",\"up\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString(",");
		tools.appendString(",\"down\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"INSERTAFTER\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
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

					if(tools.getParamValue("partialTrigger").equals("appendTo.pyParameters1")|| tools.getParamValue("partialTrigger").equals("editRow.pyParameters1") ){

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

					ClipboardProperty pageListProp = tools.getProperty(".pyParameters");

					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(tools.getParamValue("strIndexInList")));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					if(tools.getParamValue("EditRow").equals("false") && pagePropInList.getPageValue().hasMessages()){ tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					tools.putParamValue("strIndexInList", pageListProp.size());

					}

					
						 tools.putParamValue("expandRL","false"); 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
						 tools.putParamValue("expandRL","true");

					
							  if(tools.getActive().indexOf()%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyParameters\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					{

					String tempTestID = "";

					String rowTestID = "R";

					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyParameters")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					String strEntryHandlePLProp = "";

					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyParameters"); } catch (Exception ex) { }

					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					}

					}

					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-" + rowTestID) + " ");

					}

					tools.appendString(" PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					tools.appendString("draggableCell ");tools.appendString("rowHandle  ' style='height:55px;width:1%;'>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("<DIV class='oflowDiv'");

					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					tools.appendString("style='height:55px;'");

					}

					tools.appendString(">");

					}

					tools.appendString("<div class=\"divCont\" style=\"width:23px;\"><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					if(!pzAuto.getBrowserUtils().isIE()){

					tools.appendString("</DIV>");

					}

					tools.appendString("</td>");

					

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_2(); 

					activeName = tools.getActiveName(); CellDefaultValues_1();

					 repeatingDataCell_3(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_4(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_5(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_6(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_7(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_8(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_9(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					
									  pega.popStackFrame(frame_3, false); 

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyParameters1")) {

					
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

					
		 pageListProp = tools.getProperty(".pyParameters");

					
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

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					java.util.Map functionsMap = null;

					java.util.Map classesMap = null;

					tools.putSaveValue("bAllowRowUpdate","true");

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyParameters1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(".pyParameters");

					
					String strIndex1 = tools.getParamValue("lastRowToRetrieve");

					
					if("".equals(strIndex1) || Integer.parseInt(strIndex1) > pageListProp.size())

					
					strIndex1 = tools.getParamValue("strIndexInList");

					
					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(strIndex1));

					
					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					
					if(tools.getParamValue("EditRow").equals("false") && pagePropInList.getPageValue().hasMessages()){ tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					
					tools.putParamValue("strIndexInList", pageListProp.size());

					
					}

					
					
						 tools.putParamValue("expandRL","false"); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
					
						 tools.putParamValue("expandRL","true");

					
					
							  if(tools.getActive().indexOf()%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyParameters\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyParameters")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyParameters"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					
					tools.appendString("draggableCell ");tools.appendString("rowHandle  ' style='height:55px;width:1%;'>");

					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					tools.appendString("<DIV class='oflowDiv'");

					
					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					
					tools.appendString("style='height:55px;'");

					
					}

					
					tools.appendString(">");

					
					}

					
					tools.appendString("<div class=\"divCont\" style=\"width:23px;\"><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					tools.appendString("</DIV>");

					
					}

					
					tools.appendString("</td>");

					
					

					
					 repeatingDataCell_1(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_2(); 

					
					activeName = tools.getActiveName(); CellDefaultValues_1();

					
					 repeatingDataCell_10(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_11(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_5(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_6(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_7(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_8(); 

					
					activeName = tools.getActiveName(); 

					
					 repeatingDataCell_12(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					 /* GenerateGrid: End */

					
					}

					
					public void 
gridBeginLayout_2
					
					() {

					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					}

					

public void gridDoPartialRefresh_2() { /*gridDoPartialRefresh*/

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					java.util.Map functionsMap = null;

					java.util.Map classesMap = null;

					tools.putSaveValue("bAllowRowUpdate","true");

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyParameters1")|| tools.getParamValue("partialTrigger").equals("editRow.pyParameters1") ){

					
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

					
					ClipboardProperty pageListProp = tools.getProperty(".pyParameters");

					
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

					
					
							  if(tools.getActive().indexOf()%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyParameters\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
 }}catch(Exception e){}

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					{

					
					String tempTestID = "";

					
					String rowTestID = "R";

					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyParameters")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					String strEntryHandlePLProp = "";

					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyParameters"); } catch (Exception ex) { }

					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					}

					
					}

					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-" + rowTestID) + " ");

					
					}

					
					tools.appendString(" PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					
					tools.appendString("rowHandle  ' style='height:55px;width:1%;'>");

					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					tools.appendString("<DIV class='oflowDiv'");

					
					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					
					tools.appendString("style='height:55px;'");

					
					}

					
					tools.appendString(">");

					
					}

					
					tools.appendString("<div class=\"divCont\" ><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					tools.appendString("</DIV>");

					
					}

					
					tools.appendString("</td>");

					
					 repeatingDataCell_13(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_14(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_15(); 

					
					activeName = tools.getActiveName();  repeatingDataCell_16(); 

					
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

					
					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyParameters1")) {

					
					
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

					
					
		 pageListProp = tools.getProperty(".pyParameters");

					
					
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

					
					

public void gridLastRow_2() { /*gridLastRow*/

					
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					
					java.util.Map functionsMap = null;

					
					java.util.Map classesMap = null;

					
					tools.putSaveValue("bAllowRowUpdate","true");

					
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					if(tools.getParamValue("partialTrigger").equals("appendTo.pyParameters1") ){

					
					
					tools.putParamValue("partialRefresh", "false");

					
					
					if(tools instanceof StreamBuilderToolKit) {

					
					
					ClipboardProperty pageListProp = tools.getProperty(".pyParameters");

					
					
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

					
					
					
							  if(tools.getActive().indexOf()%2==0) { 

					
					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData..pyParameters\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					gridOpenActionIncl_1();

					
					
					tools.appendString(" id='");

					
					
					 tools.appendString(tools.getActiveName()); tools.appendString("' ");

					
					
					{

					
					
					String tempTestID = "";

					
					
					String rowTestID = "R";

					
					
					 if(!"".equals(tools.getParamValue("pyChildPropRef")) && tools.getParamValue("pyChildPropRef").equals(".pyParameters")) { tempTestID = tools.getActiveName(); } else if(tools.getParamValue("partialTrigger").equals("getChildNodes.pyParameters1") && !"".equals(tools.getParamValue("pyPropRef"))) { try{tempTestID = tools.getStepPage().getEntryHandle(tools.getParamValue("pyPropRef")+"("+tools.getActive().indexOf()+")");}catch(Exception e){tempTestID = tools.getActiveName();} } else { tempTestID = tools.getActiveName(); } 

					
					
					if (tempTestID != null && !tempTestID.isEmpty() && !tempTestID.equals("")){

					
					
					String strEntryHandlePLProp = "";

					
					
					try { strEntryHandlePLProp = tools.getStepPage().getEntryHandle(".pyParameters"); } catch (Exception ex) { }

					
					
					if (strEntryHandlePLProp != null && !strEntryHandlePLProp.isEmpty() && !strEntryHandlePLProp.equals("")){ tempTestID = tempTestID.replace(strEntryHandlePLProp, "");}

					
					
					tempTestID = tempTestID.replaceAll("\\$l", "_test_ID").replaceAll("\\$", "_test_ID");

					
					
					String[] levelTestIDs = tempTestID.split("_test_ID");int level = 0;

					
					
					for (int i = 0; i < levelTestIDs.length; i++) {	if (levelTestIDs[i].matches("^-?\\d+$")) {	String indexStr = levelTestIDs[i]; if( level > 0 ) { indexStr = "L" + Integer.toString(level)+ "R" + levelTestIDs[i]; } rowTestID+=indexStr + "-"; level+=1; }}

					
					
					if (rowTestID != null && !rowTestID.isEmpty() && !rowTestID.equals("")){

					
					
					rowTestID = rowTestID.substring(0,rowTestID.length()-1);

					
					
					}

					
					
					}

					
					
					tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201702160836000926546-" + rowTestID) + " ");

					
					
					}

					
					
					tools.appendString(" PL_INDEX = '");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' ><td class='cellCont ");

					
					
					tools.appendString("rowHandle  ' style='height:55px;width:1%;'>");

					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					tools.appendString("<DIV class='oflowDiv'");

					
					
					if(pzAuto.getBrowserUtils().isFF() || pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){

					
					
					tools.appendString("style='height:55px;'");

					
					
					}

					
					
					tools.appendString(">");

					
					
					}

					
					
					tools.appendString("<div class=\"divCont\" ><span class=\"wspan\"></span><div class=\"cellIn\"><span style='width:auto;' onclick='return false;' class='pageIndex' >");

					
					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("</span></div></div>");

					
					
					if(!pzAuto.getBrowserUtils().isIE()){

					
					
					tools.appendString("</DIV>");

					
					
					}

					
					
					tools.appendString("</td>");

					
					
					 repeatingDataCell_13(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_14(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_17(); 

					
					
					activeName = tools.getActiveName();  repeatingDataCell_16(); 

					
					
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
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Model");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzParametersAdvConf");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
pzExternalMethodMapping.put("pzLayout_3", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-MODEL PZPARAMETERSADVCONF #20180713T135251.402 GMT", "Rule-Obj-Model pzParametersAdvConf", "Pega-Desktop", "08-01-01", "20180713T135251.402 GMT");
}
