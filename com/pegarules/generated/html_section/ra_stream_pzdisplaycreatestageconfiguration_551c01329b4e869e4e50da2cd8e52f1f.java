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
 * Builds JSP stream EMBED-STAGE!PZDISPLAYCREATESTAGECONFIGURATION.
 */
public class ra_stream_pzdisplaycreatestageconfiguration_551c01329b4e869e4e50da2cd8e52f1f extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzDisplayCreateStageConfiguration.Embed_Stage.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -407410163;
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
	public ra_stream_pzdisplaycreatestageconfiguration_551c01329b4e869e4e50da2cd8e52f1f(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "9b3a72eb4c6b02277e836a9b27b63a0384545d16";
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
/* Instance RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT	Pega-ProcessArchitect:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "9b3a72eb4c6b02277e836a9b27b63a0384545d16";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzDisplayCreateStageConfiguration",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT */
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
	"Rule-HTML-Section:PZDISPLAYCREATESTAGECONFIGURATION", 
	"Rule-HTML-Section:PZDESIGNTEMPLATE1COLUMN", 
	"Rule-Obj-Property:PYFIELDVALUE", 
	"Rule-Obj-Property:PYSTAGEENTRYSTATUS", 
	"Rule-Obj-Property:PYSTAGEENTRYSTATUS", 
	"Rule-HTML-Property:PXAUTOCOMPLETE", 
	"Rule-HTML-Property:PXTEXTINPUT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDISPLAYCREATESTAGECONFIGURATION","Rule-HTML-Section","EMBED-STAGE",false,"","Pega-ProcessArchitect","08-05-01","RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT","!PZDISPLAYCREATESTAGECONFIGURATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-407410163), 
		new DependentRuleInfo("PZDESIGNTEMPLATE1COLUMN","Rule-HTML-Section","@BASECLASS",false,"","Pega-UIDesign","08-04-01","RULE-HTML-SECTION @BASECLASS PZDESIGNTEMPLATE1COLUMN #20190722T194316.547 GMT","!PZDESIGNTEMPLATE1COLUMN",false,false,"MISSING",-1790221743), 
		new DependentRuleInfo("PYFIELDVALUE","Rule-Obj-Property","RULE-OBJ-FIELDVALUE",true,"Rule-Obj-FieldValue","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-FIELDVALUE PYFIELDVALUE #20180713T131303.568 GMT","!PYFIELDVALUE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSTAGEENTRYSTATUS","Rule-Obj-Property","EMBED-STAGE",true,"Embed-Stage","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT","!PYSTAGEENTRYSTATUS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYSTAGEENTRYSTATUS","Rule-Obj-Property","EMBED-STAGE",false,"","Pega-ProcessEngine","08-01-01","RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT","!PYSTAGEENTRYSTATUS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
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
//	RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT:20200428T045535.824 GMT
//	RULE-HTML-SECTION @BASECLASS PZDESIGNTEMPLATE1COLUMN #20190722T194316.547 GMT:20190729T143012.910 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-HTML-PROPERTY PXAUTOCOMPLETE #20190131T183501.505 GMT:20190131T183501.505 GMT
//	RULE-HTML-SECTION @BASECLASS PZDESIGNTEMPLATE1COLUMN #20190722T194316.547 GMT:20190729T143012.910 GMT
//	RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT:20190131T183501.688 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-FIELDVALUE PYFIELDVALUE #20180713T131303.568 GMT:20180713T131303.568 GMT
//	RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT:20190131T183501.688 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-FIELDVALUE PYFIELDVALUE #20180713T131303.568 GMT:20180713T131303.568 GMT
//	RULE-HTML-PROPERTY PXTEXTINPUT #20190131T183501.688 GMT:20190131T183501.688 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-FIELDVALUE PYFIELDVALUE #20180713T131303.568 GMT:20180713T131303.568 GMT
//	RULE-HTML-SECTION @BASECLASS PZDESIGNTEMPLATE1COLUMN #20190722T194316.547 GMT:20190729T143012.910 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-PROPERTY EMBED-STAGE PYSTAGEENTRYSTATUS #20180713T132912.289 GMT:20180713T132912.289 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID CREATETEMPLATEGRIDXML #20180713T133337.729 GMT:20180713T133337.729 GMT
//	RULE-UTILITY-FUNCTION GRID GENERATEGRIDLAYOUT #20180713T133337.732 GMT:20180713T133337.732 GMT
//	RULE-UTILITY-FUNCTION GRID GENERATEGRIDLAYOUTASSECTION #20180713T133337.736 GMT:20180713T133337.736 GMT
//	RULE-UTILITY-FUNCTION GRID GETTOTALRECORDS #20180713T133337.740 GMT:20180718T092706.975 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTEVENTPARAMS--(STRINGBUFFER,CLIPBOARDPAGE,BOOLEAN) #20180713T133337.845 GMT:20180713T133337.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDISABLEWHEN #20180713T133339.725 GMT:20180713T133339.725 GMT
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
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORSPAN #20180713T133339.912 GMT:20180713T133339.912 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONCLOSECONTAINER--(BOOLEAN6B602F7DF1B1291F08F65DCCD1AA9BC2 #20180713T133343.012 GMT:20180713T133343.012 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNDATATRANSFORM--(CLIPB9514A9C33ADD6709FD6A843ADA2991DD #20220104T102659.447 GMT:20220104T102659.447 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETVALUE--(CLIPBOARDPAGED2D8EBC7F29F977F1A20CFC6559990AA #20180713T133344.640 GMT:20180713T133344.640 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDGRIDXMLFORAC #20201230T105617.048 GMT:20201230T105617.048 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBUILDPARAMETERPAGE #20180713T133344.777 GMT:20180713T133344.777 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING INSTRING #20180713T131441.635 GMT:20180713T131441.635 GMT
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
		return "9f286d6b131d8d722aac0485531173df";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-Stage";
	}
public String getAspect() {
return "Stream";
}
public void buildWhiteList_2() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "datapage");
config.put("pySourceName", "D_pygetAvailableWorkStatuses");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzDisplayCreateStageConfiguration");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("TargetPage", "CaseTypeStages");
config.put("ValueForClearActions", "False");
config.put("pyPreDataTransform.pyName", "pzSetDoClearActions");
config.put("pzDataTransformStaticParams", "TargetPage&ValueForClearActions");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "datapage");
config.put("pySourceName", "D_pygetAvailableWorkStatuses");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzDisplayCreateStageConfiguration");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("TargetPage", "CaseTypeStages");
config.put("ValueForClearActions", "False");
config.put("pyPreDataTransform.pyName", "pzSetDoClearActions");
config.put("pzDataTransformStaticParams", "TargetPage&ValueForClearActions");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
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
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "datapage");
config.put("pySourceName", "D_pygetAvailableWorkStatuses");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzDisplayCreateStageConfiguration");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("TargetPage", "CaseTypeStages");
config.put("ValueForClearActions", "False");
config.put("pyPreDataTransform.pyName", "pzSetDoClearActions");
config.put("pzDataTransformStaticParams", "TargetPage&ValueForClearActions");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
pega.getUIEngine().getUIAction("paginate", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.control.AutoCompleteAG.setFocusToInput");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyActivity", "SubmitModalFlowAction");
pega.getUIEngine().getUIAction("closeContainer", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyActivity", "pzGetACData");
config.put("pyListSource", "datapage");
config.put("pySourceName", "D_pygetAvailableWorkStatuses");
pega.getUIEngine().getUIAction("autocompleteListBased", config).register();
config = new HashMap<String, String>();
config.put("StreamName", "pzDisplayCreateStageConfiguration");
config.put("pyActivity", "pzRunActionWrapper");
config.put("pySubAction", "runAct");
config.put("inStandardsMode", "true");
config.put("pzActivity", "ReloadCell");
pega.getUIEngine().getUIAction("autocompleteSetAdditionalProperty", config).register();
config = new HashMap<String, String>();
config.put("TargetPage", "CaseTypeStages");
config.put("ValueForClearActions", "False");
config.put("pyPreDataTransform.pyName", "pzSetDoClearActions");
config.put("pzDataTransformStaticParams", "TargetPage&ValueForClearActions");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
}
public void 
getControlMarkup_1() {
try {
if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyStageEntryStatus").getEntryHandle())){

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyStageEntryStatus", "input", "OpenRuleAdvanced")) {
	return;
}
}
else if(tools.getParamValue("pyPropertyTarget").equals(tools.getStepPage().getProperty(".pyStageEntryStatus").getEntryHandle())){

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyStageEntryStatus", "input", "OpenRuleAdvanced")) {
	return;
}
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_22")){
inclCalVal_1("pxTextInput","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
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
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_24")){
		textInputIncludes_1();boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering(); boolean doAutoFormatting = false;

		tools.appendString("<span data-control-mode='input'  nowrap>");
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
		tools.appendString(bOptimizedMarkup ? " data-cdb-value=\"" : " value=\"");String ref = tools.getProperty(".pyFieldValue").getReference();
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_25")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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

public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyFieldValue", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:22px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(false,"","autocompleteAGleft",pzSection.getValueStyle()));tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div class='divCont'><span class='wspan'></span><div class='cellIn'>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_3(".pyFieldValue",64,"","ValidFieldValue","Text");
									tools.appendString("</div></div>"); if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("</DIV>"); }
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingDataCell_3() {
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = ".pyFieldValue";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString("");
		tools.appendString(" class='");
		tools.appendString("hiddenCell");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:0px;");tools.appendString("width:"); if(!tools.getParamValueCSF("D_pygetAvailableWorkStatusesPpxResults2colWidthCache1").equals("")){ tools.appendParamCSF("D_pygetAvailableWorkStatusesPpxResults2colWidthCache1"); } else { tools.appendString("152"); } tools.appendString("px;");tools.appendString("");getInlineStyle_1(); tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:0px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "pyFieldValue", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_18")){
inclCalVal_1("pxTextInput","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_19")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_20")){
		textInputIncludes_1();boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering(); boolean doAutoFormatting = false;

		tools.appendString("<span data-control-mode='input'  nowrap>");
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
		tools.appendString(bOptimizedMarkup ? " data-cdb-value=\"" : " value=\"");String ref = tools.getProperty(".pyFieldValue").getReference();
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_21")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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

public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyFieldValue", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:22px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(false,"","autocompleteAGleft",pzSection.getValueStyle()));tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div class='divCont'><span class='wspan'></span><div class='cellIn'>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_2(".pyFieldValue",64,"","ValidFieldValue","Text");
									tools.appendString("</div></div>"); if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("</DIV>"); }
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_14")){
inclCalVal_1("pxTextInput","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_2(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
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
	if(isEditable) {
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_16")){
		textInputIncludes_1();boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering(); boolean doAutoFormatting = false;

		tools.appendString("<span data-control-mode='input'  nowrap>");
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
		tools.appendString(bOptimizedMarkup ? " data-cdb-value=\"" : " value=\"");String ref = tools.getProperty(".pyFieldValue").getReference();
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_17")){inclFormattedVal_3(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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

public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxTextInput",".pyFieldValue", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("height:22px;");tools.appendString(""); tools.appendString("'class='");
	tools.appendString(pzSection.getCustomStyle(false,"","autocompleteAGleft",pzSection.getValueStyle()));tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:22px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div class='divCont'><span class='wspan'></span><div class='cellIn'>"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }pxTextInput_1(".pyFieldValue",64,"","ValidFieldValue","Text");
									tools.appendString("</div></div>"); if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("</DIV>"); }
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
tools.appendString("visibility:hidden;height:1px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void 
getInlineStyle_2() {
}


public void D_pygetAvailableWorkStatuses_pxResults_1() {
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
tools.appendString(stepPageRest2 + ".pyStageEntryStatus\", \"" + stepPageTop2 + "\", \"~!.pyFieldValue\", \"\", \"");

		tools.appendString("#~.pyFieldValue$0$~#");tools.appendString("\"]]");

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

					if(tools.getParamValue("partialTrigger").equals("appendToD_pygetAvailableWorkStatuses.pxResults2")|| tools.getParamValue("partialTrigger").equals("editRowD_pygetAvailableWorkStatuses.pxResults2") ){

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

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pygetAvailableWorkStatuses.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 ct_gridAction.trackValueChanges(tools.getProperty(".pyFieldValue"),-1);

					
 }}catch(Exception e){}

					tools.appendString(" data-gargs='[");

					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyFieldValue").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");

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

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropD_pygetAvailableWorkStatuses.pxResults2")) {

					
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

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupD_pygetAvailableWorkStatuses.pxResults2")) { 

					
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

					
					if(tools.getParamValue("partialTrigger").equals("appendToD_pygetAvailableWorkStatuses.pxResults2") ){

					
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

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.D_pygetAvailableWorkStatuses.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
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

					
					
 String strPageSize = "20"; 

					
					
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

					
					if (tmpDeclarePageParams != null && tmpDeclarePageParams.getProperty("D_pygetAvailableWorkStatuses_pxResults_pzDisplayCreateStageConfiguration_2") != null) {

					
					ClipboardPage paramList = tmpDeclarePageParams.getProperty("D_pygetAvailableWorkStatuses_pxResults_pzDisplayCreateStageConfiguration_2").getPageValue();

					
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

					
					
 ClipboardPage gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7=null;

					
					
 Map selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7 = null;

					
					
 Set filteredIndicesSetD_pygetAvailableWorkStatuses_pxResultsL7 = null;

					
					
	 String strFCPage = "pyFilterCriteria_D_pygetAvailableWorkStatuses.pxResults_pzDisplayCreateStageConfiguration_2";

					
					
	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

					
					
	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

					
					
if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

					
					
	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

					
					
}

					
					
	 gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7 = tools.findPage(strFCPage, true);

					
					
	 if(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7==null){gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7 = tools.createPage("Pega-GridFilterCriteria", strFCPage);}

					
					
tools.putParamValue("pyGridFilterCriteriaPage", strFCPage);

					
					
gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7.getProperty("pyRowVisibleWhenCondition").setValue("pzACRowVisibleWhen");

					
					
  selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7 = null; // reset the variable

					
					
 if(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7 != null){ 

					
					
 		 filteredIndicesSetD_pygetAvailableWorkStatuses_pxResultsL7 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7, "D_pygetAvailableWorkStatuses.pxResults");

					
					
 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetD_pygetAvailableWorkStatuses_pxResultsL7);

					
					
 tools.putParamValue("populateSelectedUIValues", "true");

					
					
 		 selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7); 

					
					
 		 tools.getParameterPage().put("selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7", selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7);

					
					
 tools.putParamValue("populateSelectedUIValues", "");

					
					
 }

					
					if(tools.getParamValue("gridAction")!=null && !tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					tools.appendString("<div  section_index='2' ");

					
					tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pygetAvailableWorkStatuses.pxResults").getReference());tools.appendString("_pzDisplayCreateStageConfiguration_2'");

					
					tools.appendString(" hashed-dp-page='");

					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("D_pygetAvailableWorkStatuses.pxResults").getReference());tools.appendString("' bRowHovering='true' deferLoadAct='' class=\"");

					
					tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");

					
					if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");

					
					tools.appendString("");

					
					tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");

					
					tools.appendString(" fixedRow='true' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='true' bCBOptimize='true'");

					
					if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {

					
					tools.appendString(" bFilteredGrid = 'true'");

					
					}

					
					tools.appendString(" bRangeFilterByFormat='false' bRowVisibleWhen = 'true' DPSectionID=\"SubSectionpzDisplayCreateStageConfiguration1035493e_95ac_4fab_8938_80e63c305972_pyStageEntryStatus\"  openOnDblClick='false' OAFunc='openRuleByKeys' ");

					
					D_pygetAvailableWorkStatuses_pxResults_1();

					
					tools.appendString(">");

					
					

 ClipboardProperty pageListProp = null;

					
					
 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


					
					
 int currentPageIndex = 0; 

					
					
 if(startIndex == 0){ startIndex = 1; } 

					
					
 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

					
					
 tools.putParamValue("pyPageMode", strPageMode); 


					
					
 tools.putParamValue("pyPageSize", "20"); 

					
					
 tools.putSaveValue("pyPageSize", "20"); 

					
					
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

					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					

 pageListProp = tools.getProperty("D_pygetAvailableWorkStatuses.pxResults"); 

					
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

					
					
 tools.putParamValue("PageListProperty","D_pygetAvailableWorkStatuses.pxResults");}

					
					/* to calculate the total number of records in case of filtering with pagination..false*/

					
					/* to calculate the total number of records in case of filtering with pagination..*/

					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					ClipboardProperty propActivePrev = tools.getActive(); 


					
					
					Iterator itr = tools.getProperty("D_pygetAvailableWorkStatuses.pxResults").iterator();

					
					
					
					Set filteredResultsSet = new HashSet();

					
					
					
					
					while(itr.hasNext()){

					
					
					
					
					
					ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();

					
					
					
					
					
					ClipboardPage pg_eachProp = cp_eachProp.getPageValue();

					
					
					
					
					
					PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);

					
					
					
					
					
					tools.putActive(cp_eachProp);

					
					
					
					
					
					boolean bFilterResult = false;

					
					
					
					
					
					if(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7!= null){

					
					
					
					
					
					bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7, selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7);

					
					
					
					
					
					}

					
					
					
					
					
					if(bFilterResult){

					
					
					
					
					
					
					int itemIndex = cp_eachProp.indexOf() ;

					
					
					
					
					
					
					
					filteredResultsSet.add((Integer)itemIndex);

					
					
					
					
					
					
					
					}

					
					
					
					
					
					
					
					
 			 if (gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7== null || bFilterResult) {

					
					
					
					
					
					
					
					
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

					
					
					
					
					
					
					
					pageListProp = tools.getProperty("D_pygetAvailableWorkStatuses.pxResults"); }

					
					
					
					
					
					
					
					
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


					
					
					
					
					
					
					
					if (endIndex == 0 && gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7 != null && tools.getParamValue("gridAction").toLowerCase().equals("submitrow")) {

					
					
					
					
					
					
					
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

					
					
					
					
					
					ClipboardPage gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7=null;

					
					
					
					
					
					Map selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7 = null;

					
					
					
					
					
					selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7 = null; // reset the variable

					
					
					
					
					
					gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

					
					
					
					
					
							 selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7 = (Map)tools.getParameterPage().getObject("selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7");

					
					
					
					
					
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

					
					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")&& !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()){

					
					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("D_pygetAvailableWorkStatuses.pxResults");

					
					
					
					
					
					
					}

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='.pyFieldValue  ' class='yui-skin-sam gPXFixed");

					
					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					
					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					
					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='D_pygetAvailableWorkStatusesPpxResults2' editRowIndex='");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					
					}

					
					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					
					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}if(tools.getParamValue("refreshLayout").equals("true") && !tools.getParamValueCSF("editRowIndex").equals("") && !tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { tools.appendString("reloadSomePages='true'"); }tools.appendString(" pyGridAutoHeight=\"true\" pyNoScrollContainer=\"true\" dpParams=\"\" pyPageSize = '");

					
					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">");

					
					
					
					
					
					
					

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<div id='gridLayoutWrapper' noWidth='true' noHeight='true' style=\"");

					
					
					
					
					
					
					if(pzAuto.getBrowserUtils().isIE()){tools.appendString("width:0.0px;");

					
					
					
					
					
					
					}else{tools.appendString("width:2.0px;");

					
					
					
					
					
					
					}tools.appendString("height:440px;overflow-y:auto;\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					
					tools.appendString("");

					
					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					
					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_pygetAvailableWorkStatusesPpxResults2colWidthGBL\" id=\"D_pygetAvailableWorkStatusesPpxResults2colWidthGBL\" value=\"");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pygetAvailableWorkStatusesPpxResults2colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"D_pygetAvailableWorkStatusesPpxResults2colWidthGBR\" id=\"D_pygetAvailableWorkStatusesPpxResults2colWidthGBR\" value=\"");

					
					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("D_pygetAvailableWorkStatusesPpxResults2colWidthGBR"));

					
					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >");

					
					
					
					
					
					
					
							 if(!tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t<div id='grid-topBuffer'></div> ");

					
					
					
					
					
					
					
							 }

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ' style='width:");

					
					
					
					
					
					
					 if(!tools.getParamValue("D_pygetAvailableWorkStatusesPpxResults2colWidthGBL").equals("")) { tools.appendParamCSF("D_pygetAvailableWorkStatusesPpxResults2colWidthGBL"); } else { 

					
					
					
					
					
					
					tools.appendString("152.0"); } 

					
					
					
					
					
					
					tools.appendString("px;table-layout:fixed;' cellspacing=0 cellpadding=0 id='bodyTbl_right' bRowResize=\"false\" PL_PROP='D_pygetAvailableWorkStatuses.pxResults' PL_PROP_CLASS='Rule-Obj-FieldValue' PRIM_PAGE='");

					
					
					
					
					
					
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

					
					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
					
							 if(tools.getParamValue("gridAction").equals("PAGINATE")) {

					
					
					
					
					
					
					
							 tools.putSaveValue("isGrid", "true"); 

					
					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t<table id='bodyTbl_right'>\n\t\t\t\t\t\t\t\t\t<tbody id='tempTBody'>");

					
					
					
					
					
					
					
							 }

					
					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
					
					
					
					
					
								 itr_3 = tools.getProperty("D_pygetAvailableWorkStatuses.pxResults").iterator(); 

					
					
					
					
					
					
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
										 } else if(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7, selUniqMapD_pygetAvailableWorkStatuses_pxResultsL7);
										 }
										 if (gFCritPageD_pygetAvailableWorkStatuses_pxResultsL7== null || 

					
					
					
					
					
					
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

					
					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.D_pygetAvailableWorkStatuses.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					
					 
								 }

					
					
					
					
					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
					
					
					
 ct_gridAction.trackValueChanges(tools.getProperty(".pyFieldValue"),-1);

					
					
					
					
					
					
					
 }}catch(Exception e){}

					
					
					
					
					
					
					tools.appendString(" data-gargs='[");

					
					
					
					
					
					
					tools.appendString("\"");tools.appendString(StringUtils.escapeCrossScriptingFilter(tools.getProperty(".pyFieldValue").getStringValue()) );tools.appendString("\"");tools.appendString("");tools.appendString("]' ");

					
					
					
					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					
					
					
					gridOpenActionIncl_1();

					
					
					
					
					
					
					tools.appendString(" id='");

					
					
					
					
					
					
					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("'  PL_INDEX = '");

					
					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					
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

					
					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"1\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("Rule-Obj-FieldValue", "tempNoRespg");

					
					
					
					
					
					
					
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

					
					
					
					
					
					
					 if(!"".equals(tools.getParamValue("totalRecords"))) tools.appendString(Integer.toString((Integer.parseInt(tools.getParamValue("totalRecords"))-(2*20))*22));

					
					
					
					
					
					
					tools.appendString("px;'></div> \n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesD_pygetAvailableWorkStatuses.pxResults2") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
					
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
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)','region':'A'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzDisplayCreateStageConfiguration1035493e_95ac_4fab_8938_80e63c305972_pyStageEntryStatus";
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
setDpParamasForAc_1() {
		 if( !"".equals(tools.getParamValue("AC_SrcParams"))){
			 ClipboardPage dpParams = tools.createPage("","");
			 try{dpParams.adoptJSONObject(tools.getParamValue("AC_SrcParams"));
			  Iterator propItr = dpParams.keySet().iterator(); ;
			  while(propItr.hasNext()){
				 String key = (String)propItr.next(); 
				 String value = dpParams.getString(key); 
				 tools.putParamValue(key, org.apache.commons.lang.StringEscapeUtils.unescapeHtml(value)); 
			  }}catch(Exception e){}
		 }
	}
public void 
acGridPreProcessor_1() {
	String strPropName= "pyStageEntryStatus";
	String strClassName = "Embed-Stage";
	ClipboardProperty cbpResults=null;
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
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
		actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
		com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
		actionRequestD.registerFixedParameter("pyModelName","pzSetDoClearActions");
			String usingPageString = "";
			usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
			tools.appendString("[\"runDataTransform\", [\"pzSetDoClearActions\", \"TargetPage=CaseTypeStages");
			actionRequestD.registerFixedParameter("TargetPage","CaseTypeStages");
			tools.appendString("&ValueForClearActions=False");
			actionRequestD.registerFixedParameter("ValueForClearActions","False");
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
			pzPackageRuntime.packageDataTransform(contextClass, "pzSetDoClearActions");
			}
				pzAuto.registerActionRequest(actionRequest);
				}
				tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}				String returnString = actionsStringBuilder.toString();
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
	String actionName = tools.getParamValue("pyAction");
if(!actionName.equals("PostValue") && !actionName.equals("ReadonlyFormat")){tools.putSaveValue("sectionUniqueID", "SID" + (((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique())+ "");
	pzSection.includeExpressions();
	  pzSection.beginSection("pzDisplayCreateStageConfiguration",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzDisplayCreateStageConfiguration','insKey':'RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT','templated':'true','editable':'true','sectionType':'standard'}");
	
	 LayoutWrapperTableStart_1(); 
	gridLayout_1();
	 LayoutWrapperTableEnd_1(); 
	
	

if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("setPostValueURL", "true");
} else {
tools.appendString("<div style=\"display:none;\" data-postvalue-url=\"" + StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=ReloadCell&StreamName=pzDisplayCreateStageConfiguration")) + "\"></div>");
}
 pzSection.endSection(); 

if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("setPostValueURL", "");
}

} else {
	PRStackFrame frame = pega.pushStackFrame("ContextPage", null, tools.findPage(tools.getParamValue("contextPage")), false, false);
				getControlMarkup_1();
	pega.popStackFrame(frame, false);
}
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
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")){
inclCalVal_1("pxAutoComplete","T&&false&&*&&*&&false","leftJustifyStyle");inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_10")){
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
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20160331134312039269141",true));
	cellPage.put("pyValue",".pyStageEntryStatus");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStageEntryStatus");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyStageEntryStatus", ".pyCaption");
	String associatedPropType = tools.getProperty(".pyStageEntryStatus").getTypeName();
	boolean isAssPropNumeric = false;
	if ( associatedPropType.equals("Decimal") || associatedPropType.equals("Double")){
	isAssPropNumeric = true;
	modePage1.put("isAssPropNumeric",isAssPropNumeric);
	}
	String ddPropEntryHandle = tools.getActive().getEntryHandle();
	ddPropEntryHandle = pzAuto.getUIComponentRuntime().getRepeatingReference(ddPropEntryHandle , "entryHandle",false);
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(".pyStageEntryStatus",pxUniqueStreamHash+"_11");
	IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
	pxErrorIdentifiers.put("pyErrorId",pxUniqueStreamHash+"_11");
	modePage1.put("clintValidAttrs",clientValidationAttributes);
	modePage1.put("pyID","pyStageEntryStatus");
	modePage1.put("styleOther","");
	modePage1.put("pyDisplayAsComboBox","false");
	modePage1.put("pyLightWeightAutoComplete","false");
	modePage1.put("pyDisplayFullScreen","true");
	modePage1.put("pyHighlightMatch","true");
	modePage1.put("pyMatchString","false");
	modePage1.put("pyAllowFreeFormInput","true");
	boolean is4Offline = pega_uiengine_offlinesupport.pzIsForOfflineTemplate();
	modePage1.put("pySpecifySize","auto");
	String spxUniqueStreamHash12 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash12 != null && !"".equals(spxUniqueStreamHash12)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash12,pxUniqueStreamHash+"_12");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_12");
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
	pyListDataSource.put("pyListSource","datapage");
	modePage1.put("pySourceName","D_pygetAvailableWorkStatuses");
	if(is4Offline) {
	tools.findPage("D_pygetAvailableWorkStatuses");
	}
	IUIComponentMetadata pyDataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pyDataPageParams = null;  
	try{
	tools.putParamValue("className", 
	tools.getProperty(".pyClassName").getStringValue()
	);
	}catch(Exception e){}
	pyListDataSource.put("pyUseParameterForSearch","false");
	try{
	pyDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();  
	ctPropRefs.add(tools.getStepPage().getReference()+".pyClassName");
	pyDataPageParams.put("pyName","className");
	pyDataPageParams.put("pyValue","#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyClassName")+"~#");
	pyDataPage.addMetadataInArray("pyDataPageParams",pyDataPageParams);
	}catch(Exception e){}
	IUIComponentMetadata pyAdditionalField = null;  
	boolean isAdditionalPropNumeric = false;
	String additionalPropType = "";
	pyAdditionalField = pzAuto.getUIComponentRuntime().createMetadata();  
	pyAdditionalField.put("pyDisplayProperty",".pyFieldValue");
	pyAdditionalField.put("pyUseForSearch","true");
	pyAdditionalField.put("pyShow","true");
	pyAdditionalField.put("pySetValueOnSelect","true");
	pyAdditionalField.put("pyPropertyTarget","Associated property");
	ctPropRefs.add("pyCell.pyModes(1).pyListDataSource.pyDataPage.pyAdditionalFields(1).pyPropertyTarget");
	pyDataPage.addMetadataInArray("pyAdditionalFields",pyAdditionalField);
	pyListDataSource.putMetadata("pyDataPage",pyDataPage);
	String dataAttributes = "[\"EXPANDEDSubSectionpzDisplayCreateStageConfiguration1035493e_95ac_4fab_8938_80e63c305972_pyStageEntryStatus\",0,170,{\"className\" : \".pyClassName\"},\""+pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getStepPage().getReference(),"",false)+"\",0,false]";
	modePage1.put("dataAttributes",dataAttributes);
	modePage1.putMetadata("pyListDataSource",pyListDataSource);
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("20160331134312039269141",true));
	String pyValueR = "";
	String pyValueOrig = "";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStageEntryStatus");
	pyValueR = ".pyStageEntryStatus";
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyStageEntryStatus");
	pyValueOrig = ".pyStageEntryStatus";
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
	String spxUniqueStreamHash13 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash13 != null && !"".equals(spxUniqueStreamHash13)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash13,pxUniqueStreamHash+"_13");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_13");
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
		ct_controlAction.trackValueChanges(tools.getProperty(".pyClassName"), -1);
	}}catch(Exception e){}
	}
} else {
	autocompleteagIncludes_1();
	
			String disabled_ctrl = ""; 
	String strPropName= tools.getActive().getName();
	try{
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
			com.pega.pegarules.priv.runtime.IStreamChangeTracker cellChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
				
cellChangeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyClassName", -1);
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
		tools.appendString("<input  " + pzCell.getTestIdIfEnabled("20160331134312039269141") + " type='text' data-ctl='[\"AutoCompleteAG\"]' autocomplete='off' autocorrect='off' autocapitalize='off' role='combobox' aria-expanded='false' name='" + pega_uiengine_pzcontrol.pzGetActiveName((PegaStreamAPI)tools,true) + "' aria-describedby='" + pega_uiengine_pzcontrol.pzGetActiveName((PegaStreamAPI)tools,true) + "Error' id='");
		tools.appendString(tools.getHTMLIDForProperty(false,"autocomplete"));
		tools.appendString("' " + disabled_ctrl + " ");

		{boolean isBehaviorAdded = false;
		tools.appendString(" data-change-lazy='false'");isBehaviorAdded = false;
		tools.appendString(" data-change='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
			com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
			actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
			com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
			actionRequestD.registerFixedParameter("pyModelName","pzSetDoClearActions");
				String usingPageString = "";
				usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
				tools.appendString("[\"runDataTransform\", [\"pzSetDoClearActions\", \"TargetPage=CaseTypeStages");
				actionRequestD.registerFixedParameter("TargetPage","CaseTypeStages");
				tools.appendString("&ValueForClearActions=False");
				actionRequestD.registerFixedParameter("ValueForClearActions","False");
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
				pzPackageRuntime.packageDataTransform(contextClass, "pzSetDoClearActions");
				}
					pzAuto.registerActionRequest(actionRequest);
					}
					tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}					tools.appendString(" ");
					pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
						if(isMobilePhone){
						tools.appendString("data-displayFullScreen = \"true\"");
					}
					tools.appendString("class=\""+styleName+"\"");
					String associatedPropValue = activeValue;
					tools.appendString(" value=\"");
					String associatedPropertyType= tools.getProperty(".pyStageEntryStatus").getTypeName(); 
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
					tools.appendString(" data-attributes='[ \"EXPANDEDSubSectionpzDisplayCreateStageConfiguration1035493e_95ac_4fab_8938_80e63c305972_pyStageEntryStatus\",0,0,{\"className\" : \".pyClassName\"},\"" + tools.getStepPage().getReference() + "\",0,false]' /><span class='autocomplete_span' ><div class='autocomplete_icon' id='acspin'  ></div></span>");
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
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + " " + pzCell.getTestIdIfEnabled("20160331134312039269141") + " ");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_26")){inclFormattedVal_4(isSecuredProp, activePropValue, isDisplayTextWithParam , displayTextParamName);

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


	tools.putActive(propActivePrev); 				} catch (Exception e) {

				
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'				&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "StageEntryStatus");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }					}


}

/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__2(PageContext aPageContext, java.lang.String aName, java.lang.String aRef) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setRef(aRef);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
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
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "AdditionalParams", "pyFieldName=pyStatusWork")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "SkipClientValidation", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "100%")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "OtherKeyValuePairs", "pyFieldName=\'pyStatusWork\' pyFieldValue=\'[pyStageEntryStatus]\'")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-FieldValue")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoEventOnPick", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "true")) {
	return true;
}
tools.putSaveValue("attributes", " PN =.pyStageEntryStatus ONCHANGE= \"handleClientEvent(\'POSTCELL\', \'\',\'\' ");
pzAuto.putSaveValue("attributes", ", \'", IAutoStreamRuntime.SAVE_APPEND);
pzAuto.putSaveValue("attributes", "-1", IAutoStreamRuntime.SAVE_APPEND);
pzAuto.putSaveValue("attributes", "\', event)\"", IAutoStreamRuntime.SAVE_APPEND);
if (_jspx_meth_pega_param__2(pageContext, "pega_attributes", "$save(attributes)")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "pega_events", "true")) {
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


public void field_OpenRuleAdvanced_1() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyStageEntryStatus", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pyRegions(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   ");
	 
	tools.appendString(pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + " ");
	 
	tools.appendString("flex flex-row ' " +   pzCell.getTestIdIfEnabled("202002270527290184248")   + " STRING_TYPE='label' RESERVE_SPACE='false'>");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","pyCreateStageInfo") + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("useLabel","true");
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("202002270527290184248")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired _iconRequired");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pyRegions(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "pyCreateStageInfo";
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
	if(!pzAuto.handleEvaluateWhen(" o1! wxpzIsPegaExpress","!pzIsPegaExpress","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyStageEntryStatus",".pyRegions(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   flex '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20150915063406083981336-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyStageEntryStatus" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","StageEntryStatus") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20150915063406083981336-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyStageEntryStatus" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","StageEntryStatus") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")) {field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing flex");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150915063406083981336-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRuleAdvanced");
	pgCells.put("forLabel",".pyStageEntryStatus");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o1! wxpzIsPegaExpress",pxUniqueStreamHash+"_7");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_7");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!pzIsPegaExpress");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_7");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o1! wxpzIsPegaExpress", pxUniqueStreamHash+"_7"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyStageEntryStatus",".pyRegions(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_8")) {	field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "StageEntryStatus";
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
	if(!pzAuto.handleEvaluateWhen(" wxpzIsPegaExpress","pzIsPegaExpress","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxAutoComplete",".pyStageEntryStatus",".pyRegions(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-left-spacing remove-right-spacing   flex '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20160331134312039269141-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStageEntryStatus"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","StageEntryStatus") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20160331134312039269141-Label") + "  class='field-caption " + pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite") + "' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	
	ClipboardProperty propActivePrev = tools.getActive();
	tools.putActive(tools.getStepPage().getProperty(".pyStageEntryStatus"));
	tools.appendString("for='" + tools.getHTMLIDForProperty(true,"label") + "'");
	
	tools.putActive(propActivePrev);
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
tools.appendString(tools.getLocalizedTextForString("pyCaption","StageEntryStatus") + "</label>");
}
tools.appendString("<div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");pxAutoComplete_1(".pyStageEntryStatus",32,"","","Text");
tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","remove-left-spacing remove-right-spacing flex");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20160331134312039269141-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxAutoComplete");
	pgCells.put("forLabel",".pyStageEntryStatus");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("pyGenerateUniqueIdForLabel","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzIsPegaExpress",pxUniqueStreamHash+"_28");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_28");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzIsPegaExpress");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-Stage");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_28");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzIsPegaExpress", pxUniqueStreamHash+"_28"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxAutoComplete",".pyStageEntryStatus",".pyRegions(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxAutoComplete_1(".pyStageEntryStatus",32,"","","Text");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "StageEntryStatus";
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
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzDisplayCreateStageConfigurationB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201808120943310957798") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)','region':'A'}") + " class='" + "flex  content  layout-content-stacked content-stacked content-items-maxwidth padding-1x" + "'  ");
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
		pg_dlmeta.put("customClassName","content-items-maxwidth padding-1x");
		pg_dlmeta.put("format","stacked");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)','region':'A'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
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
	String paramName = "EXPANDEDSubSectionpzDisplayCreateStageConfigurationB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)','region':'A'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","SimpleDiv");
	metadataPage.put("contCustom","margin-b-1x");
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

private void performStream_1() throws Throwable {
 if("EXPANDEDSubSectionpzDisplayCreateStageConfiguration1035493e_95ac_4fab_8938_80e63c305972_pyStageEntryStatus".equals(tools.getParamValue("RenderSingle")) ){ 
 tools.putParamValue("rowVisibleWhen",".pyFieldValue:contains"); 
 tools.putParamValue("AC_BestBetsProp",""); 
 setDpParamasForAc_1();  
 } 
 if("InitialRender_EXPANDEDSubSectionpzDisplayCreateStageConfiguration1035493e_95ac_4fab_8938_80e63c305972_pyStageEntryStatus".equals(tools.getParamValue("RenderSingle")) ){ 
 tools.putParamValue("rowVisibleWhen",".pyFieldValue:contains"); 
 tools.putParamValue("AC_BestBetsProp",""); 
 setDpParamasForAc_1();  
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
String actionName = tools.getParamValue("pyAction");
if(!actionName.equals("PostValue") && !actionName.equals("ReadonlyFormat")){
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.appendString(" ");
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
tools.appendString(" ");
 if(pzAuto.isForOfflineTemplate()) {
tools.appendString(" ");
 try {
tools.appendString(" ");
tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
tools.appendString(" ");
 } catch(Exception e) { } 
tools.appendString(" ");
 }
  pzSection.beginSection("pzDisplayCreateStageConfiguration",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzDisplayCreateStageConfiguration','insKey':'RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT','templated':'true','editable':'true','sectionType':'standard'}");
pzLayout_1();
tools.appendString(" ");
if(tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpzDisplayCreateStageConfiguration1035493e_95ac_4fab_8938_80e63c305972_pyStageEntryStatus")){
gridLayout_1();
 } 
tools.appendString(" ");
 tools.putSaveValue("ContainerID", "");
tools.appendString(" ");

if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("setPostValueURL", "true");
} else {
tools.appendString("<div style=\"display:none;\" data-postvalue-url=\"" + StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=ReloadCell&StreamName=pzDisplayCreateStageConfiguration")) + "\"></div>");
}

 pzSection.endSection(); 
tools.appendString(" ");

if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("setPostValueURL", "");
}

tools.appendString(" ");
 tools.putSaveValue("sectionUniqueID", "");
tools.appendString(" ");
 if(pzAuto.isForOfflineTemplate()) {
tools.appendString(" ");
tools.putSaveValue("offlineSectionClassKey", "");
tools.appendString(" ");
 }
}

} else {
	PRStackFrame frame = pega.pushStackFrame("ContextPage", null, tools.findPage(tools.getParamValue("contextPage")), false, false);
				getControlMarkup_1();
	pega.popStackFrame(frame, false);
}
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Embed-Stage.pyStageEntryStatus", new LiteweightPropertyDefinition("Embed-Stage", "pyStageEntryStatus", "sTN32", false, true, "pxTextInput", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Embed-Stage");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzDisplayCreateStageConfiguration");
	oStreamProperties_1.put("pyRuleSetVersion", "08-05-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION EMBED-STAGE PZDISPLAYCREATESTAGECONFIGURATION #20200319T071003.004 GMT", "Embed-Stage pzDisplayCreateStageConfiguration", "Pega-ProcessArchitect", "08-05-01", "20200428T045535.824 GMT");
}
